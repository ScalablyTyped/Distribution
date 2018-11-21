package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(knockoutLib.KnockoutObservable because Would inherit conflicting mutable fields List(valueHasMutated, valueWillMutate))*/
@js.native
trait KnockoutComputed[T]
  extends KnockoutReadonlyComputed[T]
     with KnockoutComputedFunctions[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def dispose(): scala.Unit = js.native
  // It's possible for a to be undefined, since the equalityComparer is run on the initial
  // computation with undefined as the first argument. This is user-relevant for deferred computeds.
  def equalityComparer(a: js.UndefOr[scala.Nothing], b: T): scala.Boolean = js.native
}

