package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedRawCell
  extends StObject
     with ISharedBaseCell[ISharedBaseCellMetadata]
     with ISharedCell {
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_ISharedRawCell: raw = js.native
  
  /**
    * Gets the cell attachments.
    *
    * @returns The cell attachments.
    */
  def getAttachments(): js.UndefOr[IAttachments] = js.native
  
  /**
    * Sets the cell attachments
    *
    * @param attachments: The cell attachments.
    */
  def setAttachments(): Unit = js.native
  def setAttachments(attachments: IAttachments): Unit = js.native
}
