package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- knockoutLib.KnockoutObservable because var conflicts: valueHasMutated, valueWillMutate. Inlined `<apply>`, extend */ @js.native
trait KnockoutComputed[T]
  extends KnockoutReadonlyComputed[T]
     with KnockoutComputedFunctions[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def apply(value: T): scala.Unit = js.native
  /**
    * Manually disposes the computed observable, clearing all subscriptions to dependencies.
    * This function is useful if you want to stop a computed observable from being updated or want to clean up memory for a
    * computed observable that has dependencies on observables that won’t be cleaned.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Customizes observables basic functionality.
    * @param requestedExtenders Name of the extender feature and it's value, e.g. { notify: 'always' }, { rateLimit: 50 }
    */
  @JSName("extend")
  def extend_KnockoutComputed(requestedExtenders: org.scalablytyped.runtime.StringDictionary[js.Any]): KnockoutComputed[T] = js.native
}

