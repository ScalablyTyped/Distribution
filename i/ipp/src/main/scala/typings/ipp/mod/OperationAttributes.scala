package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationAttributes extends js.Object {
  var `attributes-charset`: js.UndefOr[String] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `charge-info-message`: js.UndefOr[String] = js.undefined
  var compression: js.UndefOr[Compression] = js.undefined
  var `compression-accepted`: js.UndefOr[js.Array[Compression]] = js.undefined
  var `destination-accesses`: js.UndefOr[js.Array[DestionationAccesses]] = js.undefined
  var `detailed-status-message`: js.UndefOr[String] = js.undefined
  var `document-access`: js.UndefOr[DocumentAccess] = js.undefined
  var `document-access-error`: js.UndefOr[String] = js.undefined
  var `document-charset`: js.UndefOr[String] = js.undefined
  var `document-data-get-interval`: js.UndefOr[Double] = js.undefined
  var `document-data-wait`: js.UndefOr[Boolean] = js.undefined
  var `document-digital-signature`: js.UndefOr[DocumentDigitalSignature] = js.undefined
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `document-format-accepted`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `document-format-details`: js.UndefOr[DocumentFormatDetails] = js.undefined
  var `document-message`: js.UndefOr[String] = js.undefined
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-name`: js.UndefOr[String] = js.undefined
  var `document-natural-language`: js.UndefOr[String] = js.undefined
  var `document-number`: js.UndefOr[Double] = js.undefined
  var `document-password`: js.UndefOr[String] = js.undefined
  var `document-preprocessed`: js.UndefOr[Boolean] = js.undefined
  var `fetch-status-code`: js.UndefOr[StatusCode] = js.undefined
   // Except "successful-ok"
  var `fetch-status-message`: js.UndefOr[String] = js.undefined
  var `first-index`: js.UndefOr[Double] = js.undefined
  var `identify-actions`: js.UndefOr[js.Array[IdentifyActions]] = js.undefined
  var `input-attributes`: js.UndefOr[InputAttributes] = js.undefined
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined
  var `job-authorization-uri`: js.UndefOr[String] = js.undefined
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.undefined
  var `job-hold-until-time`: js.UndefOr[String] = js.undefined
  var `job-id`: js.UndefOr[Double] = js.undefined
  var `job-ids`: js.UndefOr[js.Array[Double]] = js.undefined
  var `job-impressions`: js.UndefOr[Double] = js.undefined
  var `job-impressions-col`: js.UndefOr[Impressions] = js.undefined
  var `job-impressions-estimated`: js.UndefOr[Double] = js.undefined
  var `job-k-octets`: js.UndefOr[Double] = js.undefined
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.undefined
  var `job-media-sheets`: js.UndefOr[Double] = js.undefined
  var `job-media-sheets-col`: js.UndefOr[MediaSheets] = js.undefined
  var `job-message-from-operator`: js.UndefOr[String] = js.undefined
  var `job-name`: js.UndefOr[String] = js.undefined
  var `job-pages`: js.UndefOr[Double] = js.undefined
  var `job-pages-col`: js.UndefOr[Pages] = js.undefined
  var `job-password`: js.UndefOr[String] = js.undefined
  var `job-password-encryption`: js.UndefOr[JobPasswordEncryption] = js.undefined
  var `job-state`: js.UndefOr[JobState] = js.undefined
  var `job-state-message`: js.UndefOr[String] = js.undefined
  var `job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.undefined
  var `job-uri`: js.UndefOr[String] = js.undefined
  var `last-document`: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `my-jobs`: js.UndefOr[Boolean] = js.undefined
  var `notify-get-interval`: js.UndefOr[Double] = js.undefined
  var `notify-printer-ids`: js.UndefOr[js.Array[Double]] = js.undefined
  var `notify-resource-id`: js.UndefOr[Double] = js.undefined
  var `notify-sequence-numbers`: js.UndefOr[js.Array[Double]] = js.undefined
  var `notify-subscription-ids`: js.UndefOr[js.Array[Double]] = js.undefined
  var `notify-wait`: js.UndefOr[Boolean] = js.undefined
  var `original-requesting-user-name`: js.UndefOr[String] = js.undefined
  var `output-attributes`: js.UndefOr[OutputAttributes] = js.undefined
  var `output-device-job-states`: js.UndefOr[js.Array[String]] = js.undefined
  var `output-device-uuid`: js.UndefOr[String] = js.undefined
  var `preferred-attributes`: js.UndefOr[js.Object] = js.undefined
  var `printer-geo-location`: js.UndefOr[String] = js.undefined
  var `printer-id`: js.UndefOr[Double] = js.undefined
  var `printer-ids`: js.UndefOr[js.Array[Double]] = js.undefined
  var `printer-location`: js.UndefOr[String] = js.undefined
  var `printer-message-from-operator`: js.UndefOr[String] = js.undefined
  var `printer-service-type`: js.UndefOr[js.Array[PrinterServiceType]] = js.undefined
  var `printer-up-time`: js.UndefOr[Double] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `printer-xri-requested`: js.UndefOr[js.Array[PrinterXri]] = js.undefined
  var `profile-uri-actual`: js.UndefOr[String] = js.undefined
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
    ]
  ] = js.undefined
  var `requesting-user-name`: js.UndefOr[String] = js.undefined
  var `requesting-user-uri`: js.UndefOr[String] = js.undefined
  var `resource-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `resource-format-accepted`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `resource-formats`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `resource-id`: js.UndefOr[Double] = js.undefined
  var `resource-ids`: js.UndefOr[js.Array[Double]] = js.undefined
  var `resource-k-octets`: js.UndefOr[Double] = js.undefined
  var `resource-natural-language`: js.UndefOr[String] = js.undefined
  var `resource-patches`: js.UndefOr[String] = js.undefined
  var `resource-signature`: js.UndefOr[js.Array[String]] = js.undefined
  var `resource-states`: js.UndefOr[js.Array[ResourceState]] = js.undefined
  var `resource-string-version`: js.UndefOr[String] = js.undefined
  var `resource-type`: js.UndefOr[ResourceType] = js.undefined
  var `resource-types`: js.UndefOr[js.Array[ResourceType]] = js.undefined
  var `resource-version`: js.UndefOr[String] = js.undefined
  var `restart-get-interval`: js.UndefOr[Double] = js.undefined
  var `status-message`: js.UndefOr[String] = js.undefined
  var `system-uri`: js.UndefOr[String] = js.undefined
  var `which-jobs`: js.UndefOr[WhichJobs] = js.undefined
  var `which-printers`: js.UndefOr[String] = js.undefined
}

object OperationAttributes {
  @scala.inline
  def apply(
    `attributes-charset`: String = null,
    `attributes-natural-language`: String = null,
    `charge-info-message`: String = null,
    compression: Compression = null,
    `compression-accepted`: js.Array[Compression] = null,
    `destination-accesses`: js.Array[DestionationAccesses] = null,
    `detailed-status-message`: String = null,
    `document-access`: DocumentAccess = null,
    `document-access-error`: String = null,
    `document-charset`: String = null,
    `document-data-get-interval`: js.UndefOr[Double] = js.undefined,
    `document-data-wait`: js.UndefOr[Boolean] = js.undefined,
    `document-digital-signature`: DocumentDigitalSignature = null,
    `document-format`: MimeMediaType = null,
    `document-format-accepted`: js.Array[MimeMediaType] = null,
    `document-format-details`: DocumentFormatDetails = null,
    `document-message`: String = null,
    `document-metadata`: js.Array[String] = null,
    `document-name`: String = null,
    `document-natural-language`: String = null,
    `document-number`: js.UndefOr[Double] = js.undefined,
    `document-password`: String = null,
    `document-preprocessed`: js.UndefOr[Boolean] = js.undefined,
    `fetch-status-code`: StatusCode = null,
    `fetch-status-message`: String = null,
    `first-index`: js.UndefOr[Double] = js.undefined,
    `identify-actions`: js.Array[IdentifyActions] = null,
    `input-attributes`: InputAttributes = null,
    `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined,
    `job-authorization-uri`: String = null,
    `job-hold-until`: JobHoldUntil = null,
    `job-hold-until-time`: String = null,
    `job-id`: js.UndefOr[Double] = js.undefined,
    `job-ids`: js.Array[Double] = null,
    `job-impressions`: js.UndefOr[Double] = js.undefined,
    `job-impressions-col`: Impressions = null,
    `job-impressions-estimated`: js.UndefOr[Double] = js.undefined,
    `job-k-octets`: js.UndefOr[Double] = js.undefined,
    `job-mandatory-attributes`: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ] = null,
    `job-media-sheets`: js.UndefOr[Double] = js.undefined,
    `job-media-sheets-col`: MediaSheets = null,
    `job-message-from-operator`: String = null,
    `job-name`: String = null,
    `job-pages`: js.UndefOr[Double] = js.undefined,
    `job-pages-col`: Pages = null,
    `job-password`: String = null,
    `job-password-encryption`: JobPasswordEncryption = null,
    `job-state`: JobState = null,
    `job-state-message`: String = null,
    `job-state-reasons`: js.Array[JobStateReasons] = null,
    `job-uri`: String = null,
    `last-document`: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    message: String = null,
    `my-jobs`: js.UndefOr[Boolean] = js.undefined,
    `notify-get-interval`: js.UndefOr[Double] = js.undefined,
    `notify-printer-ids`: js.Array[Double] = null,
    `notify-resource-id`: js.UndefOr[Double] = js.undefined,
    `notify-sequence-numbers`: js.Array[Double] = null,
    `notify-subscription-ids`: js.Array[Double] = null,
    `notify-wait`: js.UndefOr[Boolean] = js.undefined,
    `original-requesting-user-name`: String = null,
    `output-attributes`: OutputAttributes = null,
    `output-device-job-states`: js.Array[String] = null,
    `output-device-uuid`: String = null,
    `preferred-attributes`: js.Object = null,
    `printer-geo-location`: String = null,
    `printer-id`: js.UndefOr[Double] = js.undefined,
    `printer-ids`: js.Array[Double] = null,
    `printer-location`: String = null,
    `printer-message-from-operator`: String = null,
    `printer-service-type`: js.Array[PrinterServiceType] = null,
    `printer-up-time`: js.UndefOr[Double] = js.undefined,
    `printer-uri`: String = null,
    `printer-xri-requested`: js.Array[PrinterXri] = null,
    `profile-uri-actual`: String = null,
    `requested-attributes`: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
    ] = null,
    `requesting-user-name`: String = null,
    `requesting-user-uri`: String = null,
    `resource-format`: MimeMediaType = null,
    `resource-format-accepted`: js.Array[MimeMediaType] = null,
    `resource-formats`: js.Array[MimeMediaType] = null,
    `resource-id`: js.UndefOr[Double] = js.undefined,
    `resource-ids`: js.Array[Double] = null,
    `resource-k-octets`: js.UndefOr[Double] = js.undefined,
    `resource-natural-language`: String = null,
    `resource-patches`: String = null,
    `resource-signature`: js.Array[String] = null,
    `resource-states`: js.Array[ResourceState] = null,
    `resource-string-version`: String = null,
    `resource-type`: ResourceType = null,
    `resource-types`: js.Array[ResourceType] = null,
    `resource-version`: String = null,
    `restart-get-interval`: js.UndefOr[Double] = js.undefined,
    `status-message`: String = null,
    `system-uri`: String = null,
    `which-jobs`: WhichJobs = null,
    `which-printers`: String = null
  ): OperationAttributes = {
    val __obj = js.Dynamic.literal()
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (`charge-info-message` != null) __obj.updateDynamic("charge-info-message")(`charge-info-message`.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (`compression-accepted` != null) __obj.updateDynamic("compression-accepted")(`compression-accepted`.asInstanceOf[js.Any])
    if (`destination-accesses` != null) __obj.updateDynamic("destination-accesses")(`destination-accesses`.asInstanceOf[js.Any])
    if (`detailed-status-message` != null) __obj.updateDynamic("detailed-status-message")(`detailed-status-message`.asInstanceOf[js.Any])
    if (`document-access` != null) __obj.updateDynamic("document-access")(`document-access`.asInstanceOf[js.Any])
    if (`document-access-error` != null) __obj.updateDynamic("document-access-error")(`document-access-error`.asInstanceOf[js.Any])
    if (`document-charset` != null) __obj.updateDynamic("document-charset")(`document-charset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`document-data-get-interval`)) __obj.updateDynamic("document-data-get-interval")(`document-data-get-interval`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`document-data-wait`)) __obj.updateDynamic("document-data-wait")(`document-data-wait`.get.asInstanceOf[js.Any])
    if (`document-digital-signature` != null) __obj.updateDynamic("document-digital-signature")(`document-digital-signature`.asInstanceOf[js.Any])
    if (`document-format` != null) __obj.updateDynamic("document-format")(`document-format`.asInstanceOf[js.Any])
    if (`document-format-accepted` != null) __obj.updateDynamic("document-format-accepted")(`document-format-accepted`.asInstanceOf[js.Any])
    if (`document-format-details` != null) __obj.updateDynamic("document-format-details")(`document-format-details`.asInstanceOf[js.Any])
    if (`document-message` != null) __obj.updateDynamic("document-message")(`document-message`.asInstanceOf[js.Any])
    if (`document-metadata` != null) __obj.updateDynamic("document-metadata")(`document-metadata`.asInstanceOf[js.Any])
    if (`document-name` != null) __obj.updateDynamic("document-name")(`document-name`.asInstanceOf[js.Any])
    if (`document-natural-language` != null) __obj.updateDynamic("document-natural-language")(`document-natural-language`.asInstanceOf[js.Any])
    if (!js.isUndefined(`document-number`)) __obj.updateDynamic("document-number")(`document-number`.get.asInstanceOf[js.Any])
    if (`document-password` != null) __obj.updateDynamic("document-password")(`document-password`.asInstanceOf[js.Any])
    if (!js.isUndefined(`document-preprocessed`)) __obj.updateDynamic("document-preprocessed")(`document-preprocessed`.get.asInstanceOf[js.Any])
    if (`fetch-status-code` != null) __obj.updateDynamic("fetch-status-code")(`fetch-status-code`.asInstanceOf[js.Any])
    if (`fetch-status-message` != null) __obj.updateDynamic("fetch-status-message")(`fetch-status-message`.asInstanceOf[js.Any])
    if (!js.isUndefined(`first-index`)) __obj.updateDynamic("first-index")(`first-index`.get.asInstanceOf[js.Any])
    if (`identify-actions` != null) __obj.updateDynamic("identify-actions")(`identify-actions`.asInstanceOf[js.Any])
    if (`input-attributes` != null) __obj.updateDynamic("input-attributes")(`input-attributes`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ipp-attribute-fidelity`)) __obj.updateDynamic("ipp-attribute-fidelity")(`ipp-attribute-fidelity`.get.asInstanceOf[js.Any])
    if (`job-authorization-uri` != null) __obj.updateDynamic("job-authorization-uri")(`job-authorization-uri`.asInstanceOf[js.Any])
    if (`job-hold-until` != null) __obj.updateDynamic("job-hold-until")(`job-hold-until`.asInstanceOf[js.Any])
    if (`job-hold-until-time` != null) __obj.updateDynamic("job-hold-until-time")(`job-hold-until-time`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-id`)) __obj.updateDynamic("job-id")(`job-id`.get.asInstanceOf[js.Any])
    if (`job-ids` != null) __obj.updateDynamic("job-ids")(`job-ids`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-impressions`)) __obj.updateDynamic("job-impressions")(`job-impressions`.get.asInstanceOf[js.Any])
    if (`job-impressions-col` != null) __obj.updateDynamic("job-impressions-col")(`job-impressions-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-impressions-estimated`)) __obj.updateDynamic("job-impressions-estimated")(`job-impressions-estimated`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-k-octets`)) __obj.updateDynamic("job-k-octets")(`job-k-octets`.get.asInstanceOf[js.Any])
    if (`job-mandatory-attributes` != null) __obj.updateDynamic("job-mandatory-attributes")(`job-mandatory-attributes`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-media-sheets`)) __obj.updateDynamic("job-media-sheets")(`job-media-sheets`.get.asInstanceOf[js.Any])
    if (`job-media-sheets-col` != null) __obj.updateDynamic("job-media-sheets-col")(`job-media-sheets-col`.asInstanceOf[js.Any])
    if (`job-message-from-operator` != null) __obj.updateDynamic("job-message-from-operator")(`job-message-from-operator`.asInstanceOf[js.Any])
    if (`job-name` != null) __obj.updateDynamic("job-name")(`job-name`.asInstanceOf[js.Any])
    if (!js.isUndefined(`job-pages`)) __obj.updateDynamic("job-pages")(`job-pages`.get.asInstanceOf[js.Any])
    if (`job-pages-col` != null) __obj.updateDynamic("job-pages-col")(`job-pages-col`.asInstanceOf[js.Any])
    if (`job-password` != null) __obj.updateDynamic("job-password")(`job-password`.asInstanceOf[js.Any])
    if (`job-password-encryption` != null) __obj.updateDynamic("job-password-encryption")(`job-password-encryption`.asInstanceOf[js.Any])
    if (`job-state` != null) __obj.updateDynamic("job-state")(`job-state`.asInstanceOf[js.Any])
    if (`job-state-message` != null) __obj.updateDynamic("job-state-message")(`job-state-message`.asInstanceOf[js.Any])
    if (`job-state-reasons` != null) __obj.updateDynamic("job-state-reasons")(`job-state-reasons`.asInstanceOf[js.Any])
    if (`job-uri` != null) __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    if (!js.isUndefined(`last-document`)) __obj.updateDynamic("last-document")(`last-document`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(`my-jobs`)) __obj.updateDynamic("my-jobs")(`my-jobs`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`notify-get-interval`)) __obj.updateDynamic("notify-get-interval")(`notify-get-interval`.get.asInstanceOf[js.Any])
    if (`notify-printer-ids` != null) __obj.updateDynamic("notify-printer-ids")(`notify-printer-ids`.asInstanceOf[js.Any])
    if (!js.isUndefined(`notify-resource-id`)) __obj.updateDynamic("notify-resource-id")(`notify-resource-id`.get.asInstanceOf[js.Any])
    if (`notify-sequence-numbers` != null) __obj.updateDynamic("notify-sequence-numbers")(`notify-sequence-numbers`.asInstanceOf[js.Any])
    if (`notify-subscription-ids` != null) __obj.updateDynamic("notify-subscription-ids")(`notify-subscription-ids`.asInstanceOf[js.Any])
    if (!js.isUndefined(`notify-wait`)) __obj.updateDynamic("notify-wait")(`notify-wait`.get.asInstanceOf[js.Any])
    if (`original-requesting-user-name` != null) __obj.updateDynamic("original-requesting-user-name")(`original-requesting-user-name`.asInstanceOf[js.Any])
    if (`output-attributes` != null) __obj.updateDynamic("output-attributes")(`output-attributes`.asInstanceOf[js.Any])
    if (`output-device-job-states` != null) __obj.updateDynamic("output-device-job-states")(`output-device-job-states`.asInstanceOf[js.Any])
    if (`output-device-uuid` != null) __obj.updateDynamic("output-device-uuid")(`output-device-uuid`.asInstanceOf[js.Any])
    if (`preferred-attributes` != null) __obj.updateDynamic("preferred-attributes")(`preferred-attributes`.asInstanceOf[js.Any])
    if (`printer-geo-location` != null) __obj.updateDynamic("printer-geo-location")(`printer-geo-location`.asInstanceOf[js.Any])
    if (!js.isUndefined(`printer-id`)) __obj.updateDynamic("printer-id")(`printer-id`.get.asInstanceOf[js.Any])
    if (`printer-ids` != null) __obj.updateDynamic("printer-ids")(`printer-ids`.asInstanceOf[js.Any])
    if (`printer-location` != null) __obj.updateDynamic("printer-location")(`printer-location`.asInstanceOf[js.Any])
    if (`printer-message-from-operator` != null) __obj.updateDynamic("printer-message-from-operator")(`printer-message-from-operator`.asInstanceOf[js.Any])
    if (`printer-service-type` != null) __obj.updateDynamic("printer-service-type")(`printer-service-type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`printer-up-time`)) __obj.updateDynamic("printer-up-time")(`printer-up-time`.get.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    if (`printer-xri-requested` != null) __obj.updateDynamic("printer-xri-requested")(`printer-xri-requested`.asInstanceOf[js.Any])
    if (`profile-uri-actual` != null) __obj.updateDynamic("profile-uri-actual")(`profile-uri-actual`.asInstanceOf[js.Any])
    if (`requested-attributes` != null) __obj.updateDynamic("requested-attributes")(`requested-attributes`.asInstanceOf[js.Any])
    if (`requesting-user-name` != null) __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`requesting-user-uri` != null) __obj.updateDynamic("requesting-user-uri")(`requesting-user-uri`.asInstanceOf[js.Any])
    if (`resource-format` != null) __obj.updateDynamic("resource-format")(`resource-format`.asInstanceOf[js.Any])
    if (`resource-format-accepted` != null) __obj.updateDynamic("resource-format-accepted")(`resource-format-accepted`.asInstanceOf[js.Any])
    if (`resource-formats` != null) __obj.updateDynamic("resource-formats")(`resource-formats`.asInstanceOf[js.Any])
    if (!js.isUndefined(`resource-id`)) __obj.updateDynamic("resource-id")(`resource-id`.get.asInstanceOf[js.Any])
    if (`resource-ids` != null) __obj.updateDynamic("resource-ids")(`resource-ids`.asInstanceOf[js.Any])
    if (!js.isUndefined(`resource-k-octets`)) __obj.updateDynamic("resource-k-octets")(`resource-k-octets`.get.asInstanceOf[js.Any])
    if (`resource-natural-language` != null) __obj.updateDynamic("resource-natural-language")(`resource-natural-language`.asInstanceOf[js.Any])
    if (`resource-patches` != null) __obj.updateDynamic("resource-patches")(`resource-patches`.asInstanceOf[js.Any])
    if (`resource-signature` != null) __obj.updateDynamic("resource-signature")(`resource-signature`.asInstanceOf[js.Any])
    if (`resource-states` != null) __obj.updateDynamic("resource-states")(`resource-states`.asInstanceOf[js.Any])
    if (`resource-string-version` != null) __obj.updateDynamic("resource-string-version")(`resource-string-version`.asInstanceOf[js.Any])
    if (`resource-type` != null) __obj.updateDynamic("resource-type")(`resource-type`.asInstanceOf[js.Any])
    if (`resource-types` != null) __obj.updateDynamic("resource-types")(`resource-types`.asInstanceOf[js.Any])
    if (`resource-version` != null) __obj.updateDynamic("resource-version")(`resource-version`.asInstanceOf[js.Any])
    if (!js.isUndefined(`restart-get-interval`)) __obj.updateDynamic("restart-get-interval")(`restart-get-interval`.get.asInstanceOf[js.Any])
    if (`status-message` != null) __obj.updateDynamic("status-message")(`status-message`.asInstanceOf[js.Any])
    if (`system-uri` != null) __obj.updateDynamic("system-uri")(`system-uri`.asInstanceOf[js.Any])
    if (`which-jobs` != null) __obj.updateDynamic("which-jobs")(`which-jobs`.asInstanceOf[js.Any])
    if (`which-printers` != null) __obj.updateDynamic("which-printers")(`which-printers`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAttributes]
  }
}

