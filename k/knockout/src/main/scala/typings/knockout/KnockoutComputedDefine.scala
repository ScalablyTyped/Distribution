package typings.knockout

import typings.std.Node
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
    read: () => T,
    deferEvaluation: js.UndefOr[Boolean] = js.undefined,
    disposeWhen: () => Boolean = null,
    disposeWhenNodeIsRemoved: Node = null,
    owner: js.Any = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    write: T => Unit = null
  ): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation.get.asInstanceOf[js.Any])
    if (disposeWhen != null) __obj.updateDynamic("disposeWhen")(js.Any.fromFunction0(disposeWhen))
    if (disposeWhenNodeIsRemoved != null) __obj.updateDynamic("disposeWhenNodeIsRemoved")(disposeWhenNodeIsRemoved.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
}

