package typings.loremIpsum

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorMod {
  
  @JSImport("lorem-ipsum/types/src/lib/generator", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Generator {
    def this(hasSentencesPerParagraphWordsPerSentenceRandomSeedWords: IGeneratorOptions) = this()
  }
  
  @js.native
  trait Generator extends StObject {
    
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
  
  trait IBounds extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object IBounds {
    
    @scala.inline
    def apply(max: Double, min: Double): IBounds = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBounds]
    }
    
    @scala.inline
    implicit class IBoundsMutableBuilder[Self <: IBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGeneratorOptions extends StObject {
    
    var random: js.UndefOr[IPrng] = js.undefined
    
    var seed: js.UndefOr[String] = js.undefined
    
    var sentencesPerParagraph: js.UndefOr[IBounds] = js.undefined
    
    var words: js.UndefOr[js.Array[String]] = js.undefined
    
    var wordsPerSentence: js.UndefOr[IBounds] = js.undefined
  }
  object IGeneratorOptions {
    
    @scala.inline
    def apply(): IGeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGeneratorOptions]
    }
    
    @scala.inline
    implicit class IGeneratorOptionsMutableBuilder[Self <: IGeneratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSentencesPerParagraph(value: IBounds): Self = StObject.set(x, "sentencesPerParagraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentencesPerParagraphUndefined: Self = StObject.set(x, "sentencesPerParagraph", js.undefined)
      
      @scala.inline
      def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsPerSentence(value: IBounds): Self = StObject.set(x, "wordsPerSentence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsPerSentenceUndefined: Self = StObject.set(x, "wordsPerSentence", js.undefined)
      
      @scala.inline
      def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
      
      @scala.inline
      def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
  
  trait IMath extends StObject {
    
    var seedrandom: ISeedRandom
  }
  object IMath {
    
    @scala.inline
    def apply(seedrandom: ISeedRandom): IMath = {
      val __obj = js.Dynamic.literal(seedrandom = seedrandom.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMath]
    }
    
    @scala.inline
    implicit class IMathMutableBuilder[Self <: IMath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeedrandom(value: ISeedRandom): Self = StObject.set(x, "seedrandom", value.asInstanceOf[js.Any])
    }
  }
  
  type IPrng = js.Function0[Double]
  
  type ISeedRandom = Instantiable1[/* seed */ js.UndefOr[String], IPrng]
}
