package typings.intlMessageformatParser

import typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intl-messageformat-parser/src/printer", JSImport.Namespace)
@js.native
object srcPrinterMod extends js.Object {
  
  def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = js.native
  
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
  
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = js.native
}
