package typings.leafletGeosearch.anon

import typings.leafletGeosearch.mod.PointTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet-geosearch.leaflet-geosearch.BingProviderResultPoint & {  calculationMethod :string,   usageTypes :std.Array<string>} */
@js.native
trait BingProviderResultPointca extends js.Object {
  
  var calculationMethod: String = js.native
  
  var coordinates: PointTuple = js.native
  
  var `type`: String = js.native
  
  var usageTypes: js.Array[String] = js.native
}
object BingProviderResultPointca {
  
  @scala.inline
  def apply(calculationMethod: String, coordinates: PointTuple, `type`: String, usageTypes: js.Array[String]): BingProviderResultPointca = {
    val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultPointca]
  }
  
  @scala.inline
  implicit class BingProviderResultPointcaOps[Self <: BingProviderResultPointca] (val x: Self) extends AnyVal {
    
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
    def setCalculationMethod(value: String): Self = this.set("calculationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinates(value: PointTuple): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageTypesVarargs(value: String*): Self = this.set("usageTypes", js.Array(value :_*))
    
    @scala.inline
    def setUsageTypes(value: js.Array[String]): Self = this.set("usageTypes", value.asInstanceOf[js.Any])
  }
}
