package typings
package atMaterialMenuLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCMenuFoundation
  extends atMaterialBaseLib.foundationMod.default[MDCMenuFoundation] {
  def close(): scala.Unit = js.native
  def close(evt: stdLib.Event): scala.Unit = js.native
  def getSelectedIndex(): scala.Double = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def open(hasFocusIndex: atMaterialMenuLib.Anon_FocusIndexNull): scala.Unit = js.native
  /**
       * @param corner Default anchor corner alignment of top-left menu corner.
       */
  def setAnchorCorner(corner: scala.Double): scala.Unit = js.native
  /**
       * @param margin 4-plet of margins from anchor.
       */
  def setAnchorMargin(margin: AnchorMargin): scala.Unit = js.native
  def setQuickOpen(quickOpen: scala.Boolean): scala.Unit = js.native
  def setRememberSelection(rememberSelection: scala.Boolean): scala.Unit = js.native
  /**
       * @param index Index of the item to set as selected.
       */
  def setSelectedIndex(index: scala.Double): scala.Unit = js.native
}

