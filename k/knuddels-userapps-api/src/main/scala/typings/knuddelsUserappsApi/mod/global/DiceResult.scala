package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/DiceResult.html
	 */
@JSGlobal("DiceResult")
@js.native
class DiceResult () extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceResult.html#method_getDiceConfiguration
  		 */
  def getDiceConfiguration(): DiceConfiguration = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceResult.html#method_getSingleDiceResults
  		 */
  def getSingleDiceResults(): js.Array[SingleDiceResult] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceResult.html#method_totalSum
  		 */
  def totalSum(): Double = js.native
}
