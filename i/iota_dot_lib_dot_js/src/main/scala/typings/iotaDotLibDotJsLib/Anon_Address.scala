package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var inputs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    inputs: js.Array[java.lang.String] = null,
    security: Security = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[Anon_Address]
  }
}

