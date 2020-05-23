package typings.jsDataHttp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
  var alpha: js.UndefOr[String | Boolean] = js.undefined
  var beta: js.UndefOr[String | Boolean] = js.undefined
  var full: js.UndefOr[String] = js.undefined
  var major: js.UndefOr[String] = js.undefined
  var minor: js.UndefOr[String] = js.undefined
  var patch: js.UndefOr[String] = js.undefined
}

object Alpha {
  @scala.inline
  def apply(
    alpha: String | Boolean = null,
    beta: String | Boolean = null,
    full: String = null,
    major: String = null,
    minor: String = null,
    patch: String = null
  ): Alpha = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

