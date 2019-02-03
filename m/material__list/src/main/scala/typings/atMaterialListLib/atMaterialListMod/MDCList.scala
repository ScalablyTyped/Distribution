package typings
package atMaterialListLib.atMaterialListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list", "MDCList")
@js.native
class MDCList protected () extends js.Object {
  def this(args: js.Any*) = this()
  val listElements: js.Array[stdLib.Element] = js.native
  var selectedIndex: atMaterialListLib.constantsMod.Index = js.native
  var singleSelection: scala.Boolean = js.native
  var vertical: scala.Boolean = js.native
  var wrapFocus: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def getDefaultFoundation(): atMaterialListLib.foundationMod.MDCListFoundation = js.native
  def initialSyncWithDOM(): scala.Unit = js.native
  /**
    * Initialize selectedIndex value based on pre-selected checkbox list items, single selection or radio.
    */
  def initializeListType(): scala.Unit = js.native
  def layout(): scala.Unit = js.native
}

/* static members */
@JSImport("@material/list", "MDCList")
@js.native
object MDCList extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialListLib.atMaterialListMod.MDCList = js.native
}

