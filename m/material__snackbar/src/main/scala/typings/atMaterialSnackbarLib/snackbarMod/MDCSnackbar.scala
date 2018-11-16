package typings
package atMaterialSnackbarLib.snackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/snackbar", "MDCSnackbar")
@js.native
class MDCSnackbar ()
  extends atMaterialBaseLib.baseMod.MDCComponent[
      atMaterialSnackbarLib.adapterMod.MDCSnackbarAdapter, 
      atMaterialSnackbarLib.foundationMod.default
    ] {
  var dismissesOnAction: scala.Boolean = js.native
  def show(data: atMaterialSnackbarLib.foundationMod.MDCSnackbarData): scala.Unit = js.native
}

@JSImport("@material/snackbar", "MDCSnackbar")
@js.native
object MDCSnackbar extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialSnackbarLib.snackbarMod.MDCSnackbar = js.native
}

