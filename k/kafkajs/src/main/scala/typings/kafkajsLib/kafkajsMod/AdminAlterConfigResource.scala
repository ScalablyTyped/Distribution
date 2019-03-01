package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminAlterConfigResource extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
  var resourceName: java.lang.String
  var resourceType: ResourceTypes
}

object AdminAlterConfigResource {
  @scala.inline
  def apply(
    errorCode: scala.Double,
    errorMessage: java.lang.String,
    resourceName: java.lang.String,
    resourceType: ResourceTypes
  ): AdminAlterConfigResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("resourceName")(resourceName)
    __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[AdminAlterConfigResource]
  }
}

