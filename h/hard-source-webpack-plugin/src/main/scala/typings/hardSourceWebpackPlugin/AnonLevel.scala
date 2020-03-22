package typings.hardSourceWebpackPlugin

import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.debug
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.error
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.info
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.log
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.none
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.test
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: debug | log | info | warn | error
  var mode: none | test
}

object AnonLevel {
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

