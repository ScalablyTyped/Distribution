package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyBoolean extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  var extend: `true`
}

object ApplyBoolean {
  @scala.inline
  def apply(extend: `true`, apply: js.UndefOr[Boolean] = js.undefined): ApplyBoolean = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyBoolean]
  }
}

