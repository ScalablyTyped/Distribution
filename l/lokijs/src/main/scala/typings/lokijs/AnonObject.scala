package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObject extends js.Object {
  var `object`: js.Any
}

object AnonObject {
  @scala.inline
  def apply(`object`: js.Any): AnonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObject]
  }
}

