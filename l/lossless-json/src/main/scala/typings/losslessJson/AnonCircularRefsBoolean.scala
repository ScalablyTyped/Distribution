package typings.losslessJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircularRefsBoolean extends js.Object {
  var circularRefs: Boolean
}

object AnonCircularRefsBoolean {
  @scala.inline
  def apply(circularRefs: Boolean): AnonCircularRefsBoolean = {
    val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCircularRefsBoolean]
  }
}

