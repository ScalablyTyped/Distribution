package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminAlterConfigResource extends js.Object {
  var errorCode: Double
  var errorMessage: String
  var resourceName: String
  var resourceType: ResourceTypes
}

object AdminAlterConfigResource {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String, resourceName: String, resourceType: ResourceTypes): AdminAlterConfigResource = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage, resourceName = resourceName, resourceType = resourceType)
  
    __obj.asInstanceOf[AdminAlterConfigResource]
  }
}

