package typings
package isexeLib.isexeMod.isExeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var gid: js.UndefOr[scala.Double] = js.undefined
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  var pathExt: js.UndefOr[java.lang.String] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    gid: scala.Int | scala.Double = null,
    ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined,
    pathExt: java.lang.String = null,
    uid: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

