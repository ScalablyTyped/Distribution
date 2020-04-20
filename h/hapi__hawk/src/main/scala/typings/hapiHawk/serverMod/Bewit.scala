package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bewit extends js.Object {
  var exp: String
  var ext: String
  var id: String
  var mac: String
}

object Bewit {
  @scala.inline
  def apply(exp: String, ext: String, id: String, mac: String): Bewit = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bewit]
  }
}

