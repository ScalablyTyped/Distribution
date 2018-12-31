package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html
	 */
@JSGlobal("KnuddelPot")
@js.native
class KnuddelPot () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_addWinner
  		 */
  def addWinner(user: User): scala.Unit = js.native
  def addWinner(user: User, weight: scala.Double): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getFeeMultiplier
  		 */
  def getFeeMultiplier(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getFeeUser
  		 */
  def getFeeUser(): User = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getId
  		 */
  def getId(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getKnuddelAmountPerParticipant
  		 */
  def getKnuddelAmountPerParticipant(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getKnuddelAmountTotal
  		 */
  def getKnuddelAmountTotal(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getMaxFeeMultiplier
  		 */
  def getMaxFeeMultiplier(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getParticipants
  		 */
  def getParticipants(): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_getState
  		 */
  def getState(): KnuddelPotState = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_payout
  		 */
  def payout(): scala.Unit = js.native
  def payout(text: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_refund
  		 */
  def refund(): scala.Unit = js.native
  def refund(reason: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_seal
  		 */
  def seal(): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelPot.html#method_setFee
  		 */
  def setFee(feeUser: BotUser, feeMultiplier: scala.Double): scala.Unit = js.native
}

