package typings.graphqlDashApiDashKoa

import typings.graphqlDashApiDashKoa.graphqlDashApiDashKoaMod.ExecuteOptions
import typings.koa.koaMod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx[StateT, CustomT] extends js.Object {
  var `override`: js.UndefOr[js.Function1[/* ctx */ ParameterizedContext[StateT, CustomT], ExecuteOptions]] = js.undefined
}

object Anon_Ctx {
  @scala.inline
  def apply[StateT, CustomT](`override`: /* ctx */ ParameterizedContext[StateT, CustomT] => ExecuteOptions = null): Anon_Ctx[StateT, CustomT] = {
    val __obj = js.Dynamic.literal()
    if (`override` != null) __obj.updateDynamic("override")(js.Any.fromFunction1(`override`))
    __obj.asInstanceOf[Anon_Ctx[StateT, CustomT]]
  }
}

