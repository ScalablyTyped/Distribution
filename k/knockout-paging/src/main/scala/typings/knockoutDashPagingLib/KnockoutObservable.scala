package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(knockoutDashPagingLib.KnockoutObservableFunctions because Already inherited / * key * / ScalablyTyped.runtime.StringDictionary[knockoutDashPagingLib.KnockoutBindingHandler])*/
@js.native
trait KnockoutObservable[T] extends KnockoutSubscribable[T] {
  var valueHasMutated: js.UndefOr[Anon_Void] = js.native
  var valueWillMutate: js.UndefOr[Anon_Void] = js.native
  def apply(): T = js.native
  def apply(value: T): scala.Unit = js.native
  def peek(): T = js.native
}

