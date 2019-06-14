package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigEntries extends js.Object {
  var configName: java.lang.String
  var configSynonyms: js.Array[ConfigSynonyms]
  var configValue: java.lang.String
  var isDefault: scala.Boolean
  var isSensitive: scala.Boolean
  var readOnly: scala.Boolean
}

object ConfigEntries {
  @scala.inline
  def apply(
    configName: java.lang.String,
    configSynonyms: js.Array[ConfigSynonyms],
    configValue: java.lang.String,
    isDefault: scala.Boolean,
    isSensitive: scala.Boolean,
    readOnly: scala.Boolean
  ): ConfigEntries = {
    val __obj = js.Dynamic.literal(configName = configName, configSynonyms = configSynonyms, configValue = configValue, isDefault = isDefault, isSensitive = isSensitive, readOnly = readOnly)
  
    __obj.asInstanceOf[ConfigEntries]
  }
}

