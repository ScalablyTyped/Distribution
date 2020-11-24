package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension extends js.Object {
  
  var dimensionType: js.UndefOr[String] = js.native
  
  var dimensionValues: js.UndefOr[js.Array[DimensionDimensionValue]] = js.native
}
object Dimension {
  
  @scala.inline
  def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
    
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
    def setDimensionType(value: String): Self = this.set("dimensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionType: Self = this.set("dimensionType", js.undefined)
    
    @scala.inline
    def setDimensionValuesVarargs(value: DimensionDimensionValue*): Self = this.set("dimensionValues", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValues(value: js.Array[DimensionDimensionValue]): Self = this.set("dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValues: Self = this.set("dimensionValues", js.undefined)
  }
}
