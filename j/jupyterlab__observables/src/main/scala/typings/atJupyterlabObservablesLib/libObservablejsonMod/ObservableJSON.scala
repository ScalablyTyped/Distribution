package typings
package atJupyterlabObservablesLib.libObservablejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
/**
  * Construct a new observable JSON object.
  */
class ObservableJSON ()
  extends atJupyterlabObservablesLib.libObservablemapMod.ObservableMap[atPhosphorCoreutilsLib.libJsonMod.JSONValue] {
  def this(options: atJupyterlabObservablesLib.libObservablejsonMod.ObservableJSONNs.IOptions) = this()
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atPhosphorCoreutilsLib.libJsonMod.JSONObject = js.native
}

