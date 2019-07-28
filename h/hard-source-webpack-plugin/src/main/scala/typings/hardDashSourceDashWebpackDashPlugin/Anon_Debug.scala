package typings.hardDashSourceDashWebpackDashPlugin

import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.debug
import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.error
import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.info
import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.log
import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.none
import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.test
import typings.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var level: debug | log | info | warn | error
  var mode: none | test
}

object Anon_Debug {
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): Anon_Debug = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

