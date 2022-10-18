package typings.hyperformula

import typings.hyperformula.typingsCellContentParserMod.CellContent.Type
import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsCellMod.ErrorType
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsDateTimeHelperMod.DateTimeHelper
import typings.hyperformula.typingsInterpreterInterpreterValueMod.ExtendedNumber
import typings.hyperformula.typingsNumberLiteralHelperMod.NumberLiteralHelper
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsCellContentParserMod {
  
  @JSImport("hyperformula/typings/CellContentParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CellContent {
    
    @JSImport("hyperformula/typings/CellContentParser", "CellContent.Boolean")
    @js.native
    open class Boolean protected ()
      extends StObject
         with Type {
      def this(value: scala.Boolean) = this()
      
      val value: scala.Boolean = js.native
    }
    
    @JSImport("hyperformula/typings/CellContentParser", "CellContent.Empty")
    @js.native
    open class Empty ()
      extends StObject
         with Type
    object Empty {
      
      @JSImport("hyperformula/typings/CellContentParser", "CellContent.Empty")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def getSingletonInstance(): Empty = ^.asInstanceOf[js.Dynamic].applyDynamic("getSingletonInstance")().asInstanceOf[Empty]
      
      /* static member */
      @JSImport("hyperformula/typings/CellContentParser", "CellContent.Empty.instance")
      @js.native
      def instance: Any = js.native
      inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("hyperformula/typings/CellContentParser", "CellContent.Error")
    @js.native
    open class Error protected ()
      extends StObject
         with Type {
      def this(errorType: ErrorType) = this()
      def this(errorType: ErrorType, message: java.lang.String) = this()
      
      val value: CellError = js.native
    }
    
    @JSImport("hyperformula/typings/CellContentParser", "CellContent.Formula")
    @js.native
    open class Formula protected ()
      extends StObject
         with Type {
      def this(formula: java.lang.String) = this()
      
      val formula: java.lang.String = js.native
    }
    
    @JSImport("hyperformula/typings/CellContentParser", "CellContent.Number")
    @js.native
    open class Number protected ()
      extends StObject
         with Type {
      def this(value: ExtendedNumber) = this()
      
      val value: ExtendedNumber = js.native
    }
    
    @JSImport("hyperformula/typings/CellContentParser", "CellContent.String")
    @js.native
    open class String protected ()
      extends StObject
         with Type {
      def this(value: java.lang.String) = this()
      
      val value: java.lang.String = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.hyperformula.typingsCellContentParserMod.CellContent.Number
      - typings.hyperformula.typingsCellContentParserMod.CellContent.String
      - typings.hyperformula.typingsCellContentParserMod.CellContent.Boolean
      - typings.hyperformula.typingsCellContentParserMod.CellContent.Empty
      - typings.hyperformula.typingsCellContentParserMod.CellContent.Formula
      - typings.hyperformula.typingsCellContentParserMod.CellContent.Error
    */
    trait Type extends StObject
  }
  
  @JSImport("hyperformula/typings/CellContentParser", "CellContentParser")
  @js.native
  open class CellContentParser protected () extends StObject {
    def this(config: Config, dateHelper: DateTimeHelper, numberLiteralsHelper: NumberLiteralHelper) = this()
    
    /* private */ val config: Any = js.native
    
    /* private */ var currencyMatcher: Any = js.native
    
    /* private */ val dateHelper: Any = js.native
    
    /* private */ val numberLiteralsHelper: Any = js.native
    
    def parse(content: RawCellContent): Type = js.native
  }
  
  inline def isBoolean(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isError(text: String, errorMapping: Record[String, ErrorType]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isError")(text.asInstanceOf[js.Any], errorMapping.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFormula(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormula")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type RawCellContent = js.UndefOr[js.Date | String | Double | Boolean | Null]
}
