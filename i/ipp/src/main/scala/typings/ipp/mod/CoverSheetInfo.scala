package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverSheetInfo extends js.Object {
  var `from-name`: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `organization-name`: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var `to-name`: js.UndefOr[String] = js.undefined
}

object CoverSheetInfo {
  @scala.inline
  def apply(
    `from-name`: String = null,
    logo: String = null,
    message: String = null,
    `organization-name`: String = null,
    subject: String = null,
    `to-name`: String = null
  ): CoverSheetInfo = {
    val __obj = js.Dynamic.literal()
    if (`from-name` != null) __obj.updateDynamic("from-name")(`from-name`.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`organization-name` != null) __obj.updateDynamic("organization-name")(`organization-name`.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (`to-name` != null) __obj.updateDynamic("to-name")(`to-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverSheetInfo]
  }
}

