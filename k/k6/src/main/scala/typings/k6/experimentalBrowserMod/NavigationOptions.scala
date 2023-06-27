package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  referer :string | undefined} & k6.k6/experimental/browser.ContentLoadOptions */
trait NavigationOptions extends StObject {
  
  /**
    * Referer header value.
    */
  var referer: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum time in milliseconds. Pass 0 to disable the timeout. Default is overridden by the setDefaultTimeout option on `BrowserContext` or `Page`.
    * Defaults to 30000.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * When to consider operation succeeded, defaults to `load`. Events can be
    * either:
    * - `'domcontentloaded'` - consider operation to be finished when the
    * `DOMContentLoaded` event is fired.
    * - `'load'` - consider operation to be finished when the `load` event is
    * fired.
    * - `'networkidle'` - **DISCOURAGED** consider operation to be finished
    * when there are no network connections for at least `500` ms. Don't use
    * this method for testing especially with chatty websites where the event
    * may never fire, rely on web assertions to assess readiness instead.
    */
  var waitUntil: js.UndefOr[LifecycleEvent] = js.undefined
}
object NavigationOptions {
  
  inline def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: LifecycleEvent): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
  }
}
