package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.transformerMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveCellsTransformerMod {
  
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
