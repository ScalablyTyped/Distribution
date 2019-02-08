package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processor extends js.Object {
  def register(fn: js.Function1[/* file */ hexoLib.hexoMod.HexoNs.BoxNs.File, scala.Unit]): scala.Unit = js.native
  def register(
    pattern: java.lang.String,
    fn: js.Function1[/* file */ hexoLib.hexoMod.HexoNs.BoxNs.File, scala.Unit]
  ): scala.Unit = js.native
  def register(
    pattern: js.Function1[/* str */ java.lang.String, _],
    fn: js.Function1[/* file */ hexoLib.hexoMod.HexoNs.BoxNs.File, scala.Unit]
  ): scala.Unit = js.native
  def register(pattern: stdLib.RegExp, fn: js.Function1[/* file */ hexoLib.hexoMod.HexoNs.BoxNs.File, scala.Unit]): scala.Unit = js.native
}

