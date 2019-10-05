package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/nbformat", "nbformat.validateMimeValue")
@js.native
object validateMimeValue extends js.Object {
  /**
    * Validate a mime type/value pair.
    *
    * @param type - The mimetype name.
    *
    * @param value - The value associated with the type.
    *
    * @returns Whether the type/value pair are valid.
    */
  def apply(`type`: String, value: MultilineString): Boolean = js.native
  def apply(`type`: String, value: JSONObject): Boolean = js.native
}

