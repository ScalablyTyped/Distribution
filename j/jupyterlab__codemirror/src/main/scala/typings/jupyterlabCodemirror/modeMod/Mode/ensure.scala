package typings.jupyterlabCodemirror.modeMod.Mode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/mode", "Mode.ensure")
@js.native
object ensure extends js.Object {
  /**
    * Ensure a codemirror mode is available by name or Codemirror spec.
    *
    * @param mode - The mode to ensure.  If it is a string, uses [findBest]
    *   to get the appropriate spec.
    *
    * @returns A promise that resolves when the mode is available.
    */
  def apply(mode: String): js.Promise[ISpec | Null] = js.native
  def apply(mode: ISpec): js.Promise[ISpec | Null] = js.native
}

