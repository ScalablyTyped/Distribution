package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedStatic extends js.Object {
  var fn: KnockoutComputedFunctions[_] = js.native
  /**
    * Creates computed observable.
    */
  def apply[T](): KnockoutComputed[T] = js.native
  /**
    * Creates computed observable.
    * @param evaluatorFunction Function that computes the observable value.
    * @param context Defines the value of 'this' when evaluating the computed observable.
    * @param options An object with further properties for the computed observable.
    */
  def apply[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def apply[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def apply[T](evaluatorFunction: js.Function0[T], context: js.Any, options: KnockoutComputedOptions[T]): KnockoutComputed[T] = js.native
  /**
    * Creates computed observable.
    * @param options An object that defines the computed observable options and behavior.
    * @param context Defines the value of 'this' when evaluating the computed observable.
    */
  def apply[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def apply[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
}

