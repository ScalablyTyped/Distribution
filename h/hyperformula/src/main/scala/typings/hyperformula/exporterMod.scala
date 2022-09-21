package typings.hyperformula

import typings.hyperformula.addressRepresentationConvertersMod.SheetIndexMappingFn
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.cellValueMod.CellValue
import typings.hyperformula.configMod.Config
import typings.hyperformula.contentChangesMod.CellValueChange
import typings.hyperformula.contentChangesMod.ChangeExporter
import typings.hyperformula.interpreterValueMod.InterpreterValue
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.namedExpressionsMod.NamedExpressions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporterMod {
  
  @JSImport("hyperformula/typings/Exporter", "ExportedCellChange")
  @js.native
  open class ExportedCellChange protected ()
    extends StObject
       with ExportedChange {
    def this(address: SimpleCellAddress_, newValue: CellValue) = this()
    
    val address: SimpleCellAddress_ = js.native
    
    def col: Double = js.native
    
    val newValue: CellValue = js.native
    
    def row: Double = js.native
    
    def sheet: Double = js.native
    
    def value: CellValue = js.native
  }
  
  @JSImport("hyperformula/typings/Exporter", "ExportedNamedExpressionChange")
  @js.native
  open class ExportedNamedExpressionChange protected ()
    extends StObject
       with ExportedChange {
    def this(name: String, newValue: js.Array[js.Array[CellValue]]) = this()
    def this(name: String, newValue: CellValue) = this()
    
    val name: String = js.native
    
    val newValue: CellValue | js.Array[js.Array[CellValue]] = js.native
  }
  
  @JSImport("hyperformula/typings/Exporter", "Exporter")
  @js.native
  open class Exporter protected ()
    extends StObject
       with ChangeExporter[ExportedChange] {
    def this(
      config: Config,
      namedExpressions: NamedExpressions,
      sheetIndexMapping: SheetIndexMappingFn,
      lazilyTransformingService: LazilyTransformingAstService
    ) = this()
    
    /* private */ var cellValueRounding: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var detailedError: Any = js.native
    
    /* CompleteClass */
    override def exportChange(arg: CellValueChange): ExportedChange | js.Array[ExportedChange] = js.native
    
    def exportScalarOrRange(value: InterpreterValue): CellValue | js.Array[js.Array[CellValue]] = js.native
    
    def exportValue(value: InterpreterValue): CellValue = js.native
    
    /* private */ val lazilyTransformingService: Any = js.native
    
    /* private */ val namedExpressions: Any = js.native
    
    /* private */ val sheetIndexMapping: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperformula.exporterMod.ExportedCellChange
    - typings.hyperformula.exporterMod.ExportedNamedExpressionChange
  */
  trait ExportedChange extends StObject
}
