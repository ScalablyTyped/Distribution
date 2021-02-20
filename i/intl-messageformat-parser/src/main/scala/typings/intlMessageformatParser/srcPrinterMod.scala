package typings.intlMessageformatParser

import typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPrinterMod {
  
  @JSImport("intl-messageformat-parser/src/printer", "doPrintAST")
  @js.native
  def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = js.native
  
  @JSImport("intl-messageformat-parser/src/printer", "printAST")
  @js.native
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
  
  @JSImport("intl-messageformat-parser/src/printer", "printDateTimeSkeleton")
  @js.native
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = js.native
}
