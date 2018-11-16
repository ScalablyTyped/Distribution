package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "snackbar")
@js.native
object snackbarNs extends js.Object {
  @js.native
  class MDCSnackbar ()
    extends atMaterialSnackbarLib.snackbarMod.MDCSnackbar
  
  @js.native
  class MDCSnackbarFoundation ()
    extends atMaterialSnackbarLib.snackbarMod.MDCSnackbarFoundation
  
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialSnackbarLib.snackbarMod.MDCSnackbar = js.native
  }
  
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: atMaterialSnackbarLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialSnackbarLib.adapterMod.MDCSnackbarAdapter = js.native
    val strings: atMaterialSnackbarLib.constantsMod.strings = js.native
  }
  
}

