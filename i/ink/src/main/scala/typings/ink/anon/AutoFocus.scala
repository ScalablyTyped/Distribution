package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFocus extends StObject {
  
  var autoFocus: Boolean = js.native
}
object AutoFocus {
  
  @scala.inline
  def apply(autoFocus: Boolean): AutoFocus = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus]
  }
  
  @scala.inline
  implicit class AutoFocusMutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
  }
}
