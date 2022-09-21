package typings.hyperformula

import typings.hyperformula.addressRepresentationConvertersMod.SheetIndexMappingFn
import typings.hyperformula.astMod.Ast
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.lexerConfigMod.ILexerConfig
import typings.hyperformula.namedExpressionsMod.NamedExpressions
import typings.hyperformula.parserConfigMod.ParserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unparserMod {
  
  @JSImport("hyperformula/typings/parser/Unparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/parser/Unparser", "Unparser")
  @js.native
  open class Unparser protected () extends StObject {
    def this(
      config: ParserConfig,
      lexerConfig: ILexerConfig,
      sheetMappingFn: SheetIndexMappingFn,
      namedExpressions: NamedExpressions
    ) = this()
    
    /* private */ val config: Any = js.native
    
    /* private */ var formatRange: Any = js.native
    
    /* private */ val lexerConfig: Any = js.native
    
    /* private */ val namedExpressions: Any = js.native
    
    /* private */ val sheetMappingFn: Any = js.native
    
    def unparse(ast: Ast, address: SimpleCellAddress_): String = js.native
    
    /* private */ var unparseAst: Any = js.native
    
    /* private */ var unparseSheetName: Any = js.native
  }
  
  inline def formatNumber(number: Double, decimalSeparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], decimalSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
}
