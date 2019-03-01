package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfigDescriptionResourceConfigEntry extends js.Object {
  var configName: java.lang.String
  var configValue: java.lang.String
  var isDefault: scala.Boolean
  var isSensitive: scala.Boolean
  var readOnly: scala.Boolean
}

object AdminConfigDescriptionResourceConfigEntry {
  @scala.inline
  def apply(
    configName: java.lang.String,
    configValue: java.lang.String,
    isDefault: scala.Boolean,
    isSensitive: scala.Boolean,
    readOnly: scala.Boolean
  ): AdminConfigDescriptionResourceConfigEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configName")(configName)
    __obj.updateDynamic("configValue")(configValue)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("isSensitive")(isSensitive)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[AdminConfigDescriptionResourceConfigEntry]
  }
}

