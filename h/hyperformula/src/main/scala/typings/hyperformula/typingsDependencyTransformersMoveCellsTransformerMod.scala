package typings.hyperformula

import typings.hyperformula.hyperformulaBooleans.`false`
import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsDependencyTransformersTransformerMod.Transformer
import typings.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typings.hyperformula.typingsParserMod.CellAddress
import typings.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyTransformersMoveCellsTransformerMod {
  
  @JSImport("hyperformula/typings/dependencyTransformers/MoveCellsTransformer", "DependentFormulaTransformer")
  @js.native
  open class DependentFormulaTransformer protected () extends Transformer {
    def this(sourceRange: AbsoluteCellRange, toRight: Double, toBottom: Double, toSheet: Double) = this()
    
    @JSName("sheet")
    def sheet_MDependentFormulaTransformer: Double = js.native
    
    /* private */ var shouldMove: Any = js.native
    
    val sourceRange: AbsoluteCellRange = js.native
    
    val toBottom: Double = js.native
    
    val toRight: Double = js.native
    
    val toSheet: Double = js.native
    
    /* protected */ def transformCellAddress(dependencyAddress: ColumnAddress, formulaAddress: SimpleCellAddress_): ColumnAddress | `false` = js.native
    /* protected */ def transformCellAddress(dependencyAddress: CellAddress, formulaAddress: SimpleCellAddress_): CellAddress | `false` = js.native
    /* protected */ def transformCellAddress(dependencyAddress: RowAddress, formulaAddress: SimpleCellAddress_): RowAddress | `false` = js.native
    
    /* private */ var transformRange: Any = js.native
  }
  
  @JSImport("hyperformula/typings/dependencyTransformers/MoveCellsTransformer", "MoveCellsTransformer")
  @js.native
  open class MoveCellsTransformer protected () extends Transformer {
    def this(sourceRange: AbsoluteCellRange, toRight: Double, toBottom: Double, toSheet: Double) = this()
    
    /* private */ var dependentFormulaTransformer: Any = js.native
    
    @JSName("sheet")
    def sheet_MMoveCellsTransformer: Double = js.native
    
    val sourceRange: AbsoluteCellRange = js.native
    
    val toBottom: Double = js.native
    
    val toRight: Double = js.native
    
    val toSheet: Double = js.native
    
    /* private */ var transformAddress: Any = js.native
    
    /* private */ var transformRange: Any = js.native
  }
}
