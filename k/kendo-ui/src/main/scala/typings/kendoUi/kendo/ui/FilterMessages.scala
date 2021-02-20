package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterMessages extends StObject {
  
  var and: js.UndefOr[String] = js.native
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.native
  
  var or: js.UndefOr[String] = js.native
}
object FilterMessages {
  
  @scala.inline
  def apply(): FilterMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMessages]
  }
  
  @scala.inline
  implicit class FilterMessagesMutableBuilder[Self <: FilterMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: String): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    @scala.inline
    def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setOr(value: String): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
  }
}
