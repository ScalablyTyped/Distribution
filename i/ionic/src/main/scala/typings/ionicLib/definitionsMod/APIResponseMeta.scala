package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseMeta extends js.Object {
  var request_id: java.lang.String
  var status: scala.Double
  var version: java.lang.String
}

object APIResponseMeta {
  @scala.inline
  def apply(request_id: java.lang.String, status: scala.Double, version: java.lang.String): APIResponseMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request_id")(request_id)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[APIResponseMeta]
  }
}

