package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addresses extends js.Object {
  var addresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var approvees: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bundles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Addresses {
  @scala.inline
  def apply(
    addresses: js.Array[java.lang.String] = null,
    approvees: js.Array[java.lang.String] = null,
    bundles: js.Array[java.lang.String] = null,
    tags: js.Array[java.lang.String] = null
  ): Anon_Addresses = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (approvees != null) __obj.updateDynamic("approvees")(approvees)
    if (bundles != null) __obj.updateDynamic("bundles")(bundles)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Addresses]
  }
}

