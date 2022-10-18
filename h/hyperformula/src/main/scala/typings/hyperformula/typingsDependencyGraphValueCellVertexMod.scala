package typings.hyperformula

import typings.hyperformula.typingsCellContentParserMod.RawCellContent
import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsInterpreterInterpreterValueMod.ExtendedNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphValueCellVertexMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/ValueCellVertex", "ValueCellVertex")
  @js.native
  open class ValueCellVertex protected () extends StObject {
    /** Static cell value. */
    def this(parsedValue: ValueCellVertexValue, rawValue: RawCellContent) = this()
    
    /**
      * Returns cell value stored in vertex
      */
    def getCellValue(): ValueCellVertexValue = js.native
    
    def getValues(): RawAndParsedValue = js.native
    
    /* private */ var parsedValue: Any = js.native
    
    /* private */ var rawValue: Any = js.native
    
    def setCellValue(_cellValue: ValueCellVertexValue): scala.Nothing = js.native
    
    def setValues(values: RawAndParsedValue): Unit = js.native
  }
  
  trait RawAndParsedValue extends StObject {
    
    var parsedValue: ValueCellVertexValue
    
    var rawValue: RawCellContent
  }
  object RawAndParsedValue {
    
    inline def apply(parsedValue: ValueCellVertexValue): RawAndParsedValue = {
      val __obj = js.Dynamic.literal(parsedValue = parsedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawAndParsedValue]
    }
    
    extension [Self <: RawAndParsedValue](x: Self) {
      
      inline def setParsedValue(value: ValueCellVertexValue): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
      
      inline def setRawValue(value: RawCellContent): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      inline def setRawValueNull: Self = StObject.set(x, "rawValue", null)
      
      inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    }
  }
  
  type ValueCellVertexValue = ExtendedNumber | Boolean | String | CellError
}
