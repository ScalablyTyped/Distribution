package typings
package levelDashJsLib.levelDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any] {
  val location: java.lang.String = js.native
  val prefix: java.lang.String = js.native
  val version: java.lang.String | scala.Double = js.native
  def destroy(location: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def destroy(
    location: java.lang.String,
    prefix: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

@JSImport("level-js", "Level")
@js.native
class LevelCls protected () extends Level {
  def this(location: java.lang.String) = this()
  def this(location: java.lang.String, options: LevelOptions) = this()
}

