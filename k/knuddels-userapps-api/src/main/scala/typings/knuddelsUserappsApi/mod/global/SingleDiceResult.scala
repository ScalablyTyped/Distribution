package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/SingleDiceResult.html
	 */
@JSGlobal("SingleDiceResult")
@js.native
class SingleDiceResult () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/SingleDiceResult.html#method_getDice
  		 */
  def getDice(): Dice = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/SingleDiceResult.html#method_sum
  		 */
  def sum(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/SingleDiceResult.html#method_valuesRolled
  		 */
  def valuesRolled(): js.Array[Double] = js.native
}
