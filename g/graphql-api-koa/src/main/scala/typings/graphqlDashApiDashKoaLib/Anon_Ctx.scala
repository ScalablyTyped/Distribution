package typings
package graphqlDashApiDashKoaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx[StateT, CustomT] extends js.Object {
  var `override`: js.UndefOr[
    js.Function1[
      /* ctx */ koaLib.koaMod.ApplicationNs.ParameterizedContext[StateT, CustomT], 
      graphqlDashApiDashKoaLib.graphqlDashApiDashKoaMod.ExecuteOptions
    ]
  ] = js.undefined
}

object Anon_Ctx {
  @scala.inline
  def apply[StateT, CustomT](
    `override`: /* ctx */ koaLib.koaMod.ApplicationNs.ParameterizedContext[StateT, CustomT] => graphqlDashApiDashKoaLib.graphqlDashApiDashKoaMod.ExecuteOptions = null
  ): Anon_Ctx[StateT, CustomT] = {
    val __obj = js.Dynamic.literal()
    if (`override` != null) __obj.updateDynamic("override")(js.Any.fromFunction1(`override`))
    __obj.asInstanceOf[Anon_Ctx[StateT, CustomT]]
  }
}

