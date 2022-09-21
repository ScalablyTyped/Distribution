package typings.markdownEscape

import typings.markdownEscape.markdownEscapeStrings.`angle brackets`
import typings.markdownEscape.markdownEscapeStrings.`number signs`
import typings.markdownEscape.markdownEscapeStrings.`square brackets`
import typings.markdownEscape.markdownEscapeStrings.asterisks
import typings.markdownEscape.markdownEscapeStrings.parentheses
import typings.markdownEscape.markdownEscapeStrings.slashes
import typings.markdownEscape.markdownEscapeStrings.underscores
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(string: String, skips: js.Array[CharacterSet]): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], skips.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("markdown-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CharacterSet = /* import warning: importer.ImportType#apply Failed type conversion: markdown-escape.markdown-escape.CharacterSets[number] */ js.Any
  
  type CharacterSets = js.Tuple10[
    asterisks, 
    `number signs`, 
    slashes, 
    parentheses, 
    parentheses, 
    `square brackets`, 
    `square brackets`, 
    `angle brackets`, 
    `angle brackets`, 
    underscores
  ]
}
