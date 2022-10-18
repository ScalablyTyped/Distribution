package typings.hyperformula.mod

import typings.hyperformula.typingsDependencyGraphFormulaCellVertexMod.FormulaVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "CellError")
@js.native
open class CellError protected ()
  extends typings.hyperformula.typingsCellMod.CellError {
  def this(`type`: typings.hyperformula.typingsCellMod.ErrorType) = this()
  def this(`type`: typings.hyperformula.typingsCellMod.ErrorType, message: String) = this()
  def this(`type`: typings.hyperformula.typingsCellMod.ErrorType, message: String, root: FormulaVertex) = this()
  def this(`type`: typings.hyperformula.typingsCellMod.ErrorType, message: Unit, root: FormulaVertex) = this()
}
/* static members */
object CellError {
  
  @JSImport("hyperformula", "CellError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsingError(): typings.hyperformula.typingsCellMod.CellError = ^.asInstanceOf[js.Dynamic].applyDynamic("parsingError")().asInstanceOf[typings.hyperformula.typingsCellMod.CellError]
}
