package typings.hyperformula

import typings.hyperformula.cellContentParserMod.RawCellContent
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.cellValueMod.CellValue
import typings.hyperformula.configMod.Config
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.exporterMod.Exporter
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.namedExpressionsMod.NamedExpressionOptions
import typings.hyperformula.namedExpressionsMod.NamedExpressions
import typings.hyperformula.typingsParserMod.Unparser
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  @JSImport("hyperformula/typings/Serialization", "Serialization")
  @js.native
  open class Serialization protected () extends StObject {
    def this(dependencyGraph: DependencyGraph, unparser: Unparser, exporter: Exporter) = this()
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ val exporter: Any = js.native
    
    def genericAllSheetsGetter[T](sheetGetter: js.Function1[/* sheet */ Double, T]): Record[String, T] = js.native
    
    def genericSheetGetter[T](sheet: Double, getter: js.Function1[/* address */ SimpleCellAddress_, T]): js.Array[js.Array[T]] = js.native
    
    def getAllNamedExpressionsSerialized(): js.Array[SerializedNamedExpression] = js.native
    
    def getAllSheetsFormulas(): Record[String, js.Array[js.Array[Maybe[String]]]] = js.native
    
    def getAllSheetsSerialized(): Record[String, js.Array[js.Array[RawCellContent]]] = js.native
    
    def getAllSheetsValues(): Record[String, js.Array[js.Array[CellValue]]] = js.native
    
    def getCellFormula(address: SimpleCellAddress_): Maybe[String] = js.native
    def getCellFormula(address: SimpleCellAddress_, targetAddress: SimpleCellAddress_): Maybe[String] = js.native
    
    def getCellSerialized(address: SimpleCellAddress_): RawCellContent = js.native
    def getCellSerialized(address: SimpleCellAddress_, targetAddress: SimpleCellAddress_): RawCellContent = js.native
    
    def getCellValue(address: SimpleCellAddress_): CellValue = js.native
    
    def getRawValue(address: SimpleCellAddress_): RawCellContent = js.native
    
    def getSheetFormulas(sheet: Double): js.Array[js.Array[Maybe[String]]] = js.native
    
    def getSheetSerialized(sheet: Double): js.Array[js.Array[RawCellContent]] = js.native
    
    def getSheetValues(sheet: Double): js.Array[js.Array[CellValue]] = js.native
    
    /* private */ val unparser: Any = js.native
    
    def withNewConfig(newConfig: Config, namedExpressions: NamedExpressions): Serialization = js.native
  }
  
  trait SerializedNamedExpression extends StObject {
    
    var expression: RawCellContent
    
    var name: String
    
    var options: js.UndefOr[NamedExpressionOptions] = js.undefined
    
    var scope: js.UndefOr[Double] = js.undefined
  }
  object SerializedNamedExpression {
    
    inline def apply(name: String): SerializedNamedExpression = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedNamedExpression]
    }
    
    extension [Self <: SerializedNamedExpression](x: Self) {
      
      inline def setExpression(value: RawCellContent): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionNull: Self = StObject.set(x, "expression", null)
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: NamedExpressionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setScope(value: Double): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
