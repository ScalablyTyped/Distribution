package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.DisplayReasonText
import typings.knuddelsUserappsApi.anon.OnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/BotUser.html
	 */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.knuddelsUserappsApi.mod._KnuddelsJsonData because Already inherited
- typings.knuddelsUserappsApi.mod._KnuddelsSerializable because Already inherited */ @JSGlobal("BotUser")
@js.native
class BotUser () extends User {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_destroyKnuddel
  		 * @since AppServer 20200212-112449
  		 */
  def destroyKnuddel(knuddelAmount: KnuddelAmount, reason: java.lang.String): Unit = js.native
  def destroyKnuddel(knuddelAmount: KnuddelAmount, reason: java.lang.String, parameters: OnError): Unit = js.native
  
  def sendPostMessage(topic: java.lang.String, text: java.lang.String, receivingUser: User): Unit = js.native
  
  def sendPrivateMessage(message: java.lang.String, users: js.Array[User]): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicActionMessage
  		 */
  def sendPublicActionMessage(actionMessage: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicMessage
  		 */
  def sendPublicMessage(message: java.lang.String): Unit = js.native
  
  def transferKnuddel(receivingUserOrAccount: KnuddelAccount, knuddelAmount: KnuddelAmount): Unit = js.native
  def transferKnuddel(
    receivingUserOrAccount: KnuddelAccount,
    knuddelAmount: KnuddelAmount,
    parameters: DisplayReasonText
  ): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_transferKnuddel
  		 */
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount): Unit = js.native
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount, parameters: DisplayReasonText): Unit = js.native
}
