package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfigDescriptionResource extends js.Object {
  var configEntries: js.Array[AdminConfigDescriptionResourceConfigEntry]
  var errorCode: Double
  var errorMessage: String
  var resourceName: String
  var resourceType: ResourceTypes
}

object AdminConfigDescriptionResource {
  @scala.inline
  def apply(
    configEntries: js.Array[AdminConfigDescriptionResourceConfigEntry],
    errorCode: Double,
    errorMessage: String,
    resourceName: String,
    resourceType: ResourceTypes
  ): AdminConfigDescriptionResource = {
    val __obj = js.Dynamic.literal(configEntries = configEntries, errorCode = errorCode, errorMessage = errorMessage, resourceName = resourceName, resourceType = resourceType)
  
    __obj.asInstanceOf[AdminConfigDescriptionResource]
  }
}

