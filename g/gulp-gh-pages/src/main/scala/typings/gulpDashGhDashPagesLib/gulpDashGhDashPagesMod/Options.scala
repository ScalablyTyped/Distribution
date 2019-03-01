package typings
package gulpDashGhDashPagesLib.gulpDashGhDashPagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var cacheDir: js.UndefOr[java.lang.String] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var push: js.UndefOr[scala.Boolean] = js.undefined
  var remoteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    branch: java.lang.String = null,
    cacheDir: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    origin: java.lang.String = null,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    remoteUrl: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (message != null) __obj.updateDynamic("message")(message)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (remoteUrl != null) __obj.updateDynamic("remoteUrl")(remoteUrl)
    __obj.asInstanceOf[Options]
  }
}

