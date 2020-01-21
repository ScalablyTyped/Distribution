package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client metadata associated with Safe Browsing API requests.
  */
@js.native
trait SchemaClientInfo extends js.Object {
  /**
    * A client ID that (hopefully) uniquely identifies the client
    * implementation of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.native
}

object SchemaClientInfo {
  @scala.inline
  def apply(clientId: String = null, clientVersion: String = null): SchemaClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClientInfo]
  }
}

