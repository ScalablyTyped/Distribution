package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromptToInstall extends js.Object {
  var promptToInstall: js.UndefOr[Boolean] = js.undefined
  var promptToInstallRefusalMsg: js.UndefOr[String] = js.undefined
}

object AnonPromptToInstall {
  @scala.inline
  def apply(promptToInstall: js.UndefOr[Boolean] = js.undefined, promptToInstallRefusalMsg: String = null): AnonPromptToInstall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(promptToInstall)) __obj.updateDynamic("promptToInstall")(promptToInstall.asInstanceOf[js.Any])
    if (promptToInstallRefusalMsg != null) __obj.updateDynamic("promptToInstallRefusalMsg")(promptToInstallRefusalMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromptToInstall]
  }
}

