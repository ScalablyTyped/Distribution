package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet-geosearch.leaflet-geosearch.Omit<leaflet-geosearch.leaflet-geosearch.SearchResult<leaflet-geosearch.leaflet-geosearch.OpenStreetMapProviderResultRaw>, 'raw'> & {  raw :{  address :{  house_number :string,   road :string,   town :string,   city :string,   county :string,   state_district :string,   state :string,   postcode :string,   country :string,   country_code :string}}} */
trait OpenStreetMapProviderReverseResult extends StObject {
  
  var bounds: BoundsTuple
  
  var label: String
  
  var raw: Address
  
  var x: String
  
  var y: String
}
object OpenStreetMapProviderReverseResult {
  
  @scala.inline
  def apply(bounds: BoundsTuple, label: String, raw: Address, x: String, y: String): OpenStreetMapProviderReverseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseResult]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderReverseResultMutableBuilder[Self <: OpenStreetMapProviderReverseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: BoundsTuple): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Address): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
