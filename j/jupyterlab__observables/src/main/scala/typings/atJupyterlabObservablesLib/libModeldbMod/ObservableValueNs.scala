package typings
package atJupyterlabObservablesLib.libModeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue")
@js.native
object ObservableValueNs extends js.Object {
  /**
    * The changed args object emitted by the `IObservableValue`.
    */
  @js.native
  class IChangedArgs () extends js.Object {
    /**
      * The new value.
      */
    var newValue: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
    /**
      * The old value.
      */
    var oldValue: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
  }
  
}

