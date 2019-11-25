package typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod

import typings.koaDashJoiDashRouter.Anon_BodyContinueOnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var meta: js.UndefOr[js.Any] = js.undefined
  var pre: js.UndefOr[Handler] = js.undefined
  var validate: js.UndefOr[Anon_BodyContinueOnError] = js.undefined
}

object Config {
  @scala.inline
  def apply(meta: js.Any = null, pre: Handler = null, validate: Anon_BodyContinueOnError = null): Config = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

