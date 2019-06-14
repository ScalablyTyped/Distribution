package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSynonyms extends js.Object {
  var configName: java.lang.String
  var configSource: scala.Double
  var configValue: java.lang.String
}

object ConfigSynonyms {
  @scala.inline
  def apply(configName: java.lang.String, configSource: scala.Double, configValue: java.lang.String): ConfigSynonyms = {
    val __obj = js.Dynamic.literal(configName = configName, configSource = configSource, configValue = configValue)
  
    __obj.asInstanceOf[ConfigSynonyms]
  }
}

