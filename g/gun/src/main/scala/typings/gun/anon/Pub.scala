package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pub extends js.Object {
  var ok: typings.gun.gunNumbers.`0`
  var pub: String
}

object Pub {
  @scala.inline
  def apply(ok: typings.gun.gunNumbers.`0`, pub: String): Pub = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pub]
  }
}

