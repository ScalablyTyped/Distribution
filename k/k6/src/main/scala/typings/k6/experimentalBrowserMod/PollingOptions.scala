package typings.k6.experimentalBrowserMod

import typings.k6.k6Strings.interval
import typings.k6.k6Strings.mutation
import typings.k6.k6Strings.raf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollingOptions extends StObject {
  
  /**
    * Polling interval in milliseconds if `polling` is set to `interval`.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Polling method to use.
    * @default 'raf'
    */
  var polling: js.UndefOr[raf | mutation | interval] = js.undefined
}
object PollingOptions {
  
  inline def apply(): PollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PollingOptions] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPolling(value: raf | mutation | interval): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
  }
}
