package typings
package jqueryDashToastDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPosition extends js.Object {
  var bottom: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto
  var left: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto
  var right: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto
  var top: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto
}

object CustomPosition {
  @scala.inline
  def apply(
    bottom: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto,
    left: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto,
    right: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto,
    top: scala.Double | jqueryDashToastDashPluginLib.jqueryDashToastDashPluginLibStrings.auto
  ): CustomPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPosition]
  }
}

