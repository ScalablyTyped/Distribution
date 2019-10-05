package typings.atJupyterlabObservables.libObservablejsonMod

import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableJSON extends IObservableMap[JSONValue] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject
}

@JSImport("@jupyterlab/observables/lib/observablejson", "IObservableJSON")
@js.native
object IObservableJSON extends js.Object {
  /**
    * A type alias for observable JSON changed args.
    */
  type IChangedArgs = typings.atJupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs[JSONValue]
}

