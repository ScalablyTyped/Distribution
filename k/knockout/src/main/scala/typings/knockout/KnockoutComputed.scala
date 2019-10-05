package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.knockout.KnockoutSubscribableFunctions because Already inherited
- typings.knockout.KnockoutObservableFunctions because Already inherited
- typings.knockout.KnockoutSubscribable because Already inherited
- typings.knockout.KnockoutReadonlyObservable because Already inherited
- typings.knockout.KnockoutObservable because var conflicts: valueHasMutated, valueWillMutate. Inlined  */ @js.native
trait KnockoutComputed[T]
  extends KnockoutReadonlyComputed[T]
     with KnockoutComputedFunctions[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  /**
    * Manually disposes the computed observable, clearing all subscriptions to dependencies.
    * This function is useful if you want to stop a computed observable from being updated or want to clean up memory for a
    * computed observable that has dependencies on observables that won’t be cleaned.
    */
  def dispose(): Unit = js.native
}

