package typings.hyperformula

import typings.hyperformula.anon.Expression
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsParserAstMod.Ast
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsNamedExpressionsMod {
  
  @JSImport("hyperformula/typings/NamedExpressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/NamedExpressions", "InternalNamedExpression")
  @js.native
  open class InternalNamedExpression protected () extends StObject {
    def this(displayName: String, address: SimpleCellAddress_, added: Boolean) = this()
    def this(
      displayName: String,
      address: SimpleCellAddress_,
      added: Boolean,
      options: Record[String, String | Double | Boolean]
    ) = this()
    
    var added: Boolean = js.native
    
    val address: SimpleCellAddress_ = js.native
    
    def copy(): InternalNamedExpression = js.native
    
    var displayName: String = js.native
    
    def normalizeExpressionName(): String = js.native
    
    var options: js.UndefOr[Record[String, String | Double | Boolean]] = js.native
  }
  
  @JSImport("hyperformula/typings/NamedExpressions", "NamedExpressions")
  @js.native
  open class NamedExpressions () extends StObject {
    
    def addNamedExpression(expressionName: String): InternalNamedExpression = js.native
    def addNamedExpression(expressionName: String, sheetId: Double): InternalNamedExpression = js.native
    def addNamedExpression(expressionName: String, sheetId: Double, options: NamedExpressionOptions): InternalNamedExpression = js.native
    def addNamedExpression(expressionName: String, sheetId: Unit, options: NamedExpressionOptions): InternalNamedExpression = js.native
    
    /* private */ val addressCache: Any = js.native
    
    def getAllNamedExpressions(): js.Array[Expression] = js.native
    
    def getAllNamedExpressionsForScope(): js.Array[InternalNamedExpression] = js.native
    def getAllNamedExpressionsForScope(scope: Double): js.Array[InternalNamedExpression] = js.native
    
    def getAllNamedExpressionsNames(): js.Array[String] = js.native
    
    def getAllNamedExpressionsNamesInScope(): js.Array[String] = js.native
    def getAllNamedExpressionsNamesInScope(sheetId: Double): js.Array[String] = js.native
    
    def isExpressionInScope(expressionName: String, sheetId: Double): Boolean = js.native
    
    def isNameAvailable(expressionName: String): Boolean = js.native
    def isNameAvailable(expressionName: String, sheetId: Double): Boolean = js.native
    
    def isNameValid(expressionName: String): Boolean = js.native
    
    def namedExpressionForScope(expressionName: String): Maybe[InternalNamedExpression] = js.native
    def namedExpressionForScope(expressionName: String, sheetId: Double): Maybe[InternalNamedExpression] = js.native
    
    def namedExpressionInAddress(row: Double): Maybe[InternalNamedExpression] = js.native
    
    def namedExpressionOrPlaceholder(expressionName: String, sheetId: Double): InternalNamedExpression = js.native
    
    def nearestNamedExpression(expressionName: String, sheetId: Double): Maybe[InternalNamedExpression] = js.native
    
    /* private */ var nextAddress: Any = js.native
    
    /* private */ var nextNamedExpressionRow: Any = js.native
    
    def remove(expressionName: String): Unit = js.native
    def remove(expressionName: String, sheetId: Double): Unit = js.native
    
    def restoreNamedExpression(namedExpression: InternalNamedExpression): InternalNamedExpression = js.native
    def restoreNamedExpression(namedExpression: InternalNamedExpression, sheetId: Double): InternalNamedExpression = js.native
    
    def workbookNamedExpressionOrPlaceholder(expressionName: String): InternalNamedExpression = js.native
    
    /* private */ val workbookStore: Any = js.native
    
    /* private */ var worksheetStore: Any = js.native
    
    /* private */ var worksheetStoreOrCreate: Any = js.native
    
    /* private */ val worksheetStores: Any = js.native
  }
  /* static members */
  object NamedExpressions {
    
    @JSImport("hyperformula/typings/NamedExpressions", "NamedExpressions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/NamedExpressions", "NamedExpressions.SHEET_FOR_WORKBOOK_EXPRESSIONS")
    @js.native
    def SHEET_FOR_WORKBOOK_EXPRESSIONS: Double = js.native
    inline def SHEET_FOR_WORKBOOK_EXPRESSIONS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHEET_FOR_WORKBOOK_EXPRESSIONS")(x.asInstanceOf[js.Any])
  }
  
  inline def doesContainRelativeReferences(ast: Ast): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doesContainRelativeReferences")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait NamedExpression extends StObject {
    
    var expression: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var options: js.UndefOr[NamedExpressionOptions] = js.undefined
    
    var scope: js.UndefOr[Double] = js.undefined
  }
  object NamedExpression {
    
    inline def apply(name: String): NamedExpression = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedExpression]
    }
    
    extension [Self <: NamedExpression](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: NamedExpressionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setScope(value: Double): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type NamedExpressionOptions = Record[String, String | Double | Boolean]
}
