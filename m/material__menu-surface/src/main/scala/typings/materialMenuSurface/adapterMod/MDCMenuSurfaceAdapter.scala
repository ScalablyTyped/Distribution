package typings.materialMenuSurface.adapterMod

import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCMenuSurfaceAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def getAnchorDimensions(): ClientRect | Null = js.native
  def getBodyDimensions(): MDCMenuDimensions = js.native
  def getInnerDimensions(): MDCMenuDimensions = js.native
  def getWindowDimensions(): MDCMenuDimensions = js.native
  def getWindowScroll(): MDCMenuPoint = js.native
  def hasAnchor(): Boolean = js.native
  def hasClass(className: String): Boolean = js.native
  def isElementInContainer(el: Element): Boolean = js.native
  def isFocused(): Boolean = js.native
  def isRtl(): Boolean = js.native
  /** Emits an event when the menu surface is closed. */
  def notifyClose(): Unit = js.native
  /** Emits an event when the menu surface is opened. */
  def notifyOpen(): Unit = js.native
  def removeClass(className: String): Unit = js.native
  /** Restores focus to the element that was focused before the menu surface was opened. */
  def restoreFocus(): Unit = js.native
  /** Saves the element that was focused before the menu surface was opened. */
  def saveFocus(): Unit = js.native
  def setMaxHeight(height: String): Unit = js.native
  def setPosition(position: PartialMDCMenuDistance): Unit = js.native
  def setTransformOrigin(origin: String): Unit = js.native
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
    setPosition: PartialMDCMenuDistance => Unit,
    setTransformOrigin: String => Unit
  ): MDCMenuSurfaceAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getBodyDimensions = js.Any.fromFunction0(getBodyDimensions), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), getWindowScroll = js.Any.fromFunction0(getWindowScroll), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), isElementInContainer = js.Any.fromFunction1(isElementInContainer), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyClose = js.Any.fromFunction0(notifyClose), notifyOpen = js.Any.fromFunction0(notifyOpen), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), saveFocus = js.Any.fromFunction0(saveFocus), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
    __obj.asInstanceOf[MDCMenuSurfaceAdapter]
  }
  @scala.inline
  implicit class MDCMenuSurfaceAdapterOps[Self <: MDCMenuSurfaceAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAnchorDimensions(value: () => ClientRect | Null): Self = this.set("getAnchorDimensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBodyDimensions(value: () => MDCMenuDimensions): Self = this.set("getBodyDimensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInnerDimensions(value: () => MDCMenuDimensions): Self = this.set("getInnerDimensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWindowDimensions(value: () => MDCMenuDimensions): Self = this.set("getWindowDimensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWindowScroll(value: () => MDCMenuPoint): Self = this.set("getWindowScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setHasAnchor(value: () => Boolean): Self = this.set("hasAnchor", js.Any.fromFunction0(value))
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def setIsElementInContainer(value: Element => Boolean): Self = this.set("isElementInContainer", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFocused(value: () => Boolean): Self = this.set("isFocused", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRtl(value: () => Boolean): Self = this.set("isRtl", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyClose(value: () => Unit): Self = this.set("notifyClose", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyOpen(value: () => Unit): Self = this.set("notifyOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setRestoreFocus(value: () => Unit): Self = this.set("restoreFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setSaveFocus(value: () => Unit): Self = this.set("saveFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setSetMaxHeight(value: String => Unit): Self = this.set("setMaxHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: PartialMDCMenuDistance => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTransformOrigin(value: String => Unit): Self = this.set("setTransformOrigin", js.Any.fromFunction1(value))
  }
  
}

