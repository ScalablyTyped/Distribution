package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedDefine[T] extends KnockoutComputedOptions[T] {
  /**
    * A function that is used to evaluate the computed observable’s current value.
    */
  def read(): T
}

object KnockoutComputedDefine {
  @scala.inline
  def apply[T](
    read: js.Function0[T],
    deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined,
    disposeWhen: js.Function0[scala.Boolean] = null,
    disposeWhenNodeIsRemoved: stdLib.Node = null,
    owner: js.Any = null,
    pure: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.Function1[T, scala.Unit] = null
  ): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = read)
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation)
    if (disposeWhen != null) __obj.updateDynamic("disposeWhen")(disposeWhen)
    if (disposeWhenNodeIsRemoved != null) __obj.updateDynamic("disposeWhenNodeIsRemoved")(disposeWhenNodeIsRemoved)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
}

