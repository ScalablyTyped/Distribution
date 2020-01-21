package typings.jupyterlabObservables.observablejsonMod

import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.phosphorCoreutils.jsonMod.JSONValue
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
  type IChangedArgs = typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[JSONValue]
}

