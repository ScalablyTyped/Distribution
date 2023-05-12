package typings.k6.anon

import typings.k6.k6Strings.domcontentloaded
import typings.k6.k6Strings.load
import typings.k6.k6Strings.networkidle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Referer extends StObject {
  
  /**
    * Referer header value.
    */
  var referer: js.UndefOr[String] = js.undefined
  
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
object Referer {
  
  inline def apply(): Referer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Referer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Referer] (val x: Self) extends AnyVal {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: load | domcontentloaded | networkidle): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
  }
}
