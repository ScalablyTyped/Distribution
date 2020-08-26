package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDescriptionAttributes extends js.Object {
  var `current-page-order`: js.UndefOr[PageOrder] = js.native
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.native
  var `job-charge-info`: js.UndefOr[String] = js.native
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `job-message-from-operator`: js.UndefOr[String] = js.native
  var `job-message-to-operator-actual`: js.UndefOr[js.Array[String]] = js.native
  var `job-name`: js.UndefOr[String] = js.native
  var `job-save-printer-make-and-model`: js.UndefOr[String] = js.native
}

object JobDescriptionAttributes {
  @scala.inline
  def apply(): JobDescriptionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDescriptionAttributes]
  }
  @scala.inline
  implicit class JobDescriptionAttributesOps[Self <: JobDescriptionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setCurrent-page-order`(value: PageOrder): Self = this.set("current-page-order", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCurrent-page-order`: Self = this.set("current-page-order", js.undefined)
    @scala.inline
    def `setDocument-metadataVarargs`(value: String*): Self = this.set("document-metadata", js.Array(value :_*))
    @scala.inline
    def `setDocument-metadata`(value: js.Array[String]): Self = this.set("document-metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-metadata`: Self = this.set("document-metadata", js.undefined)
    @scala.inline
    def `setJob-charge-info`(value: String): Self = this.set("job-charge-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-charge-info`: Self = this.set("job-charge-info", js.undefined)
    @scala.inline
    def `setJob-mandatory-attributesVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any)*): Self = this.set("job-mandatory-attributes", js.Array(value :_*))
    @scala.inline
    def `setJob-mandatory-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = this.set("job-mandatory-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-mandatory-attributes`: Self = this.set("job-mandatory-attributes", js.undefined)
    @scala.inline
    def `setJob-message-from-operator`(value: String): Self = this.set("job-message-from-operator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-message-from-operator`: Self = this.set("job-message-from-operator", js.undefined)
    @scala.inline
    def `setJob-message-to-operator-actualVarargs`(value: String*): Self = this.set("job-message-to-operator-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-message-to-operator-actual`(value: js.Array[String]): Self = this.set("job-message-to-operator-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-message-to-operator-actual`: Self = this.set("job-message-to-operator-actual", js.undefined)
    @scala.inline
    def `setJob-name`(value: String): Self = this.set("job-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-name`: Self = this.set("job-name", js.undefined)
    @scala.inline
    def `setJob-save-printer-make-and-model`(value: String): Self = this.set("job-save-printer-make-and-model", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-save-printer-make-and-model`: Self = this.set("job-save-printer-make-and-model", js.undefined)
  }
  
}

