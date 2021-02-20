package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension extends StObject {
  
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
  implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionType(value: String): Self = StObject.set(x, "dimensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionTypeUndefined: Self = StObject.set(x, "dimensionType", js.undefined)
    
    @scala.inline
    def setDimensionValues(value: js.Array[DimensionDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    @scala.inline
    def setDimensionValuesVarargs(value: DimensionDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value :_*))
  }
}
