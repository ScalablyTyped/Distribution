package typings.atJupyterlabServices.libSessionSessionMod.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session.findById")
@js.native
object findById extends js.Object {
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @param settings - The server settings.
    *
    * @returns A promise that resolves with the session model.
    *
    * #### Notes
    * If the session was already started via `startNew`, the existing
    * Session object's information is used in the fulfillment value.
    *
    * Otherwise, we attempt to find to the existing session.
    * The promise is fulfilled when the session is found,
    * otherwise the promise is rejected.
    */
  def apply(id: String): js.Promise[IModel] = js.native
  def apply(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[IModel] = js.native
}

