package typings.jupyterYdoc.libApiMod

import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedAttachmentsCell
  extends StObject
     with ISharedBaseCell[IBaseCellMetadata] {
  
  /**
    * Cell attachments
    */
  var attachments: js.UndefOr[IAttachments] = js.native
  
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
