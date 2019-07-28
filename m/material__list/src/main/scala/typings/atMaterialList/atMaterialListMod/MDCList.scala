package typings.atMaterialList.atMaterialListMod

import typings.atMaterialList.constantsMod.Index
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list", "MDCList")
@js.native
class MDCList protected () extends js.Object {
  def this(args: js.Any*) = this()
  val listElements: js.Array[Element] = js.native
  var selectedIndex: Index = js.native
  var singleSelection: Boolean = js.native
  var vertical: Boolean = js.native
  var wrapFocus: Boolean = js.native
  def destroy(): Unit = js.native
  def getDefaultFoundation(): typings.atMaterialList.foundationMod.MDCListFoundation = js.native
  def initialSyncWithDOM(): Unit = js.native
  /**
    * Initialize selectedIndex value based on pre-selected checkbox list items, single selection or radio.
    */
  def initializeListType(): Unit = js.native
  def layout(): Unit = js.native
}

/* static members */
@JSImport("@material/list", "MDCList")
@js.native
object MDCList extends js.Object {
  def attachTo(root: Element): MDCList = js.native
}

