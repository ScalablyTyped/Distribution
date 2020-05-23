package typings.losslessJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularRefsBoolean extends js.Object {
  var circularRefs: Boolean
}

object CircularRefsBoolean {
  @scala.inline
  def apply(circularRefs: Boolean): CircularRefsBoolean = {
    val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularRefsBoolean]
  }
}

