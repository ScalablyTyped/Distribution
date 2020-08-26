package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documentname extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var compression: js.UndefOr[typings.ipp.mod.Compression] = js.native
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  var `document-name`: js.UndefOr[String] = js.native
  var `document-natural-language`: js.UndefOr[String] = js.native
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  var `job-impressions`: js.UndefOr[Double] = js.native
  var `job-k-octets`: js.UndefOr[Double] = js.native
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  var `job-name`: js.UndefOr[String] = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `requesting-user-name`: String = js.native
}

object Documentname {
  @scala.inline
  def apply(`requesting-user-name`: String): Documentname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentname]
  }
  @scala.inline
  implicit class DocumentnameOps[Self <: Documentname] (val x: Self) extends AnyVal {
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
    def `setIpp-attribute-fidelity`(value: Boolean): Self = this.set("ipp-attribute-fidelity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIpp-attribute-fidelity`: Self = this.set("ipp-attribute-fidelity", js.undefined)
    @scala.inline
    def `setJob-impressions`(value: Double): Self = this.set("job-impressions", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions`: Self = this.set("job-impressions", js.undefined)
    @scala.inline
    def `setJob-k-octets`(value: Double): Self = this.set("job-k-octets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-k-octets`: Self = this.set("job-k-octets", js.undefined)
    @scala.inline
    def `setJob-media-sheets`(value: Double): Self = this.set("job-media-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets`: Self = this.set("job-media-sheets", js.undefined)
    @scala.inline
    def `setJob-name`(value: String): Self = this.set("job-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-name`: Self = this.set("job-name", js.undefined)
    @scala.inline
    def `setPrinter-uri`(value: String): Self = this.set("printer-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-uri`: Self = this.set("printer-uri", js.undefined)
  }
  
}

