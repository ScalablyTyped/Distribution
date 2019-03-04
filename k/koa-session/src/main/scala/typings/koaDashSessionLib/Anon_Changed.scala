package typings
package koaDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Changed extends js.Object {
  var changed: scala.Boolean
  var rolling: js.UndefOr[scala.Boolean]
}

object Anon_Changed {
  @scala.inline
  def apply(changed: scala.Boolean, rolling: js.UndefOr[scala.Boolean] = js.undefined): Anon_Changed = {
    val __obj = js.Dynamic.literal(changed = changed)
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling)
    __obj.asInstanceOf[Anon_Changed]
  }
}

