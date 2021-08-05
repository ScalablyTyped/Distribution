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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterDescription extends StObject {
  
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
object PrinterDescription {
  
  inline def apply(): PrinterDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterDescription]
  }
  
  extension [Self <: PrinterDescription](x: Self) {
    
    inline def `setAccuracy-units-supported`(value: js.Array[AccuracyUnits]): Self = StObject.set(x, "accuracy-units-supported", value.asInstanceOf[js.Any])
    
    inline def `setAccuracy-units-supportedUndefined`: Self = StObject.set(x, "accuracy-units-supported", js.undefined)
    
    inline def `setAccuracy-units-supportedVarargs`(value: AccuracyUnits*): Self = StObject.set(x, "accuracy-units-supported", js.Array(value :_*))
    
    inline def `setBaling-type-supported`(value: js.Array[BalingType]): Self = StObject.set(x, "baling-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setBaling-type-supportedUndefined`: Self = StObject.set(x, "baling-type-supported", js.undefined)
    
    inline def `setBaling-type-supportedVarargs`(value: BalingType*): Self = StObject.set(x, "baling-type-supported", js.Array(value :_*))
    
    inline def `setBaling-when-supported`(value: js.Array[BalingWhen]): Self = StObject.set(x, "baling-when-supported", value.asInstanceOf[js.Any])
    
    inline def `setBaling-when-supportedUndefined`: Self = StObject.set(x, "baling-when-supported", js.undefined)
    
    inline def `setBaling-when-supportedVarargs`(value: BalingWhen*): Self = StObject.set(x, "baling-when-supported", js.Array(value :_*))
    
    inline def `setBinding-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = StObject.set(x, "binding-reference-edge-supported", value.asInstanceOf[js.Any])
    
    inline def `setBinding-reference-edge-supportedUndefined`: Self = StObject.set(x, "binding-reference-edge-supported", js.undefined)
    
    inline def `setBinding-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = StObject.set(x, "binding-reference-edge-supported", js.Array(value :_*))
    
    inline def `setBinding-type-supported`(value: js.Array[BindingType]): Self = StObject.set(x, "binding-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setBinding-type-supportedUndefined`: Self = StObject.set(x, "binding-type-supported", js.undefined)
    
    inline def `setBinding-type-supportedVarargs`(value: BindingType*): Self = StObject.set(x, "binding-type-supported", js.Array(value :_*))
    
    inline def `setChamber-humidity-default`(value: Double): Self = StObject.set(x, "chamber-humidity-default", value.asInstanceOf[js.Any])
    
    inline def `setChamber-humidity-defaultUndefined`: Self = StObject.set(x, "chamber-humidity-default", js.undefined)
    
    inline def `setChamber-humidity-supported`(value: Boolean): Self = StObject.set(x, "chamber-humidity-supported", value.asInstanceOf[js.Any])
    
    inline def `setChamber-humidity-supportedUndefined`: Self = StObject.set(x, "chamber-humidity-supported", js.undefined)
    
    inline def `setChamber-temperature-default`(value: Double): Self = StObject.set(x, "chamber-temperature-default", value.asInstanceOf[js.Any])
    
    inline def `setChamber-temperature-defaultUndefined`: Self = StObject.set(x, "chamber-temperature-default", js.undefined)
    
    inline def `setChamber-temperature-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "chamber-temperature-supported", value.asInstanceOf[js.Any])
    
    inline def `setChamber-temperature-supportedUndefined`: Self = StObject.set(x, "chamber-temperature-supported", js.undefined)
    
    inline def `setChamber-temperature-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "chamber-temperature-supported", js.Array(value :_*))
    
    inline def `setCharset-configured`(value: String): Self = StObject.set(x, "charset-configured", value.asInstanceOf[js.Any])
    
    inline def `setCharset-configuredUndefined`: Self = StObject.set(x, "charset-configured", js.undefined)
    
    inline def `setCharset-supported`(value: js.Array[String]): Self = StObject.set(x, "charset-supported", value.asInstanceOf[js.Any])
    
    inline def `setCharset-supportedUndefined`: Self = StObject.set(x, "charset-supported", js.undefined)
    
    inline def `setCharset-supportedVarargs`(value: String*): Self = StObject.set(x, "charset-supported", js.Array(value :_*))
    
    inline def `setCoating-sides-supported`(value: js.Array[FinishingSides]): Self = StObject.set(x, "coating-sides-supported", value.asInstanceOf[js.Any])
    
    inline def `setCoating-sides-supportedUndefined`: Self = StObject.set(x, "coating-sides-supported", js.undefined)
    
    inline def `setCoating-sides-supportedVarargs`(value: FinishingSides*): Self = StObject.set(x, "coating-sides-supported", js.Array(value :_*))
    
    inline def `setCoating-type-supported`(value: js.Array[CoatingType]): Self = StObject.set(x, "coating-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setCoating-type-supportedUndefined`: Self = StObject.set(x, "coating-type-supported", js.undefined)
    
    inline def `setCoating-type-supportedVarargs`(value: CoatingType*): Self = StObject.set(x, "coating-type-supported", js.Array(value :_*))
    
    inline def `setColor-supported`(value: Boolean): Self = StObject.set(x, "color-supported", value.asInstanceOf[js.Any])
    
    inline def `setColor-supportedUndefined`: Self = StObject.set(x, "color-supported", js.undefined)
    
    inline def `setCompression-supported`(value: js.Array[Compression]): Self = StObject.set(x, "compression-supported", value.asInstanceOf[js.Any])
    
    inline def `setCompression-supportedUndefined`: Self = StObject.set(x, "compression-supported", js.undefined)
    
    inline def `setCompression-supportedVarargs`(value: Compression*): Self = StObject.set(x, "compression-supported", js.Array(value :_*))
    
    inline def `setConfirmation-sheet-print-default`(value: Boolean): Self = StObject.set(x, "confirmation-sheet-print-default", value.asInstanceOf[js.Any])
    
    inline def `setConfirmation-sheet-print-defaultUndefined`: Self = StObject.set(x, "confirmation-sheet-print-default", js.undefined)
    
    inline def `setCopies-default`(value: Double): Self = StObject.set(x, "copies-default", value.asInstanceOf[js.Any])
    
    inline def `setCopies-defaultUndefined`: Self = StObject.set(x, "copies-default", js.undefined)
    
    inline def `setCopies-supported`(value: js.Array[Double]): Self = StObject.set(x, "copies-supported", value.asInstanceOf[js.Any])
    
    inline def `setCopies-supportedUndefined`: Self = StObject.set(x, "copies-supported", js.undefined)
    
    inline def `setCopies-supportedVarargs`(value: Double*): Self = StObject.set(x, "copies-supported", js.Array(value :_*))
    
    inline def `setCover-back-default`(value: Cover): Self = StObject.set(x, "cover-back-default", value.asInstanceOf[js.Any])
    
    inline def `setCover-back-defaultUndefined`: Self = StObject.set(x, "cover-back-default", js.undefined)
    
    inline def `setCover-back-supported`(value: js.Array[String]): Self = StObject.set(x, "cover-back-supported", value.asInstanceOf[js.Any])
    
    inline def `setCover-back-supportedUndefined`: Self = StObject.set(x, "cover-back-supported", js.undefined)
    
    inline def `setCover-back-supportedVarargs`(value: String*): Self = StObject.set(x, "cover-back-supported", js.Array(value :_*))
    
    inline def `setCover-front-default`(value: Cover): Self = StObject.set(x, "cover-front-default", value.asInstanceOf[js.Any])
    
    inline def `setCover-front-defaultUndefined`: Self = StObject.set(x, "cover-front-default", js.undefined)
    
    inline def `setCover-front-supported`(value: js.Array[String]): Self = StObject.set(x, "cover-front-supported", value.asInstanceOf[js.Any])
    
    inline def `setCover-front-supportedUndefined`: Self = StObject.set(x, "cover-front-supported", js.undefined)
    
    inline def `setCover-front-supportedVarargs`(value: String*): Self = StObject.set(x, "cover-front-supported", js.Array(value :_*))
    
    inline def `setCover-sheet-info-default`(value: CoverSheetInfo): Self = StObject.set(x, "cover-sheet-info-default", value.asInstanceOf[js.Any])
    
    inline def `setCover-sheet-info-defaultUndefined`: Self = StObject.set(x, "cover-sheet-info-default", js.undefined)
    
    inline def `setCover-sheet-info-supported`(value: js.Array[String]): Self = StObject.set(x, "cover-sheet-info-supported", value.asInstanceOf[js.Any])
    
    inline def `setCover-sheet-info-supportedUndefined`: Self = StObject.set(x, "cover-sheet-info-supported", js.undefined)
    
    inline def `setCover-sheet-info-supportedVarargs`(value: String*): Self = StObject.set(x, "cover-sheet-info-supported", js.Array(value :_*))
    
    inline def `setCovering-name-supported`(value: js.Array[String]): Self = StObject.set(x, "covering-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setCovering-name-supportedUndefined`: Self = StObject.set(x, "covering-name-supported", js.undefined)
    
    inline def `setCovering-name-supportedVarargs`(value: String*): Self = StObject.set(x, "covering-name-supported", js.Array(value :_*))
    
    inline def `setDestination-accesses-supported`(value: js.Array[String]): Self = StObject.set(x, "destination-accesses-supported", value.asInstanceOf[js.Any])
    
    inline def `setDestination-accesses-supportedUndefined`: Self = StObject.set(x, "destination-accesses-supported", js.undefined)
    
    inline def `setDestination-accesses-supportedVarargs`(value: String*): Self = StObject.set(x, "destination-accesses-supported", js.Array(value :_*))
    
    inline def `setDestination-uri-ready`(value: js.Array[DestinationUriReady]): Self = StObject.set(x, "destination-uri-ready", value.asInstanceOf[js.Any])
    
    inline def `setDestination-uri-readyUndefined`: Self = StObject.set(x, "destination-uri-ready", js.undefined)
    
    inline def `setDestination-uri-readyVarargs`(value: DestinationUriReady*): Self = StObject.set(x, "destination-uri-ready", js.Array(value :_*))
    
    inline def `setDestination-uri-schemes-supported`(value: js.Array[UriSchemes]): Self = StObject.set(x, "destination-uri-schemes-supported", value.asInstanceOf[js.Any])
    
    inline def `setDestination-uri-schemes-supportedUndefined`: Self = StObject.set(x, "destination-uri-schemes-supported", js.undefined)
    
    inline def `setDestination-uri-schemes-supportedVarargs`(value: UriSchemes*): Self = StObject.set(x, "destination-uri-schemes-supported", js.Array(value :_*))
    
    inline def `setDestination-uris-supported`(value: js.Array[String]): Self = StObject.set(x, "destination-uris-supported", value.asInstanceOf[js.Any])
    
    inline def `setDestination-uris-supportedUndefined`: Self = StObject.set(x, "destination-uris-supported", js.undefined)
    
    inline def `setDestination-uris-supportedVarargs`(value: String*): Self = StObject.set(x, "destination-uris-supported", js.Array(value :_*))
    
    inline def `setDocument-access-supported`(value: js.Array[String]): Self = StObject.set(x, "document-access-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-access-supportedUndefined`: Self = StObject.set(x, "document-access-supported", js.undefined)
    
    inline def `setDocument-access-supportedVarargs`(value: String*): Self = StObject.set(x, "document-access-supported", js.Array(value :_*))
    
    inline def `setDocument-charset-default`(value: String): Self = StObject.set(x, "document-charset-default", value.asInstanceOf[js.Any])
    
    inline def `setDocument-charset-defaultUndefined`: Self = StObject.set(x, "document-charset-default", js.undefined)
    
    inline def `setDocument-charset-supported`(value: js.Array[String]): Self = StObject.set(x, "document-charset-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-charset-supportedUndefined`: Self = StObject.set(x, "document-charset-supported", js.undefined)
    
    inline def `setDocument-charset-supportedVarargs`(value: String*): Self = StObject.set(x, "document-charset-supported", js.Array(value :_*))
    
    inline def `setDocument-creation-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "document-creation-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-creation-attributes-supportedUndefined`: Self = StObject.set(x, "document-creation-attributes-supported", js.undefined)
    
    inline def `setDocument-creation-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "document-creation-attributes-supported", js.Array(value :_*))
    
    inline def `setDocument-digital-signature-default`(value: DocumentDigitalSignature): Self = StObject.set(x, "document-digital-signature-default", value.asInstanceOf[js.Any])
    
    inline def `setDocument-digital-signature-defaultUndefined`: Self = StObject.set(x, "document-digital-signature-default", js.undefined)
    
    inline def `setDocument-digital-signature-supported`(value: js.Array[DocumentDigitalSignature]): Self = StObject.set(x, "document-digital-signature-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-digital-signature-supportedUndefined`: Self = StObject.set(x, "document-digital-signature-supported", js.undefined)
    
    inline def `setDocument-digital-signature-supportedVarargs`(value: DocumentDigitalSignature*): Self = StObject.set(x, "document-digital-signature-supported", js.Array(value :_*))
    
    inline def `setDocument-format-default`(value: MimeMediaType): Self = StObject.set(x, "document-format-default", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-defaultUndefined`: Self = StObject.set(x, "document-format-default", js.undefined)
    
    inline def `setDocument-format-details-default`(value: DocumentFormatDetails): Self = StObject.set(x, "document-format-details-default", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-details-defaultUndefined`: Self = StObject.set(x, "document-format-details-default", js.undefined)
    
    inline def `setDocument-format-details-supported`(value: js.Array[String]): Self = StObject.set(x, "document-format-details-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-details-supportedUndefined`: Self = StObject.set(x, "document-format-details-supported", js.undefined)
    
    inline def `setDocument-format-details-supportedVarargs`(value: String*): Self = StObject.set(x, "document-format-details-supported", js.Array(value :_*))
    
    inline def `setDocument-format-supported`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "document-format-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-supportedUndefined`: Self = StObject.set(x, "document-format-supported", js.undefined)
    
    inline def `setDocument-format-supportedVarargs`(value: MimeMediaType*): Self = StObject.set(x, "document-format-supported", js.Array(value :_*))
    
    inline def `setDocument-format-version-default`(value: String): Self = StObject.set(x, "document-format-version-default", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-version-defaultUndefined`: Self = StObject.set(x, "document-format-version-default", js.undefined)
    
    inline def `setDocument-format-version-supported`(value: js.Array[String]): Self = StObject.set(x, "document-format-version-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-format-version-supportedUndefined`: Self = StObject.set(x, "document-format-version-supported", js.undefined)
    
    inline def `setDocument-format-version-supportedVarargs`(value: String*): Self = StObject.set(x, "document-format-version-supported", js.Array(value :_*))
    
    inline def `setDocument-natural-language-default`(value: String): Self = StObject.set(x, "document-natural-language-default", value.asInstanceOf[js.Any])
    
    inline def `setDocument-natural-language-defaultUndefined`: Self = StObject.set(x, "document-natural-language-default", js.undefined)
    
    inline def `setDocument-natural-language-supported`(value: js.Array[String]): Self = StObject.set(x, "document-natural-language-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-natural-language-supportedUndefined`: Self = StObject.set(x, "document-natural-language-supported", js.undefined)
    
    inline def `setDocument-natural-language-supportedVarargs`(value: String*): Self = StObject.set(x, "document-natural-language-supported", js.Array(value :_*))
    
    inline def `setDocument-password-supported`(value: Double): Self = StObject.set(x, "document-password-supported", value.asInstanceOf[js.Any])
    
    inline def `setDocument-password-supportedUndefined`: Self = StObject.set(x, "document-password-supported", js.undefined)
    
    inline def `setDocument-privacy-attributes`(value: js.Array[String]): Self = StObject.set(x, "document-privacy-attributes", value.asInstanceOf[js.Any])
    
    inline def `setDocument-privacy-attributesUndefined`: Self = StObject.set(x, "document-privacy-attributes", js.undefined)
    
    inline def `setDocument-privacy-attributesVarargs`(value: String*): Self = StObject.set(x, "document-privacy-attributes", js.Array(value :_*))
    
    inline def `setDocument-privacy-scope`(value: all | default | none | owner): Self = StObject.set(x, "document-privacy-scope", value.asInstanceOf[js.Any])
    
    inline def `setDocument-privacy-scopeUndefined`: Self = StObject.set(x, "document-privacy-scope", js.undefined)
    
    inline def `setFeed-orientation-default`(value: FeedOrientation): Self = StObject.set(x, "feed-orientation-default", value.asInstanceOf[js.Any])
    
    inline def `setFeed-orientation-defaultUndefined`: Self = StObject.set(x, "feed-orientation-default", js.undefined)
    
    inline def `setFeed-orientation-supported`(value: js.Array[FeedOrientation]): Self = StObject.set(x, "feed-orientation-supported", value.asInstanceOf[js.Any])
    
    inline def `setFeed-orientation-supportedUndefined`: Self = StObject.set(x, "feed-orientation-supported", js.undefined)
    
    inline def `setFeed-orientation-supportedVarargs`(value: FeedOrientation*): Self = StObject.set(x, "feed-orientation-supported", js.Array(value :_*))
    
    inline def `setFetch-document-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "fetch-document-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setFetch-document-attributes-supportedUndefined`: Self = StObject.set(x, "fetch-document-attributes-supported", js.undefined)
    
    inline def `setFetch-document-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "fetch-document-attributes-supported", js.Array(value :_*))
    
    inline def `setFinishing-template-supported`(value: js.Array[Finishings]): Self = StObject.set(x, "finishing-template-supported", value.asInstanceOf[js.Any])
    
    inline def `setFinishing-template-supportedUndefined`: Self = StObject.set(x, "finishing-template-supported", js.undefined)
    
    inline def `setFinishing-template-supportedVarargs`(value: Finishings*): Self = StObject.set(x, "finishing-template-supported", js.Array(value :_*))
    
    inline def `setFinishings-col-database`(value: js.Array[FinishingsInterface]): Self = StObject.set(x, "finishings-col-database", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-col-databaseUndefined`: Self = StObject.set(x, "finishings-col-database", js.undefined)
    
    inline def `setFinishings-col-databaseVarargs`(value: FinishingsInterface*): Self = StObject.set(x, "finishings-col-database", js.Array(value :_*))
    
    inline def `setFinishings-col-default`(value: FinishingsInterface): Self = StObject.set(x, "finishings-col-default", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-col-defaultUndefined`: Self = StObject.set(x, "finishings-col-default", js.undefined)
    
    inline def `setFinishings-col-ready`(value: js.Array[FinishingsInterface]): Self = StObject.set(x, "finishings-col-ready", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-col-readyUndefined`: Self = StObject.set(x, "finishings-col-ready", js.undefined)
    
    inline def `setFinishings-col-readyVarargs`(value: FinishingsInterface*): Self = StObject.set(x, "finishings-col-ready", js.Array(value :_*))
    
    inline def `setFinishings-col-supported`(
      value: js.Array[
          baling | binding | coating | covering | `finishing-template` | folding | `imposition-template` | laminating | `media-sheets-supported` | `media-size` | `media-size-name` | punching | stitching | trimming
        ]
    ): Self = StObject.set(x, "finishings-col-supported", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-col-supportedUndefined`: Self = StObject.set(x, "finishings-col-supported", js.undefined)
    
    inline def `setFinishings-col-supportedVarargs`(
      value: (baling | binding | coating | covering | `finishing-template` | folding | `imposition-template` | laminating | `media-sheets-supported` | `media-size` | `media-size-name` | punching | stitching | trimming)*
    ): Self = StObject.set(x, "finishings-col-supported", js.Array(value :_*))
    
    inline def `setFinishings-default`(value: js.Array[Finishings]): Self = StObject.set(x, "finishings-default", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-defaultUndefined`: Self = StObject.set(x, "finishings-default", js.undefined)
    
    inline def `setFinishings-defaultVarargs`(value: Finishings*): Self = StObject.set(x, "finishings-default", js.Array(value :_*))
    
    inline def `setFinishings-ready`(value: js.Array[Finishings]): Self = StObject.set(x, "finishings-ready", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-readyUndefined`: Self = StObject.set(x, "finishings-ready", js.undefined)
    
    inline def `setFinishings-readyVarargs`(value: Finishings*): Self = StObject.set(x, "finishings-ready", js.Array(value :_*))
    
    inline def `setFinishings-supported`(value: js.Array[Finishings]): Self = StObject.set(x, "finishings-supported", value.asInstanceOf[js.Any])
    
    inline def `setFinishings-supportedUndefined`: Self = StObject.set(x, "finishings-supported", js.undefined)
    
    inline def `setFinishings-supportedVarargs`(value: Finishings*): Self = StObject.set(x, "finishings-supported", js.Array(value :_*))
    
    inline def `setFolding-direction-supported`(value: js.Array[FoldingDirection]): Self = StObject.set(x, "folding-direction-supported", value.asInstanceOf[js.Any])
    
    inline def `setFolding-direction-supportedUndefined`: Self = StObject.set(x, "folding-direction-supported", js.undefined)
    
    inline def `setFolding-direction-supportedVarargs`(value: FoldingDirection*): Self = StObject.set(x, "folding-direction-supported", js.Array(value :_*))
    
    inline def `setFolding-offset-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "folding-offset-supported", value.asInstanceOf[js.Any])
    
    inline def `setFolding-offset-supportedUndefined`: Self = StObject.set(x, "folding-offset-supported", js.undefined)
    
    inline def `setFolding-offset-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "folding-offset-supported", js.Array(value :_*))
    
    inline def `setFolding-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = StObject.set(x, "folding-reference-edge-supported", value.asInstanceOf[js.Any])
    
    inline def `setFolding-reference-edge-supportedUndefined`: Self = StObject.set(x, "folding-reference-edge-supported", js.undefined)
    
    inline def `setFolding-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = StObject.set(x, "folding-reference-edge-supported", js.Array(value :_*))
    
    inline def `setFont-name-requested-default`(value: String): Self = StObject.set(x, "font-name-requested-default", value.asInstanceOf[js.Any])
    
    inline def `setFont-name-requested-defaultUndefined`: Self = StObject.set(x, "font-name-requested-default", js.undefined)
    
    inline def `setFont-name-requested-supported`(value: js.Array[String]): Self = StObject.set(x, "font-name-requested-supported", value.asInstanceOf[js.Any])
    
    inline def `setFont-name-requested-supportedUndefined`: Self = StObject.set(x, "font-name-requested-supported", js.undefined)
    
    inline def `setFont-name-requested-supportedVarargs`(value: String*): Self = StObject.set(x, "font-name-requested-supported", js.Array(value :_*))
    
    inline def `setFont-size-requested-default`(value: Double): Self = StObject.set(x, "font-size-requested-default", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-requested-defaultUndefined`: Self = StObject.set(x, "font-size-requested-default", js.undefined)
    
    inline def `setFont-size-requested-supported`(value: js.Array[String]): Self = StObject.set(x, "font-size-requested-supported", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-requested-supportedUndefined`: Self = StObject.set(x, "font-size-requested-supported", js.undefined)
    
    inline def `setFont-size-requested-supportedVarargs`(value: String*): Self = StObject.set(x, "font-size-requested-supported", js.Array(value :_*))
    
    inline def `setFrom-name-supported`(value: Double): Self = StObject.set(x, "from-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setFrom-name-supportedUndefined`: Self = StObject.set(x, "from-name-supported", js.undefined)
    
    inline def `setGenerated-natural-language-supported`(value: js.Array[String]): Self = StObject.set(x, "generated-natural-language-supported", value.asInstanceOf[js.Any])
    
    inline def `setGenerated-natural-language-supportedUndefined`: Self = StObject.set(x, "generated-natural-language-supported", js.undefined)
    
    inline def `setGenerated-natural-language-supportedVarargs`(value: String*): Self = StObject.set(x, "generated-natural-language-supported", js.Array(value :_*))
    
    inline def `setIdentify-actions-default`(value: js.Array[IdentifyActions]): Self = StObject.set(x, "identify-actions-default", value.asInstanceOf[js.Any])
    
    inline def `setIdentify-actions-defaultUndefined`: Self = StObject.set(x, "identify-actions-default", js.undefined)
    
    inline def `setIdentify-actions-defaultVarargs`(value: IdentifyActions*): Self = StObject.set(x, "identify-actions-default", js.Array(value :_*))
    
    inline def `setIdentify-actions-supported`(value: js.Array[IdentifyActions]): Self = StObject.set(x, "identify-actions-supported", value.asInstanceOf[js.Any])
    
    inline def `setIdentify-actions-supportedUndefined`: Self = StObject.set(x, "identify-actions-supported", js.undefined)
    
    inline def `setIdentify-actions-supportedVarargs`(value: IdentifyActions*): Self = StObject.set(x, "identify-actions-supported", js.Array(value :_*))
    
    inline def `setImposition-template-default`(value: ImpositionTemplate): Self = StObject.set(x, "imposition-template-default", value.asInstanceOf[js.Any])
    
    inline def `setImposition-template-defaultUndefined`: Self = StObject.set(x, "imposition-template-default", js.undefined)
    
    inline def `setImposition-template-supported`(value: js.Array[ImpositionTemplate]): Self = StObject.set(x, "imposition-template-supported", value.asInstanceOf[js.Any])
    
    inline def `setImposition-template-supportedUndefined`: Self = StObject.set(x, "imposition-template-supported", js.undefined)
    
    inline def `setImposition-template-supportedVarargs`(value: ImpositionTemplate*): Self = StObject.set(x, "imposition-template-supported", js.Array(value :_*))
    
    inline def `setInput-attributes-default`(value: InputAttributes): Self = StObject.set(x, "input-attributes-default", value.asInstanceOf[js.Any])
    
    inline def `setInput-attributes-defaultUndefined`: Self = StObject.set(x, "input-attributes-default", js.undefined)
    
    inline def `setInput-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "input-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-attributes-supportedUndefined`: Self = StObject.set(x, "input-attributes-supported", js.undefined)
    
    inline def `setInput-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "input-attributes-supported", js.Array(value :_*))
    
    inline def `setInput-color-mode-supported`(value: js.Array[InputColorMode]): Self = StObject.set(x, "input-color-mode-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-color-mode-supportedUndefined`: Self = StObject.set(x, "input-color-mode-supported", js.undefined)
    
    inline def `setInput-color-mode-supportedVarargs`(value: InputColorMode*): Self = StObject.set(x, "input-color-mode-supported", js.Array(value :_*))
    
    inline def `setInput-content-type-supported`(value: js.Array[InputContentType]): Self = StObject.set(x, "input-content-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-content-type-supportedUndefined`: Self = StObject.set(x, "input-content-type-supported", js.undefined)
    
    inline def `setInput-content-type-supportedVarargs`(value: InputContentType*): Self = StObject.set(x, "input-content-type-supported", js.Array(value :_*))
    
    inline def `setInput-film-scan-mode-supported`(value: js.Array[InputFilmScanMode]): Self = StObject.set(x, "input-film-scan-mode-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-film-scan-mode-supportedUndefined`: Self = StObject.set(x, "input-film-scan-mode-supported", js.undefined)
    
    inline def `setInput-film-scan-mode-supportedVarargs`(value: InputFilmScanMode*): Self = StObject.set(x, "input-film-scan-mode-supported", js.Array(value :_*))
    
    inline def `setInput-media-supported`(value: js.Array[MediaName | MediaSizeName]): Self = StObject.set(x, "input-media-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-media-supportedUndefined`: Self = StObject.set(x, "input-media-supported", js.undefined)
    
    inline def `setInput-media-supportedVarargs`(value: (MediaName | MediaSizeName)*): Self = StObject.set(x, "input-media-supported", js.Array(value :_*))
    
    inline def `setInput-orientation-requested-supported`(value: js.Array[OrientationRequested]): Self = StObject.set(x, "input-orientation-requested-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-orientation-requested-supportedUndefined`: Self = StObject.set(x, "input-orientation-requested-supported", js.undefined)
    
    inline def `setInput-orientation-requested-supportedVarargs`(value: OrientationRequested*): Self = StObject.set(x, "input-orientation-requested-supported", js.Array(value :_*))
    
    inline def `setInput-quality-supported`(value: js.Array[PrintQuality]): Self = StObject.set(x, "input-quality-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-quality-supportedUndefined`: Self = StObject.set(x, "input-quality-supported", js.undefined)
    
    inline def `setInput-quality-supportedVarargs`(value: PrintQuality*): Self = StObject.set(x, "input-quality-supported", js.Array(value :_*))
    
    inline def `setInput-resolution-supported`(value: js.Array[Resolution]): Self = StObject.set(x, "input-resolution-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-resolution-supportedUndefined`: Self = StObject.set(x, "input-resolution-supported", js.undefined)
    
    inline def `setInput-resolution-supportedVarargs`(value: Resolution*): Self = StObject.set(x, "input-resolution-supported", js.Array(value :_*))
    
    inline def `setInput-scan-regions-supported`(value: InputScanRegion): Self = StObject.set(x, "input-scan-regions-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-scan-regions-supportedUndefined`: Self = StObject.set(x, "input-scan-regions-supported", js.undefined)
    
    inline def `setInput-sides-supported`(value: js.Array[Sides]): Self = StObject.set(x, "input-sides-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-sides-supportedUndefined`: Self = StObject.set(x, "input-sides-supported", js.undefined)
    
    inline def `setInput-sides-supportedVarargs`(value: Sides*): Self = StObject.set(x, "input-sides-supported", js.Array(value :_*))
    
    inline def `setInput-source-supported`(value: js.Array[InputSource]): Self = StObject.set(x, "input-source-supported", value.asInstanceOf[js.Any])
    
    inline def `setInput-source-supportedUndefined`: Self = StObject.set(x, "input-source-supported", js.undefined)
    
    inline def `setInput-source-supportedVarargs`(value: InputSource*): Self = StObject.set(x, "input-source-supported", js.Array(value :_*))
    
    inline def `setInsert-after-page-number-supported`(value: String): Self = StObject.set(x, "insert-after-page-number-supported", value.asInstanceOf[js.Any])
    
    inline def `setInsert-after-page-number-supportedUndefined`: Self = StObject.set(x, "insert-after-page-number-supported", js.undefined)
    
    inline def `setInsert-count-supported`(value: String): Self = StObject.set(x, "insert-count-supported", value.asInstanceOf[js.Any])
    
    inline def `setInsert-count-supportedUndefined`: Self = StObject.set(x, "insert-count-supported", js.undefined)
    
    inline def `setInsert-sheet-default`(value: js.Array[InsertSheet]): Self = StObject.set(x, "insert-sheet-default", value.asInstanceOf[js.Any])
    
    inline def `setInsert-sheet-defaultUndefined`: Self = StObject.set(x, "insert-sheet-default", js.undefined)
    
    inline def `setInsert-sheet-defaultVarargs`(value: InsertSheet*): Self = StObject.set(x, "insert-sheet-default", js.Array(value :_*))
    
    inline def `setInsert-sheet-supported`(value: js.Array[`insert-after-page-number` | `insert-count` | media | `media-col`]): Self = StObject.set(x, "insert-sheet-supported", value.asInstanceOf[js.Any])
    
    inline def `setInsert-sheet-supportedUndefined`: Self = StObject.set(x, "insert-sheet-supported", js.undefined)
    
    inline def `setInsert-sheet-supportedVarargs`(value: (`insert-after-page-number` | `insert-count` | media | `media-col`)*): Self = StObject.set(x, "insert-sheet-supported", js.Array(value :_*))
    
    inline def `setIpp-features-supported`(
      value: js.Array[
          `document-object` | faxout | `icc-color-matching` | `infrastructure-printer` | `ipp-3d` | `ipp-everywhere` | `job-save` | none | `page-overrides` | `proof-print` | `resource-object` | scan | `subscription-object` | `system-object`
        ]
    ): Self = StObject.set(x, "ipp-features-supported", value.asInstanceOf[js.Any])
    
    inline def `setIpp-features-supportedUndefined`: Self = StObject.set(x, "ipp-features-supported", js.undefined)
    
    inline def `setIpp-features-supportedVarargs`(
      value: (`document-object` | faxout | `icc-color-matching` | `infrastructure-printer` | `ipp-3d` | `ipp-everywhere` | `job-save` | none | `page-overrides` | `proof-print` | `resource-object` | scan | `subscription-object` | `system-object`)*
    ): Self = StObject.set(x, "ipp-features-supported", js.Array(value :_*))
    
    inline def `setIpp-versions-supported`(value: js.Array[IPPVersion]): Self = StObject.set(x, "ipp-versions-supported", value.asInstanceOf[js.Any])
    
    inline def `setIpp-versions-supportedUndefined`: Self = StObject.set(x, "ipp-versions-supported", js.undefined)
    
    inline def `setIpp-versions-supportedVarargs`(value: IPPVersion*): Self = StObject.set(x, "ipp-versions-supported", js.Array(value :_*))
    
    inline def `setIppget-event-life`(value: Double): Self = StObject.set(x, "ippget-event-life", value.asInstanceOf[js.Any])
    
    inline def `setIppget-event-lifeUndefined`: Self = StObject.set(x, "ippget-event-life", js.undefined)
    
    inline def `setJob-account-id-default`(value: String): Self = StObject.set(x, "job-account-id-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-account-id-defaultUndefined`: Self = StObject.set(x, "job-account-id-default", js.undefined)
    
    inline def `setJob-account-id-supported`(value: Boolean): Self = StObject.set(x, "job-account-id-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-account-id-supportedUndefined`: Self = StObject.set(x, "job-account-id-supported", js.undefined)
    
    inline def `setJob-account-type-default`(value: JobAccountType): Self = StObject.set(x, "job-account-type-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-account-type-defaultUndefined`: Self = StObject.set(x, "job-account-type-default", js.undefined)
    
    inline def `setJob-account-type-supported`(value: js.Array[JobAccountType]): Self = StObject.set(x, "job-account-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-account-type-supportedUndefined`: Self = StObject.set(x, "job-account-type-supported", js.undefined)
    
    inline def `setJob-account-type-supportedVarargs`(value: JobAccountType*): Self = StObject.set(x, "job-account-type-supported", js.Array(value :_*))
    
    inline def `setJob-accounting-sheets-default`(value: JobAccontingSheets): Self = StObject.set(x, "job-accounting-sheets-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-accounting-sheets-defaultUndefined`: Self = StObject.set(x, "job-accounting-sheets-default", js.undefined)
    
    inline def `setJob-accounting-sheets-supported`(value: js.Array[String]): Self = StObject.set(x, "job-accounting-sheets-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-accounting-sheets-supportedUndefined`: Self = StObject.set(x, "job-accounting-sheets-supported", js.undefined)
    
    inline def `setJob-accounting-sheets-supportedVarargs`(value: String*): Self = StObject.set(x, "job-accounting-sheets-supported", js.Array(value :_*))
    
    inline def `setJob-accounting-user-id-default`(value: String): Self = StObject.set(x, "job-accounting-user-id-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-accounting-user-id-defaultUndefined`: Self = StObject.set(x, "job-accounting-user-id-default", js.undefined)
    
    inline def `setJob-accounting-user-id-supported`(value: Boolean): Self = StObject.set(x, "job-accounting-user-id-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-accounting-user-id-supportedUndefined`: Self = StObject.set(x, "job-accounting-user-id-supported", js.undefined)
    
    inline def `setJob-authorization-uri-supported`(value: Boolean): Self = StObject.set(x, "job-authorization-uri-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-authorization-uri-supportedUndefined`: Self = StObject.set(x, "job-authorization-uri-supported", js.undefined)
    
    inline def `setJob-cancel-after-default`(value: Double): Self = StObject.set(x, "job-cancel-after-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-cancel-after-defaultUndefined`: Self = StObject.set(x, "job-cancel-after-default", js.undefined)
    
    inline def `setJob-cancel-after-supported`(value: String): Self = StObject.set(x, "job-cancel-after-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-cancel-after-supportedUndefined`: Self = StObject.set(x, "job-cancel-after-supported", js.undefined)
    
    inline def `setJob-constraints-supported`(value: js.Array[JobConstraintsSupported]): Self = StObject.set(x, "job-constraints-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-constraints-supportedUndefined`: Self = StObject.set(x, "job-constraints-supported", js.undefined)
    
    inline def `setJob-constraints-supportedVarargs`(value: JobConstraintsSupported*): Self = StObject.set(x, "job-constraints-supported", js.Array(value :_*))
    
    inline def `setJob-creation-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = StObject.set(x, "job-creation-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-creation-attributes-supportedUndefined`: Self = StObject.set(x, "job-creation-attributes-supported", js.undefined)
    
    inline def `setJob-creation-attributes-supportedVarargs`(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any)*): Self = StObject.set(x, "job-creation-attributes-supported", js.Array(value :_*))
    
    inline def `setJob-delay-output-until-default`(value: JobDelayOutputUntil): Self = StObject.set(x, "job-delay-output-until-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-delay-output-until-defaultUndefined`: Self = StObject.set(x, "job-delay-output-until-default", js.undefined)
    
    inline def `setJob-delay-output-until-interval-supported`(value: String): Self = StObject.set(x, "job-delay-output-until-interval-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-delay-output-until-interval-supportedUndefined`: Self = StObject.set(x, "job-delay-output-until-interval-supported", js.undefined)
    
    inline def `setJob-delay-output-until-supported`(value: js.Array[JobDelayOutputUntil]): Self = StObject.set(x, "job-delay-output-until-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-delay-output-until-supportedUndefined`: Self = StObject.set(x, "job-delay-output-until-supported", js.undefined)
    
    inline def `setJob-delay-output-until-supportedVarargs`(value: JobDelayOutputUntil*): Self = StObject.set(x, "job-delay-output-until-supported", js.Array(value :_*))
    
    inline def `setJob-delay-output-until-time-supported`(value: String): Self = StObject.set(x, "job-delay-output-until-time-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-delay-output-until-time-supportedUndefined`: Self = StObject.set(x, "job-delay-output-until-time-supported", js.undefined)
    
    inline def `setJob-destination-spooling-supported`(value: String): Self = StObject.set(x, "job-destination-spooling-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-destination-spooling-supportedUndefined`: Self = StObject.set(x, "job-destination-spooling-supported", js.undefined)
    
    inline def `setJob-error-action-default`(value: JobErrorAction): Self = StObject.set(x, "job-error-action-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-action-defaultUndefined`: Self = StObject.set(x, "job-error-action-default", js.undefined)
    
    inline def `setJob-error-action-supported`(value: js.Array[JobErrorAction]): Self = StObject.set(x, "job-error-action-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-action-supportedUndefined`: Self = StObject.set(x, "job-error-action-supported", js.undefined)
    
    inline def `setJob-error-action-supportedVarargs`(value: JobErrorAction*): Self = StObject.set(x, "job-error-action-supported", js.Array(value :_*))
    
    inline def `setJob-error-sheet-default`(value: JobErrorSheet): Self = StObject.set(x, "job-error-sheet-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-sheet-defaultUndefined`: Self = StObject.set(x, "job-error-sheet-default", js.undefined)
    
    inline def `setJob-error-sheet-supported`(value: js.Array[String]): Self = StObject.set(x, "job-error-sheet-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-sheet-supportedUndefined`: Self = StObject.set(x, "job-error-sheet-supported", js.undefined)
    
    inline def `setJob-error-sheet-supportedVarargs`(value: String*): Self = StObject.set(x, "job-error-sheet-supported", js.Array(value :_*))
    
    inline def `setJob-history-attributes-configured`(value: js.Array[String]): Self = StObject.set(x, "job-history-attributes-configured", value.asInstanceOf[js.Any])
    
    inline def `setJob-history-attributes-configuredUndefined`: Self = StObject.set(x, "job-history-attributes-configured", js.undefined)
    
    inline def `setJob-history-attributes-configuredVarargs`(value: String*): Self = StObject.set(x, "job-history-attributes-configured", js.Array(value :_*))
    
    inline def `setJob-history-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "job-history-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-history-attributes-supportedUndefined`: Self = StObject.set(x, "job-history-attributes-supported", js.undefined)
    
    inline def `setJob-history-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "job-history-attributes-supported", js.Array(value :_*))
    
    inline def `setJob-history-interval-configured`(value: Double): Self = StObject.set(x, "job-history-interval-configured", value.asInstanceOf[js.Any])
    
    inline def `setJob-history-interval-configuredUndefined`: Self = StObject.set(x, "job-history-interval-configured", js.undefined)
    
    inline def `setJob-history-interval-supported`(value: String): Self = StObject.set(x, "job-history-interval-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-history-interval-supportedUndefined`: Self = StObject.set(x, "job-history-interval-supported", js.undefined)
    
    inline def `setJob-hold-until-default`(value: JobHoldUntil): Self = StObject.set(x, "job-hold-until-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-defaultUndefined`: Self = StObject.set(x, "job-hold-until-default", js.undefined)
    
    inline def `setJob-hold-until-supported`(value: js.Array[JobHoldUntil]): Self = StObject.set(x, "job-hold-until-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-supportedUndefined`: Self = StObject.set(x, "job-hold-until-supported", js.undefined)
    
    inline def `setJob-hold-until-supportedVarargs`(value: JobHoldUntil*): Self = StObject.set(x, "job-hold-until-supported", js.Array(value :_*))
    
    inline def `setJob-hold-until-time-supported`(value: String): Self = StObject.set(x, "job-hold-until-time-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-hold-until-time-supportedUndefined`: Self = StObject.set(x, "job-hold-until-time-supported", js.undefined)
    
    inline def `setJob-ids-supported`(value: Boolean): Self = StObject.set(x, "job-ids-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-ids-supportedUndefined`: Self = StObject.set(x, "job-ids-supported", js.undefined)
    
    inline def `setJob-impressions-supported`(value: String): Self = StObject.set(x, "job-impressions-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-impressions-supportedUndefined`: Self = StObject.set(x, "job-impressions-supported", js.undefined)
    
    inline def `setJob-k-octets-supported`(value: String): Self = StObject.set(x, "job-k-octets-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-k-octets-supportedUndefined`: Self = StObject.set(x, "job-k-octets-supported", js.undefined)
    
    inline def `setJob-mandatory-attributes-supported`(value: Boolean): Self = StObject.set(x, "job-mandatory-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-mandatory-attributes-supportedUndefined`: Self = StObject.set(x, "job-mandatory-attributes-supported", js.undefined)
    
    inline def `setJob-media-sheets-supported`(value: String): Self = StObject.set(x, "job-media-sheets-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-media-sheets-supportedUndefined`: Self = StObject.set(x, "job-media-sheets-supported", js.undefined)
    
    inline def `setJob-message-to-operator-default`(value: String): Self = StObject.set(x, "job-message-to-operator-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-message-to-operator-defaultUndefined`: Self = StObject.set(x, "job-message-to-operator-default", js.undefined)
    
    inline def `setJob-message-to-operator-supported`(value: Boolean): Self = StObject.set(x, "job-message-to-operator-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-message-to-operator-supportedUndefined`: Self = StObject.set(x, "job-message-to-operator-supported", js.undefined)
    
    inline def `setJob-pages-per-set-supported`(value: Boolean): Self = StObject.set(x, "job-pages-per-set-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-pages-per-set-supportedUndefined`: Self = StObject.set(x, "job-pages-per-set-supported", js.undefined)
    
    inline def `setJob-password-encryption-supported`(value: js.Array[JobPasswordEncryption]): Self = StObject.set(x, "job-password-encryption-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-encryption-supportedUndefined`: Self = StObject.set(x, "job-password-encryption-supported", js.undefined)
    
    inline def `setJob-password-encryption-supportedVarargs`(value: JobPasswordEncryption*): Self = StObject.set(x, "job-password-encryption-supported", js.Array(value :_*))
    
    inline def `setJob-password-length-supported`(value: String): Self = StObject.set(x, "job-password-length-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-length-supportedUndefined`: Self = StObject.set(x, "job-password-length-supported", js.undefined)
    
    inline def `setJob-password-repertoire-configured`(value: JobPasswordRepertoire): Self = StObject.set(x, "job-password-repertoire-configured", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-repertoire-configuredUndefined`: Self = StObject.set(x, "job-password-repertoire-configured", js.undefined)
    
    inline def `setJob-password-repertoire-supported`(value: js.Array[JobPasswordRepertoire]): Self = StObject.set(x, "job-password-repertoire-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-repertoire-supportedUndefined`: Self = StObject.set(x, "job-password-repertoire-supported", js.undefined)
    
    inline def `setJob-password-repertoire-supportedVarargs`(value: JobPasswordRepertoire*): Self = StObject.set(x, "job-password-repertoire-supported", js.Array(value :_*))
    
    inline def `setJob-password-supported`(value: Double): Self = StObject.set(x, "job-password-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-password-supportedUndefined`: Self = StObject.set(x, "job-password-supported", js.undefined)
    
    inline def `setJob-phone-number-default`(value: String): Self = StObject.set(x, "job-phone-number-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-phone-number-defaultUndefined`: Self = StObject.set(x, "job-phone-number-default", js.undefined)
    
    inline def `setJob-phone-number-supported`(value: Boolean): Self = StObject.set(x, "job-phone-number-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-phone-number-supportedUndefined`: Self = StObject.set(x, "job-phone-number-supported", js.undefined)
    
    inline def `setJob-presets-supported`(value: js.Array[JobPresetsSupported]): Self = StObject.set(x, "job-presets-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-presets-supportedUndefined`: Self = StObject.set(x, "job-presets-supported", js.undefined)
    
    inline def `setJob-presets-supportedVarargs`(value: JobPresetsSupported*): Self = StObject.set(x, "job-presets-supported", js.Array(value :_*))
    
    inline def `setJob-priority-default`(value: Double): Self = StObject.set(x, "job-priority-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-priority-defaultUndefined`: Self = StObject.set(x, "job-priority-default", js.undefined)
    
    inline def `setJob-priority-supported`(value: Double): Self = StObject.set(x, "job-priority-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-priority-supportedUndefined`: Self = StObject.set(x, "job-priority-supported", js.undefined)
    
    inline def `setJob-privacy-attributes`(value: js.Array[String]): Self = StObject.set(x, "job-privacy-attributes", value.asInstanceOf[js.Any])
    
    inline def `setJob-privacy-attributesUndefined`: Self = StObject.set(x, "job-privacy-attributes", js.undefined)
    
    inline def `setJob-privacy-attributesVarargs`(value: String*): Self = StObject.set(x, "job-privacy-attributes", js.Array(value :_*))
    
    inline def `setJob-privacy-scope`(value: all | default | none | owner): Self = StObject.set(x, "job-privacy-scope", value.asInstanceOf[js.Any])
    
    inline def `setJob-privacy-scopeUndefined`: Self = StObject.set(x, "job-privacy-scope", js.undefined)
    
    inline def `setJob-recipient-name-default`(value: String): Self = StObject.set(x, "job-recipient-name-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-recipient-name-defaultUndefined`: Self = StObject.set(x, "job-recipient-name-default", js.undefined)
    
    inline def `setJob-recipient-name-supported`(value: Boolean): Self = StObject.set(x, "job-recipient-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-recipient-name-supportedUndefined`: Self = StObject.set(x, "job-recipient-name-supported", js.undefined)
    
    inline def `setJob-resolvers-supported`(value: js.Array[JobResolversSupported]): Self = StObject.set(x, "job-resolvers-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-resolvers-supportedUndefined`: Self = StObject.set(x, "job-resolvers-supported", js.undefined)
    
    inline def `setJob-resolvers-supportedVarargs`(value: JobResolversSupported*): Self = StObject.set(x, "job-resolvers-supported", js.Array(value :_*))
    
    inline def `setJob-retain-until-default`(value: JobRetainUntil): Self = StObject.set(x, "job-retain-until-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-defaultUndefined`: Self = StObject.set(x, "job-retain-until-default", js.undefined)
    
    inline def `setJob-retain-until-interval-supported`(value: String): Self = StObject.set(x, "job-retain-until-interval-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-interval-supportedUndefined`: Self = StObject.set(x, "job-retain-until-interval-supported", js.undefined)
    
    inline def `setJob-retain-until-supported`(value: js.Array[JobRetainUntil]): Self = StObject.set(x, "job-retain-until-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-supportedUndefined`: Self = StObject.set(x, "job-retain-until-supported", js.undefined)
    
    inline def `setJob-retain-until-supportedVarargs`(value: JobRetainUntil*): Self = StObject.set(x, "job-retain-until-supported", js.Array(value :_*))
    
    inline def `setJob-retain-until-time-supported`(value: String): Self = StObject.set(x, "job-retain-until-time-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-retain-until-time-supportedUndefined`: Self = StObject.set(x, "job-retain-until-time-supported", js.undefined)
    
    inline def `setJob-sheet-message-default`(value: String): Self = StObject.set(x, "job-sheet-message-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheet-message-defaultUndefined`: Self = StObject.set(x, "job-sheet-message-default", js.undefined)
    
    inline def `setJob-sheet-message-supported`(value: Boolean): Self = StObject.set(x, "job-sheet-message-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheet-message-supportedUndefined`: Self = StObject.set(x, "job-sheet-message-supported", js.undefined)
    
    inline def `setJob-sheets-col-default`(value: JobSheetsInterface): Self = StObject.set(x, "job-sheets-col-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheets-col-defaultUndefined`: Self = StObject.set(x, "job-sheets-col-default", js.undefined)
    
    inline def `setJob-sheets-col-supported`(value: js.Array[String]): Self = StObject.set(x, "job-sheets-col-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheets-col-supportedUndefined`: Self = StObject.set(x, "job-sheets-col-supported", js.undefined)
    
    inline def `setJob-sheets-col-supportedVarargs`(value: String*): Self = StObject.set(x, "job-sheets-col-supported", js.Array(value :_*))
    
    inline def `setJob-sheets-default`(value: JobSheets): Self = StObject.set(x, "job-sheets-default", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheets-defaultUndefined`: Self = StObject.set(x, "job-sheets-default", js.undefined)
    
    inline def `setJob-sheets-supported`(value: js.Array[JobSheets]): Self = StObject.set(x, "job-sheets-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheets-supportedUndefined`: Self = StObject.set(x, "job-sheets-supported", js.undefined)
    
    inline def `setJob-sheets-supportedVarargs`(value: JobSheets*): Self = StObject.set(x, "job-sheets-supported", js.Array(value :_*))
    
    inline def `setJob-spooling-supported`(value: automatic | spool | stream): Self = StObject.set(x, "job-spooling-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-spooling-supportedUndefined`: Self = StObject.set(x, "job-spooling-supported", js.undefined)
    
    inline def `setJob-triggers-supported`(value: JobTriggersSupported): Self = StObject.set(x, "job-triggers-supported", value.asInstanceOf[js.Any])
    
    inline def `setJob-triggers-supportedUndefined`: Self = StObject.set(x, "job-triggers-supported", js.undefined)
    
    inline def `setJpeg-features-supported`(value: js.Array[arithmetic | cmyk | deep | hierarchical | icc | lossless | none | progressive]): Self = StObject.set(x, "jpeg-features-supported", value.asInstanceOf[js.Any])
    
    inline def `setJpeg-features-supportedUndefined`: Self = StObject.set(x, "jpeg-features-supported", js.undefined)
    
    inline def `setJpeg-features-supportedVarargs`(value: (arithmetic | cmyk | deep | hierarchical | icc | lossless | none | progressive)*): Self = StObject.set(x, "jpeg-features-supported", js.Array(value :_*))
    
    inline def `setJpeg-k-octets-supported`(value: String): Self = StObject.set(x, "jpeg-k-octets-supported", value.asInstanceOf[js.Any])
    
    inline def `setJpeg-k-octets-supportedUndefined`: Self = StObject.set(x, "jpeg-k-octets-supported", js.undefined)
    
    inline def `setJpeg-x-dimension-supported`(value: String): Self = StObject.set(x, "jpeg-x-dimension-supported", value.asInstanceOf[js.Any])
    
    inline def `setJpeg-x-dimension-supportedUndefined`: Self = StObject.set(x, "jpeg-x-dimension-supported", js.undefined)
    
    inline def `setJpeg-y-dimension-supported`(value: String): Self = StObject.set(x, "jpeg-y-dimension-supported", value.asInstanceOf[js.Any])
    
    inline def `setJpeg-y-dimension-supportedUndefined`: Self = StObject.set(x, "jpeg-y-dimension-supported", js.undefined)
    
    inline def `setLaminating-sides-supported`(value: js.Array[FinishingSides]): Self = StObject.set(x, "laminating-sides-supported", value.asInstanceOf[js.Any])
    
    inline def `setLaminating-sides-supportedUndefined`: Self = StObject.set(x, "laminating-sides-supported", js.undefined)
    
    inline def `setLaminating-sides-supportedVarargs`(value: FinishingSides*): Self = StObject.set(x, "laminating-sides-supported", js.Array(value :_*))
    
    inline def `setLaminating-type-supported`(value: js.Array[LaminatingType]): Self = StObject.set(x, "laminating-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setLaminating-type-supportedUndefined`: Self = StObject.set(x, "laminating-type-supported", js.undefined)
    
    inline def `setLaminating-type-supportedVarargs`(value: LaminatingType*): Self = StObject.set(x, "laminating-type-supported", js.Array(value :_*))
    
    inline def `setLogo-uri-formats-supported`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "logo-uri-formats-supported", value.asInstanceOf[js.Any])
    
    inline def `setLogo-uri-formats-supportedUndefined`: Self = StObject.set(x, "logo-uri-formats-supported", js.undefined)
    
    inline def `setLogo-uri-formats-supportedVarargs`(value: MimeMediaType*): Self = StObject.set(x, "logo-uri-formats-supported", js.Array(value :_*))
    
    inline def `setLogo-uri-schemes-supported`(value: js.Array[UriSchemes]): Self = StObject.set(x, "logo-uri-schemes-supported", value.asInstanceOf[js.Any])
    
    inline def `setLogo-uri-schemes-supportedUndefined`: Self = StObject.set(x, "logo-uri-schemes-supported", js.undefined)
    
    inline def `setLogo-uri-schemes-supportedVarargs`(value: UriSchemes*): Self = StObject.set(x, "logo-uri-schemes-supported", js.Array(value :_*))
    
    inline def `setMaterial-amount-units-supported`(value: js.Array[MaterialAmountUnits]): Self = StObject.set(x, "material-amount-units-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-amount-units-supportedUndefined`: Self = StObject.set(x, "material-amount-units-supported", js.undefined)
    
    inline def `setMaterial-amount-units-supportedVarargs`(value: MaterialAmountUnits*): Self = StObject.set(x, "material-amount-units-supported", js.Array(value :_*))
    
    inline def `setMaterial-diameter-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "material-diameter-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-diameter-supportedUndefined`: Self = StObject.set(x, "material-diameter-supported", js.undefined)
    
    inline def `setMaterial-diameter-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "material-diameter-supported", js.Array(value :_*))
    
    inline def `setMaterial-nozzle-diameter-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "material-nozzle-diameter-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-nozzle-diameter-supportedUndefined`: Self = StObject.set(x, "material-nozzle-diameter-supported", js.undefined)
    
    inline def `setMaterial-nozzle-diameter-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "material-nozzle-diameter-supported", js.Array(value :_*))
    
    inline def `setMaterial-purpose-supported`(value: js.Array[MaterialPurpose]): Self = StObject.set(x, "material-purpose-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-purpose-supportedUndefined`: Self = StObject.set(x, "material-purpose-supported", js.undefined)
    
    inline def `setMaterial-purpose-supportedVarargs`(value: MaterialPurpose*): Self = StObject.set(x, "material-purpose-supported", js.Array(value :_*))
    
    inline def `setMaterial-rate-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "material-rate-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-rate-supportedUndefined`: Self = StObject.set(x, "material-rate-supported", js.undefined)
    
    inline def `setMaterial-rate-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "material-rate-supported", js.Array(value :_*))
    
    inline def `setMaterial-rate-units-supported`(value: js.Array[MaterialRateUnits]): Self = StObject.set(x, "material-rate-units-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-rate-units-supportedUndefined`: Self = StObject.set(x, "material-rate-units-supported", js.undefined)
    
    inline def `setMaterial-rate-units-supportedVarargs`(value: MaterialRateUnits*): Self = StObject.set(x, "material-rate-units-supported", js.Array(value :_*))
    
    inline def `setMaterial-shell-thickness-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "material-shell-thickness-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-shell-thickness-supportedUndefined`: Self = StObject.set(x, "material-shell-thickness-supported", js.undefined)
    
    inline def `setMaterial-shell-thickness-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "material-shell-thickness-supported", js.Array(value :_*))
    
    inline def `setMaterial-temperature-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "material-temperature-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-temperature-supportedUndefined`: Self = StObject.set(x, "material-temperature-supported", js.undefined)
    
    inline def `setMaterial-temperature-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "material-temperature-supported", js.Array(value :_*))
    
    inline def `setMaterial-type-supported`(value: js.Array[MaterialType]): Self = StObject.set(x, "material-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterial-type-supportedUndefined`: Self = StObject.set(x, "material-type-supported", js.undefined)
    
    inline def `setMaterial-type-supportedVarargs`(value: MaterialType*): Self = StObject.set(x, "material-type-supported", js.Array(value :_*))
    
    inline def `setMaterials-col-database`(value: js.Array[Materials]): Self = StObject.set(x, "materials-col-database", value.asInstanceOf[js.Any])
    
    inline def `setMaterials-col-databaseUndefined`: Self = StObject.set(x, "materials-col-database", js.undefined)
    
    inline def `setMaterials-col-databaseVarargs`(value: Materials*): Self = StObject.set(x, "materials-col-database", js.Array(value :_*))
    
    inline def `setMaterials-col-default`(value: js.Array[Materials]): Self = StObject.set(x, "materials-col-default", value.asInstanceOf[js.Any])
    
    inline def `setMaterials-col-defaultUndefined`: Self = StObject.set(x, "materials-col-default", js.undefined)
    
    inline def `setMaterials-col-defaultVarargs`(value: Materials*): Self = StObject.set(x, "materials-col-default", js.Array(value :_*))
    
    inline def `setMaterials-col-ready`(value: js.Array[Materials]): Self = StObject.set(x, "materials-col-ready", value.asInstanceOf[js.Any])
    
    inline def `setMaterials-col-readyUndefined`: Self = StObject.set(x, "materials-col-ready", js.undefined)
    
    inline def `setMaterials-col-readyVarargs`(value: Materials*): Self = StObject.set(x, "materials-col-ready", js.Array(value :_*))
    
    inline def `setMaterials-col-supported`(
      value: js.Array[
          `material-amount` | `material-amount-units` | `material-color` | `material-diameter` | `material-diameter-tolerance` | `material-fill-density` | `material-key` | `material-name` | `material-nozzle-diameter` | `material-purpose` | `material-rate` | `material-rate-units` | `material-retraction` | `material-shell-thickness` | `material-temperature` | `material-type`
        ]
    ): Self = StObject.set(x, "materials-col-supported", value.asInstanceOf[js.Any])
    
    inline def `setMaterials-col-supportedUndefined`: Self = StObject.set(x, "materials-col-supported", js.undefined)
    
    inline def `setMaterials-col-supportedVarargs`(
      value: (`material-amount` | `material-amount-units` | `material-color` | `material-diameter` | `material-diameter-tolerance` | `material-fill-density` | `material-key` | `material-name` | `material-nozzle-diameter` | `material-purpose` | `material-rate` | `material-rate-units` | `material-retraction` | `material-shell-thickness` | `material-temperature` | `material-type`)*
    ): Self = StObject.set(x, "materials-col-supported", js.Array(value :_*))
    
    inline def `setMax-materials-col-supported`(value: Double): Self = StObject.set(x, "max-materials-col-supported", value.asInstanceOf[js.Any])
    
    inline def `setMax-materials-col-supportedUndefined`: Self = StObject.set(x, "max-materials-col-supported", js.undefined)
    
    inline def `setMax-page-ranges-supported`(value: Double): Self = StObject.set(x, "max-page-ranges-supported", value.asInstanceOf[js.Any])
    
    inline def `setMax-page-ranges-supportedUndefined`: Self = StObject.set(x, "max-page-ranges-supported", js.undefined)
    
    inline def `setMax-save-info-supported`(value: Double): Self = StObject.set(x, "max-save-info-supported", value.asInstanceOf[js.Any])
    
    inline def `setMax-save-info-supportedUndefined`: Self = StObject.set(x, "max-save-info-supported", js.undefined)
    
    inline def `setMax-stitching-locations-supported`(value: Double): Self = StObject.set(x, "max-stitching-locations-supported", value.asInstanceOf[js.Any])
    
    inline def `setMax-stitching-locations-supportedUndefined`: Self = StObject.set(x, "max-stitching-locations-supported", js.undefined)
    
    inline def `setMedia-back-coating-supported`(value: js.Array[MediaCoating]): Self = StObject.set(x, "media-back-coating-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-back-coating-supportedUndefined`: Self = StObject.set(x, "media-back-coating-supported", js.undefined)
    
    inline def `setMedia-back-coating-supportedVarargs`(value: MediaCoating*): Self = StObject.set(x, "media-back-coating-supported", js.Array(value :_*))
    
    inline def `setMedia-bottom-margin-supported`(value: js.Array[Double]): Self = StObject.set(x, "media-bottom-margin-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-bottom-margin-supportedUndefined`: Self = StObject.set(x, "media-bottom-margin-supported", js.undefined)
    
    inline def `setMedia-bottom-margin-supportedVarargs`(value: Double*): Self = StObject.set(x, "media-bottom-margin-supported", js.Array(value :_*))
    
    inline def `setMedia-col-database`(value: js.Array[MediaInterface]): Self = StObject.set(x, "media-col-database", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col-databaseUndefined`: Self = StObject.set(x, "media-col-database", js.undefined)
    
    inline def `setMedia-col-databaseVarargs`(value: MediaInterface*): Self = StObject.set(x, "media-col-database", js.Array(value :_*))
    
    inline def `setMedia-col-default`(value: MediaInterface): Self = StObject.set(x, "media-col-default", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col-defaultUndefined`: Self = StObject.set(x, "media-col-default", js.undefined)
    
    inline def `setMedia-col-ready`(value: js.Array[MediaInterface]): Self = StObject.set(x, "media-col-ready", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col-readyUndefined`: Self = StObject.set(x, "media-col-ready", js.undefined)
    
    inline def `setMedia-col-readyVarargs`(value: MediaInterface*): Self = StObject.set(x, "media-col-ready", js.Array(value :_*))
    
    inline def `setMedia-col-supported`(value: js.Array[MediaColSupported]): Self = StObject.set(x, "media-col-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col-supportedUndefined`: Self = StObject.set(x, "media-col-supported", js.undefined)
    
    inline def `setMedia-col-supportedVarargs`(value: MediaColSupported*): Self = StObject.set(x, "media-col-supported", js.Array(value :_*))
    
    inline def `setMedia-color-supported`(value: js.Array[MediaColor]): Self = StObject.set(x, "media-color-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-color-supportedUndefined`: Self = StObject.set(x, "media-color-supported", js.undefined)
    
    inline def `setMedia-color-supportedVarargs`(value: MediaColor*): Self = StObject.set(x, "media-color-supported", js.Array(value :_*))
    
    inline def `setMedia-default`(value: Media): Self = StObject.set(x, "media-default", value.asInstanceOf[js.Any])
    
    inline def `setMedia-defaultUndefined`: Self = StObject.set(x, "media-default", js.undefined)
    
    inline def `setMedia-front-coating-supported`(value: js.Array[MediaCoating]): Self = StObject.set(x, "media-front-coating-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-front-coating-supportedUndefined`: Self = StObject.set(x, "media-front-coating-supported", js.undefined)
    
    inline def `setMedia-front-coating-supportedVarargs`(value: MediaCoating*): Self = StObject.set(x, "media-front-coating-supported", js.Array(value :_*))
    
    inline def `setMedia-grain-supported`(value: js.Array[MediaGrain]): Self = StObject.set(x, "media-grain-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-grain-supportedUndefined`: Self = StObject.set(x, "media-grain-supported", js.undefined)
    
    inline def `setMedia-grain-supportedVarargs`(value: MediaGrain*): Self = StObject.set(x, "media-grain-supported", js.Array(value :_*))
    
    inline def `setMedia-hole-count-supported`(value: js.Array[String]): Self = StObject.set(x, "media-hole-count-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-hole-count-supportedUndefined`: Self = StObject.set(x, "media-hole-count-supported", js.undefined)
    
    inline def `setMedia-hole-count-supportedVarargs`(value: String*): Self = StObject.set(x, "media-hole-count-supported", js.Array(value :_*))
    
    inline def `setMedia-key-supported`(value: js.Array[MediaSizeName | MediaName]): Self = StObject.set(x, "media-key-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-key-supportedUndefined`: Self = StObject.set(x, "media-key-supported", js.undefined)
    
    inline def `setMedia-key-supportedVarargs`(value: (MediaSizeName | MediaName)*): Self = StObject.set(x, "media-key-supported", js.Array(value :_*))
    
    inline def `setMedia-left-margin-supported`(value: js.Array[Double]): Self = StObject.set(x, "media-left-margin-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-left-margin-supportedUndefined`: Self = StObject.set(x, "media-left-margin-supported", js.undefined)
    
    inline def `setMedia-left-margin-supportedVarargs`(value: Double*): Self = StObject.set(x, "media-left-margin-supported", js.Array(value :_*))
    
    inline def `setMedia-order-count-supported`(value: js.Array[String]): Self = StObject.set(x, "media-order-count-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-order-count-supportedUndefined`: Self = StObject.set(x, "media-order-count-supported", js.undefined)
    
    inline def `setMedia-order-count-supportedVarargs`(value: String*): Self = StObject.set(x, "media-order-count-supported", js.Array(value :_*))
    
    inline def `setMedia-pre-printed-supported`(value: js.Array[MediaPrePrinted]): Self = StObject.set(x, "media-pre-printed-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-pre-printed-supportedUndefined`: Self = StObject.set(x, "media-pre-printed-supported", js.undefined)
    
    inline def `setMedia-pre-printed-supportedVarargs`(value: MediaPrePrinted*): Self = StObject.set(x, "media-pre-printed-supported", js.Array(value :_*))
    
    inline def `setMedia-ready`(value: js.Array[MediaSizeName | MediaName]): Self = StObject.set(x, "media-ready", value.asInstanceOf[js.Any])
    
    inline def `setMedia-readyUndefined`: Self = StObject.set(x, "media-ready", js.undefined)
    
    inline def `setMedia-readyVarargs`(value: (MediaSizeName | MediaName)*): Self = StObject.set(x, "media-ready", js.Array(value :_*))
    
    inline def `setMedia-recycled-supported`(value: js.Array[MediaPrePrinted]): Self = StObject.set(x, "media-recycled-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-recycled-supportedUndefined`: Self = StObject.set(x, "media-recycled-supported", js.undefined)
    
    inline def `setMedia-recycled-supportedVarargs`(value: MediaPrePrinted*): Self = StObject.set(x, "media-recycled-supported", js.Array(value :_*))
    
    inline def `setMedia-right-margin-supported`(value: js.Array[Double]): Self = StObject.set(x, "media-right-margin-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-right-margin-supportedUndefined`: Self = StObject.set(x, "media-right-margin-supported", js.undefined)
    
    inline def `setMedia-right-margin-supportedVarargs`(value: Double*): Self = StObject.set(x, "media-right-margin-supported", js.Array(value :_*))
    
    inline def `setMedia-size-supported`(value: MediaSizeSupported): Self = StObject.set(x, "media-size-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-size-supportedUndefined`: Self = StObject.set(x, "media-size-supported", js.undefined)
    
    inline def `setMedia-source-supported`(value: js.Array[MediaSource]): Self = StObject.set(x, "media-source-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-source-supportedUndefined`: Self = StObject.set(x, "media-source-supported", js.undefined)
    
    inline def `setMedia-source-supportedVarargs`(value: MediaSource*): Self = StObject.set(x, "media-source-supported", js.Array(value :_*))
    
    inline def `setMedia-supported`(value: js.Array[Media]): Self = StObject.set(x, "media-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-supportedUndefined`: Self = StObject.set(x, "media-supported", js.undefined)
    
    inline def `setMedia-supportedVarargs`(value: Media*): Self = StObject.set(x, "media-supported", js.Array(value :_*))
    
    inline def `setMedia-thickness-supported`(value: String): Self = StObject.set(x, "media-thickness-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-thickness-supportedUndefined`: Self = StObject.set(x, "media-thickness-supported", js.undefined)
    
    inline def `setMedia-tooth-supported`(value: js.Array[MediaTooth]): Self = StObject.set(x, "media-tooth-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-tooth-supportedUndefined`: Self = StObject.set(x, "media-tooth-supported", js.undefined)
    
    inline def `setMedia-tooth-supportedVarargs`(value: MediaTooth*): Self = StObject.set(x, "media-tooth-supported", js.Array(value :_*))
    
    inline def `setMedia-top-margin-supported`(value: js.Array[Double]): Self = StObject.set(x, "media-top-margin-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-top-margin-supportedUndefined`: Self = StObject.set(x, "media-top-margin-supported", js.undefined)
    
    inline def `setMedia-top-margin-supportedVarargs`(value: Double*): Self = StObject.set(x, "media-top-margin-supported", js.Array(value :_*))
    
    inline def `setMedia-type-supported`(value: js.Array[MediaType]): Self = StObject.set(x, "media-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-type-supportedUndefined`: Self = StObject.set(x, "media-type-supported", js.undefined)
    
    inline def `setMedia-type-supportedVarargs`(value: MediaType*): Self = StObject.set(x, "media-type-supported", js.Array(value :_*))
    
    inline def `setMedia-weight-metric-supported`(value: js.Array[String]): Self = StObject.set(x, "media-weight-metric-supported", value.asInstanceOf[js.Any])
    
    inline def `setMedia-weight-metric-supportedUndefined`: Self = StObject.set(x, "media-weight-metric-supported", js.undefined)
    
    inline def `setMedia-weight-metric-supportedVarargs`(value: String*): Self = StObject.set(x, "media-weight-metric-supported", js.Array(value :_*))
    
    inline def `setMessage-supported`(value: Double): Self = StObject.set(x, "message-supported", value.asInstanceOf[js.Any])
    
    inline def `setMessage-supportedUndefined`: Self = StObject.set(x, "message-supported", js.undefined)
    
    inline def `setMultiple-destination-uris-supported`(value: Boolean): Self = StObject.set(x, "multiple-destination-uris-supported", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-destination-uris-supportedUndefined`: Self = StObject.set(x, "multiple-destination-uris-supported", js.undefined)
    
    inline def `setMultiple-document-handling-default`(value: MultipleDocumentHandling): Self = StObject.set(x, "multiple-document-handling-default", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-document-handling-defaultUndefined`: Self = StObject.set(x, "multiple-document-handling-default", js.undefined)
    
    inline def `setMultiple-document-handling-supported`(value: js.Array[MultipleDocumentHandling]): Self = StObject.set(x, "multiple-document-handling-supported", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-document-handling-supportedUndefined`: Self = StObject.set(x, "multiple-document-handling-supported", js.undefined)
    
    inline def `setMultiple-document-handling-supportedVarargs`(value: MultipleDocumentHandling*): Self = StObject.set(x, "multiple-document-handling-supported", js.Array(value :_*))
    
    inline def `setMultiple-document-jobs-supported`(value: Boolean): Self = StObject.set(x, "multiple-document-jobs-supported", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-document-jobs-supportedUndefined`: Self = StObject.set(x, "multiple-document-jobs-supported", js.undefined)
    
    inline def `setMultiple-object-handling-default`(value: MultipleObjectHandling): Self = StObject.set(x, "multiple-object-handling-default", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-object-handling-defaultUndefined`: Self = StObject.set(x, "multiple-object-handling-default", js.undefined)
    
    inline def `setMultiple-object-handling-supported`(value: js.Array[MultipleObjectHandling]): Self = StObject.set(x, "multiple-object-handling-supported", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-object-handling-supportedUndefined`: Self = StObject.set(x, "multiple-object-handling-supported", js.undefined)
    
    inline def `setMultiple-object-handling-supportedVarargs`(value: MultipleObjectHandling*): Self = StObject.set(x, "multiple-object-handling-supported", js.Array(value :_*))
    
    inline def `setMultiple-operation-time-out`(value: Double): Self = StObject.set(x, "multiple-operation-time-out", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-operation-time-out-action`(value: `abort-job` | `hold-job_` | `process-job`): Self = StObject.set(x, "multiple-operation-time-out-action", value.asInstanceOf[js.Any])
    
    inline def `setMultiple-operation-time-out-actionUndefined`: Self = StObject.set(x, "multiple-operation-time-out-action", js.undefined)
    
    inline def `setMultiple-operation-time-outUndefined`: Self = StObject.set(x, "multiple-operation-time-out", js.undefined)
    
    inline def `setNatural-language-configured`(value: String): Self = StObject.set(x, "natural-language-configured", value.asInstanceOf[js.Any])
    
    inline def `setNatural-language-configuredUndefined`: Self = StObject.set(x, "natural-language-configured", js.undefined)
    
    inline def `setNotify-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "notify-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setNotify-attributes-supportedUndefined`: Self = StObject.set(x, "notify-attributes-supported", js.undefined)
    
    inline def `setNotify-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "notify-attributes-supported", js.Array(value :_*))
    
    inline def `setNotify-events-default`(value: js.Array[NotifyEvents]): Self = StObject.set(x, "notify-events-default", value.asInstanceOf[js.Any])
    
    inline def `setNotify-events-defaultUndefined`: Self = StObject.set(x, "notify-events-default", js.undefined)
    
    inline def `setNotify-events-defaultVarargs`(value: NotifyEvents*): Self = StObject.set(x, "notify-events-default", js.Array(value :_*))
    
    inline def `setNotify-events-supported`(value: js.Array[NotifyEvents]): Self = StObject.set(x, "notify-events-supported", value.asInstanceOf[js.Any])
    
    inline def `setNotify-events-supportedUndefined`: Self = StObject.set(x, "notify-events-supported", js.undefined)
    
    inline def `setNotify-events-supportedVarargs`(value: NotifyEvents*): Self = StObject.set(x, "notify-events-supported", js.Array(value :_*))
    
    inline def `setNotify-lease-duration-default`(value: Double): Self = StObject.set(x, "notify-lease-duration-default", value.asInstanceOf[js.Any])
    
    inline def `setNotify-lease-duration-defaultUndefined`: Self = StObject.set(x, "notify-lease-duration-default", js.undefined)
    
    inline def `setNotify-lease-duration-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "notify-lease-duration-supported", value.asInstanceOf[js.Any])
    
    inline def `setNotify-lease-duration-supportedUndefined`: Self = StObject.set(x, "notify-lease-duration-supported", js.undefined)
    
    inline def `setNotify-lease-duration-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "notify-lease-duration-supported", js.Array(value :_*))
    
    inline def `setNotify-pull-method-supported`(value: js.Array[ippget]): Self = StObject.set(x, "notify-pull-method-supported", value.asInstanceOf[js.Any])
    
    inline def `setNotify-pull-method-supportedUndefined`: Self = StObject.set(x, "notify-pull-method-supported", js.undefined)
    
    inline def `setNotify-pull-method-supportedVarargs`(value: ippget*): Self = StObject.set(x, "notify-pull-method-supported", js.Array(value :_*))
    
    inline def `setNotify-schemes-supported`(value: js.Array[UriSchemes]): Self = StObject.set(x, "notify-schemes-supported", value.asInstanceOf[js.Any])
    
    inline def `setNotify-schemes-supportedUndefined`: Self = StObject.set(x, "notify-schemes-supported", js.undefined)
    
    inline def `setNotify-schemes-supportedVarargs`(value: UriSchemes*): Self = StObject.set(x, "notify-schemes-supported", js.Array(value :_*))
    
    inline def `setNumber-of-retries-default`(value: Double): Self = StObject.set(x, "number-of-retries-default", value.asInstanceOf[js.Any])
    
    inline def `setNumber-of-retries-defaultUndefined`: Self = StObject.set(x, "number-of-retries-default", js.undefined)
    
    inline def `setNumber-of-retries-supported`(value: String): Self = StObject.set(x, "number-of-retries-supported", value.asInstanceOf[js.Any])
    
    inline def `setNumber-of-retries-supportedUndefined`: Self = StObject.set(x, "number-of-retries-supported", js.undefined)
    
    inline def `setNumber-up-default`(value: Double): Self = StObject.set(x, "number-up-default", value.asInstanceOf[js.Any])
    
    inline def `setNumber-up-defaultUndefined`: Self = StObject.set(x, "number-up-default", js.undefined)
    
    inline def `setNumber-up-supported`(value: Double | String): Self = StObject.set(x, "number-up-supported", value.asInstanceOf[js.Any])
    
    inline def `setNumber-up-supportedUndefined`: Self = StObject.set(x, "number-up-supported", js.undefined)
    
    inline def `setOauth-authorization-scope`(value: js.Array[String]): Self = StObject.set(x, "oauth-authorization-scope", value.asInstanceOf[js.Any])
    
    inline def `setOauth-authorization-scopeUndefined`: Self = StObject.set(x, "oauth-authorization-scope", js.undefined)
    
    inline def `setOauth-authorization-scopeVarargs`(value: String*): Self = StObject.set(x, "oauth-authorization-scope", js.Array(value :_*))
    
    inline def `setOauth-authorization-server-uri`(value: String): Self = StObject.set(x, "oauth-authorization-server-uri", value.asInstanceOf[js.Any])
    
    inline def `setOauth-authorization-server-uriUndefined`: Self = StObject.set(x, "oauth-authorization-server-uri", js.undefined)
    
    inline def `setOperations-supported`(value: js.Array[String]): Self = StObject.set(x, "operations-supported", value.asInstanceOf[js.Any])
    
    inline def `setOperations-supportedUndefined`: Self = StObject.set(x, "operations-supported", js.undefined)
    
    inline def `setOperations-supportedVarargs`(value: String*): Self = StObject.set(x, "operations-supported", js.Array(value :_*))
    
    inline def `setOrganization-name-supported`(value: Double): Self = StObject.set(x, "organization-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setOrganization-name-supportedUndefined`: Self = StObject.set(x, "organization-name-supported", js.undefined)
    
    inline def `setOrientation-requested-default`(value: OrientationRequested): Self = StObject.set(x, "orientation-requested-default", value.asInstanceOf[js.Any])
    
    inline def `setOrientation-requested-defaultUndefined`: Self = StObject.set(x, "orientation-requested-default", js.undefined)
    
    inline def `setOrientation-requested-supported`(value: js.Array[OrientationRequested]): Self = StObject.set(x, "orientation-requested-supported", value.asInstanceOf[js.Any])
    
    inline def `setOrientation-requested-supportedUndefined`: Self = StObject.set(x, "orientation-requested-supported", js.undefined)
    
    inline def `setOrientation-requested-supportedVarargs`(value: OrientationRequested*): Self = StObject.set(x, "orientation-requested-supported", js.Array(value :_*))
    
    inline def `setOutput-attributes-default`(value: OutputAttributes): Self = StObject.set(x, "output-attributes-default", value.asInstanceOf[js.Any])
    
    inline def `setOutput-attributes-defaultUndefined`: Self = StObject.set(x, "output-attributes-default", js.undefined)
    
    inline def `setOutput-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "output-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setOutput-attributes-supportedUndefined`: Self = StObject.set(x, "output-attributes-supported", js.undefined)
    
    inline def `setOutput-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "output-attributes-supported", js.Array(value :_*))
    
    inline def `setOutput-bin-default`(value: OutputBin): Self = StObject.set(x, "output-bin-default", value.asInstanceOf[js.Any])
    
    inline def `setOutput-bin-defaultUndefined`: Self = StObject.set(x, "output-bin-default", js.undefined)
    
    inline def `setOutput-bin-supported`(value: js.Array[OutputBin]): Self = StObject.set(x, "output-bin-supported", value.asInstanceOf[js.Any])
    
    inline def `setOutput-bin-supportedUndefined`: Self = StObject.set(x, "output-bin-supported", js.undefined)
    
    inline def `setOutput-bin-supportedVarargs`(value: OutputBin*): Self = StObject.set(x, "output-bin-supported", js.Array(value :_*))
    
    inline def `setOutput-device-supported`(value: js.Array[String]): Self = StObject.set(x, "output-device-supported", value.asInstanceOf[js.Any])
    
    inline def `setOutput-device-supportedUndefined`: Self = StObject.set(x, "output-device-supported", js.undefined)
    
    inline def `setOutput-device-supportedVarargs`(value: String*): Self = StObject.set(x, "output-device-supported", js.Array(value :_*))
    
    inline def `setOutput-device-uuid-supported`(value: js.Array[String]): Self = StObject.set(x, "output-device-uuid-supported", value.asInstanceOf[js.Any])
    
    inline def `setOutput-device-uuid-supportedUndefined`: Self = StObject.set(x, "output-device-uuid-supported", js.undefined)
    
    inline def `setOutput-device-uuid-supportedVarargs`(value: String*): Self = StObject.set(x, "output-device-uuid-supported", js.Array(value :_*))
    
    inline def `setOverrides-supported`(value: js.Array[Overrides]): Self = StObject.set(x, "overrides-supported", value.asInstanceOf[js.Any])
    
    inline def `setOverrides-supportedUndefined`: Self = StObject.set(x, "overrides-supported", js.undefined)
    
    inline def `setOverrides-supportedVarargs`(value: Overrides*): Self = StObject.set(x, "overrides-supported", js.Array(value :_*))
    
    inline def `setPage-delivery-default`(value: PageDelivery): Self = StObject.set(x, "page-delivery-default", value.asInstanceOf[js.Any])
    
    inline def `setPage-delivery-defaultUndefined`: Self = StObject.set(x, "page-delivery-default", js.undefined)
    
    inline def `setPage-delivery-supported`(value: js.Array[PageDelivery]): Self = StObject.set(x, "page-delivery-supported", value.asInstanceOf[js.Any])
    
    inline def `setPage-delivery-supportedUndefined`: Self = StObject.set(x, "page-delivery-supported", js.undefined)
    
    inline def `setPage-delivery-supportedVarargs`(value: PageDelivery*): Self = StObject.set(x, "page-delivery-supported", js.Array(value :_*))
    
    inline def `setPage-order-received-default`(value: PageOrder): Self = StObject.set(x, "page-order-received-default", value.asInstanceOf[js.Any])
    
    inline def `setPage-order-received-defaultUndefined`: Self = StObject.set(x, "page-order-received-default", js.undefined)
    
    inline def `setPage-order-received-supported`(value: js.Array[PageOrder]): Self = StObject.set(x, "page-order-received-supported", value.asInstanceOf[js.Any])
    
    inline def `setPage-order-received-supportedUndefined`: Self = StObject.set(x, "page-order-received-supported", js.undefined)
    
    inline def `setPage-order-received-supportedVarargs`(value: PageOrder*): Self = StObject.set(x, "page-order-received-supported", js.Array(value :_*))
    
    inline def `setPage-ranges-supported`(value: Boolean): Self = StObject.set(x, "page-ranges-supported", value.asInstanceOf[js.Any])
    
    inline def `setPage-ranges-supportedUndefined`: Self = StObject.set(x, "page-ranges-supported", js.undefined)
    
    inline def `setPages-per-subset-supported`(value: Boolean): Self = StObject.set(x, "pages-per-subset-supported", value.asInstanceOf[js.Any])
    
    inline def `setPages-per-subset-supportedUndefined`: Self = StObject.set(x, "pages-per-subset-supported", js.undefined)
    
    inline def `setParent-printers-supported`(value: js.Array[String]): Self = StObject.set(x, "parent-printers-supported", value.asInstanceOf[js.Any])
    
    inline def `setParent-printers-supportedUndefined`: Self = StObject.set(x, "parent-printers-supported", js.undefined)
    
    inline def `setParent-printers-supportedVarargs`(value: String*): Self = StObject.set(x, "parent-printers-supported", js.Array(value :_*))
    
    inline def `setPclm-raster-back-side`(value: flipped | normal | rotated): Self = StObject.set(x, "pclm-raster-back-side", value.asInstanceOf[js.Any])
    
    inline def `setPclm-raster-back-sideUndefined`: Self = StObject.set(x, "pclm-raster-back-side", js.undefined)
    
    inline def `setPclm-source-resolution-supported`(value: js.Array[Resolution]): Self = StObject.set(x, "pclm-source-resolution-supported", value.asInstanceOf[js.Any])
    
    inline def `setPclm-source-resolution-supportedUndefined`: Self = StObject.set(x, "pclm-source-resolution-supported", js.undefined)
    
    inline def `setPclm-source-resolution-supportedVarargs`(value: Resolution*): Self = StObject.set(x, "pclm-source-resolution-supported", js.Array(value :_*))
    
    inline def `setPclm-strip-height-preferred`(value: js.Array[Double]): Self = StObject.set(x, "pclm-strip-height-preferred", value.asInstanceOf[js.Any])
    
    inline def `setPclm-strip-height-preferredUndefined`: Self = StObject.set(x, "pclm-strip-height-preferred", js.undefined)
    
    inline def `setPclm-strip-height-preferredVarargs`(value: Double*): Self = StObject.set(x, "pclm-strip-height-preferred", js.Array(value :_*))
    
    inline def `setPclm-strip-height-supported`(value: Double): Self = StObject.set(x, "pclm-strip-height-supported", value.asInstanceOf[js.Any])
    
    inline def `setPclm-strip-height-supportedUndefined`: Self = StObject.set(x, "pclm-strip-height-supported", js.undefined)
    
    inline def `setPdf-features-supported`(value: js.Array[prc | u3d]): Self = StObject.set(x, "pdf-features-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdf-features-supportedUndefined`: Self = StObject.set(x, "pdf-features-supported", js.undefined)
    
    inline def `setPdf-features-supportedVarargs`(value: (prc | u3d)*): Self = StObject.set(x, "pdf-features-supported", js.Array(value :_*))
    
    inline def `setPdf-k-octets-supported`(value: String): Self = StObject.set(x, "pdf-k-octets-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdf-k-octets-supportedUndefined`: Self = StObject.set(x, "pdf-k-octets-supported", js.undefined)
    
    inline def `setPdf-versions-supported`(
      value: js.Array[
          `adobe-1Dot3` | `adobe-1Dot4` | `adobe-1Dot5` | `adobe-1Dot6` | `iso-15930-1_2001` | `iso-15930-3_2002` | `iso-15930-4_2003` | `iso-15930-6_2003` | `iso-15930-7_2010` | `iso-15930-8_2010` | `iso-16612-2_2010` | `iso-19005-1_2005` | `iso-19005-2_2011` | `iso-19005-3_2012` | `iso-32000-1_2008` | none | `pwg-5102Dot3`
        ]
    ): Self = StObject.set(x, "pdf-versions-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdf-versions-supportedUndefined`: Self = StObject.set(x, "pdf-versions-supported", js.undefined)
    
    inline def `setPdf-versions-supportedVarargs`(
      value: (`adobe-1Dot3` | `adobe-1Dot4` | `adobe-1Dot5` | `adobe-1Dot6` | `iso-15930-1_2001` | `iso-15930-3_2002` | `iso-15930-4_2003` | `iso-15930-6_2003` | `iso-15930-7_2010` | `iso-15930-8_2010` | `iso-16612-2_2010` | `iso-19005-1_2005` | `iso-19005-2_2011` | `iso-19005-3_2012` | `iso-32000-1_2008` | none | `pwg-5102Dot3`)*
    ): Self = StObject.set(x, "pdf-versions-supported", js.Array(value :_*))
    
    inline def `setPdl-init-file-default`(value: PdlInitFile): Self = StObject.set(x, "pdl-init-file-default", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-defaultUndefined`: Self = StObject.set(x, "pdl-init-file-default", js.undefined)
    
    inline def `setPdl-init-file-entry-supported`(value: js.Array[String]): Self = StObject.set(x, "pdl-init-file-entry-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-entry-supportedUndefined`: Self = StObject.set(x, "pdl-init-file-entry-supported", js.undefined)
    
    inline def `setPdl-init-file-entry-supportedVarargs`(value: String*): Self = StObject.set(x, "pdl-init-file-entry-supported", js.Array(value :_*))
    
    inline def `setPdl-init-file-location-supported`(value: js.Array[String]): Self = StObject.set(x, "pdl-init-file-location-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-location-supportedUndefined`: Self = StObject.set(x, "pdl-init-file-location-supported", js.undefined)
    
    inline def `setPdl-init-file-location-supportedVarargs`(value: String*): Self = StObject.set(x, "pdl-init-file-location-supported", js.Array(value :_*))
    
    inline def `setPdl-init-file-name-subdirectory-supported`(value: Boolean): Self = StObject.set(x, "pdl-init-file-name-subdirectory-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-name-subdirectory-supportedUndefined`: Self = StObject.set(x, "pdl-init-file-name-subdirectory-supported", js.undefined)
    
    inline def `setPdl-init-file-name-supported`(value: js.Array[String]): Self = StObject.set(x, "pdl-init-file-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-name-supportedUndefined`: Self = StObject.set(x, "pdl-init-file-name-supported", js.undefined)
    
    inline def `setPdl-init-file-name-supportedVarargs`(value: String*): Self = StObject.set(x, "pdl-init-file-name-supported", js.Array(value :_*))
    
    inline def `setPdl-init-file-supported`(value: js.Array[`pdl-init-file-entry` | `pdl-init-file-location` | `pdl-init-file-name`]): Self = StObject.set(x, "pdl-init-file-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-init-file-supportedUndefined`: Self = StObject.set(x, "pdl-init-file-supported", js.undefined)
    
    inline def `setPdl-init-file-supportedVarargs`(value: (`pdl-init-file-entry` | `pdl-init-file-location` | `pdl-init-file-name`)*): Self = StObject.set(x, "pdl-init-file-supported", js.Array(value :_*))
    
    inline def `setPdl-override-guaranteed-supported`(value: js.Array[String]): Self = StObject.set(x, "pdl-override-guaranteed-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-override-guaranteed-supportedUndefined`: Self = StObject.set(x, "pdl-override-guaranteed-supported", js.undefined)
    
    inline def `setPdl-override-guaranteed-supportedVarargs`(value: String*): Self = StObject.set(x, "pdl-override-guaranteed-supported", js.Array(value :_*))
    
    inline def `setPdl-override-supported`(value: attempted | guaranteed | `not-attempted`): Self = StObject.set(x, "pdl-override-supported", value.asInstanceOf[js.Any])
    
    inline def `setPdl-override-supportedUndefined`: Self = StObject.set(x, "pdl-override-supported", js.undefined)
    
    inline def `setPlatform-shape`(value: String): Self = StObject.set(x, "platform-shape", value.asInstanceOf[js.Any])
    
    inline def `setPlatform-shapeUndefined`: Self = StObject.set(x, "platform-shape", js.undefined)
    
    inline def `setPlatform-temperature-default`(value: Double): Self = StObject.set(x, "platform-temperature-default", value.asInstanceOf[js.Any])
    
    inline def `setPlatform-temperature-defaultUndefined`: Self = StObject.set(x, "platform-temperature-default", js.undefined)
    
    inline def `setPlatform-temperature-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "platform-temperature-supported", value.asInstanceOf[js.Any])
    
    inline def `setPlatform-temperature-supportedUndefined`: Self = StObject.set(x, "platform-temperature-supported", js.undefined)
    
    inline def `setPlatform-temperature-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "platform-temperature-supported", js.Array(value :_*))
    
    inline def `setPreferred-attributes-supported`(value: Boolean): Self = StObject.set(x, "preferred-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setPreferred-attributes-supportedUndefined`: Self = StObject.set(x, "preferred-attributes-supported", js.undefined)
    
    inline def `setPresentation-direction-number-up-default`(value: PresentationDirectionNumberUp): Self = StObject.set(x, "presentation-direction-number-up-default", value.asInstanceOf[js.Any])
    
    inline def `setPresentation-direction-number-up-defaultUndefined`: Self = StObject.set(x, "presentation-direction-number-up-default", js.undefined)
    
    inline def `setPresentation-direction-number-up-supported`(value: js.Array[PresentationDirectionNumberUp]): Self = StObject.set(x, "presentation-direction-number-up-supported", value.asInstanceOf[js.Any])
    
    inline def `setPresentation-direction-number-up-supportedUndefined`: Self = StObject.set(x, "presentation-direction-number-up-supported", js.undefined)
    
    inline def `setPresentation-direction-number-up-supportedVarargs`(value: PresentationDirectionNumberUp*): Self = StObject.set(x, "presentation-direction-number-up-supported", js.Array(value :_*))
    
    inline def `setPrint-accuracy-supported`(value: PrintAccuracySupported): Self = StObject.set(x, "print-accuracy-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-accuracy-supportedUndefined`: Self = StObject.set(x, "print-accuracy-supported", js.undefined)
    
    inline def `setPrint-base-default`(value: PrintBase): Self = StObject.set(x, "print-base-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-base-defaultUndefined`: Self = StObject.set(x, "print-base-default", js.undefined)
    
    inline def `setPrint-base-supported`(value: js.Array[PrintBase]): Self = StObject.set(x, "print-base-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-base-supportedUndefined`: Self = StObject.set(x, "print-base-supported", js.undefined)
    
    inline def `setPrint-base-supportedVarargs`(value: PrintBase*): Self = StObject.set(x, "print-base-supported", js.Array(value :_*))
    
    inline def `setPrint-color-mode-default`(value: PrintColorMode): Self = StObject.set(x, "print-color-mode-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-color-mode-defaultUndefined`: Self = StObject.set(x, "print-color-mode-default", js.undefined)
    
    inline def `setPrint-color-mode-supported`(value: js.Array[PrintColorMode]): Self = StObject.set(x, "print-color-mode-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-color-mode-supportedUndefined`: Self = StObject.set(x, "print-color-mode-supported", js.undefined)
    
    inline def `setPrint-color-mode-supportedVarargs`(value: PrintColorMode*): Self = StObject.set(x, "print-color-mode-supported", js.Array(value :_*))
    
    inline def `setPrint-content-optimize-default`(value: PrintContentOptimize): Self = StObject.set(x, "print-content-optimize-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-content-optimize-defaultUndefined`: Self = StObject.set(x, "print-content-optimize-default", js.undefined)
    
    inline def `setPrint-content-optimize-supported`(value: js.Array[PrintContentOptimize]): Self = StObject.set(x, "print-content-optimize-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-content-optimize-supportedUndefined`: Self = StObject.set(x, "print-content-optimize-supported", js.undefined)
    
    inline def `setPrint-content-optimize-supportedVarargs`(value: PrintContentOptimize*): Self = StObject.set(x, "print-content-optimize-supported", js.Array(value :_*))
    
    inline def `setPrint-objects-supported`(value: js.Array[`document-number` | `object-offset` | `object-size` | `object-uuid`]): Self = StObject.set(x, "print-objects-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-objects-supportedUndefined`: Self = StObject.set(x, "print-objects-supported", js.undefined)
    
    inline def `setPrint-objects-supportedVarargs`(value: (`document-number` | `object-offset` | `object-size` | `object-uuid`)*): Self = StObject.set(x, "print-objects-supported", js.Array(value :_*))
    
    inline def `setPrint-quality-default`(value: PrintQuality): Self = StObject.set(x, "print-quality-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-quality-defaultUndefined`: Self = StObject.set(x, "print-quality-default", js.undefined)
    
    inline def `setPrint-quality-supported`(value: js.Array[PrintQuality]): Self = StObject.set(x, "print-quality-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-quality-supportedUndefined`: Self = StObject.set(x, "print-quality-supported", js.undefined)
    
    inline def `setPrint-quality-supportedVarargs`(value: PrintQuality*): Self = StObject.set(x, "print-quality-supported", js.Array(value :_*))
    
    inline def `setPrint-rendering-intent-default`(value: PrintRenderingIntent): Self = StObject.set(x, "print-rendering-intent-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-rendering-intent-defaultUndefined`: Self = StObject.set(x, "print-rendering-intent-default", js.undefined)
    
    inline def `setPrint-rendering-intent-supported`(value: js.Array[PrintRenderingIntent]): Self = StObject.set(x, "print-rendering-intent-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-rendering-intent-supportedUndefined`: Self = StObject.set(x, "print-rendering-intent-supported", js.undefined)
    
    inline def `setPrint-rendering-intent-supportedVarargs`(value: PrintRenderingIntent*): Self = StObject.set(x, "print-rendering-intent-supported", js.Array(value :_*))
    
    inline def `setPrint-scaling-default`(value: PrintScaling): Self = StObject.set(x, "print-scaling-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-scaling-defaultUndefined`: Self = StObject.set(x, "print-scaling-default", js.undefined)
    
    inline def `setPrint-scaling-supported`(value: js.Array[PrintScaling]): Self = StObject.set(x, "print-scaling-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-scaling-supportedUndefined`: Self = StObject.set(x, "print-scaling-supported", js.undefined)
    
    inline def `setPrint-scaling-supportedVarargs`(value: PrintScaling*): Self = StObject.set(x, "print-scaling-supported", js.Array(value :_*))
    
    inline def `setPrint-supports-default`(value: PrintSupports): Self = StObject.set(x, "print-supports-default", value.asInstanceOf[js.Any])
    
    inline def `setPrint-supports-defaultUndefined`: Self = StObject.set(x, "print-supports-default", js.undefined)
    
    inline def `setPrint-supports-supported`(value: js.Array[PrintSupports]): Self = StObject.set(x, "print-supports-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrint-supports-supportedUndefined`: Self = StObject.set(x, "print-supports-supported", js.undefined)
    
    inline def `setPrint-supports-supportedVarargs`(value: PrintSupports*): Self = StObject.set(x, "print-supports-supported", js.Array(value :_*))
    
    inline def `setPrinter-camera-image-uri`(value: js.Array[String]): Self = StObject.set(x, "printer-camera-image-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-camera-image-uriUndefined`: Self = StObject.set(x, "printer-camera-image-uri", js.undefined)
    
    inline def `setPrinter-camera-image-uriVarargs`(value: String*): Self = StObject.set(x, "printer-camera-image-uri", js.Array(value :_*))
    
    inline def `setPrinter-charge-info`(value: String): Self = StObject.set(x, "printer-charge-info", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-charge-info-uri`(value: String): Self = StObject.set(x, "printer-charge-info-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-charge-info-uriUndefined`: Self = StObject.set(x, "printer-charge-info-uri", js.undefined)
    
    inline def `setPrinter-charge-infoUndefined`: Self = StObject.set(x, "printer-charge-info", js.undefined)
    
    inline def `setPrinter-contact-col`(value: PrinterContact): Self = StObject.set(x, "printer-contact-col", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-contact-colUndefined`: Self = StObject.set(x, "printer-contact-col", js.undefined)
    
    inline def `setPrinter-current-time`(value: String): Self = StObject.set(x, "printer-current-time", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-current-timeUndefined`: Self = StObject.set(x, "printer-current-time", js.undefined)
    
    inline def `setPrinter-device-id`(value: String): Self = StObject.set(x, "printer-device-id", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-device-idUndefined`: Self = StObject.set(x, "printer-device-id", js.undefined)
    
    inline def `setPrinter-dns-sd-name`(value: String): Self = StObject.set(x, "printer-dns-sd-name", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-dns-sd-nameUndefined`: Self = StObject.set(x, "printer-dns-sd-name", js.undefined)
    
    inline def `setPrinter-driver-installer`(value: String): Self = StObject.set(x, "printer-driver-installer", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-driver-installerUndefined`: Self = StObject.set(x, "printer-driver-installer", js.undefined)
    
    inline def `setPrinter-fax-log-uri`(value: String): Self = StObject.set(x, "printer-fax-log-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-fax-log-uriUndefined`: Self = StObject.set(x, "printer-fax-log-uri", js.undefined)
    
    inline def `setPrinter-fax-modem-info`(value: js.Array[String]): Self = StObject.set(x, "printer-fax-modem-info", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-fax-modem-infoUndefined`: Self = StObject.set(x, "printer-fax-modem-info", js.undefined)
    
    inline def `setPrinter-fax-modem-infoVarargs`(value: String*): Self = StObject.set(x, "printer-fax-modem-info", js.Array(value :_*))
    
    inline def `setPrinter-fax-modem-name`(value: js.Array[String]): Self = StObject.set(x, "printer-fax-modem-name", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-fax-modem-nameUndefined`: Self = StObject.set(x, "printer-fax-modem-name", js.undefined)
    
    inline def `setPrinter-fax-modem-nameVarargs`(value: String*): Self = StObject.set(x, "printer-fax-modem-name", js.Array(value :_*))
    
    inline def `setPrinter-fax-modem-number`(value: js.Array[String]): Self = StObject.set(x, "printer-fax-modem-number", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-fax-modem-numberUndefined`: Self = StObject.set(x, "printer-fax-modem-number", js.undefined)
    
    inline def `setPrinter-fax-modem-numberVarargs`(value: String*): Self = StObject.set(x, "printer-fax-modem-number", js.Array(value :_*))
    
    inline def `setPrinter-geo-location`(value: String): Self = StObject.set(x, "printer-geo-location", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-geo-locationUndefined`: Self = StObject.set(x, "printer-geo-location", js.undefined)
    
    inline def `setPrinter-get-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
        ]
    ): Self = StObject.set(x, "printer-get-attributes-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-get-attributes-supportedUndefined`: Self = StObject.set(x, "printer-get-attributes-supported", js.undefined)
    
    inline def `setPrinter-get-attributes-supportedVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any)*
    ): Self = StObject.set(x, "printer-get-attributes-supported", js.Array(value :_*))
    
    inline def `setPrinter-icc-profiles`(value: js.Array[PrinterIccProfiles]): Self = StObject.set(x, "printer-icc-profiles", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-icc-profilesUndefined`: Self = StObject.set(x, "printer-icc-profiles", js.undefined)
    
    inline def `setPrinter-icc-profilesVarargs`(value: PrinterIccProfiles*): Self = StObject.set(x, "printer-icc-profiles", js.Array(value :_*))
    
    inline def `setPrinter-icons`(value: js.Array[String]): Self = StObject.set(x, "printer-icons", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-iconsUndefined`: Self = StObject.set(x, "printer-icons", js.undefined)
    
    inline def `setPrinter-iconsVarargs`(value: String*): Self = StObject.set(x, "printer-icons", js.Array(value :_*))
    
    inline def `setPrinter-info`(value: String): Self = StObject.set(x, "printer-info", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-infoUndefined`: Self = StObject.set(x, "printer-info", js.undefined)
    
    inline def `setPrinter-kind`(value: js.Array[PrinterKind]): Self = StObject.set(x, "printer-kind", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-kindUndefined`: Self = StObject.set(x, "printer-kind", js.undefined)
    
    inline def `setPrinter-kindVarargs`(value: PrinterKind*): Self = StObject.set(x, "printer-kind", js.Array(value :_*))
    
    inline def `setPrinter-location`(value: String): Self = StObject.set(x, "printer-location", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-locationUndefined`: Self = StObject.set(x, "printer-location", js.undefined)
    
    inline def `setPrinter-make-and-model`(value: String): Self = StObject.set(x, "printer-make-and-model", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-make-and-modelUndefined`: Self = StObject.set(x, "printer-make-and-model", js.undefined)
    
    inline def `setPrinter-mandatory-job-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any
        ]
    ): Self = StObject.set(x, "printer-mandatory-job-attributes", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-mandatory-job-attributesUndefined`: Self = StObject.set(x, "printer-mandatory-job-attributes", js.undefined)
    
    inline def `setPrinter-mandatory-job-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 203 */ js.Any)*
    ): Self = StObject.set(x, "printer-mandatory-job-attributes", js.Array(value :_*))
    
    inline def `setPrinter-more-info-manufacturer`(value: String): Self = StObject.set(x, "printer-more-info-manufacturer", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-more-info-manufacturerUndefined`: Self = StObject.set(x, "printer-more-info-manufacturer", js.undefined)
    
    inline def `setPrinter-name`(value: String): Self = StObject.set(x, "printer-name", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-nameUndefined`: Self = StObject.set(x, "printer-name", js.undefined)
    
    inline def `setPrinter-organization`(value: js.Array[String]): Self = StObject.set(x, "printer-organization", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-organizationUndefined`: Self = StObject.set(x, "printer-organization", js.undefined)
    
    inline def `setPrinter-organizationVarargs`(value: String*): Self = StObject.set(x, "printer-organization", js.Array(value :_*))
    
    inline def `setPrinter-organizational-unit`(value: js.Array[String]): Self = StObject.set(x, "printer-organizational-unit", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-organizational-unitUndefined`: Self = StObject.set(x, "printer-organizational-unit", js.undefined)
    
    inline def `setPrinter-organizational-unitVarargs`(value: String*): Self = StObject.set(x, "printer-organizational-unit", js.Array(value :_*))
    
    inline def `setPrinter-privacy-policy-uri`(value: String): Self = StObject.set(x, "printer-privacy-policy-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-privacy-policy-uriUndefined`: Self = StObject.set(x, "printer-privacy-policy-uri", js.undefined)
    
    inline def `setPrinter-resolution-default`(value: Resolution): Self = StObject.set(x, "printer-resolution-default", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-resolution-defaultUndefined`: Self = StObject.set(x, "printer-resolution-default", js.undefined)
    
    inline def `setPrinter-resolution-supported`(value: Resolution): Self = StObject.set(x, "printer-resolution-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-resolution-supportedUndefined`: Self = StObject.set(x, "printer-resolution-supported", js.undefined)
    
    inline def `setPrinter-static-resource-directory-uri`(value: String): Self = StObject.set(x, "printer-static-resource-directory-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-static-resource-directory-uriUndefined`: Self = StObject.set(x, "printer-static-resource-directory-uri", js.undefined)
    
    inline def `setPrinter-static-resource-k-octets-supported`(value: Double): Self = StObject.set(x, "printer-static-resource-k-octets-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-static-resource-k-octets-supportedUndefined`: Self = StObject.set(x, "printer-static-resource-k-octets-supported", js.undefined)
    
    inline def `setPrinter-strings-languages-supported`(value: js.Array[String]): Self = StObject.set(x, "printer-strings-languages-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-strings-languages-supportedUndefined`: Self = StObject.set(x, "printer-strings-languages-supported", js.undefined)
    
    inline def `setPrinter-strings-languages-supportedVarargs`(value: String*): Self = StObject.set(x, "printer-strings-languages-supported", js.Array(value :_*))
    
    inline def `setPrinter-strings-uri`(value: String): Self = StObject.set(x, "printer-strings-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-strings-uriUndefined`: Self = StObject.set(x, "printer-strings-uri", js.undefined)
    
    inline def `setPrinter-volume-supported`(value: PrinterVolumeSupported): Self = StObject.set(x, "printer-volume-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-volume-supportedUndefined`: Self = StObject.set(x, "printer-volume-supported", js.undefined)
    
    inline def `setPrinter-xri-supported`(value: js.Array[PrinterXri]): Self = StObject.set(x, "printer-xri-supported", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-xri-supportedUndefined`: Self = StObject.set(x, "printer-xri-supported", js.undefined)
    
    inline def `setPrinter-xri-supportedVarargs`(value: PrinterXri*): Self = StObject.set(x, "printer-xri-supported", js.Array(value :_*))
    
    inline def `setProof-print-default`(value: ProofPrint): Self = StObject.set(x, "proof-print-default", value.asInstanceOf[js.Any])
    
    inline def `setProof-print-defaultUndefined`: Self = StObject.set(x, "proof-print-default", js.undefined)
    
    inline def `setProof-print-supported`(value: js.Array[media | `media-col` | `proof-print-copies`]): Self = StObject.set(x, "proof-print-supported", value.asInstanceOf[js.Any])
    
    inline def `setProof-print-supportedUndefined`: Self = StObject.set(x, "proof-print-supported", js.undefined)
    
    inline def `setProof-print-supportedVarargs`(value: (media | `media-col` | `proof-print-copies`)*): Self = StObject.set(x, "proof-print-supported", js.Array(value :_*))
    
    inline def `setPunching-hole-diameter-configured`(value: Double): Self = StObject.set(x, "punching-hole-diameter-configured", value.asInstanceOf[js.Any])
    
    inline def `setPunching-hole-diameter-configuredUndefined`: Self = StObject.set(x, "punching-hole-diameter-configured", js.undefined)
    
    inline def `setPunching-locations-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "punching-locations-supported", value.asInstanceOf[js.Any])
    
    inline def `setPunching-locations-supportedUndefined`: Self = StObject.set(x, "punching-locations-supported", js.undefined)
    
    inline def `setPunching-locations-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "punching-locations-supported", js.Array(value :_*))
    
    inline def `setPunching-offset-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "punching-offset-supported", value.asInstanceOf[js.Any])
    
    inline def `setPunching-offset-supportedUndefined`: Self = StObject.set(x, "punching-offset-supported", js.undefined)
    
    inline def `setPunching-offset-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "punching-offset-supported", js.Array(value :_*))
    
    inline def `setPunching-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = StObject.set(x, "punching-reference-edge-supported", value.asInstanceOf[js.Any])
    
    inline def `setPunching-reference-edge-supportedUndefined`: Self = StObject.set(x, "punching-reference-edge-supported", js.undefined)
    
    inline def `setPunching-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = StObject.set(x, "punching-reference-edge-supported", js.Array(value :_*))
    
    inline def `setPwg-raster-document-resolution-supported`(value: js.Array[Resolution]): Self = StObject.set(x, "pwg-raster-document-resolution-supported", value.asInstanceOf[js.Any])
    
    inline def `setPwg-raster-document-resolution-supportedUndefined`: Self = StObject.set(x, "pwg-raster-document-resolution-supported", js.undefined)
    
    inline def `setPwg-raster-document-resolution-supportedVarargs`(value: Resolution*): Self = StObject.set(x, "pwg-raster-document-resolution-supported", js.Array(value :_*))
    
    inline def `setPwg-raster-document-sheet-back`(value: flipped | `manual-tumble` | normal | rotated): Self = StObject.set(x, "pwg-raster-document-sheet-back", value.asInstanceOf[js.Any])
    
    inline def `setPwg-raster-document-sheet-backUndefined`: Self = StObject.set(x, "pwg-raster-document-sheet-back", js.undefined)
    
    inline def `setPwg-raster-document-type-supported`(value: js.Array[PwgRasterDocumentTypeSupported]): Self = StObject.set(x, "pwg-raster-document-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setPwg-raster-document-type-supportedUndefined`: Self = StObject.set(x, "pwg-raster-document-type-supported", js.undefined)
    
    inline def `setPwg-raster-document-type-supportedVarargs`(value: PwgRasterDocumentTypeSupported*): Self = StObject.set(x, "pwg-raster-document-type-supported", js.Array(value :_*))
    
    inline def `setPwg-safe-gcode-supported`(value: js.Array[String]): Self = StObject.set(x, "pwg-safe-gcode-supported", value.asInstanceOf[js.Any])
    
    inline def `setPwg-safe-gcode-supportedUndefined`: Self = StObject.set(x, "pwg-safe-gcode-supported", js.undefined)
    
    inline def `setPwg-safe-gcode-supportedVarargs`(value: String*): Self = StObject.set(x, "pwg-safe-gcode-supported", js.Array(value :_*))
    
    inline def `setReference-uri-schemes-supported`(value: js.Array[UriSchemes]): Self = StObject.set(x, "reference-uri-schemes-supported", value.asInstanceOf[js.Any])
    
    inline def `setReference-uri-schemes-supportedUndefined`: Self = StObject.set(x, "reference-uri-schemes-supported", js.undefined)
    
    inline def `setReference-uri-schemes-supportedVarargs`(value: UriSchemes*): Self = StObject.set(x, "reference-uri-schemes-supported", js.Array(value :_*))
    
    inline def `setRepertoire-supported`(value: js.Array[String]): Self = StObject.set(x, "repertoire-supported", value.asInstanceOf[js.Any])
    
    inline def `setRepertoire-supportedUndefined`: Self = StObject.set(x, "repertoire-supported", js.undefined)
    
    inline def `setRepertoire-supportedVarargs`(value: String*): Self = StObject.set(x, "repertoire-supported", js.Array(value :_*))
    
    inline def `setRequesting-user-uri-supported`(value: Boolean): Self = StObject.set(x, "requesting-user-uri-supported", value.asInstanceOf[js.Any])
    
    inline def `setRequesting-user-uri-supportedUndefined`: Self = StObject.set(x, "requesting-user-uri-supported", js.undefined)
    
    inline def `setRetry-interval-default`(value: Double): Self = StObject.set(x, "retry-interval-default", value.asInstanceOf[js.Any])
    
    inline def `setRetry-interval-defaultUndefined`: Self = StObject.set(x, "retry-interval-default", js.undefined)
    
    inline def `setRetry-interval-supported`(value: String): Self = StObject.set(x, "retry-interval-supported", value.asInstanceOf[js.Any])
    
    inline def `setRetry-interval-supportedUndefined`: Self = StObject.set(x, "retry-interval-supported", js.undefined)
    
    inline def `setRetry-time-out-default`(value: Double): Self = StObject.set(x, "retry-time-out-default", value.asInstanceOf[js.Any])
    
    inline def `setRetry-time-out-defaultUndefined`: Self = StObject.set(x, "retry-time-out-default", js.undefined)
    
    inline def `setRetry-time-out-supported`(value: String): Self = StObject.set(x, "retry-time-out-supported", value.asInstanceOf[js.Any])
    
    inline def `setRetry-time-out-supportedUndefined`: Self = StObject.set(x, "retry-time-out-supported", js.undefined)
    
    inline def `setSave-disposition-supported`(value: js.Array[SaveDisposition]): Self = StObject.set(x, "save-disposition-supported", value.asInstanceOf[js.Any])
    
    inline def `setSave-disposition-supportedUndefined`: Self = StObject.set(x, "save-disposition-supported", js.undefined)
    
    inline def `setSave-disposition-supportedVarargs`(value: SaveDisposition*): Self = StObject.set(x, "save-disposition-supported", js.Array(value :_*))
    
    inline def `setSave-document-format-default`(value: MimeMediaType): Self = StObject.set(x, "save-document-format-default", value.asInstanceOf[js.Any])
    
    inline def `setSave-document-format-defaultUndefined`: Self = StObject.set(x, "save-document-format-default", js.undefined)
    
    inline def `setSave-document-format-supported`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "save-document-format-supported", value.asInstanceOf[js.Any])
    
    inline def `setSave-document-format-supportedUndefined`: Self = StObject.set(x, "save-document-format-supported", js.undefined)
    
    inline def `setSave-document-format-supportedVarargs`(value: MimeMediaType*): Self = StObject.set(x, "save-document-format-supported", js.Array(value :_*))
    
    inline def `setSave-location-default`(value: String): Self = StObject.set(x, "save-location-default", value.asInstanceOf[js.Any])
    
    inline def `setSave-location-defaultUndefined`: Self = StObject.set(x, "save-location-default", js.undefined)
    
    inline def `setSave-location-supported`(value: js.Array[String]): Self = StObject.set(x, "save-location-supported", value.asInstanceOf[js.Any])
    
    inline def `setSave-location-supportedUndefined`: Self = StObject.set(x, "save-location-supported", js.undefined)
    
    inline def `setSave-location-supportedVarargs`(value: String*): Self = StObject.set(x, "save-location-supported", js.Array(value :_*))
    
    inline def `setSave-name-subdirectory-supported`(value: Boolean): Self = StObject.set(x, "save-name-subdirectory-supported", value.asInstanceOf[js.Any])
    
    inline def `setSave-name-subdirectory-supportedUndefined`: Self = StObject.set(x, "save-name-subdirectory-supported", js.undefined)
    
    inline def `setSave-name-supported`(value: Boolean): Self = StObject.set(x, "save-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setSave-name-supportedUndefined`: Self = StObject.set(x, "save-name-supported", js.undefined)
    
    inline def `setSeparator-sheets-default`(value: SeparatorSheets): Self = StObject.set(x, "separator-sheets-default", value.asInstanceOf[js.Any])
    
    inline def `setSeparator-sheets-defaultUndefined`: Self = StObject.set(x, "separator-sheets-default", js.undefined)
    
    inline def `setSeparator-sheets-supported`(value: js.Array[SeparatorSheetsType]): Self = StObject.set(x, "separator-sheets-supported", value.asInstanceOf[js.Any])
    
    inline def `setSeparator-sheets-supportedUndefined`: Self = StObject.set(x, "separator-sheets-supported", js.undefined)
    
    inline def `setSeparator-sheets-supportedVarargs`(value: SeparatorSheetsType*): Self = StObject.set(x, "separator-sheets-supported", js.Array(value :_*))
    
    inline def `setSides-default`(value: Sides): Self = StObject.set(x, "sides-default", value.asInstanceOf[js.Any])
    
    inline def `setSides-defaultUndefined`: Self = StObject.set(x, "sides-default", js.undefined)
    
    inline def `setSides-supported`(value: js.Array[Sides]): Self = StObject.set(x, "sides-supported", value.asInstanceOf[js.Any])
    
    inline def `setSides-supportedUndefined`: Self = StObject.set(x, "sides-supported", js.undefined)
    
    inline def `setSides-supportedVarargs`(value: Sides*): Self = StObject.set(x, "sides-supported", js.Array(value :_*))
    
    inline def `setSmi2699-auth-print-group`(value: String): Self = StObject.set(x, "smi2699-auth-print-group", value.asInstanceOf[js.Any])
    
    inline def `setSmi2699-auth-print-groupUndefined`: Self = StObject.set(x, "smi2699-auth-print-group", js.undefined)
    
    inline def `setSmi2699-auth-proxy-group`(value: String): Self = StObject.set(x, "smi2699-auth-proxy-group", value.asInstanceOf[js.Any])
    
    inline def `setSmi2699-auth-proxy-groupUndefined`: Self = StObject.set(x, "smi2699-auth-proxy-group", js.undefined)
    
    inline def `setSmi2699-device-command`(value: String): Self = StObject.set(x, "smi2699-device-command", value.asInstanceOf[js.Any])
    
    inline def `setSmi2699-device-commandUndefined`: Self = StObject.set(x, "smi2699-device-command", js.undefined)
    
    inline def `setSmi2699-device-format`(value: MimeMediaType): Self = StObject.set(x, "smi2699-device-format", value.asInstanceOf[js.Any])
    
    inline def `setSmi2699-device-formatUndefined`: Self = StObject.set(x, "smi2699-device-format", js.undefined)
    
    inline def `setSmi2699-device-name`(value: String): Self = StObject.set(x, "smi2699-device-name", value.asInstanceOf[js.Any])
    
    inline def `setSmi2699-device-nameUndefined`: Self = StObject.set(x, "smi2699-device-name", js.undefined)
    
    inline def `setSmi2699-device-uri`(value: String): Self = StObject.set(x, "smi2699-device-uri", value.asInstanceOf[js.Any])
    
    inline def `setSmi2699-device-uriUndefined`: Self = StObject.set(x, "smi2699-device-uri", js.undefined)
    
    inline def `setStitching-angle-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "stitching-angle-supported", value.asInstanceOf[js.Any])
    
    inline def `setStitching-angle-supportedUndefined`: Self = StObject.set(x, "stitching-angle-supported", js.undefined)
    
    inline def `setStitching-angle-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "stitching-angle-supported", js.Array(value :_*))
    
    inline def `setStitching-locations-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "stitching-locations-supported", value.asInstanceOf[js.Any])
    
    inline def `setStitching-locations-supportedUndefined`: Self = StObject.set(x, "stitching-locations-supported", js.undefined)
    
    inline def `setStitching-locations-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "stitching-locations-supported", js.Array(value :_*))
    
    inline def `setStitching-method-supported`(value: js.Array[StitchingMethod]): Self = StObject.set(x, "stitching-method-supported", value.asInstanceOf[js.Any])
    
    inline def `setStitching-method-supportedUndefined`: Self = StObject.set(x, "stitching-method-supported", js.undefined)
    
    inline def `setStitching-method-supportedVarargs`(value: StitchingMethod*): Self = StObject.set(x, "stitching-method-supported", js.Array(value :_*))
    
    inline def `setStitching-offset-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "stitching-offset-supported", value.asInstanceOf[js.Any])
    
    inline def `setStitching-offset-supportedUndefined`: Self = StObject.set(x, "stitching-offset-supported", js.undefined)
    
    inline def `setStitching-offset-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "stitching-offset-supported", js.Array(value :_*))
    
    inline def `setStitching-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = StObject.set(x, "stitching-reference-edge-supported", value.asInstanceOf[js.Any])
    
    inline def `setStitching-reference-edge-supportedUndefined`: Self = StObject.set(x, "stitching-reference-edge-supported", js.undefined)
    
    inline def `setStitching-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = StObject.set(x, "stitching-reference-edge-supported", js.Array(value :_*))
    
    inline def `setSubject-supported`(value: Double): Self = StObject.set(x, "subject-supported", value.asInstanceOf[js.Any])
    
    inline def `setSubject-supportedUndefined`: Self = StObject.set(x, "subject-supported", js.undefined)
    
    inline def `setSubordinate-printers-supported`(value: js.Array[String]): Self = StObject.set(x, "subordinate-printers-supported", value.asInstanceOf[js.Any])
    
    inline def `setSubordinate-printers-supportedUndefined`: Self = StObject.set(x, "subordinate-printers-supported", js.undefined)
    
    inline def `setSubordinate-printers-supportedVarargs`(value: String*): Self = StObject.set(x, "subordinate-printers-supported", js.Array(value :_*))
    
    inline def `setSubscription-privacy-attributes`(value: js.Array[String]): Self = StObject.set(x, "subscription-privacy-attributes", value.asInstanceOf[js.Any])
    
    inline def `setSubscription-privacy-attributesUndefined`: Self = StObject.set(x, "subscription-privacy-attributes", js.undefined)
    
    inline def `setSubscription-privacy-attributesVarargs`(value: String*): Self = StObject.set(x, "subscription-privacy-attributes", js.Array(value :_*))
    
    inline def `setSubscription-privacy-scope`(value: String): Self = StObject.set(x, "subscription-privacy-scope", value.asInstanceOf[js.Any])
    
    inline def `setSubscription-privacy-scopeUndefined`: Self = StObject.set(x, "subscription-privacy-scope", js.undefined)
    
    inline def `setTo-name-supported`(value: Double): Self = StObject.set(x, "to-name-supported", value.asInstanceOf[js.Any])
    
    inline def `setTo-name-supportedUndefined`: Self = StObject.set(x, "to-name-supported", js.undefined)
    
    inline def `setTrimming-offset-supported`(value: js.Array[Double | String]): Self = StObject.set(x, "trimming-offset-supported", value.asInstanceOf[js.Any])
    
    inline def `setTrimming-offset-supportedUndefined`: Self = StObject.set(x, "trimming-offset-supported", js.undefined)
    
    inline def `setTrimming-offset-supportedVarargs`(value: (Double | String)*): Self = StObject.set(x, "trimming-offset-supported", js.Array(value :_*))
    
    inline def `setTrimming-reference-edge-supported`(value: js.Array[ReferenceEdge]): Self = StObject.set(x, "trimming-reference-edge-supported", value.asInstanceOf[js.Any])
    
    inline def `setTrimming-reference-edge-supportedUndefined`: Self = StObject.set(x, "trimming-reference-edge-supported", js.undefined)
    
    inline def `setTrimming-reference-edge-supportedVarargs`(value: ReferenceEdge*): Self = StObject.set(x, "trimming-reference-edge-supported", js.Array(value :_*))
    
    inline def `setTrimming-type-supported`(value: js.Array[TrimmingType]): Self = StObject.set(x, "trimming-type-supported", value.asInstanceOf[js.Any])
    
    inline def `setTrimming-type-supportedUndefined`: Self = StObject.set(x, "trimming-type-supported", js.undefined)
    
    inline def `setTrimming-type-supportedVarargs`(value: TrimmingType*): Self = StObject.set(x, "trimming-type-supported", js.Array(value :_*))
    
    inline def `setTrimming-when-supported`(value: js.Array[String]): Self = StObject.set(x, "trimming-when-supported", value.asInstanceOf[js.Any])
    
    inline def `setTrimming-when-supportedUndefined`: Self = StObject.set(x, "trimming-when-supported", js.undefined)
    
    inline def `setTrimming-when-supportedVarargs`(value: String*): Self = StObject.set(x, "trimming-when-supported", js.Array(value :_*))
    
    inline def `setUri-authentication-supported`(value: js.Array[basic | certificate | digest | negotiate | none | `requesting-user-name`]): Self = StObject.set(x, "uri-authentication-supported", value.asInstanceOf[js.Any])
    
    inline def `setUri-authentication-supportedUndefined`: Self = StObject.set(x, "uri-authentication-supported", js.undefined)
    
    inline def `setUri-authentication-supportedVarargs`(value: (basic | certificate | digest | negotiate | none | `requesting-user-name`)*): Self = StObject.set(x, "uri-authentication-supported", js.Array(value :_*))
    
    inline def `setUri-security-supported`(value: js.Array[none | ssl3 | tls]): Self = StObject.set(x, "uri-security-supported", value.asInstanceOf[js.Any])
    
    inline def `setUri-security-supportedUndefined`: Self = StObject.set(x, "uri-security-supported", js.undefined)
    
    inline def `setUri-security-supportedVarargs`(value: (none | ssl3 | tls)*): Self = StObject.set(x, "uri-security-supported", js.Array(value :_*))
    
    inline def `setUser-defined-values-supported`(value: js.Array[String]): Self = StObject.set(x, "user-defined-values-supported", value.asInstanceOf[js.Any])
    
    inline def `setUser-defined-values-supportedUndefined`: Self = StObject.set(x, "user-defined-values-supported", js.undefined)
    
    inline def `setUser-defined-values-supportedVarargs`(value: String*): Self = StObject.set(x, "user-defined-values-supported", js.Array(value :_*))
    
    inline def `setWhich-jobs-supported`(value: js.Array[WhichJobs]): Self = StObject.set(x, "which-jobs-supported", value.asInstanceOf[js.Any])
    
    inline def `setWhich-jobs-supportedUndefined`: Self = StObject.set(x, "which-jobs-supported", js.undefined)
    
    inline def `setWhich-jobs-supportedVarargs`(value: WhichJobs*): Self = StObject.set(x, "which-jobs-supported", js.Array(value :_*))
    
    inline def `setX-image-position-default`(value: XImagePosition): Self = StObject.set(x, "x-image-position-default", value.asInstanceOf[js.Any])
    
    inline def `setX-image-position-defaultUndefined`: Self = StObject.set(x, "x-image-position-default", js.undefined)
    
    inline def `setX-image-position-supported`(value: js.Array[XImagePosition]): Self = StObject.set(x, "x-image-position-supported", value.asInstanceOf[js.Any])
    
    inline def `setX-image-position-supportedUndefined`: Self = StObject.set(x, "x-image-position-supported", js.undefined)
    
    inline def `setX-image-position-supportedVarargs`(value: XImagePosition*): Self = StObject.set(x, "x-image-position-supported", js.Array(value :_*))
    
    inline def `setX-image-shift-default`(value: Double): Self = StObject.set(x, "x-image-shift-default", value.asInstanceOf[js.Any])
    
    inline def `setX-image-shift-defaultUndefined`: Self = StObject.set(x, "x-image-shift-default", js.undefined)
    
    inline def `setX-image-shift-supported`(value: String): Self = StObject.set(x, "x-image-shift-supported", value.asInstanceOf[js.Any])
    
    inline def `setX-image-shift-supportedUndefined`: Self = StObject.set(x, "x-image-shift-supported", js.undefined)
    
    inline def `setX-side1-image-shift-default`(value: Double): Self = StObject.set(x, "x-side1-image-shift-default", value.asInstanceOf[js.Any])
    
    inline def `setX-side1-image-shift-defaultUndefined`: Self = StObject.set(x, "x-side1-image-shift-default", js.undefined)
    
    inline def `setX-side1-image-shift-supported`(value: String): Self = StObject.set(x, "x-side1-image-shift-supported", value.asInstanceOf[js.Any])
    
    inline def `setX-side1-image-shift-supportedUndefined`: Self = StObject.set(x, "x-side1-image-shift-supported", js.undefined)
    
    inline def `setX-side2-image-shift-default`(value: Double): Self = StObject.set(x, "x-side2-image-shift-default", value.asInstanceOf[js.Any])
    
    inline def `setX-side2-image-shift-defaultUndefined`: Self = StObject.set(x, "x-side2-image-shift-default", js.undefined)
    
    inline def `setX-side2-image-shift-supported`(value: String): Self = StObject.set(x, "x-side2-image-shift-supported", value.asInstanceOf[js.Any])
    
    inline def `setX-side2-image-shift-supportedUndefined`: Self = StObject.set(x, "x-side2-image-shift-supported", js.undefined)
    
    inline def `setY-image-position-default`(value: YImagePosition): Self = StObject.set(x, "y-image-position-default", value.asInstanceOf[js.Any])
    
    inline def `setY-image-position-defaultUndefined`: Self = StObject.set(x, "y-image-position-default", js.undefined)
    
    inline def `setY-image-position-supported`(value: js.Array[YImagePosition]): Self = StObject.set(x, "y-image-position-supported", value.asInstanceOf[js.Any])
    
    inline def `setY-image-position-supportedUndefined`: Self = StObject.set(x, "y-image-position-supported", js.undefined)
    
    inline def `setY-image-position-supportedVarargs`(value: YImagePosition*): Self = StObject.set(x, "y-image-position-supported", js.Array(value :_*))
    
    inline def `setY-image-shift-default`(value: Double): Self = StObject.set(x, "y-image-shift-default", value.asInstanceOf[js.Any])
    
    inline def `setY-image-shift-defaultUndefined`: Self = StObject.set(x, "y-image-shift-default", js.undefined)
    
    inline def `setY-image-shift-supported`(value: String): Self = StObject.set(x, "y-image-shift-supported", value.asInstanceOf[js.Any])
    
    inline def `setY-image-shift-supportedUndefined`: Self = StObject.set(x, "y-image-shift-supported", js.undefined)
    
    inline def `setY-side1-image-shift-default`(value: Double): Self = StObject.set(x, "y-side1-image-shift-default", value.asInstanceOf[js.Any])
    
    inline def `setY-side1-image-shift-defaultUndefined`: Self = StObject.set(x, "y-side1-image-shift-default", js.undefined)
    
    inline def `setY-side1-image-shift-supported`(value: String): Self = StObject.set(x, "y-side1-image-shift-supported", value.asInstanceOf[js.Any])
    
    inline def `setY-side1-image-shift-supportedUndefined`: Self = StObject.set(x, "y-side1-image-shift-supported", js.undefined)
    
    inline def `setY-side2-image-shift-default`(value: Double): Self = StObject.set(x, "y-side2-image-shift-default", value.asInstanceOf[js.Any])
    
    inline def `setY-side2-image-shift-defaultUndefined`: Self = StObject.set(x, "y-side2-image-shift-default", js.undefined)
    
    inline def `setY-side2-image-shift-supported`(value: String): Self = StObject.set(x, "y-side2-image-shift-supported", value.asInstanceOf[js.Any])
    
    inline def `setY-side2-image-shift-supportedUndefined`: Self = StObject.set(x, "y-side2-image-shift-supported", js.undefined)
  }
}
