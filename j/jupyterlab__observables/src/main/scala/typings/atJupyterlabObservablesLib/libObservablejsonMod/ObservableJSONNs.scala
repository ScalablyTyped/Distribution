package typings
package atJupyterlabObservablesLib.libObservablejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
object ObservableJSONNs extends js.Object {
  /**
    * An observable JSON change message.
    */
  @js.native
  class ChangeMessage protected ()
    extends atPhosphorMessagingLib.atPhosphorMessagingMod.Message {
    /**
      * Create a new metadata changed message.
      */
    def this(args: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSONNs.IChangedArgs) = this()
    /**
      * The arguments of the change.
      */
    val args: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSONNs.IChangedArgs = js.native
  }
  
  /**
    * The options use to initialize an observable JSON object.
    */
  trait IOptions extends js.Object {
    /**
      * The optional intitial value for the object.
      */
    var values: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONObject] = js.undefined
  }
  
}

