package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html
	 */
@JSGlobal("DiceConfigurationFactory")
@js.native
class DiceConfigurationFactory () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_addDice
  		 */
  def addDice(dice: Dice): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_computeCurrentDiceCount
  		 */
  def computeCurrentDiceCount(): Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_getDiceConfiguration
  		 */
  def getDiceConfiguration(): DiceConfiguration = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_setShouldUsePrivateThrow
  		 */
  def setShouldUsePrivateThrow(shouldUsePrivateThrow: Boolean): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_setUseOpenThrow
  		 */
  def setUseOpenThrow(shouldUseOpenThrow: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("DiceConfigurationFactory")
@js.native
object DiceConfigurationFactory extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_fromString
  		 */
  def fromString(diceConfigurationString: java.lang.String): DiceConfiguration = js.native
}

