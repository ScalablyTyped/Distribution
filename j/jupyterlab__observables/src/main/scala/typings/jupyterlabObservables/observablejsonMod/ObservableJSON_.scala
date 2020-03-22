package typings.jupyterlabObservables.observablejsonMod

import typings.jupyterlabObservables.observablejsonMod.ObservableJSON.IOptions
import typings.jupyterlabObservables.observablemapMod.ObservableMap
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
/**
  * Construct a new observable JSON object.
  */
class ObservableJSON_ () extends ObservableMap[ReadonlyPartialJSONValue] {
  def this(options: IOptions) = this()
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): PartialJSONObject = js.native
}

