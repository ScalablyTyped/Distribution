package typings.hubot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareContext[T /* <: Adapter */]
  extends /* key */ StringDictionary[js.Any] {
  var response: js.UndefOr[Response[T, Message]] = js.undefined
}

object MiddlewareContext {
  @scala.inline
  def apply[/* <: typings.hubot.mod.Adapter */ T](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    response: Response[T, Message] = null
  ): MiddlewareContext[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareContext[T]]
  }
}

