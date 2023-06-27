package typings.graphemer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphemerHelperMod {
  
  @JSImport("graphemer/lib/GraphemerHelper", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GraphemerHelper
  object default {
    
    @JSImport("graphemer/lib/GraphemerHelper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The String.prototype.codePointAt polyfill
      * Private function, gets a Unicode code point from a JavaScript UTF-16 string
      * handling surrogate pairs appropriately
      * @param str {string}
      * @param idx {number}
      * @returns {number}
      */
    /* static member */
    inline def codePointAt(str: String, idx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("codePointAt")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Check if the the character at the position {pos} of the string is surrogate
      * @param str {string}
      * @param pos {number}
      * @returns {boolean}
      */
    /* static member */
    inline def isSurrogate(str: String, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSurrogate")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Private function, returns whether a break is allowed between the two given grapheme breaking classes
      * Implemented the UAX #29 3.1.1 Grapheme Cluster Boundary Rules on extended grapheme clusters
      * @param start {number}
      * @param mid {Array<number>}
      * @param end {number}
      * @param startEmoji {number}
      * @param midEmoji {Array<number>}
      * @param endEmoji {number}
      * @returns {number}
      */
    /* static member */
    inline def shouldBreak(
      start: Double,
      mid: js.Array[Double],
      end: Double,
      startEmoji: Double,
      midEmoji: js.Array[Double],
      endEmoji: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldBreak")(start.asInstanceOf[js.Any], mid.asInstanceOf[js.Any], end.asInstanceOf[js.Any], startEmoji.asInstanceOf[js.Any], midEmoji.asInstanceOf[js.Any], endEmoji.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait GraphemerHelper extends StObject
}
