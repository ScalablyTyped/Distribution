package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationAttributes extends StObject {
  
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
  
  inline def apply(): OperationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationAttributes]
  }
  
  extension [Self <: OperationAttributes](x: Self) {
    
    inline def `setAttributes-charset`(value: String): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    inline def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    inline def `setCharge-info-message`(value: String): Self = StObject.set(x, "charge-info-message", value.asInstanceOf[js.Any])
    
    inline def `setCharge-info-messageUndefined`: Self = StObject.set(x, "charge-info-message", js.undefined)
    
    inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def `setCompression-accepted`(value: js.Array[Compression]): Self = StObject.set(x, "compression-accepted", value.asInstanceOf[js.Any])
    
    inline def `setCompression-acceptedUndefined`: Self = StObject.set(x, "compression-accepted", js.undefined)
    
    inline def `setCompression-acceptedVarargs`(value: Compression*): Self = StObject.set(x, "compression-accepted", js.Array(value :_*))
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def `setDestination-accesses`(value: js.Array[DestionationAccesses]): Self = StObject.set(x, "destination-accesses", value.asInstanceOf[js.Any])
    
    inline def `setDestination-accessesUndefined`: Self = StObject.set(x, "destination-accesses", js.undefined)
    
    inline def `setDestination-accessesVarargs`(value: DestionationAccesses*): Self = StObject.set(x, "destination-accesses", js.Array(value :_*))
    
    inline def `setDetailed-status-message`(value: String): Self = StObject.set(x, "detailed-status-message", value.asInstanceOf[js.Any])
    
    inline def `setDetailed-status-messageUndefined`: Self = StObject.set(x, "detailed-status-message", js.undefined)
    
    inline def `setDocument-access`(value: DocumentAccess): Self = StObject.set(x, "document-access", value.asInstanceOf[js.Any])
    
    inline def `setDocument-access-error`(value: String): Self = StObject.set(x, "document-access-error", value.asInstanceOf[js.Any])
    
    inline def `setDocument-access-errorUndefined`: Self = StObject.set(x, "document-access-error", js.undefined)
    
    inline def `setDocument-accessUndefined`: Self = StObject.set(x, "document-access", js.undefined)
    
    inline def `setDocument-charset`(value: String): Self = StObject.set(x, "document-charset", value.asInstanceOf[js.Any])
    
    inline def `setDocument-charsetUndefined`: Self = StObject.set(x, "document-charset", js.undefined)
    
    inline def `setDocument-data-get-interval`(value: Double): Self = StObject.set(x, "document-data-get-interval", value.asInstanceOf[js.Any])
    
    inline def `setDocument-data-get-intervalUndefined`: Self = StObject.set(x, "document-data-get-interval", js.undefined)
    
    inline def `setDocument-data-wait`(value: Boolean): Self = StObject.set(x, "document-data-wait", value.asInstanceOf[js.Any])
    
    inline def `setDocument-data-waitUndefined`: Self = StObject.set(x, "document-data-wait", js.undefined)
    
    inline def `setDocument-digital-signature`(value: DocumentDigitalSignature): Self = StObject.set(x, "document-digital-signature", value.asInstanceOf[js.Any])
    
    inline def `setDocument-digital-signatureUndefined`: Self = StObject.set(x, "document-digital-signature", js.undefined)
    
    inline def `setDocument-format`(value: MimeMediaType): Self = StObject.set(x, "document-format", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-accepted`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "document-format-accepted", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-acceptedUndefined`: Self = StObject.set(x, "document-format-accepted", js.undefined)
    
    inline def `setDocument-format-acceptedVarargs`(value: MimeMediaType*): Self = StObject.set(x, "document-format-accepted", js.Array(value :_*))
    
    inline def `setDocument-format-details`(value: DocumentFormatDetails): Self = StObject.set(x, "document-format-details", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-detailsUndefined`: Self = StObject.set(x, "document-format-details", js.undefined)
    
    inline def `setDocument-formatUndefined`: Self = StObject.set(x, "document-format", js.undefined)
    
    inline def `setDocument-message`(value: String): Self = StObject.set(x, "document-message", value.asInstanceOf[js.Any])
    
    inline def `setDocument-messageUndefined`: Self = StObject.set(x, "document-message", js.undefined)
    
    inline def `setDocument-metadata`(value: js.Array[String]): Self = StObject.set(x, "document-metadata", value.asInstanceOf[js.Any])
    
    inline def `setDocument-metadataUndefined`: Self = StObject.set(x, "document-metadata", js.undefined)
    
    inline def `setDocument-metadataVarargs`(value: String*): Self = StObject.set(x, "document-metadata", js.Array(value :_*))
    
    inline def `setDocument-name`(value: String): Self = StObject.set(x, "document-name", value.asInstanceOf[js.Any])
    
    inline def `setDocument-nameUndefined`: Self = StObject.set(x, "document-name", js.undefined)
    
    inline def `setDocument-natural-language`(value: String): Self = StObject.set(x, "document-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setDocument-natural-languageUndefined`: Self = StObject.set(x, "document-natural-language", js.undefined)
    
    inline def `setDocument-number`(value: Double): Self = StObject.set(x, "document-number", value.asInstanceOf[js.Any])
    
    inline def `setDocument-numberUndefined`: Self = StObject.set(x, "document-number", js.undefined)
    
    inline def `setDocument-password`(value: String): Self = StObject.set(x, "document-password", value.asInstanceOf[js.Any])
    
    inline def `setDocument-passwordUndefined`: Self = StObject.set(x, "document-password", js.undefined)
    
    inline def `setDocument-preprocessed`(value: Boolean): Self = StObject.set(x, "document-preprocessed", value.asInstanceOf[js.Any])
    
    inline def `setDocument-preprocessedUndefined`: Self = StObject.set(x, "document-preprocessed", js.undefined)
    
    inline def `setFetch-status-code`(value: StatusCode): Self = StObject.set(x, "fetch-status-code", value.asInstanceOf[js.Any])
    
    inline def `setFetch-status-codeUndefined`: Self = StObject.set(x, "fetch-status-code", js.undefined)
    
    inline def `setFetch-status-message`(value: String): Self = StObject.set(x, "fetch-status-message", value.asInstanceOf[js.Any])
    
    inline def `setFetch-status-messageUndefined`: Self = StObject.set(x, "fetch-status-message", js.undefined)
    
    inline def `setFirst-index`(value: Double): Self = StObject.set(x, "first-index", value.asInstanceOf[js.Any])
    
    inline def `setFirst-indexUndefined`: Self = StObject.set(x, "first-index", js.undefined)
    
    inline def `setIdentify-actions`(value: js.Array[IdentifyActions]): Self = StObject.set(x, "identify-actions", value.asInstanceOf[js.Any])
    
    inline def `setIdentify-actionsUndefined`: Self = StObject.set(x, "identify-actions", js.undefined)
    
    inline def `setIdentify-actionsVarargs`(value: IdentifyActions*): Self = StObject.set(x, "identify-actions", js.Array(value :_*))
    
    inline def `setInput-attributes`(value: InputAttributes): Self = StObject.set(x, "input-attributes", value.asInstanceOf[js.Any])
    
    inline def `setInput-attributesUndefined`: Self = StObject.set(x, "input-attributes", js.undefined)
    
    inline def `setIpp-attribute-fidelity`(value: Boolean): Self = StObject.set(x, "ipp-attribute-fidelity", value.asInstanceOf[js.Any])
    
    inline def `setIpp-attribute-fidelityUndefined`: Self = StObject.set(x, "ipp-attribute-fidelity", js.undefined)
    
    inline def `setJob-authorization-uri`(value: String): Self = StObject.set(x, "job-authorization-uri", value.asInstanceOf[js.Any])
    
    inline def `setJob-authorization-uriUndefined`: Self = StObject.set(x, "job-authorization-uri", js.undefined)
    
    inline def `setJob-hold-until`(value: JobHoldUntil): Self = StObject.set(x, "job-hold-until", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-time`(value: String): Self = StObject.set(x, "job-hold-until-time", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-timeUndefined`: Self = StObject.set(x, "job-hold-until-time", js.undefined)
    
    inline def `setJob-hold-untilUndefined`: Self = StObject.set(x, "job-hold-until", js.undefined)
    
    inline def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    inline def `setJob-idUndefined`: Self = StObject.set(x, "job-id", js.undefined)
    
    inline def `setJob-ids`(value: js.Array[Double]): Self = StObject.set(x, "job-ids", value.asInstanceOf[js.Any])
    
    inline def `setJob-idsUndefined`: Self = StObject.set(x, "job-ids", js.undefined)
    
    inline def `setJob-idsVarargs`(value: Double*): Self = StObject.set(x, "job-ids", js.Array(value :_*))
    
    inline def `setJob-impressions`(value: Double): Self = StObject.set(x, "job-impressions", value.asInstanceOf[js.Any])
    
    inline def `setJob-impressions-col`(value: Impressions): Self = StObject.set(x, "job-impressions-col", value.asInstanceOf[js.Any])
    
    inline def `setJob-impressions-colUndefined`: Self = StObject.set(x, "job-impressions-col", js.undefined)
    
    inline def `setJob-impressions-estimated`(value: Double): Self = StObject.set(x, "job-impressions-estimated", value.asInstanceOf[js.Any])
    
    inline def `setJob-impressions-estimatedUndefined`: Self = StObject.set(x, "job-impressions-estimated", js.undefined)
    
    inline def `setJob-impressionsUndefined`: Self = StObject.set(x, "job-impressions", js.undefined)
    
    inline def `setJob-k-octets`(value: Double): Self = StObject.set(x, "job-k-octets", value.asInstanceOf[js.Any])
    
    inline def `setJob-k-octetsUndefined`: Self = StObject.set(x, "job-k-octets", js.undefined)
    
    inline def `setJob-mandatory-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = StObject.set(x, "job-mandatory-attributes", value.asInstanceOf[js.Any])
    
    inline def `setJob-mandatory-attributesUndefined`: Self = StObject.set(x, "job-mandatory-attributes", js.undefined)
    
    inline def `setJob-mandatory-attributesVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any)*): Self = StObject.set(x, "job-mandatory-attributes", js.Array(value :_*))
    
    inline def `setJob-media-sheets`(value: Double): Self = StObject.set(x, "job-media-sheets", value.asInstanceOf[js.Any])
    
    inline def `setJob-media-sheets-col`(value: MediaSheets): Self = StObject.set(x, "job-media-sheets-col", value.asInstanceOf[js.Any])
    
    inline def `setJob-media-sheets-colUndefined`: Self = StObject.set(x, "job-media-sheets-col", js.undefined)
    
    inline def `setJob-media-sheetsUndefined`: Self = StObject.set(x, "job-media-sheets", js.undefined)
    
    inline def `setJob-message-from-operator`(value: String): Self = StObject.set(x, "job-message-from-operator", value.asInstanceOf[js.Any])
    
    inline def `setJob-message-from-operatorUndefined`: Self = StObject.set(x, "job-message-from-operator", js.undefined)
    
    inline def `setJob-name`(value: String): Self = StObject.set(x, "job-name", value.asInstanceOf[js.Any])
    
    inline def `setJob-nameUndefined`: Self = StObject.set(x, "job-name", js.undefined)
    
    inline def `setJob-pages`(value: Double): Self = StObject.set(x, "job-pages", value.asInstanceOf[js.Any])
    
    inline def `setJob-pages-col`(value: Pages): Self = StObject.set(x, "job-pages-col", value.asInstanceOf[js.Any])
    
    inline def `setJob-pages-colUndefined`: Self = StObject.set(x, "job-pages-col", js.undefined)
    
    inline def `setJob-pagesUndefined`: Self = StObject.set(x, "job-pages", js.undefined)
    
    inline def `setJob-password`(value: String): Self = StObject.set(x, "job-password", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-encryption`(value: JobPasswordEncryption): Self = StObject.set(x, "job-password-encryption", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-encryptionUndefined`: Self = StObject.set(x, "job-password-encryption", js.undefined)
    
    inline def `setJob-passwordUndefined`: Self = StObject.set(x, "job-password", js.undefined)
    
    inline def `setJob-state`(value: JobState): Self = StObject.set(x, "job-state", value.asInstanceOf[js.Any])
    
    inline def `setJob-state-message`(value: String): Self = StObject.set(x, "job-state-message", value.asInstanceOf[js.Any])
    
    inline def `setJob-state-messageUndefined`: Self = StObject.set(x, "job-state-message", js.undefined)
    
    inline def `setJob-state-reasons`(value: js.Array[JobStateReasons]): Self = StObject.set(x, "job-state-reasons", value.asInstanceOf[js.Any])
    
    inline def `setJob-state-reasonsUndefined`: Self = StObject.set(x, "job-state-reasons", js.undefined)
    
    inline def `setJob-state-reasonsVarargs`(value: JobStateReasons*): Self = StObject.set(x, "job-state-reasons", js.Array(value :_*))
    
    inline def `setJob-stateUndefined`: Self = StObject.set(x, "job-state", js.undefined)
    
    inline def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    inline def `setJob-uriUndefined`: Self = StObject.set(x, "job-uri", js.undefined)
    
    inline def `setLast-document`(value: Boolean): Self = StObject.set(x, "last-document", value.asInstanceOf[js.Any])
    
    inline def `setLast-documentUndefined`: Self = StObject.set(x, "last-document", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def `setMy-jobs`(value: Boolean): Self = StObject.set(x, "my-jobs", value.asInstanceOf[js.Any])
    
    inline def `setMy-jobsUndefined`: Self = StObject.set(x, "my-jobs", js.undefined)
    
    inline def `setNotify-get-interval`(value: Double): Self = StObject.set(x, "notify-get-interval", value.asInstanceOf[js.Any])
    
    inline def `setNotify-get-intervalUndefined`: Self = StObject.set(x, "notify-get-interval", js.undefined)
    
    inline def `setNotify-printer-ids`(value: js.Array[Double]): Self = StObject.set(x, "notify-printer-ids", value.asInstanceOf[js.Any])
    
    inline def `setNotify-printer-idsUndefined`: Self = StObject.set(x, "notify-printer-ids", js.undefined)
    
    inline def `setNotify-printer-idsVarargs`(value: Double*): Self = StObject.set(x, "notify-printer-ids", js.Array(value :_*))
    
    inline def `setNotify-resource-id`(value: Double): Self = StObject.set(x, "notify-resource-id", value.asInstanceOf[js.Any])
    
    inline def `setNotify-resource-idUndefined`: Self = StObject.set(x, "notify-resource-id", js.undefined)
    
    inline def `setNotify-sequence-numbers`(value: js.Array[Double]): Self = StObject.set(x, "notify-sequence-numbers", value.asInstanceOf[js.Any])
    
    inline def `setNotify-sequence-numbersUndefined`: Self = StObject.set(x, "notify-sequence-numbers", js.undefined)
    
    inline def `setNotify-sequence-numbersVarargs`(value: Double*): Self = StObject.set(x, "notify-sequence-numbers", js.Array(value :_*))
    
    inline def `setNotify-subscription-ids`(value: js.Array[Double]): Self = StObject.set(x, "notify-subscription-ids", value.asInstanceOf[js.Any])
    
    inline def `setNotify-subscription-idsUndefined`: Self = StObject.set(x, "notify-subscription-ids", js.undefined)
    
    inline def `setNotify-subscription-idsVarargs`(value: Double*): Self = StObject.set(x, "notify-subscription-ids", js.Array(value :_*))
    
    inline def `setNotify-wait`(value: Boolean): Self = StObject.set(x, "notify-wait", value.asInstanceOf[js.Any])
    
    inline def `setNotify-waitUndefined`: Self = StObject.set(x, "notify-wait", js.undefined)
    
    inline def `setOriginal-requesting-user-name`(value: String): Self = StObject.set(x, "original-requesting-user-name", value.asInstanceOf[js.Any])
    
    inline def `setOriginal-requesting-user-nameUndefined`: Self = StObject.set(x, "original-requesting-user-name", js.undefined)
    
    inline def `setOutput-attributes`(value: OutputAttributes): Self = StObject.set(x, "output-attributes", value.asInstanceOf[js.Any])
    
    inline def `setOutput-attributesUndefined`: Self = StObject.set(x, "output-attributes", js.undefined)
    
    inline def `setOutput-device-job-states`(value: js.Array[String]): Self = StObject.set(x, "output-device-job-states", value.asInstanceOf[js.Any])
    
    inline def `setOutput-device-job-statesUndefined`: Self = StObject.set(x, "output-device-job-states", js.undefined)
    
    inline def `setOutput-device-job-statesVarargs`(value: String*): Self = StObject.set(x, "output-device-job-states", js.Array(value :_*))
    
    inline def `setOutput-device-uuid`(value: String): Self = StObject.set(x, "output-device-uuid", value.asInstanceOf[js.Any])
    
    inline def `setOutput-device-uuidUndefined`: Self = StObject.set(x, "output-device-uuid", js.undefined)
    
    inline def `setPreferred-attributes`(value: js.Object): Self = StObject.set(x, "preferred-attributes", value.asInstanceOf[js.Any])
    
    inline def `setPreferred-attributesUndefined`: Self = StObject.set(x, "preferred-attributes", js.undefined)
    
    inline def `setPrinter-geo-location`(value: String): Self = StObject.set(x, "printer-geo-location", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-geo-locationUndefined`: Self = StObject.set(x, "printer-geo-location", js.undefined)
    
    inline def `setPrinter-id`(value: Double): Self = StObject.set(x, "printer-id", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-idUndefined`: Self = StObject.set(x, "printer-id", js.undefined)
    
    inline def `setPrinter-ids`(value: js.Array[Double]): Self = StObject.set(x, "printer-ids", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-idsUndefined`: Self = StObject.set(x, "printer-ids", js.undefined)
    
    inline def `setPrinter-idsVarargs`(value: Double*): Self = StObject.set(x, "printer-ids", js.Array(value :_*))
    
    inline def `setPrinter-location`(value: String): Self = StObject.set(x, "printer-location", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-locationUndefined`: Self = StObject.set(x, "printer-location", js.undefined)
    
    inline def `setPrinter-message-from-operator`(value: String): Self = StObject.set(x, "printer-message-from-operator", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-message-from-operatorUndefined`: Self = StObject.set(x, "printer-message-from-operator", js.undefined)
    
    inline def `setPrinter-service-type`(value: js.Array[PrinterServiceType]): Self = StObject.set(x, "printer-service-type", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-service-typeUndefined`: Self = StObject.set(x, "printer-service-type", js.undefined)
    
    inline def `setPrinter-service-typeVarargs`(value: PrinterServiceType*): Self = StObject.set(x, "printer-service-type", js.Array(value :_*))
    
    inline def `setPrinter-up-time`(value: Double): Self = StObject.set(x, "printer-up-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-up-timeUndefined`: Self = StObject.set(x, "printer-up-time", js.undefined)
    
    inline def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    inline def `setPrinter-xri-requested`(value: js.Array[PrinterXri]): Self = StObject.set(x, "printer-xri-requested", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-xri-requestedUndefined`: Self = StObject.set(x, "printer-xri-requested", js.undefined)
    
    inline def `setPrinter-xri-requestedVarargs`(value: PrinterXri*): Self = StObject.set(x, "printer-xri-requested", js.Array(value :_*))
    
    inline def `setProfile-uri-actual`(value: String): Self = StObject.set(x, "profile-uri-actual", value.asInstanceOf[js.Any])
    
    inline def `setProfile-uri-actualUndefined`: Self = StObject.set(x, "profile-uri-actual", js.undefined)
    
    inline def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
        ]
    ): Self = StObject.set(x, "requested-attributes", value.asInstanceOf[js.Any])
    
    inline def `setRequested-attributesUndefined`: Self = StObject.set(x, "requested-attributes", js.undefined)
    
    inline def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any)*
    ): Self = StObject.set(x, "requested-attributes", js.Array(value :_*))
    
    inline def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
    
    inline def `setRequesting-user-nameUndefined`: Self = StObject.set(x, "requesting-user-name", js.undefined)
    
    inline def `setRequesting-user-uri`(value: String): Self = StObject.set(x, "requesting-user-uri", value.asInstanceOf[js.Any])
    
    inline def `setRequesting-user-uriUndefined`: Self = StObject.set(x, "requesting-user-uri", js.undefined)
    
    inline def `setResource-format`(value: MimeMediaType): Self = StObject.set(x, "resource-format", value.asInstanceOf[js.Any])
    
    inline def `setResource-format-accepted`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "resource-format-accepted", value.asInstanceOf[js.Any])
    
    inline def `setResource-format-acceptedUndefined`: Self = StObject.set(x, "resource-format-accepted", js.undefined)
    
    inline def `setResource-format-acceptedVarargs`(value: MimeMediaType*): Self = StObject.set(x, "resource-format-accepted", js.Array(value :_*))
    
    inline def `setResource-formatUndefined`: Self = StObject.set(x, "resource-format", js.undefined)
    
    inline def `setResource-formats`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "resource-formats", value.asInstanceOf[js.Any])
    
    inline def `setResource-formatsUndefined`: Self = StObject.set(x, "resource-formats", js.undefined)
    
    inline def `setResource-formatsVarargs`(value: MimeMediaType*): Self = StObject.set(x, "resource-formats", js.Array(value :_*))
    
    inline def `setResource-id`(value: Double): Self = StObject.set(x, "resource-id", value.asInstanceOf[js.Any])
    
    inline def `setResource-idUndefined`: Self = StObject.set(x, "resource-id", js.undefined)
    
    inline def `setResource-ids`(value: js.Array[Double]): Self = StObject.set(x, "resource-ids", value.asInstanceOf[js.Any])
    
    inline def `setResource-idsUndefined`: Self = StObject.set(x, "resource-ids", js.undefined)
    
    inline def `setResource-idsVarargs`(value: Double*): Self = StObject.set(x, "resource-ids", js.Array(value :_*))
    
    inline def `setResource-k-octets`(value: Double): Self = StObject.set(x, "resource-k-octets", value.asInstanceOf[js.Any])
    
    inline def `setResource-k-octetsUndefined`: Self = StObject.set(x, "resource-k-octets", js.undefined)
    
    inline def `setResource-natural-language`(value: String): Self = StObject.set(x, "resource-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setResource-natural-languageUndefined`: Self = StObject.set(x, "resource-natural-language", js.undefined)
    
    inline def `setResource-patches`(value: String): Self = StObject.set(x, "resource-patches", value.asInstanceOf[js.Any])
    
    inline def `setResource-patchesUndefined`: Self = StObject.set(x, "resource-patches", js.undefined)
    
    inline def `setResource-signature`(value: js.Array[String]): Self = StObject.set(x, "resource-signature", value.asInstanceOf[js.Any])
    
    inline def `setResource-signatureUndefined`: Self = StObject.set(x, "resource-signature", js.undefined)
    
    inline def `setResource-signatureVarargs`(value: String*): Self = StObject.set(x, "resource-signature", js.Array(value :_*))
    
    inline def `setResource-states`(value: js.Array[ResourceState]): Self = StObject.set(x, "resource-states", value.asInstanceOf[js.Any])
    
    inline def `setResource-statesUndefined`: Self = StObject.set(x, "resource-states", js.undefined)
    
    inline def `setResource-statesVarargs`(value: ResourceState*): Self = StObject.set(x, "resource-states", js.Array(value :_*))
    
    inline def `setResource-string-version`(value: String): Self = StObject.set(x, "resource-string-version", value.asInstanceOf[js.Any])
    
    inline def `setResource-string-versionUndefined`: Self = StObject.set(x, "resource-string-version", js.undefined)
    
    inline def `setResource-type`(value: ResourceType): Self = StObject.set(x, "resource-type", value.asInstanceOf[js.Any])
    
    inline def `setResource-typeUndefined`: Self = StObject.set(x, "resource-type", js.undefined)
    
    inline def `setResource-types`(value: js.Array[ResourceType]): Self = StObject.set(x, "resource-types", value.asInstanceOf[js.Any])
    
    inline def `setResource-typesUndefined`: Self = StObject.set(x, "resource-types", js.undefined)
    
    inline def `setResource-typesVarargs`(value: ResourceType*): Self = StObject.set(x, "resource-types", js.Array(value :_*))
    
    inline def `setResource-version`(value: String): Self = StObject.set(x, "resource-version", value.asInstanceOf[js.Any])
    
    inline def `setResource-versionUndefined`: Self = StObject.set(x, "resource-version", js.undefined)
    
    inline def `setRestart-get-interval`(value: Double): Self = StObject.set(x, "restart-get-interval", value.asInstanceOf[js.Any])
    
    inline def `setRestart-get-intervalUndefined`: Self = StObject.set(x, "restart-get-interval", js.undefined)
    
    inline def `setStatus-message`(value: String): Self = StObject.set(x, "status-message", value.asInstanceOf[js.Any])
    
    inline def `setStatus-messageUndefined`: Self = StObject.set(x, "status-message", js.undefined)
    
    inline def `setSystem-uri`(value: String): Self = StObject.set(x, "system-uri", value.asInstanceOf[js.Any])
    
    inline def `setSystem-uriUndefined`: Self = StObject.set(x, "system-uri", js.undefined)
    
    inline def `setWhich-jobs`(value: WhichJobs): Self = StObject.set(x, "which-jobs", value.asInstanceOf[js.Any])
    
    inline def `setWhich-jobsUndefined`: Self = StObject.set(x, "which-jobs", js.undefined)
    
    inline def `setWhich-printers`(value: String): Self = StObject.set(x, "which-printers", value.asInstanceOf[js.Any])
    
    inline def `setWhich-printersUndefined`: Self = StObject.set(x, "which-printers", js.undefined)
  }
}
