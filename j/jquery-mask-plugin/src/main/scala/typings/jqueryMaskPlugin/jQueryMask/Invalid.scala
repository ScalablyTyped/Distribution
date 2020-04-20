package typings.jqueryMaskPlugin.jQueryMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invalid extends js.Object {
  var e: String
  var p: Double
  var v: String
}

object Invalid {
  @scala.inline
  def apply(e: String, p: Double, v: String): Invalid = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
}

