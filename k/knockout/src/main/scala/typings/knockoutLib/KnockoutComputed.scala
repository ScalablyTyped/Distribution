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
  /**
    * Manually disposes the computed observable, clearing all subscriptions to dependencies.
    * This function is useful if you want to stop a computed observable from being updated or want to clean up memory for a
    * computed observable that has dependencies on observables that won’t be cleaned.
    */
  def dispose(): scala.Unit = js.native
}

