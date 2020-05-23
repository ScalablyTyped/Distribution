package typings.mathjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R extends js.Object {
  var l: String
  var r: String
}

object R {
  @scala.inline
  def apply(l: String, r: String): R = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
}

