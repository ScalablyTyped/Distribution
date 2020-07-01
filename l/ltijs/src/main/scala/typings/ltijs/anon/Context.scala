package typings.ltijs.anon

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.platformMod.PlatformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[PlatformContext] = js.undefined
  var token: js.UndefOr[IdToken] = js.undefined
}

object Context {
  @scala.inline
  def apply(context: PlatformContext = null, token: IdToken = null): Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

