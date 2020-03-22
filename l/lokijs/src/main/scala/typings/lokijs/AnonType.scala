package typings.lokijs

import typings.lokijs.lokijsStrings.find
import typings.lokijs.lokijsStrings.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: find | where
  var uid: js.UndefOr[String | Double] = js.undefined
  var `val`: js.Any
}

object AnonType {
  @scala.inline
  def apply(`type`: find | where, `val`: js.Any, uid: String | Double = null): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

