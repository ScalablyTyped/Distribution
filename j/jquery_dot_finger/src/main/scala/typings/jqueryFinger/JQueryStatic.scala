package typings.jqueryFinger

import typings.jqueryFinger.JQueryFinger.JQueryFingerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var Finger: JQueryFingerOptions
}

object JQueryStatic {
  @scala.inline
  def apply(Finger: JQueryFingerOptions): JQueryStatic = {
    val __obj = js.Dynamic.literal(Finger = Finger.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

