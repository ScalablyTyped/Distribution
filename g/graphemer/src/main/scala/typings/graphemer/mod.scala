package typings.graphemer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphemer", JSImport.Default)
  @js.native
  open class default ()
    extends typings.graphemer.libGraphemerMod.default
  /* static members */
  object default {
    
    @JSImport("graphemer", JSImport.Default)
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
}
