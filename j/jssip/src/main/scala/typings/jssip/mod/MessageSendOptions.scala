package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSendOptions extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
}

object MessageSendOptions {
  @scala.inline
  def apply(): MessageSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSendOptions]
  }
  @scala.inline
  implicit class MessageSendOptionsOps[Self <: MessageSendOptions] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = this.set("eventHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventHandlers: Self = this.set("eventHandlers", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
  }
  
}

