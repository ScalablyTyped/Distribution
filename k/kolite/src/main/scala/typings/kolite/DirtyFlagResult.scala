package typings.kolite

import typings.knockout.KnockoutComputed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirtyFlagResult extends js.Object {
  @JSName("isDirty")
  var isDirty_Original: KnockoutComputed[Boolean] = js.native
  def forceDirty(): Unit = js.native
  def isDirty(): Boolean = js.native
  def isDirty(value: Boolean): Unit = js.native
  def reset(): Unit = js.native
}

