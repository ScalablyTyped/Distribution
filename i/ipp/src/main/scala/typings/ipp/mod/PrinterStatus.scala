package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterStatus extends StObject {
  
  var `chamber-humidity-current`: js.UndefOr[Double] = js.undefined
  
  var `chamber-temperature-current`: js.UndefOr[Double] = js.undefined
  
  var `device-service-count`: js.UndefOr[Double] = js.undefined
  
  var `device-uuid`: js.UndefOr[String] = js.undefined
  
  var `document-format-varying-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ Any
    ]
  ] = js.undefined
  
  var `job-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ Any
    ]
  ] = js.undefined
  
  var `pages-per-minute`: js.UndefOr[Double] = js.undefined
  
  var `pages-per-minute-color`: js.UndefOr[Double] = js.undefined
  
  var `printer-alert`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-alert-description`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-camera-image-uri`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-config-change-date-time`: js.UndefOr[String] = js.undefined
  
  var `printer-config-change-time`: js.UndefOr[Double] = js.undefined
  
  var `printer-config-changes`: js.UndefOr[Double] = js.undefined
  
  var `printer-detailed-status-messages`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-finisher`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-finisher-description`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-finisher-supplies`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-finisher-supplies-description`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-id`: js.UndefOr[Double] = js.undefined
  
  var `printer-impressions-completed`: js.UndefOr[Double] = js.undefined
  
  var `printer-impressions-completed-col`: js.UndefOr[Impressions] = js.undefined
  
  var `printer-input-tray`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-is-accepting-jobs`: js.UndefOr[Boolean] = js.undefined
  
  var `printer-media-sheets-completed`: js.UndefOr[Double] = js.undefined
  
  var `printer-media-sheets-completed-col`: js.UndefOr[MediaSheets] = js.undefined
  
  var `printer-message-date-time`: js.UndefOr[String] = js.undefined
  
  var `printer-message-from-operator`: js.UndefOr[String] = js.undefined
  
  var `printer-message-time`: js.UndefOr[Double] = js.undefined
  
  var `printer-more-info`: js.UndefOr[String] = js.undefined
  
  var `printer-output-tray`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-pages-completed`: js.UndefOr[Double] = js.undefined
  
  var `printer-pages-completed-col`: js.UndefOr[Pages] = js.undefined
  
  var `printer-service-type`: js.UndefOr[PrinterServiceType] = js.undefined
  
  var `printer-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ Any
    ]
  ] = js.undefined
  
  var `printer-state`: js.UndefOr[PrinterState] = js.undefined
  
  var `printer-state-change-date-time`: js.UndefOr[String] = js.undefined
  
  var `printer-state-change-time`: js.UndefOr[Double] = js.undefined
  
  var `printer-state-message`: js.UndefOr[String] = js.undefined
  
  var `printer-state-reasons`: js.UndefOr[js.Array[PrinterStateReasons]] = js.undefined
  
  var `printer-static-resource-k-octets-free`: js.UndefOr[Double] = js.undefined
  
  var `printer-supply`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-supply-description`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-supply-info-uri`: js.UndefOr[String] = js.undefined
  
  var `printer-up-time`: js.UndefOr[Double] = js.undefined
  
  var `printer-uri-supported`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `printer-uuid`: js.UndefOr[String] = js.undefined
  
  var `queued-job-count`: js.UndefOr[Double] = js.undefined
  
  var `xri-authentication-supported`: js.UndefOr[js.Array[XriAuthentication]] = js.undefined
  
  var `xri-security-supported`: js.UndefOr[js.Array[XriSecurity]] = js.undefined
  
  var `xri-uri-scheme-supported`: js.UndefOr[js.Array[UriSchemes]] = js.undefined
}
object PrinterStatus {
  
  inline def apply(): PrinterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterStatus]
  }
  
  extension [Self <: PrinterStatus](x: Self) {
    
    inline def `setChamber-humidity-current`(value: Double): Self = StObject.set(x, "chamber-humidity-current", value.asInstanceOf[js.Any])
    
    inline def `setChamber-humidity-currentUndefined`: Self = StObject.set(x, "chamber-humidity-current", js.undefined)
    
    inline def `setChamber-temperature-current`(value: Double): Self = StObject.set(x, "chamber-temperature-current", value.asInstanceOf[js.Any])
    
    inline def `setChamber-temperature-currentUndefined`: Self = StObject.set(x, "chamber-temperature-current", js.undefined)
    
    inline def `setDevice-service-count`(value: Double): Self = StObject.set(x, "device-service-count", value.asInstanceOf[js.Any])
    
    inline def `setDevice-service-countUndefined`: Self = StObject.set(x, "device-service-count", js.undefined)
    
    inline def `setDevice-uuid`(value: String): Self = StObject.set(x, "device-uuid", value.asInstanceOf[js.Any])
    
    inline def `setDevice-uuidUndefined`: Self = StObject.set(x, "device-uuid", js.undefined)
    
    inline def `setDocument-format-varying-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ Any
        ]
    ): Self = StObject.set(x, "document-format-varying-attributes", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-varying-attributesUndefined`: Self = StObject.set(x, "document-format-varying-attributes", js.undefined)
    
    inline def `setDocument-format-varying-attributesVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ Any)*): Self = StObject.set(x, "document-format-varying-attributes", js.Array(value*))
    
    inline def `setJob-settable-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ Any
        ]
    ): Self = StObject.set(x, "job-settable-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-settable-attributes-supportedUndefined`: Self = StObject.set(x, "job-settable-attributes-supported", js.undefined)
    
    inline def `setJob-settable-attributes-supportedVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ Any)*): Self = StObject.set(x, "job-settable-attributes-supported", js.Array(value*))
    
    inline def `setPages-per-minute`(value: Double): Self = StObject.set(x, "pages-per-minute", value.asInstanceOf[js.Any])
    
    inline def `setPages-per-minute-color`(value: Double): Self = StObject.set(x, "pages-per-minute-color", value.asInstanceOf[js.Any])
    
    inline def `setPages-per-minute-colorUndefined`: Self = StObject.set(x, "pages-per-minute-color", js.undefined)
    
    inline def `setPages-per-minuteUndefined`: Self = StObject.set(x, "pages-per-minute", js.undefined)
    
    inline def `setPrinter-alert`(value: js.Array[String]): Self = StObject.set(x, "printer-alert", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-alert-description`(value: js.Array[String]): Self = StObject.set(x, "printer-alert-description", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-alert-descriptionUndefined`: Self = StObject.set(x, "printer-alert-description", js.undefined)
    
    inline def `setPrinter-alert-descriptionVarargs`(value: String*): Self = StObject.set(x, "printer-alert-description", js.Array(value*))
    
    inline def `setPrinter-alertUndefined`: Self = StObject.set(x, "printer-alert", js.undefined)
    
    inline def `setPrinter-alertVarargs`(value: String*): Self = StObject.set(x, "printer-alert", js.Array(value*))
    
    inline def `setPrinter-camera-image-uri`(value: js.Array[String]): Self = StObject.set(x, "printer-camera-image-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-camera-image-uriUndefined`: Self = StObject.set(x, "printer-camera-image-uri", js.undefined)
    
    inline def `setPrinter-camera-image-uriVarargs`(value: String*): Self = StObject.set(x, "printer-camera-image-uri", js.Array(value*))
    
    inline def `setPrinter-config-change-date-time`(value: String): Self = StObject.set(x, "printer-config-change-date-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-config-change-date-timeUndefined`: Self = StObject.set(x, "printer-config-change-date-time", js.undefined)
    
    inline def `setPrinter-config-change-time`(value: Double): Self = StObject.set(x, "printer-config-change-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-config-change-timeUndefined`: Self = StObject.set(x, "printer-config-change-time", js.undefined)
    
    inline def `setPrinter-config-changes`(value: Double): Self = StObject.set(x, "printer-config-changes", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-config-changesUndefined`: Self = StObject.set(x, "printer-config-changes", js.undefined)
    
    inline def `setPrinter-detailed-status-messages`(value: js.Array[String]): Self = StObject.set(x, "printer-detailed-status-messages", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-detailed-status-messagesUndefined`: Self = StObject.set(x, "printer-detailed-status-messages", js.undefined)
    
    inline def `setPrinter-detailed-status-messagesVarargs`(value: String*): Self = StObject.set(x, "printer-detailed-status-messages", js.Array(value*))
    
    inline def `setPrinter-finisher`(value: js.Array[String]): Self = StObject.set(x, "printer-finisher", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-finisher-description`(value: js.Array[String]): Self = StObject.set(x, "printer-finisher-description", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-finisher-descriptionUndefined`: Self = StObject.set(x, "printer-finisher-description", js.undefined)
    
    inline def `setPrinter-finisher-descriptionVarargs`(value: String*): Self = StObject.set(x, "printer-finisher-description", js.Array(value*))
    
    inline def `setPrinter-finisher-supplies`(value: js.Array[String]): Self = StObject.set(x, "printer-finisher-supplies", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-finisher-supplies-description`(value: js.Array[String]): Self = StObject.set(x, "printer-finisher-supplies-description", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-finisher-supplies-descriptionUndefined`: Self = StObject.set(x, "printer-finisher-supplies-description", js.undefined)
    
    inline def `setPrinter-finisher-supplies-descriptionVarargs`(value: String*): Self = StObject.set(x, "printer-finisher-supplies-description", js.Array(value*))
    
    inline def `setPrinter-finisher-suppliesUndefined`: Self = StObject.set(x, "printer-finisher-supplies", js.undefined)
    
    inline def `setPrinter-finisher-suppliesVarargs`(value: String*): Self = StObject.set(x, "printer-finisher-supplies", js.Array(value*))
    
    inline def `setPrinter-finisherUndefined`: Self = StObject.set(x, "printer-finisher", js.undefined)
    
    inline def `setPrinter-finisherVarargs`(value: String*): Self = StObject.set(x, "printer-finisher", js.Array(value*))
    
    inline def `setPrinter-id`(value: Double): Self = StObject.set(x, "printer-id", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-idUndefined`: Self = StObject.set(x, "printer-id", js.undefined)
    
    inline def `setPrinter-impressions-completed`(value: Double): Self = StObject.set(x, "printer-impressions-completed", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-impressions-completed-col`(value: Impressions): Self = StObject.set(x, "printer-impressions-completed-col", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-impressions-completed-colUndefined`: Self = StObject.set(x, "printer-impressions-completed-col", js.undefined)
    
    inline def `setPrinter-impressions-completedUndefined`: Self = StObject.set(x, "printer-impressions-completed", js.undefined)
    
    inline def `setPrinter-input-tray`(value: js.Array[String]): Self = StObject.set(x, "printer-input-tray", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-input-trayUndefined`: Self = StObject.set(x, "printer-input-tray", js.undefined)
    
    inline def `setPrinter-input-trayVarargs`(value: String*): Self = StObject.set(x, "printer-input-tray", js.Array(value*))
    
    inline def `setPrinter-is-accepting-jobs`(value: Boolean): Self = StObject.set(x, "printer-is-accepting-jobs", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-is-accepting-jobsUndefined`: Self = StObject.set(x, "printer-is-accepting-jobs", js.undefined)
    
    inline def `setPrinter-media-sheets-completed`(value: Double): Self = StObject.set(x, "printer-media-sheets-completed", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-media-sheets-completed-col`(value: MediaSheets): Self = StObject.set(x, "printer-media-sheets-completed-col", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-media-sheets-completed-colUndefined`: Self = StObject.set(x, "printer-media-sheets-completed-col", js.undefined)
    
    inline def `setPrinter-media-sheets-completedUndefined`: Self = StObject.set(x, "printer-media-sheets-completed", js.undefined)
    
    inline def `setPrinter-message-date-time`(value: String): Self = StObject.set(x, "printer-message-date-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-message-date-timeUndefined`: Self = StObject.set(x, "printer-message-date-time", js.undefined)
    
    inline def `setPrinter-message-from-operator`(value: String): Self = StObject.set(x, "printer-message-from-operator", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-message-from-operatorUndefined`: Self = StObject.set(x, "printer-message-from-operator", js.undefined)
    
    inline def `setPrinter-message-time`(value: Double): Self = StObject.set(x, "printer-message-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-message-timeUndefined`: Self = StObject.set(x, "printer-message-time", js.undefined)
    
    inline def `setPrinter-more-info`(value: String): Self = StObject.set(x, "printer-more-info", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-more-infoUndefined`: Self = StObject.set(x, "printer-more-info", js.undefined)
    
    inline def `setPrinter-output-tray`(value: js.Array[String]): Self = StObject.set(x, "printer-output-tray", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-output-trayUndefined`: Self = StObject.set(x, "printer-output-tray", js.undefined)
    
    inline def `setPrinter-output-trayVarargs`(value: String*): Self = StObject.set(x, "printer-output-tray", js.Array(value*))
    
    inline def `setPrinter-pages-completed`(value: Double): Self = StObject.set(x, "printer-pages-completed", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-pages-completed-col`(value: Pages): Self = StObject.set(x, "printer-pages-completed-col", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-pages-completed-colUndefined`: Self = StObject.set(x, "printer-pages-completed-col", js.undefined)
    
    inline def `setPrinter-pages-completedUndefined`: Self = StObject.set(x, "printer-pages-completed", js.undefined)
    
    inline def `setPrinter-service-type`(value: PrinterServiceType): Self = StObject.set(x, "printer-service-type", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-service-typeUndefined`: Self = StObject.set(x, "printer-service-type", js.undefined)
    
    inline def `setPrinter-settable-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ Any
        ]
    ): Self = StObject.set(x, "printer-settable-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-settable-attributes-supportedUndefined`: Self = StObject.set(x, "printer-settable-attributes-supported", js.undefined)
    
    inline def `setPrinter-settable-attributes-supportedVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ Any)*): Self = StObject.set(x, "printer-settable-attributes-supported", js.Array(value*))
    
    inline def `setPrinter-state`(value: PrinterState): Self = StObject.set(x, "printer-state", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-state-change-date-time`(value: String): Self = StObject.set(x, "printer-state-change-date-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-state-change-date-timeUndefined`: Self = StObject.set(x, "printer-state-change-date-time", js.undefined)
    
    inline def `setPrinter-state-change-time`(value: Double): Self = StObject.set(x, "printer-state-change-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-state-change-timeUndefined`: Self = StObject.set(x, "printer-state-change-time", js.undefined)
    
    inline def `setPrinter-state-message`(value: String): Self = StObject.set(x, "printer-state-message", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-state-messageUndefined`: Self = StObject.set(x, "printer-state-message", js.undefined)
    
    inline def `setPrinter-state-reasons`(value: js.Array[PrinterStateReasons]): Self = StObject.set(x, "printer-state-reasons", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-state-reasonsUndefined`: Self = StObject.set(x, "printer-state-reasons", js.undefined)
    
    inline def `setPrinter-state-reasonsVarargs`(value: PrinterStateReasons*): Self = StObject.set(x, "printer-state-reasons", js.Array(value*))
    
    inline def `setPrinter-stateUndefined`: Self = StObject.set(x, "printer-state", js.undefined)
    
    inline def `setPrinter-static-resource-k-octets-free`(value: Double): Self = StObject.set(x, "printer-static-resource-k-octets-free", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-static-resource-k-octets-freeUndefined`: Self = StObject.set(x, "printer-static-resource-k-octets-free", js.undefined)
    
    inline def `setPrinter-supply`(value: js.Array[String]): Self = StObject.set(x, "printer-supply", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-supply-description`(value: js.Array[String]): Self = StObject.set(x, "printer-supply-description", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-supply-descriptionUndefined`: Self = StObject.set(x, "printer-supply-description", js.undefined)
    
    inline def `setPrinter-supply-descriptionVarargs`(value: String*): Self = StObject.set(x, "printer-supply-description", js.Array(value*))
    
    inline def `setPrinter-supply-info-uri`(value: String): Self = StObject.set(x, "printer-supply-info-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-supply-info-uriUndefined`: Self = StObject.set(x, "printer-supply-info-uri", js.undefined)
    
    inline def `setPrinter-supplyUndefined`: Self = StObject.set(x, "printer-supply", js.undefined)
    
    inline def `setPrinter-supplyVarargs`(value: String*): Self = StObject.set(x, "printer-supply", js.Array(value*))
    
    inline def `setPrinter-up-time`(value: Double): Self = StObject.set(x, "printer-up-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-up-timeUndefined`: Self = StObject.set(x, "printer-up-time", js.undefined)
    
    inline def `setPrinter-uri-supported`(value: js.Array[String]): Self = StObject.set(x, "printer-uri-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uri-supportedUndefined`: Self = StObject.set(x, "printer-uri-supported", js.undefined)
    
    inline def `setPrinter-uri-supportedVarargs`(value: String*): Self = StObject.set(x, "printer-uri-supported", js.Array(value*))
    
    inline def `setPrinter-uuid`(value: String): Self = StObject.set(x, "printer-uuid", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uuidUndefined`: Self = StObject.set(x, "printer-uuid", js.undefined)
    
    inline def `setQueued-job-count`(value: Double): Self = StObject.set(x, "queued-job-count", value.asInstanceOf[js.Any])
    
    inline def `setQueued-job-countUndefined`: Self = StObject.set(x, "queued-job-count", js.undefined)
    
    inline def `setXri-authentication-supported`(value: js.Array[XriAuthentication]): Self = StObject.set(x, "xri-authentication-supported", value.asInstanceOf[js.Any])
    
    inline def `setXri-authentication-supportedUndefined`: Self = StObject.set(x, "xri-authentication-supported", js.undefined)
    
    inline def `setXri-authentication-supportedVarargs`(value: XriAuthentication*): Self = StObject.set(x, "xri-authentication-supported", js.Array(value*))
    
    inline def `setXri-security-supported`(value: js.Array[XriSecurity]): Self = StObject.set(x, "xri-security-supported", value.asInstanceOf[js.Any])
    
    inline def `setXri-security-supportedUndefined`: Self = StObject.set(x, "xri-security-supported", js.undefined)
    
    inline def `setXri-security-supportedVarargs`(value: XriSecurity*): Self = StObject.set(x, "xri-security-supported", js.Array(value*))
    
    inline def `setXri-uri-scheme-supported`(value: js.Array[UriSchemes]): Self = StObject.set(x, "xri-uri-scheme-supported", value.asInstanceOf[js.Any])
    
    inline def `setXri-uri-scheme-supportedUndefined`: Self = StObject.set(x, "xri-uri-scheme-supported", js.undefined)
    
    inline def `setXri-uri-scheme-supportedVarargs`(value: UriSchemes*): Self = StObject.set(x, "xri-uri-scheme-supported", js.Array(value*))
  }
}
