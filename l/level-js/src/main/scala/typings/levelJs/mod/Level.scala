package typings.levelJs.mod

import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level
  extends AbstractLevelDOWN[js.Any, js.Any] {
  val location: String = js.native
  val prefix: String = js.native
  val version: String | Double = js.native
  def destroy(location: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def destroy(location: String, prefix: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

