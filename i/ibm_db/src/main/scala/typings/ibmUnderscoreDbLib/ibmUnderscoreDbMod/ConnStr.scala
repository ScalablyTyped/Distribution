package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnStr extends js.Object {
  var DATABASE: java.lang.String
  var HOSTNAME: java.lang.String
  var PORT: scala.Double | java.lang.String
  var PROTOCOL: java.lang.String
  var PWD: java.lang.String
  var UID: java.lang.String
}

object ConnStr {
  @scala.inline
  def apply(
    DATABASE: java.lang.String,
    HOSTNAME: java.lang.String,
    PORT: scala.Double | java.lang.String,
    PROTOCOL: java.lang.String,
    PWD: java.lang.String,
    UID: java.lang.String
  ): ConnStr = {
    val __obj = js.Dynamic.literal(DATABASE = DATABASE, HOSTNAME = HOSTNAME, PORT = PORT.asInstanceOf[js.Any], PROTOCOL = PROTOCOL, PWD = PWD, UID = UID)
  
    __obj.asInstanceOf[ConnStr]
  }
}

