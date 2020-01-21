package typings.ionic.cordovaConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfiguredPlatform extends js.Object {
  var name: String
  var spec: js.UndefOr[String] = js.undefined
}

object ConfiguredPlatform {
  @scala.inline
  def apply(name: String, spec: String = null): ConfiguredPlatform = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfiguredPlatform]
  }
}

