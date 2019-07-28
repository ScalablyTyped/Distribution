package typings.atMaterialDrawer.atMaterialDrawerMod

import typings.atMaterialDrawer.adapterMod.MDCDrawerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer", "MDCDismissibleDrawerFoundation")
@js.native
class MDCDismissibleDrawerFoundation protected ()
  extends typings.atMaterialDrawer.dismissibleFoundationMod.MDCDismissibleDrawerFoundation {
  def this(adapter: MDCDrawerAdapter) = this()
}

/* static members */
@JSImport("@material/drawer", "MDCDismissibleDrawerFoundation")
@js.native
object MDCDismissibleDrawerFoundation extends js.Object {
  val cssClasses: typings.atMaterialDrawer.constantsMod.cssClasses = js.native
  val defaultAdapter: MDCDrawerAdapter = js.native
  val strings: typings.atMaterialDrawer.constantsMod.strings = js.native
}

