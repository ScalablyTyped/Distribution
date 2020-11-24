package typings.materialBanner.adapterMod

import typings.materialBanner.constantsMod.CloseReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCBannerAdapter extends js.Object {
  
  /**
    * Adds the given class to the banner root element.
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * @return Returns the height of the banner content element.
    */
  def getContentHeight(): Double = js.native
  
  /**
    * Broadcasts an event denoting that the banner has finished closing.
    */
  def notifyClosed(reason: CloseReason): Unit = js.native
  
  /**
    * Broadcasts an event denoting that the banner has just started closing.
    */
  def notifyClosing(reason: CloseReason): Unit = js.native
  
  /**
    * Broadcasts an event denoting that the banner has finished opening.
    */
  def notifyOpened(): Unit = js.native
  
  /**
    * Broadcasts an event denoting that the banner has just started opening.
    */
  def notifyOpening(): Unit = js.native
  
  /**
    * Removes the given class from the banner root element.
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Sets a style property of the banner root element to the passed value.
    */
  def setStyleProperty(propertyName: String, value: String): Unit = js.native
}
object MDCBannerAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    getContentHeight: () => Double,
    notifyClosed: CloseReason => Unit,
    notifyClosing: CloseReason => Unit,
    notifyOpened: () => Unit,
    notifyOpening: () => Unit,
    removeClass: String => Unit,
    setStyleProperty: (String, String) => Unit
  ): MDCBannerAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getContentHeight = js.Any.fromFunction0(getContentHeight), notifyClosed = js.Any.fromFunction1(notifyClosed), notifyClosing = js.Any.fromFunction1(notifyClosing), notifyOpened = js.Any.fromFunction0(notifyOpened), notifyOpening = js.Any.fromFunction0(notifyOpening), removeClass = js.Any.fromFunction1(removeClass), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
    __obj.asInstanceOf[MDCBannerAdapter]
  }
  
  @scala.inline
  implicit class MDCBannerAdapterOps[Self <: MDCBannerAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetContentHeight(value: () => Double): Self = this.set("getContentHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyClosed(value: CloseReason => Unit): Self = this.set("notifyClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyClosing(value: CloseReason => Unit): Self = this.set("notifyClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyOpened(value: () => Unit): Self = this.set("notifyOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyOpening(value: () => Unit): Self = this.set("notifyOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyleProperty(value: (String, String) => Unit): Self = this.set("setStyleProperty", js.Any.fromFunction2(value))
  }
}
