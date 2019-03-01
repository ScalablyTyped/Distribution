package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfigDescriptionResource extends js.Object {
  var configEntries: js.Array[AdminConfigDescriptionResourceConfigEntry]
  var errorCode: scala.Double
  var errorMessage: java.lang.String
  var resourceName: java.lang.String
  var resourceType: ResourceTypes
}

object AdminConfigDescriptionResource {
  @scala.inline
  def apply(
    configEntries: js.Array[AdminConfigDescriptionResourceConfigEntry],
    errorCode: scala.Double,
    errorMessage: java.lang.String,
    resourceName: java.lang.String,
    resourceType: ResourceTypes
  ): AdminConfigDescriptionResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configEntries")(configEntries)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("resourceName")(resourceName)
    __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[AdminConfigDescriptionResource]
  }
}

