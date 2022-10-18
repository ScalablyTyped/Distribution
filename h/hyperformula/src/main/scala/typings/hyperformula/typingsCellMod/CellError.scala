package typings.hyperformula.typingsCellMod

import typings.hyperformula.typingsDependencyGraphFormulaCellVertexMod.FormulaVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/Cell", "CellError")
@js.native
open class CellError protected () extends StObject {
  def this(`type`: ErrorType) = this()
  def this(`type`: ErrorType, message: String) = this()
  def this(`type`: ErrorType, message: String, root: FormulaVertex) = this()
  def this(`type`: ErrorType, message: Unit, root: FormulaVertex) = this()
  
  def attachRootVertex(vertex: FormulaVertex): CellError = js.native
  
  val message: js.UndefOr[String] = js.native
  
  val root: js.UndefOr[FormulaVertex] = js.native
  
  val `type`: ErrorType = js.native
}
/* static members */
object CellError {
  
  @JSImport("hyperformula/typings/Cell", "CellError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsingError(): CellError = ^.asInstanceOf[js.Dynamic].applyDynamic("parsingError")().asInstanceOf[CellError]
}
