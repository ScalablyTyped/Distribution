package typings.intlMessageformatParser

import typings.intlMessageformatParser.typesMod.DateTimeSkeleton
import typings.intlMessageformatParser.typesMod.MessageFormatElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printerMod {
  
  @JSImport("intl-messageformat-parser/lib/src/printer", "doPrintAST")
  @js.native
  def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = js.native
  
  @JSImport("intl-messageformat-parser/lib/src/printer", "printAST")
  @js.native
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
  
  @JSImport("intl-messageformat-parser/lib/src/printer", "printDateTimeSkeleton")
  @js.native
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = js.native
}
