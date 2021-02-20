package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveFocusId extends StObject {
  
  var activeFocusId: js.UndefOr[scala.Nothing] = js.native
  
  var error: js.UndefOr[scala.Nothing] = js.native
  
  var focusables: js.Array[scala.Nothing] = js.native
  
  var isFocusEnabled: Boolean = js.native
}
object ActiveFocusId {
  
  @scala.inline
  def apply(focusables: js.Array[scala.Nothing], isFocusEnabled: Boolean): ActiveFocusId = {
    val __obj = js.Dynamic.literal(focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveFocusId]
  }
  
  @scala.inline
  implicit class ActiveFocusIdMutableBuilder[Self <: ActiveFocusId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusables(value: js.Array[scala.Nothing]): Self = StObject.set(x, "focusables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusablesVarargs(value: scala.Nothing*): Self = StObject.set(x, "focusables", js.Array(value :_*))
    
    @scala.inline
    def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
  }
}
