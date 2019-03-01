package typings
package knockoutDashAmdDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutAMDTemplate extends js.Object {
  var defaultPath: java.lang.String
  var defaultRequireTextPluginName: java.lang.String
  var defaultSuffix: java.lang.String
}

object KnockoutAMDTemplate {
  @scala.inline
  def apply(
    defaultPath: java.lang.String,
    defaultRequireTextPluginName: java.lang.String,
    defaultSuffix: java.lang.String
  ): KnockoutAMDTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultPath")(defaultPath)
    __obj.updateDynamic("defaultRequireTextPluginName")(defaultRequireTextPluginName)
    __obj.updateDynamic("defaultSuffix")(defaultSuffix)
    __obj.asInstanceOf[KnockoutAMDTemplate]
  }
}

