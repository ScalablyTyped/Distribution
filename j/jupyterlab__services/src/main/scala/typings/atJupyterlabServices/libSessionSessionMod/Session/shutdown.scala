package typings.atJupyterlabServices.libSessionSessionMod.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session.shutdown")
@js.native
object shutdown extends js.Object {
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target session.
    *
    * @param settings - The server settings.
    *
    * @returns A promise that resolves when the session is shut down.
    *
    */
  def apply(id: String): js.Promise[Unit] = js.native
  def apply(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
}

