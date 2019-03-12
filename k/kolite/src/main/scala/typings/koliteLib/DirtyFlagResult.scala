package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirtyFlagResult extends js.Object {
  @JSName("isDirty")
  var isDirty_Original: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  def forceDirty(): scala.Unit = js.native
  def isDirty(): scala.Boolean = js.native
  def isDirty(value: scala.Boolean): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

