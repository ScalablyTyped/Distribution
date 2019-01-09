package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/BotUser.html
	 */
@JSGlobal("BotUser")
@js.native
class BotUser () extends User {
  def sendPostMessage(topic: java.lang.String, text: java.lang.String, receivingUser: User): scala.Unit = js.native
  def sendPrivateMessage(message: java.lang.String, users: js.Array[User]): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicActionMessage
  		 */
  def sendPublicActionMessage(actionMessage: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicMessage
  		 */
  def sendPublicMessage(message: java.lang.String): scala.Unit = js.native
  def transferKnuddel(receivingUserOrAccount: KnuddelAccount, knuddelAmount: KnuddelAmount): scala.Unit = js.native
  def transferKnuddel(
    receivingUserOrAccount: KnuddelAccount,
    knuddelAmount: KnuddelAmount,
    parameters: knuddelsDashUserappsDashApiLib.Anon_DisplayReasonText
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_transferKnuddel
  		 */
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount): scala.Unit = js.native
  def transferKnuddel(
    receivingUserOrAccount: User,
    knuddelAmount: KnuddelAmount,
    parameters: knuddelsDashUserappsDashApiLib.Anon_DisplayReasonText
  ): scala.Unit = js.native
}

