package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpFaultInjection extends StObject {
  
  /** The specification for how client requests are aborted as part of fault injection. */
  var abort: js.UndefOr[HttpFaultAbort] = js.undefined
  
  /** The specification for how client requests are delayed as part of fault injection, before being sent to a backend service. */
  var delay: js.UndefOr[HttpFaultDelay] = js.undefined
}
object HttpFaultInjection {
  
  inline def apply(): HttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultInjection]
  }
  
  extension [Self <: HttpFaultInjection](x: Self) {
    
    inline def setAbort(value: HttpFaultAbort): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setDelay(value: HttpFaultDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
