package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/Dice.html
  */
@JSGlobal("Dice")
@js.native
open class Dice protected () extends StObject {
  /**
    * @see https://developer.knuddels.de/docs/classes/Dice.html#method_Dice
    */
  def this(count: Double, value: Double) = this()
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Dice.html#method_getAmount
    */
  def getAmount(): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Dice.html#method_getNumberOfSides
    */
  def getNumberOfSides(): Double = js.native
}
