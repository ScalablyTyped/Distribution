package typings.atMaterialDialog.atMaterialDialogMod

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialDialog.adapterMod.MDCDialogAdapter
import typings.atMaterialDialog.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog", "MDCDialog")
@js.native
class MDCDialog () extends MDCComponent[MDCDialogAdapter, default] {
  val open: Boolean = js.native
  def close(): Unit = js.native
  def show(): Unit = js.native
}

/* static members */
@JSImport("@material/dialog", "MDCDialog")
@js.native
object MDCDialog extends js.Object {
  def attachTo(root: Element): MDCDialog = js.native
}

