package typings.got.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hooks allow modifications during the request lifecycle. Hook functions may be async and are
  * run serially.
  *
  * @see https://github.com/sindresorhus/got#hooks
  * @template Options Request options.
  * @template Body Response body type.
  */
@js.native
trait Hooks[Options, Body /* <: Buffer | String | js.Object */] extends js.Object {
  
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook[Options, Body]]] = js.native
  
  var beforeError: js.UndefOr[js.Array[BeforeErrorHook]] = js.native
  
  var beforeRedirect: js.UndefOr[js.Array[BeforeRedirectHook[Options]]] = js.native
  
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook[Options]]] = js.native
  
  var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook[Options]]] = js.native
  
  var init: js.UndefOr[js.Array[InitHook[Options]]] = js.native
}
object Hooks {
  
  @scala.inline
  def apply[Options, Body /* <: Buffer | String | js.Object */](): Hooks[Options, Body] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks[Options, Body]]
  }
  
  @scala.inline
  implicit class HooksOps[Self <: Hooks[_, _], Options, Body /* <: Buffer | String | js.Object */] (val x: Self with (Hooks[Options, Body])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterResponseVarargs(value: (AfterResponseHook[Options, Body])*): Self = this.set("afterResponse", js.Array(value :_*))
    
    @scala.inline
    def setAfterResponse(value: js.Array[AfterResponseHook[Options, Body]]): Self = this.set("afterResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterResponse: Self = this.set("afterResponse", js.undefined)
    
    @scala.inline
    def setBeforeErrorVarargs(value: BeforeErrorHook*): Self = this.set("beforeError", js.Array(value :_*))
    
    @scala.inline
    def setBeforeError(value: js.Array[BeforeErrorHook]): Self = this.set("beforeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeError: Self = this.set("beforeError", js.undefined)
    
    @scala.inline
    def setBeforeRedirectVarargs(value: BeforeRedirectHook[Options]*): Self = this.set("beforeRedirect", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRedirect(value: js.Array[BeforeRedirectHook[Options]]): Self = this.set("beforeRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeRedirect: Self = this.set("beforeRedirect", js.undefined)
    
    @scala.inline
    def setBeforeRequestVarargs(value: BeforeRequestHook[Options]*): Self = this.set("beforeRequest", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRequest(value: js.Array[BeforeRequestHook[Options]]): Self = this.set("beforeRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeRequest: Self = this.set("beforeRequest", js.undefined)
    
    @scala.inline
    def setBeforeRetryVarargs(value: BeforeRetryHook[Options]*): Self = this.set("beforeRetry", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRetry(value: js.Array[BeforeRetryHook[Options]]): Self = this.set("beforeRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeRetry: Self = this.set("beforeRetry", js.undefined)
    
    @scala.inline
    def setInitVarargs(value: InitHook[Options]*): Self = this.set("init", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: js.Array[InitHook[Options]]): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
}
