package typings.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutAMDTemplate extends js.Object {
  var defaultPath: String
  var defaultRequireTextPluginName: String
  var defaultSuffix: String
}

object KnockoutAMDTemplate {
  @scala.inline
  def apply(defaultPath: String, defaultRequireTextPluginName: String, defaultSuffix: String): KnockoutAMDTemplate = {
    val __obj = js.Dynamic.literal(defaultPath = defaultPath.asInstanceOf[js.Any], defaultRequireTextPluginName = defaultRequireTextPluginName.asInstanceOf[js.Any], defaultSuffix = defaultSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDTemplate]
  }
}

