package typings.loremIpsum

import typings.loremIpsum.typesSrcConstantsFormatsMod.LoremFormat
import typings.loremIpsum.typesSrcConstantsUnitsMod.LoremUnit
import typings.loremIpsum.typesSrcLibGeneratorMod.IGeneratorOptions
import typings.loremIpsum.typesSrcLibGeneratorMod.IPrng
import typings.loremIpsum.typesSrcLibLoremIpsumMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lorem-ipsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lorem-ipsum", "LoremIpsum")
  @js.native
  open class LoremIpsum_ () extends default {
    def this(options: IGeneratorOptions) = this()
    def this(options: Unit, format: LoremFormat) = this()
    def this(options: IGeneratorOptions, format: LoremFormat) = this()
    def this(options: Unit, format: Unit, suffix: String) = this()
    def this(options: Unit, format: LoremFormat, suffix: String) = this()
    def this(options: IGeneratorOptions, format: Unit, suffix: String) = this()
    def this(options: IGeneratorOptions, format: LoremFormat, suffix: String) = this()
  }
  
  inline def loremIpsum(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loremIpsum")().asInstanceOf[String]
  inline def loremIpsum(param0: ILoremIpsumParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loremIpsum")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ILoremIpsumParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[LoremFormat] = js.undefined
    
    var paragraphLowerBound: js.UndefOr[Double] = js.undefined
    
    var paragraphUpperBound: js.UndefOr[Double] = js.undefined
    
    var random: js.UndefOr[IPrng] = js.undefined
    
    var sentenceLowerBound: js.UndefOr[Double] = js.undefined
    
    var sentenceUpperBound: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var units: js.UndefOr[LoremUnit] = js.undefined
    
    var words: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ILoremIpsumParams {
    
    inline def apply(): ILoremIpsumParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILoremIpsumParams]
    }
    
    extension [Self <: ILoremIpsumParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFormat(value: LoremFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setParagraphLowerBound(value: Double): Self = StObject.set(x, "paragraphLowerBound", value.asInstanceOf[js.Any])
      
      inline def setParagraphLowerBoundUndefined: Self = StObject.set(x, "paragraphLowerBound", js.undefined)
      
      inline def setParagraphUpperBound(value: Double): Self = StObject.set(x, "paragraphUpperBound", value.asInstanceOf[js.Any])
      
      inline def setParagraphUpperBoundUndefined: Self = StObject.set(x, "paragraphUpperBound", js.undefined)
      
      inline def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setSentenceLowerBound(value: Double): Self = StObject.set(x, "sentenceLowerBound", value.asInstanceOf[js.Any])
      
      inline def setSentenceLowerBoundUndefined: Self = StObject.set(x, "sentenceLowerBound", js.undefined)
      
      inline def setSentenceUpperBound(value: Double): Self = StObject.set(x, "sentenceUpperBound", value.asInstanceOf[js.Any])
      
      inline def setSentenceUpperBoundUndefined: Self = StObject.set(x, "sentenceUpperBound", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setUnits(value: LoremUnit): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
      
      inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
}
