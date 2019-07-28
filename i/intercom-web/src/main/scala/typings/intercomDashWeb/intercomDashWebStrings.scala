package typings.intercomDashWeb

import typings.intercomDashWeb.IntercomUnderscoreNs.IntercomCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object intercomDashWebStrings {
  @js.native
  sealed trait boot extends IntercomCommand
  
  @js.native
  sealed trait getVisitorId extends IntercomCommand
  
  @js.native
  sealed trait hide extends IntercomCommand
  
  @js.native
  sealed trait onActivatorClick extends IntercomCommand
  
  @js.native
  sealed trait onHide extends IntercomCommand
  
  @js.native
  sealed trait onShow extends IntercomCommand
  
  @js.native
  sealed trait onUnreadCountChange extends IntercomCommand
  
  @js.native
  sealed trait show extends IntercomCommand
  
  @js.native
  sealed trait showMessages extends IntercomCommand
  
  @js.native
  sealed trait showNewMessage extends IntercomCommand
  
  @js.native
  sealed trait shutdown extends IntercomCommand
  
  @js.native
  sealed trait trackEvent extends IntercomCommand
  
  @js.native
  sealed trait update extends IntercomCommand
  
  @scala.inline
  def boot: boot = "boot".asInstanceOf[boot]
  @scala.inline
  def getVisitorId: getVisitorId = "getVisitorId".asInstanceOf[getVisitorId]
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  @scala.inline
  def onActivatorClick: onActivatorClick = "onActivatorClick".asInstanceOf[onActivatorClick]
  @scala.inline
  def onHide: onHide = "onHide".asInstanceOf[onHide]
  @scala.inline
  def onShow: onShow = "onShow".asInstanceOf[onShow]
  @scala.inline
  def onUnreadCountChange: onUnreadCountChange = "onUnreadCountChange".asInstanceOf[onUnreadCountChange]
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  @scala.inline
  def showMessages: showMessages = "showMessages".asInstanceOf[showMessages]
  @scala.inline
  def showNewMessage: showNewMessage = "showNewMessage".asInstanceOf[showNewMessage]
  @scala.inline
  def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  @scala.inline
  def trackEvent: trackEvent = "trackEvent".asInstanceOf[trackEvent]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}

