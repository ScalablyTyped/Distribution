package typings
package koaDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rolling extends js.Object {
  var rolling: js.UndefOr[scala.Boolean]
}

object Anon_Rolling {
  @scala.inline
  def apply(rolling: js.UndefOr[scala.Boolean] = js.undefined): Anon_Rolling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling)
    __obj.asInstanceOf[Anon_Rolling]
  }
}

