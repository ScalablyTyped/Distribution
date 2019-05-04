package typings
package atJupyterlabExtensionmanagerLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionReply extends js.Object {
  /**
    * An optional message when the status is not 'ok'.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status category of the reply.
    */
  var status: atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.ok | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.warning | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.error | scala.Null
}

object IActionReply {
  @scala.inline
  def apply(
    message: java.lang.String = null,
    status: atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.ok | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.warning | atJupyterlabExtensionmanagerLib.atJupyterlabExtensionmanagerLibStrings.error = null
  ): IActionReply = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionReply]
  }
}

