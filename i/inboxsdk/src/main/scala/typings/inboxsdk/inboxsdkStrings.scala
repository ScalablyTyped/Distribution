package typings.inboxsdk

import typings.inboxsdk.mod.Conversations.MessageViewViewStates
import typings.inboxsdk.mod.NavMenu.NavItemTypes
import typings.inboxsdk.mod.Router.RouteTypes
import typings.inboxsdk.mod.Toolbars.SectionNames
import typings.inboxsdk.mod.Toolbars.ToolbarButtonPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboxsdkStrings {
  
  @js.native
  sealed trait CHAT
    extends StObject
       with RouteTypes
  @scala.inline
  def CHAT: CHAT = "CHAT".asInstanceOf[CHAT]
  
  @js.native
  sealed trait COLLAPSED
    extends StObject
       with MessageViewViewStates
  @scala.inline
  def COLLAPSED: COLLAPSED = "COLLAPSED".asInstanceOf[COLLAPSED]
  
  @js.native
  sealed trait CREATE extends StObject
  @scala.inline
  def CREATE: CREATE = "CREATE".asInstanceOf[CREATE]
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with RouteTypes
  @scala.inline
  def CUSTOM: CUSTOM = "CUSTOM".asInstanceOf[CUSTOM]
  
  @js.native
  sealed trait DROPDOWN_BUTTON extends StObject
  @scala.inline
  def DROPDOWN_BUTTON: DROPDOWN_BUTTON = "DROPDOWN_BUTTON".asInstanceOf[DROPDOWN_BUTTON]
  
  @js.native
  sealed trait EXPANDED
    extends StObject
       with MessageViewViewStates
  @scala.inline
  def EXPANDED: EXPANDED = "EXPANDED".asInstanceOf[EXPANDED]
  
  @js.native
  sealed trait HIDDEN
    extends StObject
       with MessageViewViewStates
  @scala.inline
  def HIDDEN: HIDDEN = "HIDDEN".asInstanceOf[HIDDEN]
  
  @js.native
  sealed trait ICON_BUTTON extends StObject
  @scala.inline
  def ICON_BUTTON: ICON_BUTTON = "ICON_BUTTON".asInstanceOf[ICON_BUTTON]
  
  @js.native
  sealed trait INBOX_STATE
    extends StObject
       with SectionNames
  @scala.inline
  def INBOX_STATE: INBOX_STATE = "INBOX_STATE".asInstanceOf[INBOX_STATE]
  
  @js.native
  sealed trait LINK
    extends StObject
       with NavItemTypes
  @scala.inline
  def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @js.native
  sealed trait LIST
    extends StObject
       with RouteTypes
       with ToolbarButtonPosition
  @scala.inline
  def LIST: LIST = "LIST".asInstanceOf[LIST]
  
  @js.native
  sealed trait METADATA_STATE
    extends StObject
       with SectionNames
  @scala.inline
  def METADATA_STATE: METADATA_STATE = "METADATA_STATE".asInstanceOf[METADATA_STATE]
  
  @js.native
  sealed trait MODIFIER extends StObject
  @scala.inline
  def MODIFIER: MODIFIER = "MODIFIER".asInstanceOf[MODIFIER]
  
  @js.native
  sealed trait MORE extends StObject
  @scala.inline
  def MORE: MORE = "MORE".asInstanceOf[MORE]
  
  @js.native
  sealed trait NAVIGATION
    extends StObject
       with NavItemTypes
  @scala.inline
  def NAVIGATION: NAVIGATION = "NAVIGATION".asInstanceOf[NAVIGATION]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with SectionNames
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait PRIMARY_ACTION extends StObject
  @scala.inline
  def PRIMARY_ACTION: PRIMARY_ACTION = "PRIMARY_ACTION".asInstanceOf[PRIMARY_ACTION]
  
  @js.native
  sealed trait ROW
    extends StObject
       with ToolbarButtonPosition
  @scala.inline
  def ROW: ROW = "ROW".asInstanceOf[ROW]
  
  @js.native
  sealed trait SECONDARY_ACTION extends StObject
  @scala.inline
  def SECONDARY_ACTION: SECONDARY_ACTION = "SECONDARY_ACTION".asInstanceOf[SECONDARY_ACTION]
  
  @js.native
  sealed trait SEND_ACTION extends StObject
  @scala.inline
  def SEND_ACTION: SEND_ACTION = "SEND_ACTION".asInstanceOf[SEND_ACTION]
  
  @js.native
  sealed trait SETTINGS
    extends StObject
       with RouteTypes
  @scala.inline
  def SETTINGS: SETTINGS = "SETTINGS".asInstanceOf[SETTINGS]
  
  @js.native
  sealed trait THREAD
    extends StObject
       with RouteTypes
       with ToolbarButtonPosition
  @scala.inline
  def THREAD: THREAD = "THREAD".asInstanceOf[THREAD]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with RouteTypes
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait activate extends StObject
  @scala.inline
  def activate: activate = "activate".asInstanceOf[activate]
  
  @js.native
  sealed trait bccContactAdded extends StObject
  @scala.inline
  def bccContactAdded: bccContactAdded = "bccContactAdded".asInstanceOf[bccContactAdded]
  
  @js.native
  sealed trait bccContactRemoved extends StObject
  @scala.inline
  def bccContactRemoved: bccContactRemoved = "bccContactRemoved".asInstanceOf[bccContactRemoved]
  
  @js.native
  sealed trait bodyChanged extends StObject
  @scala.inline
  def bodyChanged: bodyChanged = "bodyChanged".asInstanceOf[bodyChanged]
  
  @js.native
  sealed trait ccContactAdded extends StObject
  @scala.inline
  def ccContactAdded: ccContactAdded = "ccContactAdded".asInstanceOf[ccContactAdded]
  
  @js.native
  sealed trait ccContactRemoved extends StObject
  @scala.inline
  def ccContactRemoved: ccContactRemoved = "ccContactRemoved".asInstanceOf[ccContactRemoved]
  
  @js.native
  sealed trait closing extends StObject
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait collapsed_ extends StObject
  @scala.inline
  def collapsed_ : collapsed_ = "collapsed".asInstanceOf[collapsed_]
  
  @js.native
  sealed trait contactHover extends StObject
  @scala.inline
  def contactHover: contactHover = "contactHover".asInstanceOf[contactHover]
  
  @js.native
  sealed trait deactivate extends StObject
  @scala.inline
  def deactivate: deactivate = "deactivate".asInstanceOf[deactivate]
  
  @js.native
  sealed trait destroy extends StObject
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait discard extends StObject
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait escape extends StObject
  @scala.inline
  def escape: escape = "escape".asInstanceOf[escape]
  
  @js.native
  sealed trait expanded_ extends StObject
  @scala.inline
  def expanded_ : expanded_ = "expanded".asInstanceOf[expanded_]
  
  @js.native
  sealed trait fromContactChanged extends StObject
  @scala.inline
  def fromContactChanged: fromContactChanged = "fromContactChanged".asInstanceOf[fromContactChanged]
  
  @js.native
  sealed trait fullscreenChanged extends StObject
  @scala.inline
  def fullscreenChanged: fullscreenChanged = "fullscreenChanged".asInstanceOf[fullscreenChanged]
  
  @js.native
  sealed trait load extends StObject
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait minimize extends StObject
  @scala.inline
  def minimize: minimize = "minimize".asInstanceOf[minimize]
  
  @js.native
  sealed trait minimized extends StObject
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait outsideInteraction extends StObject
  @scala.inline
  def outsideInteraction: outsideInteraction = "outsideInteraction".asInstanceOf[outsideInteraction]
  
  @js.native
  sealed trait preautoclose extends StObject
  @scala.inline
  def preautoclose: preautoclose = "preautoclose".asInstanceOf[preautoclose]
  
  @js.native
  sealed trait presending extends StObject
  @scala.inline
  def presending: presending = "presending".asInstanceOf[presending]
  
  @js.native
  sealed trait recipient extends StObject
  @scala.inline
  def recipient: recipient = "recipient".asInstanceOf[recipient]
  
  @js.native
  sealed trait recipientsChanged extends StObject
  @scala.inline
  def recipientsChanged: recipientsChanged = "recipientsChanged".asInstanceOf[recipientsChanged]
  
  @js.native
  sealed trait responseTypeChanged extends StObject
  @scala.inline
  def responseTypeChanged: responseTypeChanged = "responseTypeChanged".asInstanceOf[responseTypeChanged]
  
  @js.native
  sealed trait restore extends StObject
  @scala.inline
  def restore: restore = "restore".asInstanceOf[restore]
  
  @js.native
  sealed trait restored extends StObject
  @scala.inline
  def restored: restored = "restored".asInstanceOf[restored]
  
  @js.native
  sealed trait sendCanceled extends StObject
  @scala.inline
  def sendCanceled: sendCanceled = "sendCanceled".asInstanceOf[sendCanceled]
  
  @js.native
  sealed trait sender extends StObject
  @scala.inline
  def sender: sender = "sender".asInstanceOf[sender]
  
  @js.native
  sealed trait sending extends StObject
  @scala.inline
  def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent extends StObject
  @scala.inline
  def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait slideAnimationDone extends StObject
  @scala.inline
  def slideAnimationDone: slideAnimationDone = "slideAnimationDone".asInstanceOf[slideAnimationDone]
  
  @js.native
  sealed trait toContactAdded extends StObject
  @scala.inline
  def toContactAdded: toContactAdded = "toContactAdded".asInstanceOf[toContactAdded]
  
  @js.native
  sealed trait toContactRemoved extends StObject
  @scala.inline
  def toContactRemoved: toContactRemoved = "toContactRemoved".asInstanceOf[toContactRemoved]
  
  @js.native
  sealed trait viewStateChange extends StObject
  @scala.inline
  def viewStateChange: viewStateChange = "viewStateChange".asInstanceOf[viewStateChange]
}
