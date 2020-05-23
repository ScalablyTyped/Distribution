package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Include extends js.Object {
  var fields: js.UndefOr[String | js.Any | js.Array[_]] = js.undefined
  var include: js.UndefOr[String | js.Any | js.Array[_]] = js.undefined
}

object Include {
  @scala.inline
  def apply(fields: String | js.Any | js.Array[_] = null, include: String | js.Any | js.Array[_] = null): Include = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Include]
  }
}

