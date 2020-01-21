package typings.jestUtil.deepCyclicCopyMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepCyclicCopyOptions extends js.Object {
  var blacklist: js.UndefOr[Set[String]] = js.undefined
  var keepPrototype: js.UndefOr[Boolean] = js.undefined
}

object DeepCyclicCopyOptions {
  @scala.inline
  def apply(blacklist: Set[String] = null, keepPrototype: js.UndefOr[Boolean] = js.undefined): DeepCyclicCopyOptions = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(keepPrototype)) __obj.updateDynamic("keepPrototype")(keepPrototype.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepCyclicCopyOptions]
  }
}

