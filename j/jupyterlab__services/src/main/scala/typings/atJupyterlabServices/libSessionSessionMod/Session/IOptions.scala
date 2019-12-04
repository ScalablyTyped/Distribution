package typings.atJupyterlabServices.libSessionSessionMod.Session

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The session initialization options.
  */
trait IOptions extends js.Object {
  /**
    * The unique identifier for the session client.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The id of an existing kernel.
    */
  var kernelId: js.UndefOr[String] = js.undefined
  /**
    * The type of kernel (e.g. python3).
    */
  var kernelName: js.UndefOr[String] = js.undefined
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The path (not including name) to the session.
    */
  var path: String
  /**
    * The server settings.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The username of the session client.
    */
  var username: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    path: String,
    clientId: String = null,
    kernelId: String = null,
    kernelName: String = null,
    name: String = null,
    serverSettings: ISettings = null,
    `type`: String = null,
    username: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (kernelId != null) __obj.updateDynamic("kernelId")(kernelId.asInstanceOf[js.Any])
    if (kernelName != null) __obj.updateDynamic("kernelName")(kernelName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

