package typings
package hardDashSourceDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var level: hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.debug | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.log | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.info | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.warn | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.error
  var mode: hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.none | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.test
}

object Anon_Debug {
  @scala.inline
  def apply(
    level: hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.debug | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.log | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.info | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.warn | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.error,
    mode: hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.none | hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginLibStrings.test
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Debug]
  }
}

