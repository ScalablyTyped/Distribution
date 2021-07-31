package typings.intercomWeb

import typings.intercomWeb.Intercom.IntercomCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intercomWebStrings {
  
  @js.native
  sealed trait boot
    extends StObject
       with IntercomCommand
  @scala.inline
  def boot: boot = "boot".asInstanceOf[boot]
  
  @js.native
  sealed trait getVisitorId
    extends StObject
       with IntercomCommand
  @scala.inline
  def getVisitorId: getVisitorId = "getVisitorId".asInstanceOf[getVisitorId]
  
  @js.native
  sealed trait hide
    extends StObject
       with IntercomCommand
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait onActivatorClick
    extends StObject
       with IntercomCommand
  @scala.inline
  def onActivatorClick: onActivatorClick = "onActivatorClick".asInstanceOf[onActivatorClick]
  
  @js.native
  sealed trait onHide
    extends StObject
       with IntercomCommand
  @scala.inline
  def onHide: onHide = "onHide".asInstanceOf[onHide]
  
  @js.native
  sealed trait onShow
    extends StObject
       with IntercomCommand
  @scala.inline
  def onShow: onShow = "onShow".asInstanceOf[onShow]
  
  @js.native
  sealed trait onUnreadCountChange
    extends StObject
       with IntercomCommand
  @scala.inline
  def onUnreadCountChange: onUnreadCountChange = "onUnreadCountChange".asInstanceOf[onUnreadCountChange]
  
  @js.native
  sealed trait show
    extends StObject
       with IntercomCommand
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait showMessages
    extends StObject
       with IntercomCommand
  @scala.inline
  def showMessages: showMessages = "showMessages".asInstanceOf[showMessages]
  
  @js.native
  sealed trait showNewMessage
    extends StObject
       with IntercomCommand
  @scala.inline
  def showNewMessage: showNewMessage = "showNewMessage".asInstanceOf[showNewMessage]
  
  @js.native
  sealed trait shutdown
    extends StObject
       with IntercomCommand
  @scala.inline
  def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  
  @js.native
  sealed trait startTour
    extends StObject
       with IntercomCommand
  @scala.inline
  def startTour: startTour = "startTour".asInstanceOf[startTour]
  
  @js.native
  sealed trait trackEvent
    extends StObject
       with IntercomCommand
  @scala.inline
  def trackEvent: trackEvent = "trackEvent".asInstanceOf[trackEvent]
  
  @js.native
  sealed trait update
    extends StObject
       with IntercomCommand
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}
