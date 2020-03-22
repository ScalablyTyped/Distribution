package typings.gun

import typings.gun.gunNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPub extends js.Object {
  var ok: `0`
  var pub: String
}

object AnonPub {
  @scala.inline
  def apply(ok: `0`, pub: String): AnonPub = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPub]
  }
}

