package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(knockoutDashPreDashRenderedLib.KnockoutComputedFunctions because Already inherited / * key * / org.scalablytyped.runtime.StringDictionary[knockoutDashPreDashRenderedLib.KnockoutBindingHandler])*/
@js.native
trait KnockoutComputed[T] extends KnockoutObservable[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def dispose(): scala.Unit = js.native
  def getDependenciesCount(): scala.Double = js.native
  def isActive(): scala.Boolean = js.native
}

