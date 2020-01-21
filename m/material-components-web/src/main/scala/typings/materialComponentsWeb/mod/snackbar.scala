package typings.materialComponentsWeb.mod

import typings.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "snackbar")
@js.native
object snackbar extends js.Object {
  @js.native
  class MDCSnackbar ()
    extends typings.materialSnackbar.mod.MDCSnackbar
  
  @js.native
  class MDCSnackbarFoundation ()
    extends typings.materialSnackbar.mod.MDCSnackbarFoundation
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): typings.materialSnackbar.mod.MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typings.materialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typings.materialSnackbar.constantsMod.strings = js.native
  }
  
}

