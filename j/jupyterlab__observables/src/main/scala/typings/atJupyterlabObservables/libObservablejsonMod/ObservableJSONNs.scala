package typings.atJupyterlabObservables.libObservablejsonMod

import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSONNs.IChangedArgs
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
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
  class ChangeMessage protected () extends Message {
    /**
      * Create a new metadata changed message.
      */
    def this(`type`: String, args: IChangedArgs) = this()
    /**
      * The arguments of the change.
      */
    val args: IChangedArgs = js.native
  }
  
  /**
    * The options use to initialize an observable JSON object.
    */
  trait IOptions extends js.Object {
    /**
      * The optional initial value for the object.
      */
    var values: js.UndefOr[JSONObject] = js.undefined
  }
  
}

