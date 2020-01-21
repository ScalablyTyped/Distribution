package typings.jupyterlabExtensionmanager.modelMod

import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.error
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.ok
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionReply extends js.Object {
  /**
    * An optional message when the status is not 'ok'.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The status category of the reply.
    */
  var status: ok | warning | error | Null
}

object IActionReply {
  @scala.inline
  def apply(message: String = null, status: ok | warning | error = null): IActionReply = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionReply]
  }
}

