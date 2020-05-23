package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDescriptionAttributes extends js.Object {
  var `current-page-order`: js.UndefOr[PageOrder] = js.undefined
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-charge-info`: js.UndefOr[String] = js.undefined
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.undefined
  var `job-message-from-operator`: js.UndefOr[String] = js.undefined
  var `job-message-to-operator-actual`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-name`: js.UndefOr[String] = js.undefined
  var `job-save-printer-make-and-model`: js.UndefOr[String] = js.undefined
}

object JobDescriptionAttributes {
  @scala.inline
  def apply(
    `current-page-order`: PageOrder = null,
    `document-metadata`: js.Array[String] = null,
    `job-charge-info`: String = null,
    `job-mandatory-attributes`: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ] = null,
    `job-message-from-operator`: String = null,
    `job-message-to-operator-actual`: js.Array[String] = null,
    `job-name`: String = null,
    `job-save-printer-make-and-model`: String = null
  ): JobDescriptionAttributes = {
    val __obj = js.Dynamic.literal()
    if (`current-page-order` != null) __obj.updateDynamic("current-page-order")(`current-page-order`.asInstanceOf[js.Any])
    if (`document-metadata` != null) __obj.updateDynamic("document-metadata")(`document-metadata`.asInstanceOf[js.Any])
    if (`job-charge-info` != null) __obj.updateDynamic("job-charge-info")(`job-charge-info`.asInstanceOf[js.Any])
    if (`job-mandatory-attributes` != null) __obj.updateDynamic("job-mandatory-attributes")(`job-mandatory-attributes`.asInstanceOf[js.Any])
    if (`job-message-from-operator` != null) __obj.updateDynamic("job-message-from-operator")(`job-message-from-operator`.asInstanceOf[js.Any])
    if (`job-message-to-operator-actual` != null) __obj.updateDynamic("job-message-to-operator-actual")(`job-message-to-operator-actual`.asInstanceOf[js.Any])
    if (`job-name` != null) __obj.updateDynamic("job-name")(`job-name`.asInstanceOf[js.Any])
    if (`job-save-printer-make-and-model` != null) __obj.updateDynamic("job-save-printer-make-and-model")(`job-save-printer-make-and-model`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDescriptionAttributes]
  }
}

