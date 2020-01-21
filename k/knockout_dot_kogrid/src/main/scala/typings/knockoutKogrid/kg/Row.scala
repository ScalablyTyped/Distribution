package typings.knockoutKogrid.kg

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row[EntityType] extends js.Object {
  var entity: EntityType = js.native
  @JSName("selected")
  var selected_Original: KnockoutObservable[Boolean] = js.native
  def selected(): Boolean = js.native
  def selected(value: Boolean): Unit = js.native
}

