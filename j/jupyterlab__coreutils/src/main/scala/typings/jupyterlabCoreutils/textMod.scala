package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  object Text {
    
    @JSImport("@jupyterlab/coreutils/lib/text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a 'snake-case', 'snake_case', 'snake:case', or
      * 'snake case' string, will return the camel case version: 'snakeCase'.
      *
      * @param str: the snake-case input string.
      *
      * @param upper: default = false. If true, the first letter of the
      * returned string will be capitalized.
      *
      * @returns the camel case version of the input string.
      */
    @scala.inline
    def camelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def camelCase(str: String, upper: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Convert a unicode character offset to a javascript string index.
      *
      * @param charIdx - The index in unicode characters
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The js-native index
      */
    @scala.inline
    def charIndexToJsIndex(charIdx: Double, text: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("charIndexToJsIndex")(charIdx.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Convert a javascript string index into a unicode character offset
      *
      * @param jsIdx - The javascript string index (counting surrogate pairs)
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The unicode character offset
      */
    @scala.inline
    def jsIndexToCharIndex(jsIdx: Double, text: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jsIndexToCharIndex")(jsIdx.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Given a string, title case the words in the string.
      *
      * @param str: the string to title case.
      *
      * @returns the same string, but with each word capitalized.
      */
    @scala.inline
    def titleCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
