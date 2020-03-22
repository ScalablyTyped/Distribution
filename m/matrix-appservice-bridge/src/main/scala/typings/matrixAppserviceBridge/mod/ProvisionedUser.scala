package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedUser extends js.Object {
  var name: js.UndefOr[String] = js.undefined
        // The avatar URL to set for the provisioned user.
  var remote: js.UndefOr[RemoteUser] = js.undefined
        // The display name to set for the provisioned user.
  var url: js.UndefOr[String] = js.undefined
}

object ProvisionedUser {
  @scala.inline
  def apply(name: String = null, remote: RemoteUser = null, url: String = null): ProvisionedUser = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedUser]
  }
}

