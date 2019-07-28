package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfigDescriptionResourceConfigEntry extends js.Object {
  var configName: String
  var configValue: String
  var isDefault: Boolean
  var isSensitive: Boolean
  var readOnly: Boolean
}

object AdminConfigDescriptionResourceConfigEntry {
  @scala.inline
  def apply(
    configName: String,
    configValue: String,
    isDefault: Boolean,
    isSensitive: Boolean,
    readOnly: Boolean
  ): AdminConfigDescriptionResourceConfigEntry = {
    val __obj = js.Dynamic.literal(configName = configName, configValue = configValue, isDefault = isDefault, isSensitive = isSensitive, readOnly = readOnly)
  
    __obj.asInstanceOf[AdminConfigDescriptionResourceConfigEntry]
  }
}

