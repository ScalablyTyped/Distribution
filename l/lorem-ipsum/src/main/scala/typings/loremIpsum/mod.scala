package typings.loremIpsum

import typings.loremIpsum.generatorMod.IGeneratorOptions
import typings.loremIpsum.generatorMod.IPrng
import typings.loremIpsum.loremIpsumMod.default
import typings.loremIpsum.loremIpsumStrings.html
import typings.loremIpsum.loremIpsumStrings.paragraph
import typings.loremIpsum.loremIpsumStrings.paragraphs
import typings.loremIpsum.loremIpsumStrings.plain
import typings.loremIpsum.loremIpsumStrings.sentence
import typings.loremIpsum.loremIpsumStrings.sentences
import typings.loremIpsum.loremIpsumStrings.word
import typings.loremIpsum.loremIpsumStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lorem-ipsum", "LoremIpsum")
  @js.native
  class LoremIpsum_ () extends default {
    def this(options: IGeneratorOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], format: String) = this()
    def this(options: IGeneratorOptions, format: String) = this()
    def this(options: js.UndefOr[scala.Nothing], format: js.UndefOr[scala.Nothing], suffix: String) = this()
    def this(options: js.UndefOr[scala.Nothing], format: String, suffix: String) = this()
    def this(options: IGeneratorOptions, format: js.UndefOr[scala.Nothing], suffix: String) = this()
    def this(options: IGeneratorOptions, format: String, suffix: String) = this()
  }
  
  @JSImport("lorem-ipsum", "loremIpsum")
  @js.native
  def loremIpsum(): String = js.native
  @JSImport("lorem-ipsum", "loremIpsum")
  @js.native
  def loremIpsum(
    hasCountFormatParagraphLowerBoundParagraphUpperBoundRandomSentenceLowerBoundSentenceUpperBoundUnitsWordsSuffix: ILoremIpsumParams
  ): String = js.native
  
  @js.native
  trait ILoremIpsumParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var format: js.UndefOr[plain | html] = js.native
    
    var paragraphLowerBound: js.UndefOr[Double] = js.native
    
    var paragraphUpperBound: js.UndefOr[Double] = js.native
    
    var random: js.UndefOr[IPrng] = js.native
    
    var sentenceLowerBound: js.UndefOr[Double] = js.native
    
    var sentenceUpperBound: js.UndefOr[Double] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var units: js.UndefOr[words | word | sentences | sentence | paragraphs | paragraph] = js.native
    
    var words: js.UndefOr[js.Array[String]] = js.native
  }
  object ILoremIpsumParams {
    
    @scala.inline
    def apply(): ILoremIpsumParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILoremIpsumParams]
    }
    
    @scala.inline
    implicit class ILoremIpsumParamsMutableBuilder[Self <: ILoremIpsumParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setFormat(value: plain | html): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setParagraphLowerBound(value: Double): Self = StObject.set(x, "paragraphLowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphLowerBoundUndefined: Self = StObject.set(x, "paragraphLowerBound", js.undefined)
      
      @scala.inline
      def setParagraphUpperBound(value: Double): Self = StObject.set(x, "paragraphUpperBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphUpperBoundUndefined: Self = StObject.set(x, "paragraphUpperBound", js.undefined)
      
      @scala.inline
      def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setSentenceLowerBound(value: Double): Self = StObject.set(x, "sentenceLowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentenceLowerBoundUndefined: Self = StObject.set(x, "sentenceLowerBound", js.undefined)
      
      @scala.inline
      def setSentenceUpperBound(value: Double): Self = StObject.set(x, "sentenceUpperBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentenceUpperBoundUndefined: Self = StObject.set(x, "sentenceUpperBound", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setUnits(value: words | word | sentences | sentence | paragraphs | paragraph): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
      
      @scala.inline
      def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
}
