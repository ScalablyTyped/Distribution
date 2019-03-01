package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabServeDetails extends js.Object {
  var address: java.lang.String
  var port: scala.Double
  var projectType: ProjectType
}

object LabServeDetails {
  @scala.inline
  def apply(address: java.lang.String, port: scala.Double, projectType: ProjectType): LabServeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("projectType")(projectType)
    __obj.asInstanceOf[LabServeDetails]
  }
}

