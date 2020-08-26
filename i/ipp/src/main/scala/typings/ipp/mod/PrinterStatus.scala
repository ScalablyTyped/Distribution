package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterStatus extends js.Object {
  var `chamber-humidity-current`: js.UndefOr[Double] = js.native
  var `chamber-temperature-current`: js.UndefOr[Double] = js.native
  var `device-service-count`: js.UndefOr[Double] = js.native
  var `device-uuid`: js.UndefOr[String] = js.native
  var `document-format-varying-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
    ]
  ] = js.native
  var `job-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `pages-per-minute`: js.UndefOr[Double] = js.native
  var `pages-per-minute-color`: js.UndefOr[Double] = js.native
  var `printer-alert`: js.UndefOr[js.Array[String]] = js.native
  var `printer-alert-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-camera-image-uri`: js.UndefOr[js.Array[String]] = js.native
  var `printer-config-change-date-time`: js.UndefOr[String] = js.native
  var `printer-config-change-time`: js.UndefOr[Double] = js.native
  var `printer-config-changes`: js.UndefOr[Double] = js.native
  var `printer-detailed-status-messages`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher-supplies`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher-supplies-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-id`: js.UndefOr[Double] = js.native
  var `printer-impressions-completed`: js.UndefOr[Double] = js.native
  var `printer-impressions-completed-col`: js.UndefOr[Impressions] = js.native
  var `printer-input-tray`: js.UndefOr[js.Array[String]] = js.native
  var `printer-is-accepting-jobs`: js.UndefOr[Boolean] = js.native
  var `printer-media-sheets-completed`: js.UndefOr[Double] = js.native
  var `printer-media-sheets-completed-col`: js.UndefOr[MediaSheets] = js.native
  var `printer-message-date-time`: js.UndefOr[String] = js.native
  var `printer-message-from-operator`: js.UndefOr[String] = js.native
  var `printer-message-time`: js.UndefOr[Double] = js.native
  var `printer-more-info`: js.UndefOr[String] = js.native
  var `printer-output-tray`: js.UndefOr[js.Array[String]] = js.native
  var `printer-pages-completed`: js.UndefOr[Double] = js.native
  var `printer-pages-completed-col`: js.UndefOr[Pages] = js.native
  var `printer-service-type`: js.UndefOr[PrinterServiceType] = js.native
  var `printer-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
    ]
  ] = js.native
  var `printer-state`: js.UndefOr[PrinterState] = js.native
  var `printer-state-change-date-time`: js.UndefOr[String] = js.native
  var `printer-state-change-time`: js.UndefOr[Double] = js.native
  var `printer-state-message`: js.UndefOr[String] = js.native
  var `printer-state-reasons`: js.UndefOr[js.Array[PrinterStateReasons]] = js.native
  var `printer-static-resource-k-octets-free`: js.UndefOr[Double] = js.native
  var `printer-supply`: js.UndefOr[js.Array[String]] = js.native
  var `printer-supply-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-supply-info-uri`: js.UndefOr[String] = js.native
  var `printer-up-time`: js.UndefOr[Double] = js.native
  var `printer-uri-supported`: js.UndefOr[js.Array[String]] = js.native
  var `printer-uuid`: js.UndefOr[String] = js.native
  var `queued-job-count`: js.UndefOr[Double] = js.native
  var `xri-authentication-supported`: js.UndefOr[js.Array[XriAuthentication]] = js.native
  var `xri-security-supported`: js.UndefOr[js.Array[XriSecurity]] = js.native
  var `xri-uri-scheme-supported`: js.UndefOr[js.Array[UriSchemes]] = js.native
}

object PrinterStatus {
  @scala.inline
  def apply(): PrinterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterStatus]
  }
  @scala.inline
  implicit class PrinterStatusOps[Self <: PrinterStatus] (val x: Self) extends AnyVal {
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
    def `setChamber-humidity-current`(value: Double): Self = this.set("chamber-humidity-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-humidity-current`: Self = this.set("chamber-humidity-current", js.undefined)
    @scala.inline
    def `setChamber-temperature-current`(value: Double): Self = this.set("chamber-temperature-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-temperature-current`: Self = this.set("chamber-temperature-current", js.undefined)
    @scala.inline
    def `setDevice-service-count`(value: Double): Self = this.set("device-service-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDevice-service-count`: Self = this.set("device-service-count", js.undefined)
    @scala.inline
    def `setDevice-uuid`(value: String): Self = this.set("device-uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDevice-uuid`: Self = this.set("device-uuid", js.undefined)
    @scala.inline
    def `setDocument-format-varying-attributesVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any)*): Self = this.set("document-format-varying-attributes", js.Array(value :_*))
    @scala.inline
    def `setDocument-format-varying-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
        ]
    ): Self = this.set("document-format-varying-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-varying-attributes`: Self = this.set("document-format-varying-attributes", js.undefined)
    @scala.inline
    def `setJob-settable-attributes-supportedVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any)*): Self = this.set("job-settable-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-settable-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = this.set("job-settable-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-settable-attributes-supported`: Self = this.set("job-settable-attributes-supported", js.undefined)
    @scala.inline
    def `setPages-per-minute`(value: Double): Self = this.set("pages-per-minute", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePages-per-minute`: Self = this.set("pages-per-minute", js.undefined)
    @scala.inline
    def `setPages-per-minute-color`(value: Double): Self = this.set("pages-per-minute-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePages-per-minute-color`: Self = this.set("pages-per-minute-color", js.undefined)
    @scala.inline
    def `setPrinter-alertVarargs`(value: String*): Self = this.set("printer-alert", js.Array(value :_*))
    @scala.inline
    def `setPrinter-alert`(value: js.Array[String]): Self = this.set("printer-alert", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-alert`: Self = this.set("printer-alert", js.undefined)
    @scala.inline
    def `setPrinter-alert-descriptionVarargs`(value: String*): Self = this.set("printer-alert-description", js.Array(value :_*))
    @scala.inline
    def `setPrinter-alert-description`(value: js.Array[String]): Self = this.set("printer-alert-description", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-alert-description`: Self = this.set("printer-alert-description", js.undefined)
    @scala.inline
    def `setPrinter-camera-image-uriVarargs`(value: String*): Self = this.set("printer-camera-image-uri", js.Array(value :_*))
    @scala.inline
    def `setPrinter-camera-image-uri`(value: js.Array[String]): Self = this.set("printer-camera-image-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-camera-image-uri`: Self = this.set("printer-camera-image-uri", js.undefined)
    @scala.inline
    def `setPrinter-config-change-date-time`(value: String): Self = this.set("printer-config-change-date-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-config-change-date-time`: Self = this.set("printer-config-change-date-time", js.undefined)
    @scala.inline
    def `setPrinter-config-change-time`(value: Double): Self = this.set("printer-config-change-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-config-change-time`: Self = this.set("printer-config-change-time", js.undefined)
    @scala.inline
    def `setPrinter-config-changes`(value: Double): Self = this.set("printer-config-changes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-config-changes`: Self = this.set("printer-config-changes", js.undefined)
    @scala.inline
    def `setPrinter-detailed-status-messagesVarargs`(value: String*): Self = this.set("printer-detailed-status-messages", js.Array(value :_*))
    @scala.inline
    def `setPrinter-detailed-status-messages`(value: js.Array[String]): Self = this.set("printer-detailed-status-messages", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-detailed-status-messages`: Self = this.set("printer-detailed-status-messages", js.undefined)
    @scala.inline
    def `setPrinter-finisherVarargs`(value: String*): Self = this.set("printer-finisher", js.Array(value :_*))
    @scala.inline
    def `setPrinter-finisher`(value: js.Array[String]): Self = this.set("printer-finisher", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-finisher`: Self = this.set("printer-finisher", js.undefined)
    @scala.inline
    def `setPrinter-finisher-descriptionVarargs`(value: String*): Self = this.set("printer-finisher-description", js.Array(value :_*))
    @scala.inline
    def `setPrinter-finisher-description`(value: js.Array[String]): Self = this.set("printer-finisher-description", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-finisher-description`: Self = this.set("printer-finisher-description", js.undefined)
    @scala.inline
    def `setPrinter-finisher-suppliesVarargs`(value: String*): Self = this.set("printer-finisher-supplies", js.Array(value :_*))
    @scala.inline
    def `setPrinter-finisher-supplies`(value: js.Array[String]): Self = this.set("printer-finisher-supplies", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-finisher-supplies`: Self = this.set("printer-finisher-supplies", js.undefined)
    @scala.inline
    def `setPrinter-finisher-supplies-descriptionVarargs`(value: String*): Self = this.set("printer-finisher-supplies-description", js.Array(value :_*))
    @scala.inline
    def `setPrinter-finisher-supplies-description`(value: js.Array[String]): Self = this.set("printer-finisher-supplies-description", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-finisher-supplies-description`: Self = this.set("printer-finisher-supplies-description", js.undefined)
    @scala.inline
    def `setPrinter-id`(value: Double): Self = this.set("printer-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-id`: Self = this.set("printer-id", js.undefined)
    @scala.inline
    def `setPrinter-impressions-completed`(value: Double): Self = this.set("printer-impressions-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-impressions-completed`: Self = this.set("printer-impressions-completed", js.undefined)
    @scala.inline
    def `setPrinter-impressions-completed-col`(value: Impressions): Self = this.set("printer-impressions-completed-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-impressions-completed-col`: Self = this.set("printer-impressions-completed-col", js.undefined)
    @scala.inline
    def `setPrinter-input-trayVarargs`(value: String*): Self = this.set("printer-input-tray", js.Array(value :_*))
    @scala.inline
    def `setPrinter-input-tray`(value: js.Array[String]): Self = this.set("printer-input-tray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-input-tray`: Self = this.set("printer-input-tray", js.undefined)
    @scala.inline
    def `setPrinter-is-accepting-jobs`(value: Boolean): Self = this.set("printer-is-accepting-jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-is-accepting-jobs`: Self = this.set("printer-is-accepting-jobs", js.undefined)
    @scala.inline
    def `setPrinter-media-sheets-completed`(value: Double): Self = this.set("printer-media-sheets-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-media-sheets-completed`: Self = this.set("printer-media-sheets-completed", js.undefined)
    @scala.inline
    def `setPrinter-media-sheets-completed-col`(value: MediaSheets): Self = this.set("printer-media-sheets-completed-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-media-sheets-completed-col`: Self = this.set("printer-media-sheets-completed-col", js.undefined)
    @scala.inline
    def `setPrinter-message-date-time`(value: String): Self = this.set("printer-message-date-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-message-date-time`: Self = this.set("printer-message-date-time", js.undefined)
    @scala.inline
    def `setPrinter-message-from-operator`(value: String): Self = this.set("printer-message-from-operator", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-message-from-operator`: Self = this.set("printer-message-from-operator", js.undefined)
    @scala.inline
    def `setPrinter-message-time`(value: Double): Self = this.set("printer-message-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-message-time`: Self = this.set("printer-message-time", js.undefined)
    @scala.inline
    def `setPrinter-more-info`(value: String): Self = this.set("printer-more-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-more-info`: Self = this.set("printer-more-info", js.undefined)
    @scala.inline
    def `setPrinter-output-trayVarargs`(value: String*): Self = this.set("printer-output-tray", js.Array(value :_*))
    @scala.inline
    def `setPrinter-output-tray`(value: js.Array[String]): Self = this.set("printer-output-tray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-output-tray`: Self = this.set("printer-output-tray", js.undefined)
    @scala.inline
    def `setPrinter-pages-completed`(value: Double): Self = this.set("printer-pages-completed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-pages-completed`: Self = this.set("printer-pages-completed", js.undefined)
    @scala.inline
    def `setPrinter-pages-completed-col`(value: Pages): Self = this.set("printer-pages-completed-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-pages-completed-col`: Self = this.set("printer-pages-completed-col", js.undefined)
    @scala.inline
    def `setPrinter-service-type`(value: PrinterServiceType): Self = this.set("printer-service-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-service-type`: Self = this.set("printer-service-type", js.undefined)
    @scala.inline
    def `setPrinter-settable-attributes-supportedVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any)*): Self = this.set("printer-settable-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setPrinter-settable-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
        ]
    ): Self = this.set("printer-settable-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-settable-attributes-supported`: Self = this.set("printer-settable-attributes-supported", js.undefined)
    @scala.inline
    def `setPrinter-state`(value: PrinterState): Self = this.set("printer-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-state`: Self = this.set("printer-state", js.undefined)
    @scala.inline
    def `setPrinter-state-change-date-time`(value: String): Self = this.set("printer-state-change-date-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-state-change-date-time`: Self = this.set("printer-state-change-date-time", js.undefined)
    @scala.inline
    def `setPrinter-state-change-time`(value: Double): Self = this.set("printer-state-change-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-state-change-time`: Self = this.set("printer-state-change-time", js.undefined)
    @scala.inline
    def `setPrinter-state-message`(value: String): Self = this.set("printer-state-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-state-message`: Self = this.set("printer-state-message", js.undefined)
    @scala.inline
    def `setPrinter-state-reasonsVarargs`(value: PrinterStateReasons*): Self = this.set("printer-state-reasons", js.Array(value :_*))
    @scala.inline
    def `setPrinter-state-reasons`(value: js.Array[PrinterStateReasons]): Self = this.set("printer-state-reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-state-reasons`: Self = this.set("printer-state-reasons", js.undefined)
    @scala.inline
    def `setPrinter-static-resource-k-octets-free`(value: Double): Self = this.set("printer-static-resource-k-octets-free", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-static-resource-k-octets-free`: Self = this.set("printer-static-resource-k-octets-free", js.undefined)
    @scala.inline
    def `setPrinter-supplyVarargs`(value: String*): Self = this.set("printer-supply", js.Array(value :_*))
    @scala.inline
    def `setPrinter-supply`(value: js.Array[String]): Self = this.set("printer-supply", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-supply`: Self = this.set("printer-supply", js.undefined)
    @scala.inline
    def `setPrinter-supply-descriptionVarargs`(value: String*): Self = this.set("printer-supply-description", js.Array(value :_*))
    @scala.inline
    def `setPrinter-supply-description`(value: js.Array[String]): Self = this.set("printer-supply-description", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-supply-description`: Self = this.set("printer-supply-description", js.undefined)
    @scala.inline
    def `setPrinter-supply-info-uri`(value: String): Self = this.set("printer-supply-info-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-supply-info-uri`: Self = this.set("printer-supply-info-uri", js.undefined)
    @scala.inline
    def `setPrinter-up-time`(value: Double): Self = this.set("printer-up-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-up-time`: Self = this.set("printer-up-time", js.undefined)
    @scala.inline
    def `setPrinter-uri-supportedVarargs`(value: String*): Self = this.set("printer-uri-supported", js.Array(value :_*))
    @scala.inline
    def `setPrinter-uri-supported`(value: js.Array[String]): Self = this.set("printer-uri-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-uri-supported`: Self = this.set("printer-uri-supported", js.undefined)
    @scala.inline
    def `setPrinter-uuid`(value: String): Self = this.set("printer-uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-uuid`: Self = this.set("printer-uuid", js.undefined)
    @scala.inline
    def `setQueued-job-count`(value: Double): Self = this.set("queued-job-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteQueued-job-count`: Self = this.set("queued-job-count", js.undefined)
    @scala.inline
    def `setXri-authentication-supportedVarargs`(value: XriAuthentication*): Self = this.set("xri-authentication-supported", js.Array(value :_*))
    @scala.inline
    def `setXri-authentication-supported`(value: js.Array[XriAuthentication]): Self = this.set("xri-authentication-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteXri-authentication-supported`: Self = this.set("xri-authentication-supported", js.undefined)
    @scala.inline
    def `setXri-security-supportedVarargs`(value: XriSecurity*): Self = this.set("xri-security-supported", js.Array(value :_*))
    @scala.inline
    def `setXri-security-supported`(value: js.Array[XriSecurity]): Self = this.set("xri-security-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteXri-security-supported`: Self = this.set("xri-security-supported", js.undefined)
    @scala.inline
    def `setXri-uri-scheme-supportedVarargs`(value: UriSchemes*): Self = this.set("xri-uri-scheme-supported", js.Array(value :_*))
    @scala.inline
    def `setXri-uri-scheme-supported`(value: js.Array[UriSchemes]): Self = this.set("xri-uri-scheme-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteXri-uri-scheme-supported`: Self = this.set("xri-uri-scheme-supported", js.undefined)
  }
  
}

