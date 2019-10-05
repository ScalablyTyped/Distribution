package typings.atJupyterlabRendermime.atJupyterlabRendermimeMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IMimeBundle
import typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel.IOptions
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "AttachmentModel")
@js.native
class AttachmentModel protected ()
  extends typings.atJupyterlabRendermime.libAttachmentmodelMod.AttachmentModel {
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
  def getData(bundle: IMimeBundle): JSONObject = js.native
}

