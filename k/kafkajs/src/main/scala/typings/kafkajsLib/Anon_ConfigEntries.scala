package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigEntries extends js.Object {
  var configEntries: js.Array[kafkajsLib.kafkajsMod.ConfigEntries]
  var errorCode: scala.Double
  var errorMessage: java.lang.String
  var resourceName: java.lang.String
  var resourceType: kafkajsLib.kafkajsMod.ResourceType
}

object Anon_ConfigEntries {
  @scala.inline
  def apply(
    configEntries: js.Array[kafkajsLib.kafkajsMod.ConfigEntries],
    errorCode: scala.Double,
    errorMessage: java.lang.String,
    resourceName: java.lang.String,
    resourceType: kafkajsLib.kafkajsMod.ResourceType
  ): Anon_ConfigEntries = {
    val __obj = js.Dynamic.literal(configEntries = configEntries, errorCode = errorCode, errorMessage = errorMessage, resourceName = resourceName, resourceType = resourceType)
  
    __obj.asInstanceOf[Anon_ConfigEntries]
  }
}

