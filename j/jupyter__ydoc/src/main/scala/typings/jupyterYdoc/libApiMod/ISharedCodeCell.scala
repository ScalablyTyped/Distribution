package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.jupyterYdocStrings.code
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import typings.jupyterlabNbformat.mod.IOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedCodeCell
  extends StObject
     with ISharedBaseCell[IBaseCellMetadata]
     with ISharedCell {
  
  /**
    * The type of the cell.
    */
  @JSName("cell_type")
  var cell_type_ISharedCodeCell: code = js.native
  
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var execution_count: ExecutionCount = js.native
  
  /**
    * Execution, display, or stream outputs.
    */
  def getOutputs(): js.Array[IOutput] = js.native
  
  /**
    * Cell outputs
    */
  var outputs: js.Array[IOutput] = js.native
  
  /**
    * Add/Update output.
    */
  def setOutputs(outputs: js.Array[IOutput]): Unit = js.native
  
  /**
    * Replace content from `start' to `end` with `outputs`.
    *
    * @param start: The start index of the range to replace (inclusive).
    *
    * @param end: The end index of the range to replace (exclusive).
    *
    * @param outputs: New outputs (optional).
    */
  def updateOutputs(start: Double, end: Double, outputs: js.Array[IOutput]): Unit = js.native
}
