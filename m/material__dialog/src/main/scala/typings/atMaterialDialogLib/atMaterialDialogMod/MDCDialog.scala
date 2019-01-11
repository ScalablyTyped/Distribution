package typings
package atMaterialDialogLib.atMaterialDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog", "MDCDialog")
@js.native
class MDCDialog ()
  extends atMaterialBaseLib.atMaterialBaseMod.MDCComponent[
      atMaterialDialogLib.adapterMod.MDCDialogAdapter, 
      atMaterialDialogLib.foundationMod.default
    ] {
  val open: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

@JSImport("@material/dialog", "MDCDialog")
@js.native
object MDCDialog extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialDialogLib.atMaterialDialogMod.MDCDialog = js.native
}

