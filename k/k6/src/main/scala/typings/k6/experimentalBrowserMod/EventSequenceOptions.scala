package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSequenceOptions extends StObject {
  
  /**
    * Delay between events in milliseconds. Defaults to 0.
    */
  var delay: js.UndefOr[Double] = js.undefined
}
object EventSequenceOptions {
  
  inline def apply(): EventSequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSequenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSequenceOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
