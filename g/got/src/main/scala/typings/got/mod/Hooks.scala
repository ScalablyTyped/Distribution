package typings.got.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hooks allow modifications during the request lifecycle. Hook functions may be async and are
  * run serially.
  *
  * @see https://github.com/sindresorhus/got#hooks
  * @template Options Request options.
  * @template Body Response body type.
  */
trait Hooks[Options, Body /* <: Buffer | String | js.Object */] extends StObject {
  
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook[Options, Body]]] = js.undefined
  
  var beforeError: js.UndefOr[js.Array[BeforeErrorHook]] = js.undefined
  
  var beforeRedirect: js.UndefOr[js.Array[BeforeRedirectHook[Options]]] = js.undefined
  
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook[Options]]] = js.undefined
  
  var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook[Options]]] = js.undefined
  
  var init: js.UndefOr[js.Array[InitHook[Options]]] = js.undefined
}
object Hooks {
  
  inline def apply[Options, Body /* <: Buffer | String | js.Object */](): Hooks[Options, Body] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks[Options, Body]]
  }
  
  extension [Self <: Hooks[?, ?], Options, Body /* <: Buffer | String | js.Object */](x: Self & (Hooks[Options, Body])) {
    
    inline def setAfterResponse(value: js.Array[AfterResponseHook[Options, Body]]): Self = StObject.set(x, "afterResponse", value.asInstanceOf[js.Any])
    
    inline def setAfterResponseUndefined: Self = StObject.set(x, "afterResponse", js.undefined)
    
    inline def setAfterResponseVarargs(value: (AfterResponseHook[Options, Body])*): Self = StObject.set(x, "afterResponse", js.Array(value :_*))
    
    inline def setBeforeError(value: js.Array[BeforeErrorHook]): Self = StObject.set(x, "beforeError", value.asInstanceOf[js.Any])
    
    inline def setBeforeErrorUndefined: Self = StObject.set(x, "beforeError", js.undefined)
    
    inline def setBeforeErrorVarargs(value: BeforeErrorHook*): Self = StObject.set(x, "beforeError", js.Array(value :_*))
    
    inline def setBeforeRedirect(value: js.Array[BeforeRedirectHook[Options]]): Self = StObject.set(x, "beforeRedirect", value.asInstanceOf[js.Any])
    
    inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
    
    inline def setBeforeRedirectVarargs(value: BeforeRedirectHook[Options]*): Self = StObject.set(x, "beforeRedirect", js.Array(value :_*))
    
    inline def setBeforeRequest(value: js.Array[BeforeRequestHook[Options]]): Self = StObject.set(x, "beforeRequest", value.asInstanceOf[js.Any])
    
    inline def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
    
    inline def setBeforeRequestVarargs(value: BeforeRequestHook[Options]*): Self = StObject.set(x, "beforeRequest", js.Array(value :_*))
    
    inline def setBeforeRetry(value: js.Array[BeforeRetryHook[Options]]): Self = StObject.set(x, "beforeRetry", value.asInstanceOf[js.Any])
    
    inline def setBeforeRetryUndefined: Self = StObject.set(x, "beforeRetry", js.undefined)
    
    inline def setBeforeRetryVarargs(value: BeforeRetryHook[Options]*): Self = StObject.set(x, "beforeRetry", js.Array(value :_*))
    
    inline def setInit(value: js.Array[InitHook[Options]]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setInitVarargs(value: InitHook[Options]*): Self = StObject.set(x, "init", js.Array(value :_*))
  }
}
