package typings.graphemer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphemerMod {
  
  @JSImport("graphemer/lib/Graphemer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Graphemer {
    
    /**
      * Returns the number of grapheme clusters in the given string
      * @param str {string}
      * @returns {number}
      */
    /* CompleteClass */
    override def countGraphemes(str: String): Double = js.native
    
    /**
      * Returns an iterator of grapheme clusters in the given string
      * @param str {string}
      * @returns {GraphemerIterator}
      */
    /* CompleteClass */
    override def iterateGraphemes(str: String): typings.graphemer.libGraphemerIteratorMod.default = js.native
    
    /**
      * Breaks the given string into an array of grapheme clusters
      * @param str {string}
      * @returns {string[]}
      */
    /* CompleteClass */
    override def splitGraphemes(str: String): js.Array[String] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("graphemer/lib/Graphemer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a Unicode code point, returns if symbol is an extended pictographic or some other break
      * @param code {number} Unicode code point
      * @returns {number}
      */
    inline def getEmojiProperty(code: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmojiProperty")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Given a Unicode code point, determines this symbol's grapheme break property
      * @param code {number} Unicode code point
      * @returns {number}
      */
    inline def getGraphemeBreakProperty(code: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGraphemeBreakProperty")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the next grapheme break in the string after the given index
      * @param string {string}
      * @param index {number}
      * @returns {number}
      */
    inline def nextBreak(string: String, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nextBreak")(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait Graphemer extends StObject {
    
    /**
      * Returns the number of grapheme clusters in the given string
      * @param str {string}
      * @returns {number}
      */
    def countGraphemes(str: String): Double
    
    /**
      * Returns an iterator of grapheme clusters in the given string
      * @param str {string}
      * @returns {GraphemerIterator}
      */
    def iterateGraphemes(str: String): typings.graphemer.libGraphemerIteratorMod.default
    
    /**
      * Breaks the given string into an array of grapheme clusters
      * @param str {string}
      * @returns {string[]}
      */
    def splitGraphemes(str: String): js.Array[String]
  }
  object Graphemer {
    
    inline def apply(
      countGraphemes: String => Double,
      iterateGraphemes: String => typings.graphemer.libGraphemerIteratorMod.default,
      splitGraphemes: String => js.Array[String]
    ): Graphemer = {
      val __obj = js.Dynamic.literal(countGraphemes = js.Any.fromFunction1(countGraphemes), iterateGraphemes = js.Any.fromFunction1(iterateGraphemes), splitGraphemes = js.Any.fromFunction1(splitGraphemes))
      __obj.asInstanceOf[Graphemer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Graphemer] (val x: Self) extends AnyVal {
      
      inline def setCountGraphemes(value: String => Double): Self = StObject.set(x, "countGraphemes", js.Any.fromFunction1(value))
      
      inline def setIterateGraphemes(value: String => typings.graphemer.libGraphemerIteratorMod.default): Self = StObject.set(x, "iterateGraphemes", js.Any.fromFunction1(value))
      
      inline def setSplitGraphemes(value: String => js.Array[String]): Self = StObject.set(x, "splitGraphemes", js.Any.fromFunction1(value))
    }
  }
}
