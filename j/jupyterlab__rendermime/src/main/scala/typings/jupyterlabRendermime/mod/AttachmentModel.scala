package typings.jupyterlabRendermime.mod

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime", "AttachmentModel")
@js.native
class AttachmentModel protected ()
  extends typings.jupyterlabRendermime.attachmentmodelMod.AttachmentModel {
  /**
    * Construct a new attachment model.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/rendermime", "AttachmentModel")
@js.native
object AttachmentModel extends js.Object {
  
  /**
    * Get the data for an attachment.
    *
    * @params bundle - A kernel attachment MIME bundle.
    *
    * @returns - The data for the payload.
    */
  def getData(bundle: IMimeBundle): PartialJSONObject = js.native
}
