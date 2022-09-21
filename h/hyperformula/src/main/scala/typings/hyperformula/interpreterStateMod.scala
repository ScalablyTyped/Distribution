package typings.hyperformula

import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.formulaCellVertexMod.FormulaVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpreterStateMod {
  
  @JSImport("hyperformula/typings/interpreter/InterpreterState", "InterpreterState")
  @js.native
  open class InterpreterState protected () extends StObject {
    def this(formulaAddress: SimpleCellAddress_, arraysFlag: Boolean) = this()
    def this(formulaAddress: SimpleCellAddress_, arraysFlag: Boolean, formulaVertex: FormulaVertex) = this()
    
    var arraysFlag: Boolean = js.native
    
    var formulaAddress: SimpleCellAddress_ = js.native
    
    var formulaVertex: js.UndefOr[FormulaVertex] = js.native
  }
}
