package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined k6.k6/experimental/browser.ElementHandleOptions & {  trial :boolean | undefined} */
trait ElementHandlePointerOptions extends StObject {
  
  /**
    * Setting this to `true` will bypass the actionability checks (visible,
    * stable, enabled). Defaults to `false`.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `true` and a navigation occurs from performing this action, it will not wait for it to complete.
    * Defaults to `false`.
    */
  var noWaitAfter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum time in milliseconds. Pass 0 to disable the timeout. Default is overridden by the setDefaultTimeout option on `BrowserContext` or `Page`.
    * Defaults to 30000.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Setting this to `true` will perform the actionability checks without
    * performing the action. Useful to wait until the element is ready for the
    * action without performing it. Defaults to `false`.
    */
  var trial: js.UndefOr[Boolean] = js.undefined
}
object ElementHandlePointerOptions {
  
  inline def apply(): ElementHandlePointerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementHandlePointerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementHandlePointerOptions] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setNoWaitAfter(value: Boolean): Self = StObject.set(x, "noWaitAfter", value.asInstanceOf[js.Any])
    
    inline def setNoWaitAfterUndefined: Self = StObject.set(x, "noWaitAfter", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrial(value: Boolean): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    inline def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
  }
}
