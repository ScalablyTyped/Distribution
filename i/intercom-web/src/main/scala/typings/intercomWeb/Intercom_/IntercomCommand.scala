package typings.intercomWeb.Intercom_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomWeb.intercomWebStrings.boot
  - typings.intercomWeb.intercomWebStrings.shutdown
  - typings.intercomWeb.intercomWebStrings.update
  - typings.intercomWeb.intercomWebStrings.hide
  - typings.intercomWeb.intercomWebStrings.show
  - typings.intercomWeb.intercomWebStrings.showMessages
  - typings.intercomWeb.intercomWebStrings.showNewMessage
  - typings.intercomWeb.intercomWebStrings.onHide
  - typings.intercomWeb.intercomWebStrings.onShow
  - typings.intercomWeb.intercomWebStrings.onUnreadCountChange
  - typings.intercomWeb.intercomWebStrings.onActivatorClick
  - typings.intercomWeb.intercomWebStrings.trackEvent
  - typings.intercomWeb.intercomWebStrings.getVisitorId
*/
trait IntercomCommand extends js.Object

object IntercomCommand {
  @scala.inline
  def boot: typings.intercomWeb.intercomWebStrings.boot = this.cast("boot")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def getVisitorId: typings.intercomWeb.intercomWebStrings.getVisitorId = this.cast("getVisitorId")
  @scala.inline
  def hide: typings.intercomWeb.intercomWebStrings.hide = this.cast("hide")
  @scala.inline
  def onActivatorClick: typings.intercomWeb.intercomWebStrings.onActivatorClick = this.cast("onActivatorClick")
  @scala.inline
  def onHide: typings.intercomWeb.intercomWebStrings.onHide = this.cast("onHide")
  @scala.inline
  def onShow: typings.intercomWeb.intercomWebStrings.onShow = this.cast("onShow")
  @scala.inline
  def onUnreadCountChange: typings.intercomWeb.intercomWebStrings.onUnreadCountChange = this.cast("onUnreadCountChange")
  @scala.inline
  def show: typings.intercomWeb.intercomWebStrings.show = this.cast("show")
  @scala.inline
  def showMessages: typings.intercomWeb.intercomWebStrings.showMessages = this.cast("showMessages")
  @scala.inline
  def showNewMessage: typings.intercomWeb.intercomWebStrings.showNewMessage = this.cast("showNewMessage")
  @scala.inline
  def shutdown: typings.intercomWeb.intercomWebStrings.shutdown = this.cast("shutdown")
  @scala.inline
  def trackEvent: typings.intercomWeb.intercomWebStrings.trackEvent = this.cast("trackEvent")
  @scala.inline
  def update: typings.intercomWeb.intercomWebStrings.update = this.cast("update")
}

