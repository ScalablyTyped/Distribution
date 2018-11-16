package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row[EntityType] extends js.Object {
  var entity: EntityType = js.native
  @JSName("selected")
  var selected_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  def selected(): scala.Boolean = js.native
  def selected(value: scala.Boolean): scala.Unit = js.native
}

