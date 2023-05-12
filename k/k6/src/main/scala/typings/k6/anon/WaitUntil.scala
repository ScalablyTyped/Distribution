package typings.k6.anon

import typings.k6.k6Strings.domcontentloaded
import typings.k6.k6Strings.load
import typings.k6.k6Strings.networkidle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitUntil extends StObject {
  
  /**
    * Maximum operation time in milliseconds. Defaults to `30` seconds. The
    * default value can be changed via the
    * browserContext.setDefaultNavigationTimeout(timeout),
    * browserContext.setDefaultTimeout(timeout),
    * page.setDefaultNavigationTimeout(timeout) or
    * page.setDefaultTimeout(timeout) methods.
    *
    * Setting the value to `0` will disable the timeout.
    *
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
  var waitUntil: js.UndefOr[load | domcontentloaded | networkidle] = js.undefined
}
object WaitUntil {
  
  inline def apply(): WaitUntil = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitUntil]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitUntil] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: load | domcontentloaded | networkidle): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
  }
}
