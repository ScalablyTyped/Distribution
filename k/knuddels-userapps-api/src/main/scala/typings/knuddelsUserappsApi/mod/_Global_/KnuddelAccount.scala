package typings.knuddelsUserappsApi.mod._Global_

import typings.knuddelsUserappsApi.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html
	 */
@JSGlobal("KnuddelAccount")
@js.native
class KnuddelAccount () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_getKnuddelAmount
  		 */
  def getKnuddelAmount(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_getKnuddelAmountUnused
  		 */
  def getKnuddelAmountUnused(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_getKnuddelAmountUsed
  		 */
  def getKnuddelAmountUsed(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_getTotalKnuddelAmountAppToUser
  		 */
  def getTotalKnuddelAmountAppToUser(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_getTotalKnuddelAmountUserToApp
  		 */
  def getTotalKnuddelAmountUserToApp(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_getUser
  		 */
  def getUser(): User = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_hasEnough
  		 */
  def hasEnough(knuddelAmount: KnuddelAmount): Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAccount.html#method_use
  		 */
  def use(knuddelAmount: KnuddelAmount, displayReasonText: java.lang.String): Unit = js.native
  def use(knuddelAmount: KnuddelAmount, displayReasonText: java.lang.String, parameters: AnonMessage): Unit = js.native
}

