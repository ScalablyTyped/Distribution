package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootOptions extends StObject {
  
  /**
    * When set to `true`, specifies behavior that mitigates custom element issues
    * around focusability. When a non-focusable part of the shadow DOM is clicked, the first
    * focusable part is given focus, and the shadow host is given any available `:focus` styling.
    */
  var delegatesFocus: js.UndefOr[Boolean] = js.undefined
}
object ShadowRootOptions {
  
  @scala.inline
  def apply(): ShadowRootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowRootOptions]
  }
  
  @scala.inline
  implicit class ShadowRootOptionsMutableBuilder[Self <: ShadowRootOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatesFocus(value: Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
  }
}
