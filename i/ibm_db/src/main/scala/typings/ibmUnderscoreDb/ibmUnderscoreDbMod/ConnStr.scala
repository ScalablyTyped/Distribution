package typings.ibmUnderscoreDb.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnStr extends js.Object {
  var DATABASE: String
  var HOSTNAME: String
  var PORT: Double | String
  var PROTOCOL: String
  var PWD: String
  var UID: String
}

object ConnStr {
  @scala.inline
  def apply(
    DATABASE: String,
    HOSTNAME: String,
    PORT: Double | String,
    PROTOCOL: String,
    PWD: String,
    UID: String
  ): ConnStr = {
    val __obj = js.Dynamic.literal(DATABASE = DATABASE, HOSTNAME = HOSTNAME, PORT = PORT.asInstanceOf[js.Any], PROTOCOL = PROTOCOL, PWD = PWD, UID = UID)
  
    __obj.asInstanceOf[ConnStr]
  }
}

