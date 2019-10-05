package typings.atJupyterlabServices.libSessionSessionMod.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session.findByPath")
@js.native
object findByPath extends js.Object {
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @param settings: The server settings.
    *
    * @returns A promise that resolves with the session model.
    *
    * #### Notes
    * If the session was already started via `startNewSession`, the existing
    * Session object's info is used in the fulfillment value.
    *
    * Otherwise, we attempt to find to the existing
    * session using [listRunningSessions].
    * The promise is fulfilled when the session is found,
    * otherwise the promise is rejected.
    *
    * If the session was not already started and no `options` are given,
    * the promise is rejected.
    */
  def apply(path: String): js.Promise[IModel] = js.native
  def apply(
    path: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[IModel] = js.native
}

