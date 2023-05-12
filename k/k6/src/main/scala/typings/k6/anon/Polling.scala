package typings.k6.anon

import typings.k6.k6Strings.raf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polling extends StObject {
  
  /**
    * If `polling` is `'raf'`, then `pageFunction` is constantly executed in
    * `requestAnimationFrame` callback. If `polling` is a number, then it is
    * treated as an interval in milliseconds at which the function would be
    * executed. Defaults to `raf`.
    */
  var polling: js.UndefOr[Double | raf] = js.undefined
  
  /**
    * Maximum time in milliseconds. Defaults to `30` seconds. Default is
    * overridden by the `setDefaultTimeout` option on `BrowserContext` or
    * `page` methods.
    *
    * Setting the value to `0` will disable the timeout.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object Polling {
  
  inline def apply(): Polling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Polling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Polling] (val x: Self) extends AnyVal {
    
    inline def setPolling(value: Double | raf): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
