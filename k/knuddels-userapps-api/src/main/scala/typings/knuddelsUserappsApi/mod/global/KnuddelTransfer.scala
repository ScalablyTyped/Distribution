package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html
	 */
@JSGlobal("KnuddelTransfer")
@js.native
class KnuddelTransfer () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_accept
  		 */
  def accept(): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_addToPot
  		 */
  def addToPot(knuddelPot: KnuddelPot): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_canAddToPot
  		 */
  def canAddToPot(pot: KnuddelPot): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_getKnuddelAmount
  		 */
  def getKnuddelAmount(): KnuddelAmount = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_getReceiver
  		 */
  def getReceiver(): BotUser = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_getSender
  		 */
  def getSender(): User = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_getTransferReason
  		 */
  def getTransferReason(): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_isProcessed
  		 */
  def isProcessed(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelTransfer.html#method_reject
  		 */
  def reject(reason: java.lang.String): Unit = js.native
}
