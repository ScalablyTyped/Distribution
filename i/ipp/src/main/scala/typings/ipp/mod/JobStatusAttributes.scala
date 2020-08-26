package typings.ipp.mod

import typings.ipp.ippStrings.collated
import typings.ipp.ippStrings.uncollated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatusAttributes extends js.Object {
  var `attributes-charset`: js.UndefOr[String] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `chamber-humidity-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `chamber-temperature-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `compression-supplied`: js.UndefOr[Compression] = js.native
  var `copies-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `cover-back-actual`: js.UndefOr[js.Array[Cover]] = js.native
  var `cover-front-actual`: js.UndefOr[js.Array[Cover]] = js.native
  var `date-time-at-completed`: js.UndefOr[String] = js.native
  var `date-time-at-creation`: js.UndefOr[String] = js.native
  var `date-time-at-processing`: js.UndefOr[String] = js.native
  var `destination-statuses`: js.UndefOr[js.Array[DestinationStatuses]] = js.native
  var `document-charset-supplied`: js.UndefOr[String] = js.native
  var `document-digital-signature-supplied`: js.UndefOr[DocumentDigitalSignature] = js.native
  var `document-format-details-supplied`: js.UndefOr[DocumentFormatDetails] = js.native
  var `document-format-ready`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `document-format-supplied`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-version-supplied`: js.UndefOr[String] = js.native
  var `document-message-supplied`: js.UndefOr[String] = js.native
  var `document-name-supplied`: js.UndefOr[String] = js.native
  var `document-natural-language-supplied`: js.UndefOr[String] = js.native
  var `errors-count`: js.UndefOr[Double] = js.native
  var `finishings-actual`: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-col-actual`: js.UndefOr[js.Array[FinishingsInterface]] = js.native
  var `force-front-side-actual`: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var `imposition-template-actual`: js.UndefOr[js.Array[ImpositionTemplate]] = js.native
  var `input-attributes-actual`: js.UndefOr[InputAttributes] = js.native
  var `insert-sheet-actual`: js.UndefOr[js.Array[InsertSheet]] = js.native
  var `job-account-id-actual`: js.UndefOr[js.Array[String]] = js.native
  var `job-account-type-actual`: js.UndefOr[JobAccountType] = js.native
  var `job-accounting-sheets-actual`: js.UndefOr[js.Array[JobAccontingSheets]] = js.native
  var `job-accounting-user-id-actual`: js.UndefOr[js.Array[String]] = js.native
  var `job-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  var `job-detailed-status-messages`: js.UndefOr[js.Array[String]] = js.native
  var `job-document-access-errors`: js.UndefOr[js.Array[String]] = js.native
  var `job-error-sheet-actual`: js.UndefOr[js.Array[JobErrorSheet]] = js.native
  var `job-hold-until-actual`: js.UndefOr[js.Array[JobHoldUntil]] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-impressions`: js.UndefOr[Double] = js.native
  var `job-impressions-col`: js.UndefOr[Impressions] = js.native
  var `job-impressions-completed`: js.UndefOr[Double] = js.native
  var `job-impressions-completed-col`: js.UndefOr[Impressions] = js.native
  var `job-k-octets`: js.UndefOr[Double] = js.native
  var `job-k-octets-processed`: js.UndefOr[Double] = js.native
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  var `job-media-sheets-col`: js.UndefOr[MediaSheets] = js.native
  var `job-media-sheets-completed`: js.UndefOr[Double] = js.native
  var `job-media-sheets-completed-col`: js.UndefOr[Impressions] = js.native
  var `job-more-info`: js.UndefOr[String] = js.native
  var `job-originating-user-name`: js.UndefOr[String] = js.native
  var `job-originating-user-uri`: js.UndefOr[String] = js.native
  var `job-pages`: js.UndefOr[Double] = js.native
  var `job-pages-col`: js.UndefOr[Pages] = js.native
  var `job-pages-completed`: js.UndefOr[Double] = js.native
  var `job-pages-completed-col`: js.UndefOr[Pages] = js.native
  var `job-pages-completed-current-copy`: js.UndefOr[Double] = js.native
  var `job-printer-up-time`: js.UndefOr[Double] = js.native
  var `job-printer-uri`: js.UndefOr[String] = js.native
  var `job-priority-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `job-resource-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `job-sheet-message-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `job-sheets-actual`: js.UndefOr[js.Array[JobSheets]] = js.native
  var `job-sheets-col-actual`: js.UndefOr[js.Array[JobSheetsInterface]] = js.native
  var `job-state`: js.UndefOr[JobState] = js.native
  var `job-state-message`: js.UndefOr[String] = js.native
  var `job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `job-uuid`: js.UndefOr[String] = js.native
  var `materials-col-actual`: js.UndefOr[js.Array[Materials]] = js.native
  var `media-actual`: js.UndefOr[js.Array[String]] = js.native
  var `media-col-actual`: js.UndefOr[js.Array[MediaInterface]] = js.native
  var `media-input-tray-check-actual`: js.UndefOr[js.Array[String]] = js.native
  var `multiple-document-handling-actual`: js.UndefOr[js.Array[MultipleDocumentHandling]] = js.native
  var `multiple-object-handling-actual`: js.UndefOr[MultipleObjectHandling] = js.native
  var `number-of-documents`: js.UndefOr[Double] = js.native
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.native
  var `number-up-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `orientation-requested-actual`: js.UndefOr[js.Array[OrientationRequested]] = js.native
  var `original-requesting-user-name`: js.UndefOr[String] = js.native
  var `output-attributes-actual`: js.UndefOr[OutputAttributes] = js.native
  var `output-bin-actual`: js.UndefOr[js.Array[OutputBin]] = js.native
  var `output-device-actual`: js.UndefOr[js.Array[String]] = js.native
  var `output-device-assigned`: js.UndefOr[String] = js.native
  var `output-device-job-state`: js.UndefOr[JobState] = js.native
  var `output-device-job-state-message`: js.UndefOr[String] = js.native
  var `output-device-job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.native
  var `output-device-uuid-assigned`: js.UndefOr[String] = js.native
  var `overrides-actual`: js.UndefOr[js.Array[Overrides]] = js.native
  var `page-delivery-actual`: js.UndefOr[js.Array[PageDelivery]] = js.native
  var `page-order-received-actual`: js.UndefOr[js.Array[PageOrder]] = js.native
  var `page-ranges-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `platform-temperature-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `presentation-direction-number-up-actual`: js.UndefOr[js.Array[PresentationDirectionNumberUp]] = js.native
  var `print-accuracy-actual`: js.UndefOr[PrintAccuracy] = js.native
  var `print-base-actual`: js.UndefOr[js.Array[PrintBase]] = js.native
  var `print-color-mode-actual`: js.UndefOr[js.Array[PrintColorMode]] = js.native
  var `print-content-optimize-actual`: js.UndefOr[js.Array[PrintContentOptimize]] = js.native
  var `print-objects-actual`: js.UndefOr[js.Array[PrintObjects]] = js.native
  var `print-quality-actual`: js.UndefOr[js.Array[PrintQuality]] = js.native
  var `print-rendering-intent-actual`: js.UndefOr[js.Array[PrintRenderingIntent]] = js.native
  var `print-supports-actual`: js.UndefOr[js.Array[PrintSupports]] = js.native
  var `printer-resolution-actual`: js.UndefOr[js.Array[Resolution]] = js.native
  var `separator-sheets-actual`: js.UndefOr[js.Array[SeparatorSheets]] = js.native
  var `sheet-collate-actual`: js.UndefOr[js.Array[collated | uncollated]] = js.native
  var `sides-actual`: js.UndefOr[js.Array[Sides]] = js.native
  var `time-at-completed`: js.UndefOr[Double] = js.native
  var `time-at-creation`: js.UndefOr[Double] = js.native
  var `time-at-processing`: js.UndefOr[Double] = js.native
  var `warnings-count`: js.UndefOr[Double] = js.native
  var `x-image-position-actual`: js.UndefOr[js.Array[XImagePosition]] = js.native
  var `x-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `x-side1-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `x-side2-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `y-image-position-actual`: js.UndefOr[js.Array[YImagePosition]] = js.native
  var `y-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `y-side1-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `y-side2-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
}

object JobStatusAttributes {
  @scala.inline
  def apply(): JobStatusAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatusAttributes]
  }
  @scala.inline
  implicit class JobStatusAttributesOps[Self <: JobStatusAttributes] (val x: Self) extends AnyVal {
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
    def `setAttributes-charset`(value: String): Self = this.set("attributes-charset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAttributes-charset`: Self = this.set("attributes-charset", js.undefined)
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = this.set("attributes-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAttributes-natural-language`: Self = this.set("attributes-natural-language", js.undefined)
    @scala.inline
    def `setChamber-humidity-actualVarargs`(value: Double*): Self = this.set("chamber-humidity-actual", js.Array(value :_*))
    @scala.inline
    def `setChamber-humidity-actual`(value: js.Array[Double]): Self = this.set("chamber-humidity-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-humidity-actual`: Self = this.set("chamber-humidity-actual", js.undefined)
    @scala.inline
    def `setChamber-temperature-actualVarargs`(value: Double*): Self = this.set("chamber-temperature-actual", js.Array(value :_*))
    @scala.inline
    def `setChamber-temperature-actual`(value: js.Array[Double]): Self = this.set("chamber-temperature-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-temperature-actual`: Self = this.set("chamber-temperature-actual", js.undefined)
    @scala.inline
    def `setCompression-supplied`(value: Compression): Self = this.set("compression-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCompression-supplied`: Self = this.set("compression-supplied", js.undefined)
    @scala.inline
    def `setCopies-actualVarargs`(value: Double*): Self = this.set("copies-actual", js.Array(value :_*))
    @scala.inline
    def `setCopies-actual`(value: js.Array[Double]): Self = this.set("copies-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCopies-actual`: Self = this.set("copies-actual", js.undefined)
    @scala.inline
    def `setCover-back-actualVarargs`(value: Cover*): Self = this.set("cover-back-actual", js.Array(value :_*))
    @scala.inline
    def `setCover-back-actual`(value: js.Array[Cover]): Self = this.set("cover-back-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-back-actual`: Self = this.set("cover-back-actual", js.undefined)
    @scala.inline
    def `setCover-front-actualVarargs`(value: Cover*): Self = this.set("cover-front-actual", js.Array(value :_*))
    @scala.inline
    def `setCover-front-actual`(value: js.Array[Cover]): Self = this.set("cover-front-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-front-actual`: Self = this.set("cover-front-actual", js.undefined)
    @scala.inline
    def `setDate-time-at-completed`(value: String): Self = this.set("date-time-at-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDate-time-at-completed`: Self = this.set("date-time-at-completed", js.undefined)
    @scala.inline
    def `setDate-time-at-creation`(value: String): Self = this.set("date-time-at-creation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDate-time-at-creation`: Self = this.set("date-time-at-creation", js.undefined)
    @scala.inline
    def `setDate-time-at-processing`(value: String): Self = this.set("date-time-at-processing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDate-time-at-processing`: Self = this.set("date-time-at-processing", js.undefined)
    @scala.inline
    def `setDestination-statusesVarargs`(value: DestinationStatuses*): Self = this.set("destination-statuses", js.Array(value :_*))
    @scala.inline
    def `setDestination-statuses`(value: js.Array[DestinationStatuses]): Self = this.set("destination-statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-statuses`: Self = this.set("destination-statuses", js.undefined)
    @scala.inline
    def `setDocument-charset-supplied`(value: String): Self = this.set("document-charset-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-charset-supplied`: Self = this.set("document-charset-supplied", js.undefined)
    @scala.inline
    def `setDocument-digital-signature-supplied`(value: DocumentDigitalSignature): Self = this.set("document-digital-signature-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-digital-signature-supplied`: Self = this.set("document-digital-signature-supplied", js.undefined)
    @scala.inline
    def `setDocument-format-details-supplied`(value: DocumentFormatDetails): Self = this.set("document-format-details-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-details-supplied`: Self = this.set("document-format-details-supplied", js.undefined)
    @scala.inline
    def `setDocument-format-readyVarargs`(value: MimeMediaType*): Self = this.set("document-format-ready", js.Array(value :_*))
    @scala.inline
    def `setDocument-format-ready`(value: js.Array[MimeMediaType]): Self = this.set("document-format-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-ready`: Self = this.set("document-format-ready", js.undefined)
    @scala.inline
    def `setDocument-format-supplied`(value: MimeMediaType): Self = this.set("document-format-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-supplied`: Self = this.set("document-format-supplied", js.undefined)
    @scala.inline
    def `setDocument-format-version-supplied`(value: String): Self = this.set("document-format-version-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-version-supplied`: Self = this.set("document-format-version-supplied", js.undefined)
    @scala.inline
    def `setDocument-message-supplied`(value: String): Self = this.set("document-message-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-message-supplied`: Self = this.set("document-message-supplied", js.undefined)
    @scala.inline
    def `setDocument-name-supplied`(value: String): Self = this.set("document-name-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-name-supplied`: Self = this.set("document-name-supplied", js.undefined)
    @scala.inline
    def `setDocument-natural-language-supplied`(value: String): Self = this.set("document-natural-language-supplied", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-natural-language-supplied`: Self = this.set("document-natural-language-supplied", js.undefined)
    @scala.inline
    def `setErrors-count`(value: Double): Self = this.set("errors-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteErrors-count`: Self = this.set("errors-count", js.undefined)
    @scala.inline
    def `setFinishings-actualVarargs`(value: Finishings*): Self = this.set("finishings-actual", js.Array(value :_*))
    @scala.inline
    def `setFinishings-actual`(value: js.Array[Finishings]): Self = this.set("finishings-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-actual`: Self = this.set("finishings-actual", js.undefined)
    @scala.inline
    def `setFinishings-col-actualVarargs`(value: FinishingsInterface*): Self = this.set("finishings-col-actual", js.Array(value :_*))
    @scala.inline
    def `setFinishings-col-actual`(value: js.Array[FinishingsInterface]): Self = this.set("finishings-col-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-col-actual`: Self = this.set("finishings-col-actual", js.undefined)
    @scala.inline
    def `setForce-front-side-actualVarargs`(value: js.Array[Double]*): Self = this.set("force-front-side-actual", js.Array(value :_*))
    @scala.inline
    def `setForce-front-side-actual`(value: js.Array[js.Array[Double]]): Self = this.set("force-front-side-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteForce-front-side-actual`: Self = this.set("force-front-side-actual", js.undefined)
    @scala.inline
    def `setImposition-template-actualVarargs`(value: ImpositionTemplate*): Self = this.set("imposition-template-actual", js.Array(value :_*))
    @scala.inline
    def `setImposition-template-actual`(value: js.Array[ImpositionTemplate]): Self = this.set("imposition-template-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImposition-template-actual`: Self = this.set("imposition-template-actual", js.undefined)
    @scala.inline
    def `setInput-attributes-actual`(value: InputAttributes): Self = this.set("input-attributes-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-attributes-actual`: Self = this.set("input-attributes-actual", js.undefined)
    @scala.inline
    def `setInsert-sheet-actualVarargs`(value: InsertSheet*): Self = this.set("insert-sheet-actual", js.Array(value :_*))
    @scala.inline
    def `setInsert-sheet-actual`(value: js.Array[InsertSheet]): Self = this.set("insert-sheet-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-sheet-actual`: Self = this.set("insert-sheet-actual", js.undefined)
    @scala.inline
    def `setJob-account-id-actualVarargs`(value: String*): Self = this.set("job-account-id-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-account-id-actual`(value: js.Array[String]): Self = this.set("job-account-id-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-id-actual`: Self = this.set("job-account-id-actual", js.undefined)
    @scala.inline
    def `setJob-account-type-actual`(value: JobAccountType): Self = this.set("job-account-type-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-type-actual`: Self = this.set("job-account-type-actual", js.undefined)
    @scala.inline
    def `setJob-accounting-sheets-actualVarargs`(value: JobAccontingSheets*): Self = this.set("job-accounting-sheets-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-accounting-sheets-actual`(value: js.Array[JobAccontingSheets]): Self = this.set("job-accounting-sheets-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-sheets-actual`: Self = this.set("job-accounting-sheets-actual", js.undefined)
    @scala.inline
    def `setJob-accounting-user-id-actualVarargs`(value: String*): Self = this.set("job-accounting-user-id-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-accounting-user-id-actual`(value: js.Array[String]): Self = this.set("job-accounting-user-id-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-user-id-actual`: Self = this.set("job-accounting-user-id-actual", js.undefined)
    @scala.inline
    def `setJob-attribute-fidelity`(value: Boolean): Self = this.set("job-attribute-fidelity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-attribute-fidelity`: Self = this.set("job-attribute-fidelity", js.undefined)
    @scala.inline
    def `setJob-detailed-status-messagesVarargs`(value: String*): Self = this.set("job-detailed-status-messages", js.Array(value :_*))
    @scala.inline
    def `setJob-detailed-status-messages`(value: js.Array[String]): Self = this.set("job-detailed-status-messages", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-detailed-status-messages`: Self = this.set("job-detailed-status-messages", js.undefined)
    @scala.inline
    def `setJob-document-access-errorsVarargs`(value: String*): Self = this.set("job-document-access-errors", js.Array(value :_*))
    @scala.inline
    def `setJob-document-access-errors`(value: js.Array[String]): Self = this.set("job-document-access-errors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-document-access-errors`: Self = this.set("job-document-access-errors", js.undefined)
    @scala.inline
    def `setJob-error-sheet-actualVarargs`(value: JobErrorSheet*): Self = this.set("job-error-sheet-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-error-sheet-actual`(value: js.Array[JobErrorSheet]): Self = this.set("job-error-sheet-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-sheet-actual`: Self = this.set("job-error-sheet-actual", js.undefined)
    @scala.inline
    def `setJob-hold-until-actualVarargs`(value: JobHoldUntil*): Self = this.set("job-hold-until-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-hold-until-actual`(value: js.Array[JobHoldUntil]): Self = this.set("job-hold-until-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until-actual`: Self = this.set("job-hold-until-actual", js.undefined)
    @scala.inline
    def `setJob-id`(value: Double): Self = this.set("job-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-id`: Self = this.set("job-id", js.undefined)
    @scala.inline
    def `setJob-impressions`(value: Double): Self = this.set("job-impressions", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions`: Self = this.set("job-impressions", js.undefined)
    @scala.inline
    def `setJob-impressions-col`(value: Impressions): Self = this.set("job-impressions-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions-col`: Self = this.set("job-impressions-col", js.undefined)
    @scala.inline
    def `setJob-impressions-completed`(value: Double): Self = this.set("job-impressions-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions-completed`: Self = this.set("job-impressions-completed", js.undefined)
    @scala.inline
    def `setJob-impressions-completed-col`(value: Impressions): Self = this.set("job-impressions-completed-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions-completed-col`: Self = this.set("job-impressions-completed-col", js.undefined)
    @scala.inline
    def `setJob-k-octets`(value: Double): Self = this.set("job-k-octets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-k-octets`: Self = this.set("job-k-octets", js.undefined)
    @scala.inline
    def `setJob-k-octets-processed`(value: Double): Self = this.set("job-k-octets-processed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-k-octets-processed`: Self = this.set("job-k-octets-processed", js.undefined)
    @scala.inline
    def `setJob-media-sheets`(value: Double): Self = this.set("job-media-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets`: Self = this.set("job-media-sheets", js.undefined)
    @scala.inline
    def `setJob-media-sheets-col`(value: MediaSheets): Self = this.set("job-media-sheets-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets-col`: Self = this.set("job-media-sheets-col", js.undefined)
    @scala.inline
    def `setJob-media-sheets-completed`(value: Double): Self = this.set("job-media-sheets-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets-completed`: Self = this.set("job-media-sheets-completed", js.undefined)
    @scala.inline
    def `setJob-media-sheets-completed-col`(value: Impressions): Self = this.set("job-media-sheets-completed-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets-completed-col`: Self = this.set("job-media-sheets-completed-col", js.undefined)
    @scala.inline
    def `setJob-more-info`(value: String): Self = this.set("job-more-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-more-info`: Self = this.set("job-more-info", js.undefined)
    @scala.inline
    def `setJob-originating-user-name`(value: String): Self = this.set("job-originating-user-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-originating-user-name`: Self = this.set("job-originating-user-name", js.undefined)
    @scala.inline
    def `setJob-originating-user-uri`(value: String): Self = this.set("job-originating-user-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-originating-user-uri`: Self = this.set("job-originating-user-uri", js.undefined)
    @scala.inline
    def `setJob-pages`(value: Double): Self = this.set("job-pages", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages`: Self = this.set("job-pages", js.undefined)
    @scala.inline
    def `setJob-pages-col`(value: Pages): Self = this.set("job-pages-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-col`: Self = this.set("job-pages-col", js.undefined)
    @scala.inline
    def `setJob-pages-completed`(value: Double): Self = this.set("job-pages-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-completed`: Self = this.set("job-pages-completed", js.undefined)
    @scala.inline
    def `setJob-pages-completed-col`(value: Pages): Self = this.set("job-pages-completed-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-completed-col`: Self = this.set("job-pages-completed-col", js.undefined)
    @scala.inline
    def `setJob-pages-completed-current-copy`(value: Double): Self = this.set("job-pages-completed-current-copy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-completed-current-copy`: Self = this.set("job-pages-completed-current-copy", js.undefined)
    @scala.inline
    def `setJob-printer-up-time`(value: Double): Self = this.set("job-printer-up-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-printer-up-time`: Self = this.set("job-printer-up-time", js.undefined)
    @scala.inline
    def `setJob-printer-uri`(value: String): Self = this.set("job-printer-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-printer-uri`: Self = this.set("job-printer-uri", js.undefined)
    @scala.inline
    def `setJob-priority-actualVarargs`(value: Double*): Self = this.set("job-priority-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-priority-actual`(value: js.Array[Double]): Self = this.set("job-priority-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-priority-actual`: Self = this.set("job-priority-actual", js.undefined)
    @scala.inline
    def `setJob-resource-idsVarargs`(value: Double*): Self = this.set("job-resource-ids", js.Array(value :_*))
    @scala.inline
    def `setJob-resource-ids`(value: js.Array[Double]): Self = this.set("job-resource-ids", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-resource-ids`: Self = this.set("job-resource-ids", js.undefined)
    @scala.inline
    def `setJob-sheet-message-actualVarargs`(value: Double*): Self = this.set("job-sheet-message-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-sheet-message-actual`(value: js.Array[Double]): Self = this.set("job-sheet-message-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheet-message-actual`: Self = this.set("job-sheet-message-actual", js.undefined)
    @scala.inline
    def `setJob-sheets-actualVarargs`(value: JobSheets*): Self = this.set("job-sheets-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-sheets-actual`(value: js.Array[JobSheets]): Self = this.set("job-sheets-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-actual`: Self = this.set("job-sheets-actual", js.undefined)
    @scala.inline
    def `setJob-sheets-col-actualVarargs`(value: JobSheetsInterface*): Self = this.set("job-sheets-col-actual", js.Array(value :_*))
    @scala.inline
    def `setJob-sheets-col-actual`(value: js.Array[JobSheetsInterface]): Self = this.set("job-sheets-col-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-col-actual`: Self = this.set("job-sheets-col-actual", js.undefined)
    @scala.inline
    def `setJob-state`(value: JobState): Self = this.set("job-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-state`: Self = this.set("job-state", js.undefined)
    @scala.inline
    def `setJob-state-message`(value: String): Self = this.set("job-state-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-state-message`: Self = this.set("job-state-message", js.undefined)
    @scala.inline
    def `setJob-state-reasonsVarargs`(value: JobStateReasons*): Self = this.set("job-state-reasons", js.Array(value :_*))
    @scala.inline
    def `setJob-state-reasons`(value: js.Array[JobStateReasons]): Self = this.set("job-state-reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-state-reasons`: Self = this.set("job-state-reasons", js.undefined)
    @scala.inline
    def `setJob-uri`(value: String): Self = this.set("job-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-uri`: Self = this.set("job-uri", js.undefined)
    @scala.inline
    def `setJob-uuid`(value: String): Self = this.set("job-uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-uuid`: Self = this.set("job-uuid", js.undefined)
    @scala.inline
    def `setMaterials-col-actualVarargs`(value: Materials*): Self = this.set("materials-col-actual", js.Array(value :_*))
    @scala.inline
    def `setMaterials-col-actual`(value: js.Array[Materials]): Self = this.set("materials-col-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterials-col-actual`: Self = this.set("materials-col-actual", js.undefined)
    @scala.inline
    def `setMedia-actualVarargs`(value: String*): Self = this.set("media-actual", js.Array(value :_*))
    @scala.inline
    def `setMedia-actual`(value: js.Array[String]): Self = this.set("media-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-actual`: Self = this.set("media-actual", js.undefined)
    @scala.inline
    def `setMedia-col-actualVarargs`(value: MediaInterface*): Self = this.set("media-col-actual", js.Array(value :_*))
    @scala.inline
    def `setMedia-col-actual`(value: js.Array[MediaInterface]): Self = this.set("media-col-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col-actual`: Self = this.set("media-col-actual", js.undefined)
    @scala.inline
    def `setMedia-input-tray-check-actualVarargs`(value: String*): Self = this.set("media-input-tray-check-actual", js.Array(value :_*))
    @scala.inline
    def `setMedia-input-tray-check-actual`(value: js.Array[String]): Self = this.set("media-input-tray-check-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-input-tray-check-actual`: Self = this.set("media-input-tray-check-actual", js.undefined)
    @scala.inline
    def `setMultiple-document-handling-actualVarargs`(value: MultipleDocumentHandling*): Self = this.set("multiple-document-handling-actual", js.Array(value :_*))
    @scala.inline
    def `setMultiple-document-handling-actual`(value: js.Array[MultipleDocumentHandling]): Self = this.set("multiple-document-handling-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-document-handling-actual`: Self = this.set("multiple-document-handling-actual", js.undefined)
    @scala.inline
    def `setMultiple-object-handling-actual`(value: MultipleObjectHandling): Self = this.set("multiple-object-handling-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-object-handling-actual`: Self = this.set("multiple-object-handling-actual", js.undefined)
    @scala.inline
    def `setNumber-of-documents`(value: Double): Self = this.set("number-of-documents", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-of-documents`: Self = this.set("number-of-documents", js.undefined)
    @scala.inline
    def `setNumber-of-intervening-jobs`(value: Double): Self = this.set("number-of-intervening-jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-of-intervening-jobs`: Self = this.set("number-of-intervening-jobs", js.undefined)
    @scala.inline
    def `setNumber-up-actualVarargs`(value: Double*): Self = this.set("number-up-actual", js.Array(value :_*))
    @scala.inline
    def `setNumber-up-actual`(value: js.Array[Double]): Self = this.set("number-up-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-up-actual`: Self = this.set("number-up-actual", js.undefined)
    @scala.inline
    def `setOrientation-requested-actualVarargs`(value: OrientationRequested*): Self = this.set("orientation-requested-actual", js.Array(value :_*))
    @scala.inline
    def `setOrientation-requested-actual`(value: js.Array[OrientationRequested]): Self = this.set("orientation-requested-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOrientation-requested-actual`: Self = this.set("orientation-requested-actual", js.undefined)
    @scala.inline
    def `setOriginal-requesting-user-name`(value: String): Self = this.set("original-requesting-user-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOriginal-requesting-user-name`: Self = this.set("original-requesting-user-name", js.undefined)
    @scala.inline
    def `setOutput-attributes-actual`(value: OutputAttributes): Self = this.set("output-attributes-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-attributes-actual`: Self = this.set("output-attributes-actual", js.undefined)
    @scala.inline
    def `setOutput-bin-actualVarargs`(value: OutputBin*): Self = this.set("output-bin-actual", js.Array(value :_*))
    @scala.inline
    def `setOutput-bin-actual`(value: js.Array[OutputBin]): Self = this.set("output-bin-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-bin-actual`: Self = this.set("output-bin-actual", js.undefined)
    @scala.inline
    def `setOutput-device-actualVarargs`(value: String*): Self = this.set("output-device-actual", js.Array(value :_*))
    @scala.inline
    def `setOutput-device-actual`(value: js.Array[String]): Self = this.set("output-device-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-actual`: Self = this.set("output-device-actual", js.undefined)
    @scala.inline
    def `setOutput-device-assigned`(value: String): Self = this.set("output-device-assigned", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-assigned`: Self = this.set("output-device-assigned", js.undefined)
    @scala.inline
    def `setOutput-device-job-state`(value: JobState): Self = this.set("output-device-job-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-job-state`: Self = this.set("output-device-job-state", js.undefined)
    @scala.inline
    def `setOutput-device-job-state-message`(value: String): Self = this.set("output-device-job-state-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-job-state-message`: Self = this.set("output-device-job-state-message", js.undefined)
    @scala.inline
    def `setOutput-device-job-state-reasonsVarargs`(value: JobStateReasons*): Self = this.set("output-device-job-state-reasons", js.Array(value :_*))
    @scala.inline
    def `setOutput-device-job-state-reasons`(value: js.Array[JobStateReasons]): Self = this.set("output-device-job-state-reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-job-state-reasons`: Self = this.set("output-device-job-state-reasons", js.undefined)
    @scala.inline
    def `setOutput-device-uuid-assigned`(value: String): Self = this.set("output-device-uuid-assigned", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-uuid-assigned`: Self = this.set("output-device-uuid-assigned", js.undefined)
    @scala.inline
    def `setOverrides-actualVarargs`(value: Overrides*): Self = this.set("overrides-actual", js.Array(value :_*))
    @scala.inline
    def `setOverrides-actual`(value: js.Array[Overrides]): Self = this.set("overrides-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverrides-actual`: Self = this.set("overrides-actual", js.undefined)
    @scala.inline
    def `setPage-delivery-actualVarargs`(value: PageDelivery*): Self = this.set("page-delivery-actual", js.Array(value :_*))
    @scala.inline
    def `setPage-delivery-actual`(value: js.Array[PageDelivery]): Self = this.set("page-delivery-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-delivery-actual`: Self = this.set("page-delivery-actual", js.undefined)
    @scala.inline
    def `setPage-order-received-actualVarargs`(value: PageOrder*): Self = this.set("page-order-received-actual", js.Array(value :_*))
    @scala.inline
    def `setPage-order-received-actual`(value: js.Array[PageOrder]): Self = this.set("page-order-received-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-order-received-actual`: Self = this.set("page-order-received-actual", js.undefined)
    @scala.inline
    def `setPage-ranges-actualVarargs`(value: Double*): Self = this.set("page-ranges-actual", js.Array(value :_*))
    @scala.inline
    def `setPage-ranges-actual`(value: js.Array[Double]): Self = this.set("page-ranges-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-ranges-actual`: Self = this.set("page-ranges-actual", js.undefined)
    @scala.inline
    def `setPlatform-temperature-actualVarargs`(value: Double*): Self = this.set("platform-temperature-actual", js.Array(value :_*))
    @scala.inline
    def `setPlatform-temperature-actual`(value: js.Array[Double]): Self = this.set("platform-temperature-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlatform-temperature-actual`: Self = this.set("platform-temperature-actual", js.undefined)
    @scala.inline
    def `setPresentation-direction-number-up-actualVarargs`(value: PresentationDirectionNumberUp*): Self = this.set("presentation-direction-number-up-actual", js.Array(value :_*))
    @scala.inline
    def `setPresentation-direction-number-up-actual`(value: js.Array[PresentationDirectionNumberUp]): Self = this.set("presentation-direction-number-up-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePresentation-direction-number-up-actual`: Self = this.set("presentation-direction-number-up-actual", js.undefined)
    @scala.inline
    def `setPrint-accuracy-actual`(value: PrintAccuracy): Self = this.set("print-accuracy-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-accuracy-actual`: Self = this.set("print-accuracy-actual", js.undefined)
    @scala.inline
    def `setPrint-base-actualVarargs`(value: PrintBase*): Self = this.set("print-base-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-base-actual`(value: js.Array[PrintBase]): Self = this.set("print-base-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-base-actual`: Self = this.set("print-base-actual", js.undefined)
    @scala.inline
    def `setPrint-color-mode-actualVarargs`(value: PrintColorMode*): Self = this.set("print-color-mode-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-color-mode-actual`(value: js.Array[PrintColorMode]): Self = this.set("print-color-mode-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-color-mode-actual`: Self = this.set("print-color-mode-actual", js.undefined)
    @scala.inline
    def `setPrint-content-optimize-actualVarargs`(value: PrintContentOptimize*): Self = this.set("print-content-optimize-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-content-optimize-actual`(value: js.Array[PrintContentOptimize]): Self = this.set("print-content-optimize-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-content-optimize-actual`: Self = this.set("print-content-optimize-actual", js.undefined)
    @scala.inline
    def `setPrint-objects-actualVarargs`(value: PrintObjects*): Self = this.set("print-objects-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-objects-actual`(value: js.Array[PrintObjects]): Self = this.set("print-objects-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-objects-actual`: Self = this.set("print-objects-actual", js.undefined)
    @scala.inline
    def `setPrint-quality-actualVarargs`(value: PrintQuality*): Self = this.set("print-quality-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-quality-actual`(value: js.Array[PrintQuality]): Self = this.set("print-quality-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-quality-actual`: Self = this.set("print-quality-actual", js.undefined)
    @scala.inline
    def `setPrint-rendering-intent-actualVarargs`(value: PrintRenderingIntent*): Self = this.set("print-rendering-intent-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-rendering-intent-actual`(value: js.Array[PrintRenderingIntent]): Self = this.set("print-rendering-intent-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-rendering-intent-actual`: Self = this.set("print-rendering-intent-actual", js.undefined)
    @scala.inline
    def `setPrint-supports-actualVarargs`(value: PrintSupports*): Self = this.set("print-supports-actual", js.Array(value :_*))
    @scala.inline
    def `setPrint-supports-actual`(value: js.Array[PrintSupports]): Self = this.set("print-supports-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-supports-actual`: Self = this.set("print-supports-actual", js.undefined)
    @scala.inline
    def `setPrinter-resolution-actualVarargs`(value: Resolution*): Self = this.set("printer-resolution-actual", js.Array(value :_*))
    @scala.inline
    def `setPrinter-resolution-actual`(value: js.Array[Resolution]): Self = this.set("printer-resolution-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-resolution-actual`: Self = this.set("printer-resolution-actual", js.undefined)
    @scala.inline
    def `setSeparator-sheets-actualVarargs`(value: SeparatorSheets*): Self = this.set("separator-sheets-actual", js.Array(value :_*))
    @scala.inline
    def `setSeparator-sheets-actual`(value: js.Array[SeparatorSheets]): Self = this.set("separator-sheets-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSeparator-sheets-actual`: Self = this.set("separator-sheets-actual", js.undefined)
    @scala.inline
    def `setSheet-collate-actualVarargs`(value: (collated | uncollated)*): Self = this.set("sheet-collate-actual", js.Array(value :_*))
    @scala.inline
    def `setSheet-collate-actual`(value: js.Array[collated | uncollated]): Self = this.set("sheet-collate-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSheet-collate-actual`: Self = this.set("sheet-collate-actual", js.undefined)
    @scala.inline
    def `setSides-actualVarargs`(value: Sides*): Self = this.set("sides-actual", js.Array(value :_*))
    @scala.inline
    def `setSides-actual`(value: js.Array[Sides]): Self = this.set("sides-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSides-actual`: Self = this.set("sides-actual", js.undefined)
    @scala.inline
    def `setTime-at-completed`(value: Double): Self = this.set("time-at-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTime-at-completed`: Self = this.set("time-at-completed", js.undefined)
    @scala.inline
    def `setTime-at-creation`(value: Double): Self = this.set("time-at-creation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTime-at-creation`: Self = this.set("time-at-creation", js.undefined)
    @scala.inline
    def `setTime-at-processing`(value: Double): Self = this.set("time-at-processing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTime-at-processing`: Self = this.set("time-at-processing", js.undefined)
    @scala.inline
    def `setWarnings-count`(value: Double): Self = this.set("warnings-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWarnings-count`: Self = this.set("warnings-count", js.undefined)
    @scala.inline
    def `setX-image-position-actualVarargs`(value: XImagePosition*): Self = this.set("x-image-position-actual", js.Array(value :_*))
    @scala.inline
    def `setX-image-position-actual`(value: js.Array[XImagePosition]): Self = this.set("x-image-position-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-position-actual`: Self = this.set("x-image-position-actual", js.undefined)
    @scala.inline
    def `setX-image-shift-actualVarargs`(value: Double*): Self = this.set("x-image-shift-actual", js.Array(value :_*))
    @scala.inline
    def `setX-image-shift-actual`(value: js.Array[Double]): Self = this.set("x-image-shift-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-shift-actual`: Self = this.set("x-image-shift-actual", js.undefined)
    @scala.inline
    def `setX-side1-image-shift-actualVarargs`(value: Double*): Self = this.set("x-side1-image-shift-actual", js.Array(value :_*))
    @scala.inline
    def `setX-side1-image-shift-actual`(value: js.Array[Double]): Self = this.set("x-side1-image-shift-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side1-image-shift-actual`: Self = this.set("x-side1-image-shift-actual", js.undefined)
    @scala.inline
    def `setX-side2-image-shift-actualVarargs`(value: Double*): Self = this.set("x-side2-image-shift-actual", js.Array(value :_*))
    @scala.inline
    def `setX-side2-image-shift-actual`(value: js.Array[Double]): Self = this.set("x-side2-image-shift-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side2-image-shift-actual`: Self = this.set("x-side2-image-shift-actual", js.undefined)
    @scala.inline
    def `setY-image-position-actualVarargs`(value: YImagePosition*): Self = this.set("y-image-position-actual", js.Array(value :_*))
    @scala.inline
    def `setY-image-position-actual`(value: js.Array[YImagePosition]): Self = this.set("y-image-position-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-position-actual`: Self = this.set("y-image-position-actual", js.undefined)
    @scala.inline
    def `setY-image-shift-actualVarargs`(value: Double*): Self = this.set("y-image-shift-actual", js.Array(value :_*))
    @scala.inline
    def `setY-image-shift-actual`(value: js.Array[Double]): Self = this.set("y-image-shift-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-shift-actual`: Self = this.set("y-image-shift-actual", js.undefined)
    @scala.inline
    def `setY-side1-image-shift-actualVarargs`(value: Double*): Self = this.set("y-side1-image-shift-actual", js.Array(value :_*))
    @scala.inline
    def `setY-side1-image-shift-actual`(value: js.Array[Double]): Self = this.set("y-side1-image-shift-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side1-image-shift-actual`: Self = this.set("y-side1-image-shift-actual", js.undefined)
    @scala.inline
    def `setY-side2-image-shift-actualVarargs`(value: Double*): Self = this.set("y-side2-image-shift-actual", js.Array(value :_*))
    @scala.inline
    def `setY-side2-image-shift-actual`(value: js.Array[Double]): Self = this.set("y-side2-image-shift-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side2-image-shift-actual`: Self = this.set("y-side2-image-shift-actual", js.undefined)
  }
  
}

