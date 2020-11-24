package typings.got.mod

import typings.got.gotStrings.connect
import typings.got.gotStrings.lookup
import typings.got.gotStrings.request
import typings.got.gotStrings.response
import typings.got.gotStrings.secureConnect
import typings.got.gotStrings.send
import typings.got.gotStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutError
  extends StdError
     with GotError {
  
  var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  
  @JSName("name")
  var name_TimeoutError: typings.got.gotStrings.TimeoutError = js.native
}
object TimeoutError {
  
  @scala.inline
  def apply(
    event: lookup | connect | secureConnect | socket | response | send | request,
    message: String,
    name: typings.got.gotStrings.TimeoutError
  ): TimeoutError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutError]
  }
  
  @scala.inline
  implicit class TimeoutErrorOps[Self <: TimeoutError] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: lookup | connect | secureConnect | socket | response | send | request): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.got.gotStrings.TimeoutError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
