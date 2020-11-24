package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet-geosearch.leaflet-geosearch.Omit<leaflet-geosearch.leaflet-geosearch.SearchResult<leaflet-geosearch.leaflet-geosearch.OpenStreetMapProviderResultRaw>, 'raw'> & {  raw :{  address :{  house_number :string,   road :string,   town :string,   city :string,   county :string,   state_district :string,   state :string,   postcode :string,   country :string,   country_code :string}}} */
@js.native
trait OpenStreetMapProviderReverseResult extends js.Object {
  
  var bounds: BoundsTuple = js.native
  
  var label: String = js.native
  
  var raw: Address = js.native
  
  var x: String = js.native
  
  var y: String = js.native
}
object OpenStreetMapProviderReverseResult {
  
  @scala.inline
  def apply(bounds: BoundsTuple, label: String, raw: Address, x: String, y: String): OpenStreetMapProviderReverseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseResult]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderReverseResultOps[Self <: OpenStreetMapProviderReverseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBounds(value: BoundsTuple): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Address): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
