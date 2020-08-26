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

@js.native
trait PrinterDescription extends js.Object {
  var `accuracy-units-supported`: js.UndefOr[js.Array[AccuracyUnits]] = js.native
  var `baling-type-supported`: js.UndefOr[js.Array[BalingType]] = js.native
  var `baling-when-supported`: js.UndefOr[js.Array[BalingWhen]] = js.native
  var `binding-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.native
  var `binding-type-supported`: js.UndefOr[js.Array[BindingType]] = js.native
  var `chamber-humidity-default`: js.UndefOr[Double] = js.native
  var `chamber-humidity-supported`: js.UndefOr[Boolean] = js.native
  var `chamber-temperature-default`: js.UndefOr[Double] = js.native
  var `chamber-temperature-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `charset-configured`: js.UndefOr[String] = js.native
  var `charset-supported`: js.UndefOr[js.Array[String]] = js.native
  var `coating-sides-supported`: js.UndefOr[js.Array[FinishingSides]] = js.native
  var `coating-type-supported`: js.UndefOr[js.Array[CoatingType]] = js.native
  var `color-supported`: js.UndefOr[Boolean] = js.native
  var `compression-supported`: js.UndefOr[js.Array[Compression]] = js.native
  var `confirmation-sheet-print-default`: js.UndefOr[Boolean] = js.native
  var `copies-default`: js.UndefOr[Double] = js.native
  var `copies-supported`: js.UndefOr[js.Array[Double]] = js.native
  var `cover-back-default`: js.UndefOr[Cover] = js.native
  var `cover-back-supported`: js.UndefOr[js.Array[String]] = js.native
  var `cover-front-default`: js.UndefOr[Cover] = js.native
  var `cover-front-supported`: js.UndefOr[js.Array[String]] = js.native
  var `cover-sheet-info-default`: js.UndefOr[CoverSheetInfo] = js.native
  var `cover-sheet-info-supported`: js.UndefOr[js.Array[String]] = js.native
  var `covering-name-supported`: js.UndefOr[js.Array[String]] = js.native
  var `destination-accesses-supported`: js.UndefOr[js.Array[String]] = js.native
  var `destination-uri-ready`: js.UndefOr[js.Array[DestinationUriReady]] = js.native
  var `destination-uri-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.native
  var `destination-uris-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-access-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-charset-default`: js.UndefOr[String] = js.native
  var `document-charset-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-creation-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-digital-signature-default`: js.UndefOr[DocumentDigitalSignature] = js.native
  var `document-digital-signature-supported`: js.UndefOr[js.Array[DocumentDigitalSignature]] = js.native
  var `document-format-default`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-details-default`: js.UndefOr[DocumentFormatDetails] = js.native
  var `document-format-details-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-format-supported`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `document-format-version-default`: js.UndefOr[String] = js.native
  var `document-format-version-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-natural-language-default`: js.UndefOr[String] = js.native
  var `document-natural-language-supported`: js.UndefOr[js.Array[String]] = js.native
  var `document-password-supported`: js.UndefOr[Double] = js.native
  var `document-privacy-attributes`: js.UndefOr[js.Array[String]] = js.native
  var `document-privacy-scope`: js.UndefOr[all | default | none | owner] = js.native
  var `feed-orientation-default`: js.UndefOr[FeedOrientation] = js.native
  var `feed-orientation-supported`: js.UndefOr[js.Array[FeedOrientation]] = js.native
  var `fetch-document-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `finishing-template-supported`: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-col-database`: js.UndefOr[js.Array[FinishingsInterface]] = js.native
  var `finishings-col-default`: js.UndefOr[FinishingsInterface] = js.native
  var `finishings-col-ready`: js.UndefOr[js.Array[FinishingsInterface]] = js.native
  var `finishings-col-supported`: js.UndefOr[
    js.Array[
      baling | binding | coating | covering | `finishing-template` | folding | `imposition-template` | laminating | `media-sheets-supported` | `media-size` | `media-size-name` | punching | stitching | trimming
    ]
  ] = js.native
  var `finishings-default`: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-ready`: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-supported`: js.UndefOr[js.Array[Finishings]] = js.native
  var `folding-direction-supported`: js.UndefOr[js.Array[FoldingDirection]] = js.native
  var `folding-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `folding-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.native
  var `font-name-requested-default`: js.UndefOr[String] = js.native
  var `font-name-requested-supported`: js.UndefOr[js.Array[String]] = js.native
  var `font-size-requested-default`: js.UndefOr[Double] = js.native
  var `font-size-requested-supported`: js.UndefOr[js.Array[String]] = js.native
  var `from-name-supported`: js.UndefOr[Double] = js.native
  var `generated-natural-language-supported`: js.UndefOr[js.Array[String]] = js.native
  var `identify-actions-default`: js.UndefOr[js.Array[IdentifyActions]] = js.native
  var `identify-actions-supported`: js.UndefOr[js.Array[IdentifyActions]] = js.native
  var `imposition-template-default`: js.UndefOr[ImpositionTemplate] = js.native
  var `imposition-template-supported`: js.UndefOr[js.Array[ImpositionTemplate]] = js.native
  var `input-attributes-default`: js.UndefOr[InputAttributes] = js.native
  var `input-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `input-color-mode-supported`: js.UndefOr[js.Array[InputColorMode]] = js.native
  var `input-content-type-supported`: js.UndefOr[js.Array[InputContentType]] = js.native
  var `input-film-scan-mode-supported`: js.UndefOr[js.Array[InputFilmScanMode]] = js.native
  var `input-media-supported`: js.UndefOr[js.Array[MediaName | MediaSizeName]] = js.native
  var `input-orientation-requested-supported`: js.UndefOr[js.Array[OrientationRequested]] = js.native
  var `input-quality-supported`: js.UndefOr[js.Array[PrintQuality]] = js.native
  var `input-resolution-supported`: js.UndefOr[js.Array[Resolution]] = js.native
  var `input-scan-regions-supported`: js.UndefOr[InputScanRegion] = js.native
  var `input-sides-supported`: js.UndefOr[js.Array[Sides]] = js.native
  var `input-source-supported`: js.UndefOr[js.Array[InputSource]] = js.native
  var `insert-after-page-number-supported`: js.UndefOr[String] = js.native
  var `insert-count-supported`: js.UndefOr[String] = js.native
  var `insert-sheet-default`: js.UndefOr[js.Array[InsertSheet]] = js.native
  var `insert-sheet-supported`: js.UndefOr[js.Array[`insert-after-page-number` | `insert-count` | media | `media-col`]] = js.native
  var `ipp-features-supported`: js.UndefOr[
    js.Array[
      `document-object` | faxout | `icc-color-matching` | `infrastructure-printer` | `ipp-3d` | `ipp-everywhere` | `job-save` | none | `page-overrides` | `proof-print` | `resource-object` | scan | `subscription-object` | `system-object`
    ]
  ] = js.native
  var `ipp-versions-supported`: js.UndefOr[js.Array[IPPVersion]] = js.native
  var `ippget-event-life`: js.UndefOr[Double] = js.native
  var `job-account-id-default`: js.UndefOr[String] = js.native
  var `job-account-id-supported`: js.UndefOr[Boolean] = js.native
  var `job-account-type-default`: js.UndefOr[JobAccountType] = js.native
  var `job-account-type-supported`: js.UndefOr[js.Array[JobAccountType]] = js.native
  var `job-accounting-sheets-default`: js.UndefOr[JobAccontingSheets] = js.native
  var `job-accounting-sheets-supported`: js.UndefOr[js.Array[String]] = js.native
  var `job-accounting-user-id-default`: js.UndefOr[String] = js.native
  var `job-accounting-user-id-supported`: js.UndefOr[Boolean] = js.native
  var `job-authorization-uri-supported`: js.UndefOr[Boolean] = js.native
  var `job-cancel-after-default`: js.UndefOr[Double] = js.native
  var `job-cancel-after-supported`: js.UndefOr[String] = js.native
  var `job-constraints-supported`: js.UndefOr[js.Array[JobConstraintsSupported]] = js.native
  var `job-creation-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `job-delay-output-until-default`: js.UndefOr[JobDelayOutputUntil] = js.native
  var `job-delay-output-until-interval-supported`: js.UndefOr[String] = js.native
  var `job-delay-output-until-supported`: js.UndefOr[js.Array[JobDelayOutputUntil]] = js.native
  var `job-delay-output-until-time-supported`: js.UndefOr[String] = js.native
  var `job-destination-spooling-supported`: js.UndefOr[String] = js.native
  var `job-error-action-default`: js.UndefOr[JobErrorAction] = js.native
  var `job-error-action-supported`: js.UndefOr[js.Array[JobErrorAction]] = js.native
  var `job-error-sheet-default`: js.UndefOr[JobErrorSheet] = js.native
  var `job-error-sheet-supported`: js.UndefOr[js.Array[String]] = js.native
  var `job-history-attributes-configured`: js.UndefOr[js.Array[String]] = js.native
  var `job-history-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `job-history-interval-configured`: js.UndefOr[Double] = js.native
  var `job-history-interval-supported`: js.UndefOr[String] = js.native
  var `job-hold-until-default`: js.UndefOr[JobHoldUntil] = js.native
  var `job-hold-until-supported`: js.UndefOr[js.Array[JobHoldUntil]] = js.native
  var `job-hold-until-time-supported`: js.UndefOr[String] = js.native
  var `job-ids-supported`: js.UndefOr[Boolean] = js.native
  var `job-impressions-supported`: js.UndefOr[String] = js.native
  var `job-k-octets-supported`: js.UndefOr[String] = js.native
  var `job-mandatory-attributes-supported`: js.UndefOr[Boolean] = js.native
  var `job-media-sheets-supported`: js.UndefOr[String] = js.native
  var `job-message-to-operator-default`: js.UndefOr[String] = js.native
  var `job-message-to-operator-supported`: js.UndefOr[Boolean] = js.native
  var `job-pages-per-set-supported`: js.UndefOr[Boolean] = js.native
  var `job-password-encryption-supported`: js.UndefOr[js.Array[JobPasswordEncryption]] = js.native
  var `job-password-length-supported`: js.UndefOr[String] = js.native
  var `job-password-repertoire-configured`: js.UndefOr[JobPasswordRepertoire] = js.native
  var `job-password-repertoire-supported`: js.UndefOr[js.Array[JobPasswordRepertoire]] = js.native
  var `job-password-supported`: js.UndefOr[Double] = js.native
  var `job-phone-number-default`: js.UndefOr[String] = js.native
  var `job-phone-number-supported`: js.UndefOr[Boolean] = js.native
  var `job-presets-supported`: js.UndefOr[js.Array[JobPresetsSupported]] = js.native
  var `job-priority-default`: js.UndefOr[Double] = js.native
  var `job-priority-supported`: js.UndefOr[Double] = js.native
  var `job-privacy-attributes`: js.UndefOr[js.Array[String]] = js.native
  var `job-privacy-scope`: js.UndefOr[all | default | none | owner] = js.native
  var `job-recipient-name-default`: js.UndefOr[String] = js.native
  var `job-recipient-name-supported`: js.UndefOr[Boolean] = js.native
  var `job-resolvers-supported`: js.UndefOr[js.Array[JobResolversSupported]] = js.native
  var `job-retain-until-default`: js.UndefOr[JobRetainUntil] = js.native
  var `job-retain-until-interval-supported`: js.UndefOr[String] = js.native
  var `job-retain-until-supported`: js.UndefOr[js.Array[JobRetainUntil]] = js.native
  var `job-retain-until-time-supported`: js.UndefOr[String] = js.native
  var `job-sheet-message-default`: js.UndefOr[String] = js.native
  var `job-sheet-message-supported`: js.UndefOr[Boolean] = js.native
  var `job-sheets-col-default`: js.UndefOr[JobSheetsInterface] = js.native
  var `job-sheets-col-supported`: js.UndefOr[js.Array[String]] = js.native
  var `job-sheets-default`: js.UndefOr[JobSheets] = js.native
  var `job-sheets-supported`: js.UndefOr[js.Array[JobSheets]] = js.native
  var `job-spooling-supported`: js.UndefOr[automatic | spool | stream] = js.native
  var `job-triggers-supported`: js.UndefOr[JobTriggersSupported] = js.native
  var `jpeg-features-supported`: js.UndefOr[
    js.Array[arithmetic | cmyk | deep | hierarchical | icc | lossless | none | progressive]
  ] = js.native
  var `jpeg-k-octets-supported`: js.UndefOr[String] = js.native
  var `jpeg-x-dimension-supported`: js.UndefOr[String] = js.native
  var `jpeg-y-dimension-supported`: js.UndefOr[String] = js.native
  var `laminating-sides-supported`: js.UndefOr[js.Array[FinishingSides]] = js.native
  var `laminating-type-supported`: js.UndefOr[js.Array[LaminatingType]] = js.native
  var `logo-uri-formats-supported`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `logo-uri-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.native
  var `material-amount-units-supported`: js.UndefOr[js.Array[MaterialAmountUnits]] = js.native
  var `material-diameter-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `material-nozzle-diameter-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `material-purpose-supported`: js.UndefOr[js.Array[MaterialPurpose]] = js.native
  var `material-rate-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `material-rate-units-supported`: js.UndefOr[js.Array[MaterialRateUnits]] = js.native
  var `material-shell-thickness-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `material-temperature-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `material-type-supported`: js.UndefOr[js.Array[MaterialType]] = js.native
  var `materials-col-database`: js.UndefOr[js.Array[Materials]] = js.native
  var `materials-col-default`: js.UndefOr[js.Array[Materials]] = js.native
  var `materials-col-ready`: js.UndefOr[js.Array[Materials]] = js.native
  var `materials-col-supported`: js.UndefOr[
    js.Array[
      `material-amount` | `material-amount-units` | `material-color` | `material-diameter` | `material-diameter-tolerance` | `material-fill-density` | `material-key` | `material-name` | `material-nozzle-diameter` | `material-purpose` | `material-rate` | `material-rate-units` | `material-retraction` | `material-shell-thickness` | `material-temperature` | `material-type`
    ]
  ] = js.native
  var `max-materials-col-supported`: js.UndefOr[Double] = js.native
  var `max-page-ranges-supported`: js.UndefOr[Double] = js.native
  var `max-save-info-supported`: js.UndefOr[Double] = js.native
  var `max-stitching-locations-supported`: js.UndefOr[Double] = js.native
  var `media-back-coating-supported`: js.UndefOr[js.Array[MediaCoating]] = js.native
  var `media-bottom-margin-supported`: js.UndefOr[js.Array[Double]] = js.native
  var `media-col-database`: js.UndefOr[js.Array[MediaInterface]] = js.native
  // "media-col-database media-source-properties collection;
  // "media-col-database media-source-properties media-source-feed-direction"?: string;
  // "media-col-database media-source-properties media-source-feed-orientation"?: string;
  var `media-col-default`: js.UndefOr[MediaInterface] = js.native
  var `media-col-ready`: js.UndefOr[js.Array[MediaInterface]] = js.native
  // "media-col-ready media-source-properties collection;
  // "media-col-ready media-source-properties media-source-feed-direction"?: string;
  // "media-col-ready media-source-properties media-source-feed-orientation"?: string;
  var `media-col-supported`: js.UndefOr[js.Array[MediaColSupported]] = js.native
  var `media-color-supported`: js.UndefOr[js.Array[MediaColor]] = js.native
  var `media-default`: js.UndefOr[Media] = js.native
  var `media-front-coating-supported`: js.UndefOr[js.Array[MediaCoating]] = js.native
  var `media-grain-supported`: js.UndefOr[js.Array[MediaGrain]] = js.native
  var `media-hole-count-supported`: js.UndefOr[js.Array[String]] = js.native
  var `media-key-supported`: js.UndefOr[js.Array[MediaSizeName | MediaName]] = js.native
  var `media-left-margin-supported`: js.UndefOr[js.Array[Double]] = js.native
  var `media-order-count-supported`: js.UndefOr[js.Array[String]] = js.native
  var `media-pre-printed-supported`: js.UndefOr[js.Array[MediaPrePrinted]] = js.native
  var `media-ready`: js.UndefOr[js.Array[MediaSizeName | MediaName]] = js.native
  var `media-recycled-supported`: js.UndefOr[js.Array[MediaPrePrinted]] = js.native
  var `media-right-margin-supported`: js.UndefOr[js.Array[Double]] = js.native
  var `media-size-supported`: js.UndefOr[MediaSizeSupported] = js.native
  var `media-source-supported`: js.UndefOr[js.Array[MediaSource]] = js.native
  var `media-supported`: js.UndefOr[js.Array[Media]] = js.native
  var `media-thickness-supported`: js.UndefOr[String] = js.native
  var `media-tooth-supported`: js.UndefOr[js.Array[MediaTooth]] = js.native
  var `media-top-margin-supported`: js.UndefOr[js.Array[Double]] = js.native
  var `media-type-supported`: js.UndefOr[js.Array[MediaType]] = js.native
  var `media-weight-metric-supported`: js.UndefOr[js.Array[String]] = js.native
  var `message-supported`: js.UndefOr[Double] = js.native
  var `multiple-destination-uris-supported`: js.UndefOr[Boolean] = js.native
  var `multiple-document-handling-default`: js.UndefOr[MultipleDocumentHandling] = js.native
  var `multiple-document-handling-supported`: js.UndefOr[js.Array[MultipleDocumentHandling]] = js.native
  var `multiple-document-jobs-supported`: js.UndefOr[Boolean] = js.native
  var `multiple-object-handling-default`: js.UndefOr[MultipleObjectHandling] = js.native
  var `multiple-object-handling-supported`: js.UndefOr[js.Array[MultipleObjectHandling]] = js.native
  var `multiple-operation-time-out`: js.UndefOr[Double] = js.native
  var `multiple-operation-time-out-action`: js.UndefOr[`abort-job` | `hold-job_` | `process-job`] = js.native
  var `natural-language-configured`: js.UndefOr[String] = js.native
  var `notify-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `notify-events-default`: js.UndefOr[js.Array[NotifyEvents]] = js.native
  var `notify-events-supported`: js.UndefOr[js.Array[NotifyEvents]] = js.native
  var `notify-lease-duration-default`: js.UndefOr[Double] = js.native
  var `notify-lease-duration-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `notify-pull-method-supported`: js.UndefOr[js.Array[ippget]] = js.native
  var `notify-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.native
  var `number-of-retries-default`: js.UndefOr[Double] = js.native
  var `number-of-retries-supported`: js.UndefOr[String] = js.native
  var `number-up-default`: js.UndefOr[Double] = js.native
  var `number-up-supported`: js.UndefOr[Double | String] = js.native
  var `oauth-authorization-scope`: js.UndefOr[js.Array[String]] = js.native
  var `oauth-authorization-server-uri`: js.UndefOr[String] = js.native
  var `operations-supported`: js.UndefOr[js.Array[String]] = js.native
  var `organization-name-supported`: js.UndefOr[Double] = js.native
  var `orientation-requested-default`: js.UndefOr[OrientationRequested] = js.native
  var `orientation-requested-supported`: js.UndefOr[js.Array[OrientationRequested]] = js.native
  var `output-attributes-default`: js.UndefOr[OutputAttributes] = js.native
  var `output-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `output-bin-default`: js.UndefOr[OutputBin] = js.native
  var `output-bin-supported`: js.UndefOr[js.Array[OutputBin]] = js.native
  var `output-device-supported`: js.UndefOr[js.Array[String]] = js.native
  var `output-device-uuid-supported`: js.UndefOr[js.Array[String]] = js.native
  var `overrides-supported`: js.UndefOr[js.Array[Overrides]] = js.native
  var `page-delivery-default`: js.UndefOr[PageDelivery] = js.native
  var `page-delivery-supported`: js.UndefOr[js.Array[PageDelivery]] = js.native
  var `page-order-received-default`: js.UndefOr[PageOrder] = js.native
  var `page-order-received-supported`: js.UndefOr[js.Array[PageOrder]] = js.native
  var `page-ranges-supported`: js.UndefOr[Boolean] = js.native
  var `pages-per-subset-supported`: js.UndefOr[Boolean] = js.native
  var `parent-printers-supported`: js.UndefOr[js.Array[String]] = js.native
  var `pclm-raster-back-side`: js.UndefOr[flipped | normal | rotated] = js.native
  var `pclm-source-resolution-supported`: js.UndefOr[js.Array[Resolution]] = js.native
  var `pclm-strip-height-preferred`: js.UndefOr[js.Array[Double]] = js.native
  var `pclm-strip-height-supported`: js.UndefOr[Double] = js.native
  var `pdf-features-supported`: js.UndefOr[js.Array[prc | u3d]] = js.native
  var `pdf-k-octets-supported`: js.UndefOr[String] = js.native
  var `pdf-versions-supported`: js.UndefOr[
    js.Array[
      `adobe-1Dot3` | `adobe-1Dot4` | `adobe-1Dot5` | `adobe-1Dot6` | `iso-15930-1_2001` | `iso-15930-3_2002` | `iso-15930-4_2003` | `iso-15930-6_2003` | `iso-15930-7_2010` | `iso-15930-8_2010` | `iso-16612-2_2010` | `iso-19005-1_2005` | `iso-19005-2_2011` | `iso-19005-3_2012` | `iso-32000-1_2008` | none | `pwg-5102Dot3`
    ]
  ] = js.native
  var `pdl-init-file-default`: js.UndefOr[PdlInitFile] = js.native
  var `pdl-init-file-entry-supported`: js.UndefOr[js.Array[String]] = js.native
  var `pdl-init-file-location-supported`: js.UndefOr[js.Array[String]] = js.native
  var `pdl-init-file-name-subdirectory-supported`: js.UndefOr[Boolean] = js.native
  var `pdl-init-file-name-supported`: js.UndefOr[js.Array[String]] = js.native
  var `pdl-init-file-supported`: js.UndefOr[
    js.Array[`pdl-init-file-entry` | `pdl-init-file-location` | `pdl-init-file-name`]
  ] = js.native
  var `pdl-override-guaranteed-supported`: js.UndefOr[js.Array[String]] = js.native
  var `pdl-override-supported`: js.UndefOr[attempted | guaranteed | `not-attempted`] = js.native
  var `platform-shape`: js.UndefOr[String] = js.native
  var `platform-temperature-default`: js.UndefOr[Double] = js.native
  var `platform-temperature-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `preferred-attributes-supported`: js.UndefOr[Boolean] = js.native
  var `presentation-direction-number-up-default`: js.UndefOr[PresentationDirectionNumberUp] = js.native
  var `presentation-direction-number-up-supported`: js.UndefOr[js.Array[PresentationDirectionNumberUp]] = js.native
  var `print-accuracy-supported`: js.UndefOr[PrintAccuracySupported] = js.native
  var `print-base-default`: js.UndefOr[PrintBase] = js.native
  var `print-base-supported`: js.UndefOr[js.Array[PrintBase]] = js.native
  var `print-color-mode-default`: js.UndefOr[PrintColorMode] = js.native
  var `print-color-mode-supported`: js.UndefOr[js.Array[PrintColorMode]] = js.native
  var `print-content-optimize-default`: js.UndefOr[PrintContentOptimize] = js.native
  var `print-content-optimize-supported`: js.UndefOr[js.Array[PrintContentOptimize]] = js.native
  var `print-objects-supported`: js.UndefOr[js.Array[`document-number` | `object-offset` | `object-size` | `object-uuid`]] = js.native
  var `print-quality-default`: js.UndefOr[PrintQuality] = js.native
  var `print-quality-supported`: js.UndefOr[js.Array[PrintQuality]] = js.native
  var `print-rendering-intent-default`: js.UndefOr[PrintRenderingIntent] = js.native
  var `print-rendering-intent-supported`: js.UndefOr[js.Array[PrintRenderingIntent]] = js.native
  var `print-scaling-default`: js.UndefOr[PrintScaling] = js.native
  var `print-scaling-supported`: js.UndefOr[js.Array[PrintScaling]] = js.native
  var `print-supports-default`: js.UndefOr[PrintSupports] = js.native
  var `print-supports-supported`: js.UndefOr[js.Array[PrintSupports]] = js.native
  var `printer-camera-image-uri`: js.UndefOr[js.Array[String]] = js.native
  var `printer-charge-info`: js.UndefOr[String] = js.native
  var `printer-charge-info-uri`: js.UndefOr[String] = js.native
  var `printer-contact-col`: js.UndefOr[PrinterContact] = js.native
  var `printer-current-time`: js.UndefOr[String] = js.native
  var `printer-device-id`: js.UndefOr[String] = js.native
  var `printer-dns-sd-name`: js.UndefOr[String] = js.native
  var `printer-driver-installer`: js.UndefOr[String] = js.native
  var `printer-fax-log-uri`: js.UndefOr[String] = js.native
  var `printer-fax-modem-info`: js.UndefOr[js.Array[String]] = js.native
  var `printer-fax-modem-name`: js.UndefOr[js.Array[String]] = js.native
  var `printer-fax-modem-number`: js.UndefOr[js.Array[String]] = js.native
  var `printer-geo-location`: js.UndefOr[String] = js.native
  var `printer-get-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
    ]
  ] = js.native
  var `printer-icc-profiles`: js.UndefOr[js.Array[PrinterIccProfiles]] = js.native
  var `printer-icons`: js.UndefOr[js.Array[String]] = js.native
  var `printer-info`: js.UndefOr[String] = js.native
  var `printer-kind`: js.UndefOr[js.Array[PrinterKind]] = js.native
  var `printer-location`: js.UndefOr[String] = js.native
  var `printer-make-and-model`: js.UndefOr[String] = js.native
  var `printer-mandatory-job-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
    ]
  ] = js.native
  var `printer-more-info-manufacturer`: js.UndefOr[String] = js.native
  var `printer-name`: js.UndefOr[String] = js.native
  var `printer-organization`: js.UndefOr[js.Array[String]] = js.native
  var `printer-organizational-unit`: js.UndefOr[js.Array[String]] = js.native
  var `printer-privacy-policy-uri`: js.UndefOr[String] = js.native
  var `printer-resolution-default`: js.UndefOr[Resolution] = js.native
  var `printer-resolution-supported`: js.UndefOr[Resolution] = js.native
  var `printer-static-resource-directory-uri`: js.UndefOr[String] = js.native
  var `printer-static-resource-k-octets-supported`: js.UndefOr[Double] = js.native
  var `printer-strings-languages-supported`: js.UndefOr[js.Array[String]] = js.native
  var `printer-strings-uri`: js.UndefOr[String] = js.native
  var `printer-volume-supported`: js.UndefOr[PrinterVolumeSupported] = js.native
  var `printer-xri-supported`: js.UndefOr[js.Array[PrinterXri]] = js.native
  var `proof-print-default`: js.UndefOr[ProofPrint] = js.native
  var `proof-print-supported`: js.UndefOr[js.Array[media | `media-col` | `proof-print-copies`]] = js.native
  var `punching-hole-diameter-configured`: js.UndefOr[Double] = js.native
  var `punching-locations-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `punching-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `punching-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.native
  var `pwg-raster-document-resolution-supported`: js.UndefOr[js.Array[Resolution]] = js.native
  var `pwg-raster-document-sheet-back`: js.UndefOr[flipped | `manual-tumble` | normal | rotated] = js.native
  var `pwg-raster-document-type-supported`: js.UndefOr[js.Array[PwgRasterDocumentTypeSupported]] = js.native
  var `pwg-safe-gcode-supported`: js.UndefOr[js.Array[String]] = js.native
  var `reference-uri-schemes-supported`: js.UndefOr[js.Array[UriSchemes]] = js.native
  var `repertoire-supported`: js.UndefOr[js.Array[String]] = js.native
  var `requesting-user-uri-supported`: js.UndefOr[Boolean] = js.native
  var `retry-interval-default`: js.UndefOr[Double] = js.native
  var `retry-interval-supported`: js.UndefOr[String] = js.native
  var `retry-time-out-default`: js.UndefOr[Double] = js.native
  var `retry-time-out-supported`: js.UndefOr[String] = js.native
  var `save-disposition-supported`: js.UndefOr[js.Array[SaveDisposition]] = js.native
  var `save-document-format-default`: js.UndefOr[MimeMediaType] = js.native
  var `save-document-format-supported`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `save-location-default`: js.UndefOr[String] = js.native
  var `save-location-supported`: js.UndefOr[js.Array[String]] = js.native
  var `save-name-subdirectory-supported`: js.UndefOr[Boolean] = js.native
  var `save-name-supported`: js.UndefOr[Boolean] = js.native
  var `separator-sheets-default`: js.UndefOr[SeparatorSheets] = js.native
  var `separator-sheets-supported`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.native
  var `sides-default`: js.UndefOr[Sides] = js.native
  var `sides-supported`: js.UndefOr[js.Array[Sides]] = js.native
  var `smi2699-auth-print-group`: js.UndefOr[String] = js.native
  var `smi2699-auth-proxy-group`: js.UndefOr[String] = js.native
  var `smi2699-device-command`: js.UndefOr[String] = js.native
  var `smi2699-device-format`: js.UndefOr[MimeMediaType] = js.native
  var `smi2699-device-name`: js.UndefOr[String] = js.native
  var `smi2699-device-uri`: js.UndefOr[String] = js.native
  var `stitching-angle-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `stitching-locations-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `stitching-method-supported`: js.UndefOr[js.Array[StitchingMethod]] = js.native
  var `stitching-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `stitching-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.native
  var `subject-supported`: js.UndefOr[Double] = js.native
  var `subordinate-printers-supported`: js.UndefOr[js.Array[String]] = js.native
  var `subscription-privacy-attributes`: js.UndefOr[js.Array[String]] = js.native
  var `subscription-privacy-scope`: js.UndefOr[String] = js.native
  var `to-name-supported`: js.UndefOr[Double] = js.native
  var `trimming-offset-supported`: js.UndefOr[js.Array[Double | String]] = js.native
  var `trimming-reference-edge-supported`: js.UndefOr[js.Array[ReferenceEdge]] = js.native
  var `trimming-type-supported`: js.UndefOr[js.Array[TrimmingType]] = js.native
  var `trimming-when-supported`: js.UndefOr[js.Array[String]] = js.native
  var `uri-authentication-supported`: js.UndefOr[
    js.Array[basic | certificate | digest | negotiate | none | `requesting-user-name`]
  ] = js.native
  var `uri-security-supported`: js.UndefOr[js.Array[none | ssl3 | tls]] = js.native
  var `user-defined-values-supported`: js.UndefOr[js.Array[String]] = js.native
  var `which-jobs-supported`: js.UndefOr[js.Array[WhichJobs]] = js.native
  var `x-image-position-default`: js.UndefOr[XImagePosition] = js.native
  var `x-image-position-supported`: js.UndefOr[js.Array[XImagePosition]] = js.native
  var `x-image-shift-default`: js.UndefOr[Double] = js.native
  var `x-image-shift-supported`: js.UndefOr[String] = js.native
  var `x-side1-image-shift-default`: js.UndefOr[Double] = js.native
  var `x-side1-image-shift-supported`: js.UndefOr[String] = js.native
  var `x-side2-image-shift-default`: js.UndefOr[Double] = js.native
  var `x-side2-image-shift-supported`: js.UndefOr[String] = js.native
  var `y-image-position-default`: js.UndefOr[YImagePosition] = js.native
  var `y-image-position-supported`: js.UndefOr[js.Array[YImagePosition]] = js.native
  var `y-image-shift-default`: js.UndefOr[Double] = js.native
  var `y-image-shift-supported`: js.UndefOr[String] = js.native
  var `y-side1-image-shift-default`: js.UndefOr[Double] = js.native
  var `y-side1-image-shift-supported`: js.UndefOr[String] = js.native
  var `y-side2-image-shift-default`: js.UndefOr[Double] = js.native
  var `y-side2-image-shift-supported`: js.UndefOr[String] = js.native
}

object PrinterDescription {
  @scala.inline
  def apply(): PrinterDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterDescription]
  }
  @scala.inline
  implicit class PrinterDescriptionOps[Self <: PrinterDescription] (val x: Self) extends AnyVal {
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
    def `setAccuracy-units-supportedVarargs`(value: AccuracyUnits*): Self = this.set("accuracy-units-supported", js.Array(value :_*))
    @scala.inline
    def `setAccuracy-units-supported`(value: js.Array[AccuracyUnits]): Self = this.set("accuracy-units-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccuracy-units-supported`: Self = this.set("accuracy-units-supported", js.undefined)
    @scala.inline
    def `setBaling-type-supportedVarargs`(value: BalingType*): Self = this.set("baling-type-supported", js.Array(value :_*))
    @scala.inline
    def `setBaling-type-supported`(value: js.Array[BalingType]): Self = this.set("baling-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBaling-type-supported`: Self = this.set("baling-type-supported", js.undefined)
    @scala.inline
    def `setBaling-when-supportedVarargs`(value: BalingWhen*): Self = this.set("baling-when-supported", js.Array(value :_*))
    @scala.inline
    def `setBaling-when-supported`(value: js.Array[BalingWhen]): Self = this.set("baling-when-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBaling-when-supported`: Self = this.set("baling-when-supported", js.undefined)
    @scala.inline
    def `setBinding-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = this.set("binding-reference-edge-supported", js.Array(value :_*))
    @scala.inline
    def `setBinding-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = this.set("binding-reference-edge-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBinding-reference-edge-supported`: Self = this.set("binding-reference-edge-supported", js.undefined)
    @scala.inline
    def `setBinding-type-supportedVarargs`(value: BindingType*): Self = this.set("binding-type-supported", js.Array(value :_*))
    @scala.inline
    def `setBinding-type-supported`(value: js.Array[BindingType]): Self = this.set("binding-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBinding-type-supported`: Self = this.set("binding-type-supported", js.undefined)
    @scala.inline
    def `setChamber-humidity-default`(value: Double): Self = this.set("chamber-humidity-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-humidity-default`: Self = this.set("chamber-humidity-default", js.undefined)
    @scala.inline
    def `setChamber-humidity-supported`(value: Boolean): Self = this.set("chamber-humidity-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-humidity-supported`: Self = this.set("chamber-humidity-supported", js.undefined)
    @scala.inline
    def `setChamber-temperature-default`(value: Double): Self = this.set("chamber-temperature-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-temperature-default`: Self = this.set("chamber-temperature-default", js.undefined)
    @scala.inline
    def `setChamber-temperature-supportedVarargs`(value: (Double | String)*): Self = this.set("chamber-temperature-supported", js.Array(value :_*))
    @scala.inline
    def `setChamber-temperature-supported`(value: js.Array[Double | String]): Self = this.set("chamber-temperature-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteChamber-temperature-supported`: Self = this.set("chamber-temperature-supported", js.undefined)
    @scala.inline
    def `setCharset-configured`(value: String): Self = this.set("charset-configured", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCharset-configured`: Self = this.set("charset-configured", js.undefined)
    @scala.inline
    def `setCharset-supportedVarargs`(value: String*): Self = this.set("charset-supported", js.Array(value :_*))
    @scala.inline
    def `setCharset-supported`(value: js.Array[String]): Self = this.set("charset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCharset-supported`: Self = this.set("charset-supported", js.undefined)
    @scala.inline
    def `setCoating-sides-supportedVarargs`(value: FinishingSides*): Self = this.set("coating-sides-supported", js.Array(value :_*))
    @scala.inline
    def `setCoating-sides-supported`(value: js.Array[FinishingSides]): Self = this.set("coating-sides-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoating-sides-supported`: Self = this.set("coating-sides-supported", js.undefined)
    @scala.inline
    def `setCoating-type-supportedVarargs`(value: CoatingType*): Self = this.set("coating-type-supported", js.Array(value :_*))
    @scala.inline
    def `setCoating-type-supported`(value: js.Array[CoatingType]): Self = this.set("coating-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoating-type-supported`: Self = this.set("coating-type-supported", js.undefined)
    @scala.inline
    def `setColor-supported`(value: Boolean): Self = this.set("color-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-supported`: Self = this.set("color-supported", js.undefined)
    @scala.inline
    def `setCompression-supportedVarargs`(value: Compression*): Self = this.set("compression-supported", js.Array(value :_*))
    @scala.inline
    def `setCompression-supported`(value: js.Array[Compression]): Self = this.set("compression-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCompression-supported`: Self = this.set("compression-supported", js.undefined)
    @scala.inline
    def `setConfirmation-sheet-print-default`(value: Boolean): Self = this.set("confirmation-sheet-print-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteConfirmation-sheet-print-default`: Self = this.set("confirmation-sheet-print-default", js.undefined)
    @scala.inline
    def `setCopies-default`(value: Double): Self = this.set("copies-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCopies-default`: Self = this.set("copies-default", js.undefined)
    @scala.inline
    def `setCopies-supportedVarargs`(value: Double*): Self = this.set("copies-supported", js.Array(value :_*))
    @scala.inline
    def `setCopies-supported`(value: js.Array[Double]): Self = this.set("copies-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCopies-supported`: Self = this.set("copies-supported", js.undefined)
    @scala.inline
    def `setCover-back-default`(value: Cover): Self = this.set("cover-back-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-back-default`: Self = this.set("cover-back-default", js.undefined)
    @scala.inline
    def `setCover-back-supportedVarargs`(value: String*): Self = this.set("cover-back-supported", js.Array(value :_*))
    @scala.inline
    def `setCover-back-supported`(value: js.Array[String]): Self = this.set("cover-back-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-back-supported`: Self = this.set("cover-back-supported", js.undefined)
    @scala.inline
    def `setCover-front-default`(value: Cover): Self = this.set("cover-front-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-front-default`: Self = this.set("cover-front-default", js.undefined)
    @scala.inline
    def `setCover-front-supportedVarargs`(value: String*): Self = this.set("cover-front-supported", js.Array(value :_*))
    @scala.inline
    def `setCover-front-supported`(value: js.Array[String]): Self = this.set("cover-front-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-front-supported`: Self = this.set("cover-front-supported", js.undefined)
    @scala.inline
    def `setCover-sheet-info-default`(value: CoverSheetInfo): Self = this.set("cover-sheet-info-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-sheet-info-default`: Self = this.set("cover-sheet-info-default", js.undefined)
    @scala.inline
    def `setCover-sheet-info-supportedVarargs`(value: String*): Self = this.set("cover-sheet-info-supported", js.Array(value :_*))
    @scala.inline
    def `setCover-sheet-info-supported`(value: js.Array[String]): Self = this.set("cover-sheet-info-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCover-sheet-info-supported`: Self = this.set("cover-sheet-info-supported", js.undefined)
    @scala.inline
    def `setCovering-name-supportedVarargs`(value: String*): Self = this.set("covering-name-supported", js.Array(value :_*))
    @scala.inline
    def `setCovering-name-supported`(value: js.Array[String]): Self = this.set("covering-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCovering-name-supported`: Self = this.set("covering-name-supported", js.undefined)
    @scala.inline
    def `setDestination-accesses-supportedVarargs`(value: String*): Self = this.set("destination-accesses-supported", js.Array(value :_*))
    @scala.inline
    def `setDestination-accesses-supported`(value: js.Array[String]): Self = this.set("destination-accesses-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-accesses-supported`: Self = this.set("destination-accesses-supported", js.undefined)
    @scala.inline
    def `setDestination-uri-readyVarargs`(value: DestinationUriReady*): Self = this.set("destination-uri-ready", js.Array(value :_*))
    @scala.inline
    def `setDestination-uri-ready`(value: js.Array[DestinationUriReady]): Self = this.set("destination-uri-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-uri-ready`: Self = this.set("destination-uri-ready", js.undefined)
    @scala.inline
    def `setDestination-uri-schemes-supportedVarargs`(value: UriSchemes*): Self = this.set("destination-uri-schemes-supported", js.Array(value :_*))
    @scala.inline
    def `setDestination-uri-schemes-supported`(value: js.Array[UriSchemes]): Self = this.set("destination-uri-schemes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-uri-schemes-supported`: Self = this.set("destination-uri-schemes-supported", js.undefined)
    @scala.inline
    def `setDestination-uris-supportedVarargs`(value: String*): Self = this.set("destination-uris-supported", js.Array(value :_*))
    @scala.inline
    def `setDestination-uris-supported`(value: js.Array[String]): Self = this.set("destination-uris-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDestination-uris-supported`: Self = this.set("destination-uris-supported", js.undefined)
    @scala.inline
    def `setDocument-access-supportedVarargs`(value: String*): Self = this.set("document-access-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-access-supported`(value: js.Array[String]): Self = this.set("document-access-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-access-supported`: Self = this.set("document-access-supported", js.undefined)
    @scala.inline
    def `setDocument-charset-default`(value: String): Self = this.set("document-charset-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-charset-default`: Self = this.set("document-charset-default", js.undefined)
    @scala.inline
    def `setDocument-charset-supportedVarargs`(value: String*): Self = this.set("document-charset-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-charset-supported`(value: js.Array[String]): Self = this.set("document-charset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-charset-supported`: Self = this.set("document-charset-supported", js.undefined)
    @scala.inline
    def `setDocument-creation-attributes-supportedVarargs`(value: String*): Self = this.set("document-creation-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-creation-attributes-supported`(value: js.Array[String]): Self = this.set("document-creation-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-creation-attributes-supported`: Self = this.set("document-creation-attributes-supported", js.undefined)
    @scala.inline
    def `setDocument-digital-signature-default`(value: DocumentDigitalSignature): Self = this.set("document-digital-signature-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-digital-signature-default`: Self = this.set("document-digital-signature-default", js.undefined)
    @scala.inline
    def `setDocument-digital-signature-supportedVarargs`(value: DocumentDigitalSignature*): Self = this.set("document-digital-signature-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-digital-signature-supported`(value: js.Array[DocumentDigitalSignature]): Self = this.set("document-digital-signature-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-digital-signature-supported`: Self = this.set("document-digital-signature-supported", js.undefined)
    @scala.inline
    def `setDocument-format-default`(value: MimeMediaType): Self = this.set("document-format-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-default`: Self = this.set("document-format-default", js.undefined)
    @scala.inline
    def `setDocument-format-details-default`(value: DocumentFormatDetails): Self = this.set("document-format-details-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-details-default`: Self = this.set("document-format-details-default", js.undefined)
    @scala.inline
    def `setDocument-format-details-supportedVarargs`(value: String*): Self = this.set("document-format-details-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-format-details-supported`(value: js.Array[String]): Self = this.set("document-format-details-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-details-supported`: Self = this.set("document-format-details-supported", js.undefined)
    @scala.inline
    def `setDocument-format-supportedVarargs`(value: MimeMediaType*): Self = this.set("document-format-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-format-supported`(value: js.Array[MimeMediaType]): Self = this.set("document-format-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-supported`: Self = this.set("document-format-supported", js.undefined)
    @scala.inline
    def `setDocument-format-version-default`(value: String): Self = this.set("document-format-version-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-version-default`: Self = this.set("document-format-version-default", js.undefined)
    @scala.inline
    def `setDocument-format-version-supportedVarargs`(value: String*): Self = this.set("document-format-version-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-format-version-supported`(value: js.Array[String]): Self = this.set("document-format-version-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-format-version-supported`: Self = this.set("document-format-version-supported", js.undefined)
    @scala.inline
    def `setDocument-natural-language-default`(value: String): Self = this.set("document-natural-language-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-natural-language-default`: Self = this.set("document-natural-language-default", js.undefined)
    @scala.inline
    def `setDocument-natural-language-supportedVarargs`(value: String*): Self = this.set("document-natural-language-supported", js.Array(value :_*))
    @scala.inline
    def `setDocument-natural-language-supported`(value: js.Array[String]): Self = this.set("document-natural-language-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-natural-language-supported`: Self = this.set("document-natural-language-supported", js.undefined)
    @scala.inline
    def `setDocument-password-supported`(value: Double): Self = this.set("document-password-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-password-supported`: Self = this.set("document-password-supported", js.undefined)
    @scala.inline
    def `setDocument-privacy-attributesVarargs`(value: String*): Self = this.set("document-privacy-attributes", js.Array(value :_*))
    @scala.inline
    def `setDocument-privacy-attributes`(value: js.Array[String]): Self = this.set("document-privacy-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-privacy-attributes`: Self = this.set("document-privacy-attributes", js.undefined)
    @scala.inline
    def `setDocument-privacy-scope`(value: all | default | none | owner): Self = this.set("document-privacy-scope", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-privacy-scope`: Self = this.set("document-privacy-scope", js.undefined)
    @scala.inline
    def `setFeed-orientation-default`(value: FeedOrientation): Self = this.set("feed-orientation-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFeed-orientation-default`: Self = this.set("feed-orientation-default", js.undefined)
    @scala.inline
    def `setFeed-orientation-supportedVarargs`(value: FeedOrientation*): Self = this.set("feed-orientation-supported", js.Array(value :_*))
    @scala.inline
    def `setFeed-orientation-supported`(value: js.Array[FeedOrientation]): Self = this.set("feed-orientation-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFeed-orientation-supported`: Self = this.set("feed-orientation-supported", js.undefined)
    @scala.inline
    def `setFetch-document-attributes-supportedVarargs`(value: String*): Self = this.set("fetch-document-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setFetch-document-attributes-supported`(value: js.Array[String]): Self = this.set("fetch-document-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-document-attributes-supported`: Self = this.set("fetch-document-attributes-supported", js.undefined)
    @scala.inline
    def `setFinishing-template-supportedVarargs`(value: Finishings*): Self = this.set("finishing-template-supported", js.Array(value :_*))
    @scala.inline
    def `setFinishing-template-supported`(value: js.Array[Finishings]): Self = this.set("finishing-template-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishing-template-supported`: Self = this.set("finishing-template-supported", js.undefined)
    @scala.inline
    def `setFinishings-col-databaseVarargs`(value: FinishingsInterface*): Self = this.set("finishings-col-database", js.Array(value :_*))
    @scala.inline
    def `setFinishings-col-database`(value: js.Array[FinishingsInterface]): Self = this.set("finishings-col-database", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-col-database`: Self = this.set("finishings-col-database", js.undefined)
    @scala.inline
    def `setFinishings-col-default`(value: FinishingsInterface): Self = this.set("finishings-col-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-col-default`: Self = this.set("finishings-col-default", js.undefined)
    @scala.inline
    def `setFinishings-col-readyVarargs`(value: FinishingsInterface*): Self = this.set("finishings-col-ready", js.Array(value :_*))
    @scala.inline
    def `setFinishings-col-ready`(value: js.Array[FinishingsInterface]): Self = this.set("finishings-col-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-col-ready`: Self = this.set("finishings-col-ready", js.undefined)
    @scala.inline
    def `setFinishings-col-supportedVarargs`(
      value: (baling | binding | coating | covering | `finishing-template` | folding | `imposition-template` | laminating | `media-sheets-supported` | `media-size` | `media-size-name` | punching | stitching | trimming)*
    ): Self = this.set("finishings-col-supported", js.Array(value :_*))
    @scala.inline
    def `setFinishings-col-supported`(
      value: js.Array[
          baling | binding | coating | covering | `finishing-template` | folding | `imposition-template` | laminating | `media-sheets-supported` | `media-size` | `media-size-name` | punching | stitching | trimming
        ]
    ): Self = this.set("finishings-col-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-col-supported`: Self = this.set("finishings-col-supported", js.undefined)
    @scala.inline
    def `setFinishings-defaultVarargs`(value: Finishings*): Self = this.set("finishings-default", js.Array(value :_*))
    @scala.inline
    def `setFinishings-default`(value: js.Array[Finishings]): Self = this.set("finishings-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-default`: Self = this.set("finishings-default", js.undefined)
    @scala.inline
    def `setFinishings-readyVarargs`(value: Finishings*): Self = this.set("finishings-ready", js.Array(value :_*))
    @scala.inline
    def `setFinishings-ready`(value: js.Array[Finishings]): Self = this.set("finishings-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-ready`: Self = this.set("finishings-ready", js.undefined)
    @scala.inline
    def `setFinishings-supportedVarargs`(value: Finishings*): Self = this.set("finishings-supported", js.Array(value :_*))
    @scala.inline
    def `setFinishings-supported`(value: js.Array[Finishings]): Self = this.set("finishings-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFinishings-supported`: Self = this.set("finishings-supported", js.undefined)
    @scala.inline
    def `setFolding-direction-supportedVarargs`(value: FoldingDirection*): Self = this.set("folding-direction-supported", js.Array(value :_*))
    @scala.inline
    def `setFolding-direction-supported`(value: js.Array[FoldingDirection]): Self = this.set("folding-direction-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFolding-direction-supported`: Self = this.set("folding-direction-supported", js.undefined)
    @scala.inline
    def `setFolding-offset-supportedVarargs`(value: (Double | String)*): Self = this.set("folding-offset-supported", js.Array(value :_*))
    @scala.inline
    def `setFolding-offset-supported`(value: js.Array[Double | String]): Self = this.set("folding-offset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFolding-offset-supported`: Self = this.set("folding-offset-supported", js.undefined)
    @scala.inline
    def `setFolding-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = this.set("folding-reference-edge-supported", js.Array(value :_*))
    @scala.inline
    def `setFolding-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = this.set("folding-reference-edge-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFolding-reference-edge-supported`: Self = this.set("folding-reference-edge-supported", js.undefined)
    @scala.inline
    def `setFont-name-requested-default`(value: String): Self = this.set("font-name-requested-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-name-requested-default`: Self = this.set("font-name-requested-default", js.undefined)
    @scala.inline
    def `setFont-name-requested-supportedVarargs`(value: String*): Self = this.set("font-name-requested-supported", js.Array(value :_*))
    @scala.inline
    def `setFont-name-requested-supported`(value: js.Array[String]): Self = this.set("font-name-requested-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-name-requested-supported`: Self = this.set("font-name-requested-supported", js.undefined)
    @scala.inline
    def `setFont-size-requested-default`(value: Double): Self = this.set("font-size-requested-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size-requested-default`: Self = this.set("font-size-requested-default", js.undefined)
    @scala.inline
    def `setFont-size-requested-supportedVarargs`(value: String*): Self = this.set("font-size-requested-supported", js.Array(value :_*))
    @scala.inline
    def `setFont-size-requested-supported`(value: js.Array[String]): Self = this.set("font-size-requested-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size-requested-supported`: Self = this.set("font-size-requested-supported", js.undefined)
    @scala.inline
    def `setFrom-name-supported`(value: Double): Self = this.set("from-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFrom-name-supported`: Self = this.set("from-name-supported", js.undefined)
    @scala.inline
    def `setGenerated-natural-language-supportedVarargs`(value: String*): Self = this.set("generated-natural-language-supported", js.Array(value :_*))
    @scala.inline
    def `setGenerated-natural-language-supported`(value: js.Array[String]): Self = this.set("generated-natural-language-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGenerated-natural-language-supported`: Self = this.set("generated-natural-language-supported", js.undefined)
    @scala.inline
    def `setIdentify-actions-defaultVarargs`(value: IdentifyActions*): Self = this.set("identify-actions-default", js.Array(value :_*))
    @scala.inline
    def `setIdentify-actions-default`(value: js.Array[IdentifyActions]): Self = this.set("identify-actions-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIdentify-actions-default`: Self = this.set("identify-actions-default", js.undefined)
    @scala.inline
    def `setIdentify-actions-supportedVarargs`(value: IdentifyActions*): Self = this.set("identify-actions-supported", js.Array(value :_*))
    @scala.inline
    def `setIdentify-actions-supported`(value: js.Array[IdentifyActions]): Self = this.set("identify-actions-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIdentify-actions-supported`: Self = this.set("identify-actions-supported", js.undefined)
    @scala.inline
    def `setImposition-template-default`(value: ImpositionTemplate): Self = this.set("imposition-template-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImposition-template-default`: Self = this.set("imposition-template-default", js.undefined)
    @scala.inline
    def `setImposition-template-supportedVarargs`(value: ImpositionTemplate*): Self = this.set("imposition-template-supported", js.Array(value :_*))
    @scala.inline
    def `setImposition-template-supported`(value: js.Array[ImpositionTemplate]): Self = this.set("imposition-template-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImposition-template-supported`: Self = this.set("imposition-template-supported", js.undefined)
    @scala.inline
    def `setInput-attributes-default`(value: InputAttributes): Self = this.set("input-attributes-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-attributes-default`: Self = this.set("input-attributes-default", js.undefined)
    @scala.inline
    def `setInput-attributes-supportedVarargs`(value: String*): Self = this.set("input-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-attributes-supported`(value: js.Array[String]): Self = this.set("input-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-attributes-supported`: Self = this.set("input-attributes-supported", js.undefined)
    @scala.inline
    def `setInput-color-mode-supportedVarargs`(value: InputColorMode*): Self = this.set("input-color-mode-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-color-mode-supported`(value: js.Array[InputColorMode]): Self = this.set("input-color-mode-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-color-mode-supported`: Self = this.set("input-color-mode-supported", js.undefined)
    @scala.inline
    def `setInput-content-type-supportedVarargs`(value: InputContentType*): Self = this.set("input-content-type-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-content-type-supported`(value: js.Array[InputContentType]): Self = this.set("input-content-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-content-type-supported`: Self = this.set("input-content-type-supported", js.undefined)
    @scala.inline
    def `setInput-film-scan-mode-supportedVarargs`(value: InputFilmScanMode*): Self = this.set("input-film-scan-mode-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-film-scan-mode-supported`(value: js.Array[InputFilmScanMode]): Self = this.set("input-film-scan-mode-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-film-scan-mode-supported`: Self = this.set("input-film-scan-mode-supported", js.undefined)
    @scala.inline
    def `setInput-media-supportedVarargs`(value: (MediaName | MediaSizeName)*): Self = this.set("input-media-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-media-supported`(value: js.Array[MediaName | MediaSizeName]): Self = this.set("input-media-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-media-supported`: Self = this.set("input-media-supported", js.undefined)
    @scala.inline
    def `setInput-orientation-requested-supportedVarargs`(value: OrientationRequested*): Self = this.set("input-orientation-requested-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-orientation-requested-supported`(value: js.Array[OrientationRequested]): Self = this.set("input-orientation-requested-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-orientation-requested-supported`: Self = this.set("input-orientation-requested-supported", js.undefined)
    @scala.inline
    def `setInput-quality-supportedVarargs`(value: PrintQuality*): Self = this.set("input-quality-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-quality-supported`(value: js.Array[PrintQuality]): Self = this.set("input-quality-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-quality-supported`: Self = this.set("input-quality-supported", js.undefined)
    @scala.inline
    def `setInput-resolution-supportedVarargs`(value: Resolution*): Self = this.set("input-resolution-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-resolution-supported`(value: js.Array[Resolution]): Self = this.set("input-resolution-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-resolution-supported`: Self = this.set("input-resolution-supported", js.undefined)
    @scala.inline
    def `setInput-scan-regions-supported`(value: InputScanRegion): Self = this.set("input-scan-regions-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-scan-regions-supported`: Self = this.set("input-scan-regions-supported", js.undefined)
    @scala.inline
    def `setInput-sides-supportedVarargs`(value: Sides*): Self = this.set("input-sides-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-sides-supported`(value: js.Array[Sides]): Self = this.set("input-sides-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-sides-supported`: Self = this.set("input-sides-supported", js.undefined)
    @scala.inline
    def `setInput-source-supportedVarargs`(value: InputSource*): Self = this.set("input-source-supported", js.Array(value :_*))
    @scala.inline
    def `setInput-source-supported`(value: js.Array[InputSource]): Self = this.set("input-source-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInput-source-supported`: Self = this.set("input-source-supported", js.undefined)
    @scala.inline
    def `setInsert-after-page-number-supported`(value: String): Self = this.set("insert-after-page-number-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-after-page-number-supported`: Self = this.set("insert-after-page-number-supported", js.undefined)
    @scala.inline
    def `setInsert-count-supported`(value: String): Self = this.set("insert-count-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-count-supported`: Self = this.set("insert-count-supported", js.undefined)
    @scala.inline
    def `setInsert-sheet-defaultVarargs`(value: InsertSheet*): Self = this.set("insert-sheet-default", js.Array(value :_*))
    @scala.inline
    def `setInsert-sheet-default`(value: js.Array[InsertSheet]): Self = this.set("insert-sheet-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-sheet-default`: Self = this.set("insert-sheet-default", js.undefined)
    @scala.inline
    def `setInsert-sheet-supportedVarargs`(value: (`insert-after-page-number` | `insert-count` | media | `media-col`)*): Self = this.set("insert-sheet-supported", js.Array(value :_*))
    @scala.inline
    def `setInsert-sheet-supported`(value: js.Array[`insert-after-page-number` | `insert-count` | media | `media-col`]): Self = this.set("insert-sheet-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInsert-sheet-supported`: Self = this.set("insert-sheet-supported", js.undefined)
    @scala.inline
    def `setIpp-features-supportedVarargs`(
      value: (`document-object` | faxout | `icc-color-matching` | `infrastructure-printer` | `ipp-3d` | `ipp-everywhere` | `job-save` | none | `page-overrides` | `proof-print` | `resource-object` | scan | `subscription-object` | `system-object`)*
    ): Self = this.set("ipp-features-supported", js.Array(value :_*))
    @scala.inline
    def `setIpp-features-supported`(
      value: js.Array[
          `document-object` | faxout | `icc-color-matching` | `infrastructure-printer` | `ipp-3d` | `ipp-everywhere` | `job-save` | none | `page-overrides` | `proof-print` | `resource-object` | scan | `subscription-object` | `system-object`
        ]
    ): Self = this.set("ipp-features-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIpp-features-supported`: Self = this.set("ipp-features-supported", js.undefined)
    @scala.inline
    def `setIpp-versions-supportedVarargs`(value: IPPVersion*): Self = this.set("ipp-versions-supported", js.Array(value :_*))
    @scala.inline
    def `setIpp-versions-supported`(value: js.Array[IPPVersion]): Self = this.set("ipp-versions-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIpp-versions-supported`: Self = this.set("ipp-versions-supported", js.undefined)
    @scala.inline
    def `setIppget-event-life`(value: Double): Self = this.set("ippget-event-life", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIppget-event-life`: Self = this.set("ippget-event-life", js.undefined)
    @scala.inline
    def `setJob-account-id-default`(value: String): Self = this.set("job-account-id-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-id-default`: Self = this.set("job-account-id-default", js.undefined)
    @scala.inline
    def `setJob-account-id-supported`(value: Boolean): Self = this.set("job-account-id-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-id-supported`: Self = this.set("job-account-id-supported", js.undefined)
    @scala.inline
    def `setJob-account-type-default`(value: JobAccountType): Self = this.set("job-account-type-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-type-default`: Self = this.set("job-account-type-default", js.undefined)
    @scala.inline
    def `setJob-account-type-supportedVarargs`(value: JobAccountType*): Self = this.set("job-account-type-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-account-type-supported`(value: js.Array[JobAccountType]): Self = this.set("job-account-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-account-type-supported`: Self = this.set("job-account-type-supported", js.undefined)
    @scala.inline
    def `setJob-accounting-sheets-default`(value: JobAccontingSheets): Self = this.set("job-accounting-sheets-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-sheets-default`: Self = this.set("job-accounting-sheets-default", js.undefined)
    @scala.inline
    def `setJob-accounting-sheets-supportedVarargs`(value: String*): Self = this.set("job-accounting-sheets-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-accounting-sheets-supported`(value: js.Array[String]): Self = this.set("job-accounting-sheets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-sheets-supported`: Self = this.set("job-accounting-sheets-supported", js.undefined)
    @scala.inline
    def `setJob-accounting-user-id-default`(value: String): Self = this.set("job-accounting-user-id-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-user-id-default`: Self = this.set("job-accounting-user-id-default", js.undefined)
    @scala.inline
    def `setJob-accounting-user-id-supported`(value: Boolean): Self = this.set("job-accounting-user-id-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-accounting-user-id-supported`: Self = this.set("job-accounting-user-id-supported", js.undefined)
    @scala.inline
    def `setJob-authorization-uri-supported`(value: Boolean): Self = this.set("job-authorization-uri-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-authorization-uri-supported`: Self = this.set("job-authorization-uri-supported", js.undefined)
    @scala.inline
    def `setJob-cancel-after-default`(value: Double): Self = this.set("job-cancel-after-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-cancel-after-default`: Self = this.set("job-cancel-after-default", js.undefined)
    @scala.inline
    def `setJob-cancel-after-supported`(value: String): Self = this.set("job-cancel-after-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-cancel-after-supported`: Self = this.set("job-cancel-after-supported", js.undefined)
    @scala.inline
    def `setJob-constraints-supportedVarargs`(value: JobConstraintsSupported*): Self = this.set("job-constraints-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-constraints-supported`(value: js.Array[JobConstraintsSupported]): Self = this.set("job-constraints-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-constraints-supported`: Self = this.set("job-constraints-supported", js.undefined)
    @scala.inline
    def `setJob-creation-attributes-supportedVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any)*): Self = this.set("job-creation-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-creation-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = this.set("job-creation-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-creation-attributes-supported`: Self = this.set("job-creation-attributes-supported", js.undefined)
    @scala.inline
    def `setJob-delay-output-until-default`(value: JobDelayOutputUntil): Self = this.set("job-delay-output-until-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-delay-output-until-default`: Self = this.set("job-delay-output-until-default", js.undefined)
    @scala.inline
    def `setJob-delay-output-until-interval-supported`(value: String): Self = this.set("job-delay-output-until-interval-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-delay-output-until-interval-supported`: Self = this.set("job-delay-output-until-interval-supported", js.undefined)
    @scala.inline
    def `setJob-delay-output-until-supportedVarargs`(value: JobDelayOutputUntil*): Self = this.set("job-delay-output-until-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-delay-output-until-supported`(value: js.Array[JobDelayOutputUntil]): Self = this.set("job-delay-output-until-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-delay-output-until-supported`: Self = this.set("job-delay-output-until-supported", js.undefined)
    @scala.inline
    def `setJob-delay-output-until-time-supported`(value: String): Self = this.set("job-delay-output-until-time-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-delay-output-until-time-supported`: Self = this.set("job-delay-output-until-time-supported", js.undefined)
    @scala.inline
    def `setJob-destination-spooling-supported`(value: String): Self = this.set("job-destination-spooling-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-destination-spooling-supported`: Self = this.set("job-destination-spooling-supported", js.undefined)
    @scala.inline
    def `setJob-error-action-default`(value: JobErrorAction): Self = this.set("job-error-action-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-action-default`: Self = this.set("job-error-action-default", js.undefined)
    @scala.inline
    def `setJob-error-action-supportedVarargs`(value: JobErrorAction*): Self = this.set("job-error-action-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-error-action-supported`(value: js.Array[JobErrorAction]): Self = this.set("job-error-action-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-action-supported`: Self = this.set("job-error-action-supported", js.undefined)
    @scala.inline
    def `setJob-error-sheet-default`(value: JobErrorSheet): Self = this.set("job-error-sheet-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-sheet-default`: Self = this.set("job-error-sheet-default", js.undefined)
    @scala.inline
    def `setJob-error-sheet-supportedVarargs`(value: String*): Self = this.set("job-error-sheet-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-error-sheet-supported`(value: js.Array[String]): Self = this.set("job-error-sheet-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-error-sheet-supported`: Self = this.set("job-error-sheet-supported", js.undefined)
    @scala.inline
    def `setJob-history-attributes-configuredVarargs`(value: String*): Self = this.set("job-history-attributes-configured", js.Array(value :_*))
    @scala.inline
    def `setJob-history-attributes-configured`(value: js.Array[String]): Self = this.set("job-history-attributes-configured", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-history-attributes-configured`: Self = this.set("job-history-attributes-configured", js.undefined)
    @scala.inline
    def `setJob-history-attributes-supportedVarargs`(value: String*): Self = this.set("job-history-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-history-attributes-supported`(value: js.Array[String]): Self = this.set("job-history-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-history-attributes-supported`: Self = this.set("job-history-attributes-supported", js.undefined)
    @scala.inline
    def `setJob-history-interval-configured`(value: Double): Self = this.set("job-history-interval-configured", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-history-interval-configured`: Self = this.set("job-history-interval-configured", js.undefined)
    @scala.inline
    def `setJob-history-interval-supported`(value: String): Self = this.set("job-history-interval-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-history-interval-supported`: Self = this.set("job-history-interval-supported", js.undefined)
    @scala.inline
    def `setJob-hold-until-default`(value: JobHoldUntil): Self = this.set("job-hold-until-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until-default`: Self = this.set("job-hold-until-default", js.undefined)
    @scala.inline
    def `setJob-hold-until-supportedVarargs`(value: JobHoldUntil*): Self = this.set("job-hold-until-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-hold-until-supported`(value: js.Array[JobHoldUntil]): Self = this.set("job-hold-until-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until-supported`: Self = this.set("job-hold-until-supported", js.undefined)
    @scala.inline
    def `setJob-hold-until-time-supported`(value: String): Self = this.set("job-hold-until-time-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-hold-until-time-supported`: Self = this.set("job-hold-until-time-supported", js.undefined)
    @scala.inline
    def `setJob-ids-supported`(value: Boolean): Self = this.set("job-ids-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-ids-supported`: Self = this.set("job-ids-supported", js.undefined)
    @scala.inline
    def `setJob-impressions-supported`(value: String): Self = this.set("job-impressions-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-impressions-supported`: Self = this.set("job-impressions-supported", js.undefined)
    @scala.inline
    def `setJob-k-octets-supported`(value: String): Self = this.set("job-k-octets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-k-octets-supported`: Self = this.set("job-k-octets-supported", js.undefined)
    @scala.inline
    def `setJob-mandatory-attributes-supported`(value: Boolean): Self = this.set("job-mandatory-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-mandatory-attributes-supported`: Self = this.set("job-mandatory-attributes-supported", js.undefined)
    @scala.inline
    def `setJob-media-sheets-supported`(value: String): Self = this.set("job-media-sheets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-media-sheets-supported`: Self = this.set("job-media-sheets-supported", js.undefined)
    @scala.inline
    def `setJob-message-to-operator-default`(value: String): Self = this.set("job-message-to-operator-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-message-to-operator-default`: Self = this.set("job-message-to-operator-default", js.undefined)
    @scala.inline
    def `setJob-message-to-operator-supported`(value: Boolean): Self = this.set("job-message-to-operator-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-message-to-operator-supported`: Self = this.set("job-message-to-operator-supported", js.undefined)
    @scala.inline
    def `setJob-pages-per-set-supported`(value: Boolean): Self = this.set("job-pages-per-set-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-pages-per-set-supported`: Self = this.set("job-pages-per-set-supported", js.undefined)
    @scala.inline
    def `setJob-password-encryption-supportedVarargs`(value: JobPasswordEncryption*): Self = this.set("job-password-encryption-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-password-encryption-supported`(value: js.Array[JobPasswordEncryption]): Self = this.set("job-password-encryption-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password-encryption-supported`: Self = this.set("job-password-encryption-supported", js.undefined)
    @scala.inline
    def `setJob-password-length-supported`(value: String): Self = this.set("job-password-length-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password-length-supported`: Self = this.set("job-password-length-supported", js.undefined)
    @scala.inline
    def `setJob-password-repertoire-configured`(value: JobPasswordRepertoire): Self = this.set("job-password-repertoire-configured", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password-repertoire-configured`: Self = this.set("job-password-repertoire-configured", js.undefined)
    @scala.inline
    def `setJob-password-repertoire-supportedVarargs`(value: JobPasswordRepertoire*): Self = this.set("job-password-repertoire-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-password-repertoire-supported`(value: js.Array[JobPasswordRepertoire]): Self = this.set("job-password-repertoire-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password-repertoire-supported`: Self = this.set("job-password-repertoire-supported", js.undefined)
    @scala.inline
    def `setJob-password-supported`(value: Double): Self = this.set("job-password-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-password-supported`: Self = this.set("job-password-supported", js.undefined)
    @scala.inline
    def `setJob-phone-number-default`(value: String): Self = this.set("job-phone-number-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-phone-number-default`: Self = this.set("job-phone-number-default", js.undefined)
    @scala.inline
    def `setJob-phone-number-supported`(value: Boolean): Self = this.set("job-phone-number-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-phone-number-supported`: Self = this.set("job-phone-number-supported", js.undefined)
    @scala.inline
    def `setJob-presets-supportedVarargs`(value: JobPresetsSupported*): Self = this.set("job-presets-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-presets-supported`(value: js.Array[JobPresetsSupported]): Self = this.set("job-presets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-presets-supported`: Self = this.set("job-presets-supported", js.undefined)
    @scala.inline
    def `setJob-priority-default`(value: Double): Self = this.set("job-priority-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-priority-default`: Self = this.set("job-priority-default", js.undefined)
    @scala.inline
    def `setJob-priority-supported`(value: Double): Self = this.set("job-priority-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-priority-supported`: Self = this.set("job-priority-supported", js.undefined)
    @scala.inline
    def `setJob-privacy-attributesVarargs`(value: String*): Self = this.set("job-privacy-attributes", js.Array(value :_*))
    @scala.inline
    def `setJob-privacy-attributes`(value: js.Array[String]): Self = this.set("job-privacy-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-privacy-attributes`: Self = this.set("job-privacy-attributes", js.undefined)
    @scala.inline
    def `setJob-privacy-scope`(value: all | default | none | owner): Self = this.set("job-privacy-scope", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-privacy-scope`: Self = this.set("job-privacy-scope", js.undefined)
    @scala.inline
    def `setJob-recipient-name-default`(value: String): Self = this.set("job-recipient-name-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-recipient-name-default`: Self = this.set("job-recipient-name-default", js.undefined)
    @scala.inline
    def `setJob-recipient-name-supported`(value: Boolean): Self = this.set("job-recipient-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-recipient-name-supported`: Self = this.set("job-recipient-name-supported", js.undefined)
    @scala.inline
    def `setJob-resolvers-supportedVarargs`(value: JobResolversSupported*): Self = this.set("job-resolvers-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-resolvers-supported`(value: js.Array[JobResolversSupported]): Self = this.set("job-resolvers-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-resolvers-supported`: Self = this.set("job-resolvers-supported", js.undefined)
    @scala.inline
    def `setJob-retain-until-default`(value: JobRetainUntil): Self = this.set("job-retain-until-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until-default`: Self = this.set("job-retain-until-default", js.undefined)
    @scala.inline
    def `setJob-retain-until-interval-supported`(value: String): Self = this.set("job-retain-until-interval-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until-interval-supported`: Self = this.set("job-retain-until-interval-supported", js.undefined)
    @scala.inline
    def `setJob-retain-until-supportedVarargs`(value: JobRetainUntil*): Self = this.set("job-retain-until-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-retain-until-supported`(value: js.Array[JobRetainUntil]): Self = this.set("job-retain-until-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until-supported`: Self = this.set("job-retain-until-supported", js.undefined)
    @scala.inline
    def `setJob-retain-until-time-supported`(value: String): Self = this.set("job-retain-until-time-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-retain-until-time-supported`: Self = this.set("job-retain-until-time-supported", js.undefined)
    @scala.inline
    def `setJob-sheet-message-default`(value: String): Self = this.set("job-sheet-message-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheet-message-default`: Self = this.set("job-sheet-message-default", js.undefined)
    @scala.inline
    def `setJob-sheet-message-supported`(value: Boolean): Self = this.set("job-sheet-message-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheet-message-supported`: Self = this.set("job-sheet-message-supported", js.undefined)
    @scala.inline
    def `setJob-sheets-col-default`(value: JobSheetsInterface): Self = this.set("job-sheets-col-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-col-default`: Self = this.set("job-sheets-col-default", js.undefined)
    @scala.inline
    def `setJob-sheets-col-supportedVarargs`(value: String*): Self = this.set("job-sheets-col-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-sheets-col-supported`(value: js.Array[String]): Self = this.set("job-sheets-col-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-col-supported`: Self = this.set("job-sheets-col-supported", js.undefined)
    @scala.inline
    def `setJob-sheets-default`(value: JobSheets): Self = this.set("job-sheets-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-default`: Self = this.set("job-sheets-default", js.undefined)
    @scala.inline
    def `setJob-sheets-supportedVarargs`(value: JobSheets*): Self = this.set("job-sheets-supported", js.Array(value :_*))
    @scala.inline
    def `setJob-sheets-supported`(value: js.Array[JobSheets]): Self = this.set("job-sheets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-sheets-supported`: Self = this.set("job-sheets-supported", js.undefined)
    @scala.inline
    def `setJob-spooling-supported`(value: automatic | spool | stream): Self = this.set("job-spooling-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-spooling-supported`: Self = this.set("job-spooling-supported", js.undefined)
    @scala.inline
    def `setJob-triggers-supported`(value: JobTriggersSupported): Self = this.set("job-triggers-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-triggers-supported`: Self = this.set("job-triggers-supported", js.undefined)
    @scala.inline
    def `setJpeg-features-supportedVarargs`(value: (arithmetic | cmyk | deep | hierarchical | icc | lossless | none | progressive)*): Self = this.set("jpeg-features-supported", js.Array(value :_*))
    @scala.inline
    def `setJpeg-features-supported`(value: js.Array[arithmetic | cmyk | deep | hierarchical | icc | lossless | none | progressive]): Self = this.set("jpeg-features-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJpeg-features-supported`: Self = this.set("jpeg-features-supported", js.undefined)
    @scala.inline
    def `setJpeg-k-octets-supported`(value: String): Self = this.set("jpeg-k-octets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJpeg-k-octets-supported`: Self = this.set("jpeg-k-octets-supported", js.undefined)
    @scala.inline
    def `setJpeg-x-dimension-supported`(value: String): Self = this.set("jpeg-x-dimension-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJpeg-x-dimension-supported`: Self = this.set("jpeg-x-dimension-supported", js.undefined)
    @scala.inline
    def `setJpeg-y-dimension-supported`(value: String): Self = this.set("jpeg-y-dimension-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJpeg-y-dimension-supported`: Self = this.set("jpeg-y-dimension-supported", js.undefined)
    @scala.inline
    def `setLaminating-sides-supportedVarargs`(value: FinishingSides*): Self = this.set("laminating-sides-supported", js.Array(value :_*))
    @scala.inline
    def `setLaminating-sides-supported`(value: js.Array[FinishingSides]): Self = this.set("laminating-sides-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLaminating-sides-supported`: Self = this.set("laminating-sides-supported", js.undefined)
    @scala.inline
    def `setLaminating-type-supportedVarargs`(value: LaminatingType*): Self = this.set("laminating-type-supported", js.Array(value :_*))
    @scala.inline
    def `setLaminating-type-supported`(value: js.Array[LaminatingType]): Self = this.set("laminating-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLaminating-type-supported`: Self = this.set("laminating-type-supported", js.undefined)
    @scala.inline
    def `setLogo-uri-formats-supportedVarargs`(value: MimeMediaType*): Self = this.set("logo-uri-formats-supported", js.Array(value :_*))
    @scala.inline
    def `setLogo-uri-formats-supported`(value: js.Array[MimeMediaType]): Self = this.set("logo-uri-formats-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLogo-uri-formats-supported`: Self = this.set("logo-uri-formats-supported", js.undefined)
    @scala.inline
    def `setLogo-uri-schemes-supportedVarargs`(value: UriSchemes*): Self = this.set("logo-uri-schemes-supported", js.Array(value :_*))
    @scala.inline
    def `setLogo-uri-schemes-supported`(value: js.Array[UriSchemes]): Self = this.set("logo-uri-schemes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLogo-uri-schemes-supported`: Self = this.set("logo-uri-schemes-supported", js.undefined)
    @scala.inline
    def `setMaterial-amount-units-supportedVarargs`(value: MaterialAmountUnits*): Self = this.set("material-amount-units-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-amount-units-supported`(value: js.Array[MaterialAmountUnits]): Self = this.set("material-amount-units-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-amount-units-supported`: Self = this.set("material-amount-units-supported", js.undefined)
    @scala.inline
    def `setMaterial-diameter-supportedVarargs`(value: (Double | String)*): Self = this.set("material-diameter-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-diameter-supported`(value: js.Array[Double | String]): Self = this.set("material-diameter-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-diameter-supported`: Self = this.set("material-diameter-supported", js.undefined)
    @scala.inline
    def `setMaterial-nozzle-diameter-supportedVarargs`(value: (Double | String)*): Self = this.set("material-nozzle-diameter-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-nozzle-diameter-supported`(value: js.Array[Double | String]): Self = this.set("material-nozzle-diameter-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-nozzle-diameter-supported`: Self = this.set("material-nozzle-diameter-supported", js.undefined)
    @scala.inline
    def `setMaterial-purpose-supportedVarargs`(value: MaterialPurpose*): Self = this.set("material-purpose-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-purpose-supported`(value: js.Array[MaterialPurpose]): Self = this.set("material-purpose-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-purpose-supported`: Self = this.set("material-purpose-supported", js.undefined)
    @scala.inline
    def `setMaterial-rate-supportedVarargs`(value: (Double | String)*): Self = this.set("material-rate-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-rate-supported`(value: js.Array[Double | String]): Self = this.set("material-rate-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-rate-supported`: Self = this.set("material-rate-supported", js.undefined)
    @scala.inline
    def `setMaterial-rate-units-supportedVarargs`(value: MaterialRateUnits*): Self = this.set("material-rate-units-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-rate-units-supported`(value: js.Array[MaterialRateUnits]): Self = this.set("material-rate-units-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-rate-units-supported`: Self = this.set("material-rate-units-supported", js.undefined)
    @scala.inline
    def `setMaterial-shell-thickness-supportedVarargs`(value: (Double | String)*): Self = this.set("material-shell-thickness-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-shell-thickness-supported`(value: js.Array[Double | String]): Self = this.set("material-shell-thickness-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-shell-thickness-supported`: Self = this.set("material-shell-thickness-supported", js.undefined)
    @scala.inline
    def `setMaterial-temperature-supportedVarargs`(value: (Double | String)*): Self = this.set("material-temperature-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-temperature-supported`(value: js.Array[Double | String]): Self = this.set("material-temperature-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-temperature-supported`: Self = this.set("material-temperature-supported", js.undefined)
    @scala.inline
    def `setMaterial-type-supportedVarargs`(value: MaterialType*): Self = this.set("material-type-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterial-type-supported`(value: js.Array[MaterialType]): Self = this.set("material-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-type-supported`: Self = this.set("material-type-supported", js.undefined)
    @scala.inline
    def `setMaterials-col-databaseVarargs`(value: Materials*): Self = this.set("materials-col-database", js.Array(value :_*))
    @scala.inline
    def `setMaterials-col-database`(value: js.Array[Materials]): Self = this.set("materials-col-database", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterials-col-database`: Self = this.set("materials-col-database", js.undefined)
    @scala.inline
    def `setMaterials-col-defaultVarargs`(value: Materials*): Self = this.set("materials-col-default", js.Array(value :_*))
    @scala.inline
    def `setMaterials-col-default`(value: js.Array[Materials]): Self = this.set("materials-col-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterials-col-default`: Self = this.set("materials-col-default", js.undefined)
    @scala.inline
    def `setMaterials-col-readyVarargs`(value: Materials*): Self = this.set("materials-col-ready", js.Array(value :_*))
    @scala.inline
    def `setMaterials-col-ready`(value: js.Array[Materials]): Self = this.set("materials-col-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterials-col-ready`: Self = this.set("materials-col-ready", js.undefined)
    @scala.inline
    def `setMaterials-col-supportedVarargs`(
      value: (`material-amount` | `material-amount-units` | `material-color` | `material-diameter` | `material-diameter-tolerance` | `material-fill-density` | `material-key` | `material-name` | `material-nozzle-diameter` | `material-purpose` | `material-rate` | `material-rate-units` | `material-retraction` | `material-shell-thickness` | `material-temperature` | `material-type`)*
    ): Self = this.set("materials-col-supported", js.Array(value :_*))
    @scala.inline
    def `setMaterials-col-supported`(
      value: js.Array[
          `material-amount` | `material-amount-units` | `material-color` | `material-diameter` | `material-diameter-tolerance` | `material-fill-density` | `material-key` | `material-name` | `material-nozzle-diameter` | `material-purpose` | `material-rate` | `material-rate-units` | `material-retraction` | `material-shell-thickness` | `material-temperature` | `material-type`
        ]
    ): Self = this.set("materials-col-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterials-col-supported`: Self = this.set("materials-col-supported", js.undefined)
    @scala.inline
    def `setMax-materials-col-supported`(value: Double): Self = this.set("max-materials-col-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-materials-col-supported`: Self = this.set("max-materials-col-supported", js.undefined)
    @scala.inline
    def `setMax-page-ranges-supported`(value: Double): Self = this.set("max-page-ranges-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-page-ranges-supported`: Self = this.set("max-page-ranges-supported", js.undefined)
    @scala.inline
    def `setMax-save-info-supported`(value: Double): Self = this.set("max-save-info-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-save-info-supported`: Self = this.set("max-save-info-supported", js.undefined)
    @scala.inline
    def `setMax-stitching-locations-supported`(value: Double): Self = this.set("max-stitching-locations-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-stitching-locations-supported`: Self = this.set("max-stitching-locations-supported", js.undefined)
    @scala.inline
    def `setMedia-back-coating-supportedVarargs`(value: MediaCoating*): Self = this.set("media-back-coating-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-back-coating-supported`(value: js.Array[MediaCoating]): Self = this.set("media-back-coating-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-back-coating-supported`: Self = this.set("media-back-coating-supported", js.undefined)
    @scala.inline
    def `setMedia-bottom-margin-supportedVarargs`(value: Double*): Self = this.set("media-bottom-margin-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-bottom-margin-supported`(value: js.Array[Double]): Self = this.set("media-bottom-margin-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-bottom-margin-supported`: Self = this.set("media-bottom-margin-supported", js.undefined)
    @scala.inline
    def `setMedia-col-databaseVarargs`(value: MediaInterface*): Self = this.set("media-col-database", js.Array(value :_*))
    @scala.inline
    def `setMedia-col-database`(value: js.Array[MediaInterface]): Self = this.set("media-col-database", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col-database`: Self = this.set("media-col-database", js.undefined)
    @scala.inline
    def `setMedia-col-default`(value: MediaInterface): Self = this.set("media-col-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col-default`: Self = this.set("media-col-default", js.undefined)
    @scala.inline
    def `setMedia-col-readyVarargs`(value: MediaInterface*): Self = this.set("media-col-ready", js.Array(value :_*))
    @scala.inline
    def `setMedia-col-ready`(value: js.Array[MediaInterface]): Self = this.set("media-col-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col-ready`: Self = this.set("media-col-ready", js.undefined)
    @scala.inline
    def `setMedia-col-supportedVarargs`(value: MediaColSupported*): Self = this.set("media-col-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-col-supported`(value: js.Array[MediaColSupported]): Self = this.set("media-col-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col-supported`: Self = this.set("media-col-supported", js.undefined)
    @scala.inline
    def `setMedia-color-supportedVarargs`(value: MediaColor*): Self = this.set("media-color-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-color-supported`(value: js.Array[MediaColor]): Self = this.set("media-color-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-color-supported`: Self = this.set("media-color-supported", js.undefined)
    @scala.inline
    def `setMedia-default`(value: Media): Self = this.set("media-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-default`: Self = this.set("media-default", js.undefined)
    @scala.inline
    def `setMedia-front-coating-supportedVarargs`(value: MediaCoating*): Self = this.set("media-front-coating-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-front-coating-supported`(value: js.Array[MediaCoating]): Self = this.set("media-front-coating-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-front-coating-supported`: Self = this.set("media-front-coating-supported", js.undefined)
    @scala.inline
    def `setMedia-grain-supportedVarargs`(value: MediaGrain*): Self = this.set("media-grain-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-grain-supported`(value: js.Array[MediaGrain]): Self = this.set("media-grain-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-grain-supported`: Self = this.set("media-grain-supported", js.undefined)
    @scala.inline
    def `setMedia-hole-count-supportedVarargs`(value: String*): Self = this.set("media-hole-count-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-hole-count-supported`(value: js.Array[String]): Self = this.set("media-hole-count-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-hole-count-supported`: Self = this.set("media-hole-count-supported", js.undefined)
    @scala.inline
    def `setMedia-key-supportedVarargs`(value: (MediaSizeName | MediaName)*): Self = this.set("media-key-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-key-supported`(value: js.Array[MediaSizeName | MediaName]): Self = this.set("media-key-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-key-supported`: Self = this.set("media-key-supported", js.undefined)
    @scala.inline
    def `setMedia-left-margin-supportedVarargs`(value: Double*): Self = this.set("media-left-margin-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-left-margin-supported`(value: js.Array[Double]): Self = this.set("media-left-margin-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-left-margin-supported`: Self = this.set("media-left-margin-supported", js.undefined)
    @scala.inline
    def `setMedia-order-count-supportedVarargs`(value: String*): Self = this.set("media-order-count-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-order-count-supported`(value: js.Array[String]): Self = this.set("media-order-count-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-order-count-supported`: Self = this.set("media-order-count-supported", js.undefined)
    @scala.inline
    def `setMedia-pre-printed-supportedVarargs`(value: MediaPrePrinted*): Self = this.set("media-pre-printed-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-pre-printed-supported`(value: js.Array[MediaPrePrinted]): Self = this.set("media-pre-printed-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-pre-printed-supported`: Self = this.set("media-pre-printed-supported", js.undefined)
    @scala.inline
    def `setMedia-readyVarargs`(value: (MediaSizeName | MediaName)*): Self = this.set("media-ready", js.Array(value :_*))
    @scala.inline
    def `setMedia-ready`(value: js.Array[MediaSizeName | MediaName]): Self = this.set("media-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-ready`: Self = this.set("media-ready", js.undefined)
    @scala.inline
    def `setMedia-recycled-supportedVarargs`(value: MediaPrePrinted*): Self = this.set("media-recycled-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-recycled-supported`(value: js.Array[MediaPrePrinted]): Self = this.set("media-recycled-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-recycled-supported`: Self = this.set("media-recycled-supported", js.undefined)
    @scala.inline
    def `setMedia-right-margin-supportedVarargs`(value: Double*): Self = this.set("media-right-margin-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-right-margin-supported`(value: js.Array[Double]): Self = this.set("media-right-margin-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-right-margin-supported`: Self = this.set("media-right-margin-supported", js.undefined)
    @scala.inline
    def `setMedia-size-supported`(value: MediaSizeSupported): Self = this.set("media-size-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-size-supported`: Self = this.set("media-size-supported", js.undefined)
    @scala.inline
    def `setMedia-source-supportedVarargs`(value: MediaSource*): Self = this.set("media-source-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-source-supported`(value: js.Array[MediaSource]): Self = this.set("media-source-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-source-supported`: Self = this.set("media-source-supported", js.undefined)
    @scala.inline
    def `setMedia-supportedVarargs`(value: Media*): Self = this.set("media-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-supported`(value: js.Array[Media]): Self = this.set("media-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-supported`: Self = this.set("media-supported", js.undefined)
    @scala.inline
    def `setMedia-thickness-supported`(value: String): Self = this.set("media-thickness-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-thickness-supported`: Self = this.set("media-thickness-supported", js.undefined)
    @scala.inline
    def `setMedia-tooth-supportedVarargs`(value: MediaTooth*): Self = this.set("media-tooth-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-tooth-supported`(value: js.Array[MediaTooth]): Self = this.set("media-tooth-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-tooth-supported`: Self = this.set("media-tooth-supported", js.undefined)
    @scala.inline
    def `setMedia-top-margin-supportedVarargs`(value: Double*): Self = this.set("media-top-margin-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-top-margin-supported`(value: js.Array[Double]): Self = this.set("media-top-margin-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-top-margin-supported`: Self = this.set("media-top-margin-supported", js.undefined)
    @scala.inline
    def `setMedia-type-supportedVarargs`(value: MediaType*): Self = this.set("media-type-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-type-supported`(value: js.Array[MediaType]): Self = this.set("media-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-type-supported`: Self = this.set("media-type-supported", js.undefined)
    @scala.inline
    def `setMedia-weight-metric-supportedVarargs`(value: String*): Self = this.set("media-weight-metric-supported", js.Array(value :_*))
    @scala.inline
    def `setMedia-weight-metric-supported`(value: js.Array[String]): Self = this.set("media-weight-metric-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-weight-metric-supported`: Self = this.set("media-weight-metric-supported", js.undefined)
    @scala.inline
    def `setMessage-supported`(value: Double): Self = this.set("message-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMessage-supported`: Self = this.set("message-supported", js.undefined)
    @scala.inline
    def `setMultiple-destination-uris-supported`(value: Boolean): Self = this.set("multiple-destination-uris-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-destination-uris-supported`: Self = this.set("multiple-destination-uris-supported", js.undefined)
    @scala.inline
    def `setMultiple-document-handling-default`(value: MultipleDocumentHandling): Self = this.set("multiple-document-handling-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-document-handling-default`: Self = this.set("multiple-document-handling-default", js.undefined)
    @scala.inline
    def `setMultiple-document-handling-supportedVarargs`(value: MultipleDocumentHandling*): Self = this.set("multiple-document-handling-supported", js.Array(value :_*))
    @scala.inline
    def `setMultiple-document-handling-supported`(value: js.Array[MultipleDocumentHandling]): Self = this.set("multiple-document-handling-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-document-handling-supported`: Self = this.set("multiple-document-handling-supported", js.undefined)
    @scala.inline
    def `setMultiple-document-jobs-supported`(value: Boolean): Self = this.set("multiple-document-jobs-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-document-jobs-supported`: Self = this.set("multiple-document-jobs-supported", js.undefined)
    @scala.inline
    def `setMultiple-object-handling-default`(value: MultipleObjectHandling): Self = this.set("multiple-object-handling-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-object-handling-default`: Self = this.set("multiple-object-handling-default", js.undefined)
    @scala.inline
    def `setMultiple-object-handling-supportedVarargs`(value: MultipleObjectHandling*): Self = this.set("multiple-object-handling-supported", js.Array(value :_*))
    @scala.inline
    def `setMultiple-object-handling-supported`(value: js.Array[MultipleObjectHandling]): Self = this.set("multiple-object-handling-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-object-handling-supported`: Self = this.set("multiple-object-handling-supported", js.undefined)
    @scala.inline
    def `setMultiple-operation-time-out`(value: Double): Self = this.set("multiple-operation-time-out", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-operation-time-out`: Self = this.set("multiple-operation-time-out", js.undefined)
    @scala.inline
    def `setMultiple-operation-time-out-action`(value: `abort-job` | `hold-job_` | `process-job`): Self = this.set("multiple-operation-time-out-action", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMultiple-operation-time-out-action`: Self = this.set("multiple-operation-time-out-action", js.undefined)
    @scala.inline
    def `setNatural-language-configured`(value: String): Self = this.set("natural-language-configured", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNatural-language-configured`: Self = this.set("natural-language-configured", js.undefined)
    @scala.inline
    def `setNotify-attributes-supportedVarargs`(value: String*): Self = this.set("notify-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setNotify-attributes-supported`(value: js.Array[String]): Self = this.set("notify-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-attributes-supported`: Self = this.set("notify-attributes-supported", js.undefined)
    @scala.inline
    def `setNotify-events-defaultVarargs`(value: NotifyEvents*): Self = this.set("notify-events-default", js.Array(value :_*))
    @scala.inline
    def `setNotify-events-default`(value: js.Array[NotifyEvents]): Self = this.set("notify-events-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-events-default`: Self = this.set("notify-events-default", js.undefined)
    @scala.inline
    def `setNotify-events-supportedVarargs`(value: NotifyEvents*): Self = this.set("notify-events-supported", js.Array(value :_*))
    @scala.inline
    def `setNotify-events-supported`(value: js.Array[NotifyEvents]): Self = this.set("notify-events-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-events-supported`: Self = this.set("notify-events-supported", js.undefined)
    @scala.inline
    def `setNotify-lease-duration-default`(value: Double): Self = this.set("notify-lease-duration-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-lease-duration-default`: Self = this.set("notify-lease-duration-default", js.undefined)
    @scala.inline
    def `setNotify-lease-duration-supportedVarargs`(value: (Double | String)*): Self = this.set("notify-lease-duration-supported", js.Array(value :_*))
    @scala.inline
    def `setNotify-lease-duration-supported`(value: js.Array[Double | String]): Self = this.set("notify-lease-duration-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-lease-duration-supported`: Self = this.set("notify-lease-duration-supported", js.undefined)
    @scala.inline
    def `setNotify-pull-method-supportedVarargs`(value: ippget*): Self = this.set("notify-pull-method-supported", js.Array(value :_*))
    @scala.inline
    def `setNotify-pull-method-supported`(value: js.Array[ippget]): Self = this.set("notify-pull-method-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-pull-method-supported`: Self = this.set("notify-pull-method-supported", js.undefined)
    @scala.inline
    def `setNotify-schemes-supportedVarargs`(value: UriSchemes*): Self = this.set("notify-schemes-supported", js.Array(value :_*))
    @scala.inline
    def `setNotify-schemes-supported`(value: js.Array[UriSchemes]): Self = this.set("notify-schemes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNotify-schemes-supported`: Self = this.set("notify-schemes-supported", js.undefined)
    @scala.inline
    def `setNumber-of-retries-default`(value: Double): Self = this.set("number-of-retries-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-of-retries-default`: Self = this.set("number-of-retries-default", js.undefined)
    @scala.inline
    def `setNumber-of-retries-supported`(value: String): Self = this.set("number-of-retries-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-of-retries-supported`: Self = this.set("number-of-retries-supported", js.undefined)
    @scala.inline
    def `setNumber-up-default`(value: Double): Self = this.set("number-up-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-up-default`: Self = this.set("number-up-default", js.undefined)
    @scala.inline
    def `setNumber-up-supported`(value: Double | String): Self = this.set("number-up-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNumber-up-supported`: Self = this.set("number-up-supported", js.undefined)
    @scala.inline
    def `setOauth-authorization-scopeVarargs`(value: String*): Self = this.set("oauth-authorization-scope", js.Array(value :_*))
    @scala.inline
    def `setOauth-authorization-scope`(value: js.Array[String]): Self = this.set("oauth-authorization-scope", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOauth-authorization-scope`: Self = this.set("oauth-authorization-scope", js.undefined)
    @scala.inline
    def `setOauth-authorization-server-uri`(value: String): Self = this.set("oauth-authorization-server-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOauth-authorization-server-uri`: Self = this.set("oauth-authorization-server-uri", js.undefined)
    @scala.inline
    def `setOperations-supportedVarargs`(value: String*): Self = this.set("operations-supported", js.Array(value :_*))
    @scala.inline
    def `setOperations-supported`(value: js.Array[String]): Self = this.set("operations-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOperations-supported`: Self = this.set("operations-supported", js.undefined)
    @scala.inline
    def `setOrganization-name-supported`(value: Double): Self = this.set("organization-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOrganization-name-supported`: Self = this.set("organization-name-supported", js.undefined)
    @scala.inline
    def `setOrientation-requested-default`(value: OrientationRequested): Self = this.set("orientation-requested-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOrientation-requested-default`: Self = this.set("orientation-requested-default", js.undefined)
    @scala.inline
    def `setOrientation-requested-supportedVarargs`(value: OrientationRequested*): Self = this.set("orientation-requested-supported", js.Array(value :_*))
    @scala.inline
    def `setOrientation-requested-supported`(value: js.Array[OrientationRequested]): Self = this.set("orientation-requested-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOrientation-requested-supported`: Self = this.set("orientation-requested-supported", js.undefined)
    @scala.inline
    def `setOutput-attributes-default`(value: OutputAttributes): Self = this.set("output-attributes-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-attributes-default`: Self = this.set("output-attributes-default", js.undefined)
    @scala.inline
    def `setOutput-attributes-supportedVarargs`(value: String*): Self = this.set("output-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setOutput-attributes-supported`(value: js.Array[String]): Self = this.set("output-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-attributes-supported`: Self = this.set("output-attributes-supported", js.undefined)
    @scala.inline
    def `setOutput-bin-default`(value: OutputBin): Self = this.set("output-bin-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-bin-default`: Self = this.set("output-bin-default", js.undefined)
    @scala.inline
    def `setOutput-bin-supportedVarargs`(value: OutputBin*): Self = this.set("output-bin-supported", js.Array(value :_*))
    @scala.inline
    def `setOutput-bin-supported`(value: js.Array[OutputBin]): Self = this.set("output-bin-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-bin-supported`: Self = this.set("output-bin-supported", js.undefined)
    @scala.inline
    def `setOutput-device-supportedVarargs`(value: String*): Self = this.set("output-device-supported", js.Array(value :_*))
    @scala.inline
    def `setOutput-device-supported`(value: js.Array[String]): Self = this.set("output-device-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-supported`: Self = this.set("output-device-supported", js.undefined)
    @scala.inline
    def `setOutput-device-uuid-supportedVarargs`(value: String*): Self = this.set("output-device-uuid-supported", js.Array(value :_*))
    @scala.inline
    def `setOutput-device-uuid-supported`(value: js.Array[String]): Self = this.set("output-device-uuid-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutput-device-uuid-supported`: Self = this.set("output-device-uuid-supported", js.undefined)
    @scala.inline
    def `setOverrides-supportedVarargs`(value: Overrides*): Self = this.set("overrides-supported", js.Array(value :_*))
    @scala.inline
    def `setOverrides-supported`(value: js.Array[Overrides]): Self = this.set("overrides-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverrides-supported`: Self = this.set("overrides-supported", js.undefined)
    @scala.inline
    def `setPage-delivery-default`(value: PageDelivery): Self = this.set("page-delivery-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-delivery-default`: Self = this.set("page-delivery-default", js.undefined)
    @scala.inline
    def `setPage-delivery-supportedVarargs`(value: PageDelivery*): Self = this.set("page-delivery-supported", js.Array(value :_*))
    @scala.inline
    def `setPage-delivery-supported`(value: js.Array[PageDelivery]): Self = this.set("page-delivery-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-delivery-supported`: Self = this.set("page-delivery-supported", js.undefined)
    @scala.inline
    def `setPage-order-received-default`(value: PageOrder): Self = this.set("page-order-received-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-order-received-default`: Self = this.set("page-order-received-default", js.undefined)
    @scala.inline
    def `setPage-order-received-supportedVarargs`(value: PageOrder*): Self = this.set("page-order-received-supported", js.Array(value :_*))
    @scala.inline
    def `setPage-order-received-supported`(value: js.Array[PageOrder]): Self = this.set("page-order-received-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-order-received-supported`: Self = this.set("page-order-received-supported", js.undefined)
    @scala.inline
    def `setPage-ranges-supported`(value: Boolean): Self = this.set("page-ranges-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-ranges-supported`: Self = this.set("page-ranges-supported", js.undefined)
    @scala.inline
    def `setPages-per-subset-supported`(value: Boolean): Self = this.set("pages-per-subset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePages-per-subset-supported`: Self = this.set("pages-per-subset-supported", js.undefined)
    @scala.inline
    def `setParent-printers-supportedVarargs`(value: String*): Self = this.set("parent-printers-supported", js.Array(value :_*))
    @scala.inline
    def `setParent-printers-supported`(value: js.Array[String]): Self = this.set("parent-printers-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteParent-printers-supported`: Self = this.set("parent-printers-supported", js.undefined)
    @scala.inline
    def `setPclm-raster-back-side`(value: flipped | normal | rotated): Self = this.set("pclm-raster-back-side", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePclm-raster-back-side`: Self = this.set("pclm-raster-back-side", js.undefined)
    @scala.inline
    def `setPclm-source-resolution-supportedVarargs`(value: Resolution*): Self = this.set("pclm-source-resolution-supported", js.Array(value :_*))
    @scala.inline
    def `setPclm-source-resolution-supported`(value: js.Array[Resolution]): Self = this.set("pclm-source-resolution-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePclm-source-resolution-supported`: Self = this.set("pclm-source-resolution-supported", js.undefined)
    @scala.inline
    def `setPclm-strip-height-preferredVarargs`(value: Double*): Self = this.set("pclm-strip-height-preferred", js.Array(value :_*))
    @scala.inline
    def `setPclm-strip-height-preferred`(value: js.Array[Double]): Self = this.set("pclm-strip-height-preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePclm-strip-height-preferred`: Self = this.set("pclm-strip-height-preferred", js.undefined)
    @scala.inline
    def `setPclm-strip-height-supported`(value: Double): Self = this.set("pclm-strip-height-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePclm-strip-height-supported`: Self = this.set("pclm-strip-height-supported", js.undefined)
    @scala.inline
    def `setPdf-features-supportedVarargs`(value: (prc | u3d)*): Self = this.set("pdf-features-supported", js.Array(value :_*))
    @scala.inline
    def `setPdf-features-supported`(value: js.Array[prc | u3d]): Self = this.set("pdf-features-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdf-features-supported`: Self = this.set("pdf-features-supported", js.undefined)
    @scala.inline
    def `setPdf-k-octets-supported`(value: String): Self = this.set("pdf-k-octets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdf-k-octets-supported`: Self = this.set("pdf-k-octets-supported", js.undefined)
    @scala.inline
    def `setPdf-versions-supportedVarargs`(
      value: (`adobe-1Dot3` | `adobe-1Dot4` | `adobe-1Dot5` | `adobe-1Dot6` | `iso-15930-1_2001` | `iso-15930-3_2002` | `iso-15930-4_2003` | `iso-15930-6_2003` | `iso-15930-7_2010` | `iso-15930-8_2010` | `iso-16612-2_2010` | `iso-19005-1_2005` | `iso-19005-2_2011` | `iso-19005-3_2012` | `iso-32000-1_2008` | none | `pwg-5102Dot3`)*
    ): Self = this.set("pdf-versions-supported", js.Array(value :_*))
    @scala.inline
    def `setPdf-versions-supported`(
      value: js.Array[
          `adobe-1Dot3` | `adobe-1Dot4` | `adobe-1Dot5` | `adobe-1Dot6` | `iso-15930-1_2001` | `iso-15930-3_2002` | `iso-15930-4_2003` | `iso-15930-6_2003` | `iso-15930-7_2010` | `iso-15930-8_2010` | `iso-16612-2_2010` | `iso-19005-1_2005` | `iso-19005-2_2011` | `iso-19005-3_2012` | `iso-32000-1_2008` | none | `pwg-5102Dot3`
        ]
    ): Self = this.set("pdf-versions-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdf-versions-supported`: Self = this.set("pdf-versions-supported", js.undefined)
    @scala.inline
    def `setPdl-init-file-default`(value: PdlInitFile): Self = this.set("pdl-init-file-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-default`: Self = this.set("pdl-init-file-default", js.undefined)
    @scala.inline
    def `setPdl-init-file-entry-supportedVarargs`(value: String*): Self = this.set("pdl-init-file-entry-supported", js.Array(value :_*))
    @scala.inline
    def `setPdl-init-file-entry-supported`(value: js.Array[String]): Self = this.set("pdl-init-file-entry-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-entry-supported`: Self = this.set("pdl-init-file-entry-supported", js.undefined)
    @scala.inline
    def `setPdl-init-file-location-supportedVarargs`(value: String*): Self = this.set("pdl-init-file-location-supported", js.Array(value :_*))
    @scala.inline
    def `setPdl-init-file-location-supported`(value: js.Array[String]): Self = this.set("pdl-init-file-location-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-location-supported`: Self = this.set("pdl-init-file-location-supported", js.undefined)
    @scala.inline
    def `setPdl-init-file-name-subdirectory-supported`(value: Boolean): Self = this.set("pdl-init-file-name-subdirectory-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-name-subdirectory-supported`: Self = this.set("pdl-init-file-name-subdirectory-supported", js.undefined)
    @scala.inline
    def `setPdl-init-file-name-supportedVarargs`(value: String*): Self = this.set("pdl-init-file-name-supported", js.Array(value :_*))
    @scala.inline
    def `setPdl-init-file-name-supported`(value: js.Array[String]): Self = this.set("pdl-init-file-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-name-supported`: Self = this.set("pdl-init-file-name-supported", js.undefined)
    @scala.inline
    def `setPdl-init-file-supportedVarargs`(value: (`pdl-init-file-entry` | `pdl-init-file-location` | `pdl-init-file-name`)*): Self = this.set("pdl-init-file-supported", js.Array(value :_*))
    @scala.inline
    def `setPdl-init-file-supported`(value: js.Array[`pdl-init-file-entry` | `pdl-init-file-location` | `pdl-init-file-name`]): Self = this.set("pdl-init-file-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-init-file-supported`: Self = this.set("pdl-init-file-supported", js.undefined)
    @scala.inline
    def `setPdl-override-guaranteed-supportedVarargs`(value: String*): Self = this.set("pdl-override-guaranteed-supported", js.Array(value :_*))
    @scala.inline
    def `setPdl-override-guaranteed-supported`(value: js.Array[String]): Self = this.set("pdl-override-guaranteed-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-override-guaranteed-supported`: Self = this.set("pdl-override-guaranteed-supported", js.undefined)
    @scala.inline
    def `setPdl-override-supported`(value: attempted | guaranteed | `not-attempted`): Self = this.set("pdl-override-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePdl-override-supported`: Self = this.set("pdl-override-supported", js.undefined)
    @scala.inline
    def `setPlatform-shape`(value: String): Self = this.set("platform-shape", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlatform-shape`: Self = this.set("platform-shape", js.undefined)
    @scala.inline
    def `setPlatform-temperature-default`(value: Double): Self = this.set("platform-temperature-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlatform-temperature-default`: Self = this.set("platform-temperature-default", js.undefined)
    @scala.inline
    def `setPlatform-temperature-supportedVarargs`(value: (Double | String)*): Self = this.set("platform-temperature-supported", js.Array(value :_*))
    @scala.inline
    def `setPlatform-temperature-supported`(value: js.Array[Double | String]): Self = this.set("platform-temperature-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlatform-temperature-supported`: Self = this.set("platform-temperature-supported", js.undefined)
    @scala.inline
    def `setPreferred-attributes-supported`(value: Boolean): Self = this.set("preferred-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePreferred-attributes-supported`: Self = this.set("preferred-attributes-supported", js.undefined)
    @scala.inline
    def `setPresentation-direction-number-up-default`(value: PresentationDirectionNumberUp): Self = this.set("presentation-direction-number-up-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePresentation-direction-number-up-default`: Self = this.set("presentation-direction-number-up-default", js.undefined)
    @scala.inline
    def `setPresentation-direction-number-up-supportedVarargs`(value: PresentationDirectionNumberUp*): Self = this.set("presentation-direction-number-up-supported", js.Array(value :_*))
    @scala.inline
    def `setPresentation-direction-number-up-supported`(value: js.Array[PresentationDirectionNumberUp]): Self = this.set("presentation-direction-number-up-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePresentation-direction-number-up-supported`: Self = this.set("presentation-direction-number-up-supported", js.undefined)
    @scala.inline
    def `setPrint-accuracy-supported`(value: PrintAccuracySupported): Self = this.set("print-accuracy-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-accuracy-supported`: Self = this.set("print-accuracy-supported", js.undefined)
    @scala.inline
    def `setPrint-base-default`(value: PrintBase): Self = this.set("print-base-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-base-default`: Self = this.set("print-base-default", js.undefined)
    @scala.inline
    def `setPrint-base-supportedVarargs`(value: PrintBase*): Self = this.set("print-base-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-base-supported`(value: js.Array[PrintBase]): Self = this.set("print-base-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-base-supported`: Self = this.set("print-base-supported", js.undefined)
    @scala.inline
    def `setPrint-color-mode-default`(value: PrintColorMode): Self = this.set("print-color-mode-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-color-mode-default`: Self = this.set("print-color-mode-default", js.undefined)
    @scala.inline
    def `setPrint-color-mode-supportedVarargs`(value: PrintColorMode*): Self = this.set("print-color-mode-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-color-mode-supported`(value: js.Array[PrintColorMode]): Self = this.set("print-color-mode-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-color-mode-supported`: Self = this.set("print-color-mode-supported", js.undefined)
    @scala.inline
    def `setPrint-content-optimize-default`(value: PrintContentOptimize): Self = this.set("print-content-optimize-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-content-optimize-default`: Self = this.set("print-content-optimize-default", js.undefined)
    @scala.inline
    def `setPrint-content-optimize-supportedVarargs`(value: PrintContentOptimize*): Self = this.set("print-content-optimize-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-content-optimize-supported`(value: js.Array[PrintContentOptimize]): Self = this.set("print-content-optimize-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-content-optimize-supported`: Self = this.set("print-content-optimize-supported", js.undefined)
    @scala.inline
    def `setPrint-objects-supportedVarargs`(value: (`document-number` | `object-offset` | `object-size` | `object-uuid`)*): Self = this.set("print-objects-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-objects-supported`(value: js.Array[`document-number` | `object-offset` | `object-size` | `object-uuid`]): Self = this.set("print-objects-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-objects-supported`: Self = this.set("print-objects-supported", js.undefined)
    @scala.inline
    def `setPrint-quality-default`(value: PrintQuality): Self = this.set("print-quality-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-quality-default`: Self = this.set("print-quality-default", js.undefined)
    @scala.inline
    def `setPrint-quality-supportedVarargs`(value: PrintQuality*): Self = this.set("print-quality-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-quality-supported`(value: js.Array[PrintQuality]): Self = this.set("print-quality-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-quality-supported`: Self = this.set("print-quality-supported", js.undefined)
    @scala.inline
    def `setPrint-rendering-intent-default`(value: PrintRenderingIntent): Self = this.set("print-rendering-intent-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-rendering-intent-default`: Self = this.set("print-rendering-intent-default", js.undefined)
    @scala.inline
    def `setPrint-rendering-intent-supportedVarargs`(value: PrintRenderingIntent*): Self = this.set("print-rendering-intent-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-rendering-intent-supported`(value: js.Array[PrintRenderingIntent]): Self = this.set("print-rendering-intent-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-rendering-intent-supported`: Self = this.set("print-rendering-intent-supported", js.undefined)
    @scala.inline
    def `setPrint-scaling-default`(value: PrintScaling): Self = this.set("print-scaling-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-scaling-default`: Self = this.set("print-scaling-default", js.undefined)
    @scala.inline
    def `setPrint-scaling-supportedVarargs`(value: PrintScaling*): Self = this.set("print-scaling-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-scaling-supported`(value: js.Array[PrintScaling]): Self = this.set("print-scaling-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-scaling-supported`: Self = this.set("print-scaling-supported", js.undefined)
    @scala.inline
    def `setPrint-supports-default`(value: PrintSupports): Self = this.set("print-supports-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-supports-default`: Self = this.set("print-supports-default", js.undefined)
    @scala.inline
    def `setPrint-supports-supportedVarargs`(value: PrintSupports*): Self = this.set("print-supports-supported", js.Array(value :_*))
    @scala.inline
    def `setPrint-supports-supported`(value: js.Array[PrintSupports]): Self = this.set("print-supports-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrint-supports-supported`: Self = this.set("print-supports-supported", js.undefined)
    @scala.inline
    def `setPrinter-camera-image-uriVarargs`(value: String*): Self = this.set("printer-camera-image-uri", js.Array(value :_*))
    @scala.inline
    def `setPrinter-camera-image-uri`(value: js.Array[String]): Self = this.set("printer-camera-image-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-camera-image-uri`: Self = this.set("printer-camera-image-uri", js.undefined)
    @scala.inline
    def `setPrinter-charge-info`(value: String): Self = this.set("printer-charge-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-charge-info`: Self = this.set("printer-charge-info", js.undefined)
    @scala.inline
    def `setPrinter-charge-info-uri`(value: String): Self = this.set("printer-charge-info-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-charge-info-uri`: Self = this.set("printer-charge-info-uri", js.undefined)
    @scala.inline
    def `setPrinter-contact-col`(value: PrinterContact): Self = this.set("printer-contact-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-contact-col`: Self = this.set("printer-contact-col", js.undefined)
    @scala.inline
    def `setPrinter-current-time`(value: String): Self = this.set("printer-current-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-current-time`: Self = this.set("printer-current-time", js.undefined)
    @scala.inline
    def `setPrinter-device-id`(value: String): Self = this.set("printer-device-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-device-id`: Self = this.set("printer-device-id", js.undefined)
    @scala.inline
    def `setPrinter-dns-sd-name`(value: String): Self = this.set("printer-dns-sd-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-dns-sd-name`: Self = this.set("printer-dns-sd-name", js.undefined)
    @scala.inline
    def `setPrinter-driver-installer`(value: String): Self = this.set("printer-driver-installer", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-driver-installer`: Self = this.set("printer-driver-installer", js.undefined)
    @scala.inline
    def `setPrinter-fax-log-uri`(value: String): Self = this.set("printer-fax-log-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-fax-log-uri`: Self = this.set("printer-fax-log-uri", js.undefined)
    @scala.inline
    def `setPrinter-fax-modem-infoVarargs`(value: String*): Self = this.set("printer-fax-modem-info", js.Array(value :_*))
    @scala.inline
    def `setPrinter-fax-modem-info`(value: js.Array[String]): Self = this.set("printer-fax-modem-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-fax-modem-info`: Self = this.set("printer-fax-modem-info", js.undefined)
    @scala.inline
    def `setPrinter-fax-modem-nameVarargs`(value: String*): Self = this.set("printer-fax-modem-name", js.Array(value :_*))
    @scala.inline
    def `setPrinter-fax-modem-name`(value: js.Array[String]): Self = this.set("printer-fax-modem-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-fax-modem-name`: Self = this.set("printer-fax-modem-name", js.undefined)
    @scala.inline
    def `setPrinter-fax-modem-numberVarargs`(value: String*): Self = this.set("printer-fax-modem-number", js.Array(value :_*))
    @scala.inline
    def `setPrinter-fax-modem-number`(value: js.Array[String]): Self = this.set("printer-fax-modem-number", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-fax-modem-number`: Self = this.set("printer-fax-modem-number", js.undefined)
    @scala.inline
    def `setPrinter-geo-location`(value: String): Self = this.set("printer-geo-location", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-geo-location`: Self = this.set("printer-geo-location", js.undefined)
    @scala.inline
    def `setPrinter-get-attributes-supportedVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any)*
    ): Self = this.set("printer-get-attributes-supported", js.Array(value :_*))
    @scala.inline
    def `setPrinter-get-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
        ]
    ): Self = this.set("printer-get-attributes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-get-attributes-supported`: Self = this.set("printer-get-attributes-supported", js.undefined)
    @scala.inline
    def `setPrinter-icc-profilesVarargs`(value: PrinterIccProfiles*): Self = this.set("printer-icc-profiles", js.Array(value :_*))
    @scala.inline
    def `setPrinter-icc-profiles`(value: js.Array[PrinterIccProfiles]): Self = this.set("printer-icc-profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-icc-profiles`: Self = this.set("printer-icc-profiles", js.undefined)
    @scala.inline
    def `setPrinter-iconsVarargs`(value: String*): Self = this.set("printer-icons", js.Array(value :_*))
    @scala.inline
    def `setPrinter-icons`(value: js.Array[String]): Self = this.set("printer-icons", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-icons`: Self = this.set("printer-icons", js.undefined)
    @scala.inline
    def `setPrinter-info`(value: String): Self = this.set("printer-info", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-info`: Self = this.set("printer-info", js.undefined)
    @scala.inline
    def `setPrinter-kindVarargs`(value: PrinterKind*): Self = this.set("printer-kind", js.Array(value :_*))
    @scala.inline
    def `setPrinter-kind`(value: js.Array[PrinterKind]): Self = this.set("printer-kind", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-kind`: Self = this.set("printer-kind", js.undefined)
    @scala.inline
    def `setPrinter-location`(value: String): Self = this.set("printer-location", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-location`: Self = this.set("printer-location", js.undefined)
    @scala.inline
    def `setPrinter-make-and-model`(value: String): Self = this.set("printer-make-and-model", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-make-and-model`: Self = this.set("printer-make-and-model", js.undefined)
    @scala.inline
    def `setPrinter-mandatory-job-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any)*
    ): Self = this.set("printer-mandatory-job-attributes", js.Array(value :_*))
    @scala.inline
    def `setPrinter-mandatory-job-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
        ]
    ): Self = this.set("printer-mandatory-job-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-mandatory-job-attributes`: Self = this.set("printer-mandatory-job-attributes", js.undefined)
    @scala.inline
    def `setPrinter-more-info-manufacturer`(value: String): Self = this.set("printer-more-info-manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-more-info-manufacturer`: Self = this.set("printer-more-info-manufacturer", js.undefined)
    @scala.inline
    def `setPrinter-name`(value: String): Self = this.set("printer-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-name`: Self = this.set("printer-name", js.undefined)
    @scala.inline
    def `setPrinter-organizationVarargs`(value: String*): Self = this.set("printer-organization", js.Array(value :_*))
    @scala.inline
    def `setPrinter-organization`(value: js.Array[String]): Self = this.set("printer-organization", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-organization`: Self = this.set("printer-organization", js.undefined)
    @scala.inline
    def `setPrinter-organizational-unitVarargs`(value: String*): Self = this.set("printer-organizational-unit", js.Array(value :_*))
    @scala.inline
    def `setPrinter-organizational-unit`(value: js.Array[String]): Self = this.set("printer-organizational-unit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-organizational-unit`: Self = this.set("printer-organizational-unit", js.undefined)
    @scala.inline
    def `setPrinter-privacy-policy-uri`(value: String): Self = this.set("printer-privacy-policy-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-privacy-policy-uri`: Self = this.set("printer-privacy-policy-uri", js.undefined)
    @scala.inline
    def `setPrinter-resolution-default`(value: Resolution): Self = this.set("printer-resolution-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-resolution-default`: Self = this.set("printer-resolution-default", js.undefined)
    @scala.inline
    def `setPrinter-resolution-supported`(value: Resolution): Self = this.set("printer-resolution-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-resolution-supported`: Self = this.set("printer-resolution-supported", js.undefined)
    @scala.inline
    def `setPrinter-static-resource-directory-uri`(value: String): Self = this.set("printer-static-resource-directory-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-static-resource-directory-uri`: Self = this.set("printer-static-resource-directory-uri", js.undefined)
    @scala.inline
    def `setPrinter-static-resource-k-octets-supported`(value: Double): Self = this.set("printer-static-resource-k-octets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-static-resource-k-octets-supported`: Self = this.set("printer-static-resource-k-octets-supported", js.undefined)
    @scala.inline
    def `setPrinter-strings-languages-supportedVarargs`(value: String*): Self = this.set("printer-strings-languages-supported", js.Array(value :_*))
    @scala.inline
    def `setPrinter-strings-languages-supported`(value: js.Array[String]): Self = this.set("printer-strings-languages-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-strings-languages-supported`: Self = this.set("printer-strings-languages-supported", js.undefined)
    @scala.inline
    def `setPrinter-strings-uri`(value: String): Self = this.set("printer-strings-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-strings-uri`: Self = this.set("printer-strings-uri", js.undefined)
    @scala.inline
    def `setPrinter-volume-supported`(value: PrinterVolumeSupported): Self = this.set("printer-volume-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-volume-supported`: Self = this.set("printer-volume-supported", js.undefined)
    @scala.inline
    def `setPrinter-xri-supportedVarargs`(value: PrinterXri*): Self = this.set("printer-xri-supported", js.Array(value :_*))
    @scala.inline
    def `setPrinter-xri-supported`(value: js.Array[PrinterXri]): Self = this.set("printer-xri-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-xri-supported`: Self = this.set("printer-xri-supported", js.undefined)
    @scala.inline
    def `setProof-print-default`(value: ProofPrint): Self = this.set("proof-print-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProof-print-default`: Self = this.set("proof-print-default", js.undefined)
    @scala.inline
    def `setProof-print-supportedVarargs`(value: (media | `media-col` | `proof-print-copies`)*): Self = this.set("proof-print-supported", js.Array(value :_*))
    @scala.inline
    def `setProof-print-supported`(value: js.Array[media | `media-col` | `proof-print-copies`]): Self = this.set("proof-print-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProof-print-supported`: Self = this.set("proof-print-supported", js.undefined)
    @scala.inline
    def `setPunching-hole-diameter-configured`(value: Double): Self = this.set("punching-hole-diameter-configured", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePunching-hole-diameter-configured`: Self = this.set("punching-hole-diameter-configured", js.undefined)
    @scala.inline
    def `setPunching-locations-supportedVarargs`(value: (Double | String)*): Self = this.set("punching-locations-supported", js.Array(value :_*))
    @scala.inline
    def `setPunching-locations-supported`(value: js.Array[Double | String]): Self = this.set("punching-locations-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePunching-locations-supported`: Self = this.set("punching-locations-supported", js.undefined)
    @scala.inline
    def `setPunching-offset-supportedVarargs`(value: (Double | String)*): Self = this.set("punching-offset-supported", js.Array(value :_*))
    @scala.inline
    def `setPunching-offset-supported`(value: js.Array[Double | String]): Self = this.set("punching-offset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePunching-offset-supported`: Self = this.set("punching-offset-supported", js.undefined)
    @scala.inline
    def `setPunching-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = this.set("punching-reference-edge-supported", js.Array(value :_*))
    @scala.inline
    def `setPunching-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = this.set("punching-reference-edge-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePunching-reference-edge-supported`: Self = this.set("punching-reference-edge-supported", js.undefined)
    @scala.inline
    def `setPwg-raster-document-resolution-supportedVarargs`(value: Resolution*): Self = this.set("pwg-raster-document-resolution-supported", js.Array(value :_*))
    @scala.inline
    def `setPwg-raster-document-resolution-supported`(value: js.Array[Resolution]): Self = this.set("pwg-raster-document-resolution-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePwg-raster-document-resolution-supported`: Self = this.set("pwg-raster-document-resolution-supported", js.undefined)
    @scala.inline
    def `setPwg-raster-document-sheet-back`(value: flipped | `manual-tumble` | normal | rotated): Self = this.set("pwg-raster-document-sheet-back", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePwg-raster-document-sheet-back`: Self = this.set("pwg-raster-document-sheet-back", js.undefined)
    @scala.inline
    def `setPwg-raster-document-type-supportedVarargs`(value: PwgRasterDocumentTypeSupported*): Self = this.set("pwg-raster-document-type-supported", js.Array(value :_*))
    @scala.inline
    def `setPwg-raster-document-type-supported`(value: js.Array[PwgRasterDocumentTypeSupported]): Self = this.set("pwg-raster-document-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePwg-raster-document-type-supported`: Self = this.set("pwg-raster-document-type-supported", js.undefined)
    @scala.inline
    def `setPwg-safe-gcode-supportedVarargs`(value: String*): Self = this.set("pwg-safe-gcode-supported", js.Array(value :_*))
    @scala.inline
    def `setPwg-safe-gcode-supported`(value: js.Array[String]): Self = this.set("pwg-safe-gcode-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePwg-safe-gcode-supported`: Self = this.set("pwg-safe-gcode-supported", js.undefined)
    @scala.inline
    def `setReference-uri-schemes-supportedVarargs`(value: UriSchemes*): Self = this.set("reference-uri-schemes-supported", js.Array(value :_*))
    @scala.inline
    def `setReference-uri-schemes-supported`(value: js.Array[UriSchemes]): Self = this.set("reference-uri-schemes-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReference-uri-schemes-supported`: Self = this.set("reference-uri-schemes-supported", js.undefined)
    @scala.inline
    def `setRepertoire-supportedVarargs`(value: String*): Self = this.set("repertoire-supported", js.Array(value :_*))
    @scala.inline
    def `setRepertoire-supported`(value: js.Array[String]): Self = this.set("repertoire-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRepertoire-supported`: Self = this.set("repertoire-supported", js.undefined)
    @scala.inline
    def `setRequesting-user-uri-supported`(value: Boolean): Self = this.set("requesting-user-uri-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequesting-user-uri-supported`: Self = this.set("requesting-user-uri-supported", js.undefined)
    @scala.inline
    def `setRetry-interval-default`(value: Double): Self = this.set("retry-interval-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-interval-default`: Self = this.set("retry-interval-default", js.undefined)
    @scala.inline
    def `setRetry-interval-supported`(value: String): Self = this.set("retry-interval-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-interval-supported`: Self = this.set("retry-interval-supported", js.undefined)
    @scala.inline
    def `setRetry-time-out-default`(value: Double): Self = this.set("retry-time-out-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-time-out-default`: Self = this.set("retry-time-out-default", js.undefined)
    @scala.inline
    def `setRetry-time-out-supported`(value: String): Self = this.set("retry-time-out-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-time-out-supported`: Self = this.set("retry-time-out-supported", js.undefined)
    @scala.inline
    def `setSave-disposition-supportedVarargs`(value: SaveDisposition*): Self = this.set("save-disposition-supported", js.Array(value :_*))
    @scala.inline
    def `setSave-disposition-supported`(value: js.Array[SaveDisposition]): Self = this.set("save-disposition-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-disposition-supported`: Self = this.set("save-disposition-supported", js.undefined)
    @scala.inline
    def `setSave-document-format-default`(value: MimeMediaType): Self = this.set("save-document-format-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-document-format-default`: Self = this.set("save-document-format-default", js.undefined)
    @scala.inline
    def `setSave-document-format-supportedVarargs`(value: MimeMediaType*): Self = this.set("save-document-format-supported", js.Array(value :_*))
    @scala.inline
    def `setSave-document-format-supported`(value: js.Array[MimeMediaType]): Self = this.set("save-document-format-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-document-format-supported`: Self = this.set("save-document-format-supported", js.undefined)
    @scala.inline
    def `setSave-location-default`(value: String): Self = this.set("save-location-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-location-default`: Self = this.set("save-location-default", js.undefined)
    @scala.inline
    def `setSave-location-supportedVarargs`(value: String*): Self = this.set("save-location-supported", js.Array(value :_*))
    @scala.inline
    def `setSave-location-supported`(value: js.Array[String]): Self = this.set("save-location-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-location-supported`: Self = this.set("save-location-supported", js.undefined)
    @scala.inline
    def `setSave-name-subdirectory-supported`(value: Boolean): Self = this.set("save-name-subdirectory-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-name-subdirectory-supported`: Self = this.set("save-name-subdirectory-supported", js.undefined)
    @scala.inline
    def `setSave-name-supported`(value: Boolean): Self = this.set("save-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-name-supported`: Self = this.set("save-name-supported", js.undefined)
    @scala.inline
    def `setSeparator-sheets-default`(value: SeparatorSheets): Self = this.set("separator-sheets-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSeparator-sheets-default`: Self = this.set("separator-sheets-default", js.undefined)
    @scala.inline
    def `setSeparator-sheets-supportedVarargs`(value: SeparatorSheetsType*): Self = this.set("separator-sheets-supported", js.Array(value :_*))
    @scala.inline
    def `setSeparator-sheets-supported`(value: js.Array[SeparatorSheetsType]): Self = this.set("separator-sheets-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSeparator-sheets-supported`: Self = this.set("separator-sheets-supported", js.undefined)
    @scala.inline
    def `setSides-default`(value: Sides): Self = this.set("sides-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSides-default`: Self = this.set("sides-default", js.undefined)
    @scala.inline
    def `setSides-supportedVarargs`(value: Sides*): Self = this.set("sides-supported", js.Array(value :_*))
    @scala.inline
    def `setSides-supported`(value: js.Array[Sides]): Self = this.set("sides-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSides-supported`: Self = this.set("sides-supported", js.undefined)
    @scala.inline
    def `setSmi2699-auth-print-group`(value: String): Self = this.set("smi2699-auth-print-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmi2699-auth-print-group`: Self = this.set("smi2699-auth-print-group", js.undefined)
    @scala.inline
    def `setSmi2699-auth-proxy-group`(value: String): Self = this.set("smi2699-auth-proxy-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmi2699-auth-proxy-group`: Self = this.set("smi2699-auth-proxy-group", js.undefined)
    @scala.inline
    def `setSmi2699-device-command`(value: String): Self = this.set("smi2699-device-command", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmi2699-device-command`: Self = this.set("smi2699-device-command", js.undefined)
    @scala.inline
    def `setSmi2699-device-format`(value: MimeMediaType): Self = this.set("smi2699-device-format", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmi2699-device-format`: Self = this.set("smi2699-device-format", js.undefined)
    @scala.inline
    def `setSmi2699-device-name`(value: String): Self = this.set("smi2699-device-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmi2699-device-name`: Self = this.set("smi2699-device-name", js.undefined)
    @scala.inline
    def `setSmi2699-device-uri`(value: String): Self = this.set("smi2699-device-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSmi2699-device-uri`: Self = this.set("smi2699-device-uri", js.undefined)
    @scala.inline
    def `setStitching-angle-supportedVarargs`(value: (Double | String)*): Self = this.set("stitching-angle-supported", js.Array(value :_*))
    @scala.inline
    def `setStitching-angle-supported`(value: js.Array[Double | String]): Self = this.set("stitching-angle-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-angle-supported`: Self = this.set("stitching-angle-supported", js.undefined)
    @scala.inline
    def `setStitching-locations-supportedVarargs`(value: (Double | String)*): Self = this.set("stitching-locations-supported", js.Array(value :_*))
    @scala.inline
    def `setStitching-locations-supported`(value: js.Array[Double | String]): Self = this.set("stitching-locations-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-locations-supported`: Self = this.set("stitching-locations-supported", js.undefined)
    @scala.inline
    def `setStitching-method-supportedVarargs`(value: StitchingMethod*): Self = this.set("stitching-method-supported", js.Array(value :_*))
    @scala.inline
    def `setStitching-method-supported`(value: js.Array[StitchingMethod]): Self = this.set("stitching-method-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-method-supported`: Self = this.set("stitching-method-supported", js.undefined)
    @scala.inline
    def `setStitching-offset-supportedVarargs`(value: (Double | String)*): Self = this.set("stitching-offset-supported", js.Array(value :_*))
    @scala.inline
    def `setStitching-offset-supported`(value: js.Array[Double | String]): Self = this.set("stitching-offset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-offset-supported`: Self = this.set("stitching-offset-supported", js.undefined)
    @scala.inline
    def `setStitching-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = this.set("stitching-reference-edge-supported", js.Array(value :_*))
    @scala.inline
    def `setStitching-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = this.set("stitching-reference-edge-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-reference-edge-supported`: Self = this.set("stitching-reference-edge-supported", js.undefined)
    @scala.inline
    def `setSubject-supported`(value: Double): Self = this.set("subject-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSubject-supported`: Self = this.set("subject-supported", js.undefined)
    @scala.inline
    def `setSubordinate-printers-supportedVarargs`(value: String*): Self = this.set("subordinate-printers-supported", js.Array(value :_*))
    @scala.inline
    def `setSubordinate-printers-supported`(value: js.Array[String]): Self = this.set("subordinate-printers-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSubordinate-printers-supported`: Self = this.set("subordinate-printers-supported", js.undefined)
    @scala.inline
    def `setSubscription-privacy-attributesVarargs`(value: String*): Self = this.set("subscription-privacy-attributes", js.Array(value :_*))
    @scala.inline
    def `setSubscription-privacy-attributes`(value: js.Array[String]): Self = this.set("subscription-privacy-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSubscription-privacy-attributes`: Self = this.set("subscription-privacy-attributes", js.undefined)
    @scala.inline
    def `setSubscription-privacy-scope`(value: String): Self = this.set("subscription-privacy-scope", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSubscription-privacy-scope`: Self = this.set("subscription-privacy-scope", js.undefined)
    @scala.inline
    def `setTo-name-supported`(value: Double): Self = this.set("to-name-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTo-name-supported`: Self = this.set("to-name-supported", js.undefined)
    @scala.inline
    def `setTrimming-offset-supportedVarargs`(value: (Double | String)*): Self = this.set("trimming-offset-supported", js.Array(value :_*))
    @scala.inline
    def `setTrimming-offset-supported`(value: js.Array[Double | String]): Self = this.set("trimming-offset-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrimming-offset-supported`: Self = this.set("trimming-offset-supported", js.undefined)
    @scala.inline
    def `setTrimming-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = this.set("trimming-reference-edge-supported", js.Array(value :_*))
    @scala.inline
    def `setTrimming-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = this.set("trimming-reference-edge-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrimming-reference-edge-supported`: Self = this.set("trimming-reference-edge-supported", js.undefined)
    @scala.inline
    def `setTrimming-type-supportedVarargs`(value: TrimmingType*): Self = this.set("trimming-type-supported", js.Array(value :_*))
    @scala.inline
    def `setTrimming-type-supported`(value: js.Array[TrimmingType]): Self = this.set("trimming-type-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrimming-type-supported`: Self = this.set("trimming-type-supported", js.undefined)
    @scala.inline
    def `setTrimming-when-supportedVarargs`(value: String*): Self = this.set("trimming-when-supported", js.Array(value :_*))
    @scala.inline
    def `setTrimming-when-supported`(value: js.Array[String]): Self = this.set("trimming-when-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrimming-when-supported`: Self = this.set("trimming-when-supported", js.undefined)
    @scala.inline
    def `setUri-authentication-supportedVarargs`(value: (basic | certificate | digest | negotiate | none | `requesting-user-name`)*): Self = this.set("uri-authentication-supported", js.Array(value :_*))
    @scala.inline
    def `setUri-authentication-supported`(value: js.Array[basic | certificate | digest | negotiate | none | `requesting-user-name`]): Self = this.set("uri-authentication-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUri-authentication-supported`: Self = this.set("uri-authentication-supported", js.undefined)
    @scala.inline
    def `setUri-security-supportedVarargs`(value: (none | ssl3 | tls)*): Self = this.set("uri-security-supported", js.Array(value :_*))
    @scala.inline
    def `setUri-security-supported`(value: js.Array[none | ssl3 | tls]): Self = this.set("uri-security-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUri-security-supported`: Self = this.set("uri-security-supported", js.undefined)
    @scala.inline
    def `setUser-defined-values-supportedVarargs`(value: String*): Self = this.set("user-defined-values-supported", js.Array(value :_*))
    @scala.inline
    def `setUser-defined-values-supported`(value: js.Array[String]): Self = this.set("user-defined-values-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-defined-values-supported`: Self = this.set("user-defined-values-supported", js.undefined)
    @scala.inline
    def `setWhich-jobs-supportedVarargs`(value: WhichJobs*): Self = this.set("which-jobs-supported", js.Array(value :_*))
    @scala.inline
    def `setWhich-jobs-supported`(value: js.Array[WhichJobs]): Self = this.set("which-jobs-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWhich-jobs-supported`: Self = this.set("which-jobs-supported", js.undefined)
    @scala.inline
    def `setX-image-position-default`(value: XImagePosition): Self = this.set("x-image-position-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-position-default`: Self = this.set("x-image-position-default", js.undefined)
    @scala.inline
    def `setX-image-position-supportedVarargs`(value: XImagePosition*): Self = this.set("x-image-position-supported", js.Array(value :_*))
    @scala.inline
    def `setX-image-position-supported`(value: js.Array[XImagePosition]): Self = this.set("x-image-position-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-position-supported`: Self = this.set("x-image-position-supported", js.undefined)
    @scala.inline
    def `setX-image-shift-default`(value: Double): Self = this.set("x-image-shift-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-shift-default`: Self = this.set("x-image-shift-default", js.undefined)
    @scala.inline
    def `setX-image-shift-supported`(value: String): Self = this.set("x-image-shift-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-image-shift-supported`: Self = this.set("x-image-shift-supported", js.undefined)
    @scala.inline
    def `setX-side1-image-shift-default`(value: Double): Self = this.set("x-side1-image-shift-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side1-image-shift-default`: Self = this.set("x-side1-image-shift-default", js.undefined)
    @scala.inline
    def `setX-side1-image-shift-supported`(value: String): Self = this.set("x-side1-image-shift-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side1-image-shift-supported`: Self = this.set("x-side1-image-shift-supported", js.undefined)
    @scala.inline
    def `setX-side2-image-shift-default`(value: Double): Self = this.set("x-side2-image-shift-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side2-image-shift-default`: Self = this.set("x-side2-image-shift-default", js.undefined)
    @scala.inline
    def `setX-side2-image-shift-supported`(value: String): Self = this.set("x-side2-image-shift-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-side2-image-shift-supported`: Self = this.set("x-side2-image-shift-supported", js.undefined)
    @scala.inline
    def `setY-image-position-default`(value: YImagePosition): Self = this.set("y-image-position-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-position-default`: Self = this.set("y-image-position-default", js.undefined)
    @scala.inline
    def `setY-image-position-supportedVarargs`(value: YImagePosition*): Self = this.set("y-image-position-supported", js.Array(value :_*))
    @scala.inline
    def `setY-image-position-supported`(value: js.Array[YImagePosition]): Self = this.set("y-image-position-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-position-supported`: Self = this.set("y-image-position-supported", js.undefined)
    @scala.inline
    def `setY-image-shift-default`(value: Double): Self = this.set("y-image-shift-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-shift-default`: Self = this.set("y-image-shift-default", js.undefined)
    @scala.inline
    def `setY-image-shift-supported`(value: String): Self = this.set("y-image-shift-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-image-shift-supported`: Self = this.set("y-image-shift-supported", js.undefined)
    @scala.inline
    def `setY-side1-image-shift-default`(value: Double): Self = this.set("y-side1-image-shift-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side1-image-shift-default`: Self = this.set("y-side1-image-shift-default", js.undefined)
    @scala.inline
    def `setY-side1-image-shift-supported`(value: String): Self = this.set("y-side1-image-shift-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side1-image-shift-supported`: Self = this.set("y-side1-image-shift-supported", js.undefined)
    @scala.inline
    def `setY-side2-image-shift-default`(value: Double): Self = this.set("y-side2-image-shift-default", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side2-image-shift-default`: Self = this.set("y-side2-image-shift-default", js.undefined)
    @scala.inline
    def `setY-side2-image-shift-supported`(value: String): Self = this.set("y-side2-image-shift-supported", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-side2-image-shift-supported`: Self = this.set("y-side2-image-shift-supported", js.undefined)
  }
  
}

