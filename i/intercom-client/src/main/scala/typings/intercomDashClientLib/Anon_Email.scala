package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var segment_id: js.UndefOr[java.lang.String] = js.undefined
  var tag_id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    segment_id: java.lang.String = null,
    tag_id: java.lang.String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (segment_id != null) __obj.updateDynamic("segment_id")(segment_id)
    if (tag_id != null) __obj.updateDynamic("tag_id")(tag_id)
    __obj.asInstanceOf[Anon_Email]
  }
}

