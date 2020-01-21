package typings.graphqlApiKoa

import typings.graphqlApiKoa.mod.ExecuteOptions
import typings.koa.mod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtx[StateT, CustomT] extends js.Object {
  var `override`: js.UndefOr[js.Function1[/* ctx */ ParameterizedContext[StateT, CustomT], ExecuteOptions]] = js.undefined
}

object AnonCtx {
  @scala.inline
  def apply[StateT, CustomT](`override`: /* ctx */ ParameterizedContext[StateT, CustomT] => ExecuteOptions = null): AnonCtx[StateT, CustomT] = {
    val __obj = js.Dynamic.literal()
    if (`override` != null) __obj.updateDynamic("override")(js.Any.fromFunction1(`override`))
    __obj.asInstanceOf[AnonCtx[StateT, CustomT]]
  }
}

