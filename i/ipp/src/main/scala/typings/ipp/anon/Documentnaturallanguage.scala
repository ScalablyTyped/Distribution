package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documentnaturallanguage extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var compression: js.UndefOr[typings.ipp.mod.Compression] = js.native
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  var `document-name`: js.UndefOr[String] = js.native
  var `document-natural-language`: js.UndefOr[String] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `last-document`: Boolean = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `requesting-user-name`: String = js.native
}

object Documentnaturallanguage {
  @scala.inline
  def apply(`last-document`: Boolean, `requesting-user-name`: String): Documentnaturallanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("last-document")(`last-document`.asInstanceOf[js.Any])
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentnaturallanguage]
  }
  @scala.inline
  implicit class DocumentnaturallanguageOps[Self <: Documentnaturallanguage] (val x: Self) extends AnyVal {
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
    def `setLast-document`(value: Boolean): Self = this.set("last-document", value.asInstanceOf[js.Any])
    @scala.inline
    def `setRequesting-user-name`(value: String): Self = this.set("requesting-user-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = this.set("attributes-charset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAttributes-charset`: Self = this.set("attributes-charset", js.undefined)
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = this.set("attributes-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAttributes-natural-language`: Self = this.set("attributes-natural-language", js.undefined)
    @scala.inline
    def setCompression(value: typings.ipp.mod.Compression): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def `setDocument-format`(value: MimeMediaType): Self = this.set("document-format", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format`: Self = this.set("document-format", js.undefined)
    @scala.inline
    def `setDocument-name`(value: String): Self = this.set("document-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-name`: Self = this.set("document-name", js.undefined)
    @scala.inline
    def `setDocument-natural-language`(value: String): Self = this.set("document-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-natural-language`: Self = this.set("document-natural-language", js.undefined)
    @scala.inline
    def `setJob-id`(value: Double): Self = this.set("job-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-id`: Self = this.set("job-id", js.undefined)
    @scala.inline
    def `setJob-uri`(value: String): Self = this.set("job-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-uri`: Self = this.set("job-uri", js.undefined)
    @scala.inline
    def `setPrinter-uri`(value: String): Self = this.set("printer-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-uri`: Self = this.set("printer-uri", js.undefined)
  }
  
}

