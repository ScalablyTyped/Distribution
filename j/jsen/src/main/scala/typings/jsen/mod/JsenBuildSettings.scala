package typings.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsenBuildSettings extends js.Object {
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  var copy: js.UndefOr[Boolean] = js.undefined
}

object JsenBuildSettings {
  @scala.inline
  def apply(additionalProperties: js.UndefOr[Boolean] = js.undefined, copy: js.UndefOr[Boolean] = js.undefined): JsenBuildSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsenBuildSettings]
  }
}

