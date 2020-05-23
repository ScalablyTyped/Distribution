package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterStatus extends js.Object {
  var `chamber-humidity-current`: js.UndefOr[Double] = js.undefined
  var `chamber-temperature-current`: js.UndefOr[Double] = js.undefined
  var `device-service-count`: js.UndefOr[Double] = js.undefined
  var `device-uuid`: js.UndefOr[String] = js.undefined
  var `document-format-varying-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
    ]
  ] = js.undefined
  var `job-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
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
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
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

