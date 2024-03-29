package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html
  */
@JSGlobal("DiceConfigurationFactory")
@js.native
open class DiceConfigurationFactory () extends StObject {
  
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
object DiceConfigurationFactory {
  
  @JSGlobal("DiceConfigurationFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/DiceConfigurationFactory.html#method_fromString
    */
  /* static member */
  inline def fromString(diceConfigurationString: java.lang.String): DiceConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(diceConfigurationString.asInstanceOf[js.Any]).asInstanceOf[DiceConfiguration]
}
