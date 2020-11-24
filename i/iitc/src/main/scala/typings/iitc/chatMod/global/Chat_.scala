package typings.iitc.chatMod.global

import typings.iitc.iitcNumbers.`0`
import typings.iitc.iitcNumbers.`1`
import typings.iitc.iitcNumbers.`2`
import typings.iitc.iitcStrings.chatalerts
import typings.iitc.iitcStrings.chatall
import typings.iitc.iitcStrings.chatfaction
import typings.iitc.inteltypesMod.Intel.MarkUpPortalType
import typings.spectrum.JQuery
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Chat")
@js.native
class Chat_ () extends js.Object {
  
  // alerts
  var _alerts: chatStorage = js.native
  
  // faction
  var _faction: chatStorage = js.native
  
  // all
  var _public: chatStorage = js.native
  
  var _requestAlertsRunning: Boolean = js.native
  
  var _requestFactionRunning: Boolean = js.native
  
  var _requestPublicRunning: Boolean = js.native
  
  /** add nickname to chat-input line */
  def addNickname(nick: String): Unit = js.native
  
  /**
    * called by plugins (or other things?) that need to monitor COMM data streams when the user is not viewing them
    * instance: a unique string identifying the plugin requesting background COMM
    * channel: either 'all', 'faction' or (soon) 'alerts' - others possible in the future
    * flag: true for data wanted, false for not wanted
    */
  def backgroundChannelData(instance: String, channel: ChatChannels, flag: Boolean): Unit = js.native
  
  def chooseTab(tab: ChatChannels): Unit = js.native
  
  /** mouse event handler */
  def chooser(event: MouseEvent): Unit = js.native
  
  def genPostData(channel: ChatChannels, storageHash: chatStorage, getOlderMsgs: Boolean): js.Any = js.native
  
  /** @return name of active tab */
  def getActive(): String = js.native
  
  /** Override portal names that are used over and over, such as 'US Post Office' */
  def getChatPortalName(markup: MarkUpPortalType): String = js.native
  
  def handleAlerts(data: js.Any, olderMsgs: Boolean): Unit = js.native
  
  def handleFaction(data: js.Any, olderMsgs: Boolean): Unit = js.native
  
  def handlePublic(data: js.Any, olderMsgs: Boolean): Unit = js.native
  
  def handleTabCompletion(): Unit = js.native
  
  /** contains the logic to keep the correct scroll position. */
  def keepScrollPosition(box: JQuery, scrollBefore: Double, isOldMsgs: Boolean): Unit = js.native
  
  /**
    * checks if there are enough messages in the selected chat tab and
    * loads more if not.
    */
  def needMoreMessages(): Unit = js.native
  
  /** if user clicked a agent name */
  def nicknameClicked(event: MouseEvent, nickname: String): Unit = js.native
  
  /** send current message of current chat to server */
  def postMsg(): Unit = js.native
  
  def renderAlerts(oldMsgsWereAdded: Boolean): Unit = js.native
  
  @JSName("renderData")
  def renderData_chatalerts(data: js.Any, element: chatalerts, likelyWereOldMsgs: Boolean): Unit = js.native
  @JSName("renderData")
  def renderData_chatall(data: js.Any, element: chatall, likelyWereOldMsgs: Boolean): Unit = js.native
  /**
    * renders data from the data-hash to the element defined by the given
    * ID. Set 3rd argument to true if it is likely that old data has been
    * added. Latter is only required for scrolling.
    */
  @JSName("renderData")
  def renderData_chatfaction(data: js.Any, element: chatfaction, likelyWereOldMsgs: Boolean): Unit = js.native
  
  def renderDivider(text: String): String = js.native
  
  def renderFaction(oldMsgsWereAdded: Boolean): Unit = js.native
  
  @JSName("renderMsg")
  def renderMsg_0(
    msg: String,
    nick: String,
    time: Double,
    team: `0`,
    msgToPlayer: Boolean,
    systemNarrowcast: Boolean
  ): String = js.native
  @JSName("renderMsg")
  def renderMsg_1(
    msg: String,
    nick: String,
    time: Double,
    team: `1`,
    msgToPlayer: Boolean,
    systemNarrowcast: Boolean
  ): String = js.native
  @JSName("renderMsg")
  def renderMsg_2(
    msg: String,
    nick: String,
    time: Double,
    team: `2`,
    msgToPlayer: Boolean,
    systemNarrowcast: Boolean
  ): String = js.native
  
  def renderPublic(oldMsgsWereAdded: Boolean): Unit = js.native
  
   // [instance][channel] = flag;
  def request(): Unit = js.native
  
  def requestAlerts(getOlderMsgs: Boolean, isRetry: Boolean): Unit = js.native
  
  def requestFaction(getOlderMsgs: Boolean, isRetry: Boolean): Unit = js.native
  
  def requestPublic(getOlderMsgs: Boolean, isRetry: Boolean): Unit = js.native
  
  /** init */
  def setup(): Unit = js.native
  
  def setupPosting(): Unit = js.native
  
  def setupTime(): Unit = js.native
  
  /** activate a chat tab  */
  def show(tab: ChatChannels): Unit = js.native
  
  def tabToChannel(tab: String): ChatChannels = js.native
  def tabToChannel(tab: ChatChannels): ChatChannels = js.native
  
  /** Expand or collapse chat window */
  def toggle(): Unit = js.native
  
  /** store incoming data */
  def writeDataToHash(newData: js.Any, storageHash: chatStorage, isPublicChannel: Boolean, isOlderMsgs: Boolean): Unit = js.native
}
