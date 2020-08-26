package typings.hubot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareContext[T /* <: Adapter */]
  extends /* key */ StringDictionary[js.Any] {
  var response: js.UndefOr[Response[T, Message]] = js.native
}

object MiddlewareContext {
  @scala.inline
  def apply[/* <: typings.hubot.mod.Adapter */ T](): MiddlewareContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareContext[T]]
  }
  @scala.inline
  implicit class MiddlewareContextOps[Self <: MiddlewareContext[_], /* <: typings.hubot.mod.Adapter */ T] (val x: Self with MiddlewareContext[T]) extends AnyVal {
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
    def setResponse(value: Response[T, Message]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

