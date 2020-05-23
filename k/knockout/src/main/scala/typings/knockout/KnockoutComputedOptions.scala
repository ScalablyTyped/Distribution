package typings.knockout

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedOptions[T] extends js.Object {
  /**
    * If true, then the value of the computed observable will not be evaluated until something actually attempts to access its value or manually subscribes to it.
    * By default, a computed observable has its value determined immediately during creation.
    */
  var deferEvaluation: js.UndefOr[Boolean] = js.undefined
  /**
    * This function is executed before each re-evaluation to determine if the computed observable should be disposed.
    * A true-ish result will trigger disposal of the computed observable.
    */
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * Disposal of the computed observable will be triggered when the specified DOM node is removed by KO.
    * This feature is used to dispose computed observables used in bindings when nodes are removed by the template and control-flow bindings.
    */
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.undefined
  /**
    * Defines the value of 'this' whenever KO invokes your 'read' or 'write' callbacks.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, the computed observable will be set up as a purecomputed observable. This option is an alternative to the ko.pureComputed constructor.
    */
  var pure: js.UndefOr[Boolean] = js.undefined
  /**
    * Makes the computed observable writable. This is a function that receives values that other code is trying to write to your computed observable.
    * It’s up to you to supply custom logic to handle the incoming values, typically by writing the values to some underlying observable(s).
    * @param value Value being written to the computer observable.
    */
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object KnockoutComputedOptions {
  @scala.inline
  def apply[T](
    deferEvaluation: js.UndefOr[Boolean] = js.undefined,
    disposeWhen: () => Boolean = null,
    disposeWhenNodeIsRemoved: Node = null,
    owner: js.Any = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    write: /* value */ T => Unit = null
  ): KnockoutComputedOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation.get.asInstanceOf[js.Any])
    if (disposeWhen != null) __obj.updateDynamic("disposeWhen")(js.Any.fromFunction0(disposeWhen))
    if (disposeWhenNodeIsRemoved != null) __obj.updateDynamic("disposeWhenNodeIsRemoved")(disposeWhenNodeIsRemoved.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    __obj.asInstanceOf[KnockoutComputedOptions[T]]
  }
}

