package typings
package jjvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Required {
  @scala.inline
  def apply(required: js.UndefOr[scala.Boolean] = js.undefined, `type`: java.lang.String = null): Anon_Required = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Required]
  }
}

