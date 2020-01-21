package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservable[T]
  extends KnockoutSubscribable[T]
     with KnockoutObservableFunctions[T] {
  var valueHasMutated: js.UndefOr[js.Function0[Unit]] = js.native
  var valueWillMutate: js.UndefOr[js.Function0[Unit]] = js.native
  def apply(): T = js.native
  def apply(value: T): Unit = js.native
  def peek(): T = js.native
}

