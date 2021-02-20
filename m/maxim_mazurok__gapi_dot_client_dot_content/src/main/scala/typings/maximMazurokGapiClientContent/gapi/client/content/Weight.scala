package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Weight extends StObject {
  
  /** Required. The weight unit. Acceptable values are: - "`kg`" - "`lb`" */
  var unit: js.UndefOr[String] = js.native
  
  /** Required. The weight represented as a number. */
  var value: js.UndefOr[String] = js.native
}
object Weight {
  
  @scala.inline
  def apply(): Weight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit class WeightMutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
