package typings.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used as a Redirect marker when writing to a Stream's incoming buffer
  */
// TODO is this public?
@js.native
trait StreamRedirect[R] extends js.Object {
  
  var to: Stream[R] = js.native
}
object StreamRedirect {
  
  @scala.inline
  def apply[R](to: Stream[R]): StreamRedirect[R] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRedirect[R]]
  }
  
  @scala.inline
  implicit class StreamRedirectOps[Self <: StreamRedirect[_], R] (val x: Self with StreamRedirect[R]) extends AnyVal {
    
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
    def setTo(value: Stream[R]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
