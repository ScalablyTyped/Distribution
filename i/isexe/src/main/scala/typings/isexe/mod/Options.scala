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
    gid: Int | Double = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    pathExt: String = null,
    uid: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

