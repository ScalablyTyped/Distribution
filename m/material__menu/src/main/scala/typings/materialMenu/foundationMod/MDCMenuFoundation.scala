package typings.materialMenu.foundationMod

import typings.materialMenu.anon.FocusIndex
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCMenuFoundation
  extends typings.materialBase.foundationMod.default[MDCMenuFoundation] {
  def close(): Unit = js.native
  def close(evt: Event): Unit = js.native
  def getSelectedIndex(): Double = js.native
  def isOpen(): Boolean = js.native
  def open(): Unit = js.native
  def open(hasFocusIndex: FocusIndex): Unit = js.native
  /**
    * @param corner Default anchor corner alignment of top-left menu corner.
    */
  def setAnchorCorner(corner: Double): Unit = js.native
  /**
    * @param margin 4-plet of margins from anchor.
    */
  def setAnchorMargin(margin: AnchorMargin): Unit = js.native
  def setQuickOpen(quickOpen: Boolean): Unit = js.native
  def setRememberSelection(rememberSelection: Boolean): Unit = js.native
  /**
    * @param index Index of the item to set as selected.
    */
  def setSelectedIndex(index: Double): Unit = js.native
}

