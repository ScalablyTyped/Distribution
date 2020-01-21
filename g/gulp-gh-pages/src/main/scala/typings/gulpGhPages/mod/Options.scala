package typings.gulpGhPages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var branch: js.UndefOr[String] = js.undefined
  var cacheDir: js.UndefOr[String] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
  var remoteUrl: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    branch: String = null,
    cacheDir: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    origin: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    remoteUrl: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (remoteUrl != null) __obj.updateDynamic("remoteUrl")(remoteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

