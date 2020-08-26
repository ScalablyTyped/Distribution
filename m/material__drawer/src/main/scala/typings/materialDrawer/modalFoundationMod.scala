package typings.materialDrawer

import typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/modal/foundation", JSImport.Namespace)
@js.native
object modalFoundationMod extends js.Object {
  @js.native
  class MDCModalDrawerFoundation () extends MDCDismissibleDrawerFoundation {
    /**
      * Handles click event on scrim.
      */
    def handleScrimClick(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCModalDrawerFoundation
  
}

