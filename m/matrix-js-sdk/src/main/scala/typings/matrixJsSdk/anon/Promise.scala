package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promise extends js.Object {
  
  var promise: js.Promise[_] = js.native
  
  var reject: js.Any = js.native
  
  var resolve: js.Any = js.native
}
object Promise {
  
  @scala.inline
  def apply(promise: js.Promise[_], reject: js.Any, resolve: js.Any): Promise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
  
  @scala.inline
  implicit class PromiseOps[Self <: Promise] (val x: Self) extends AnyVal {
    
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
    def setPromise(value: js.Promise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReject(value: js.Any): Self = this.set("reject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: js.Any): Self = this.set("resolve", value.asInstanceOf[js.Any])
  }
}
