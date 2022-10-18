package typings.hyperformula

import typings.hyperformula.typingsDependencyTransformersTransformerMod.Transformer
import typings.hyperformula.typingsSpanMod.RowsSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyTransformersRemoveRowsTransformerMod {
  
  @JSImport("hyperformula/typings/dependencyTransformers/RemoveRowsTransformer", "RemoveRowsTransformer")
  @js.native
  open class RemoveRowsTransformer protected () extends Transformer {
    def this(rowsSpan: RowsSpan) = this()
    
    val rowsSpan: RowsSpan = js.native
    
    @JSName("sheet")
    def sheet_MRemoveRowsTransformer: Double = js.native
    
    /* private */ var transformRange: Any = js.native
  }
}
