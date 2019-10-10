package typings.atHapiJoi.atHapiJoiMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLevelDomainOptions extends js.Object {
  /**
    * - `true` to use the IANA list of registered TLDs. This is the default value.
    * - `false` to allow any TLD not listed in the `deny` list, if present.
    * - A `Set` or array of the allowed TLDs. Cannot be used together with `deny`.
    */
  var allow: js.UndefOr[Set[String] | js.Array[String] | Boolean] = js.undefined
  /**
    * - A `Set` or array of the forbidden TLDs. Cannot be used together with a custom `allow` list.
    */
  var deny: js.UndefOr[Set[String] | js.Array[String]] = js.undefined
}

object TopLevelDomainOptions {
  @scala.inline
  def apply(
    allow: Set[String] | js.Array[String] | Boolean = null,
    deny: Set[String] | js.Array[String] = null
  ): TopLevelDomainOptions = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (deny != null) __obj.updateDynamic("deny")(deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelDomainOptions]
  }
}

