package typings.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generator extends js.Object {
  
  def generateRandomInteger(min: Double, max: Double): Double = js.native
  
  def generateRandomParagraph(): String = js.native
  def generateRandomParagraph(num: Double): String = js.native
  
  def generateRandomSentence(): String = js.native
  def generateRandomSentence(num: Double): String = js.native
  
  def generateRandomWords(): String = js.native
  def generateRandomWords(num: Double): String = js.native
  
  def pluckRandomWord(): String = js.native
  
  def random(): Double = js.native
  @JSName("random")
  var random_Original: IPrng = js.native
  
  var sentencesPerParagraph: IBounds = js.native
  
  var words: js.Array[String] = js.native
  
  var wordsPerSentence: IBounds = js.native
}
