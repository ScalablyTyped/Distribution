package typings.loremIpsum

import typings.loremIpsum.generatorMod.IGeneratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loremIpsumMod {
  
  @JSImport("lorem-ipsum/types/src/lib/LoremIpsum", JSImport.Default)
  @js.native
  class default () extends LoremIpsum {
    def this(options: IGeneratorOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], format: String) = this()
    def this(options: IGeneratorOptions, format: String) = this()
    def this(options: js.UndefOr[scala.Nothing], format: js.UndefOr[scala.Nothing], suffix: String) = this()
    def this(options: js.UndefOr[scala.Nothing], format: String, suffix: String) = this()
    def this(options: IGeneratorOptions, format: js.UndefOr[scala.Nothing], suffix: String) = this()
    def this(options: IGeneratorOptions, format: String, suffix: String) = this()
  }
  
  @js.native
  trait LoremIpsum extends StObject {
    
    var format: String = js.native
    
    def formatString(str: String): String = js.native
    
    def formatStrings(strings: js.Array[String]): js.Array[String] = js.native
    
    def generateParagraphs(num: Double): String = js.native
    
    def generateSentences(): String = js.native
    def generateSentences(num: Double): String = js.native
    
    def generateWords(): String = js.native
    def generateWords(num: Double): String = js.native
    
    var generator: typings.loremIpsum.generatorMod.default = js.native
    
    def getLineEnding(): String = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
}
