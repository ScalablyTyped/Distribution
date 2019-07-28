package typings.atMaterialMenu.atMaterialMenuMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialMenu.Anon_FocusIndexNull
import typings.atMaterialMenu.adapterMod.MDCMenuAdapter
import typings.atMaterialMenu.foundationMod.AnchorMargin
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu", "MDCMenu")
@js.native
class MDCMenu ()
  extends default[MDCMenuAdapter, typings.atMaterialMenu.foundationMod.default] {
  /**
    * Return the items within the menu. Note that this only contains the set of elements within
    * the items container that are proper list items, and not supplemental / presentational DOM
    * elements.
    */
  val items: js.Array[Element] = js.native
  var open: Boolean = js.native
  var quickOpen: Boolean = js.native
  var rememberSelection: Boolean = js.native
  var selectedItemIndex: Double = js.native
  /**
    * Return the item within the menu that is selected.
    */
  def getOptionByIndex(index: Double): Element | Null = js.native
  def hide(): Unit = js.native
  /**
    * @param corner Default anchor corner alignment of top-left menu corner.
    */
  def setAnchorCorner(corner: Double): Unit = js.native
  def setAnchorMargin(margin: AnchorMargin): Unit = js.native
  def show(): Unit = js.native
  def show(options: Anon_FocusIndexNull): Unit = js.native
}

/* static members */
@JSImport("@material/menu", "MDCMenu")
@js.native
object MDCMenu extends js.Object {
  def attachTo(root: Element): MDCMenu = js.native
}

