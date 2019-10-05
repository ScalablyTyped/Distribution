package typings.atJupyterlabServices.libSessionSessionMod.Session

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
  var serverSettings: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
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
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null,
    `type`: String = null,
    username: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (kernelId != null) __obj.updateDynamic("kernelId")(kernelId)
    if (kernelName != null) __obj.updateDynamic("kernelName")(kernelName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[IOptions]
  }
}

