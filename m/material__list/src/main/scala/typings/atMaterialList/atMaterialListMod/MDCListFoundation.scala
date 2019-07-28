package typings.atMaterialList.atMaterialListMod

import typings.atMaterialList.adapterMod.MDCListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list", "MDCListFoundation")
@js.native
class MDCListFoundation protected ()
  extends typings.atMaterialList.foundationMod.MDCListFoundation {
  def this(adapter: MDCListAdapter) = this()
}

/* static members */
@JSImport("@material/list", "MDCListFoundation")
@js.native
object MDCListFoundation extends js.Object {
  val cssClasses: typings.atMaterialList.constantsMod.cssClasses = js.native
  val defaultAdapter: MDCListAdapter = js.native
  val strings: typings.atMaterialList.constantsMod.strings = js.native
}

