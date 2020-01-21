package typings.inboxsdk

import typings.inboxsdk.mod.Conversations.MessageViewViewStates
import typings.inboxsdk.mod.NavMenu.NavItemTypes
import typings.inboxsdk.mod.Router.RouteTypes
import typings.inboxsdk.mod.Toolbars.SectionNames
import typings.inboxsdk.mod.Toolbars.ToolbarButtonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inboxsdkStrings {
  @js.native
  sealed trait CHAT extends RouteTypes
  
  @js.native
  sealed trait COLLAPSED extends MessageViewViewStates
  
  @js.native
  sealed trait CREATE extends js.Object
  
  @js.native
  sealed trait CUSTOM extends RouteTypes
  
  @js.native
  sealed trait DROPDOWN_BUTTON extends js.Object
  
  @js.native
  sealed trait EXPANDED extends MessageViewViewStates
  
  @js.native
  sealed trait HIDDEN extends MessageViewViewStates
  
  @js.native
  sealed trait ICON_BUTTON extends js.Object
  
  @js.native
  sealed trait INBOX_STATE extends SectionNames
  
  @js.native
  sealed trait LINK extends NavItemTypes
  
  @js.native
  sealed trait LIST
    extends RouteTypes
       with ToolbarButtonPosition
  
  @js.native
  sealed trait METADATA_STATE extends SectionNames
  
  @js.native
  sealed trait MODIFIER extends js.Object
  
  @js.native
  sealed trait MORE extends js.Object
  
  @js.native
  sealed trait NAVIGATION extends NavItemTypes
  
  @js.native
  sealed trait OTHER extends SectionNames
  
  @js.native
  sealed trait PRIMARY_ACTION extends js.Object
  
  @js.native
  sealed trait ROW extends ToolbarButtonPosition
  
  @js.native
  sealed trait SECONDARY_ACTION extends js.Object
  
  @js.native
  sealed trait SEND_ACTION extends js.Object
  
  @js.native
  sealed trait SETTINGS extends RouteTypes
  
  @js.native
  sealed trait THREAD
    extends RouteTypes
       with ToolbarButtonPosition
  
  @js.native
  sealed trait UNKNOWN extends RouteTypes
  
  @js.native
  sealed trait activate extends js.Object
  
  @js.native
  sealed trait bccContactAdded extends js.Object
  
  @js.native
  sealed trait bccContactRemoved extends js.Object
  
  @js.native
  sealed trait bodyChanged extends js.Object
  
  @js.native
  sealed trait ccContactAdded extends js.Object
  
  @js.native
  sealed trait ccContactRemoved extends js.Object
  
  @js.native
  sealed trait closing extends js.Object
  
  @js.native
  sealed trait collapsed_ extends js.Object
  
  @js.native
  sealed trait contactHover extends js.Object
  
  @js.native
  sealed trait deactivate extends js.Object
  
  @js.native
  sealed trait destroy extends js.Object
  
  @js.native
  sealed trait discard extends js.Object
  
  @js.native
  sealed trait escape extends js.Object
  
  @js.native
  sealed trait expanded_ extends js.Object
  
  @js.native
  sealed trait fromContactChanged extends js.Object
  
  @js.native
  sealed trait fullscreenChanged extends js.Object
  
  @js.native
  sealed trait load extends js.Object
  
  @js.native
  sealed trait minimize extends js.Object
  
  @js.native
  sealed trait minimized extends js.Object
  
  @js.native
  sealed trait outsideInteraction extends js.Object
  
  @js.native
  sealed trait preautoclose extends js.Object
  
  @js.native
  sealed trait presending extends js.Object
  
  @js.native
  sealed trait recipient extends js.Object
  
  @js.native
  sealed trait recipientsChanged extends js.Object
  
  @js.native
  sealed trait responseTypeChanged extends js.Object
  
  @js.native
  sealed trait restore extends js.Object
  
  @js.native
  sealed trait restored extends js.Object
  
  @js.native
  sealed trait sendCanceled extends js.Object
  
  @js.native
  sealed trait sender extends js.Object
  
  @js.native
  sealed trait sending extends js.Object
  
  @js.native
  sealed trait sent extends js.Object
  
  @js.native
  sealed trait slideAnimationDone extends js.Object
  
  @js.native
  sealed trait toContactAdded extends js.Object
  
  @js.native
  sealed trait toContactRemoved extends js.Object
  
  @js.native
  sealed trait viewStateChange extends js.Object
  
  @scala.inline
  def CHAT: CHAT = "CHAT".asInstanceOf[CHAT]
  @scala.inline
  def COLLAPSED: COLLAPSED = "COLLAPSED".asInstanceOf[COLLAPSED]
  @scala.inline
  def CREATE: CREATE = "CREATE".asInstanceOf[CREATE]
  @scala.inline
  def CUSTOM: CUSTOM = "CUSTOM".asInstanceOf[CUSTOM]
  @scala.inline
  def DROPDOWN_BUTTON: DROPDOWN_BUTTON = "DROPDOWN_BUTTON".asInstanceOf[DROPDOWN_BUTTON]
  @scala.inline
  def EXPANDED: EXPANDED = "EXPANDED".asInstanceOf[EXPANDED]
  @scala.inline
  def HIDDEN: HIDDEN = "HIDDEN".asInstanceOf[HIDDEN]
  @scala.inline
  def ICON_BUTTON: ICON_BUTTON = "ICON_BUTTON".asInstanceOf[ICON_BUTTON]
  @scala.inline
  def INBOX_STATE: INBOX_STATE = "INBOX_STATE".asInstanceOf[INBOX_STATE]
  @scala.inline
  def LINK: LINK = "LINK".asInstanceOf[LINK]
  @scala.inline
  def LIST: LIST = "LIST".asInstanceOf[LIST]
  @scala.inline
  def METADATA_STATE: METADATA_STATE = "METADATA_STATE".asInstanceOf[METADATA_STATE]
  @scala.inline
  def MODIFIER: MODIFIER = "MODIFIER".asInstanceOf[MODIFIER]
  @scala.inline
  def MORE: MORE = "MORE".asInstanceOf[MORE]
  @scala.inline
  def NAVIGATION: NAVIGATION = "NAVIGATION".asInstanceOf[NAVIGATION]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def PRIMARY_ACTION: PRIMARY_ACTION = "PRIMARY_ACTION".asInstanceOf[PRIMARY_ACTION]
  @scala.inline
  def ROW: ROW = "ROW".asInstanceOf[ROW]
  @scala.inline
  def SECONDARY_ACTION: SECONDARY_ACTION = "SECONDARY_ACTION".asInstanceOf[SECONDARY_ACTION]
  @scala.inline
  def SEND_ACTION: SEND_ACTION = "SEND_ACTION".asInstanceOf[SEND_ACTION]
  @scala.inline
  def SETTINGS: SETTINGS = "SETTINGS".asInstanceOf[SETTINGS]
  @scala.inline
  def THREAD: THREAD = "THREAD".asInstanceOf[THREAD]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def activate: activate = "activate".asInstanceOf[activate]
  @scala.inline
  def bccContactAdded: bccContactAdded = "bccContactAdded".asInstanceOf[bccContactAdded]
  @scala.inline
  def bccContactRemoved: bccContactRemoved = "bccContactRemoved".asInstanceOf[bccContactRemoved]
  @scala.inline
  def bodyChanged: bodyChanged = "bodyChanged".asInstanceOf[bodyChanged]
  @scala.inline
  def ccContactAdded: ccContactAdded = "ccContactAdded".asInstanceOf[ccContactAdded]
  @scala.inline
  def ccContactRemoved: ccContactRemoved = "ccContactRemoved".asInstanceOf[ccContactRemoved]
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  @scala.inline
  def collapsed_ : collapsed_ = "collapsed".asInstanceOf[collapsed_]
  @scala.inline
  def contactHover: contactHover = "contactHover".asInstanceOf[contactHover]
  @scala.inline
  def deactivate: deactivate = "deactivate".asInstanceOf[deactivate]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  @scala.inline
  def escape: escape = "escape".asInstanceOf[escape]
  @scala.inline
  def expanded_ : expanded_ = "expanded".asInstanceOf[expanded_]
  @scala.inline
  def fromContactChanged: fromContactChanged = "fromContactChanged".asInstanceOf[fromContactChanged]
  @scala.inline
  def fullscreenChanged: fullscreenChanged = "fullscreenChanged".asInstanceOf[fullscreenChanged]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def minimize: minimize = "minimize".asInstanceOf[minimize]
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  @scala.inline
  def outsideInteraction: outsideInteraction = "outsideInteraction".asInstanceOf[outsideInteraction]
  @scala.inline
  def preautoclose: preautoclose = "preautoclose".asInstanceOf[preautoclose]
  @scala.inline
  def presending: presending = "presending".asInstanceOf[presending]
  @scala.inline
  def recipient: recipient = "recipient".asInstanceOf[recipient]
  @scala.inline
  def recipientsChanged: recipientsChanged = "recipientsChanged".asInstanceOf[recipientsChanged]
  @scala.inline
  def responseTypeChanged: responseTypeChanged = "responseTypeChanged".asInstanceOf[responseTypeChanged]
  @scala.inline
  def restore: restore = "restore".asInstanceOf[restore]
  @scala.inline
  def restored: restored = "restored".asInstanceOf[restored]
  @scala.inline
  def sendCanceled: sendCanceled = "sendCanceled".asInstanceOf[sendCanceled]
  @scala.inline
  def sender: sender = "sender".asInstanceOf[sender]
  @scala.inline
  def sending: sending = "sending".asInstanceOf[sending]
  @scala.inline
  def sent: sent = "sent".asInstanceOf[sent]
  @scala.inline
  def slideAnimationDone: slideAnimationDone = "slideAnimationDone".asInstanceOf[slideAnimationDone]
  @scala.inline
  def toContactAdded: toContactAdded = "toContactAdded".asInstanceOf[toContactAdded]
  @scala.inline
  def toContactRemoved: toContactRemoved = "toContactRemoved".asInstanceOf[toContactRemoved]
  @scala.inline
  def viewStateChange: viewStateChange = "viewStateChange".asInstanceOf[viewStateChange]
}

