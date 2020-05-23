package typings.ipp

import typings.ipp.mod.AccuracyUnits
import typings.ipp.mod.BalingType
import typings.ipp.mod.BalingWhen
import typings.ipp.mod.BindingType
import typings.ipp.mod.CharacterSet
import typings.ipp.mod.CoatingType
import typings.ipp.mod.Compression
import typings.ipp.mod.CoverType
import typings.ipp.mod.DocumentDigitalSignature
import typings.ipp.mod.DocumentState
import typings.ipp.mod.DocumentStateReasons
import typings.ipp.mod.FeedOrientation
import typings.ipp.mod.FinishingSides
import typings.ipp.mod.Finishings
import typings.ipp.mod.FoldingDirection
import typings.ipp.mod.IPPVersion
import typings.ipp.mod.IdentifyActions
import typings.ipp.mod.ImpositionTemplate
import typings.ipp.mod.InputColorMode
import typings.ipp.mod.InputContentType
import typings.ipp.mod.InputFilmScanMode
import typings.ipp.mod.InputSource
import typings.ipp.mod.JobAccountType
import typings.ipp.mod.JobDelayOutputUntil
import typings.ipp.mod.JobErrorAction
import typings.ipp.mod.JobHoldUntil
import typings.ipp.mod.JobPasswordEncryption
import typings.ipp.mod.JobPasswordRepertoire
import typings.ipp.mod.JobRetainUntil
import typings.ipp.mod.JobSheets
import typings.ipp.mod.JobState
import typings.ipp.mod.JobStateReasons
import typings.ipp.mod.LaminatingType
import typings.ipp.mod.MaterialAmountUnits
import typings.ipp.mod.MaterialPurpose
import typings.ipp.mod.MaterialRateUnits
import typings.ipp.mod.MaterialType
import typings.ipp.mod.Media
import typings.ipp.mod.MediaCoating
import typings.ipp.mod.MediaColSupported
import typings.ipp.mod.MediaColor
import typings.ipp.mod.MediaEnvelopeName
import typings.ipp.mod.MediaGrain
import typings.ipp.mod.MediaIntputTray
import typings.ipp.mod.MediaName
import typings.ipp.mod.MediaPrePrinted
import typings.ipp.mod.MediaRecycled
import typings.ipp.mod.MediaSizeName
import typings.ipp.mod.MediaSource
import typings.ipp.mod.MediaTooth
import typings.ipp.mod.MediaType
import typings.ipp.mod.MimeMediaType
import typings.ipp.mod.MultipleDocumentHandling
import typings.ipp.mod.MultipleObjectHandling
import typings.ipp.mod.NotifyEvents
import typings.ipp.mod.OrientationRequested
import typings.ipp.mod.OutputBin
import typings.ipp.mod.Overrides
import typings.ipp.mod.PageDelivery
import typings.ipp.mod.PageOrder
import typings.ipp.mod.PowerState
import typings.ipp.mod.PresentationDirectionNumberUp
import typings.ipp.mod.PrintBase
import typings.ipp.mod.PrintColorMode
import typings.ipp.mod.PrintContentOptimize
import typings.ipp.mod.PrintQuality
import typings.ipp.mod.PrintRenderingIntent
import typings.ipp.mod.PrintScaling
import typings.ipp.mod.PrintSupports
import typings.ipp.mod.PrinterKind
import typings.ipp.mod.PrinterOpertaion
import typings.ipp.mod.PrinterServiceType
import typings.ipp.mod.PrinterState
import typings.ipp.mod.PrinterStateReasons
import typings.ipp.mod.PwgRasterDocumentTypeSupported
import typings.ipp.mod.ReferenceEdge
import typings.ipp.mod.RequestedJobAttributeGroups
import typings.ipp.mod.RequestedPrinterAttributeGroups
import typings.ipp.mod.ResourceState
import typings.ipp.mod.ResourceType
import typings.ipp.mod.SaveDisposition
import typings.ipp.mod.SeparatorSheetsType
import typings.ipp.mod.Sides
import typings.ipp.mod.StatusCode
import typings.ipp.mod.StitchingMethod
import typings.ipp.mod.SystemState
import typings.ipp.mod.SystemTimeoutSource
import typings.ipp.mod.TimeoutPredicate
import typings.ipp.mod.TransmissionStatus
import typings.ipp.mod.TrimmingType
import typings.ipp.mod.UriSchemes
import typings.ipp.mod.WhichJobs
import typings.ipp.mod.XImagePosition
import typings.ipp.mod.XriAuthentication
import typings.ipp.mod.XriSecurity
import typings.ipp.mod.YImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ippStrings {
  @js.native
  sealed trait `1-to-n-order` extends PageOrder
  
  @js.native
  sealed trait `1Dot0` extends IPPVersion
  
  @js.native
  sealed trait `1Dot1` extends IPPVersion
  
  @js.native
  sealed trait `2Dot0` extends IPPVersion
  
  @js.native
  sealed trait `2Dot1` extends IPPVersion
  
  @js.native
  sealed trait `2Dot2` extends IPPVersion
  
  @js.native
  sealed trait `ASMO-708` extends CharacterSet
  
  @js.native
  sealed trait `Acknowledge-Document` extends PrinterOpertaion
  
  @js.native
  sealed trait `Acknowledge-Identify-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Acknowledge-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Activate-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Add-Document-Images` extends PrinterOpertaion
  
  @js.native
  sealed trait `Allocate-Printer-Resources` extends PrinterOpertaion
  
  @js.native
  sealed trait CP1026 extends CharacterSet
  
  @js.native
  sealed trait CP870 extends CharacterSet
  
  @js.native
  sealed trait `Cancel-Current-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Cancel-Document` extends PrinterOpertaion
  
  @js.native
  sealed trait `Cancel-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Cancel-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait `Cancel-My-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait `Cancel-Resource` extends PrinterOpertaion
  
  @js.native
  sealed trait `Cancel-Subscription` extends PrinterOpertaion
  
  @js.native
  sealed trait `Close-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-Job-Subscriptions` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-Printer-Subscriptions` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-Resource` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-Resource-Subscriptions` extends PrinterOpertaion
  
  @js.native
  sealed trait `Create-System-Subscriptions` extends PrinterOpertaion
  
  @js.native
  sealed trait `DOS-720` extends CharacterSet
  
  @js.native
  sealed trait `DOS-862` extends CharacterSet
  
  @js.native
  sealed trait `Deactivate-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Deallocate-Printer-Resources` extends PrinterOpertaion
  
  @js.native
  sealed trait `Delete-Document` extends PrinterOpertaion
  
  @js.native
  sealed trait `Delete-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Deregister-Output-Device` extends PrinterOpertaion
  
  @js.native
  sealed trait `Disable-All-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Disable-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `EUC-CN` extends CharacterSet
  
  @js.native
  sealed trait `Enable-All-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Enable-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Fetch-Document` extends PrinterOpertaion
  
  @js.native
  sealed trait `Fetch-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Document-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Documents` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Job-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Next-Document-Data` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Notifications` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Output-Device-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Printer-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Printer-Resources` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Printer-Supported-Values` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Resource-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Resources` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Subscription-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-Subscriptions` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-System-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-System-Supported-Values` extends PrinterOpertaion
  
  @js.native
  sealed trait `Get-User-Printer-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Hold-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Hold-New-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait IBM437 extends CharacterSet
  
  @js.native
  sealed trait `Identify-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Install-Resource` extends PrinterOpertaion
  
  @js.native
  sealed trait Johab extends CharacterSet
  
  @js.native
  sealed trait `Pause-All-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Pause-All-Printers-After-Current-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Pause-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Pause-Printer-After-Current-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Print-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Print-URI` extends PrinterOpertaion
  
  @js.native
  sealed trait `Promote-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Purge-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait `Register-Output-Device` extends PrinterOpertaion
  
  @js.native
  sealed trait `Release-Held-New-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait `Release-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Renew-Subscription` extends PrinterOpertaion
  
  @js.native
  sealed trait `Reprocess-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Restart-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Restart-One-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Restart-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Restart-System` extends PrinterOpertaion
  
  @js.native
  sealed trait `Resubmit-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Resume-All-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Resume-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Resume-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Schedule-Job-After` extends PrinterOpertaion
  
  @js.native
  sealed trait `Send-Document` extends PrinterOpertaion
  
  @js.native
  sealed trait `Send-Resource-Data` extends PrinterOpertaion
  
  @js.native
  sealed trait `Send-URI` extends PrinterOpertaion
  
  @js.native
  sealed trait `Set-Document-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Set-Job-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Set-Printer-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Set-Resource-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Set-System-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Shutdown-All-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Shutdown-One-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Shutdown-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Startup-All-Printers` extends PrinterOpertaion
  
  @js.native
  sealed trait `Startup-One-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Startup-Printer` extends PrinterOpertaion
  
  @js.native
  sealed trait `Suspend-Current-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait `Update-Active-Jobs` extends PrinterOpertaion
  
  @js.native
  sealed trait `Update-Document-Status` extends PrinterOpertaion
  
  @js.native
  sealed trait `Update-Job-Status` extends PrinterOpertaion
  
  @js.native
  sealed trait `Update-Output-Device-Attributes` extends PrinterOpertaion
  
  @js.native
  sealed trait `Validate-Document` extends PrinterOpertaion
  
  @js.native
  sealed trait `Validate-Job` extends PrinterOpertaion
  
  @js.native
  sealed trait Value extends PrinterOpertaion
  
  @js.native
  sealed trait `Windows-1252 ` extends CharacterSet
  
  @js.native
  sealed trait `X-EBCDIC-Spain` extends CharacterSet
  
  @js.native
  sealed trait a
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `a-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `a-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `a-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait aaa extends UriSchemes
  
  @js.native
  sealed trait aaas extends UriSchemes
  
  @js.native
  sealed trait `abort-job` extends JobErrorAction
  
  @js.native
  sealed trait aborted
    extends DocumentState
       with JobState
       with ResourceState
       with TransmissionStatus
       with WhichJobs
  
  @js.native
  sealed trait `aborted-by-system`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait about extends UriSchemes
  
  @js.native
  sealed trait abs extends MaterialType
  
  @js.native
  sealed trait `abs-carbon-fiber` extends MaterialType
  
  @js.native
  sealed trait `abs-carbon-nanotube` extends MaterialType
  
  @js.native
  sealed trait absolute extends PrintRenderingIntent
  
  @js.native
  sealed trait acap extends UriSchemes
  
  @js.native
  sealed trait acct extends UriSchemes
  
  @js.native
  sealed trait `accuracy-units-supported` extends js.Object
  
  @js.native
  sealed trait acd extends UriSchemes
  
  @js.native
  sealed trait acr extends UriSchemes
  
  @js.native
  sealed trait activity extends TimeoutPredicate
  
  @js.native
  sealed trait adf extends InputSource
  
  @js.native
  sealed trait adhesive extends BindingType
  
  @js.native
  sealed trait adiumxtra extends UriSchemes
  
  @js.native
  sealed trait `adobe-1Dot3` extends js.Object
  
  @js.native
  sealed trait `adobe-1Dot4` extends js.Object
  
  @js.native
  sealed trait `adobe-1Dot5` extends js.Object
  
  @js.native
  sealed trait `adobe-1Dot6` extends js.Object
  
  @js.native
  sealed trait `adobe-rgb_16` extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait `adobe-rgb_8` extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait adt extends UriSchemes
  
  @js.native
  sealed trait afp extends UriSchemes
  
  @js.native
  sealed trait afs extends UriSchemes
  
  @js.native
  sealed trait `after-job` extends BalingWhen
  
  @js.native
  sealed trait `after-sets` extends BalingWhen
  
  @js.native
  sealed trait aim extends UriSchemes
  
  @js.native
  sealed trait `alert-removal-of-binary-change-entry` extends PrinterStateReasons
  
  @js.native
  sealed trait all
    extends MaterialPurpose
       with RequestedJobAttributeGroups
       with RequestedPrinterAttributeGroups
       with WhichJobs
  
  @js.native
  sealed trait alternate extends MediaSource
  
  @js.native
  sealed trait `alternate-roll` extends MediaSource
  
  @js.native
  sealed trait aluminum extends MediaType
  
  @js.native
  sealed trait always extends js.Object
  
  @js.native
  sealed trait amss extends UriSchemes
  
  @js.native
  sealed trait android extends UriSchemes
  
  @js.native
  sealed trait antique extends MediaTooth
  
  @js.native
  sealed trait appdata extends UriSchemes
  
  @js.native
  sealed trait applicationSlashactivemessage extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashandrew-inset` extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashapplefile extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashatomicmail extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashdca-rft` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashdec-dx` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashmac-binhex40` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashmac-compactpro` extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashmacwriteii extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashmsword extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashnews-message-id` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashnews-transmission` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashoctet-stream` extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashoda extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashpdf extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashpostscript extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashpowerpoint extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashremote-printing` extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashrtf extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashslate extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashwita extends MimeMediaType
  
  @js.native
  sealed trait applicationSlashwordperfect5Dot1 extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-bcpio` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-cdlink` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-compress` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-cpio` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-csh` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-director` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-dvi` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-gtar` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-gzip` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-hdf` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-httpd-cgi` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-koan` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-latex` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-mif` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-netcdf` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-sh` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-shar` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-stuffit` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-sv4cpio` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-sv4crc` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-tar` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-tcl` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-tex` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-texinfo` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-troff` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-troff-man` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-troff-me` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-troff-ms` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-ustar` extends MimeMediaType
  
  @js.native
  sealed trait `applicationSlashx-wais-source` extends MimeMediaType
  
  @js.native
  sealed trait apt extends UriSchemes
  
  @js.native
  sealed trait `arch-a`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `arch-a-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-a-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-a-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-axsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-axsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-axsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-b`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `arch-b-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-b-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-b-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-bxsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-bxsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-bxsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-c`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `arch-c-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-c-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-c-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-cxsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-cxsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-cxsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-d`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `arch-d-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-d-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-d-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-dxsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-dxsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-dxsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-e`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `arch-e-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-e-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-e-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-exsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-exsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `arch-exsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait archival
    extends CoatingType
       with LaminatingType
  
  @js.native
  sealed trait `archival-glossy` extends CoatingType
  
  @js.native
  sealed trait `archival-matte` extends CoatingType
  
  @js.native
  sealed trait `archival-semi-gloss` extends CoatingType
  
  @js.native
  sealed trait arithmetic extends js.Object
  
  @js.native
  sealed trait ark extends UriSchemes
  
  @js.native
  sealed trait asme_f_28x40in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait attachment extends UriSchemes
  
  @js.native
  sealed trait attempted extends js.Object
  
  @js.native
  sealed trait `attributes-charset` extends js.Object
  
  @js.native
  sealed trait `attributes-natural-language` extends js.Object
  
  @js.native
  sealed trait auto
    extends InputColorMode
       with InputContentType
       with MediaSource
       with MediaType
       with MultipleObjectHandling
       with PrintColorMode
       with PrintContentOptimize
       with PrintRenderingIntent
       with PrintScaling
       with StitchingMethod
  
  @js.native
  sealed trait `auto-fit` extends PrintScaling
  
  @js.native
  sealed trait `auto-fixed-size-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-fixed-size-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-fixed-size-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-monochrome` extends PrintColorMode
  
  @js.native
  sealed trait `auto-synchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-synchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-synchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `auto-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait automatic extends js.Object
  
  @js.native
  sealed trait available extends ResourceState
  
  @js.native
  sealed trait aw extends UriSchemes
  
  @js.native
  sealed trait `axsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `axsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `axsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait b
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `b-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `b-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `b-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait back extends FinishingSides
  
  @js.native
  sealed trait `back-print-film` extends MediaType
  
  @js.native
  sealed trait bale extends Finishings
  
  @js.native
  sealed trait baling extends js.Object
  
  @js.native
  sealed trait `baling-type-supported` extends js.Object
  
  @js.native
  sealed trait `baling-when-supported` extends js.Object
  
  @js.native
  sealed trait band extends BalingType
  
  @js.native
  sealed trait `bander-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `bander-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait barion extends UriSchemes
  
  @js.native
  sealed trait base extends MaterialPurpose
  
  @js.native
  sealed trait basic extends XriAuthentication
  
  @js.native
  sealed trait beshare extends UriSchemes
  
  @js.native
  sealed trait `best-fit` extends MultipleObjectHandling
  
  @js.native
  sealed trait `best-quality` extends MultipleObjectHandling
  
  @js.native
  sealed trait `best-speed` extends MultipleObjectHandling
  
  @js.native
  sealed trait `bi-level`
    extends InputColorMode
       with PrintColorMode
  
  @js.native
  sealed trait big5 extends CharacterSet
  
  @js.native
  sealed trait bind extends Finishings
  
  @js.native
  sealed trait `bind-bottom` extends Finishings
  
  @js.native
  sealed trait `bind-left` extends Finishings
  
  @js.native
  sealed trait `bind-right` extends Finishings
  
  @js.native
  sealed trait `bind-top` extends Finishings
  
  @js.native
  sealed trait `binder-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `binder-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait binding extends js.Object
  
  @js.native
  sealed trait `binding-reference-edge-supported` extends js.Object
  
  @js.native
  sealed trait `binding-type-supported` extends js.Object
  
  @js.native
  sealed trait bitcoin extends UriSchemes
  
  @js.native
  sealed trait bitcoincash extends UriSchemes
  
  @js.native
  sealed trait black extends MediaColor
  
  @js.native
  sealed trait `black-and-white-negative-film` extends InputFilmScanMode
  
  @js.native
  sealed trait black_1 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait black_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait black_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait blank extends MediaPrePrinted
  
  @js.native
  sealed trait blob extends UriSchemes
  
  @js.native
  sealed trait blue extends MediaColor
  
  @js.native
  sealed trait bolo extends UriSchemes
  
  @js.native
  sealed trait `booklet-maker` extends Finishings
  
  @js.native
  sealed trait both extends FinishingSides
  
  @js.native
  sealed trait `both-sheets` extends SeparatorSheetsType
  
  @js.native
  sealed trait bottom
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
       with ReferenceEdge
       with YImagePosition
  
  @js.native
  sealed trait brim extends PrintBase
  
  @js.native
  sealed trait brown extends MediaColor
  
  @js.native
  sealed trait browserext extends UriSchemes
  
  @js.native
  sealed trait buff extends MediaColor
  
  @js.native
  sealed trait `bxsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `bxsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `bxsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `by-pass-tray` extends MediaSource
  
  @js.native
  sealed trait c
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `c-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `c-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `c-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait calculator extends UriSchemes
  
  @js.native
  sealed trait calendared extends MediaTooth
  
  @js.native
  sealed trait callto extends UriSchemes
  
  @js.native
  sealed trait `cancel-job_` extends JobErrorAction
  
  @js.native
  sealed trait canceled
    extends DocumentState
       with JobState
       with ResourceState
       with TransmissionStatus
       with WhichJobs
  
  @js.native
  sealed trait `canceled-at-device` extends DocumentStateReasons
  
  @js.native
  sealed trait `canceled-by-operator` extends DocumentStateReasons
  
  @js.native
  sealed trait `canceled-by-user` extends DocumentStateReasons
  
  @js.native
  sealed trait cap extends UriSchemes
  
  @js.native
  sealed trait cardboard extends MediaType
  
  @js.native
  sealed trait cardstock extends MediaType
  
  @js.native
  sealed trait cast extends UriSchemes
  
  @js.native
  sealed trait casts extends UriSchemes
  
  @js.native
  sealed trait cd extends MediaType
  
  @js.native
  sealed trait center
    extends MediaSource
       with OutputBin
       with XImagePosition
       with YImagePosition
  
  @js.native
  sealed trait certificate extends XriAuthentication
  
  @js.native
  sealed trait `chamber-humidity` extends Overrides
  
  @js.native
  sealed trait `chamber-humidity-actual` extends js.Object
  
  @js.native
  sealed trait `chamber-humidity-default` extends js.Object
  
  @js.native
  sealed trait `chamber-humidity-supported` extends js.Object
  
  @js.native
  sealed trait `chamber-temperature` extends Overrides
  
  @js.native
  sealed trait `chamber-temperature-actual` extends js.Object
  
  @js.native
  sealed trait `chamber-temperature-default` extends js.Object
  
  @js.native
  sealed trait `chamber-temperature-supported` extends js.Object
  
  @js.native
  sealed trait `charset-configured` extends js.Object
  
  @js.native
  sealed trait `charset-supported` extends js.Object
  
  @js.native
  sealed trait chocolate extends MaterialType
  
  @js.native
  sealed trait choice_iso_a4_210x297mm_na_letter_8Dot5x11in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait chrome extends UriSchemes
  
  @js.native
  sealed trait `chrome-extension` extends UriSchemes
  
  @js.native
  sealed trait cid extends UriSchemes
  
  @js.native
  sealed trait `cleaner-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `cleaner-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `clear-black` extends MediaColor
  
  @js.native
  sealed trait `clear-blue` extends MediaColor
  
  @js.native
  sealed trait `clear-brown` extends MediaColor
  
  @js.native
  sealed trait `clear-buff` extends MediaColor
  
  @js.native
  sealed trait `clear-cyan` extends MediaColor
  
  @js.native
  sealed trait `clear-gold` extends MediaColor
  
  @js.native
  sealed trait `clear-goldenrod` extends MediaColor
  
  @js.native
  sealed trait `clear-gray` extends MediaColor
  
  @js.native
  sealed trait `clear-green` extends MediaColor
  
  @js.native
  sealed trait `clear-ivory` extends MediaColor
  
  @js.native
  sealed trait `clear-magenta` extends MediaColor
  
  @js.native
  sealed trait `clear-multi-color` extends MediaColor
  
  @js.native
  sealed trait `clear-mustard` extends MediaColor
  
  @js.native
  sealed trait `clear-orange` extends MediaColor
  
  @js.native
  sealed trait `clear-pink` extends MediaColor
  
  @js.native
  sealed trait `clear-red` extends MediaColor
  
  @js.native
  sealed trait `clear-silver` extends MediaColor
  
  @js.native
  sealed trait `clear-turquoise` extends MediaColor
  
  @js.native
  sealed trait `clear-violet` extends MediaColor
  
  @js.native
  sealed trait `clear-white` extends MediaColor
  
  @js.native
  sealed trait `clear-yellow` extends MediaColor
  
  @js.native
  sealed trait `client-error-account-authorization-failed` extends StatusCode
  
  @js.native
  sealed trait `client-error-account-closed` extends StatusCode
  
  @js.native
  sealed trait `client-error-account-info-needed` extends StatusCode
  
  @js.native
  sealed trait `client-error-account-limit-reached` extends StatusCode
  
  @js.native
  sealed trait `client-error-attributes-not-settable` extends StatusCode
  
  @js.native
  sealed trait `client-error-attributes-or-values-not-supported` extends StatusCode
  
  @js.native
  sealed trait `client-error-bad-request` extends StatusCode
  
  @js.native
  sealed trait `client-error-charset-not-supported` extends StatusCode
  
  @js.native
  sealed trait `client-error-compression-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-compression-not-supported` extends StatusCode
  
  @js.native
  sealed trait `client-error-conflicting-attributes` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-access-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-format-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-format-not-supported` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-password-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-permission-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-security-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-document-unprintable-error` extends StatusCode
  
  @js.native
  sealed trait `client-error-forbidden` extends StatusCode
  
  @js.native
  sealed trait `client-error-gone` extends StatusCode
  
  @js.native
  sealed trait `client-error-ignored-all-subscriptions` extends StatusCode
  
  @js.native
  sealed trait `client-error-not-authenticated` extends StatusCode
  
  @js.native
  sealed trait `client-error-not-authorized` extends StatusCode
  
  @js.native
  sealed trait `client-error-not-fetchable` extends StatusCode
  
  @js.native
  sealed trait `client-error-not-found` extends StatusCode
  
  @js.native
  sealed trait `client-error-not-possible` extends StatusCode
  
  @js.native
  sealed trait `client-error-request-entity-too-large` extends StatusCode
  
  @js.native
  sealed trait `client-error-request-value-too-long` extends StatusCode
  
  @js.native
  sealed trait `client-error-timeout` extends StatusCode
  
  @js.native
  sealed trait `client-error-too-many-subscriptions` extends StatusCode
  
  @js.native
  sealed trait `client-error-uri-scheme-not-supported` extends StatusCode
  
  @js.native
  sealed trait cmyk extends js.Object
  
  @js.native
  sealed trait cmyk_16
    extends InputColorMode
       with PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait cmyk_8
    extends InputColorMode
       with PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait coap extends UriSchemes
  
  @js.native
  sealed trait coapPlussigntcp extends UriSchemes
  
  @js.native
  sealed trait coapPlussignws extends UriSchemes
  
  @js.native
  sealed trait coaps extends UriSchemes
  
  @js.native
  sealed trait coapsPlussigntcp extends UriSchemes
  
  @js.native
  sealed trait coapsPlussignws extends UriSchemes
  
  @js.native
  sealed trait coarse extends MediaTooth
  
  @js.native
  sealed trait coat extends Finishings
  
  @js.native
  sealed trait coating extends js.Object
  
  @js.native
  sealed trait `coating-sides-supported` extends js.Object
  
  @js.native
  sealed trait `coating-type-supported` extends js.Object
  
  @js.native
  sealed trait collated extends js.Object
  
  @js.native
  sealed trait color
    extends InputColorMode
       with PrintColorMode
  
  @js.native
  sealed trait `color-negative-film` extends InputFilmScanMode
  
  @js.native
  sealed trait `color-slide-film` extends InputFilmScanMode
  
  @js.native
  sealed trait `color-supported` extends js.Object
  
  @js.native
  sealed trait color_8 extends InputColorMode
  
  @js.native
  sealed trait `com-eventbrite-attendee` extends UriSchemes
  
  @js.native
  sealed trait comb extends BindingType
  
  @js.native
  sealed trait completed
    extends DocumentState
       with JobState
       with TransmissionStatus
       with WhichJobs
  
  @js.native
  sealed trait `completed-successfully` extends DocumentStateReasons
  
  @js.native
  sealed trait `completed-with-errors` extends DocumentStateReasons
  
  @js.native
  sealed trait `completed-with-warnings` extends DocumentStateReasons
  
  @js.native
  sealed trait compress extends Compression
  
  @js.native
  sealed trait `compression-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `compression-supplied` extends js.Object
  
  @js.native
  sealed trait `compression-supported` extends js.Object
  
  @js.native
  sealed trait `configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `confirmation-sheet-print` extends Overrides
  
  @js.native
  sealed trait `confirmation-sheet-print-default` extends js.Object
  
  @js.native
  sealed trait `connecting-to-device` extends PrinterStateReasons
  
  @js.native
  sealed trait content extends UriSchemes
  
  @js.native
  sealed trait conti extends UriSchemes
  
  @js.native
  sealed trait `continue-job` extends JobErrorAction
  
  @js.native
  sealed trait continuous extends MediaType
  
  @js.native
  sealed trait `continuous-long` extends MediaType
  
  @js.native
  sealed trait `continuous-short` extends MediaType
  
  @js.native
  sealed trait copies extends Overrides
  
  @js.native
  sealed trait `copies-actual` extends js.Object
  
  @js.native
  sealed trait `copies-default` extends js.Object
  
  @js.native
  sealed trait `copies-supported` extends js.Object
  
  @js.native
  sealed trait copy extends PrinterServiceType
  
  @js.native
  sealed trait `corrugated-board` extends MediaType
  
  @js.native
  sealed trait cover extends Finishings
  
  @js.native
  sealed trait `cover-back` extends Overrides
  
  @js.native
  sealed trait `cover-back-actual` extends js.Object
  
  @js.native
  sealed trait `cover-back-default` extends js.Object
  
  @js.native
  sealed trait `cover-back-supported` extends js.Object
  
  @js.native
  sealed trait `cover-front` extends Overrides
  
  @js.native
  sealed trait `cover-front-actual` extends js.Object
  
  @js.native
  sealed trait `cover-front-default` extends js.Object
  
  @js.native
  sealed trait `cover-front-supported` extends js.Object
  
  @js.native
  sealed trait `cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `cover-sheet-info` extends Overrides
  
  @js.native
  sealed trait `cover-sheet-info-default` extends js.Object
  
  @js.native
  sealed trait `cover-sheet-info-supported` extends js.Object
  
  @js.native
  sealed trait covering extends js.Object
  
  @js.native
  sealed trait `covering-name-supported` extends js.Object
  
  @js.native
  sealed trait cp866 extends CharacterSet
  
  @js.native
  sealed trait crid extends UriSchemes
  
  @js.native
  sealed trait crimp extends StitchingMethod
  
  @js.native
  sealed trait csISO2022JP extends CharacterSet
  
  @js.native
  sealed trait cvs extends UriSchemes
  
  @js.native
  sealed trait `cxsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `cxsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `cxsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait cyan extends MediaColor
  
  @js.native
  sealed trait d
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `d-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `d-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `d-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait dab extends UriSchemes
  
  @js.native
  sealed trait `dark-blue` extends MediaColor
  
  @js.native
  sealed trait `dark-brown` extends MediaColor
  
  @js.native
  sealed trait `dark-buff` extends MediaColor
  
  @js.native
  sealed trait `dark-cyan` extends MediaColor
  
  @js.native
  sealed trait `dark-gold` extends MediaColor
  
  @js.native
  sealed trait `dark-goldenrod` extends MediaColor
  
  @js.native
  sealed trait `dark-gray` extends MediaColor
  
  @js.native
  sealed trait `dark-green` extends MediaColor
  
  @js.native
  sealed trait `dark-ivory` extends MediaColor
  
  @js.native
  sealed trait `dark-magenta` extends MediaColor
  
  @js.native
  sealed trait `dark-mustard` extends MediaColor
  
  @js.native
  sealed trait `dark-orange` extends MediaColor
  
  @js.native
  sealed trait `dark-pink` extends MediaColor
  
  @js.native
  sealed trait `dark-red` extends MediaColor
  
  @js.native
  sealed trait `dark-silver` extends MediaColor
  
  @js.native
  sealed trait `dark-turquoise` extends MediaColor
  
  @js.native
  sealed trait `dark-violet` extends MediaColor
  
  @js.native
  sealed trait `dark-yellow` extends MediaColor
  
  @js.native
  sealed trait data extends UriSchemes
  
  @js.native
  sealed trait `data-insufficient` extends DocumentStateReasons
  
  @js.native
  sealed trait `date-time-at-completed` extends js.Object
  
  @js.native
  sealed trait `date-time-at-creation` extends js.Object
  
  @js.native
  sealed trait `date-time-at-processing` extends js.Object
  
  @js.native
  sealed trait dav extends UriSchemes
  
  @js.native
  sealed trait `day-time`
    extends JobDelayOutputUntil
       with JobHoldUntil
  
  @js.native
  sealed trait deactivated extends PrinterStateReasons
  
  @js.native
  sealed trait deep extends js.Object
  
  @js.native
  sealed trait default
    extends Media
       with MediaName
  
  @js.native
  sealed trait deflate extends Compression
  
  @js.native
  sealed trait `destination-accesses-supported` extends js.Object
  
  @js.native
  sealed trait `destination-statuses` extends js.Object
  
  @js.native
  sealed trait `destination-uri-ready` extends js.Object
  
  @js.native
  sealed trait `destination-uri-schemes-supported` extends js.Object
  
  @js.native
  sealed trait `destination-uris` extends Overrides
  
  @js.native
  sealed trait `destination-uris-supported` extends js.Object
  
  @js.native
  sealed trait `developer-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `developer-low` extends PrinterStateReasons
  
  @js.native
  sealed trait device10_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device10_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device11_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device11_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device12_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device12_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device13_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device13_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device14_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device14_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device15_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device15_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device1_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device1_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device2_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device2_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device3_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device3_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device4_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device4_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device5_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device5_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device6_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device6_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device7_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device7_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device8_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device8_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device9_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait device9_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait dhcp extends SystemTimeoutSource
  
  @js.native
  sealed trait diaspora extends UriSchemes
  
  @js.native
  sealed trait dict extends UriSchemes
  
  @js.native
  sealed trait did extends UriSchemes
  
  @js.native
  sealed trait `die-cutter-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `die-cutter-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait digest extends XriAuthentication
  
  @js.native
  sealed trait `digital-signature-did-not-verify`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `digital-signature-type-not-supported`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `digital-signature-wait` extends DocumentStateReasons
  
  @js.native
  sealed trait dis extends UriSchemes
  
  @js.native
  sealed trait disc
    extends MediaSource
       with MediaType
       with PrinterKind
  
  @js.native
  sealed trait `disc-glossy` extends MediaType
  
  @js.native
  sealed trait `disc-high-gloss` extends MediaType
  
  @js.native
  sealed trait `disc-matte` extends MediaType
  
  @js.native
  sealed trait `disc-satin` extends MediaType
  
  @js.native
  sealed trait `disc-semi-gloss` extends MediaType
  
  @js.native
  sealed trait display extends IdentifyActions
  
  @js.native
  sealed trait `dlna-playcontainer` extends UriSchemes
  
  @js.native
  sealed trait `dlna-playsingle` extends UriSchemes
  
  @js.native
  sealed trait dns extends UriSchemes
  
  @js.native
  sealed trait dntp extends UriSchemes
  
  @js.native
  sealed trait document extends PrinterKind
  
  @js.native
  sealed trait `document-access-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `document-access-supported` extends js.Object
  
  @js.native
  sealed trait `document-charset-default` extends js.Object
  
  @js.native
  sealed trait `document-charset-supplied` extends js.Object
  
  @js.native
  sealed trait `document-charset-supported` extends js.Object
  
  @js.native
  sealed trait `document-copies` extends Overrides
  
  @js.native
  sealed trait `document-creation-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `document-digital-signature-default` extends js.Object
  
  @js.native
  sealed trait `document-digital-signature-supplied` extends js.Object
  
  @js.native
  sealed trait `document-digital-signature-supported` extends js.Object
  
  @js.native
  sealed trait `document-format-default` extends js.Object
  
  @js.native
  sealed trait `document-format-details-default` extends js.Object
  
  @js.native
  sealed trait `document-format-details-supplied` extends js.Object
  
  @js.native
  sealed trait `document-format-details-supported` extends js.Object
  
  @js.native
  sealed trait `document-format-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `document-format-ready` extends js.Object
  
  @js.native
  sealed trait `document-format-supplied` extends js.Object
  
  @js.native
  sealed trait `document-format-supported` extends js.Object
  
  @js.native
  sealed trait `document-format-version-default` extends js.Object
  
  @js.native
  sealed trait `document-format-version-supplied` extends js.Object
  
  @js.native
  sealed trait `document-format-version-supported` extends js.Object
  
  @js.native
  sealed trait `document-message-supplied` extends js.Object
  
  @js.native
  sealed trait `document-name-supplied` extends js.Object
  
  @js.native
  sealed trait `document-natural-language-default` extends js.Object
  
  @js.native
  sealed trait `document-natural-language-supplied` extends js.Object
  
  @js.native
  sealed trait `document-natural-language-supported` extends js.Object
  
  @js.native
  sealed trait `document-number` extends js.Object
  
  @js.native
  sealed trait `document-numbers` extends Overrides
  
  @js.native
  sealed trait `document-object` extends js.Object
  
  @js.native
  sealed trait `document-password-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `document-password-supported` extends js.Object
  
  @js.native
  sealed trait `document-permission-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `document-privacy-attributes` extends js.Object
  
  @js.native
  sealed trait `document-privacy-scope` extends js.Object
  
  @js.native
  sealed trait `document-security-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `document-unprintable-error`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `door-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `double-wall` extends MediaType
  
  @js.native
  sealed trait dpp extends UriSchemes
  
  @js.native
  sealed trait draft extends PrintQuality
  
  @js.native
  sealed trait `draw-line` extends TrimmingType
  
  @js.native
  sealed trait drm extends UriSchemes
  
  @js.native
  sealed trait drop extends UriSchemes
  
  @js.native
  sealed trait `dry-film` extends MediaType
  
  @js.native
  sealed trait dss extends DocumentDigitalSignature
  
  @js.native
  sealed trait dtn extends UriSchemes
  
  @js.native
  sealed trait dvb extends UriSchemes
  
  @js.native
  sealed trait dvd extends MediaType
  
  @js.native
  sealed trait `dxsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `dxsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `dxsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait e
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `e-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `e-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `e-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `ebcdic-cp-us` extends CharacterSet
  
  @js.native
  sealed trait ed2k extends UriSchemes
  
  @js.native
  sealed trait `edge-stitch` extends Finishings
  
  @js.native
  sealed trait `edge-stitch-bottom` extends Finishings
  
  @js.native
  sealed trait `edge-stitch-left` extends Finishings
  
  @js.native
  sealed trait `edge-stitch-right` extends Finishings
  
  @js.native
  sealed trait `edge-stitch-top` extends Finishings
  
  @js.native
  sealed trait elsi extends UriSchemes
  
  @js.native
  sealed trait `embossing-foil` extends MediaType
  
  @js.native
  sealed trait `end-board` extends MediaType
  
  @js.native
  sealed trait `end-of-day` extends JobRetainUntil
  
  @js.native
  sealed trait `end-of-month` extends JobRetainUntil
  
  @js.native
  sealed trait `end-of-week` extends JobRetainUntil
  
  @js.native
  sealed trait `end-sheet` extends SeparatorSheetsType
  
  @js.native
  sealed trait envelope
    extends Media
       with MediaIntputTray
       with MediaSource
       with MediaType
       with PrinterKind
  
  @js.native
  sealed trait `envelope-archival` extends MediaType
  
  @js.native
  sealed trait `envelope-bond` extends MediaType
  
  @js.native
  sealed trait `envelope-coated` extends MediaType
  
  @js.native
  sealed trait `envelope-cotton` extends MediaType
  
  @js.native
  sealed trait `envelope-fine` extends MediaType
  
  @js.native
  sealed trait `envelope-heavyweight` extends MediaType
  
  @js.native
  sealed trait `envelope-inkjet` extends MediaType
  
  @js.native
  sealed trait `envelope-lightweight` extends MediaType
  
  @js.native
  sealed trait `envelope-plain` extends MediaType
  
  @js.native
  sealed trait `envelope-preprinted` extends MediaType
  
  @js.native
  sealed trait `envelope-window` extends MediaType
  
  @js.native
  sealed trait `errors-count` extends js.Object
  
  @js.native
  sealed trait `errors-detected`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `euc-kr` extends CharacterSet
  
  @js.native
  sealed trait evening
    extends JobDelayOutputUntil
       with JobHoldUntil
  
  @js.native
  sealed trait example extends UriSchemes
  
  @js.native
  sealed trait `executable-firmware` extends ResourceType
  
  @js.native
  sealed trait `executable-software` extends ResourceType
  
  @js.native
  sealed trait executive
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `executive-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `exsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `exsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `exsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait f
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait fabric extends MediaType
  
  @js.native
  sealed trait `fabric-archival` extends MediaType
  
  @js.native
  sealed trait `fabric-glossy` extends MediaType
  
  @js.native
  sealed trait `fabric-high-gloss` extends MediaType
  
  @js.native
  sealed trait `fabric-matte` extends MediaType
  
  @js.native
  sealed trait `fabric-semi-gloss` extends MediaType
  
  @js.native
  sealed trait `fabric-waterproof` extends MediaType
  
  @js.native
  sealed trait `face-down` extends OutputBin
  
  @js.native
  sealed trait `face-up` extends OutputBin
  
  @js.native
  sealed trait facetime extends UriSchemes
  
  @js.native
  sealed trait fax extends UriSchemes
  
  @js.native
  sealed trait faxin extends PrinterServiceType
  
  @js.native
  sealed trait faxout extends PrinterServiceType
  
  @js.native
  sealed trait feed extends UriSchemes
  
  @js.native
  sealed trait `feed-orientation-default` extends js.Object
  
  @js.native
  sealed trait `feed-orientation-supported` extends js.Object
  
  @js.native
  sealed trait feedready extends UriSchemes
  
  @js.native
  sealed trait `fetch-document-attributes-supported` extends js.Object
  
  @js.native
  sealed trait file extends UriSchemes
  
  @js.native
  sealed trait filesystem extends UriSchemes
  
  @js.native
  sealed trait fill extends PrintScaling
  
  @js.native
  sealed trait film extends MediaType
  
  @js.native
  sealed trait `film-reader` extends InputSource
  
  @js.native
  sealed trait fine extends MediaTooth
  
  @js.native
  sealed trait finger extends UriSchemes
  
  @js.native
  sealed trait `finishing-template` extends js.Object
  
  @js.native
  sealed trait `finishing-template-supported` extends js.Object
  
  @js.native
  sealed trait finishings extends Overrides
  
  @js.native
  sealed trait `finishings-actual` extends js.Object
  
  @js.native
  sealed trait `finishings-col` extends Overrides
  
  @js.native
  sealed trait `finishings-col-actual` extends js.Object
  
  @js.native
  sealed trait `finishings-col-database` extends js.Object
  
  @js.native
  sealed trait `finishings-col-default` extends js.Object
  
  @js.native
  sealed trait `finishings-col-ready` extends js.Object
  
  @js.native
  sealed trait `finishings-col-supported` extends js.Object
  
  @js.native
  sealed trait `finishings-default` extends js.Object
  
  @js.native
  sealed trait `finishings-ready` extends js.Object
  
  @js.native
  sealed trait `finishings-supported` extends js.Object
  
  @js.native
  sealed trait `first-print-stream-page` extends JobSheets
  
  @js.native
  sealed trait `first-run-pen-experience` extends UriSchemes
  
  @js.native
  sealed trait fish extends UriSchemes
  
  @js.native
  sealed trait fit extends PrintScaling
  
  @js.native
  sealed trait flash extends IdentifyActions
  
  @js.native
  sealed trait flat extends BindingType
  
  @js.native
  sealed trait `flexo-base` extends MediaType
  
  @js.native
  sealed trait `flexo-photo-polymer` extends MediaType
  
  @js.native
  sealed trait flipped extends js.Object
  
  @js.native
  sealed trait flute extends MediaType
  
  @js.native
  sealed trait fm extends UriSchemes
  
  @js.native
  sealed trait foil extends MediaType
  
  @js.native
  sealed trait fold extends Finishings
  
  @js.native
  sealed trait `fold-accordion` extends Finishings
  
  @js.native
  sealed trait `fold-double-gate` extends Finishings
  
  @js.native
  sealed trait `fold-engineering-z` extends Finishings
  
  @js.native
  sealed trait `fold-gate` extends Finishings
  
  @js.native
  sealed trait `fold-half` extends Finishings
  
  @js.native
  sealed trait `fold-half-z` extends Finishings
  
  @js.native
  sealed trait `fold-left-gate` extends Finishings
  
  @js.native
  sealed trait `fold-letter` extends Finishings
  
  @js.native
  sealed trait `fold-parallel` extends Finishings
  
  @js.native
  sealed trait `fold-poster` extends Finishings
  
  @js.native
  sealed trait `fold-right-gate` extends Finishings
  
  @js.native
  sealed trait `fold-z` extends Finishings
  
  @js.native
  sealed trait `folder-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `folder-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait folding extends js.Object
  
  @js.native
  sealed trait `folding-direction-supported` extends js.Object
  
  @js.native
  sealed trait `folding-offset-supported` extends js.Object
  
  @js.native
  sealed trait `folding-reference-edge-supported` extends js.Object
  
  @js.native
  sealed trait folio
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `folio-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `font-name-requested` extends Overrides
  
  @js.native
  sealed trait `font-name-requested-default` extends js.Object
  
  @js.native
  sealed trait `font-name-requested-supported` extends js.Object
  
  @js.native
  sealed trait `font-size-requested` extends Overrides
  
  @js.native
  sealed trait `font-size-requested-default` extends js.Object
  
  @js.native
  sealed trait `font-size-requested-supported` extends js.Object
  
  @js.native
  sealed trait `force-front-side` extends Overrides
  
  @js.native
  sealed trait `force-front-side-actual` extends js.Object
  
  @js.native
  sealed trait `from-name-supported` extends js.Object
  
  @js.native
  sealed trait front extends FinishingSides
  
  @js.native
  sealed trait ftp extends UriSchemes
  
  @js.native
  sealed trait `fuchsia-pkg` extends UriSchemes
  
  @js.native
  sealed trait full extends TrimmingType
  
  @js.native
  sealed trait `full-cut-tabs` extends MediaType
  
  @js.native
  sealed trait `fuser-over-temp` extends PrinterStateReasons
  
  @js.native
  sealed trait `fuser-under-temp` extends PrinterStateReasons
  
  @js.native
  sealed trait g extends MaterialAmountUnits
  
  @js.native
  sealed trait gb2312 extends CharacterSet
  
  @js.native
  sealed trait general extends JobAccountType
  
  @js.native
  sealed trait `generated-natural-language-supported` extends js.Object
  
  @js.native
  sealed trait geo extends UriSchemes
  
  @js.native
  sealed trait gg extends UriSchemes
  
  @js.native
  sealed trait git extends UriSchemes
  
  @js.native
  sealed trait gizmoproject extends UriSchemes
  
  @js.native
  sealed trait glass extends MediaType
  
  @js.native
  sealed trait `glass-colored` extends MediaType
  
  @js.native
  sealed trait `glass-opaque` extends MediaType
  
  @js.native
  sealed trait `glass-surfaced` extends MediaType
  
  @js.native
  sealed trait `glass-textured` extends MediaType
  
  @js.native
  sealed trait glossy
    extends CoatingType
       with LaminatingType
       with MediaCoating
  
  @js.native
  sealed trait go extends UriSchemes
  
  @js.native
  sealed trait gold
    extends MaterialType
       with MediaColor
  
  @js.native
  sealed trait goldenrod extends MediaColor
  
  @js.native
  sealed trait gopher extends UriSchemes
  
  @js.native
  sealed trait graph extends UriSchemes
  
  @js.native
  sealed trait graphic extends PrintContentOptimize
  
  @js.native
  sealed trait `gravure-cylinder` extends MediaType
  
  @js.native
  sealed trait gray extends MediaColor
  
  @js.native
  sealed trait green extends MediaColor
  
  @js.native
  sealed trait group extends JobAccountType
  
  @js.native
  sealed trait gtalk extends UriSchemes
  
  @js.native
  sealed trait guaranteed extends js.Object
  
  @js.native
  sealed trait gzip extends Compression
  
  @js.native
  sealed trait h323 extends UriSchemes
  
  @js.native
  sealed trait hagaki extends MediaSource
  
  @js.native
  sealed trait halftone extends InputContentType
  
  @js.native
  sealed trait ham extends UriSchemes
  
  @js.native
  sealed trait hcap extends UriSchemes
  
  @js.native
  sealed trait hcp extends UriSchemes
  
  @js.native
  sealed trait hibernate extends PowerState
  
  @js.native
  sealed trait `hibernate-vendor1` extends PowerState
  
  @js.native
  sealed trait `hibernate-vendor2` extends PowerState
  
  @js.native
  sealed trait `hibernate-vendor3` extends PowerState
  
  @js.native
  sealed trait `hibernate-vendor4` extends PowerState
  
  @js.native
  sealed trait `hibernate-vendor5` extends PowerState
  
  @js.native
  sealed trait hierarchical extends js.Object
  
  @js.native
  sealed trait high extends PrintQuality
  
  @js.native
  sealed trait `high-gloss`
    extends CoatingType
       with LaminatingType
       with MediaCoating
  
  @js.native
  sealed trait highlight extends PrintColorMode
  
  @js.native
  sealed trait `hold-job_` extends js.Object
  
  @js.native
  sealed trait http extends UriSchemes
  
  @js.native
  sealed trait https extends UriSchemes
  
  @js.native
  sealed trait hxxp extends UriSchemes
  
  @js.native
  sealed trait hxxps extends UriSchemes
  
  @js.native
  sealed trait hydrazone extends UriSchemes
  
  @js.native
  sealed trait `hz-gb-2312` extends CharacterSet
  
  @js.native
  sealed trait `iana_us-ascii_any` extends JobPasswordRepertoire
  
  @js.native
  sealed trait `iana_us-ascii_complex` extends JobPasswordRepertoire
  
  @js.native
  sealed trait `iana_us-ascii_digits` extends JobPasswordRepertoire
  
  @js.native
  sealed trait `iana_us-ascii_letters` extends JobPasswordRepertoire
  
  @js.native
  sealed trait `iana_utf-8_any` extends JobPasswordRepertoire
  
  @js.native
  sealed trait `iana_utf-8_digits` extends JobPasswordRepertoire
  
  @js.native
  sealed trait `iana_utf-8_letters` extends JobPasswordRepertoire
  
  @js.native
  sealed trait iax extends UriSchemes
  
  @js.native
  sealed trait ibm737 extends CharacterSet
  
  @js.native
  sealed trait ibm775 extends CharacterSet
  
  @js.native
  sealed trait ibm850 extends CharacterSet
  
  @js.native
  sealed trait ibm852 extends CharacterSet
  
  @js.native
  sealed trait ibm857 extends CharacterSet
  
  @js.native
  sealed trait ibm861 extends CharacterSet
  
  @js.native
  sealed trait ibm869 extends CharacterSet
  
  @js.native
  sealed trait icap extends UriSchemes
  
  @js.native
  sealed trait icc extends js.Object
  
  @js.native
  sealed trait `icc-color-matching` extends js.Object
  
  @js.native
  sealed trait icon extends UriSchemes
  
  @js.native
  sealed trait `identify-actions-default` extends js.Object
  
  @js.native
  sealed trait `identify-actions-supported` extends js.Object
  
  @js.native
  sealed trait idle
    extends PrinterState
       with SystemState
  
  @js.native
  sealed trait im extends UriSchemes
  
  @js.native
  sealed trait `image-setter-paper` extends MediaType
  
  @js.native
  sealed trait imageSlashgif extends MimeMediaType
  
  @js.native
  sealed trait imageSlashief extends MimeMediaType
  
  @js.native
  sealed trait imageSlashjpeg extends MimeMediaType
  
  @js.native
  sealed trait imageSlashpng extends MimeMediaType
  
  @js.native
  sealed trait imageSlashtiff extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-cmu-raster` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-portable-anymap` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-portable-bitmap` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-portable-graymap` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-portable-pixmap` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-rgb` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-xbitmap` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-xpixmap` extends MimeMediaType
  
  @js.native
  sealed trait `imageSlashx-xwindowdump` extends MimeMediaType
  
  @js.native
  sealed trait `imaging-cylinder` extends MediaType
  
  @js.native
  sealed trait imap extends UriSchemes
  
  @js.native
  sealed trait `imposition-template` extends Overrides
  
  @js.native
  sealed trait `imposition-template-actual` extends js.Object
  
  @js.native
  sealed trait `imposition-template-default` extends js.Object
  
  @js.native
  sealed trait `imposition-template-supported` extends js.Object
  
  @js.native
  sealed trait `imprinter-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `imprinter-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait `in-fill` extends MaterialPurpose
  
  @js.native
  sealed trait inactivity extends TimeoutPredicate
  
  @js.native
  sealed trait incoming extends DocumentStateReasons
  
  @js.native
  sealed trait indefinite
    extends JobDelayOutputUntil
       with JobHoldUntil
       with JobRetainUntil
  
  @js.native
  sealed trait info extends UriSchemes
  
  @js.native
  sealed trait `infrastructure-printer` extends js.Object
  
  @js.native
  sealed trait `input-attributes-actual` extends js.Object
  
  @js.native
  sealed trait `input-attributes-default` extends js.Object
  
  @js.native
  sealed trait `input-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `input-cannot-feed-size-selected` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-color-mode-supported` extends js.Object
  
  @js.native
  sealed trait `input-content-type-supported` extends js.Object
  
  @js.native
  sealed trait `input-film-scan-mode-supported` extends js.Object
  
  @js.native
  sealed trait `input-manual-input-request` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-media-color-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-media-form-parts-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-media-size-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-media-supported` extends js.Object
  
  @js.native
  sealed trait `input-media-type-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-media-weight-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-orientation-requested-supported` extends js.Object
  
  @js.native
  sealed trait `input-quality-supported` extends js.Object
  
  @js.native
  sealed trait `input-resolution-supported` extends js.Object
  
  @js.native
  sealed trait `input-scan-regions-supported` extends js.Object
  
  @js.native
  sealed trait `input-sides-supported` extends js.Object
  
  @js.native
  sealed trait `input-source-supported` extends js.Object
  
  @js.native
  sealed trait `input-tray-elevation-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-tray-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `input-tray-position-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `insert-after-page-number` extends js.Object
  
  @js.native
  sealed trait `insert-after-page-number-supported` extends js.Object
  
  @js.native
  sealed trait `insert-count` extends js.Object
  
  @js.native
  sealed trait `insert-count-supported` extends js.Object
  
  @js.native
  sealed trait `insert-sheet` extends Overrides
  
  @js.native
  sealed trait `insert-sheet-actual` extends js.Object
  
  @js.native
  sealed trait `insert-sheet-default` extends js.Object
  
  @js.native
  sealed trait `insert-sheet-supported` extends js.Object
  
  @js.native
  sealed trait `inserter-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `inserter-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait installed extends ResourceState
  
  @js.native
  sealed trait `interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-cartridge-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-cartridge-deleted` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-complex-page-encountered` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-memory-decrease` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-memory-increase` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-resource-deleted` extends PrinterStateReasons
  
  @js.native
  sealed trait `interpreter-resource-unavailable` extends PrinterStateReasons
  
  @js.native
  sealed trait interpreting extends DocumentStateReasons
  
  @js.native
  sealed trait invoice
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `invoice-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait inward extends FoldingDirection
  
  @js.native
  sealed trait iotdisco extends UriSchemes
  
  @js.native
  sealed trait ipn extends UriSchemes
  
  @js.native
  sealed trait ipp extends UriSchemes
  
  @js.native
  sealed trait `ipp-3d` extends js.Object
  
  @js.native
  sealed trait `ipp-everywhere` extends js.Object
  
  @js.native
  sealed trait `ipp-features-supported` extends js.Object
  
  @js.native
  sealed trait `ipp-versions-supported` extends js.Object
  
  @js.native
  sealed trait ippget extends js.Object
  
  @js.native
  sealed trait `ippget-event-life` extends js.Object
  
  @js.native
  sealed trait ipps extends UriSchemes
  
  @js.native
  sealed trait irc extends UriSchemes
  
  @js.native
  sealed trait irc6 extends UriSchemes
  
  @js.native
  sealed trait ircs extends UriSchemes
  
  @js.native
  sealed trait iris extends UriSchemes
  
  @js.native
  sealed trait irisDotbeep extends UriSchemes
  
  @js.native
  sealed trait irisDotlwz extends UriSchemes
  
  @js.native
  sealed trait irisDotxpc extends UriSchemes
  
  @js.native
  sealed trait irisDotxpcs extends UriSchemes
  
  @js.native
  sealed trait `iso-15930-1_2001` extends js.Object
  
  @js.native
  sealed trait `iso-15930-3_2002` extends js.Object
  
  @js.native
  sealed trait `iso-15930-4_2003` extends js.Object
  
  @js.native
  sealed trait `iso-15930-6_2003` extends js.Object
  
  @js.native
  sealed trait `iso-15930-7_2010` extends js.Object
  
  @js.native
  sealed trait `iso-15930-8_2010` extends js.Object
  
  @js.native
  sealed trait `iso-16612-2_2010` extends js.Object
  
  @js.native
  sealed trait `iso-19005-1_2005` extends js.Object
  
  @js.native
  sealed trait `iso-19005-2_2011` extends js.Object
  
  @js.native
  sealed trait `iso-19005-3_2012` extends js.Object
  
  @js.native
  sealed trait `iso-2022-jp` extends CharacterSet
  
  @js.native
  sealed trait `iso-2022-kr` extends CharacterSet
  
  @js.native
  sealed trait `iso-32000-1_2008` extends js.Object
  
  @js.native
  sealed trait `iso-8859-1` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-15` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-2` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-3` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-4` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-5` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-6` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-7` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-8` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-8-i` extends CharacterSet
  
  @js.native
  sealed trait `iso-8859-9` extends CharacterSet
  
  @js.native
  sealed trait `iso-a0`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a0-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a0-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a0-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a0xsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a0xsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a0xsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a1-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a10`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a10-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1x3-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1x3-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1x3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1x4-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1x4-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1x4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1xsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1xsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a1xsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a2-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x3-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x3-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x4-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x4-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x5-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x5-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2x5-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2xsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2xsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a2xsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a3-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x3-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x3-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x4-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x4-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x5-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x5-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x5-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x6-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x6-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x6-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x7-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x7-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3x7-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3xsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3xsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a3xsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a4-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x3-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x3-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x4-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x4-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x5-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x5-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x5-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x6-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x6-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x6-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x7-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x7-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x7-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x8-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x8-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x8-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x9-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x9-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4x9-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4xsynchro-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4xsynchro-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a4xsynchro-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a5`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a5-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a5-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a5-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a5-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a6`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a6-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a7`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a7-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a8`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a8-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-a9`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-a9-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b0`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b0-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b1`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b1-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b10`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b10-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b2`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b2-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b3`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b4`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b4-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b4-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `iso-b4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b5`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b5-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b5-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `iso-b5-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b6`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b6-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b7`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b7-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b8`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b8-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-b9`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-b9-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `iso-c3`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-c3-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `iso-c4`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-c4-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `iso-c5`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-c5-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `iso-c6`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-c6-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `iso-designated-long`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso-designated-long-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait iso_2a0_1189x1682mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a0_841x1189mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a0x3_1189x2523mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a10_26x37mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a1_594x841mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a1x3_841x1783mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a1x4_841x2378mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a2_420x594mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a2x3_594x1261mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a2x4_594x1682mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a2x5_594x2102mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_a3-extra_322x445mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a3_297x420mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a3x3_420x891mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a3x4_420x1189mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a3x5_420x1486mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a3x6_420x1783mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a3x7_420x2080mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_a4-extra_235Dot5x322Dot3mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_a4-tab_225x297mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4_210x297mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x3_297x630mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x4_297x841mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x5_297x1051mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x6_297x1261mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x7_297x1471mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x8_297x1682mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a4x9_297x1892mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_a5-extra_174x235mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a5_148x210mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a6_105x148mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a7_74x105mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a8_52x74mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_a9_37x52mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b0_1000x1414mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b10_31x44mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b1_707x1000mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b2_500x707mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b3_353x500mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b4_250x353mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_b5-extra_201x276mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b5_176x250mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b6_125x176mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b6c4_125x324mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b7_88x125mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b8_62x88mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_b9_44x62mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c0_917x1297mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c10_28x40mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c1_648x917mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c2_458x648mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c3_324x458mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c4_229x324mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c5_162x229mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c6_114x162mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c6c5_114x229mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c7_81x114mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c7c6_81x162mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c8_57x81mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_c9_40x57mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_dl_110x220mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_id-1_53Dot98x85Dot6mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `iso_id-3_88x125mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_ra0_860x1220mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_ra1_610x860mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_ra2_430x610mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_ra3_305x430mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_ra4_215x305mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_sra0_900x1280mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_sra1_640x900mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_sra2_450x640mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_sra3_320x450mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait iso_sra4_225x320mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait isostore extends UriSchemes
  
  @js.native
  sealed trait itms extends UriSchemes
  
  @js.native
  sealed trait ivory extends MediaColor
  
  @js.native
  sealed trait jabber extends UriSchemes
  
  @js.native
  sealed trait jar extends UriSchemes
  
  @js.native
  sealed trait `jdf-f10-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f10-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f10-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-10` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-11` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-12` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-13` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-14` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-7` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-8` extends Finishings
  
  @js.native
  sealed trait `jdf-f12-9` extends Finishings
  
  @js.native
  sealed trait `jdf-f14-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-10` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-11` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-12` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-13` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-14` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-7` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-8` extends Finishings
  
  @js.native
  sealed trait `jdf-f16-9` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-7` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-8` extends Finishings
  
  @js.native
  sealed trait `jdf-f18-9` extends Finishings
  
  @js.native
  sealed trait `jdf-f2-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f20-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f20-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-10` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-11` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-7` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-8` extends Finishings
  
  @js.native
  sealed trait `jdf-f24-9` extends Finishings
  
  @js.native
  sealed trait `jdf-f28-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-7` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-8` extends Finishings
  
  @js.native
  sealed trait `jdf-f32-9` extends Finishings
  
  @js.native
  sealed trait `jdf-f36-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f36-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f4-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f4-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f40-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f48-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f48-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-7` extends Finishings
  
  @js.native
  sealed trait `jdf-f6-8` extends Finishings
  
  @js.native
  sealed trait `jdf-f64-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f64-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-1` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-2` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-3` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-4` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-5` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-6` extends Finishings
  
  @js.native
  sealed trait `jdf-f8-7` extends Finishings
  
  @js.native
  sealed trait `jis-b0`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b0-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b0-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b0-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b1`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b1-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b1-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b1-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b10`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b10-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b2`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b2-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b2-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b2-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b3`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b3-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b3-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b3-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b4`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b4-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b4-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b4-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b4-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b5`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b5-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b5-translucent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b5-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b5-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b6`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b6-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b7`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b7-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b8`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b8-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `jis-b9`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `jis-b9-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait jis_b0_1030x1456mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b10_32x45mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b1_728x1030mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b2_515x728mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b3_364x515mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b4_257x364mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b5_182x257mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b6_128x182mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b7_91x128mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b8_64x91mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_b9_45x64mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jis_exec_216x330mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jms extends UriSchemes
  
  @js.native
  sealed trait `job-account-id` extends Overrides
  
  @js.native
  sealed trait `job-account-id-actual` extends js.Object
  
  @js.native
  sealed trait `job-account-id-default` extends js.Object
  
  @js.native
  sealed trait `job-account-id-supported` extends js.Object
  
  @js.native
  sealed trait `job-account-type` extends Overrides
  
  @js.native
  sealed trait `job-account-type-actual` extends js.Object
  
  @js.native
  sealed trait `job-account-type-default` extends js.Object
  
  @js.native
  sealed trait `job-account-type-supported` extends js.Object
  
  @js.native
  sealed trait `job-accounting-sheets` extends Overrides
  
  @js.native
  sealed trait `job-accounting-sheets-actual` extends js.Object
  
  @js.native
  sealed trait `job-accounting-sheets-default` extends js.Object
  
  @js.native
  sealed trait `job-accounting-sheets-supported` extends js.Object
  
  @js.native
  sealed trait `job-accounting-user-id` extends Overrides
  
  @js.native
  sealed trait `job-accounting-user-id-actual` extends js.Object
  
  @js.native
  sealed trait `job-accounting-user-id-default` extends js.Object
  
  @js.native
  sealed trait `job-accounting-user-id-supported` extends js.Object
  
  @js.native
  sealed trait `job-attribute-fidelity` extends js.Object
  
  @js.native
  sealed trait `job-authorization-uri-supported` extends js.Object
  
  @js.native
  sealed trait `job-both-sheet` extends JobSheets
  
  @js.native
  sealed trait `job-cancel-after` extends Overrides
  
  @js.native
  sealed trait `job-cancel-after-default` extends js.Object
  
  @js.native
  sealed trait `job-cancel-after-supported` extends js.Object
  
  @js.native
  sealed trait `job-canceled-at-device` extends JobStateReasons
  
  @js.native
  sealed trait `job-canceled-by-operator` extends JobStateReasons
  
  @js.native
  sealed trait `job-canceled-by-user` extends JobStateReasons
  
  @js.native
  sealed trait `job-completed` extends NotifyEvents
  
  @js.native
  sealed trait `job-completed-successfully` extends JobStateReasons
  
  @js.native
  sealed trait `job-completed-with-errors` extends JobStateReasons
  
  @js.native
  sealed trait `job-completed-with-warnings` extends JobStateReasons
  
  @js.native
  sealed trait `job-config-changed` extends NotifyEvents
  
  @js.native
  sealed trait `job-constraints-supported` extends js.Object
  
  @js.native
  sealed trait `job-copies` extends Overrides
  
  @js.native
  sealed trait `job-cover-back` extends Overrides
  
  @js.native
  sealed trait `job-cover-front` extends Overrides
  
  @js.native
  sealed trait `job-created` extends NotifyEvents
  
  @js.native
  sealed trait `job-creation-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `job-data-insufficient` extends JobStateReasons
  
  @js.native
  sealed trait `job-delay-output-until` extends Overrides
  
  @js.native
  sealed trait `job-delay-output-until-default` extends js.Object
  
  @js.native
  sealed trait `job-delay-output-until-interval-supported` extends js.Object
  
  @js.native
  sealed trait `job-delay-output-until-specified` extends JobStateReasons
  
  @js.native
  sealed trait `job-delay-output-until-supported` extends js.Object
  
  @js.native
  sealed trait `job-delay-output-until-time` extends Overrides
  
  @js.native
  sealed trait `job-delay-output-until-time-supported` extends js.Object
  
  @js.native
  sealed trait `job-description` extends RequestedJobAttributeGroups
  
  @js.native
  sealed trait `job-destination-spooling-supported` extends js.Object
  
  @js.native
  sealed trait `job-detailed-status-messages` extends js.Object
  
  @js.native
  sealed trait `job-digital-signature-wait` extends JobStateReasons
  
  @js.native
  sealed trait `job-document-access-errors` extends js.Object
  
  @js.native
  sealed trait `job-end-sheet` extends JobSheets
  
  @js.native
  sealed trait `job-error-action` extends Overrides
  
  @js.native
  sealed trait `job-error-action-default` extends js.Object
  
  @js.native
  sealed trait `job-error-action-supported` extends js.Object
  
  @js.native
  sealed trait `job-error-sheet` extends Overrides
  
  @js.native
  sealed trait `job-error-sheet-actual` extends js.Object
  
  @js.native
  sealed trait `job-error-sheet-default` extends js.Object
  
  @js.native
  sealed trait `job-error-sheet-supported` extends js.Object
  
  @js.native
  sealed trait `job-finishings` extends Overrides
  
  @js.native
  sealed trait `job-finishings-col` extends Overrides
  
  @js.native
  sealed trait `job-history-attributes-configured` extends js.Object
  
  @js.native
  sealed trait `job-history-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `job-history-interval-configured` extends js.Object
  
  @js.native
  sealed trait `job-history-interval-supported` extends js.Object
  
  @js.native
  sealed trait `job-hold-until` extends Overrides
  
  @js.native
  sealed trait `job-hold-until-actual` extends js.Object
  
  @js.native
  sealed trait `job-hold-until-default` extends js.Object
  
  @js.native
  sealed trait `job-hold-until-specified` extends JobStateReasons
  
  @js.native
  sealed trait `job-hold-until-supported` extends js.Object
  
  @js.native
  sealed trait `job-hold-until-time` extends Overrides
  
  @js.native
  sealed trait `job-hold-until-time-supported` extends js.Object
  
  @js.native
  sealed trait `job-id` extends js.Object
  
  @js.native
  sealed trait `job-ids-supported` extends js.Object
  
  @js.native
  sealed trait `job-impressions` extends js.Object
  
  @js.native
  sealed trait `job-impressions-col` extends js.Object
  
  @js.native
  sealed trait `job-impressions-completed` extends js.Object
  
  @js.native
  sealed trait `job-impressions-completed-col` extends js.Object
  
  @js.native
  sealed trait `job-impressions-supported` extends js.Object
  
  @js.native
  sealed trait `job-incoming` extends JobStateReasons
  
  @js.native
  sealed trait `job-interpreting` extends JobStateReasons
  
  @js.native
  sealed trait `job-k-octets` extends js.Object
  
  @js.native
  sealed trait `job-k-octets-processed` extends js.Object
  
  @js.native
  sealed trait `job-k-octets-supported` extends js.Object
  
  @js.native
  sealed trait `job-mandatory-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `job-media-sheets` extends js.Object
  
  @js.native
  sealed trait `job-media-sheets-col` extends js.Object
  
  @js.native
  sealed trait `job-media-sheets-completed` extends js.Object
  
  @js.native
  sealed trait `job-media-sheets-completed-col` extends js.Object
  
  @js.native
  sealed trait `job-media-sheets-supported` extends js.Object
  
  @js.native
  sealed trait `job-message-to-operator` extends Overrides
  
  @js.native
  sealed trait `job-message-to-operator-default` extends js.Object
  
  @js.native
  sealed trait `job-message-to-operator-supported` extends js.Object
  
  @js.native
  sealed trait `job-more-info` extends js.Object
  
  @js.native
  sealed trait `job-originating-user-name` extends js.Object
  
  @js.native
  sealed trait `job-originating-user-uri` extends js.Object
  
  @js.native
  sealed trait `job-outgoing` extends JobStateReasons
  
  @js.native
  sealed trait `job-pages` extends js.Object
  
  @js.native
  sealed trait `job-pages-col` extends js.Object
  
  @js.native
  sealed trait `job-pages-completed` extends js.Object
  
  @js.native
  sealed trait `job-pages-completed-col` extends js.Object
  
  @js.native
  sealed trait `job-pages-completed-current-copy` extends js.Object
  
  @js.native
  sealed trait `job-pages-per-set` extends Overrides
  
  @js.native
  sealed trait `job-pages-per-set-supported` extends js.Object
  
  @js.native
  sealed trait `job-password-encryption-supported` extends js.Object
  
  @js.native
  sealed trait `job-password-length-supported` extends js.Object
  
  @js.native
  sealed trait `job-password-repertoire-configured` extends js.Object
  
  @js.native
  sealed trait `job-password-repertoire-supported` extends js.Object
  
  @js.native
  sealed trait `job-password-supported` extends js.Object
  
  @js.native
  sealed trait `job-password-wait` extends JobStateReasons
  
  @js.native
  sealed trait `job-phone-number` extends Overrides
  
  @js.native
  sealed trait `job-phone-number-default` extends js.Object
  
  @js.native
  sealed trait `job-phone-number-supported` extends js.Object
  
  @js.native
  sealed trait `job-presets-supported` extends js.Object
  
  @js.native
  sealed trait `job-printed-successfully` extends JobStateReasons
  
  @js.native
  sealed trait `job-printed-with-errors` extends JobStateReasons
  
  @js.native
  sealed trait `job-printed-with-warnings` extends JobStateReasons
  
  @js.native
  sealed trait `job-printer-up-time` extends js.Object
  
  @js.native
  sealed trait `job-printer-uri` extends js.Object
  
  @js.native
  sealed trait `job-printing` extends JobStateReasons
  
  @js.native
  sealed trait `job-priority` extends Overrides
  
  @js.native
  sealed trait `job-priority-actual` extends js.Object
  
  @js.native
  sealed trait `job-priority-default` extends js.Object
  
  @js.native
  sealed trait `job-priority-supported` extends js.Object
  
  @js.native
  sealed trait `job-privacy-attributes` extends js.Object
  
  @js.native
  sealed trait `job-privacy-scope` extends js.Object
  
  @js.native
  sealed trait `job-progress` extends NotifyEvents
  
  @js.native
  sealed trait `job-queued` extends JobStateReasons
  
  @js.native
  sealed trait `job-queued-for-marker` extends JobStateReasons
  
  @js.native
  sealed trait `job-recipient-name` extends Overrides
  
  @js.native
  sealed trait `job-recipient-name-default` extends js.Object
  
  @js.native
  sealed trait `job-recipient-name-supported` extends js.Object
  
  @js.native
  sealed trait `job-resolvers-supported` extends js.Object
  
  @js.native
  sealed trait `job-resource-ids` extends js.Object
  
  @js.native
  sealed trait `job-restartable` extends JobStateReasons
  
  @js.native
  sealed trait `job-resuming` extends JobStateReasons
  
  @js.native
  sealed trait `job-retain-until` extends Overrides
  
  @js.native
  sealed trait `job-retain-until-default` extends js.Object
  
  @js.native
  sealed trait `job-retain-until-interval` extends Overrides
  
  @js.native
  sealed trait `job-retain-until-interval-supported` extends js.Object
  
  @js.native
  sealed trait `job-retain-until-supported` extends js.Object
  
  @js.native
  sealed trait `job-retain-until-time` extends Overrides
  
  @js.native
  sealed trait `job-retain-until-time-supported` extends js.Object
  
  @js.native
  sealed trait `job-save` extends js.Object
  
  @js.native
  sealed trait `job-save-disposition` extends Overrides
  
  @js.native
  sealed trait `job-saved-successfully` extends JobStateReasons
  
  @js.native
  sealed trait `job-saved-with-errors` extends JobStateReasons
  
  @js.native
  sealed trait `job-saved-with-warnings` extends JobStateReasons
  
  @js.native
  sealed trait `job-saving` extends JobStateReasons
  
  @js.native
  sealed trait `job-sheet-message` extends Overrides
  
  @js.native
  sealed trait `job-sheet-message-actual` extends js.Object
  
  @js.native
  sealed trait `job-sheet-message-default` extends js.Object
  
  @js.native
  sealed trait `job-sheet-message-supported` extends js.Object
  
  @js.native
  sealed trait `job-sheets` extends Overrides
  
  @js.native
  sealed trait `job-sheets-actual` extends js.Object
  
  @js.native
  sealed trait `job-sheets-col` extends Overrides
  
  @js.native
  sealed trait `job-sheets-col-actual` extends js.Object
  
  @js.native
  sealed trait `job-sheets-col-default` extends js.Object
  
  @js.native
  sealed trait `job-sheets-col-supported` extends js.Object
  
  @js.native
  sealed trait `job-sheets-default` extends js.Object
  
  @js.native
  sealed trait `job-sheets-supported` extends js.Object
  
  @js.native
  sealed trait `job-spooling` extends JobStateReasons
  
  @js.native
  sealed trait `job-spooling-supported` extends js.Object
  
  @js.native
  sealed trait `job-start-sheet` extends JobSheets
  
  @js.native
  sealed trait `job-state` extends js.Object
  
  @js.native
  sealed trait `job-state-changed` extends NotifyEvents
  
  @js.native
  sealed trait `job-state-message` extends js.Object
  
  @js.native
  sealed trait `job-state-reasons` extends js.Object
  
  @js.native
  sealed trait `job-stopped` extends NotifyEvents
  
  @js.native
  sealed trait `job-streaming` extends JobStateReasons
  
  @js.native
  sealed trait `job-suspended` extends JobStateReasons
  
  @js.native
  sealed trait `job-suspended-by-operator` extends JobStateReasons
  
  @js.native
  sealed trait `job-suspended-by-system` extends JobStateReasons
  
  @js.native
  sealed trait `job-suspended-by-user` extends JobStateReasons
  
  @js.native
  sealed trait `job-suspending` extends JobStateReasons
  
  @js.native
  sealed trait `job-template`
    extends RequestedJobAttributeGroups
       with RequestedPrinterAttributeGroups
  
  @js.native
  sealed trait `job-transforming` extends JobStateReasons
  
  @js.native
  sealed trait `job-triggers-supported` extends js.Object
  
  @js.native
  sealed trait `job-uri` extends js.Object
  
  @js.native
  sealed trait `job-uuid` extends js.Object
  
  @js.native
  sealed trait `jog-offset` extends Finishings
  
  @js.native
  sealed trait `jpeg-features-supported` extends js.Object
  
  @js.native
  sealed trait `jpeg-k-octets-supported` extends js.Object
  
  @js.native
  sealed trait `jpeg-x-dimension-supported` extends js.Object
  
  @js.native
  sealed trait `jpeg-y-dimension-supported` extends js.Object
  
  @js.native
  sealed trait jpn_chou2_111Dot1x146mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_chou3_120x235mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_chou40_90x225mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_chou4_90x205mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_hagaki_100x148mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kahu_240x322Dot1mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku1_270x382mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku2_240x332mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku3_216x277mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku4_197x267mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku5_190x240mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku7_142x205mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_kaku8_119x197mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_oufuku_148x200mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait jpn_you4_105x235mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait keyparc extends UriSchemes
  
  @js.native
  sealed trait kg extends MaterialAmountUnits
  
  @js.native
  sealed trait `koi8-r` extends CharacterSet
  
  @js.native
  sealed trait `koi8-u` extends CharacterSet
  
  @js.native
  sealed trait `ks_c_5601-1987` extends CharacterSet
  
  @js.native
  sealed trait l extends MaterialAmountUnits
  
  @js.native
  sealed trait label extends PrinterKind
  
  @js.native
  sealed trait labels extends MediaType
  
  @js.native
  sealed trait `labels-colored` extends MediaType
  
  @js.native
  sealed trait `labels-glossy` extends MediaType
  
  @js.native
  sealed trait `labels-high-gloss` extends MediaType
  
  @js.native
  sealed trait `labels-inkjet` extends MediaType
  
  @js.native
  sealed trait `labels-matte` extends MediaType
  
  @js.native
  sealed trait `labels-permanent` extends MediaType
  
  @js.native
  sealed trait `labels-satin` extends MediaType
  
  @js.native
  sealed trait `labels-security` extends MediaType
  
  @js.native
  sealed trait `labels-semi-gloss` extends MediaType
  
  @js.native
  sealed trait laminate extends Finishings
  
  @js.native
  sealed trait laminating extends js.Object
  
  @js.native
  sealed trait `laminating-foil` extends MediaType
  
  @js.native
  sealed trait `laminating-sides-supported` extends js.Object
  
  @js.native
  sealed trait `laminating-type-supported` extends js.Object
  
  @js.native
  sealed trait landscape extends OrientationRequested
  
  @js.native
  sealed trait large extends PrinterKind
  
  @js.native
  sealed trait `large-capacity`
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
  
  @js.native
  sealed trait lastfm extends UriSchemes
  
  @js.native
  sealed trait ldap extends UriSchemes
  
  @js.native
  sealed trait ldaps extends UriSchemes
  
  @js.native
  sealed trait leaptofrogans extends UriSchemes
  
  @js.native
  sealed trait ledger
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `ledger-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait left
    extends MediaSource
       with OutputBin
       with ReferenceEdge
       with XImagePosition
  
  @js.native
  sealed trait `letter-head` extends MediaPrePrinted
  
  @js.native
  sealed trait letterhead extends MediaType
  
  @js.native
  sealed trait `light-black` extends MediaColor
  
  @js.native
  sealed trait `light-blue` extends MediaColor
  
  @js.native
  sealed trait `light-brown` extends MediaColor
  
  @js.native
  sealed trait `light-buff` extends MediaColor
  
  @js.native
  sealed trait `light-cyan` extends MediaColor
  
  @js.native
  sealed trait `light-gold` extends MediaColor
  
  @js.native
  sealed trait `light-goldenrod` extends MediaColor
  
  @js.native
  sealed trait `light-gray` extends MediaColor
  
  @js.native
  sealed trait `light-green` extends MediaColor
  
  @js.native
  sealed trait `light-ivory` extends MediaColor
  
  @js.native
  sealed trait `light-magenta` extends MediaColor
  
  @js.native
  sealed trait `light-mustard` extends MediaColor
  
  @js.native
  sealed trait `light-orange` extends MediaColor
  
  @js.native
  sealed trait `light-pink` extends MediaColor
  
  @js.native
  sealed trait `light-red` extends MediaColor
  
  @js.native
  sealed trait `light-silver` extends MediaColor
  
  @js.native
  sealed trait `light-turquoise` extends MediaColor
  
  @js.native
  sealed trait `light-violet` extends MediaColor
  
  @js.native
  sealed trait `light-yellow` extends MediaColor
  
  @js.native
  sealed trait `line-art` extends InputContentType
  
  @js.native
  sealed trait linen extends MediaTooth
  
  @js.native
  sealed trait `logo-uri-formats-supported` extends js.Object
  
  @js.native
  sealed trait `logo-uri-schemes-supported` extends js.Object
  
  @js.native
  sealed trait `long-edge-first` extends FeedOrientation
  
  @js.native
  sealed trait lorawan extends UriSchemes
  
  @js.native
  sealed trait lossless extends js.Object
  
  @js.native
  sealed trait lvlt extends UriSchemes
  
  @js.native
  sealed trait m extends MaterialAmountUnits
  
  @js.native
  sealed trait macintosh extends CharacterSet
  
  @js.native
  sealed trait magazine extends InputContentType
  
  @js.native
  sealed trait magenta extends MediaColor
  
  @js.native
  sealed trait magnet extends UriSchemes
  
  @js.native
  sealed trait `mailbox-1` extends OutputBin
  
  @js.native
  sealed trait `mailbox-10` extends OutputBin
  
  @js.native
  sealed trait `mailbox-2` extends OutputBin
  
  @js.native
  sealed trait `mailbox-3` extends OutputBin
  
  @js.native
  sealed trait `mailbox-4` extends OutputBin
  
  @js.native
  sealed trait `mailbox-5` extends OutputBin
  
  @js.native
  sealed trait `mailbox-6` extends OutputBin
  
  @js.native
  sealed trait `mailbox-7` extends OutputBin
  
  @js.native
  sealed trait `mailbox-8` extends OutputBin
  
  @js.native
  sealed trait `mailbox-9` extends OutputBin
  
  @js.native
  sealed trait mailserver extends UriSchemes
  
  @js.native
  sealed trait mailto extends UriSchemes
  
  @js.native
  sealed trait main
    extends Media
       with MediaIntputTray
       with MediaSource
  
  @js.native
  sealed trait `main-roll` extends MediaSource
  
  @js.native
  sealed trait `make-envelope-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `make-envelope-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait manual
    extends Media
       with MediaIntputTray
       with MediaSource
  
  @js.native
  sealed trait `manual-tumble` extends js.Object
  
  @js.native
  sealed trait maps extends UriSchemes
  
  @js.native
  sealed trait `marker-adjusting-print-quality` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-developer-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-developer-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-fuser-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-fuser-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-ink-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-ink-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-print-ribbon-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-print-ribbon-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-supply-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-supply-low` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-toner-cartridge-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-waste-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-waste-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-waste-ink-receptacle-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-waste-ink-receptacle-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-waste-toner-receptacle-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `marker-waste-toner-receptacle-full` extends PrinterStateReasons
  
  @js.native
  sealed trait market extends UriSchemes
  
  @js.native
  sealed trait material extends PrintSupports
  
  @js.native
  sealed trait `material-amount` extends js.Object
  
  @js.native
  sealed trait `material-amount-units` extends js.Object
  
  @js.native
  sealed trait `material-amount-units-supported` extends js.Object
  
  @js.native
  sealed trait `material-color` extends js.Object
  
  @js.native
  sealed trait `material-diameter` extends js.Object
  
  @js.native
  sealed trait `material-diameter-supported` extends js.Object
  
  @js.native
  sealed trait `material-diameter-tolerance` extends js.Object
  
  @js.native
  sealed trait `material-fill-density` extends js.Object
  
  @js.native
  sealed trait `material-key` extends js.Object
  
  @js.native
  sealed trait `material-name` extends js.Object
  
  @js.native
  sealed trait `material-nozzle-diameter` extends js.Object
  
  @js.native
  sealed trait `material-nozzle-diameter-supported` extends js.Object
  
  @js.native
  sealed trait `material-purpose` extends js.Object
  
  @js.native
  sealed trait `material-purpose-supported` extends js.Object
  
  @js.native
  sealed trait `material-rate` extends js.Object
  
  @js.native
  sealed trait `material-rate-supported` extends js.Object
  
  @js.native
  sealed trait `material-rate-units` extends js.Object
  
  @js.native
  sealed trait `material-rate-units-supported` extends js.Object
  
  @js.native
  sealed trait `material-retraction` extends js.Object
  
  @js.native
  sealed trait `material-shell-thickness` extends js.Object
  
  @js.native
  sealed trait `material-shell-thickness-supported` extends js.Object
  
  @js.native
  sealed trait `material-temperature` extends js.Object
  
  @js.native
  sealed trait `material-temperature-supported` extends js.Object
  
  @js.native
  sealed trait `material-type` extends js.Object
  
  @js.native
  sealed trait `material-type-supported` extends js.Object
  
  @js.native
  sealed trait `materials-col` extends Overrides
  
  @js.native
  sealed trait `materials-col-actual` extends js.Object
  
  @js.native
  sealed trait `materials-col-database` extends js.Object
  
  @js.native
  sealed trait `materials-col-default` extends js.Object
  
  @js.native
  sealed trait `materials-col-ready` extends js.Object
  
  @js.native
  sealed trait `materials-col-supported` extends js.Object
  
  @js.native
  sealed trait matte
    extends CoatingType
       with LaminatingType
       with MediaCoating
  
  @js.native
  sealed trait `max-materials-col-supported` extends js.Object
  
  @js.native
  sealed trait `max-page-ranges-supported` extends js.Object
  
  @js.native
  sealed trait `max-save-info-supported` extends js.Object
  
  @js.native
  sealed trait `max-stitching-locations-supported` extends js.Object
  
  @js.native
  sealed trait md2 extends JobPasswordEncryption
  
  @js.native
  sealed trait md4 extends JobPasswordEncryption
  
  @js.native
  sealed trait md5 extends JobPasswordEncryption
  
  @js.native
  sealed trait media extends Overrides
  
  @js.native
  sealed trait `media-actual` extends js.Object
  
  @js.native
  sealed trait `media-back-coating-supported` extends js.Object
  
  @js.native
  sealed trait `media-bottom-margin` extends MediaColSupported
  
  @js.native
  sealed trait `media-bottom-margin-supported` extends js.Object
  
  @js.native
  sealed trait `media-col` extends Overrides
  
  @js.native
  sealed trait `media-col-actual` extends js.Object
  
  @js.native
  sealed trait `media-col-database` extends js.Object
  
  @js.native
  sealed trait `media-col-default` extends js.Object
  
  @js.native
  sealed trait `media-col-ready` extends js.Object
  
  @js.native
  sealed trait `media-col-supported` extends js.Object
  
  @js.native
  sealed trait `media-color-supported` extends js.Object
  
  @js.native
  sealed trait `media-default` extends js.Object
  
  @js.native
  sealed trait `media-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-front-coating-supported` extends js.Object
  
  @js.native
  sealed trait `media-grain-supported` extends js.Object
  
  @js.native
  sealed trait `media-hole-count-supported` extends js.Object
  
  @js.native
  sealed trait `media-input-tray-check` extends Overrides
  
  @js.native
  sealed trait `media-input-tray-check-actual` extends js.Object
  
  @js.native
  sealed trait `media-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-key-supported` extends js.Object
  
  @js.native
  sealed trait `media-left-margin` extends MediaColSupported
  
  @js.native
  sealed trait `media-left-margin-supported` extends js.Object
  
  @js.native
  sealed trait `media-low` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-needed` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-order-count-supported` extends js.Object
  
  @js.native
  sealed trait `media-path-cannot-duplex-media-selected` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-path-media-tray-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-path-media-tray-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-path-media-tray-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `media-pre-printed-supported` extends js.Object
  
  @js.native
  sealed trait `media-ready` extends js.Object
  
  @js.native
  sealed trait `media-recycled-supported` extends js.Object
  
  @js.native
  sealed trait `media-right-margin` extends MediaColSupported
  
  @js.native
  sealed trait `media-right-margin-supported` extends js.Object
  
  @js.native
  sealed trait `media-sheets-supported` extends js.Object
  
  @js.native
  sealed trait `media-size` extends js.Object
  
  @js.native
  sealed trait `media-size-name` extends MediaColSupported
  
  @js.native
  sealed trait `media-size-supported` extends js.Object
  
  @js.native
  sealed trait `media-source` extends MediaColSupported
  
  @js.native
  sealed trait `media-source-supported` extends js.Object
  
  @js.native
  sealed trait `media-supported` extends js.Object
  
  @js.native
  sealed trait `media-thickness-supported` extends js.Object
  
  @js.native
  sealed trait `media-tooth-supported` extends js.Object
  
  @js.native
  sealed trait `media-top-margin` extends MediaColSupported
  
  @js.native
  sealed trait `media-top-margin-supported` extends js.Object
  
  @js.native
  sealed trait `media-type-supported` extends js.Object
  
  @js.native
  sealed trait `media-weight-metric-supported` extends js.Object
  
  @js.native
  sealed trait medium extends MediaTooth
  
  @js.native
  sealed trait message extends UriSchemes
  
  @js.native
  sealed trait `message-supported` extends js.Object
  
  @js.native
  sealed trait `messageSlashexternal-body` extends MimeMediaType
  
  @js.native
  sealed trait messageSlashnews extends MimeMediaType
  
  @js.native
  sealed trait messageSlashpartial extends MimeMediaType
  
  @js.native
  sealed trait messageSlashrfc822 extends MimeMediaType
  
  @js.native
  sealed trait metal extends MediaType
  
  @js.native
  sealed trait `metal-glossy` extends MediaType
  
  @js.native
  sealed trait `metal-high-gloss` extends MediaType
  
  @js.native
  sealed trait `metal-matte` extends MediaType
  
  @js.native
  sealed trait `metal-satin` extends MediaType
  
  @js.native
  sealed trait `metal-semi-gloss` extends MediaType
  
  @js.native
  sealed trait mg_second extends MaterialRateUnits
  
  @js.native
  sealed trait microsoftDotwindowsDotcamera extends UriSchemes
  
  @js.native
  sealed trait microsoftDotwindowsDotcameraDotmultipicker extends UriSchemes
  
  @js.native
  sealed trait microsoftDotwindowsDotcameraDotpicker extends UriSchemes
  
  @js.native
  sealed trait mid extends UriSchemes
  
  @js.native
  sealed trait middle
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
  
  @js.native
  sealed trait ml extends MaterialAmountUnits
  
  @js.native
  sealed trait ml_second extends MaterialRateUnits
  
  @js.native
  sealed trait mm
    extends AccuracyUnits
       with MaterialAmountUnits
  
  @js.native
  sealed trait mm_second extends MaterialRateUnits
  
  @js.native
  sealed trait mms extends UriSchemes
  
  @js.native
  sealed trait modem extends UriSchemes
  
  @js.native
  sealed trait monarch
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `monarch-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait mongodb extends UriSchemes
  
  @js.native
  sealed trait monochrome
    extends InputColorMode
       with PrintColorMode
  
  @js.native
  sealed trait monochrome_16 extends InputColorMode
  
  @js.native
  sealed trait monochrome_4 extends InputColorMode
  
  @js.native
  sealed trait monochrome_8 extends InputColorMode
  
  @js.native
  sealed trait `mounting-tape` extends MediaType
  
  @js.native
  sealed trait `moving-to-paused` extends PrinterStateReasons
  
  @js.native
  sealed trait moz extends UriSchemes
  
  @js.native
  sealed trait `ms-access` extends UriSchemes
  
  @js.native
  sealed trait `ms-browser-extension` extends UriSchemes
  
  @js.native
  sealed trait `ms-calculator` extends UriSchemes
  
  @js.native
  sealed trait `ms-drive-to` extends UriSchemes
  
  @js.native
  sealed trait `ms-enrollment` extends UriSchemes
  
  @js.native
  sealed trait `ms-excel` extends UriSchemes
  
  @js.native
  sealed trait `ms-eyecontrolspeech` extends UriSchemes
  
  @js.native
  sealed trait `ms-gamebarservices` extends UriSchemes
  
  @js.native
  sealed trait `ms-gamingoverlay` extends UriSchemes
  
  @js.native
  sealed trait `ms-getoffice` extends UriSchemes
  
  @js.native
  sealed trait `ms-help` extends UriSchemes
  
  @js.native
  sealed trait `ms-infopath` extends UriSchemes
  
  @js.native
  sealed trait `ms-inputapp` extends UriSchemes
  
  @js.native
  sealed trait `ms-lockscreencomponent-config` extends UriSchemes
  
  @js.native
  sealed trait `ms-media-stream-id` extends UriSchemes
  
  @js.native
  sealed trait `ms-mixedrealitycapture` extends UriSchemes
  
  @js.native
  sealed trait `ms-mobileplans` extends UriSchemes
  
  @js.native
  sealed trait `ms-officeapp` extends UriSchemes
  
  @js.native
  sealed trait `ms-people` extends UriSchemes
  
  @js.native
  sealed trait `ms-powerpoint` extends UriSchemes
  
  @js.native
  sealed trait `ms-project` extends UriSchemes
  
  @js.native
  sealed trait `ms-publisher` extends UriSchemes
  
  @js.native
  sealed trait `ms-restoretabcompanion` extends UriSchemes
  
  @js.native
  sealed trait `ms-screenclip` extends UriSchemes
  
  @js.native
  sealed trait `ms-screensketch` extends UriSchemes
  
  @js.native
  sealed trait `ms-search` extends UriSchemes
  
  @js.native
  sealed trait `ms-search-repair` extends UriSchemes
  
  @js.native
  sealed trait `ms-secondary-screen-controller` extends UriSchemes
  
  @js.native
  sealed trait `ms-secondary-screen-setup` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-airplanemode` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-bluetooth` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-camera` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-cellular` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-cloudstorage` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-connectabledevices` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-displays-topology` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-emailandaccounts` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-language` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-location` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-lock` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-nfctransactions` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-notifications` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-power` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-privacy` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-proximity` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-screenrotation` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-wifi` extends UriSchemes
  
  @js.native
  sealed trait `ms-settings-workplace` extends UriSchemes
  
  @js.native
  sealed trait `ms-spd` extends UriSchemes
  
  @js.native
  sealed trait `ms-sttoverlay` extends UriSchemes
  
  @js.native
  sealed trait `ms-transit-to` extends UriSchemes
  
  @js.native
  sealed trait `ms-useractivityset` extends UriSchemes
  
  @js.native
  sealed trait `ms-virtualtouchpad` extends UriSchemes
  
  @js.native
  sealed trait `ms-visio` extends UriSchemes
  
  @js.native
  sealed trait `ms-walk-to` extends UriSchemes
  
  @js.native
  sealed trait `ms-whiteboard` extends UriSchemes
  
  @js.native
  sealed trait `ms-whiteboard-cmd` extends UriSchemes
  
  @js.native
  sealed trait `ms-word` extends UriSchemes
  
  @js.native
  sealed trait msnim extends UriSchemes
  
  @js.native
  sealed trait msrp extends UriSchemes
  
  @js.native
  sealed trait msrps extends UriSchemes
  
  @js.native
  sealed trait mss extends UriSchemes
  
  @js.native
  sealed trait mtqp extends UriSchemes
  
  @js.native
  sealed trait `multi-color` extends MediaColor
  
  @js.native
  sealed trait `multi-layer` extends MediaType
  
  @js.native
  sealed trait `multi-part-form` extends MediaType
  
  @js.native
  sealed trait `multiple-destination-uris-supported` extends js.Object
  
  @js.native
  sealed trait `multiple-document-handling` extends Overrides
  
  @js.native
  sealed trait `multiple-document-handling-actual` extends js.Object
  
  @js.native
  sealed trait `multiple-document-handling-default` extends js.Object
  
  @js.native
  sealed trait `multiple-document-handling-supported` extends js.Object
  
  @js.native
  sealed trait `multiple-document-jobs-supported` extends js.Object
  
  @js.native
  sealed trait `multiple-object-handling` extends Overrides
  
  @js.native
  sealed trait `multiple-object-handling-actual` extends js.Object
  
  @js.native
  sealed trait `multiple-object-handling-default` extends js.Object
  
  @js.native
  sealed trait `multiple-object-handling-supported` extends js.Object
  
  @js.native
  sealed trait `multiple-operation-time-out` extends js.Object
  
  @js.native
  sealed trait `multiple-operation-time-out-action` extends js.Object
  
  @js.native
  sealed trait mumble extends UriSchemes
  
  @js.native
  sealed trait mupdate extends UriSchemes
  
  @js.native
  sealed trait mustard extends MediaColor
  
  @js.native
  sealed trait mvn extends UriSchemes
  
  @js.native
  sealed trait `my-mailbox` extends OutputBin
  
  @js.native
  sealed trait `n-to-1-order` extends PageOrder
  
  @js.native
  sealed trait `na-10x13`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-10x13-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-10x14`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-10x14-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-10x15`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-10x15-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-5x7`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-6x9`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-6x9-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-7x9`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-7x9-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-8x10`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-9x11`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-9x11-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-9x12`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-9x12-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-legal`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-legal-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `na-legal-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `na-letter`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-letter-colored`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `na-letter-transparent`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `na-letter-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait `na-number-10`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-number-10-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait `na-number-9`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na-number-9-envelope`
    extends Media
       with MediaEnvelopeName
  
  @js.native
  sealed trait na_10x11_10x11in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_10x13_10x13in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_10x14_10x14in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_10x15_10x15in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_11x12_11x12in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_11x15_11x15in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_12x19_12x19in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_5x7_5x7in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_6x9_6x9in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_7x9_7x9in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_9x11_9x11in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_a2_4Dot375x5Dot75in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-a_9x12in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-b_12x18in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-c_18x24in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-d_24x36in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-e2_26x38in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-e3_27x39in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_arch-e_36x48in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_b-plus_12x19Dot17in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_c5_6Dot5x9Dot5in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_c_17x22in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_d_22x34in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_e_34x44in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_edp_11x14in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_eur-edp_12x14in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_executive_7Dot25x10Dot5in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_f_44x68in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_fanfold-eur_8Dot5x12in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_fanfold-us_11x14Dot875in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_foolscap_8Dot5x13in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_govt-legal_8x13in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_govt-letter_8x10in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_index-3x5_3x5in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_index-4x6-ext_6x8in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_index-4x6_4x6in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_index-5x8_5x8in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_invoice_5Dot5x8Dot5in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_ledger_11x17in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_legal-extra_9Dot5x15in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_legal_8Dot5x14in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_letter-extra_9Dot5x12in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_letter-plus_8Dot5x12Dot69in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_letter_8Dot5x11in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_monarch_3Dot875x7Dot5in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_number-10_4Dot125x9Dot5in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_number-11_4Dot5x10Dot375in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_number-12_4Dot75x11in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_number-14_5x11Dot5in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_number-9_3Dot875x8Dot875in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_oficio_8Dot5x13Dot4in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_personal_3Dot625x6Dot5in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait na_quarto_8Dot5x10Dot83in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_super-a_8Dot94x14in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_super-b_13x19in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `na_wide-format_30x42in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `natural-language-configured` extends js.Object
  
  @js.native
  sealed trait negotiate extends js.Object
  
  @js.native
  sealed trait news extends UriSchemes
  
  @js.native
  sealed trait nfs extends UriSchemes
  
  @js.native
  sealed trait ni extends UriSchemes
  
  @js.native
  sealed trait night
    extends JobDelayOutputUntil
       with JobHoldUntil
  
  @js.native
  sealed trait nih extends UriSchemes
  
  @js.native
  sealed trait nm extends AccuracyUnits
  
  @js.native
  sealed trait nntp extends UriSchemes
  
  @js.native
  sealed trait `no-change` extends PowerState
  
  @js.native
  sealed trait `no-color` extends MediaColor
  
  @js.native
  sealed trait `no-cover` extends CoverType
  
  @js.native
  sealed trait `no-delay-output` extends JobDelayOutputUntil
  
  @js.native
  sealed trait `no-hold` extends JobHoldUntil
  
  @js.native
  sealed trait none
    extends Compression
       with DocumentDigitalSignature
       with DocumentStateReasons
       with ImpositionTemplate
       with JobAccountType
       with JobPasswordEncryption
       with JobRetainUntil
       with JobSheets
       with JobStateReasons
       with MediaCoating
       with MediaRecycled
       with NotifyEvents
       with OrientationRequested
       with PrintBase
       with PrintScaling
       with PrintSupports
       with PrinterStateReasons
       with SaveDisposition
       with SeparatorSheetsType
       with TimeoutPredicate
       with XImagePosition
       with XriAuthentication
       with XriSecurity
       with YImagePosition
  
  @js.native
  sealed trait normal extends PrintQuality
  
  @js.native
  sealed trait `not-applicable`
    extends InputFilmScanMode
       with PowerState
  
  @js.native
  sealed trait `not-attempted` extends js.Object
  
  @js.native
  sealed trait `not-completed` extends WhichJobs
  
  @js.native
  sealed trait notes extends UriSchemes
  
  @js.native
  sealed trait `notify-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `notify-events-default` extends js.Object
  
  @js.native
  sealed trait `notify-events-supported` extends js.Object
  
  @js.native
  sealed trait `notify-lease-duration-default` extends js.Object
  
  @js.native
  sealed trait `notify-lease-duration-supported` extends js.Object
  
  @js.native
  sealed trait `notify-pull-method-supported` extends js.Object
  
  @js.native
  sealed trait `notify-schemes-supported` extends js.Object
  
  @js.native
  sealed trait ntp extends SystemTimeoutSource
  
  @js.native
  sealed trait `number-of-documents` extends js.Object
  
  @js.native
  sealed trait `number-of-intervening-jobs` extends js.Object
  
  @js.native
  sealed trait `number-of-retries` extends Overrides
  
  @js.native
  sealed trait `number-of-retries-default` extends js.Object
  
  @js.native
  sealed trait `number-of-retries-supported` extends js.Object
  
  @js.native
  sealed trait `number-up` extends Overrides
  
  @js.native
  sealed trait `number-up-actual` extends js.Object
  
  @js.native
  sealed trait `number-up-default` extends js.Object
  
  @js.native
  sealed trait `number-up-supported` extends js.Object
  
  @js.native
  sealed trait nylon extends MaterialType
  
  @js.native
  sealed trait `oauth-authorization-scope` extends js.Object
  
  @js.native
  sealed trait `oauth-authorization-server-uri` extends js.Object
  
  @js.native
  sealed trait `object-offset` extends js.Object
  
  @js.native
  sealed trait `object-size` extends js.Object
  
  @js.native
  sealed trait `object-uuid` extends js.Object
  
  @js.native
  sealed trait ocf extends UriSchemes
  
  @js.native
  sealed trait oe_12x16_12x16in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait oe_14x17_14x17in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait oe_18x22_18x22in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait oe_a2plus_17x24in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_business-card_2x3Dot5in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_photo-10r_10x12in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_photo-20r_20x24in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_photo-l_3Dot5x5in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_photo-s10r_10x15in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_square-photo_4x4in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `oe_square-photo_5x5in`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `off-hard` extends PowerState
  
  @js.native
  sealed trait `off-hard-graceful` extends PowerState
  
  @js.native
  sealed trait `off-soft` extends PowerState
  
  @js.native
  sealed trait `off-soft-graceful` extends PowerState
  
  @js.native
  sealed trait `off-soft-vendor1` extends PowerState
  
  @js.native
  sealed trait `off-soft-vendor2` extends PowerState
  
  @js.native
  sealed trait `off-soft-vendor3` extends PowerState
  
  @js.native
  sealed trait `off-soft-vendor4` extends PowerState
  
  @js.native
  sealed trait `off-soft-vendor5` extends PowerState
  
  @js.native
  sealed trait oid extends UriSchemes
  
  @js.native
  sealed trait om_16k_184x260mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait om_16k_195x270mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_business-card_55x85mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_business-card_55x91mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait om_card_54x86mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_dai-pa-kai_275x395mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_dsc-photo_89x119mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_folio-sp_215x315mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait om_folio_210x330mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait om_invite_220x220mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait om_italian_110x230mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_juuro-ku-kai_198x275mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_large-photo_200x300`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_medium-photo_130x180mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_pa-kai_267x389mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait om_postfix_114x229mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_small-photo_100x150mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_square-photo_89x89mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `om_wide-photo_100x200mm`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait on extends PowerState
  
  @js.native
  sealed trait `on-error` extends js.Object
  
  @js.native
  sealed trait `on-vendor1` extends PowerState
  
  @js.native
  sealed trait `on-vendor2` extends PowerState
  
  @js.native
  sealed trait `on-vendor3` extends PowerState
  
  @js.native
  sealed trait `on-vendor4` extends PowerState
  
  @js.native
  sealed trait `on-vendor5` extends PowerState
  
  @js.native
  sealed trait onboard extends SystemTimeoutSource
  
  @js.native
  sealed trait `one-at-a-time` extends MultipleObjectHandling
  
  @js.native
  sealed trait `one-sided` extends Sides
  
  @js.native
  sealed trait onenote extends UriSchemes
  
  @js.native
  sealed trait `onenote-cmd` extends UriSchemes
  
  @js.native
  sealed trait opaquelocktoken extends UriSchemes
  
  @js.native
  sealed trait `opc-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `opc-near-eol` extends PrinterStateReasons
  
  @js.native
  sealed trait openpgp4fpr extends UriSchemes
  
  @js.native
  sealed trait `operations-supported` extends js.Object
  
  @js.native
  sealed trait orange extends MediaColor
  
  @js.native
  sealed trait `organization-name-supported` extends js.Object
  
  @js.native
  sealed trait `orientation-requested` extends Overrides
  
  @js.native
  sealed trait `orientation-requested-actual` extends js.Object
  
  @js.native
  sealed trait `orientation-requested-default` extends js.Object
  
  @js.native
  sealed trait `orientation-requested-supported` extends js.Object
  
  @js.native
  sealed trait `original-requesting-user-name` extends js.Object
  
  @js.native
  sealed trait other
    extends MediaType
       with PrinterStateReasons
  
  @js.native
  sealed trait outgoing extends DocumentStateReasons
  
  @js.native
  sealed trait `output-area-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `output-area-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `output-attributes-actual` extends js.Object
  
  @js.native
  sealed trait `output-attributes-default` extends js.Object
  
  @js.native
  sealed trait `output-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `output-bin` extends Overrides
  
  @js.native
  sealed trait `output-bin-actual` extends js.Object
  
  @js.native
  sealed trait `output-bin-default` extends js.Object
  
  @js.native
  sealed trait `output-bin-supported` extends js.Object
  
  @js.native
  sealed trait `output-device` extends Overrides
  
  @js.native
  sealed trait `output-device-actual` extends js.Object
  
  @js.native
  sealed trait `output-device-assigned` extends js.Object
  
  @js.native
  sealed trait `output-device-job-state` extends js.Object
  
  @js.native
  sealed trait `output-device-job-state-message` extends js.Object
  
  @js.native
  sealed trait `output-device-job-state-reasons` extends js.Object
  
  @js.native
  sealed trait `output-device-supported` extends js.Object
  
  @js.native
  sealed trait `output-device-uuid-assigned` extends js.Object
  
  @js.native
  sealed trait `output-device-uuid-supported` extends js.Object
  
  @js.native
  sealed trait `output-mailbox-select-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `output-tray-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait outward extends FoldingDirection
  
  @js.native
  sealed trait overrides extends Overrides
  
  @js.native
  sealed trait `overrides-actual` extends js.Object
  
  @js.native
  sealed trait `overrides-supported` extends js.Object
  
  @js.native
  sealed trait owner extends js.Object
  
  @js.native
  sealed trait pack extends UriSchemes
  
  @js.native
  sealed trait padding extends BindingType
  
  @js.native
  sealed trait `page-delivery` extends Overrides
  
  @js.native
  sealed trait `page-delivery-actual` extends js.Object
  
  @js.native
  sealed trait `page-delivery-default` extends js.Object
  
  @js.native
  sealed trait `page-delivery-supported` extends js.Object
  
  @js.native
  sealed trait `page-order-received` extends Overrides
  
  @js.native
  sealed trait `page-order-received-actual` extends js.Object
  
  @js.native
  sealed trait `page-order-received-default` extends js.Object
  
  @js.native
  sealed trait `page-order-received-supported` extends js.Object
  
  @js.native
  sealed trait `page-overrides` extends js.Object
  
  @js.native
  sealed trait `page-ranges` extends Overrides
  
  @js.native
  sealed trait `page-ranges-actual` extends js.Object
  
  @js.native
  sealed trait `page-ranges-supported` extends js.Object
  
  @js.native
  sealed trait pages extends Overrides
  
  @js.native
  sealed trait `pages-per-subset` extends Overrides
  
  @js.native
  sealed trait `pages-per-subset-supported` extends js.Object
  
  @js.native
  sealed trait palm extends UriSchemes
  
  @js.native
  sealed trait paparazzi extends UriSchemes
  
  @js.native
  sealed trait paper extends MediaType
  
  @js.native
  sealed trait `parent-printers-supported` extends js.Object
  
  @js.native
  sealed trait partial extends TrimmingType
  
  @js.native
  sealed trait paused extends PrinterStateReasons
  
  @js.native
  sealed trait payment extends UriSchemes
  
  @js.native
  sealed trait payto extends UriSchemes
  
  @js.native
  sealed trait `pclm-raster-back-side` extends js.Object
  
  @js.native
  sealed trait `pclm-source-resolution` extends Overrides
  
  @js.native
  sealed trait `pclm-source-resolution-supported` extends js.Object
  
  @js.native
  sealed trait `pclm-strip-height-preferred` extends js.Object
  
  @js.native
  sealed trait `pclm-strip-height-supported` extends js.Object
  
  @js.native
  sealed trait `pdf-features-supported` extends js.Object
  
  @js.native
  sealed trait `pdf-k-octets-supported` extends js.Object
  
  @js.native
  sealed trait `pdf-versions-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file` extends Overrides
  
  @js.native
  sealed trait `pdl-init-file-default` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-entry` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-entry-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-location` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-location-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-name` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-name-subdirectory-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-name-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-init-file-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-override-guaranteed-supported` extends js.Object
  
  @js.native
  sealed trait `pdl-override-supported` extends js.Object
  
  @js.native
  sealed trait pending
    extends DocumentState
       with JobState
       with ResourceState
       with TransmissionStatus
       with WhichJobs
  
  @js.native
  sealed trait `pending-held`
    extends JobState
       with WhichJobs
  
  @js.native
  sealed trait `pending-retry` extends TransmissionStatus
  
  @js.native
  sealed trait perceptual extends PrintRenderingIntent
  
  @js.native
  sealed trait perfect extends BindingType
  
  @js.native
  sealed trait perforate extends TrimmingType
  
  @js.native
  sealed trait `perforater-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `perforater-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait pet extends MaterialType
  
  @js.native
  sealed trait pgp extends DocumentDigitalSignature
  
  @js.native
  sealed trait photo
    extends InputContentType
       with MediaSource
       with PrintContentOptimize
       with PrinterKind
  
  @js.native
  sealed trait photographic extends MediaType
  
  @js.native
  sealed trait `photographic-archival` extends MediaType
  
  @js.native
  sealed trait `photographic-film` extends MediaType
  
  @js.native
  sealed trait `photographic-glossy` extends MediaType
  
  @js.native
  sealed trait `photographic-high-gloss` extends MediaType
  
  @js.native
  sealed trait `photographic-matte` extends MediaType
  
  @js.native
  sealed trait `photographic-satin` extends MediaType
  
  @js.native
  sealed trait `photographic-semi-gloss` extends MediaType
  
  @js.native
  sealed trait photopolymer extends MaterialType
  
  @js.native
  sealed trait pink extends MediaColor
  
  @js.native
  sealed trait pkcs11 extends UriSchemes
  
  @js.native
  sealed trait pla extends MaterialType
  
  @js.native
  sealed trait `pla-conductive` extends MaterialType
  
  @js.native
  sealed trait `pla-dissolvable` extends MaterialType
  
  @js.native
  sealed trait `pla-flexible` extends MaterialType
  
  @js.native
  sealed trait `pla-magnetic` extends MaterialType
  
  @js.native
  sealed trait `pla-steel` extends MaterialType
  
  @js.native
  sealed trait `pla-stone` extends MaterialType
  
  @js.native
  sealed trait `pla-wood` extends MaterialType
  
  @js.native
  sealed trait plastic extends MediaType
  
  @js.native
  sealed trait `plastic-archival` extends MediaType
  
  @js.native
  sealed trait `plastic-colored` extends MediaType
  
  @js.native
  sealed trait `plastic-glossy` extends MediaType
  
  @js.native
  sealed trait `plastic-high-gloss` extends MediaType
  
  @js.native
  sealed trait `plastic-matte` extends MediaType
  
  @js.native
  sealed trait `plastic-satin` extends MediaType
  
  @js.native
  sealed trait `plastic-semi-gloss` extends MediaType
  
  @js.native
  sealed trait plate extends MediaType
  
  @js.native
  sealed trait platen extends InputSource
  
  @js.native
  sealed trait platform extends UriSchemes
  
  @js.native
  sealed trait `platform-shape` extends js.Object
  
  @js.native
  sealed trait `platform-temperature` extends Overrides
  
  @js.native
  sealed trait `platform-temperature-actual` extends js.Object
  
  @js.native
  sealed trait `platform-temperature-default` extends js.Object
  
  @js.native
  sealed trait `platform-temperature-supported` extends js.Object
  
  @js.native
  sealed trait polycarbonate extends MaterialType
  
  @js.native
  sealed trait polyester extends MediaType
  
  @js.native
  sealed trait pop extends UriSchemes
  
  @js.native
  sealed trait portrait extends OrientationRequested
  
  @js.native
  sealed trait postcard extends PrinterKind
  
  @js.native
  sealed trait `power-down` extends PrinterStateReasons
  
  @js.native
  sealed trait `power-up` extends PrinterStateReasons
  
  @js.native
  sealed trait prc extends js.Object
  
  @js.native
  sealed trait prc_10_324x458mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_16k_146x215mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_1_102x165mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_2_102x176mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_32k_97x151mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_3_125x176mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_4_110x208mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_5_110x220mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_6_120x320mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_7_160x230mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait prc_8_120x309mm
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `pre-cut-tabs` extends MediaType
  
  @js.native
  sealed trait `pre-printed` extends MediaPrePrinted
  
  @js.native
  sealed trait `preferred-attributes-supported` extends js.Object
  
  @js.native
  sealed trait pres extends UriSchemes
  
  @js.native
  sealed trait `presentation-direction-number-up` extends Overrides
  
  @js.native
  sealed trait `presentation-direction-number-up-actual` extends js.Object
  
  @js.native
  sealed trait `presentation-direction-number-up-default` extends js.Object
  
  @js.native
  sealed trait `presentation-direction-number-up-supported` extends js.Object
  
  @js.native
  sealed trait print extends PrinterServiceType
  
  @js.native
  sealed trait `print-accuracy` extends Overrides
  
  @js.native
  sealed trait `print-accuracy-actual` extends js.Object
  
  @js.native
  sealed trait `print-accuracy-supported` extends js.Object
  
  @js.native
  sealed trait `print-back` extends CoverType
  
  @js.native
  sealed trait `print-base` extends Overrides
  
  @js.native
  sealed trait `print-base-actual` extends js.Object
  
  @js.native
  sealed trait `print-base-default` extends js.Object
  
  @js.native
  sealed trait `print-base-supported` extends js.Object
  
  @js.native
  sealed trait `print-both` extends CoverType
  
  @js.native
  sealed trait `print-color-mode` extends Overrides
  
  @js.native
  sealed trait `print-color-mode-actual` extends js.Object
  
  @js.native
  sealed trait `print-color-mode-default` extends js.Object
  
  @js.native
  sealed trait `print-color-mode-supported` extends js.Object
  
  @js.native
  sealed trait `print-content-optimize` extends Overrides
  
  @js.native
  sealed trait `print-content-optimize-actual` extends js.Object
  
  @js.native
  sealed trait `print-content-optimize-default` extends js.Object
  
  @js.native
  sealed trait `print-content-optimize-supported` extends js.Object
  
  @js.native
  sealed trait `print-front` extends CoverType
  
  @js.native
  sealed trait `print-none` extends CoverType
  
  @js.native
  sealed trait `print-objects` extends Overrides
  
  @js.native
  sealed trait `print-objects-actual` extends js.Object
  
  @js.native
  sealed trait `print-objects-supported` extends js.Object
  
  @js.native
  sealed trait `print-quality` extends Overrides
  
  @js.native
  sealed trait `print-quality-actual` extends js.Object
  
  @js.native
  sealed trait `print-quality-default` extends js.Object
  
  @js.native
  sealed trait `print-quality-supported` extends js.Object
  
  @js.native
  sealed trait `print-rendering-intent` extends Overrides
  
  @js.native
  sealed trait `print-rendering-intent-actual` extends js.Object
  
  @js.native
  sealed trait `print-rendering-intent-default` extends js.Object
  
  @js.native
  sealed trait `print-rendering-intent-supported` extends js.Object
  
  @js.native
  sealed trait `print-save` extends SaveDisposition
  
  @js.native
  sealed trait `print-scaling` extends Overrides
  
  @js.native
  sealed trait `print-scaling-default` extends js.Object
  
  @js.native
  sealed trait `print-scaling-supported` extends js.Object
  
  @js.native
  sealed trait `print-supports` extends Overrides
  
  @js.native
  sealed trait `print-supports-actual` extends js.Object
  
  @js.native
  sealed trait `print-supports-default` extends js.Object
  
  @js.native
  sealed trait `print-supports-supported` extends js.Object
  
  @js.native
  sealed trait print3d extends PrinterServiceType
  
  @js.native
  sealed trait `printer-camera-image-uri` extends js.Object
  
  @js.native
  sealed trait `printer-charge-info` extends js.Object
  
  @js.native
  sealed trait `printer-charge-info-uri` extends js.Object
  
  @js.native
  sealed trait `printer-config-changed` extends NotifyEvents
  
  @js.native
  sealed trait `printer-contact-col` extends js.Object
  
  @js.native
  sealed trait `printer-current-time` extends js.Object
  
  @js.native
  sealed trait `printer-description` extends RequestedPrinterAttributeGroups
  
  @js.native
  sealed trait `printer-device-id` extends js.Object
  
  @js.native
  sealed trait `printer-dns-sd-name` extends js.Object
  
  @js.native
  sealed trait `printer-driver-installer` extends js.Object
  
  @js.native
  sealed trait `printer-fax-log-uri` extends js.Object
  
  @js.native
  sealed trait `printer-fax-modem-info` extends js.Object
  
  @js.native
  sealed trait `printer-fax-modem-name` extends js.Object
  
  @js.native
  sealed trait `printer-fax-modem-number` extends js.Object
  
  @js.native
  sealed trait `printer-finishings-changed` extends NotifyEvents
  
  @js.native
  sealed trait `printer-geo-location` extends js.Object
  
  @js.native
  sealed trait `printer-get-attributes-supported` extends js.Object
  
  @js.native
  sealed trait `printer-icc-profiles` extends js.Object
  
  @js.native
  sealed trait `printer-icons` extends js.Object
  
  @js.native
  sealed trait `printer-info` extends js.Object
  
  @js.native
  sealed trait `printer-kind` extends js.Object
  
  @js.native
  sealed trait `printer-location` extends js.Object
  
  @js.native
  sealed trait `printer-make-and-model` extends js.Object
  
  @js.native
  sealed trait `printer-mandatory-job-attributes` extends js.Object
  
  @js.native
  sealed trait `printer-manual-reset` extends PrinterStateReasons
  
  @js.native
  sealed trait `printer-media-changed` extends NotifyEvents
  
  @js.native
  sealed trait `printer-more-info-manufacturer` extends js.Object
  
  @js.native
  sealed trait `printer-name` extends js.Object
  
  @js.native
  sealed trait `printer-nms-reset` extends PrinterStateReasons
  
  @js.native
  sealed trait `printer-organization` extends js.Object
  
  @js.native
  sealed trait `printer-organizational-unit` extends js.Object
  
  @js.native
  sealed trait `printer-privacy-policy-uri` extends js.Object
  
  @js.native
  sealed trait `printer-queue-order-changed` extends NotifyEvents
  
  @js.native
  sealed trait `printer-ready-to-print` extends PrinterStateReasons
  
  @js.native
  sealed trait `printer-resolution` extends Overrides
  
  @js.native
  sealed trait `printer-resolution-actual` extends js.Object
  
  @js.native
  sealed trait `printer-resolution-default` extends js.Object
  
  @js.native
  sealed trait `printer-resolution-supported` extends js.Object
  
  @js.native
  sealed trait `printer-restarted` extends NotifyEvents
  
  @js.native
  sealed trait `printer-shutdown` extends NotifyEvents
  
  @js.native
  sealed trait `printer-state-changed` extends NotifyEvents
  
  @js.native
  sealed trait `printer-static-resource-directory-uri` extends js.Object
  
  @js.native
  sealed trait `printer-static-resource-k-octets-supported` extends js.Object
  
  @js.native
  sealed trait `printer-stopped`
    extends JobStateReasons
       with NotifyEvents
  
  @js.native
  sealed trait `printer-stopped-partly` extends JobStateReasons
  
  @js.native
  sealed trait `printer-strings-languages-supported` extends js.Object
  
  @js.native
  sealed trait `printer-strings-uri` extends js.Object
  
  @js.native
  sealed trait `printer-volume-supported` extends js.Object
  
  @js.native
  sealed trait `printer-xri-supported` extends js.Object
  
  @js.native
  sealed trait printing extends DocumentStateReasons
  
  @js.native
  sealed trait `process-bi-level` extends PrintColorMode
  
  @js.native
  sealed trait `process-job` extends js.Object
  
  @js.native
  sealed trait `process-monochrome` extends PrintColorMode
  
  @js.native
  sealed trait processing
    extends DocumentState
       with JobState
       with PrinterState
       with SystemState
       with TransmissionStatus
       with WhichJobs
  
  @js.native
  sealed trait `processing-stopped`
    extends DocumentState
       with JobState
       with WhichJobs
  
  @js.native
  sealed trait `processing-to-stop-point`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait progressive extends js.Object
  
  @js.native
  sealed trait `proof-print`
    extends Overrides
       with WhichJobs
  
  @js.native
  sealed trait `proof-print-copies` extends js.Object
  
  @js.native
  sealed trait `proof-print-default` extends js.Object
  
  @js.native
  sealed trait `proof-print-supported` extends js.Object
  
  @js.native
  sealed trait prospero extends UriSchemes
  
  @js.native
  sealed trait proxy extends UriSchemes
  
  @js.native
  sealed trait psyc extends UriSchemes
  
  @js.native
  sealed trait pttp extends UriSchemes
  
  @js.native
  sealed trait punch extends Finishings
  
  @js.native
  sealed trait `punch-bottom-left` extends Finishings
  
  @js.native
  sealed trait `punch-bottom-right` extends Finishings
  
  @js.native
  sealed trait `punch-dual-bottom` extends Finishings
  
  @js.native
  sealed trait `punch-dual-left` extends Finishings
  
  @js.native
  sealed trait `punch-dual-right` extends Finishings
  
  @js.native
  sealed trait `punch-dual-top` extends Finishings
  
  @js.native
  sealed trait `punch-multiple-bottom` extends Finishings
  
  @js.native
  sealed trait `punch-multiple-left` extends Finishings
  
  @js.native
  sealed trait `punch-multiple-right` extends Finishings
  
  @js.native
  sealed trait `punch-multiple-top` extends Finishings
  
  @js.native
  sealed trait `punch-quad-bottom` extends Finishings
  
  @js.native
  sealed trait `punch-quad-left` extends Finishings
  
  @js.native
  sealed trait `punch-quad-right` extends Finishings
  
  @js.native
  sealed trait `punch-quad-top` extends Finishings
  
  @js.native
  sealed trait `punch-top-left` extends Finishings
  
  @js.native
  sealed trait `punch-top-right` extends Finishings
  
  @js.native
  sealed trait `punch-triple-bottom` extends Finishings
  
  @js.native
  sealed trait `punch-triple-left` extends Finishings
  
  @js.native
  sealed trait `punch-triple-right` extends Finishings
  
  @js.native
  sealed trait `punch-triple-top` extends Finishings
  
  @js.native
  sealed trait `puncher-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `puncher-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait punching extends js.Object
  
  @js.native
  sealed trait `punching-hole-diameter-configured` extends js.Object
  
  @js.native
  sealed trait `punching-locations-supported` extends js.Object
  
  @js.native
  sealed trait `punching-offset-supported` extends js.Object
  
  @js.native
  sealed trait `punching-reference-edge-supported` extends js.Object
  
  @js.native
  sealed trait `pva-dissolvable` extends MaterialType
  
  @js.native
  sealed trait `pwg-5102Dot3` extends js.Object
  
  @js.native
  sealed trait `pwg-raster-document-resolution-supported` extends js.Object
  
  @js.native
  sealed trait `pwg-raster-document-sheet-back` extends js.Object
  
  @js.native
  sealed trait `pwg-raster-document-type-supported` extends js.Object
  
  @js.native
  sealed trait `pwg-safe-gcode-supported` extends js.Object
  
  @js.native
  sealed trait pwid extends UriSchemes
  
  @js.native
  sealed trait qb extends UriSchemes
  
  @js.native
  sealed trait quarto
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait `quarto-white`
    extends Media
       with MediaName
  
  @js.native
  sealed trait query extends UriSchemes
  
  @js.native
  sealed trait queued extends DocumentStateReasons
  
  @js.native
  sealed trait `queued-for-marker` extends DocumentStateReasons
  
  @js.native
  sealed trait `queued-in-device`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `quic-transport` extends UriSchemes
  
  @js.native
  sealed trait raft extends PrintBase
  
  @js.native
  sealed trait rear
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait receipt extends PrinterKind
  
  @js.native
  sealed trait red extends MediaColor
  
  @js.native
  sealed trait redis extends UriSchemes
  
  @js.native
  sealed trait rediss extends UriSchemes
  
  @js.native
  sealed trait `reference-uri-schemes-supported` extends js.Object
  
  @js.native
  sealed trait relative extends PrintRenderingIntent
  
  @js.native
  sealed trait `relative-bpc` extends PrintRenderingIntent
  
  @js.native
  sealed trait reload extends UriSchemes
  
  @js.native
  sealed trait `repertoire-supported` extends js.Object
  
  @js.native
  sealed trait `requesting-user-name` extends XriAuthentication
  
  @js.native
  sealed trait `requesting-user-uri-supported` extends js.Object
  
  @js.native
  sealed trait res extends UriSchemes
  
  @js.native
  sealed trait `reset-hard` extends PowerState
  
  @js.native
  sealed trait `reset-hard-graceful` extends PowerState
  
  @js.native
  sealed trait `reset-init` extends PowerState
  
  @js.native
  sealed trait `reset-mbr` extends PowerState
  
  @js.native
  sealed trait `reset-mbr-graceful` extends PowerState
  
  @js.native
  sealed trait `reset-nmi` extends PowerState
  
  @js.native
  sealed trait `reset-soft` extends PowerState
  
  @js.native
  sealed trait `reset-soft-graceful` extends PowerState
  
  @js.native
  sealed trait resource extends UriSchemes
  
  @js.native
  sealed trait `resource-object` extends js.Object
  
  @js.native
  sealed trait `resources-are-not-ready`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `resources-are-not-supported`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `retry-interval` extends Overrides
  
  @js.native
  sealed trait `retry-interval-default` extends js.Object
  
  @js.native
  sealed trait `retry-interval-supported` extends js.Object
  
  @js.native
  sealed trait `retry-time-out` extends Overrides
  
  @js.native
  sealed trait `retry-time-out-default` extends js.Object
  
  @js.native
  sealed trait `retry-time-out-supported` extends js.Object
  
  @js.native
  sealed trait `reverse-landscape` extends OrientationRequested
  
  @js.native
  sealed trait `reverse-order-face-down` extends PageDelivery
  
  @js.native
  sealed trait `reverse-order-face-up` extends PageDelivery
  
  @js.native
  sealed trait `reverse-portrait` extends OrientationRequested
  
  @js.native
  sealed trait rgb_16
    extends InputColorMode
       with PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait rgb_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait rgba_16 extends InputColorMode
  
  @js.native
  sealed trait rgba_8 extends InputColorMode
  
  @js.native
  sealed trait right
    extends MediaSource
       with OutputBin
       with ReferenceEdge
       with XImagePosition
  
  @js.native
  sealed trait rmi extends UriSchemes
  
  @js.native
  sealed trait roc_16k_7Dot75x10Dot75in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait roc_8k_10Dot75x15Dot5in
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait roll
    extends MediaType
       with PrinterKind
  
  @js.native
  sealed trait `roll-1` extends MediaSource
  
  @js.native
  sealed trait `roll-10` extends MediaSource
  
  @js.native
  sealed trait `roll-2` extends MediaSource
  
  @js.native
  sealed trait `roll-3` extends MediaSource
  
  @js.native
  sealed trait `roll-4` extends MediaSource
  
  @js.native
  sealed trait `roll-5` extends MediaSource
  
  @js.native
  sealed trait `roll-6` extends MediaSource
  
  @js.native
  sealed trait `roll-7` extends MediaSource
  
  @js.native
  sealed trait `roll-8` extends MediaSource
  
  @js.native
  sealed trait `roll-9` extends MediaSource
  
  @js.native
  sealed trait rotated extends js.Object
  
  @js.native
  sealed trait rsync extends UriSchemes
  
  @js.native
  sealed trait rtmfp extends UriSchemes
  
  @js.native
  sealed trait rtmp extends UriSchemes
  
  @js.native
  sealed trait rtsp extends UriSchemes
  
  @js.native
  sealed trait rtsps extends UriSchemes
  
  @js.native
  sealed trait rtspu extends UriSchemes
  
  @js.native
  sealed trait `saddle-stitch` extends Finishings
  
  @js.native
  sealed trait `same-order-face-down` extends PageDelivery
  
  @js.native
  sealed trait `same-order-face-up` extends PageDelivery
  
  @js.native
  sealed trait satin extends MediaCoating
  
  @js.native
  sealed trait saturation extends PrintRenderingIntent
  
  @js.native
  sealed trait `save-disposition-supported` extends js.Object
  
  @js.native
  sealed trait `save-document-format-default` extends js.Object
  
  @js.native
  sealed trait `save-document-format-supported` extends js.Object
  
  @js.native
  sealed trait `save-location-default` extends js.Object
  
  @js.native
  sealed trait `save-location-supported` extends js.Object
  
  @js.native
  sealed trait `save-name-subdirectory-supported` extends js.Object
  
  @js.native
  sealed trait `save-name-supported` extends js.Object
  
  @js.native
  sealed trait `save-only` extends SaveDisposition
  
  @js.native
  sealed trait saved extends WhichJobs
  
  @js.native
  sealed trait scan extends PrinterServiceType
  
  @js.native
  sealed trait score extends TrimmingType
  
  @js.native
  sealed trait screen extends MediaType
  
  @js.native
  sealed trait `screen-paged` extends MediaType
  
  @js.native
  sealed trait `second-shift`
    extends JobDelayOutputUntil
       with JobHoldUntil
  
  @js.native
  sealed trait secondlife extends UriSchemes
  
  @js.native
  sealed trait `self-adhesive` extends MediaType
  
  @js.native
  sealed trait `self-adhesive-film` extends MediaType
  
  @js.native
  sealed trait `semi-gloss`
    extends CoatingType
       with LaminatingType
       with MediaCoating
  
  @js.native
  sealed trait `separate-documents-collated-copies` extends MultipleDocumentHandling
  
  @js.native
  sealed trait `separate-documents-uncollated-copies` extends MultipleDocumentHandling
  
  @js.native
  sealed trait `separation-cutter-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `separation-cutter-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait `separator-sheets` extends Overrides
  
  @js.native
  sealed trait `separator-sheets-actual` extends js.Object
  
  @js.native
  sealed trait `separator-sheets-default` extends js.Object
  
  @js.native
  sealed trait `separator-sheets-supported` extends js.Object
  
  @js.native
  sealed trait `server-error-busy` extends StatusCode
  
  @js.native
  sealed trait `server-error-device-error` extends StatusCode
  
  @js.native
  sealed trait `server-error-internal-error` extends StatusCode
  
  @js.native
  sealed trait `server-error-job-canceled` extends StatusCode
  
  @js.native
  sealed trait `server-error-multiple-document-jobs-not-supported` extends StatusCode
  
  @js.native
  sealed trait `server-error-not-accepting-jobs` extends StatusCode
  
  @js.native
  sealed trait `server-error-operation-not-supported` extends StatusCode
  
  @js.native
  sealed trait `server-error-printer-is-deactivated` extends StatusCode
  
  @js.native
  sealed trait `server-error-service-unavailable` extends StatusCode
  
  @js.native
  sealed trait `server-error-temporary-error` extends StatusCode
  
  @js.native
  sealed trait `server-error-too-many-documents` extends StatusCode
  
  @js.native
  sealed trait `server-error-too-many-jobs` extends StatusCode
  
  @js.native
  sealed trait `server-error-version-not-supported` extends StatusCode
  
  @js.native
  sealed trait service extends UriSchemes
  
  @js.native
  sealed trait `service-off-line` extends JobStateReasons
  
  @js.native
  sealed trait session extends UriSchemes
  
  @js.native
  sealed trait sftp extends UriSchemes
  
  @js.native
  sealed trait sgn extends UriSchemes
  
  @js.native
  sealed trait sgray_1 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait sgray_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait sgray_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait sha extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha2-224` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha2-256` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha2-384` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha2-512` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha2-512_224` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha2-512_256` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha3-224` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha3-256` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha3-384` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha3-512` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha3-512_224` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sha3-512_256` extends JobPasswordEncryption
  
  @js.native
  sealed trait `shake-128` extends JobPasswordEncryption
  
  @js.native
  sealed trait `shake-256` extends JobPasswordEncryption
  
  @js.native
  sealed trait `sheet-collate-actual` extends js.Object
  
  @js.native
  sealed trait `sheet-rotator-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `sheet-rotator-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait shell extends MaterialPurpose
  
  @js.native
  sealed trait shift_jis extends CharacterSet
  
  @js.native
  sealed trait `short-edge-first` extends FeedOrientation
  
  @js.native
  sealed trait `shrink-foil` extends MediaType
  
  @js.native
  sealed trait `shrink-wrap` extends BalingType
  
  @js.native
  sealed trait shttp extends UriSchemes
  
  @js.native
  sealed trait shutdown extends PrinterStateReasons
  
  @js.native
  sealed trait side
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
  
  @js.native
  sealed trait sides extends Overrides
  
  @js.native
  sealed trait `sides-actual` extends js.Object
  
  @js.native
  sealed trait `sides-default` extends js.Object
  
  @js.native
  sealed trait `sides-supported` extends js.Object
  
  @js.native
  sealed trait sieve extends UriSchemes
  
  @js.native
  sealed trait signature extends ImpositionTemplate
  
  @js.native
  sealed trait silicone extends CoatingType
  
  @js.native
  sealed trait silver
    extends MaterialType
       with MediaColor
  
  @js.native
  sealed trait simpleledger extends UriSchemes
  
  @js.native
  sealed trait `single-document` extends MultipleDocumentHandling
  
  @js.native
  sealed trait `single-document-new-sheet` extends MultipleDocumentHandling
  
  @js.native
  sealed trait `single-face` extends MediaType
  
  @js.native
  sealed trait `single-wall` extends MediaType
  
  @js.native
  sealed trait sip extends UriSchemes
  
  @js.native
  sealed trait sips extends UriSchemes
  
  @js.native
  sealed trait skirt extends PrintBase
  
  @js.native
  sealed trait skype extends UriSchemes
  
  @js.native
  sealed trait sleeve extends MediaType
  
  @js.native
  sealed trait `slip-sheets` extends SeparatorSheetsType
  
  @js.native
  sealed trait `slitter-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `slitter-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait smb extends UriSchemes
  
  @js.native
  sealed trait `smi2699-auth-print-group` extends js.Object
  
  @js.native
  sealed trait `smi2699-auth-proxy-group` extends js.Object
  
  @js.native
  sealed trait `smi2699-device-command` extends js.Object
  
  @js.native
  sealed trait `smi2699-device-format` extends js.Object
  
  @js.native
  sealed trait `smi2699-device-name` extends js.Object
  
  @js.native
  sealed trait `smi2699-device-uri` extends js.Object
  
  @js.native
  sealed trait smime extends DocumentDigitalSignature
  
  @js.native
  sealed trait smooth extends MediaTooth
  
  @js.native
  sealed trait sms extends UriSchemes
  
  @js.native
  sealed trait smtp extends UriSchemes
  
  @js.native
  sealed trait snews extends UriSchemes
  
  @js.native
  sealed trait snmp extends UriSchemes
  
  @js.native
  sealed trait sntp extends SystemTimeoutSource
  
  @js.native
  sealed trait soapDotbeep extends UriSchemes
  
  @js.native
  sealed trait soapDotbeeps extends UriSchemes
  
  @js.native
  sealed trait soldat extends UriSchemes
  
  @js.native
  sealed trait sound extends IdentifyActions
  
  @js.native
  sealed trait speak extends IdentifyActions
  
  @js.native
  sealed trait spiffe extends UriSchemes
  
  @js.native
  sealed trait spiral extends BindingType
  
  @js.native
  sealed trait spool extends js.Object
  
  @js.native
  sealed trait `spool-area-full` extends PrinterStateReasons
  
  @js.native
  sealed trait spotify extends UriSchemes
  
  @js.native
  sealed trait srgb_16 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait srgb_8 extends PwgRasterDocumentTypeSupported
  
  @js.native
  sealed trait ssh extends UriSchemes
  
  @js.native
  sealed trait ssl3 extends XriSecurity
  
  @js.native
  sealed trait `stacker-1` extends OutputBin
  
  @js.native
  sealed trait `stacker-10` extends OutputBin
  
  @js.native
  sealed trait `stacker-2` extends OutputBin
  
  @js.native
  sealed trait `stacker-3` extends OutputBin
  
  @js.native
  sealed trait `stacker-4` extends OutputBin
  
  @js.native
  sealed trait `stacker-5` extends OutputBin
  
  @js.native
  sealed trait `stacker-6` extends OutputBin
  
  @js.native
  sealed trait `stacker-7` extends OutputBin
  
  @js.native
  sealed trait `stacker-8` extends OutputBin
  
  @js.native
  sealed trait `stacker-9` extends OutputBin
  
  @js.native
  sealed trait `stacker-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `stacker-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait standard
    extends JobSheets
       with MediaRecycled
       with PrintBase
       with PrintSupports
  
  @js.native
  sealed trait standby extends PowerState
  
  @js.native
  sealed trait `standby-vendor1` extends PowerState
  
  @js.native
  sealed trait `standby-vendor2` extends PowerState
  
  @js.native
  sealed trait `standby-vendor3` extends PowerState
  
  @js.native
  sealed trait `standby-vendor4` extends PowerState
  
  @js.native
  sealed trait `standby-vendor5` extends PowerState
  
  @js.native
  sealed trait staple extends Finishings
  
  @js.native
  sealed trait `staple-bottom-left` extends Finishings
  
  @js.native
  sealed trait `staple-bottom-right` extends Finishings
  
  @js.native
  sealed trait `staple-dual-bottom` extends Finishings
  
  @js.native
  sealed trait `staple-dual-left` extends Finishings
  
  @js.native
  sealed trait `staple-dual-right` extends Finishings
  
  @js.native
  sealed trait `staple-dual-top` extends Finishings
  
  @js.native
  sealed trait `staple-top-left` extends Finishings
  
  @js.native
  sealed trait `staple-top-right` extends Finishings
  
  @js.native
  sealed trait `staple-triple-bottom` extends Finishings
  
  @js.native
  sealed trait `staple-triple-left` extends Finishings
  
  @js.native
  sealed trait `staple-triple-right` extends Finishings
  
  @js.native
  sealed trait `staple-triple-top` extends Finishings
  
  @js.native
  sealed trait `stapler-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `stapler-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait `start-sheet` extends SeparatorSheetsType
  
  @js.native
  sealed trait `static-font` extends ResourceType
  
  @js.native
  sealed trait `static-form` extends ResourceType
  
  @js.native
  sealed trait `static-icc-profile` extends ResourceType
  
  @js.native
  sealed trait `static-image` extends ResourceType
  
  @js.native
  sealed trait `static-logo` extends ResourceType
  
  @js.native
  sealed trait `static-other` extends ResourceType
  
  @js.native
  sealed trait `static-strings` extends ResourceType
  
  @js.native
  sealed trait stationery extends MediaType
  
  @js.native
  sealed trait `stationery-archival` extends MediaType
  
  @js.native
  sealed trait `stationery-coated` extends MediaType
  
  @js.native
  sealed trait `stationery-cotton` extends MediaType
  
  @js.native
  sealed trait `stationery-fine` extends MediaType
  
  @js.native
  sealed trait `stationery-heavyweight` extends MediaType
  
  @js.native
  sealed trait `stationery-heavyweight-coated` extends MediaType
  
  @js.native
  sealed trait `stationery-inkjet` extends MediaType
  
  @js.native
  sealed trait `stationery-letterhead` extends MediaType
  
  @js.native
  sealed trait `stationery-lightweight` extends MediaType
  
  @js.native
  sealed trait `stationery-preprinted` extends MediaType
  
  @js.native
  sealed trait `stationery-prepunched` extends MediaType
  
  @js.native
  sealed trait steam extends UriSchemes
  
  @js.native
  sealed trait stipple extends MediaTooth
  
  @js.native
  sealed trait `stitcher-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `stitcher-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait stitching extends js.Object
  
  @js.native
  sealed trait `stitching-angle-supported` extends js.Object
  
  @js.native
  sealed trait `stitching-locations-supported` extends js.Object
  
  @js.native
  sealed trait `stitching-method-supported` extends js.Object
  
  @js.native
  sealed trait `stitching-offset-supported` extends js.Object
  
  @js.native
  sealed trait `stitching-reference-edge-supported` extends js.Object
  
  @js.native
  sealed trait stopped
    extends PrinterState
       with SystemState
  
  @js.native
  sealed trait `stopped-partly` extends PrinterStateReasons
  
  @js.native
  sealed trait stopping extends PrinterStateReasons
  
  @js.native
  sealed trait stream extends js.Object
  
  @js.native
  sealed trait stun extends UriSchemes
  
  @js.native
  sealed trait stuns extends UriSchemes
  
  @js.native
  sealed trait `subject-supported` extends js.Object
  
  @js.native
  sealed trait `submission-interrupted`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait submit extends UriSchemes
  
  @js.native
  sealed trait `subordinate-printers-supported` extends js.Object
  
  @js.native
  sealed trait `subscription-object` extends js.Object
  
  @js.native
  sealed trait `subscription-privacy-attributes` extends js.Object
  
  @js.native
  sealed trait `subscription-privacy-scope` extends js.Object
  
  @js.native
  sealed trait `subunit-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-timing-Failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `subunit-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait `successful-ok` extends StatusCode
  
  @js.native
  sealed trait `successful-ok-conflicting-attributes` extends StatusCode
  
  @js.native
  sealed trait `successful-ok-events-complete` extends StatusCode
  
  @js.native
  sealed trait `successful-ok-ignored-or-substituted-attributes` extends StatusCode
  
  @js.native
  sealed trait `successful-ok-ignored-subscriptions` extends StatusCode
  
  @js.native
  sealed trait `successful-ok-too-many-events` extends StatusCode
  
  @js.native
  sealed trait `super-b`
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait support extends MaterialPurpose
  
  @js.native
  sealed trait suspend extends PowerState
  
  @js.native
  sealed trait `suspend-job` extends JobErrorAction
  
  @js.native
  sealed trait `suspend-vendor1` extends PowerState
  
  @js.native
  sealed trait `suspend-vendor2` extends PowerState
  
  @js.native
  sealed trait `suspend-vendor3` extends PowerState
  
  @js.native
  sealed trait `suspend-vendor4` extends PowerState
  
  @js.native
  sealed trait `suspend-vendor5` extends PowerState
  
  @js.native
  sealed trait svn extends UriSchemes
  
  @js.native
  sealed trait `system-object` extends js.Object
  
  @js.native
  sealed trait `system-specified` extends PageDelivery
  
  @js.native
  sealed trait tab extends TrimmingType
  
  @js.native
  sealed trait `tab-stock` extends MediaType
  
  @js.native
  sealed trait tabloid
    extends Media
       with MediaSizeName
  
  @js.native
  sealed trait tag extends UriSchemes
  
  @js.native
  sealed trait tape extends BindingType
  
  @js.native
  sealed trait teamspeak extends UriSchemes
  
  @js.native
  sealed trait tel extends UriSchemes
  
  @js.native
  sealed trait teliaeid extends UriSchemes
  
  @js.native
  sealed trait telnet extends UriSchemes
  
  @js.native
  sealed trait `template-document` extends ResourceType
  
  @js.native
  sealed trait `template-job` extends ResourceType
  
  @js.native
  sealed trait `template-printer` extends ResourceType
  
  @js.native
  sealed trait text
    extends InputContentType
       with PrintContentOptimize
  
  @js.native
  sealed trait `text-and-graphic` extends PrintContentOptimize
  
  @js.native
  sealed trait `text-and-photo` extends InputContentType
  
  @js.native
  sealed trait textSlashhtml extends MimeMediaType
  
  @js.native
  sealed trait textSlashplain extends MimeMediaType
  
  @js.native
  sealed trait textSlashrichtext extends MimeMediaType
  
  @js.native
  sealed trait `textSlashtab-separated-values` extends MimeMediaType
  
  @js.native
  sealed trait `textSlashx-setext` extends MimeMediaType
  
  @js.native
  sealed trait `textSlashx-sgml` extends MimeMediaType
  
  @js.native
  sealed trait tftp extends UriSchemes
  
  @js.native
  sealed trait things extends UriSchemes
  
  @js.native
  sealed trait `third-shift`
    extends JobDelayOutputUntil
       with JobHoldUntil
  
  @js.native
  sealed trait thismessage extends UriSchemes
  
  @js.native
  sealed trait `time-at-completed` extends js.Object
  
  @js.native
  sealed trait `time-at-creation` extends js.Object
  
  @js.native
  sealed trait `time-at-processing` extends js.Object
  
  @js.native
  sealed trait `timed-out` extends PrinterStateReasons
  
  @js.native
  sealed trait tip extends UriSchemes
  
  @js.native
  sealed trait titanium extends MaterialType
  
  @js.native
  sealed trait tls extends XriSecurity
  
  @js.native
  sealed trait tn3270 extends UriSchemes
  
  @js.native
  sealed trait `to-name-supported` extends js.Object
  
  @js.native
  sealed trait `tobottom-toleft` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `tobottom-toright` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `toleft-tobottom` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `toleft-totop` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `toner-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `toner-low` extends PrinterStateReasons
  
  @js.native
  sealed trait tool extends UriSchemes
  
  @js.native
  sealed trait top
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
       with ReferenceEdge
       with YImagePosition
  
  @js.native
  sealed trait `toright-tobottom` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `toright-totop` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `totop-toleft` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait `totop-toright` extends PresentationDirectionNumberUp
  
  @js.native
  sealed trait tractor extends MediaType
  
  @js.native
  sealed trait transfer extends MediaType
  
  @js.native
  sealed trait transform extends PrinterServiceType
  
  @js.native
  sealed trait transforming extends DocumentStateReasons
  
  @js.native
  sealed trait translucent
    extends CoatingType
       with LaminatingType
  
  @js.native
  sealed trait transparency extends MediaType
  
  @js.native
  sealed trait `tray-1`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-10`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-11` extends MediaSource
  
  @js.native
  sealed trait `tray-12` extends MediaSource
  
  @js.native
  sealed trait `tray-13` extends MediaSource
  
  @js.native
  sealed trait `tray-14` extends MediaSource
  
  @js.native
  sealed trait `tray-15` extends MediaSource
  
  @js.native
  sealed trait `tray-16` extends MediaSource
  
  @js.native
  sealed trait `tray-17` extends MediaSource
  
  @js.native
  sealed trait `tray-18` extends MediaSource
  
  @js.native
  sealed trait `tray-19` extends MediaSource
  
  @js.native
  sealed trait `tray-2`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-20` extends MediaSource
  
  @js.native
  sealed trait `tray-3`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-4`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-5`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-6`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-7`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-8`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait `tray-9`
    extends MediaSource
       with OutputBin
  
  @js.native
  sealed trait trim extends Finishings
  
  @js.native
  sealed trait `trim-after-copies` extends Finishings
  
  @js.native
  sealed trait `trim-after-documents` extends Finishings
  
  @js.native
  sealed trait `trim-after-job` extends Finishings
  
  @js.native
  sealed trait `trim-after-pages` extends Finishings
  
  @js.native
  sealed trait `trimmer-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `trimmer-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait trimming extends js.Object
  
  @js.native
  sealed trait `trimming-offset-supported` extends js.Object
  
  @js.native
  sealed trait `trimming-reference-edge-supported` extends js.Object
  
  @js.native
  sealed trait `trimming-type-supported` extends js.Object
  
  @js.native
  sealed trait `trimming-when-supported` extends js.Object
  
  @js.native
  sealed trait `triple-wall` extends MediaType
  
  @js.native
  sealed trait turn extends UriSchemes
  
  @js.native
  sealed trait turns extends UriSchemes
  
  @js.native
  sealed trait turquoise extends MediaColor
  
  @js.native
  sealed trait tv extends UriSchemes
  
  @js.native
  sealed trait `two-sided-long-edge` extends Sides
  
  @js.native
  sealed trait `two-sided-short-edge` extends Sides
  
  @js.native
  sealed trait u3d extends js.Object
  
  @js.native
  sealed trait udp extends UriSchemes
  
  @js.native
  sealed trait um extends AccuracyUnits
  
  @js.native
  sealed trait uncalendared extends MediaTooth
  
  @js.native
  sealed trait uncollated extends js.Object
  
  @js.native
  sealed trait unicode extends CharacterSet
  
  @js.native
  sealed trait unicodeFFFE extends CharacterSet
  
  @js.native
  sealed trait unknown extends PrinterStateReasons
  
  @js.native
  sealed trait unreal extends UriSchemes
  
  @js.native
  sealed trait `unsupported-compression`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `unsupported-document-format`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait `uri-authentication-supported` extends js.Object
  
  @js.native
  sealed trait `uri-security-supported` extends js.Object
  
  @js.native
  sealed trait urn extends UriSchemes
  
  @js.native
  sealed trait `us-ascii` extends CharacterSet
  
  @js.native
  sealed trait `user-defined-values-supported` extends js.Object
  
  @js.native
  sealed trait ut2004 extends UriSchemes
  
  @js.native
  sealed trait `utf-7` extends CharacterSet
  
  @js.native
  sealed trait `utf-8` extends CharacterSet
  
  @js.native
  sealed trait `v-event` extends UriSchemes
  
  @js.native
  sealed trait vellum extends MediaTooth
  
  @js.native
  sealed trait velo extends BindingType
  
  @js.native
  sealed trait vemmi extends UriSchemes
  
  @js.native
  sealed trait ventrilo extends UriSchemes
  
  @js.native
  sealed trait videotex extends UriSchemes
  
  @js.native
  sealed trait `view-source` extends UriSchemes
  
  @js.native
  sealed trait violet extends MediaColor
  
  @js.native
  sealed trait vnc extends UriSchemes
  
  @js.native
  sealed trait wais extends UriSchemes
  
  @js.native
  sealed trait `warnings-count` extends js.Object
  
  @js.native
  sealed trait `warnings-detected`
    extends DocumentStateReasons
       with JobStateReasons
  
  @js.native
  sealed trait wax extends MaterialType
  
  @js.native
  sealed trait webcal extends UriSchemes
  
  @js.native
  sealed trait weekend
    extends JobDelayOutputUntil
       with JobHoldUntil
  
  @js.native
  sealed trait `wet-film` extends MediaType
  
  @js.native
  sealed trait `which-jobs-supported` extends js.Object
  
  @js.native
  sealed trait white extends MediaColor
  
  @js.native
  sealed trait `windows-1250` extends CharacterSet
  
  @js.native
  sealed trait `windows-1251` extends CharacterSet
  
  @js.native
  sealed trait `windows-1254` extends CharacterSet
  
  @js.native
  sealed trait `windows-1255` extends CharacterSet
  
  @js.native
  sealed trait `windows-1256` extends CharacterSet
  
  @js.native
  sealed trait `windows-1257` extends CharacterSet
  
  @js.native
  sealed trait `windows-1258` extends CharacterSet
  
  @js.native
  sealed trait `windows-874` extends CharacterSet
  
  @js.native
  sealed trait wire extends StitchingMethod
  
  @js.native
  sealed trait wpid extends UriSchemes
  
  @js.native
  sealed trait wrap extends BalingType
  
  @js.native
  sealed trait `wrapper-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-almost-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-almost-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-at-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-configuration-change` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-cover-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-cover-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-empty` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-full` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-interlock-closed` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-interlock-open` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-jam` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-life-almost-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-life-over` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-memory-exhausted` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-missing` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-motor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-near-limit` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-offline` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-opened` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-over-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-power-saver` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-recoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-recoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-resource-added` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-resource-removed` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-thermistor-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-timing-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-turned-off` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-turned-on` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-under-temperature` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-unrecoverable-failure` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-unrecoverable-storage-error` extends PrinterStateReasons
  
  @js.native
  sealed trait `wrapper-warming-up` extends PrinterStateReasons
  
  @js.native
  sealed trait ws extends UriSchemes
  
  @js.native
  sealed trait wss extends UriSchemes
  
  @js.native
  sealed trait wtai extends UriSchemes
  
  @js.native
  sealed trait wyciwyg extends UriSchemes
  
  @js.native
  sealed trait `x-Chinese-CNS` extends CharacterSet
  
  @js.native
  sealed trait `x-Chinese-Eten` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Arabic` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-CyrillicRussian` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-CyrillicSerbianBulgarian` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-DenmarkNorway` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-FinlandSweden` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Germany` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Greek` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-GreekModern` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Hebrew` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Icelandic` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Italy` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseAndJapaneseLatin` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseAndKana` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseAndUSCanada` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseKatakana` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-KoreanAndKoreanExtended` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-KoreanExtended` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-SimplifiedChinese` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Thai` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-TraditionalChinese` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-Turkish` extends CharacterSet
  
  @js.native
  sealed trait `x-EBCDIC-UK` extends CharacterSet
  
  @js.native
  sealed trait `x-Europa` extends CharacterSet
  
  @js.native
  sealed trait `x-IA5` extends CharacterSet
  
  @js.native
  sealed trait `x-IA5-German` extends CharacterSet
  
  @js.native
  sealed trait `x-IA5-Norwegian` extends CharacterSet
  
  @js.native
  sealed trait `x-IA5-Swedish` extends CharacterSet
  
  @js.native
  sealed trait `x-direction` extends MediaGrain
  
  @js.native
  sealed trait `x-ebcdic-cp-us-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-denmarknorway-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-finlandsweden-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-france-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-germany-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-icelandic-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-international-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-italy-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-spain-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-ebcdic-uk-euro` extends CharacterSet
  
  @js.native
  sealed trait `x-euc-jp` extends CharacterSet
  
  @js.native
  sealed trait `x-image-position` extends Overrides
  
  @js.native
  sealed trait `x-image-position-actual` extends js.Object
  
  @js.native
  sealed trait `x-image-position-default` extends js.Object
  
  @js.native
  sealed trait `x-image-position-supported` extends js.Object
  
  @js.native
  sealed trait `x-image-shift` extends Overrides
  
  @js.native
  sealed trait `x-image-shift-actual` extends js.Object
  
  @js.native
  sealed trait `x-image-shift-default` extends js.Object
  
  @js.native
  sealed trait `x-image-shift-supported` extends js.Object
  
  @js.native
  sealed trait `x-iscii-as` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-be` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-de` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-gu` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-ka` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-ma` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-or` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-pa` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-ta` extends CharacterSet
  
  @js.native
  sealed trait `x-iscii-te` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-arabic` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-ce` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-chinesesimp` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-cyrillic` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-greek` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-hebrew` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-icelandic` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-japanese` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-korean` extends CharacterSet
  
  @js.native
  sealed trait `x-mac-turkish` extends CharacterSet
  
  @js.native
  sealed trait `x-side1-image-shift` extends Overrides
  
  @js.native
  sealed trait `x-side1-image-shift-actual` extends js.Object
  
  @js.native
  sealed trait `x-side1-image-shift-default` extends js.Object
  
  @js.native
  sealed trait `x-side1-image-shift-supported` extends js.Object
  
  @js.native
  sealed trait `x-side2-image-shift` extends Overrides
  
  @js.native
  sealed trait `x-side2-image-shift-actual` extends js.Object
  
  @js.native
  sealed trait `x-side2-image-shift-default` extends js.Object
  
  @js.native
  sealed trait `x-side2-image-shift-supported` extends js.Object
  
  @js.native
  sealed trait xcon extends UriSchemes
  
  @js.native
  sealed trait `xcon-userid` extends UriSchemes
  
  @js.native
  sealed trait xfire extends UriSchemes
  
  @js.native
  sealed trait xmldsig extends DocumentDigitalSignature
  
  @js.native
  sealed trait xmlrpcDotbeep extends UriSchemes
  
  @js.native
  sealed trait xmlrpcDotbeeps extends UriSchemes
  
  @js.native
  sealed trait xmpp extends UriSchemes
  
  @js.native
  sealed trait xri extends UriSchemes
  
  @js.native
  sealed trait `y-direction` extends MediaGrain
  
  @js.native
  sealed trait `y-image-position` extends Overrides
  
  @js.native
  sealed trait `y-image-position-actual` extends js.Object
  
  @js.native
  sealed trait `y-image-position-default` extends js.Object
  
  @js.native
  sealed trait `y-image-position-supported` extends js.Object
  
  @js.native
  sealed trait `y-image-shift` extends Overrides
  
  @js.native
  sealed trait `y-image-shift-actual` extends js.Object
  
  @js.native
  sealed trait `y-image-shift-default` extends js.Object
  
  @js.native
  sealed trait `y-image-shift-supported` extends js.Object
  
  @js.native
  sealed trait `y-side1-image-shift` extends Overrides
  
  @js.native
  sealed trait `y-side1-image-shift-actual` extends js.Object
  
  @js.native
  sealed trait `y-side1-image-shift-default` extends js.Object
  
  @js.native
  sealed trait `y-side1-image-shift-supported` extends js.Object
  
  @js.native
  sealed trait `y-side2-image-shift` extends Overrides
  
  @js.native
  sealed trait `y-side2-image-shift-actual` extends js.Object
  
  @js.native
  sealed trait `y-side2-image-shift-default` extends js.Object
  
  @js.native
  sealed trait `y-side2-image-shift-supported` extends js.Object
  
  @js.native
  sealed trait yellow extends MediaColor
  
  @js.native
  sealed trait ymsgr extends UriSchemes
  
  @js.native
  sealed trait z39Dot50 extends UriSchemes
  
  @js.native
  sealed trait z39Dot50r extends UriSchemes
  
  @js.native
  sealed trait z39Dot50s extends UriSchemes
  
  @scala.inline
  def `1-to-n-order`: `1-to-n-order` = "1-to-n-order".asInstanceOf[`1-to-n-order`]
  @scala.inline
  def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  @scala.inline
  def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  @scala.inline
  def `2Dot0`: `2Dot0` = "2.0".asInstanceOf[`2Dot0`]
  @scala.inline
  def `2Dot1`: `2Dot1` = "2.1".asInstanceOf[`2Dot1`]
  @scala.inline
  def `2Dot2`: `2Dot2` = "2.2".asInstanceOf[`2Dot2`]
  @scala.inline
  def `ASMO-708`: `ASMO-708` = "ASMO-708".asInstanceOf[`ASMO-708`]
  @scala.inline
  def `Acknowledge-Document`: `Acknowledge-Document` = "Acknowledge-Document".asInstanceOf[`Acknowledge-Document`]
  @scala.inline
  def `Acknowledge-Identify-Printer`: `Acknowledge-Identify-Printer` = "Acknowledge-Identify-Printer".asInstanceOf[`Acknowledge-Identify-Printer`]
  @scala.inline
  def `Acknowledge-Job`: `Acknowledge-Job` = "Acknowledge-Job".asInstanceOf[`Acknowledge-Job`]
  @scala.inline
  def `Activate-Printer`: `Activate-Printer` = "Activate-Printer".asInstanceOf[`Activate-Printer`]
  @scala.inline
  def `Add-Document-Images`: `Add-Document-Images` = "Add-Document-Images".asInstanceOf[`Add-Document-Images`]
  @scala.inline
  def `Allocate-Printer-Resources`: `Allocate-Printer-Resources` = "Allocate-Printer-Resources".asInstanceOf[`Allocate-Printer-Resources`]
  @scala.inline
  def CP1026: CP1026 = "CP1026".asInstanceOf[CP1026]
  @scala.inline
  def CP870: CP870 = "CP870".asInstanceOf[CP870]
  @scala.inline
  def `Cancel-Current-Job`: `Cancel-Current-Job` = "Cancel-Current-Job".asInstanceOf[`Cancel-Current-Job`]
  @scala.inline
  def `Cancel-Document`: `Cancel-Document` = "Cancel-Document".asInstanceOf[`Cancel-Document`]
  @scala.inline
  def `Cancel-Job`: `Cancel-Job` = "Cancel-Job".asInstanceOf[`Cancel-Job`]
  @scala.inline
  def `Cancel-Jobs`: `Cancel-Jobs` = "Cancel-Jobs".asInstanceOf[`Cancel-Jobs`]
  @scala.inline
  def `Cancel-My-Jobs`: `Cancel-My-Jobs` = "Cancel-My-Jobs".asInstanceOf[`Cancel-My-Jobs`]
  @scala.inline
  def `Cancel-Resource`: `Cancel-Resource` = "Cancel-Resource".asInstanceOf[`Cancel-Resource`]
  @scala.inline
  def `Cancel-Subscription`: `Cancel-Subscription` = "Cancel-Subscription".asInstanceOf[`Cancel-Subscription`]
  @scala.inline
  def `Close-Job`: `Close-Job` = "Close-Job".asInstanceOf[`Close-Job`]
  @scala.inline
  def `Create-Job`: `Create-Job` = "Create-Job".asInstanceOf[`Create-Job`]
  @scala.inline
  def `Create-Job-Subscriptions`: `Create-Job-Subscriptions` = "Create-Job-Subscriptions".asInstanceOf[`Create-Job-Subscriptions`]
  @scala.inline
  def `Create-Printer`: `Create-Printer` = "Create-Printer".asInstanceOf[`Create-Printer`]
  @scala.inline
  def `Create-Printer-Subscriptions`: `Create-Printer-Subscriptions` = "Create-Printer-Subscriptions".asInstanceOf[`Create-Printer-Subscriptions`]
  @scala.inline
  def `Create-Resource`: `Create-Resource` = "Create-Resource".asInstanceOf[`Create-Resource`]
  @scala.inline
  def `Create-Resource-Subscriptions`: `Create-Resource-Subscriptions` = "Create-Resource-Subscriptions".asInstanceOf[`Create-Resource-Subscriptions`]
  @scala.inline
  def `Create-System-Subscriptions`: `Create-System-Subscriptions` = "Create-System-Subscriptions".asInstanceOf[`Create-System-Subscriptions`]
  @scala.inline
  def `DOS-720`: `DOS-720` = "DOS-720".asInstanceOf[`DOS-720`]
  @scala.inline
  def `DOS-862`: `DOS-862` = "DOS-862".asInstanceOf[`DOS-862`]
  @scala.inline
  def `Deactivate-Printer`: `Deactivate-Printer` = "Deactivate-Printer".asInstanceOf[`Deactivate-Printer`]
  @scala.inline
  def `Deallocate-Printer-Resources`: `Deallocate-Printer-Resources` = "Deallocate-Printer-Resources".asInstanceOf[`Deallocate-Printer-Resources`]
  @scala.inline
  def `Delete-Document`: `Delete-Document` = "Delete-Document".asInstanceOf[`Delete-Document`]
  @scala.inline
  def `Delete-Printer`: `Delete-Printer` = "Delete-Printer".asInstanceOf[`Delete-Printer`]
  @scala.inline
  def `Deregister-Output-Device`: `Deregister-Output-Device` = "Deregister-Output-Device".asInstanceOf[`Deregister-Output-Device`]
  @scala.inline
  def `Disable-All-Printers`: `Disable-All-Printers` = "Disable-All-Printers".asInstanceOf[`Disable-All-Printers`]
  @scala.inline
  def `Disable-Printer`: `Disable-Printer` = "Disable-Printer".asInstanceOf[`Disable-Printer`]
  @scala.inline
  def `EUC-CN`: `EUC-CN` = "EUC-CN".asInstanceOf[`EUC-CN`]
  @scala.inline
  def `Enable-All-Printers`: `Enable-All-Printers` = "Enable-All-Printers".asInstanceOf[`Enable-All-Printers`]
  @scala.inline
  def `Enable-Printer`: `Enable-Printer` = "Enable-Printer".asInstanceOf[`Enable-Printer`]
  @scala.inline
  def `Fetch-Document`: `Fetch-Document` = "Fetch-Document".asInstanceOf[`Fetch-Document`]
  @scala.inline
  def `Fetch-Job`: `Fetch-Job` = "Fetch-Job".asInstanceOf[`Fetch-Job`]
  @scala.inline
  def `Get-Document-Attributes`: `Get-Document-Attributes` = "Get-Document-Attributes".asInstanceOf[`Get-Document-Attributes`]
  @scala.inline
  def `Get-Documents`: `Get-Documents` = "Get-Documents".asInstanceOf[`Get-Documents`]
  @scala.inline
  def `Get-Job-Attributes`: `Get-Job-Attributes` = "Get-Job-Attributes".asInstanceOf[`Get-Job-Attributes`]
  @scala.inline
  def `Get-Jobs`: `Get-Jobs` = "Get-Jobs".asInstanceOf[`Get-Jobs`]
  @scala.inline
  def `Get-Next-Document-Data`: `Get-Next-Document-Data` = "Get-Next-Document-Data".asInstanceOf[`Get-Next-Document-Data`]
  @scala.inline
  def `Get-Notifications`: `Get-Notifications` = "Get-Notifications".asInstanceOf[`Get-Notifications`]
  @scala.inline
  def `Get-Output-Device-Attributes`: `Get-Output-Device-Attributes` = "Get-Output-Device-Attributes".asInstanceOf[`Get-Output-Device-Attributes`]
  @scala.inline
  def `Get-Printer-Attributes`: `Get-Printer-Attributes` = "Get-Printer-Attributes".asInstanceOf[`Get-Printer-Attributes`]
  @scala.inline
  def `Get-Printer-Resources`: `Get-Printer-Resources` = "Get-Printer-Resources".asInstanceOf[`Get-Printer-Resources`]
  @scala.inline
  def `Get-Printer-Supported-Values`: `Get-Printer-Supported-Values` = "Get-Printer-Supported-Values".asInstanceOf[`Get-Printer-Supported-Values`]
  @scala.inline
  def `Get-Printers`: `Get-Printers` = "Get-Printers".asInstanceOf[`Get-Printers`]
  @scala.inline
  def `Get-Resource-Attributes`: `Get-Resource-Attributes` = "Get-Resource-Attributes".asInstanceOf[`Get-Resource-Attributes`]
  @scala.inline
  def `Get-Resources`: `Get-Resources` = "Get-Resources".asInstanceOf[`Get-Resources`]
  @scala.inline
  def `Get-Subscription-Attributes`: `Get-Subscription-Attributes` = "Get-Subscription-Attributes".asInstanceOf[`Get-Subscription-Attributes`]
  @scala.inline
  def `Get-Subscriptions`: `Get-Subscriptions` = "Get-Subscriptions".asInstanceOf[`Get-Subscriptions`]
  @scala.inline
  def `Get-System-Attributes`: `Get-System-Attributes` = "Get-System-Attributes".asInstanceOf[`Get-System-Attributes`]
  @scala.inline
  def `Get-System-Supported-Values`: `Get-System-Supported-Values` = "Get-System-Supported-Values".asInstanceOf[`Get-System-Supported-Values`]
  @scala.inline
  def `Get-User-Printer-Attributes`: `Get-User-Printer-Attributes` = "Get-User-Printer-Attributes".asInstanceOf[`Get-User-Printer-Attributes`]
  @scala.inline
  def `Hold-Job`: `Hold-Job` = "Hold-Job".asInstanceOf[`Hold-Job`]
  @scala.inline
  def `Hold-New-Jobs`: `Hold-New-Jobs` = "Hold-New-Jobs".asInstanceOf[`Hold-New-Jobs`]
  @scala.inline
  def IBM437: IBM437 = "IBM437".asInstanceOf[IBM437]
  @scala.inline
  def `Identify-Printer`: `Identify-Printer` = "Identify-Printer".asInstanceOf[`Identify-Printer`]
  @scala.inline
  def `Install-Resource`: `Install-Resource` = "Install-Resource".asInstanceOf[`Install-Resource`]
  @scala.inline
  def Johab: Johab = "Johab".asInstanceOf[Johab]
  @scala.inline
  def `Pause-All-Printers`: `Pause-All-Printers` = "Pause-All-Printers".asInstanceOf[`Pause-All-Printers`]
  @scala.inline
  def `Pause-All-Printers-After-Current-Job`: `Pause-All-Printers-After-Current-Job` = "Pause-All-Printers-After-Current-Job".asInstanceOf[`Pause-All-Printers-After-Current-Job`]
  @scala.inline
  def `Pause-Printer`: `Pause-Printer` = "Pause-Printer".asInstanceOf[`Pause-Printer`]
  @scala.inline
  def `Pause-Printer-After-Current-Job`: `Pause-Printer-After-Current-Job` = "Pause-Printer-After-Current-Job".asInstanceOf[`Pause-Printer-After-Current-Job`]
  @scala.inline
  def `Print-Job`: `Print-Job` = "Print-Job".asInstanceOf[`Print-Job`]
  @scala.inline
  def `Print-URI`: `Print-URI` = "Print-URI".asInstanceOf[`Print-URI`]
  @scala.inline
  def `Promote-Job`: `Promote-Job` = "Promote-Job".asInstanceOf[`Promote-Job`]
  @scala.inline
  def `Purge-Jobs`: `Purge-Jobs` = "Purge-Jobs".asInstanceOf[`Purge-Jobs`]
  @scala.inline
  def `Register-Output-Device`: `Register-Output-Device` = "Register-Output-Device".asInstanceOf[`Register-Output-Device`]
  @scala.inline
  def `Release-Held-New-Jobs`: `Release-Held-New-Jobs` = "Release-Held-New-Jobs".asInstanceOf[`Release-Held-New-Jobs`]
  @scala.inline
  def `Release-Job`: `Release-Job` = "Release-Job".asInstanceOf[`Release-Job`]
  @scala.inline
  def `Renew-Subscription`: `Renew-Subscription` = "Renew-Subscription".asInstanceOf[`Renew-Subscription`]
  @scala.inline
  def `Reprocess-Job`: `Reprocess-Job` = "Reprocess-Job".asInstanceOf[`Reprocess-Job`]
  @scala.inline
  def `Restart-Job`: `Restart-Job` = "Restart-Job".asInstanceOf[`Restart-Job`]
  @scala.inline
  def `Restart-One-Printer`: `Restart-One-Printer` = "Restart-One-Printer".asInstanceOf[`Restart-One-Printer`]
  @scala.inline
  def `Restart-Printer`: `Restart-Printer` = "Restart-Printer".asInstanceOf[`Restart-Printer`]
  @scala.inline
  def `Restart-System`: `Restart-System` = "Restart-System".asInstanceOf[`Restart-System`]
  @scala.inline
  def `Resubmit-Job`: `Resubmit-Job` = "Resubmit-Job".asInstanceOf[`Resubmit-Job`]
  @scala.inline
  def `Resume-All-Printers`: `Resume-All-Printers` = "Resume-All-Printers".asInstanceOf[`Resume-All-Printers`]
  @scala.inline
  def `Resume-Job`: `Resume-Job` = "Resume-Job".asInstanceOf[`Resume-Job`]
  @scala.inline
  def `Resume-Printer`: `Resume-Printer` = "Resume-Printer".asInstanceOf[`Resume-Printer`]
  @scala.inline
  def `Schedule-Job-After`: `Schedule-Job-After` = "Schedule-Job-After".asInstanceOf[`Schedule-Job-After`]
  @scala.inline
  def `Send-Document`: `Send-Document` = "Send-Document".asInstanceOf[`Send-Document`]
  @scala.inline
  def `Send-Resource-Data`: `Send-Resource-Data` = "Send-Resource-Data".asInstanceOf[`Send-Resource-Data`]
  @scala.inline
  def `Send-URI`: `Send-URI` = "Send-URI".asInstanceOf[`Send-URI`]
  @scala.inline
  def `Set-Document-Attributes`: `Set-Document-Attributes` = "Set-Document-Attributes".asInstanceOf[`Set-Document-Attributes`]
  @scala.inline
  def `Set-Job-Attributes`: `Set-Job-Attributes` = "Set-Job-Attributes".asInstanceOf[`Set-Job-Attributes`]
  @scala.inline
  def `Set-Printer-Attributes`: `Set-Printer-Attributes` = "Set-Printer-Attributes".asInstanceOf[`Set-Printer-Attributes`]
  @scala.inline
  def `Set-Resource-Attributes`: `Set-Resource-Attributes` = "Set-Resource-Attributes".asInstanceOf[`Set-Resource-Attributes`]
  @scala.inline
  def `Set-System-Attributes`: `Set-System-Attributes` = "Set-System-Attributes".asInstanceOf[`Set-System-Attributes`]
  @scala.inline
  def `Shutdown-All-Printers`: `Shutdown-All-Printers` = "Shutdown-All-Printers".asInstanceOf[`Shutdown-All-Printers`]
  @scala.inline
  def `Shutdown-One-Printer`: `Shutdown-One-Printer` = "Shutdown-One-Printer".asInstanceOf[`Shutdown-One-Printer`]
  @scala.inline
  def `Shutdown-Printer`: `Shutdown-Printer` = "Shutdown-Printer".asInstanceOf[`Shutdown-Printer`]
  @scala.inline
  def `Startup-All-Printers`: `Startup-All-Printers` = "Startup-All-Printers".asInstanceOf[`Startup-All-Printers`]
  @scala.inline
  def `Startup-One-Printer`: `Startup-One-Printer` = "Startup-One-Printer".asInstanceOf[`Startup-One-Printer`]
  @scala.inline
  def `Startup-Printer`: `Startup-Printer` = "Startup-Printer".asInstanceOf[`Startup-Printer`]
  @scala.inline
  def `Suspend-Current-Job`: `Suspend-Current-Job` = "Suspend-Current-Job".asInstanceOf[`Suspend-Current-Job`]
  @scala.inline
  def `Update-Active-Jobs`: `Update-Active-Jobs` = "Update-Active-Jobs".asInstanceOf[`Update-Active-Jobs`]
  @scala.inline
  def `Update-Document-Status`: `Update-Document-Status` = "Update-Document-Status".asInstanceOf[`Update-Document-Status`]
  @scala.inline
  def `Update-Job-Status`: `Update-Job-Status` = "Update-Job-Status".asInstanceOf[`Update-Job-Status`]
  @scala.inline
  def `Update-Output-Device-Attributes`: `Update-Output-Device-Attributes` = "Update-Output-Device-Attributes".asInstanceOf[`Update-Output-Device-Attributes`]
  @scala.inline
  def `Validate-Document`: `Validate-Document` = "Validate-Document".asInstanceOf[`Validate-Document`]
  @scala.inline
  def `Validate-Job`: `Validate-Job` = "Validate-Job".asInstanceOf[`Validate-Job`]
  @scala.inline
  def Value: Value = "Value".asInstanceOf[Value]
  @scala.inline
  def `Windows-1252 `: `Windows-1252 ` = ("Windows-1252 ").asInstanceOf[`Windows-1252 `]
  @scala.inline
  def `X-EBCDIC-Spain`: `X-EBCDIC-Spain` = "X-EBCDIC-Spain".asInstanceOf[`X-EBCDIC-Spain`]
  @scala.inline
  def a: a = "a".asInstanceOf[a]
  @scala.inline
  def `a-translucent`: `a-translucent` = "a-translucent".asInstanceOf[`a-translucent`]
  @scala.inline
  def `a-transparent`: `a-transparent` = "a-transparent".asInstanceOf[`a-transparent`]
  @scala.inline
  def `a-white`: `a-white` = "a-white".asInstanceOf[`a-white`]
  @scala.inline
  def aaa: aaa = "aaa".asInstanceOf[aaa]
  @scala.inline
  def aaas: aaas = "aaas".asInstanceOf[aaas]
  @scala.inline
  def `abort-job`: `abort-job` = "abort-job".asInstanceOf[`abort-job`]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def `aborted-by-system`: `aborted-by-system` = "aborted-by-system".asInstanceOf[`aborted-by-system`]
  @scala.inline
  def about: about = "about".asInstanceOf[about]
  @scala.inline
  def abs: abs = "abs".asInstanceOf[abs]
  @scala.inline
  def `abs-carbon-fiber`: `abs-carbon-fiber` = "abs-carbon-fiber".asInstanceOf[`abs-carbon-fiber`]
  @scala.inline
  def `abs-carbon-nanotube`: `abs-carbon-nanotube` = "abs-carbon-nanotube".asInstanceOf[`abs-carbon-nanotube`]
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  @scala.inline
  def acap: acap = "acap".asInstanceOf[acap]
  @scala.inline
  def acct: acct = "acct".asInstanceOf[acct]
  @scala.inline
  def `accuracy-units-supported`: `accuracy-units-supported` = "accuracy-units-supported".asInstanceOf[`accuracy-units-supported`]
  @scala.inline
  def acd: acd = "acd".asInstanceOf[acd]
  @scala.inline
  def acr: acr = "acr".asInstanceOf[acr]
  @scala.inline
  def activity: activity = "activity".asInstanceOf[activity]
  @scala.inline
  def adf: adf = "adf".asInstanceOf[adf]
  @scala.inline
  def adhesive: adhesive = "adhesive".asInstanceOf[adhesive]
  @scala.inline
  def adiumxtra: adiumxtra = "adiumxtra".asInstanceOf[adiumxtra]
  @scala.inline
  def `adobe-1Dot3`: `adobe-1Dot3` = "adobe-1.3".asInstanceOf[`adobe-1Dot3`]
  @scala.inline
  def `adobe-1Dot4`: `adobe-1Dot4` = "adobe-1.4".asInstanceOf[`adobe-1Dot4`]
  @scala.inline
  def `adobe-1Dot5`: `adobe-1Dot5` = "adobe-1.5".asInstanceOf[`adobe-1Dot5`]
  @scala.inline
  def `adobe-1Dot6`: `adobe-1Dot6` = "adobe-1.6".asInstanceOf[`adobe-1Dot6`]
  @scala.inline
  def `adobe-rgb_16`: `adobe-rgb_16` = "adobe-rgb_16".asInstanceOf[`adobe-rgb_16`]
  @scala.inline
  def `adobe-rgb_8`: `adobe-rgb_8` = "adobe-rgb_8".asInstanceOf[`adobe-rgb_8`]
  @scala.inline
  def adt: adt = "adt".asInstanceOf[adt]
  @scala.inline
  def afp: afp = "afp".asInstanceOf[afp]
  @scala.inline
  def afs: afs = "afs".asInstanceOf[afs]
  @scala.inline
  def `after-job`: `after-job` = "after-job".asInstanceOf[`after-job`]
  @scala.inline
  def `after-sets`: `after-sets` = "after-sets".asInstanceOf[`after-sets`]
  @scala.inline
  def aim: aim = "aim".asInstanceOf[aim]
  @scala.inline
  def `alert-removal-of-binary-change-entry`: `alert-removal-of-binary-change-entry` = "alert-removal-of-binary-change-entry".asInstanceOf[`alert-removal-of-binary-change-entry`]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def alternate: alternate = "alternate".asInstanceOf[alternate]
  @scala.inline
  def `alternate-roll`: `alternate-roll` = "alternate-roll".asInstanceOf[`alternate-roll`]
  @scala.inline
  def aluminum: aluminum = "aluminum".asInstanceOf[aluminum]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def amss: amss = "amss".asInstanceOf[amss]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def antique: antique = "antique".asInstanceOf[antique]
  @scala.inline
  def appdata: appdata = "appdata".asInstanceOf[appdata]
  @scala.inline
  def applicationSlashactivemessage: applicationSlashactivemessage = "application/activemessage".asInstanceOf[applicationSlashactivemessage]
  @scala.inline
  def `applicationSlashandrew-inset`: `applicationSlashandrew-inset` = "application/andrew-inset".asInstanceOf[`applicationSlashandrew-inset`]
  @scala.inline
  def applicationSlashapplefile: applicationSlashapplefile = "application/applefile".asInstanceOf[applicationSlashapplefile]
  @scala.inline
  def applicationSlashatomicmail: applicationSlashatomicmail = "application/atomicmail".asInstanceOf[applicationSlashatomicmail]
  @scala.inline
  def `applicationSlashdca-rft`: `applicationSlashdca-rft` = "application/dca-rft".asInstanceOf[`applicationSlashdca-rft`]
  @scala.inline
  def `applicationSlashdec-dx`: `applicationSlashdec-dx` = "application/dec-dx".asInstanceOf[`applicationSlashdec-dx`]
  @scala.inline
  def `applicationSlashmac-binhex40`: `applicationSlashmac-binhex40` = "application/mac-binhex40".asInstanceOf[`applicationSlashmac-binhex40`]
  @scala.inline
  def `applicationSlashmac-compactpro`: `applicationSlashmac-compactpro` = "application/mac-compactpro".asInstanceOf[`applicationSlashmac-compactpro`]
  @scala.inline
  def applicationSlashmacwriteii: applicationSlashmacwriteii = "application/macwriteii".asInstanceOf[applicationSlashmacwriteii]
  @scala.inline
  def applicationSlashmsword: applicationSlashmsword = "application/msword".asInstanceOf[applicationSlashmsword]
  @scala.inline
  def `applicationSlashnews-message-id`: `applicationSlashnews-message-id` = "application/news-message-id".asInstanceOf[`applicationSlashnews-message-id`]
  @scala.inline
  def `applicationSlashnews-transmission`: `applicationSlashnews-transmission` = "application/news-transmission".asInstanceOf[`applicationSlashnews-transmission`]
  @scala.inline
  def `applicationSlashoctet-stream`: `applicationSlashoctet-stream` = "application/octet-stream".asInstanceOf[`applicationSlashoctet-stream`]
  @scala.inline
  def applicationSlashoda: applicationSlashoda = "application/oda".asInstanceOf[applicationSlashoda]
  @scala.inline
  def applicationSlashpdf: applicationSlashpdf = "application/pdf".asInstanceOf[applicationSlashpdf]
  @scala.inline
  def applicationSlashpostscript: applicationSlashpostscript = "application/postscript".asInstanceOf[applicationSlashpostscript]
  @scala.inline
  def applicationSlashpowerpoint: applicationSlashpowerpoint = "application/powerpoint".asInstanceOf[applicationSlashpowerpoint]
  @scala.inline
  def `applicationSlashremote-printing`: `applicationSlashremote-printing` = "application/remote-printing".asInstanceOf[`applicationSlashremote-printing`]
  @scala.inline
  def applicationSlashrtf: applicationSlashrtf = "application/rtf".asInstanceOf[applicationSlashrtf]
  @scala.inline
  def applicationSlashslate: applicationSlashslate = "application/slate".asInstanceOf[applicationSlashslate]
  @scala.inline
  def applicationSlashwita: applicationSlashwita = "application/wita".asInstanceOf[applicationSlashwita]
  @scala.inline
  def applicationSlashwordperfect5Dot1: applicationSlashwordperfect5Dot1 = "application/wordperfect5.1".asInstanceOf[applicationSlashwordperfect5Dot1]
  @scala.inline
  def `applicationSlashx-bcpio`: `applicationSlashx-bcpio` = "application/x-bcpio".asInstanceOf[`applicationSlashx-bcpio`]
  @scala.inline
  def `applicationSlashx-cdlink`: `applicationSlashx-cdlink` = "application/x-cdlink".asInstanceOf[`applicationSlashx-cdlink`]
  @scala.inline
  def `applicationSlashx-compress`: `applicationSlashx-compress` = "application/x-compress".asInstanceOf[`applicationSlashx-compress`]
  @scala.inline
  def `applicationSlashx-cpio`: `applicationSlashx-cpio` = "application/x-cpio".asInstanceOf[`applicationSlashx-cpio`]
  @scala.inline
  def `applicationSlashx-csh`: `applicationSlashx-csh` = "application/x-csh".asInstanceOf[`applicationSlashx-csh`]
  @scala.inline
  def `applicationSlashx-director`: `applicationSlashx-director` = "application/x-director".asInstanceOf[`applicationSlashx-director`]
  @scala.inline
  def `applicationSlashx-dvi`: `applicationSlashx-dvi` = "application/x-dvi".asInstanceOf[`applicationSlashx-dvi`]
  @scala.inline
  def `applicationSlashx-gtar`: `applicationSlashx-gtar` = "application/x-gtar".asInstanceOf[`applicationSlashx-gtar`]
  @scala.inline
  def `applicationSlashx-gzip`: `applicationSlashx-gzip` = "application/x-gzip".asInstanceOf[`applicationSlashx-gzip`]
  @scala.inline
  def `applicationSlashx-hdf`: `applicationSlashx-hdf` = "application/x-hdf".asInstanceOf[`applicationSlashx-hdf`]
  @scala.inline
  def `applicationSlashx-httpd-cgi`: `applicationSlashx-httpd-cgi` = "application/x-httpd-cgi".asInstanceOf[`applicationSlashx-httpd-cgi`]
  @scala.inline
  def `applicationSlashx-koan`: `applicationSlashx-koan` = "application/x-koan".asInstanceOf[`applicationSlashx-koan`]
  @scala.inline
  def `applicationSlashx-latex`: `applicationSlashx-latex` = "application/x-latex".asInstanceOf[`applicationSlashx-latex`]
  @scala.inline
  def `applicationSlashx-mif`: `applicationSlashx-mif` = "application/x-mif".asInstanceOf[`applicationSlashx-mif`]
  @scala.inline
  def `applicationSlashx-netcdf`: `applicationSlashx-netcdf` = "application/x-netcdf".asInstanceOf[`applicationSlashx-netcdf`]
  @scala.inline
  def `applicationSlashx-sh`: `applicationSlashx-sh` = "application/x-sh".asInstanceOf[`applicationSlashx-sh`]
  @scala.inline
  def `applicationSlashx-shar`: `applicationSlashx-shar` = "application/x-shar".asInstanceOf[`applicationSlashx-shar`]
  @scala.inline
  def `applicationSlashx-stuffit`: `applicationSlashx-stuffit` = "application/x-stuffit".asInstanceOf[`applicationSlashx-stuffit`]
  @scala.inline
  def `applicationSlashx-sv4cpio`: `applicationSlashx-sv4cpio` = "application/x-sv4cpio".asInstanceOf[`applicationSlashx-sv4cpio`]
  @scala.inline
  def `applicationSlashx-sv4crc`: `applicationSlashx-sv4crc` = "application/x-sv4crc".asInstanceOf[`applicationSlashx-sv4crc`]
  @scala.inline
  def `applicationSlashx-tar`: `applicationSlashx-tar` = "application/x-tar".asInstanceOf[`applicationSlashx-tar`]
  @scala.inline
  def `applicationSlashx-tcl`: `applicationSlashx-tcl` = "application/x-tcl".asInstanceOf[`applicationSlashx-tcl`]
  @scala.inline
  def `applicationSlashx-tex`: `applicationSlashx-tex` = "application/x-tex".asInstanceOf[`applicationSlashx-tex`]
  @scala.inline
  def `applicationSlashx-texinfo`: `applicationSlashx-texinfo` = "application/x-texinfo".asInstanceOf[`applicationSlashx-texinfo`]
  @scala.inline
  def `applicationSlashx-troff`: `applicationSlashx-troff` = "application/x-troff".asInstanceOf[`applicationSlashx-troff`]
  @scala.inline
  def `applicationSlashx-troff-man`: `applicationSlashx-troff-man` = "application/x-troff-man".asInstanceOf[`applicationSlashx-troff-man`]
  @scala.inline
  def `applicationSlashx-troff-me`: `applicationSlashx-troff-me` = "application/x-troff-me".asInstanceOf[`applicationSlashx-troff-me`]
  @scala.inline
  def `applicationSlashx-troff-ms`: `applicationSlashx-troff-ms` = "application/x-troff-ms".asInstanceOf[`applicationSlashx-troff-ms`]
  @scala.inline
  def `applicationSlashx-ustar`: `applicationSlashx-ustar` = "application/x-ustar".asInstanceOf[`applicationSlashx-ustar`]
  @scala.inline
  def `applicationSlashx-wais-source`: `applicationSlashx-wais-source` = "application/x-wais-source".asInstanceOf[`applicationSlashx-wais-source`]
  @scala.inline
  def apt: apt = "apt".asInstanceOf[apt]
  @scala.inline
  def `arch-a`: `arch-a` = "arch-a".asInstanceOf[`arch-a`]
  @scala.inline
  def `arch-a-translucent`: `arch-a-translucent` = "arch-a-translucent".asInstanceOf[`arch-a-translucent`]
  @scala.inline
  def `arch-a-transparent`: `arch-a-transparent` = "arch-a-transparent".asInstanceOf[`arch-a-transparent`]
  @scala.inline
  def `arch-a-white`: `arch-a-white` = "arch-a-white".asInstanceOf[`arch-a-white`]
  @scala.inline
  def `arch-axsynchro-translucent`: `arch-axsynchro-translucent` = "arch-axsynchro-translucent".asInstanceOf[`arch-axsynchro-translucent`]
  @scala.inline
  def `arch-axsynchro-transparent`: `arch-axsynchro-transparent` = "arch-axsynchro-transparent".asInstanceOf[`arch-axsynchro-transparent`]
  @scala.inline
  def `arch-axsynchro-white`: `arch-axsynchro-white` = "arch-axsynchro-white".asInstanceOf[`arch-axsynchro-white`]
  @scala.inline
  def `arch-b`: `arch-b` = "arch-b".asInstanceOf[`arch-b`]
  @scala.inline
  def `arch-b-translucent`: `arch-b-translucent` = "arch-b-translucent".asInstanceOf[`arch-b-translucent`]
  @scala.inline
  def `arch-b-transparent`: `arch-b-transparent` = "arch-b-transparent".asInstanceOf[`arch-b-transparent`]
  @scala.inline
  def `arch-b-white`: `arch-b-white` = "arch-b-white".asInstanceOf[`arch-b-white`]
  @scala.inline
  def `arch-bxsynchro-translucent`: `arch-bxsynchro-translucent` = "arch-bxsynchro-translucent".asInstanceOf[`arch-bxsynchro-translucent`]
  @scala.inline
  def `arch-bxsynchro-transparent`: `arch-bxsynchro-transparent` = "arch-bxsynchro-transparent".asInstanceOf[`arch-bxsynchro-transparent`]
  @scala.inline
  def `arch-bxsynchro-white`: `arch-bxsynchro-white` = "arch-bxsynchro-white".asInstanceOf[`arch-bxsynchro-white`]
  @scala.inline
  def `arch-c`: `arch-c` = "arch-c".asInstanceOf[`arch-c`]
  @scala.inline
  def `arch-c-translucent`: `arch-c-translucent` = "arch-c-translucent".asInstanceOf[`arch-c-translucent`]
  @scala.inline
  def `arch-c-transparent`: `arch-c-transparent` = "arch-c-transparent".asInstanceOf[`arch-c-transparent`]
  @scala.inline
  def `arch-c-white`: `arch-c-white` = "arch-c-white".asInstanceOf[`arch-c-white`]
  @scala.inline
  def `arch-cxsynchro-translucent`: `arch-cxsynchro-translucent` = "arch-cxsynchro-translucent".asInstanceOf[`arch-cxsynchro-translucent`]
  @scala.inline
  def `arch-cxsynchro-transparent`: `arch-cxsynchro-transparent` = "arch-cxsynchro-transparent".asInstanceOf[`arch-cxsynchro-transparent`]
  @scala.inline
  def `arch-cxsynchro-white`: `arch-cxsynchro-white` = "arch-cxsynchro-white".asInstanceOf[`arch-cxsynchro-white`]
  @scala.inline
  def `arch-d`: `arch-d` = "arch-d".asInstanceOf[`arch-d`]
  @scala.inline
  def `arch-d-translucent`: `arch-d-translucent` = "arch-d-translucent".asInstanceOf[`arch-d-translucent`]
  @scala.inline
  def `arch-d-transparent`: `arch-d-transparent` = "arch-d-transparent".asInstanceOf[`arch-d-transparent`]
  @scala.inline
  def `arch-d-white`: `arch-d-white` = "arch-d-white".asInstanceOf[`arch-d-white`]
  @scala.inline
  def `arch-dxsynchro-translucent`: `arch-dxsynchro-translucent` = "arch-dxsynchro-translucent".asInstanceOf[`arch-dxsynchro-translucent`]
  @scala.inline
  def `arch-dxsynchro-transparent`: `arch-dxsynchro-transparent` = "arch-dxsynchro-transparent".asInstanceOf[`arch-dxsynchro-transparent`]
  @scala.inline
  def `arch-dxsynchro-white`: `arch-dxsynchro-white` = "arch-dxsynchro-white".asInstanceOf[`arch-dxsynchro-white`]
  @scala.inline
  def `arch-e`: `arch-e` = "arch-e".asInstanceOf[`arch-e`]
  @scala.inline
  def `arch-e-translucent`: `arch-e-translucent` = "arch-e-translucent".asInstanceOf[`arch-e-translucent`]
  @scala.inline
  def `arch-e-transparent`: `arch-e-transparent` = "arch-e-transparent".asInstanceOf[`arch-e-transparent`]
  @scala.inline
  def `arch-e-white`: `arch-e-white` = "arch-e-white".asInstanceOf[`arch-e-white`]
  @scala.inline
  def `arch-exsynchro-translucent`: `arch-exsynchro-translucent` = "arch-exsynchro-translucent".asInstanceOf[`arch-exsynchro-translucent`]
  @scala.inline
  def `arch-exsynchro-transparent`: `arch-exsynchro-transparent` = "arch-exsynchro-transparent".asInstanceOf[`arch-exsynchro-transparent`]
  @scala.inline
  def `arch-exsynchro-white`: `arch-exsynchro-white` = "arch-exsynchro-white".asInstanceOf[`arch-exsynchro-white`]
  @scala.inline
  def archival: archival = "archival".asInstanceOf[archival]
  @scala.inline
  def `archival-glossy`: `archival-glossy` = "archival-glossy".asInstanceOf[`archival-glossy`]
  @scala.inline
  def `archival-matte`: `archival-matte` = "archival-matte".asInstanceOf[`archival-matte`]
  @scala.inline
  def `archival-semi-gloss`: `archival-semi-gloss` = "archival-semi-gloss".asInstanceOf[`archival-semi-gloss`]
  @scala.inline
  def arithmetic: arithmetic = "arithmetic".asInstanceOf[arithmetic]
  @scala.inline
  def ark: ark = "ark".asInstanceOf[ark]
  @scala.inline
  def asme_f_28x40in: asme_f_28x40in = "asme_f_28x40in".asInstanceOf[asme_f_28x40in]
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  @scala.inline
  def attempted: attempted = "attempted".asInstanceOf[attempted]
  @scala.inline
  def `attributes-charset`: `attributes-charset` = "attributes-charset".asInstanceOf[`attributes-charset`]
  @scala.inline
  def `attributes-natural-language`: `attributes-natural-language` = "attributes-natural-language".asInstanceOf[`attributes-natural-language`]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def `auto-fit`: `auto-fit` = "auto-fit".asInstanceOf[`auto-fit`]
  @scala.inline
  def `auto-fixed-size-translucent`: `auto-fixed-size-translucent` = "auto-fixed-size-translucent".asInstanceOf[`auto-fixed-size-translucent`]
  @scala.inline
  def `auto-fixed-size-transparent`: `auto-fixed-size-transparent` = "auto-fixed-size-transparent".asInstanceOf[`auto-fixed-size-transparent`]
  @scala.inline
  def `auto-fixed-size-white`: `auto-fixed-size-white` = "auto-fixed-size-white".asInstanceOf[`auto-fixed-size-white`]
  @scala.inline
  def `auto-monochrome`: `auto-monochrome` = "auto-monochrome".asInstanceOf[`auto-monochrome`]
  @scala.inline
  def `auto-synchro-translucent`: `auto-synchro-translucent` = "auto-synchro-translucent".asInstanceOf[`auto-synchro-translucent`]
  @scala.inline
  def `auto-synchro-transparent`: `auto-synchro-transparent` = "auto-synchro-transparent".asInstanceOf[`auto-synchro-transparent`]
  @scala.inline
  def `auto-synchro-white`: `auto-synchro-white` = "auto-synchro-white".asInstanceOf[`auto-synchro-white`]
  @scala.inline
  def `auto-translucent`: `auto-translucent` = "auto-translucent".asInstanceOf[`auto-translucent`]
  @scala.inline
  def `auto-transparent`: `auto-transparent` = "auto-transparent".asInstanceOf[`auto-transparent`]
  @scala.inline
  def `auto-white`: `auto-white` = "auto-white".asInstanceOf[`auto-white`]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def aw: aw = "aw".asInstanceOf[aw]
  @scala.inline
  def `axsynchro-translucent`: `axsynchro-translucent` = "axsynchro-translucent".asInstanceOf[`axsynchro-translucent`]
  @scala.inline
  def `axsynchro-transparent`: `axsynchro-transparent` = "axsynchro-transparent".asInstanceOf[`axsynchro-transparent`]
  @scala.inline
  def `axsynchro-white`: `axsynchro-white` = "axsynchro-white".asInstanceOf[`axsynchro-white`]
  @scala.inline
  def b: b = "b".asInstanceOf[b]
  @scala.inline
  def `b-translucent`: `b-translucent` = "b-translucent".asInstanceOf[`b-translucent`]
  @scala.inline
  def `b-transparent`: `b-transparent` = "b-transparent".asInstanceOf[`b-transparent`]
  @scala.inline
  def `b-white`: `b-white` = "b-white".asInstanceOf[`b-white`]
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  @scala.inline
  def `back-print-film`: `back-print-film` = "back-print-film".asInstanceOf[`back-print-film`]
  @scala.inline
  def bale: bale = "bale".asInstanceOf[bale]
  @scala.inline
  def baling: baling = "baling".asInstanceOf[baling]
  @scala.inline
  def `baling-type-supported`: `baling-type-supported` = "baling-type-supported".asInstanceOf[`baling-type-supported`]
  @scala.inline
  def `baling-when-supported`: `baling-when-supported` = "baling-when-supported".asInstanceOf[`baling-when-supported`]
  @scala.inline
  def band: band = "band".asInstanceOf[band]
  @scala.inline
  def `bander-added`: `bander-added` = "bander-added".asInstanceOf[`bander-added`]
  @scala.inline
  def `bander-almost-empty`: `bander-almost-empty` = "bander-almost-empty".asInstanceOf[`bander-almost-empty`]
  @scala.inline
  def `bander-almost-full`: `bander-almost-full` = "bander-almost-full".asInstanceOf[`bander-almost-full`]
  @scala.inline
  def `bander-at-limit`: `bander-at-limit` = "bander-at-limit".asInstanceOf[`bander-at-limit`]
  @scala.inline
  def `bander-closed`: `bander-closed` = "bander-closed".asInstanceOf[`bander-closed`]
  @scala.inline
  def `bander-configuration-change`: `bander-configuration-change` = "bander-configuration-change".asInstanceOf[`bander-configuration-change`]
  @scala.inline
  def `bander-cover-closed`: `bander-cover-closed` = "bander-cover-closed".asInstanceOf[`bander-cover-closed`]
  @scala.inline
  def `bander-cover-open`: `bander-cover-open` = "bander-cover-open".asInstanceOf[`bander-cover-open`]
  @scala.inline
  def `bander-empty`: `bander-empty` = "bander-empty".asInstanceOf[`bander-empty`]
  @scala.inline
  def `bander-full`: `bander-full` = "bander-full".asInstanceOf[`bander-full`]
  @scala.inline
  def `bander-interlock-closed`: `bander-interlock-closed` = "bander-interlock-closed".asInstanceOf[`bander-interlock-closed`]
  @scala.inline
  def `bander-interlock-open`: `bander-interlock-open` = "bander-interlock-open".asInstanceOf[`bander-interlock-open`]
  @scala.inline
  def `bander-jam`: `bander-jam` = "bander-jam".asInstanceOf[`bander-jam`]
  @scala.inline
  def `bander-life-almost-over`: `bander-life-almost-over` = "bander-life-almost-over".asInstanceOf[`bander-life-almost-over`]
  @scala.inline
  def `bander-life-over`: `bander-life-over` = "bander-life-over".asInstanceOf[`bander-life-over`]
  @scala.inline
  def `bander-memory-exhausted`: `bander-memory-exhausted` = "bander-memory-exhausted".asInstanceOf[`bander-memory-exhausted`]
  @scala.inline
  def `bander-missing`: `bander-missing` = "bander-missing".asInstanceOf[`bander-missing`]
  @scala.inline
  def `bander-motor-failure`: `bander-motor-failure` = "bander-motor-failure".asInstanceOf[`bander-motor-failure`]
  @scala.inline
  def `bander-near-limit`: `bander-near-limit` = "bander-near-limit".asInstanceOf[`bander-near-limit`]
  @scala.inline
  def `bander-offline`: `bander-offline` = "bander-offline".asInstanceOf[`bander-offline`]
  @scala.inline
  def `bander-opened`: `bander-opened` = "bander-opened".asInstanceOf[`bander-opened`]
  @scala.inline
  def `bander-over-temperature`: `bander-over-temperature` = "bander-over-temperature".asInstanceOf[`bander-over-temperature`]
  @scala.inline
  def `bander-power-saver`: `bander-power-saver` = "bander-power-saver".asInstanceOf[`bander-power-saver`]
  @scala.inline
  def `bander-recoverable-failure`: `bander-recoverable-failure` = "bander-recoverable-failure".asInstanceOf[`bander-recoverable-failure`]
  @scala.inline
  def `bander-recoverable-storage-error`: `bander-recoverable-storage-error` = "bander-recoverable-storage-error".asInstanceOf[`bander-recoverable-storage-error`]
  @scala.inline
  def `bander-removed`: `bander-removed` = "bander-removed".asInstanceOf[`bander-removed`]
  @scala.inline
  def `bander-resource-added`: `bander-resource-added` = "bander-resource-added".asInstanceOf[`bander-resource-added`]
  @scala.inline
  def `bander-resource-removed`: `bander-resource-removed` = "bander-resource-removed".asInstanceOf[`bander-resource-removed`]
  @scala.inline
  def `bander-thermistor-failure`: `bander-thermistor-failure` = "bander-thermistor-failure".asInstanceOf[`bander-thermistor-failure`]
  @scala.inline
  def `bander-timing-failure`: `bander-timing-failure` = "bander-timing-failure".asInstanceOf[`bander-timing-failure`]
  @scala.inline
  def `bander-turned-off`: `bander-turned-off` = "bander-turned-off".asInstanceOf[`bander-turned-off`]
  @scala.inline
  def `bander-turned-on`: `bander-turned-on` = "bander-turned-on".asInstanceOf[`bander-turned-on`]
  @scala.inline
  def `bander-under-temperature`: `bander-under-temperature` = "bander-under-temperature".asInstanceOf[`bander-under-temperature`]
  @scala.inline
  def `bander-unrecoverable-failure`: `bander-unrecoverable-failure` = "bander-unrecoverable-failure".asInstanceOf[`bander-unrecoverable-failure`]
  @scala.inline
  def `bander-unrecoverable-storage-error`: `bander-unrecoverable-storage-error` = "bander-unrecoverable-storage-error".asInstanceOf[`bander-unrecoverable-storage-error`]
  @scala.inline
  def `bander-warming-up`: `bander-warming-up` = "bander-warming-up".asInstanceOf[`bander-warming-up`]
  @scala.inline
  def barion: barion = "barion".asInstanceOf[barion]
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def beshare: beshare = "beshare".asInstanceOf[beshare]
  @scala.inline
  def `best-fit`: `best-fit` = "best-fit".asInstanceOf[`best-fit`]
  @scala.inline
  def `best-quality`: `best-quality` = "best-quality".asInstanceOf[`best-quality`]
  @scala.inline
  def `best-speed`: `best-speed` = "best-speed".asInstanceOf[`best-speed`]
  @scala.inline
  def `bi-level`: `bi-level` = "bi-level".asInstanceOf[`bi-level`]
  @scala.inline
  def big5: big5 = "big5".asInstanceOf[big5]
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  @scala.inline
  def `bind-bottom`: `bind-bottom` = "bind-bottom".asInstanceOf[`bind-bottom`]
  @scala.inline
  def `bind-left`: `bind-left` = "bind-left".asInstanceOf[`bind-left`]
  @scala.inline
  def `bind-right`: `bind-right` = "bind-right".asInstanceOf[`bind-right`]
  @scala.inline
  def `bind-top`: `bind-top` = "bind-top".asInstanceOf[`bind-top`]
  @scala.inline
  def `binder-added`: `binder-added` = "binder-added".asInstanceOf[`binder-added`]
  @scala.inline
  def `binder-almost-empty`: `binder-almost-empty` = "binder-almost-empty".asInstanceOf[`binder-almost-empty`]
  @scala.inline
  def `binder-almost-full`: `binder-almost-full` = "binder-almost-full".asInstanceOf[`binder-almost-full`]
  @scala.inline
  def `binder-at-limit`: `binder-at-limit` = "binder-at-limit".asInstanceOf[`binder-at-limit`]
  @scala.inline
  def `binder-closed`: `binder-closed` = "binder-closed".asInstanceOf[`binder-closed`]
  @scala.inline
  def `binder-configuration-change`: `binder-configuration-change` = "binder-configuration-change".asInstanceOf[`binder-configuration-change`]
  @scala.inline
  def `binder-cover-closed`: `binder-cover-closed` = "binder-cover-closed".asInstanceOf[`binder-cover-closed`]
  @scala.inline
  def `binder-cover-open`: `binder-cover-open` = "binder-cover-open".asInstanceOf[`binder-cover-open`]
  @scala.inline
  def `binder-empty`: `binder-empty` = "binder-empty".asInstanceOf[`binder-empty`]
  @scala.inline
  def `binder-full`: `binder-full` = "binder-full".asInstanceOf[`binder-full`]
  @scala.inline
  def `binder-interlock-closed`: `binder-interlock-closed` = "binder-interlock-closed".asInstanceOf[`binder-interlock-closed`]
  @scala.inline
  def `binder-interlock-open`: `binder-interlock-open` = "binder-interlock-open".asInstanceOf[`binder-interlock-open`]
  @scala.inline
  def `binder-jam`: `binder-jam` = "binder-jam".asInstanceOf[`binder-jam`]
  @scala.inline
  def `binder-life-almost-over`: `binder-life-almost-over` = "binder-life-almost-over".asInstanceOf[`binder-life-almost-over`]
  @scala.inline
  def `binder-life-over`: `binder-life-over` = "binder-life-over".asInstanceOf[`binder-life-over`]
  @scala.inline
  def `binder-memory-exhausted`: `binder-memory-exhausted` = "binder-memory-exhausted".asInstanceOf[`binder-memory-exhausted`]
  @scala.inline
  def `binder-missing`: `binder-missing` = "binder-missing".asInstanceOf[`binder-missing`]
  @scala.inline
  def `binder-motor-failure`: `binder-motor-failure` = "binder-motor-failure".asInstanceOf[`binder-motor-failure`]
  @scala.inline
  def `binder-near-limit`: `binder-near-limit` = "binder-near-limit".asInstanceOf[`binder-near-limit`]
  @scala.inline
  def `binder-offline`: `binder-offline` = "binder-offline".asInstanceOf[`binder-offline`]
  @scala.inline
  def `binder-opened`: `binder-opened` = "binder-opened".asInstanceOf[`binder-opened`]
  @scala.inline
  def `binder-over-temperature`: `binder-over-temperature` = "binder-over-temperature".asInstanceOf[`binder-over-temperature`]
  @scala.inline
  def `binder-power-saver`: `binder-power-saver` = "binder-power-saver".asInstanceOf[`binder-power-saver`]
  @scala.inline
  def `binder-recoverable-failure`: `binder-recoverable-failure` = "binder-recoverable-failure".asInstanceOf[`binder-recoverable-failure`]
  @scala.inline
  def `binder-recoverable-storage-error`: `binder-recoverable-storage-error` = "binder-recoverable-storage-error".asInstanceOf[`binder-recoverable-storage-error`]
  @scala.inline
  def `binder-removed`: `binder-removed` = "binder-removed".asInstanceOf[`binder-removed`]
  @scala.inline
  def `binder-resource-added`: `binder-resource-added` = "binder-resource-added".asInstanceOf[`binder-resource-added`]
  @scala.inline
  def `binder-resource-removed`: `binder-resource-removed` = "binder-resource-removed".asInstanceOf[`binder-resource-removed`]
  @scala.inline
  def `binder-thermistor-failure`: `binder-thermistor-failure` = "binder-thermistor-failure".asInstanceOf[`binder-thermistor-failure`]
  @scala.inline
  def `binder-timing-failure`: `binder-timing-failure` = "binder-timing-failure".asInstanceOf[`binder-timing-failure`]
  @scala.inline
  def `binder-turned-off`: `binder-turned-off` = "binder-turned-off".asInstanceOf[`binder-turned-off`]
  @scala.inline
  def `binder-turned-on`: `binder-turned-on` = "binder-turned-on".asInstanceOf[`binder-turned-on`]
  @scala.inline
  def `binder-under-temperature`: `binder-under-temperature` = "binder-under-temperature".asInstanceOf[`binder-under-temperature`]
  @scala.inline
  def `binder-unrecoverable-failure`: `binder-unrecoverable-failure` = "binder-unrecoverable-failure".asInstanceOf[`binder-unrecoverable-failure`]
  @scala.inline
  def `binder-unrecoverable-storage-error`: `binder-unrecoverable-storage-error` = "binder-unrecoverable-storage-error".asInstanceOf[`binder-unrecoverable-storage-error`]
  @scala.inline
  def `binder-warming-up`: `binder-warming-up` = "binder-warming-up".asInstanceOf[`binder-warming-up`]
  @scala.inline
  def binding: binding = "binding".asInstanceOf[binding]
  @scala.inline
  def `binding-reference-edge-supported`: `binding-reference-edge-supported` = "binding-reference-edge-supported".asInstanceOf[`binding-reference-edge-supported`]
  @scala.inline
  def `binding-type-supported`: `binding-type-supported` = "binding-type-supported".asInstanceOf[`binding-type-supported`]
  @scala.inline
  def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  @scala.inline
  def bitcoincash: bitcoincash = "bitcoincash".asInstanceOf[bitcoincash]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def `black-and-white-negative-film`: `black-and-white-negative-film` = "black-and-white-negative-film".asInstanceOf[`black-and-white-negative-film`]
  @scala.inline
  def black_1: black_1 = "black_1".asInstanceOf[black_1]
  @scala.inline
  def black_16: black_16 = "black_16".asInstanceOf[black_16]
  @scala.inline
  def black_8: black_8 = "black_8".asInstanceOf[black_8]
  @scala.inline
  def blank: blank = "blank".asInstanceOf[blank]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  @scala.inline
  def bolo: bolo = "bolo".asInstanceOf[bolo]
  @scala.inline
  def `booklet-maker`: `booklet-maker` = "booklet-maker".asInstanceOf[`booklet-maker`]
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def `both-sheets`: `both-sheets` = "both-sheets".asInstanceOf[`both-sheets`]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def brim: brim = "brim".asInstanceOf[brim]
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  @scala.inline
  def browserext: browserext = "browserext".asInstanceOf[browserext]
  @scala.inline
  def buff: buff = "buff".asInstanceOf[buff]
  @scala.inline
  def `bxsynchro-translucent`: `bxsynchro-translucent` = "bxsynchro-translucent".asInstanceOf[`bxsynchro-translucent`]
  @scala.inline
  def `bxsynchro-transparent`: `bxsynchro-transparent` = "bxsynchro-transparent".asInstanceOf[`bxsynchro-transparent`]
  @scala.inline
  def `bxsynchro-white`: `bxsynchro-white` = "bxsynchro-white".asInstanceOf[`bxsynchro-white`]
  @scala.inline
  def `by-pass-tray`: `by-pass-tray` = "by-pass-tray".asInstanceOf[`by-pass-tray`]
  @scala.inline
  def c: c = "c".asInstanceOf[c]
  @scala.inline
  def `c-translucent`: `c-translucent` = "c-translucent".asInstanceOf[`c-translucent`]
  @scala.inline
  def `c-transparent`: `c-transparent` = "c-transparent".asInstanceOf[`c-transparent`]
  @scala.inline
  def `c-white`: `c-white` = "c-white".asInstanceOf[`c-white`]
  @scala.inline
  def calculator: calculator = "calculator".asInstanceOf[calculator]
  @scala.inline
  def calendared: calendared = "calendared".asInstanceOf[calendared]
  @scala.inline
  def callto: callto = "callto".asInstanceOf[callto]
  @scala.inline
  def `cancel-job_`: `cancel-job_` = "cancel-job".asInstanceOf[`cancel-job_`]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def `canceled-at-device`: `canceled-at-device` = "canceled-at-device".asInstanceOf[`canceled-at-device`]
  @scala.inline
  def `canceled-by-operator`: `canceled-by-operator` = "canceled-by-operator".asInstanceOf[`canceled-by-operator`]
  @scala.inline
  def `canceled-by-user`: `canceled-by-user` = "canceled-by-user".asInstanceOf[`canceled-by-user`]
  @scala.inline
  def cap: cap = "cap".asInstanceOf[cap]
  @scala.inline
  def cardboard: cardboard = "cardboard".asInstanceOf[cardboard]
  @scala.inline
  def cardstock: cardstock = "cardstock".asInstanceOf[cardstock]
  @scala.inline
  def cast: cast = "cast".asInstanceOf[cast]
  @scala.inline
  def casts: casts = "casts".asInstanceOf[casts]
  @scala.inline
  def cd: cd = "cd".asInstanceOf[cd]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def certificate: certificate = "certificate".asInstanceOf[certificate]
  @scala.inline
  def `chamber-humidity`: `chamber-humidity` = "chamber-humidity".asInstanceOf[`chamber-humidity`]
  @scala.inline
  def `chamber-humidity-actual`: `chamber-humidity-actual` = "chamber-humidity-actual".asInstanceOf[`chamber-humidity-actual`]
  @scala.inline
  def `chamber-humidity-default`: `chamber-humidity-default` = "chamber-humidity-default".asInstanceOf[`chamber-humidity-default`]
  @scala.inline
  def `chamber-humidity-supported`: `chamber-humidity-supported` = "chamber-humidity-supported".asInstanceOf[`chamber-humidity-supported`]
  @scala.inline
  def `chamber-temperature`: `chamber-temperature` = "chamber-temperature".asInstanceOf[`chamber-temperature`]
  @scala.inline
  def `chamber-temperature-actual`: `chamber-temperature-actual` = "chamber-temperature-actual".asInstanceOf[`chamber-temperature-actual`]
  @scala.inline
  def `chamber-temperature-default`: `chamber-temperature-default` = "chamber-temperature-default".asInstanceOf[`chamber-temperature-default`]
  @scala.inline
  def `chamber-temperature-supported`: `chamber-temperature-supported` = "chamber-temperature-supported".asInstanceOf[`chamber-temperature-supported`]
  @scala.inline
  def `charset-configured`: `charset-configured` = "charset-configured".asInstanceOf[`charset-configured`]
  @scala.inline
  def `charset-supported`: `charset-supported` = "charset-supported".asInstanceOf[`charset-supported`]
  @scala.inline
  def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  @scala.inline
  def choice_iso_a4_210x297mm_na_letter_8Dot5x11in: choice_iso_a4_210x297mm_na_letter_8Dot5x11in = "choice_iso_a4_210x297mm_na_letter_8.5x11in".asInstanceOf[choice_iso_a4_210x297mm_na_letter_8Dot5x11in]
  @scala.inline
  def chrome: chrome = "chrome".asInstanceOf[chrome]
  @scala.inline
  def `chrome-extension`: `chrome-extension` = "chrome-extension".asInstanceOf[`chrome-extension`]
  @scala.inline
  def cid: cid = "cid".asInstanceOf[cid]
  @scala.inline
  def `cleaner-life-almost-over`: `cleaner-life-almost-over` = "cleaner-life-almost-over".asInstanceOf[`cleaner-life-almost-over`]
  @scala.inline
  def `cleaner-life-over`: `cleaner-life-over` = "cleaner-life-over".asInstanceOf[`cleaner-life-over`]
  @scala.inline
  def `clear-black`: `clear-black` = "clear-black".asInstanceOf[`clear-black`]
  @scala.inline
  def `clear-blue`: `clear-blue` = "clear-blue".asInstanceOf[`clear-blue`]
  @scala.inline
  def `clear-brown`: `clear-brown` = "clear-brown".asInstanceOf[`clear-brown`]
  @scala.inline
  def `clear-buff`: `clear-buff` = "clear-buff".asInstanceOf[`clear-buff`]
  @scala.inline
  def `clear-cyan`: `clear-cyan` = "clear-cyan".asInstanceOf[`clear-cyan`]
  @scala.inline
  def `clear-gold`: `clear-gold` = "clear-gold".asInstanceOf[`clear-gold`]
  @scala.inline
  def `clear-goldenrod`: `clear-goldenrod` = "clear-goldenrod".asInstanceOf[`clear-goldenrod`]
  @scala.inline
  def `clear-gray`: `clear-gray` = "clear-gray".asInstanceOf[`clear-gray`]
  @scala.inline
  def `clear-green`: `clear-green` = "clear-green".asInstanceOf[`clear-green`]
  @scala.inline
  def `clear-ivory`: `clear-ivory` = "clear-ivory".asInstanceOf[`clear-ivory`]
  @scala.inline
  def `clear-magenta`: `clear-magenta` = "clear-magenta".asInstanceOf[`clear-magenta`]
  @scala.inline
  def `clear-multi-color`: `clear-multi-color` = "clear-multi-color".asInstanceOf[`clear-multi-color`]
  @scala.inline
  def `clear-mustard`: `clear-mustard` = "clear-mustard".asInstanceOf[`clear-mustard`]
  @scala.inline
  def `clear-orange`: `clear-orange` = "clear-orange".asInstanceOf[`clear-orange`]
  @scala.inline
  def `clear-pink`: `clear-pink` = "clear-pink".asInstanceOf[`clear-pink`]
  @scala.inline
  def `clear-red`: `clear-red` = "clear-red".asInstanceOf[`clear-red`]
  @scala.inline
  def `clear-silver`: `clear-silver` = "clear-silver".asInstanceOf[`clear-silver`]
  @scala.inline
  def `clear-turquoise`: `clear-turquoise` = "clear-turquoise".asInstanceOf[`clear-turquoise`]
  @scala.inline
  def `clear-violet`: `clear-violet` = "clear-violet".asInstanceOf[`clear-violet`]
  @scala.inline
  def `clear-white`: `clear-white` = "clear-white".asInstanceOf[`clear-white`]
  @scala.inline
  def `clear-yellow`: `clear-yellow` = "clear-yellow".asInstanceOf[`clear-yellow`]
  @scala.inline
  def `client-error-account-authorization-failed`: `client-error-account-authorization-failed` = "client-error-account-authorization-failed".asInstanceOf[`client-error-account-authorization-failed`]
  @scala.inline
  def `client-error-account-closed`: `client-error-account-closed` = "client-error-account-closed".asInstanceOf[`client-error-account-closed`]
  @scala.inline
  def `client-error-account-info-needed`: `client-error-account-info-needed` = "client-error-account-info-needed".asInstanceOf[`client-error-account-info-needed`]
  @scala.inline
  def `client-error-account-limit-reached`: `client-error-account-limit-reached` = "client-error-account-limit-reached".asInstanceOf[`client-error-account-limit-reached`]
  @scala.inline
  def `client-error-attributes-not-settable`: `client-error-attributes-not-settable` = "client-error-attributes-not-settable".asInstanceOf[`client-error-attributes-not-settable`]
  @scala.inline
  def `client-error-attributes-or-values-not-supported`: `client-error-attributes-or-values-not-supported` = "client-error-attributes-or-values-not-supported".asInstanceOf[`client-error-attributes-or-values-not-supported`]
  @scala.inline
  def `client-error-bad-request`: `client-error-bad-request` = "client-error-bad-request".asInstanceOf[`client-error-bad-request`]
  @scala.inline
  def `client-error-charset-not-supported`: `client-error-charset-not-supported` = "client-error-charset-not-supported".asInstanceOf[`client-error-charset-not-supported`]
  @scala.inline
  def `client-error-compression-error`: `client-error-compression-error` = "client-error-compression-error".asInstanceOf[`client-error-compression-error`]
  @scala.inline
  def `client-error-compression-not-supported`: `client-error-compression-not-supported` = "client-error-compression-not-supported".asInstanceOf[`client-error-compression-not-supported`]
  @scala.inline
  def `client-error-conflicting-attributes`: `client-error-conflicting-attributes` = "client-error-conflicting-attributes".asInstanceOf[`client-error-conflicting-attributes`]
  @scala.inline
  def `client-error-document-access-error`: `client-error-document-access-error` = "client-error-document-access-error".asInstanceOf[`client-error-document-access-error`]
  @scala.inline
  def `client-error-document-format-error`: `client-error-document-format-error` = "client-error-document-format-error".asInstanceOf[`client-error-document-format-error`]
  @scala.inline
  def `client-error-document-format-not-supported`: `client-error-document-format-not-supported` = "client-error-document-format-not-supported".asInstanceOf[`client-error-document-format-not-supported`]
  @scala.inline
  def `client-error-document-password-error`: `client-error-document-password-error` = "client-error-document-password-error".asInstanceOf[`client-error-document-password-error`]
  @scala.inline
  def `client-error-document-permission-error`: `client-error-document-permission-error` = "client-error-document-permission-error".asInstanceOf[`client-error-document-permission-error`]
  @scala.inline
  def `client-error-document-security-error`: `client-error-document-security-error` = "client-error-document-security-error".asInstanceOf[`client-error-document-security-error`]
  @scala.inline
  def `client-error-document-unprintable-error`: `client-error-document-unprintable-error` = "client-error-document-unprintable-error".asInstanceOf[`client-error-document-unprintable-error`]
  @scala.inline
  def `client-error-forbidden`: `client-error-forbidden` = "client-error-forbidden".asInstanceOf[`client-error-forbidden`]
  @scala.inline
  def `client-error-gone`: `client-error-gone` = "client-error-gone".asInstanceOf[`client-error-gone`]
  @scala.inline
  def `client-error-ignored-all-subscriptions`: `client-error-ignored-all-subscriptions` = "client-error-ignored-all-subscriptions".asInstanceOf[`client-error-ignored-all-subscriptions`]
  @scala.inline
  def `client-error-not-authenticated`: `client-error-not-authenticated` = "client-error-not-authenticated".asInstanceOf[`client-error-not-authenticated`]
  @scala.inline
  def `client-error-not-authorized`: `client-error-not-authorized` = "client-error-not-authorized".asInstanceOf[`client-error-not-authorized`]
  @scala.inline
  def `client-error-not-fetchable`: `client-error-not-fetchable` = "client-error-not-fetchable".asInstanceOf[`client-error-not-fetchable`]
  @scala.inline
  def `client-error-not-found`: `client-error-not-found` = "client-error-not-found".asInstanceOf[`client-error-not-found`]
  @scala.inline
  def `client-error-not-possible`: `client-error-not-possible` = "client-error-not-possible".asInstanceOf[`client-error-not-possible`]
  @scala.inline
  def `client-error-request-entity-too-large`: `client-error-request-entity-too-large` = "client-error-request-entity-too-large".asInstanceOf[`client-error-request-entity-too-large`]
  @scala.inline
  def `client-error-request-value-too-long`: `client-error-request-value-too-long` = "client-error-request-value-too-long".asInstanceOf[`client-error-request-value-too-long`]
  @scala.inline
  def `client-error-timeout`: `client-error-timeout` = "client-error-timeout".asInstanceOf[`client-error-timeout`]
  @scala.inline
  def `client-error-too-many-subscriptions`: `client-error-too-many-subscriptions` = "client-error-too-many-subscriptions".asInstanceOf[`client-error-too-many-subscriptions`]
  @scala.inline
  def `client-error-uri-scheme-not-supported`: `client-error-uri-scheme-not-supported` = "client-error-uri-scheme-not-supported".asInstanceOf[`client-error-uri-scheme-not-supported`]
  @scala.inline
  def cmyk: cmyk = "cmyk".asInstanceOf[cmyk]
  @scala.inline
  def cmyk_16: cmyk_16 = "cmyk_16".asInstanceOf[cmyk_16]
  @scala.inline
  def cmyk_8: cmyk_8 = "cmyk_8".asInstanceOf[cmyk_8]
  @scala.inline
  def coap: coap = "coap".asInstanceOf[coap]
  @scala.inline
  def coapPlussigntcp: coapPlussigntcp = "coap+tcp".asInstanceOf[coapPlussigntcp]
  @scala.inline
  def coapPlussignws: coapPlussignws = "coap+ws".asInstanceOf[coapPlussignws]
  @scala.inline
  def coaps: coaps = "coaps".asInstanceOf[coaps]
  @scala.inline
  def coapsPlussigntcp: coapsPlussigntcp = "coaps+tcp".asInstanceOf[coapsPlussigntcp]
  @scala.inline
  def coapsPlussignws: coapsPlussignws = "coaps+ws".asInstanceOf[coapsPlussignws]
  @scala.inline
  def coarse: coarse = "coarse".asInstanceOf[coarse]
  @scala.inline
  def coat: coat = "coat".asInstanceOf[coat]
  @scala.inline
  def coating: coating = "coating".asInstanceOf[coating]
  @scala.inline
  def `coating-sides-supported`: `coating-sides-supported` = "coating-sides-supported".asInstanceOf[`coating-sides-supported`]
  @scala.inline
  def `coating-type-supported`: `coating-type-supported` = "coating-type-supported".asInstanceOf[`coating-type-supported`]
  @scala.inline
  def collated: collated = "collated".asInstanceOf[collated]
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  @scala.inline
  def `color-negative-film`: `color-negative-film` = "color-negative-film".asInstanceOf[`color-negative-film`]
  @scala.inline
  def `color-slide-film`: `color-slide-film` = "color-slide-film".asInstanceOf[`color-slide-film`]
  @scala.inline
  def `color-supported`: `color-supported` = "color-supported".asInstanceOf[`color-supported`]
  @scala.inline
  def color_8: color_8 = "color_8".asInstanceOf[color_8]
  @scala.inline
  def `com-eventbrite-attendee`: `com-eventbrite-attendee` = "com-eventbrite-attendee".asInstanceOf[`com-eventbrite-attendee`]
  @scala.inline
  def comb: comb = "comb".asInstanceOf[comb]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  @scala.inline
  def `completed-successfully`: `completed-successfully` = "completed-successfully".asInstanceOf[`completed-successfully`]
  @scala.inline
  def `completed-with-errors`: `completed-with-errors` = "completed-with-errors".asInstanceOf[`completed-with-errors`]
  @scala.inline
  def `completed-with-warnings`: `completed-with-warnings` = "completed-with-warnings".asInstanceOf[`completed-with-warnings`]
  @scala.inline
  def compress: compress = "compress".asInstanceOf[compress]
  @scala.inline
  def `compression-error`: `compression-error` = "compression-error".asInstanceOf[`compression-error`]
  @scala.inline
  def `compression-supplied`: `compression-supplied` = "compression-supplied".asInstanceOf[`compression-supplied`]
  @scala.inline
  def `compression-supported`: `compression-supported` = "compression-supported".asInstanceOf[`compression-supported`]
  @scala.inline
  def `configuration-change`: `configuration-change` = "configuration-change".asInstanceOf[`configuration-change`]
  @scala.inline
  def `confirmation-sheet-print`: `confirmation-sheet-print` = "confirmation-sheet-print".asInstanceOf[`confirmation-sheet-print`]
  @scala.inline
  def `confirmation-sheet-print-default`: `confirmation-sheet-print-default` = "confirmation-sheet-print-default".asInstanceOf[`confirmation-sheet-print-default`]
  @scala.inline
  def `connecting-to-device`: `connecting-to-device` = "connecting-to-device".asInstanceOf[`connecting-to-device`]
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  @scala.inline
  def conti: conti = "conti".asInstanceOf[conti]
  @scala.inline
  def `continue-job`: `continue-job` = "continue-job".asInstanceOf[`continue-job`]
  @scala.inline
  def continuous: continuous = "continuous".asInstanceOf[continuous]
  @scala.inline
  def `continuous-long`: `continuous-long` = "continuous-long".asInstanceOf[`continuous-long`]
  @scala.inline
  def `continuous-short`: `continuous-short` = "continuous-short".asInstanceOf[`continuous-short`]
  @scala.inline
  def copies: copies = "copies".asInstanceOf[copies]
  @scala.inline
  def `copies-actual`: `copies-actual` = "copies-actual".asInstanceOf[`copies-actual`]
  @scala.inline
  def `copies-default`: `copies-default` = "copies-default".asInstanceOf[`copies-default`]
  @scala.inline
  def `copies-supported`: `copies-supported` = "copies-supported".asInstanceOf[`copies-supported`]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def `corrugated-board`: `corrugated-board` = "corrugated-board".asInstanceOf[`corrugated-board`]
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  @scala.inline
  def `cover-back`: `cover-back` = "cover-back".asInstanceOf[`cover-back`]
  @scala.inline
  def `cover-back-actual`: `cover-back-actual` = "cover-back-actual".asInstanceOf[`cover-back-actual`]
  @scala.inline
  def `cover-back-default`: `cover-back-default` = "cover-back-default".asInstanceOf[`cover-back-default`]
  @scala.inline
  def `cover-back-supported`: `cover-back-supported` = "cover-back-supported".asInstanceOf[`cover-back-supported`]
  @scala.inline
  def `cover-front`: `cover-front` = "cover-front".asInstanceOf[`cover-front`]
  @scala.inline
  def `cover-front-actual`: `cover-front-actual` = "cover-front-actual".asInstanceOf[`cover-front-actual`]
  @scala.inline
  def `cover-front-default`: `cover-front-default` = "cover-front-default".asInstanceOf[`cover-front-default`]
  @scala.inline
  def `cover-front-supported`: `cover-front-supported` = "cover-front-supported".asInstanceOf[`cover-front-supported`]
  @scala.inline
  def `cover-open`: `cover-open` = "cover-open".asInstanceOf[`cover-open`]
  @scala.inline
  def `cover-sheet-info`: `cover-sheet-info` = "cover-sheet-info".asInstanceOf[`cover-sheet-info`]
  @scala.inline
  def `cover-sheet-info-default`: `cover-sheet-info-default` = "cover-sheet-info-default".asInstanceOf[`cover-sheet-info-default`]
  @scala.inline
  def `cover-sheet-info-supported`: `cover-sheet-info-supported` = "cover-sheet-info-supported".asInstanceOf[`cover-sheet-info-supported`]
  @scala.inline
  def covering: covering = "covering".asInstanceOf[covering]
  @scala.inline
  def `covering-name-supported`: `covering-name-supported` = "covering-name-supported".asInstanceOf[`covering-name-supported`]
  @scala.inline
  def cp866: cp866 = "cp866".asInstanceOf[cp866]
  @scala.inline
  def crid: crid = "crid".asInstanceOf[crid]
  @scala.inline
  def crimp: crimp = "crimp".asInstanceOf[crimp]
  @scala.inline
  def csISO2022JP: csISO2022JP = "csISO2022JP".asInstanceOf[csISO2022JP]
  @scala.inline
  def cvs: cvs = "cvs".asInstanceOf[cvs]
  @scala.inline
  def `cxsynchro-translucent`: `cxsynchro-translucent` = "cxsynchro-translucent".asInstanceOf[`cxsynchro-translucent`]
  @scala.inline
  def `cxsynchro-transparent`: `cxsynchro-transparent` = "cxsynchro-transparent".asInstanceOf[`cxsynchro-transparent`]
  @scala.inline
  def `cxsynchro-white`: `cxsynchro-white` = "cxsynchro-white".asInstanceOf[`cxsynchro-white`]
  @scala.inline
  def cyan: cyan = "cyan".asInstanceOf[cyan]
  @scala.inline
  def d: d = "d".asInstanceOf[d]
  @scala.inline
  def `d-translucent`: `d-translucent` = "d-translucent".asInstanceOf[`d-translucent`]
  @scala.inline
  def `d-transparent`: `d-transparent` = "d-transparent".asInstanceOf[`d-transparent`]
  @scala.inline
  def `d-white`: `d-white` = "d-white".asInstanceOf[`d-white`]
  @scala.inline
  def dab: dab = "dab".asInstanceOf[dab]
  @scala.inline
  def `dark-blue`: `dark-blue` = "dark-blue".asInstanceOf[`dark-blue`]
  @scala.inline
  def `dark-brown`: `dark-brown` = "dark-brown".asInstanceOf[`dark-brown`]
  @scala.inline
  def `dark-buff`: `dark-buff` = "dark-buff".asInstanceOf[`dark-buff`]
  @scala.inline
  def `dark-cyan`: `dark-cyan` = "dark-cyan".asInstanceOf[`dark-cyan`]
  @scala.inline
  def `dark-gold`: `dark-gold` = "dark-gold".asInstanceOf[`dark-gold`]
  @scala.inline
  def `dark-goldenrod`: `dark-goldenrod` = "dark-goldenrod".asInstanceOf[`dark-goldenrod`]
  @scala.inline
  def `dark-gray`: `dark-gray` = "dark-gray".asInstanceOf[`dark-gray`]
  @scala.inline
  def `dark-green`: `dark-green` = "dark-green".asInstanceOf[`dark-green`]
  @scala.inline
  def `dark-ivory`: `dark-ivory` = "dark-ivory".asInstanceOf[`dark-ivory`]
  @scala.inline
  def `dark-magenta`: `dark-magenta` = "dark-magenta".asInstanceOf[`dark-magenta`]
  @scala.inline
  def `dark-mustard`: `dark-mustard` = "dark-mustard".asInstanceOf[`dark-mustard`]
  @scala.inline
  def `dark-orange`: `dark-orange` = "dark-orange".asInstanceOf[`dark-orange`]
  @scala.inline
  def `dark-pink`: `dark-pink` = "dark-pink".asInstanceOf[`dark-pink`]
  @scala.inline
  def `dark-red`: `dark-red` = "dark-red".asInstanceOf[`dark-red`]
  @scala.inline
  def `dark-silver`: `dark-silver` = "dark-silver".asInstanceOf[`dark-silver`]
  @scala.inline
  def `dark-turquoise`: `dark-turquoise` = "dark-turquoise".asInstanceOf[`dark-turquoise`]
  @scala.inline
  def `dark-violet`: `dark-violet` = "dark-violet".asInstanceOf[`dark-violet`]
  @scala.inline
  def `dark-yellow`: `dark-yellow` = "dark-yellow".asInstanceOf[`dark-yellow`]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def `data-insufficient`: `data-insufficient` = "data-insufficient".asInstanceOf[`data-insufficient`]
  @scala.inline
  def `date-time-at-completed`: `date-time-at-completed` = "date-time-at-completed".asInstanceOf[`date-time-at-completed`]
  @scala.inline
  def `date-time-at-creation`: `date-time-at-creation` = "date-time-at-creation".asInstanceOf[`date-time-at-creation`]
  @scala.inline
  def `date-time-at-processing`: `date-time-at-processing` = "date-time-at-processing".asInstanceOf[`date-time-at-processing`]
  @scala.inline
  def dav: dav = "dav".asInstanceOf[dav]
  @scala.inline
  def `day-time`: `day-time` = "day-time".asInstanceOf[`day-time`]
  @scala.inline
  def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  @scala.inline
  def deep: deep = "deep".asInstanceOf[deep]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def `destination-accesses-supported`: `destination-accesses-supported` = "destination-accesses-supported".asInstanceOf[`destination-accesses-supported`]
  @scala.inline
  def `destination-statuses`: `destination-statuses` = "destination-statuses".asInstanceOf[`destination-statuses`]
  @scala.inline
  def `destination-uri-ready`: `destination-uri-ready` = "destination-uri-ready".asInstanceOf[`destination-uri-ready`]
  @scala.inline
  def `destination-uri-schemes-supported`: `destination-uri-schemes-supported` = "destination-uri-schemes-supported".asInstanceOf[`destination-uri-schemes-supported`]
  @scala.inline
  def `destination-uris`: `destination-uris` = "destination-uris".asInstanceOf[`destination-uris`]
  @scala.inline
  def `destination-uris-supported`: `destination-uris-supported` = "destination-uris-supported".asInstanceOf[`destination-uris-supported`]
  @scala.inline
  def `developer-empty`: `developer-empty` = "developer-empty".asInstanceOf[`developer-empty`]
  @scala.inline
  def `developer-low`: `developer-low` = "developer-low".asInstanceOf[`developer-low`]
  @scala.inline
  def device10_16: device10_16 = "device10_16".asInstanceOf[device10_16]
  @scala.inline
  def device10_8: device10_8 = "device10_8".asInstanceOf[device10_8]
  @scala.inline
  def device11_16: device11_16 = "device11_16".asInstanceOf[device11_16]
  @scala.inline
  def device11_8: device11_8 = "device11_8".asInstanceOf[device11_8]
  @scala.inline
  def device12_16: device12_16 = "device12_16".asInstanceOf[device12_16]
  @scala.inline
  def device12_8: device12_8 = "device12_8".asInstanceOf[device12_8]
  @scala.inline
  def device13_16: device13_16 = "device13_16".asInstanceOf[device13_16]
  @scala.inline
  def device13_8: device13_8 = "device13_8".asInstanceOf[device13_8]
  @scala.inline
  def device14_16: device14_16 = "device14_16".asInstanceOf[device14_16]
  @scala.inline
  def device14_8: device14_8 = "device14_8".asInstanceOf[device14_8]
  @scala.inline
  def device15_16: device15_16 = "device15_16".asInstanceOf[device15_16]
  @scala.inline
  def device15_8: device15_8 = "device15_8".asInstanceOf[device15_8]
  @scala.inline
  def device1_16: device1_16 = "device1_16".asInstanceOf[device1_16]
  @scala.inline
  def device1_8: device1_8 = "device1_8".asInstanceOf[device1_8]
  @scala.inline
  def device2_16: device2_16 = "device2_16".asInstanceOf[device2_16]
  @scala.inline
  def device2_8: device2_8 = "device2_8".asInstanceOf[device2_8]
  @scala.inline
  def device3_16: device3_16 = "device3_16".asInstanceOf[device3_16]
  @scala.inline
  def device3_8: device3_8 = "device3_8".asInstanceOf[device3_8]
  @scala.inline
  def device4_16: device4_16 = "device4_16".asInstanceOf[device4_16]
  @scala.inline
  def device4_8: device4_8 = "device4_8".asInstanceOf[device4_8]
  @scala.inline
  def device5_16: device5_16 = "device5_16".asInstanceOf[device5_16]
  @scala.inline
  def device5_8: device5_8 = "device5_8".asInstanceOf[device5_8]
  @scala.inline
  def device6_16: device6_16 = "device6_16".asInstanceOf[device6_16]
  @scala.inline
  def device6_8: device6_8 = "device6_8".asInstanceOf[device6_8]
  @scala.inline
  def device7_16: device7_16 = "device7_16".asInstanceOf[device7_16]
  @scala.inline
  def device7_8: device7_8 = "device7_8".asInstanceOf[device7_8]
  @scala.inline
  def device8_16: device8_16 = "device8_16".asInstanceOf[device8_16]
  @scala.inline
  def device8_8: device8_8 = "device8_8".asInstanceOf[device8_8]
  @scala.inline
  def device9_16: device9_16 = "device9_16".asInstanceOf[device9_16]
  @scala.inline
  def device9_8: device9_8 = "device9_8".asInstanceOf[device9_8]
  @scala.inline
  def dhcp: dhcp = "dhcp".asInstanceOf[dhcp]
  @scala.inline
  def diaspora: diaspora = "diaspora".asInstanceOf[diaspora]
  @scala.inline
  def dict: dict = "dict".asInstanceOf[dict]
  @scala.inline
  def did: did = "did".asInstanceOf[did]
  @scala.inline
  def `die-cutter-added`: `die-cutter-added` = "die-cutter-added".asInstanceOf[`die-cutter-added`]
  @scala.inline
  def `die-cutter-almost-empty`: `die-cutter-almost-empty` = "die-cutter-almost-empty".asInstanceOf[`die-cutter-almost-empty`]
  @scala.inline
  def `die-cutter-almost-full`: `die-cutter-almost-full` = "die-cutter-almost-full".asInstanceOf[`die-cutter-almost-full`]
  @scala.inline
  def `die-cutter-at-limit`: `die-cutter-at-limit` = "die-cutter-at-limit".asInstanceOf[`die-cutter-at-limit`]
  @scala.inline
  def `die-cutter-closed`: `die-cutter-closed` = "die-cutter-closed".asInstanceOf[`die-cutter-closed`]
  @scala.inline
  def `die-cutter-configuration-change`: `die-cutter-configuration-change` = "die-cutter-configuration-change".asInstanceOf[`die-cutter-configuration-change`]
  @scala.inline
  def `die-cutter-cover-closed`: `die-cutter-cover-closed` = "die-cutter-cover-closed".asInstanceOf[`die-cutter-cover-closed`]
  @scala.inline
  def `die-cutter-cover-open`: `die-cutter-cover-open` = "die-cutter-cover-open".asInstanceOf[`die-cutter-cover-open`]
  @scala.inline
  def `die-cutter-empty`: `die-cutter-empty` = "die-cutter-empty".asInstanceOf[`die-cutter-empty`]
  @scala.inline
  def `die-cutter-full`: `die-cutter-full` = "die-cutter-full".asInstanceOf[`die-cutter-full`]
  @scala.inline
  def `die-cutter-interlock-closed`: `die-cutter-interlock-closed` = "die-cutter-interlock-closed".asInstanceOf[`die-cutter-interlock-closed`]
  @scala.inline
  def `die-cutter-interlock-open`: `die-cutter-interlock-open` = "die-cutter-interlock-open".asInstanceOf[`die-cutter-interlock-open`]
  @scala.inline
  def `die-cutter-jam`: `die-cutter-jam` = "die-cutter-jam".asInstanceOf[`die-cutter-jam`]
  @scala.inline
  def `die-cutter-life-almost-over`: `die-cutter-life-almost-over` = "die-cutter-life-almost-over".asInstanceOf[`die-cutter-life-almost-over`]
  @scala.inline
  def `die-cutter-life-over`: `die-cutter-life-over` = "die-cutter-life-over".asInstanceOf[`die-cutter-life-over`]
  @scala.inline
  def `die-cutter-memory-exhausted`: `die-cutter-memory-exhausted` = "die-cutter-memory-exhausted".asInstanceOf[`die-cutter-memory-exhausted`]
  @scala.inline
  def `die-cutter-missing`: `die-cutter-missing` = "die-cutter-missing".asInstanceOf[`die-cutter-missing`]
  @scala.inline
  def `die-cutter-motor-failure`: `die-cutter-motor-failure` = "die-cutter-motor-failure".asInstanceOf[`die-cutter-motor-failure`]
  @scala.inline
  def `die-cutter-near-limit`: `die-cutter-near-limit` = "die-cutter-near-limit".asInstanceOf[`die-cutter-near-limit`]
  @scala.inline
  def `die-cutter-offline`: `die-cutter-offline` = "die-cutter-offline".asInstanceOf[`die-cutter-offline`]
  @scala.inline
  def `die-cutter-opened`: `die-cutter-opened` = "die-cutter-opened".asInstanceOf[`die-cutter-opened`]
  @scala.inline
  def `die-cutter-over-temperature`: `die-cutter-over-temperature` = "die-cutter-over-temperature".asInstanceOf[`die-cutter-over-temperature`]
  @scala.inline
  def `die-cutter-power-saver`: `die-cutter-power-saver` = "die-cutter-power-saver".asInstanceOf[`die-cutter-power-saver`]
  @scala.inline
  def `die-cutter-recoverable-failure`: `die-cutter-recoverable-failure` = "die-cutter-recoverable-failure".asInstanceOf[`die-cutter-recoverable-failure`]
  @scala.inline
  def `die-cutter-recoverable-storage-error`: `die-cutter-recoverable-storage-error` = "die-cutter-recoverable-storage-error".asInstanceOf[`die-cutter-recoverable-storage-error`]
  @scala.inline
  def `die-cutter-removed`: `die-cutter-removed` = "die-cutter-removed".asInstanceOf[`die-cutter-removed`]
  @scala.inline
  def `die-cutter-resource-added`: `die-cutter-resource-added` = "die-cutter-resource-added".asInstanceOf[`die-cutter-resource-added`]
  @scala.inline
  def `die-cutter-resource-removed`: `die-cutter-resource-removed` = "die-cutter-resource-removed".asInstanceOf[`die-cutter-resource-removed`]
  @scala.inline
  def `die-cutter-thermistor-failure`: `die-cutter-thermistor-failure` = "die-cutter-thermistor-failure".asInstanceOf[`die-cutter-thermistor-failure`]
  @scala.inline
  def `die-cutter-timing-failure`: `die-cutter-timing-failure` = "die-cutter-timing-failure".asInstanceOf[`die-cutter-timing-failure`]
  @scala.inline
  def `die-cutter-turned-off`: `die-cutter-turned-off` = "die-cutter-turned-off".asInstanceOf[`die-cutter-turned-off`]
  @scala.inline
  def `die-cutter-turned-on`: `die-cutter-turned-on` = "die-cutter-turned-on".asInstanceOf[`die-cutter-turned-on`]
  @scala.inline
  def `die-cutter-under-temperature`: `die-cutter-under-temperature` = "die-cutter-under-temperature".asInstanceOf[`die-cutter-under-temperature`]
  @scala.inline
  def `die-cutter-unrecoverable-failure`: `die-cutter-unrecoverable-failure` = "die-cutter-unrecoverable-failure".asInstanceOf[`die-cutter-unrecoverable-failure`]
  @scala.inline
  def `die-cutter-unrecoverable-storage-error`: `die-cutter-unrecoverable-storage-error` = "die-cutter-unrecoverable-storage-error".asInstanceOf[`die-cutter-unrecoverable-storage-error`]
  @scala.inline
  def `die-cutter-warming-up`: `die-cutter-warming-up` = "die-cutter-warming-up".asInstanceOf[`die-cutter-warming-up`]
  @scala.inline
  def digest: digest = "digest".asInstanceOf[digest]
  @scala.inline
  def `digital-signature-did-not-verify`: `digital-signature-did-not-verify` = "digital-signature-did-not-verify".asInstanceOf[`digital-signature-did-not-verify`]
  @scala.inline
  def `digital-signature-type-not-supported`: `digital-signature-type-not-supported` = "digital-signature-type-not-supported".asInstanceOf[`digital-signature-type-not-supported`]
  @scala.inline
  def `digital-signature-wait`: `digital-signature-wait` = "digital-signature-wait".asInstanceOf[`digital-signature-wait`]
  @scala.inline
  def dis: dis = "dis".asInstanceOf[dis]
  @scala.inline
  def disc: disc = "disc".asInstanceOf[disc]
  @scala.inline
  def `disc-glossy`: `disc-glossy` = "disc-glossy".asInstanceOf[`disc-glossy`]
  @scala.inline
  def `disc-high-gloss`: `disc-high-gloss` = "disc-high-gloss".asInstanceOf[`disc-high-gloss`]
  @scala.inline
  def `disc-matte`: `disc-matte` = "disc-matte".asInstanceOf[`disc-matte`]
  @scala.inline
  def `disc-satin`: `disc-satin` = "disc-satin".asInstanceOf[`disc-satin`]
  @scala.inline
  def `disc-semi-gloss`: `disc-semi-gloss` = "disc-semi-gloss".asInstanceOf[`disc-semi-gloss`]
  @scala.inline
  def display: display = "display".asInstanceOf[display]
  @scala.inline
  def `dlna-playcontainer`: `dlna-playcontainer` = "dlna-playcontainer".asInstanceOf[`dlna-playcontainer`]
  @scala.inline
  def `dlna-playsingle`: `dlna-playsingle` = "dlna-playsingle".asInstanceOf[`dlna-playsingle`]
  @scala.inline
  def dns: dns = "dns".asInstanceOf[dns]
  @scala.inline
  def dntp: dntp = "dntp".asInstanceOf[dntp]
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def `document-access-error`: `document-access-error` = "document-access-error".asInstanceOf[`document-access-error`]
  @scala.inline
  def `document-access-supported`: `document-access-supported` = "document-access-supported".asInstanceOf[`document-access-supported`]
  @scala.inline
  def `document-charset-default`: `document-charset-default` = "document-charset-default".asInstanceOf[`document-charset-default`]
  @scala.inline
  def `document-charset-supplied`: `document-charset-supplied` = "document-charset-supplied".asInstanceOf[`document-charset-supplied`]
  @scala.inline
  def `document-charset-supported`: `document-charset-supported` = "document-charset-supported".asInstanceOf[`document-charset-supported`]
  @scala.inline
  def `document-copies`: `document-copies` = "document-copies".asInstanceOf[`document-copies`]
  @scala.inline
  def `document-creation-attributes-supported`: `document-creation-attributes-supported` = "document-creation-attributes-supported".asInstanceOf[`document-creation-attributes-supported`]
  @scala.inline
  def `document-digital-signature-default`: `document-digital-signature-default` = "document-digital-signature-default".asInstanceOf[`document-digital-signature-default`]
  @scala.inline
  def `document-digital-signature-supplied`: `document-digital-signature-supplied` = "document-digital-signature-supplied".asInstanceOf[`document-digital-signature-supplied`]
  @scala.inline
  def `document-digital-signature-supported`: `document-digital-signature-supported` = "document-digital-signature-supported".asInstanceOf[`document-digital-signature-supported`]
  @scala.inline
  def `document-format-default`: `document-format-default` = "document-format-default".asInstanceOf[`document-format-default`]
  @scala.inline
  def `document-format-details-default`: `document-format-details-default` = "document-format-details-default".asInstanceOf[`document-format-details-default`]
  @scala.inline
  def `document-format-details-supplied`: `document-format-details-supplied` = "document-format-details-supplied".asInstanceOf[`document-format-details-supplied`]
  @scala.inline
  def `document-format-details-supported`: `document-format-details-supported` = "document-format-details-supported".asInstanceOf[`document-format-details-supported`]
  @scala.inline
  def `document-format-error`: `document-format-error` = "document-format-error".asInstanceOf[`document-format-error`]
  @scala.inline
  def `document-format-ready`: `document-format-ready` = "document-format-ready".asInstanceOf[`document-format-ready`]
  @scala.inline
  def `document-format-supplied`: `document-format-supplied` = "document-format-supplied".asInstanceOf[`document-format-supplied`]
  @scala.inline
  def `document-format-supported`: `document-format-supported` = "document-format-supported".asInstanceOf[`document-format-supported`]
  @scala.inline
  def `document-format-version-default`: `document-format-version-default` = "document-format-version-default".asInstanceOf[`document-format-version-default`]
  @scala.inline
  def `document-format-version-supplied`: `document-format-version-supplied` = "document-format-version-supplied".asInstanceOf[`document-format-version-supplied`]
  @scala.inline
  def `document-format-version-supported`: `document-format-version-supported` = "document-format-version-supported".asInstanceOf[`document-format-version-supported`]
  @scala.inline
  def `document-message-supplied`: `document-message-supplied` = "document-message-supplied".asInstanceOf[`document-message-supplied`]
  @scala.inline
  def `document-name-supplied`: `document-name-supplied` = "document-name-supplied".asInstanceOf[`document-name-supplied`]
  @scala.inline
  def `document-natural-language-default`: `document-natural-language-default` = "document-natural-language-default".asInstanceOf[`document-natural-language-default`]
  @scala.inline
  def `document-natural-language-supplied`: `document-natural-language-supplied` = "document-natural-language-supplied".asInstanceOf[`document-natural-language-supplied`]
  @scala.inline
  def `document-natural-language-supported`: `document-natural-language-supported` = "document-natural-language-supported".asInstanceOf[`document-natural-language-supported`]
  @scala.inline
  def `document-number`: `document-number` = "document-number".asInstanceOf[`document-number`]
  @scala.inline
  def `document-numbers`: `document-numbers` = "document-numbers".asInstanceOf[`document-numbers`]
  @scala.inline
  def `document-object`: `document-object` = "document-object".asInstanceOf[`document-object`]
  @scala.inline
  def `document-password-error`: `document-password-error` = "document-password-error".asInstanceOf[`document-password-error`]
  @scala.inline
  def `document-password-supported`: `document-password-supported` = "document-password-supported".asInstanceOf[`document-password-supported`]
  @scala.inline
  def `document-permission-error`: `document-permission-error` = "document-permission-error".asInstanceOf[`document-permission-error`]
  @scala.inline
  def `document-privacy-attributes`: `document-privacy-attributes` = "document-privacy-attributes".asInstanceOf[`document-privacy-attributes`]
  @scala.inline
  def `document-privacy-scope`: `document-privacy-scope` = "document-privacy-scope".asInstanceOf[`document-privacy-scope`]
  @scala.inline
  def `document-security-error`: `document-security-error` = "document-security-error".asInstanceOf[`document-security-error`]
  @scala.inline
  def `document-unprintable-error`: `document-unprintable-error` = "document-unprintable-error".asInstanceOf[`document-unprintable-error`]
  @scala.inline
  def `door-open`: `door-open` = "door-open".asInstanceOf[`door-open`]
  @scala.inline
  def `double-wall`: `double-wall` = "double-wall".asInstanceOf[`double-wall`]
  @scala.inline
  def dpp: dpp = "dpp".asInstanceOf[dpp]
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  @scala.inline
  def `draw-line`: `draw-line` = "draw-line".asInstanceOf[`draw-line`]
  @scala.inline
  def drm: drm = "drm".asInstanceOf[drm]
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  @scala.inline
  def `dry-film`: `dry-film` = "dry-film".asInstanceOf[`dry-film`]
  @scala.inline
  def dss: dss = "dss".asInstanceOf[dss]
  @scala.inline
  def dtn: dtn = "dtn".asInstanceOf[dtn]
  @scala.inline
  def dvb: dvb = "dvb".asInstanceOf[dvb]
  @scala.inline
  def dvd: dvd = "dvd".asInstanceOf[dvd]
  @scala.inline
  def `dxsynchro-translucent`: `dxsynchro-translucent` = "dxsynchro-translucent".asInstanceOf[`dxsynchro-translucent`]
  @scala.inline
  def `dxsynchro-transparent`: `dxsynchro-transparent` = "dxsynchro-transparent".asInstanceOf[`dxsynchro-transparent`]
  @scala.inline
  def `dxsynchro-white`: `dxsynchro-white` = "dxsynchro-white".asInstanceOf[`dxsynchro-white`]
  @scala.inline
  def e: e = "e".asInstanceOf[e]
  @scala.inline
  def `e-translucent`: `e-translucent` = "e-translucent".asInstanceOf[`e-translucent`]
  @scala.inline
  def `e-transparent`: `e-transparent` = "e-transparent".asInstanceOf[`e-transparent`]
  @scala.inline
  def `e-white`: `e-white` = "e-white".asInstanceOf[`e-white`]
  @scala.inline
  def `ebcdic-cp-us`: `ebcdic-cp-us` = "ebcdic-cp-us".asInstanceOf[`ebcdic-cp-us`]
  @scala.inline
  def ed2k: ed2k = "ed2k".asInstanceOf[ed2k]
  @scala.inline
  def `edge-stitch`: `edge-stitch` = "edge-stitch".asInstanceOf[`edge-stitch`]
  @scala.inline
  def `edge-stitch-bottom`: `edge-stitch-bottom` = "edge-stitch-bottom".asInstanceOf[`edge-stitch-bottom`]
  @scala.inline
  def `edge-stitch-left`: `edge-stitch-left` = "edge-stitch-left".asInstanceOf[`edge-stitch-left`]
  @scala.inline
  def `edge-stitch-right`: `edge-stitch-right` = "edge-stitch-right".asInstanceOf[`edge-stitch-right`]
  @scala.inline
  def `edge-stitch-top`: `edge-stitch-top` = "edge-stitch-top".asInstanceOf[`edge-stitch-top`]
  @scala.inline
  def elsi: elsi = "elsi".asInstanceOf[elsi]
  @scala.inline
  def `embossing-foil`: `embossing-foil` = "embossing-foil".asInstanceOf[`embossing-foil`]
  @scala.inline
  def `end-board`: `end-board` = "end-board".asInstanceOf[`end-board`]
  @scala.inline
  def `end-of-day`: `end-of-day` = "end-of-day".asInstanceOf[`end-of-day`]
  @scala.inline
  def `end-of-month`: `end-of-month` = "end-of-month".asInstanceOf[`end-of-month`]
  @scala.inline
  def `end-of-week`: `end-of-week` = "end-of-week".asInstanceOf[`end-of-week`]
  @scala.inline
  def `end-sheet`: `end-sheet` = "end-sheet".asInstanceOf[`end-sheet`]
  @scala.inline
  def envelope: envelope = "envelope".asInstanceOf[envelope]
  @scala.inline
  def `envelope-archival`: `envelope-archival` = "envelope-archival".asInstanceOf[`envelope-archival`]
  @scala.inline
  def `envelope-bond`: `envelope-bond` = "envelope-bond".asInstanceOf[`envelope-bond`]
  @scala.inline
  def `envelope-coated`: `envelope-coated` = "envelope-coated".asInstanceOf[`envelope-coated`]
  @scala.inline
  def `envelope-cotton`: `envelope-cotton` = "envelope-cotton".asInstanceOf[`envelope-cotton`]
  @scala.inline
  def `envelope-fine`: `envelope-fine` = "envelope-fine".asInstanceOf[`envelope-fine`]
  @scala.inline
  def `envelope-heavyweight`: `envelope-heavyweight` = "envelope-heavyweight".asInstanceOf[`envelope-heavyweight`]
  @scala.inline
  def `envelope-inkjet`: `envelope-inkjet` = "envelope-inkjet".asInstanceOf[`envelope-inkjet`]
  @scala.inline
  def `envelope-lightweight`: `envelope-lightweight` = "envelope-lightweight".asInstanceOf[`envelope-lightweight`]
  @scala.inline
  def `envelope-plain`: `envelope-plain` = "envelope-plain".asInstanceOf[`envelope-plain`]
  @scala.inline
  def `envelope-preprinted`: `envelope-preprinted` = "envelope-preprinted".asInstanceOf[`envelope-preprinted`]
  @scala.inline
  def `envelope-window`: `envelope-window` = "envelope-window".asInstanceOf[`envelope-window`]
  @scala.inline
  def `errors-count`: `errors-count` = "errors-count".asInstanceOf[`errors-count`]
  @scala.inline
  def `errors-detected`: `errors-detected` = "errors-detected".asInstanceOf[`errors-detected`]
  @scala.inline
  def `euc-kr`: `euc-kr` = "euc-kr".asInstanceOf[`euc-kr`]
  @scala.inline
  def evening: evening = "evening".asInstanceOf[evening]
  @scala.inline
  def example: example = "example".asInstanceOf[example]
  @scala.inline
  def `executable-firmware`: `executable-firmware` = "executable-firmware".asInstanceOf[`executable-firmware`]
  @scala.inline
  def `executable-software`: `executable-software` = "executable-software".asInstanceOf[`executable-software`]
  @scala.inline
  def executive: executive = "executive".asInstanceOf[executive]
  @scala.inline
  def `executive-white`: `executive-white` = "executive-white".asInstanceOf[`executive-white`]
  @scala.inline
  def `exsynchro-translucent`: `exsynchro-translucent` = "exsynchro-translucent".asInstanceOf[`exsynchro-translucent`]
  @scala.inline
  def `exsynchro-transparent`: `exsynchro-transparent` = "exsynchro-transparent".asInstanceOf[`exsynchro-transparent`]
  @scala.inline
  def `exsynchro-white`: `exsynchro-white` = "exsynchro-white".asInstanceOf[`exsynchro-white`]
  @scala.inline
  def f: f = "f".asInstanceOf[f]
  @scala.inline
  def fabric: fabric = "fabric".asInstanceOf[fabric]
  @scala.inline
  def `fabric-archival`: `fabric-archival` = "fabric-archival".asInstanceOf[`fabric-archival`]
  @scala.inline
  def `fabric-glossy`: `fabric-glossy` = "fabric-glossy".asInstanceOf[`fabric-glossy`]
  @scala.inline
  def `fabric-high-gloss`: `fabric-high-gloss` = "fabric-high-gloss".asInstanceOf[`fabric-high-gloss`]
  @scala.inline
  def `fabric-matte`: `fabric-matte` = "fabric-matte".asInstanceOf[`fabric-matte`]
  @scala.inline
  def `fabric-semi-gloss`: `fabric-semi-gloss` = "fabric-semi-gloss".asInstanceOf[`fabric-semi-gloss`]
  @scala.inline
  def `fabric-waterproof`: `fabric-waterproof` = "fabric-waterproof".asInstanceOf[`fabric-waterproof`]
  @scala.inline
  def `face-down`: `face-down` = "face-down".asInstanceOf[`face-down`]
  @scala.inline
  def `face-up`: `face-up` = "face-up".asInstanceOf[`face-up`]
  @scala.inline
  def facetime: facetime = "facetime".asInstanceOf[facetime]
  @scala.inline
  def fax: fax = "fax".asInstanceOf[fax]
  @scala.inline
  def faxin: faxin = "faxin".asInstanceOf[faxin]
  @scala.inline
  def faxout: faxout = "faxout".asInstanceOf[faxout]
  @scala.inline
  def feed: feed = "feed".asInstanceOf[feed]
  @scala.inline
  def `feed-orientation-default`: `feed-orientation-default` = "feed-orientation-default".asInstanceOf[`feed-orientation-default`]
  @scala.inline
  def `feed-orientation-supported`: `feed-orientation-supported` = "feed-orientation-supported".asInstanceOf[`feed-orientation-supported`]
  @scala.inline
  def feedready: feedready = "feedready".asInstanceOf[feedready]
  @scala.inline
  def `fetch-document-attributes-supported`: `fetch-document-attributes-supported` = "fetch-document-attributes-supported".asInstanceOf[`fetch-document-attributes-supported`]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def filesystem: filesystem = "filesystem".asInstanceOf[filesystem]
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  @scala.inline
  def film: film = "film".asInstanceOf[film]
  @scala.inline
  def `film-reader`: `film-reader` = "film-reader".asInstanceOf[`film-reader`]
  @scala.inline
  def fine: fine = "fine".asInstanceOf[fine]
  @scala.inline
  def finger: finger = "finger".asInstanceOf[finger]
  @scala.inline
  def `finishing-template`: `finishing-template` = "finishing-template".asInstanceOf[`finishing-template`]
  @scala.inline
  def `finishing-template-supported`: `finishing-template-supported` = "finishing-template-supported".asInstanceOf[`finishing-template-supported`]
  @scala.inline
  def finishings: finishings = "finishings".asInstanceOf[finishings]
  @scala.inline
  def `finishings-actual`: `finishings-actual` = "finishings-actual".asInstanceOf[`finishings-actual`]
  @scala.inline
  def `finishings-col`: `finishings-col` = "finishings-col".asInstanceOf[`finishings-col`]
  @scala.inline
  def `finishings-col-actual`: `finishings-col-actual` = "finishings-col-actual".asInstanceOf[`finishings-col-actual`]
  @scala.inline
  def `finishings-col-database`: `finishings-col-database` = "finishings-col-database".asInstanceOf[`finishings-col-database`]
  @scala.inline
  def `finishings-col-default`: `finishings-col-default` = "finishings-col-default".asInstanceOf[`finishings-col-default`]
  @scala.inline
  def `finishings-col-ready`: `finishings-col-ready` = "finishings-col-ready".asInstanceOf[`finishings-col-ready`]
  @scala.inline
  def `finishings-col-supported`: `finishings-col-supported` = "finishings-col-supported".asInstanceOf[`finishings-col-supported`]
  @scala.inline
  def `finishings-default`: `finishings-default` = "finishings-default".asInstanceOf[`finishings-default`]
  @scala.inline
  def `finishings-ready`: `finishings-ready` = "finishings-ready".asInstanceOf[`finishings-ready`]
  @scala.inline
  def `finishings-supported`: `finishings-supported` = "finishings-supported".asInstanceOf[`finishings-supported`]
  @scala.inline
  def `first-print-stream-page`: `first-print-stream-page` = "first-print-stream-page".asInstanceOf[`first-print-stream-page`]
  @scala.inline
  def `first-run-pen-experience`: `first-run-pen-experience` = "first-run-pen-experience".asInstanceOf[`first-run-pen-experience`]
  @scala.inline
  def fish: fish = "fish".asInstanceOf[fish]
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  @scala.inline
  def flash: flash = "flash".asInstanceOf[flash]
  @scala.inline
  def flat: flat = "flat".asInstanceOf[flat]
  @scala.inline
  def `flexo-base`: `flexo-base` = "flexo-base".asInstanceOf[`flexo-base`]
  @scala.inline
  def `flexo-photo-polymer`: `flexo-photo-polymer` = "flexo-photo-polymer".asInstanceOf[`flexo-photo-polymer`]
  @scala.inline
  def flipped: flipped = "flipped".asInstanceOf[flipped]
  @scala.inline
  def flute: flute = "flute".asInstanceOf[flute]
  @scala.inline
  def fm: fm = "fm".asInstanceOf[fm]
  @scala.inline
  def foil: foil = "foil".asInstanceOf[foil]
  @scala.inline
  def fold: fold = "fold".asInstanceOf[fold]
  @scala.inline
  def `fold-accordion`: `fold-accordion` = "fold-accordion".asInstanceOf[`fold-accordion`]
  @scala.inline
  def `fold-double-gate`: `fold-double-gate` = "fold-double-gate".asInstanceOf[`fold-double-gate`]
  @scala.inline
  def `fold-engineering-z`: `fold-engineering-z` = "fold-engineering-z".asInstanceOf[`fold-engineering-z`]
  @scala.inline
  def `fold-gate`: `fold-gate` = "fold-gate".asInstanceOf[`fold-gate`]
  @scala.inline
  def `fold-half`: `fold-half` = "fold-half".asInstanceOf[`fold-half`]
  @scala.inline
  def `fold-half-z`: `fold-half-z` = "fold-half-z".asInstanceOf[`fold-half-z`]
  @scala.inline
  def `fold-left-gate`: `fold-left-gate` = "fold-left-gate".asInstanceOf[`fold-left-gate`]
  @scala.inline
  def `fold-letter`: `fold-letter` = "fold-letter".asInstanceOf[`fold-letter`]
  @scala.inline
  def `fold-parallel`: `fold-parallel` = "fold-parallel".asInstanceOf[`fold-parallel`]
  @scala.inline
  def `fold-poster`: `fold-poster` = "fold-poster".asInstanceOf[`fold-poster`]
  @scala.inline
  def `fold-right-gate`: `fold-right-gate` = "fold-right-gate".asInstanceOf[`fold-right-gate`]
  @scala.inline
  def `fold-z`: `fold-z` = "fold-z".asInstanceOf[`fold-z`]
  @scala.inline
  def `folder-added`: `folder-added` = "folder-added".asInstanceOf[`folder-added`]
  @scala.inline
  def `folder-almost-empty`: `folder-almost-empty` = "folder-almost-empty".asInstanceOf[`folder-almost-empty`]
  @scala.inline
  def `folder-almost-full`: `folder-almost-full` = "folder-almost-full".asInstanceOf[`folder-almost-full`]
  @scala.inline
  def `folder-at-limit`: `folder-at-limit` = "folder-at-limit".asInstanceOf[`folder-at-limit`]
  @scala.inline
  def `folder-closed`: `folder-closed` = "folder-closed".asInstanceOf[`folder-closed`]
  @scala.inline
  def `folder-configuration-change`: `folder-configuration-change` = "folder-configuration-change".asInstanceOf[`folder-configuration-change`]
  @scala.inline
  def `folder-cover-closed`: `folder-cover-closed` = "folder-cover-closed".asInstanceOf[`folder-cover-closed`]
  @scala.inline
  def `folder-cover-open`: `folder-cover-open` = "folder-cover-open".asInstanceOf[`folder-cover-open`]
  @scala.inline
  def `folder-empty`: `folder-empty` = "folder-empty".asInstanceOf[`folder-empty`]
  @scala.inline
  def `folder-full`: `folder-full` = "folder-full".asInstanceOf[`folder-full`]
  @scala.inline
  def `folder-interlock-closed`: `folder-interlock-closed` = "folder-interlock-closed".asInstanceOf[`folder-interlock-closed`]
  @scala.inline
  def `folder-interlock-open`: `folder-interlock-open` = "folder-interlock-open".asInstanceOf[`folder-interlock-open`]
  @scala.inline
  def `folder-jam`: `folder-jam` = "folder-jam".asInstanceOf[`folder-jam`]
  @scala.inline
  def `folder-life-almost-over`: `folder-life-almost-over` = "folder-life-almost-over".asInstanceOf[`folder-life-almost-over`]
  @scala.inline
  def `folder-life-over`: `folder-life-over` = "folder-life-over".asInstanceOf[`folder-life-over`]
  @scala.inline
  def `folder-memory-exhausted`: `folder-memory-exhausted` = "folder-memory-exhausted".asInstanceOf[`folder-memory-exhausted`]
  @scala.inline
  def `folder-missing`: `folder-missing` = "folder-missing".asInstanceOf[`folder-missing`]
  @scala.inline
  def `folder-motor-failure`: `folder-motor-failure` = "folder-motor-failure".asInstanceOf[`folder-motor-failure`]
  @scala.inline
  def `folder-near-limit`: `folder-near-limit` = "folder-near-limit".asInstanceOf[`folder-near-limit`]
  @scala.inline
  def `folder-offline`: `folder-offline` = "folder-offline".asInstanceOf[`folder-offline`]
  @scala.inline
  def `folder-opened`: `folder-opened` = "folder-opened".asInstanceOf[`folder-opened`]
  @scala.inline
  def `folder-over-temperature`: `folder-over-temperature` = "folder-over-temperature".asInstanceOf[`folder-over-temperature`]
  @scala.inline
  def `folder-power-saver`: `folder-power-saver` = "folder-power-saver".asInstanceOf[`folder-power-saver`]
  @scala.inline
  def `folder-recoverable-failure`: `folder-recoverable-failure` = "folder-recoverable-failure".asInstanceOf[`folder-recoverable-failure`]
  @scala.inline
  def `folder-recoverable-storage-error`: `folder-recoverable-storage-error` = "folder-recoverable-storage-error".asInstanceOf[`folder-recoverable-storage-error`]
  @scala.inline
  def `folder-removed`: `folder-removed` = "folder-removed".asInstanceOf[`folder-removed`]
  @scala.inline
  def `folder-resource-added`: `folder-resource-added` = "folder-resource-added".asInstanceOf[`folder-resource-added`]
  @scala.inline
  def `folder-resource-removed`: `folder-resource-removed` = "folder-resource-removed".asInstanceOf[`folder-resource-removed`]
  @scala.inline
  def `folder-thermistor-failure`: `folder-thermistor-failure` = "folder-thermistor-failure".asInstanceOf[`folder-thermistor-failure`]
  @scala.inline
  def `folder-timing-failure`: `folder-timing-failure` = "folder-timing-failure".asInstanceOf[`folder-timing-failure`]
  @scala.inline
  def `folder-turned-off`: `folder-turned-off` = "folder-turned-off".asInstanceOf[`folder-turned-off`]
  @scala.inline
  def `folder-turned-on`: `folder-turned-on` = "folder-turned-on".asInstanceOf[`folder-turned-on`]
  @scala.inline
  def `folder-under-temperature`: `folder-under-temperature` = "folder-under-temperature".asInstanceOf[`folder-under-temperature`]
  @scala.inline
  def `folder-unrecoverable-failure`: `folder-unrecoverable-failure` = "folder-unrecoverable-failure".asInstanceOf[`folder-unrecoverable-failure`]
  @scala.inline
  def `folder-unrecoverable-storage-error`: `folder-unrecoverable-storage-error` = "folder-unrecoverable-storage-error".asInstanceOf[`folder-unrecoverable-storage-error`]
  @scala.inline
  def `folder-warming-up`: `folder-warming-up` = "folder-warming-up".asInstanceOf[`folder-warming-up`]
  @scala.inline
  def folding: folding = "folding".asInstanceOf[folding]
  @scala.inline
  def `folding-direction-supported`: `folding-direction-supported` = "folding-direction-supported".asInstanceOf[`folding-direction-supported`]
  @scala.inline
  def `folding-offset-supported`: `folding-offset-supported` = "folding-offset-supported".asInstanceOf[`folding-offset-supported`]
  @scala.inline
  def `folding-reference-edge-supported`: `folding-reference-edge-supported` = "folding-reference-edge-supported".asInstanceOf[`folding-reference-edge-supported`]
  @scala.inline
  def folio: folio = "folio".asInstanceOf[folio]
  @scala.inline
  def `folio-white`: `folio-white` = "folio-white".asInstanceOf[`folio-white`]
  @scala.inline
  def `font-name-requested`: `font-name-requested` = "font-name-requested".asInstanceOf[`font-name-requested`]
  @scala.inline
  def `font-name-requested-default`: `font-name-requested-default` = "font-name-requested-default".asInstanceOf[`font-name-requested-default`]
  @scala.inline
  def `font-name-requested-supported`: `font-name-requested-supported` = "font-name-requested-supported".asInstanceOf[`font-name-requested-supported`]
  @scala.inline
  def `font-size-requested`: `font-size-requested` = "font-size-requested".asInstanceOf[`font-size-requested`]
  @scala.inline
  def `font-size-requested-default`: `font-size-requested-default` = "font-size-requested-default".asInstanceOf[`font-size-requested-default`]
  @scala.inline
  def `font-size-requested-supported`: `font-size-requested-supported` = "font-size-requested-supported".asInstanceOf[`font-size-requested-supported`]
  @scala.inline
  def `force-front-side`: `force-front-side` = "force-front-side".asInstanceOf[`force-front-side`]
  @scala.inline
  def `force-front-side-actual`: `force-front-side-actual` = "force-front-side-actual".asInstanceOf[`force-front-side-actual`]
  @scala.inline
  def `from-name-supported`: `from-name-supported` = "from-name-supported".asInstanceOf[`from-name-supported`]
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  @scala.inline
  def ftp: ftp = "ftp".asInstanceOf[ftp]
  @scala.inline
  def `fuchsia-pkg`: `fuchsia-pkg` = "fuchsia-pkg".asInstanceOf[`fuchsia-pkg`]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def `full-cut-tabs`: `full-cut-tabs` = "full-cut-tabs".asInstanceOf[`full-cut-tabs`]
  @scala.inline
  def `fuser-over-temp`: `fuser-over-temp` = "fuser-over-temp".asInstanceOf[`fuser-over-temp`]
  @scala.inline
  def `fuser-under-temp`: `fuser-under-temp` = "fuser-under-temp".asInstanceOf[`fuser-under-temp`]
  @scala.inline
  def g: g = "g".asInstanceOf[g]
  @scala.inline
  def gb2312: gb2312 = "gb2312".asInstanceOf[gb2312]
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  @scala.inline
  def `generated-natural-language-supported`: `generated-natural-language-supported` = "generated-natural-language-supported".asInstanceOf[`generated-natural-language-supported`]
  @scala.inline
  def geo: geo = "geo".asInstanceOf[geo]
  @scala.inline
  def gg: gg = "gg".asInstanceOf[gg]
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  @scala.inline
  def gizmoproject: gizmoproject = "gizmoproject".asInstanceOf[gizmoproject]
  @scala.inline
  def glass: glass = "glass".asInstanceOf[glass]
  @scala.inline
  def `glass-colored`: `glass-colored` = "glass-colored".asInstanceOf[`glass-colored`]
  @scala.inline
  def `glass-opaque`: `glass-opaque` = "glass-opaque".asInstanceOf[`glass-opaque`]
  @scala.inline
  def `glass-surfaced`: `glass-surfaced` = "glass-surfaced".asInstanceOf[`glass-surfaced`]
  @scala.inline
  def `glass-textured`: `glass-textured` = "glass-textured".asInstanceOf[`glass-textured`]
  @scala.inline
  def glossy: glossy = "glossy".asInstanceOf[glossy]
  @scala.inline
  def go: go = "go".asInstanceOf[go]
  @scala.inline
  def gold: gold = "gold".asInstanceOf[gold]
  @scala.inline
  def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  @scala.inline
  def gopher: gopher = "gopher".asInstanceOf[gopher]
  @scala.inline
  def graph: graph = "graph".asInstanceOf[graph]
  @scala.inline
  def graphic: graphic = "graphic".asInstanceOf[graphic]
  @scala.inline
  def `gravure-cylinder`: `gravure-cylinder` = "gravure-cylinder".asInstanceOf[`gravure-cylinder`]
  @scala.inline
  def gray: gray = "gray".asInstanceOf[gray]
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def gtalk: gtalk = "gtalk".asInstanceOf[gtalk]
  @scala.inline
  def guaranteed: guaranteed = "guaranteed".asInstanceOf[guaranteed]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  @scala.inline
  def h323: h323 = "h323".asInstanceOf[h323]
  @scala.inline
  def hagaki: hagaki = "hagaki".asInstanceOf[hagaki]
  @scala.inline
  def halftone: halftone = "halftone".asInstanceOf[halftone]
  @scala.inline
  def ham: ham = "ham".asInstanceOf[ham]
  @scala.inline
  def hcap: hcap = "hcap".asInstanceOf[hcap]
  @scala.inline
  def hcp: hcp = "hcp".asInstanceOf[hcp]
  @scala.inline
  def hibernate: hibernate = "hibernate".asInstanceOf[hibernate]
  @scala.inline
  def `hibernate-vendor1`: `hibernate-vendor1` = "hibernate-vendor1".asInstanceOf[`hibernate-vendor1`]
  @scala.inline
  def `hibernate-vendor2`: `hibernate-vendor2` = "hibernate-vendor2".asInstanceOf[`hibernate-vendor2`]
  @scala.inline
  def `hibernate-vendor3`: `hibernate-vendor3` = "hibernate-vendor3".asInstanceOf[`hibernate-vendor3`]
  @scala.inline
  def `hibernate-vendor4`: `hibernate-vendor4` = "hibernate-vendor4".asInstanceOf[`hibernate-vendor4`]
  @scala.inline
  def `hibernate-vendor5`: `hibernate-vendor5` = "hibernate-vendor5".asInstanceOf[`hibernate-vendor5`]
  @scala.inline
  def hierarchical: hierarchical = "hierarchical".asInstanceOf[hierarchical]
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  @scala.inline
  def `high-gloss`: `high-gloss` = "high-gloss".asInstanceOf[`high-gloss`]
  @scala.inline
  def highlight: highlight = "highlight".asInstanceOf[highlight]
  @scala.inline
  def `hold-job_`: `hold-job_` = "hold-job".asInstanceOf[`hold-job_`]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def hxxp: hxxp = "hxxp".asInstanceOf[hxxp]
  @scala.inline
  def hxxps: hxxps = "hxxps".asInstanceOf[hxxps]
  @scala.inline
  def hydrazone: hydrazone = "hydrazone".asInstanceOf[hydrazone]
  @scala.inline
  def `hz-gb-2312`: `hz-gb-2312` = "hz-gb-2312".asInstanceOf[`hz-gb-2312`]
  @scala.inline
  def `iana_us-ascii_any`: `iana_us-ascii_any` = "iana_us-ascii_any".asInstanceOf[`iana_us-ascii_any`]
  @scala.inline
  def `iana_us-ascii_complex`: `iana_us-ascii_complex` = "iana_us-ascii_complex".asInstanceOf[`iana_us-ascii_complex`]
  @scala.inline
  def `iana_us-ascii_digits`: `iana_us-ascii_digits` = "iana_us-ascii_digits".asInstanceOf[`iana_us-ascii_digits`]
  @scala.inline
  def `iana_us-ascii_letters`: `iana_us-ascii_letters` = "iana_us-ascii_letters".asInstanceOf[`iana_us-ascii_letters`]
  @scala.inline
  def `iana_utf-8_any`: `iana_utf-8_any` = "iana_utf-8_any".asInstanceOf[`iana_utf-8_any`]
  @scala.inline
  def `iana_utf-8_digits`: `iana_utf-8_digits` = "iana_utf-8_digits".asInstanceOf[`iana_utf-8_digits`]
  @scala.inline
  def `iana_utf-8_letters`: `iana_utf-8_letters` = "iana_utf-8_letters".asInstanceOf[`iana_utf-8_letters`]
  @scala.inline
  def iax: iax = "iax".asInstanceOf[iax]
  @scala.inline
  def ibm737: ibm737 = "ibm737".asInstanceOf[ibm737]
  @scala.inline
  def ibm775: ibm775 = "ibm775".asInstanceOf[ibm775]
  @scala.inline
  def ibm850: ibm850 = "ibm850".asInstanceOf[ibm850]
  @scala.inline
  def ibm852: ibm852 = "ibm852".asInstanceOf[ibm852]
  @scala.inline
  def ibm857: ibm857 = "ibm857".asInstanceOf[ibm857]
  @scala.inline
  def ibm861: ibm861 = "ibm861".asInstanceOf[ibm861]
  @scala.inline
  def ibm869: ibm869 = "ibm869".asInstanceOf[ibm869]
  @scala.inline
  def icap: icap = "icap".asInstanceOf[icap]
  @scala.inline
  def icc: icc = "icc".asInstanceOf[icc]
  @scala.inline
  def `icc-color-matching`: `icc-color-matching` = "icc-color-matching".asInstanceOf[`icc-color-matching`]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def `identify-actions-default`: `identify-actions-default` = "identify-actions-default".asInstanceOf[`identify-actions-default`]
  @scala.inline
  def `identify-actions-supported`: `identify-actions-supported` = "identify-actions-supported".asInstanceOf[`identify-actions-supported`]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def im: im = "im".asInstanceOf[im]
  @scala.inline
  def `image-setter-paper`: `image-setter-paper` = "image-setter-paper".asInstanceOf[`image-setter-paper`]
  @scala.inline
  def imageSlashgif: imageSlashgif = "image/gif".asInstanceOf[imageSlashgif]
  @scala.inline
  def imageSlashief: imageSlashief = "image/ief".asInstanceOf[imageSlashief]
  @scala.inline
  def imageSlashjpeg: imageSlashjpeg = "image/jpeg".asInstanceOf[imageSlashjpeg]
  @scala.inline
  def imageSlashpng: imageSlashpng = "image/png".asInstanceOf[imageSlashpng]
  @scala.inline
  def imageSlashtiff: imageSlashtiff = "image/tiff".asInstanceOf[imageSlashtiff]
  @scala.inline
  def `imageSlashx-cmu-raster`: `imageSlashx-cmu-raster` = "image/x-cmu-raster".asInstanceOf[`imageSlashx-cmu-raster`]
  @scala.inline
  def `imageSlashx-portable-anymap`: `imageSlashx-portable-anymap` = "image/x-portable-anymap".asInstanceOf[`imageSlashx-portable-anymap`]
  @scala.inline
  def `imageSlashx-portable-bitmap`: `imageSlashx-portable-bitmap` = "image/x-portable-bitmap".asInstanceOf[`imageSlashx-portable-bitmap`]
  @scala.inline
  def `imageSlashx-portable-graymap`: `imageSlashx-portable-graymap` = "image/x-portable-graymap".asInstanceOf[`imageSlashx-portable-graymap`]
  @scala.inline
  def `imageSlashx-portable-pixmap`: `imageSlashx-portable-pixmap` = "image/x-portable-pixmap".asInstanceOf[`imageSlashx-portable-pixmap`]
  @scala.inline
  def `imageSlashx-rgb`: `imageSlashx-rgb` = "image/x-rgb".asInstanceOf[`imageSlashx-rgb`]
  @scala.inline
  def `imageSlashx-xbitmap`: `imageSlashx-xbitmap` = "image/x-xbitmap".asInstanceOf[`imageSlashx-xbitmap`]
  @scala.inline
  def `imageSlashx-xpixmap`: `imageSlashx-xpixmap` = "image/x-xpixmap".asInstanceOf[`imageSlashx-xpixmap`]
  @scala.inline
  def `imageSlashx-xwindowdump`: `imageSlashx-xwindowdump` = "image/x-xwindowdump".asInstanceOf[`imageSlashx-xwindowdump`]
  @scala.inline
  def `imaging-cylinder`: `imaging-cylinder` = "imaging-cylinder".asInstanceOf[`imaging-cylinder`]
  @scala.inline
  def imap: imap = "imap".asInstanceOf[imap]
  @scala.inline
  def `imposition-template`: `imposition-template` = "imposition-template".asInstanceOf[`imposition-template`]
  @scala.inline
  def `imposition-template-actual`: `imposition-template-actual` = "imposition-template-actual".asInstanceOf[`imposition-template-actual`]
  @scala.inline
  def `imposition-template-default`: `imposition-template-default` = "imposition-template-default".asInstanceOf[`imposition-template-default`]
  @scala.inline
  def `imposition-template-supported`: `imposition-template-supported` = "imposition-template-supported".asInstanceOf[`imposition-template-supported`]
  @scala.inline
  def `imprinter-added`: `imprinter-added` = "imprinter-added".asInstanceOf[`imprinter-added`]
  @scala.inline
  def `imprinter-almost-empty`: `imprinter-almost-empty` = "imprinter-almost-empty".asInstanceOf[`imprinter-almost-empty`]
  @scala.inline
  def `imprinter-almost-full`: `imprinter-almost-full` = "imprinter-almost-full".asInstanceOf[`imprinter-almost-full`]
  @scala.inline
  def `imprinter-at-limit`: `imprinter-at-limit` = "imprinter-at-limit".asInstanceOf[`imprinter-at-limit`]
  @scala.inline
  def `imprinter-closed`: `imprinter-closed` = "imprinter-closed".asInstanceOf[`imprinter-closed`]
  @scala.inline
  def `imprinter-configuration-change`: `imprinter-configuration-change` = "imprinter-configuration-change".asInstanceOf[`imprinter-configuration-change`]
  @scala.inline
  def `imprinter-cover-closed`: `imprinter-cover-closed` = "imprinter-cover-closed".asInstanceOf[`imprinter-cover-closed`]
  @scala.inline
  def `imprinter-cover-open`: `imprinter-cover-open` = "imprinter-cover-open".asInstanceOf[`imprinter-cover-open`]
  @scala.inline
  def `imprinter-empty`: `imprinter-empty` = "imprinter-empty".asInstanceOf[`imprinter-empty`]
  @scala.inline
  def `imprinter-full`: `imprinter-full` = "imprinter-full".asInstanceOf[`imprinter-full`]
  @scala.inline
  def `imprinter-interlock-closed`: `imprinter-interlock-closed` = "imprinter-interlock-closed".asInstanceOf[`imprinter-interlock-closed`]
  @scala.inline
  def `imprinter-interlock-open`: `imprinter-interlock-open` = "imprinter-interlock-open".asInstanceOf[`imprinter-interlock-open`]
  @scala.inline
  def `imprinter-jam`: `imprinter-jam` = "imprinter-jam".asInstanceOf[`imprinter-jam`]
  @scala.inline
  def `imprinter-life-almost-over`: `imprinter-life-almost-over` = "imprinter-life-almost-over".asInstanceOf[`imprinter-life-almost-over`]
  @scala.inline
  def `imprinter-life-over`: `imprinter-life-over` = "imprinter-life-over".asInstanceOf[`imprinter-life-over`]
  @scala.inline
  def `imprinter-memory-exhausted`: `imprinter-memory-exhausted` = "imprinter-memory-exhausted".asInstanceOf[`imprinter-memory-exhausted`]
  @scala.inline
  def `imprinter-missing`: `imprinter-missing` = "imprinter-missing".asInstanceOf[`imprinter-missing`]
  @scala.inline
  def `imprinter-motor-failure`: `imprinter-motor-failure` = "imprinter-motor-failure".asInstanceOf[`imprinter-motor-failure`]
  @scala.inline
  def `imprinter-near-limit`: `imprinter-near-limit` = "imprinter-near-limit".asInstanceOf[`imprinter-near-limit`]
  @scala.inline
  def `imprinter-offline`: `imprinter-offline` = "imprinter-offline".asInstanceOf[`imprinter-offline`]
  @scala.inline
  def `imprinter-opened`: `imprinter-opened` = "imprinter-opened".asInstanceOf[`imprinter-opened`]
  @scala.inline
  def `imprinter-over-temperature`: `imprinter-over-temperature` = "imprinter-over-temperature".asInstanceOf[`imprinter-over-temperature`]
  @scala.inline
  def `imprinter-power-saver`: `imprinter-power-saver` = "imprinter-power-saver".asInstanceOf[`imprinter-power-saver`]
  @scala.inline
  def `imprinter-recoverable-failure`: `imprinter-recoverable-failure` = "imprinter-recoverable-failure".asInstanceOf[`imprinter-recoverable-failure`]
  @scala.inline
  def `imprinter-recoverable-storage-error`: `imprinter-recoverable-storage-error` = "imprinter-recoverable-storage-error".asInstanceOf[`imprinter-recoverable-storage-error`]
  @scala.inline
  def `imprinter-removed`: `imprinter-removed` = "imprinter-removed".asInstanceOf[`imprinter-removed`]
  @scala.inline
  def `imprinter-resource-added`: `imprinter-resource-added` = "imprinter-resource-added".asInstanceOf[`imprinter-resource-added`]
  @scala.inline
  def `imprinter-resource-removed`: `imprinter-resource-removed` = "imprinter-resource-removed".asInstanceOf[`imprinter-resource-removed`]
  @scala.inline
  def `imprinter-thermistor-failure`: `imprinter-thermistor-failure` = "imprinter-thermistor-failure".asInstanceOf[`imprinter-thermistor-failure`]
  @scala.inline
  def `imprinter-timing-failure`: `imprinter-timing-failure` = "imprinter-timing-failure".asInstanceOf[`imprinter-timing-failure`]
  @scala.inline
  def `imprinter-turned-off`: `imprinter-turned-off` = "imprinter-turned-off".asInstanceOf[`imprinter-turned-off`]
  @scala.inline
  def `imprinter-turned-on`: `imprinter-turned-on` = "imprinter-turned-on".asInstanceOf[`imprinter-turned-on`]
  @scala.inline
  def `imprinter-under-temperature`: `imprinter-under-temperature` = "imprinter-under-temperature".asInstanceOf[`imprinter-under-temperature`]
  @scala.inline
  def `imprinter-unrecoverable-failure`: `imprinter-unrecoverable-failure` = "imprinter-unrecoverable-failure".asInstanceOf[`imprinter-unrecoverable-failure`]
  @scala.inline
  def `imprinter-unrecoverable-storage-error`: `imprinter-unrecoverable-storage-error` = "imprinter-unrecoverable-storage-error".asInstanceOf[`imprinter-unrecoverable-storage-error`]
  @scala.inline
  def `imprinter-warming-up`: `imprinter-warming-up` = "imprinter-warming-up".asInstanceOf[`imprinter-warming-up`]
  @scala.inline
  def `in-fill`: `in-fill` = "in-fill".asInstanceOf[`in-fill`]
  @scala.inline
  def inactivity: inactivity = "inactivity".asInstanceOf[inactivity]
  @scala.inline
  def incoming: incoming = "incoming".asInstanceOf[incoming]
  @scala.inline
  def indefinite: indefinite = "indefinite".asInstanceOf[indefinite]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def `infrastructure-printer`: `infrastructure-printer` = "infrastructure-printer".asInstanceOf[`infrastructure-printer`]
  @scala.inline
  def `input-attributes-actual`: `input-attributes-actual` = "input-attributes-actual".asInstanceOf[`input-attributes-actual`]
  @scala.inline
  def `input-attributes-default`: `input-attributes-default` = "input-attributes-default".asInstanceOf[`input-attributes-default`]
  @scala.inline
  def `input-attributes-supported`: `input-attributes-supported` = "input-attributes-supported".asInstanceOf[`input-attributes-supported`]
  @scala.inline
  def `input-cannot-feed-size-selected`: `input-cannot-feed-size-selected` = "input-cannot-feed-size-selected".asInstanceOf[`input-cannot-feed-size-selected`]
  @scala.inline
  def `input-color-mode-supported`: `input-color-mode-supported` = "input-color-mode-supported".asInstanceOf[`input-color-mode-supported`]
  @scala.inline
  def `input-content-type-supported`: `input-content-type-supported` = "input-content-type-supported".asInstanceOf[`input-content-type-supported`]
  @scala.inline
  def `input-film-scan-mode-supported`: `input-film-scan-mode-supported` = "input-film-scan-mode-supported".asInstanceOf[`input-film-scan-mode-supported`]
  @scala.inline
  def `input-manual-input-request`: `input-manual-input-request` = "input-manual-input-request".asInstanceOf[`input-manual-input-request`]
  @scala.inline
  def `input-media-color-change`: `input-media-color-change` = "input-media-color-change".asInstanceOf[`input-media-color-change`]
  @scala.inline
  def `input-media-form-parts-change`: `input-media-form-parts-change` = "input-media-form-parts-change".asInstanceOf[`input-media-form-parts-change`]
  @scala.inline
  def `input-media-size-change`: `input-media-size-change` = "input-media-size-change".asInstanceOf[`input-media-size-change`]
  @scala.inline
  def `input-media-supported`: `input-media-supported` = "input-media-supported".asInstanceOf[`input-media-supported`]
  @scala.inline
  def `input-media-type-change`: `input-media-type-change` = "input-media-type-change".asInstanceOf[`input-media-type-change`]
  @scala.inline
  def `input-media-weight-change`: `input-media-weight-change` = "input-media-weight-change".asInstanceOf[`input-media-weight-change`]
  @scala.inline
  def `input-orientation-requested-supported`: `input-orientation-requested-supported` = "input-orientation-requested-supported".asInstanceOf[`input-orientation-requested-supported`]
  @scala.inline
  def `input-quality-supported`: `input-quality-supported` = "input-quality-supported".asInstanceOf[`input-quality-supported`]
  @scala.inline
  def `input-resolution-supported`: `input-resolution-supported` = "input-resolution-supported".asInstanceOf[`input-resolution-supported`]
  @scala.inline
  def `input-scan-regions-supported`: `input-scan-regions-supported` = "input-scan-regions-supported".asInstanceOf[`input-scan-regions-supported`]
  @scala.inline
  def `input-sides-supported`: `input-sides-supported` = "input-sides-supported".asInstanceOf[`input-sides-supported`]
  @scala.inline
  def `input-source-supported`: `input-source-supported` = "input-source-supported".asInstanceOf[`input-source-supported`]
  @scala.inline
  def `input-tray-elevation-failure`: `input-tray-elevation-failure` = "input-tray-elevation-failure".asInstanceOf[`input-tray-elevation-failure`]
  @scala.inline
  def `input-tray-missing`: `input-tray-missing` = "input-tray-missing".asInstanceOf[`input-tray-missing`]
  @scala.inline
  def `input-tray-position-failure`: `input-tray-position-failure` = "input-tray-position-failure".asInstanceOf[`input-tray-position-failure`]
  @scala.inline
  def `insert-after-page-number`: `insert-after-page-number` = "insert-after-page-number".asInstanceOf[`insert-after-page-number`]
  @scala.inline
  def `insert-after-page-number-supported`: `insert-after-page-number-supported` = "insert-after-page-number-supported".asInstanceOf[`insert-after-page-number-supported`]
  @scala.inline
  def `insert-count`: `insert-count` = "insert-count".asInstanceOf[`insert-count`]
  @scala.inline
  def `insert-count-supported`: `insert-count-supported` = "insert-count-supported".asInstanceOf[`insert-count-supported`]
  @scala.inline
  def `insert-sheet`: `insert-sheet` = "insert-sheet".asInstanceOf[`insert-sheet`]
  @scala.inline
  def `insert-sheet-actual`: `insert-sheet-actual` = "insert-sheet-actual".asInstanceOf[`insert-sheet-actual`]
  @scala.inline
  def `insert-sheet-default`: `insert-sheet-default` = "insert-sheet-default".asInstanceOf[`insert-sheet-default`]
  @scala.inline
  def `insert-sheet-supported`: `insert-sheet-supported` = "insert-sheet-supported".asInstanceOf[`insert-sheet-supported`]
  @scala.inline
  def `inserter-added`: `inserter-added` = "inserter-added".asInstanceOf[`inserter-added`]
  @scala.inline
  def `inserter-almost-empty`: `inserter-almost-empty` = "inserter-almost-empty".asInstanceOf[`inserter-almost-empty`]
  @scala.inline
  def `inserter-almost-full`: `inserter-almost-full` = "inserter-almost-full".asInstanceOf[`inserter-almost-full`]
  @scala.inline
  def `inserter-at-limit`: `inserter-at-limit` = "inserter-at-limit".asInstanceOf[`inserter-at-limit`]
  @scala.inline
  def `inserter-closed`: `inserter-closed` = "inserter-closed".asInstanceOf[`inserter-closed`]
  @scala.inline
  def `inserter-configuration-change`: `inserter-configuration-change` = "inserter-configuration-change".asInstanceOf[`inserter-configuration-change`]
  @scala.inline
  def `inserter-cover-closed`: `inserter-cover-closed` = "inserter-cover-closed".asInstanceOf[`inserter-cover-closed`]
  @scala.inline
  def `inserter-cover-open`: `inserter-cover-open` = "inserter-cover-open".asInstanceOf[`inserter-cover-open`]
  @scala.inline
  def `inserter-empty`: `inserter-empty` = "inserter-empty".asInstanceOf[`inserter-empty`]
  @scala.inline
  def `inserter-full`: `inserter-full` = "inserter-full".asInstanceOf[`inserter-full`]
  @scala.inline
  def `inserter-interlock-closed`: `inserter-interlock-closed` = "inserter-interlock-closed".asInstanceOf[`inserter-interlock-closed`]
  @scala.inline
  def `inserter-interlock-open`: `inserter-interlock-open` = "inserter-interlock-open".asInstanceOf[`inserter-interlock-open`]
  @scala.inline
  def `inserter-jam`: `inserter-jam` = "inserter-jam".asInstanceOf[`inserter-jam`]
  @scala.inline
  def `inserter-life-almost-over`: `inserter-life-almost-over` = "inserter-life-almost-over".asInstanceOf[`inserter-life-almost-over`]
  @scala.inline
  def `inserter-life-over`: `inserter-life-over` = "inserter-life-over".asInstanceOf[`inserter-life-over`]
  @scala.inline
  def `inserter-memory-exhausted`: `inserter-memory-exhausted` = "inserter-memory-exhausted".asInstanceOf[`inserter-memory-exhausted`]
  @scala.inline
  def `inserter-missing`: `inserter-missing` = "inserter-missing".asInstanceOf[`inserter-missing`]
  @scala.inline
  def `inserter-motor-failure`: `inserter-motor-failure` = "inserter-motor-failure".asInstanceOf[`inserter-motor-failure`]
  @scala.inline
  def `inserter-near-limit`: `inserter-near-limit` = "inserter-near-limit".asInstanceOf[`inserter-near-limit`]
  @scala.inline
  def `inserter-offline`: `inserter-offline` = "inserter-offline".asInstanceOf[`inserter-offline`]
  @scala.inline
  def `inserter-opened`: `inserter-opened` = "inserter-opened".asInstanceOf[`inserter-opened`]
  @scala.inline
  def `inserter-over-temperature`: `inserter-over-temperature` = "inserter-over-temperature".asInstanceOf[`inserter-over-temperature`]
  @scala.inline
  def `inserter-power-saver`: `inserter-power-saver` = "inserter-power-saver".asInstanceOf[`inserter-power-saver`]
  @scala.inline
  def `inserter-recoverable-failure`: `inserter-recoverable-failure` = "inserter-recoverable-failure".asInstanceOf[`inserter-recoverable-failure`]
  @scala.inline
  def `inserter-recoverable-storage-error`: `inserter-recoverable-storage-error` = "inserter-recoverable-storage-error".asInstanceOf[`inserter-recoverable-storage-error`]
  @scala.inline
  def `inserter-removed`: `inserter-removed` = "inserter-removed".asInstanceOf[`inserter-removed`]
  @scala.inline
  def `inserter-resource-added`: `inserter-resource-added` = "inserter-resource-added".asInstanceOf[`inserter-resource-added`]
  @scala.inline
  def `inserter-resource-removed`: `inserter-resource-removed` = "inserter-resource-removed".asInstanceOf[`inserter-resource-removed`]
  @scala.inline
  def `inserter-thermistor-failure`: `inserter-thermistor-failure` = "inserter-thermistor-failure".asInstanceOf[`inserter-thermistor-failure`]
  @scala.inline
  def `inserter-timing-failure`: `inserter-timing-failure` = "inserter-timing-failure".asInstanceOf[`inserter-timing-failure`]
  @scala.inline
  def `inserter-turned-off`: `inserter-turned-off` = "inserter-turned-off".asInstanceOf[`inserter-turned-off`]
  @scala.inline
  def `inserter-turned-on`: `inserter-turned-on` = "inserter-turned-on".asInstanceOf[`inserter-turned-on`]
  @scala.inline
  def `inserter-under-temperature`: `inserter-under-temperature` = "inserter-under-temperature".asInstanceOf[`inserter-under-temperature`]
  @scala.inline
  def `inserter-unrecoverable-failure`: `inserter-unrecoverable-failure` = "inserter-unrecoverable-failure".asInstanceOf[`inserter-unrecoverable-failure`]
  @scala.inline
  def `inserter-unrecoverable-storage-error`: `inserter-unrecoverable-storage-error` = "inserter-unrecoverable-storage-error".asInstanceOf[`inserter-unrecoverable-storage-error`]
  @scala.inline
  def `inserter-warming-up`: `inserter-warming-up` = "inserter-warming-up".asInstanceOf[`inserter-warming-up`]
  @scala.inline
  def installed: installed = "installed".asInstanceOf[installed]
  @scala.inline
  def `interlock-closed`: `interlock-closed` = "interlock-closed".asInstanceOf[`interlock-closed`]
  @scala.inline
  def `interlock-open`: `interlock-open` = "interlock-open".asInstanceOf[`interlock-open`]
  @scala.inline
  def `interpreter-cartridge-added`: `interpreter-cartridge-added` = "interpreter-cartridge-added".asInstanceOf[`interpreter-cartridge-added`]
  @scala.inline
  def `interpreter-cartridge-deleted`: `interpreter-cartridge-deleted` = "interpreter-cartridge-deleted".asInstanceOf[`interpreter-cartridge-deleted`]
  @scala.inline
  def `interpreter-complex-page-encountered`: `interpreter-complex-page-encountered` = "interpreter-complex-page-encountered".asInstanceOf[`interpreter-complex-page-encountered`]
  @scala.inline
  def `interpreter-memory-decrease`: `interpreter-memory-decrease` = "interpreter-memory-decrease".asInstanceOf[`interpreter-memory-decrease`]
  @scala.inline
  def `interpreter-memory-increase`: `interpreter-memory-increase` = "interpreter-memory-increase".asInstanceOf[`interpreter-memory-increase`]
  @scala.inline
  def `interpreter-resource-added`: `interpreter-resource-added` = "interpreter-resource-added".asInstanceOf[`interpreter-resource-added`]
  @scala.inline
  def `interpreter-resource-deleted`: `interpreter-resource-deleted` = "interpreter-resource-deleted".asInstanceOf[`interpreter-resource-deleted`]
  @scala.inline
  def `interpreter-resource-unavailable`: `interpreter-resource-unavailable` = "interpreter-resource-unavailable".asInstanceOf[`interpreter-resource-unavailable`]
  @scala.inline
  def interpreting: interpreting = "interpreting".asInstanceOf[interpreting]
  @scala.inline
  def invoice: invoice = "invoice".asInstanceOf[invoice]
  @scala.inline
  def `invoice-white`: `invoice-white` = "invoice-white".asInstanceOf[`invoice-white`]
  @scala.inline
  def inward: inward = "inward".asInstanceOf[inward]
  @scala.inline
  def iotdisco: iotdisco = "iotdisco".asInstanceOf[iotdisco]
  @scala.inline
  def ipn: ipn = "ipn".asInstanceOf[ipn]
  @scala.inline
  def ipp: ipp = "ipp".asInstanceOf[ipp]
  @scala.inline
  def `ipp-3d`: `ipp-3d` = "ipp-3d".asInstanceOf[`ipp-3d`]
  @scala.inline
  def `ipp-everywhere`: `ipp-everywhere` = "ipp-everywhere".asInstanceOf[`ipp-everywhere`]
  @scala.inline
  def `ipp-features-supported`: `ipp-features-supported` = "ipp-features-supported".asInstanceOf[`ipp-features-supported`]
  @scala.inline
  def `ipp-versions-supported`: `ipp-versions-supported` = "ipp-versions-supported".asInstanceOf[`ipp-versions-supported`]
  @scala.inline
  def ippget: ippget = "ippget".asInstanceOf[ippget]
  @scala.inline
  def `ippget-event-life`: `ippget-event-life` = "ippget-event-life".asInstanceOf[`ippget-event-life`]
  @scala.inline
  def ipps: ipps = "ipps".asInstanceOf[ipps]
  @scala.inline
  def irc: irc = "irc".asInstanceOf[irc]
  @scala.inline
  def irc6: irc6 = "irc6".asInstanceOf[irc6]
  @scala.inline
  def ircs: ircs = "ircs".asInstanceOf[ircs]
  @scala.inline
  def iris: iris = "iris".asInstanceOf[iris]
  @scala.inline
  def irisDotbeep: irisDotbeep = "iris.beep".asInstanceOf[irisDotbeep]
  @scala.inline
  def irisDotlwz: irisDotlwz = "iris.lwz".asInstanceOf[irisDotlwz]
  @scala.inline
  def irisDotxpc: irisDotxpc = "iris.xpc".asInstanceOf[irisDotxpc]
  @scala.inline
  def irisDotxpcs: irisDotxpcs = "iris.xpcs".asInstanceOf[irisDotxpcs]
  @scala.inline
  def `iso-15930-1_2001`: `iso-15930-1_2001` = "iso-15930-1_2001".asInstanceOf[`iso-15930-1_2001`]
  @scala.inline
  def `iso-15930-3_2002`: `iso-15930-3_2002` = "iso-15930-3_2002".asInstanceOf[`iso-15930-3_2002`]
  @scala.inline
  def `iso-15930-4_2003`: `iso-15930-4_2003` = "iso-15930-4_2003".asInstanceOf[`iso-15930-4_2003`]
  @scala.inline
  def `iso-15930-6_2003`: `iso-15930-6_2003` = "iso-15930-6_2003".asInstanceOf[`iso-15930-6_2003`]
  @scala.inline
  def `iso-15930-7_2010`: `iso-15930-7_2010` = "iso-15930-7_2010".asInstanceOf[`iso-15930-7_2010`]
  @scala.inline
  def `iso-15930-8_2010`: `iso-15930-8_2010` = "iso-15930-8_2010".asInstanceOf[`iso-15930-8_2010`]
  @scala.inline
  def `iso-16612-2_2010`: `iso-16612-2_2010` = "iso-16612-2_2010".asInstanceOf[`iso-16612-2_2010`]
  @scala.inline
  def `iso-19005-1_2005`: `iso-19005-1_2005` = "iso-19005-1_2005".asInstanceOf[`iso-19005-1_2005`]
  @scala.inline
  def `iso-19005-2_2011`: `iso-19005-2_2011` = "iso-19005-2_2011".asInstanceOf[`iso-19005-2_2011`]
  @scala.inline
  def `iso-19005-3_2012`: `iso-19005-3_2012` = "iso-19005-3_2012".asInstanceOf[`iso-19005-3_2012`]
  @scala.inline
  def `iso-2022-jp`: `iso-2022-jp` = "iso-2022-jp".asInstanceOf[`iso-2022-jp`]
  @scala.inline
  def `iso-2022-kr`: `iso-2022-kr` = "iso-2022-kr".asInstanceOf[`iso-2022-kr`]
  @scala.inline
  def `iso-32000-1_2008`: `iso-32000-1_2008` = "iso-32000-1_2008".asInstanceOf[`iso-32000-1_2008`]
  @scala.inline
  def `iso-8859-1`: `iso-8859-1` = "iso-8859-1".asInstanceOf[`iso-8859-1`]
  @scala.inline
  def `iso-8859-15`: `iso-8859-15` = "iso-8859-15".asInstanceOf[`iso-8859-15`]
  @scala.inline
  def `iso-8859-2`: `iso-8859-2` = "iso-8859-2".asInstanceOf[`iso-8859-2`]
  @scala.inline
  def `iso-8859-3`: `iso-8859-3` = "iso-8859-3".asInstanceOf[`iso-8859-3`]
  @scala.inline
  def `iso-8859-4`: `iso-8859-4` = "iso-8859-4".asInstanceOf[`iso-8859-4`]
  @scala.inline
  def `iso-8859-5`: `iso-8859-5` = "iso-8859-5".asInstanceOf[`iso-8859-5`]
  @scala.inline
  def `iso-8859-6`: `iso-8859-6` = "iso-8859-6".asInstanceOf[`iso-8859-6`]
  @scala.inline
  def `iso-8859-7`: `iso-8859-7` = "iso-8859-7".asInstanceOf[`iso-8859-7`]
  @scala.inline
  def `iso-8859-8`: `iso-8859-8` = "iso-8859-8".asInstanceOf[`iso-8859-8`]
  @scala.inline
  def `iso-8859-8-i`: `iso-8859-8-i` = "iso-8859-8-i".asInstanceOf[`iso-8859-8-i`]
  @scala.inline
  def `iso-8859-9`: `iso-8859-9` = "iso-8859-9".asInstanceOf[`iso-8859-9`]
  @scala.inline
  def `iso-a0`: `iso-a0` = "iso-a0".asInstanceOf[`iso-a0`]
  @scala.inline
  def `iso-a0-translucent`: `iso-a0-translucent` = "iso-a0-translucent".asInstanceOf[`iso-a0-translucent`]
  @scala.inline
  def `iso-a0-transparent`: `iso-a0-transparent` = "iso-a0-transparent".asInstanceOf[`iso-a0-transparent`]
  @scala.inline
  def `iso-a0-white`: `iso-a0-white` = "iso-a0-white".asInstanceOf[`iso-a0-white`]
  @scala.inline
  def `iso-a0xsynchro-translucent`: `iso-a0xsynchro-translucent` = "iso-a0xsynchro-translucent".asInstanceOf[`iso-a0xsynchro-translucent`]
  @scala.inline
  def `iso-a0xsynchro-transparent`: `iso-a0xsynchro-transparent` = "iso-a0xsynchro-transparent".asInstanceOf[`iso-a0xsynchro-transparent`]
  @scala.inline
  def `iso-a0xsynchro-white`: `iso-a0xsynchro-white` = "iso-a0xsynchro-white".asInstanceOf[`iso-a0xsynchro-white`]
  @scala.inline
  def `iso-a1`: `iso-a1` = "iso-a1".asInstanceOf[`iso-a1`]
  @scala.inline
  def `iso-a1-translucent`: `iso-a1-translucent` = "iso-a1-translucent".asInstanceOf[`iso-a1-translucent`]
  @scala.inline
  def `iso-a1-transparent`: `iso-a1-transparent` = "iso-a1-transparent".asInstanceOf[`iso-a1-transparent`]
  @scala.inline
  def `iso-a1-white`: `iso-a1-white` = "iso-a1-white".asInstanceOf[`iso-a1-white`]
  @scala.inline
  def `iso-a10`: `iso-a10` = "iso-a10".asInstanceOf[`iso-a10`]
  @scala.inline
  def `iso-a10-white`: `iso-a10-white` = "iso-a10-white".asInstanceOf[`iso-a10-white`]
  @scala.inline
  def `iso-a1x3-translucent`: `iso-a1x3-translucent` = "iso-a1x3-translucent".asInstanceOf[`iso-a1x3-translucent`]
  @scala.inline
  def `iso-a1x3-transparent`: `iso-a1x3-transparent` = "iso-a1x3-transparent".asInstanceOf[`iso-a1x3-transparent`]
  @scala.inline
  def `iso-a1x3-white`: `iso-a1x3-white` = "iso-a1x3-white".asInstanceOf[`iso-a1x3-white`]
  @scala.inline
  def `iso-a1x4-translucent`: `iso-a1x4-translucent` = "iso-a1x4-translucent".asInstanceOf[`iso-a1x4-translucent`]
  @scala.inline
  def `iso-a1x4-transparent`: `iso-a1x4-transparent` = "iso-a1x4-transparent".asInstanceOf[`iso-a1x4-transparent`]
  @scala.inline
  def `iso-a1x4-white`: `iso-a1x4-white` = "iso-a1x4-white".asInstanceOf[`iso-a1x4-white`]
  @scala.inline
  def `iso-a1xsynchro-translucent`: `iso-a1xsynchro-translucent` = "iso-a1xsynchro-translucent".asInstanceOf[`iso-a1xsynchro-translucent`]
  @scala.inline
  def `iso-a1xsynchro-transparent`: `iso-a1xsynchro-transparent` = "iso-a1xsynchro-transparent".asInstanceOf[`iso-a1xsynchro-transparent`]
  @scala.inline
  def `iso-a1xsynchro-white`: `iso-a1xsynchro-white` = "iso-a1xsynchro-white".asInstanceOf[`iso-a1xsynchro-white`]
  @scala.inline
  def `iso-a2`: `iso-a2` = "iso-a2".asInstanceOf[`iso-a2`]
  @scala.inline
  def `iso-a2-translucent`: `iso-a2-translucent` = "iso-a2-translucent".asInstanceOf[`iso-a2-translucent`]
  @scala.inline
  def `iso-a2-transparent`: `iso-a2-transparent` = "iso-a2-transparent".asInstanceOf[`iso-a2-transparent`]
  @scala.inline
  def `iso-a2-white`: `iso-a2-white` = "iso-a2-white".asInstanceOf[`iso-a2-white`]
  @scala.inline
  def `iso-a2x3-translucent`: `iso-a2x3-translucent` = "iso-a2x3-translucent".asInstanceOf[`iso-a2x3-translucent`]
  @scala.inline
  def `iso-a2x3-transparent`: `iso-a2x3-transparent` = "iso-a2x3-transparent".asInstanceOf[`iso-a2x3-transparent`]
  @scala.inline
  def `iso-a2x3-white`: `iso-a2x3-white` = "iso-a2x3-white".asInstanceOf[`iso-a2x3-white`]
  @scala.inline
  def `iso-a2x4-translucent`: `iso-a2x4-translucent` = "iso-a2x4-translucent".asInstanceOf[`iso-a2x4-translucent`]
  @scala.inline
  def `iso-a2x4-transparent`: `iso-a2x4-transparent` = "iso-a2x4-transparent".asInstanceOf[`iso-a2x4-transparent`]
  @scala.inline
  def `iso-a2x4-white`: `iso-a2x4-white` = "iso-a2x4-white".asInstanceOf[`iso-a2x4-white`]
  @scala.inline
  def `iso-a2x5-translucent`: `iso-a2x5-translucent` = "iso-a2x5-translucent".asInstanceOf[`iso-a2x5-translucent`]
  @scala.inline
  def `iso-a2x5-transparent`: `iso-a2x5-transparent` = "iso-a2x5-transparent".asInstanceOf[`iso-a2x5-transparent`]
  @scala.inline
  def `iso-a2x5-white`: `iso-a2x5-white` = "iso-a2x5-white".asInstanceOf[`iso-a2x5-white`]
  @scala.inline
  def `iso-a2xsynchro-translucent`: `iso-a2xsynchro-translucent` = "iso-a2xsynchro-translucent".asInstanceOf[`iso-a2xsynchro-translucent`]
  @scala.inline
  def `iso-a2xsynchro-transparent`: `iso-a2xsynchro-transparent` = "iso-a2xsynchro-transparent".asInstanceOf[`iso-a2xsynchro-transparent`]
  @scala.inline
  def `iso-a2xsynchro-white`: `iso-a2xsynchro-white` = "iso-a2xsynchro-white".asInstanceOf[`iso-a2xsynchro-white`]
  @scala.inline
  def `iso-a3`: `iso-a3` = "iso-a3".asInstanceOf[`iso-a3`]
  @scala.inline
  def `iso-a3-colored`: `iso-a3-colored` = "iso-a3-colored".asInstanceOf[`iso-a3-colored`]
  @scala.inline
  def `iso-a3-translucent`: `iso-a3-translucent` = "iso-a3-translucent".asInstanceOf[`iso-a3-translucent`]
  @scala.inline
  def `iso-a3-transparent`: `iso-a3-transparent` = "iso-a3-transparent".asInstanceOf[`iso-a3-transparent`]
  @scala.inline
  def `iso-a3-white`: `iso-a3-white` = "iso-a3-white".asInstanceOf[`iso-a3-white`]
  @scala.inline
  def `iso-a3x3-translucent`: `iso-a3x3-translucent` = "iso-a3x3-translucent".asInstanceOf[`iso-a3x3-translucent`]
  @scala.inline
  def `iso-a3x3-transparent`: `iso-a3x3-transparent` = "iso-a3x3-transparent".asInstanceOf[`iso-a3x3-transparent`]
  @scala.inline
  def `iso-a3x3-white`: `iso-a3x3-white` = "iso-a3x3-white".asInstanceOf[`iso-a3x3-white`]
  @scala.inline
  def `iso-a3x4-translucent`: `iso-a3x4-translucent` = "iso-a3x4-translucent".asInstanceOf[`iso-a3x4-translucent`]
  @scala.inline
  def `iso-a3x4-transparent`: `iso-a3x4-transparent` = "iso-a3x4-transparent".asInstanceOf[`iso-a3x4-transparent`]
  @scala.inline
  def `iso-a3x4-white`: `iso-a3x4-white` = "iso-a3x4-white".asInstanceOf[`iso-a3x4-white`]
  @scala.inline
  def `iso-a3x5-translucent`: `iso-a3x5-translucent` = "iso-a3x5-translucent".asInstanceOf[`iso-a3x5-translucent`]
  @scala.inline
  def `iso-a3x5-transparent`: `iso-a3x5-transparent` = "iso-a3x5-transparent".asInstanceOf[`iso-a3x5-transparent`]
  @scala.inline
  def `iso-a3x5-white`: `iso-a3x5-white` = "iso-a3x5-white".asInstanceOf[`iso-a3x5-white`]
  @scala.inline
  def `iso-a3x6-translucent`: `iso-a3x6-translucent` = "iso-a3x6-translucent".asInstanceOf[`iso-a3x6-translucent`]
  @scala.inline
  def `iso-a3x6-transparent`: `iso-a3x6-transparent` = "iso-a3x6-transparent".asInstanceOf[`iso-a3x6-transparent`]
  @scala.inline
  def `iso-a3x6-white`: `iso-a3x6-white` = "iso-a3x6-white".asInstanceOf[`iso-a3x6-white`]
  @scala.inline
  def `iso-a3x7-translucent`: `iso-a3x7-translucent` = "iso-a3x7-translucent".asInstanceOf[`iso-a3x7-translucent`]
  @scala.inline
  def `iso-a3x7-transparent`: `iso-a3x7-transparent` = "iso-a3x7-transparent".asInstanceOf[`iso-a3x7-transparent`]
  @scala.inline
  def `iso-a3x7-white`: `iso-a3x7-white` = "iso-a3x7-white".asInstanceOf[`iso-a3x7-white`]
  @scala.inline
  def `iso-a3xsynchro-translucent`: `iso-a3xsynchro-translucent` = "iso-a3xsynchro-translucent".asInstanceOf[`iso-a3xsynchro-translucent`]
  @scala.inline
  def `iso-a3xsynchro-transparent`: `iso-a3xsynchro-transparent` = "iso-a3xsynchro-transparent".asInstanceOf[`iso-a3xsynchro-transparent`]
  @scala.inline
  def `iso-a3xsynchro-white`: `iso-a3xsynchro-white` = "iso-a3xsynchro-white".asInstanceOf[`iso-a3xsynchro-white`]
  @scala.inline
  def `iso-a4`: `iso-a4` = "iso-a4".asInstanceOf[`iso-a4`]
  @scala.inline
  def `iso-a4-colored`: `iso-a4-colored` = "iso-a4-colored".asInstanceOf[`iso-a4-colored`]
  @scala.inline
  def `iso-a4-translucent`: `iso-a4-translucent` = "iso-a4-translucent".asInstanceOf[`iso-a4-translucent`]
  @scala.inline
  def `iso-a4-transparent`: `iso-a4-transparent` = "iso-a4-transparent".asInstanceOf[`iso-a4-transparent`]
  @scala.inline
  def `iso-a4-white`: `iso-a4-white` = "iso-a4-white".asInstanceOf[`iso-a4-white`]
  @scala.inline
  def `iso-a4x3-translucent`: `iso-a4x3-translucent` = "iso-a4x3-translucent".asInstanceOf[`iso-a4x3-translucent`]
  @scala.inline
  def `iso-a4x3-transparent`: `iso-a4x3-transparent` = "iso-a4x3-transparent".asInstanceOf[`iso-a4x3-transparent`]
  @scala.inline
  def `iso-a4x3-white`: `iso-a4x3-white` = "iso-a4x3-white".asInstanceOf[`iso-a4x3-white`]
  @scala.inline
  def `iso-a4x4-translucent`: `iso-a4x4-translucent` = "iso-a4x4-translucent".asInstanceOf[`iso-a4x4-translucent`]
  @scala.inline
  def `iso-a4x4-transparent`: `iso-a4x4-transparent` = "iso-a4x4-transparent".asInstanceOf[`iso-a4x4-transparent`]
  @scala.inline
  def `iso-a4x4-white`: `iso-a4x4-white` = "iso-a4x4-white".asInstanceOf[`iso-a4x4-white`]
  @scala.inline
  def `iso-a4x5-translucent`: `iso-a4x5-translucent` = "iso-a4x5-translucent".asInstanceOf[`iso-a4x5-translucent`]
  @scala.inline
  def `iso-a4x5-transparent`: `iso-a4x5-transparent` = "iso-a4x5-transparent".asInstanceOf[`iso-a4x5-transparent`]
  @scala.inline
  def `iso-a4x5-white`: `iso-a4x5-white` = "iso-a4x5-white".asInstanceOf[`iso-a4x5-white`]
  @scala.inline
  def `iso-a4x6-translucent`: `iso-a4x6-translucent` = "iso-a4x6-translucent".asInstanceOf[`iso-a4x6-translucent`]
  @scala.inline
  def `iso-a4x6-transparent`: `iso-a4x6-transparent` = "iso-a4x6-transparent".asInstanceOf[`iso-a4x6-transparent`]
  @scala.inline
  def `iso-a4x6-white`: `iso-a4x6-white` = "iso-a4x6-white".asInstanceOf[`iso-a4x6-white`]
  @scala.inline
  def `iso-a4x7-translucent`: `iso-a4x7-translucent` = "iso-a4x7-translucent".asInstanceOf[`iso-a4x7-translucent`]
  @scala.inline
  def `iso-a4x7-transparent`: `iso-a4x7-transparent` = "iso-a4x7-transparent".asInstanceOf[`iso-a4x7-transparent`]
  @scala.inline
  def `iso-a4x7-white`: `iso-a4x7-white` = "iso-a4x7-white".asInstanceOf[`iso-a4x7-white`]
  @scala.inline
  def `iso-a4x8-translucent`: `iso-a4x8-translucent` = "iso-a4x8-translucent".asInstanceOf[`iso-a4x8-translucent`]
  @scala.inline
  def `iso-a4x8-transparent`: `iso-a4x8-transparent` = "iso-a4x8-transparent".asInstanceOf[`iso-a4x8-transparent`]
  @scala.inline
  def `iso-a4x8-white`: `iso-a4x8-white` = "iso-a4x8-white".asInstanceOf[`iso-a4x8-white`]
  @scala.inline
  def `iso-a4x9-translucent`: `iso-a4x9-translucent` = "iso-a4x9-translucent".asInstanceOf[`iso-a4x9-translucent`]
  @scala.inline
  def `iso-a4x9-transparent`: `iso-a4x9-transparent` = "iso-a4x9-transparent".asInstanceOf[`iso-a4x9-transparent`]
  @scala.inline
  def `iso-a4x9-white`: `iso-a4x9-white` = "iso-a4x9-white".asInstanceOf[`iso-a4x9-white`]
  @scala.inline
  def `iso-a4xsynchro-translucent`: `iso-a4xsynchro-translucent` = "iso-a4xsynchro-translucent".asInstanceOf[`iso-a4xsynchro-translucent`]
  @scala.inline
  def `iso-a4xsynchro-transparent`: `iso-a4xsynchro-transparent` = "iso-a4xsynchro-transparent".asInstanceOf[`iso-a4xsynchro-transparent`]
  @scala.inline
  def `iso-a4xsynchro-white`: `iso-a4xsynchro-white` = "iso-a4xsynchro-white".asInstanceOf[`iso-a4xsynchro-white`]
  @scala.inline
  def `iso-a5`: `iso-a5` = "iso-a5".asInstanceOf[`iso-a5`]
  @scala.inline
  def `iso-a5-colored`: `iso-a5-colored` = "iso-a5-colored".asInstanceOf[`iso-a5-colored`]
  @scala.inline
  def `iso-a5-translucent`: `iso-a5-translucent` = "iso-a5-translucent".asInstanceOf[`iso-a5-translucent`]
  @scala.inline
  def `iso-a5-transparent`: `iso-a5-transparent` = "iso-a5-transparent".asInstanceOf[`iso-a5-transparent`]
  @scala.inline
  def `iso-a5-white`: `iso-a5-white` = "iso-a5-white".asInstanceOf[`iso-a5-white`]
  @scala.inline
  def `iso-a6`: `iso-a6` = "iso-a6".asInstanceOf[`iso-a6`]
  @scala.inline
  def `iso-a6-white`: `iso-a6-white` = "iso-a6-white".asInstanceOf[`iso-a6-white`]
  @scala.inline
  def `iso-a7`: `iso-a7` = "iso-a7".asInstanceOf[`iso-a7`]
  @scala.inline
  def `iso-a7-white`: `iso-a7-white` = "iso-a7-white".asInstanceOf[`iso-a7-white`]
  @scala.inline
  def `iso-a8`: `iso-a8` = "iso-a8".asInstanceOf[`iso-a8`]
  @scala.inline
  def `iso-a8-white`: `iso-a8-white` = "iso-a8-white".asInstanceOf[`iso-a8-white`]
  @scala.inline
  def `iso-a9`: `iso-a9` = "iso-a9".asInstanceOf[`iso-a9`]
  @scala.inline
  def `iso-a9-white`: `iso-a9-white` = "iso-a9-white".asInstanceOf[`iso-a9-white`]
  @scala.inline
  def `iso-b0`: `iso-b0` = "iso-b0".asInstanceOf[`iso-b0`]
  @scala.inline
  def `iso-b0-white`: `iso-b0-white` = "iso-b0-white".asInstanceOf[`iso-b0-white`]
  @scala.inline
  def `iso-b1`: `iso-b1` = "iso-b1".asInstanceOf[`iso-b1`]
  @scala.inline
  def `iso-b1-white`: `iso-b1-white` = "iso-b1-white".asInstanceOf[`iso-b1-white`]
  @scala.inline
  def `iso-b10`: `iso-b10` = "iso-b10".asInstanceOf[`iso-b10`]
  @scala.inline
  def `iso-b10-white`: `iso-b10-white` = "iso-b10-white".asInstanceOf[`iso-b10-white`]
  @scala.inline
  def `iso-b2`: `iso-b2` = "iso-b2".asInstanceOf[`iso-b2`]
  @scala.inline
  def `iso-b2-white`: `iso-b2-white` = "iso-b2-white".asInstanceOf[`iso-b2-white`]
  @scala.inline
  def `iso-b3`: `iso-b3` = "iso-b3".asInstanceOf[`iso-b3`]
  @scala.inline
  def `iso-b3-white`: `iso-b3-white` = "iso-b3-white".asInstanceOf[`iso-b3-white`]
  @scala.inline
  def `iso-b4`: `iso-b4` = "iso-b4".asInstanceOf[`iso-b4`]
  @scala.inline
  def `iso-b4-colored`: `iso-b4-colored` = "iso-b4-colored".asInstanceOf[`iso-b4-colored`]
  @scala.inline
  def `iso-b4-envelope`: `iso-b4-envelope` = "iso-b4-envelope".asInstanceOf[`iso-b4-envelope`]
  @scala.inline
  def `iso-b4-white`: `iso-b4-white` = "iso-b4-white".asInstanceOf[`iso-b4-white`]
  @scala.inline
  def `iso-b5`: `iso-b5` = "iso-b5".asInstanceOf[`iso-b5`]
  @scala.inline
  def `iso-b5-colored`: `iso-b5-colored` = "iso-b5-colored".asInstanceOf[`iso-b5-colored`]
  @scala.inline
  def `iso-b5-envelope`: `iso-b5-envelope` = "iso-b5-envelope".asInstanceOf[`iso-b5-envelope`]
  @scala.inline
  def `iso-b5-white`: `iso-b5-white` = "iso-b5-white".asInstanceOf[`iso-b5-white`]
  @scala.inline
  def `iso-b6`: `iso-b6` = "iso-b6".asInstanceOf[`iso-b6`]
  @scala.inline
  def `iso-b6-white`: `iso-b6-white` = "iso-b6-white".asInstanceOf[`iso-b6-white`]
  @scala.inline
  def `iso-b7`: `iso-b7` = "iso-b7".asInstanceOf[`iso-b7`]
  @scala.inline
  def `iso-b7-white`: `iso-b7-white` = "iso-b7-white".asInstanceOf[`iso-b7-white`]
  @scala.inline
  def `iso-b8`: `iso-b8` = "iso-b8".asInstanceOf[`iso-b8`]
  @scala.inline
  def `iso-b8-white`: `iso-b8-white` = "iso-b8-white".asInstanceOf[`iso-b8-white`]
  @scala.inline
  def `iso-b9`: `iso-b9` = "iso-b9".asInstanceOf[`iso-b9`]
  @scala.inline
  def `iso-b9-white`: `iso-b9-white` = "iso-b9-white".asInstanceOf[`iso-b9-white`]
  @scala.inline
  def `iso-c3`: `iso-c3` = "iso-c3".asInstanceOf[`iso-c3`]
  @scala.inline
  def `iso-c3-envelope`: `iso-c3-envelope` = "iso-c3-envelope".asInstanceOf[`iso-c3-envelope`]
  @scala.inline
  def `iso-c4`: `iso-c4` = "iso-c4".asInstanceOf[`iso-c4`]
  @scala.inline
  def `iso-c4-envelope`: `iso-c4-envelope` = "iso-c4-envelope".asInstanceOf[`iso-c4-envelope`]
  @scala.inline
  def `iso-c5`: `iso-c5` = "iso-c5".asInstanceOf[`iso-c5`]
  @scala.inline
  def `iso-c5-envelope`: `iso-c5-envelope` = "iso-c5-envelope".asInstanceOf[`iso-c5-envelope`]
  @scala.inline
  def `iso-c6`: `iso-c6` = "iso-c6".asInstanceOf[`iso-c6`]
  @scala.inline
  def `iso-c6-envelope`: `iso-c6-envelope` = "iso-c6-envelope".asInstanceOf[`iso-c6-envelope`]
  @scala.inline
  def `iso-designated-long`: `iso-designated-long` = "iso-designated-long".asInstanceOf[`iso-designated-long`]
  @scala.inline
  def `iso-designated-long-envelope`: `iso-designated-long-envelope` = "iso-designated-long-envelope".asInstanceOf[`iso-designated-long-envelope`]
  @scala.inline
  def iso_2a0_1189x1682mm: iso_2a0_1189x1682mm = "iso_2a0_1189x1682mm".asInstanceOf[iso_2a0_1189x1682mm]
  @scala.inline
  def iso_a0_841x1189mm: iso_a0_841x1189mm = "iso_a0_841x1189mm".asInstanceOf[iso_a0_841x1189mm]
  @scala.inline
  def iso_a0x3_1189x2523mm: iso_a0x3_1189x2523mm = "iso_a0x3_1189x2523mm".asInstanceOf[iso_a0x3_1189x2523mm]
  @scala.inline
  def iso_a10_26x37mm: iso_a10_26x37mm = "iso_a10_26x37mm".asInstanceOf[iso_a10_26x37mm]
  @scala.inline
  def iso_a1_594x841mm: iso_a1_594x841mm = "iso_a1_594x841mm".asInstanceOf[iso_a1_594x841mm]
  @scala.inline
  def iso_a1x3_841x1783mm: iso_a1x3_841x1783mm = "iso_a1x3_841x1783mm".asInstanceOf[iso_a1x3_841x1783mm]
  @scala.inline
  def iso_a1x4_841x2378mm: iso_a1x4_841x2378mm = "iso_a1x4_841x2378mm".asInstanceOf[iso_a1x4_841x2378mm]
  @scala.inline
  def iso_a2_420x594mm: iso_a2_420x594mm = "iso_a2_420x594mm".asInstanceOf[iso_a2_420x594mm]
  @scala.inline
  def iso_a2x3_594x1261mm: iso_a2x3_594x1261mm = "iso_a2x3_594x1261mm".asInstanceOf[iso_a2x3_594x1261mm]
  @scala.inline
  def iso_a2x4_594x1682mm: iso_a2x4_594x1682mm = "iso_a2x4_594x1682mm".asInstanceOf[iso_a2x4_594x1682mm]
  @scala.inline
  def iso_a2x5_594x2102mm: iso_a2x5_594x2102mm = "iso_a2x5_594x2102mm".asInstanceOf[iso_a2x5_594x2102mm]
  @scala.inline
  def `iso_a3-extra_322x445mm`: `iso_a3-extra_322x445mm` = "iso_a3-extra_322x445mm".asInstanceOf[`iso_a3-extra_322x445mm`]
  @scala.inline
  def iso_a3_297x420mm: iso_a3_297x420mm = "iso_a3_297x420mm".asInstanceOf[iso_a3_297x420mm]
  @scala.inline
  def iso_a3x3_420x891mm: iso_a3x3_420x891mm = "iso_a3x3_420x891mm".asInstanceOf[iso_a3x3_420x891mm]
  @scala.inline
  def iso_a3x4_420x1189mm: iso_a3x4_420x1189mm = "iso_a3x4_420x1189mm".asInstanceOf[iso_a3x4_420x1189mm]
  @scala.inline
  def iso_a3x5_420x1486mm: iso_a3x5_420x1486mm = "iso_a3x5_420x1486mm".asInstanceOf[iso_a3x5_420x1486mm]
  @scala.inline
  def iso_a3x6_420x1783mm: iso_a3x6_420x1783mm = "iso_a3x6_420x1783mm".asInstanceOf[iso_a3x6_420x1783mm]
  @scala.inline
  def iso_a3x7_420x2080mm: iso_a3x7_420x2080mm = "iso_a3x7_420x2080mm".asInstanceOf[iso_a3x7_420x2080mm]
  @scala.inline
  def `iso_a4-extra_235Dot5x322Dot3mm`: `iso_a4-extra_235Dot5x322Dot3mm` = "iso_a4-extra_235.5x322.3mm".asInstanceOf[`iso_a4-extra_235Dot5x322Dot3mm`]
  @scala.inline
  def `iso_a4-tab_225x297mm`: `iso_a4-tab_225x297mm` = "iso_a4-tab_225x297mm".asInstanceOf[`iso_a4-tab_225x297mm`]
  @scala.inline
  def iso_a4_210x297mm: iso_a4_210x297mm = "iso_a4_210x297mm".asInstanceOf[iso_a4_210x297mm]
  @scala.inline
  def iso_a4x3_297x630mm: iso_a4x3_297x630mm = "iso_a4x3_297x630mm".asInstanceOf[iso_a4x3_297x630mm]
  @scala.inline
  def iso_a4x4_297x841mm: iso_a4x4_297x841mm = "iso_a4x4_297x841mm".asInstanceOf[iso_a4x4_297x841mm]
  @scala.inline
  def iso_a4x5_297x1051mm: iso_a4x5_297x1051mm = "iso_a4x5_297x1051mm".asInstanceOf[iso_a4x5_297x1051mm]
  @scala.inline
  def iso_a4x6_297x1261mm: iso_a4x6_297x1261mm = "iso_a4x6_297x1261mm".asInstanceOf[iso_a4x6_297x1261mm]
  @scala.inline
  def iso_a4x7_297x1471mm: iso_a4x7_297x1471mm = "iso_a4x7_297x1471mm".asInstanceOf[iso_a4x7_297x1471mm]
  @scala.inline
  def iso_a4x8_297x1682mm: iso_a4x8_297x1682mm = "iso_a4x8_297x1682mm".asInstanceOf[iso_a4x8_297x1682mm]
  @scala.inline
  def iso_a4x9_297x1892mm: iso_a4x9_297x1892mm = "iso_a4x9_297x1892mm".asInstanceOf[iso_a4x9_297x1892mm]
  @scala.inline
  def `iso_a5-extra_174x235mm`: `iso_a5-extra_174x235mm` = "iso_a5-extra_174x235mm".asInstanceOf[`iso_a5-extra_174x235mm`]
  @scala.inline
  def iso_a5_148x210mm: iso_a5_148x210mm = "iso_a5_148x210mm".asInstanceOf[iso_a5_148x210mm]
  @scala.inline
  def iso_a6_105x148mm: iso_a6_105x148mm = "iso_a6_105x148mm".asInstanceOf[iso_a6_105x148mm]
  @scala.inline
  def iso_a7_74x105mm: iso_a7_74x105mm = "iso_a7_74x105mm".asInstanceOf[iso_a7_74x105mm]
  @scala.inline
  def iso_a8_52x74mm: iso_a8_52x74mm = "iso_a8_52x74mm".asInstanceOf[iso_a8_52x74mm]
  @scala.inline
  def iso_a9_37x52mm: iso_a9_37x52mm = "iso_a9_37x52mm".asInstanceOf[iso_a9_37x52mm]
  @scala.inline
  def iso_b0_1000x1414mm: iso_b0_1000x1414mm = "iso_b0_1000x1414mm".asInstanceOf[iso_b0_1000x1414mm]
  @scala.inline
  def iso_b10_31x44mm: iso_b10_31x44mm = "iso_b10_31x44mm".asInstanceOf[iso_b10_31x44mm]
  @scala.inline
  def iso_b1_707x1000mm: iso_b1_707x1000mm = "iso_b1_707x1000mm".asInstanceOf[iso_b1_707x1000mm]
  @scala.inline
  def iso_b2_500x707mm: iso_b2_500x707mm = "iso_b2_500x707mm".asInstanceOf[iso_b2_500x707mm]
  @scala.inline
  def iso_b3_353x500mm: iso_b3_353x500mm = "iso_b3_353x500mm".asInstanceOf[iso_b3_353x500mm]
  @scala.inline
  def iso_b4_250x353mm: iso_b4_250x353mm = "iso_b4_250x353mm".asInstanceOf[iso_b4_250x353mm]
  @scala.inline
  def `iso_b5-extra_201x276mm`: `iso_b5-extra_201x276mm` = "iso_b5-extra_201x276mm".asInstanceOf[`iso_b5-extra_201x276mm`]
  @scala.inline
  def iso_b5_176x250mm: iso_b5_176x250mm = "iso_b5_176x250mm".asInstanceOf[iso_b5_176x250mm]
  @scala.inline
  def iso_b6_125x176mm: iso_b6_125x176mm = "iso_b6_125x176mm".asInstanceOf[iso_b6_125x176mm]
  @scala.inline
  def iso_b6c4_125x324mm: iso_b6c4_125x324mm = "iso_b6c4_125x324mm".asInstanceOf[iso_b6c4_125x324mm]
  @scala.inline
  def iso_b7_88x125mm: iso_b7_88x125mm = "iso_b7_88x125mm".asInstanceOf[iso_b7_88x125mm]
  @scala.inline
  def iso_b8_62x88mm: iso_b8_62x88mm = "iso_b8_62x88mm".asInstanceOf[iso_b8_62x88mm]
  @scala.inline
  def iso_b9_44x62mm: iso_b9_44x62mm = "iso_b9_44x62mm".asInstanceOf[iso_b9_44x62mm]
  @scala.inline
  def iso_c0_917x1297mm: iso_c0_917x1297mm = "iso_c0_917x1297mm".asInstanceOf[iso_c0_917x1297mm]
  @scala.inline
  def iso_c10_28x40mm: iso_c10_28x40mm = "iso_c10_28x40mm".asInstanceOf[iso_c10_28x40mm]
  @scala.inline
  def iso_c1_648x917mm: iso_c1_648x917mm = "iso_c1_648x917mm".asInstanceOf[iso_c1_648x917mm]
  @scala.inline
  def iso_c2_458x648mm: iso_c2_458x648mm = "iso_c2_458x648mm".asInstanceOf[iso_c2_458x648mm]
  @scala.inline
  def iso_c3_324x458mm: iso_c3_324x458mm = "iso_c3_324x458mm".asInstanceOf[iso_c3_324x458mm]
  @scala.inline
  def iso_c4_229x324mm: iso_c4_229x324mm = "iso_c4_229x324mm".asInstanceOf[iso_c4_229x324mm]
  @scala.inline
  def iso_c5_162x229mm: iso_c5_162x229mm = "iso_c5_162x229mm".asInstanceOf[iso_c5_162x229mm]
  @scala.inline
  def iso_c6_114x162mm: iso_c6_114x162mm = "iso_c6_114x162mm".asInstanceOf[iso_c6_114x162mm]
  @scala.inline
  def iso_c6c5_114x229mm: iso_c6c5_114x229mm = "iso_c6c5_114x229mm".asInstanceOf[iso_c6c5_114x229mm]
  @scala.inline
  def iso_c7_81x114mm: iso_c7_81x114mm = "iso_c7_81x114mm".asInstanceOf[iso_c7_81x114mm]
  @scala.inline
  def iso_c7c6_81x162mm: iso_c7c6_81x162mm = "iso_c7c6_81x162mm".asInstanceOf[iso_c7c6_81x162mm]
  @scala.inline
  def iso_c8_57x81mm: iso_c8_57x81mm = "iso_c8_57x81mm".asInstanceOf[iso_c8_57x81mm]
  @scala.inline
  def iso_c9_40x57mm: iso_c9_40x57mm = "iso_c9_40x57mm".asInstanceOf[iso_c9_40x57mm]
  @scala.inline
  def iso_dl_110x220mm: iso_dl_110x220mm = "iso_dl_110x220mm".asInstanceOf[iso_dl_110x220mm]
  @scala.inline
  def `iso_id-1_53Dot98x85Dot6mm`: `iso_id-1_53Dot98x85Dot6mm` = "iso_id-1_53.98x85.6mm".asInstanceOf[`iso_id-1_53Dot98x85Dot6mm`]
  @scala.inline
  def `iso_id-3_88x125mm`: `iso_id-3_88x125mm` = "iso_id-3_88x125mm".asInstanceOf[`iso_id-3_88x125mm`]
  @scala.inline
  def iso_ra0_860x1220mm: iso_ra0_860x1220mm = "iso_ra0_860x1220mm".asInstanceOf[iso_ra0_860x1220mm]
  @scala.inline
  def iso_ra1_610x860mm: iso_ra1_610x860mm = "iso_ra1_610x860mm".asInstanceOf[iso_ra1_610x860mm]
  @scala.inline
  def iso_ra2_430x610mm: iso_ra2_430x610mm = "iso_ra2_430x610mm".asInstanceOf[iso_ra2_430x610mm]
  @scala.inline
  def iso_ra3_305x430mm: iso_ra3_305x430mm = "iso_ra3_305x430mm".asInstanceOf[iso_ra3_305x430mm]
  @scala.inline
  def iso_ra4_215x305mm: iso_ra4_215x305mm = "iso_ra4_215x305mm".asInstanceOf[iso_ra4_215x305mm]
  @scala.inline
  def iso_sra0_900x1280mm: iso_sra0_900x1280mm = "iso_sra0_900x1280mm".asInstanceOf[iso_sra0_900x1280mm]
  @scala.inline
  def iso_sra1_640x900mm: iso_sra1_640x900mm = "iso_sra1_640x900mm".asInstanceOf[iso_sra1_640x900mm]
  @scala.inline
  def iso_sra2_450x640mm: iso_sra2_450x640mm = "iso_sra2_450x640mm".asInstanceOf[iso_sra2_450x640mm]
  @scala.inline
  def iso_sra3_320x450mm: iso_sra3_320x450mm = "iso_sra3_320x450mm".asInstanceOf[iso_sra3_320x450mm]
  @scala.inline
  def iso_sra4_225x320mm: iso_sra4_225x320mm = "iso_sra4_225x320mm".asInstanceOf[iso_sra4_225x320mm]
  @scala.inline
  def isostore: isostore = "isostore".asInstanceOf[isostore]
  @scala.inline
  def itms: itms = "itms".asInstanceOf[itms]
  @scala.inline
  def ivory: ivory = "ivory".asInstanceOf[ivory]
  @scala.inline
  def jabber: jabber = "jabber".asInstanceOf[jabber]
  @scala.inline
  def jar: jar = "jar".asInstanceOf[jar]
  @scala.inline
  def `jdf-f10-1`: `jdf-f10-1` = "jdf-f10-1".asInstanceOf[`jdf-f10-1`]
  @scala.inline
  def `jdf-f10-2`: `jdf-f10-2` = "jdf-f10-2".asInstanceOf[`jdf-f10-2`]
  @scala.inline
  def `jdf-f10-3`: `jdf-f10-3` = "jdf-f10-3".asInstanceOf[`jdf-f10-3`]
  @scala.inline
  def `jdf-f12-1`: `jdf-f12-1` = "jdf-f12-1".asInstanceOf[`jdf-f12-1`]
  @scala.inline
  def `jdf-f12-10`: `jdf-f12-10` = "jdf-f12-10".asInstanceOf[`jdf-f12-10`]
  @scala.inline
  def `jdf-f12-11`: `jdf-f12-11` = "jdf-f12-11".asInstanceOf[`jdf-f12-11`]
  @scala.inline
  def `jdf-f12-12`: `jdf-f12-12` = "jdf-f12-12".asInstanceOf[`jdf-f12-12`]
  @scala.inline
  def `jdf-f12-13`: `jdf-f12-13` = "jdf-f12-13".asInstanceOf[`jdf-f12-13`]
  @scala.inline
  def `jdf-f12-14`: `jdf-f12-14` = "jdf-f12-14".asInstanceOf[`jdf-f12-14`]
  @scala.inline
  def `jdf-f12-2`: `jdf-f12-2` = "jdf-f12-2".asInstanceOf[`jdf-f12-2`]
  @scala.inline
  def `jdf-f12-3`: `jdf-f12-3` = "jdf-f12-3".asInstanceOf[`jdf-f12-3`]
  @scala.inline
  def `jdf-f12-4`: `jdf-f12-4` = "jdf-f12-4".asInstanceOf[`jdf-f12-4`]
  @scala.inline
  def `jdf-f12-5`: `jdf-f12-5` = "jdf-f12-5".asInstanceOf[`jdf-f12-5`]
  @scala.inline
  def `jdf-f12-6`: `jdf-f12-6` = "jdf-f12-6".asInstanceOf[`jdf-f12-6`]
  @scala.inline
  def `jdf-f12-7`: `jdf-f12-7` = "jdf-f12-7".asInstanceOf[`jdf-f12-7`]
  @scala.inline
  def `jdf-f12-8`: `jdf-f12-8` = "jdf-f12-8".asInstanceOf[`jdf-f12-8`]
  @scala.inline
  def `jdf-f12-9`: `jdf-f12-9` = "jdf-f12-9".asInstanceOf[`jdf-f12-9`]
  @scala.inline
  def `jdf-f14-1`: `jdf-f14-1` = "jdf-f14-1".asInstanceOf[`jdf-f14-1`]
  @scala.inline
  def `jdf-f16-1`: `jdf-f16-1` = "jdf-f16-1".asInstanceOf[`jdf-f16-1`]
  @scala.inline
  def `jdf-f16-10`: `jdf-f16-10` = "jdf-f16-10".asInstanceOf[`jdf-f16-10`]
  @scala.inline
  def `jdf-f16-11`: `jdf-f16-11` = "jdf-f16-11".asInstanceOf[`jdf-f16-11`]
  @scala.inline
  def `jdf-f16-12`: `jdf-f16-12` = "jdf-f16-12".asInstanceOf[`jdf-f16-12`]
  @scala.inline
  def `jdf-f16-13`: `jdf-f16-13` = "jdf-f16-13".asInstanceOf[`jdf-f16-13`]
  @scala.inline
  def `jdf-f16-14`: `jdf-f16-14` = "jdf-f16-14".asInstanceOf[`jdf-f16-14`]
  @scala.inline
  def `jdf-f16-2`: `jdf-f16-2` = "jdf-f16-2".asInstanceOf[`jdf-f16-2`]
  @scala.inline
  def `jdf-f16-3`: `jdf-f16-3` = "jdf-f16-3".asInstanceOf[`jdf-f16-3`]
  @scala.inline
  def `jdf-f16-4`: `jdf-f16-4` = "jdf-f16-4".asInstanceOf[`jdf-f16-4`]
  @scala.inline
  def `jdf-f16-5`: `jdf-f16-5` = "jdf-f16-5".asInstanceOf[`jdf-f16-5`]
  @scala.inline
  def `jdf-f16-6`: `jdf-f16-6` = "jdf-f16-6".asInstanceOf[`jdf-f16-6`]
  @scala.inline
  def `jdf-f16-7`: `jdf-f16-7` = "jdf-f16-7".asInstanceOf[`jdf-f16-7`]
  @scala.inline
  def `jdf-f16-8`: `jdf-f16-8` = "jdf-f16-8".asInstanceOf[`jdf-f16-8`]
  @scala.inline
  def `jdf-f16-9`: `jdf-f16-9` = "jdf-f16-9".asInstanceOf[`jdf-f16-9`]
  @scala.inline
  def `jdf-f18-1`: `jdf-f18-1` = "jdf-f18-1".asInstanceOf[`jdf-f18-1`]
  @scala.inline
  def `jdf-f18-2`: `jdf-f18-2` = "jdf-f18-2".asInstanceOf[`jdf-f18-2`]
  @scala.inline
  def `jdf-f18-3`: `jdf-f18-3` = "jdf-f18-3".asInstanceOf[`jdf-f18-3`]
  @scala.inline
  def `jdf-f18-4`: `jdf-f18-4` = "jdf-f18-4".asInstanceOf[`jdf-f18-4`]
  @scala.inline
  def `jdf-f18-5`: `jdf-f18-5` = "jdf-f18-5".asInstanceOf[`jdf-f18-5`]
  @scala.inline
  def `jdf-f18-6`: `jdf-f18-6` = "jdf-f18-6".asInstanceOf[`jdf-f18-6`]
  @scala.inline
  def `jdf-f18-7`: `jdf-f18-7` = "jdf-f18-7".asInstanceOf[`jdf-f18-7`]
  @scala.inline
  def `jdf-f18-8`: `jdf-f18-8` = "jdf-f18-8".asInstanceOf[`jdf-f18-8`]
  @scala.inline
  def `jdf-f18-9`: `jdf-f18-9` = "jdf-f18-9".asInstanceOf[`jdf-f18-9`]
  @scala.inline
  def `jdf-f2-1`: `jdf-f2-1` = "jdf-f2-1".asInstanceOf[`jdf-f2-1`]
  @scala.inline
  def `jdf-f20-1`: `jdf-f20-1` = "jdf-f20-1".asInstanceOf[`jdf-f20-1`]
  @scala.inline
  def `jdf-f20-2`: `jdf-f20-2` = "jdf-f20-2".asInstanceOf[`jdf-f20-2`]
  @scala.inline
  def `jdf-f24-1`: `jdf-f24-1` = "jdf-f24-1".asInstanceOf[`jdf-f24-1`]
  @scala.inline
  def `jdf-f24-10`: `jdf-f24-10` = "jdf-f24-10".asInstanceOf[`jdf-f24-10`]
  @scala.inline
  def `jdf-f24-11`: `jdf-f24-11` = "jdf-f24-11".asInstanceOf[`jdf-f24-11`]
  @scala.inline
  def `jdf-f24-2`: `jdf-f24-2` = "jdf-f24-2".asInstanceOf[`jdf-f24-2`]
  @scala.inline
  def `jdf-f24-3`: `jdf-f24-3` = "jdf-f24-3".asInstanceOf[`jdf-f24-3`]
  @scala.inline
  def `jdf-f24-4`: `jdf-f24-4` = "jdf-f24-4".asInstanceOf[`jdf-f24-4`]
  @scala.inline
  def `jdf-f24-5`: `jdf-f24-5` = "jdf-f24-5".asInstanceOf[`jdf-f24-5`]
  @scala.inline
  def `jdf-f24-6`: `jdf-f24-6` = "jdf-f24-6".asInstanceOf[`jdf-f24-6`]
  @scala.inline
  def `jdf-f24-7`: `jdf-f24-7` = "jdf-f24-7".asInstanceOf[`jdf-f24-7`]
  @scala.inline
  def `jdf-f24-8`: `jdf-f24-8` = "jdf-f24-8".asInstanceOf[`jdf-f24-8`]
  @scala.inline
  def `jdf-f24-9`: `jdf-f24-9` = "jdf-f24-9".asInstanceOf[`jdf-f24-9`]
  @scala.inline
  def `jdf-f28-1`: `jdf-f28-1` = "jdf-f28-1".asInstanceOf[`jdf-f28-1`]
  @scala.inline
  def `jdf-f32-1`: `jdf-f32-1` = "jdf-f32-1".asInstanceOf[`jdf-f32-1`]
  @scala.inline
  def `jdf-f32-2`: `jdf-f32-2` = "jdf-f32-2".asInstanceOf[`jdf-f32-2`]
  @scala.inline
  def `jdf-f32-3`: `jdf-f32-3` = "jdf-f32-3".asInstanceOf[`jdf-f32-3`]
  @scala.inline
  def `jdf-f32-4`: `jdf-f32-4` = "jdf-f32-4".asInstanceOf[`jdf-f32-4`]
  @scala.inline
  def `jdf-f32-5`: `jdf-f32-5` = "jdf-f32-5".asInstanceOf[`jdf-f32-5`]
  @scala.inline
  def `jdf-f32-6`: `jdf-f32-6` = "jdf-f32-6".asInstanceOf[`jdf-f32-6`]
  @scala.inline
  def `jdf-f32-7`: `jdf-f32-7` = "jdf-f32-7".asInstanceOf[`jdf-f32-7`]
  @scala.inline
  def `jdf-f32-8`: `jdf-f32-8` = "jdf-f32-8".asInstanceOf[`jdf-f32-8`]
  @scala.inline
  def `jdf-f32-9`: `jdf-f32-9` = "jdf-f32-9".asInstanceOf[`jdf-f32-9`]
  @scala.inline
  def `jdf-f36-1`: `jdf-f36-1` = "jdf-f36-1".asInstanceOf[`jdf-f36-1`]
  @scala.inline
  def `jdf-f36-2`: `jdf-f36-2` = "jdf-f36-2".asInstanceOf[`jdf-f36-2`]
  @scala.inline
  def `jdf-f4-1`: `jdf-f4-1` = "jdf-f4-1".asInstanceOf[`jdf-f4-1`]
  @scala.inline
  def `jdf-f4-2`: `jdf-f4-2` = "jdf-f4-2".asInstanceOf[`jdf-f4-2`]
  @scala.inline
  def `jdf-f40-1`: `jdf-f40-1` = "jdf-f40-1".asInstanceOf[`jdf-f40-1`]
  @scala.inline
  def `jdf-f48-1`: `jdf-f48-1` = "jdf-f48-1".asInstanceOf[`jdf-f48-1`]
  @scala.inline
  def `jdf-f48-2`: `jdf-f48-2` = "jdf-f48-2".asInstanceOf[`jdf-f48-2`]
  @scala.inline
  def `jdf-f6-1`: `jdf-f6-1` = "jdf-f6-1".asInstanceOf[`jdf-f6-1`]
  @scala.inline
  def `jdf-f6-2`: `jdf-f6-2` = "jdf-f6-2".asInstanceOf[`jdf-f6-2`]
  @scala.inline
  def `jdf-f6-3`: `jdf-f6-3` = "jdf-f6-3".asInstanceOf[`jdf-f6-3`]
  @scala.inline
  def `jdf-f6-4`: `jdf-f6-4` = "jdf-f6-4".asInstanceOf[`jdf-f6-4`]
  @scala.inline
  def `jdf-f6-5`: `jdf-f6-5` = "jdf-f6-5".asInstanceOf[`jdf-f6-5`]
  @scala.inline
  def `jdf-f6-6`: `jdf-f6-6` = "jdf-f6-6".asInstanceOf[`jdf-f6-6`]
  @scala.inline
  def `jdf-f6-7`: `jdf-f6-7` = "jdf-f6-7".asInstanceOf[`jdf-f6-7`]
  @scala.inline
  def `jdf-f6-8`: `jdf-f6-8` = "jdf-f6-8".asInstanceOf[`jdf-f6-8`]
  @scala.inline
  def `jdf-f64-1`: `jdf-f64-1` = "jdf-f64-1".asInstanceOf[`jdf-f64-1`]
  @scala.inline
  def `jdf-f64-2`: `jdf-f64-2` = "jdf-f64-2".asInstanceOf[`jdf-f64-2`]
  @scala.inline
  def `jdf-f8-1`: `jdf-f8-1` = "jdf-f8-1".asInstanceOf[`jdf-f8-1`]
  @scala.inline
  def `jdf-f8-2`: `jdf-f8-2` = "jdf-f8-2".asInstanceOf[`jdf-f8-2`]
  @scala.inline
  def `jdf-f8-3`: `jdf-f8-3` = "jdf-f8-3".asInstanceOf[`jdf-f8-3`]
  @scala.inline
  def `jdf-f8-4`: `jdf-f8-4` = "jdf-f8-4".asInstanceOf[`jdf-f8-4`]
  @scala.inline
  def `jdf-f8-5`: `jdf-f8-5` = "jdf-f8-5".asInstanceOf[`jdf-f8-5`]
  @scala.inline
  def `jdf-f8-6`: `jdf-f8-6` = "jdf-f8-6".asInstanceOf[`jdf-f8-6`]
  @scala.inline
  def `jdf-f8-7`: `jdf-f8-7` = "jdf-f8-7".asInstanceOf[`jdf-f8-7`]
  @scala.inline
  def `jis-b0`: `jis-b0` = "jis-b0".asInstanceOf[`jis-b0`]
  @scala.inline
  def `jis-b0-translucent`: `jis-b0-translucent` = "jis-b0-translucent".asInstanceOf[`jis-b0-translucent`]
  @scala.inline
  def `jis-b0-transparent`: `jis-b0-transparent` = "jis-b0-transparent".asInstanceOf[`jis-b0-transparent`]
  @scala.inline
  def `jis-b0-white`: `jis-b0-white` = "jis-b0-white".asInstanceOf[`jis-b0-white`]
  @scala.inline
  def `jis-b1`: `jis-b1` = "jis-b1".asInstanceOf[`jis-b1`]
  @scala.inline
  def `jis-b1-translucent`: `jis-b1-translucent` = "jis-b1-translucent".asInstanceOf[`jis-b1-translucent`]
  @scala.inline
  def `jis-b1-transparent`: `jis-b1-transparent` = "jis-b1-transparent".asInstanceOf[`jis-b1-transparent`]
  @scala.inline
  def `jis-b1-white`: `jis-b1-white` = "jis-b1-white".asInstanceOf[`jis-b1-white`]
  @scala.inline
  def `jis-b10`: `jis-b10` = "jis-b10".asInstanceOf[`jis-b10`]
  @scala.inline
  def `jis-b10-white`: `jis-b10-white` = "jis-b10-white".asInstanceOf[`jis-b10-white`]
  @scala.inline
  def `jis-b2`: `jis-b2` = "jis-b2".asInstanceOf[`jis-b2`]
  @scala.inline
  def `jis-b2-translucent`: `jis-b2-translucent` = "jis-b2-translucent".asInstanceOf[`jis-b2-translucent`]
  @scala.inline
  def `jis-b2-transparent`: `jis-b2-transparent` = "jis-b2-transparent".asInstanceOf[`jis-b2-transparent`]
  @scala.inline
  def `jis-b2-white`: `jis-b2-white` = "jis-b2-white".asInstanceOf[`jis-b2-white`]
  @scala.inline
  def `jis-b3`: `jis-b3` = "jis-b3".asInstanceOf[`jis-b3`]
  @scala.inline
  def `jis-b3-translucent`: `jis-b3-translucent` = "jis-b3-translucent".asInstanceOf[`jis-b3-translucent`]
  @scala.inline
  def `jis-b3-transparent`: `jis-b3-transparent` = "jis-b3-transparent".asInstanceOf[`jis-b3-transparent`]
  @scala.inline
  def `jis-b3-white`: `jis-b3-white` = "jis-b3-white".asInstanceOf[`jis-b3-white`]
  @scala.inline
  def `jis-b4`: `jis-b4` = "jis-b4".asInstanceOf[`jis-b4`]
  @scala.inline
  def `jis-b4-colored`: `jis-b4-colored` = "jis-b4-colored".asInstanceOf[`jis-b4-colored`]
  @scala.inline
  def `jis-b4-translucent`: `jis-b4-translucent` = "jis-b4-translucent".asInstanceOf[`jis-b4-translucent`]
  @scala.inline
  def `jis-b4-transparent`: `jis-b4-transparent` = "jis-b4-transparent".asInstanceOf[`jis-b4-transparent`]
  @scala.inline
  def `jis-b4-white`: `jis-b4-white` = "jis-b4-white".asInstanceOf[`jis-b4-white`]
  @scala.inline
  def `jis-b5`: `jis-b5` = "jis-b5".asInstanceOf[`jis-b5`]
  @scala.inline
  def `jis-b5-colored`: `jis-b5-colored` = "jis-b5-colored".asInstanceOf[`jis-b5-colored`]
  @scala.inline
  def `jis-b5-translucent`: `jis-b5-translucent` = "jis-b5-translucent".asInstanceOf[`jis-b5-translucent`]
  @scala.inline
  def `jis-b5-transparent`: `jis-b5-transparent` = "jis-b5-transparent".asInstanceOf[`jis-b5-transparent`]
  @scala.inline
  def `jis-b5-white`: `jis-b5-white` = "jis-b5-white".asInstanceOf[`jis-b5-white`]
  @scala.inline
  def `jis-b6`: `jis-b6` = "jis-b6".asInstanceOf[`jis-b6`]
  @scala.inline
  def `jis-b6-white`: `jis-b6-white` = "jis-b6-white".asInstanceOf[`jis-b6-white`]
  @scala.inline
  def `jis-b7`: `jis-b7` = "jis-b7".asInstanceOf[`jis-b7`]
  @scala.inline
  def `jis-b7-white`: `jis-b7-white` = "jis-b7-white".asInstanceOf[`jis-b7-white`]
  @scala.inline
  def `jis-b8`: `jis-b8` = "jis-b8".asInstanceOf[`jis-b8`]
  @scala.inline
  def `jis-b8-white`: `jis-b8-white` = "jis-b8-white".asInstanceOf[`jis-b8-white`]
  @scala.inline
  def `jis-b9`: `jis-b9` = "jis-b9".asInstanceOf[`jis-b9`]
  @scala.inline
  def `jis-b9-white`: `jis-b9-white` = "jis-b9-white".asInstanceOf[`jis-b9-white`]
  @scala.inline
  def jis_b0_1030x1456mm: jis_b0_1030x1456mm = "jis_b0_1030x1456mm".asInstanceOf[jis_b0_1030x1456mm]
  @scala.inline
  def jis_b10_32x45mm: jis_b10_32x45mm = "jis_b10_32x45mm".asInstanceOf[jis_b10_32x45mm]
  @scala.inline
  def jis_b1_728x1030mm: jis_b1_728x1030mm = "jis_b1_728x1030mm".asInstanceOf[jis_b1_728x1030mm]
  @scala.inline
  def jis_b2_515x728mm: jis_b2_515x728mm = "jis_b2_515x728mm".asInstanceOf[jis_b2_515x728mm]
  @scala.inline
  def jis_b3_364x515mm: jis_b3_364x515mm = "jis_b3_364x515mm".asInstanceOf[jis_b3_364x515mm]
  @scala.inline
  def jis_b4_257x364mm: jis_b4_257x364mm = "jis_b4_257x364mm".asInstanceOf[jis_b4_257x364mm]
  @scala.inline
  def jis_b5_182x257mm: jis_b5_182x257mm = "jis_b5_182x257mm".asInstanceOf[jis_b5_182x257mm]
  @scala.inline
  def jis_b6_128x182mm: jis_b6_128x182mm = "jis_b6_128x182mm".asInstanceOf[jis_b6_128x182mm]
  @scala.inline
  def jis_b7_91x128mm: jis_b7_91x128mm = "jis_b7_91x128mm".asInstanceOf[jis_b7_91x128mm]
  @scala.inline
  def jis_b8_64x91mm: jis_b8_64x91mm = "jis_b8_64x91mm".asInstanceOf[jis_b8_64x91mm]
  @scala.inline
  def jis_b9_45x64mm: jis_b9_45x64mm = "jis_b9_45x64mm".asInstanceOf[jis_b9_45x64mm]
  @scala.inline
  def jis_exec_216x330mm: jis_exec_216x330mm = "jis_exec_216x330mm".asInstanceOf[jis_exec_216x330mm]
  @scala.inline
  def jms: jms = "jms".asInstanceOf[jms]
  @scala.inline
  def `job-account-id`: `job-account-id` = "job-account-id".asInstanceOf[`job-account-id`]
  @scala.inline
  def `job-account-id-actual`: `job-account-id-actual` = "job-account-id-actual".asInstanceOf[`job-account-id-actual`]
  @scala.inline
  def `job-account-id-default`: `job-account-id-default` = "job-account-id-default".asInstanceOf[`job-account-id-default`]
  @scala.inline
  def `job-account-id-supported`: `job-account-id-supported` = "job-account-id-supported".asInstanceOf[`job-account-id-supported`]
  @scala.inline
  def `job-account-type`: `job-account-type` = "job-account-type".asInstanceOf[`job-account-type`]
  @scala.inline
  def `job-account-type-actual`: `job-account-type-actual` = "job-account-type-actual".asInstanceOf[`job-account-type-actual`]
  @scala.inline
  def `job-account-type-default`: `job-account-type-default` = "job-account-type-default".asInstanceOf[`job-account-type-default`]
  @scala.inline
  def `job-account-type-supported`: `job-account-type-supported` = "job-account-type-supported".asInstanceOf[`job-account-type-supported`]
  @scala.inline
  def `job-accounting-sheets`: `job-accounting-sheets` = "job-accounting-sheets".asInstanceOf[`job-accounting-sheets`]
  @scala.inline
  def `job-accounting-sheets-actual`: `job-accounting-sheets-actual` = "job-accounting-sheets-actual".asInstanceOf[`job-accounting-sheets-actual`]
  @scala.inline
  def `job-accounting-sheets-default`: `job-accounting-sheets-default` = "job-accounting-sheets-default".asInstanceOf[`job-accounting-sheets-default`]
  @scala.inline
  def `job-accounting-sheets-supported`: `job-accounting-sheets-supported` = "job-accounting-sheets-supported".asInstanceOf[`job-accounting-sheets-supported`]
  @scala.inline
  def `job-accounting-user-id`: `job-accounting-user-id` = "job-accounting-user-id".asInstanceOf[`job-accounting-user-id`]
  @scala.inline
  def `job-accounting-user-id-actual`: `job-accounting-user-id-actual` = "job-accounting-user-id-actual".asInstanceOf[`job-accounting-user-id-actual`]
  @scala.inline
  def `job-accounting-user-id-default`: `job-accounting-user-id-default` = "job-accounting-user-id-default".asInstanceOf[`job-accounting-user-id-default`]
  @scala.inline
  def `job-accounting-user-id-supported`: `job-accounting-user-id-supported` = "job-accounting-user-id-supported".asInstanceOf[`job-accounting-user-id-supported`]
  @scala.inline
  def `job-attribute-fidelity`: `job-attribute-fidelity` = "job-attribute-fidelity".asInstanceOf[`job-attribute-fidelity`]
  @scala.inline
  def `job-authorization-uri-supported`: `job-authorization-uri-supported` = "job-authorization-uri-supported".asInstanceOf[`job-authorization-uri-supported`]
  @scala.inline
  def `job-both-sheet`: `job-both-sheet` = "job-both-sheet".asInstanceOf[`job-both-sheet`]
  @scala.inline
  def `job-cancel-after`: `job-cancel-after` = "job-cancel-after".asInstanceOf[`job-cancel-after`]
  @scala.inline
  def `job-cancel-after-default`: `job-cancel-after-default` = "job-cancel-after-default".asInstanceOf[`job-cancel-after-default`]
  @scala.inline
  def `job-cancel-after-supported`: `job-cancel-after-supported` = "job-cancel-after-supported".asInstanceOf[`job-cancel-after-supported`]
  @scala.inline
  def `job-canceled-at-device`: `job-canceled-at-device` = "job-canceled-at-device".asInstanceOf[`job-canceled-at-device`]
  @scala.inline
  def `job-canceled-by-operator`: `job-canceled-by-operator` = "job-canceled-by-operator".asInstanceOf[`job-canceled-by-operator`]
  @scala.inline
  def `job-canceled-by-user`: `job-canceled-by-user` = "job-canceled-by-user".asInstanceOf[`job-canceled-by-user`]
  @scala.inline
  def `job-completed`: `job-completed` = "job-completed".asInstanceOf[`job-completed`]
  @scala.inline
  def `job-completed-successfully`: `job-completed-successfully` = "job-completed-successfully".asInstanceOf[`job-completed-successfully`]
  @scala.inline
  def `job-completed-with-errors`: `job-completed-with-errors` = "job-completed-with-errors".asInstanceOf[`job-completed-with-errors`]
  @scala.inline
  def `job-completed-with-warnings`: `job-completed-with-warnings` = "job-completed-with-warnings".asInstanceOf[`job-completed-with-warnings`]
  @scala.inline
  def `job-config-changed`: `job-config-changed` = "job-config-changed".asInstanceOf[`job-config-changed`]
  @scala.inline
  def `job-constraints-supported`: `job-constraints-supported` = "job-constraints-supported".asInstanceOf[`job-constraints-supported`]
  @scala.inline
  def `job-copies`: `job-copies` = "job-copies".asInstanceOf[`job-copies`]
  @scala.inline
  def `job-cover-back`: `job-cover-back` = "job-cover-back".asInstanceOf[`job-cover-back`]
  @scala.inline
  def `job-cover-front`: `job-cover-front` = "job-cover-front".asInstanceOf[`job-cover-front`]
  @scala.inline
  def `job-created`: `job-created` = "job-created".asInstanceOf[`job-created`]
  @scala.inline
  def `job-creation-attributes-supported`: `job-creation-attributes-supported` = "job-creation-attributes-supported".asInstanceOf[`job-creation-attributes-supported`]
  @scala.inline
  def `job-data-insufficient`: `job-data-insufficient` = "job-data-insufficient".asInstanceOf[`job-data-insufficient`]
  @scala.inline
  def `job-delay-output-until`: `job-delay-output-until` = "job-delay-output-until".asInstanceOf[`job-delay-output-until`]
  @scala.inline
  def `job-delay-output-until-default`: `job-delay-output-until-default` = "job-delay-output-until-default".asInstanceOf[`job-delay-output-until-default`]
  @scala.inline
  def `job-delay-output-until-interval-supported`: `job-delay-output-until-interval-supported` = "job-delay-output-until-interval-supported".asInstanceOf[`job-delay-output-until-interval-supported`]
  @scala.inline
  def `job-delay-output-until-specified`: `job-delay-output-until-specified` = "job-delay-output-until-specified".asInstanceOf[`job-delay-output-until-specified`]
  @scala.inline
  def `job-delay-output-until-supported`: `job-delay-output-until-supported` = "job-delay-output-until-supported".asInstanceOf[`job-delay-output-until-supported`]
  @scala.inline
  def `job-delay-output-until-time`: `job-delay-output-until-time` = "job-delay-output-until-time".asInstanceOf[`job-delay-output-until-time`]
  @scala.inline
  def `job-delay-output-until-time-supported`: `job-delay-output-until-time-supported` = "job-delay-output-until-time-supported".asInstanceOf[`job-delay-output-until-time-supported`]
  @scala.inline
  def `job-description`: `job-description` = "job-description".asInstanceOf[`job-description`]
  @scala.inline
  def `job-destination-spooling-supported`: `job-destination-spooling-supported` = "job-destination-spooling-supported".asInstanceOf[`job-destination-spooling-supported`]
  @scala.inline
  def `job-detailed-status-messages`: `job-detailed-status-messages` = "job-detailed-status-messages".asInstanceOf[`job-detailed-status-messages`]
  @scala.inline
  def `job-digital-signature-wait`: `job-digital-signature-wait` = "job-digital-signature-wait".asInstanceOf[`job-digital-signature-wait`]
  @scala.inline
  def `job-document-access-errors`: `job-document-access-errors` = "job-document-access-errors".asInstanceOf[`job-document-access-errors`]
  @scala.inline
  def `job-end-sheet`: `job-end-sheet` = "job-end-sheet".asInstanceOf[`job-end-sheet`]
  @scala.inline
  def `job-error-action`: `job-error-action` = "job-error-action".asInstanceOf[`job-error-action`]
  @scala.inline
  def `job-error-action-default`: `job-error-action-default` = "job-error-action-default".asInstanceOf[`job-error-action-default`]
  @scala.inline
  def `job-error-action-supported`: `job-error-action-supported` = "job-error-action-supported".asInstanceOf[`job-error-action-supported`]
  @scala.inline
  def `job-error-sheet`: `job-error-sheet` = "job-error-sheet".asInstanceOf[`job-error-sheet`]
  @scala.inline
  def `job-error-sheet-actual`: `job-error-sheet-actual` = "job-error-sheet-actual".asInstanceOf[`job-error-sheet-actual`]
  @scala.inline
  def `job-error-sheet-default`: `job-error-sheet-default` = "job-error-sheet-default".asInstanceOf[`job-error-sheet-default`]
  @scala.inline
  def `job-error-sheet-supported`: `job-error-sheet-supported` = "job-error-sheet-supported".asInstanceOf[`job-error-sheet-supported`]
  @scala.inline
  def `job-finishings`: `job-finishings` = "job-finishings".asInstanceOf[`job-finishings`]
  @scala.inline
  def `job-finishings-col`: `job-finishings-col` = "job-finishings-col".asInstanceOf[`job-finishings-col`]
  @scala.inline
  def `job-history-attributes-configured`: `job-history-attributes-configured` = "job-history-attributes-configured".asInstanceOf[`job-history-attributes-configured`]
  @scala.inline
  def `job-history-attributes-supported`: `job-history-attributes-supported` = "job-history-attributes-supported".asInstanceOf[`job-history-attributes-supported`]
  @scala.inline
  def `job-history-interval-configured`: `job-history-interval-configured` = "job-history-interval-configured".asInstanceOf[`job-history-interval-configured`]
  @scala.inline
  def `job-history-interval-supported`: `job-history-interval-supported` = "job-history-interval-supported".asInstanceOf[`job-history-interval-supported`]
  @scala.inline
  def `job-hold-until`: `job-hold-until` = "job-hold-until".asInstanceOf[`job-hold-until`]
  @scala.inline
  def `job-hold-until-actual`: `job-hold-until-actual` = "job-hold-until-actual".asInstanceOf[`job-hold-until-actual`]
  @scala.inline
  def `job-hold-until-default`: `job-hold-until-default` = "job-hold-until-default".asInstanceOf[`job-hold-until-default`]
  @scala.inline
  def `job-hold-until-specified`: `job-hold-until-specified` = "job-hold-until-specified".asInstanceOf[`job-hold-until-specified`]
  @scala.inline
  def `job-hold-until-supported`: `job-hold-until-supported` = "job-hold-until-supported".asInstanceOf[`job-hold-until-supported`]
  @scala.inline
  def `job-hold-until-time`: `job-hold-until-time` = "job-hold-until-time".asInstanceOf[`job-hold-until-time`]
  @scala.inline
  def `job-hold-until-time-supported`: `job-hold-until-time-supported` = "job-hold-until-time-supported".asInstanceOf[`job-hold-until-time-supported`]
  @scala.inline
  def `job-id`: `job-id` = "job-id".asInstanceOf[`job-id`]
  @scala.inline
  def `job-ids-supported`: `job-ids-supported` = "job-ids-supported".asInstanceOf[`job-ids-supported`]
  @scala.inline
  def `job-impressions`: `job-impressions` = "job-impressions".asInstanceOf[`job-impressions`]
  @scala.inline
  def `job-impressions-col`: `job-impressions-col` = "job-impressions-col".asInstanceOf[`job-impressions-col`]
  @scala.inline
  def `job-impressions-completed`: `job-impressions-completed` = "job-impressions-completed".asInstanceOf[`job-impressions-completed`]
  @scala.inline
  def `job-impressions-completed-col`: `job-impressions-completed-col` = "job-impressions-completed-col".asInstanceOf[`job-impressions-completed-col`]
  @scala.inline
  def `job-impressions-supported`: `job-impressions-supported` = "job-impressions-supported".asInstanceOf[`job-impressions-supported`]
  @scala.inline
  def `job-incoming`: `job-incoming` = "job-incoming".asInstanceOf[`job-incoming`]
  @scala.inline
  def `job-interpreting`: `job-interpreting` = "job-interpreting".asInstanceOf[`job-interpreting`]
  @scala.inline
  def `job-k-octets`: `job-k-octets` = "job-k-octets".asInstanceOf[`job-k-octets`]
  @scala.inline
  def `job-k-octets-processed`: `job-k-octets-processed` = "job-k-octets-processed".asInstanceOf[`job-k-octets-processed`]
  @scala.inline
  def `job-k-octets-supported`: `job-k-octets-supported` = "job-k-octets-supported".asInstanceOf[`job-k-octets-supported`]
  @scala.inline
  def `job-mandatory-attributes-supported`: `job-mandatory-attributes-supported` = "job-mandatory-attributes-supported".asInstanceOf[`job-mandatory-attributes-supported`]
  @scala.inline
  def `job-media-sheets`: `job-media-sheets` = "job-media-sheets".asInstanceOf[`job-media-sheets`]
  @scala.inline
  def `job-media-sheets-col`: `job-media-sheets-col` = "job-media-sheets-col".asInstanceOf[`job-media-sheets-col`]
  @scala.inline
  def `job-media-sheets-completed`: `job-media-sheets-completed` = "job-media-sheets-completed".asInstanceOf[`job-media-sheets-completed`]
  @scala.inline
  def `job-media-sheets-completed-col`: `job-media-sheets-completed-col` = "job-media-sheets-completed-col".asInstanceOf[`job-media-sheets-completed-col`]
  @scala.inline
  def `job-media-sheets-supported`: `job-media-sheets-supported` = "job-media-sheets-supported".asInstanceOf[`job-media-sheets-supported`]
  @scala.inline
  def `job-message-to-operator`: `job-message-to-operator` = "job-message-to-operator".asInstanceOf[`job-message-to-operator`]
  @scala.inline
  def `job-message-to-operator-default`: `job-message-to-operator-default` = "job-message-to-operator-default".asInstanceOf[`job-message-to-operator-default`]
  @scala.inline
  def `job-message-to-operator-supported`: `job-message-to-operator-supported` = "job-message-to-operator-supported".asInstanceOf[`job-message-to-operator-supported`]
  @scala.inline
  def `job-more-info`: `job-more-info` = "job-more-info".asInstanceOf[`job-more-info`]
  @scala.inline
  def `job-originating-user-name`: `job-originating-user-name` = "job-originating-user-name".asInstanceOf[`job-originating-user-name`]
  @scala.inline
  def `job-originating-user-uri`: `job-originating-user-uri` = "job-originating-user-uri".asInstanceOf[`job-originating-user-uri`]
  @scala.inline
  def `job-outgoing`: `job-outgoing` = "job-outgoing".asInstanceOf[`job-outgoing`]
  @scala.inline
  def `job-pages`: `job-pages` = "job-pages".asInstanceOf[`job-pages`]
  @scala.inline
  def `job-pages-col`: `job-pages-col` = "job-pages-col".asInstanceOf[`job-pages-col`]
  @scala.inline
  def `job-pages-completed`: `job-pages-completed` = "job-pages-completed".asInstanceOf[`job-pages-completed`]
  @scala.inline
  def `job-pages-completed-col`: `job-pages-completed-col` = "job-pages-completed-col".asInstanceOf[`job-pages-completed-col`]
  @scala.inline
  def `job-pages-completed-current-copy`: `job-pages-completed-current-copy` = "job-pages-completed-current-copy".asInstanceOf[`job-pages-completed-current-copy`]
  @scala.inline
  def `job-pages-per-set`: `job-pages-per-set` = "job-pages-per-set".asInstanceOf[`job-pages-per-set`]
  @scala.inline
  def `job-pages-per-set-supported`: `job-pages-per-set-supported` = "job-pages-per-set-supported".asInstanceOf[`job-pages-per-set-supported`]
  @scala.inline
  def `job-password-encryption-supported`: `job-password-encryption-supported` = "job-password-encryption-supported".asInstanceOf[`job-password-encryption-supported`]
  @scala.inline
  def `job-password-length-supported`: `job-password-length-supported` = "job-password-length-supported".asInstanceOf[`job-password-length-supported`]
  @scala.inline
  def `job-password-repertoire-configured`: `job-password-repertoire-configured` = "job-password-repertoire-configured".asInstanceOf[`job-password-repertoire-configured`]
  @scala.inline
  def `job-password-repertoire-supported`: `job-password-repertoire-supported` = "job-password-repertoire-supported".asInstanceOf[`job-password-repertoire-supported`]
  @scala.inline
  def `job-password-supported`: `job-password-supported` = "job-password-supported".asInstanceOf[`job-password-supported`]
  @scala.inline
  def `job-password-wait`: `job-password-wait` = "job-password-wait".asInstanceOf[`job-password-wait`]
  @scala.inline
  def `job-phone-number`: `job-phone-number` = "job-phone-number".asInstanceOf[`job-phone-number`]
  @scala.inline
  def `job-phone-number-default`: `job-phone-number-default` = "job-phone-number-default".asInstanceOf[`job-phone-number-default`]
  @scala.inline
  def `job-phone-number-supported`: `job-phone-number-supported` = "job-phone-number-supported".asInstanceOf[`job-phone-number-supported`]
  @scala.inline
  def `job-presets-supported`: `job-presets-supported` = "job-presets-supported".asInstanceOf[`job-presets-supported`]
  @scala.inline
  def `job-printed-successfully`: `job-printed-successfully` = "job-printed-successfully".asInstanceOf[`job-printed-successfully`]
  @scala.inline
  def `job-printed-with-errors`: `job-printed-with-errors` = "job-printed-with-errors".asInstanceOf[`job-printed-with-errors`]
  @scala.inline
  def `job-printed-with-warnings`: `job-printed-with-warnings` = "job-printed-with-warnings".asInstanceOf[`job-printed-with-warnings`]
  @scala.inline
  def `job-printer-up-time`: `job-printer-up-time` = "job-printer-up-time".asInstanceOf[`job-printer-up-time`]
  @scala.inline
  def `job-printer-uri`: `job-printer-uri` = "job-printer-uri".asInstanceOf[`job-printer-uri`]
  @scala.inline
  def `job-printing`: `job-printing` = "job-printing".asInstanceOf[`job-printing`]
  @scala.inline
  def `job-priority`: `job-priority` = "job-priority".asInstanceOf[`job-priority`]
  @scala.inline
  def `job-priority-actual`: `job-priority-actual` = "job-priority-actual".asInstanceOf[`job-priority-actual`]
  @scala.inline
  def `job-priority-default`: `job-priority-default` = "job-priority-default".asInstanceOf[`job-priority-default`]
  @scala.inline
  def `job-priority-supported`: `job-priority-supported` = "job-priority-supported".asInstanceOf[`job-priority-supported`]
  @scala.inline
  def `job-privacy-attributes`: `job-privacy-attributes` = "job-privacy-attributes".asInstanceOf[`job-privacy-attributes`]
  @scala.inline
  def `job-privacy-scope`: `job-privacy-scope` = "job-privacy-scope".asInstanceOf[`job-privacy-scope`]
  @scala.inline
  def `job-progress`: `job-progress` = "job-progress".asInstanceOf[`job-progress`]
  @scala.inline
  def `job-queued`: `job-queued` = "job-queued".asInstanceOf[`job-queued`]
  @scala.inline
  def `job-queued-for-marker`: `job-queued-for-marker` = "job-queued-for-marker".asInstanceOf[`job-queued-for-marker`]
  @scala.inline
  def `job-recipient-name`: `job-recipient-name` = "job-recipient-name".asInstanceOf[`job-recipient-name`]
  @scala.inline
  def `job-recipient-name-default`: `job-recipient-name-default` = "job-recipient-name-default".asInstanceOf[`job-recipient-name-default`]
  @scala.inline
  def `job-recipient-name-supported`: `job-recipient-name-supported` = "job-recipient-name-supported".asInstanceOf[`job-recipient-name-supported`]
  @scala.inline
  def `job-resolvers-supported`: `job-resolvers-supported` = "job-resolvers-supported".asInstanceOf[`job-resolvers-supported`]
  @scala.inline
  def `job-resource-ids`: `job-resource-ids` = "job-resource-ids".asInstanceOf[`job-resource-ids`]
  @scala.inline
  def `job-restartable`: `job-restartable` = "job-restartable".asInstanceOf[`job-restartable`]
  @scala.inline
  def `job-resuming`: `job-resuming` = "job-resuming".asInstanceOf[`job-resuming`]
  @scala.inline
  def `job-retain-until`: `job-retain-until` = "job-retain-until".asInstanceOf[`job-retain-until`]
  @scala.inline
  def `job-retain-until-default`: `job-retain-until-default` = "job-retain-until-default".asInstanceOf[`job-retain-until-default`]
  @scala.inline
  def `job-retain-until-interval`: `job-retain-until-interval` = "job-retain-until-interval".asInstanceOf[`job-retain-until-interval`]
  @scala.inline
  def `job-retain-until-interval-supported`: `job-retain-until-interval-supported` = "job-retain-until-interval-supported".asInstanceOf[`job-retain-until-interval-supported`]
  @scala.inline
  def `job-retain-until-supported`: `job-retain-until-supported` = "job-retain-until-supported".asInstanceOf[`job-retain-until-supported`]
  @scala.inline
  def `job-retain-until-time`: `job-retain-until-time` = "job-retain-until-time".asInstanceOf[`job-retain-until-time`]
  @scala.inline
  def `job-retain-until-time-supported`: `job-retain-until-time-supported` = "job-retain-until-time-supported".asInstanceOf[`job-retain-until-time-supported`]
  @scala.inline
  def `job-save`: `job-save` = "job-save".asInstanceOf[`job-save`]
  @scala.inline
  def `job-save-disposition`: `job-save-disposition` = "job-save-disposition".asInstanceOf[`job-save-disposition`]
  @scala.inline
  def `job-saved-successfully`: `job-saved-successfully` = "job-saved-successfully".asInstanceOf[`job-saved-successfully`]
  @scala.inline
  def `job-saved-with-errors`: `job-saved-with-errors` = "job-saved-with-errors".asInstanceOf[`job-saved-with-errors`]
  @scala.inline
  def `job-saved-with-warnings`: `job-saved-with-warnings` = "job-saved-with-warnings".asInstanceOf[`job-saved-with-warnings`]
  @scala.inline
  def `job-saving`: `job-saving` = "job-saving".asInstanceOf[`job-saving`]
  @scala.inline
  def `job-sheet-message`: `job-sheet-message` = "job-sheet-message".asInstanceOf[`job-sheet-message`]
  @scala.inline
  def `job-sheet-message-actual`: `job-sheet-message-actual` = "job-sheet-message-actual".asInstanceOf[`job-sheet-message-actual`]
  @scala.inline
  def `job-sheet-message-default`: `job-sheet-message-default` = "job-sheet-message-default".asInstanceOf[`job-sheet-message-default`]
  @scala.inline
  def `job-sheet-message-supported`: `job-sheet-message-supported` = "job-sheet-message-supported".asInstanceOf[`job-sheet-message-supported`]
  @scala.inline
  def `job-sheets`: `job-sheets` = "job-sheets".asInstanceOf[`job-sheets`]
  @scala.inline
  def `job-sheets-actual`: `job-sheets-actual` = "job-sheets-actual".asInstanceOf[`job-sheets-actual`]
  @scala.inline
  def `job-sheets-col`: `job-sheets-col` = "job-sheets-col".asInstanceOf[`job-sheets-col`]
  @scala.inline
  def `job-sheets-col-actual`: `job-sheets-col-actual` = "job-sheets-col-actual".asInstanceOf[`job-sheets-col-actual`]
  @scala.inline
  def `job-sheets-col-default`: `job-sheets-col-default` = "job-sheets-col-default".asInstanceOf[`job-sheets-col-default`]
  @scala.inline
  def `job-sheets-col-supported`: `job-sheets-col-supported` = "job-sheets-col-supported".asInstanceOf[`job-sheets-col-supported`]
  @scala.inline
  def `job-sheets-default`: `job-sheets-default` = "job-sheets-default".asInstanceOf[`job-sheets-default`]
  @scala.inline
  def `job-sheets-supported`: `job-sheets-supported` = "job-sheets-supported".asInstanceOf[`job-sheets-supported`]
  @scala.inline
  def `job-spooling`: `job-spooling` = "job-spooling".asInstanceOf[`job-spooling`]
  @scala.inline
  def `job-spooling-supported`: `job-spooling-supported` = "job-spooling-supported".asInstanceOf[`job-spooling-supported`]
  @scala.inline
  def `job-start-sheet`: `job-start-sheet` = "job-start-sheet".asInstanceOf[`job-start-sheet`]
  @scala.inline
  def `job-state`: `job-state` = "job-state".asInstanceOf[`job-state`]
  @scala.inline
  def `job-state-changed`: `job-state-changed` = "job-state-changed".asInstanceOf[`job-state-changed`]
  @scala.inline
  def `job-state-message`: `job-state-message` = "job-state-message".asInstanceOf[`job-state-message`]
  @scala.inline
  def `job-state-reasons`: `job-state-reasons` = "job-state-reasons".asInstanceOf[`job-state-reasons`]
  @scala.inline
  def `job-stopped`: `job-stopped` = "job-stopped".asInstanceOf[`job-stopped`]
  @scala.inline
  def `job-streaming`: `job-streaming` = "job-streaming".asInstanceOf[`job-streaming`]
  @scala.inline
  def `job-suspended`: `job-suspended` = "job-suspended".asInstanceOf[`job-suspended`]
  @scala.inline
  def `job-suspended-by-operator`: `job-suspended-by-operator` = "job-suspended-by-operator".asInstanceOf[`job-suspended-by-operator`]
  @scala.inline
  def `job-suspended-by-system`: `job-suspended-by-system` = "job-suspended-by-system".asInstanceOf[`job-suspended-by-system`]
  @scala.inline
  def `job-suspended-by-user`: `job-suspended-by-user` = "job-suspended-by-user".asInstanceOf[`job-suspended-by-user`]
  @scala.inline
  def `job-suspending`: `job-suspending` = "job-suspending".asInstanceOf[`job-suspending`]
  @scala.inline
  def `job-template`: `job-template` = "job-template".asInstanceOf[`job-template`]
  @scala.inline
  def `job-transforming`: `job-transforming` = "job-transforming".asInstanceOf[`job-transforming`]
  @scala.inline
  def `job-triggers-supported`: `job-triggers-supported` = "job-triggers-supported".asInstanceOf[`job-triggers-supported`]
  @scala.inline
  def `job-uri`: `job-uri` = "job-uri".asInstanceOf[`job-uri`]
  @scala.inline
  def `job-uuid`: `job-uuid` = "job-uuid".asInstanceOf[`job-uuid`]
  @scala.inline
  def `jog-offset`: `jog-offset` = "jog-offset".asInstanceOf[`jog-offset`]
  @scala.inline
  def `jpeg-features-supported`: `jpeg-features-supported` = "jpeg-features-supported".asInstanceOf[`jpeg-features-supported`]
  @scala.inline
  def `jpeg-k-octets-supported`: `jpeg-k-octets-supported` = "jpeg-k-octets-supported".asInstanceOf[`jpeg-k-octets-supported`]
  @scala.inline
  def `jpeg-x-dimension-supported`: `jpeg-x-dimension-supported` = "jpeg-x-dimension-supported".asInstanceOf[`jpeg-x-dimension-supported`]
  @scala.inline
  def `jpeg-y-dimension-supported`: `jpeg-y-dimension-supported` = "jpeg-y-dimension-supported".asInstanceOf[`jpeg-y-dimension-supported`]
  @scala.inline
  def jpn_chou2_111Dot1x146mm: jpn_chou2_111Dot1x146mm = "jpn_chou2_111.1x146mm".asInstanceOf[jpn_chou2_111Dot1x146mm]
  @scala.inline
  def jpn_chou3_120x235mm: jpn_chou3_120x235mm = "jpn_chou3_120x235mm".asInstanceOf[jpn_chou3_120x235mm]
  @scala.inline
  def jpn_chou40_90x225mm: jpn_chou40_90x225mm = "jpn_chou40_90x225mm".asInstanceOf[jpn_chou40_90x225mm]
  @scala.inline
  def jpn_chou4_90x205mm: jpn_chou4_90x205mm = "jpn_chou4_90x205mm".asInstanceOf[jpn_chou4_90x205mm]
  @scala.inline
  def jpn_hagaki_100x148mm: jpn_hagaki_100x148mm = "jpn_hagaki_100x148mm".asInstanceOf[jpn_hagaki_100x148mm]
  @scala.inline
  def jpn_kahu_240x322Dot1mm: jpn_kahu_240x322Dot1mm = "jpn_kahu_240x322.1mm".asInstanceOf[jpn_kahu_240x322Dot1mm]
  @scala.inline
  def jpn_kaku1_270x382mm: jpn_kaku1_270x382mm = "jpn_kaku1_270x382mm".asInstanceOf[jpn_kaku1_270x382mm]
  @scala.inline
  def jpn_kaku2_240x332mm: jpn_kaku2_240x332mm = "jpn_kaku2_240x332mm".asInstanceOf[jpn_kaku2_240x332mm]
  @scala.inline
  def jpn_kaku3_216x277mm: jpn_kaku3_216x277mm = "jpn_kaku3_216x277mm".asInstanceOf[jpn_kaku3_216x277mm]
  @scala.inline
  def jpn_kaku4_197x267mm: jpn_kaku4_197x267mm = "jpn_kaku4_197x267mm".asInstanceOf[jpn_kaku4_197x267mm]
  @scala.inline
  def jpn_kaku5_190x240mm: jpn_kaku5_190x240mm = "jpn_kaku5_190x240mm".asInstanceOf[jpn_kaku5_190x240mm]
  @scala.inline
  def jpn_kaku7_142x205mm: jpn_kaku7_142x205mm = "jpn_kaku7_142x205mm".asInstanceOf[jpn_kaku7_142x205mm]
  @scala.inline
  def jpn_kaku8_119x197mm: jpn_kaku8_119x197mm = "jpn_kaku8_119x197mm".asInstanceOf[jpn_kaku8_119x197mm]
  @scala.inline
  def jpn_oufuku_148x200mm: jpn_oufuku_148x200mm = "jpn_oufuku_148x200mm".asInstanceOf[jpn_oufuku_148x200mm]
  @scala.inline
  def jpn_you4_105x235mm: jpn_you4_105x235mm = "jpn_you4_105x235mm".asInstanceOf[jpn_you4_105x235mm]
  @scala.inline
  def keyparc: keyparc = "keyparc".asInstanceOf[keyparc]
  @scala.inline
  def kg: kg = "kg".asInstanceOf[kg]
  @scala.inline
  def `koi8-r`: `koi8-r` = "koi8-r".asInstanceOf[`koi8-r`]
  @scala.inline
  def `koi8-u`: `koi8-u` = "koi8-u".asInstanceOf[`koi8-u`]
  @scala.inline
  def `ks_c_5601-1987`: `ks_c_5601-1987` = "ks_c_5601-1987".asInstanceOf[`ks_c_5601-1987`]
  @scala.inline
  def l: l = "l".asInstanceOf[l]
  @scala.inline
  def label: label = "label".asInstanceOf[label]
  @scala.inline
  def labels: labels = "labels".asInstanceOf[labels]
  @scala.inline
  def `labels-colored`: `labels-colored` = "labels-colored".asInstanceOf[`labels-colored`]
  @scala.inline
  def `labels-glossy`: `labels-glossy` = "labels-glossy".asInstanceOf[`labels-glossy`]
  @scala.inline
  def `labels-high-gloss`: `labels-high-gloss` = "labels-high-gloss".asInstanceOf[`labels-high-gloss`]
  @scala.inline
  def `labels-inkjet`: `labels-inkjet` = "labels-inkjet".asInstanceOf[`labels-inkjet`]
  @scala.inline
  def `labels-matte`: `labels-matte` = "labels-matte".asInstanceOf[`labels-matte`]
  @scala.inline
  def `labels-permanent`: `labels-permanent` = "labels-permanent".asInstanceOf[`labels-permanent`]
  @scala.inline
  def `labels-satin`: `labels-satin` = "labels-satin".asInstanceOf[`labels-satin`]
  @scala.inline
  def `labels-security`: `labels-security` = "labels-security".asInstanceOf[`labels-security`]
  @scala.inline
  def `labels-semi-gloss`: `labels-semi-gloss` = "labels-semi-gloss".asInstanceOf[`labels-semi-gloss`]
  @scala.inline
  def laminate: laminate = "laminate".asInstanceOf[laminate]
  @scala.inline
  def laminating: laminating = "laminating".asInstanceOf[laminating]
  @scala.inline
  def `laminating-foil`: `laminating-foil` = "laminating-foil".asInstanceOf[`laminating-foil`]
  @scala.inline
  def `laminating-sides-supported`: `laminating-sides-supported` = "laminating-sides-supported".asInstanceOf[`laminating-sides-supported`]
  @scala.inline
  def `laminating-type-supported`: `laminating-type-supported` = "laminating-type-supported".asInstanceOf[`laminating-type-supported`]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  @scala.inline
  def `large-capacity`: `large-capacity` = "large-capacity".asInstanceOf[`large-capacity`]
  @scala.inline
  def lastfm: lastfm = "lastfm".asInstanceOf[lastfm]
  @scala.inline
  def ldap: ldap = "ldap".asInstanceOf[ldap]
  @scala.inline
  def ldaps: ldaps = "ldaps".asInstanceOf[ldaps]
  @scala.inline
  def leaptofrogans: leaptofrogans = "leaptofrogans".asInstanceOf[leaptofrogans]
  @scala.inline
  def ledger: ledger = "ledger".asInstanceOf[ledger]
  @scala.inline
  def `ledger-white`: `ledger-white` = "ledger-white".asInstanceOf[`ledger-white`]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `letter-head`: `letter-head` = "letter-head".asInstanceOf[`letter-head`]
  @scala.inline
  def letterhead: letterhead = "letterhead".asInstanceOf[letterhead]
  @scala.inline
  def `light-black`: `light-black` = "light-black".asInstanceOf[`light-black`]
  @scala.inline
  def `light-blue`: `light-blue` = "light-blue".asInstanceOf[`light-blue`]
  @scala.inline
  def `light-brown`: `light-brown` = "light-brown".asInstanceOf[`light-brown`]
  @scala.inline
  def `light-buff`: `light-buff` = "light-buff".asInstanceOf[`light-buff`]
  @scala.inline
  def `light-cyan`: `light-cyan` = "light-cyan".asInstanceOf[`light-cyan`]
  @scala.inline
  def `light-gold`: `light-gold` = "light-gold".asInstanceOf[`light-gold`]
  @scala.inline
  def `light-goldenrod`: `light-goldenrod` = "light-goldenrod".asInstanceOf[`light-goldenrod`]
  @scala.inline
  def `light-gray`: `light-gray` = "light-gray".asInstanceOf[`light-gray`]
  @scala.inline
  def `light-green`: `light-green` = "light-green".asInstanceOf[`light-green`]
  @scala.inline
  def `light-ivory`: `light-ivory` = "light-ivory".asInstanceOf[`light-ivory`]
  @scala.inline
  def `light-magenta`: `light-magenta` = "light-magenta".asInstanceOf[`light-magenta`]
  @scala.inline
  def `light-mustard`: `light-mustard` = "light-mustard".asInstanceOf[`light-mustard`]
  @scala.inline
  def `light-orange`: `light-orange` = "light-orange".asInstanceOf[`light-orange`]
  @scala.inline
  def `light-pink`: `light-pink` = "light-pink".asInstanceOf[`light-pink`]
  @scala.inline
  def `light-red`: `light-red` = "light-red".asInstanceOf[`light-red`]
  @scala.inline
  def `light-silver`: `light-silver` = "light-silver".asInstanceOf[`light-silver`]
  @scala.inline
  def `light-turquoise`: `light-turquoise` = "light-turquoise".asInstanceOf[`light-turquoise`]
  @scala.inline
  def `light-violet`: `light-violet` = "light-violet".asInstanceOf[`light-violet`]
  @scala.inline
  def `light-yellow`: `light-yellow` = "light-yellow".asInstanceOf[`light-yellow`]
  @scala.inline
  def `line-art`: `line-art` = "line-art".asInstanceOf[`line-art`]
  @scala.inline
  def linen: linen = "linen".asInstanceOf[linen]
  @scala.inline
  def `logo-uri-formats-supported`: `logo-uri-formats-supported` = "logo-uri-formats-supported".asInstanceOf[`logo-uri-formats-supported`]
  @scala.inline
  def `logo-uri-schemes-supported`: `logo-uri-schemes-supported` = "logo-uri-schemes-supported".asInstanceOf[`logo-uri-schemes-supported`]
  @scala.inline
  def `long-edge-first`: `long-edge-first` = "long-edge-first".asInstanceOf[`long-edge-first`]
  @scala.inline
  def lorawan: lorawan = "lorawan".asInstanceOf[lorawan]
  @scala.inline
  def lossless: lossless = "lossless".asInstanceOf[lossless]
  @scala.inline
  def lvlt: lvlt = "lvlt".asInstanceOf[lvlt]
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  @scala.inline
  def macintosh: macintosh = "macintosh".asInstanceOf[macintosh]
  @scala.inline
  def magazine: magazine = "magazine".asInstanceOf[magazine]
  @scala.inline
  def magenta: magenta = "magenta".asInstanceOf[magenta]
  @scala.inline
  def magnet: magnet = "magnet".asInstanceOf[magnet]
  @scala.inline
  def `mailbox-1`: `mailbox-1` = "mailbox-1".asInstanceOf[`mailbox-1`]
  @scala.inline
  def `mailbox-10`: `mailbox-10` = "mailbox-10".asInstanceOf[`mailbox-10`]
  @scala.inline
  def `mailbox-2`: `mailbox-2` = "mailbox-2".asInstanceOf[`mailbox-2`]
  @scala.inline
  def `mailbox-3`: `mailbox-3` = "mailbox-3".asInstanceOf[`mailbox-3`]
  @scala.inline
  def `mailbox-4`: `mailbox-4` = "mailbox-4".asInstanceOf[`mailbox-4`]
  @scala.inline
  def `mailbox-5`: `mailbox-5` = "mailbox-5".asInstanceOf[`mailbox-5`]
  @scala.inline
  def `mailbox-6`: `mailbox-6` = "mailbox-6".asInstanceOf[`mailbox-6`]
  @scala.inline
  def `mailbox-7`: `mailbox-7` = "mailbox-7".asInstanceOf[`mailbox-7`]
  @scala.inline
  def `mailbox-8`: `mailbox-8` = "mailbox-8".asInstanceOf[`mailbox-8`]
  @scala.inline
  def `mailbox-9`: `mailbox-9` = "mailbox-9".asInstanceOf[`mailbox-9`]
  @scala.inline
  def mailserver: mailserver = "mailserver".asInstanceOf[mailserver]
  @scala.inline
  def mailto: mailto = "mailto".asInstanceOf[mailto]
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  @scala.inline
  def `main-roll`: `main-roll` = "main-roll".asInstanceOf[`main-roll`]
  @scala.inline
  def `make-envelope-added`: `make-envelope-added` = "make-envelope-added".asInstanceOf[`make-envelope-added`]
  @scala.inline
  def `make-envelope-almost-empty`: `make-envelope-almost-empty` = "make-envelope-almost-empty".asInstanceOf[`make-envelope-almost-empty`]
  @scala.inline
  def `make-envelope-almost-full`: `make-envelope-almost-full` = "make-envelope-almost-full".asInstanceOf[`make-envelope-almost-full`]
  @scala.inline
  def `make-envelope-at-limit`: `make-envelope-at-limit` = "make-envelope-at-limit".asInstanceOf[`make-envelope-at-limit`]
  @scala.inline
  def `make-envelope-closed`: `make-envelope-closed` = "make-envelope-closed".asInstanceOf[`make-envelope-closed`]
  @scala.inline
  def `make-envelope-configuration-change`: `make-envelope-configuration-change` = "make-envelope-configuration-change".asInstanceOf[`make-envelope-configuration-change`]
  @scala.inline
  def `make-envelope-cover-closed`: `make-envelope-cover-closed` = "make-envelope-cover-closed".asInstanceOf[`make-envelope-cover-closed`]
  @scala.inline
  def `make-envelope-cover-open`: `make-envelope-cover-open` = "make-envelope-cover-open".asInstanceOf[`make-envelope-cover-open`]
  @scala.inline
  def `make-envelope-empty`: `make-envelope-empty` = "make-envelope-empty".asInstanceOf[`make-envelope-empty`]
  @scala.inline
  def `make-envelope-full`: `make-envelope-full` = "make-envelope-full".asInstanceOf[`make-envelope-full`]
  @scala.inline
  def `make-envelope-interlock-closed`: `make-envelope-interlock-closed` = "make-envelope-interlock-closed".asInstanceOf[`make-envelope-interlock-closed`]
  @scala.inline
  def `make-envelope-interlock-open`: `make-envelope-interlock-open` = "make-envelope-interlock-open".asInstanceOf[`make-envelope-interlock-open`]
  @scala.inline
  def `make-envelope-jam`: `make-envelope-jam` = "make-envelope-jam".asInstanceOf[`make-envelope-jam`]
  @scala.inline
  def `make-envelope-life-almost-over`: `make-envelope-life-almost-over` = "make-envelope-life-almost-over".asInstanceOf[`make-envelope-life-almost-over`]
  @scala.inline
  def `make-envelope-life-over`: `make-envelope-life-over` = "make-envelope-life-over".asInstanceOf[`make-envelope-life-over`]
  @scala.inline
  def `make-envelope-memory-exhausted`: `make-envelope-memory-exhausted` = "make-envelope-memory-exhausted".asInstanceOf[`make-envelope-memory-exhausted`]
  @scala.inline
  def `make-envelope-missing`: `make-envelope-missing` = "make-envelope-missing".asInstanceOf[`make-envelope-missing`]
  @scala.inline
  def `make-envelope-motor-failure`: `make-envelope-motor-failure` = "make-envelope-motor-failure".asInstanceOf[`make-envelope-motor-failure`]
  @scala.inline
  def `make-envelope-near-limit`: `make-envelope-near-limit` = "make-envelope-near-limit".asInstanceOf[`make-envelope-near-limit`]
  @scala.inline
  def `make-envelope-offline`: `make-envelope-offline` = "make-envelope-offline".asInstanceOf[`make-envelope-offline`]
  @scala.inline
  def `make-envelope-opened`: `make-envelope-opened` = "make-envelope-opened".asInstanceOf[`make-envelope-opened`]
  @scala.inline
  def `make-envelope-over-temperature`: `make-envelope-over-temperature` = "make-envelope-over-temperature".asInstanceOf[`make-envelope-over-temperature`]
  @scala.inline
  def `make-envelope-power-saver`: `make-envelope-power-saver` = "make-envelope-power-saver".asInstanceOf[`make-envelope-power-saver`]
  @scala.inline
  def `make-envelope-recoverable-failure`: `make-envelope-recoverable-failure` = "make-envelope-recoverable-failure".asInstanceOf[`make-envelope-recoverable-failure`]
  @scala.inline
  def `make-envelope-recoverable-storage-error`: `make-envelope-recoverable-storage-error` = "make-envelope-recoverable-storage-error".asInstanceOf[`make-envelope-recoverable-storage-error`]
  @scala.inline
  def `make-envelope-removed`: `make-envelope-removed` = "make-envelope-removed".asInstanceOf[`make-envelope-removed`]
  @scala.inline
  def `make-envelope-resource-added`: `make-envelope-resource-added` = "make-envelope-resource-added".asInstanceOf[`make-envelope-resource-added`]
  @scala.inline
  def `make-envelope-resource-removed`: `make-envelope-resource-removed` = "make-envelope-resource-removed".asInstanceOf[`make-envelope-resource-removed`]
  @scala.inline
  def `make-envelope-thermistor-failure`: `make-envelope-thermistor-failure` = "make-envelope-thermistor-failure".asInstanceOf[`make-envelope-thermistor-failure`]
  @scala.inline
  def `make-envelope-timing-failure`: `make-envelope-timing-failure` = "make-envelope-timing-failure".asInstanceOf[`make-envelope-timing-failure`]
  @scala.inline
  def `make-envelope-turned-off`: `make-envelope-turned-off` = "make-envelope-turned-off".asInstanceOf[`make-envelope-turned-off`]
  @scala.inline
  def `make-envelope-turned-on`: `make-envelope-turned-on` = "make-envelope-turned-on".asInstanceOf[`make-envelope-turned-on`]
  @scala.inline
  def `make-envelope-under-temperature`: `make-envelope-under-temperature` = "make-envelope-under-temperature".asInstanceOf[`make-envelope-under-temperature`]
  @scala.inline
  def `make-envelope-unrecoverable-failure`: `make-envelope-unrecoverable-failure` = "make-envelope-unrecoverable-failure".asInstanceOf[`make-envelope-unrecoverable-failure`]
  @scala.inline
  def `make-envelope-unrecoverable-storage-error`: `make-envelope-unrecoverable-storage-error` = "make-envelope-unrecoverable-storage-error".asInstanceOf[`make-envelope-unrecoverable-storage-error`]
  @scala.inline
  def `make-envelope-warming-up`: `make-envelope-warming-up` = "make-envelope-warming-up".asInstanceOf[`make-envelope-warming-up`]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def `manual-tumble`: `manual-tumble` = "manual-tumble".asInstanceOf[`manual-tumble`]
  @scala.inline
  def maps: maps = "maps".asInstanceOf[maps]
  @scala.inline
  def `marker-adjusting-print-quality`: `marker-adjusting-print-quality` = "marker-adjusting-print-quality".asInstanceOf[`marker-adjusting-print-quality`]
  @scala.inline
  def `marker-developer-almost-empty`: `marker-developer-almost-empty` = "marker-developer-almost-empty".asInstanceOf[`marker-developer-almost-empty`]
  @scala.inline
  def `marker-developer-empty`: `marker-developer-empty` = "marker-developer-empty".asInstanceOf[`marker-developer-empty`]
  @scala.inline
  def `marker-fuser-thermistor-failure`: `marker-fuser-thermistor-failure` = "marker-fuser-thermistor-failure".asInstanceOf[`marker-fuser-thermistor-failure`]
  @scala.inline
  def `marker-fuser-timing-failure`: `marker-fuser-timing-failure` = "marker-fuser-timing-failure".asInstanceOf[`marker-fuser-timing-failure`]
  @scala.inline
  def `marker-ink-almost-empty`: `marker-ink-almost-empty` = "marker-ink-almost-empty".asInstanceOf[`marker-ink-almost-empty`]
  @scala.inline
  def `marker-ink-empty`: `marker-ink-empty` = "marker-ink-empty".asInstanceOf[`marker-ink-empty`]
  @scala.inline
  def `marker-print-ribbon-almost-empty`: `marker-print-ribbon-almost-empty` = "marker-print-ribbon-almost-empty".asInstanceOf[`marker-print-ribbon-almost-empty`]
  @scala.inline
  def `marker-print-ribbon-empty`: `marker-print-ribbon-empty` = "marker-print-ribbon-empty".asInstanceOf[`marker-print-ribbon-empty`]
  @scala.inline
  def `marker-supply-empty`: `marker-supply-empty` = "marker-supply-empty".asInstanceOf[`marker-supply-empty`]
  @scala.inline
  def `marker-supply-low`: `marker-supply-low` = "marker-supply-low".asInstanceOf[`marker-supply-low`]
  @scala.inline
  def `marker-toner-cartridge-missing`: `marker-toner-cartridge-missing` = "marker-toner-cartridge-missing".asInstanceOf[`marker-toner-cartridge-missing`]
  @scala.inline
  def `marker-waste-almost-full`: `marker-waste-almost-full` = "marker-waste-almost-full".asInstanceOf[`marker-waste-almost-full`]
  @scala.inline
  def `marker-waste-full`: `marker-waste-full` = "marker-waste-full".asInstanceOf[`marker-waste-full`]
  @scala.inline
  def `marker-waste-ink-receptacle-almost-full`: `marker-waste-ink-receptacle-almost-full` = "marker-waste-ink-receptacle-almost-full".asInstanceOf[`marker-waste-ink-receptacle-almost-full`]
  @scala.inline
  def `marker-waste-ink-receptacle-full`: `marker-waste-ink-receptacle-full` = "marker-waste-ink-receptacle-full".asInstanceOf[`marker-waste-ink-receptacle-full`]
  @scala.inline
  def `marker-waste-toner-receptacle-almost-full`: `marker-waste-toner-receptacle-almost-full` = "marker-waste-toner-receptacle-almost-full".asInstanceOf[`marker-waste-toner-receptacle-almost-full`]
  @scala.inline
  def `marker-waste-toner-receptacle-full`: `marker-waste-toner-receptacle-full` = "marker-waste-toner-receptacle-full".asInstanceOf[`marker-waste-toner-receptacle-full`]
  @scala.inline
  def market: market = "market".asInstanceOf[market]
  @scala.inline
  def material: material = "material".asInstanceOf[material]
  @scala.inline
  def `material-amount`: `material-amount` = "material-amount".asInstanceOf[`material-amount`]
  @scala.inline
  def `material-amount-units`: `material-amount-units` = "material-amount-units".asInstanceOf[`material-amount-units`]
  @scala.inline
  def `material-amount-units-supported`: `material-amount-units-supported` = "material-amount-units-supported".asInstanceOf[`material-amount-units-supported`]
  @scala.inline
  def `material-color`: `material-color` = "material-color".asInstanceOf[`material-color`]
  @scala.inline
  def `material-diameter`: `material-diameter` = "material-diameter".asInstanceOf[`material-diameter`]
  @scala.inline
  def `material-diameter-supported`: `material-diameter-supported` = "material-diameter-supported".asInstanceOf[`material-diameter-supported`]
  @scala.inline
  def `material-diameter-tolerance`: `material-diameter-tolerance` = "material-diameter-tolerance".asInstanceOf[`material-diameter-tolerance`]
  @scala.inline
  def `material-fill-density`: `material-fill-density` = "material-fill-density".asInstanceOf[`material-fill-density`]
  @scala.inline
  def `material-key`: `material-key` = "material-key".asInstanceOf[`material-key`]
  @scala.inline
  def `material-name`: `material-name` = "material-name".asInstanceOf[`material-name`]
  @scala.inline
  def `material-nozzle-diameter`: `material-nozzle-diameter` = "material-nozzle-diameter".asInstanceOf[`material-nozzle-diameter`]
  @scala.inline
  def `material-nozzle-diameter-supported`: `material-nozzle-diameter-supported` = "material-nozzle-diameter-supported".asInstanceOf[`material-nozzle-diameter-supported`]
  @scala.inline
  def `material-purpose`: `material-purpose` = "material-purpose".asInstanceOf[`material-purpose`]
  @scala.inline
  def `material-purpose-supported`: `material-purpose-supported` = "material-purpose-supported".asInstanceOf[`material-purpose-supported`]
  @scala.inline
  def `material-rate`: `material-rate` = "material-rate".asInstanceOf[`material-rate`]
  @scala.inline
  def `material-rate-supported`: `material-rate-supported` = "material-rate-supported".asInstanceOf[`material-rate-supported`]
  @scala.inline
  def `material-rate-units`: `material-rate-units` = "material-rate-units".asInstanceOf[`material-rate-units`]
  @scala.inline
  def `material-rate-units-supported`: `material-rate-units-supported` = "material-rate-units-supported".asInstanceOf[`material-rate-units-supported`]
  @scala.inline
  def `material-retraction`: `material-retraction` = "material-retraction".asInstanceOf[`material-retraction`]
  @scala.inline
  def `material-shell-thickness`: `material-shell-thickness` = "material-shell-thickness".asInstanceOf[`material-shell-thickness`]
  @scala.inline
  def `material-shell-thickness-supported`: `material-shell-thickness-supported` = "material-shell-thickness-supported".asInstanceOf[`material-shell-thickness-supported`]
  @scala.inline
  def `material-temperature`: `material-temperature` = "material-temperature".asInstanceOf[`material-temperature`]
  @scala.inline
  def `material-temperature-supported`: `material-temperature-supported` = "material-temperature-supported".asInstanceOf[`material-temperature-supported`]
  @scala.inline
  def `material-type`: `material-type` = "material-type".asInstanceOf[`material-type`]
  @scala.inline
  def `material-type-supported`: `material-type-supported` = "material-type-supported".asInstanceOf[`material-type-supported`]
  @scala.inline
  def `materials-col`: `materials-col` = "materials-col".asInstanceOf[`materials-col`]
  @scala.inline
  def `materials-col-actual`: `materials-col-actual` = "materials-col-actual".asInstanceOf[`materials-col-actual`]
  @scala.inline
  def `materials-col-database`: `materials-col-database` = "materials-col-database".asInstanceOf[`materials-col-database`]
  @scala.inline
  def `materials-col-default`: `materials-col-default` = "materials-col-default".asInstanceOf[`materials-col-default`]
  @scala.inline
  def `materials-col-ready`: `materials-col-ready` = "materials-col-ready".asInstanceOf[`materials-col-ready`]
  @scala.inline
  def `materials-col-supported`: `materials-col-supported` = "materials-col-supported".asInstanceOf[`materials-col-supported`]
  @scala.inline
  def matte: matte = "matte".asInstanceOf[matte]
  @scala.inline
  def `max-materials-col-supported`: `max-materials-col-supported` = "max-materials-col-supported".asInstanceOf[`max-materials-col-supported`]
  @scala.inline
  def `max-page-ranges-supported`: `max-page-ranges-supported` = "max-page-ranges-supported".asInstanceOf[`max-page-ranges-supported`]
  @scala.inline
  def `max-save-info-supported`: `max-save-info-supported` = "max-save-info-supported".asInstanceOf[`max-save-info-supported`]
  @scala.inline
  def `max-stitching-locations-supported`: `max-stitching-locations-supported` = "max-stitching-locations-supported".asInstanceOf[`max-stitching-locations-supported`]
  @scala.inline
  def md2: md2 = "md2".asInstanceOf[md2]
  @scala.inline
  def md4: md4 = "md4".asInstanceOf[md4]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def `media-actual`: `media-actual` = "media-actual".asInstanceOf[`media-actual`]
  @scala.inline
  def `media-back-coating-supported`: `media-back-coating-supported` = "media-back-coating-supported".asInstanceOf[`media-back-coating-supported`]
  @scala.inline
  def `media-bottom-margin`: `media-bottom-margin` = "media-bottom-margin".asInstanceOf[`media-bottom-margin`]
  @scala.inline
  def `media-bottom-margin-supported`: `media-bottom-margin-supported` = "media-bottom-margin-supported".asInstanceOf[`media-bottom-margin-supported`]
  @scala.inline
  def `media-col`: `media-col` = "media-col".asInstanceOf[`media-col`]
  @scala.inline
  def `media-col-actual`: `media-col-actual` = "media-col-actual".asInstanceOf[`media-col-actual`]
  @scala.inline
  def `media-col-database`: `media-col-database` = "media-col-database".asInstanceOf[`media-col-database`]
  @scala.inline
  def `media-col-default`: `media-col-default` = "media-col-default".asInstanceOf[`media-col-default`]
  @scala.inline
  def `media-col-ready`: `media-col-ready` = "media-col-ready".asInstanceOf[`media-col-ready`]
  @scala.inline
  def `media-col-supported`: `media-col-supported` = "media-col-supported".asInstanceOf[`media-col-supported`]
  @scala.inline
  def `media-color-supported`: `media-color-supported` = "media-color-supported".asInstanceOf[`media-color-supported`]
  @scala.inline
  def `media-default`: `media-default` = "media-default".asInstanceOf[`media-default`]
  @scala.inline
  def `media-empty`: `media-empty` = "media-empty".asInstanceOf[`media-empty`]
  @scala.inline
  def `media-front-coating-supported`: `media-front-coating-supported` = "media-front-coating-supported".asInstanceOf[`media-front-coating-supported`]
  @scala.inline
  def `media-grain-supported`: `media-grain-supported` = "media-grain-supported".asInstanceOf[`media-grain-supported`]
  @scala.inline
  def `media-hole-count-supported`: `media-hole-count-supported` = "media-hole-count-supported".asInstanceOf[`media-hole-count-supported`]
  @scala.inline
  def `media-input-tray-check`: `media-input-tray-check` = "media-input-tray-check".asInstanceOf[`media-input-tray-check`]
  @scala.inline
  def `media-input-tray-check-actual`: `media-input-tray-check-actual` = "media-input-tray-check-actual".asInstanceOf[`media-input-tray-check-actual`]
  @scala.inline
  def `media-jam`: `media-jam` = "media-jam".asInstanceOf[`media-jam`]
  @scala.inline
  def `media-key-supported`: `media-key-supported` = "media-key-supported".asInstanceOf[`media-key-supported`]
  @scala.inline
  def `media-left-margin`: `media-left-margin` = "media-left-margin".asInstanceOf[`media-left-margin`]
  @scala.inline
  def `media-left-margin-supported`: `media-left-margin-supported` = "media-left-margin-supported".asInstanceOf[`media-left-margin-supported`]
  @scala.inline
  def `media-low`: `media-low` = "media-low".asInstanceOf[`media-low`]
  @scala.inline
  def `media-needed`: `media-needed` = "media-needed".asInstanceOf[`media-needed`]
  @scala.inline
  def `media-order-count-supported`: `media-order-count-supported` = "media-order-count-supported".asInstanceOf[`media-order-count-supported`]
  @scala.inline
  def `media-path-cannot-duplex-media-selected`: `media-path-cannot-duplex-media-selected` = "media-path-cannot-duplex-media-selected".asInstanceOf[`media-path-cannot-duplex-media-selected`]
  @scala.inline
  def `media-path-media-tray-almost-full`: `media-path-media-tray-almost-full` = "media-path-media-tray-almost-full".asInstanceOf[`media-path-media-tray-almost-full`]
  @scala.inline
  def `media-path-media-tray-full`: `media-path-media-tray-full` = "media-path-media-tray-full".asInstanceOf[`media-path-media-tray-full`]
  @scala.inline
  def `media-path-media-tray-missing`: `media-path-media-tray-missing` = "media-path-media-tray-missing".asInstanceOf[`media-path-media-tray-missing`]
  @scala.inline
  def `media-pre-printed-supported`: `media-pre-printed-supported` = "media-pre-printed-supported".asInstanceOf[`media-pre-printed-supported`]
  @scala.inline
  def `media-ready`: `media-ready` = "media-ready".asInstanceOf[`media-ready`]
  @scala.inline
  def `media-recycled-supported`: `media-recycled-supported` = "media-recycled-supported".asInstanceOf[`media-recycled-supported`]
  @scala.inline
  def `media-right-margin`: `media-right-margin` = "media-right-margin".asInstanceOf[`media-right-margin`]
  @scala.inline
  def `media-right-margin-supported`: `media-right-margin-supported` = "media-right-margin-supported".asInstanceOf[`media-right-margin-supported`]
  @scala.inline
  def `media-sheets-supported`: `media-sheets-supported` = "media-sheets-supported".asInstanceOf[`media-sheets-supported`]
  @scala.inline
  def `media-size`: `media-size` = "media-size".asInstanceOf[`media-size`]
  @scala.inline
  def `media-size-name`: `media-size-name` = "media-size-name".asInstanceOf[`media-size-name`]
  @scala.inline
  def `media-size-supported`: `media-size-supported` = "media-size-supported".asInstanceOf[`media-size-supported`]
  @scala.inline
  def `media-source`: `media-source` = "media-source".asInstanceOf[`media-source`]
  @scala.inline
  def `media-source-supported`: `media-source-supported` = "media-source-supported".asInstanceOf[`media-source-supported`]
  @scala.inline
  def `media-supported`: `media-supported` = "media-supported".asInstanceOf[`media-supported`]
  @scala.inline
  def `media-thickness-supported`: `media-thickness-supported` = "media-thickness-supported".asInstanceOf[`media-thickness-supported`]
  @scala.inline
  def `media-tooth-supported`: `media-tooth-supported` = "media-tooth-supported".asInstanceOf[`media-tooth-supported`]
  @scala.inline
  def `media-top-margin`: `media-top-margin` = "media-top-margin".asInstanceOf[`media-top-margin`]
  @scala.inline
  def `media-top-margin-supported`: `media-top-margin-supported` = "media-top-margin-supported".asInstanceOf[`media-top-margin-supported`]
  @scala.inline
  def `media-type-supported`: `media-type-supported` = "media-type-supported".asInstanceOf[`media-type-supported`]
  @scala.inline
  def `media-weight-metric-supported`: `media-weight-metric-supported` = "media-weight-metric-supported".asInstanceOf[`media-weight-metric-supported`]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def `message-supported`: `message-supported` = "message-supported".asInstanceOf[`message-supported`]
  @scala.inline
  def `messageSlashexternal-body`: `messageSlashexternal-body` = "message/external-body".asInstanceOf[`messageSlashexternal-body`]
  @scala.inline
  def messageSlashnews: messageSlashnews = "message/news".asInstanceOf[messageSlashnews]
  @scala.inline
  def messageSlashpartial: messageSlashpartial = "message/partial".asInstanceOf[messageSlashpartial]
  @scala.inline
  def messageSlashrfc822: messageSlashrfc822 = "message/rfc822".asInstanceOf[messageSlashrfc822]
  @scala.inline
  def metal: metal = "metal".asInstanceOf[metal]
  @scala.inline
  def `metal-glossy`: `metal-glossy` = "metal-glossy".asInstanceOf[`metal-glossy`]
  @scala.inline
  def `metal-high-gloss`: `metal-high-gloss` = "metal-high-gloss".asInstanceOf[`metal-high-gloss`]
  @scala.inline
  def `metal-matte`: `metal-matte` = "metal-matte".asInstanceOf[`metal-matte`]
  @scala.inline
  def `metal-satin`: `metal-satin` = "metal-satin".asInstanceOf[`metal-satin`]
  @scala.inline
  def `metal-semi-gloss`: `metal-semi-gloss` = "metal-semi-gloss".asInstanceOf[`metal-semi-gloss`]
  @scala.inline
  def mg_second: mg_second = "mg_second".asInstanceOf[mg_second]
  @scala.inline
  def microsoftDotwindowsDotcamera: microsoftDotwindowsDotcamera = "microsoft.windows.camera".asInstanceOf[microsoftDotwindowsDotcamera]
  @scala.inline
  def microsoftDotwindowsDotcameraDotmultipicker: microsoftDotwindowsDotcameraDotmultipicker = "microsoft.windows.camera.multipicker".asInstanceOf[microsoftDotwindowsDotcameraDotmultipicker]
  @scala.inline
  def microsoftDotwindowsDotcameraDotpicker: microsoftDotwindowsDotcameraDotpicker = "microsoft.windows.camera.picker".asInstanceOf[microsoftDotwindowsDotcameraDotpicker]
  @scala.inline
  def mid: mid = "mid".asInstanceOf[mid]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def ml: ml = "ml".asInstanceOf[ml]
  @scala.inline
  def ml_second: ml_second = "ml_second".asInstanceOf[ml_second]
  @scala.inline
  def mm: mm = "mm".asInstanceOf[mm]
  @scala.inline
  def mm_second: mm_second = "mm_second".asInstanceOf[mm_second]
  @scala.inline
  def mms: mms = "mms".asInstanceOf[mms]
  @scala.inline
  def modem: modem = "modem".asInstanceOf[modem]
  @scala.inline
  def monarch: monarch = "monarch".asInstanceOf[monarch]
  @scala.inline
  def `monarch-envelope`: `monarch-envelope` = "monarch-envelope".asInstanceOf[`monarch-envelope`]
  @scala.inline
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  @scala.inline
  def monochrome: monochrome = "monochrome".asInstanceOf[monochrome]
  @scala.inline
  def monochrome_16: monochrome_16 = "monochrome_16".asInstanceOf[monochrome_16]
  @scala.inline
  def monochrome_4: monochrome_4 = "monochrome_4".asInstanceOf[monochrome_4]
  @scala.inline
  def monochrome_8: monochrome_8 = "monochrome_8".asInstanceOf[monochrome_8]
  @scala.inline
  def `mounting-tape`: `mounting-tape` = "mounting-tape".asInstanceOf[`mounting-tape`]
  @scala.inline
  def `moving-to-paused`: `moving-to-paused` = "moving-to-paused".asInstanceOf[`moving-to-paused`]
  @scala.inline
  def moz: moz = "moz".asInstanceOf[moz]
  @scala.inline
  def `ms-access`: `ms-access` = "ms-access".asInstanceOf[`ms-access`]
  @scala.inline
  def `ms-browser-extension`: `ms-browser-extension` = "ms-browser-extension".asInstanceOf[`ms-browser-extension`]
  @scala.inline
  def `ms-calculator`: `ms-calculator` = "ms-calculator".asInstanceOf[`ms-calculator`]
  @scala.inline
  def `ms-drive-to`: `ms-drive-to` = "ms-drive-to".asInstanceOf[`ms-drive-to`]
  @scala.inline
  def `ms-enrollment`: `ms-enrollment` = "ms-enrollment".asInstanceOf[`ms-enrollment`]
  @scala.inline
  def `ms-excel`: `ms-excel` = "ms-excel".asInstanceOf[`ms-excel`]
  @scala.inline
  def `ms-eyecontrolspeech`: `ms-eyecontrolspeech` = "ms-eyecontrolspeech".asInstanceOf[`ms-eyecontrolspeech`]
  @scala.inline
  def `ms-gamebarservices`: `ms-gamebarservices` = "ms-gamebarservices".asInstanceOf[`ms-gamebarservices`]
  @scala.inline
  def `ms-gamingoverlay`: `ms-gamingoverlay` = "ms-gamingoverlay".asInstanceOf[`ms-gamingoverlay`]
  @scala.inline
  def `ms-getoffice`: `ms-getoffice` = "ms-getoffice".asInstanceOf[`ms-getoffice`]
  @scala.inline
  def `ms-help`: `ms-help` = "ms-help".asInstanceOf[`ms-help`]
  @scala.inline
  def `ms-infopath`: `ms-infopath` = "ms-infopath".asInstanceOf[`ms-infopath`]
  @scala.inline
  def `ms-inputapp`: `ms-inputapp` = "ms-inputapp".asInstanceOf[`ms-inputapp`]
  @scala.inline
  def `ms-lockscreencomponent-config`: `ms-lockscreencomponent-config` = "ms-lockscreencomponent-config".asInstanceOf[`ms-lockscreencomponent-config`]
  @scala.inline
  def `ms-media-stream-id`: `ms-media-stream-id` = "ms-media-stream-id".asInstanceOf[`ms-media-stream-id`]
  @scala.inline
  def `ms-mixedrealitycapture`: `ms-mixedrealitycapture` = "ms-mixedrealitycapture".asInstanceOf[`ms-mixedrealitycapture`]
  @scala.inline
  def `ms-mobileplans`: `ms-mobileplans` = "ms-mobileplans".asInstanceOf[`ms-mobileplans`]
  @scala.inline
  def `ms-officeapp`: `ms-officeapp` = "ms-officeapp".asInstanceOf[`ms-officeapp`]
  @scala.inline
  def `ms-people`: `ms-people` = "ms-people".asInstanceOf[`ms-people`]
  @scala.inline
  def `ms-powerpoint`: `ms-powerpoint` = "ms-powerpoint".asInstanceOf[`ms-powerpoint`]
  @scala.inline
  def `ms-project`: `ms-project` = "ms-project".asInstanceOf[`ms-project`]
  @scala.inline
  def `ms-publisher`: `ms-publisher` = "ms-publisher".asInstanceOf[`ms-publisher`]
  @scala.inline
  def `ms-restoretabcompanion`: `ms-restoretabcompanion` = "ms-restoretabcompanion".asInstanceOf[`ms-restoretabcompanion`]
  @scala.inline
  def `ms-screenclip`: `ms-screenclip` = "ms-screenclip".asInstanceOf[`ms-screenclip`]
  @scala.inline
  def `ms-screensketch`: `ms-screensketch` = "ms-screensketch".asInstanceOf[`ms-screensketch`]
  @scala.inline
  def `ms-search`: `ms-search` = "ms-search".asInstanceOf[`ms-search`]
  @scala.inline
  def `ms-search-repair`: `ms-search-repair` = "ms-search-repair".asInstanceOf[`ms-search-repair`]
  @scala.inline
  def `ms-secondary-screen-controller`: `ms-secondary-screen-controller` = "ms-secondary-screen-controller".asInstanceOf[`ms-secondary-screen-controller`]
  @scala.inline
  def `ms-secondary-screen-setup`: `ms-secondary-screen-setup` = "ms-secondary-screen-setup".asInstanceOf[`ms-secondary-screen-setup`]
  @scala.inline
  def `ms-settings`: `ms-settings` = "ms-settings".asInstanceOf[`ms-settings`]
  @scala.inline
  def `ms-settings-airplanemode`: `ms-settings-airplanemode` = "ms-settings-airplanemode".asInstanceOf[`ms-settings-airplanemode`]
  @scala.inline
  def `ms-settings-bluetooth`: `ms-settings-bluetooth` = "ms-settings-bluetooth".asInstanceOf[`ms-settings-bluetooth`]
  @scala.inline
  def `ms-settings-camera`: `ms-settings-camera` = "ms-settings-camera".asInstanceOf[`ms-settings-camera`]
  @scala.inline
  def `ms-settings-cellular`: `ms-settings-cellular` = "ms-settings-cellular".asInstanceOf[`ms-settings-cellular`]
  @scala.inline
  def `ms-settings-cloudstorage`: `ms-settings-cloudstorage` = "ms-settings-cloudstorage".asInstanceOf[`ms-settings-cloudstorage`]
  @scala.inline
  def `ms-settings-connectabledevices`: `ms-settings-connectabledevices` = "ms-settings-connectabledevices".asInstanceOf[`ms-settings-connectabledevices`]
  @scala.inline
  def `ms-settings-displays-topology`: `ms-settings-displays-topology` = "ms-settings-displays-topology".asInstanceOf[`ms-settings-displays-topology`]
  @scala.inline
  def `ms-settings-emailandaccounts`: `ms-settings-emailandaccounts` = "ms-settings-emailandaccounts".asInstanceOf[`ms-settings-emailandaccounts`]
  @scala.inline
  def `ms-settings-language`: `ms-settings-language` = "ms-settings-language".asInstanceOf[`ms-settings-language`]
  @scala.inline
  def `ms-settings-location`: `ms-settings-location` = "ms-settings-location".asInstanceOf[`ms-settings-location`]
  @scala.inline
  def `ms-settings-lock`: `ms-settings-lock` = "ms-settings-lock".asInstanceOf[`ms-settings-lock`]
  @scala.inline
  def `ms-settings-nfctransactions`: `ms-settings-nfctransactions` = "ms-settings-nfctransactions".asInstanceOf[`ms-settings-nfctransactions`]
  @scala.inline
  def `ms-settings-notifications`: `ms-settings-notifications` = "ms-settings-notifications".asInstanceOf[`ms-settings-notifications`]
  @scala.inline
  def `ms-settings-power`: `ms-settings-power` = "ms-settings-power".asInstanceOf[`ms-settings-power`]
  @scala.inline
  def `ms-settings-privacy`: `ms-settings-privacy` = "ms-settings-privacy".asInstanceOf[`ms-settings-privacy`]
  @scala.inline
  def `ms-settings-proximity`: `ms-settings-proximity` = "ms-settings-proximity".asInstanceOf[`ms-settings-proximity`]
  @scala.inline
  def `ms-settings-screenrotation`: `ms-settings-screenrotation` = "ms-settings-screenrotation".asInstanceOf[`ms-settings-screenrotation`]
  @scala.inline
  def `ms-settings-wifi`: `ms-settings-wifi` = "ms-settings-wifi".asInstanceOf[`ms-settings-wifi`]
  @scala.inline
  def `ms-settings-workplace`: `ms-settings-workplace` = "ms-settings-workplace".asInstanceOf[`ms-settings-workplace`]
  @scala.inline
  def `ms-spd`: `ms-spd` = "ms-spd".asInstanceOf[`ms-spd`]
  @scala.inline
  def `ms-sttoverlay`: `ms-sttoverlay` = "ms-sttoverlay".asInstanceOf[`ms-sttoverlay`]
  @scala.inline
  def `ms-transit-to`: `ms-transit-to` = "ms-transit-to".asInstanceOf[`ms-transit-to`]
  @scala.inline
  def `ms-useractivityset`: `ms-useractivityset` = "ms-useractivityset".asInstanceOf[`ms-useractivityset`]
  @scala.inline
  def `ms-virtualtouchpad`: `ms-virtualtouchpad` = "ms-virtualtouchpad".asInstanceOf[`ms-virtualtouchpad`]
  @scala.inline
  def `ms-visio`: `ms-visio` = "ms-visio".asInstanceOf[`ms-visio`]
  @scala.inline
  def `ms-walk-to`: `ms-walk-to` = "ms-walk-to".asInstanceOf[`ms-walk-to`]
  @scala.inline
  def `ms-whiteboard`: `ms-whiteboard` = "ms-whiteboard".asInstanceOf[`ms-whiteboard`]
  @scala.inline
  def `ms-whiteboard-cmd`: `ms-whiteboard-cmd` = "ms-whiteboard-cmd".asInstanceOf[`ms-whiteboard-cmd`]
  @scala.inline
  def `ms-word`: `ms-word` = "ms-word".asInstanceOf[`ms-word`]
  @scala.inline
  def msnim: msnim = "msnim".asInstanceOf[msnim]
  @scala.inline
  def msrp: msrp = "msrp".asInstanceOf[msrp]
  @scala.inline
  def msrps: msrps = "msrps".asInstanceOf[msrps]
  @scala.inline
  def mss: mss = "mss".asInstanceOf[mss]
  @scala.inline
  def mtqp: mtqp = "mtqp".asInstanceOf[mtqp]
  @scala.inline
  def `multi-color`: `multi-color` = "multi-color".asInstanceOf[`multi-color`]
  @scala.inline
  def `multi-layer`: `multi-layer` = "multi-layer".asInstanceOf[`multi-layer`]
  @scala.inline
  def `multi-part-form`: `multi-part-form` = "multi-part-form".asInstanceOf[`multi-part-form`]
  @scala.inline
  def `multiple-destination-uris-supported`: `multiple-destination-uris-supported` = "multiple-destination-uris-supported".asInstanceOf[`multiple-destination-uris-supported`]
  @scala.inline
  def `multiple-document-handling`: `multiple-document-handling` = "multiple-document-handling".asInstanceOf[`multiple-document-handling`]
  @scala.inline
  def `multiple-document-handling-actual`: `multiple-document-handling-actual` = "multiple-document-handling-actual".asInstanceOf[`multiple-document-handling-actual`]
  @scala.inline
  def `multiple-document-handling-default`: `multiple-document-handling-default` = "multiple-document-handling-default".asInstanceOf[`multiple-document-handling-default`]
  @scala.inline
  def `multiple-document-handling-supported`: `multiple-document-handling-supported` = "multiple-document-handling-supported".asInstanceOf[`multiple-document-handling-supported`]
  @scala.inline
  def `multiple-document-jobs-supported`: `multiple-document-jobs-supported` = "multiple-document-jobs-supported".asInstanceOf[`multiple-document-jobs-supported`]
  @scala.inline
  def `multiple-object-handling`: `multiple-object-handling` = "multiple-object-handling".asInstanceOf[`multiple-object-handling`]
  @scala.inline
  def `multiple-object-handling-actual`: `multiple-object-handling-actual` = "multiple-object-handling-actual".asInstanceOf[`multiple-object-handling-actual`]
  @scala.inline
  def `multiple-object-handling-default`: `multiple-object-handling-default` = "multiple-object-handling-default".asInstanceOf[`multiple-object-handling-default`]
  @scala.inline
  def `multiple-object-handling-supported`: `multiple-object-handling-supported` = "multiple-object-handling-supported".asInstanceOf[`multiple-object-handling-supported`]
  @scala.inline
  def `multiple-operation-time-out`: `multiple-operation-time-out` = "multiple-operation-time-out".asInstanceOf[`multiple-operation-time-out`]
  @scala.inline
  def `multiple-operation-time-out-action`: `multiple-operation-time-out-action` = "multiple-operation-time-out-action".asInstanceOf[`multiple-operation-time-out-action`]
  @scala.inline
  def mumble: mumble = "mumble".asInstanceOf[mumble]
  @scala.inline
  def mupdate: mupdate = "mupdate".asInstanceOf[mupdate]
  @scala.inline
  def mustard: mustard = "mustard".asInstanceOf[mustard]
  @scala.inline
  def mvn: mvn = "mvn".asInstanceOf[mvn]
  @scala.inline
  def `my-mailbox`: `my-mailbox` = "my-mailbox".asInstanceOf[`my-mailbox`]
  @scala.inline
  def `n-to-1-order`: `n-to-1-order` = "n-to-1-order".asInstanceOf[`n-to-1-order`]
  @scala.inline
  def `na-10x13`: `na-10x13` = "na-10x13".asInstanceOf[`na-10x13`]
  @scala.inline
  def `na-10x13-envelope`: `na-10x13-envelope` = "na-10x13-envelope".asInstanceOf[`na-10x13-envelope`]
  @scala.inline
  def `na-10x14`: `na-10x14` = "na-10x14".asInstanceOf[`na-10x14`]
  @scala.inline
  def `na-10x14-envelope`: `na-10x14-envelope` = "na-10x14-envelope".asInstanceOf[`na-10x14-envelope`]
  @scala.inline
  def `na-10x15`: `na-10x15` = "na-10x15".asInstanceOf[`na-10x15`]
  @scala.inline
  def `na-10x15-envelope`: `na-10x15-envelope` = "na-10x15-envelope".asInstanceOf[`na-10x15-envelope`]
  @scala.inline
  def `na-5x7`: `na-5x7` = "na-5x7".asInstanceOf[`na-5x7`]
  @scala.inline
  def `na-6x9`: `na-6x9` = "na-6x9".asInstanceOf[`na-6x9`]
  @scala.inline
  def `na-6x9-envelope`: `na-6x9-envelope` = "na-6x9-envelope".asInstanceOf[`na-6x9-envelope`]
  @scala.inline
  def `na-7x9`: `na-7x9` = "na-7x9".asInstanceOf[`na-7x9`]
  @scala.inline
  def `na-7x9-envelope`: `na-7x9-envelope` = "na-7x9-envelope".asInstanceOf[`na-7x9-envelope`]
  @scala.inline
  def `na-8x10`: `na-8x10` = "na-8x10".asInstanceOf[`na-8x10`]
  @scala.inline
  def `na-9x11`: `na-9x11` = "na-9x11".asInstanceOf[`na-9x11`]
  @scala.inline
  def `na-9x11-envelope`: `na-9x11-envelope` = "na-9x11-envelope".asInstanceOf[`na-9x11-envelope`]
  @scala.inline
  def `na-9x12`: `na-9x12` = "na-9x12".asInstanceOf[`na-9x12`]
  @scala.inline
  def `na-9x12-envelope`: `na-9x12-envelope` = "na-9x12-envelope".asInstanceOf[`na-9x12-envelope`]
  @scala.inline
  def `na-legal`: `na-legal` = "na-legal".asInstanceOf[`na-legal`]
  @scala.inline
  def `na-legal-colored`: `na-legal-colored` = "na-legal-colored".asInstanceOf[`na-legal-colored`]
  @scala.inline
  def `na-legal-white`: `na-legal-white` = "na-legal-white".asInstanceOf[`na-legal-white`]
  @scala.inline
  def `na-letter`: `na-letter` = "na-letter".asInstanceOf[`na-letter`]
  @scala.inline
  def `na-letter-colored`: `na-letter-colored` = "na-letter-colored".asInstanceOf[`na-letter-colored`]
  @scala.inline
  def `na-letter-transparent`: `na-letter-transparent` = "na-letter-transparent".asInstanceOf[`na-letter-transparent`]
  @scala.inline
  def `na-letter-white`: `na-letter-white` = "na-letter-white".asInstanceOf[`na-letter-white`]
  @scala.inline
  def `na-number-10`: `na-number-10` = "na-number-10".asInstanceOf[`na-number-10`]
  @scala.inline
  def `na-number-10-envelope`: `na-number-10-envelope` = "na-number-10-envelope".asInstanceOf[`na-number-10-envelope`]
  @scala.inline
  def `na-number-9`: `na-number-9` = "na-number-9".asInstanceOf[`na-number-9`]
  @scala.inline
  def `na-number-9-envelope`: `na-number-9-envelope` = "na-number-9-envelope".asInstanceOf[`na-number-9-envelope`]
  @scala.inline
  def na_10x11_10x11in: na_10x11_10x11in = "na_10x11_10x11in".asInstanceOf[na_10x11_10x11in]
  @scala.inline
  def na_10x13_10x13in: na_10x13_10x13in = "na_10x13_10x13in".asInstanceOf[na_10x13_10x13in]
  @scala.inline
  def na_10x14_10x14in: na_10x14_10x14in = "na_10x14_10x14in".asInstanceOf[na_10x14_10x14in]
  @scala.inline
  def na_10x15_10x15in: na_10x15_10x15in = "na_10x15_10x15in".asInstanceOf[na_10x15_10x15in]
  @scala.inline
  def na_11x12_11x12in: na_11x12_11x12in = "na_11x12_11x12in".asInstanceOf[na_11x12_11x12in]
  @scala.inline
  def na_11x15_11x15in: na_11x15_11x15in = "na_11x15_11x15in".asInstanceOf[na_11x15_11x15in]
  @scala.inline
  def na_12x19_12x19in: na_12x19_12x19in = "na_12x19_12x19in".asInstanceOf[na_12x19_12x19in]
  @scala.inline
  def na_5x7_5x7in: na_5x7_5x7in = "na_5x7_5x7in".asInstanceOf[na_5x7_5x7in]
  @scala.inline
  def na_6x9_6x9in: na_6x9_6x9in = "na_6x9_6x9in".asInstanceOf[na_6x9_6x9in]
  @scala.inline
  def na_7x9_7x9in: na_7x9_7x9in = "na_7x9_7x9in".asInstanceOf[na_7x9_7x9in]
  @scala.inline
  def na_9x11_9x11in: na_9x11_9x11in = "na_9x11_9x11in".asInstanceOf[na_9x11_9x11in]
  @scala.inline
  def na_a2_4Dot375x5Dot75in: na_a2_4Dot375x5Dot75in = "na_a2_4.375x5.75in".asInstanceOf[na_a2_4Dot375x5Dot75in]
  @scala.inline
  def `na_arch-a_9x12in`: `na_arch-a_9x12in` = "na_arch-a_9x12in".asInstanceOf[`na_arch-a_9x12in`]
  @scala.inline
  def `na_arch-b_12x18in`: `na_arch-b_12x18in` = "na_arch-b_12x18in".asInstanceOf[`na_arch-b_12x18in`]
  @scala.inline
  def `na_arch-c_18x24in`: `na_arch-c_18x24in` = "na_arch-c_18x24in".asInstanceOf[`na_arch-c_18x24in`]
  @scala.inline
  def `na_arch-d_24x36in`: `na_arch-d_24x36in` = "na_arch-d_24x36in".asInstanceOf[`na_arch-d_24x36in`]
  @scala.inline
  def `na_arch-e2_26x38in`: `na_arch-e2_26x38in` = "na_arch-e2_26x38in".asInstanceOf[`na_arch-e2_26x38in`]
  @scala.inline
  def `na_arch-e3_27x39in`: `na_arch-e3_27x39in` = "na_arch-e3_27x39in".asInstanceOf[`na_arch-e3_27x39in`]
  @scala.inline
  def `na_arch-e_36x48in`: `na_arch-e_36x48in` = "na_arch-e_36x48in".asInstanceOf[`na_arch-e_36x48in`]
  @scala.inline
  def `na_b-plus_12x19Dot17in`: `na_b-plus_12x19Dot17in` = "na_b-plus_12x19.17in".asInstanceOf[`na_b-plus_12x19Dot17in`]
  @scala.inline
  def na_c5_6Dot5x9Dot5in: na_c5_6Dot5x9Dot5in = "na_c5_6.5x9.5in".asInstanceOf[na_c5_6Dot5x9Dot5in]
  @scala.inline
  def na_c_17x22in: na_c_17x22in = "na_c_17x22in".asInstanceOf[na_c_17x22in]
  @scala.inline
  def na_d_22x34in: na_d_22x34in = "na_d_22x34in".asInstanceOf[na_d_22x34in]
  @scala.inline
  def na_e_34x44in: na_e_34x44in = "na_e_34x44in".asInstanceOf[na_e_34x44in]
  @scala.inline
  def na_edp_11x14in: na_edp_11x14in = "na_edp_11x14in".asInstanceOf[na_edp_11x14in]
  @scala.inline
  def `na_eur-edp_12x14in`: `na_eur-edp_12x14in` = "na_eur-edp_12x14in".asInstanceOf[`na_eur-edp_12x14in`]
  @scala.inline
  def na_executive_7Dot25x10Dot5in: na_executive_7Dot25x10Dot5in = "na_executive_7.25x10.5in".asInstanceOf[na_executive_7Dot25x10Dot5in]
  @scala.inline
  def na_f_44x68in: na_f_44x68in = "na_f_44x68in".asInstanceOf[na_f_44x68in]
  @scala.inline
  def `na_fanfold-eur_8Dot5x12in`: `na_fanfold-eur_8Dot5x12in` = "na_fanfold-eur_8.5x12in".asInstanceOf[`na_fanfold-eur_8Dot5x12in`]
  @scala.inline
  def `na_fanfold-us_11x14Dot875in`: `na_fanfold-us_11x14Dot875in` = "na_fanfold-us_11x14.875in".asInstanceOf[`na_fanfold-us_11x14Dot875in`]
  @scala.inline
  def na_foolscap_8Dot5x13in: na_foolscap_8Dot5x13in = "na_foolscap_8.5x13in".asInstanceOf[na_foolscap_8Dot5x13in]
  @scala.inline
  def `na_govt-legal_8x13in`: `na_govt-legal_8x13in` = "na_govt-legal_8x13in".asInstanceOf[`na_govt-legal_8x13in`]
  @scala.inline
  def `na_govt-letter_8x10in`: `na_govt-letter_8x10in` = "na_govt-letter_8x10in".asInstanceOf[`na_govt-letter_8x10in`]
  @scala.inline
  def `na_index-3x5_3x5in`: `na_index-3x5_3x5in` = "na_index-3x5_3x5in".asInstanceOf[`na_index-3x5_3x5in`]
  @scala.inline
  def `na_index-4x6-ext_6x8in`: `na_index-4x6-ext_6x8in` = "na_index-4x6-ext_6x8in".asInstanceOf[`na_index-4x6-ext_6x8in`]
  @scala.inline
  def `na_index-4x6_4x6in`: `na_index-4x6_4x6in` = "na_index-4x6_4x6in".asInstanceOf[`na_index-4x6_4x6in`]
  @scala.inline
  def `na_index-5x8_5x8in`: `na_index-5x8_5x8in` = "na_index-5x8_5x8in".asInstanceOf[`na_index-5x8_5x8in`]
  @scala.inline
  def na_invoice_5Dot5x8Dot5in: na_invoice_5Dot5x8Dot5in = "na_invoice_5.5x8.5in".asInstanceOf[na_invoice_5Dot5x8Dot5in]
  @scala.inline
  def na_ledger_11x17in: na_ledger_11x17in = "na_ledger_11x17in".asInstanceOf[na_ledger_11x17in]
  @scala.inline
  def `na_legal-extra_9Dot5x15in`: `na_legal-extra_9Dot5x15in` = "na_legal-extra_9.5x15in".asInstanceOf[`na_legal-extra_9Dot5x15in`]
  @scala.inline
  def na_legal_8Dot5x14in: na_legal_8Dot5x14in = "na_legal_8.5x14in".asInstanceOf[na_legal_8Dot5x14in]
  @scala.inline
  def `na_letter-extra_9Dot5x12in`: `na_letter-extra_9Dot5x12in` = "na_letter-extra_9.5x12in".asInstanceOf[`na_letter-extra_9Dot5x12in`]
  @scala.inline
  def `na_letter-plus_8Dot5x12Dot69in`: `na_letter-plus_8Dot5x12Dot69in` = "na_letter-plus_8.5x12.69in".asInstanceOf[`na_letter-plus_8Dot5x12Dot69in`]
  @scala.inline
  def na_letter_8Dot5x11in: na_letter_8Dot5x11in = "na_letter_8.5x11in".asInstanceOf[na_letter_8Dot5x11in]
  @scala.inline
  def na_monarch_3Dot875x7Dot5in: na_monarch_3Dot875x7Dot5in = "na_monarch_3.875x7.5in".asInstanceOf[na_monarch_3Dot875x7Dot5in]
  @scala.inline
  def `na_number-10_4Dot125x9Dot5in`: `na_number-10_4Dot125x9Dot5in` = "na_number-10_4.125x9.5in".asInstanceOf[`na_number-10_4Dot125x9Dot5in`]
  @scala.inline
  def `na_number-11_4Dot5x10Dot375in`: `na_number-11_4Dot5x10Dot375in` = "na_number-11_4.5x10.375in".asInstanceOf[`na_number-11_4Dot5x10Dot375in`]
  @scala.inline
  def `na_number-12_4Dot75x11in`: `na_number-12_4Dot75x11in` = "na_number-12_4.75x11in".asInstanceOf[`na_number-12_4Dot75x11in`]
  @scala.inline
  def `na_number-14_5x11Dot5in`: `na_number-14_5x11Dot5in` = "na_number-14_5x11.5in".asInstanceOf[`na_number-14_5x11Dot5in`]
  @scala.inline
  def `na_number-9_3Dot875x8Dot875in`: `na_number-9_3Dot875x8Dot875in` = "na_number-9_3.875x8.875in".asInstanceOf[`na_number-9_3Dot875x8Dot875in`]
  @scala.inline
  def na_oficio_8Dot5x13Dot4in: na_oficio_8Dot5x13Dot4in = "na_oficio_8.5x13.4in".asInstanceOf[na_oficio_8Dot5x13Dot4in]
  @scala.inline
  def na_personal_3Dot625x6Dot5in: na_personal_3Dot625x6Dot5in = "na_personal_3.625x6.5in".asInstanceOf[na_personal_3Dot625x6Dot5in]
  @scala.inline
  def na_quarto_8Dot5x10Dot83in: na_quarto_8Dot5x10Dot83in = "na_quarto_8.5x10.83in".asInstanceOf[na_quarto_8Dot5x10Dot83in]
  @scala.inline
  def `na_super-a_8Dot94x14in`: `na_super-a_8Dot94x14in` = "na_super-a_8.94x14in".asInstanceOf[`na_super-a_8Dot94x14in`]
  @scala.inline
  def `na_super-b_13x19in`: `na_super-b_13x19in` = "na_super-b_13x19in".asInstanceOf[`na_super-b_13x19in`]
  @scala.inline
  def `na_wide-format_30x42in`: `na_wide-format_30x42in` = "na_wide-format_30x42in".asInstanceOf[`na_wide-format_30x42in`]
  @scala.inline
  def `natural-language-configured`: `natural-language-configured` = "natural-language-configured".asInstanceOf[`natural-language-configured`]
  @scala.inline
  def negotiate: negotiate = "negotiate".asInstanceOf[negotiate]
  @scala.inline
  def news: news = "news".asInstanceOf[news]
  @scala.inline
  def nfs: nfs = "nfs".asInstanceOf[nfs]
  @scala.inline
  def ni: ni = "ni".asInstanceOf[ni]
  @scala.inline
  def night: night = "night".asInstanceOf[night]
  @scala.inline
  def nih: nih = "nih".asInstanceOf[nih]
  @scala.inline
  def nm: nm = "nm".asInstanceOf[nm]
  @scala.inline
  def nntp: nntp = "nntp".asInstanceOf[nntp]
  @scala.inline
  def `no-change`: `no-change` = "no-change".asInstanceOf[`no-change`]
  @scala.inline
  def `no-color`: `no-color` = "no-color".asInstanceOf[`no-color`]
  @scala.inline
  def `no-cover`: `no-cover` = "no-cover".asInstanceOf[`no-cover`]
  @scala.inline
  def `no-delay-output`: `no-delay-output` = "no-delay-output".asInstanceOf[`no-delay-output`]
  @scala.inline
  def `no-hold`: `no-hold` = "no-hold".asInstanceOf[`no-hold`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def `not-applicable`: `not-applicable` = "not-applicable".asInstanceOf[`not-applicable`]
  @scala.inline
  def `not-attempted`: `not-attempted` = "not-attempted".asInstanceOf[`not-attempted`]
  @scala.inline
  def `not-completed`: `not-completed` = "not-completed".asInstanceOf[`not-completed`]
  @scala.inline
  def notes: notes = "notes".asInstanceOf[notes]
  @scala.inline
  def `notify-attributes-supported`: `notify-attributes-supported` = "notify-attributes-supported".asInstanceOf[`notify-attributes-supported`]
  @scala.inline
  def `notify-events-default`: `notify-events-default` = "notify-events-default".asInstanceOf[`notify-events-default`]
  @scala.inline
  def `notify-events-supported`: `notify-events-supported` = "notify-events-supported".asInstanceOf[`notify-events-supported`]
  @scala.inline
  def `notify-lease-duration-default`: `notify-lease-duration-default` = "notify-lease-duration-default".asInstanceOf[`notify-lease-duration-default`]
  @scala.inline
  def `notify-lease-duration-supported`: `notify-lease-duration-supported` = "notify-lease-duration-supported".asInstanceOf[`notify-lease-duration-supported`]
  @scala.inline
  def `notify-pull-method-supported`: `notify-pull-method-supported` = "notify-pull-method-supported".asInstanceOf[`notify-pull-method-supported`]
  @scala.inline
  def `notify-schemes-supported`: `notify-schemes-supported` = "notify-schemes-supported".asInstanceOf[`notify-schemes-supported`]
  @scala.inline
  def ntp: ntp = "ntp".asInstanceOf[ntp]
  @scala.inline
  def `number-of-documents`: `number-of-documents` = "number-of-documents".asInstanceOf[`number-of-documents`]
  @scala.inline
  def `number-of-intervening-jobs`: `number-of-intervening-jobs` = "number-of-intervening-jobs".asInstanceOf[`number-of-intervening-jobs`]
  @scala.inline
  def `number-of-retries`: `number-of-retries` = "number-of-retries".asInstanceOf[`number-of-retries`]
  @scala.inline
  def `number-of-retries-default`: `number-of-retries-default` = "number-of-retries-default".asInstanceOf[`number-of-retries-default`]
  @scala.inline
  def `number-of-retries-supported`: `number-of-retries-supported` = "number-of-retries-supported".asInstanceOf[`number-of-retries-supported`]
  @scala.inline
  def `number-up`: `number-up` = "number-up".asInstanceOf[`number-up`]
  @scala.inline
  def `number-up-actual`: `number-up-actual` = "number-up-actual".asInstanceOf[`number-up-actual`]
  @scala.inline
  def `number-up-default`: `number-up-default` = "number-up-default".asInstanceOf[`number-up-default`]
  @scala.inline
  def `number-up-supported`: `number-up-supported` = "number-up-supported".asInstanceOf[`number-up-supported`]
  @scala.inline
  def nylon: nylon = "nylon".asInstanceOf[nylon]
  @scala.inline
  def `oauth-authorization-scope`: `oauth-authorization-scope` = "oauth-authorization-scope".asInstanceOf[`oauth-authorization-scope`]
  @scala.inline
  def `oauth-authorization-server-uri`: `oauth-authorization-server-uri` = "oauth-authorization-server-uri".asInstanceOf[`oauth-authorization-server-uri`]
  @scala.inline
  def `object-offset`: `object-offset` = "object-offset".asInstanceOf[`object-offset`]
  @scala.inline
  def `object-size`: `object-size` = "object-size".asInstanceOf[`object-size`]
  @scala.inline
  def `object-uuid`: `object-uuid` = "object-uuid".asInstanceOf[`object-uuid`]
  @scala.inline
  def ocf: ocf = "ocf".asInstanceOf[ocf]
  @scala.inline
  def oe_12x16_12x16in: oe_12x16_12x16in = "oe_12x16_12x16in".asInstanceOf[oe_12x16_12x16in]
  @scala.inline
  def oe_14x17_14x17in: oe_14x17_14x17in = "oe_14x17_14x17in".asInstanceOf[oe_14x17_14x17in]
  @scala.inline
  def oe_18x22_18x22in: oe_18x22_18x22in = "oe_18x22_18x22in".asInstanceOf[oe_18x22_18x22in]
  @scala.inline
  def oe_a2plus_17x24in: oe_a2plus_17x24in = "oe_a2plus_17x24in".asInstanceOf[oe_a2plus_17x24in]
  @scala.inline
  def `oe_business-card_2x3Dot5in`: `oe_business-card_2x3Dot5in` = "oe_business-card_2x3.5in".asInstanceOf[`oe_business-card_2x3Dot5in`]
  @scala.inline
  def `oe_photo-10r_10x12in`: `oe_photo-10r_10x12in` = "oe_photo-10r_10x12in".asInstanceOf[`oe_photo-10r_10x12in`]
  @scala.inline
  def `oe_photo-20r_20x24in`: `oe_photo-20r_20x24in` = "oe_photo-20r_20x24in".asInstanceOf[`oe_photo-20r_20x24in`]
  @scala.inline
  def `oe_photo-l_3Dot5x5in`: `oe_photo-l_3Dot5x5in` = "oe_photo-l_3.5x5in".asInstanceOf[`oe_photo-l_3Dot5x5in`]
  @scala.inline
  def `oe_photo-s10r_10x15in`: `oe_photo-s10r_10x15in` = "oe_photo-s10r_10x15in".asInstanceOf[`oe_photo-s10r_10x15in`]
  @scala.inline
  def `oe_square-photo_4x4in`: `oe_square-photo_4x4in` = "oe_square-photo_4x4in".asInstanceOf[`oe_square-photo_4x4in`]
  @scala.inline
  def `oe_square-photo_5x5in`: `oe_square-photo_5x5in` = "oe_square-photo_5x5in".asInstanceOf[`oe_square-photo_5x5in`]
  @scala.inline
  def `off-hard`: `off-hard` = "off-hard".asInstanceOf[`off-hard`]
  @scala.inline
  def `off-hard-graceful`: `off-hard-graceful` = "off-hard-graceful".asInstanceOf[`off-hard-graceful`]
  @scala.inline
  def `off-soft`: `off-soft` = "off-soft".asInstanceOf[`off-soft`]
  @scala.inline
  def `off-soft-graceful`: `off-soft-graceful` = "off-soft-graceful".asInstanceOf[`off-soft-graceful`]
  @scala.inline
  def `off-soft-vendor1`: `off-soft-vendor1` = "off-soft-vendor1".asInstanceOf[`off-soft-vendor1`]
  @scala.inline
  def `off-soft-vendor2`: `off-soft-vendor2` = "off-soft-vendor2".asInstanceOf[`off-soft-vendor2`]
  @scala.inline
  def `off-soft-vendor3`: `off-soft-vendor3` = "off-soft-vendor3".asInstanceOf[`off-soft-vendor3`]
  @scala.inline
  def `off-soft-vendor4`: `off-soft-vendor4` = "off-soft-vendor4".asInstanceOf[`off-soft-vendor4`]
  @scala.inline
  def `off-soft-vendor5`: `off-soft-vendor5` = "off-soft-vendor5".asInstanceOf[`off-soft-vendor5`]
  @scala.inline
  def oid: oid = "oid".asInstanceOf[oid]
  @scala.inline
  def om_16k_184x260mm: om_16k_184x260mm = "om_16k_184x260mm".asInstanceOf[om_16k_184x260mm]
  @scala.inline
  def om_16k_195x270mm: om_16k_195x270mm = "om_16k_195x270mm".asInstanceOf[om_16k_195x270mm]
  @scala.inline
  def `om_business-card_55x85mm`: `om_business-card_55x85mm` = "om_business-card_55x85mm".asInstanceOf[`om_business-card_55x85mm`]
  @scala.inline
  def `om_business-card_55x91mm`: `om_business-card_55x91mm` = "om_business-card_55x91mm".asInstanceOf[`om_business-card_55x91mm`]
  @scala.inline
  def om_card_54x86mm: om_card_54x86mm = "om_card_54x86mm".asInstanceOf[om_card_54x86mm]
  @scala.inline
  def `om_dai-pa-kai_275x395mm`: `om_dai-pa-kai_275x395mm` = "om_dai-pa-kai_275x395mm".asInstanceOf[`om_dai-pa-kai_275x395mm`]
  @scala.inline
  def `om_dsc-photo_89x119mm`: `om_dsc-photo_89x119mm` = "om_dsc-photo_89x119mm".asInstanceOf[`om_dsc-photo_89x119mm`]
  @scala.inline
  def `om_folio-sp_215x315mm`: `om_folio-sp_215x315mm` = "om_folio-sp_215x315mm".asInstanceOf[`om_folio-sp_215x315mm`]
  @scala.inline
  def om_folio_210x330mm: om_folio_210x330mm = "om_folio_210x330mm".asInstanceOf[om_folio_210x330mm]
  @scala.inline
  def om_invite_220x220mm: om_invite_220x220mm = "om_invite_220x220mm".asInstanceOf[om_invite_220x220mm]
  @scala.inline
  def om_italian_110x230mm: om_italian_110x230mm = "om_italian_110x230mm".asInstanceOf[om_italian_110x230mm]
  @scala.inline
  def `om_juuro-ku-kai_198x275mm`: `om_juuro-ku-kai_198x275mm` = "om_juuro-ku-kai_198x275mm".asInstanceOf[`om_juuro-ku-kai_198x275mm`]
  @scala.inline
  def `om_large-photo_200x300`: `om_large-photo_200x300` = "om_large-photo_200x300".asInstanceOf[`om_large-photo_200x300`]
  @scala.inline
  def `om_medium-photo_130x180mm`: `om_medium-photo_130x180mm` = "om_medium-photo_130x180mm".asInstanceOf[`om_medium-photo_130x180mm`]
  @scala.inline
  def `om_pa-kai_267x389mm`: `om_pa-kai_267x389mm` = "om_pa-kai_267x389mm".asInstanceOf[`om_pa-kai_267x389mm`]
  @scala.inline
  def om_postfix_114x229mm: om_postfix_114x229mm = "om_postfix_114x229mm".asInstanceOf[om_postfix_114x229mm]
  @scala.inline
  def `om_small-photo_100x150mm`: `om_small-photo_100x150mm` = "om_small-photo_100x150mm".asInstanceOf[`om_small-photo_100x150mm`]
  @scala.inline
  def `om_square-photo_89x89mm`: `om_square-photo_89x89mm` = "om_square-photo_89x89mm".asInstanceOf[`om_square-photo_89x89mm`]
  @scala.inline
  def `om_wide-photo_100x200mm`: `om_wide-photo_100x200mm` = "om_wide-photo_100x200mm".asInstanceOf[`om_wide-photo_100x200mm`]
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  @scala.inline
  def `on-error`: `on-error` = "on-error".asInstanceOf[`on-error`]
  @scala.inline
  def `on-vendor1`: `on-vendor1` = "on-vendor1".asInstanceOf[`on-vendor1`]
  @scala.inline
  def `on-vendor2`: `on-vendor2` = "on-vendor2".asInstanceOf[`on-vendor2`]
  @scala.inline
  def `on-vendor3`: `on-vendor3` = "on-vendor3".asInstanceOf[`on-vendor3`]
  @scala.inline
  def `on-vendor4`: `on-vendor4` = "on-vendor4".asInstanceOf[`on-vendor4`]
  @scala.inline
  def `on-vendor5`: `on-vendor5` = "on-vendor5".asInstanceOf[`on-vendor5`]
  @scala.inline
  def onboard: onboard = "onboard".asInstanceOf[onboard]
  @scala.inline
  def `one-at-a-time`: `one-at-a-time` = "one-at-a-time".asInstanceOf[`one-at-a-time`]
  @scala.inline
  def `one-sided`: `one-sided` = "one-sided".asInstanceOf[`one-sided`]
  @scala.inline
  def onenote: onenote = "onenote".asInstanceOf[onenote]
  @scala.inline
  def `onenote-cmd`: `onenote-cmd` = "onenote-cmd".asInstanceOf[`onenote-cmd`]
  @scala.inline
  def opaquelocktoken: opaquelocktoken = "opaquelocktoken".asInstanceOf[opaquelocktoken]
  @scala.inline
  def `opc-life-over`: `opc-life-over` = "opc-life-over".asInstanceOf[`opc-life-over`]
  @scala.inline
  def `opc-near-eol`: `opc-near-eol` = "opc-near-eol".asInstanceOf[`opc-near-eol`]
  @scala.inline
  def openpgp4fpr: openpgp4fpr = "openpgp4fpr".asInstanceOf[openpgp4fpr]
  @scala.inline
  def `operations-supported`: `operations-supported` = "operations-supported".asInstanceOf[`operations-supported`]
  @scala.inline
  def orange: orange = "orange".asInstanceOf[orange]
  @scala.inline
  def `organization-name-supported`: `organization-name-supported` = "organization-name-supported".asInstanceOf[`organization-name-supported`]
  @scala.inline
  def `orientation-requested`: `orientation-requested` = "orientation-requested".asInstanceOf[`orientation-requested`]
  @scala.inline
  def `orientation-requested-actual`: `orientation-requested-actual` = "orientation-requested-actual".asInstanceOf[`orientation-requested-actual`]
  @scala.inline
  def `orientation-requested-default`: `orientation-requested-default` = "orientation-requested-default".asInstanceOf[`orientation-requested-default`]
  @scala.inline
  def `orientation-requested-supported`: `orientation-requested-supported` = "orientation-requested-supported".asInstanceOf[`orientation-requested-supported`]
  @scala.inline
  def `original-requesting-user-name`: `original-requesting-user-name` = "original-requesting-user-name".asInstanceOf[`original-requesting-user-name`]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def outgoing: outgoing = "outgoing".asInstanceOf[outgoing]
  @scala.inline
  def `output-area-almost-full`: `output-area-almost-full` = "output-area-almost-full".asInstanceOf[`output-area-almost-full`]
  @scala.inline
  def `output-area-full`: `output-area-full` = "output-area-full".asInstanceOf[`output-area-full`]
  @scala.inline
  def `output-attributes-actual`: `output-attributes-actual` = "output-attributes-actual".asInstanceOf[`output-attributes-actual`]
  @scala.inline
  def `output-attributes-default`: `output-attributes-default` = "output-attributes-default".asInstanceOf[`output-attributes-default`]
  @scala.inline
  def `output-attributes-supported`: `output-attributes-supported` = "output-attributes-supported".asInstanceOf[`output-attributes-supported`]
  @scala.inline
  def `output-bin`: `output-bin` = "output-bin".asInstanceOf[`output-bin`]
  @scala.inline
  def `output-bin-actual`: `output-bin-actual` = "output-bin-actual".asInstanceOf[`output-bin-actual`]
  @scala.inline
  def `output-bin-default`: `output-bin-default` = "output-bin-default".asInstanceOf[`output-bin-default`]
  @scala.inline
  def `output-bin-supported`: `output-bin-supported` = "output-bin-supported".asInstanceOf[`output-bin-supported`]
  @scala.inline
  def `output-device`: `output-device` = "output-device".asInstanceOf[`output-device`]
  @scala.inline
  def `output-device-actual`: `output-device-actual` = "output-device-actual".asInstanceOf[`output-device-actual`]
  @scala.inline
  def `output-device-assigned`: `output-device-assigned` = "output-device-assigned".asInstanceOf[`output-device-assigned`]
  @scala.inline
  def `output-device-job-state`: `output-device-job-state` = "output-device-job-state".asInstanceOf[`output-device-job-state`]
  @scala.inline
  def `output-device-job-state-message`: `output-device-job-state-message` = "output-device-job-state-message".asInstanceOf[`output-device-job-state-message`]
  @scala.inline
  def `output-device-job-state-reasons`: `output-device-job-state-reasons` = "output-device-job-state-reasons".asInstanceOf[`output-device-job-state-reasons`]
  @scala.inline
  def `output-device-supported`: `output-device-supported` = "output-device-supported".asInstanceOf[`output-device-supported`]
  @scala.inline
  def `output-device-uuid-assigned`: `output-device-uuid-assigned` = "output-device-uuid-assigned".asInstanceOf[`output-device-uuid-assigned`]
  @scala.inline
  def `output-device-uuid-supported`: `output-device-uuid-supported` = "output-device-uuid-supported".asInstanceOf[`output-device-uuid-supported`]
  @scala.inline
  def `output-mailbox-select-failure`: `output-mailbox-select-failure` = "output-mailbox-select-failure".asInstanceOf[`output-mailbox-select-failure`]
  @scala.inline
  def `output-tray-missing`: `output-tray-missing` = "output-tray-missing".asInstanceOf[`output-tray-missing`]
  @scala.inline
  def outward: outward = "outward".asInstanceOf[outward]
  @scala.inline
  def overrides: overrides = "overrides".asInstanceOf[overrides]
  @scala.inline
  def `overrides-actual`: `overrides-actual` = "overrides-actual".asInstanceOf[`overrides-actual`]
  @scala.inline
  def `overrides-supported`: `overrides-supported` = "overrides-supported".asInstanceOf[`overrides-supported`]
  @scala.inline
  def owner: owner = "owner".asInstanceOf[owner]
  @scala.inline
  def pack: pack = "pack".asInstanceOf[pack]
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  @scala.inline
  def `page-delivery`: `page-delivery` = "page-delivery".asInstanceOf[`page-delivery`]
  @scala.inline
  def `page-delivery-actual`: `page-delivery-actual` = "page-delivery-actual".asInstanceOf[`page-delivery-actual`]
  @scala.inline
  def `page-delivery-default`: `page-delivery-default` = "page-delivery-default".asInstanceOf[`page-delivery-default`]
  @scala.inline
  def `page-delivery-supported`: `page-delivery-supported` = "page-delivery-supported".asInstanceOf[`page-delivery-supported`]
  @scala.inline
  def `page-order-received`: `page-order-received` = "page-order-received".asInstanceOf[`page-order-received`]
  @scala.inline
  def `page-order-received-actual`: `page-order-received-actual` = "page-order-received-actual".asInstanceOf[`page-order-received-actual`]
  @scala.inline
  def `page-order-received-default`: `page-order-received-default` = "page-order-received-default".asInstanceOf[`page-order-received-default`]
  @scala.inline
  def `page-order-received-supported`: `page-order-received-supported` = "page-order-received-supported".asInstanceOf[`page-order-received-supported`]
  @scala.inline
  def `page-overrides`: `page-overrides` = "page-overrides".asInstanceOf[`page-overrides`]
  @scala.inline
  def `page-ranges`: `page-ranges` = "page-ranges".asInstanceOf[`page-ranges`]
  @scala.inline
  def `page-ranges-actual`: `page-ranges-actual` = "page-ranges-actual".asInstanceOf[`page-ranges-actual`]
  @scala.inline
  def `page-ranges-supported`: `page-ranges-supported` = "page-ranges-supported".asInstanceOf[`page-ranges-supported`]
  @scala.inline
  def pages: pages = "pages".asInstanceOf[pages]
  @scala.inline
  def `pages-per-subset`: `pages-per-subset` = "pages-per-subset".asInstanceOf[`pages-per-subset`]
  @scala.inline
  def `pages-per-subset-supported`: `pages-per-subset-supported` = "pages-per-subset-supported".asInstanceOf[`pages-per-subset-supported`]
  @scala.inline
  def palm: palm = "palm".asInstanceOf[palm]
  @scala.inline
  def paparazzi: paparazzi = "paparazzi".asInstanceOf[paparazzi]
  @scala.inline
  def paper: paper = "paper".asInstanceOf[paper]
  @scala.inline
  def `parent-printers-supported`: `parent-printers-supported` = "parent-printers-supported".asInstanceOf[`parent-printers-supported`]
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def payment: payment = "payment".asInstanceOf[payment]
  @scala.inline
  def payto: payto = "payto".asInstanceOf[payto]
  @scala.inline
  def `pclm-raster-back-side`: `pclm-raster-back-side` = "pclm-raster-back-side".asInstanceOf[`pclm-raster-back-side`]
  @scala.inline
  def `pclm-source-resolution`: `pclm-source-resolution` = "pclm-source-resolution".asInstanceOf[`pclm-source-resolution`]
  @scala.inline
  def `pclm-source-resolution-supported`: `pclm-source-resolution-supported` = "pclm-source-resolution-supported".asInstanceOf[`pclm-source-resolution-supported`]
  @scala.inline
  def `pclm-strip-height-preferred`: `pclm-strip-height-preferred` = "pclm-strip-height-preferred".asInstanceOf[`pclm-strip-height-preferred`]
  @scala.inline
  def `pclm-strip-height-supported`: `pclm-strip-height-supported` = "pclm-strip-height-supported".asInstanceOf[`pclm-strip-height-supported`]
  @scala.inline
  def `pdf-features-supported`: `pdf-features-supported` = "pdf-features-supported".asInstanceOf[`pdf-features-supported`]
  @scala.inline
  def `pdf-k-octets-supported`: `pdf-k-octets-supported` = "pdf-k-octets-supported".asInstanceOf[`pdf-k-octets-supported`]
  @scala.inline
  def `pdf-versions-supported`: `pdf-versions-supported` = "pdf-versions-supported".asInstanceOf[`pdf-versions-supported`]
  @scala.inline
  def `pdl-init-file`: `pdl-init-file` = "pdl-init-file".asInstanceOf[`pdl-init-file`]
  @scala.inline
  def `pdl-init-file-default`: `pdl-init-file-default` = "pdl-init-file-default".asInstanceOf[`pdl-init-file-default`]
  @scala.inline
  def `pdl-init-file-entry`: `pdl-init-file-entry` = "pdl-init-file-entry".asInstanceOf[`pdl-init-file-entry`]
  @scala.inline
  def `pdl-init-file-entry-supported`: `pdl-init-file-entry-supported` = "pdl-init-file-entry-supported".asInstanceOf[`pdl-init-file-entry-supported`]
  @scala.inline
  def `pdl-init-file-location`: `pdl-init-file-location` = "pdl-init-file-location".asInstanceOf[`pdl-init-file-location`]
  @scala.inline
  def `pdl-init-file-location-supported`: `pdl-init-file-location-supported` = "pdl-init-file-location-supported".asInstanceOf[`pdl-init-file-location-supported`]
  @scala.inline
  def `pdl-init-file-name`: `pdl-init-file-name` = "pdl-init-file-name".asInstanceOf[`pdl-init-file-name`]
  @scala.inline
  def `pdl-init-file-name-subdirectory-supported`: `pdl-init-file-name-subdirectory-supported` = "pdl-init-file-name-subdirectory-supported".asInstanceOf[`pdl-init-file-name-subdirectory-supported`]
  @scala.inline
  def `pdl-init-file-name-supported`: `pdl-init-file-name-supported` = "pdl-init-file-name-supported".asInstanceOf[`pdl-init-file-name-supported`]
  @scala.inline
  def `pdl-init-file-supported`: `pdl-init-file-supported` = "pdl-init-file-supported".asInstanceOf[`pdl-init-file-supported`]
  @scala.inline
  def `pdl-override-guaranteed-supported`: `pdl-override-guaranteed-supported` = "pdl-override-guaranteed-supported".asInstanceOf[`pdl-override-guaranteed-supported`]
  @scala.inline
  def `pdl-override-supported`: `pdl-override-supported` = "pdl-override-supported".asInstanceOf[`pdl-override-supported`]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def `pending-held`: `pending-held` = "pending-held".asInstanceOf[`pending-held`]
  @scala.inline
  def `pending-retry`: `pending-retry` = "pending-retry".asInstanceOf[`pending-retry`]
  @scala.inline
  def perceptual: perceptual = "perceptual".asInstanceOf[perceptual]
  @scala.inline
  def perfect: perfect = "perfect".asInstanceOf[perfect]
  @scala.inline
  def perforate: perforate = "perforate".asInstanceOf[perforate]
  @scala.inline
  def `perforater-added`: `perforater-added` = "perforater-added".asInstanceOf[`perforater-added`]
  @scala.inline
  def `perforater-almost-empty`: `perforater-almost-empty` = "perforater-almost-empty".asInstanceOf[`perforater-almost-empty`]
  @scala.inline
  def `perforater-almost-full`: `perforater-almost-full` = "perforater-almost-full".asInstanceOf[`perforater-almost-full`]
  @scala.inline
  def `perforater-at-limit`: `perforater-at-limit` = "perforater-at-limit".asInstanceOf[`perforater-at-limit`]
  @scala.inline
  def `perforater-closed`: `perforater-closed` = "perforater-closed".asInstanceOf[`perforater-closed`]
  @scala.inline
  def `perforater-configuration-change`: `perforater-configuration-change` = "perforater-configuration-change".asInstanceOf[`perforater-configuration-change`]
  @scala.inline
  def `perforater-cover-closed`: `perforater-cover-closed` = "perforater-cover-closed".asInstanceOf[`perforater-cover-closed`]
  @scala.inline
  def `perforater-cover-open`: `perforater-cover-open` = "perforater-cover-open".asInstanceOf[`perforater-cover-open`]
  @scala.inline
  def `perforater-empty`: `perforater-empty` = "perforater-empty".asInstanceOf[`perforater-empty`]
  @scala.inline
  def `perforater-full`: `perforater-full` = "perforater-full".asInstanceOf[`perforater-full`]
  @scala.inline
  def `perforater-interlock-closed`: `perforater-interlock-closed` = "perforater-interlock-closed".asInstanceOf[`perforater-interlock-closed`]
  @scala.inline
  def `perforater-interlock-open`: `perforater-interlock-open` = "perforater-interlock-open".asInstanceOf[`perforater-interlock-open`]
  @scala.inline
  def `perforater-jam`: `perforater-jam` = "perforater-jam".asInstanceOf[`perforater-jam`]
  @scala.inline
  def `perforater-life-almost-over`: `perforater-life-almost-over` = "perforater-life-almost-over".asInstanceOf[`perforater-life-almost-over`]
  @scala.inline
  def `perforater-life-over`: `perforater-life-over` = "perforater-life-over".asInstanceOf[`perforater-life-over`]
  @scala.inline
  def `perforater-memory-exhausted`: `perforater-memory-exhausted` = "perforater-memory-exhausted".asInstanceOf[`perforater-memory-exhausted`]
  @scala.inline
  def `perforater-missing`: `perforater-missing` = "perforater-missing".asInstanceOf[`perforater-missing`]
  @scala.inline
  def `perforater-motor-failure`: `perforater-motor-failure` = "perforater-motor-failure".asInstanceOf[`perforater-motor-failure`]
  @scala.inline
  def `perforater-near-limit`: `perforater-near-limit` = "perforater-near-limit".asInstanceOf[`perforater-near-limit`]
  @scala.inline
  def `perforater-offline`: `perforater-offline` = "perforater-offline".asInstanceOf[`perforater-offline`]
  @scala.inline
  def `perforater-opened`: `perforater-opened` = "perforater-opened".asInstanceOf[`perforater-opened`]
  @scala.inline
  def `perforater-over-temperature`: `perforater-over-temperature` = "perforater-over-temperature".asInstanceOf[`perforater-over-temperature`]
  @scala.inline
  def `perforater-power-saver`: `perforater-power-saver` = "perforater-power-saver".asInstanceOf[`perforater-power-saver`]
  @scala.inline
  def `perforater-recoverable-failure`: `perforater-recoverable-failure` = "perforater-recoverable-failure".asInstanceOf[`perforater-recoverable-failure`]
  @scala.inline
  def `perforater-recoverable-storage-error`: `perforater-recoverable-storage-error` = "perforater-recoverable-storage-error".asInstanceOf[`perforater-recoverable-storage-error`]
  @scala.inline
  def `perforater-removed`: `perforater-removed` = "perforater-removed".asInstanceOf[`perforater-removed`]
  @scala.inline
  def `perforater-resource-added`: `perforater-resource-added` = "perforater-resource-added".asInstanceOf[`perforater-resource-added`]
  @scala.inline
  def `perforater-resource-removed`: `perforater-resource-removed` = "perforater-resource-removed".asInstanceOf[`perforater-resource-removed`]
  @scala.inline
  def `perforater-thermistor-failure`: `perforater-thermistor-failure` = "perforater-thermistor-failure".asInstanceOf[`perforater-thermistor-failure`]
  @scala.inline
  def `perforater-timing-failure`: `perforater-timing-failure` = "perforater-timing-failure".asInstanceOf[`perforater-timing-failure`]
  @scala.inline
  def `perforater-turned-off`: `perforater-turned-off` = "perforater-turned-off".asInstanceOf[`perforater-turned-off`]
  @scala.inline
  def `perforater-turned-on`: `perforater-turned-on` = "perforater-turned-on".asInstanceOf[`perforater-turned-on`]
  @scala.inline
  def `perforater-under-temperature`: `perforater-under-temperature` = "perforater-under-temperature".asInstanceOf[`perforater-under-temperature`]
  @scala.inline
  def `perforater-unrecoverable-failure`: `perforater-unrecoverable-failure` = "perforater-unrecoverable-failure".asInstanceOf[`perforater-unrecoverable-failure`]
  @scala.inline
  def `perforater-unrecoverable-storage-error`: `perforater-unrecoverable-storage-error` = "perforater-unrecoverable-storage-error".asInstanceOf[`perforater-unrecoverable-storage-error`]
  @scala.inline
  def `perforater-warming-up`: `perforater-warming-up` = "perforater-warming-up".asInstanceOf[`perforater-warming-up`]
  @scala.inline
  def pet: pet = "pet".asInstanceOf[pet]
  @scala.inline
  def pgp: pgp = "pgp".asInstanceOf[pgp]
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  @scala.inline
  def photographic: photographic = "photographic".asInstanceOf[photographic]
  @scala.inline
  def `photographic-archival`: `photographic-archival` = "photographic-archival".asInstanceOf[`photographic-archival`]
  @scala.inline
  def `photographic-film`: `photographic-film` = "photographic-film".asInstanceOf[`photographic-film`]
  @scala.inline
  def `photographic-glossy`: `photographic-glossy` = "photographic-glossy".asInstanceOf[`photographic-glossy`]
  @scala.inline
  def `photographic-high-gloss`: `photographic-high-gloss` = "photographic-high-gloss".asInstanceOf[`photographic-high-gloss`]
  @scala.inline
  def `photographic-matte`: `photographic-matte` = "photographic-matte".asInstanceOf[`photographic-matte`]
  @scala.inline
  def `photographic-satin`: `photographic-satin` = "photographic-satin".asInstanceOf[`photographic-satin`]
  @scala.inline
  def `photographic-semi-gloss`: `photographic-semi-gloss` = "photographic-semi-gloss".asInstanceOf[`photographic-semi-gloss`]
  @scala.inline
  def photopolymer: photopolymer = "photopolymer".asInstanceOf[photopolymer]
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  @scala.inline
  def pkcs11: pkcs11 = "pkcs11".asInstanceOf[pkcs11]
  @scala.inline
  def pla: pla = "pla".asInstanceOf[pla]
  @scala.inline
  def `pla-conductive`: `pla-conductive` = "pla-conductive".asInstanceOf[`pla-conductive`]
  @scala.inline
  def `pla-dissolvable`: `pla-dissolvable` = "pla-dissolvable".asInstanceOf[`pla-dissolvable`]
  @scala.inline
  def `pla-flexible`: `pla-flexible` = "pla-flexible".asInstanceOf[`pla-flexible`]
  @scala.inline
  def `pla-magnetic`: `pla-magnetic` = "pla-magnetic".asInstanceOf[`pla-magnetic`]
  @scala.inline
  def `pla-steel`: `pla-steel` = "pla-steel".asInstanceOf[`pla-steel`]
  @scala.inline
  def `pla-stone`: `pla-stone` = "pla-stone".asInstanceOf[`pla-stone`]
  @scala.inline
  def `pla-wood`: `pla-wood` = "pla-wood".asInstanceOf[`pla-wood`]
  @scala.inline
  def plastic: plastic = "plastic".asInstanceOf[plastic]
  @scala.inline
  def `plastic-archival`: `plastic-archival` = "plastic-archival".asInstanceOf[`plastic-archival`]
  @scala.inline
  def `plastic-colored`: `plastic-colored` = "plastic-colored".asInstanceOf[`plastic-colored`]
  @scala.inline
  def `plastic-glossy`: `plastic-glossy` = "plastic-glossy".asInstanceOf[`plastic-glossy`]
  @scala.inline
  def `plastic-high-gloss`: `plastic-high-gloss` = "plastic-high-gloss".asInstanceOf[`plastic-high-gloss`]
  @scala.inline
  def `plastic-matte`: `plastic-matte` = "plastic-matte".asInstanceOf[`plastic-matte`]
  @scala.inline
  def `plastic-satin`: `plastic-satin` = "plastic-satin".asInstanceOf[`plastic-satin`]
  @scala.inline
  def `plastic-semi-gloss`: `plastic-semi-gloss` = "plastic-semi-gloss".asInstanceOf[`plastic-semi-gloss`]
  @scala.inline
  def plate: plate = "plate".asInstanceOf[plate]
  @scala.inline
  def platen: platen = "platen".asInstanceOf[platen]
  @scala.inline
  def platform: platform = "platform".asInstanceOf[platform]
  @scala.inline
  def `platform-shape`: `platform-shape` = "platform-shape".asInstanceOf[`platform-shape`]
  @scala.inline
  def `platform-temperature`: `platform-temperature` = "platform-temperature".asInstanceOf[`platform-temperature`]
  @scala.inline
  def `platform-temperature-actual`: `platform-temperature-actual` = "platform-temperature-actual".asInstanceOf[`platform-temperature-actual`]
  @scala.inline
  def `platform-temperature-default`: `platform-temperature-default` = "platform-temperature-default".asInstanceOf[`platform-temperature-default`]
  @scala.inline
  def `platform-temperature-supported`: `platform-temperature-supported` = "platform-temperature-supported".asInstanceOf[`platform-temperature-supported`]
  @scala.inline
  def polycarbonate: polycarbonate = "polycarbonate".asInstanceOf[polycarbonate]
  @scala.inline
  def polyester: polyester = "polyester".asInstanceOf[polyester]
  @scala.inline
  def pop: pop = "pop".asInstanceOf[pop]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  @scala.inline
  def postcard: postcard = "postcard".asInstanceOf[postcard]
  @scala.inline
  def `power-down`: `power-down` = "power-down".asInstanceOf[`power-down`]
  @scala.inline
  def `power-up`: `power-up` = "power-up".asInstanceOf[`power-up`]
  @scala.inline
  def prc: prc = "prc".asInstanceOf[prc]
  @scala.inline
  def prc_10_324x458mm: prc_10_324x458mm = "prc_10_324x458mm".asInstanceOf[prc_10_324x458mm]
  @scala.inline
  def prc_16k_146x215mm: prc_16k_146x215mm = "prc_16k_146x215mm".asInstanceOf[prc_16k_146x215mm]
  @scala.inline
  def prc_1_102x165mm: prc_1_102x165mm = "prc_1_102x165mm".asInstanceOf[prc_1_102x165mm]
  @scala.inline
  def prc_2_102x176mm: prc_2_102x176mm = "prc_2_102x176mm".asInstanceOf[prc_2_102x176mm]
  @scala.inline
  def prc_32k_97x151mm: prc_32k_97x151mm = "prc_32k_97x151mm".asInstanceOf[prc_32k_97x151mm]
  @scala.inline
  def prc_3_125x176mm: prc_3_125x176mm = "prc_3_125x176mm".asInstanceOf[prc_3_125x176mm]
  @scala.inline
  def prc_4_110x208mm: prc_4_110x208mm = "prc_4_110x208mm".asInstanceOf[prc_4_110x208mm]
  @scala.inline
  def prc_5_110x220mm: prc_5_110x220mm = "prc_5_110x220mm".asInstanceOf[prc_5_110x220mm]
  @scala.inline
  def prc_6_120x320mm: prc_6_120x320mm = "prc_6_120x320mm".asInstanceOf[prc_6_120x320mm]
  @scala.inline
  def prc_7_160x230mm: prc_7_160x230mm = "prc_7_160x230mm".asInstanceOf[prc_7_160x230mm]
  @scala.inline
  def prc_8_120x309mm: prc_8_120x309mm = "prc_8_120x309mm".asInstanceOf[prc_8_120x309mm]
  @scala.inline
  def `pre-cut-tabs`: `pre-cut-tabs` = "pre-cut-tabs".asInstanceOf[`pre-cut-tabs`]
  @scala.inline
  def `pre-printed`: `pre-printed` = "pre-printed".asInstanceOf[`pre-printed`]
  @scala.inline
  def `preferred-attributes-supported`: `preferred-attributes-supported` = "preferred-attributes-supported".asInstanceOf[`preferred-attributes-supported`]
  @scala.inline
  def pres: pres = "pres".asInstanceOf[pres]
  @scala.inline
  def `presentation-direction-number-up`: `presentation-direction-number-up` = "presentation-direction-number-up".asInstanceOf[`presentation-direction-number-up`]
  @scala.inline
  def `presentation-direction-number-up-actual`: `presentation-direction-number-up-actual` = "presentation-direction-number-up-actual".asInstanceOf[`presentation-direction-number-up-actual`]
  @scala.inline
  def `presentation-direction-number-up-default`: `presentation-direction-number-up-default` = "presentation-direction-number-up-default".asInstanceOf[`presentation-direction-number-up-default`]
  @scala.inline
  def `presentation-direction-number-up-supported`: `presentation-direction-number-up-supported` = "presentation-direction-number-up-supported".asInstanceOf[`presentation-direction-number-up-supported`]
  @scala.inline
  def print: print = "print".asInstanceOf[print]
  @scala.inline
  def `print-accuracy`: `print-accuracy` = "print-accuracy".asInstanceOf[`print-accuracy`]
  @scala.inline
  def `print-accuracy-actual`: `print-accuracy-actual` = "print-accuracy-actual".asInstanceOf[`print-accuracy-actual`]
  @scala.inline
  def `print-accuracy-supported`: `print-accuracy-supported` = "print-accuracy-supported".asInstanceOf[`print-accuracy-supported`]
  @scala.inline
  def `print-back`: `print-back` = "print-back".asInstanceOf[`print-back`]
  @scala.inline
  def `print-base`: `print-base` = "print-base".asInstanceOf[`print-base`]
  @scala.inline
  def `print-base-actual`: `print-base-actual` = "print-base-actual".asInstanceOf[`print-base-actual`]
  @scala.inline
  def `print-base-default`: `print-base-default` = "print-base-default".asInstanceOf[`print-base-default`]
  @scala.inline
  def `print-base-supported`: `print-base-supported` = "print-base-supported".asInstanceOf[`print-base-supported`]
  @scala.inline
  def `print-both`: `print-both` = "print-both".asInstanceOf[`print-both`]
  @scala.inline
  def `print-color-mode`: `print-color-mode` = "print-color-mode".asInstanceOf[`print-color-mode`]
  @scala.inline
  def `print-color-mode-actual`: `print-color-mode-actual` = "print-color-mode-actual".asInstanceOf[`print-color-mode-actual`]
  @scala.inline
  def `print-color-mode-default`: `print-color-mode-default` = "print-color-mode-default".asInstanceOf[`print-color-mode-default`]
  @scala.inline
  def `print-color-mode-supported`: `print-color-mode-supported` = "print-color-mode-supported".asInstanceOf[`print-color-mode-supported`]
  @scala.inline
  def `print-content-optimize`: `print-content-optimize` = "print-content-optimize".asInstanceOf[`print-content-optimize`]
  @scala.inline
  def `print-content-optimize-actual`: `print-content-optimize-actual` = "print-content-optimize-actual".asInstanceOf[`print-content-optimize-actual`]
  @scala.inline
  def `print-content-optimize-default`: `print-content-optimize-default` = "print-content-optimize-default".asInstanceOf[`print-content-optimize-default`]
  @scala.inline
  def `print-content-optimize-supported`: `print-content-optimize-supported` = "print-content-optimize-supported".asInstanceOf[`print-content-optimize-supported`]
  @scala.inline
  def `print-front`: `print-front` = "print-front".asInstanceOf[`print-front`]
  @scala.inline
  def `print-none`: `print-none` = "print-none".asInstanceOf[`print-none`]
  @scala.inline
  def `print-objects`: `print-objects` = "print-objects".asInstanceOf[`print-objects`]
  @scala.inline
  def `print-objects-actual`: `print-objects-actual` = "print-objects-actual".asInstanceOf[`print-objects-actual`]
  @scala.inline
  def `print-objects-supported`: `print-objects-supported` = "print-objects-supported".asInstanceOf[`print-objects-supported`]
  @scala.inline
  def `print-quality`: `print-quality` = "print-quality".asInstanceOf[`print-quality`]
  @scala.inline
  def `print-quality-actual`: `print-quality-actual` = "print-quality-actual".asInstanceOf[`print-quality-actual`]
  @scala.inline
  def `print-quality-default`: `print-quality-default` = "print-quality-default".asInstanceOf[`print-quality-default`]
  @scala.inline
  def `print-quality-supported`: `print-quality-supported` = "print-quality-supported".asInstanceOf[`print-quality-supported`]
  @scala.inline
  def `print-rendering-intent`: `print-rendering-intent` = "print-rendering-intent".asInstanceOf[`print-rendering-intent`]
  @scala.inline
  def `print-rendering-intent-actual`: `print-rendering-intent-actual` = "print-rendering-intent-actual".asInstanceOf[`print-rendering-intent-actual`]
  @scala.inline
  def `print-rendering-intent-default`: `print-rendering-intent-default` = "print-rendering-intent-default".asInstanceOf[`print-rendering-intent-default`]
  @scala.inline
  def `print-rendering-intent-supported`: `print-rendering-intent-supported` = "print-rendering-intent-supported".asInstanceOf[`print-rendering-intent-supported`]
  @scala.inline
  def `print-save`: `print-save` = "print-save".asInstanceOf[`print-save`]
  @scala.inline
  def `print-scaling`: `print-scaling` = "print-scaling".asInstanceOf[`print-scaling`]
  @scala.inline
  def `print-scaling-default`: `print-scaling-default` = "print-scaling-default".asInstanceOf[`print-scaling-default`]
  @scala.inline
  def `print-scaling-supported`: `print-scaling-supported` = "print-scaling-supported".asInstanceOf[`print-scaling-supported`]
  @scala.inline
  def `print-supports`: `print-supports` = "print-supports".asInstanceOf[`print-supports`]
  @scala.inline
  def `print-supports-actual`: `print-supports-actual` = "print-supports-actual".asInstanceOf[`print-supports-actual`]
  @scala.inline
  def `print-supports-default`: `print-supports-default` = "print-supports-default".asInstanceOf[`print-supports-default`]
  @scala.inline
  def `print-supports-supported`: `print-supports-supported` = "print-supports-supported".asInstanceOf[`print-supports-supported`]
  @scala.inline
  def print3d: print3d = "print3d".asInstanceOf[print3d]
  @scala.inline
  def `printer-camera-image-uri`: `printer-camera-image-uri` = "printer-camera-image-uri".asInstanceOf[`printer-camera-image-uri`]
  @scala.inline
  def `printer-charge-info`: `printer-charge-info` = "printer-charge-info".asInstanceOf[`printer-charge-info`]
  @scala.inline
  def `printer-charge-info-uri`: `printer-charge-info-uri` = "printer-charge-info-uri".asInstanceOf[`printer-charge-info-uri`]
  @scala.inline
  def `printer-config-changed`: `printer-config-changed` = "printer-config-changed".asInstanceOf[`printer-config-changed`]
  @scala.inline
  def `printer-contact-col`: `printer-contact-col` = "printer-contact-col".asInstanceOf[`printer-contact-col`]
  @scala.inline
  def `printer-current-time`: `printer-current-time` = "printer-current-time".asInstanceOf[`printer-current-time`]
  @scala.inline
  def `printer-description`: `printer-description` = "printer-description".asInstanceOf[`printer-description`]
  @scala.inline
  def `printer-device-id`: `printer-device-id` = "printer-device-id".asInstanceOf[`printer-device-id`]
  @scala.inline
  def `printer-dns-sd-name`: `printer-dns-sd-name` = "printer-dns-sd-name".asInstanceOf[`printer-dns-sd-name`]
  @scala.inline
  def `printer-driver-installer`: `printer-driver-installer` = "printer-driver-installer".asInstanceOf[`printer-driver-installer`]
  @scala.inline
  def `printer-fax-log-uri`: `printer-fax-log-uri` = "printer-fax-log-uri".asInstanceOf[`printer-fax-log-uri`]
  @scala.inline
  def `printer-fax-modem-info`: `printer-fax-modem-info` = "printer-fax-modem-info".asInstanceOf[`printer-fax-modem-info`]
  @scala.inline
  def `printer-fax-modem-name`: `printer-fax-modem-name` = "printer-fax-modem-name".asInstanceOf[`printer-fax-modem-name`]
  @scala.inline
  def `printer-fax-modem-number`: `printer-fax-modem-number` = "printer-fax-modem-number".asInstanceOf[`printer-fax-modem-number`]
  @scala.inline
  def `printer-finishings-changed`: `printer-finishings-changed` = "printer-finishings-changed".asInstanceOf[`printer-finishings-changed`]
  @scala.inline
  def `printer-geo-location`: `printer-geo-location` = "printer-geo-location".asInstanceOf[`printer-geo-location`]
  @scala.inline
  def `printer-get-attributes-supported`: `printer-get-attributes-supported` = "printer-get-attributes-supported".asInstanceOf[`printer-get-attributes-supported`]
  @scala.inline
  def `printer-icc-profiles`: `printer-icc-profiles` = "printer-icc-profiles".asInstanceOf[`printer-icc-profiles`]
  @scala.inline
  def `printer-icons`: `printer-icons` = "printer-icons".asInstanceOf[`printer-icons`]
  @scala.inline
  def `printer-info`: `printer-info` = "printer-info".asInstanceOf[`printer-info`]
  @scala.inline
  def `printer-kind`: `printer-kind` = "printer-kind".asInstanceOf[`printer-kind`]
  @scala.inline
  def `printer-location`: `printer-location` = "printer-location".asInstanceOf[`printer-location`]
  @scala.inline
  def `printer-make-and-model`: `printer-make-and-model` = "printer-make-and-model".asInstanceOf[`printer-make-and-model`]
  @scala.inline
  def `printer-mandatory-job-attributes`: `printer-mandatory-job-attributes` = "printer-mandatory-job-attributes".asInstanceOf[`printer-mandatory-job-attributes`]
  @scala.inline
  def `printer-manual-reset`: `printer-manual-reset` = "printer-manual-reset".asInstanceOf[`printer-manual-reset`]
  @scala.inline
  def `printer-media-changed`: `printer-media-changed` = "printer-media-changed".asInstanceOf[`printer-media-changed`]
  @scala.inline
  def `printer-more-info-manufacturer`: `printer-more-info-manufacturer` = "printer-more-info-manufacturer".asInstanceOf[`printer-more-info-manufacturer`]
  @scala.inline
  def `printer-name`: `printer-name` = "printer-name".asInstanceOf[`printer-name`]
  @scala.inline
  def `printer-nms-reset`: `printer-nms-reset` = "printer-nms-reset".asInstanceOf[`printer-nms-reset`]
  @scala.inline
  def `printer-organization`: `printer-organization` = "printer-organization".asInstanceOf[`printer-organization`]
  @scala.inline
  def `printer-organizational-unit`: `printer-organizational-unit` = "printer-organizational-unit".asInstanceOf[`printer-organizational-unit`]
  @scala.inline
  def `printer-privacy-policy-uri`: `printer-privacy-policy-uri` = "printer-privacy-policy-uri".asInstanceOf[`printer-privacy-policy-uri`]
  @scala.inline
  def `printer-queue-order-changed`: `printer-queue-order-changed` = "printer-queue-order-changed".asInstanceOf[`printer-queue-order-changed`]
  @scala.inline
  def `printer-ready-to-print`: `printer-ready-to-print` = "printer-ready-to-print".asInstanceOf[`printer-ready-to-print`]
  @scala.inline
  def `printer-resolution`: `printer-resolution` = "printer-resolution".asInstanceOf[`printer-resolution`]
  @scala.inline
  def `printer-resolution-actual`: `printer-resolution-actual` = "printer-resolution-actual".asInstanceOf[`printer-resolution-actual`]
  @scala.inline
  def `printer-resolution-default`: `printer-resolution-default` = "printer-resolution-default".asInstanceOf[`printer-resolution-default`]
  @scala.inline
  def `printer-resolution-supported`: `printer-resolution-supported` = "printer-resolution-supported".asInstanceOf[`printer-resolution-supported`]
  @scala.inline
  def `printer-restarted`: `printer-restarted` = "printer-restarted".asInstanceOf[`printer-restarted`]
  @scala.inline
  def `printer-shutdown`: `printer-shutdown` = "printer-shutdown".asInstanceOf[`printer-shutdown`]
  @scala.inline
  def `printer-state-changed`: `printer-state-changed` = "printer-state-changed".asInstanceOf[`printer-state-changed`]
  @scala.inline
  def `printer-static-resource-directory-uri`: `printer-static-resource-directory-uri` = "printer-static-resource-directory-uri".asInstanceOf[`printer-static-resource-directory-uri`]
  @scala.inline
  def `printer-static-resource-k-octets-supported`: `printer-static-resource-k-octets-supported` = "printer-static-resource-k-octets-supported".asInstanceOf[`printer-static-resource-k-octets-supported`]
  @scala.inline
  def `printer-stopped`: `printer-stopped` = "printer-stopped".asInstanceOf[`printer-stopped`]
  @scala.inline
  def `printer-stopped-partly`: `printer-stopped-partly` = "printer-stopped-partly".asInstanceOf[`printer-stopped-partly`]
  @scala.inline
  def `printer-strings-languages-supported`: `printer-strings-languages-supported` = "printer-strings-languages-supported".asInstanceOf[`printer-strings-languages-supported`]
  @scala.inline
  def `printer-strings-uri`: `printer-strings-uri` = "printer-strings-uri".asInstanceOf[`printer-strings-uri`]
  @scala.inline
  def `printer-volume-supported`: `printer-volume-supported` = "printer-volume-supported".asInstanceOf[`printer-volume-supported`]
  @scala.inline
  def `printer-xri-supported`: `printer-xri-supported` = "printer-xri-supported".asInstanceOf[`printer-xri-supported`]
  @scala.inline
  def printing: printing = "printing".asInstanceOf[printing]
  @scala.inline
  def `process-bi-level`: `process-bi-level` = "process-bi-level".asInstanceOf[`process-bi-level`]
  @scala.inline
  def `process-job`: `process-job` = "process-job".asInstanceOf[`process-job`]
  @scala.inline
  def `process-monochrome`: `process-monochrome` = "process-monochrome".asInstanceOf[`process-monochrome`]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def `processing-stopped`: `processing-stopped` = "processing-stopped".asInstanceOf[`processing-stopped`]
  @scala.inline
  def `processing-to-stop-point`: `processing-to-stop-point` = "processing-to-stop-point".asInstanceOf[`processing-to-stop-point`]
  @scala.inline
  def progressive: progressive = "progressive".asInstanceOf[progressive]
  @scala.inline
  def `proof-print`: `proof-print` = "proof-print".asInstanceOf[`proof-print`]
  @scala.inline
  def `proof-print-copies`: `proof-print-copies` = "proof-print-copies".asInstanceOf[`proof-print-copies`]
  @scala.inline
  def `proof-print-default`: `proof-print-default` = "proof-print-default".asInstanceOf[`proof-print-default`]
  @scala.inline
  def `proof-print-supported`: `proof-print-supported` = "proof-print-supported".asInstanceOf[`proof-print-supported`]
  @scala.inline
  def prospero: prospero = "prospero".asInstanceOf[prospero]
  @scala.inline
  def proxy: proxy = "proxy".asInstanceOf[proxy]
  @scala.inline
  def psyc: psyc = "psyc".asInstanceOf[psyc]
  @scala.inline
  def pttp: pttp = "pttp".asInstanceOf[pttp]
  @scala.inline
  def punch: punch = "punch".asInstanceOf[punch]
  @scala.inline
  def `punch-bottom-left`: `punch-bottom-left` = "punch-bottom-left".asInstanceOf[`punch-bottom-left`]
  @scala.inline
  def `punch-bottom-right`: `punch-bottom-right` = "punch-bottom-right".asInstanceOf[`punch-bottom-right`]
  @scala.inline
  def `punch-dual-bottom`: `punch-dual-bottom` = "punch-dual-bottom".asInstanceOf[`punch-dual-bottom`]
  @scala.inline
  def `punch-dual-left`: `punch-dual-left` = "punch-dual-left".asInstanceOf[`punch-dual-left`]
  @scala.inline
  def `punch-dual-right`: `punch-dual-right` = "punch-dual-right".asInstanceOf[`punch-dual-right`]
  @scala.inline
  def `punch-dual-top`: `punch-dual-top` = "punch-dual-top".asInstanceOf[`punch-dual-top`]
  @scala.inline
  def `punch-multiple-bottom`: `punch-multiple-bottom` = "punch-multiple-bottom".asInstanceOf[`punch-multiple-bottom`]
  @scala.inline
  def `punch-multiple-left`: `punch-multiple-left` = "punch-multiple-left".asInstanceOf[`punch-multiple-left`]
  @scala.inline
  def `punch-multiple-right`: `punch-multiple-right` = "punch-multiple-right".asInstanceOf[`punch-multiple-right`]
  @scala.inline
  def `punch-multiple-top`: `punch-multiple-top` = "punch-multiple-top".asInstanceOf[`punch-multiple-top`]
  @scala.inline
  def `punch-quad-bottom`: `punch-quad-bottom` = "punch-quad-bottom".asInstanceOf[`punch-quad-bottom`]
  @scala.inline
  def `punch-quad-left`: `punch-quad-left` = "punch-quad-left".asInstanceOf[`punch-quad-left`]
  @scala.inline
  def `punch-quad-right`: `punch-quad-right` = "punch-quad-right".asInstanceOf[`punch-quad-right`]
  @scala.inline
  def `punch-quad-top`: `punch-quad-top` = "punch-quad-top".asInstanceOf[`punch-quad-top`]
  @scala.inline
  def `punch-top-left`: `punch-top-left` = "punch-top-left".asInstanceOf[`punch-top-left`]
  @scala.inline
  def `punch-top-right`: `punch-top-right` = "punch-top-right".asInstanceOf[`punch-top-right`]
  @scala.inline
  def `punch-triple-bottom`: `punch-triple-bottom` = "punch-triple-bottom".asInstanceOf[`punch-triple-bottom`]
  @scala.inline
  def `punch-triple-left`: `punch-triple-left` = "punch-triple-left".asInstanceOf[`punch-triple-left`]
  @scala.inline
  def `punch-triple-right`: `punch-triple-right` = "punch-triple-right".asInstanceOf[`punch-triple-right`]
  @scala.inline
  def `punch-triple-top`: `punch-triple-top` = "punch-triple-top".asInstanceOf[`punch-triple-top`]
  @scala.inline
  def `puncher-added`: `puncher-added` = "puncher-added".asInstanceOf[`puncher-added`]
  @scala.inline
  def `puncher-almost-empty`: `puncher-almost-empty` = "puncher-almost-empty".asInstanceOf[`puncher-almost-empty`]
  @scala.inline
  def `puncher-almost-full`: `puncher-almost-full` = "puncher-almost-full".asInstanceOf[`puncher-almost-full`]
  @scala.inline
  def `puncher-at-limit`: `puncher-at-limit` = "puncher-at-limit".asInstanceOf[`puncher-at-limit`]
  @scala.inline
  def `puncher-closed`: `puncher-closed` = "puncher-closed".asInstanceOf[`puncher-closed`]
  @scala.inline
  def `puncher-configuration-change`: `puncher-configuration-change` = "puncher-configuration-change".asInstanceOf[`puncher-configuration-change`]
  @scala.inline
  def `puncher-cover-closed`: `puncher-cover-closed` = "puncher-cover-closed".asInstanceOf[`puncher-cover-closed`]
  @scala.inline
  def `puncher-cover-open`: `puncher-cover-open` = "puncher-cover-open".asInstanceOf[`puncher-cover-open`]
  @scala.inline
  def `puncher-empty`: `puncher-empty` = "puncher-empty".asInstanceOf[`puncher-empty`]
  @scala.inline
  def `puncher-full`: `puncher-full` = "puncher-full".asInstanceOf[`puncher-full`]
  @scala.inline
  def `puncher-interlock-closed`: `puncher-interlock-closed` = "puncher-interlock-closed".asInstanceOf[`puncher-interlock-closed`]
  @scala.inline
  def `puncher-interlock-open`: `puncher-interlock-open` = "puncher-interlock-open".asInstanceOf[`puncher-interlock-open`]
  @scala.inline
  def `puncher-jam`: `puncher-jam` = "puncher-jam".asInstanceOf[`puncher-jam`]
  @scala.inline
  def `puncher-life-almost-over`: `puncher-life-almost-over` = "puncher-life-almost-over".asInstanceOf[`puncher-life-almost-over`]
  @scala.inline
  def `puncher-life-over`: `puncher-life-over` = "puncher-life-over".asInstanceOf[`puncher-life-over`]
  @scala.inline
  def `puncher-memory-exhausted`: `puncher-memory-exhausted` = "puncher-memory-exhausted".asInstanceOf[`puncher-memory-exhausted`]
  @scala.inline
  def `puncher-missing`: `puncher-missing` = "puncher-missing".asInstanceOf[`puncher-missing`]
  @scala.inline
  def `puncher-motor-failure`: `puncher-motor-failure` = "puncher-motor-failure".asInstanceOf[`puncher-motor-failure`]
  @scala.inline
  def `puncher-near-limit`: `puncher-near-limit` = "puncher-near-limit".asInstanceOf[`puncher-near-limit`]
  @scala.inline
  def `puncher-offline`: `puncher-offline` = "puncher-offline".asInstanceOf[`puncher-offline`]
  @scala.inline
  def `puncher-opened`: `puncher-opened` = "puncher-opened".asInstanceOf[`puncher-opened`]
  @scala.inline
  def `puncher-over-temperature`: `puncher-over-temperature` = "puncher-over-temperature".asInstanceOf[`puncher-over-temperature`]
  @scala.inline
  def `puncher-power-saver`: `puncher-power-saver` = "puncher-power-saver".asInstanceOf[`puncher-power-saver`]
  @scala.inline
  def `puncher-recoverable-failure`: `puncher-recoverable-failure` = "puncher-recoverable-failure".asInstanceOf[`puncher-recoverable-failure`]
  @scala.inline
  def `puncher-recoverable-storage-error`: `puncher-recoverable-storage-error` = "puncher-recoverable-storage-error".asInstanceOf[`puncher-recoverable-storage-error`]
  @scala.inline
  def `puncher-removed`: `puncher-removed` = "puncher-removed".asInstanceOf[`puncher-removed`]
  @scala.inline
  def `puncher-resource-added`: `puncher-resource-added` = "puncher-resource-added".asInstanceOf[`puncher-resource-added`]
  @scala.inline
  def `puncher-resource-removed`: `puncher-resource-removed` = "puncher-resource-removed".asInstanceOf[`puncher-resource-removed`]
  @scala.inline
  def `puncher-thermistor-failure`: `puncher-thermistor-failure` = "puncher-thermistor-failure".asInstanceOf[`puncher-thermistor-failure`]
  @scala.inline
  def `puncher-timing-failure`: `puncher-timing-failure` = "puncher-timing-failure".asInstanceOf[`puncher-timing-failure`]
  @scala.inline
  def `puncher-turned-off`: `puncher-turned-off` = "puncher-turned-off".asInstanceOf[`puncher-turned-off`]
  @scala.inline
  def `puncher-turned-on`: `puncher-turned-on` = "puncher-turned-on".asInstanceOf[`puncher-turned-on`]
  @scala.inline
  def `puncher-under-temperature`: `puncher-under-temperature` = "puncher-under-temperature".asInstanceOf[`puncher-under-temperature`]
  @scala.inline
  def `puncher-unrecoverable-failure`: `puncher-unrecoverable-failure` = "puncher-unrecoverable-failure".asInstanceOf[`puncher-unrecoverable-failure`]
  @scala.inline
  def `puncher-unrecoverable-storage-error`: `puncher-unrecoverable-storage-error` = "puncher-unrecoverable-storage-error".asInstanceOf[`puncher-unrecoverable-storage-error`]
  @scala.inline
  def `puncher-warming-up`: `puncher-warming-up` = "puncher-warming-up".asInstanceOf[`puncher-warming-up`]
  @scala.inline
  def punching: punching = "punching".asInstanceOf[punching]
  @scala.inline
  def `punching-hole-diameter-configured`: `punching-hole-diameter-configured` = "punching-hole-diameter-configured".asInstanceOf[`punching-hole-diameter-configured`]
  @scala.inline
  def `punching-locations-supported`: `punching-locations-supported` = "punching-locations-supported".asInstanceOf[`punching-locations-supported`]
  @scala.inline
  def `punching-offset-supported`: `punching-offset-supported` = "punching-offset-supported".asInstanceOf[`punching-offset-supported`]
  @scala.inline
  def `punching-reference-edge-supported`: `punching-reference-edge-supported` = "punching-reference-edge-supported".asInstanceOf[`punching-reference-edge-supported`]
  @scala.inline
  def `pva-dissolvable`: `pva-dissolvable` = "pva-dissolvable".asInstanceOf[`pva-dissolvable`]
  @scala.inline
  def `pwg-5102Dot3`: `pwg-5102Dot3` = "pwg-5102.3".asInstanceOf[`pwg-5102Dot3`]
  @scala.inline
  def `pwg-raster-document-resolution-supported`: `pwg-raster-document-resolution-supported` = "pwg-raster-document-resolution-supported".asInstanceOf[`pwg-raster-document-resolution-supported`]
  @scala.inline
  def `pwg-raster-document-sheet-back`: `pwg-raster-document-sheet-back` = "pwg-raster-document-sheet-back".asInstanceOf[`pwg-raster-document-sheet-back`]
  @scala.inline
  def `pwg-raster-document-type-supported`: `pwg-raster-document-type-supported` = "pwg-raster-document-type-supported".asInstanceOf[`pwg-raster-document-type-supported`]
  @scala.inline
  def `pwg-safe-gcode-supported`: `pwg-safe-gcode-supported` = "pwg-safe-gcode-supported".asInstanceOf[`pwg-safe-gcode-supported`]
  @scala.inline
  def pwid: pwid = "pwid".asInstanceOf[pwid]
  @scala.inline
  def qb: qb = "qb".asInstanceOf[qb]
  @scala.inline
  def quarto: quarto = "quarto".asInstanceOf[quarto]
  @scala.inline
  def `quarto-white`: `quarto-white` = "quarto-white".asInstanceOf[`quarto-white`]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  @scala.inline
  def `queued-for-marker`: `queued-for-marker` = "queued-for-marker".asInstanceOf[`queued-for-marker`]
  @scala.inline
  def `queued-in-device`: `queued-in-device` = "queued-in-device".asInstanceOf[`queued-in-device`]
  @scala.inline
  def `quic-transport`: `quic-transport` = "quic-transport".asInstanceOf[`quic-transport`]
  @scala.inline
  def raft: raft = "raft".asInstanceOf[raft]
  @scala.inline
  def rear: rear = "rear".asInstanceOf[rear]
  @scala.inline
  def receipt: receipt = "receipt".asInstanceOf[receipt]
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
  @scala.inline
  def rediss: rediss = "rediss".asInstanceOf[rediss]
  @scala.inline
  def `reference-uri-schemes-supported`: `reference-uri-schemes-supported` = "reference-uri-schemes-supported".asInstanceOf[`reference-uri-schemes-supported`]
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  @scala.inline
  def `relative-bpc`: `relative-bpc` = "relative-bpc".asInstanceOf[`relative-bpc`]
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  @scala.inline
  def `repertoire-supported`: `repertoire-supported` = "repertoire-supported".asInstanceOf[`repertoire-supported`]
  @scala.inline
  def `requesting-user-name`: `requesting-user-name` = "requesting-user-name".asInstanceOf[`requesting-user-name`]
  @scala.inline
  def `requesting-user-uri-supported`: `requesting-user-uri-supported` = "requesting-user-uri-supported".asInstanceOf[`requesting-user-uri-supported`]
  @scala.inline
  def res: res = "res".asInstanceOf[res]
  @scala.inline
  def `reset-hard`: `reset-hard` = "reset-hard".asInstanceOf[`reset-hard`]
  @scala.inline
  def `reset-hard-graceful`: `reset-hard-graceful` = "reset-hard-graceful".asInstanceOf[`reset-hard-graceful`]
  @scala.inline
  def `reset-init`: `reset-init` = "reset-init".asInstanceOf[`reset-init`]
  @scala.inline
  def `reset-mbr`: `reset-mbr` = "reset-mbr".asInstanceOf[`reset-mbr`]
  @scala.inline
  def `reset-mbr-graceful`: `reset-mbr-graceful` = "reset-mbr-graceful".asInstanceOf[`reset-mbr-graceful`]
  @scala.inline
  def `reset-nmi`: `reset-nmi` = "reset-nmi".asInstanceOf[`reset-nmi`]
  @scala.inline
  def `reset-soft`: `reset-soft` = "reset-soft".asInstanceOf[`reset-soft`]
  @scala.inline
  def `reset-soft-graceful`: `reset-soft-graceful` = "reset-soft-graceful".asInstanceOf[`reset-soft-graceful`]
  @scala.inline
  def resource: resource = "resource".asInstanceOf[resource]
  @scala.inline
  def `resource-object`: `resource-object` = "resource-object".asInstanceOf[`resource-object`]
  @scala.inline
  def `resources-are-not-ready`: `resources-are-not-ready` = "resources-are-not-ready".asInstanceOf[`resources-are-not-ready`]
  @scala.inline
  def `resources-are-not-supported`: `resources-are-not-supported` = "resources-are-not-supported".asInstanceOf[`resources-are-not-supported`]
  @scala.inline
  def `retry-interval`: `retry-interval` = "retry-interval".asInstanceOf[`retry-interval`]
  @scala.inline
  def `retry-interval-default`: `retry-interval-default` = "retry-interval-default".asInstanceOf[`retry-interval-default`]
  @scala.inline
  def `retry-interval-supported`: `retry-interval-supported` = "retry-interval-supported".asInstanceOf[`retry-interval-supported`]
  @scala.inline
  def `retry-time-out`: `retry-time-out` = "retry-time-out".asInstanceOf[`retry-time-out`]
  @scala.inline
  def `retry-time-out-default`: `retry-time-out-default` = "retry-time-out-default".asInstanceOf[`retry-time-out-default`]
  @scala.inline
  def `retry-time-out-supported`: `retry-time-out-supported` = "retry-time-out-supported".asInstanceOf[`retry-time-out-supported`]
  @scala.inline
  def `reverse-landscape`: `reverse-landscape` = "reverse-landscape".asInstanceOf[`reverse-landscape`]
  @scala.inline
  def `reverse-order-face-down`: `reverse-order-face-down` = "reverse-order-face-down".asInstanceOf[`reverse-order-face-down`]
  @scala.inline
  def `reverse-order-face-up`: `reverse-order-face-up` = "reverse-order-face-up".asInstanceOf[`reverse-order-face-up`]
  @scala.inline
  def `reverse-portrait`: `reverse-portrait` = "reverse-portrait".asInstanceOf[`reverse-portrait`]
  @scala.inline
  def rgb_16: rgb_16 = "rgb_16".asInstanceOf[rgb_16]
  @scala.inline
  def rgb_8: rgb_8 = "rgb_8".asInstanceOf[rgb_8]
  @scala.inline
  def rgba_16: rgba_16 = "rgba_16".asInstanceOf[rgba_16]
  @scala.inline
  def rgba_8: rgba_8 = "rgba_8".asInstanceOf[rgba_8]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rmi: rmi = "rmi".asInstanceOf[rmi]
  @scala.inline
  def roc_16k_7Dot75x10Dot75in: roc_16k_7Dot75x10Dot75in = "roc_16k_7.75x10.75in".asInstanceOf[roc_16k_7Dot75x10Dot75in]
  @scala.inline
  def roc_8k_10Dot75x15Dot5in: roc_8k_10Dot75x15Dot5in = "roc_8k_10.75x15.5in".asInstanceOf[roc_8k_10Dot75x15Dot5in]
  @scala.inline
  def roll: roll = "roll".asInstanceOf[roll]
  @scala.inline
  def `roll-1`: `roll-1` = "roll-1".asInstanceOf[`roll-1`]
  @scala.inline
  def `roll-10`: `roll-10` = "roll-10".asInstanceOf[`roll-10`]
  @scala.inline
  def `roll-2`: `roll-2` = "roll-2".asInstanceOf[`roll-2`]
  @scala.inline
  def `roll-3`: `roll-3` = "roll-3".asInstanceOf[`roll-3`]
  @scala.inline
  def `roll-4`: `roll-4` = "roll-4".asInstanceOf[`roll-4`]
  @scala.inline
  def `roll-5`: `roll-5` = "roll-5".asInstanceOf[`roll-5`]
  @scala.inline
  def `roll-6`: `roll-6` = "roll-6".asInstanceOf[`roll-6`]
  @scala.inline
  def `roll-7`: `roll-7` = "roll-7".asInstanceOf[`roll-7`]
  @scala.inline
  def `roll-8`: `roll-8` = "roll-8".asInstanceOf[`roll-8`]
  @scala.inline
  def `roll-9`: `roll-9` = "roll-9".asInstanceOf[`roll-9`]
  @scala.inline
  def rotated: rotated = "rotated".asInstanceOf[rotated]
  @scala.inline
  def rsync: rsync = "rsync".asInstanceOf[rsync]
  @scala.inline
  def rtmfp: rtmfp = "rtmfp".asInstanceOf[rtmfp]
  @scala.inline
  def rtmp: rtmp = "rtmp".asInstanceOf[rtmp]
  @scala.inline
  def rtsp: rtsp = "rtsp".asInstanceOf[rtsp]
  @scala.inline
  def rtsps: rtsps = "rtsps".asInstanceOf[rtsps]
  @scala.inline
  def rtspu: rtspu = "rtspu".asInstanceOf[rtspu]
  @scala.inline
  def `saddle-stitch`: `saddle-stitch` = "saddle-stitch".asInstanceOf[`saddle-stitch`]
  @scala.inline
  def `same-order-face-down`: `same-order-face-down` = "same-order-face-down".asInstanceOf[`same-order-face-down`]
  @scala.inline
  def `same-order-face-up`: `same-order-face-up` = "same-order-face-up".asInstanceOf[`same-order-face-up`]
  @scala.inline
  def satin: satin = "satin".asInstanceOf[satin]
  @scala.inline
  def saturation: saturation = "saturation".asInstanceOf[saturation]
  @scala.inline
  def `save-disposition-supported`: `save-disposition-supported` = "save-disposition-supported".asInstanceOf[`save-disposition-supported`]
  @scala.inline
  def `save-document-format-default`: `save-document-format-default` = "save-document-format-default".asInstanceOf[`save-document-format-default`]
  @scala.inline
  def `save-document-format-supported`: `save-document-format-supported` = "save-document-format-supported".asInstanceOf[`save-document-format-supported`]
  @scala.inline
  def `save-location-default`: `save-location-default` = "save-location-default".asInstanceOf[`save-location-default`]
  @scala.inline
  def `save-location-supported`: `save-location-supported` = "save-location-supported".asInstanceOf[`save-location-supported`]
  @scala.inline
  def `save-name-subdirectory-supported`: `save-name-subdirectory-supported` = "save-name-subdirectory-supported".asInstanceOf[`save-name-subdirectory-supported`]
  @scala.inline
  def `save-name-supported`: `save-name-supported` = "save-name-supported".asInstanceOf[`save-name-supported`]
  @scala.inline
  def `save-only`: `save-only` = "save-only".asInstanceOf[`save-only`]
  @scala.inline
  def saved: saved = "saved".asInstanceOf[saved]
  @scala.inline
  def scan: scan = "scan".asInstanceOf[scan]
  @scala.inline
  def score: score = "score".asInstanceOf[score]
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  @scala.inline
  def `screen-paged`: `screen-paged` = "screen-paged".asInstanceOf[`screen-paged`]
  @scala.inline
  def `second-shift`: `second-shift` = "second-shift".asInstanceOf[`second-shift`]
  @scala.inline
  def secondlife: secondlife = "secondlife".asInstanceOf[secondlife]
  @scala.inline
  def `self-adhesive`: `self-adhesive` = "self-adhesive".asInstanceOf[`self-adhesive`]
  @scala.inline
  def `self-adhesive-film`: `self-adhesive-film` = "self-adhesive-film".asInstanceOf[`self-adhesive-film`]
  @scala.inline
  def `semi-gloss`: `semi-gloss` = "semi-gloss".asInstanceOf[`semi-gloss`]
  @scala.inline
  def `separate-documents-collated-copies`: `separate-documents-collated-copies` = "separate-documents-collated-copies".asInstanceOf[`separate-documents-collated-copies`]
  @scala.inline
  def `separate-documents-uncollated-copies`: `separate-documents-uncollated-copies` = "separate-documents-uncollated-copies".asInstanceOf[`separate-documents-uncollated-copies`]
  @scala.inline
  def `separation-cutter-added`: `separation-cutter-added` = "separation-cutter-added".asInstanceOf[`separation-cutter-added`]
  @scala.inline
  def `separation-cutter-almost-empty`: `separation-cutter-almost-empty` = "separation-cutter-almost-empty".asInstanceOf[`separation-cutter-almost-empty`]
  @scala.inline
  def `separation-cutter-almost-full`: `separation-cutter-almost-full` = "separation-cutter-almost-full".asInstanceOf[`separation-cutter-almost-full`]
  @scala.inline
  def `separation-cutter-at-limit`: `separation-cutter-at-limit` = "separation-cutter-at-limit".asInstanceOf[`separation-cutter-at-limit`]
  @scala.inline
  def `separation-cutter-closed`: `separation-cutter-closed` = "separation-cutter-closed".asInstanceOf[`separation-cutter-closed`]
  @scala.inline
  def `separation-cutter-configuration-change`: `separation-cutter-configuration-change` = "separation-cutter-configuration-change".asInstanceOf[`separation-cutter-configuration-change`]
  @scala.inline
  def `separation-cutter-cover-closed`: `separation-cutter-cover-closed` = "separation-cutter-cover-closed".asInstanceOf[`separation-cutter-cover-closed`]
  @scala.inline
  def `separation-cutter-cover-open`: `separation-cutter-cover-open` = "separation-cutter-cover-open".asInstanceOf[`separation-cutter-cover-open`]
  @scala.inline
  def `separation-cutter-empty`: `separation-cutter-empty` = "separation-cutter-empty".asInstanceOf[`separation-cutter-empty`]
  @scala.inline
  def `separation-cutter-full`: `separation-cutter-full` = "separation-cutter-full".asInstanceOf[`separation-cutter-full`]
  @scala.inline
  def `separation-cutter-interlock-closed`: `separation-cutter-interlock-closed` = "separation-cutter-interlock-closed".asInstanceOf[`separation-cutter-interlock-closed`]
  @scala.inline
  def `separation-cutter-interlock-open`: `separation-cutter-interlock-open` = "separation-cutter-interlock-open".asInstanceOf[`separation-cutter-interlock-open`]
  @scala.inline
  def `separation-cutter-jam`: `separation-cutter-jam` = "separation-cutter-jam".asInstanceOf[`separation-cutter-jam`]
  @scala.inline
  def `separation-cutter-life-almost-over`: `separation-cutter-life-almost-over` = "separation-cutter-life-almost-over".asInstanceOf[`separation-cutter-life-almost-over`]
  @scala.inline
  def `separation-cutter-life-over`: `separation-cutter-life-over` = "separation-cutter-life-over".asInstanceOf[`separation-cutter-life-over`]
  @scala.inline
  def `separation-cutter-memory-exhausted`: `separation-cutter-memory-exhausted` = "separation-cutter-memory-exhausted".asInstanceOf[`separation-cutter-memory-exhausted`]
  @scala.inline
  def `separation-cutter-missing`: `separation-cutter-missing` = "separation-cutter-missing".asInstanceOf[`separation-cutter-missing`]
  @scala.inline
  def `separation-cutter-motor-failure`: `separation-cutter-motor-failure` = "separation-cutter-motor-failure".asInstanceOf[`separation-cutter-motor-failure`]
  @scala.inline
  def `separation-cutter-near-limit`: `separation-cutter-near-limit` = "separation-cutter-near-limit".asInstanceOf[`separation-cutter-near-limit`]
  @scala.inline
  def `separation-cutter-offline`: `separation-cutter-offline` = "separation-cutter-offline".asInstanceOf[`separation-cutter-offline`]
  @scala.inline
  def `separation-cutter-opened`: `separation-cutter-opened` = "separation-cutter-opened".asInstanceOf[`separation-cutter-opened`]
  @scala.inline
  def `separation-cutter-over-temperature`: `separation-cutter-over-temperature` = "separation-cutter-over-temperature".asInstanceOf[`separation-cutter-over-temperature`]
  @scala.inline
  def `separation-cutter-power-saver`: `separation-cutter-power-saver` = "separation-cutter-power-saver".asInstanceOf[`separation-cutter-power-saver`]
  @scala.inline
  def `separation-cutter-recoverable-failure`: `separation-cutter-recoverable-failure` = "separation-cutter-recoverable-failure".asInstanceOf[`separation-cutter-recoverable-failure`]
  @scala.inline
  def `separation-cutter-recoverable-storage-error`: `separation-cutter-recoverable-storage-error` = "separation-cutter-recoverable-storage-error".asInstanceOf[`separation-cutter-recoverable-storage-error`]
  @scala.inline
  def `separation-cutter-removed`: `separation-cutter-removed` = "separation-cutter-removed".asInstanceOf[`separation-cutter-removed`]
  @scala.inline
  def `separation-cutter-resource-added`: `separation-cutter-resource-added` = "separation-cutter-resource-added".asInstanceOf[`separation-cutter-resource-added`]
  @scala.inline
  def `separation-cutter-resource-removed`: `separation-cutter-resource-removed` = "separation-cutter-resource-removed".asInstanceOf[`separation-cutter-resource-removed`]
  @scala.inline
  def `separation-cutter-thermistor-failure`: `separation-cutter-thermistor-failure` = "separation-cutter-thermistor-failure".asInstanceOf[`separation-cutter-thermistor-failure`]
  @scala.inline
  def `separation-cutter-timing-failure`: `separation-cutter-timing-failure` = "separation-cutter-timing-failure".asInstanceOf[`separation-cutter-timing-failure`]
  @scala.inline
  def `separation-cutter-turned-off`: `separation-cutter-turned-off` = "separation-cutter-turned-off".asInstanceOf[`separation-cutter-turned-off`]
  @scala.inline
  def `separation-cutter-turned-on`: `separation-cutter-turned-on` = "separation-cutter-turned-on".asInstanceOf[`separation-cutter-turned-on`]
  @scala.inline
  def `separation-cutter-under-temperature`: `separation-cutter-under-temperature` = "separation-cutter-under-temperature".asInstanceOf[`separation-cutter-under-temperature`]
  @scala.inline
  def `separation-cutter-unrecoverable-failure`: `separation-cutter-unrecoverable-failure` = "separation-cutter-unrecoverable-failure".asInstanceOf[`separation-cutter-unrecoverable-failure`]
  @scala.inline
  def `separation-cutter-unrecoverable-storage-error`: `separation-cutter-unrecoverable-storage-error` = "separation-cutter-unrecoverable-storage-error".asInstanceOf[`separation-cutter-unrecoverable-storage-error`]
  @scala.inline
  def `separation-cutter-warming-up`: `separation-cutter-warming-up` = "separation-cutter-warming-up".asInstanceOf[`separation-cutter-warming-up`]
  @scala.inline
  def `separator-sheets`: `separator-sheets` = "separator-sheets".asInstanceOf[`separator-sheets`]
  @scala.inline
  def `separator-sheets-actual`: `separator-sheets-actual` = "separator-sheets-actual".asInstanceOf[`separator-sheets-actual`]
  @scala.inline
  def `separator-sheets-default`: `separator-sheets-default` = "separator-sheets-default".asInstanceOf[`separator-sheets-default`]
  @scala.inline
  def `separator-sheets-supported`: `separator-sheets-supported` = "separator-sheets-supported".asInstanceOf[`separator-sheets-supported`]
  @scala.inline
  def `server-error-busy`: `server-error-busy` = "server-error-busy".asInstanceOf[`server-error-busy`]
  @scala.inline
  def `server-error-device-error`: `server-error-device-error` = "server-error-device-error".asInstanceOf[`server-error-device-error`]
  @scala.inline
  def `server-error-internal-error`: `server-error-internal-error` = "server-error-internal-error".asInstanceOf[`server-error-internal-error`]
  @scala.inline
  def `server-error-job-canceled`: `server-error-job-canceled` = "server-error-job-canceled".asInstanceOf[`server-error-job-canceled`]
  @scala.inline
  def `server-error-multiple-document-jobs-not-supported`: `server-error-multiple-document-jobs-not-supported` = "server-error-multiple-document-jobs-not-supported".asInstanceOf[`server-error-multiple-document-jobs-not-supported`]
  @scala.inline
  def `server-error-not-accepting-jobs`: `server-error-not-accepting-jobs` = "server-error-not-accepting-jobs".asInstanceOf[`server-error-not-accepting-jobs`]
  @scala.inline
  def `server-error-operation-not-supported`: `server-error-operation-not-supported` = "server-error-operation-not-supported".asInstanceOf[`server-error-operation-not-supported`]
  @scala.inline
  def `server-error-printer-is-deactivated`: `server-error-printer-is-deactivated` = "server-error-printer-is-deactivated".asInstanceOf[`server-error-printer-is-deactivated`]
  @scala.inline
  def `server-error-service-unavailable`: `server-error-service-unavailable` = "server-error-service-unavailable".asInstanceOf[`server-error-service-unavailable`]
  @scala.inline
  def `server-error-temporary-error`: `server-error-temporary-error` = "server-error-temporary-error".asInstanceOf[`server-error-temporary-error`]
  @scala.inline
  def `server-error-too-many-documents`: `server-error-too-many-documents` = "server-error-too-many-documents".asInstanceOf[`server-error-too-many-documents`]
  @scala.inline
  def `server-error-too-many-jobs`: `server-error-too-many-jobs` = "server-error-too-many-jobs".asInstanceOf[`server-error-too-many-jobs`]
  @scala.inline
  def `server-error-version-not-supported`: `server-error-version-not-supported` = "server-error-version-not-supported".asInstanceOf[`server-error-version-not-supported`]
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  @scala.inline
  def `service-off-line`: `service-off-line` = "service-off-line".asInstanceOf[`service-off-line`]
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def sftp: sftp = "sftp".asInstanceOf[sftp]
  @scala.inline
  def sgn: sgn = "sgn".asInstanceOf[sgn]
  @scala.inline
  def sgray_1: sgray_1 = "sgray_1".asInstanceOf[sgray_1]
  @scala.inline
  def sgray_16: sgray_16 = "sgray_16".asInstanceOf[sgray_16]
  @scala.inline
  def sgray_8: sgray_8 = "sgray_8".asInstanceOf[sgray_8]
  @scala.inline
  def sha: sha = "sha".asInstanceOf[sha]
  @scala.inline
  def `sha2-224`: `sha2-224` = "sha2-224".asInstanceOf[`sha2-224`]
  @scala.inline
  def `sha2-256`: `sha2-256` = "sha2-256".asInstanceOf[`sha2-256`]
  @scala.inline
  def `sha2-384`: `sha2-384` = "sha2-384".asInstanceOf[`sha2-384`]
  @scala.inline
  def `sha2-512`: `sha2-512` = "sha2-512".asInstanceOf[`sha2-512`]
  @scala.inline
  def `sha2-512_224`: `sha2-512_224` = "sha2-512_224".asInstanceOf[`sha2-512_224`]
  @scala.inline
  def `sha2-512_256`: `sha2-512_256` = "sha2-512_256".asInstanceOf[`sha2-512_256`]
  @scala.inline
  def `sha3-224`: `sha3-224` = "sha3-224".asInstanceOf[`sha3-224`]
  @scala.inline
  def `sha3-256`: `sha3-256` = "sha3-256".asInstanceOf[`sha3-256`]
  @scala.inline
  def `sha3-384`: `sha3-384` = "sha3-384".asInstanceOf[`sha3-384`]
  @scala.inline
  def `sha3-512`: `sha3-512` = "sha3-512".asInstanceOf[`sha3-512`]
  @scala.inline
  def `sha3-512_224`: `sha3-512_224` = "sha3-512_224".asInstanceOf[`sha3-512_224`]
  @scala.inline
  def `sha3-512_256`: `sha3-512_256` = "sha3-512_256".asInstanceOf[`sha3-512_256`]
  @scala.inline
  def `shake-128`: `shake-128` = "shake-128".asInstanceOf[`shake-128`]
  @scala.inline
  def `shake-256`: `shake-256` = "shake-256".asInstanceOf[`shake-256`]
  @scala.inline
  def `sheet-collate-actual`: `sheet-collate-actual` = "sheet-collate-actual".asInstanceOf[`sheet-collate-actual`]
  @scala.inline
  def `sheet-rotator-added`: `sheet-rotator-added` = "sheet-rotator-added".asInstanceOf[`sheet-rotator-added`]
  @scala.inline
  def `sheet-rotator-almost-empty`: `sheet-rotator-almost-empty` = "sheet-rotator-almost-empty".asInstanceOf[`sheet-rotator-almost-empty`]
  @scala.inline
  def `sheet-rotator-almost-full`: `sheet-rotator-almost-full` = "sheet-rotator-almost-full".asInstanceOf[`sheet-rotator-almost-full`]
  @scala.inline
  def `sheet-rotator-at-limit`: `sheet-rotator-at-limit` = "sheet-rotator-at-limit".asInstanceOf[`sheet-rotator-at-limit`]
  @scala.inline
  def `sheet-rotator-closed`: `sheet-rotator-closed` = "sheet-rotator-closed".asInstanceOf[`sheet-rotator-closed`]
  @scala.inline
  def `sheet-rotator-configuration-change`: `sheet-rotator-configuration-change` = "sheet-rotator-configuration-change".asInstanceOf[`sheet-rotator-configuration-change`]
  @scala.inline
  def `sheet-rotator-cover-closed`: `sheet-rotator-cover-closed` = "sheet-rotator-cover-closed".asInstanceOf[`sheet-rotator-cover-closed`]
  @scala.inline
  def `sheet-rotator-cover-open`: `sheet-rotator-cover-open` = "sheet-rotator-cover-open".asInstanceOf[`sheet-rotator-cover-open`]
  @scala.inline
  def `sheet-rotator-empty`: `sheet-rotator-empty` = "sheet-rotator-empty".asInstanceOf[`sheet-rotator-empty`]
  @scala.inline
  def `sheet-rotator-full`: `sheet-rotator-full` = "sheet-rotator-full".asInstanceOf[`sheet-rotator-full`]
  @scala.inline
  def `sheet-rotator-interlock-closed`: `sheet-rotator-interlock-closed` = "sheet-rotator-interlock-closed".asInstanceOf[`sheet-rotator-interlock-closed`]
  @scala.inline
  def `sheet-rotator-interlock-open`: `sheet-rotator-interlock-open` = "sheet-rotator-interlock-open".asInstanceOf[`sheet-rotator-interlock-open`]
  @scala.inline
  def `sheet-rotator-jam`: `sheet-rotator-jam` = "sheet-rotator-jam".asInstanceOf[`sheet-rotator-jam`]
  @scala.inline
  def `sheet-rotator-life-almost-over`: `sheet-rotator-life-almost-over` = "sheet-rotator-life-almost-over".asInstanceOf[`sheet-rotator-life-almost-over`]
  @scala.inline
  def `sheet-rotator-life-over`: `sheet-rotator-life-over` = "sheet-rotator-life-over".asInstanceOf[`sheet-rotator-life-over`]
  @scala.inline
  def `sheet-rotator-memory-exhausted`: `sheet-rotator-memory-exhausted` = "sheet-rotator-memory-exhausted".asInstanceOf[`sheet-rotator-memory-exhausted`]
  @scala.inline
  def `sheet-rotator-missing`: `sheet-rotator-missing` = "sheet-rotator-missing".asInstanceOf[`sheet-rotator-missing`]
  @scala.inline
  def `sheet-rotator-motor-failure`: `sheet-rotator-motor-failure` = "sheet-rotator-motor-failure".asInstanceOf[`sheet-rotator-motor-failure`]
  @scala.inline
  def `sheet-rotator-near-limit`: `sheet-rotator-near-limit` = "sheet-rotator-near-limit".asInstanceOf[`sheet-rotator-near-limit`]
  @scala.inline
  def `sheet-rotator-offline`: `sheet-rotator-offline` = "sheet-rotator-offline".asInstanceOf[`sheet-rotator-offline`]
  @scala.inline
  def `sheet-rotator-opened`: `sheet-rotator-opened` = "sheet-rotator-opened".asInstanceOf[`sheet-rotator-opened`]
  @scala.inline
  def `sheet-rotator-over-temperature`: `sheet-rotator-over-temperature` = "sheet-rotator-over-temperature".asInstanceOf[`sheet-rotator-over-temperature`]
  @scala.inline
  def `sheet-rotator-power-saver`: `sheet-rotator-power-saver` = "sheet-rotator-power-saver".asInstanceOf[`sheet-rotator-power-saver`]
  @scala.inline
  def `sheet-rotator-recoverable-failure`: `sheet-rotator-recoverable-failure` = "sheet-rotator-recoverable-failure".asInstanceOf[`sheet-rotator-recoverable-failure`]
  @scala.inline
  def `sheet-rotator-recoverable-storage-error`: `sheet-rotator-recoverable-storage-error` = "sheet-rotator-recoverable-storage-error".asInstanceOf[`sheet-rotator-recoverable-storage-error`]
  @scala.inline
  def `sheet-rotator-removed`: `sheet-rotator-removed` = "sheet-rotator-removed".asInstanceOf[`sheet-rotator-removed`]
  @scala.inline
  def `sheet-rotator-resource-added`: `sheet-rotator-resource-added` = "sheet-rotator-resource-added".asInstanceOf[`sheet-rotator-resource-added`]
  @scala.inline
  def `sheet-rotator-resource-removed`: `sheet-rotator-resource-removed` = "sheet-rotator-resource-removed".asInstanceOf[`sheet-rotator-resource-removed`]
  @scala.inline
  def `sheet-rotator-thermistor-failure`: `sheet-rotator-thermistor-failure` = "sheet-rotator-thermistor-failure".asInstanceOf[`sheet-rotator-thermistor-failure`]
  @scala.inline
  def `sheet-rotator-timing-failure`: `sheet-rotator-timing-failure` = "sheet-rotator-timing-failure".asInstanceOf[`sheet-rotator-timing-failure`]
  @scala.inline
  def `sheet-rotator-turned-off`: `sheet-rotator-turned-off` = "sheet-rotator-turned-off".asInstanceOf[`sheet-rotator-turned-off`]
  @scala.inline
  def `sheet-rotator-turned-on`: `sheet-rotator-turned-on` = "sheet-rotator-turned-on".asInstanceOf[`sheet-rotator-turned-on`]
  @scala.inline
  def `sheet-rotator-under-temperature`: `sheet-rotator-under-temperature` = "sheet-rotator-under-temperature".asInstanceOf[`sheet-rotator-under-temperature`]
  @scala.inline
  def `sheet-rotator-unrecoverable-failure`: `sheet-rotator-unrecoverable-failure` = "sheet-rotator-unrecoverable-failure".asInstanceOf[`sheet-rotator-unrecoverable-failure`]
  @scala.inline
  def `sheet-rotator-unrecoverable-storage-error`: `sheet-rotator-unrecoverable-storage-error` = "sheet-rotator-unrecoverable-storage-error".asInstanceOf[`sheet-rotator-unrecoverable-storage-error`]
  @scala.inline
  def `sheet-rotator-warming-up`: `sheet-rotator-warming-up` = "sheet-rotator-warming-up".asInstanceOf[`sheet-rotator-warming-up`]
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  @scala.inline
  def shift_jis: shift_jis = "shift_jis".asInstanceOf[shift_jis]
  @scala.inline
  def `short-edge-first`: `short-edge-first` = "short-edge-first".asInstanceOf[`short-edge-first`]
  @scala.inline
  def `shrink-foil`: `shrink-foil` = "shrink-foil".asInstanceOf[`shrink-foil`]
  @scala.inline
  def `shrink-wrap`: `shrink-wrap` = "shrink-wrap".asInstanceOf[`shrink-wrap`]
  @scala.inline
  def shttp: shttp = "shttp".asInstanceOf[shttp]
  @scala.inline
  def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  @scala.inline
  def side: side = "side".asInstanceOf[side]
  @scala.inline
  def sides: sides = "sides".asInstanceOf[sides]
  @scala.inline
  def `sides-actual`: `sides-actual` = "sides-actual".asInstanceOf[`sides-actual`]
  @scala.inline
  def `sides-default`: `sides-default` = "sides-default".asInstanceOf[`sides-default`]
  @scala.inline
  def `sides-supported`: `sides-supported` = "sides-supported".asInstanceOf[`sides-supported`]
  @scala.inline
  def sieve: sieve = "sieve".asInstanceOf[sieve]
  @scala.inline
  def signature: signature = "signature".asInstanceOf[signature]
  @scala.inline
  def silicone: silicone = "silicone".asInstanceOf[silicone]
  @scala.inline
  def silver: silver = "silver".asInstanceOf[silver]
  @scala.inline
  def simpleledger: simpleledger = "simpleledger".asInstanceOf[simpleledger]
  @scala.inline
  def `single-document`: `single-document` = "single-document".asInstanceOf[`single-document`]
  @scala.inline
  def `single-document-new-sheet`: `single-document-new-sheet` = "single-document-new-sheet".asInstanceOf[`single-document-new-sheet`]
  @scala.inline
  def `single-face`: `single-face` = "single-face".asInstanceOf[`single-face`]
  @scala.inline
  def `single-wall`: `single-wall` = "single-wall".asInstanceOf[`single-wall`]
  @scala.inline
  def sip: sip = "sip".asInstanceOf[sip]
  @scala.inline
  def sips: sips = "sips".asInstanceOf[sips]
  @scala.inline
  def skirt: skirt = "skirt".asInstanceOf[skirt]
  @scala.inline
  def skype: skype = "skype".asInstanceOf[skype]
  @scala.inline
  def sleeve: sleeve = "sleeve".asInstanceOf[sleeve]
  @scala.inline
  def `slip-sheets`: `slip-sheets` = "slip-sheets".asInstanceOf[`slip-sheets`]
  @scala.inline
  def `slitter-added`: `slitter-added` = "slitter-added".asInstanceOf[`slitter-added`]
  @scala.inline
  def `slitter-almost-empty`: `slitter-almost-empty` = "slitter-almost-empty".asInstanceOf[`slitter-almost-empty`]
  @scala.inline
  def `slitter-almost-full`: `slitter-almost-full` = "slitter-almost-full".asInstanceOf[`slitter-almost-full`]
  @scala.inline
  def `slitter-at-limit`: `slitter-at-limit` = "slitter-at-limit".asInstanceOf[`slitter-at-limit`]
  @scala.inline
  def `slitter-closed`: `slitter-closed` = "slitter-closed".asInstanceOf[`slitter-closed`]
  @scala.inline
  def `slitter-configuration-change`: `slitter-configuration-change` = "slitter-configuration-change".asInstanceOf[`slitter-configuration-change`]
  @scala.inline
  def `slitter-cover-closed`: `slitter-cover-closed` = "slitter-cover-closed".asInstanceOf[`slitter-cover-closed`]
  @scala.inline
  def `slitter-cover-open`: `slitter-cover-open` = "slitter-cover-open".asInstanceOf[`slitter-cover-open`]
  @scala.inline
  def `slitter-empty`: `slitter-empty` = "slitter-empty".asInstanceOf[`slitter-empty`]
  @scala.inline
  def `slitter-full`: `slitter-full` = "slitter-full".asInstanceOf[`slitter-full`]
  @scala.inline
  def `slitter-interlock-closed`: `slitter-interlock-closed` = "slitter-interlock-closed".asInstanceOf[`slitter-interlock-closed`]
  @scala.inline
  def `slitter-interlock-open`: `slitter-interlock-open` = "slitter-interlock-open".asInstanceOf[`slitter-interlock-open`]
  @scala.inline
  def `slitter-jam`: `slitter-jam` = "slitter-jam".asInstanceOf[`slitter-jam`]
  @scala.inline
  def `slitter-life-almost-over`: `slitter-life-almost-over` = "slitter-life-almost-over".asInstanceOf[`slitter-life-almost-over`]
  @scala.inline
  def `slitter-life-over`: `slitter-life-over` = "slitter-life-over".asInstanceOf[`slitter-life-over`]
  @scala.inline
  def `slitter-memory-exhausted`: `slitter-memory-exhausted` = "slitter-memory-exhausted".asInstanceOf[`slitter-memory-exhausted`]
  @scala.inline
  def `slitter-missing`: `slitter-missing` = "slitter-missing".asInstanceOf[`slitter-missing`]
  @scala.inline
  def `slitter-motor-failure`: `slitter-motor-failure` = "slitter-motor-failure".asInstanceOf[`slitter-motor-failure`]
  @scala.inline
  def `slitter-near-limit`: `slitter-near-limit` = "slitter-near-limit".asInstanceOf[`slitter-near-limit`]
  @scala.inline
  def `slitter-offline`: `slitter-offline` = "slitter-offline".asInstanceOf[`slitter-offline`]
  @scala.inline
  def `slitter-opened`: `slitter-opened` = "slitter-opened".asInstanceOf[`slitter-opened`]
  @scala.inline
  def `slitter-over-temperature`: `slitter-over-temperature` = "slitter-over-temperature".asInstanceOf[`slitter-over-temperature`]
  @scala.inline
  def `slitter-power-saver`: `slitter-power-saver` = "slitter-power-saver".asInstanceOf[`slitter-power-saver`]
  @scala.inline
  def `slitter-recoverable-failure`: `slitter-recoverable-failure` = "slitter-recoverable-failure".asInstanceOf[`slitter-recoverable-failure`]
  @scala.inline
  def `slitter-recoverable-storage-error`: `slitter-recoverable-storage-error` = "slitter-recoverable-storage-error".asInstanceOf[`slitter-recoverable-storage-error`]
  @scala.inline
  def `slitter-removed`: `slitter-removed` = "slitter-removed".asInstanceOf[`slitter-removed`]
  @scala.inline
  def `slitter-resource-added`: `slitter-resource-added` = "slitter-resource-added".asInstanceOf[`slitter-resource-added`]
  @scala.inline
  def `slitter-resource-removed`: `slitter-resource-removed` = "slitter-resource-removed".asInstanceOf[`slitter-resource-removed`]
  @scala.inline
  def `slitter-thermistor-failure`: `slitter-thermistor-failure` = "slitter-thermistor-failure".asInstanceOf[`slitter-thermistor-failure`]
  @scala.inline
  def `slitter-timing-failure`: `slitter-timing-failure` = "slitter-timing-failure".asInstanceOf[`slitter-timing-failure`]
  @scala.inline
  def `slitter-turned-off`: `slitter-turned-off` = "slitter-turned-off".asInstanceOf[`slitter-turned-off`]
  @scala.inline
  def `slitter-turned-on`: `slitter-turned-on` = "slitter-turned-on".asInstanceOf[`slitter-turned-on`]
  @scala.inline
  def `slitter-under-temperature`: `slitter-under-temperature` = "slitter-under-temperature".asInstanceOf[`slitter-under-temperature`]
  @scala.inline
  def `slitter-unrecoverable-failure`: `slitter-unrecoverable-failure` = "slitter-unrecoverable-failure".asInstanceOf[`slitter-unrecoverable-failure`]
  @scala.inline
  def `slitter-unrecoverable-storage-error`: `slitter-unrecoverable-storage-error` = "slitter-unrecoverable-storage-error".asInstanceOf[`slitter-unrecoverable-storage-error`]
  @scala.inline
  def `slitter-warming-up`: `slitter-warming-up` = "slitter-warming-up".asInstanceOf[`slitter-warming-up`]
  @scala.inline
  def smb: smb = "smb".asInstanceOf[smb]
  @scala.inline
  def `smi2699-auth-print-group`: `smi2699-auth-print-group` = "smi2699-auth-print-group".asInstanceOf[`smi2699-auth-print-group`]
  @scala.inline
  def `smi2699-auth-proxy-group`: `smi2699-auth-proxy-group` = "smi2699-auth-proxy-group".asInstanceOf[`smi2699-auth-proxy-group`]
  @scala.inline
  def `smi2699-device-command`: `smi2699-device-command` = "smi2699-device-command".asInstanceOf[`smi2699-device-command`]
  @scala.inline
  def `smi2699-device-format`: `smi2699-device-format` = "smi2699-device-format".asInstanceOf[`smi2699-device-format`]
  @scala.inline
  def `smi2699-device-name`: `smi2699-device-name` = "smi2699-device-name".asInstanceOf[`smi2699-device-name`]
  @scala.inline
  def `smi2699-device-uri`: `smi2699-device-uri` = "smi2699-device-uri".asInstanceOf[`smi2699-device-uri`]
  @scala.inline
  def smime: smime = "smime".asInstanceOf[smime]
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  @scala.inline
  def smtp: smtp = "smtp".asInstanceOf[smtp]
  @scala.inline
  def snews: snews = "snews".asInstanceOf[snews]
  @scala.inline
  def snmp: snmp = "snmp".asInstanceOf[snmp]
  @scala.inline
  def sntp: sntp = "sntp".asInstanceOf[sntp]
  @scala.inline
  def soapDotbeep: soapDotbeep = "soap.beep".asInstanceOf[soapDotbeep]
  @scala.inline
  def soapDotbeeps: soapDotbeeps = "soap.beeps".asInstanceOf[soapDotbeeps]
  @scala.inline
  def soldat: soldat = "soldat".asInstanceOf[soldat]
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
  @scala.inline
  def speak: speak = "speak".asInstanceOf[speak]
  @scala.inline
  def spiffe: spiffe = "spiffe".asInstanceOf[spiffe]
  @scala.inline
  def spiral: spiral = "spiral".asInstanceOf[spiral]
  @scala.inline
  def spool: spool = "spool".asInstanceOf[spool]
  @scala.inline
  def `spool-area-full`: `spool-area-full` = "spool-area-full".asInstanceOf[`spool-area-full`]
  @scala.inline
  def spotify: spotify = "spotify".asInstanceOf[spotify]
  @scala.inline
  def srgb_16: srgb_16 = "srgb_16".asInstanceOf[srgb_16]
  @scala.inline
  def srgb_8: srgb_8 = "srgb_8".asInstanceOf[srgb_8]
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
  @scala.inline
  def ssl3: ssl3 = "ssl3".asInstanceOf[ssl3]
  @scala.inline
  def `stacker-1`: `stacker-1` = "stacker-1".asInstanceOf[`stacker-1`]
  @scala.inline
  def `stacker-10`: `stacker-10` = "stacker-10".asInstanceOf[`stacker-10`]
  @scala.inline
  def `stacker-2`: `stacker-2` = "stacker-2".asInstanceOf[`stacker-2`]
  @scala.inline
  def `stacker-3`: `stacker-3` = "stacker-3".asInstanceOf[`stacker-3`]
  @scala.inline
  def `stacker-4`: `stacker-4` = "stacker-4".asInstanceOf[`stacker-4`]
  @scala.inline
  def `stacker-5`: `stacker-5` = "stacker-5".asInstanceOf[`stacker-5`]
  @scala.inline
  def `stacker-6`: `stacker-6` = "stacker-6".asInstanceOf[`stacker-6`]
  @scala.inline
  def `stacker-7`: `stacker-7` = "stacker-7".asInstanceOf[`stacker-7`]
  @scala.inline
  def `stacker-8`: `stacker-8` = "stacker-8".asInstanceOf[`stacker-8`]
  @scala.inline
  def `stacker-9`: `stacker-9` = "stacker-9".asInstanceOf[`stacker-9`]
  @scala.inline
  def `stacker-added`: `stacker-added` = "stacker-added".asInstanceOf[`stacker-added`]
  @scala.inline
  def `stacker-almost-empty`: `stacker-almost-empty` = "stacker-almost-empty".asInstanceOf[`stacker-almost-empty`]
  @scala.inline
  def `stacker-almost-full`: `stacker-almost-full` = "stacker-almost-full".asInstanceOf[`stacker-almost-full`]
  @scala.inline
  def `stacker-at-limit`: `stacker-at-limit` = "stacker-at-limit".asInstanceOf[`stacker-at-limit`]
  @scala.inline
  def `stacker-closed`: `stacker-closed` = "stacker-closed".asInstanceOf[`stacker-closed`]
  @scala.inline
  def `stacker-configuration-change`: `stacker-configuration-change` = "stacker-configuration-change".asInstanceOf[`stacker-configuration-change`]
  @scala.inline
  def `stacker-cover-closed`: `stacker-cover-closed` = "stacker-cover-closed".asInstanceOf[`stacker-cover-closed`]
  @scala.inline
  def `stacker-cover-open`: `stacker-cover-open` = "stacker-cover-open".asInstanceOf[`stacker-cover-open`]
  @scala.inline
  def `stacker-empty`: `stacker-empty` = "stacker-empty".asInstanceOf[`stacker-empty`]
  @scala.inline
  def `stacker-full`: `stacker-full` = "stacker-full".asInstanceOf[`stacker-full`]
  @scala.inline
  def `stacker-interlock-closed`: `stacker-interlock-closed` = "stacker-interlock-closed".asInstanceOf[`stacker-interlock-closed`]
  @scala.inline
  def `stacker-interlock-open`: `stacker-interlock-open` = "stacker-interlock-open".asInstanceOf[`stacker-interlock-open`]
  @scala.inline
  def `stacker-jam`: `stacker-jam` = "stacker-jam".asInstanceOf[`stacker-jam`]
  @scala.inline
  def `stacker-life-almost-over`: `stacker-life-almost-over` = "stacker-life-almost-over".asInstanceOf[`stacker-life-almost-over`]
  @scala.inline
  def `stacker-life-over`: `stacker-life-over` = "stacker-life-over".asInstanceOf[`stacker-life-over`]
  @scala.inline
  def `stacker-memory-exhausted`: `stacker-memory-exhausted` = "stacker-memory-exhausted".asInstanceOf[`stacker-memory-exhausted`]
  @scala.inline
  def `stacker-missing`: `stacker-missing` = "stacker-missing".asInstanceOf[`stacker-missing`]
  @scala.inline
  def `stacker-motor-failure`: `stacker-motor-failure` = "stacker-motor-failure".asInstanceOf[`stacker-motor-failure`]
  @scala.inline
  def `stacker-near-limit`: `stacker-near-limit` = "stacker-near-limit".asInstanceOf[`stacker-near-limit`]
  @scala.inline
  def `stacker-offline`: `stacker-offline` = "stacker-offline".asInstanceOf[`stacker-offline`]
  @scala.inline
  def `stacker-opened`: `stacker-opened` = "stacker-opened".asInstanceOf[`stacker-opened`]
  @scala.inline
  def `stacker-over-temperature`: `stacker-over-temperature` = "stacker-over-temperature".asInstanceOf[`stacker-over-temperature`]
  @scala.inline
  def `stacker-power-saver`: `stacker-power-saver` = "stacker-power-saver".asInstanceOf[`stacker-power-saver`]
  @scala.inline
  def `stacker-recoverable-failure`: `stacker-recoverable-failure` = "stacker-recoverable-failure".asInstanceOf[`stacker-recoverable-failure`]
  @scala.inline
  def `stacker-recoverable-storage-error`: `stacker-recoverable-storage-error` = "stacker-recoverable-storage-error".asInstanceOf[`stacker-recoverable-storage-error`]
  @scala.inline
  def `stacker-removed`: `stacker-removed` = "stacker-removed".asInstanceOf[`stacker-removed`]
  @scala.inline
  def `stacker-resource-added`: `stacker-resource-added` = "stacker-resource-added".asInstanceOf[`stacker-resource-added`]
  @scala.inline
  def `stacker-resource-removed`: `stacker-resource-removed` = "stacker-resource-removed".asInstanceOf[`stacker-resource-removed`]
  @scala.inline
  def `stacker-thermistor-failure`: `stacker-thermistor-failure` = "stacker-thermistor-failure".asInstanceOf[`stacker-thermistor-failure`]
  @scala.inline
  def `stacker-timing-failure`: `stacker-timing-failure` = "stacker-timing-failure".asInstanceOf[`stacker-timing-failure`]
  @scala.inline
  def `stacker-turned-off`: `stacker-turned-off` = "stacker-turned-off".asInstanceOf[`stacker-turned-off`]
  @scala.inline
  def `stacker-turned-on`: `stacker-turned-on` = "stacker-turned-on".asInstanceOf[`stacker-turned-on`]
  @scala.inline
  def `stacker-under-temperature`: `stacker-under-temperature` = "stacker-under-temperature".asInstanceOf[`stacker-under-temperature`]
  @scala.inline
  def `stacker-unrecoverable-failure`: `stacker-unrecoverable-failure` = "stacker-unrecoverable-failure".asInstanceOf[`stacker-unrecoverable-failure`]
  @scala.inline
  def `stacker-unrecoverable-storage-error`: `stacker-unrecoverable-storage-error` = "stacker-unrecoverable-storage-error".asInstanceOf[`stacker-unrecoverable-storage-error`]
  @scala.inline
  def `stacker-warming-up`: `stacker-warming-up` = "stacker-warming-up".asInstanceOf[`stacker-warming-up`]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def standby: standby = "standby".asInstanceOf[standby]
  @scala.inline
  def `standby-vendor1`: `standby-vendor1` = "standby-vendor1".asInstanceOf[`standby-vendor1`]
  @scala.inline
  def `standby-vendor2`: `standby-vendor2` = "standby-vendor2".asInstanceOf[`standby-vendor2`]
  @scala.inline
  def `standby-vendor3`: `standby-vendor3` = "standby-vendor3".asInstanceOf[`standby-vendor3`]
  @scala.inline
  def `standby-vendor4`: `standby-vendor4` = "standby-vendor4".asInstanceOf[`standby-vendor4`]
  @scala.inline
  def `standby-vendor5`: `standby-vendor5` = "standby-vendor5".asInstanceOf[`standby-vendor5`]
  @scala.inline
  def staple: staple = "staple".asInstanceOf[staple]
  @scala.inline
  def `staple-bottom-left`: `staple-bottom-left` = "staple-bottom-left".asInstanceOf[`staple-bottom-left`]
  @scala.inline
  def `staple-bottom-right`: `staple-bottom-right` = "staple-bottom-right".asInstanceOf[`staple-bottom-right`]
  @scala.inline
  def `staple-dual-bottom`: `staple-dual-bottom` = "staple-dual-bottom".asInstanceOf[`staple-dual-bottom`]
  @scala.inline
  def `staple-dual-left`: `staple-dual-left` = "staple-dual-left".asInstanceOf[`staple-dual-left`]
  @scala.inline
  def `staple-dual-right`: `staple-dual-right` = "staple-dual-right".asInstanceOf[`staple-dual-right`]
  @scala.inline
  def `staple-dual-top`: `staple-dual-top` = "staple-dual-top".asInstanceOf[`staple-dual-top`]
  @scala.inline
  def `staple-top-left`: `staple-top-left` = "staple-top-left".asInstanceOf[`staple-top-left`]
  @scala.inline
  def `staple-top-right`: `staple-top-right` = "staple-top-right".asInstanceOf[`staple-top-right`]
  @scala.inline
  def `staple-triple-bottom`: `staple-triple-bottom` = "staple-triple-bottom".asInstanceOf[`staple-triple-bottom`]
  @scala.inline
  def `staple-triple-left`: `staple-triple-left` = "staple-triple-left".asInstanceOf[`staple-triple-left`]
  @scala.inline
  def `staple-triple-right`: `staple-triple-right` = "staple-triple-right".asInstanceOf[`staple-triple-right`]
  @scala.inline
  def `staple-triple-top`: `staple-triple-top` = "staple-triple-top".asInstanceOf[`staple-triple-top`]
  @scala.inline
  def `stapler-added`: `stapler-added` = "stapler-added".asInstanceOf[`stapler-added`]
  @scala.inline
  def `stapler-almost-empty`: `stapler-almost-empty` = "stapler-almost-empty".asInstanceOf[`stapler-almost-empty`]
  @scala.inline
  def `stapler-almost-full`: `stapler-almost-full` = "stapler-almost-full".asInstanceOf[`stapler-almost-full`]
  @scala.inline
  def `stapler-at-limit`: `stapler-at-limit` = "stapler-at-limit".asInstanceOf[`stapler-at-limit`]
  @scala.inline
  def `stapler-closed`: `stapler-closed` = "stapler-closed".asInstanceOf[`stapler-closed`]
  @scala.inline
  def `stapler-configuration-change`: `stapler-configuration-change` = "stapler-configuration-change".asInstanceOf[`stapler-configuration-change`]
  @scala.inline
  def `stapler-cover-closed`: `stapler-cover-closed` = "stapler-cover-closed".asInstanceOf[`stapler-cover-closed`]
  @scala.inline
  def `stapler-cover-open`: `stapler-cover-open` = "stapler-cover-open".asInstanceOf[`stapler-cover-open`]
  @scala.inline
  def `stapler-empty`: `stapler-empty` = "stapler-empty".asInstanceOf[`stapler-empty`]
  @scala.inline
  def `stapler-full`: `stapler-full` = "stapler-full".asInstanceOf[`stapler-full`]
  @scala.inline
  def `stapler-interlock-closed`: `stapler-interlock-closed` = "stapler-interlock-closed".asInstanceOf[`stapler-interlock-closed`]
  @scala.inline
  def `stapler-interlock-open`: `stapler-interlock-open` = "stapler-interlock-open".asInstanceOf[`stapler-interlock-open`]
  @scala.inline
  def `stapler-jam`: `stapler-jam` = "stapler-jam".asInstanceOf[`stapler-jam`]
  @scala.inline
  def `stapler-life-almost-over`: `stapler-life-almost-over` = "stapler-life-almost-over".asInstanceOf[`stapler-life-almost-over`]
  @scala.inline
  def `stapler-life-over`: `stapler-life-over` = "stapler-life-over".asInstanceOf[`stapler-life-over`]
  @scala.inline
  def `stapler-memory-exhausted`: `stapler-memory-exhausted` = "stapler-memory-exhausted".asInstanceOf[`stapler-memory-exhausted`]
  @scala.inline
  def `stapler-missing`: `stapler-missing` = "stapler-missing".asInstanceOf[`stapler-missing`]
  @scala.inline
  def `stapler-motor-failure`: `stapler-motor-failure` = "stapler-motor-failure".asInstanceOf[`stapler-motor-failure`]
  @scala.inline
  def `stapler-near-limit`: `stapler-near-limit` = "stapler-near-limit".asInstanceOf[`stapler-near-limit`]
  @scala.inline
  def `stapler-offline`: `stapler-offline` = "stapler-offline".asInstanceOf[`stapler-offline`]
  @scala.inline
  def `stapler-opened`: `stapler-opened` = "stapler-opened".asInstanceOf[`stapler-opened`]
  @scala.inline
  def `stapler-over-temperature`: `stapler-over-temperature` = "stapler-over-temperature".asInstanceOf[`stapler-over-temperature`]
  @scala.inline
  def `stapler-power-saver`: `stapler-power-saver` = "stapler-power-saver".asInstanceOf[`stapler-power-saver`]
  @scala.inline
  def `stapler-recoverable-failure`: `stapler-recoverable-failure` = "stapler-recoverable-failure".asInstanceOf[`stapler-recoverable-failure`]
  @scala.inline
  def `stapler-recoverable-storage-error`: `stapler-recoverable-storage-error` = "stapler-recoverable-storage-error".asInstanceOf[`stapler-recoverable-storage-error`]
  @scala.inline
  def `stapler-removed`: `stapler-removed` = "stapler-removed".asInstanceOf[`stapler-removed`]
  @scala.inline
  def `stapler-resource-added`: `stapler-resource-added` = "stapler-resource-added".asInstanceOf[`stapler-resource-added`]
  @scala.inline
  def `stapler-resource-removed`: `stapler-resource-removed` = "stapler-resource-removed".asInstanceOf[`stapler-resource-removed`]
  @scala.inline
  def `stapler-thermistor-failure`: `stapler-thermistor-failure` = "stapler-thermistor-failure".asInstanceOf[`stapler-thermistor-failure`]
  @scala.inline
  def `stapler-timing-failure`: `stapler-timing-failure` = "stapler-timing-failure".asInstanceOf[`stapler-timing-failure`]
  @scala.inline
  def `stapler-turned-off`: `stapler-turned-off` = "stapler-turned-off".asInstanceOf[`stapler-turned-off`]
  @scala.inline
  def `stapler-turned-on`: `stapler-turned-on` = "stapler-turned-on".asInstanceOf[`stapler-turned-on`]
  @scala.inline
  def `stapler-under-temperature`: `stapler-under-temperature` = "stapler-under-temperature".asInstanceOf[`stapler-under-temperature`]
  @scala.inline
  def `stapler-unrecoverable-failure`: `stapler-unrecoverable-failure` = "stapler-unrecoverable-failure".asInstanceOf[`stapler-unrecoverable-failure`]
  @scala.inline
  def `stapler-unrecoverable-storage-error`: `stapler-unrecoverable-storage-error` = "stapler-unrecoverable-storage-error".asInstanceOf[`stapler-unrecoverable-storage-error`]
  @scala.inline
  def `stapler-warming-up`: `stapler-warming-up` = "stapler-warming-up".asInstanceOf[`stapler-warming-up`]
  @scala.inline
  def `start-sheet`: `start-sheet` = "start-sheet".asInstanceOf[`start-sheet`]
  @scala.inline
  def `static-font`: `static-font` = "static-font".asInstanceOf[`static-font`]
  @scala.inline
  def `static-form`: `static-form` = "static-form".asInstanceOf[`static-form`]
  @scala.inline
  def `static-icc-profile`: `static-icc-profile` = "static-icc-profile".asInstanceOf[`static-icc-profile`]
  @scala.inline
  def `static-image`: `static-image` = "static-image".asInstanceOf[`static-image`]
  @scala.inline
  def `static-logo`: `static-logo` = "static-logo".asInstanceOf[`static-logo`]
  @scala.inline
  def `static-other`: `static-other` = "static-other".asInstanceOf[`static-other`]
  @scala.inline
  def `static-strings`: `static-strings` = "static-strings".asInstanceOf[`static-strings`]
  @scala.inline
  def stationery: stationery = "stationery".asInstanceOf[stationery]
  @scala.inline
  def `stationery-archival`: `stationery-archival` = "stationery-archival".asInstanceOf[`stationery-archival`]
  @scala.inline
  def `stationery-coated`: `stationery-coated` = "stationery-coated".asInstanceOf[`stationery-coated`]
  @scala.inline
  def `stationery-cotton`: `stationery-cotton` = "stationery-cotton".asInstanceOf[`stationery-cotton`]
  @scala.inline
  def `stationery-fine`: `stationery-fine` = "stationery-fine".asInstanceOf[`stationery-fine`]
  @scala.inline
  def `stationery-heavyweight`: `stationery-heavyweight` = "stationery-heavyweight".asInstanceOf[`stationery-heavyweight`]
  @scala.inline
  def `stationery-heavyweight-coated`: `stationery-heavyweight-coated` = "stationery-heavyweight-coated".asInstanceOf[`stationery-heavyweight-coated`]
  @scala.inline
  def `stationery-inkjet`: `stationery-inkjet` = "stationery-inkjet".asInstanceOf[`stationery-inkjet`]
  @scala.inline
  def `stationery-letterhead`: `stationery-letterhead` = "stationery-letterhead".asInstanceOf[`stationery-letterhead`]
  @scala.inline
  def `stationery-lightweight`: `stationery-lightweight` = "stationery-lightweight".asInstanceOf[`stationery-lightweight`]
  @scala.inline
  def `stationery-preprinted`: `stationery-preprinted` = "stationery-preprinted".asInstanceOf[`stationery-preprinted`]
  @scala.inline
  def `stationery-prepunched`: `stationery-prepunched` = "stationery-prepunched".asInstanceOf[`stationery-prepunched`]
  @scala.inline
  def steam: steam = "steam".asInstanceOf[steam]
  @scala.inline
  def stipple: stipple = "stipple".asInstanceOf[stipple]
  @scala.inline
  def `stitcher-added`: `stitcher-added` = "stitcher-added".asInstanceOf[`stitcher-added`]
  @scala.inline
  def `stitcher-almost-empty`: `stitcher-almost-empty` = "stitcher-almost-empty".asInstanceOf[`stitcher-almost-empty`]
  @scala.inline
  def `stitcher-almost-full`: `stitcher-almost-full` = "stitcher-almost-full".asInstanceOf[`stitcher-almost-full`]
  @scala.inline
  def `stitcher-at-limit`: `stitcher-at-limit` = "stitcher-at-limit".asInstanceOf[`stitcher-at-limit`]
  @scala.inline
  def `stitcher-closed`: `stitcher-closed` = "stitcher-closed".asInstanceOf[`stitcher-closed`]
  @scala.inline
  def `stitcher-configuration-change`: `stitcher-configuration-change` = "stitcher-configuration-change".asInstanceOf[`stitcher-configuration-change`]
  @scala.inline
  def `stitcher-cover-closed`: `stitcher-cover-closed` = "stitcher-cover-closed".asInstanceOf[`stitcher-cover-closed`]
  @scala.inline
  def `stitcher-cover-open`: `stitcher-cover-open` = "stitcher-cover-open".asInstanceOf[`stitcher-cover-open`]
  @scala.inline
  def `stitcher-empty`: `stitcher-empty` = "stitcher-empty".asInstanceOf[`stitcher-empty`]
  @scala.inline
  def `stitcher-full`: `stitcher-full` = "stitcher-full".asInstanceOf[`stitcher-full`]
  @scala.inline
  def `stitcher-interlock-closed`: `stitcher-interlock-closed` = "stitcher-interlock-closed".asInstanceOf[`stitcher-interlock-closed`]
  @scala.inline
  def `stitcher-interlock-open`: `stitcher-interlock-open` = "stitcher-interlock-open".asInstanceOf[`stitcher-interlock-open`]
  @scala.inline
  def `stitcher-jam`: `stitcher-jam` = "stitcher-jam".asInstanceOf[`stitcher-jam`]
  @scala.inline
  def `stitcher-life-almost-over`: `stitcher-life-almost-over` = "stitcher-life-almost-over".asInstanceOf[`stitcher-life-almost-over`]
  @scala.inline
  def `stitcher-life-over`: `stitcher-life-over` = "stitcher-life-over".asInstanceOf[`stitcher-life-over`]
  @scala.inline
  def `stitcher-memory-exhausted`: `stitcher-memory-exhausted` = "stitcher-memory-exhausted".asInstanceOf[`stitcher-memory-exhausted`]
  @scala.inline
  def `stitcher-missing`: `stitcher-missing` = "stitcher-missing".asInstanceOf[`stitcher-missing`]
  @scala.inline
  def `stitcher-motor-failure`: `stitcher-motor-failure` = "stitcher-motor-failure".asInstanceOf[`stitcher-motor-failure`]
  @scala.inline
  def `stitcher-near-limit`: `stitcher-near-limit` = "stitcher-near-limit".asInstanceOf[`stitcher-near-limit`]
  @scala.inline
  def `stitcher-offline`: `stitcher-offline` = "stitcher-offline".asInstanceOf[`stitcher-offline`]
  @scala.inline
  def `stitcher-opened`: `stitcher-opened` = "stitcher-opened".asInstanceOf[`stitcher-opened`]
  @scala.inline
  def `stitcher-over-temperature`: `stitcher-over-temperature` = "stitcher-over-temperature".asInstanceOf[`stitcher-over-temperature`]
  @scala.inline
  def `stitcher-power-saver`: `stitcher-power-saver` = "stitcher-power-saver".asInstanceOf[`stitcher-power-saver`]
  @scala.inline
  def `stitcher-recoverable-failure`: `stitcher-recoverable-failure` = "stitcher-recoverable-failure".asInstanceOf[`stitcher-recoverable-failure`]
  @scala.inline
  def `stitcher-recoverable-storage-error`: `stitcher-recoverable-storage-error` = "stitcher-recoverable-storage-error".asInstanceOf[`stitcher-recoverable-storage-error`]
  @scala.inline
  def `stitcher-removed`: `stitcher-removed` = "stitcher-removed".asInstanceOf[`stitcher-removed`]
  @scala.inline
  def `stitcher-resource-added`: `stitcher-resource-added` = "stitcher-resource-added".asInstanceOf[`stitcher-resource-added`]
  @scala.inline
  def `stitcher-resource-removed`: `stitcher-resource-removed` = "stitcher-resource-removed".asInstanceOf[`stitcher-resource-removed`]
  @scala.inline
  def `stitcher-thermistor-failure`: `stitcher-thermistor-failure` = "stitcher-thermistor-failure".asInstanceOf[`stitcher-thermistor-failure`]
  @scala.inline
  def `stitcher-timing-failure`: `stitcher-timing-failure` = "stitcher-timing-failure".asInstanceOf[`stitcher-timing-failure`]
  @scala.inline
  def `stitcher-turned-off`: `stitcher-turned-off` = "stitcher-turned-off".asInstanceOf[`stitcher-turned-off`]
  @scala.inline
  def `stitcher-turned-on`: `stitcher-turned-on` = "stitcher-turned-on".asInstanceOf[`stitcher-turned-on`]
  @scala.inline
  def `stitcher-under-temperature`: `stitcher-under-temperature` = "stitcher-under-temperature".asInstanceOf[`stitcher-under-temperature`]
  @scala.inline
  def `stitcher-unrecoverable-failure`: `stitcher-unrecoverable-failure` = "stitcher-unrecoverable-failure".asInstanceOf[`stitcher-unrecoverable-failure`]
  @scala.inline
  def `stitcher-unrecoverable-storage-error`: `stitcher-unrecoverable-storage-error` = "stitcher-unrecoverable-storage-error".asInstanceOf[`stitcher-unrecoverable-storage-error`]
  @scala.inline
  def `stitcher-warming-up`: `stitcher-warming-up` = "stitcher-warming-up".asInstanceOf[`stitcher-warming-up`]
  @scala.inline
  def stitching: stitching = "stitching".asInstanceOf[stitching]
  @scala.inline
  def `stitching-angle-supported`: `stitching-angle-supported` = "stitching-angle-supported".asInstanceOf[`stitching-angle-supported`]
  @scala.inline
  def `stitching-locations-supported`: `stitching-locations-supported` = "stitching-locations-supported".asInstanceOf[`stitching-locations-supported`]
  @scala.inline
  def `stitching-method-supported`: `stitching-method-supported` = "stitching-method-supported".asInstanceOf[`stitching-method-supported`]
  @scala.inline
  def `stitching-offset-supported`: `stitching-offset-supported` = "stitching-offset-supported".asInstanceOf[`stitching-offset-supported`]
  @scala.inline
  def `stitching-reference-edge-supported`: `stitching-reference-edge-supported` = "stitching-reference-edge-supported".asInstanceOf[`stitching-reference-edge-supported`]
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  @scala.inline
  def `stopped-partly`: `stopped-partly` = "stopped-partly".asInstanceOf[`stopped-partly`]
  @scala.inline
  def stopping: stopping = "stopping".asInstanceOf[stopping]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def stun: stun = "stun".asInstanceOf[stun]
  @scala.inline
  def stuns: stuns = "stuns".asInstanceOf[stuns]
  @scala.inline
  def `subject-supported`: `subject-supported` = "subject-supported".asInstanceOf[`subject-supported`]
  @scala.inline
  def `submission-interrupted`: `submission-interrupted` = "submission-interrupted".asInstanceOf[`submission-interrupted`]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def `subordinate-printers-supported`: `subordinate-printers-supported` = "subordinate-printers-supported".asInstanceOf[`subordinate-printers-supported`]
  @scala.inline
  def `subscription-object`: `subscription-object` = "subscription-object".asInstanceOf[`subscription-object`]
  @scala.inline
  def `subscription-privacy-attributes`: `subscription-privacy-attributes` = "subscription-privacy-attributes".asInstanceOf[`subscription-privacy-attributes`]
  @scala.inline
  def `subscription-privacy-scope`: `subscription-privacy-scope` = "subscription-privacy-scope".asInstanceOf[`subscription-privacy-scope`]
  @scala.inline
  def `subunit-added`: `subunit-added` = "subunit-added".asInstanceOf[`subunit-added`]
  @scala.inline
  def `subunit-almost-empty`: `subunit-almost-empty` = "subunit-almost-empty".asInstanceOf[`subunit-almost-empty`]
  @scala.inline
  def `subunit-almost-full`: `subunit-almost-full` = "subunit-almost-full".asInstanceOf[`subunit-almost-full`]
  @scala.inline
  def `subunit-at-limit`: `subunit-at-limit` = "subunit-at-limit".asInstanceOf[`subunit-at-limit`]
  @scala.inline
  def `subunit-closed`: `subunit-closed` = "subunit-closed".asInstanceOf[`subunit-closed`]
  @scala.inline
  def `subunit-empty`: `subunit-empty` = "subunit-empty".asInstanceOf[`subunit-empty`]
  @scala.inline
  def `subunit-full`: `subunit-full` = "subunit-full".asInstanceOf[`subunit-full`]
  @scala.inline
  def `subunit-life-almost-over`: `subunit-life-almost-over` = "subunit-life-almost-over".asInstanceOf[`subunit-life-almost-over`]
  @scala.inline
  def `subunit-life-over`: `subunit-life-over` = "subunit-life-over".asInstanceOf[`subunit-life-over`]
  @scala.inline
  def `subunit-memory-exhausted`: `subunit-memory-exhausted` = "subunit-memory-exhausted".asInstanceOf[`subunit-memory-exhausted`]
  @scala.inline
  def `subunit-missing`: `subunit-missing` = "subunit-missing".asInstanceOf[`subunit-missing`]
  @scala.inline
  def `subunit-motor-failure`: `subunit-motor-failure` = "subunit-motor-failure".asInstanceOf[`subunit-motor-failure`]
  @scala.inline
  def `subunit-near-limit`: `subunit-near-limit` = "subunit-near-limit".asInstanceOf[`subunit-near-limit`]
  @scala.inline
  def `subunit-offline`: `subunit-offline` = "subunit-offline".asInstanceOf[`subunit-offline`]
  @scala.inline
  def `subunit-opened`: `subunit-opened` = "subunit-opened".asInstanceOf[`subunit-opened`]
  @scala.inline
  def `subunit-over-temperature`: `subunit-over-temperature` = "subunit-over-temperature".asInstanceOf[`subunit-over-temperature`]
  @scala.inline
  def `subunit-power-saver`: `subunit-power-saver` = "subunit-power-saver".asInstanceOf[`subunit-power-saver`]
  @scala.inline
  def `subunit-recoverable-failure`: `subunit-recoverable-failure` = "subunit-recoverable-failure".asInstanceOf[`subunit-recoverable-failure`]
  @scala.inline
  def `subunit-recoverable-storage-error`: `subunit-recoverable-storage-error` = "subunit-recoverable-storage-error".asInstanceOf[`subunit-recoverable-storage-error`]
  @scala.inline
  def `subunit-removed`: `subunit-removed` = "subunit-removed".asInstanceOf[`subunit-removed`]
  @scala.inline
  def `subunit-resource-added`: `subunit-resource-added` = "subunit-resource-added".asInstanceOf[`subunit-resource-added`]
  @scala.inline
  def `subunit-resource-removed`: `subunit-resource-removed` = "subunit-resource-removed".asInstanceOf[`subunit-resource-removed`]
  @scala.inline
  def `subunit-thermistor-failure`: `subunit-thermistor-failure` = "subunit-thermistor-failure".asInstanceOf[`subunit-thermistor-failure`]
  @scala.inline
  def `subunit-timing-Failure`: `subunit-timing-Failure` = "subunit-timing-Failure".asInstanceOf[`subunit-timing-Failure`]
  @scala.inline
  def `subunit-turned-off`: `subunit-turned-off` = "subunit-turned-off".asInstanceOf[`subunit-turned-off`]
  @scala.inline
  def `subunit-turned-on`: `subunit-turned-on` = "subunit-turned-on".asInstanceOf[`subunit-turned-on`]
  @scala.inline
  def `subunit-under-temperature`: `subunit-under-temperature` = "subunit-under-temperature".asInstanceOf[`subunit-under-temperature`]
  @scala.inline
  def `subunit-unrecoverable-failure`: `subunit-unrecoverable-failure` = "subunit-unrecoverable-failure".asInstanceOf[`subunit-unrecoverable-failure`]
  @scala.inline
  def `subunit-unrecoverable-storage-error`: `subunit-unrecoverable-storage-error` = "subunit-unrecoverable-storage-error".asInstanceOf[`subunit-unrecoverable-storage-error`]
  @scala.inline
  def `subunit-warming-up`: `subunit-warming-up` = "subunit-warming-up".asInstanceOf[`subunit-warming-up`]
  @scala.inline
  def `successful-ok`: `successful-ok` = "successful-ok".asInstanceOf[`successful-ok`]
  @scala.inline
  def `successful-ok-conflicting-attributes`: `successful-ok-conflicting-attributes` = "successful-ok-conflicting-attributes".asInstanceOf[`successful-ok-conflicting-attributes`]
  @scala.inline
  def `successful-ok-events-complete`: `successful-ok-events-complete` = "successful-ok-events-complete".asInstanceOf[`successful-ok-events-complete`]
  @scala.inline
  def `successful-ok-ignored-or-substituted-attributes`: `successful-ok-ignored-or-substituted-attributes` = "successful-ok-ignored-or-substituted-attributes".asInstanceOf[`successful-ok-ignored-or-substituted-attributes`]
  @scala.inline
  def `successful-ok-ignored-subscriptions`: `successful-ok-ignored-subscriptions` = "successful-ok-ignored-subscriptions".asInstanceOf[`successful-ok-ignored-subscriptions`]
  @scala.inline
  def `successful-ok-too-many-events`: `successful-ok-too-many-events` = "successful-ok-too-many-events".asInstanceOf[`successful-ok-too-many-events`]
  @scala.inline
  def `super-b`: `super-b` = "super-b".asInstanceOf[`super-b`]
  @scala.inline
  def support: support = "support".asInstanceOf[support]
  @scala.inline
  def suspend: suspend = "suspend".asInstanceOf[suspend]
  @scala.inline
  def `suspend-job`: `suspend-job` = "suspend-job".asInstanceOf[`suspend-job`]
  @scala.inline
  def `suspend-vendor1`: `suspend-vendor1` = "suspend-vendor1".asInstanceOf[`suspend-vendor1`]
  @scala.inline
  def `suspend-vendor2`: `suspend-vendor2` = "suspend-vendor2".asInstanceOf[`suspend-vendor2`]
  @scala.inline
  def `suspend-vendor3`: `suspend-vendor3` = "suspend-vendor3".asInstanceOf[`suspend-vendor3`]
  @scala.inline
  def `suspend-vendor4`: `suspend-vendor4` = "suspend-vendor4".asInstanceOf[`suspend-vendor4`]
  @scala.inline
  def `suspend-vendor5`: `suspend-vendor5` = "suspend-vendor5".asInstanceOf[`suspend-vendor5`]
  @scala.inline
  def svn: svn = "svn".asInstanceOf[svn]
  @scala.inline
  def `system-object`: `system-object` = "system-object".asInstanceOf[`system-object`]
  @scala.inline
  def `system-specified`: `system-specified` = "system-specified".asInstanceOf[`system-specified`]
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  @scala.inline
  def `tab-stock`: `tab-stock` = "tab-stock".asInstanceOf[`tab-stock`]
  @scala.inline
  def tabloid: tabloid = "tabloid".asInstanceOf[tabloid]
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
  @scala.inline
  def tape: tape = "tape".asInstanceOf[tape]
  @scala.inline
  def teamspeak: teamspeak = "teamspeak".asInstanceOf[teamspeak]
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  @scala.inline
  def teliaeid: teliaeid = "teliaeid".asInstanceOf[teliaeid]
  @scala.inline
  def telnet: telnet = "telnet".asInstanceOf[telnet]
  @scala.inline
  def `template-document`: `template-document` = "template-document".asInstanceOf[`template-document`]
  @scala.inline
  def `template-job`: `template-job` = "template-job".asInstanceOf[`template-job`]
  @scala.inline
  def `template-printer`: `template-printer` = "template-printer".asInstanceOf[`template-printer`]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def `text-and-graphic`: `text-and-graphic` = "text-and-graphic".asInstanceOf[`text-and-graphic`]
  @scala.inline
  def `text-and-photo`: `text-and-photo` = "text-and-photo".asInstanceOf[`text-and-photo`]
  @scala.inline
  def textSlashhtml: textSlashhtml = "text/html".asInstanceOf[textSlashhtml]
  @scala.inline
  def textSlashplain: textSlashplain = "text/plain".asInstanceOf[textSlashplain]
  @scala.inline
  def textSlashrichtext: textSlashrichtext = "text/richtext".asInstanceOf[textSlashrichtext]
  @scala.inline
  def `textSlashtab-separated-values`: `textSlashtab-separated-values` = "text/tab-separated-values".asInstanceOf[`textSlashtab-separated-values`]
  @scala.inline
  def `textSlashx-setext`: `textSlashx-setext` = "text/x-setext".asInstanceOf[`textSlashx-setext`]
  @scala.inline
  def `textSlashx-sgml`: `textSlashx-sgml` = "text/x-sgml".asInstanceOf[`textSlashx-sgml`]
  @scala.inline
  def tftp: tftp = "tftp".asInstanceOf[tftp]
  @scala.inline
  def things: things = "things".asInstanceOf[things]
  @scala.inline
  def `third-shift`: `third-shift` = "third-shift".asInstanceOf[`third-shift`]
  @scala.inline
  def thismessage: thismessage = "thismessage".asInstanceOf[thismessage]
  @scala.inline
  def `time-at-completed`: `time-at-completed` = "time-at-completed".asInstanceOf[`time-at-completed`]
  @scala.inline
  def `time-at-creation`: `time-at-creation` = "time-at-creation".asInstanceOf[`time-at-creation`]
  @scala.inline
  def `time-at-processing`: `time-at-processing` = "time-at-processing".asInstanceOf[`time-at-processing`]
  @scala.inline
  def `timed-out`: `timed-out` = "timed-out".asInstanceOf[`timed-out`]
  @scala.inline
  def tip: tip = "tip".asInstanceOf[tip]
  @scala.inline
  def titanium: titanium = "titanium".asInstanceOf[titanium]
  @scala.inline
  def tls: tls = "tls".asInstanceOf[tls]
  @scala.inline
  def tn3270: tn3270 = "tn3270".asInstanceOf[tn3270]
  @scala.inline
  def `to-name-supported`: `to-name-supported` = "to-name-supported".asInstanceOf[`to-name-supported`]
  @scala.inline
  def `tobottom-toleft`: `tobottom-toleft` = "tobottom-toleft".asInstanceOf[`tobottom-toleft`]
  @scala.inline
  def `tobottom-toright`: `tobottom-toright` = "tobottom-toright".asInstanceOf[`tobottom-toright`]
  @scala.inline
  def `toleft-tobottom`: `toleft-tobottom` = "toleft-tobottom".asInstanceOf[`toleft-tobottom`]
  @scala.inline
  def `toleft-totop`: `toleft-totop` = "toleft-totop".asInstanceOf[`toleft-totop`]
  @scala.inline
  def `toner-empty`: `toner-empty` = "toner-empty".asInstanceOf[`toner-empty`]
  @scala.inline
  def `toner-low`: `toner-low` = "toner-low".asInstanceOf[`toner-low`]
  @scala.inline
  def tool: tool = "tool".asInstanceOf[tool]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `toright-tobottom`: `toright-tobottom` = "toright-tobottom".asInstanceOf[`toright-tobottom`]
  @scala.inline
  def `toright-totop`: `toright-totop` = "toright-totop".asInstanceOf[`toright-totop`]
  @scala.inline
  def `totop-toleft`: `totop-toleft` = "totop-toleft".asInstanceOf[`totop-toleft`]
  @scala.inline
  def `totop-toright`: `totop-toright` = "totop-toright".asInstanceOf[`totop-toright`]
  @scala.inline
  def tractor: tractor = "tractor".asInstanceOf[tractor]
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
  @scala.inline
  def transforming: transforming = "transforming".asInstanceOf[transforming]
  @scala.inline
  def translucent: translucent = "translucent".asInstanceOf[translucent]
  @scala.inline
  def transparency: transparency = "transparency".asInstanceOf[transparency]
  @scala.inline
  def `tray-1`: `tray-1` = "tray-1".asInstanceOf[`tray-1`]
  @scala.inline
  def `tray-10`: `tray-10` = "tray-10".asInstanceOf[`tray-10`]
  @scala.inline
  def `tray-11`: `tray-11` = "tray-11".asInstanceOf[`tray-11`]
  @scala.inline
  def `tray-12`: `tray-12` = "tray-12".asInstanceOf[`tray-12`]
  @scala.inline
  def `tray-13`: `tray-13` = "tray-13".asInstanceOf[`tray-13`]
  @scala.inline
  def `tray-14`: `tray-14` = "tray-14".asInstanceOf[`tray-14`]
  @scala.inline
  def `tray-15`: `tray-15` = "tray-15".asInstanceOf[`tray-15`]
  @scala.inline
  def `tray-16`: `tray-16` = "tray-16".asInstanceOf[`tray-16`]
  @scala.inline
  def `tray-17`: `tray-17` = "tray-17".asInstanceOf[`tray-17`]
  @scala.inline
  def `tray-18`: `tray-18` = "tray-18".asInstanceOf[`tray-18`]
  @scala.inline
  def `tray-19`: `tray-19` = "tray-19".asInstanceOf[`tray-19`]
  @scala.inline
  def `tray-2`: `tray-2` = "tray-2".asInstanceOf[`tray-2`]
  @scala.inline
  def `tray-20`: `tray-20` = "tray-20".asInstanceOf[`tray-20`]
  @scala.inline
  def `tray-3`: `tray-3` = "tray-3".asInstanceOf[`tray-3`]
  @scala.inline
  def `tray-4`: `tray-4` = "tray-4".asInstanceOf[`tray-4`]
  @scala.inline
  def `tray-5`: `tray-5` = "tray-5".asInstanceOf[`tray-5`]
  @scala.inline
  def `tray-6`: `tray-6` = "tray-6".asInstanceOf[`tray-6`]
  @scala.inline
  def `tray-7`: `tray-7` = "tray-7".asInstanceOf[`tray-7`]
  @scala.inline
  def `tray-8`: `tray-8` = "tray-8".asInstanceOf[`tray-8`]
  @scala.inline
  def `tray-9`: `tray-9` = "tray-9".asInstanceOf[`tray-9`]
  @scala.inline
  def trim: trim = "trim".asInstanceOf[trim]
  @scala.inline
  def `trim-after-copies`: `trim-after-copies` = "trim-after-copies".asInstanceOf[`trim-after-copies`]
  @scala.inline
  def `trim-after-documents`: `trim-after-documents` = "trim-after-documents".asInstanceOf[`trim-after-documents`]
  @scala.inline
  def `trim-after-job`: `trim-after-job` = "trim-after-job".asInstanceOf[`trim-after-job`]
  @scala.inline
  def `trim-after-pages`: `trim-after-pages` = "trim-after-pages".asInstanceOf[`trim-after-pages`]
  @scala.inline
  def `trimmer-added`: `trimmer-added` = "trimmer-added".asInstanceOf[`trimmer-added`]
  @scala.inline
  def `trimmer-almost-empty`: `trimmer-almost-empty` = "trimmer-almost-empty".asInstanceOf[`trimmer-almost-empty`]
  @scala.inline
  def `trimmer-almost-full`: `trimmer-almost-full` = "trimmer-almost-full".asInstanceOf[`trimmer-almost-full`]
  @scala.inline
  def `trimmer-at-limit`: `trimmer-at-limit` = "trimmer-at-limit".asInstanceOf[`trimmer-at-limit`]
  @scala.inline
  def `trimmer-closed`: `trimmer-closed` = "trimmer-closed".asInstanceOf[`trimmer-closed`]
  @scala.inline
  def `trimmer-configuration-change`: `trimmer-configuration-change` = "trimmer-configuration-change".asInstanceOf[`trimmer-configuration-change`]
  @scala.inline
  def `trimmer-cover-closed`: `trimmer-cover-closed` = "trimmer-cover-closed".asInstanceOf[`trimmer-cover-closed`]
  @scala.inline
  def `trimmer-cover-open`: `trimmer-cover-open` = "trimmer-cover-open".asInstanceOf[`trimmer-cover-open`]
  @scala.inline
  def `trimmer-empty`: `trimmer-empty` = "trimmer-empty".asInstanceOf[`trimmer-empty`]
  @scala.inline
  def `trimmer-full`: `trimmer-full` = "trimmer-full".asInstanceOf[`trimmer-full`]
  @scala.inline
  def `trimmer-interlock-closed`: `trimmer-interlock-closed` = "trimmer-interlock-closed".asInstanceOf[`trimmer-interlock-closed`]
  @scala.inline
  def `trimmer-interlock-open`: `trimmer-interlock-open` = "trimmer-interlock-open".asInstanceOf[`trimmer-interlock-open`]
  @scala.inline
  def `trimmer-jam`: `trimmer-jam` = "trimmer-jam".asInstanceOf[`trimmer-jam`]
  @scala.inline
  def `trimmer-life-almost-over`: `trimmer-life-almost-over` = "trimmer-life-almost-over".asInstanceOf[`trimmer-life-almost-over`]
  @scala.inline
  def `trimmer-life-over`: `trimmer-life-over` = "trimmer-life-over".asInstanceOf[`trimmer-life-over`]
  @scala.inline
  def `trimmer-memory-exhausted`: `trimmer-memory-exhausted` = "trimmer-memory-exhausted".asInstanceOf[`trimmer-memory-exhausted`]
  @scala.inline
  def `trimmer-missing`: `trimmer-missing` = "trimmer-missing".asInstanceOf[`trimmer-missing`]
  @scala.inline
  def `trimmer-motor-failure`: `trimmer-motor-failure` = "trimmer-motor-failure".asInstanceOf[`trimmer-motor-failure`]
  @scala.inline
  def `trimmer-near-limit`: `trimmer-near-limit` = "trimmer-near-limit".asInstanceOf[`trimmer-near-limit`]
  @scala.inline
  def `trimmer-offline`: `trimmer-offline` = "trimmer-offline".asInstanceOf[`trimmer-offline`]
  @scala.inline
  def `trimmer-opened`: `trimmer-opened` = "trimmer-opened".asInstanceOf[`trimmer-opened`]
  @scala.inline
  def `trimmer-over-temperature`: `trimmer-over-temperature` = "trimmer-over-temperature".asInstanceOf[`trimmer-over-temperature`]
  @scala.inline
  def `trimmer-power-saver`: `trimmer-power-saver` = "trimmer-power-saver".asInstanceOf[`trimmer-power-saver`]
  @scala.inline
  def `trimmer-recoverable-failure`: `trimmer-recoverable-failure` = "trimmer-recoverable-failure".asInstanceOf[`trimmer-recoverable-failure`]
  @scala.inline
  def `trimmer-recoverable-storage-error`: `trimmer-recoverable-storage-error` = "trimmer-recoverable-storage-error".asInstanceOf[`trimmer-recoverable-storage-error`]
  @scala.inline
  def `trimmer-removed`: `trimmer-removed` = "trimmer-removed".asInstanceOf[`trimmer-removed`]
  @scala.inline
  def `trimmer-resource-added`: `trimmer-resource-added` = "trimmer-resource-added".asInstanceOf[`trimmer-resource-added`]
  @scala.inline
  def `trimmer-resource-removed`: `trimmer-resource-removed` = "trimmer-resource-removed".asInstanceOf[`trimmer-resource-removed`]
  @scala.inline
  def `trimmer-thermistor-failure`: `trimmer-thermistor-failure` = "trimmer-thermistor-failure".asInstanceOf[`trimmer-thermistor-failure`]
  @scala.inline
  def `trimmer-timing-failure`: `trimmer-timing-failure` = "trimmer-timing-failure".asInstanceOf[`trimmer-timing-failure`]
  @scala.inline
  def `trimmer-turned-off`: `trimmer-turned-off` = "trimmer-turned-off".asInstanceOf[`trimmer-turned-off`]
  @scala.inline
  def `trimmer-turned-on`: `trimmer-turned-on` = "trimmer-turned-on".asInstanceOf[`trimmer-turned-on`]
  @scala.inline
  def `trimmer-under-temperature`: `trimmer-under-temperature` = "trimmer-under-temperature".asInstanceOf[`trimmer-under-temperature`]
  @scala.inline
  def `trimmer-unrecoverable-failure`: `trimmer-unrecoverable-failure` = "trimmer-unrecoverable-failure".asInstanceOf[`trimmer-unrecoverable-failure`]
  @scala.inline
  def `trimmer-unrecoverable-storage-error`: `trimmer-unrecoverable-storage-error` = "trimmer-unrecoverable-storage-error".asInstanceOf[`trimmer-unrecoverable-storage-error`]
  @scala.inline
  def `trimmer-warming-up`: `trimmer-warming-up` = "trimmer-warming-up".asInstanceOf[`trimmer-warming-up`]
  @scala.inline
  def trimming: trimming = "trimming".asInstanceOf[trimming]
  @scala.inline
  def `trimming-offset-supported`: `trimming-offset-supported` = "trimming-offset-supported".asInstanceOf[`trimming-offset-supported`]
  @scala.inline
  def `trimming-reference-edge-supported`: `trimming-reference-edge-supported` = "trimming-reference-edge-supported".asInstanceOf[`trimming-reference-edge-supported`]
  @scala.inline
  def `trimming-type-supported`: `trimming-type-supported` = "trimming-type-supported".asInstanceOf[`trimming-type-supported`]
  @scala.inline
  def `trimming-when-supported`: `trimming-when-supported` = "trimming-when-supported".asInstanceOf[`trimming-when-supported`]
  @scala.inline
  def `triple-wall`: `triple-wall` = "triple-wall".asInstanceOf[`triple-wall`]
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  @scala.inline
  def turns: turns = "turns".asInstanceOf[turns]
  @scala.inline
  def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  @scala.inline
  def tv: tv = "tv".asInstanceOf[tv]
  @scala.inline
  def `two-sided-long-edge`: `two-sided-long-edge` = "two-sided-long-edge".asInstanceOf[`two-sided-long-edge`]
  @scala.inline
  def `two-sided-short-edge`: `two-sided-short-edge` = "two-sided-short-edge".asInstanceOf[`two-sided-short-edge`]
  @scala.inline
  def u3d: u3d = "u3d".asInstanceOf[u3d]
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  @scala.inline
  def um: um = "um".asInstanceOf[um]
  @scala.inline
  def uncalendared: uncalendared = "uncalendared".asInstanceOf[uncalendared]
  @scala.inline
  def uncollated: uncollated = "uncollated".asInstanceOf[uncollated]
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
  @scala.inline
  def unicodeFFFE: unicodeFFFE = "unicodeFFFE".asInstanceOf[unicodeFFFE]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unreal: unreal = "unreal".asInstanceOf[unreal]
  @scala.inline
  def `unsupported-compression`: `unsupported-compression` = "unsupported-compression".asInstanceOf[`unsupported-compression`]
  @scala.inline
  def `unsupported-document-format`: `unsupported-document-format` = "unsupported-document-format".asInstanceOf[`unsupported-document-format`]
  @scala.inline
  def `uri-authentication-supported`: `uri-authentication-supported` = "uri-authentication-supported".asInstanceOf[`uri-authentication-supported`]
  @scala.inline
  def `uri-security-supported`: `uri-security-supported` = "uri-security-supported".asInstanceOf[`uri-security-supported`]
  @scala.inline
  def urn: urn = "urn".asInstanceOf[urn]
  @scala.inline
  def `us-ascii`: `us-ascii` = "us-ascii".asInstanceOf[`us-ascii`]
  @scala.inline
  def `user-defined-values-supported`: `user-defined-values-supported` = "user-defined-values-supported".asInstanceOf[`user-defined-values-supported`]
  @scala.inline
  def ut2004: ut2004 = "ut2004".asInstanceOf[ut2004]
  @scala.inline
  def `utf-7`: `utf-7` = "utf-7".asInstanceOf[`utf-7`]
  @scala.inline
  def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  @scala.inline
  def `v-event`: `v-event` = "v-event".asInstanceOf[`v-event`]
  @scala.inline
  def vellum: vellum = "vellum".asInstanceOf[vellum]
  @scala.inline
  def velo: velo = "velo".asInstanceOf[velo]
  @scala.inline
  def vemmi: vemmi = "vemmi".asInstanceOf[vemmi]
  @scala.inline
  def ventrilo: ventrilo = "ventrilo".asInstanceOf[ventrilo]
  @scala.inline
  def videotex: videotex = "videotex".asInstanceOf[videotex]
  @scala.inline
  def `view-source`: `view-source` = "view-source".asInstanceOf[`view-source`]
  @scala.inline
  def violet: violet = "violet".asInstanceOf[violet]
  @scala.inline
  def vnc: vnc = "vnc".asInstanceOf[vnc]
  @scala.inline
  def wais: wais = "wais".asInstanceOf[wais]
  @scala.inline
  def `warnings-count`: `warnings-count` = "warnings-count".asInstanceOf[`warnings-count`]
  @scala.inline
  def `warnings-detected`: `warnings-detected` = "warnings-detected".asInstanceOf[`warnings-detected`]
  @scala.inline
  def wax: wax = "wax".asInstanceOf[wax]
  @scala.inline
  def webcal: webcal = "webcal".asInstanceOf[webcal]
  @scala.inline
  def weekend: weekend = "weekend".asInstanceOf[weekend]
  @scala.inline
  def `wet-film`: `wet-film` = "wet-film".asInstanceOf[`wet-film`]
  @scala.inline
  def `which-jobs-supported`: `which-jobs-supported` = "which-jobs-supported".asInstanceOf[`which-jobs-supported`]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
  @scala.inline
  def `windows-1250`: `windows-1250` = "windows-1250".asInstanceOf[`windows-1250`]
  @scala.inline
  def `windows-1251`: `windows-1251` = "windows-1251".asInstanceOf[`windows-1251`]
  @scala.inline
  def `windows-1254`: `windows-1254` = "windows-1254".asInstanceOf[`windows-1254`]
  @scala.inline
  def `windows-1255`: `windows-1255` = "windows-1255".asInstanceOf[`windows-1255`]
  @scala.inline
  def `windows-1256`: `windows-1256` = "windows-1256".asInstanceOf[`windows-1256`]
  @scala.inline
  def `windows-1257`: `windows-1257` = "windows-1257".asInstanceOf[`windows-1257`]
  @scala.inline
  def `windows-1258`: `windows-1258` = "windows-1258".asInstanceOf[`windows-1258`]
  @scala.inline
  def `windows-874`: `windows-874` = "windows-874".asInstanceOf[`windows-874`]
  @scala.inline
  def wire: wire = "wire".asInstanceOf[wire]
  @scala.inline
  def wpid: wpid = "wpid".asInstanceOf[wpid]
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
  @scala.inline
  def `wrapper-added`: `wrapper-added` = "wrapper-added".asInstanceOf[`wrapper-added`]
  @scala.inline
  def `wrapper-almost-empty`: `wrapper-almost-empty` = "wrapper-almost-empty".asInstanceOf[`wrapper-almost-empty`]
  @scala.inline
  def `wrapper-almost-full`: `wrapper-almost-full` = "wrapper-almost-full".asInstanceOf[`wrapper-almost-full`]
  @scala.inline
  def `wrapper-at-limit`: `wrapper-at-limit` = "wrapper-at-limit".asInstanceOf[`wrapper-at-limit`]
  @scala.inline
  def `wrapper-closed`: `wrapper-closed` = "wrapper-closed".asInstanceOf[`wrapper-closed`]
  @scala.inline
  def `wrapper-configuration-change`: `wrapper-configuration-change` = "wrapper-configuration-change".asInstanceOf[`wrapper-configuration-change`]
  @scala.inline
  def `wrapper-cover-closed`: `wrapper-cover-closed` = "wrapper-cover-closed".asInstanceOf[`wrapper-cover-closed`]
  @scala.inline
  def `wrapper-cover-open`: `wrapper-cover-open` = "wrapper-cover-open".asInstanceOf[`wrapper-cover-open`]
  @scala.inline
  def `wrapper-empty`: `wrapper-empty` = "wrapper-empty".asInstanceOf[`wrapper-empty`]
  @scala.inline
  def `wrapper-full`: `wrapper-full` = "wrapper-full".asInstanceOf[`wrapper-full`]
  @scala.inline
  def `wrapper-interlock-closed`: `wrapper-interlock-closed` = "wrapper-interlock-closed".asInstanceOf[`wrapper-interlock-closed`]
  @scala.inline
  def `wrapper-interlock-open`: `wrapper-interlock-open` = "wrapper-interlock-open".asInstanceOf[`wrapper-interlock-open`]
  @scala.inline
  def `wrapper-jam`: `wrapper-jam` = "wrapper-jam".asInstanceOf[`wrapper-jam`]
  @scala.inline
  def `wrapper-life-almost-over`: `wrapper-life-almost-over` = "wrapper-life-almost-over".asInstanceOf[`wrapper-life-almost-over`]
  @scala.inline
  def `wrapper-life-over`: `wrapper-life-over` = "wrapper-life-over".asInstanceOf[`wrapper-life-over`]
  @scala.inline
  def `wrapper-memory-exhausted`: `wrapper-memory-exhausted` = "wrapper-memory-exhausted".asInstanceOf[`wrapper-memory-exhausted`]
  @scala.inline
  def `wrapper-missing`: `wrapper-missing` = "wrapper-missing".asInstanceOf[`wrapper-missing`]
  @scala.inline
  def `wrapper-motor-failure`: `wrapper-motor-failure` = "wrapper-motor-failure".asInstanceOf[`wrapper-motor-failure`]
  @scala.inline
  def `wrapper-near-limit`: `wrapper-near-limit` = "wrapper-near-limit".asInstanceOf[`wrapper-near-limit`]
  @scala.inline
  def `wrapper-offline`: `wrapper-offline` = "wrapper-offline".asInstanceOf[`wrapper-offline`]
  @scala.inline
  def `wrapper-opened`: `wrapper-opened` = "wrapper-opened".asInstanceOf[`wrapper-opened`]
  @scala.inline
  def `wrapper-over-temperature`: `wrapper-over-temperature` = "wrapper-over-temperature".asInstanceOf[`wrapper-over-temperature`]
  @scala.inline
  def `wrapper-power-saver`: `wrapper-power-saver` = "wrapper-power-saver".asInstanceOf[`wrapper-power-saver`]
  @scala.inline
  def `wrapper-recoverable-failure`: `wrapper-recoverable-failure` = "wrapper-recoverable-failure".asInstanceOf[`wrapper-recoverable-failure`]
  @scala.inline
  def `wrapper-recoverable-storage-error`: `wrapper-recoverable-storage-error` = "wrapper-recoverable-storage-error".asInstanceOf[`wrapper-recoverable-storage-error`]
  @scala.inline
  def `wrapper-removed`: `wrapper-removed` = "wrapper-removed".asInstanceOf[`wrapper-removed`]
  @scala.inline
  def `wrapper-resource-added`: `wrapper-resource-added` = "wrapper-resource-added".asInstanceOf[`wrapper-resource-added`]
  @scala.inline
  def `wrapper-resource-removed`: `wrapper-resource-removed` = "wrapper-resource-removed".asInstanceOf[`wrapper-resource-removed`]
  @scala.inline
  def `wrapper-thermistor-failure`: `wrapper-thermistor-failure` = "wrapper-thermistor-failure".asInstanceOf[`wrapper-thermistor-failure`]
  @scala.inline
  def `wrapper-timing-failure`: `wrapper-timing-failure` = "wrapper-timing-failure".asInstanceOf[`wrapper-timing-failure`]
  @scala.inline
  def `wrapper-turned-off`: `wrapper-turned-off` = "wrapper-turned-off".asInstanceOf[`wrapper-turned-off`]
  @scala.inline
  def `wrapper-turned-on`: `wrapper-turned-on` = "wrapper-turned-on".asInstanceOf[`wrapper-turned-on`]
  @scala.inline
  def `wrapper-under-temperature`: `wrapper-under-temperature` = "wrapper-under-temperature".asInstanceOf[`wrapper-under-temperature`]
  @scala.inline
  def `wrapper-unrecoverable-failure`: `wrapper-unrecoverable-failure` = "wrapper-unrecoverable-failure".asInstanceOf[`wrapper-unrecoverable-failure`]
  @scala.inline
  def `wrapper-unrecoverable-storage-error`: `wrapper-unrecoverable-storage-error` = "wrapper-unrecoverable-storage-error".asInstanceOf[`wrapper-unrecoverable-storage-error`]
  @scala.inline
  def `wrapper-warming-up`: `wrapper-warming-up` = "wrapper-warming-up".asInstanceOf[`wrapper-warming-up`]
  @scala.inline
  def ws: ws = "ws".asInstanceOf[ws]
  @scala.inline
  def wss: wss = "wss".asInstanceOf[wss]
  @scala.inline
  def wtai: wtai = "wtai".asInstanceOf[wtai]
  @scala.inline
  def wyciwyg: wyciwyg = "wyciwyg".asInstanceOf[wyciwyg]
  @scala.inline
  def `x-Chinese-CNS`: `x-Chinese-CNS` = "x-Chinese-CNS".asInstanceOf[`x-Chinese-CNS`]
  @scala.inline
  def `x-Chinese-Eten`: `x-Chinese-Eten` = "x-Chinese-Eten".asInstanceOf[`x-Chinese-Eten`]
  @scala.inline
  def `x-EBCDIC-Arabic`: `x-EBCDIC-Arabic` = "x-EBCDIC-Arabic".asInstanceOf[`x-EBCDIC-Arabic`]
  @scala.inline
  def `x-EBCDIC-CyrillicRussian`: `x-EBCDIC-CyrillicRussian` = "x-EBCDIC-CyrillicRussian".asInstanceOf[`x-EBCDIC-CyrillicRussian`]
  @scala.inline
  def `x-EBCDIC-CyrillicSerbianBulgarian`: `x-EBCDIC-CyrillicSerbianBulgarian` = "x-EBCDIC-CyrillicSerbianBulgarian".asInstanceOf[`x-EBCDIC-CyrillicSerbianBulgarian`]
  @scala.inline
  def `x-EBCDIC-DenmarkNorway`: `x-EBCDIC-DenmarkNorway` = "x-EBCDIC-DenmarkNorway".asInstanceOf[`x-EBCDIC-DenmarkNorway`]
  @scala.inline
  def `x-EBCDIC-FinlandSweden`: `x-EBCDIC-FinlandSweden` = "x-EBCDIC-FinlandSweden".asInstanceOf[`x-EBCDIC-FinlandSweden`]
  @scala.inline
  def `x-EBCDIC-Germany`: `x-EBCDIC-Germany` = "x-EBCDIC-Germany".asInstanceOf[`x-EBCDIC-Germany`]
  @scala.inline
  def `x-EBCDIC-Greek`: `x-EBCDIC-Greek` = "x-EBCDIC-Greek".asInstanceOf[`x-EBCDIC-Greek`]
  @scala.inline
  def `x-EBCDIC-GreekModern`: `x-EBCDIC-GreekModern` = "x-EBCDIC-GreekModern".asInstanceOf[`x-EBCDIC-GreekModern`]
  @scala.inline
  def `x-EBCDIC-Hebrew`: `x-EBCDIC-Hebrew` = "x-EBCDIC-Hebrew".asInstanceOf[`x-EBCDIC-Hebrew`]
  @scala.inline
  def `x-EBCDIC-Icelandic`: `x-EBCDIC-Icelandic` = "x-EBCDIC-Icelandic".asInstanceOf[`x-EBCDIC-Icelandic`]
  @scala.inline
  def `x-EBCDIC-Italy`: `x-EBCDIC-Italy` = "x-EBCDIC-Italy".asInstanceOf[`x-EBCDIC-Italy`]
  @scala.inline
  def `x-EBCDIC-JapaneseAndJapaneseLatin`: `x-EBCDIC-JapaneseAndJapaneseLatin` = "x-EBCDIC-JapaneseAndJapaneseLatin".asInstanceOf[`x-EBCDIC-JapaneseAndJapaneseLatin`]
  @scala.inline
  def `x-EBCDIC-JapaneseAndKana`: `x-EBCDIC-JapaneseAndKana` = "x-EBCDIC-JapaneseAndKana".asInstanceOf[`x-EBCDIC-JapaneseAndKana`]
  @scala.inline
  def `x-EBCDIC-JapaneseAndUSCanada`: `x-EBCDIC-JapaneseAndUSCanada` = "x-EBCDIC-JapaneseAndUSCanada".asInstanceOf[`x-EBCDIC-JapaneseAndUSCanada`]
  @scala.inline
  def `x-EBCDIC-JapaneseKatakana`: `x-EBCDIC-JapaneseKatakana` = "x-EBCDIC-JapaneseKatakana".asInstanceOf[`x-EBCDIC-JapaneseKatakana`]
  @scala.inline
  def `x-EBCDIC-KoreanAndKoreanExtended`: `x-EBCDIC-KoreanAndKoreanExtended` = "x-EBCDIC-KoreanAndKoreanExtended".asInstanceOf[`x-EBCDIC-KoreanAndKoreanExtended`]
  @scala.inline
  def `x-EBCDIC-KoreanExtended`: `x-EBCDIC-KoreanExtended` = "x-EBCDIC-KoreanExtended".asInstanceOf[`x-EBCDIC-KoreanExtended`]
  @scala.inline
  def `x-EBCDIC-SimplifiedChinese`: `x-EBCDIC-SimplifiedChinese` = "x-EBCDIC-SimplifiedChinese".asInstanceOf[`x-EBCDIC-SimplifiedChinese`]
  @scala.inline
  def `x-EBCDIC-Thai`: `x-EBCDIC-Thai` = "x-EBCDIC-Thai".asInstanceOf[`x-EBCDIC-Thai`]
  @scala.inline
  def `x-EBCDIC-TraditionalChinese`: `x-EBCDIC-TraditionalChinese` = "x-EBCDIC-TraditionalChinese".asInstanceOf[`x-EBCDIC-TraditionalChinese`]
  @scala.inline
  def `x-EBCDIC-Turkish`: `x-EBCDIC-Turkish` = "x-EBCDIC-Turkish".asInstanceOf[`x-EBCDIC-Turkish`]
  @scala.inline
  def `x-EBCDIC-UK`: `x-EBCDIC-UK` = "x-EBCDIC-UK".asInstanceOf[`x-EBCDIC-UK`]
  @scala.inline
  def `x-Europa`: `x-Europa` = "x-Europa".asInstanceOf[`x-Europa`]
  @scala.inline
  def `x-IA5`: `x-IA5` = "x-IA5".asInstanceOf[`x-IA5`]
  @scala.inline
  def `x-IA5-German`: `x-IA5-German` = "x-IA5-German".asInstanceOf[`x-IA5-German`]
  @scala.inline
  def `x-IA5-Norwegian`: `x-IA5-Norwegian` = "x-IA5-Norwegian".asInstanceOf[`x-IA5-Norwegian`]
  @scala.inline
  def `x-IA5-Swedish`: `x-IA5-Swedish` = "x-IA5-Swedish".asInstanceOf[`x-IA5-Swedish`]
  @scala.inline
  def `x-direction`: `x-direction` = "x-direction".asInstanceOf[`x-direction`]
  @scala.inline
  def `x-ebcdic-cp-us-euro`: `x-ebcdic-cp-us-euro` = "x-ebcdic-cp-us-euro".asInstanceOf[`x-ebcdic-cp-us-euro`]
  @scala.inline
  def `x-ebcdic-denmarknorway-euro`: `x-ebcdic-denmarknorway-euro` = "x-ebcdic-denmarknorway-euro".asInstanceOf[`x-ebcdic-denmarknorway-euro`]
  @scala.inline
  def `x-ebcdic-finlandsweden-euro`: `x-ebcdic-finlandsweden-euro` = "x-ebcdic-finlandsweden-euro".asInstanceOf[`x-ebcdic-finlandsweden-euro`]
  @scala.inline
  def `x-ebcdic-france-euro`: `x-ebcdic-france-euro` = "x-ebcdic-france-euro".asInstanceOf[`x-ebcdic-france-euro`]
  @scala.inline
  def `x-ebcdic-germany-euro`: `x-ebcdic-germany-euro` = "x-ebcdic-germany-euro".asInstanceOf[`x-ebcdic-germany-euro`]
  @scala.inline
  def `x-ebcdic-icelandic-euro`: `x-ebcdic-icelandic-euro` = "x-ebcdic-icelandic-euro".asInstanceOf[`x-ebcdic-icelandic-euro`]
  @scala.inline
  def `x-ebcdic-international-euro`: `x-ebcdic-international-euro` = "x-ebcdic-international-euro".asInstanceOf[`x-ebcdic-international-euro`]
  @scala.inline
  def `x-ebcdic-italy-euro`: `x-ebcdic-italy-euro` = "x-ebcdic-italy-euro".asInstanceOf[`x-ebcdic-italy-euro`]
  @scala.inline
  def `x-ebcdic-spain-euro`: `x-ebcdic-spain-euro` = "x-ebcdic-spain-euro".asInstanceOf[`x-ebcdic-spain-euro`]
  @scala.inline
  def `x-ebcdic-uk-euro`: `x-ebcdic-uk-euro` = "x-ebcdic-uk-euro".asInstanceOf[`x-ebcdic-uk-euro`]
  @scala.inline
  def `x-euc-jp`: `x-euc-jp` = "x-euc-jp".asInstanceOf[`x-euc-jp`]
  @scala.inline
  def `x-image-position`: `x-image-position` = "x-image-position".asInstanceOf[`x-image-position`]
  @scala.inline
  def `x-image-position-actual`: `x-image-position-actual` = "x-image-position-actual".asInstanceOf[`x-image-position-actual`]
  @scala.inline
  def `x-image-position-default`: `x-image-position-default` = "x-image-position-default".asInstanceOf[`x-image-position-default`]
  @scala.inline
  def `x-image-position-supported`: `x-image-position-supported` = "x-image-position-supported".asInstanceOf[`x-image-position-supported`]
  @scala.inline
  def `x-image-shift`: `x-image-shift` = "x-image-shift".asInstanceOf[`x-image-shift`]
  @scala.inline
  def `x-image-shift-actual`: `x-image-shift-actual` = "x-image-shift-actual".asInstanceOf[`x-image-shift-actual`]
  @scala.inline
  def `x-image-shift-default`: `x-image-shift-default` = "x-image-shift-default".asInstanceOf[`x-image-shift-default`]
  @scala.inline
  def `x-image-shift-supported`: `x-image-shift-supported` = "x-image-shift-supported".asInstanceOf[`x-image-shift-supported`]
  @scala.inline
  def `x-iscii-as`: `x-iscii-as` = "x-iscii-as".asInstanceOf[`x-iscii-as`]
  @scala.inline
  def `x-iscii-be`: `x-iscii-be` = "x-iscii-be".asInstanceOf[`x-iscii-be`]
  @scala.inline
  def `x-iscii-de`: `x-iscii-de` = "x-iscii-de".asInstanceOf[`x-iscii-de`]
  @scala.inline
  def `x-iscii-gu`: `x-iscii-gu` = "x-iscii-gu".asInstanceOf[`x-iscii-gu`]
  @scala.inline
  def `x-iscii-ka`: `x-iscii-ka` = "x-iscii-ka".asInstanceOf[`x-iscii-ka`]
  @scala.inline
  def `x-iscii-ma`: `x-iscii-ma` = "x-iscii-ma".asInstanceOf[`x-iscii-ma`]
  @scala.inline
  def `x-iscii-or`: `x-iscii-or` = "x-iscii-or".asInstanceOf[`x-iscii-or`]
  @scala.inline
  def `x-iscii-pa`: `x-iscii-pa` = "x-iscii-pa".asInstanceOf[`x-iscii-pa`]
  @scala.inline
  def `x-iscii-ta`: `x-iscii-ta` = "x-iscii-ta".asInstanceOf[`x-iscii-ta`]
  @scala.inline
  def `x-iscii-te`: `x-iscii-te` = "x-iscii-te".asInstanceOf[`x-iscii-te`]
  @scala.inline
  def `x-mac-arabic`: `x-mac-arabic` = "x-mac-arabic".asInstanceOf[`x-mac-arabic`]
  @scala.inline
  def `x-mac-ce`: `x-mac-ce` = "x-mac-ce".asInstanceOf[`x-mac-ce`]
  @scala.inline
  def `x-mac-chinesesimp`: `x-mac-chinesesimp` = "x-mac-chinesesimp".asInstanceOf[`x-mac-chinesesimp`]
  @scala.inline
  def `x-mac-cyrillic`: `x-mac-cyrillic` = "x-mac-cyrillic".asInstanceOf[`x-mac-cyrillic`]
  @scala.inline
  def `x-mac-greek`: `x-mac-greek` = "x-mac-greek".asInstanceOf[`x-mac-greek`]
  @scala.inline
  def `x-mac-hebrew`: `x-mac-hebrew` = "x-mac-hebrew".asInstanceOf[`x-mac-hebrew`]
  @scala.inline
  def `x-mac-icelandic`: `x-mac-icelandic` = "x-mac-icelandic".asInstanceOf[`x-mac-icelandic`]
  @scala.inline
  def `x-mac-japanese`: `x-mac-japanese` = "x-mac-japanese".asInstanceOf[`x-mac-japanese`]
  @scala.inline
  def `x-mac-korean`: `x-mac-korean` = "x-mac-korean".asInstanceOf[`x-mac-korean`]
  @scala.inline
  def `x-mac-turkish`: `x-mac-turkish` = "x-mac-turkish".asInstanceOf[`x-mac-turkish`]
  @scala.inline
  def `x-side1-image-shift`: `x-side1-image-shift` = "x-side1-image-shift".asInstanceOf[`x-side1-image-shift`]
  @scala.inline
  def `x-side1-image-shift-actual`: `x-side1-image-shift-actual` = "x-side1-image-shift-actual".asInstanceOf[`x-side1-image-shift-actual`]
  @scala.inline
  def `x-side1-image-shift-default`: `x-side1-image-shift-default` = "x-side1-image-shift-default".asInstanceOf[`x-side1-image-shift-default`]
  @scala.inline
  def `x-side1-image-shift-supported`: `x-side1-image-shift-supported` = "x-side1-image-shift-supported".asInstanceOf[`x-side1-image-shift-supported`]
  @scala.inline
  def `x-side2-image-shift`: `x-side2-image-shift` = "x-side2-image-shift".asInstanceOf[`x-side2-image-shift`]
  @scala.inline
  def `x-side2-image-shift-actual`: `x-side2-image-shift-actual` = "x-side2-image-shift-actual".asInstanceOf[`x-side2-image-shift-actual`]
  @scala.inline
  def `x-side2-image-shift-default`: `x-side2-image-shift-default` = "x-side2-image-shift-default".asInstanceOf[`x-side2-image-shift-default`]
  @scala.inline
  def `x-side2-image-shift-supported`: `x-side2-image-shift-supported` = "x-side2-image-shift-supported".asInstanceOf[`x-side2-image-shift-supported`]
  @scala.inline
  def xcon: xcon = "xcon".asInstanceOf[xcon]
  @scala.inline
  def `xcon-userid`: `xcon-userid` = "xcon-userid".asInstanceOf[`xcon-userid`]
  @scala.inline
  def xfire: xfire = "xfire".asInstanceOf[xfire]
  @scala.inline
  def xmldsig: xmldsig = "xmldsig".asInstanceOf[xmldsig]
  @scala.inline
  def xmlrpcDotbeep: xmlrpcDotbeep = "xmlrpc.beep".asInstanceOf[xmlrpcDotbeep]
  @scala.inline
  def xmlrpcDotbeeps: xmlrpcDotbeeps = "xmlrpc.beeps".asInstanceOf[xmlrpcDotbeeps]
  @scala.inline
  def xmpp: xmpp = "xmpp".asInstanceOf[xmpp]
  @scala.inline
  def xri: xri = "xri".asInstanceOf[xri]
  @scala.inline
  def `y-direction`: `y-direction` = "y-direction".asInstanceOf[`y-direction`]
  @scala.inline
  def `y-image-position`: `y-image-position` = "y-image-position".asInstanceOf[`y-image-position`]
  @scala.inline
  def `y-image-position-actual`: `y-image-position-actual` = "y-image-position-actual".asInstanceOf[`y-image-position-actual`]
  @scala.inline
  def `y-image-position-default`: `y-image-position-default` = "y-image-position-default".asInstanceOf[`y-image-position-default`]
  @scala.inline
  def `y-image-position-supported`: `y-image-position-supported` = "y-image-position-supported".asInstanceOf[`y-image-position-supported`]
  @scala.inline
  def `y-image-shift`: `y-image-shift` = "y-image-shift".asInstanceOf[`y-image-shift`]
  @scala.inline
  def `y-image-shift-actual`: `y-image-shift-actual` = "y-image-shift-actual".asInstanceOf[`y-image-shift-actual`]
  @scala.inline
  def `y-image-shift-default`: `y-image-shift-default` = "y-image-shift-default".asInstanceOf[`y-image-shift-default`]
  @scala.inline
  def `y-image-shift-supported`: `y-image-shift-supported` = "y-image-shift-supported".asInstanceOf[`y-image-shift-supported`]
  @scala.inline
  def `y-side1-image-shift`: `y-side1-image-shift` = "y-side1-image-shift".asInstanceOf[`y-side1-image-shift`]
  @scala.inline
  def `y-side1-image-shift-actual`: `y-side1-image-shift-actual` = "y-side1-image-shift-actual".asInstanceOf[`y-side1-image-shift-actual`]
  @scala.inline
  def `y-side1-image-shift-default`: `y-side1-image-shift-default` = "y-side1-image-shift-default".asInstanceOf[`y-side1-image-shift-default`]
  @scala.inline
  def `y-side1-image-shift-supported`: `y-side1-image-shift-supported` = "y-side1-image-shift-supported".asInstanceOf[`y-side1-image-shift-supported`]
  @scala.inline
  def `y-side2-image-shift`: `y-side2-image-shift` = "y-side2-image-shift".asInstanceOf[`y-side2-image-shift`]
  @scala.inline
  def `y-side2-image-shift-actual`: `y-side2-image-shift-actual` = "y-side2-image-shift-actual".asInstanceOf[`y-side2-image-shift-actual`]
  @scala.inline
  def `y-side2-image-shift-default`: `y-side2-image-shift-default` = "y-side2-image-shift-default".asInstanceOf[`y-side2-image-shift-default`]
  @scala.inline
  def `y-side2-image-shift-supported`: `y-side2-image-shift-supported` = "y-side2-image-shift-supported".asInstanceOf[`y-side2-image-shift-supported`]
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  @scala.inline
  def ymsgr: ymsgr = "ymsgr".asInstanceOf[ymsgr]
  @scala.inline
  def z39Dot50: z39Dot50 = "z39.50".asInstanceOf[z39Dot50]
  @scala.inline
  def z39Dot50r: z39Dot50r = "z39.50r".asInstanceOf[z39Dot50r]
  @scala.inline
  def z39Dot50s: z39Dot50s = "z39.50s".asInstanceOf[z39Dot50s]
}

