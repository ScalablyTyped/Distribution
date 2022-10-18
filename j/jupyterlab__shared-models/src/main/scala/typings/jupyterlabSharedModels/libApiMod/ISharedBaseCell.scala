package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.IBaseCell
import typings.luminoSignaling.mod.ISignal
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedBaseCell[Metadata /* <: ISharedBaseCellMetadata */]
  extends StObject
     with ISharedText {
  
  /**
    * The type of the cell.
    */
  val cell_type: CellType = js.native
  
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ISharedBaseCell: ISignal[this.type, CellChange[Metadata]] = js.native
  
  /**
    * Get Cell id.
    *
    * @returns Cell id.
    */
  def getId(): String = js.native
  
  /**
    * Returns the metadata associated with the notebook.
    *
    * @returns Notebook's metadata.
    */
  def getMetadata(): Partial[Metadata] = js.native
  
  /**
    * Whether the cell is standalone or not.
    *
    * If the cell is standalone. It cannot be
    * inserted into a YNotebook because the Yjs model is already
    * attached to an anonymous Y.Doc instance.
    */
  val isStandalone: Boolean = js.native
  
  /**
    * Sets the metadata associated with the notebook.
    *
    * @param metadata: Notebook's metadata.
    */
  def setMetadata(metadata: Partial[Metadata]): Unit = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IBaseCell = js.native
}
