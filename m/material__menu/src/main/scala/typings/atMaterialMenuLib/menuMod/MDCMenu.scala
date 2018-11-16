package typings
package atMaterialMenuLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu", "MDCMenu")
@js.native
class MDCMenu ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialMenuLib.adapterMod.MDCMenuAdapter, 
      atMaterialMenuLib.foundationMod.default
    ] {
  /**
       * Return the items within the menu. Note that this only contains the set of elements within
       * the items container that are proper list items, and not supplemental / presentational DOM
       * elements.
       */
  val items: js.Array[stdLib.Element] = js.native
  var open: scala.Boolean = js.native
  var quickOpen: scala.Boolean = js.native
  var rememberSelection: scala.Boolean = js.native
  var selectedItemIndex: scala.Double = js.native
  /**
       * Return the item within the menu that is selected.
       */
  def getOptionByIndex(index: scala.Double): stdLib.Element | scala.Null = js.native
  def hide(): scala.Unit = js.native
  /**
       * @param corner Default anchor corner alignment of top-left menu corner.
       */
  def setAnchorCorner(corner: scala.Double): scala.Unit = js.native
  def setAnchorMargin(margin: atMaterialMenuLib.foundationMod.AnchorMargin): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(options: atMaterialMenuLib.Anon_FocusIndex): scala.Unit = js.native
}

@JSImport("@material/menu", "MDCMenu")
@js.native
object MDCMenu extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialMenuLib.menuMod.MDCMenu = js.native
}

