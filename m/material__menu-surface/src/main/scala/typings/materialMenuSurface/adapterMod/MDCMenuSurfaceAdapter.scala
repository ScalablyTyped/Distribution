package typings.materialMenuSurface.adapterMod

import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuDistance
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCMenuSurfaceAdapter extends js.Object {
  def addClass(className: String): Unit
  def getAnchorDimensions(): ClientRect | Null
  def getBodyDimensions(): MDCMenuDimensions
  def getInnerDimensions(): MDCMenuDimensions
  def getWindowDimensions(): MDCMenuDimensions
  def getWindowScroll(): MDCMenuPoint
  def hasAnchor(): Boolean
  def hasClass(className: String): Boolean
  def isElementInContainer(el: Element): Boolean
  def isFocused(): Boolean
  def isRtl(): Boolean
  /** Emits an event when the menu surface is closed. */
  def notifyClose(): Unit
  /** Emits an event when the menu surface is opened. */
  def notifyOpen(): Unit
  def removeClass(className: String): Unit
  /** Restores focus to the element that was focused before the menu surface was opened. */
  def restoreFocus(): Unit
  /** Saves the element that was focused before the menu surface was opened. */
  def saveFocus(): Unit
  def setMaxHeight(height: String): Unit
  def setPosition(position: Partial[MDCMenuDistance]): Unit
  def setTransformOrigin(origin: String): Unit
}

object MDCMenuSurfaceAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    getAnchorDimensions: () => ClientRect | Null,
    getBodyDimensions: () => MDCMenuDimensions,
    getInnerDimensions: () => MDCMenuDimensions,
    getWindowDimensions: () => MDCMenuDimensions,
    getWindowScroll: () => MDCMenuPoint,
    hasAnchor: () => Boolean,
    hasClass: String => Boolean,
    isElementInContainer: Element => Boolean,
    isFocused: () => Boolean,
    isRtl: () => Boolean,
    notifyClose: () => Unit,
    notifyOpen: () => Unit,
    removeClass: String => Unit,
    restoreFocus: () => Unit,
    saveFocus: () => Unit,
    setMaxHeight: String => Unit,
    setPosition: Partial[MDCMenuDistance] => Unit,
    setTransformOrigin: String => Unit
  ): MDCMenuSurfaceAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getBodyDimensions = js.Any.fromFunction0(getBodyDimensions), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), getWindowScroll = js.Any.fromFunction0(getWindowScroll), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), isElementInContainer = js.Any.fromFunction1(isElementInContainer), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyClose = js.Any.fromFunction0(notifyClose), notifyOpen = js.Any.fromFunction0(notifyOpen), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), saveFocus = js.Any.fromFunction0(saveFocus), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
  
    __obj.asInstanceOf[MDCMenuSurfaceAdapter]
  }
}

