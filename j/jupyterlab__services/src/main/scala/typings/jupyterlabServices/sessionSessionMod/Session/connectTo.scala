package typings.jupyterlabServices.sessionSessionMod.Session

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session.connectTo")
@js.native
object connectTo extends js.Object {
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param settigns - The server settings.
    *
    * @returns The session instance.
    *
    * #### Notes
    * If the session was already started via `startNew`, the existing
    * Session object is used as the fulfillment value.
    *
    * Otherwise, we attempt to connect to the existing session.
    */
  def apply(model: IModel): ISession = js.native
  def apply(model: IModel, settings: ISettings): ISession = js.native
}

