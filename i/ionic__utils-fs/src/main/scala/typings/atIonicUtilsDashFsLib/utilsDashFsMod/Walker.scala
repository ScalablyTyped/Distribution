package typings
package atIonicUtilsDashFsLib.utilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "Walker")
@js.native
class Walker protected ()
  extends nodeLib.streamMod.Readable {
  def this(p: java.lang.String) = this()
  def this(p: java.lang.String, options: WalkerOptions) = this()
  val options: WalkerOptions = js.native
  val p: java.lang.String = js.native
  val paths: js.Array[java.lang.String] = js.native
  def _read(): scala.Unit = js.native
  @JSName("on")
  def on_data(
    event: atIonicUtilsDashFsLib.atIonicUtilsDashFsLibStrings.data,
    callback: js.Function1[/* item */ WalkerItem, scala.Unit]
  ): this.type = js.native
}

