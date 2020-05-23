package typings.ipp.mod

import typings.ipp.ippStrings.`abort-job`
import typings.ipp.ippStrings.`adobe-1Dot3`
import typings.ipp.ippStrings.`adobe-1Dot4`
import typings.ipp.ippStrings.`adobe-1Dot5`
import typings.ipp.ippStrings.`adobe-1Dot6`
import typings.ipp.ippStrings.`document-number`
import typings.ipp.ippStrings.`document-object`
import typings.ipp.ippStrings.`finishing-template`
import typings.ipp.ippStrings.`hold-job_`
import typings.ipp.ippStrings.`icc-color-matching`
import typings.ipp.ippStrings.`imposition-template`
import typings.ipp.ippStrings.`infrastructure-printer`
import typings.ipp.ippStrings.`insert-after-page-number`
import typings.ipp.ippStrings.`insert-count`
import typings.ipp.ippStrings.`ipp-3d`
import typings.ipp.ippStrings.`ipp-everywhere`
import typings.ipp.ippStrings.`iso-15930-1_2001`
import typings.ipp.ippStrings.`iso-15930-3_2002`
import typings.ipp.ippStrings.`iso-15930-4_2003`
import typings.ipp.ippStrings.`iso-15930-6_2003`
import typings.ipp.ippStrings.`iso-15930-7_2010`
import typings.ipp.ippStrings.`iso-15930-8_2010`
import typings.ipp.ippStrings.`iso-16612-2_2010`
import typings.ipp.ippStrings.`iso-19005-1_2005`
import typings.ipp.ippStrings.`iso-19005-2_2011`
import typings.ipp.ippStrings.`iso-19005-3_2012`
import typings.ipp.ippStrings.`iso-32000-1_2008`
import typings.ipp.ippStrings.`job-save`
import typings.ipp.ippStrings.`manual-tumble`
import typings.ipp.ippStrings.`material-amount-units`
import typings.ipp.ippStrings.`material-amount`
import typings.ipp.ippStrings.`material-color`
import typings.ipp.ippStrings.`material-diameter-tolerance`
import typings.ipp.ippStrings.`material-diameter`
import typings.ipp.ippStrings.`material-fill-density`
import typings.ipp.ippStrings.`material-key`
import typings.ipp.ippStrings.`material-name`
import typings.ipp.ippStrings.`material-nozzle-diameter`
import typings.ipp.ippStrings.`material-purpose`
import typings.ipp.ippStrings.`material-rate-units`
import typings.ipp.ippStrings.`material-rate`
import typings.ipp.ippStrings.`material-retraction`
import typings.ipp.ippStrings.`material-shell-thickness`
import typings.ipp.ippStrings.`material-temperature`
import typings.ipp.ippStrings.`material-type`
import typings.ipp.ippStrings.`media-col`
import typings.ipp.ippStrings.`media-sheets-supported`
import typings.ipp.ippStrings.`media-size-name`
import typings.ipp.ippStrings.`media-size`
import typings.ipp.ippStrings.`not-attempted`
import typings.ipp.ippStrings.`object-offset`
import typings.ipp.ippStrings.`object-size`
import typings.ipp.ippStrings.`object-uuid`
import typings.ipp.ippStrings.`page-overrides`
import typings.ipp.ippStrings.`pdl-init-file-entry`
import typings.ipp.ippStrings.`pdl-init-file-location`
import typings.ipp.ippStrings.`pdl-init-file-name`
import typings.ipp.ippStrings.`process-job`
import typings.ipp.ippStrings.`proof-print-copies`
import typings.ipp.ippStrings.`proof-print`
import typings.ipp.ippStrings.`pwg-5102Dot3`
import typings.ipp.ippStrings.`requesting-user-name`
import typings.ipp.ippStrings.`resource-object`
import typings.ipp.ippStrings.`subscription-object`
import typings.ipp.ippStrings.`system-object`
import typings.ipp.ippStrings.all
import typings.ipp.ippStrings.arithmetic
import typings.ipp.ippStrings.attempted
import typings.ipp.ippStrings.automatic
import typings.ipp.ippStrings.baling
import typings.ipp.ippStrings.basic
import typings.ipp.ippStrings.binding
import typings.ipp.ippStrings.certificate
import typings.ipp.ippStrings.cmyk
import typings.ipp.ippStrings.coating
import typings.ipp.ippStrings.covering
import typings.ipp.ippStrings.deep
import typings.ipp.ippStrings.default
import typings.ipp.ippStrings.digest
import typings.ipp.ippStrings.faxout
import typings.ipp.ippStrings.flipped
import typings.ipp.ippStrings.folding
import typings.ipp.ippStrings.guaranteed
import typings.ipp.ippStrings.hierarchical
import typings.ipp.ippStrings.icc
import typings.ipp.ippStrings.ippget
import typings.ipp.ippStrings.laminating
import typings.ipp.ippStrings.lossless
import typings.ipp.ippStrings.media
import typings.ipp.ippStrings.negotiate
import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.normal
import typings.ipp.ippStrings.owner
import typings.ipp.ippStrings.prc
import typings.ipp.ippStrings.progressive
import typings.ipp.ippStrings.punching
import typings.ipp.ippStrings.rotated
import typings.ipp.ippStrings.scan
import typings.ipp.ippStrings.spool
import typings.ipp.ippStrings.ssl3
import typings.ipp.ippStrings.stitching
import typings.ipp.ippStrings.stream
import typings.ipp.ippStrings.tls
import typings.ipp.ippStrings.trimming
import typings.ipp.ippStrings.u3d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterDescription extends js.Object {
  var `accuracy-units-supported`: js.UndefOr[js.Array[AccuracyUnits]] = js.undefined
  var `baling-type-supported`: js.UndefOr[js.Array[BalingType]] = js.undefined
  var `baling-when-supported`: js.UndefOr[js.Array[BalingWhen]] = js.undefined
  var `binding-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.undefined
  var `binding-type-supported`: js.UndefOr[js.Array[BindingType]] = js.undefined
  var `chamber-humidity-default`: js.UndefOr[Double] = js.undefined
  var `chamber-humidity-supported`: js.UndefOr[Boolean] = js.undefined
  var `chamber-temperature-default`: js.UndefOr[Double] = js.undefined
  var `chamber-temperature-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `charset-configured`: js.UndefOr[String] = js.undefined
  var `charset-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `coating-sides-supported`: js.UndefOr[js.Array[FinishingSides]] = js.undefined
  var `coating-type-supported`: js.UndefOr[js.Array[CoatingType]] = js.undefined
  var `color-supported`: js.UndefOr[Boolean] = js.undefined
  var `compression-supported`: js.UndefOr[js.Array[Compression]] = js.undefined
  var `confirmation-sheet-print-default`: js.UndefOr[Boolean] = js.undefined
  var `copies-default`: js.UndefOr[Double] = js.undefined
  var `copies-supported`: js.UndefOr[js.Array[Double]] = js.undefined
  var `cover-back-default`: js.UndefOr[Cover] = js.undefined
  var `cover-back-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `cover-front-default`: js.UndefOr[Cover] = js.undefined
  var `cover-front-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `cover-sheet-info-default`: js.UndefOr[CoverSheetInfo] = js.undefined
  var `cover-sheet-info-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `covering-name-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `destination-accesses-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `destination-uri-ready`: js.UndefOr[js.Array[DestinationUriReady]] = js.undefined
  var `destination-uri-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.undefined
  var `destination-uris-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-access-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-charset-default`: js.UndefOr[String] = js.undefined
  var `document-charset-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-creation-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-digital-signature-default`: js.UndefOr[DocumentDigitalSignature] = js.undefined
  var `document-digital-signature-supported`: js.UndefOr[js.Array[DocumentDigitalSignature]] = js.undefined
  var `document-format-default`: js.UndefOr[MimeMediaType] = js.undefined
  var `document-format-details-default`: js.UndefOr[DocumentFormatDetails] = js.undefined
  var `document-format-details-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-format-supported`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `document-format-version-default`: js.UndefOr[String] = js.undefined
  var `document-format-version-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-natural-language-default`: js.UndefOr[String] = js.undefined
  var `document-natural-language-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-password-supported`: js.UndefOr[Double] = js.undefined
  var `document-privacy-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var `document-privacy-scope`: js.UndefOr[all | default | none | owner] = js.undefined
  var `feed-orientation-default`: js.UndefOr[FeedOrientation] = js.undefined
  var `feed-orientation-supported`: js.UndefOr[js.Array[FeedOrientation]] = js.undefined
  var `fetch-document-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `finishing-template-supported`: js.UndefOr[js.Array[Finishings]] = js.undefined
  var `finishings-col-database`: js.UndefOr[js.Array[FinishingsInterface]] = js.undefined
  var `finishings-col-default`: js.UndefOr[FinishingsInterface] = js.undefined
  var `finishings-col-ready`: js.UndefOr[js.Array[FinishingsInterface]] = js.undefined
  var `finishings-col-supported`: js.UndefOr[
    js.Array[
      baling | binding | coating | covering | `finishing-template` | folding | `imposition-template` | laminating | `media-sheets-supported` | `media-size` | `media-size-name` | punching | stitching | trimming
    ]
  ] = js.undefined
  var `finishings-default`: js.UndefOr[js.Array[Finishings]] = js.undefined
  var `finishings-ready`: js.UndefOr[js.Array[Finishings]] = js.undefined
  var `finishings-supported`: js.UndefOr[js.Array[Finishings]] = js.undefined
  var `folding-direction-supported`: js.UndefOr[js.Array[FoldingDirection]] = js.undefined
  var `folding-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `folding-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.undefined
  var `font-name-requested-default`: js.UndefOr[String] = js.undefined
  var `font-name-requested-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `font-size-requested-default`: js.UndefOr[Double] = js.undefined
  var `font-size-requested-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `from-name-supported`: js.UndefOr[Double] = js.undefined
  var `generated-natural-language-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `identify-actions-default`: js.UndefOr[js.Array[IdentifyActions]] = js.undefined
  var `identify-actions-supported`: js.UndefOr[js.Array[IdentifyActions]] = js.undefined
  var `imposition-template-default`: js.UndefOr[ImpositionTemplate] = js.undefined
  var `imposition-template-supported`: js.UndefOr[js.Array[ImpositionTemplate]] = js.undefined
  var `input-attributes-default`: js.UndefOr[InputAttributes] = js.undefined
  var `input-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `input-color-mode-supported`: js.UndefOr[js.Array[InputColorMode]] = js.undefined
  var `input-content-type-supported`: js.UndefOr[js.Array[InputContentType]] = js.undefined
  var `input-film-scan-mode-supported`: js.UndefOr[js.Array[InputFilmScanMode]] = js.undefined
  var `input-media-supported`: js.UndefOr[js.Array[MediaName | MediaSizeName]] = js.undefined
  var `input-orientation-requested-supported`: js.UndefOr[js.Array[OrientationRequested]] = js.undefined
  var `input-quality-supported`: js.UndefOr[js.Array[PrintQuality]] = js.undefined
  var `input-resolution-supported`: js.UndefOr[js.Array[Resolution]] = js.undefined
  var `input-scan-regions-supported`: js.UndefOr[InputScanRegion] = js.undefined
  var `input-sides-supported`: js.UndefOr[js.Array[Sides]] = js.undefined
  var `input-source-supported`: js.UndefOr[js.Array[InputSource]] = js.undefined
  var `insert-after-page-number-supported`: js.UndefOr[String] = js.undefined
  var `insert-count-supported`: js.UndefOr[String] = js.undefined
  var `insert-sheet-default`: js.UndefOr[js.Array[InsertSheet]] = js.undefined
  var `insert-sheet-supported`: js.UndefOr[js.Array[`insert-after-page-number` | `insert-count` | media | `media-col`]] = js.undefined
  var `ipp-features-supported`: js.UndefOr[
    js.Array[
      `document-object` | faxout | `icc-color-matching` | `infrastructure-printer` | `ipp-3d` | `ipp-everywhere` | `job-save` | none | `page-overrides` | `proof-print` | `resource-object` | scan | `subscription-object` | `system-object`
    ]
  ] = js.undefined
  var `ipp-versions-supported`: js.UndefOr[js.Array[IPPVersion]] = js.undefined
  var `ippget-event-life`: js.UndefOr[Double] = js.undefined
  var `job-account-id-default`: js.UndefOr[String] = js.undefined
  var `job-account-id-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-account-type-default`: js.UndefOr[JobAccountType] = js.undefined
  var `job-account-type-supported`: js.UndefOr[js.Array[JobAccountType]] = js.undefined
  var `job-accounting-sheets-default`: js.UndefOr[JobAccontingSheets] = js.undefined
  var `job-accounting-sheets-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-accounting-user-id-default`: js.UndefOr[String] = js.undefined
  var `job-accounting-user-id-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-authorization-uri-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-cancel-after-default`: js.UndefOr[Double] = js.undefined
  var `job-cancel-after-supported`: js.UndefOr[String] = js.undefined
  var `job-constraints-supported`: js.UndefOr[js.Array[JobConstraintsSupported]] = js.undefined
  var `job-creation-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.undefined
  var `job-delay-output-until-default`: js.UndefOr[JobDelayOutputUntil] = js.undefined
  var `job-delay-output-until-interval-supported`: js.UndefOr[String] = js.undefined
  var `job-delay-output-until-supported`: js.UndefOr[js.Array[JobDelayOutputUntil]] = js.undefined
  var `job-delay-output-until-time-supported`: js.UndefOr[String] = js.undefined
  var `job-destination-spooling-supported`: js.UndefOr[String] = js.undefined
  var `job-error-action-default`: js.UndefOr[JobErrorAction] = js.undefined
  var `job-error-action-supported`: js.UndefOr[js.Array[JobErrorAction]] = js.undefined
  var `job-error-sheet-default`: js.UndefOr[JobErrorSheet] = js.undefined
  var `job-error-sheet-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-history-attributes-configured`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-history-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-history-interval-configured`: js.UndefOr[Double] = js.undefined
  var `job-history-interval-supported`: js.UndefOr[String] = js.undefined
  var `job-hold-until-default`: js.UndefOr[JobHoldUntil] = js.undefined
  var `job-hold-until-supported`: js.UndefOr[js.Array[JobHoldUntil]] = js.undefined
  var `job-hold-until-time-supported`: js.UndefOr[String] = js.undefined
  var `job-ids-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-impressions-supported`: js.UndefOr[String] = js.undefined
  var `job-k-octets-supported`: js.UndefOr[String] = js.undefined
  var `job-mandatory-attributes-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-media-sheets-supported`: js.UndefOr[String] = js.undefined
  var `job-message-to-operator-default`: js.UndefOr[String] = js.undefined
  var `job-message-to-operator-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-pages-per-set-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-password-encryption-supported`: js.UndefOr[js.Array[JobPasswordEncryption]] = js.undefined
  var `job-password-length-supported`: js.UndefOr[String] = js.undefined
  var `job-password-repertoire-configured`: js.UndefOr[JobPasswordRepertoire] = js.undefined
  var `job-password-repertoire-supported`: js.UndefOr[js.Array[JobPasswordRepertoire]] = js.undefined
  var `job-password-supported`: js.UndefOr[Double] = js.undefined
  var `job-phone-number-default`: js.UndefOr[String] = js.undefined
  var `job-phone-number-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-presets-supported`: js.UndefOr[js.Array[JobPresetsSupported]] = js.undefined
  var `job-priority-default`: js.UndefOr[Double] = js.undefined
  var `job-priority-supported`: js.UndefOr[Double] = js.undefined
  var `job-privacy-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-privacy-scope`: js.UndefOr[all | default | none | owner] = js.undefined
  var `job-recipient-name-default`: js.UndefOr[String] = js.undefined
  var `job-recipient-name-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-resolvers-supported`: js.UndefOr[js.Array[JobResolversSupported]] = js.undefined
  var `job-retain-until-default`: js.UndefOr[JobRetainUntil] = js.undefined
  var `job-retain-until-interval-supported`: js.UndefOr[String] = js.undefined
  var `job-retain-until-supported`: js.UndefOr[js.Array[JobRetainUntil]] = js.undefined
  var `job-retain-until-time-supported`: js.UndefOr[String] = js.undefined
  var `job-sheet-message-default`: js.UndefOr[String] = js.undefined
  var `job-sheet-message-supported`: js.UndefOr[Boolean] = js.undefined
  var `job-sheets-col-default`: js.UndefOr[JobSheetsInterface] = js.undefined
  var `job-sheets-col-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `job-sheets-default`: js.UndefOr[JobSheets] = js.undefined
  var `job-sheets-supported`: js.UndefOr[js.Array[JobSheets]] = js.undefined
  var `job-spooling-supported`: js.UndefOr[automatic | spool | stream] = js.undefined
  var `job-triggers-supported`: js.UndefOr[JobTriggersSupported] = js.undefined
  var `jpeg-features-supported`: js.UndefOr[
    js.Array[arithmetic | cmyk | deep | hierarchical | icc | lossless | none | progressive]
  ] = js.undefined
  var `jpeg-k-octets-supported`: js.UndefOr[String] = js.undefined
  var `jpeg-x-dimension-supported`: js.UndefOr[String] = js.undefined
  var `jpeg-y-dimension-supported`: js.UndefOr[String] = js.undefined
  var `laminating-sides-supported`: js.UndefOr[js.Array[FinishingSides]] = js.undefined
  var `laminating-type-supported`: js.UndefOr[js.Array[LaminatingType]] = js.undefined
  var `logo-uri-formats-supported`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `logo-uri-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.undefined
  var `material-amount-units-supported`: js.UndefOr[js.Array[MaterialAmountUnits]] = js.undefined
  var `material-diameter-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `material-nozzle-diameter-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `material-purpose-supported`: js.UndefOr[js.Array[MaterialPurpose]] = js.undefined
  var `material-rate-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `material-rate-units-supported`: js.UndefOr[js.Array[MaterialRateUnits]] = js.undefined
  var `material-shell-thickness-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `material-temperature-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `material-type-supported`: js.UndefOr[js.Array[MaterialType]] = js.undefined
  var `materials-col-database`: js.UndefOr[js.Array[Materials]] = js.undefined
  var `materials-col-default`: js.UndefOr[js.Array[Materials]] = js.undefined
  var `materials-col-ready`: js.UndefOr[js.Array[Materials]] = js.undefined
  var `materials-col-supported`: js.UndefOr[
    js.Array[
      `material-amount` | `material-amount-units` | `material-color` | `material-diameter` | `material-diameter-tolerance` | `material-fill-density` | `material-key` | `material-name` | `material-nozzle-diameter` | `material-purpose` | `material-rate` | `material-rate-units` | `material-retraction` | `material-shell-thickness` | `material-temperature` | `material-type`
    ]
  ] = js.undefined
  var `max-materials-col-supported`: js.UndefOr[Double] = js.undefined
  var `max-page-ranges-supported`: js.UndefOr[Double] = js.undefined
  var `max-save-info-supported`: js.UndefOr[Double] = js.undefined
  var `max-stitching-locations-supported`: js.UndefOr[Double] = js.undefined
  var `media-back-coating-supported`: js.UndefOr[js.Array[MediaCoating]] = js.undefined
  var `media-bottom-margin-supported`: js.UndefOr[js.Array[Double]] = js.undefined
  var `media-col-database`: js.UndefOr[js.Array[MediaInterface]] = js.undefined
  // "media-col-database media-source-properties collection;
  // "media-col-database media-source-properties media-source-feed-direction"?: string;
  // "media-col-database media-source-properties media-source-feed-orientation"?: string;
  var `media-col-default`: js.UndefOr[MediaInterface] = js.undefined
  var `media-col-ready`: js.UndefOr[js.Array[MediaInterface]] = js.undefined
  // "media-col-ready media-source-properties collection;
  // "media-col-ready media-source-properties media-source-feed-direction"?: string;
  // "media-col-ready media-source-properties media-source-feed-orientation"?: string;
  var `media-col-supported`: js.UndefOr[js.Array[MediaColSupported]] = js.undefined
  var `media-color-supported`: js.UndefOr[js.Array[MediaColor]] = js.undefined
  var `media-default`: js.UndefOr[Media] = js.undefined
  var `media-front-coating-supported`: js.UndefOr[js.Array[MediaCoating]] = js.undefined
  var `media-grain-supported`: js.UndefOr[js.Array[MediaGrain]] = js.undefined
  var `media-hole-count-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `media-key-supported`: js.UndefOr[js.Array[MediaSizeName | MediaName]] = js.undefined
  var `media-left-margin-supported`: js.UndefOr[js.Array[Double]] = js.undefined
  var `media-order-count-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `media-pre-printed-supported`: js.UndefOr[js.Array[MediaPrePrinted]] = js.undefined
  var `media-ready`: js.UndefOr[js.Array[MediaSizeName | MediaName]] = js.undefined
  var `media-recycled-supported`: js.UndefOr[js.Array[MediaPrePrinted]] = js.undefined
  var `media-right-margin-supported`: js.UndefOr[js.Array[Double]] = js.undefined
  var `media-size-supported`: js.UndefOr[MediaSizeSupported] = js.undefined
  var `media-source-supported`: js.UndefOr[js.Array[MediaSource]] = js.undefined
  var `media-supported`: js.UndefOr[js.Array[Media]] = js.undefined
  var `media-thickness-supported`: js.UndefOr[String] = js.undefined
  var `media-tooth-supported`: js.UndefOr[js.Array[MediaTooth]] = js.undefined
  var `media-top-margin-supported`: js.UndefOr[js.Array[Double]] = js.undefined
  var `media-type-supported`: js.UndefOr[js.Array[MediaType]] = js.undefined
  var `media-weight-metric-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `message-supported`: js.UndefOr[Double] = js.undefined
  var `multiple-destination-uris-supported`: js.UndefOr[Boolean] = js.undefined
  var `multiple-document-handling-default`: js.UndefOr[MultipleDocumentHandling] = js.undefined
  var `multiple-document-handling-supported`: js.UndefOr[js.Array[MultipleDocumentHandling]] = js.undefined
  var `multiple-document-jobs-supported`: js.UndefOr[Boolean] = js.undefined
  var `multiple-object-handling-default`: js.UndefOr[MultipleObjectHandling] = js.undefined
  var `multiple-object-handling-supported`: js.UndefOr[js.Array[MultipleObjectHandling]] = js.undefined
  var `multiple-operation-time-out`: js.UndefOr[Double] = js.undefined
  var `multiple-operation-time-out-action`: js.UndefOr[`abort-job` | `hold-job_` | `process-job`] = js.undefined
  var `natural-language-configured`: js.UndefOr[String] = js.undefined
  var `notify-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `notify-events-default`: js.UndefOr[js.Array[NotifyEvents]] = js.undefined
  var `notify-events-supported`: js.UndefOr[js.Array[NotifyEvents]] = js.undefined
  var `notify-lease-duration-default`: js.UndefOr[Double] = js.undefined
  var `notify-lease-duration-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `notify-pull-method-supported`: js.UndefOr[js.Array[ippget]] = js.undefined
  var `notify-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.undefined
  var `number-of-retries-default`: js.UndefOr[Double] = js.undefined
  var `number-of-retries-supported`: js.UndefOr[String] = js.undefined
  var `number-up-default`: js.UndefOr[Double] = js.undefined
  var `number-up-supported`: js.UndefOr[Double | String] = js.undefined
  var `oauth-authorization-scope`: js.UndefOr[js.Array[String]] = js.undefined
  var `oauth-authorization-server-uri`: js.UndefOr[String] = js.undefined
  var `operations-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `organization-name-supported`: js.UndefOr[Double] = js.undefined
  var `orientation-requested-default`: js.UndefOr[OrientationRequested] = js.undefined
  var `orientation-requested-supported`: js.UndefOr[js.Array[OrientationRequested]] = js.undefined
  var `output-attributes-default`: js.UndefOr[OutputAttributes] = js.undefined
  var `output-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `output-bin-default`: js.UndefOr[OutputBin] = js.undefined
  var `output-bin-supported`: js.UndefOr[js.Array[OutputBin]] = js.undefined
  var `output-device-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `output-device-uuid-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `overrides-supported`: js.UndefOr[js.Array[Overrides]] = js.undefined
  var `page-delivery-default`: js.UndefOr[PageDelivery] = js.undefined
  var `page-delivery-supported`: js.UndefOr[js.Array[PageDelivery]] = js.undefined
  var `page-order-received-default`: js.UndefOr[PageOrder] = js.undefined
  var `page-order-received-supported`: js.UndefOr[js.Array[PageOrder]] = js.undefined
  var `page-ranges-supported`: js.UndefOr[Boolean] = js.undefined
  var `pages-per-subset-supported`: js.UndefOr[Boolean] = js.undefined
  var `parent-printers-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `pclm-raster-back-side`: js.UndefOr[flipped | normal | rotated] = js.undefined
  var `pclm-source-resolution-supported`: js.UndefOr[js.Array[Resolution]] = js.undefined
  var `pclm-strip-height-preferred`: js.UndefOr[js.Array[Double]] = js.undefined
  var `pclm-strip-height-supported`: js.UndefOr[Double] = js.undefined
  var `pdf-features-supported`: js.UndefOr[js.Array[prc | u3d]] = js.undefined
  var `pdf-k-octets-supported`: js.UndefOr[String] = js.undefined
  var `pdf-versions-supported`: js.UndefOr[
    js.Array[
      `adobe-1Dot3` | `adobe-1Dot4` | `adobe-1Dot5` | `adobe-1Dot6` | `iso-15930-1_2001` | `iso-15930-3_2002` | `iso-15930-4_2003` | `iso-15930-6_2003` | `iso-15930-7_2010` | `iso-15930-8_2010` | `iso-16612-2_2010` | `iso-19005-1_2005` | `iso-19005-2_2011` | `iso-19005-3_2012` | `iso-32000-1_2008` | none | `pwg-5102Dot3`
    ]
  ] = js.undefined
  var `pdl-init-file-default`: js.UndefOr[PdlInitFile] = js.undefined
  var `pdl-init-file-entry-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `pdl-init-file-location-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `pdl-init-file-name-subdirectory-supported`: js.UndefOr[Boolean] = js.undefined
  var `pdl-init-file-name-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `pdl-init-file-supported`: js.UndefOr[
    js.Array[`pdl-init-file-entry` | `pdl-init-file-location` | `pdl-init-file-name`]
  ] = js.undefined
  var `pdl-override-guaranteed-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `pdl-override-supported`: js.UndefOr[attempted | guaranteed | `not-attempted`] = js.undefined
  var `platform-shape`: js.UndefOr[String] = js.undefined
  var `platform-temperature-default`: js.UndefOr[Double] = js.undefined
  var `platform-temperature-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `preferred-attributes-supported`: js.UndefOr[Boolean] = js.undefined
  var `presentation-direction-number-up-default`: js.UndefOr[PresentationDirectionNumberUp] = js.undefined
  var `presentation-direction-number-up-supported`: js.UndefOr[js.Array[PresentationDirectionNumberUp]] = js.undefined
  var `print-accuracy-supported`: js.UndefOr[PrintAccuracySupported] = js.undefined
  var `print-base-default`: js.UndefOr[PrintBase] = js.undefined
  var `print-base-supported`: js.UndefOr[js.Array[PrintBase]] = js.undefined
  var `print-color-mode-default`: js.UndefOr[PrintColorMode] = js.undefined
  var `print-color-mode-supported`: js.UndefOr[js.Array[PrintColorMode]] = js.undefined
  var `print-content-optimize-default`: js.UndefOr[PrintContentOptimize] = js.undefined
  var `print-content-optimize-supported`: js.UndefOr[js.Array[PrintContentOptimize]] = js.undefined
  var `print-objects-supported`: js.UndefOr[js.Array[`document-number` | `object-offset` | `object-size` | `object-uuid`]] = js.undefined
  var `print-quality-default`: js.UndefOr[PrintQuality] = js.undefined
  var `print-quality-supported`: js.UndefOr[js.Array[PrintQuality]] = js.undefined
  var `print-rendering-intent-default`: js.UndefOr[PrintRenderingIntent] = js.undefined
  var `print-rendering-intent-supported`: js.UndefOr[js.Array[PrintRenderingIntent]] = js.undefined
  var `print-scaling-default`: js.UndefOr[PrintScaling] = js.undefined
  var `print-scaling-supported`: js.UndefOr[js.Array[PrintScaling]] = js.undefined
  var `print-supports-default`: js.UndefOr[PrintSupports] = js.undefined
  var `print-supports-supported`: js.UndefOr[js.Array[PrintSupports]] = js.undefined
  var `printer-camera-image-uri`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-charge-info`: js.UndefOr[String] = js.undefined
  var `printer-charge-info-uri`: js.UndefOr[String] = js.undefined
  var `printer-contact-col`: js.UndefOr[PrinterContact] = js.undefined
  var `printer-current-time`: js.UndefOr[String] = js.undefined
  var `printer-device-id`: js.UndefOr[String] = js.undefined
  var `printer-dns-sd-name`: js.UndefOr[String] = js.undefined
  var `printer-driver-installer`: js.UndefOr[String] = js.undefined
  var `printer-fax-log-uri`: js.UndefOr[String] = js.undefined
  var `printer-fax-modem-info`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-fax-modem-name`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-fax-modem-number`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-geo-location`: js.UndefOr[String] = js.undefined
  var `printer-get-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
    ]
  ] = js.undefined
  var `printer-icc-profiles`: js.UndefOr[js.Array[PrinterIccProfiles]] = js.undefined
  var `printer-icons`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-info`: js.UndefOr[String] = js.undefined
  var `printer-kind`: js.UndefOr[js.Array[PrinterKind]] = js.undefined
  var `printer-location`: js.UndefOr[String] = js.undefined
  var `printer-make-and-model`: js.UndefOr[String] = js.undefined
  var `printer-mandatory-job-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
    ]
  ] = js.undefined
  var `printer-more-info-manufacturer`: js.UndefOr[String] = js.undefined
  var `printer-name`: js.UndefOr[String] = js.undefined
  var `printer-organization`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-organizational-unit`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-privacy-policy-uri`: js.UndefOr[String] = js.undefined
  var `printer-resolution-default`: js.UndefOr[Resolution] = js.undefined
  var `printer-resolution-supported`: js.UndefOr[Resolution] = js.undefined
  var `printer-static-resource-directory-uri`: js.UndefOr[String] = js.undefined
  var `printer-static-resource-k-octets-supported`: js.UndefOr[Double] = js.undefined
  var `printer-strings-languages-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `printer-strings-uri`: js.UndefOr[String] = js.undefined
  var `printer-volume-supported`: js.UndefOr[PrinterVolumeSupported] = js.undefined
  var `printer-xri-supported`: js.UndefOr[js.Array[PrinterXri]] = js.undefined
  var `proof-print-default`: js.UndefOr[ProofPrint] = js.undefined
  var `proof-print-supported`: js.UndefOr[js.Array[media | `media-col` | `proof-print-copies`]] = js.undefined
  var `punching-hole-diameter-configured`: js.UndefOr[Double] = js.undefined
  var `punching-locations-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `punching-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `punching-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.undefined
  var `pwg-raster-document-resolution-supported`: js.UndefOr[js.Array[Resolution]] = js.undefined
  var `pwg-raster-document-sheet-back`: js.UndefOr[flipped | `manual-tumble` | normal | rotated] = js.undefined
  var `pwg-raster-document-type-supported`: js.UndefOr[js.Array[PwgRasterDocumentTypeSupported]] = js.undefined
  var `pwg-safe-gcode-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `reference-uri-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.undefined
  var `repertoire-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `requesting-user-uri-supported`: js.UndefOr[Boolean] = js.undefined
  var `retry-interval-default`: js.UndefOr[Double] = js.undefined
  var `retry-interval-supported`: js.UndefOr[String] = js.undefined
  var `retry-time-out-default`: js.UndefOr[Double] = js.undefined
  var `retry-time-out-supported`: js.UndefOr[String] = js.undefined
  var `save-disposition-supported`: js.UndefOr[js.Array[SaveDisposition]] = js.undefined
  var `save-document-format-default`: js.UndefOr[MimeMediaType] = js.undefined
  var `save-document-format-supported`: js.UndefOr[js.Array[MimeMediaType]] = js.undefined
  var `save-location-default`: js.UndefOr[String] = js.undefined
  var `save-location-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `save-name-subdirectory-supported`: js.UndefOr[Boolean] = js.undefined
  var `save-name-supported`: js.UndefOr[Boolean] = js.undefined
  var `separator-sheets-default`: js.UndefOr[SeparatorSheets] = js.undefined
  var `separator-sheets-supported`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.undefined
  var `sides-default`: js.UndefOr[Sides] = js.undefined
  var `sides-supported`: js.UndefOr[js.Array[Sides]] = js.undefined
  var `smi2699-auth-print-group`: js.UndefOr[String] = js.undefined
  var `smi2699-auth-proxy-group`: js.UndefOr[String] = js.undefined
  var `smi2699-device-command`: js.UndefOr[String] = js.undefined
  var `smi2699-device-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `smi2699-device-name`: js.UndefOr[String] = js.undefined
  var `smi2699-device-uri`: js.UndefOr[String] = js.undefined
  var `stitching-angle-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `stitching-locations-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `stitching-method-supported`: js.UndefOr[js.Array[StitchingMethod]] = js.undefined
  var `stitching-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `stitching-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.undefined
  var `subject-supported`: js.UndefOr[Double] = js.undefined
  var `subordinate-printers-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `subscription-privacy-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var `subscription-privacy-scope`: js.UndefOr[String] = js.undefined
  var `to-name-supported`: js.UndefOr[Double] = js.undefined
  var `trimming-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.undefined
  var `trimming-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.undefined
  var `trimming-type-supported`: js.UndefOr[js.Array[TrimmingType]] = js.undefined
  var `trimming-when-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `uri-authentication-supported`: js.UndefOr[
    js.Array[basic | certificate | digest | negotiate | none | `requesting-user-name`]
  ] = js.undefined
  var `uri-security-supported`: js.UndefOr[js.Array[none | ssl3 | tls]] = js.undefined
  var `user-defined-values-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `which-jobs-supported`: js.UndefOr[js.Array[WhichJobs]] = js.undefined
  var `x-image-position-default`: js.UndefOr[XImagePosition] = js.undefined
  var `x-image-position-supported`: js.UndefOr[js.Array[XImagePosition]] = js.undefined
  var `x-image-shift-default`: js.UndefOr[Double] = js.undefined
  var `x-image-shift-supported`: js.UndefOr[String] = js.undefined
  var `x-side1-image-shift-default`: js.UndefOr[Double] = js.undefined
  var `x-side1-image-shift-supported`: js.UndefOr[String] = js.undefined
  var `x-side2-image-shift-default`: js.UndefOr[Double] = js.undefined
  var `x-side2-image-shift-supported`: js.UndefOr[String] = js.undefined
  var `y-image-position-default`: js.UndefOr[YImagePosition] = js.undefined
  var `y-image-position-supported`: js.UndefOr[js.Array[YImagePosition]] = js.undefined
  var `y-image-shift-default`: js.UndefOr[Double] = js.undefined
  var `y-image-shift-supported`: js.UndefOr[String] = js.undefined
  var `y-side1-image-shift-default`: js.UndefOr[Double] = js.undefined
  var `y-side1-image-shift-supported`: js.UndefOr[String] = js.undefined
  var `y-side2-image-shift-default`: js.UndefOr[Double] = js.undefined
  var `y-side2-image-shift-supported`: js.UndefOr[String] = js.undefined
}

