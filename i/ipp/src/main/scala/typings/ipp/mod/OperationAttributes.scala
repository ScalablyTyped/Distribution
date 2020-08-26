package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationAttributes extends js.Object {
  var `attributes-charset`: js.UndefOr[String] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `charge-info-message`: js.UndefOr[String] = js.native
  var compression: js.UndefOr[Compression] = js.native
  var `compression-accepted`: js.UndefOr[js.Array[Compression]] = js.native
  var `destination-accesses`: js.UndefOr[js.Array[DestionationAccesses]] = js.native
  var `detailed-status-message`: js.UndefOr[String] = js.native
  var `document-access`: js.UndefOr[DocumentAccess] = js.native
  var `document-access-error`: js.UndefOr[String] = js.native
  var `document-charset`: js.UndefOr[String] = js.native
  var `document-data-get-interval`: js.UndefOr[Double] = js.native
  var `document-data-wait`: js.UndefOr[Boolean] = js.native
  var `document-digital-signature`: js.UndefOr[DocumentDigitalSignature] = js.native
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-accepted`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `document-format-details`: js.UndefOr[DocumentFormatDetails] = js.native
  var `document-message`: js.UndefOr[String] = js.native
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.native
  var `document-name`: js.UndefOr[String] = js.native
  var `document-natural-language`: js.UndefOr[String] = js.native
  var `document-number`: js.UndefOr[Double] = js.native
  var `document-password`: js.UndefOr[String] = js.native
  var `document-preprocessed`: js.UndefOr[Boolean] = js.native
  var `fetch-status-code`: js.UndefOr[StatusCode] = js.native
   // Except "successful-ok"
  var `fetch-status-message`: js.UndefOr[String] = js.native
  var `first-index`: js.UndefOr[Double] = js.native
  var `identify-actions`: js.UndefOr[js.Array[IdentifyActions]] = js.native
  var `input-attributes`: js.UndefOr[InputAttributes] = js.native
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  var `job-authorization-uri`: js.UndefOr[String] = js.native
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.native
  var `job-hold-until-time`: js.UndefOr[String] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `job-impressions`: js.UndefOr[Double] = js.native
  var `job-impressions-col`: js.UndefOr[Impressions] = js.native
  var `job-impressions-estimated`: js.UndefOr[Double] = js.native
  var `job-k-octets`: js.UndefOr[Double] = js.native
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  var `job-media-sheets-col`: js.UndefOr[MediaSheets] = js.native
  var `job-message-from-operator`: js.UndefOr[String] = js.native
  var `job-name`: js.UndefOr[String] = js.native
  var `job-pages`: js.UndefOr[Double] = js.native
  var `job-pages-col`: js.UndefOr[Pages] = js.native
  var `job-password`: js.UndefOr[String] = js.native
  var `job-password-encryption`: js.UndefOr[JobPasswordEncryption] = js.native
  var `job-state`: js.UndefOr[JobState] = js.native
  var `job-state-message`: js.UndefOr[String] = js.native
  var `job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `last-document`: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
  var `my-jobs`: js.UndefOr[Boolean] = js.native
  var `notify-get-interval`: js.UndefOr[Double] = js.native
  var `notify-printer-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `notify-resource-id`: js.UndefOr[Double] = js.native
  var `notify-sequence-numbers`: js.UndefOr[js.Array[Double]] = js.native
  var `notify-subscription-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `notify-wait`: js.UndefOr[Boolean] = js.native
  var `original-requesting-user-name`: js.UndefOr[String] = js.native
  var `output-attributes`: js.UndefOr[OutputAttributes] = js.native
  var `output-device-job-states`: js.UndefOr[js.Array[String]] = js.native
  var `output-device-uuid`: js.UndefOr[String] = js.native
  var `preferred-attributes`: js.UndefOr[js.Object] = js.native
  var `printer-geo-location`: js.UndefOr[String] = js.native
  var `printer-id`: js.UndefOr[Double] = js.native
  var `printer-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `printer-location`: js.UndefOr[String] = js.native
  var `printer-message-from-operator`: js.UndefOr[String] = js.native
  var `printer-service-type`: js.UndefOr[js.Array[PrinterServiceType]] = js.native
  var `printer-up-time`: js.UndefOr[Double] = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `printer-xri-requested`: js.UndefOr[js.Array[PrinterXri]] = js.native
  var `profile-uri-actual`: js.UndefOr[String] = js.native
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
    ]
  ] = js.native
  var `requesting-user-name`: js.UndefOr[String] = js.native
  var `requesting-user-uri`: js.UndefOr[String] = js.native
  var `resource-format`: js.UndefOr[MimeMediaType] = js.native
  var `resource-format-accepted`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `resource-formats`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `resource-id`: js.UndefOr[Double] = js.native
  var `resource-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `resource-k-octets`: js.UndefOr[Double] = js.native
  var `resource-natural-language`: js.UndefOr[String] = js.native
  var `resource-patches`: js.UndefOr[String] = js.native
  var `resource-signature`: js.UndefOr[js.Array[String]] = js.native
  var `resource-states`: js.UndefOr[js.Array[ResourceState]] = js.native
  var `resource-string-version`: js.UndefOr[String] = js.native
  var `resource-type`: js.UndefOr[ResourceType] = js.native
  var `resource-types`: js.UndefOr[js.Array[ResourceType]] = js.native
  var `resource-version`: js.UndefOr[String] = js.native
  var `restart-get-interval`: js.UndefOr[Double] = js.native
  var `status-message`: js.UndefOr[String] = js.native
  var `system-uri`: js.UndefOr[String] = js.native
  var `which-jobs`: js.UndefOr[WhichJobs] = js.native
  var `which-printers`: js.UndefOr[String] = js.native
}

