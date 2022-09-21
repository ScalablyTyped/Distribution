package typings.hyperformula

import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.interpreterValueMod.EmptyValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyCellVertexMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/EmptyCellVertex", "EmptyCellVertex")
  @js.native
  open class EmptyCellVertex protected () extends StObject {
    def this(address: SimpleCellAddress_) = this()
    
    var address: SimpleCellAddress_ = js.native
    
    /**
      * Retrieves cell value bound to that singleton
      */
    def getCellValue(): EmptyValueType = js.native
  }
}
