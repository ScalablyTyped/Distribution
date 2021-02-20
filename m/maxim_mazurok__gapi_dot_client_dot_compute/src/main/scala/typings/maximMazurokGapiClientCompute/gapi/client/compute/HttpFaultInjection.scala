package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpFaultInjection extends StObject {
  
  /** The specification for how client requests are aborted as part of fault injection. */
  var abort: js.UndefOr[HttpFaultAbort] = js.native
  
  /** The specification for how client requests are delayed as part of fault injection, before being sent to a backend service. */
  var delay: js.UndefOr[HttpFaultDelay] = js.native
}
object HttpFaultInjection {
  
  @scala.inline
  def apply(): HttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultInjection]
  }
  
  @scala.inline
  implicit class HttpFaultInjectionMutableBuilder[Self <: HttpFaultInjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: HttpFaultAbort): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setDelay(value: HttpFaultDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
