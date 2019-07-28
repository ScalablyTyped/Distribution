package typings.atJupyterlabObservables.libObservablejsonMod

import typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSONNs.IOptions
import typings.atJupyterlabObservables.libObservablemapMod.ObservableMap
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
/**
  * Construct a new observable JSON object.
  */
class ObservableJSON () extends ObservableMap[JSONValue] {
  def this(options: IOptions) = this()
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject = js.native
}

