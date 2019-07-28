package typings.atMaterialSnackbar.atMaterialSnackbarMod

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialSnackbar.adapterMod.MDCSnackbarAdapter
import typings.atMaterialSnackbar.foundationMod.MDCSnackbarData
import typings.atMaterialSnackbar.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/snackbar", "MDCSnackbar")
@js.native
class MDCSnackbar () extends MDCComponent[MDCSnackbarAdapter, default] {
  var dismissesOnAction: Boolean = js.native
  def show(data: MDCSnackbarData): Unit = js.native
}

/* static members */
@JSImport("@material/snackbar", "MDCSnackbar")
@js.native
object MDCSnackbar extends js.Object {
  def attachTo(root: Element): MDCSnackbar = js.native
}

