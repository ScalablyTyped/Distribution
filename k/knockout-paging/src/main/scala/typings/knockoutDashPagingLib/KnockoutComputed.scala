package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- knockoutDashPagingLib.KnockoutComputedFunctions because Already inherited / * key * / org.scalablytyped.runtime.StringDictionary[knockoutDashPagingLib.KnockoutBindingHandler] */ @js.native
trait KnockoutComputed[T] extends KnockoutObservable[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def dispose(): scala.Unit = js.native
  def getDependenciesCount(): scala.Double = js.native
  def isActive(): scala.Boolean = js.native
}

