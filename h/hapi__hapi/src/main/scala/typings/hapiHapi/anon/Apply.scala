package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apply extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  
  var extend: js.UndefOr[Boolean] = js.undefined
}
object Apply {
  
  @scala.inline
  def apply(): Apply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apply]
  }
  
  @scala.inline
  implicit class ApplyMutableBuilder[Self <: Apply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
  }
}
