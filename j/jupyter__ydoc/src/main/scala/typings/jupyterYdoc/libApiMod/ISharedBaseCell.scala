package typings.jupyterYdoc.libApiMod

import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.IBaseCell
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedBaseCell[Metadata /* <: IBaseCellMetadata */]
  extends StObject
     with ISharedText {
  
  /**
    * The type of the cell.
    */
  val cell_type: CellType | String = js.native
  
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ISharedBaseCell: ISignal[this.type, CellChange] = js.native
  
  /**
    * Delete a metadata cell.
    *
    * @param key The key to delete
    */
  def deleteMetadata(key: String): Unit = js.native
  
  /**
    * Get Cell id.
    *
    * @returns Cell id.
    */
  def getId(): String = js.native
  
  /**
    * Returns all metadata associated with the cell.
    *
    * @returns Cell's metadata.
    */
  def getMetadata(): Partial[Metadata] = js.native
  /**
    * Returns a metadata associated with the cell.
    *
    * @param key Metadata key to get
    * @returns Cell's metadata.
    */
  def getMetadata(key: String): js.UndefOr[PartialJSONValue] = js.native
  
  /**
    * Cell id.
    */
  val id: String = js.native
  
  /**
    * Whether the cell is standalone or not.
    *
    * If the cell is standalone. It cannot be
    * inserted into a YNotebook because the Yjs model is already
    * attached to an anonymous Y.Doc instance.
    */
  val isStandalone: Boolean = js.native
  
  /**
    * Cell metadata.
    *
    * #### Notes
    * You should prefer to access and modify the specific key of interest.
    */
  var metadata: Partial[Metadata] = js.native
  
  /**
    * Signal triggered when the cell metadata changes.
    */
  val metadataChanged: ISignal[this.type, IMapChange[Any]] = js.native
  
  /**
    * The notebook that this cell belongs to.
    */
  val notebook: ISharedNotebook | Null = js.native
  
  /**
    * Sets a cell metadata.
    *
    * @param metadata Cell's metadata key.
    * @param value Metadata value
    */
  def setMetadata(metadata: String, value: PartialJSONValue): Unit = js.native
  /**
    * Sets some cell metadata.
    *
    * @param metadata Cell's metadata.
    */
  def setMetadata(metadata: Partial[Metadata]): Unit = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IBaseCell = js.native
}
