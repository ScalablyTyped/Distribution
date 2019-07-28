package typings.atJupyterlabObservables.atJupyterlabObservablesMod

import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSONNs.IChangedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables", "ObservableJSON")
@js.native
object ObservableJSONNs extends js.Object {
  /**
    * An observable JSON change message.
    */
  @js.native
  class ChangeMessage protected ()
    extends typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSONNs.ChangeMessage {
    /**
      * Create a new metadata changed message.
      */
    def this(`type`: String, args: IChangedArgs) = this()
  }
  
}

