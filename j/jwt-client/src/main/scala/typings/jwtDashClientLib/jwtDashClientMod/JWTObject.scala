package typings
package jwtDashClientLib.jwtDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTObject extends js.Object {
  var claim: js.Any
  var header: JWTHeader
  var signature: java.lang.String
}

object JWTObject {
  @scala.inline
  def apply(claim: js.Any, header: JWTHeader, signature: java.lang.String): JWTObject = {
    val __obj = js.Dynamic.literal(claim = claim, header = header, signature = signature)
  
    __obj.asInstanceOf[JWTObject]
  }
}

