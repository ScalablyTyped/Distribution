package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFormatDetails extends js.Object {
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-device-id`: js.UndefOr[String] = js.native
  var `document-format-version`: js.UndefOr[String] = js.native
  var `document-natural-language`: js.UndefOr[js.Array[String]] = js.native
  var `document-source-application-name`: js.UndefOr[String] = js.native
  var `document-source-application-version`: js.UndefOr[String] = js.native
  var `document-source-os-name`: js.UndefOr[String] = js.native
  var `document-source-os-version`: js.UndefOr[String] = js.native
}

object DocumentFormatDetails {
  @scala.inline
  def apply(): DocumentFormatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFormatDetails]
  }
  @scala.inline
  implicit class DocumentFormatDetailsOps[Self <: DocumentFormatDetails] (val x: Self) extends AnyVal {
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
    def `setDocument-format`(value: MimeMediaType): Self = this.set("document-format", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format`: Self = this.set("document-format", js.undefined)
    @scala.inline
    def `setDocument-format-device-id`(value: String): Self = this.set("document-format-device-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-device-id`: Self = this.set("document-format-device-id", js.undefined)
    @scala.inline
    def `setDocument-format-version`(value: String): Self = this.set("document-format-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-version`: Self = this.set("document-format-version", js.undefined)
    @scala.inline
    def `setDocument-natural-languageVarargs`(value: String*): Self = this.set("document-natural-language", js.Array(value :_*))
    @scala.inline
    def `setDocument-natural-language`(value: js.Array[String]): Self = this.set("document-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-natural-language`: Self = this.set("document-natural-language", js.undefined)
    @scala.inline
    def `setDocument-source-application-name`(value: String): Self = this.set("document-source-application-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-source-application-name`: Self = this.set("document-source-application-name", js.undefined)
    @scala.inline
    def `setDocument-source-application-version`(value: String): Self = this.set("document-source-application-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-source-application-version`: Self = this.set("document-source-application-version", js.undefined)
    @scala.inline
    def `setDocument-source-os-name`(value: String): Self = this.set("document-source-os-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-source-os-name`: Self = this.set("document-source-os-name", js.undefined)
    @scala.inline
    def `setDocument-source-os-version`(value: String): Self = this.set("document-source-os-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-source-os-version`: Self = this.set("document-source-os-version", js.undefined)
  }
  
}

