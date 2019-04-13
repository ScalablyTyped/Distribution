package typings
package jsenLib.jsenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsenBuildSettings extends js.Object {
  var additionalProperties: js.UndefOr[scala.Boolean] = js.undefined
  var copy: js.UndefOr[scala.Boolean] = js.undefined
}

object JsenBuildSettings {
  @scala.inline
  def apply(
    additionalProperties: js.UndefOr[scala.Boolean] = js.undefined,
    copy: js.UndefOr[scala.Boolean] = js.undefined
  ): JsenBuildSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties)
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy)
    __obj.asInstanceOf[JsenBuildSettings]
  }
}

