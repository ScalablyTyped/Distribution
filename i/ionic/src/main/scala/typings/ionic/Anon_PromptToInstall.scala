package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PromptToInstall extends js.Object {
  var promptToInstall: js.UndefOr[Boolean] = js.undefined
  var promptToInstallRefusalMsg: js.UndefOr[String] = js.undefined
}

object Anon_PromptToInstall {
  @scala.inline
  def apply(promptToInstall: js.UndefOr[Boolean] = js.undefined, promptToInstallRefusalMsg: String = null): Anon_PromptToInstall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(promptToInstall)) __obj.updateDynamic("promptToInstall")(promptToInstall.asInstanceOf[js.Any])
    if (promptToInstallRefusalMsg != null) __obj.updateDynamic("promptToInstallRefusalMsg")(promptToInstallRefusalMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PromptToInstall]
  }
}

