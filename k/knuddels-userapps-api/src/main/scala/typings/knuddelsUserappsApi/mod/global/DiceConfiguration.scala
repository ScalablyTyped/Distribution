package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/DiceConfiguration.html
  */
@JSGlobal("DiceConfiguration")
@js.native
open class DiceConfiguration () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/DiceConfiguration.html#method_equals
    */
  def equals(diceConfiguration: DiceConfiguration): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/DiceConfiguration.html#method_getChatCommand
    * @since AppServer 82248
    */
  def getChatCommand(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/DiceConfiguration.html#method_getDices
    */
  def getDices(): js.Array[Dice] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/DiceConfiguration.html#method_isUsingOpenThrow
    */
  def isUsingOpenThrow(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/DiceConfiguration.html#method_isUsingPrivateThrow
    */
  def isUsingPrivateThrow(): Boolean = js.native
}
