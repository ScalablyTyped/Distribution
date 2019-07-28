package typings.atJupyterlabRendermime.atJupyterlabRendermimeMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMimeBundle
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "AttachmentModel")
@js.native
object AttachmentModelNs extends js.Object {
  /**
    * Get the data for an attachment.
    *
    * @params bundle - A kernel attachment MIME bundle.
    *
    * @returns - The data for the payload.
    */
  def getData(bundle: IMimeBundle): JSONObject = js.native
}