object OperationAttributes {
  @scala.inline
  def apply(): OperationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationAttributes]
  }
  @scala.inline
  implicit class OperationAttributesOps[Self <: OperationAttributes] (val x: Self) extends AnyVal {
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
    def `setCharge-info-message`(value: String): Self = this.set("charge-info-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCharge-info-message`: Self = this.set("charge-info-message", js.undefined)
    @scala.inline
    def setCompression(value: Compression): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def `setCompression-acceptedVarargs`(value: Compression*): Self = this.set("compression-accepted", js.Array(value :_*))
    @scala.inline
    def `setCompression-accepted`(value: js.Array[Compression]): Self = this.set("compression-accepted", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCompression-accepted`: Self = this.set("compression-accepted", js.undefined)
    @scala.inline
    def `setDestination-accessesVarargs`(value: DestionationAccesses*): Self = this.set("destination-accesses", js.Array(value :_*))
    @scala.inline
    def `setDestination-accesses`(value: js.Array[DestionationAccesses]): Self = this.set("destination-accesses", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-accesses`: Self = this.set("destination-accesses", js.undefined)
    @scala.inline
    def `setDetailed-status-message`(value: String): Self = this.set("detailed-status-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDetailed-status-message`: Self = this.set("detailed-status-message", js.undefined)
    @scala.inline
    def `setDocument-access`(value: DocumentAccess): Self = this.set("document-access", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-access`: Self = this.set("document-access", js.undefined)
    @scala.inline
    def `setDocument-access-error`(value: String): Self = this.set("document-access-error", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-access-error`: Self = this.set("document-access-error", js.undefined)
    @scala.inline
    def `setDocument-charset`(value: String): Self = this.set("document-charset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-charset`: Self = this.set("document-charset", js.undefined)
    @scala.inline
    def `setDocument-data-get-interval`(value: Double): Self = this.set("document-data-get-interval", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-data-get-interval`: Self = this.set("document-data-get-interval", js.undefined)
    @scala.inline
    def `setDocument-data-wait`(value: Boolean): Self = this.set("document-data-wait", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-data-wait`: Self = this.set("document-data-wait", js.undefined)
    @scala.inline
    def `setDocument-digital-signature`(value: DocumentDigitalSignature): Self = this.set("document-digital-signature", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-digital-signature`: Self = this.set("document-digital-signature", js.undefined)
    @scala.inline
    def `setDocument-format`(value: MimeMediaType): Self = this.set("document-format", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format`: Self = this.set("document-format", js.undefined)
    @scala.inline
    def `setDocument-format-acceptedVarargs`(value: MimeMediaType*): Self = this.set("document-format-accepted", js.Array(value :_*))
    @scala.inline
    def `setDocument-format-accepted`(value: js.Array[MimeMediaType]): Self = this.set("document-format-accepted", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-accepted`: Self = this.set("document-format-accepted", js.undefined)
    @scala.inline
    def `setDocument-format-details`(value: DocumentFormatDetails): Self = this.set("document-format-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-details`: Self = this.set("document-format-details", js.undefined)
    @scala.inline
    def `setDocument-message`(value: String): Self = this.set("document-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-message`: Self = this.set("document-message", js.undefined)
    @scala.inline
    def `setDocument-metadataVarargs`(value: String*): Self = this.set("document-metadata", js.Array(value :_*))
    @scala.inline
    def `setDocument-metadata`(value: js.Array[String]): Self = this.set("document-metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-metadata`: Self = this.set("document-metadata", js.undefined)
    @scala.inline
    def `setDocument-name`(value: String): Self = this.set("document-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-name`: Self = this.set("document-name", js.undefined)
    @scala.inline
    def `setDocument-natural-language`(value: String): Self = this.set("document-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-natural-language`: Self = this.set("document-natural-language", js.undefined)
    @scala.inline
    def `setDocument-number`(value: Double): Self = this.set("document-number", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-number`: Self = this.set("document-number", js.undefined)
    @scala.inline
    def `setDocument-password`(value: String): Self = this.set("document-password", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-password`: Self = this.set("document-password", js.undefined)
    @scala.inline
    def `setDocument-preprocessed`(value: Boolean): Self = this.set("document-preprocessed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-preprocessed`: Self = this.set("document-preprocessed", js.undefined)
    @scala.inline
    def `setFetch-status-code`(value: StatusCode): Self = this.set("fetch-status-code", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-status-code`: Self = this.set("fetch-status-code", js.undefined)
    @scala.inline
    def `setFetch-status-message`(value: String): Self = this.set("fetch-status-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-status-message`: Self = this.set("fetch-status-message", js.undefined)
    @scala.inline
    def `setFirst-index`(value: Double): Self = this.set("first-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFirst-index`: Self = this.set("first-index", js.undefined)
    @scala.inline
    def `setIdentify-actionsVarargs`(value: IdentifyActions*): Self = this.set("identify-actions", js.Array(value :_*))
    @scala.inline
    def `setIdentify-actions`(value: js.Array[IdentifyActions]): Self = this.set("identify-actions", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIdentify-actions`: Self = this.set("identify-actions", js.undefined)
    @scala.inline
    def `setInput-attributes`(value: InputAttributes): Self = this.set("input-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-attributes`: Self = this.set("input-attributes", js.undefined)
    @scala.inline
    def `setIpp-attribute-fidelity`(value: Boolean): Self = this.set("ipp-attribute-fidelity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIpp-attribute-fidelity`: Self = this.set("ipp-attribute-fidelity", js.undefined)
    @scala.inline
    def `setJob-authorization-uri`(value: String): Self = this.set("job-authorization-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-authorization-uri`: Self = this.set("job-authorization-uri", js.undefined)
    @scala.inline
    def `setJob-hold-until`(value: JobHoldUntil): Self = this.set("job-hold-until", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until`: Self = this.set("job-hold-until", js.undefined)
    @scala.inline
    def `setJob-hold-until-time`(value: String): Self = this.set("job-hold-until-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until-time`: Self = this.set("job-hold-until-time", js.undefined)
    @scala.inline
    def `setJob-id`(value: Double): Self = this.set("job-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-id`: Self = this.set("job-id", js.undefined)
    @scala.inline
    def `setJob-idsVarargs`(value: Double*): Self = this.set("job-ids", js.Array(value :_*))
    @scala.inline
    def `setJob-ids`(value: js.Array[Double]): Self = this.set("job-ids", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-ids`: Self = this.set("job-ids", js.undefined)
    @scala.inline
    def `setJob-impressions`(value: Double): Self = this.set("job-impressions", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions`: Self = this.set("job-impressions", js.undefined)
    @scala.inline
    def `setJob-impressions-col`(value: Impressions): Self = this.set("job-impressions-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions-col`: Self = this.set("job-impressions-col", js.undefined)
    @scala.inline
    def `setJob-impressions-estimated`(value: Double): Self = this.set("job-impressions-estimated", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions-estimated`: Self = this.set("job-impressions-estimated", js.undefined)
    @scala.inline
    def `setJob-k-octets`(value: Double): Self = this.set("job-k-octets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-k-octets`: Self = this.set("job-k-octets", js.undefined)
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
    def `setJob-media-sheets`(value: Double): Self = this.set("job-media-sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets`: Self = this.set("job-media-sheets", js.undefined)
    @scala.inline
    def `setJob-media-sheets-col`(value: MediaSheets): Self = this.set("job-media-sheets-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets-col`: Self = this.set("job-media-sheets-col", js.undefined)
    @scala.inline
    def `setJob-message-from-operator`(value: String): Self = this.set("job-message-from-operator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-message-from-operator`: Self = this.set("job-message-from-operator", js.undefined)
    @scala.inline
    def `setJob-name`(value: String): Self = this.set("job-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-name`: Self = this.set("job-name", js.undefined)
    @scala.inline
    def `setJob-pages`(value: Double): Self = this.set("job-pages", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages`: Self = this.set("job-pages", js.undefined)
    @scala.inline
    def `setJob-pages-col`(value: Pages): Self = this.set("job-pages-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-col`: Self = this.set("job-pages-col", js.undefined)
    @scala.inline
    def `setJob-password`(value: String): Self = this.set("job-password", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password`: Self = this.set("job-password", js.undefined)
    @scala.inline
    def `setJob-password-encryption`(value: JobPasswordEncryption): Self = this.set("job-password-encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password-encryption`: Self = this.set("job-password-encryption", js.undefined)
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
    def `setLast-document`(value: Boolean): Self = this.set("last-document", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLast-document`: Self = this.set("last-document", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def `setMy-jobs`(value: Boolean): Self = this.set("my-jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMy-jobs`: Self = this.set("my-jobs", js.undefined)
    @scala.inline
    def `setNotify-get-interval`(value: Double): Self = this.set("notify-get-interval", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-get-interval`: Self = this.set("notify-get-interval", js.undefined)
    @scala.inline
    def `setNotify-printer-idsVarargs`(value: Double*): Self = this.set("notify-printer-ids", js.Array(value :_*))
    @scala.inline
    def `setNotify-printer-ids`(value: js.Array[Double]): Self = this.set("notify-printer-ids", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-printer-ids`: Self = this.set("notify-printer-ids", js.undefined)
    @scala.inline
    def `setNotify-resource-id`(value: Double): Self = this.set("notify-resource-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-resource-id`: Self = this.set("notify-resource-id", js.undefined)
    @scala.inline
    def `setNotify-sequence-numbersVarargs`(value: Double*): Self = this.set("notify-sequence-numbers", js.Array(value :_*))
    @scala.inline
    def `setNotify-sequence-numbers`(value: js.Array[Double]): Self = this.set("notify-sequence-numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-sequence-numbers`: Self = this.set("notify-sequence-numbers", js.undefined)
    @scala.inline
    def `setNotify-subscription-idsVarargs`(value: Double*): Self = this.set("notify-subscription-ids", js.Array(value :_*))
    @scala.inline
    def `setNotify-subscription-ids`(value: js.Array[Double]): Self = this.set("notify-subscription-ids", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-subscription-ids`: Self = this.set("notify-subscription-ids", js.undefined)
    @scala.inline
    def `setNotify-wait`(value: Boolean): Self = this.set("notify-wait", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-wait`: Self = this.set("notify-wait", js.undefined)
    @scala.inline
    def `setOriginal-requesting-user-name`(value: String): Self = this.set("original-requesting-user-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOriginal-requesting-user-name`: Self = this.set("original-requesting-user-name", js.undefined)
    @scala.inline
    def `setOutput-attributes`(value: OutputAttributes): Self = this.set("output-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-attributes`: Self = this.set("output-attributes", js.undefined)
    @scala.inline
    def `setOutput-device-job-statesVarargs`(value: String*): Self = this.set("output-device-job-states", js.Array(value :_*))
    @scala.inline
    def `setOutput-device-job-states`(value: js.Array[String]): Self = this.set("output-device-job-states", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-job-states`: Self = this.set("output-device-job-states", js.undefined)
    @scala.inline
    def `setOutput-device-uuid`(value: String): Self = this.set("output-device-uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-uuid`: Self = this.set("output-device-uuid", js.undefined)
    @scala.inline
    def `setPreferred-attributes`(value: js.Object): Self = this.set("preferred-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePreferred-attributes`: Self = this.set("preferred-attributes", js.undefined)
    @scala.inline
    def `setPrinter-geo-location`(value: String): Self = this.set("printer-geo-location", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-geo-location`: Self = this.set("printer-geo-location", js.undefined)
    @scala.inline
    def `setPrinter-id`(value: Double): Self = this.set("printer-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-id`: Self = this.set("printer-id", js.undefined)
    @scala.inline
    def `setPrinter-idsVarargs`(value: Double*): Self = this.set("printer-ids", js.Array(value :_*))
    @scala.inline
    def `setPrinter-ids`(value: js.Array[Double]): Self = this.set("printer-ids", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-ids`: Self = this.set("printer-ids", js.undefined)
    @scala.inline
    def `setPrinter-location`(value: String): Self = this.set("printer-location", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-location`: Self = this.set("printer-location", js.undefined)
    @scala.inline
    def `setPrinter-message-from-operator`(value: String): Self = this.set("printer-message-from-operator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-message-from-operator`: Self = this.set("printer-message-from-operator", js.undefined)
    @scala.inline
    def `setPrinter-service-typeVarargs`(value: PrinterServiceType*): Self = this.set("printer-service-type", js.Array(value :_*))
    @scala.inline
    def `setPrinter-service-type`(value: js.Array[PrinterServiceType]): Self = this.set("printer-service-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-service-type`: Self = this.set("printer-service-type", js.undefined)
    @scala.inline
    def `setPrinter-up-time`(value: Double): Self = this.set("printer-up-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-up-time`: Self = this.set("printer-up-time", js.undefined)
    @scala.inline
    def `setPrinter-uri`(value: String): Self = this.set("printer-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-uri`: Self = this.set("printer-uri", js.undefined)
    @scala.inline
    def `setPrinter-xri-requestedVarargs`(value: PrinterXri*): Self = this.set("printer-xri-requested", js.Array(value :_*))
    @scala.inline
    def `setPrinter-xri-requested`(value: js.Array[PrinterXri]): Self = this.set("printer-xri-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-xri-requested`: Self = this.set("printer-xri-requested", js.undefined)
    @scala.inline
    def `setProfile-uri-actual`(value: String): Self = this.set("profile-uri-actual", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProfile-uri-actual`: Self = this.set("profile-uri-actual", js.undefined)
    @scala.inline
    def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any)*
    ): Self = this.set("requested-attributes", js.Array(value :_*))
    @scala.inline
    def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
        ]
    ): Self = this.set("requested-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequested-attributes`: Self = this.set("requested-attributes", js.undefined)
    @scala.inline
    def `setRequesting-user-name`(value: String): Self = this.set("requesting-user-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequesting-user-name`: Self = this.set("requesting-user-name", js.undefined)
    @scala.inline
    def `setRequesting-user-uri`(value: String): Self = this.set("requesting-user-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequesting-user-uri`: Self = this.set("requesting-user-uri", js.undefined)
    @scala.inline
    def `setResource-format`(value: MimeMediaType): Self = this.set("resource-format", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-format`: Self = this.set("resource-format", js.undefined)
    @scala.inline
    def `setResource-format-acceptedVarargs`(value: MimeMediaType*): Self = this.set("resource-format-accepted", js.Array(value :_*))
    @scala.inline
    def `setResource-format-accepted`(value: js.Array[MimeMediaType]): Self = this.set("resource-format-accepted", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-format-accepted`: Self = this.set("resource-format-accepted", js.undefined)
    @scala.inline
    def `setResource-formatsVarargs`(value: MimeMediaType*): Self = this.set("resource-formats", js.Array(value :_*))
    @scala.inline
    def `setResource-formats`(value: js.Array[MimeMediaType]): Self = this.set("resource-formats", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-formats`: Self = this.set("resource-formats", js.undefined)
    @scala.inline
    def `setResource-id`(value: Double): Self = this.set("resource-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-id`: Self = this.set("resource-id", js.undefined)
    @scala.inline
    def `setResource-idsVarargs`(value: Double*): Self = this.set("resource-ids", js.Array(value :_*))
    @scala.inline
    def `setResource-ids`(value: js.Array[Double]): Self = this.set("resource-ids", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-ids`: Self = this.set("resource-ids", js.undefined)
    @scala.inline
    def `setResource-k-octets`(value: Double): Self = this.set("resource-k-octets", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-k-octets`: Self = this.set("resource-k-octets", js.undefined)
    @scala.inline
    def `setResource-natural-language`(value: String): Self = this.set("resource-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-natural-language`: Self = this.set("resource-natural-language", js.undefined)
    @scala.inline
    def `setResource-patches`(value: String): Self = this.set("resource-patches", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-patches`: Self = this.set("resource-patches", js.undefined)
    @scala.inline
    def `setResource-signatureVarargs`(value: String*): Self = this.set("resource-signature", js.Array(value :_*))
    @scala.inline
    def `setResource-signature`(value: js.Array[String]): Self = this.set("resource-signature", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-signature`: Self = this.set("resource-signature", js.undefined)
    @scala.inline
    def `setResource-statesVarargs`(value: ResourceState*): Self = this.set("resource-states", js.Array(value :_*))
    @scala.inline
    def `setResource-states`(value: js.Array[ResourceState]): Self = this.set("resource-states", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-states`: Self = this.set("resource-states", js.undefined)
    @scala.inline
    def `setResource-string-version`(value: String): Self = this.set("resource-string-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-string-version`: Self = this.set("resource-string-version", js.undefined)
    @scala.inline
    def `setResource-type`(value: ResourceType): Self = this.set("resource-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-type`: Self = this.set("resource-type", js.undefined)
    @scala.inline
    def `setResource-typesVarargs`(value: ResourceType*): Self = this.set("resource-types", js.Array(value :_*))
    @scala.inline
    def `setResource-types`(value: js.Array[ResourceType]): Self = this.set("resource-types", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-types`: Self = this.set("resource-types", js.undefined)
    @scala.inline
    def `setResource-version`(value: String): Self = this.set("resource-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteResource-version`: Self = this.set("resource-version", js.undefined)
    @scala.inline
    def `setRestart-get-interval`(value: Double): Self = this.set("restart-get-interval", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRestart-get-interval`: Self = this.set("restart-get-interval", js.undefined)
    @scala.inline
    def `setStatus-message`(value: String): Self = this.set("status-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStatus-message`: Self = this.set("status-message", js.undefined)
    @scala.inline
    def `setSystem-uri`(value: String): Self = this.set("system-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSystem-uri`: Self = this.set("system-uri", js.undefined)
    @scala.inline
    def `setWhich-jobs`(value: WhichJobs): Self = this.set("which-jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWhich-jobs`: Self = this.set("which-jobs", js.undefined)
    @scala.inline
    def `setWhich-printers`(value: String): Self = this.set("which-printers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWhich-printers`: Self = this.set("which-printers", js.undefined)
  }
  
}

