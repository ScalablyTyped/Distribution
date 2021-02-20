package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessDayConfig extends StObject {
  
  /** Regular business days. May not be empty. */
  var businessDays: js.UndefOr[js.Array[String]] = js.native
}
object BusinessDayConfig {
  
  @scala.inline
  def apply(): BusinessDayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessDayConfig]
  }
  
  @scala.inline
  implicit class BusinessDayConfigMutableBuilder[Self <: BusinessDayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessDays(value: js.Array[String]): Self = StObject.set(x, "businessDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessDaysUndefined: Self = StObject.set(x, "businessDays", js.undefined)
    
    @scala.inline
    def setBusinessDaysVarargs(value: String*): Self = StObject.set(x, "businessDays", js.Array(value :_*))
  }
}
