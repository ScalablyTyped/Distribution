package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  object Text {
    
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
    @JSImport("@jupyterlab/coreutils/lib/text", "Text.camelCase")
    @js.native
    def camelCase(str: String): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/text", "Text.camelCase")
    @js.native
    def camelCase(str: String, upper: Boolean): String = js.native
    
    /**
      * Convert a unicode character offset to a javascript string index.
      *
      * @param charIdx - The index in unicode characters
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The js-native index
      */
    @JSImport("@jupyterlab/coreutils/lib/text", "Text.charIndexToJsIndex")
    @js.native
    def charIndexToJsIndex(charIdx: Double, text: String): Double = js.native
    
    /**
      * Convert a javascript string index into a unicode character offset
      *
      * @param jsIdx - The javascript string index (counting surrogate pairs)
      *
      * @param text - The text in which the offset is calculated
      *
      * @returns The unicode character offset
      */
    @JSImport("@jupyterlab/coreutils/lib/text", "Text.jsIndexToCharIndex")
    @js.native
    def jsIndexToCharIndex(jsIdx: Double, text: String): Double = js.native
    
    /**
      * Given a string, title case the words in the string.
      *
      * @param str: the string to title case.
      *
      * @returns the same string, but with each word capitalized.
      */
    @JSImport("@jupyterlab/coreutils/lib/text", "Text.titleCase")
    @js.native
    def titleCase(str: String): String = js.native
  }
}
