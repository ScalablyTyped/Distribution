package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var otherwise: js.UndefOr[java.lang.String] = js.undefined
  var privacy: js.UndefOr[
    hapiLib.hapiLibStrings.default | hapiLib.hapiLibStrings.public | hapiLib.hapiLibStrings.`private`
  ] = js.undefined
  var statuses: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    otherwise: java.lang.String = null,
    privacy: hapiLib.hapiLibStrings.default | hapiLib.hapiLibStrings.public | hapiLib.hapiLibStrings.`private` = null,
    statuses: js.Array[scala.Double] = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise)
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    __obj.asInstanceOf[Anon_Default]
  }
}

