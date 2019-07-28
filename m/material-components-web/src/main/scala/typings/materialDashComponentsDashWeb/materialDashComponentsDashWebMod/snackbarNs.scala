package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialSnackbar.adapterMod.MDCSnackbarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "snackbar")
@js.native
object snackbarNs extends js.Object {
  @js.native
  class MDCSnackbar ()
    extends typings.atMaterialSnackbar.atMaterialSnackbarMod.MDCSnackbar
  
  @js.native
  class MDCSnackbarFoundation ()
    extends typings.atMaterialSnackbar.atMaterialSnackbarMod.MDCSnackbarFoundation
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): typings.atMaterialSnackbar.atMaterialSnackbarMod.MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typings.atMaterialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typings.atMaterialSnackbar.constantsMod.strings = js.native
  }
  
}

