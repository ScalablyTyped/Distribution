package typings.ionicCore.itemSlidingMod

import typings.ionicCore.componentsMod.global.HTMLIonItemSlidingElement
import typings.ionicCore.mod.Side
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/item-sliding/item-sliding", "ItemSliding")
@js.native
class ItemSliding () extends ComponentInterface {
  var calculateOptsWidth: js.Any = js.native
  var canStart: js.Any = js.native
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: Boolean = js.native
  var el: HTMLIonItemSlidingElement = js.native
  var gesture: js.UndefOr[js.Any] = js.native
  /**
    * Given an optional side, return the ion-item-options element.
    *
    * @param side This side of the options to get. If a side is not provided it will
    * return the first one available.
    */
  var getOptions: js.Any = js.native
  var getSlidingRatioSync: js.Any = js.native
  var initialOpenAmount: js.Any = js.native
  /**
    * Emitted when the sliding position changes.
    */
  var ionDrag: EventEmitter[_] = js.native
  var item: js.Any = js.native
  var leftOptions: js.UndefOr[js.Any] = js.native
  var onEnd: js.Any = js.native
  var onMove: js.Any = js.native
  var onStart: js.Any = js.native
  var openAmount: js.Any = js.native
  var optsDirty: js.Any = js.native
  var optsWidthLeftSide: js.Any = js.native
  var optsWidthRightSide: js.Any = js.native
  var rightOptions: js.UndefOr[js.Any] = js.native
  var setOpenAmount: js.Any = js.native
  var sides: js.Any = js.native
  var state: SlidingState = js.native
  var tmr: js.Any = js.native
  var updateOptions: js.Any = js.native
  /**
    * Close the sliding item. Items can also be closed from the [List](../list).
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Close all of the sliding items in the list. Items can also be closed from the [List](../list).
    */
  def closeOpened(): js.Promise[Boolean] = js.native
  @JSName("connectedCallback")
  def connectedCallback_MItemSliding(): js.Promise[Unit] = js.native
  def disabledChanged(): Unit = js.native
  @JSName("disconnectedCallback")
  def disconnectedCallback_MItemSliding(): Unit = js.native
  /**
    * Get the amount the item is open in pixels.
    */
  def getOpenAmount(): js.Promise[Double] = js.native
  /**
    * Get the ratio of the open amount of the item compared to the width of the options.
    * If the number returned is positive, then the options on the right side are open.
    * If the number returned is negative, then the options on the left side are open.
    * If the absolute value of the number is greater than 1, the item is open more than
    * the width of the options.
    */
  def getSlidingRatio(): js.Promise[Double] = js.native
  /**
    * Open the sliding item.
    *
    * @param side The side of the options to open. If a side is not provided, it will open the first set of options it finds within the item.
    */
  def open(): js.Promise[Unit] = js.native
  def open(side: Side): js.Promise[Unit] = js.native
  @JSName("render")
  def render_MItemSliding(): js.Any = js.native
}

