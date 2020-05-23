package typings.isexe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var gid: js.UndefOr[Double] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var pathExt: js.UndefOr[String] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    gid: js.UndefOr[Double] = js.undefined,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    pathExt: String = null,
    uid: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

