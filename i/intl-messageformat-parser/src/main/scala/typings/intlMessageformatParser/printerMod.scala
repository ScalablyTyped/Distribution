package typings.intlMessageformatParser

import typings.intlMessageformatParser.typesMod.DateTimeSkeleton
import typings.intlMessageformatParser.typesMod.MessageFormatElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printerMod {
  
  @JSImport("intl-messageformat-parser/lib/src/printer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doPrintAST")(ast.asInstanceOf[js.Any], isInPlural.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printAST(ast: js.Array[MessageFormatElement]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printAST")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printDateTimeSkeleton")(style.asInstanceOf[js.Any]).asInstanceOf[String]
}
