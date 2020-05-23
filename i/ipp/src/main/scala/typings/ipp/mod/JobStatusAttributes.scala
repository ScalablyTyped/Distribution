package typings.ipp.mod

import typings.ipp.ippStrings.collated
import typings.ipp.ippStrings.uncollated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatusAttributes extends js.Object {
  var `attributes-charset`: js.UndefOr[String] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `chamber-humidity-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `chamber-temperature-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `compression-supplied`: js.UndefOr[Compression] = js.undefined
  var `copies-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `cover-back-actual`: js.UndefOr[js.Array[Cover]] = js.undefined
  var `cover-front-actual`: js.UndefOr[js.Array[Cover]] = js.undefined
  var `date-time-at-completed`: js.UndefOr[String] = js.undefined
  var `date-time-at-creation`: js.UndefOr[String] = js.undefined
  var `date-time-at-processing`: js.UndefOr[String] = js.undefined
  var `destination-statuses`: js.UndefOr[js.Array[DestinationStatuses]] = js.undefined
  var `document-charset-supplied`: js.UndefOr[String] = js.undefined
  var `document-digital-signature-supplied`: js.UndefOr[DocumentDigitalSignature] = js.undefined
  var `document-format-details-supplied`: js.UndefOr[DocumentFormatDetails] = js.undefined
  var `document-format-ready`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `document-format-supplied`: js.UndefOr[MimeMediaType] = js.undefined
  var `document-format-version-supplied`: js.UndefOr[String] = js.undefined
  var `document-message-supplied`: js.UndefOr[String] = js.undefined
  var `document-name-supplied`: js.UndefOr[String] = js.undefined
  var `document-natural-language-supplied`: js.UndefOr[String] = js.undefined
  var `errors-count`: js.UndefOr[Double] = js.undefined
  var `finishings-actual`: js.UndefOr[js.Array[Finishings]] = js.undefined
  var `finishings-col-actual`: js.UndefOr[js.Array[FinishingsInterface]] = js.undefined
  var `force-front-side-actual`: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var `imposition-template-actual`: js.UndefOr[js.Array[ImpositionTemplate]] = js.undefined
  var `input-attributes-actual`: js.UndefOr[InputAttributes] = js.undefined
  var `insert-sheet-actual`: js.UndefOr[js.Array[InsertSheet]] = js.undefined
  var `job-account-id-actual`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-account-type-actual`: js.UndefOr[JobAccountType] = js.undefined
  var `job-accounting-sheets-actual`: js.UndefOr[js.Array[JobAccontingSheets]] = js.undefined
  var `job-accounting-user-id-actual`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined
  var `job-detailed-status-messages`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-document-access-errors`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-error-sheet-actual`: js.UndefOr[js.Array[JobErrorSheet]] = js.undefined
  var `job-hold-until-actual`: js.UndefOr[js.Array[JobHoldUntil]] = js.undefined
  var `job-id`: js.UndefOr[Double] = js.undefined
  var `job-impressions`: js.UndefOr[Double] = js.undefined
  var `job-impressions-col`: js.UndefOr[Impressions] = js.undefined
  var `job-impressions-completed`: js.UndefOr[Double] = js.undefined
  var `job-impressions-completed-col`: js.UndefOr[Impressions] = js.undefined
  var `job-k-octets`: js.UndefOr[Double] = js.undefined
  var `job-k-octets-processed`: js.UndefOr[Double] = js.undefined
  var `job-media-sheets`: js.UndefOr[Double] = js.undefined
  var `job-media-sheets-col`: js.UndefOr[MediaSheets] = js.undefined
  var `job-media-sheets-completed`: js.UndefOr[Double] = js.undefined
  var `job-media-sheets-completed-col`: js.UndefOr[Impressions] = js.undefined
  var `job-more-info`: js.UndefOr[String] = js.undefined
  var `job-originating-user-name`: js.UndefOr[String] = js.undefined
  var `job-originating-user-uri`: js.UndefOr[String] = js.undefined
  var `job-pages`: js.UndefOr[Double] = js.undefined
  var `job-pages-col`: js.UndefOr[Pages] = js.undefined
  var `job-pages-completed`: js.UndefOr[Double] = js.undefined
  var `job-pages-completed-col`: js.UndefOr[Pages] = js.undefined
  var `job-pages-completed-current-copy`: js.UndefOr[Double] = js.undefined
  var `job-printer-up-time`: js.UndefOr[Double] = js.undefined
  var `job-printer-uri`: js.UndefOr[String] = js.undefined
  var `job-priority-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `job-resource-ids`: js.UndefOr[js.Array[Double]] = js.undefined
  var `job-sheet-message-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `job-sheets-actual`: js.UndefOr[js.Array[JobSheets]] = js.undefined
  var `job-sheets-col-actual`: js.UndefOr[js.Array[JobSheetsInterface]] = js.undefined
  var `job-state`: js.UndefOr[JobState] = js.undefined
  var `job-state-message`: js.UndefOr[String] = js.undefined
  var `job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.undefined
  var `job-uri`: js.UndefOr[String] = js.undefined
  var `job-uuid`: js.UndefOr[String] = js.undefined
  var `materials-col-actual`: js.UndefOr[js.Array[Materials]] = js.undefined
  var `media-actual`: js.UndefOr[js.Array[String]] = js.undefined
  var `media-col-actual`: js.UndefOr[js.Array[MediaInterface]] = js.undefined
  var `media-input-tray-check-actual`: js.UndefOr[js.Array[String]] = js.undefined
  var `multiple-document-handling-actual`: js.UndefOr[js.Array[MultipleDocumentHandling]] = js.undefined
  var `multiple-object-handling-actual`: js.UndefOr[MultipleObjectHandling] = js.undefined
  var `number-of-documents`: js.UndefOr[Double] = js.undefined
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.undefined
  var `number-up-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `orientation-requested-actual`: js.UndefOr[js.Array[OrientationRequested]] = js.undefined
  var `original-requesting-user-name`: js.UndefOr[String] = js.undefined
  var `output-attributes-actual`: js.UndefOr[OutputAttributes] = js.undefined
  var `output-bin-actual`: js.UndefOr[js.Array[OutputBin]] = js.undefined
  var `output-device-actual`: js.UndefOr[js.Array[String]] = js.undefined
  var `output-device-assigned`: js.UndefOr[String] = js.undefined
  var `output-device-job-state`: js.UndefOr[JobState] = js.undefined
  var `output-device-job-state-message`: js.UndefOr[String] = js.undefined
  var `output-device-job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.undefined
  var `output-device-uuid-assigned`: js.UndefOr[String] = js.undefined
  var `overrides-actual`: js.UndefOr[js.Array[Overrides]] = js.undefined
  var `page-delivery-actual`: js.UndefOr[js.Array[PageDelivery]] = js.undefined
  var `page-order-received-actual`: js.UndefOr[js.Array[PageOrder]] = js.undefined
  var `page-ranges-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `platform-temperature-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `presentation-direction-number-up-actual`: js.UndefOr[js.Array[PresentationDirectionNumberUp]] = js.undefined
  var `print-accuracy-actual`: js.UndefOr[PrintAccuracy] = js.undefined
  var `print-base-actual`: js.UndefOr[js.Array[PrintBase]] = js.undefined
  var `print-color-mode-actual`: js.UndefOr[js.Array[PrintColorMode]] = js.undefined
  var `print-content-optimize-actual`: js.UndefOr[js.Array[PrintContentOptimize]] = js.undefined
  var `print-objects-actual`: js.UndefOr[js.Array[PrintObjects]] = js.undefined
  var `print-quality-actual`: js.UndefOr[js.Array[PrintQuality]] = js.undefined
  var `print-rendering-intent-actual`: js.UndefOr[js.Array[PrintRenderingIntent]] = js.undefined
  var `print-supports-actual`: js.UndefOr[js.Array[PrintSupports]] = js.undefined
  var `printer-resolution-actual`: js.UndefOr[js.Array[Resolution]] = js.undefined
  var `separator-sheets-actual`: js.UndefOr[js.Array[SeparatorSheets]] = js.undefined
  var `sheet-collate-actual`: js.UndefOr[js.Array[collated | uncollated]] = js.undefined
  var `sides-actual`: js.UndefOr[js.Array[Sides]] = js.undefined
  var `time-at-completed`: js.UndefOr[Double] = js.undefined
  var `time-at-creation`: js.UndefOr[Double] = js.undefined
  var `time-at-processing`: js.UndefOr[Double] = js.undefined
  var `warnings-count`: js.UndefOr[Double] = js.undefined
  var `x-image-position-actual`: js.UndefOr[js.Array[XImagePosition]] = js.undefined
  var `x-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `x-side1-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `x-side2-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `y-image-position-actual`: js.UndefOr[js.Array[YImagePosition]] = js.undefined
  var `y-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `y-side1-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.undefined
  var `y-side2-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.undefined
}

object JobStatusAttributes {
  @scala.inline
  def apply(
    `attributes-charset`: String = null,
    `attributes-natural-language`: String = null,
    `chamber-humidity-actual`: js.Array[Double] = null,
    `chamber-temperature-actual`: js.Array[Double] = null,
    `compression-supplied`: Compression = null,
    `copies-actual`: js.Array[Double] = null,
    `cover-back-actual`: js.Array[Cover] = null,
    `cover-front-actual`: js.Array[Cover] = null,
    `date-time-at-completed`: String = null,
    `date-time-at-creation`: String = null,
    `date-time-at-processing`: String = null,
    `destination-statuses`: js.Array[DestinationStatuses] = null,
    `document-charset-supplied`: String = null,
    `document-digital-signature-supplied`: DocumentDigitalSignature = null,
    `document-format-details-supplied`: DocumentFormatDetails = null,
    `document-format-ready`: js.Array[MimeMediaType] = null,
    `document-format-supplied`: MimeMediaType = null,
    `document-format-version-supplied`: String = null,
    `document-message-supplied`: String = null,
    `document-name-supplied`: String = null,
    `document-natural-language-supplied`: String = null,
    `errors-count`: js.UndefOr[Double] = js.undefined,
    `finishings-actual`: js.Array[Finishings] = null,
    `finishings-col-actual`: js.Array[FinishingsInterface] = null,
    `force-front-side-actual`: js.Array[js.Array[Double]] = null,
    `imposition-template-actual`: js.Array[ImpositionTemplate] = null,
    `input-attributes-actual`: InputAttributes = null,
    `insert-sheet-actual`: js.Array[InsertSheet] = null,
    `job-account-id-actual`: js.Array[String] = null,
    `job-account-type-actual`: JobAccountType = null,
    `job-accounting-sheets-actual`: js.Array[JobAccontingSheets] = null,
    `job-accounting-user-id-actual`: js.Array[String] = null,
    `job-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined,
    `job-detailed-status-messages`: js.Array[String] = null,
    `job-document-access-errors`: js.Array[String] = null,
    `job-error-sheet-actual`: js.Array[JobErrorSheet] = null,
    `job-hold-until-actual`: js.Array[JobHoldUntil] = null,
    `job-id`: js.UndefOr[Double] = js.undefined,
    `job-impressions`: js.UndefOr[Double] = js.undefined,
    `job-impressions-col`: Impressions = null,
    `job-impressions-completed`: js.UndefOr[Double] = js.undefined,
    `job-impressions-completed-col`: Impressions = null,
    `job-k-octets`: js.UndefOr[Double] = js.undefined,
    `job-k-octets-processed`: js.UndefOr[Double] = js.undefined,
    `job-media-sheets`: js.UndefOr[Double] = js.undefined,
    `job-media-sheets-col`: MediaSheets = null,
    `job-media-sheets-completed`: js.UndefOr[Double] = js.undefined,
    `job-media-sheets-completed-col`: Impressions = null,
    `job-more-info`: String = null,
    `job-originating-user-name`: String = null,
    `job-originating-user-uri`: String = null,
    `job-pages`: js.UndefOr[Double] = js.undefined,
    `job-pages-col`: Pages = null,
    `job-pages-completed`: js.UndefOr[Double] = js.undefined,
    `job-pages-completed-col`: Pages = null,
    `job-pages-completed-current-copy`: js.UndefOr[Double] = js.undefined,
    `job-printer-up-time`: js.UndefOr[Double] = js.undefined,
    `job-printer-uri`: String = null,
    `job-priority-actual`: js.Array[Double] = null,
    `job-resource-ids`: js.Array[Double] = null,
    `job-sheet-message-actual`: js.Array[Double] = null,
    `job-sheets-actual`: js.Array[JobSheets] = null,
    `job-sheets-col-actual`: js.Array[JobSheetsInterface] = null,
    `job-state`: JobState = null,
    `job-state-message`: String = null,
    `job-state-reasons`: js.Array[JobStateReasons] = null,
    `job-uri`: String = null,
    `job-uuid`: String = null,
    `materials-col-actual`: js.Array[Materials] = null,
    `media-actual`: js.Array[String] = null,
    `media-col-actual`: js.Array[MediaInterface] = null,
    `media-input-tray-check-actual`: js.Array[String] = null,
    `multiple-document-handling-actual`: js.Array[MultipleDocumentHandling] = null,
    `multiple-object-handling-actual`: MultipleObjectHandling = null,
    `number-of-documents`: js.UndefOr[Double] = js.undefined,
    `number-of-intervening-jobs`: js.UndefOr[Double] = js.undefined,
    `number-up-actual`: js.Array[Double] = null,
    `orientation-requested-actual`: js.Array[OrientationRequested] = null,
    `original-requesting-user-name`: String = null,
    `output-attributes-actual`: OutputAttributes = null,
    `output-bin-actual`: js.Array[OutputBin] = null,
    `output-device-actual`: js.Array[String] = null,
    `output-device-assigned`: String = null,
    `output-device-job-state`: JobState = null,
    `output-device-job-state-message`: String = null,
    `output-device-job-state-reasons`: js.Array[JobStateReasons] = null,
    `output-device-uuid-assigned`: String = null,
    `overrides-actual`: js.Array[Overrides] = null,
    `page-delivery-actual`: js.Array[PageDelivery] = null,
    `page-order-received-actual`: js.Array[PageOrder] = null,
    `page-ranges-actual`: js.Array[Double] = null,
    `platform-temperature-actual`: js.Array[Double] = null,
    `presentation-direction-number-up-actual`: js.Array[PresentationDirectionNumberUp] = null,
    `print-accuracy-actual`: PrintAccuracy = null,
    `print-base-actual`: js.Array[PrintBase] = null,
    `print-color-mode-actual`: js.Array[PrintColorMode] = null,
    `print-content-optimize-actual`: js.Array[PrintContentOptimize] = null,
    `print-objects-actual`: js.Array[PrintObjects] = null,
    `print-quality-actual`: js.Array[PrintQuality] = null,
    `print-rendering-intent-actual`: js.Array[PrintRenderingIntent] = null,
    `print-supports-actual`: js.Array[PrintSupports] = null,
    `printer-resolution-actual`: js.Array[Resolution] = null,
    `separator-sheets-actual`: js.Array[SeparatorSheets] = null,
    `sheet-collate-actual`: js.Array[collated | uncollated] = null,
    `sides-actual`: js.Array[Sides] = null,
    `time-at-completed`: js.UndefOr[Double] = js.undefined,
    `time-at-creation`: js.UndefOr[Double] = js.undefined,
    `time-at-processing`: js.UndefOr[Double] = js.undefined,
    `warnings-count`: js.UndefOr[Double] = js.undefined,
    `x-image-position-actual`: js.Array[XImagePosition] = null,
    `x-image-shift-actual`: js.Array[Double] = null,
    `x-side1-image-shift-actual`: js.Array[Double] = null,
    `x-side2-image-shift-actual`: js.Array[Double] = null,
    `y-image-position-actual`: js.Array[YImagePosition] = null,
    `y-image-shift-actual`: js.Array[Double] = null,
    `y-side1-image-shift-actual`: js.Array[Double] = null,
    `y-side2-image-shift-actual`: js.Array[Double] = null
  ): JobStatusAttributes = {
    val __obj = js.Dynamic.literal()
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (`chamber-humidity-actual` != null) __obj.updateDynamic("chamber-humidity-actual")(`chamber-humidity-actual`.asInstanceOf[js.Any])
    if (`chamber-temperature-actual` != null) __obj.updateDynamic("chamber-temperature-actual")(`chamber-temperature-actual`.asInstanceOf[js.Any])
    if (`compression-supplied` != null) __obj.updateDynamic("compression-supplied")(`compression-supplied`.asInstanceOf[js.Any])
    if (`copies-actual` != null) __obj.updateDynamic("copies-actual")(`copies-actual`.asInstanceOf[js.Any])
    if (`cover-back-actual` != null) __obj.updateDynamic("cover-back-actual")(`cover-back-actual`.asInstanceOf[js.Any])
    if (`cover-front-actual` != null) __obj.updateDynamic("cover-front-actual")(`cover-front-actual`.asInstanceOf[js.Any])
    if (`date-time-at-completed` != null) __obj.updateDynamic("date-time-at-completed")(`date-time-at-completed`.asInstanceOf[js.Any])
    if (`date-time-at-creation` != null) __obj.updateDynamic("date-time-at-creation")(`date-time-at-creation`.asInstanceOf[js.Any])
    if (`date-time-at-processing` != null) __obj.updateDynamic("date-time-at-processing")(`date-time-at-processing`.asInstanceOf[js.Any])
    if (`destination-statuses` != null) __obj.updateDynamic("destination-statuses")(`destination-statuses`.asInstanceOf[js.Any])
    if (`document-charset-supplied` != null) __obj.updateDynamic("document-charset-supplied")(`document-charset-supplied`.asInstanceOf[js.Any])
    if (`document-digital-signature-supplied` != null) __obj.updateDynamic("document-digital-signature-supplied")(`document-digital-signature-supplied`.asInstanceOf[js.Any])
    if (`document-format-details-supplied` != null) __obj.updateDynamic("document-format-details-supplied")(`document-format-details-supplied`.asInstanceOf[js.Any])
    if (`document-format-ready` != null) __obj.updateDynamic("document-format-ready")(`document-format-ready`.asInstanceOf[js.Any])
    if (`document-format-supplied` != null) __obj.updateDynamic("document-format-supplied")(`document-format-supplied`.asInstanceOf[js.Any])
    if (`document-format-version-supplied` != null) __obj.updateDynamic("document-format-version-supplied")(`document-format-version-supplied`.asInstanceOf[js.Any])
    if (`document-message-supplied` != null) __obj.updateDynamic("document-message-supplied")(`document-message-supplied`.asInstanceOf[js.Any])
    if (`document-name-supplied` != null) __obj.updateDynamic("document-name-supplied")(`document-name-supplied`.asInstanceOf[js.Any])
    if (`document-natural-language-supplied` != null) __obj.updateDynamic("document-natural-language-supplied")(`document-natural-language-supplied`.asInstanceOf[js.Any])
    if (!js.isUndefined(`errors-count`)) __obj.updateDynamic("errors-count")(`errors-count`.get.asInstanceOf[js.Any])
    if (`finishings-actual` != null) __obj.updateDynamic("finishings-actual")(`finishings-actual`.asInstanceOf[js.Any])
    if (`finishings-col-actual` != null) __obj.updateDynamic("finishings-col-actual")(`finishings-col-actual`.asInstanceOf[js.Any])
    if (`force-front-side-actual` != null) __obj.updateDynamic("force-front-side-actual")(`force-front-side-actual`.asInstanceOf[js.Any])
    if (`imposition-template-actual` != null) __obj.updateDynamic("imposition-template-actual")(`imposition-template-actual`.asInstanceOf[js.Any])
    if (`input-attributes-actual` != null) __obj.updateDynamic("input-attributes-actual")(`input-attributes-actual`.asInstanceOf[js.Any])
    if (`insert-sheet-actual` != null) __obj.updateDynamic("insert-sheet-actual")(`insert-sheet-actual`.asInstanceOf[js.Any])
    if (`job-account-id-actual` != null) __obj.updateDynamic("job-account-id-actual")(`job-account-id-actual`.asInstanceOf[js.Any])
    if (`job-account-type-actual` != null) __obj.updateDynamic("job-account-type-actual")(`job-account-type-actual`.asInstanceOf[js.Any])
    if (`job-accounting-sheets-actual` != null) __obj.updateDynamic("job-accounting-sheets-actual")(`job-accounting-sheets-actual`.asInstanceOf[js.Any])
    if (`job-accounting-user-id-actual` != null) __obj.updateDynamic("job-accounting-user-id-actual")(`job-accounting-user-id-actual`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-attribute-fidelity`)) __obj.updateDynamic("job-attribute-fidelity")(`job-attribute-fidelity`.get.asInstanceOf[js.Any])
    if (`job-detailed-status-messages` != null) __obj.updateDynamic("job-detailed-status-messages")(`job-detailed-status-messages`.asInstanceOf[js.Any])
    if (`job-document-access-errors` != null) __obj.updateDynamic("job-document-access-errors")(`job-document-access-errors`.asInstanceOf[js.Any])
    if (`job-error-sheet-actual` != null) __obj.updateDynamic("job-error-sheet-actual")(`job-error-sheet-actual`.asInstanceOf[js.Any])
    if (`job-hold-until-actual` != null) __obj.updateDynamic("job-hold-until-actual")(`job-hold-until-actual`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-id`)) __obj.updateDynamic("job-id")(`job-id`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-impressions`)) __obj.updateDynamic("job-impressions")(`job-impressions`.get.asInstanceOf[js.Any])
    if (`job-impressions-col` != null) __obj.updateDynamic("job-impressions-col")(`job-impressions-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-impressions-completed`)) __obj.updateDynamic("job-impressions-completed")(`job-impressions-completed`.get.asInstanceOf[js.Any])
    if (`job-impressions-completed-col` != null) __obj.updateDynamic("job-impressions-completed-col")(`job-impressions-completed-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-k-octets`)) __obj.updateDynamic("job-k-octets")(`job-k-octets`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-k-octets-processed`)) __obj.updateDynamic("job-k-octets-processed")(`job-k-octets-processed`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-media-sheets`)) __obj.updateDynamic("job-media-sheets")(`job-media-sheets`.get.asInstanceOf[js.Any])
    if (`job-media-sheets-col` != null) __obj.updateDynamic("job-media-sheets-col")(`job-media-sheets-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-media-sheets-completed`)) __obj.updateDynamic("job-media-sheets-completed")(`job-media-sheets-completed`.get.asInstanceOf[js.Any])
    if (`job-media-sheets-completed-col` != null) __obj.updateDynamic("job-media-sheets-completed-col")(`job-media-sheets-completed-col`.asInstanceOf[js.Any])
    if (`job-more-info` != null) __obj.updateDynamic("job-more-info")(`job-more-info`.asInstanceOf[js.Any])
    if (`job-originating-user-name` != null) __obj.updateDynamic("job-originating-user-name")(`job-originating-user-name`.asInstanceOf[js.Any])
    if (`job-originating-user-uri` != null) __obj.updateDynamic("job-originating-user-uri")(`job-originating-user-uri`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-pages`)) __obj.updateDynamic("job-pages")(`job-pages`.get.asInstanceOf[js.Any])
    if (`job-pages-col` != null) __obj.updateDynamic("job-pages-col")(`job-pages-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-pages-completed`)) __obj.updateDynamic("job-pages-completed")(`job-pages-completed`.get.asInstanceOf[js.Any])
    if (`job-pages-completed-col` != null) __obj.updateDynamic("job-pages-completed-col")(`job-pages-completed-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-pages-completed-current-copy`)) __obj.updateDynamic("job-pages-completed-current-copy")(`job-pages-completed-current-copy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-printer-up-time`)) __obj.updateDynamic("job-printer-up-time")(`job-printer-up-time`.get.asInstanceOf[js.Any])
    if (`job-printer-uri` != null) __obj.updateDynamic("job-printer-uri")(`job-printer-uri`.asInstanceOf[js.Any])
    if (`job-priority-actual` != null) __obj.updateDynamic("job-priority-actual")(`job-priority-actual`.asInstanceOf[js.Any])
    if (`job-resource-ids` != null) __obj.updateDynamic("job-resource-ids")(`job-resource-ids`.asInstanceOf[js.Any])
    if (`job-sheet-message-actual` != null) __obj.updateDynamic("job-sheet-message-actual")(`job-sheet-message-actual`.asInstanceOf[js.Any])
    if (`job-sheets-actual` != null) __obj.updateDynamic("job-sheets-actual")(`job-sheets-actual`.asInstanceOf[js.Any])
    if (`job-sheets-col-actual` != null) __obj.updateDynamic("job-sheets-col-actual")(`job-sheets-col-actual`.asInstanceOf[js.Any])
    if (`job-state` != null) __obj.updateDynamic("job-state")(`job-state`.asInstanceOf[js.Any])
    if (`job-state-message` != null) __obj.updateDynamic("job-state-message")(`job-state-message`.asInstanceOf[js.Any])
    if (`job-state-reasons` != null) __obj.updateDynamic("job-state-reasons")(`job-state-reasons`.asInstanceOf[js.Any])
    if (`job-uri` != null) __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    if (`job-uuid` != null) __obj.updateDynamic("job-uuid")(`job-uuid`.asInstanceOf[js.Any])
    if (`materials-col-actual` != null) __obj.updateDynamic("materials-col-actual")(`materials-col-actual`.asInstanceOf[js.Any])
    if (`media-actual` != null) __obj.updateDynamic("media-actual")(`media-actual`.asInstanceOf[js.Any])
    if (`media-col-actual` != null) __obj.updateDynamic("media-col-actual")(`media-col-actual`.asInstanceOf[js.Any])
    if (`media-input-tray-check-actual` != null) __obj.updateDynamic("media-input-tray-check-actual")(`media-input-tray-check-actual`.asInstanceOf[js.Any])
    if (`multiple-document-handling-actual` != null) __obj.updateDynamic("multiple-document-handling-actual")(`multiple-document-handling-actual`.asInstanceOf[js.Any])
    if (`multiple-object-handling-actual` != null) __obj.updateDynamic("multiple-object-handling-actual")(`multiple-object-handling-actual`.asInstanceOf[js.Any])
    if (!js.isUndefined(`number-of-documents`)) __obj.updateDynamic("number-of-documents")(`number-of-documents`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`number-of-intervening-jobs`)) __obj.updateDynamic("number-of-intervening-jobs")(`number-of-intervening-jobs`.get.asInstanceOf[js.Any])
    if (`number-up-actual` != null) __obj.updateDynamic("number-up-actual")(`number-up-actual`.asInstanceOf[js.Any])
    if (`orientation-requested-actual` != null) __obj.updateDynamic("orientation-requested-actual")(`orientation-requested-actual`.asInstanceOf[js.Any])
    if (`original-requesting-user-name` != null) __obj.updateDynamic("original-requesting-user-name")(`original-requesting-user-name`.asInstanceOf[js.Any])
    if (`output-attributes-actual` != null) __obj.updateDynamic("output-attributes-actual")(`output-attributes-actual`.asInstanceOf[js.Any])
    if (`output-bin-actual` != null) __obj.updateDynamic("output-bin-actual")(`output-bin-actual`.asInstanceOf[js.Any])
    if (`output-device-actual` != null) __obj.updateDynamic("output-device-actual")(`output-device-actual`.asInstanceOf[js.Any])
    if (`output-device-assigned` != null) __obj.updateDynamic("output-device-assigned")(`output-device-assigned`.asInstanceOf[js.Any])
    if (`output-device-job-state` != null) __obj.updateDynamic("output-device-job-state")(`output-device-job-state`.asInstanceOf[js.Any])
    if (`output-device-job-state-message` != null) __obj.updateDynamic("output-device-job-state-message")(`output-device-job-state-message`.asInstanceOf[js.Any])
    if (`output-device-job-state-reasons` != null) __obj.updateDynamic("output-device-job-state-reasons")(`output-device-job-state-reasons`.asInstanceOf[js.Any])
    if (`output-device-uuid-assigned` != null) __obj.updateDynamic("output-device-uuid-assigned")(`output-device-uuid-assigned`.asInstanceOf[js.Any])
    if (`overrides-actual` != null) __obj.updateDynamic("overrides-actual")(`overrides-actual`.asInstanceOf[js.Any])
    if (`page-delivery-actual` != null) __obj.updateDynamic("page-delivery-actual")(`page-delivery-actual`.asInstanceOf[js.Any])
    if (`page-order-received-actual` != null) __obj.updateDynamic("page-order-received-actual")(`page-order-received-actual`.asInstanceOf[js.Any])
    if (`page-ranges-actual` != null) __obj.updateDynamic("page-ranges-actual")(`page-ranges-actual`.asInstanceOf[js.Any])
    if (`platform-temperature-actual` != null) __obj.updateDynamic("platform-temperature-actual")(`platform-temperature-actual`.asInstanceOf[js.Any])
    if (`presentation-direction-number-up-actual` != null) __obj.updateDynamic("presentation-direction-number-up-actual")(`presentation-direction-number-up-actual`.asInstanceOf[js.Any])
    if (`print-accuracy-actual` != null) __obj.updateDynamic("print-accuracy-actual")(`print-accuracy-actual`.asInstanceOf[js.Any])
    if (`print-base-actual` != null) __obj.updateDynamic("print-base-actual")(`print-base-actual`.asInstanceOf[js.Any])
    if (`print-color-mode-actual` != null) __obj.updateDynamic("print-color-mode-actual")(`print-color-mode-actual`.asInstanceOf[js.Any])
    if (`print-content-optimize-actual` != null) __obj.updateDynamic("print-content-optimize-actual")(`print-content-optimize-actual`.asInstanceOf[js.Any])
    if (`print-objects-actual` != null) __obj.updateDynamic("print-objects-actual")(`print-objects-actual`.asInstanceOf[js.Any])
    if (`print-quality-actual` != null) __obj.updateDynamic("print-quality-actual")(`print-quality-actual`.asInstanceOf[js.Any])
    if (`print-rendering-intent-actual` != null) __obj.updateDynamic("print-rendering-intent-actual")(`print-rendering-intent-actual`.asInstanceOf[js.Any])
    if (`print-supports-actual` != null) __obj.updateDynamic("print-supports-actual")(`print-supports-actual`.asInstanceOf[js.Any])
    if (`printer-resolution-actual` != null) __obj.updateDynamic("printer-resolution-actual")(`printer-resolution-actual`.asInstanceOf[js.Any])
    if (`separator-sheets-actual` != null) __obj.updateDynamic("separator-sheets-actual")(`separator-sheets-actual`.asInstanceOf[js.Any])
    if (`sheet-collate-actual` != null) __obj.updateDynamic("sheet-collate-actual")(`sheet-collate-actual`.asInstanceOf[js.Any])
    if (`sides-actual` != null) __obj.updateDynamic("sides-actual")(`sides-actual`.asInstanceOf[js.Any])
    if (!js.isUndefined(`time-at-completed`)) __obj.updateDynamic("time-at-completed")(`time-at-completed`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`time-at-creation`)) __obj.updateDynamic("time-at-creation")(`time-at-creation`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`time-at-processing`)) __obj.updateDynamic("time-at-processing")(`time-at-processing`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`warnings-count`)) __obj.updateDynamic("warnings-count")(`warnings-count`.get.asInstanceOf[js.Any])
    if (`x-image-position-actual` != null) __obj.updateDynamic("x-image-position-actual")(`x-image-position-actual`.asInstanceOf[js.Any])
    if (`x-image-shift-actual` != null) __obj.updateDynamic("x-image-shift-actual")(`x-image-shift-actual`.asInstanceOf[js.Any])
    if (`x-side1-image-shift-actual` != null) __obj.updateDynamic("x-side1-image-shift-actual")(`x-side1-image-shift-actual`.asInstanceOf[js.Any])
    if (`x-side2-image-shift-actual` != null) __obj.updateDynamic("x-side2-image-shift-actual")(`x-side2-image-shift-actual`.asInstanceOf[js.Any])
    if (`y-image-position-actual` != null) __obj.updateDynamic("y-image-position-actual")(`y-image-position-actual`.asInstanceOf[js.Any])
    if (`y-image-shift-actual` != null) __obj.updateDynamic("y-image-shift-actual")(`y-image-shift-actual`.asInstanceOf[js.Any])
    if (`y-side1-image-shift-actual` != null) __obj.updateDynamic("y-side1-image-shift-actual")(`y-side1-image-shift-actual`.asInstanceOf[js.Any])
    if (`y-side2-image-shift-actual` != null) __obj.updateDynamic("y-side2-image-shift-actual")(`y-side2-image-shift-actual`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatusAttributes]
  }
}

