package typings.javascriptObfuscator

import typings.chance.Chance.Chance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/utils/IRandomGenerator", JSImport.Namespace)
@js.native
object irandomgeneratorMod extends js.Object {
  @js.native
  trait IRandomGenerator extends js.Object {
    /**
      * @returns {number}
      */
    def getMathRandom(): Double = js.native
    /**
      * @returns {Chance.Chance}
      */
    def getRandomGenerator(): Chance = js.native
    /**
      * @param min
      * @param max
      * @returns {number}
      */
    def getRandomInteger(min: Double, max: Double): Double = js.native
    /**
      * @param length
      * @param pool
      * @returns {string}
      */
    def getRandomString(length: Double): String = js.native
    def getRandomString(length: Double, pool: String): String = js.native
    /**
      * @returns {number}
      */
    def getSeed(): Double = js.native
  }
  
}

