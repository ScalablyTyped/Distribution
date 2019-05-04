package typings
package atJupyterlabRendermimeLib.libOutputmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
object OutputModelNs extends js.Object {
  /**
    * Get the data for an output.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The data for the payload.
    */
  def getData(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): atPhosphorCoreutilsLib.libJsonMod.JSONObject = js.native
  /**
    * Get the metadata from an output message.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The metadata for the payload.
    */
  def getMetadata(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): atPhosphorCoreutilsLib.libJsonMod.JSONObject = js.native
}

