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
  inline def CHAT: CHAT = "CHAT".asInstanceOf[CHAT]
  
  @js.native
  sealed trait COLLAPSED
    extends StObject
       with MessageViewViewStates
  inline def COLLAPSED: COLLAPSED = "COLLAPSED".asInstanceOf[COLLAPSED]
  
  @js.native
  sealed trait CREATE extends StObject
  inline def CREATE: CREATE = "CREATE".asInstanceOf[CREATE]
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with RouteTypes
  inline def CUSTOM: CUSTOM = "CUSTOM".asInstanceOf[CUSTOM]
  
  @js.native
  sealed trait DROPDOWN_BUTTON extends StObject
  inline def DROPDOWN_BUTTON: DROPDOWN_BUTTON = "DROPDOWN_BUTTON".asInstanceOf[DROPDOWN_BUTTON]
  
  @js.native
  sealed trait EXPANDED
    extends StObject
       with MessageViewViewStates
  inline def EXPANDED: EXPANDED = "EXPANDED".asInstanceOf[EXPANDED]
  
  @js.native
  sealed trait HIDDEN
    extends StObject
       with MessageViewViewStates
  inline def HIDDEN: HIDDEN = "HIDDEN".asInstanceOf[HIDDEN]
  
  @js.native
  sealed trait ICON_BUTTON extends StObject
  inline def ICON_BUTTON: ICON_BUTTON = "ICON_BUTTON".asInstanceOf[ICON_BUTTON]
  
  @js.native
  sealed trait INBOX_STATE
    extends StObject
       with SectionNames
  inline def INBOX_STATE: INBOX_STATE = "INBOX_STATE".asInstanceOf[INBOX_STATE]
  
  @js.native
  sealed trait LINK
    extends StObject
       with NavItemTypes
  inline def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @js.native
  sealed trait LIST
    extends StObject
       with RouteTypes
       with ToolbarButtonPosition
  inline def LIST: LIST = "LIST".asInstanceOf[LIST]
  
  @js.native
  sealed trait METADATA_STATE
    extends StObject
       with SectionNames
  inline def METADATA_STATE: METADATA_STATE = "METADATA_STATE".asInstanceOf[METADATA_STATE]
  
  @js.native
  sealed trait MODIFIER extends StObject
  inline def MODIFIER: MODIFIER = "MODIFIER".asInstanceOf[MODIFIER]
  
  @js.native
  sealed trait MORE extends StObject
  inline def MORE: MORE = "MORE".asInstanceOf[MORE]
  
  @js.native
  sealed trait NAVIGATION
    extends StObject
       with NavItemTypes
  inline def NAVIGATION: NAVIGATION = "NAVIGATION".asInstanceOf[NAVIGATION]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with SectionNames
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait PRIMARY_ACTION extends StObject
  inline def PRIMARY_ACTION: PRIMARY_ACTION = "PRIMARY_ACTION".asInstanceOf[PRIMARY_ACTION]
  
  @js.native
  sealed trait ROW
    extends StObject
       with ToolbarButtonPosition
  inline def ROW: ROW = "ROW".asInstanceOf[ROW]
  
  @js.native
  sealed trait SECONDARY_ACTION extends StObject
  inline def SECONDARY_ACTION: SECONDARY_ACTION = "SECONDARY_ACTION".asInstanceOf[SECONDARY_ACTION]
  
  @js.native
  sealed trait SEND_ACTION extends StObject
  inline def SEND_ACTION: SEND_ACTION = "SEND_ACTION".asInstanceOf[SEND_ACTION]
  
  @js.native
  sealed trait SETTINGS
    extends StObject
       with RouteTypes
  inline def SETTINGS: SETTINGS = "SETTINGS".asInstanceOf[SETTINGS]
  
  @js.native
  sealed trait THREAD
    extends StObject
       with RouteTypes
       with ToolbarButtonPosition
  inline def THREAD: THREAD = "THREAD".asInstanceOf[THREAD]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with RouteTypes
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait activate extends StObject
  inline def activate: activate = "activate".asInstanceOf[activate]
  
  @js.native
  sealed trait bccContactAdded extends StObject
  inline def bccContactAdded: bccContactAdded = "bccContactAdded".asInstanceOf[bccContactAdded]
  
  @js.native
  sealed trait bccContactRemoved extends StObject
  inline def bccContactRemoved: bccContactRemoved = "bccContactRemoved".asInstanceOf[bccContactRemoved]
  
  @js.native
  sealed trait bodyChanged extends StObject
  inline def bodyChanged: bodyChanged = "bodyChanged".asInstanceOf[bodyChanged]
  
  @js.native
  sealed trait ccContactAdded extends StObject
  inline def ccContactAdded: ccContactAdded = "ccContactAdded".asInstanceOf[ccContactAdded]
  
  @js.native
  sealed trait ccContactRemoved extends StObject
  inline def ccContactRemoved: ccContactRemoved = "ccContactRemoved".asInstanceOf[ccContactRemoved]
  
  @js.native
  sealed trait closing extends StObject
  inline def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait collapsed_ extends StObject
  inline def collapsed_ : collapsed_ = "collapsed".asInstanceOf[collapsed_]
  
  @js.native
  sealed trait contactHover extends StObject
  inline def contactHover: contactHover = "contactHover".asInstanceOf[contactHover]
  
  @js.native
  sealed trait deactivate extends StObject
  inline def deactivate: deactivate = "deactivate".asInstanceOf[deactivate]
  
  @js.native
  sealed trait destroy extends StObject
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait discard extends StObject
  inline def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait escape extends StObject
  inline def escape: escape = "escape".asInstanceOf[escape]
  
  @js.native
  sealed trait expanded_ extends StObject
  inline def expanded_ : expanded_ = "expanded".asInstanceOf[expanded_]
  
  @js.native
  sealed trait fromContactChanged extends StObject
  inline def fromContactChanged: fromContactChanged = "fromContactChanged".asInstanceOf[fromContactChanged]
  
  @js.native
  sealed trait fullscreenChanged extends StObject
  inline def fullscreenChanged: fullscreenChanged = "fullscreenChanged".asInstanceOf[fullscreenChanged]
  
  @js.native
  sealed trait load extends StObject
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait minimize extends StObject
  inline def minimize: minimize = "minimize".asInstanceOf[minimize]
  
  @js.native
  sealed trait minimized extends StObject
  inline def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait outsideInteraction extends StObject
  inline def outsideInteraction: outsideInteraction = "outsideInteraction".asInstanceOf[outsideInteraction]
  
  @js.native
  sealed trait preautoclose extends StObject
  inline def preautoclose: preautoclose = "preautoclose".asInstanceOf[preautoclose]
  
  @js.native
  sealed trait presending extends StObject
  inline def presending: presending = "presending".asInstanceOf[presending]
  
  @js.native
  sealed trait recipient extends StObject
  inline def recipient: recipient = "recipient".asInstanceOf[recipient]
  
  @js.native
  sealed trait recipientsChanged extends StObject
  inline def recipientsChanged: recipientsChanged = "recipientsChanged".asInstanceOf[recipientsChanged]
  
  @js.native
  sealed trait responseTypeChanged extends StObject
  inline def responseTypeChanged: responseTypeChanged = "responseTypeChanged".asInstanceOf[responseTypeChanged]
  
  @js.native
  sealed trait restore extends StObject
  inline def restore: restore = "restore".asInstanceOf[restore]
  
  @js.native
  sealed trait restored extends StObject
  inline def restored: restored = "restored".asInstanceOf[restored]
  
  @js.native
  sealed trait sendCanceled extends StObject
  inline def sendCanceled: sendCanceled = "sendCanceled".asInstanceOf[sendCanceled]
  
  @js.native
  sealed trait sender extends StObject
  inline def sender: sender = "sender".asInstanceOf[sender]
  
  @js.native
  sealed trait sending extends StObject
  inline def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent extends StObject
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait slideAnimationDone extends StObject
  inline def slideAnimationDone: slideAnimationDone = "slideAnimationDone".asInstanceOf[slideAnimationDone]
  
  @js.native
  sealed trait toContactAdded extends StObject
  inline def toContactAdded: toContactAdded = "toContactAdded".asInstanceOf[toContactAdded]
  
  @js.native
  sealed trait toContactRemoved extends StObject
  inline def toContactRemoved: toContactRemoved = "toContactRemoved".asInstanceOf[toContactRemoved]
  
  @js.native
  sealed trait viewStateChange extends StObject
  inline def viewStateChange: viewStateChange = "viewStateChange".asInstanceOf[viewStateChange]
}
