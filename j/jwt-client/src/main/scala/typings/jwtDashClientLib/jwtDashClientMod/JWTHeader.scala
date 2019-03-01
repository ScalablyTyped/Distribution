package typings
package jwtDashClientLib.jwtDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTHeader extends js.Object {
  var alg: java.lang.String
  var typ: java.lang.String
}

object JWTHeader {
  @scala.inline
  def apply(alg: java.lang.String, typ: java.lang.String): JWTHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alg")(alg)
    __obj.updateDynamic("typ")(typ)
    __obj.asInstanceOf[JWTHeader]
  }
}

