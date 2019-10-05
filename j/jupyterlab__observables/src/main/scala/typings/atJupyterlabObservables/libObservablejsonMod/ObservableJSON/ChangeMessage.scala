package typings.atJupyterlabObservables.libObservablejsonMod.ObservableJSON

import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON.IChangedArgs
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An observable JSON change message.
  */
@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON.ChangeMessage")
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

