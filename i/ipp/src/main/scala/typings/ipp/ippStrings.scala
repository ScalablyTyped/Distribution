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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ippStrings {
  
  @js.native
  sealed trait default
    extends Media
       with MediaName
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `1-to-n-order` extends PageOrder
  @scala.inline
  def `1-to-n-order`: `1-to-n-order` = "1-to-n-order".asInstanceOf[`1-to-n-order`]
  
  @js.native
  sealed trait `1Dot0` extends IPPVersion
  @scala.inline
  def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait `1Dot1` extends IPPVersion
  @scala.inline
  def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  
  @js.native
  sealed trait `2Dot0` extends IPPVersion
  @scala.inline
  def `2Dot0`: `2Dot0` = "2.0".asInstanceOf[`2Dot0`]
  
  @js.native
  sealed trait `2Dot1` extends IPPVersion
  @scala.inline
  def `2Dot1`: `2Dot1` = "2.1".asInstanceOf[`2Dot1`]
  
  @js.native
  sealed trait `2Dot2` extends IPPVersion
  @scala.inline
  def `2Dot2`: `2Dot2` = "2.2".asInstanceOf[`2Dot2`]
  
  @js.native
  sealed trait `ASMO-708` extends CharacterSet
  @scala.inline
  def `ASMO-708`: `ASMO-708` = "ASMO-708".asInstanceOf[`ASMO-708`]
  
  @js.native
  sealed trait `Acknowledge-Document` extends PrinterOpertaion
  @scala.inline
  def `Acknowledge-Document`: `Acknowledge-Document` = "Acknowledge-Document".asInstanceOf[`Acknowledge-Document`]
  
  @js.native
  sealed trait `Acknowledge-Identify-Printer` extends PrinterOpertaion
  @scala.inline
  def `Acknowledge-Identify-Printer`: `Acknowledge-Identify-Printer` = "Acknowledge-Identify-Printer".asInstanceOf[`Acknowledge-Identify-Printer`]
  
  @js.native
  sealed trait `Acknowledge-Job` extends PrinterOpertaion
  @scala.inline
  def `Acknowledge-Job`: `Acknowledge-Job` = "Acknowledge-Job".asInstanceOf[`Acknowledge-Job`]
  
  @js.native
  sealed trait `Activate-Printer` extends PrinterOpertaion
  @scala.inline
  def `Activate-Printer`: `Activate-Printer` = "Activate-Printer".asInstanceOf[`Activate-Printer`]
  
  @js.native
  sealed trait `Add-Document-Images` extends PrinterOpertaion
  @scala.inline
  def `Add-Document-Images`: `Add-Document-Images` = "Add-Document-Images".asInstanceOf[`Add-Document-Images`]
  
  @js.native
  sealed trait `Allocate-Printer-Resources` extends PrinterOpertaion
  @scala.inline
  def `Allocate-Printer-Resources`: `Allocate-Printer-Resources` = "Allocate-Printer-Resources".asInstanceOf[`Allocate-Printer-Resources`]
  
  @js.native
  sealed trait CP1026 extends CharacterSet
  @scala.inline
  def CP1026: CP1026 = "CP1026".asInstanceOf[CP1026]
  
  @js.native
  sealed trait CP870 extends CharacterSet
  @scala.inline
  def CP870: CP870 = "CP870".asInstanceOf[CP870]
  
  @js.native
  sealed trait `Cancel-Current-Job` extends PrinterOpertaion
  @scala.inline
  def `Cancel-Current-Job`: `Cancel-Current-Job` = "Cancel-Current-Job".asInstanceOf[`Cancel-Current-Job`]
  
  @js.native
  sealed trait `Cancel-Document` extends PrinterOpertaion
  @scala.inline
  def `Cancel-Document`: `Cancel-Document` = "Cancel-Document".asInstanceOf[`Cancel-Document`]
  
  @js.native
  sealed trait `Cancel-Job` extends PrinterOpertaion
  @scala.inline
  def `Cancel-Job`: `Cancel-Job` = "Cancel-Job".asInstanceOf[`Cancel-Job`]
  
  @js.native
  sealed trait `Cancel-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Cancel-Jobs`: `Cancel-Jobs` = "Cancel-Jobs".asInstanceOf[`Cancel-Jobs`]
  
  @js.native
  sealed trait `Cancel-My-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Cancel-My-Jobs`: `Cancel-My-Jobs` = "Cancel-My-Jobs".asInstanceOf[`Cancel-My-Jobs`]
  
  @js.native
  sealed trait `Cancel-Resource` extends PrinterOpertaion
  @scala.inline
  def `Cancel-Resource`: `Cancel-Resource` = "Cancel-Resource".asInstanceOf[`Cancel-Resource`]
  
  @js.native
  sealed trait `Cancel-Subscription` extends PrinterOpertaion
  @scala.inline
  def `Cancel-Subscription`: `Cancel-Subscription` = "Cancel-Subscription".asInstanceOf[`Cancel-Subscription`]
  
  @js.native
  sealed trait `Close-Job` extends PrinterOpertaion
  @scala.inline
  def `Close-Job`: `Close-Job` = "Close-Job".asInstanceOf[`Close-Job`]
  
  @js.native
  sealed trait `Create-Job` extends PrinterOpertaion
  @scala.inline
  def `Create-Job`: `Create-Job` = "Create-Job".asInstanceOf[`Create-Job`]
  
  @js.native
  sealed trait `Create-Job-Subscriptions` extends PrinterOpertaion
  @scala.inline
  def `Create-Job-Subscriptions`: `Create-Job-Subscriptions` = "Create-Job-Subscriptions".asInstanceOf[`Create-Job-Subscriptions`]
  
  @js.native
  sealed trait `Create-Printer` extends PrinterOpertaion
  @scala.inline
  def `Create-Printer`: `Create-Printer` = "Create-Printer".asInstanceOf[`Create-Printer`]
  
  @js.native
  sealed trait `Create-Printer-Subscriptions` extends PrinterOpertaion
  @scala.inline
  def `Create-Printer-Subscriptions`: `Create-Printer-Subscriptions` = "Create-Printer-Subscriptions".asInstanceOf[`Create-Printer-Subscriptions`]
  
  @js.native
  sealed trait `Create-Resource` extends PrinterOpertaion
  @scala.inline
  def `Create-Resource`: `Create-Resource` = "Create-Resource".asInstanceOf[`Create-Resource`]
  
  @js.native
  sealed trait `Create-Resource-Subscriptions` extends PrinterOpertaion
  @scala.inline
  def `Create-Resource-Subscriptions`: `Create-Resource-Subscriptions` = "Create-Resource-Subscriptions".asInstanceOf[`Create-Resource-Subscriptions`]
  
  @js.native
  sealed trait `Create-System-Subscriptions` extends PrinterOpertaion
  @scala.inline
  def `Create-System-Subscriptions`: `Create-System-Subscriptions` = "Create-System-Subscriptions".asInstanceOf[`Create-System-Subscriptions`]
  
  @js.native
  sealed trait `DOS-720` extends CharacterSet
  @scala.inline
  def `DOS-720`: `DOS-720` = "DOS-720".asInstanceOf[`DOS-720`]
  
  @js.native
  sealed trait `DOS-862` extends CharacterSet
  @scala.inline
  def `DOS-862`: `DOS-862` = "DOS-862".asInstanceOf[`DOS-862`]
  
  @js.native
  sealed trait `Deactivate-Printer` extends PrinterOpertaion
  @scala.inline
  def `Deactivate-Printer`: `Deactivate-Printer` = "Deactivate-Printer".asInstanceOf[`Deactivate-Printer`]
  
  @js.native
  sealed trait `Deallocate-Printer-Resources` extends PrinterOpertaion
  @scala.inline
  def `Deallocate-Printer-Resources`: `Deallocate-Printer-Resources` = "Deallocate-Printer-Resources".asInstanceOf[`Deallocate-Printer-Resources`]
  
  @js.native
  sealed trait `Delete-Document` extends PrinterOpertaion
  @scala.inline
  def `Delete-Document`: `Delete-Document` = "Delete-Document".asInstanceOf[`Delete-Document`]
  
  @js.native
  sealed trait `Delete-Printer` extends PrinterOpertaion
  @scala.inline
  def `Delete-Printer`: `Delete-Printer` = "Delete-Printer".asInstanceOf[`Delete-Printer`]
  
  @js.native
  sealed trait `Deregister-Output-Device` extends PrinterOpertaion
  @scala.inline
  def `Deregister-Output-Device`: `Deregister-Output-Device` = "Deregister-Output-Device".asInstanceOf[`Deregister-Output-Device`]
  
  @js.native
  sealed trait `Disable-All-Printers` extends PrinterOpertaion
  @scala.inline
  def `Disable-All-Printers`: `Disable-All-Printers` = "Disable-All-Printers".asInstanceOf[`Disable-All-Printers`]
  
  @js.native
  sealed trait `Disable-Printer` extends PrinterOpertaion
  @scala.inline
  def `Disable-Printer`: `Disable-Printer` = "Disable-Printer".asInstanceOf[`Disable-Printer`]
  
  @js.native
  sealed trait `EUC-CN` extends CharacterSet
  @scala.inline
  def `EUC-CN`: `EUC-CN` = "EUC-CN".asInstanceOf[`EUC-CN`]
  
  @js.native
  sealed trait `Enable-All-Printers` extends PrinterOpertaion
  @scala.inline
  def `Enable-All-Printers`: `Enable-All-Printers` = "Enable-All-Printers".asInstanceOf[`Enable-All-Printers`]
  
  @js.native
  sealed trait `Enable-Printer` extends PrinterOpertaion
  @scala.inline
  def `Enable-Printer`: `Enable-Printer` = "Enable-Printer".asInstanceOf[`Enable-Printer`]
  
  @js.native
  sealed trait `Fetch-Document` extends PrinterOpertaion
  @scala.inline
  def `Fetch-Document`: `Fetch-Document` = "Fetch-Document".asInstanceOf[`Fetch-Document`]
  
  @js.native
  sealed trait `Fetch-Job` extends PrinterOpertaion
  @scala.inline
  def `Fetch-Job`: `Fetch-Job` = "Fetch-Job".asInstanceOf[`Fetch-Job`]
  
  @js.native
  sealed trait `Get-Document-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-Document-Attributes`: `Get-Document-Attributes` = "Get-Document-Attributes".asInstanceOf[`Get-Document-Attributes`]
  
  @js.native
  sealed trait `Get-Documents` extends PrinterOpertaion
  @scala.inline
  def `Get-Documents`: `Get-Documents` = "Get-Documents".asInstanceOf[`Get-Documents`]
  
  @js.native
  sealed trait `Get-Job-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-Job-Attributes`: `Get-Job-Attributes` = "Get-Job-Attributes".asInstanceOf[`Get-Job-Attributes`]
  
  @js.native
  sealed trait `Get-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Get-Jobs`: `Get-Jobs` = "Get-Jobs".asInstanceOf[`Get-Jobs`]
  
  @js.native
  sealed trait `Get-Next-Document-Data` extends PrinterOpertaion
  @scala.inline
  def `Get-Next-Document-Data`: `Get-Next-Document-Data` = "Get-Next-Document-Data".asInstanceOf[`Get-Next-Document-Data`]
  
  @js.native
  sealed trait `Get-Notifications` extends PrinterOpertaion
  @scala.inline
  def `Get-Notifications`: `Get-Notifications` = "Get-Notifications".asInstanceOf[`Get-Notifications`]
  
  @js.native
  sealed trait `Get-Output-Device-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-Output-Device-Attributes`: `Get-Output-Device-Attributes` = "Get-Output-Device-Attributes".asInstanceOf[`Get-Output-Device-Attributes`]
  
  @js.native
  sealed trait `Get-Printer-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-Printer-Attributes`: `Get-Printer-Attributes` = "Get-Printer-Attributes".asInstanceOf[`Get-Printer-Attributes`]
  
  @js.native
  sealed trait `Get-Printer-Resources` extends PrinterOpertaion
  @scala.inline
  def `Get-Printer-Resources`: `Get-Printer-Resources` = "Get-Printer-Resources".asInstanceOf[`Get-Printer-Resources`]
  
  @js.native
  sealed trait `Get-Printer-Supported-Values` extends PrinterOpertaion
  @scala.inline
  def `Get-Printer-Supported-Values`: `Get-Printer-Supported-Values` = "Get-Printer-Supported-Values".asInstanceOf[`Get-Printer-Supported-Values`]
  
  @js.native
  sealed trait `Get-Printers` extends PrinterOpertaion
  @scala.inline
  def `Get-Printers`: `Get-Printers` = "Get-Printers".asInstanceOf[`Get-Printers`]
  
  @js.native
  sealed trait `Get-Resource-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-Resource-Attributes`: `Get-Resource-Attributes` = "Get-Resource-Attributes".asInstanceOf[`Get-Resource-Attributes`]
  
  @js.native
  sealed trait `Get-Resources` extends PrinterOpertaion
  @scala.inline
  def `Get-Resources`: `Get-Resources` = "Get-Resources".asInstanceOf[`Get-Resources`]
  
  @js.native
  sealed trait `Get-Subscription-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-Subscription-Attributes`: `Get-Subscription-Attributes` = "Get-Subscription-Attributes".asInstanceOf[`Get-Subscription-Attributes`]
  
  @js.native
  sealed trait `Get-Subscriptions` extends PrinterOpertaion
  @scala.inline
  def `Get-Subscriptions`: `Get-Subscriptions` = "Get-Subscriptions".asInstanceOf[`Get-Subscriptions`]
  
  @js.native
  sealed trait `Get-System-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-System-Attributes`: `Get-System-Attributes` = "Get-System-Attributes".asInstanceOf[`Get-System-Attributes`]
  
  @js.native
  sealed trait `Get-System-Supported-Values` extends PrinterOpertaion
  @scala.inline
  def `Get-System-Supported-Values`: `Get-System-Supported-Values` = "Get-System-Supported-Values".asInstanceOf[`Get-System-Supported-Values`]
  
  @js.native
  sealed trait `Get-User-Printer-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Get-User-Printer-Attributes`: `Get-User-Printer-Attributes` = "Get-User-Printer-Attributes".asInstanceOf[`Get-User-Printer-Attributes`]
  
  @js.native
  sealed trait `Hold-Job` extends PrinterOpertaion
  @scala.inline
  def `Hold-Job`: `Hold-Job` = "Hold-Job".asInstanceOf[`Hold-Job`]
  
  @js.native
  sealed trait `Hold-New-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Hold-New-Jobs`: `Hold-New-Jobs` = "Hold-New-Jobs".asInstanceOf[`Hold-New-Jobs`]
  
  @js.native
  sealed trait IBM437 extends CharacterSet
  @scala.inline
  def IBM437: IBM437 = "IBM437".asInstanceOf[IBM437]
  
  @js.native
  sealed trait `Identify-Printer` extends PrinterOpertaion
  @scala.inline
  def `Identify-Printer`: `Identify-Printer` = "Identify-Printer".asInstanceOf[`Identify-Printer`]
  
  @js.native
  sealed trait `Install-Resource` extends PrinterOpertaion
  @scala.inline
  def `Install-Resource`: `Install-Resource` = "Install-Resource".asInstanceOf[`Install-Resource`]
  
  @js.native
  sealed trait Johab extends CharacterSet
  @scala.inline
  def Johab: Johab = "Johab".asInstanceOf[Johab]
  
  @js.native
  sealed trait `Pause-All-Printers` extends PrinterOpertaion
  @scala.inline
  def `Pause-All-Printers`: `Pause-All-Printers` = "Pause-All-Printers".asInstanceOf[`Pause-All-Printers`]
  
  @js.native
  sealed trait `Pause-All-Printers-After-Current-Job` extends PrinterOpertaion
  @scala.inline
  def `Pause-All-Printers-After-Current-Job`: `Pause-All-Printers-After-Current-Job` = "Pause-All-Printers-After-Current-Job".asInstanceOf[`Pause-All-Printers-After-Current-Job`]
  
  @js.native
  sealed trait `Pause-Printer` extends PrinterOpertaion
  @scala.inline
  def `Pause-Printer`: `Pause-Printer` = "Pause-Printer".asInstanceOf[`Pause-Printer`]
  
  @js.native
  sealed trait `Pause-Printer-After-Current-Job` extends PrinterOpertaion
  @scala.inline
  def `Pause-Printer-After-Current-Job`: `Pause-Printer-After-Current-Job` = "Pause-Printer-After-Current-Job".asInstanceOf[`Pause-Printer-After-Current-Job`]
  
  @js.native
  sealed trait `Print-Job` extends PrinterOpertaion
  @scala.inline
  def `Print-Job`: `Print-Job` = "Print-Job".asInstanceOf[`Print-Job`]
  
  @js.native
  sealed trait `Print-URI` extends PrinterOpertaion
  @scala.inline
  def `Print-URI`: `Print-URI` = "Print-URI".asInstanceOf[`Print-URI`]
  
  @js.native
  sealed trait `Promote-Job` extends PrinterOpertaion
  @scala.inline
  def `Promote-Job`: `Promote-Job` = "Promote-Job".asInstanceOf[`Promote-Job`]
  
  @js.native
  sealed trait `Purge-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Purge-Jobs`: `Purge-Jobs` = "Purge-Jobs".asInstanceOf[`Purge-Jobs`]
  
  @js.native
  sealed trait `Register-Output-Device` extends PrinterOpertaion
  @scala.inline
  def `Register-Output-Device`: `Register-Output-Device` = "Register-Output-Device".asInstanceOf[`Register-Output-Device`]
  
  @js.native
  sealed trait `Release-Held-New-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Release-Held-New-Jobs`: `Release-Held-New-Jobs` = "Release-Held-New-Jobs".asInstanceOf[`Release-Held-New-Jobs`]
  
  @js.native
  sealed trait `Release-Job` extends PrinterOpertaion
  @scala.inline
  def `Release-Job`: `Release-Job` = "Release-Job".asInstanceOf[`Release-Job`]
  
  @js.native
  sealed trait `Renew-Subscription` extends PrinterOpertaion
  @scala.inline
  def `Renew-Subscription`: `Renew-Subscription` = "Renew-Subscription".asInstanceOf[`Renew-Subscription`]
  
  @js.native
  sealed trait `Reprocess-Job` extends PrinterOpertaion
  @scala.inline
  def `Reprocess-Job`: `Reprocess-Job` = "Reprocess-Job".asInstanceOf[`Reprocess-Job`]
  
  @js.native
  sealed trait `Restart-Job` extends PrinterOpertaion
  @scala.inline
  def `Restart-Job`: `Restart-Job` = "Restart-Job".asInstanceOf[`Restart-Job`]
  
  @js.native
  sealed trait `Restart-One-Printer` extends PrinterOpertaion
  @scala.inline
  def `Restart-One-Printer`: `Restart-One-Printer` = "Restart-One-Printer".asInstanceOf[`Restart-One-Printer`]
  
  @js.native
  sealed trait `Restart-Printer` extends PrinterOpertaion
  @scala.inline
  def `Restart-Printer`: `Restart-Printer` = "Restart-Printer".asInstanceOf[`Restart-Printer`]
  
  @js.native
  sealed trait `Restart-System` extends PrinterOpertaion
  @scala.inline
  def `Restart-System`: `Restart-System` = "Restart-System".asInstanceOf[`Restart-System`]
  
  @js.native
  sealed trait `Resubmit-Job` extends PrinterOpertaion
  @scala.inline
  def `Resubmit-Job`: `Resubmit-Job` = "Resubmit-Job".asInstanceOf[`Resubmit-Job`]
  
  @js.native
  sealed trait `Resume-All-Printers` extends PrinterOpertaion
  @scala.inline
  def `Resume-All-Printers`: `Resume-All-Printers` = "Resume-All-Printers".asInstanceOf[`Resume-All-Printers`]
  
  @js.native
  sealed trait `Resume-Job` extends PrinterOpertaion
  @scala.inline
  def `Resume-Job`: `Resume-Job` = "Resume-Job".asInstanceOf[`Resume-Job`]
  
  @js.native
  sealed trait `Resume-Printer` extends PrinterOpertaion
  @scala.inline
  def `Resume-Printer`: `Resume-Printer` = "Resume-Printer".asInstanceOf[`Resume-Printer`]
  
  @js.native
  sealed trait `Schedule-Job-After` extends PrinterOpertaion
  @scala.inline
  def `Schedule-Job-After`: `Schedule-Job-After` = "Schedule-Job-After".asInstanceOf[`Schedule-Job-After`]
  
  @js.native
  sealed trait `Send-Document` extends PrinterOpertaion
  @scala.inline
  def `Send-Document`: `Send-Document` = "Send-Document".asInstanceOf[`Send-Document`]
  
  @js.native
  sealed trait `Send-Resource-Data` extends PrinterOpertaion
  @scala.inline
  def `Send-Resource-Data`: `Send-Resource-Data` = "Send-Resource-Data".asInstanceOf[`Send-Resource-Data`]
  
  @js.native
  sealed trait `Send-URI` extends PrinterOpertaion
  @scala.inline
  def `Send-URI`: `Send-URI` = "Send-URI".asInstanceOf[`Send-URI`]
  
  @js.native
  sealed trait `Set-Document-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Set-Document-Attributes`: `Set-Document-Attributes` = "Set-Document-Attributes".asInstanceOf[`Set-Document-Attributes`]
  
  @js.native
  sealed trait `Set-Job-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Set-Job-Attributes`: `Set-Job-Attributes` = "Set-Job-Attributes".asInstanceOf[`Set-Job-Attributes`]
  
  @js.native
  sealed trait `Set-Printer-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Set-Printer-Attributes`: `Set-Printer-Attributes` = "Set-Printer-Attributes".asInstanceOf[`Set-Printer-Attributes`]
  
  @js.native
  sealed trait `Set-Resource-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Set-Resource-Attributes`: `Set-Resource-Attributes` = "Set-Resource-Attributes".asInstanceOf[`Set-Resource-Attributes`]
  
  @js.native
  sealed trait `Set-System-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Set-System-Attributes`: `Set-System-Attributes` = "Set-System-Attributes".asInstanceOf[`Set-System-Attributes`]
  
  @js.native
  sealed trait `Shutdown-All-Printers` extends PrinterOpertaion
  @scala.inline
  def `Shutdown-All-Printers`: `Shutdown-All-Printers` = "Shutdown-All-Printers".asInstanceOf[`Shutdown-All-Printers`]
  
  @js.native
  sealed trait `Shutdown-One-Printer` extends PrinterOpertaion
  @scala.inline
  def `Shutdown-One-Printer`: `Shutdown-One-Printer` = "Shutdown-One-Printer".asInstanceOf[`Shutdown-One-Printer`]
  
  @js.native
  sealed trait `Shutdown-Printer` extends PrinterOpertaion
  @scala.inline
  def `Shutdown-Printer`: `Shutdown-Printer` = "Shutdown-Printer".asInstanceOf[`Shutdown-Printer`]
  
  @js.native
  sealed trait `Startup-All-Printers` extends PrinterOpertaion
  @scala.inline
  def `Startup-All-Printers`: `Startup-All-Printers` = "Startup-All-Printers".asInstanceOf[`Startup-All-Printers`]
  
  @js.native
  sealed trait `Startup-One-Printer` extends PrinterOpertaion
  @scala.inline
  def `Startup-One-Printer`: `Startup-One-Printer` = "Startup-One-Printer".asInstanceOf[`Startup-One-Printer`]
  
  @js.native
  sealed trait `Startup-Printer` extends PrinterOpertaion
  @scala.inline
  def `Startup-Printer`: `Startup-Printer` = "Startup-Printer".asInstanceOf[`Startup-Printer`]
  
  @js.native
  sealed trait `Suspend-Current-Job` extends PrinterOpertaion
  @scala.inline
  def `Suspend-Current-Job`: `Suspend-Current-Job` = "Suspend-Current-Job".asInstanceOf[`Suspend-Current-Job`]
  
  @js.native
  sealed trait `Update-Active-Jobs` extends PrinterOpertaion
  @scala.inline
  def `Update-Active-Jobs`: `Update-Active-Jobs` = "Update-Active-Jobs".asInstanceOf[`Update-Active-Jobs`]
  
  @js.native
  sealed trait `Update-Document-Status` extends PrinterOpertaion
  @scala.inline
  def `Update-Document-Status`: `Update-Document-Status` = "Update-Document-Status".asInstanceOf[`Update-Document-Status`]
  
  @js.native
  sealed trait `Update-Job-Status` extends PrinterOpertaion
  @scala.inline
  def `Update-Job-Status`: `Update-Job-Status` = "Update-Job-Status".asInstanceOf[`Update-Job-Status`]
  
  @js.native
  sealed trait `Update-Output-Device-Attributes` extends PrinterOpertaion
  @scala.inline
  def `Update-Output-Device-Attributes`: `Update-Output-Device-Attributes` = "Update-Output-Device-Attributes".asInstanceOf[`Update-Output-Device-Attributes`]
  
  @js.native
  sealed trait `Validate-Document` extends PrinterOpertaion
  @scala.inline
  def `Validate-Document`: `Validate-Document` = "Validate-Document".asInstanceOf[`Validate-Document`]
  
  @js.native
  sealed trait `Validate-Job` extends PrinterOpertaion
  @scala.inline
  def `Validate-Job`: `Validate-Job` = "Validate-Job".asInstanceOf[`Validate-Job`]
  
  @js.native
  sealed trait Value extends PrinterOpertaion
  @scala.inline
  def Value: Value = "Value".asInstanceOf[Value]
  
  @js.native
  sealed trait `Windows-1252 ` extends CharacterSet
  @scala.inline
  def `Windows-1252 `: `Windows-1252 ` = ("Windows-1252 ").asInstanceOf[`Windows-1252 `]
  
  @js.native
  sealed trait `X-EBCDIC-Spain` extends CharacterSet
  @scala.inline
  def `X-EBCDIC-Spain`: `X-EBCDIC-Spain` = "X-EBCDIC-Spain".asInstanceOf[`X-EBCDIC-Spain`]
  
  @js.native
  sealed trait a
    extends Media
       with MediaSizeName
  @scala.inline
  def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait `a-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `a-translucent`: `a-translucent` = "a-translucent".asInstanceOf[`a-translucent`]
  
  @js.native
  sealed trait `a-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `a-transparent`: `a-transparent` = "a-transparent".asInstanceOf[`a-transparent`]
  
  @js.native
  sealed trait `a-white`
    extends Media
       with MediaName
  @scala.inline
  def `a-white`: `a-white` = "a-white".asInstanceOf[`a-white`]
  
  @js.native
  sealed trait aaa extends UriSchemes
  @scala.inline
  def aaa: aaa = "aaa".asInstanceOf[aaa]
  
  @js.native
  sealed trait aaas extends UriSchemes
  @scala.inline
  def aaas: aaas = "aaas".asInstanceOf[aaas]
  
  @js.native
  sealed trait `abort-job` extends JobErrorAction
  @scala.inline
  def `abort-job`: `abort-job` = "abort-job".asInstanceOf[`abort-job`]
  
  @js.native
  sealed trait aborted
    extends DocumentState
       with JobState
       with ResourceState
       with TransmissionStatus
       with WhichJobs
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait `aborted-by-system`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `aborted-by-system`: `aborted-by-system` = "aborted-by-system".asInstanceOf[`aborted-by-system`]
  
  @js.native
  sealed trait about extends UriSchemes
  @scala.inline
  def about: about = "about".asInstanceOf[about]
  
  @js.native
  sealed trait abs extends MaterialType
  @scala.inline
  def abs: abs = "abs".asInstanceOf[abs]
  
  @js.native
  sealed trait `abs-carbon-fiber` extends MaterialType
  @scala.inline
  def `abs-carbon-fiber`: `abs-carbon-fiber` = "abs-carbon-fiber".asInstanceOf[`abs-carbon-fiber`]
  
  @js.native
  sealed trait `abs-carbon-nanotube` extends MaterialType
  @scala.inline
  def `abs-carbon-nanotube`: `abs-carbon-nanotube` = "abs-carbon-nanotube".asInstanceOf[`abs-carbon-nanotube`]
  
  @js.native
  sealed trait absolute extends PrintRenderingIntent
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait acap extends UriSchemes
  @scala.inline
  def acap: acap = "acap".asInstanceOf[acap]
  
  @js.native
  sealed trait acct extends UriSchemes
  @scala.inline
  def acct: acct = "acct".asInstanceOf[acct]
  
  @js.native
  sealed trait `accuracy-units-supported` extends StObject
  @scala.inline
  def `accuracy-units-supported`: `accuracy-units-supported` = "accuracy-units-supported".asInstanceOf[`accuracy-units-supported`]
  
  @js.native
  sealed trait acd extends UriSchemes
  @scala.inline
  def acd: acd = "acd".asInstanceOf[acd]
  
  @js.native
  sealed trait acr extends UriSchemes
  @scala.inline
  def acr: acr = "acr".asInstanceOf[acr]
  
  @js.native
  sealed trait activity extends TimeoutPredicate
  @scala.inline
  def activity: activity = "activity".asInstanceOf[activity]
  
  @js.native
  sealed trait adf extends InputSource
  @scala.inline
  def adf: adf = "adf".asInstanceOf[adf]
  
  @js.native
  sealed trait adhesive extends BindingType
  @scala.inline
  def adhesive: adhesive = "adhesive".asInstanceOf[adhesive]
  
  @js.native
  sealed trait adiumxtra extends UriSchemes
  @scala.inline
  def adiumxtra: adiumxtra = "adiumxtra".asInstanceOf[adiumxtra]
  
  @js.native
  sealed trait `adobe-1Dot3` extends StObject
  @scala.inline
  def `adobe-1Dot3`: `adobe-1Dot3` = "adobe-1.3".asInstanceOf[`adobe-1Dot3`]
  
  @js.native
  sealed trait `adobe-1Dot4` extends StObject
  @scala.inline
  def `adobe-1Dot4`: `adobe-1Dot4` = "adobe-1.4".asInstanceOf[`adobe-1Dot4`]
  
  @js.native
  sealed trait `adobe-1Dot5` extends StObject
  @scala.inline
  def `adobe-1Dot5`: `adobe-1Dot5` = "adobe-1.5".asInstanceOf[`adobe-1Dot5`]
  
  @js.native
  sealed trait `adobe-1Dot6` extends StObject
  @scala.inline
  def `adobe-1Dot6`: `adobe-1Dot6` = "adobe-1.6".asInstanceOf[`adobe-1Dot6`]
  
  @js.native
  sealed trait `adobe-rgb_16` extends PwgRasterDocumentTypeSupported
  @scala.inline
  def `adobe-rgb_16`: `adobe-rgb_16` = "adobe-rgb_16".asInstanceOf[`adobe-rgb_16`]
  
  @js.native
  sealed trait `adobe-rgb_8` extends PwgRasterDocumentTypeSupported
  @scala.inline
  def `adobe-rgb_8`: `adobe-rgb_8` = "adobe-rgb_8".asInstanceOf[`adobe-rgb_8`]
  
  @js.native
  sealed trait adt extends UriSchemes
  @scala.inline
  def adt: adt = "adt".asInstanceOf[adt]
  
  @js.native
  sealed trait afp extends UriSchemes
  @scala.inline
  def afp: afp = "afp".asInstanceOf[afp]
  
  @js.native
  sealed trait afs extends UriSchemes
  @scala.inline
  def afs: afs = "afs".asInstanceOf[afs]
  
  @js.native
  sealed trait `after-job` extends BalingWhen
  @scala.inline
  def `after-job`: `after-job` = "after-job".asInstanceOf[`after-job`]
  
  @js.native
  sealed trait `after-sets` extends BalingWhen
  @scala.inline
  def `after-sets`: `after-sets` = "after-sets".asInstanceOf[`after-sets`]
  
  @js.native
  sealed trait aim extends UriSchemes
  @scala.inline
  def aim: aim = "aim".asInstanceOf[aim]
  
  @js.native
  sealed trait `alert-removal-of-binary-change-entry` extends PrinterStateReasons
  @scala.inline
  def `alert-removal-of-binary-change-entry`: `alert-removal-of-binary-change-entry` = "alert-removal-of-binary-change-entry".asInstanceOf[`alert-removal-of-binary-change-entry`]
  
  @js.native
  sealed trait all
    extends MaterialPurpose
       with RequestedJobAttributeGroups
       with RequestedPrinterAttributeGroups
       with WhichJobs
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait alternate extends MediaSource
  @scala.inline
  def alternate: alternate = "alternate".asInstanceOf[alternate]
  
  @js.native
  sealed trait `alternate-roll` extends MediaSource
  @scala.inline
  def `alternate-roll`: `alternate-roll` = "alternate-roll".asInstanceOf[`alternate-roll`]
  
  @js.native
  sealed trait aluminum extends MediaType
  @scala.inline
  def aluminum: aluminum = "aluminum".asInstanceOf[aluminum]
  
  @js.native
  sealed trait always extends StObject
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait amss extends UriSchemes
  @scala.inline
  def amss: amss = "amss".asInstanceOf[amss]
  
  @js.native
  sealed trait android extends UriSchemes
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait antique extends MediaTooth
  @scala.inline
  def antique: antique = "antique".asInstanceOf[antique]
  
  @js.native
  sealed trait appdata extends UriSchemes
  @scala.inline
  def appdata: appdata = "appdata".asInstanceOf[appdata]
  
  @js.native
  sealed trait applicationSlashactivemessage extends MimeMediaType
  @scala.inline
  def applicationSlashactivemessage: applicationSlashactivemessage = "application/activemessage".asInstanceOf[applicationSlashactivemessage]
  
  @js.native
  sealed trait `applicationSlashandrew-inset` extends MimeMediaType
  @scala.inline
  def `applicationSlashandrew-inset`: `applicationSlashandrew-inset` = "application/andrew-inset".asInstanceOf[`applicationSlashandrew-inset`]
  
  @js.native
  sealed trait applicationSlashapplefile extends MimeMediaType
  @scala.inline
  def applicationSlashapplefile: applicationSlashapplefile = "application/applefile".asInstanceOf[applicationSlashapplefile]
  
  @js.native
  sealed trait applicationSlashatomicmail extends MimeMediaType
  @scala.inline
  def applicationSlashatomicmail: applicationSlashatomicmail = "application/atomicmail".asInstanceOf[applicationSlashatomicmail]
  
  @js.native
  sealed trait `applicationSlashdca-rft` extends MimeMediaType
  @scala.inline
  def `applicationSlashdca-rft`: `applicationSlashdca-rft` = "application/dca-rft".asInstanceOf[`applicationSlashdca-rft`]
  
  @js.native
  sealed trait `applicationSlashdec-dx` extends MimeMediaType
  @scala.inline
  def `applicationSlashdec-dx`: `applicationSlashdec-dx` = "application/dec-dx".asInstanceOf[`applicationSlashdec-dx`]
  
  @js.native
  sealed trait `applicationSlashmac-binhex40` extends MimeMediaType
  @scala.inline
  def `applicationSlashmac-binhex40`: `applicationSlashmac-binhex40` = "application/mac-binhex40".asInstanceOf[`applicationSlashmac-binhex40`]
  
  @js.native
  sealed trait `applicationSlashmac-compactpro` extends MimeMediaType
  @scala.inline
  def `applicationSlashmac-compactpro`: `applicationSlashmac-compactpro` = "application/mac-compactpro".asInstanceOf[`applicationSlashmac-compactpro`]
  
  @js.native
  sealed trait applicationSlashmacwriteii extends MimeMediaType
  @scala.inline
  def applicationSlashmacwriteii: applicationSlashmacwriteii = "application/macwriteii".asInstanceOf[applicationSlashmacwriteii]
  
  @js.native
  sealed trait applicationSlashmsword extends MimeMediaType
  @scala.inline
  def applicationSlashmsword: applicationSlashmsword = "application/msword".asInstanceOf[applicationSlashmsword]
  
  @js.native
  sealed trait `applicationSlashnews-message-id` extends MimeMediaType
  @scala.inline
  def `applicationSlashnews-message-id`: `applicationSlashnews-message-id` = "application/news-message-id".asInstanceOf[`applicationSlashnews-message-id`]
  
  @js.native
  sealed trait `applicationSlashnews-transmission` extends MimeMediaType
  @scala.inline
  def `applicationSlashnews-transmission`: `applicationSlashnews-transmission` = "application/news-transmission".asInstanceOf[`applicationSlashnews-transmission`]
  
  @js.native
  sealed trait `applicationSlashoctet-stream` extends MimeMediaType
  @scala.inline
  def `applicationSlashoctet-stream`: `applicationSlashoctet-stream` = "application/octet-stream".asInstanceOf[`applicationSlashoctet-stream`]
  
  @js.native
  sealed trait applicationSlashoda extends MimeMediaType
  @scala.inline
  def applicationSlashoda: applicationSlashoda = "application/oda".asInstanceOf[applicationSlashoda]
  
  @js.native
  sealed trait applicationSlashpdf extends MimeMediaType
  @scala.inline
  def applicationSlashpdf: applicationSlashpdf = "application/pdf".asInstanceOf[applicationSlashpdf]
  
  @js.native
  sealed trait applicationSlashpostscript extends MimeMediaType
  @scala.inline
  def applicationSlashpostscript: applicationSlashpostscript = "application/postscript".asInstanceOf[applicationSlashpostscript]
  
  @js.native
  sealed trait applicationSlashpowerpoint extends MimeMediaType
  @scala.inline
  def applicationSlashpowerpoint: applicationSlashpowerpoint = "application/powerpoint".asInstanceOf[applicationSlashpowerpoint]
  
  @js.native
  sealed trait `applicationSlashremote-printing` extends MimeMediaType
  @scala.inline
  def `applicationSlashremote-printing`: `applicationSlashremote-printing` = "application/remote-printing".asInstanceOf[`applicationSlashremote-printing`]
  
  @js.native
  sealed trait applicationSlashrtf extends MimeMediaType
  @scala.inline
  def applicationSlashrtf: applicationSlashrtf = "application/rtf".asInstanceOf[applicationSlashrtf]
  
  @js.native
  sealed trait applicationSlashslate extends MimeMediaType
  @scala.inline
  def applicationSlashslate: applicationSlashslate = "application/slate".asInstanceOf[applicationSlashslate]
  
  @js.native
  sealed trait applicationSlashwita extends MimeMediaType
  @scala.inline
  def applicationSlashwita: applicationSlashwita = "application/wita".asInstanceOf[applicationSlashwita]
  
  @js.native
  sealed trait applicationSlashwordperfect5Dot1 extends MimeMediaType
  @scala.inline
  def applicationSlashwordperfect5Dot1: applicationSlashwordperfect5Dot1 = "application/wordperfect5.1".asInstanceOf[applicationSlashwordperfect5Dot1]
  
  @js.native
  sealed trait `applicationSlashx-bcpio` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-bcpio`: `applicationSlashx-bcpio` = "application/x-bcpio".asInstanceOf[`applicationSlashx-bcpio`]
  
  @js.native
  sealed trait `applicationSlashx-cdlink` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-cdlink`: `applicationSlashx-cdlink` = "application/x-cdlink".asInstanceOf[`applicationSlashx-cdlink`]
  
  @js.native
  sealed trait `applicationSlashx-compress` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-compress`: `applicationSlashx-compress` = "application/x-compress".asInstanceOf[`applicationSlashx-compress`]
  
  @js.native
  sealed trait `applicationSlashx-cpio` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-cpio`: `applicationSlashx-cpio` = "application/x-cpio".asInstanceOf[`applicationSlashx-cpio`]
  
  @js.native
  sealed trait `applicationSlashx-csh` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-csh`: `applicationSlashx-csh` = "application/x-csh".asInstanceOf[`applicationSlashx-csh`]
  
  @js.native
  sealed trait `applicationSlashx-director` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-director`: `applicationSlashx-director` = "application/x-director".asInstanceOf[`applicationSlashx-director`]
  
  @js.native
  sealed trait `applicationSlashx-dvi` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-dvi`: `applicationSlashx-dvi` = "application/x-dvi".asInstanceOf[`applicationSlashx-dvi`]
  
  @js.native
  sealed trait `applicationSlashx-gtar` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-gtar`: `applicationSlashx-gtar` = "application/x-gtar".asInstanceOf[`applicationSlashx-gtar`]
  
  @js.native
  sealed trait `applicationSlashx-gzip` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-gzip`: `applicationSlashx-gzip` = "application/x-gzip".asInstanceOf[`applicationSlashx-gzip`]
  
  @js.native
  sealed trait `applicationSlashx-hdf` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-hdf`: `applicationSlashx-hdf` = "application/x-hdf".asInstanceOf[`applicationSlashx-hdf`]
  
  @js.native
  sealed trait `applicationSlashx-httpd-cgi` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-httpd-cgi`: `applicationSlashx-httpd-cgi` = "application/x-httpd-cgi".asInstanceOf[`applicationSlashx-httpd-cgi`]
  
  @js.native
  sealed trait `applicationSlashx-koan` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-koan`: `applicationSlashx-koan` = "application/x-koan".asInstanceOf[`applicationSlashx-koan`]
  
  @js.native
  sealed trait `applicationSlashx-latex` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-latex`: `applicationSlashx-latex` = "application/x-latex".asInstanceOf[`applicationSlashx-latex`]
  
  @js.native
  sealed trait `applicationSlashx-mif` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-mif`: `applicationSlashx-mif` = "application/x-mif".asInstanceOf[`applicationSlashx-mif`]
  
  @js.native
  sealed trait `applicationSlashx-netcdf` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-netcdf`: `applicationSlashx-netcdf` = "application/x-netcdf".asInstanceOf[`applicationSlashx-netcdf`]
  
  @js.native
  sealed trait `applicationSlashx-sh` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-sh`: `applicationSlashx-sh` = "application/x-sh".asInstanceOf[`applicationSlashx-sh`]
  
  @js.native
  sealed trait `applicationSlashx-shar` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-shar`: `applicationSlashx-shar` = "application/x-shar".asInstanceOf[`applicationSlashx-shar`]
  
  @js.native
  sealed trait `applicationSlashx-stuffit` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-stuffit`: `applicationSlashx-stuffit` = "application/x-stuffit".asInstanceOf[`applicationSlashx-stuffit`]
  
  @js.native
  sealed trait `applicationSlashx-sv4cpio` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-sv4cpio`: `applicationSlashx-sv4cpio` = "application/x-sv4cpio".asInstanceOf[`applicationSlashx-sv4cpio`]
  
  @js.native
  sealed trait `applicationSlashx-sv4crc` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-sv4crc`: `applicationSlashx-sv4crc` = "application/x-sv4crc".asInstanceOf[`applicationSlashx-sv4crc`]
  
  @js.native
  sealed trait `applicationSlashx-tar` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-tar`: `applicationSlashx-tar` = "application/x-tar".asInstanceOf[`applicationSlashx-tar`]
  
  @js.native
  sealed trait `applicationSlashx-tcl` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-tcl`: `applicationSlashx-tcl` = "application/x-tcl".asInstanceOf[`applicationSlashx-tcl`]
  
  @js.native
  sealed trait `applicationSlashx-tex` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-tex`: `applicationSlashx-tex` = "application/x-tex".asInstanceOf[`applicationSlashx-tex`]
  
  @js.native
  sealed trait `applicationSlashx-texinfo` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-texinfo`: `applicationSlashx-texinfo` = "application/x-texinfo".asInstanceOf[`applicationSlashx-texinfo`]
  
  @js.native
  sealed trait `applicationSlashx-troff` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-troff`: `applicationSlashx-troff` = "application/x-troff".asInstanceOf[`applicationSlashx-troff`]
  
  @js.native
  sealed trait `applicationSlashx-troff-man` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-troff-man`: `applicationSlashx-troff-man` = "application/x-troff-man".asInstanceOf[`applicationSlashx-troff-man`]
  
  @js.native
  sealed trait `applicationSlashx-troff-me` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-troff-me`: `applicationSlashx-troff-me` = "application/x-troff-me".asInstanceOf[`applicationSlashx-troff-me`]
  
  @js.native
  sealed trait `applicationSlashx-troff-ms` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-troff-ms`: `applicationSlashx-troff-ms` = "application/x-troff-ms".asInstanceOf[`applicationSlashx-troff-ms`]
  
  @js.native
  sealed trait `applicationSlashx-ustar` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-ustar`: `applicationSlashx-ustar` = "application/x-ustar".asInstanceOf[`applicationSlashx-ustar`]
  
  @js.native
  sealed trait `applicationSlashx-wais-source` extends MimeMediaType
  @scala.inline
  def `applicationSlashx-wais-source`: `applicationSlashx-wais-source` = "application/x-wais-source".asInstanceOf[`applicationSlashx-wais-source`]
  
  @js.native
  sealed trait apt extends UriSchemes
  @scala.inline
  def apt: apt = "apt".asInstanceOf[apt]
  
  @js.native
  sealed trait `arch-a`
    extends Media
       with MediaSizeName
  @scala.inline
  def `arch-a`: `arch-a` = "arch-a".asInstanceOf[`arch-a`]
  
  @js.native
  sealed trait `arch-a-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-a-translucent`: `arch-a-translucent` = "arch-a-translucent".asInstanceOf[`arch-a-translucent`]
  
  @js.native
  sealed trait `arch-a-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-a-transparent`: `arch-a-transparent` = "arch-a-transparent".asInstanceOf[`arch-a-transparent`]
  
  @js.native
  sealed trait `arch-a-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-a-white`: `arch-a-white` = "arch-a-white".asInstanceOf[`arch-a-white`]
  
  @js.native
  sealed trait `arch-axsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-axsynchro-translucent`: `arch-axsynchro-translucent` = "arch-axsynchro-translucent".asInstanceOf[`arch-axsynchro-translucent`]
  
  @js.native
  sealed trait `arch-axsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-axsynchro-transparent`: `arch-axsynchro-transparent` = "arch-axsynchro-transparent".asInstanceOf[`arch-axsynchro-transparent`]
  
  @js.native
  sealed trait `arch-axsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-axsynchro-white`: `arch-axsynchro-white` = "arch-axsynchro-white".asInstanceOf[`arch-axsynchro-white`]
  
  @js.native
  sealed trait `arch-b`
    extends Media
       with MediaSizeName
  @scala.inline
  def `arch-b`: `arch-b` = "arch-b".asInstanceOf[`arch-b`]
  
  @js.native
  sealed trait `arch-b-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-b-translucent`: `arch-b-translucent` = "arch-b-translucent".asInstanceOf[`arch-b-translucent`]
  
  @js.native
  sealed trait `arch-b-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-b-transparent`: `arch-b-transparent` = "arch-b-transparent".asInstanceOf[`arch-b-transparent`]
  
  @js.native
  sealed trait `arch-b-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-b-white`: `arch-b-white` = "arch-b-white".asInstanceOf[`arch-b-white`]
  
  @js.native
  sealed trait `arch-bxsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-bxsynchro-translucent`: `arch-bxsynchro-translucent` = "arch-bxsynchro-translucent".asInstanceOf[`arch-bxsynchro-translucent`]
  
  @js.native
  sealed trait `arch-bxsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-bxsynchro-transparent`: `arch-bxsynchro-transparent` = "arch-bxsynchro-transparent".asInstanceOf[`arch-bxsynchro-transparent`]
  
  @js.native
  sealed trait `arch-bxsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-bxsynchro-white`: `arch-bxsynchro-white` = "arch-bxsynchro-white".asInstanceOf[`arch-bxsynchro-white`]
  
  @js.native
  sealed trait `arch-c`
    extends Media
       with MediaSizeName
  @scala.inline
  def `arch-c`: `arch-c` = "arch-c".asInstanceOf[`arch-c`]
  
  @js.native
  sealed trait `arch-c-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-c-translucent`: `arch-c-translucent` = "arch-c-translucent".asInstanceOf[`arch-c-translucent`]
  
  @js.native
  sealed trait `arch-c-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-c-transparent`: `arch-c-transparent` = "arch-c-transparent".asInstanceOf[`arch-c-transparent`]
  
  @js.native
  sealed trait `arch-c-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-c-white`: `arch-c-white` = "arch-c-white".asInstanceOf[`arch-c-white`]
  
  @js.native
  sealed trait `arch-cxsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-cxsynchro-translucent`: `arch-cxsynchro-translucent` = "arch-cxsynchro-translucent".asInstanceOf[`arch-cxsynchro-translucent`]
  
  @js.native
  sealed trait `arch-cxsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-cxsynchro-transparent`: `arch-cxsynchro-transparent` = "arch-cxsynchro-transparent".asInstanceOf[`arch-cxsynchro-transparent`]
  
  @js.native
  sealed trait `arch-cxsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-cxsynchro-white`: `arch-cxsynchro-white` = "arch-cxsynchro-white".asInstanceOf[`arch-cxsynchro-white`]
  
  @js.native
  sealed trait `arch-d`
    extends Media
       with MediaSizeName
  @scala.inline
  def `arch-d`: `arch-d` = "arch-d".asInstanceOf[`arch-d`]
  
  @js.native
  sealed trait `arch-d-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-d-translucent`: `arch-d-translucent` = "arch-d-translucent".asInstanceOf[`arch-d-translucent`]
  
  @js.native
  sealed trait `arch-d-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-d-transparent`: `arch-d-transparent` = "arch-d-transparent".asInstanceOf[`arch-d-transparent`]
  
  @js.native
  sealed trait `arch-d-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-d-white`: `arch-d-white` = "arch-d-white".asInstanceOf[`arch-d-white`]
  
  @js.native
  sealed trait `arch-dxsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-dxsynchro-translucent`: `arch-dxsynchro-translucent` = "arch-dxsynchro-translucent".asInstanceOf[`arch-dxsynchro-translucent`]
  
  @js.native
  sealed trait `arch-dxsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-dxsynchro-transparent`: `arch-dxsynchro-transparent` = "arch-dxsynchro-transparent".asInstanceOf[`arch-dxsynchro-transparent`]
  
  @js.native
  sealed trait `arch-dxsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-dxsynchro-white`: `arch-dxsynchro-white` = "arch-dxsynchro-white".asInstanceOf[`arch-dxsynchro-white`]
  
  @js.native
  sealed trait `arch-e`
    extends Media
       with MediaSizeName
  @scala.inline
  def `arch-e`: `arch-e` = "arch-e".asInstanceOf[`arch-e`]
  
  @js.native
  sealed trait `arch-e-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-e-translucent`: `arch-e-translucent` = "arch-e-translucent".asInstanceOf[`arch-e-translucent`]
  
  @js.native
  sealed trait `arch-e-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-e-transparent`: `arch-e-transparent` = "arch-e-transparent".asInstanceOf[`arch-e-transparent`]
  
  @js.native
  sealed trait `arch-e-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-e-white`: `arch-e-white` = "arch-e-white".asInstanceOf[`arch-e-white`]
  
  @js.native
  sealed trait `arch-exsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-exsynchro-translucent`: `arch-exsynchro-translucent` = "arch-exsynchro-translucent".asInstanceOf[`arch-exsynchro-translucent`]
  
  @js.native
  sealed trait `arch-exsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `arch-exsynchro-transparent`: `arch-exsynchro-transparent` = "arch-exsynchro-transparent".asInstanceOf[`arch-exsynchro-transparent`]
  
  @js.native
  sealed trait `arch-exsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `arch-exsynchro-white`: `arch-exsynchro-white` = "arch-exsynchro-white".asInstanceOf[`arch-exsynchro-white`]
  
  @js.native
  sealed trait archival
    extends CoatingType
       with LaminatingType
  @scala.inline
  def archival: archival = "archival".asInstanceOf[archival]
  
  @js.native
  sealed trait `archival-glossy` extends CoatingType
  @scala.inline
  def `archival-glossy`: `archival-glossy` = "archival-glossy".asInstanceOf[`archival-glossy`]
  
  @js.native
  sealed trait `archival-matte` extends CoatingType
  @scala.inline
  def `archival-matte`: `archival-matte` = "archival-matte".asInstanceOf[`archival-matte`]
  
  @js.native
  sealed trait `archival-semi-gloss` extends CoatingType
  @scala.inline
  def `archival-semi-gloss`: `archival-semi-gloss` = "archival-semi-gloss".asInstanceOf[`archival-semi-gloss`]
  
  @js.native
  sealed trait arithmetic extends StObject
  @scala.inline
  def arithmetic: arithmetic = "arithmetic".asInstanceOf[arithmetic]
  
  @js.native
  sealed trait ark extends UriSchemes
  @scala.inline
  def ark: ark = "ark".asInstanceOf[ark]
  
  @js.native
  sealed trait asme_f_28x40in
    extends Media
       with MediaSizeName
  @scala.inline
  def asme_f_28x40in: asme_f_28x40in = "asme_f_28x40in".asInstanceOf[asme_f_28x40in]
  
  @js.native
  sealed trait attachment extends UriSchemes
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @js.native
  sealed trait attempted extends StObject
  @scala.inline
  def attempted: attempted = "attempted".asInstanceOf[attempted]
  
  @js.native
  sealed trait `attributes-charset` extends StObject
  @scala.inline
  def `attributes-charset`: `attributes-charset` = "attributes-charset".asInstanceOf[`attributes-charset`]
  
  @js.native
  sealed trait `attributes-natural-language` extends StObject
  @scala.inline
  def `attributes-natural-language`: `attributes-natural-language` = "attributes-natural-language".asInstanceOf[`attributes-natural-language`]
  
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
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait `auto-fit` extends PrintScaling
  @scala.inline
  def `auto-fit`: `auto-fit` = "auto-fit".asInstanceOf[`auto-fit`]
  
  @js.native
  sealed trait `auto-fixed-size-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `auto-fixed-size-translucent`: `auto-fixed-size-translucent` = "auto-fixed-size-translucent".asInstanceOf[`auto-fixed-size-translucent`]
  
  @js.native
  sealed trait `auto-fixed-size-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `auto-fixed-size-transparent`: `auto-fixed-size-transparent` = "auto-fixed-size-transparent".asInstanceOf[`auto-fixed-size-transparent`]
  
  @js.native
  sealed trait `auto-fixed-size-white`
    extends Media
       with MediaName
  @scala.inline
  def `auto-fixed-size-white`: `auto-fixed-size-white` = "auto-fixed-size-white".asInstanceOf[`auto-fixed-size-white`]
  
  @js.native
  sealed trait `auto-monochrome` extends PrintColorMode
  @scala.inline
  def `auto-monochrome`: `auto-monochrome` = "auto-monochrome".asInstanceOf[`auto-monochrome`]
  
  @js.native
  sealed trait `auto-synchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `auto-synchro-translucent`: `auto-synchro-translucent` = "auto-synchro-translucent".asInstanceOf[`auto-synchro-translucent`]
  
  @js.native
  sealed trait `auto-synchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `auto-synchro-transparent`: `auto-synchro-transparent` = "auto-synchro-transparent".asInstanceOf[`auto-synchro-transparent`]
  
  @js.native
  sealed trait `auto-synchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `auto-synchro-white`: `auto-synchro-white` = "auto-synchro-white".asInstanceOf[`auto-synchro-white`]
  
  @js.native
  sealed trait `auto-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `auto-translucent`: `auto-translucent` = "auto-translucent".asInstanceOf[`auto-translucent`]
  
  @js.native
  sealed trait `auto-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `auto-transparent`: `auto-transparent` = "auto-transparent".asInstanceOf[`auto-transparent`]
  
  @js.native
  sealed trait `auto-white`
    extends Media
       with MediaName
  @scala.inline
  def `auto-white`: `auto-white` = "auto-white".asInstanceOf[`auto-white`]
  
  @js.native
  sealed trait automatic extends StObject
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait available extends ResourceState
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait aw extends UriSchemes
  @scala.inline
  def aw: aw = "aw".asInstanceOf[aw]
  
  @js.native
  sealed trait `axsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `axsynchro-translucent`: `axsynchro-translucent` = "axsynchro-translucent".asInstanceOf[`axsynchro-translucent`]
  
  @js.native
  sealed trait `axsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `axsynchro-transparent`: `axsynchro-transparent` = "axsynchro-transparent".asInstanceOf[`axsynchro-transparent`]
  
  @js.native
  sealed trait `axsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `axsynchro-white`: `axsynchro-white` = "axsynchro-white".asInstanceOf[`axsynchro-white`]
  
  @js.native
  sealed trait b
    extends Media
       with MediaSizeName
  @scala.inline
  def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait `b-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `b-translucent`: `b-translucent` = "b-translucent".asInstanceOf[`b-translucent`]
  
  @js.native
  sealed trait `b-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `b-transparent`: `b-transparent` = "b-transparent".asInstanceOf[`b-transparent`]
  
  @js.native
  sealed trait `b-white`
    extends Media
       with MediaName
  @scala.inline
  def `b-white`: `b-white` = "b-white".asInstanceOf[`b-white`]
  
  @js.native
  sealed trait back extends FinishingSides
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait `back-print-film` extends MediaType
  @scala.inline
  def `back-print-film`: `back-print-film` = "back-print-film".asInstanceOf[`back-print-film`]
  
  @js.native
  sealed trait bale extends Finishings
  @scala.inline
  def bale: bale = "bale".asInstanceOf[bale]
  
  @js.native
  sealed trait baling extends StObject
  @scala.inline
  def baling: baling = "baling".asInstanceOf[baling]
  
  @js.native
  sealed trait `baling-type-supported` extends StObject
  @scala.inline
  def `baling-type-supported`: `baling-type-supported` = "baling-type-supported".asInstanceOf[`baling-type-supported`]
  
  @js.native
  sealed trait `baling-when-supported` extends StObject
  @scala.inline
  def `baling-when-supported`: `baling-when-supported` = "baling-when-supported".asInstanceOf[`baling-when-supported`]
  
  @js.native
  sealed trait band extends BalingType
  @scala.inline
  def band: band = "band".asInstanceOf[band]
  
  @js.native
  sealed trait `bander-added` extends PrinterStateReasons
  @scala.inline
  def `bander-added`: `bander-added` = "bander-added".asInstanceOf[`bander-added`]
  
  @js.native
  sealed trait `bander-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `bander-almost-empty`: `bander-almost-empty` = "bander-almost-empty".asInstanceOf[`bander-almost-empty`]
  
  @js.native
  sealed trait `bander-almost-full` extends PrinterStateReasons
  @scala.inline
  def `bander-almost-full`: `bander-almost-full` = "bander-almost-full".asInstanceOf[`bander-almost-full`]
  
  @js.native
  sealed trait `bander-at-limit` extends PrinterStateReasons
  @scala.inline
  def `bander-at-limit`: `bander-at-limit` = "bander-at-limit".asInstanceOf[`bander-at-limit`]
  
  @js.native
  sealed trait `bander-closed` extends PrinterStateReasons
  @scala.inline
  def `bander-closed`: `bander-closed` = "bander-closed".asInstanceOf[`bander-closed`]
  
  @js.native
  sealed trait `bander-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `bander-configuration-change`: `bander-configuration-change` = "bander-configuration-change".asInstanceOf[`bander-configuration-change`]
  
  @js.native
  sealed trait `bander-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `bander-cover-closed`: `bander-cover-closed` = "bander-cover-closed".asInstanceOf[`bander-cover-closed`]
  
  @js.native
  sealed trait `bander-cover-open` extends PrinterStateReasons
  @scala.inline
  def `bander-cover-open`: `bander-cover-open` = "bander-cover-open".asInstanceOf[`bander-cover-open`]
  
  @js.native
  sealed trait `bander-empty` extends PrinterStateReasons
  @scala.inline
  def `bander-empty`: `bander-empty` = "bander-empty".asInstanceOf[`bander-empty`]
  
  @js.native
  sealed trait `bander-full` extends PrinterStateReasons
  @scala.inline
  def `bander-full`: `bander-full` = "bander-full".asInstanceOf[`bander-full`]
  
  @js.native
  sealed trait `bander-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `bander-interlock-closed`: `bander-interlock-closed` = "bander-interlock-closed".asInstanceOf[`bander-interlock-closed`]
  
  @js.native
  sealed trait `bander-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `bander-interlock-open`: `bander-interlock-open` = "bander-interlock-open".asInstanceOf[`bander-interlock-open`]
  
  @js.native
  sealed trait `bander-jam` extends PrinterStateReasons
  @scala.inline
  def `bander-jam`: `bander-jam` = "bander-jam".asInstanceOf[`bander-jam`]
  
  @js.native
  sealed trait `bander-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `bander-life-almost-over`: `bander-life-almost-over` = "bander-life-almost-over".asInstanceOf[`bander-life-almost-over`]
  
  @js.native
  sealed trait `bander-life-over` extends PrinterStateReasons
  @scala.inline
  def `bander-life-over`: `bander-life-over` = "bander-life-over".asInstanceOf[`bander-life-over`]
  
  @js.native
  sealed trait `bander-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `bander-memory-exhausted`: `bander-memory-exhausted` = "bander-memory-exhausted".asInstanceOf[`bander-memory-exhausted`]
  
  @js.native
  sealed trait `bander-missing` extends PrinterStateReasons
  @scala.inline
  def `bander-missing`: `bander-missing` = "bander-missing".asInstanceOf[`bander-missing`]
  
  @js.native
  sealed trait `bander-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `bander-motor-failure`: `bander-motor-failure` = "bander-motor-failure".asInstanceOf[`bander-motor-failure`]
  
  @js.native
  sealed trait `bander-near-limit` extends PrinterStateReasons
  @scala.inline
  def `bander-near-limit`: `bander-near-limit` = "bander-near-limit".asInstanceOf[`bander-near-limit`]
  
  @js.native
  sealed trait `bander-offline` extends PrinterStateReasons
  @scala.inline
  def `bander-offline`: `bander-offline` = "bander-offline".asInstanceOf[`bander-offline`]
  
  @js.native
  sealed trait `bander-opened` extends PrinterStateReasons
  @scala.inline
  def `bander-opened`: `bander-opened` = "bander-opened".asInstanceOf[`bander-opened`]
  
  @js.native
  sealed trait `bander-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `bander-over-temperature`: `bander-over-temperature` = "bander-over-temperature".asInstanceOf[`bander-over-temperature`]
  
  @js.native
  sealed trait `bander-power-saver` extends PrinterStateReasons
  @scala.inline
  def `bander-power-saver`: `bander-power-saver` = "bander-power-saver".asInstanceOf[`bander-power-saver`]
  
  @js.native
  sealed trait `bander-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `bander-recoverable-failure`: `bander-recoverable-failure` = "bander-recoverable-failure".asInstanceOf[`bander-recoverable-failure`]
  
  @js.native
  sealed trait `bander-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `bander-recoverable-storage-error`: `bander-recoverable-storage-error` = "bander-recoverable-storage-error".asInstanceOf[`bander-recoverable-storage-error`]
  
  @js.native
  sealed trait `bander-removed` extends PrinterStateReasons
  @scala.inline
  def `bander-removed`: `bander-removed` = "bander-removed".asInstanceOf[`bander-removed`]
  
  @js.native
  sealed trait `bander-resource-added` extends PrinterStateReasons
  @scala.inline
  def `bander-resource-added`: `bander-resource-added` = "bander-resource-added".asInstanceOf[`bander-resource-added`]
  
  @js.native
  sealed trait `bander-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `bander-resource-removed`: `bander-resource-removed` = "bander-resource-removed".asInstanceOf[`bander-resource-removed`]
  
  @js.native
  sealed trait `bander-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `bander-thermistor-failure`: `bander-thermistor-failure` = "bander-thermistor-failure".asInstanceOf[`bander-thermistor-failure`]
  
  @js.native
  sealed trait `bander-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `bander-timing-failure`: `bander-timing-failure` = "bander-timing-failure".asInstanceOf[`bander-timing-failure`]
  
  @js.native
  sealed trait `bander-turned-off` extends PrinterStateReasons
  @scala.inline
  def `bander-turned-off`: `bander-turned-off` = "bander-turned-off".asInstanceOf[`bander-turned-off`]
  
  @js.native
  sealed trait `bander-turned-on` extends PrinterStateReasons
  @scala.inline
  def `bander-turned-on`: `bander-turned-on` = "bander-turned-on".asInstanceOf[`bander-turned-on`]
  
  @js.native
  sealed trait `bander-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `bander-under-temperature`: `bander-under-temperature` = "bander-under-temperature".asInstanceOf[`bander-under-temperature`]
  
  @js.native
  sealed trait `bander-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `bander-unrecoverable-failure`: `bander-unrecoverable-failure` = "bander-unrecoverable-failure".asInstanceOf[`bander-unrecoverable-failure`]
  
  @js.native
  sealed trait `bander-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `bander-unrecoverable-storage-error`: `bander-unrecoverable-storage-error` = "bander-unrecoverable-storage-error".asInstanceOf[`bander-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `bander-warming-up` extends PrinterStateReasons
  @scala.inline
  def `bander-warming-up`: `bander-warming-up` = "bander-warming-up".asInstanceOf[`bander-warming-up`]
  
  @js.native
  sealed trait barion extends UriSchemes
  @scala.inline
  def barion: barion = "barion".asInstanceOf[barion]
  
  @js.native
  sealed trait base extends MaterialPurpose
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait basic extends XriAuthentication
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait beshare extends UriSchemes
  @scala.inline
  def beshare: beshare = "beshare".asInstanceOf[beshare]
  
  @js.native
  sealed trait `best-fit` extends MultipleObjectHandling
  @scala.inline
  def `best-fit`: `best-fit` = "best-fit".asInstanceOf[`best-fit`]
  
  @js.native
  sealed trait `best-quality` extends MultipleObjectHandling
  @scala.inline
  def `best-quality`: `best-quality` = "best-quality".asInstanceOf[`best-quality`]
  
  @js.native
  sealed trait `best-speed` extends MultipleObjectHandling
  @scala.inline
  def `best-speed`: `best-speed` = "best-speed".asInstanceOf[`best-speed`]
  
  @js.native
  sealed trait `bi-level`
    extends InputColorMode
       with PrintColorMode
  @scala.inline
  def `bi-level`: `bi-level` = "bi-level".asInstanceOf[`bi-level`]
  
  @js.native
  sealed trait big5 extends CharacterSet
  @scala.inline
  def big5: big5 = "big5".asInstanceOf[big5]
  
  @js.native
  sealed trait bind extends Finishings
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  
  @js.native
  sealed trait `bind-bottom` extends Finishings
  @scala.inline
  def `bind-bottom`: `bind-bottom` = "bind-bottom".asInstanceOf[`bind-bottom`]
  
  @js.native
  sealed trait `bind-left` extends Finishings
  @scala.inline
  def `bind-left`: `bind-left` = "bind-left".asInstanceOf[`bind-left`]
  
  @js.native
  sealed trait `bind-right` extends Finishings
  @scala.inline
  def `bind-right`: `bind-right` = "bind-right".asInstanceOf[`bind-right`]
  
  @js.native
  sealed trait `bind-top` extends Finishings
  @scala.inline
  def `bind-top`: `bind-top` = "bind-top".asInstanceOf[`bind-top`]
  
  @js.native
  sealed trait `binder-added` extends PrinterStateReasons
  @scala.inline
  def `binder-added`: `binder-added` = "binder-added".asInstanceOf[`binder-added`]
  
  @js.native
  sealed trait `binder-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `binder-almost-empty`: `binder-almost-empty` = "binder-almost-empty".asInstanceOf[`binder-almost-empty`]
  
  @js.native
  sealed trait `binder-almost-full` extends PrinterStateReasons
  @scala.inline
  def `binder-almost-full`: `binder-almost-full` = "binder-almost-full".asInstanceOf[`binder-almost-full`]
  
  @js.native
  sealed trait `binder-at-limit` extends PrinterStateReasons
  @scala.inline
  def `binder-at-limit`: `binder-at-limit` = "binder-at-limit".asInstanceOf[`binder-at-limit`]
  
  @js.native
  sealed trait `binder-closed` extends PrinterStateReasons
  @scala.inline
  def `binder-closed`: `binder-closed` = "binder-closed".asInstanceOf[`binder-closed`]
  
  @js.native
  sealed trait `binder-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `binder-configuration-change`: `binder-configuration-change` = "binder-configuration-change".asInstanceOf[`binder-configuration-change`]
  
  @js.native
  sealed trait `binder-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `binder-cover-closed`: `binder-cover-closed` = "binder-cover-closed".asInstanceOf[`binder-cover-closed`]
  
  @js.native
  sealed trait `binder-cover-open` extends PrinterStateReasons
  @scala.inline
  def `binder-cover-open`: `binder-cover-open` = "binder-cover-open".asInstanceOf[`binder-cover-open`]
  
  @js.native
  sealed trait `binder-empty` extends PrinterStateReasons
  @scala.inline
  def `binder-empty`: `binder-empty` = "binder-empty".asInstanceOf[`binder-empty`]
  
  @js.native
  sealed trait `binder-full` extends PrinterStateReasons
  @scala.inline
  def `binder-full`: `binder-full` = "binder-full".asInstanceOf[`binder-full`]
  
  @js.native
  sealed trait `binder-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `binder-interlock-closed`: `binder-interlock-closed` = "binder-interlock-closed".asInstanceOf[`binder-interlock-closed`]
  
  @js.native
  sealed trait `binder-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `binder-interlock-open`: `binder-interlock-open` = "binder-interlock-open".asInstanceOf[`binder-interlock-open`]
  
  @js.native
  sealed trait `binder-jam` extends PrinterStateReasons
  @scala.inline
  def `binder-jam`: `binder-jam` = "binder-jam".asInstanceOf[`binder-jam`]
  
  @js.native
  sealed trait `binder-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `binder-life-almost-over`: `binder-life-almost-over` = "binder-life-almost-over".asInstanceOf[`binder-life-almost-over`]
  
  @js.native
  sealed trait `binder-life-over` extends PrinterStateReasons
  @scala.inline
  def `binder-life-over`: `binder-life-over` = "binder-life-over".asInstanceOf[`binder-life-over`]
  
  @js.native
  sealed trait `binder-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `binder-memory-exhausted`: `binder-memory-exhausted` = "binder-memory-exhausted".asInstanceOf[`binder-memory-exhausted`]
  
  @js.native
  sealed trait `binder-missing` extends PrinterStateReasons
  @scala.inline
  def `binder-missing`: `binder-missing` = "binder-missing".asInstanceOf[`binder-missing`]
  
  @js.native
  sealed trait `binder-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `binder-motor-failure`: `binder-motor-failure` = "binder-motor-failure".asInstanceOf[`binder-motor-failure`]
  
  @js.native
  sealed trait `binder-near-limit` extends PrinterStateReasons
  @scala.inline
  def `binder-near-limit`: `binder-near-limit` = "binder-near-limit".asInstanceOf[`binder-near-limit`]
  
  @js.native
  sealed trait `binder-offline` extends PrinterStateReasons
  @scala.inline
  def `binder-offline`: `binder-offline` = "binder-offline".asInstanceOf[`binder-offline`]
  
  @js.native
  sealed trait `binder-opened` extends PrinterStateReasons
  @scala.inline
  def `binder-opened`: `binder-opened` = "binder-opened".asInstanceOf[`binder-opened`]
  
  @js.native
  sealed trait `binder-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `binder-over-temperature`: `binder-over-temperature` = "binder-over-temperature".asInstanceOf[`binder-over-temperature`]
  
  @js.native
  sealed trait `binder-power-saver` extends PrinterStateReasons
  @scala.inline
  def `binder-power-saver`: `binder-power-saver` = "binder-power-saver".asInstanceOf[`binder-power-saver`]
  
  @js.native
  sealed trait `binder-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `binder-recoverable-failure`: `binder-recoverable-failure` = "binder-recoverable-failure".asInstanceOf[`binder-recoverable-failure`]
  
  @js.native
  sealed trait `binder-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `binder-recoverable-storage-error`: `binder-recoverable-storage-error` = "binder-recoverable-storage-error".asInstanceOf[`binder-recoverable-storage-error`]
  
  @js.native
  sealed trait `binder-removed` extends PrinterStateReasons
  @scala.inline
  def `binder-removed`: `binder-removed` = "binder-removed".asInstanceOf[`binder-removed`]
  
  @js.native
  sealed trait `binder-resource-added` extends PrinterStateReasons
  @scala.inline
  def `binder-resource-added`: `binder-resource-added` = "binder-resource-added".asInstanceOf[`binder-resource-added`]
  
  @js.native
  sealed trait `binder-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `binder-resource-removed`: `binder-resource-removed` = "binder-resource-removed".asInstanceOf[`binder-resource-removed`]
  
  @js.native
  sealed trait `binder-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `binder-thermistor-failure`: `binder-thermistor-failure` = "binder-thermistor-failure".asInstanceOf[`binder-thermistor-failure`]
  
  @js.native
  sealed trait `binder-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `binder-timing-failure`: `binder-timing-failure` = "binder-timing-failure".asInstanceOf[`binder-timing-failure`]
  
  @js.native
  sealed trait `binder-turned-off` extends PrinterStateReasons
  @scala.inline
  def `binder-turned-off`: `binder-turned-off` = "binder-turned-off".asInstanceOf[`binder-turned-off`]
  
  @js.native
  sealed trait `binder-turned-on` extends PrinterStateReasons
  @scala.inline
  def `binder-turned-on`: `binder-turned-on` = "binder-turned-on".asInstanceOf[`binder-turned-on`]
  
  @js.native
  sealed trait `binder-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `binder-under-temperature`: `binder-under-temperature` = "binder-under-temperature".asInstanceOf[`binder-under-temperature`]
  
  @js.native
  sealed trait `binder-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `binder-unrecoverable-failure`: `binder-unrecoverable-failure` = "binder-unrecoverable-failure".asInstanceOf[`binder-unrecoverable-failure`]
  
  @js.native
  sealed trait `binder-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `binder-unrecoverable-storage-error`: `binder-unrecoverable-storage-error` = "binder-unrecoverable-storage-error".asInstanceOf[`binder-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `binder-warming-up` extends PrinterStateReasons
  @scala.inline
  def `binder-warming-up`: `binder-warming-up` = "binder-warming-up".asInstanceOf[`binder-warming-up`]
  
  @js.native
  sealed trait binding extends StObject
  @scala.inline
  def binding: binding = "binding".asInstanceOf[binding]
  
  @js.native
  sealed trait `binding-reference-edge-supported` extends StObject
  @scala.inline
  def `binding-reference-edge-supported`: `binding-reference-edge-supported` = "binding-reference-edge-supported".asInstanceOf[`binding-reference-edge-supported`]
  
  @js.native
  sealed trait `binding-type-supported` extends StObject
  @scala.inline
  def `binding-type-supported`: `binding-type-supported` = "binding-type-supported".asInstanceOf[`binding-type-supported`]
  
  @js.native
  sealed trait bitcoin extends UriSchemes
  @scala.inline
  def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  
  @js.native
  sealed trait bitcoincash extends UriSchemes
  @scala.inline
  def bitcoincash: bitcoincash = "bitcoincash".asInstanceOf[bitcoincash]
  
  @js.native
  sealed trait black extends MediaColor
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait `black-and-white-negative-film` extends InputFilmScanMode
  @scala.inline
  def `black-and-white-negative-film`: `black-and-white-negative-film` = "black-and-white-negative-film".asInstanceOf[`black-and-white-negative-film`]
  
  @js.native
  sealed trait black_1 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def black_1: black_1 = "black_1".asInstanceOf[black_1]
  
  @js.native
  sealed trait black_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def black_16: black_16 = "black_16".asInstanceOf[black_16]
  
  @js.native
  sealed trait black_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def black_8: black_8 = "black_8".asInstanceOf[black_8]
  
  @js.native
  sealed trait blank extends MediaPrePrinted
  @scala.inline
  def blank: blank = "blank".asInstanceOf[blank]
  
  @js.native
  sealed trait blob extends UriSchemes
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait blue extends MediaColor
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait bolo extends UriSchemes
  @scala.inline
  def bolo: bolo = "bolo".asInstanceOf[bolo]
  
  @js.native
  sealed trait `booklet-maker` extends Finishings
  @scala.inline
  def `booklet-maker`: `booklet-maker` = "booklet-maker".asInstanceOf[`booklet-maker`]
  
  @js.native
  sealed trait both extends FinishingSides
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait `both-sheets` extends SeparatorSheetsType
  @scala.inline
  def `both-sheets`: `both-sheets` = "both-sheets".asInstanceOf[`both-sheets`]
  
  @js.native
  sealed trait bottom
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
       with ReferenceEdge
       with YImagePosition
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait brim extends PrintBase
  @scala.inline
  def brim: brim = "brim".asInstanceOf[brim]
  
  @js.native
  sealed trait brown extends MediaColor
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  
  @js.native
  sealed trait browserext extends UriSchemes
  @scala.inline
  def browserext: browserext = "browserext".asInstanceOf[browserext]
  
  @js.native
  sealed trait buff extends MediaColor
  @scala.inline
  def buff: buff = "buff".asInstanceOf[buff]
  
  @js.native
  sealed trait `bxsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `bxsynchro-translucent`: `bxsynchro-translucent` = "bxsynchro-translucent".asInstanceOf[`bxsynchro-translucent`]
  
  @js.native
  sealed trait `bxsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `bxsynchro-transparent`: `bxsynchro-transparent` = "bxsynchro-transparent".asInstanceOf[`bxsynchro-transparent`]
  
  @js.native
  sealed trait `bxsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `bxsynchro-white`: `bxsynchro-white` = "bxsynchro-white".asInstanceOf[`bxsynchro-white`]
  
  @js.native
  sealed trait `by-pass-tray` extends MediaSource
  @scala.inline
  def `by-pass-tray`: `by-pass-tray` = "by-pass-tray".asInstanceOf[`by-pass-tray`]
  
  @js.native
  sealed trait c
    extends Media
       with MediaSizeName
  @scala.inline
  def c: c = "c".asInstanceOf[c]
  
  @js.native
  sealed trait `c-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `c-translucent`: `c-translucent` = "c-translucent".asInstanceOf[`c-translucent`]
  
  @js.native
  sealed trait `c-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `c-transparent`: `c-transparent` = "c-transparent".asInstanceOf[`c-transparent`]
  
  @js.native
  sealed trait `c-white`
    extends Media
       with MediaName
  @scala.inline
  def `c-white`: `c-white` = "c-white".asInstanceOf[`c-white`]
  
  @js.native
  sealed trait calculator extends UriSchemes
  @scala.inline
  def calculator: calculator = "calculator".asInstanceOf[calculator]
  
  @js.native
  sealed trait calendared extends MediaTooth
  @scala.inline
  def calendared: calendared = "calendared".asInstanceOf[calendared]
  
  @js.native
  sealed trait callto extends UriSchemes
  @scala.inline
  def callto: callto = "callto".asInstanceOf[callto]
  
  @js.native
  sealed trait `cancel-job_` extends JobErrorAction
  @scala.inline
  def `cancel-job_`: `cancel-job_` = "cancel-job".asInstanceOf[`cancel-job_`]
  
  @js.native
  sealed trait canceled
    extends DocumentState
       with JobState
       with ResourceState
       with TransmissionStatus
       with WhichJobs
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait `canceled-at-device` extends DocumentStateReasons
  @scala.inline
  def `canceled-at-device`: `canceled-at-device` = "canceled-at-device".asInstanceOf[`canceled-at-device`]
  
  @js.native
  sealed trait `canceled-by-operator` extends DocumentStateReasons
  @scala.inline
  def `canceled-by-operator`: `canceled-by-operator` = "canceled-by-operator".asInstanceOf[`canceled-by-operator`]
  
  @js.native
  sealed trait `canceled-by-user` extends DocumentStateReasons
  @scala.inline
  def `canceled-by-user`: `canceled-by-user` = "canceled-by-user".asInstanceOf[`canceled-by-user`]
  
  @js.native
  sealed trait cap extends UriSchemes
  @scala.inline
  def cap: cap = "cap".asInstanceOf[cap]
  
  @js.native
  sealed trait cardboard extends MediaType
  @scala.inline
  def cardboard: cardboard = "cardboard".asInstanceOf[cardboard]
  
  @js.native
  sealed trait cardstock extends MediaType
  @scala.inline
  def cardstock: cardstock = "cardstock".asInstanceOf[cardstock]
  
  @js.native
  sealed trait cast extends UriSchemes
  @scala.inline
  def cast: cast = "cast".asInstanceOf[cast]
  
  @js.native
  sealed trait casts extends UriSchemes
  @scala.inline
  def casts: casts = "casts".asInstanceOf[casts]
  
  @js.native
  sealed trait cd extends MediaType
  @scala.inline
  def cd: cd = "cd".asInstanceOf[cd]
  
  @js.native
  sealed trait center
    extends MediaSource
       with OutputBin
       with XImagePosition
       with YImagePosition
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait certificate extends XriAuthentication
  @scala.inline
  def certificate: certificate = "certificate".asInstanceOf[certificate]
  
  @js.native
  sealed trait `chamber-humidity` extends Overrides
  @scala.inline
  def `chamber-humidity`: `chamber-humidity` = "chamber-humidity".asInstanceOf[`chamber-humidity`]
  
  @js.native
  sealed trait `chamber-humidity-actual` extends StObject
  @scala.inline
  def `chamber-humidity-actual`: `chamber-humidity-actual` = "chamber-humidity-actual".asInstanceOf[`chamber-humidity-actual`]
  
  @js.native
  sealed trait `chamber-humidity-default` extends StObject
  @scala.inline
  def `chamber-humidity-default`: `chamber-humidity-default` = "chamber-humidity-default".asInstanceOf[`chamber-humidity-default`]
  
  @js.native
  sealed trait `chamber-humidity-supported` extends StObject
  @scala.inline
  def `chamber-humidity-supported`: `chamber-humidity-supported` = "chamber-humidity-supported".asInstanceOf[`chamber-humidity-supported`]
  
  @js.native
  sealed trait `chamber-temperature` extends Overrides
  @scala.inline
  def `chamber-temperature`: `chamber-temperature` = "chamber-temperature".asInstanceOf[`chamber-temperature`]
  
  @js.native
  sealed trait `chamber-temperature-actual` extends StObject
  @scala.inline
  def `chamber-temperature-actual`: `chamber-temperature-actual` = "chamber-temperature-actual".asInstanceOf[`chamber-temperature-actual`]
  
  @js.native
  sealed trait `chamber-temperature-default` extends StObject
  @scala.inline
  def `chamber-temperature-default`: `chamber-temperature-default` = "chamber-temperature-default".asInstanceOf[`chamber-temperature-default`]
  
  @js.native
  sealed trait `chamber-temperature-supported` extends StObject
  @scala.inline
  def `chamber-temperature-supported`: `chamber-temperature-supported` = "chamber-temperature-supported".asInstanceOf[`chamber-temperature-supported`]
  
  @js.native
  sealed trait `charset-configured` extends StObject
  @scala.inline
  def `charset-configured`: `charset-configured` = "charset-configured".asInstanceOf[`charset-configured`]
  
  @js.native
  sealed trait `charset-supported` extends StObject
  @scala.inline
  def `charset-supported`: `charset-supported` = "charset-supported".asInstanceOf[`charset-supported`]
  
  @js.native
  sealed trait chocolate extends MaterialType
  @scala.inline
  def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  
  @js.native
  sealed trait choice_iso_a4_210x297mm_na_letter_8Dot5x11in
    extends Media
       with MediaSizeName
  @scala.inline
  def choice_iso_a4_210x297mm_na_letter_8Dot5x11in: choice_iso_a4_210x297mm_na_letter_8Dot5x11in = "choice_iso_a4_210x297mm_na_letter_8.5x11in".asInstanceOf[choice_iso_a4_210x297mm_na_letter_8Dot5x11in]
  
  @js.native
  sealed trait chrome extends UriSchemes
  @scala.inline
  def chrome: chrome = "chrome".asInstanceOf[chrome]
  
  @js.native
  sealed trait `chrome-extension` extends UriSchemes
  @scala.inline
  def `chrome-extension`: `chrome-extension` = "chrome-extension".asInstanceOf[`chrome-extension`]
  
  @js.native
  sealed trait cid extends UriSchemes
  @scala.inline
  def cid: cid = "cid".asInstanceOf[cid]
  
  @js.native
  sealed trait `cleaner-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `cleaner-life-almost-over`: `cleaner-life-almost-over` = "cleaner-life-almost-over".asInstanceOf[`cleaner-life-almost-over`]
  
  @js.native
  sealed trait `cleaner-life-over` extends PrinterStateReasons
  @scala.inline
  def `cleaner-life-over`: `cleaner-life-over` = "cleaner-life-over".asInstanceOf[`cleaner-life-over`]
  
  @js.native
  sealed trait `clear-black` extends MediaColor
  @scala.inline
  def `clear-black`: `clear-black` = "clear-black".asInstanceOf[`clear-black`]
  
  @js.native
  sealed trait `clear-blue` extends MediaColor
  @scala.inline
  def `clear-blue`: `clear-blue` = "clear-blue".asInstanceOf[`clear-blue`]
  
  @js.native
  sealed trait `clear-brown` extends MediaColor
  @scala.inline
  def `clear-brown`: `clear-brown` = "clear-brown".asInstanceOf[`clear-brown`]
  
  @js.native
  sealed trait `clear-buff` extends MediaColor
  @scala.inline
  def `clear-buff`: `clear-buff` = "clear-buff".asInstanceOf[`clear-buff`]
  
  @js.native
  sealed trait `clear-cyan` extends MediaColor
  @scala.inline
  def `clear-cyan`: `clear-cyan` = "clear-cyan".asInstanceOf[`clear-cyan`]
  
  @js.native
  sealed trait `clear-gold` extends MediaColor
  @scala.inline
  def `clear-gold`: `clear-gold` = "clear-gold".asInstanceOf[`clear-gold`]
  
  @js.native
  sealed trait `clear-goldenrod` extends MediaColor
  @scala.inline
  def `clear-goldenrod`: `clear-goldenrod` = "clear-goldenrod".asInstanceOf[`clear-goldenrod`]
  
  @js.native
  sealed trait `clear-gray` extends MediaColor
  @scala.inline
  def `clear-gray`: `clear-gray` = "clear-gray".asInstanceOf[`clear-gray`]
  
  @js.native
  sealed trait `clear-green` extends MediaColor
  @scala.inline
  def `clear-green`: `clear-green` = "clear-green".asInstanceOf[`clear-green`]
  
  @js.native
  sealed trait `clear-ivory` extends MediaColor
  @scala.inline
  def `clear-ivory`: `clear-ivory` = "clear-ivory".asInstanceOf[`clear-ivory`]
  
  @js.native
  sealed trait `clear-magenta` extends MediaColor
  @scala.inline
  def `clear-magenta`: `clear-magenta` = "clear-magenta".asInstanceOf[`clear-magenta`]
  
  @js.native
  sealed trait `clear-multi-color` extends MediaColor
  @scala.inline
  def `clear-multi-color`: `clear-multi-color` = "clear-multi-color".asInstanceOf[`clear-multi-color`]
  
  @js.native
  sealed trait `clear-mustard` extends MediaColor
  @scala.inline
  def `clear-mustard`: `clear-mustard` = "clear-mustard".asInstanceOf[`clear-mustard`]
  
  @js.native
  sealed trait `clear-orange` extends MediaColor
  @scala.inline
  def `clear-orange`: `clear-orange` = "clear-orange".asInstanceOf[`clear-orange`]
  
  @js.native
  sealed trait `clear-pink` extends MediaColor
  @scala.inline
  def `clear-pink`: `clear-pink` = "clear-pink".asInstanceOf[`clear-pink`]
  
  @js.native
  sealed trait `clear-red` extends MediaColor
  @scala.inline
  def `clear-red`: `clear-red` = "clear-red".asInstanceOf[`clear-red`]
  
  @js.native
  sealed trait `clear-silver` extends MediaColor
  @scala.inline
  def `clear-silver`: `clear-silver` = "clear-silver".asInstanceOf[`clear-silver`]
  
  @js.native
  sealed trait `clear-turquoise` extends MediaColor
  @scala.inline
  def `clear-turquoise`: `clear-turquoise` = "clear-turquoise".asInstanceOf[`clear-turquoise`]
  
  @js.native
  sealed trait `clear-violet` extends MediaColor
  @scala.inline
  def `clear-violet`: `clear-violet` = "clear-violet".asInstanceOf[`clear-violet`]
  
  @js.native
  sealed trait `clear-white` extends MediaColor
  @scala.inline
  def `clear-white`: `clear-white` = "clear-white".asInstanceOf[`clear-white`]
  
  @js.native
  sealed trait `clear-yellow` extends MediaColor
  @scala.inline
  def `clear-yellow`: `clear-yellow` = "clear-yellow".asInstanceOf[`clear-yellow`]
  
  @js.native
  sealed trait `client-error-account-authorization-failed` extends StatusCode
  @scala.inline
  def `client-error-account-authorization-failed`: `client-error-account-authorization-failed` = "client-error-account-authorization-failed".asInstanceOf[`client-error-account-authorization-failed`]
  
  @js.native
  sealed trait `client-error-account-closed` extends StatusCode
  @scala.inline
  def `client-error-account-closed`: `client-error-account-closed` = "client-error-account-closed".asInstanceOf[`client-error-account-closed`]
  
  @js.native
  sealed trait `client-error-account-info-needed` extends StatusCode
  @scala.inline
  def `client-error-account-info-needed`: `client-error-account-info-needed` = "client-error-account-info-needed".asInstanceOf[`client-error-account-info-needed`]
  
  @js.native
  sealed trait `client-error-account-limit-reached` extends StatusCode
  @scala.inline
  def `client-error-account-limit-reached`: `client-error-account-limit-reached` = "client-error-account-limit-reached".asInstanceOf[`client-error-account-limit-reached`]
  
  @js.native
  sealed trait `client-error-attributes-not-settable` extends StatusCode
  @scala.inline
  def `client-error-attributes-not-settable`: `client-error-attributes-not-settable` = "client-error-attributes-not-settable".asInstanceOf[`client-error-attributes-not-settable`]
  
  @js.native
  sealed trait `client-error-attributes-or-values-not-supported` extends StatusCode
  @scala.inline
  def `client-error-attributes-or-values-not-supported`: `client-error-attributes-or-values-not-supported` = "client-error-attributes-or-values-not-supported".asInstanceOf[`client-error-attributes-or-values-not-supported`]
  
  @js.native
  sealed trait `client-error-bad-request` extends StatusCode
  @scala.inline
  def `client-error-bad-request`: `client-error-bad-request` = "client-error-bad-request".asInstanceOf[`client-error-bad-request`]
  
  @js.native
  sealed trait `client-error-charset-not-supported` extends StatusCode
  @scala.inline
  def `client-error-charset-not-supported`: `client-error-charset-not-supported` = "client-error-charset-not-supported".asInstanceOf[`client-error-charset-not-supported`]
  
  @js.native
  sealed trait `client-error-compression-error` extends StatusCode
  @scala.inline
  def `client-error-compression-error`: `client-error-compression-error` = "client-error-compression-error".asInstanceOf[`client-error-compression-error`]
  
  @js.native
  sealed trait `client-error-compression-not-supported` extends StatusCode
  @scala.inline
  def `client-error-compression-not-supported`: `client-error-compression-not-supported` = "client-error-compression-not-supported".asInstanceOf[`client-error-compression-not-supported`]
  
  @js.native
  sealed trait `client-error-conflicting-attributes` extends StatusCode
  @scala.inline
  def `client-error-conflicting-attributes`: `client-error-conflicting-attributes` = "client-error-conflicting-attributes".asInstanceOf[`client-error-conflicting-attributes`]
  
  @js.native
  sealed trait `client-error-document-access-error` extends StatusCode
  @scala.inline
  def `client-error-document-access-error`: `client-error-document-access-error` = "client-error-document-access-error".asInstanceOf[`client-error-document-access-error`]
  
  @js.native
  sealed trait `client-error-document-format-error` extends StatusCode
  @scala.inline
  def `client-error-document-format-error`: `client-error-document-format-error` = "client-error-document-format-error".asInstanceOf[`client-error-document-format-error`]
  
  @js.native
  sealed trait `client-error-document-format-not-supported` extends StatusCode
  @scala.inline
  def `client-error-document-format-not-supported`: `client-error-document-format-not-supported` = "client-error-document-format-not-supported".asInstanceOf[`client-error-document-format-not-supported`]
  
  @js.native
  sealed trait `client-error-document-password-error` extends StatusCode
  @scala.inline
  def `client-error-document-password-error`: `client-error-document-password-error` = "client-error-document-password-error".asInstanceOf[`client-error-document-password-error`]
  
  @js.native
  sealed trait `client-error-document-permission-error` extends StatusCode
  @scala.inline
  def `client-error-document-permission-error`: `client-error-document-permission-error` = "client-error-document-permission-error".asInstanceOf[`client-error-document-permission-error`]
  
  @js.native
  sealed trait `client-error-document-security-error` extends StatusCode
  @scala.inline
  def `client-error-document-security-error`: `client-error-document-security-error` = "client-error-document-security-error".asInstanceOf[`client-error-document-security-error`]
  
  @js.native
  sealed trait `client-error-document-unprintable-error` extends StatusCode
  @scala.inline
  def `client-error-document-unprintable-error`: `client-error-document-unprintable-error` = "client-error-document-unprintable-error".asInstanceOf[`client-error-document-unprintable-error`]
  
  @js.native
  sealed trait `client-error-forbidden` extends StatusCode
  @scala.inline
  def `client-error-forbidden`: `client-error-forbidden` = "client-error-forbidden".asInstanceOf[`client-error-forbidden`]
  
  @js.native
  sealed trait `client-error-gone` extends StatusCode
  @scala.inline
  def `client-error-gone`: `client-error-gone` = "client-error-gone".asInstanceOf[`client-error-gone`]
  
  @js.native
  sealed trait `client-error-ignored-all-subscriptions` extends StatusCode
  @scala.inline
  def `client-error-ignored-all-subscriptions`: `client-error-ignored-all-subscriptions` = "client-error-ignored-all-subscriptions".asInstanceOf[`client-error-ignored-all-subscriptions`]
  
  @js.native
  sealed trait `client-error-not-authenticated` extends StatusCode
  @scala.inline
  def `client-error-not-authenticated`: `client-error-not-authenticated` = "client-error-not-authenticated".asInstanceOf[`client-error-not-authenticated`]
  
  @js.native
  sealed trait `client-error-not-authorized` extends StatusCode
  @scala.inline
  def `client-error-not-authorized`: `client-error-not-authorized` = "client-error-not-authorized".asInstanceOf[`client-error-not-authorized`]
  
  @js.native
  sealed trait `client-error-not-fetchable` extends StatusCode
  @scala.inline
  def `client-error-not-fetchable`: `client-error-not-fetchable` = "client-error-not-fetchable".asInstanceOf[`client-error-not-fetchable`]
  
  @js.native
  sealed trait `client-error-not-found` extends StatusCode
  @scala.inline
  def `client-error-not-found`: `client-error-not-found` = "client-error-not-found".asInstanceOf[`client-error-not-found`]
  
  @js.native
  sealed trait `client-error-not-possible` extends StatusCode
  @scala.inline
  def `client-error-not-possible`: `client-error-not-possible` = "client-error-not-possible".asInstanceOf[`client-error-not-possible`]
  
  @js.native
  sealed trait `client-error-request-entity-too-large` extends StatusCode
  @scala.inline
  def `client-error-request-entity-too-large`: `client-error-request-entity-too-large` = "client-error-request-entity-too-large".asInstanceOf[`client-error-request-entity-too-large`]
  
  @js.native
  sealed trait `client-error-request-value-too-long` extends StatusCode
  @scala.inline
  def `client-error-request-value-too-long`: `client-error-request-value-too-long` = "client-error-request-value-too-long".asInstanceOf[`client-error-request-value-too-long`]
  
  @js.native
  sealed trait `client-error-timeout` extends StatusCode
  @scala.inline
  def `client-error-timeout`: `client-error-timeout` = "client-error-timeout".asInstanceOf[`client-error-timeout`]
  
  @js.native
  sealed trait `client-error-too-many-subscriptions` extends StatusCode
  @scala.inline
  def `client-error-too-many-subscriptions`: `client-error-too-many-subscriptions` = "client-error-too-many-subscriptions".asInstanceOf[`client-error-too-many-subscriptions`]
  
  @js.native
  sealed trait `client-error-uri-scheme-not-supported` extends StatusCode
  @scala.inline
  def `client-error-uri-scheme-not-supported`: `client-error-uri-scheme-not-supported` = "client-error-uri-scheme-not-supported".asInstanceOf[`client-error-uri-scheme-not-supported`]
  
  @js.native
  sealed trait cmyk extends StObject
  @scala.inline
  def cmyk: cmyk = "cmyk".asInstanceOf[cmyk]
  
  @js.native
  sealed trait cmyk_16
    extends InputColorMode
       with PwgRasterDocumentTypeSupported
  @scala.inline
  def cmyk_16: cmyk_16 = "cmyk_16".asInstanceOf[cmyk_16]
  
  @js.native
  sealed trait cmyk_8
    extends InputColorMode
       with PwgRasterDocumentTypeSupported
  @scala.inline
  def cmyk_8: cmyk_8 = "cmyk_8".asInstanceOf[cmyk_8]
  
  @js.native
  sealed trait coap extends UriSchemes
  @scala.inline
  def coap: coap = "coap".asInstanceOf[coap]
  
  @js.native
  sealed trait coapPlussigntcp extends UriSchemes
  @scala.inline
  def coapPlussigntcp: coapPlussigntcp = "coap+tcp".asInstanceOf[coapPlussigntcp]
  
  @js.native
  sealed trait coapPlussignws extends UriSchemes
  @scala.inline
  def coapPlussignws: coapPlussignws = "coap+ws".asInstanceOf[coapPlussignws]
  
  @js.native
  sealed trait coaps extends UriSchemes
  @scala.inline
  def coaps: coaps = "coaps".asInstanceOf[coaps]
  
  @js.native
  sealed trait coapsPlussigntcp extends UriSchemes
  @scala.inline
  def coapsPlussigntcp: coapsPlussigntcp = "coaps+tcp".asInstanceOf[coapsPlussigntcp]
  
  @js.native
  sealed trait coapsPlussignws extends UriSchemes
  @scala.inline
  def coapsPlussignws: coapsPlussignws = "coaps+ws".asInstanceOf[coapsPlussignws]
  
  @js.native
  sealed trait coarse extends MediaTooth
  @scala.inline
  def coarse: coarse = "coarse".asInstanceOf[coarse]
  
  @js.native
  sealed trait coat extends Finishings
  @scala.inline
  def coat: coat = "coat".asInstanceOf[coat]
  
  @js.native
  sealed trait coating extends StObject
  @scala.inline
  def coating: coating = "coating".asInstanceOf[coating]
  
  @js.native
  sealed trait `coating-sides-supported` extends StObject
  @scala.inline
  def `coating-sides-supported`: `coating-sides-supported` = "coating-sides-supported".asInstanceOf[`coating-sides-supported`]
  
  @js.native
  sealed trait `coating-type-supported` extends StObject
  @scala.inline
  def `coating-type-supported`: `coating-type-supported` = "coating-type-supported".asInstanceOf[`coating-type-supported`]
  
  @js.native
  sealed trait collated extends StObject
  @scala.inline
  def collated: collated = "collated".asInstanceOf[collated]
  
  @js.native
  sealed trait color
    extends InputColorMode
       with PrintColorMode
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait `color-negative-film` extends InputFilmScanMode
  @scala.inline
  def `color-negative-film`: `color-negative-film` = "color-negative-film".asInstanceOf[`color-negative-film`]
  
  @js.native
  sealed trait `color-slide-film` extends InputFilmScanMode
  @scala.inline
  def `color-slide-film`: `color-slide-film` = "color-slide-film".asInstanceOf[`color-slide-film`]
  
  @js.native
  sealed trait `color-supported` extends StObject
  @scala.inline
  def `color-supported`: `color-supported` = "color-supported".asInstanceOf[`color-supported`]
  
  @js.native
  sealed trait color_8 extends InputColorMode
  @scala.inline
  def color_8: color_8 = "color_8".asInstanceOf[color_8]
  
  @js.native
  sealed trait `com-eventbrite-attendee` extends UriSchemes
  @scala.inline
  def `com-eventbrite-attendee`: `com-eventbrite-attendee` = "com-eventbrite-attendee".asInstanceOf[`com-eventbrite-attendee`]
  
  @js.native
  sealed trait comb extends BindingType
  @scala.inline
  def comb: comb = "comb".asInstanceOf[comb]
  
  @js.native
  sealed trait completed
    extends DocumentState
       with JobState
       with TransmissionStatus
       with WhichJobs
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait `completed-successfully` extends DocumentStateReasons
  @scala.inline
  def `completed-successfully`: `completed-successfully` = "completed-successfully".asInstanceOf[`completed-successfully`]
  
  @js.native
  sealed trait `completed-with-errors` extends DocumentStateReasons
  @scala.inline
  def `completed-with-errors`: `completed-with-errors` = "completed-with-errors".asInstanceOf[`completed-with-errors`]
  
  @js.native
  sealed trait `completed-with-warnings` extends DocumentStateReasons
  @scala.inline
  def `completed-with-warnings`: `completed-with-warnings` = "completed-with-warnings".asInstanceOf[`completed-with-warnings`]
  
  @js.native
  sealed trait compress extends Compression
  @scala.inline
  def compress: compress = "compress".asInstanceOf[compress]
  
  @js.native
  sealed trait `compression-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `compression-error`: `compression-error` = "compression-error".asInstanceOf[`compression-error`]
  
  @js.native
  sealed trait `compression-supplied` extends StObject
  @scala.inline
  def `compression-supplied`: `compression-supplied` = "compression-supplied".asInstanceOf[`compression-supplied`]
  
  @js.native
  sealed trait `compression-supported` extends StObject
  @scala.inline
  def `compression-supported`: `compression-supported` = "compression-supported".asInstanceOf[`compression-supported`]
  
  @js.native
  sealed trait `configuration-change` extends PrinterStateReasons
  @scala.inline
  def `configuration-change`: `configuration-change` = "configuration-change".asInstanceOf[`configuration-change`]
  
  @js.native
  sealed trait `confirmation-sheet-print` extends Overrides
  @scala.inline
  def `confirmation-sheet-print`: `confirmation-sheet-print` = "confirmation-sheet-print".asInstanceOf[`confirmation-sheet-print`]
  
  @js.native
  sealed trait `confirmation-sheet-print-default` extends StObject
  @scala.inline
  def `confirmation-sheet-print-default`: `confirmation-sheet-print-default` = "confirmation-sheet-print-default".asInstanceOf[`confirmation-sheet-print-default`]
  
  @js.native
  sealed trait `connecting-to-device` extends PrinterStateReasons
  @scala.inline
  def `connecting-to-device`: `connecting-to-device` = "connecting-to-device".asInstanceOf[`connecting-to-device`]
  
  @js.native
  sealed trait content extends UriSchemes
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait conti extends UriSchemes
  @scala.inline
  def conti: conti = "conti".asInstanceOf[conti]
  
  @js.native
  sealed trait `continue-job` extends JobErrorAction
  @scala.inline
  def `continue-job`: `continue-job` = "continue-job".asInstanceOf[`continue-job`]
  
  @js.native
  sealed trait continuous extends MediaType
  @scala.inline
  def continuous: continuous = "continuous".asInstanceOf[continuous]
  
  @js.native
  sealed trait `continuous-long` extends MediaType
  @scala.inline
  def `continuous-long`: `continuous-long` = "continuous-long".asInstanceOf[`continuous-long`]
  
  @js.native
  sealed trait `continuous-short` extends MediaType
  @scala.inline
  def `continuous-short`: `continuous-short` = "continuous-short".asInstanceOf[`continuous-short`]
  
  @js.native
  sealed trait copies extends Overrides
  @scala.inline
  def copies: copies = "copies".asInstanceOf[copies]
  
  @js.native
  sealed trait `copies-actual` extends StObject
  @scala.inline
  def `copies-actual`: `copies-actual` = "copies-actual".asInstanceOf[`copies-actual`]
  
  @js.native
  sealed trait `copies-default` extends StObject
  @scala.inline
  def `copies-default`: `copies-default` = "copies-default".asInstanceOf[`copies-default`]
  
  @js.native
  sealed trait `copies-supported` extends StObject
  @scala.inline
  def `copies-supported`: `copies-supported` = "copies-supported".asInstanceOf[`copies-supported`]
  
  @js.native
  sealed trait copy extends PrinterServiceType
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait `corrugated-board` extends MediaType
  @scala.inline
  def `corrugated-board`: `corrugated-board` = "corrugated-board".asInstanceOf[`corrugated-board`]
  
  @js.native
  sealed trait cover extends Finishings
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait `cover-back` extends Overrides
  @scala.inline
  def `cover-back`: `cover-back` = "cover-back".asInstanceOf[`cover-back`]
  
  @js.native
  sealed trait `cover-back-actual` extends StObject
  @scala.inline
  def `cover-back-actual`: `cover-back-actual` = "cover-back-actual".asInstanceOf[`cover-back-actual`]
  
  @js.native
  sealed trait `cover-back-default` extends StObject
  @scala.inline
  def `cover-back-default`: `cover-back-default` = "cover-back-default".asInstanceOf[`cover-back-default`]
  
  @js.native
  sealed trait `cover-back-supported` extends StObject
  @scala.inline
  def `cover-back-supported`: `cover-back-supported` = "cover-back-supported".asInstanceOf[`cover-back-supported`]
  
  @js.native
  sealed trait `cover-front` extends Overrides
  @scala.inline
  def `cover-front`: `cover-front` = "cover-front".asInstanceOf[`cover-front`]
  
  @js.native
  sealed trait `cover-front-actual` extends StObject
  @scala.inline
  def `cover-front-actual`: `cover-front-actual` = "cover-front-actual".asInstanceOf[`cover-front-actual`]
  
  @js.native
  sealed trait `cover-front-default` extends StObject
  @scala.inline
  def `cover-front-default`: `cover-front-default` = "cover-front-default".asInstanceOf[`cover-front-default`]
  
  @js.native
  sealed trait `cover-front-supported` extends StObject
  @scala.inline
  def `cover-front-supported`: `cover-front-supported` = "cover-front-supported".asInstanceOf[`cover-front-supported`]
  
  @js.native
  sealed trait `cover-open` extends PrinterStateReasons
  @scala.inline
  def `cover-open`: `cover-open` = "cover-open".asInstanceOf[`cover-open`]
  
  @js.native
  sealed trait `cover-sheet-info` extends Overrides
  @scala.inline
  def `cover-sheet-info`: `cover-sheet-info` = "cover-sheet-info".asInstanceOf[`cover-sheet-info`]
  
  @js.native
  sealed trait `cover-sheet-info-default` extends StObject
  @scala.inline
  def `cover-sheet-info-default`: `cover-sheet-info-default` = "cover-sheet-info-default".asInstanceOf[`cover-sheet-info-default`]
  
  @js.native
  sealed trait `cover-sheet-info-supported` extends StObject
  @scala.inline
  def `cover-sheet-info-supported`: `cover-sheet-info-supported` = "cover-sheet-info-supported".asInstanceOf[`cover-sheet-info-supported`]
  
  @js.native
  sealed trait covering extends StObject
  @scala.inline
  def covering: covering = "covering".asInstanceOf[covering]
  
  @js.native
  sealed trait `covering-name-supported` extends StObject
  @scala.inline
  def `covering-name-supported`: `covering-name-supported` = "covering-name-supported".asInstanceOf[`covering-name-supported`]
  
  @js.native
  sealed trait cp866 extends CharacterSet
  @scala.inline
  def cp866: cp866 = "cp866".asInstanceOf[cp866]
  
  @js.native
  sealed trait crid extends UriSchemes
  @scala.inline
  def crid: crid = "crid".asInstanceOf[crid]
  
  @js.native
  sealed trait crimp extends StitchingMethod
  @scala.inline
  def crimp: crimp = "crimp".asInstanceOf[crimp]
  
  @js.native
  sealed trait csISO2022JP extends CharacterSet
  @scala.inline
  def csISO2022JP: csISO2022JP = "csISO2022JP".asInstanceOf[csISO2022JP]
  
  @js.native
  sealed trait cvs extends UriSchemes
  @scala.inline
  def cvs: cvs = "cvs".asInstanceOf[cvs]
  
  @js.native
  sealed trait `cxsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `cxsynchro-translucent`: `cxsynchro-translucent` = "cxsynchro-translucent".asInstanceOf[`cxsynchro-translucent`]
  
  @js.native
  sealed trait `cxsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `cxsynchro-transparent`: `cxsynchro-transparent` = "cxsynchro-transparent".asInstanceOf[`cxsynchro-transparent`]
  
  @js.native
  sealed trait `cxsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `cxsynchro-white`: `cxsynchro-white` = "cxsynchro-white".asInstanceOf[`cxsynchro-white`]
  
  @js.native
  sealed trait cyan extends MediaColor
  @scala.inline
  def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait d
    extends Media
       with MediaSizeName
  @scala.inline
  def d: d = "d".asInstanceOf[d]
  
  @js.native
  sealed trait `d-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `d-translucent`: `d-translucent` = "d-translucent".asInstanceOf[`d-translucent`]
  
  @js.native
  sealed trait `d-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `d-transparent`: `d-transparent` = "d-transparent".asInstanceOf[`d-transparent`]
  
  @js.native
  sealed trait `d-white`
    extends Media
       with MediaName
  @scala.inline
  def `d-white`: `d-white` = "d-white".asInstanceOf[`d-white`]
  
  @js.native
  sealed trait dab extends UriSchemes
  @scala.inline
  def dab: dab = "dab".asInstanceOf[dab]
  
  @js.native
  sealed trait `dark-blue` extends MediaColor
  @scala.inline
  def `dark-blue`: `dark-blue` = "dark-blue".asInstanceOf[`dark-blue`]
  
  @js.native
  sealed trait `dark-brown` extends MediaColor
  @scala.inline
  def `dark-brown`: `dark-brown` = "dark-brown".asInstanceOf[`dark-brown`]
  
  @js.native
  sealed trait `dark-buff` extends MediaColor
  @scala.inline
  def `dark-buff`: `dark-buff` = "dark-buff".asInstanceOf[`dark-buff`]
  
  @js.native
  sealed trait `dark-cyan` extends MediaColor
  @scala.inline
  def `dark-cyan`: `dark-cyan` = "dark-cyan".asInstanceOf[`dark-cyan`]
  
  @js.native
  sealed trait `dark-gold` extends MediaColor
  @scala.inline
  def `dark-gold`: `dark-gold` = "dark-gold".asInstanceOf[`dark-gold`]
  
  @js.native
  sealed trait `dark-goldenrod` extends MediaColor
  @scala.inline
  def `dark-goldenrod`: `dark-goldenrod` = "dark-goldenrod".asInstanceOf[`dark-goldenrod`]
  
  @js.native
  sealed trait `dark-gray` extends MediaColor
  @scala.inline
  def `dark-gray`: `dark-gray` = "dark-gray".asInstanceOf[`dark-gray`]
  
  @js.native
  sealed trait `dark-green` extends MediaColor
  @scala.inline
  def `dark-green`: `dark-green` = "dark-green".asInstanceOf[`dark-green`]
  
  @js.native
  sealed trait `dark-ivory` extends MediaColor
  @scala.inline
  def `dark-ivory`: `dark-ivory` = "dark-ivory".asInstanceOf[`dark-ivory`]
  
  @js.native
  sealed trait `dark-magenta` extends MediaColor
  @scala.inline
  def `dark-magenta`: `dark-magenta` = "dark-magenta".asInstanceOf[`dark-magenta`]
  
  @js.native
  sealed trait `dark-mustard` extends MediaColor
  @scala.inline
  def `dark-mustard`: `dark-mustard` = "dark-mustard".asInstanceOf[`dark-mustard`]
  
  @js.native
  sealed trait `dark-orange` extends MediaColor
  @scala.inline
  def `dark-orange`: `dark-orange` = "dark-orange".asInstanceOf[`dark-orange`]
  
  @js.native
  sealed trait `dark-pink` extends MediaColor
  @scala.inline
  def `dark-pink`: `dark-pink` = "dark-pink".asInstanceOf[`dark-pink`]
  
  @js.native
  sealed trait `dark-red` extends MediaColor
  @scala.inline
  def `dark-red`: `dark-red` = "dark-red".asInstanceOf[`dark-red`]
  
  @js.native
  sealed trait `dark-silver` extends MediaColor
  @scala.inline
  def `dark-silver`: `dark-silver` = "dark-silver".asInstanceOf[`dark-silver`]
  
  @js.native
  sealed trait `dark-turquoise` extends MediaColor
  @scala.inline
  def `dark-turquoise`: `dark-turquoise` = "dark-turquoise".asInstanceOf[`dark-turquoise`]
  
  @js.native
  sealed trait `dark-violet` extends MediaColor
  @scala.inline
  def `dark-violet`: `dark-violet` = "dark-violet".asInstanceOf[`dark-violet`]
  
  @js.native
  sealed trait `dark-yellow` extends MediaColor
  @scala.inline
  def `dark-yellow`: `dark-yellow` = "dark-yellow".asInstanceOf[`dark-yellow`]
  
  @js.native
  sealed trait data extends UriSchemes
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait `data-insufficient` extends DocumentStateReasons
  @scala.inline
  def `data-insufficient`: `data-insufficient` = "data-insufficient".asInstanceOf[`data-insufficient`]
  
  @js.native
  sealed trait `date-time-at-completed` extends StObject
  @scala.inline
  def `date-time-at-completed`: `date-time-at-completed` = "date-time-at-completed".asInstanceOf[`date-time-at-completed`]
  
  @js.native
  sealed trait `date-time-at-creation` extends StObject
  @scala.inline
  def `date-time-at-creation`: `date-time-at-creation` = "date-time-at-creation".asInstanceOf[`date-time-at-creation`]
  
  @js.native
  sealed trait `date-time-at-processing` extends StObject
  @scala.inline
  def `date-time-at-processing`: `date-time-at-processing` = "date-time-at-processing".asInstanceOf[`date-time-at-processing`]
  
  @js.native
  sealed trait dav extends UriSchemes
  @scala.inline
  def dav: dav = "dav".asInstanceOf[dav]
  
  @js.native
  sealed trait `day-time`
    extends JobDelayOutputUntil
       with JobHoldUntil
  @scala.inline
  def `day-time`: `day-time` = "day-time".asInstanceOf[`day-time`]
  
  @js.native
  sealed trait deactivated extends PrinterStateReasons
  @scala.inline
  def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  
  @js.native
  sealed trait deep extends StObject
  @scala.inline
  def deep: deep = "deep".asInstanceOf[deep]
  
  @js.native
  sealed trait deflate extends Compression
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  
  @js.native
  sealed trait `destination-accesses-supported` extends StObject
  @scala.inline
  def `destination-accesses-supported`: `destination-accesses-supported` = "destination-accesses-supported".asInstanceOf[`destination-accesses-supported`]
  
  @js.native
  sealed trait `destination-statuses` extends StObject
  @scala.inline
  def `destination-statuses`: `destination-statuses` = "destination-statuses".asInstanceOf[`destination-statuses`]
  
  @js.native
  sealed trait `destination-uri-ready` extends StObject
  @scala.inline
  def `destination-uri-ready`: `destination-uri-ready` = "destination-uri-ready".asInstanceOf[`destination-uri-ready`]
  
  @js.native
  sealed trait `destination-uri-schemes-supported` extends StObject
  @scala.inline
  def `destination-uri-schemes-supported`: `destination-uri-schemes-supported` = "destination-uri-schemes-supported".asInstanceOf[`destination-uri-schemes-supported`]
  
  @js.native
  sealed trait `destination-uris` extends Overrides
  @scala.inline
  def `destination-uris`: `destination-uris` = "destination-uris".asInstanceOf[`destination-uris`]
  
  @js.native
  sealed trait `destination-uris-supported` extends StObject
  @scala.inline
  def `destination-uris-supported`: `destination-uris-supported` = "destination-uris-supported".asInstanceOf[`destination-uris-supported`]
  
  @js.native
  sealed trait `developer-empty` extends PrinterStateReasons
  @scala.inline
  def `developer-empty`: `developer-empty` = "developer-empty".asInstanceOf[`developer-empty`]
  
  @js.native
  sealed trait `developer-low` extends PrinterStateReasons
  @scala.inline
  def `developer-low`: `developer-low` = "developer-low".asInstanceOf[`developer-low`]
  
  @js.native
  sealed trait device10_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device10_16: device10_16 = "device10_16".asInstanceOf[device10_16]
  
  @js.native
  sealed trait device10_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device10_8: device10_8 = "device10_8".asInstanceOf[device10_8]
  
  @js.native
  sealed trait device11_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device11_16: device11_16 = "device11_16".asInstanceOf[device11_16]
  
  @js.native
  sealed trait device11_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device11_8: device11_8 = "device11_8".asInstanceOf[device11_8]
  
  @js.native
  sealed trait device12_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device12_16: device12_16 = "device12_16".asInstanceOf[device12_16]
  
  @js.native
  sealed trait device12_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device12_8: device12_8 = "device12_8".asInstanceOf[device12_8]
  
  @js.native
  sealed trait device13_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device13_16: device13_16 = "device13_16".asInstanceOf[device13_16]
  
  @js.native
  sealed trait device13_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device13_8: device13_8 = "device13_8".asInstanceOf[device13_8]
  
  @js.native
  sealed trait device14_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device14_16: device14_16 = "device14_16".asInstanceOf[device14_16]
  
  @js.native
  sealed trait device14_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device14_8: device14_8 = "device14_8".asInstanceOf[device14_8]
  
  @js.native
  sealed trait device15_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device15_16: device15_16 = "device15_16".asInstanceOf[device15_16]
  
  @js.native
  sealed trait device15_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device15_8: device15_8 = "device15_8".asInstanceOf[device15_8]
  
  @js.native
  sealed trait device1_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device1_16: device1_16 = "device1_16".asInstanceOf[device1_16]
  
  @js.native
  sealed trait device1_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device1_8: device1_8 = "device1_8".asInstanceOf[device1_8]
  
  @js.native
  sealed trait device2_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device2_16: device2_16 = "device2_16".asInstanceOf[device2_16]
  
  @js.native
  sealed trait device2_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device2_8: device2_8 = "device2_8".asInstanceOf[device2_8]
  
  @js.native
  sealed trait device3_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device3_16: device3_16 = "device3_16".asInstanceOf[device3_16]
  
  @js.native
  sealed trait device3_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device3_8: device3_8 = "device3_8".asInstanceOf[device3_8]
  
  @js.native
  sealed trait device4_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device4_16: device4_16 = "device4_16".asInstanceOf[device4_16]
  
  @js.native
  sealed trait device4_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device4_8: device4_8 = "device4_8".asInstanceOf[device4_8]
  
  @js.native
  sealed trait device5_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device5_16: device5_16 = "device5_16".asInstanceOf[device5_16]
  
  @js.native
  sealed trait device5_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device5_8: device5_8 = "device5_8".asInstanceOf[device5_8]
  
  @js.native
  sealed trait device6_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device6_16: device6_16 = "device6_16".asInstanceOf[device6_16]
  
  @js.native
  sealed trait device6_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device6_8: device6_8 = "device6_8".asInstanceOf[device6_8]
  
  @js.native
  sealed trait device7_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device7_16: device7_16 = "device7_16".asInstanceOf[device7_16]
  
  @js.native
  sealed trait device7_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device7_8: device7_8 = "device7_8".asInstanceOf[device7_8]
  
  @js.native
  sealed trait device8_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device8_16: device8_16 = "device8_16".asInstanceOf[device8_16]
  
  @js.native
  sealed trait device8_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device8_8: device8_8 = "device8_8".asInstanceOf[device8_8]
  
  @js.native
  sealed trait device9_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device9_16: device9_16 = "device9_16".asInstanceOf[device9_16]
  
  @js.native
  sealed trait device9_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def device9_8: device9_8 = "device9_8".asInstanceOf[device9_8]
  
  @js.native
  sealed trait dhcp extends SystemTimeoutSource
  @scala.inline
  def dhcp: dhcp = "dhcp".asInstanceOf[dhcp]
  
  @js.native
  sealed trait diaspora extends UriSchemes
  @scala.inline
  def diaspora: diaspora = "diaspora".asInstanceOf[diaspora]
  
  @js.native
  sealed trait dict extends UriSchemes
  @scala.inline
  def dict: dict = "dict".asInstanceOf[dict]
  
  @js.native
  sealed trait did extends UriSchemes
  @scala.inline
  def did: did = "did".asInstanceOf[did]
  
  @js.native
  sealed trait `die-cutter-added` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-added`: `die-cutter-added` = "die-cutter-added".asInstanceOf[`die-cutter-added`]
  
  @js.native
  sealed trait `die-cutter-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-almost-empty`: `die-cutter-almost-empty` = "die-cutter-almost-empty".asInstanceOf[`die-cutter-almost-empty`]
  
  @js.native
  sealed trait `die-cutter-almost-full` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-almost-full`: `die-cutter-almost-full` = "die-cutter-almost-full".asInstanceOf[`die-cutter-almost-full`]
  
  @js.native
  sealed trait `die-cutter-at-limit` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-at-limit`: `die-cutter-at-limit` = "die-cutter-at-limit".asInstanceOf[`die-cutter-at-limit`]
  
  @js.native
  sealed trait `die-cutter-closed` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-closed`: `die-cutter-closed` = "die-cutter-closed".asInstanceOf[`die-cutter-closed`]
  
  @js.native
  sealed trait `die-cutter-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-configuration-change`: `die-cutter-configuration-change` = "die-cutter-configuration-change".asInstanceOf[`die-cutter-configuration-change`]
  
  @js.native
  sealed trait `die-cutter-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-cover-closed`: `die-cutter-cover-closed` = "die-cutter-cover-closed".asInstanceOf[`die-cutter-cover-closed`]
  
  @js.native
  sealed trait `die-cutter-cover-open` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-cover-open`: `die-cutter-cover-open` = "die-cutter-cover-open".asInstanceOf[`die-cutter-cover-open`]
  
  @js.native
  sealed trait `die-cutter-empty` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-empty`: `die-cutter-empty` = "die-cutter-empty".asInstanceOf[`die-cutter-empty`]
  
  @js.native
  sealed trait `die-cutter-full` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-full`: `die-cutter-full` = "die-cutter-full".asInstanceOf[`die-cutter-full`]
  
  @js.native
  sealed trait `die-cutter-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-interlock-closed`: `die-cutter-interlock-closed` = "die-cutter-interlock-closed".asInstanceOf[`die-cutter-interlock-closed`]
  
  @js.native
  sealed trait `die-cutter-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-interlock-open`: `die-cutter-interlock-open` = "die-cutter-interlock-open".asInstanceOf[`die-cutter-interlock-open`]
  
  @js.native
  sealed trait `die-cutter-jam` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-jam`: `die-cutter-jam` = "die-cutter-jam".asInstanceOf[`die-cutter-jam`]
  
  @js.native
  sealed trait `die-cutter-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-life-almost-over`: `die-cutter-life-almost-over` = "die-cutter-life-almost-over".asInstanceOf[`die-cutter-life-almost-over`]
  
  @js.native
  sealed trait `die-cutter-life-over` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-life-over`: `die-cutter-life-over` = "die-cutter-life-over".asInstanceOf[`die-cutter-life-over`]
  
  @js.native
  sealed trait `die-cutter-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-memory-exhausted`: `die-cutter-memory-exhausted` = "die-cutter-memory-exhausted".asInstanceOf[`die-cutter-memory-exhausted`]
  
  @js.native
  sealed trait `die-cutter-missing` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-missing`: `die-cutter-missing` = "die-cutter-missing".asInstanceOf[`die-cutter-missing`]
  
  @js.native
  sealed trait `die-cutter-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-motor-failure`: `die-cutter-motor-failure` = "die-cutter-motor-failure".asInstanceOf[`die-cutter-motor-failure`]
  
  @js.native
  sealed trait `die-cutter-near-limit` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-near-limit`: `die-cutter-near-limit` = "die-cutter-near-limit".asInstanceOf[`die-cutter-near-limit`]
  
  @js.native
  sealed trait `die-cutter-offline` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-offline`: `die-cutter-offline` = "die-cutter-offline".asInstanceOf[`die-cutter-offline`]
  
  @js.native
  sealed trait `die-cutter-opened` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-opened`: `die-cutter-opened` = "die-cutter-opened".asInstanceOf[`die-cutter-opened`]
  
  @js.native
  sealed trait `die-cutter-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-over-temperature`: `die-cutter-over-temperature` = "die-cutter-over-temperature".asInstanceOf[`die-cutter-over-temperature`]
  
  @js.native
  sealed trait `die-cutter-power-saver` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-power-saver`: `die-cutter-power-saver` = "die-cutter-power-saver".asInstanceOf[`die-cutter-power-saver`]
  
  @js.native
  sealed trait `die-cutter-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-recoverable-failure`: `die-cutter-recoverable-failure` = "die-cutter-recoverable-failure".asInstanceOf[`die-cutter-recoverable-failure`]
  
  @js.native
  sealed trait `die-cutter-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-recoverable-storage-error`: `die-cutter-recoverable-storage-error` = "die-cutter-recoverable-storage-error".asInstanceOf[`die-cutter-recoverable-storage-error`]
  
  @js.native
  sealed trait `die-cutter-removed` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-removed`: `die-cutter-removed` = "die-cutter-removed".asInstanceOf[`die-cutter-removed`]
  
  @js.native
  sealed trait `die-cutter-resource-added` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-resource-added`: `die-cutter-resource-added` = "die-cutter-resource-added".asInstanceOf[`die-cutter-resource-added`]
  
  @js.native
  sealed trait `die-cutter-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-resource-removed`: `die-cutter-resource-removed` = "die-cutter-resource-removed".asInstanceOf[`die-cutter-resource-removed`]
  
  @js.native
  sealed trait `die-cutter-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-thermistor-failure`: `die-cutter-thermistor-failure` = "die-cutter-thermistor-failure".asInstanceOf[`die-cutter-thermistor-failure`]
  
  @js.native
  sealed trait `die-cutter-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-timing-failure`: `die-cutter-timing-failure` = "die-cutter-timing-failure".asInstanceOf[`die-cutter-timing-failure`]
  
  @js.native
  sealed trait `die-cutter-turned-off` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-turned-off`: `die-cutter-turned-off` = "die-cutter-turned-off".asInstanceOf[`die-cutter-turned-off`]
  
  @js.native
  sealed trait `die-cutter-turned-on` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-turned-on`: `die-cutter-turned-on` = "die-cutter-turned-on".asInstanceOf[`die-cutter-turned-on`]
  
  @js.native
  sealed trait `die-cutter-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-under-temperature`: `die-cutter-under-temperature` = "die-cutter-under-temperature".asInstanceOf[`die-cutter-under-temperature`]
  
  @js.native
  sealed trait `die-cutter-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-unrecoverable-failure`: `die-cutter-unrecoverable-failure` = "die-cutter-unrecoverable-failure".asInstanceOf[`die-cutter-unrecoverable-failure`]
  
  @js.native
  sealed trait `die-cutter-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-unrecoverable-storage-error`: `die-cutter-unrecoverable-storage-error` = "die-cutter-unrecoverable-storage-error".asInstanceOf[`die-cutter-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `die-cutter-warming-up` extends PrinterStateReasons
  @scala.inline
  def `die-cutter-warming-up`: `die-cutter-warming-up` = "die-cutter-warming-up".asInstanceOf[`die-cutter-warming-up`]
  
  @js.native
  sealed trait digest extends XriAuthentication
  @scala.inline
  def digest: digest = "digest".asInstanceOf[digest]
  
  @js.native
  sealed trait `digital-signature-did-not-verify`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `digital-signature-did-not-verify`: `digital-signature-did-not-verify` = "digital-signature-did-not-verify".asInstanceOf[`digital-signature-did-not-verify`]
  
  @js.native
  sealed trait `digital-signature-type-not-supported`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `digital-signature-type-not-supported`: `digital-signature-type-not-supported` = "digital-signature-type-not-supported".asInstanceOf[`digital-signature-type-not-supported`]
  
  @js.native
  sealed trait `digital-signature-wait` extends DocumentStateReasons
  @scala.inline
  def `digital-signature-wait`: `digital-signature-wait` = "digital-signature-wait".asInstanceOf[`digital-signature-wait`]
  
  @js.native
  sealed trait dis extends UriSchemes
  @scala.inline
  def dis: dis = "dis".asInstanceOf[dis]
  
  @js.native
  sealed trait disc
    extends MediaSource
       with MediaType
       with PrinterKind
  @scala.inline
  def disc: disc = "disc".asInstanceOf[disc]
  
  @js.native
  sealed trait `disc-glossy` extends MediaType
  @scala.inline
  def `disc-glossy`: `disc-glossy` = "disc-glossy".asInstanceOf[`disc-glossy`]
  
  @js.native
  sealed trait `disc-high-gloss` extends MediaType
  @scala.inline
  def `disc-high-gloss`: `disc-high-gloss` = "disc-high-gloss".asInstanceOf[`disc-high-gloss`]
  
  @js.native
  sealed trait `disc-matte` extends MediaType
  @scala.inline
  def `disc-matte`: `disc-matte` = "disc-matte".asInstanceOf[`disc-matte`]
  
  @js.native
  sealed trait `disc-satin` extends MediaType
  @scala.inline
  def `disc-satin`: `disc-satin` = "disc-satin".asInstanceOf[`disc-satin`]
  
  @js.native
  sealed trait `disc-semi-gloss` extends MediaType
  @scala.inline
  def `disc-semi-gloss`: `disc-semi-gloss` = "disc-semi-gloss".asInstanceOf[`disc-semi-gloss`]
  
  @js.native
  sealed trait display extends IdentifyActions
  @scala.inline
  def display: display = "display".asInstanceOf[display]
  
  @js.native
  sealed trait `dlna-playcontainer` extends UriSchemes
  @scala.inline
  def `dlna-playcontainer`: `dlna-playcontainer` = "dlna-playcontainer".asInstanceOf[`dlna-playcontainer`]
  
  @js.native
  sealed trait `dlna-playsingle` extends UriSchemes
  @scala.inline
  def `dlna-playsingle`: `dlna-playsingle` = "dlna-playsingle".asInstanceOf[`dlna-playsingle`]
  
  @js.native
  sealed trait dns extends UriSchemes
  @scala.inline
  def dns: dns = "dns".asInstanceOf[dns]
  
  @js.native
  sealed trait dntp extends UriSchemes
  @scala.inline
  def dntp: dntp = "dntp".asInstanceOf[dntp]
  
  @js.native
  sealed trait document extends PrinterKind
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait `document-access-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `document-access-error`: `document-access-error` = "document-access-error".asInstanceOf[`document-access-error`]
  
  @js.native
  sealed trait `document-access-supported` extends StObject
  @scala.inline
  def `document-access-supported`: `document-access-supported` = "document-access-supported".asInstanceOf[`document-access-supported`]
  
  @js.native
  sealed trait `document-charset-default` extends StObject
  @scala.inline
  def `document-charset-default`: `document-charset-default` = "document-charset-default".asInstanceOf[`document-charset-default`]
  
  @js.native
  sealed trait `document-charset-supplied` extends StObject
  @scala.inline
  def `document-charset-supplied`: `document-charset-supplied` = "document-charset-supplied".asInstanceOf[`document-charset-supplied`]
  
  @js.native
  sealed trait `document-charset-supported` extends StObject
  @scala.inline
  def `document-charset-supported`: `document-charset-supported` = "document-charset-supported".asInstanceOf[`document-charset-supported`]
  
  @js.native
  sealed trait `document-copies` extends Overrides
  @scala.inline
  def `document-copies`: `document-copies` = "document-copies".asInstanceOf[`document-copies`]
  
  @js.native
  sealed trait `document-creation-attributes-supported` extends StObject
  @scala.inline
  def `document-creation-attributes-supported`: `document-creation-attributes-supported` = "document-creation-attributes-supported".asInstanceOf[`document-creation-attributes-supported`]
  
  @js.native
  sealed trait `document-digital-signature-default` extends StObject
  @scala.inline
  def `document-digital-signature-default`: `document-digital-signature-default` = "document-digital-signature-default".asInstanceOf[`document-digital-signature-default`]
  
  @js.native
  sealed trait `document-digital-signature-supplied` extends StObject
  @scala.inline
  def `document-digital-signature-supplied`: `document-digital-signature-supplied` = "document-digital-signature-supplied".asInstanceOf[`document-digital-signature-supplied`]
  
  @js.native
  sealed trait `document-digital-signature-supported` extends StObject
  @scala.inline
  def `document-digital-signature-supported`: `document-digital-signature-supported` = "document-digital-signature-supported".asInstanceOf[`document-digital-signature-supported`]
  
  @js.native
  sealed trait `document-format-default` extends StObject
  @scala.inline
  def `document-format-default`: `document-format-default` = "document-format-default".asInstanceOf[`document-format-default`]
  
  @js.native
  sealed trait `document-format-details-default` extends StObject
  @scala.inline
  def `document-format-details-default`: `document-format-details-default` = "document-format-details-default".asInstanceOf[`document-format-details-default`]
  
  @js.native
  sealed trait `document-format-details-supplied` extends StObject
  @scala.inline
  def `document-format-details-supplied`: `document-format-details-supplied` = "document-format-details-supplied".asInstanceOf[`document-format-details-supplied`]
  
  @js.native
  sealed trait `document-format-details-supported` extends StObject
  @scala.inline
  def `document-format-details-supported`: `document-format-details-supported` = "document-format-details-supported".asInstanceOf[`document-format-details-supported`]
  
  @js.native
  sealed trait `document-format-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `document-format-error`: `document-format-error` = "document-format-error".asInstanceOf[`document-format-error`]
  
  @js.native
  sealed trait `document-format-ready` extends StObject
  @scala.inline
  def `document-format-ready`: `document-format-ready` = "document-format-ready".asInstanceOf[`document-format-ready`]
  
  @js.native
  sealed trait `document-format-supplied` extends StObject
  @scala.inline
  def `document-format-supplied`: `document-format-supplied` = "document-format-supplied".asInstanceOf[`document-format-supplied`]
  
  @js.native
  sealed trait `document-format-supported` extends StObject
  @scala.inline
  def `document-format-supported`: `document-format-supported` = "document-format-supported".asInstanceOf[`document-format-supported`]
  
  @js.native
  sealed trait `document-format-version-default` extends StObject
  @scala.inline
  def `document-format-version-default`: `document-format-version-default` = "document-format-version-default".asInstanceOf[`document-format-version-default`]
  
  @js.native
  sealed trait `document-format-version-supplied` extends StObject
  @scala.inline
  def `document-format-version-supplied`: `document-format-version-supplied` = "document-format-version-supplied".asInstanceOf[`document-format-version-supplied`]
  
  @js.native
  sealed trait `document-format-version-supported` extends StObject
  @scala.inline
  def `document-format-version-supported`: `document-format-version-supported` = "document-format-version-supported".asInstanceOf[`document-format-version-supported`]
  
  @js.native
  sealed trait `document-message-supplied` extends StObject
  @scala.inline
  def `document-message-supplied`: `document-message-supplied` = "document-message-supplied".asInstanceOf[`document-message-supplied`]
  
  @js.native
  sealed trait `document-name-supplied` extends StObject
  @scala.inline
  def `document-name-supplied`: `document-name-supplied` = "document-name-supplied".asInstanceOf[`document-name-supplied`]
  
  @js.native
  sealed trait `document-natural-language-default` extends StObject
  @scala.inline
  def `document-natural-language-default`: `document-natural-language-default` = "document-natural-language-default".asInstanceOf[`document-natural-language-default`]
  
  @js.native
  sealed trait `document-natural-language-supplied` extends StObject
  @scala.inline
  def `document-natural-language-supplied`: `document-natural-language-supplied` = "document-natural-language-supplied".asInstanceOf[`document-natural-language-supplied`]
  
  @js.native
  sealed trait `document-natural-language-supported` extends StObject
  @scala.inline
  def `document-natural-language-supported`: `document-natural-language-supported` = "document-natural-language-supported".asInstanceOf[`document-natural-language-supported`]
  
  @js.native
  sealed trait `document-number` extends StObject
  @scala.inline
  def `document-number`: `document-number` = "document-number".asInstanceOf[`document-number`]
  
  @js.native
  sealed trait `document-numbers` extends Overrides
  @scala.inline
  def `document-numbers`: `document-numbers` = "document-numbers".asInstanceOf[`document-numbers`]
  
  @js.native
  sealed trait `document-object` extends StObject
  @scala.inline
  def `document-object`: `document-object` = "document-object".asInstanceOf[`document-object`]
  
  @js.native
  sealed trait `document-password-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `document-password-error`: `document-password-error` = "document-password-error".asInstanceOf[`document-password-error`]
  
  @js.native
  sealed trait `document-password-supported` extends StObject
  @scala.inline
  def `document-password-supported`: `document-password-supported` = "document-password-supported".asInstanceOf[`document-password-supported`]
  
  @js.native
  sealed trait `document-permission-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `document-permission-error`: `document-permission-error` = "document-permission-error".asInstanceOf[`document-permission-error`]
  
  @js.native
  sealed trait `document-privacy-attributes` extends StObject
  @scala.inline
  def `document-privacy-attributes`: `document-privacy-attributes` = "document-privacy-attributes".asInstanceOf[`document-privacy-attributes`]
  
  @js.native
  sealed trait `document-privacy-scope` extends StObject
  @scala.inline
  def `document-privacy-scope`: `document-privacy-scope` = "document-privacy-scope".asInstanceOf[`document-privacy-scope`]
  
  @js.native
  sealed trait `document-security-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `document-security-error`: `document-security-error` = "document-security-error".asInstanceOf[`document-security-error`]
  
  @js.native
  sealed trait `document-unprintable-error`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `document-unprintable-error`: `document-unprintable-error` = "document-unprintable-error".asInstanceOf[`document-unprintable-error`]
  
  @js.native
  sealed trait `door-open` extends PrinterStateReasons
  @scala.inline
  def `door-open`: `door-open` = "door-open".asInstanceOf[`door-open`]
  
  @js.native
  sealed trait `double-wall` extends MediaType
  @scala.inline
  def `double-wall`: `double-wall` = "double-wall".asInstanceOf[`double-wall`]
  
  @js.native
  sealed trait dpp extends UriSchemes
  @scala.inline
  def dpp: dpp = "dpp".asInstanceOf[dpp]
  
  @js.native
  sealed trait draft extends PrintQuality
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  
  @js.native
  sealed trait `draw-line` extends TrimmingType
  @scala.inline
  def `draw-line`: `draw-line` = "draw-line".asInstanceOf[`draw-line`]
  
  @js.native
  sealed trait drm extends UriSchemes
  @scala.inline
  def drm: drm = "drm".asInstanceOf[drm]
  
  @js.native
  sealed trait drop extends UriSchemes
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait `dry-film` extends MediaType
  @scala.inline
  def `dry-film`: `dry-film` = "dry-film".asInstanceOf[`dry-film`]
  
  @js.native
  sealed trait dss extends DocumentDigitalSignature
  @scala.inline
  def dss: dss = "dss".asInstanceOf[dss]
  
  @js.native
  sealed trait dtn extends UriSchemes
  @scala.inline
  def dtn: dtn = "dtn".asInstanceOf[dtn]
  
  @js.native
  sealed trait dvb extends UriSchemes
  @scala.inline
  def dvb: dvb = "dvb".asInstanceOf[dvb]
  
  @js.native
  sealed trait dvd extends MediaType
  @scala.inline
  def dvd: dvd = "dvd".asInstanceOf[dvd]
  
  @js.native
  sealed trait `dxsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `dxsynchro-translucent`: `dxsynchro-translucent` = "dxsynchro-translucent".asInstanceOf[`dxsynchro-translucent`]
  
  @js.native
  sealed trait `dxsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `dxsynchro-transparent`: `dxsynchro-transparent` = "dxsynchro-transparent".asInstanceOf[`dxsynchro-transparent`]
  
  @js.native
  sealed trait `dxsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `dxsynchro-white`: `dxsynchro-white` = "dxsynchro-white".asInstanceOf[`dxsynchro-white`]
  
  @js.native
  sealed trait e
    extends Media
       with MediaSizeName
  @scala.inline
  def e: e = "e".asInstanceOf[e]
  
  @js.native
  sealed trait `e-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `e-translucent`: `e-translucent` = "e-translucent".asInstanceOf[`e-translucent`]
  
  @js.native
  sealed trait `e-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `e-transparent`: `e-transparent` = "e-transparent".asInstanceOf[`e-transparent`]
  
  @js.native
  sealed trait `e-white`
    extends Media
       with MediaName
  @scala.inline
  def `e-white`: `e-white` = "e-white".asInstanceOf[`e-white`]
  
  @js.native
  sealed trait `ebcdic-cp-us` extends CharacterSet
  @scala.inline
  def `ebcdic-cp-us`: `ebcdic-cp-us` = "ebcdic-cp-us".asInstanceOf[`ebcdic-cp-us`]
  
  @js.native
  sealed trait ed2k extends UriSchemes
  @scala.inline
  def ed2k: ed2k = "ed2k".asInstanceOf[ed2k]
  
  @js.native
  sealed trait `edge-stitch` extends Finishings
  @scala.inline
  def `edge-stitch`: `edge-stitch` = "edge-stitch".asInstanceOf[`edge-stitch`]
  
  @js.native
  sealed trait `edge-stitch-bottom` extends Finishings
  @scala.inline
  def `edge-stitch-bottom`: `edge-stitch-bottom` = "edge-stitch-bottom".asInstanceOf[`edge-stitch-bottom`]
  
  @js.native
  sealed trait `edge-stitch-left` extends Finishings
  @scala.inline
  def `edge-stitch-left`: `edge-stitch-left` = "edge-stitch-left".asInstanceOf[`edge-stitch-left`]
  
  @js.native
  sealed trait `edge-stitch-right` extends Finishings
  @scala.inline
  def `edge-stitch-right`: `edge-stitch-right` = "edge-stitch-right".asInstanceOf[`edge-stitch-right`]
  
  @js.native
  sealed trait `edge-stitch-top` extends Finishings
  @scala.inline
  def `edge-stitch-top`: `edge-stitch-top` = "edge-stitch-top".asInstanceOf[`edge-stitch-top`]
  
  @js.native
  sealed trait elsi extends UriSchemes
  @scala.inline
  def elsi: elsi = "elsi".asInstanceOf[elsi]
  
  @js.native
  sealed trait `embossing-foil` extends MediaType
  @scala.inline
  def `embossing-foil`: `embossing-foil` = "embossing-foil".asInstanceOf[`embossing-foil`]
  
  @js.native
  sealed trait `end-board` extends MediaType
  @scala.inline
  def `end-board`: `end-board` = "end-board".asInstanceOf[`end-board`]
  
  @js.native
  sealed trait `end-of-day` extends JobRetainUntil
  @scala.inline
  def `end-of-day`: `end-of-day` = "end-of-day".asInstanceOf[`end-of-day`]
  
  @js.native
  sealed trait `end-of-month` extends JobRetainUntil
  @scala.inline
  def `end-of-month`: `end-of-month` = "end-of-month".asInstanceOf[`end-of-month`]
  
  @js.native
  sealed trait `end-of-week` extends JobRetainUntil
  @scala.inline
  def `end-of-week`: `end-of-week` = "end-of-week".asInstanceOf[`end-of-week`]
  
  @js.native
  sealed trait `end-sheet` extends SeparatorSheetsType
  @scala.inline
  def `end-sheet`: `end-sheet` = "end-sheet".asInstanceOf[`end-sheet`]
  
  @js.native
  sealed trait envelope
    extends Media
       with MediaIntputTray
       with MediaSource
       with MediaType
       with PrinterKind
  @scala.inline
  def envelope: envelope = "envelope".asInstanceOf[envelope]
  
  @js.native
  sealed trait `envelope-archival` extends MediaType
  @scala.inline
  def `envelope-archival`: `envelope-archival` = "envelope-archival".asInstanceOf[`envelope-archival`]
  
  @js.native
  sealed trait `envelope-bond` extends MediaType
  @scala.inline
  def `envelope-bond`: `envelope-bond` = "envelope-bond".asInstanceOf[`envelope-bond`]
  
  @js.native
  sealed trait `envelope-coated` extends MediaType
  @scala.inline
  def `envelope-coated`: `envelope-coated` = "envelope-coated".asInstanceOf[`envelope-coated`]
  
  @js.native
  sealed trait `envelope-cotton` extends MediaType
  @scala.inline
  def `envelope-cotton`: `envelope-cotton` = "envelope-cotton".asInstanceOf[`envelope-cotton`]
  
  @js.native
  sealed trait `envelope-fine` extends MediaType
  @scala.inline
  def `envelope-fine`: `envelope-fine` = "envelope-fine".asInstanceOf[`envelope-fine`]
  
  @js.native
  sealed trait `envelope-heavyweight` extends MediaType
  @scala.inline
  def `envelope-heavyweight`: `envelope-heavyweight` = "envelope-heavyweight".asInstanceOf[`envelope-heavyweight`]
  
  @js.native
  sealed trait `envelope-inkjet` extends MediaType
  @scala.inline
  def `envelope-inkjet`: `envelope-inkjet` = "envelope-inkjet".asInstanceOf[`envelope-inkjet`]
  
  @js.native
  sealed trait `envelope-lightweight` extends MediaType
  @scala.inline
  def `envelope-lightweight`: `envelope-lightweight` = "envelope-lightweight".asInstanceOf[`envelope-lightweight`]
  
  @js.native
  sealed trait `envelope-plain` extends MediaType
  @scala.inline
  def `envelope-plain`: `envelope-plain` = "envelope-plain".asInstanceOf[`envelope-plain`]
  
  @js.native
  sealed trait `envelope-preprinted` extends MediaType
  @scala.inline
  def `envelope-preprinted`: `envelope-preprinted` = "envelope-preprinted".asInstanceOf[`envelope-preprinted`]
  
  @js.native
  sealed trait `envelope-window` extends MediaType
  @scala.inline
  def `envelope-window`: `envelope-window` = "envelope-window".asInstanceOf[`envelope-window`]
  
  @js.native
  sealed trait `errors-count` extends StObject
  @scala.inline
  def `errors-count`: `errors-count` = "errors-count".asInstanceOf[`errors-count`]
  
  @js.native
  sealed trait `errors-detected`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `errors-detected`: `errors-detected` = "errors-detected".asInstanceOf[`errors-detected`]
  
  @js.native
  sealed trait `euc-kr` extends CharacterSet
  @scala.inline
  def `euc-kr`: `euc-kr` = "euc-kr".asInstanceOf[`euc-kr`]
  
  @js.native
  sealed trait evening
    extends JobDelayOutputUntil
       with JobHoldUntil
  @scala.inline
  def evening: evening = "evening".asInstanceOf[evening]
  
  @js.native
  sealed trait example extends UriSchemes
  @scala.inline
  def example: example = "example".asInstanceOf[example]
  
  @js.native
  sealed trait `executable-firmware` extends ResourceType
  @scala.inline
  def `executable-firmware`: `executable-firmware` = "executable-firmware".asInstanceOf[`executable-firmware`]
  
  @js.native
  sealed trait `executable-software` extends ResourceType
  @scala.inline
  def `executable-software`: `executable-software` = "executable-software".asInstanceOf[`executable-software`]
  
  @js.native
  sealed trait executive
    extends Media
       with MediaSizeName
  @scala.inline
  def executive: executive = "executive".asInstanceOf[executive]
  
  @js.native
  sealed trait `executive-white`
    extends Media
       with MediaName
  @scala.inline
  def `executive-white`: `executive-white` = "executive-white".asInstanceOf[`executive-white`]
  
  @js.native
  sealed trait `exsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `exsynchro-translucent`: `exsynchro-translucent` = "exsynchro-translucent".asInstanceOf[`exsynchro-translucent`]
  
  @js.native
  sealed trait `exsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `exsynchro-transparent`: `exsynchro-transparent` = "exsynchro-transparent".asInstanceOf[`exsynchro-transparent`]
  
  @js.native
  sealed trait `exsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `exsynchro-white`: `exsynchro-white` = "exsynchro-white".asInstanceOf[`exsynchro-white`]
  
  @js.native
  sealed trait f
    extends Media
       with MediaSizeName
  @scala.inline
  def f: f = "f".asInstanceOf[f]
  
  @js.native
  sealed trait fabric extends MediaType
  @scala.inline
  def fabric: fabric = "fabric".asInstanceOf[fabric]
  
  @js.native
  sealed trait `fabric-archival` extends MediaType
  @scala.inline
  def `fabric-archival`: `fabric-archival` = "fabric-archival".asInstanceOf[`fabric-archival`]
  
  @js.native
  sealed trait `fabric-glossy` extends MediaType
  @scala.inline
  def `fabric-glossy`: `fabric-glossy` = "fabric-glossy".asInstanceOf[`fabric-glossy`]
  
  @js.native
  sealed trait `fabric-high-gloss` extends MediaType
  @scala.inline
  def `fabric-high-gloss`: `fabric-high-gloss` = "fabric-high-gloss".asInstanceOf[`fabric-high-gloss`]
  
  @js.native
  sealed trait `fabric-matte` extends MediaType
  @scala.inline
  def `fabric-matte`: `fabric-matte` = "fabric-matte".asInstanceOf[`fabric-matte`]
  
  @js.native
  sealed trait `fabric-semi-gloss` extends MediaType
  @scala.inline
  def `fabric-semi-gloss`: `fabric-semi-gloss` = "fabric-semi-gloss".asInstanceOf[`fabric-semi-gloss`]
  
  @js.native
  sealed trait `fabric-waterproof` extends MediaType
  @scala.inline
  def `fabric-waterproof`: `fabric-waterproof` = "fabric-waterproof".asInstanceOf[`fabric-waterproof`]
  
  @js.native
  sealed trait `face-down` extends OutputBin
  @scala.inline
  def `face-down`: `face-down` = "face-down".asInstanceOf[`face-down`]
  
  @js.native
  sealed trait `face-up` extends OutputBin
  @scala.inline
  def `face-up`: `face-up` = "face-up".asInstanceOf[`face-up`]
  
  @js.native
  sealed trait facetime extends UriSchemes
  @scala.inline
  def facetime: facetime = "facetime".asInstanceOf[facetime]
  
  @js.native
  sealed trait fax extends UriSchemes
  @scala.inline
  def fax: fax = "fax".asInstanceOf[fax]
  
  @js.native
  sealed trait faxin extends PrinterServiceType
  @scala.inline
  def faxin: faxin = "faxin".asInstanceOf[faxin]
  
  @js.native
  sealed trait faxout extends PrinterServiceType
  @scala.inline
  def faxout: faxout = "faxout".asInstanceOf[faxout]
  
  @js.native
  sealed trait feed extends UriSchemes
  @scala.inline
  def feed: feed = "feed".asInstanceOf[feed]
  
  @js.native
  sealed trait `feed-orientation-default` extends StObject
  @scala.inline
  def `feed-orientation-default`: `feed-orientation-default` = "feed-orientation-default".asInstanceOf[`feed-orientation-default`]
  
  @js.native
  sealed trait `feed-orientation-supported` extends StObject
  @scala.inline
  def `feed-orientation-supported`: `feed-orientation-supported` = "feed-orientation-supported".asInstanceOf[`feed-orientation-supported`]
  
  @js.native
  sealed trait feedready extends UriSchemes
  @scala.inline
  def feedready: feedready = "feedready".asInstanceOf[feedready]
  
  @js.native
  sealed trait `fetch-document-attributes-supported` extends StObject
  @scala.inline
  def `fetch-document-attributes-supported`: `fetch-document-attributes-supported` = "fetch-document-attributes-supported".asInstanceOf[`fetch-document-attributes-supported`]
  
  @js.native
  sealed trait file extends UriSchemes
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait filesystem extends UriSchemes
  @scala.inline
  def filesystem: filesystem = "filesystem".asInstanceOf[filesystem]
  
  @js.native
  sealed trait fill extends PrintScaling
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait film extends MediaType
  @scala.inline
  def film: film = "film".asInstanceOf[film]
  
  @js.native
  sealed trait `film-reader` extends InputSource
  @scala.inline
  def `film-reader`: `film-reader` = "film-reader".asInstanceOf[`film-reader`]
  
  @js.native
  sealed trait fine extends MediaTooth
  @scala.inline
  def fine: fine = "fine".asInstanceOf[fine]
  
  @js.native
  sealed trait finger extends UriSchemes
  @scala.inline
  def finger: finger = "finger".asInstanceOf[finger]
  
  @js.native
  sealed trait `finishing-template` extends StObject
  @scala.inline
  def `finishing-template`: `finishing-template` = "finishing-template".asInstanceOf[`finishing-template`]
  
  @js.native
  sealed trait `finishing-template-supported` extends StObject
  @scala.inline
  def `finishing-template-supported`: `finishing-template-supported` = "finishing-template-supported".asInstanceOf[`finishing-template-supported`]
  
  @js.native
  sealed trait finishings extends Overrides
  @scala.inline
  def finishings: finishings = "finishings".asInstanceOf[finishings]
  
  @js.native
  sealed trait `finishings-actual` extends StObject
  @scala.inline
  def `finishings-actual`: `finishings-actual` = "finishings-actual".asInstanceOf[`finishings-actual`]
  
  @js.native
  sealed trait `finishings-col` extends Overrides
  @scala.inline
  def `finishings-col`: `finishings-col` = "finishings-col".asInstanceOf[`finishings-col`]
  
  @js.native
  sealed trait `finishings-col-actual` extends StObject
  @scala.inline
  def `finishings-col-actual`: `finishings-col-actual` = "finishings-col-actual".asInstanceOf[`finishings-col-actual`]
  
  @js.native
  sealed trait `finishings-col-database` extends StObject
  @scala.inline
  def `finishings-col-database`: `finishings-col-database` = "finishings-col-database".asInstanceOf[`finishings-col-database`]
  
  @js.native
  sealed trait `finishings-col-default` extends StObject
  @scala.inline
  def `finishings-col-default`: `finishings-col-default` = "finishings-col-default".asInstanceOf[`finishings-col-default`]
  
  @js.native
  sealed trait `finishings-col-ready` extends StObject
  @scala.inline
  def `finishings-col-ready`: `finishings-col-ready` = "finishings-col-ready".asInstanceOf[`finishings-col-ready`]
  
  @js.native
  sealed trait `finishings-col-supported` extends StObject
  @scala.inline
  def `finishings-col-supported`: `finishings-col-supported` = "finishings-col-supported".asInstanceOf[`finishings-col-supported`]
  
  @js.native
  sealed trait `finishings-default` extends StObject
  @scala.inline
  def `finishings-default`: `finishings-default` = "finishings-default".asInstanceOf[`finishings-default`]
  
  @js.native
  sealed trait `finishings-ready` extends StObject
  @scala.inline
  def `finishings-ready`: `finishings-ready` = "finishings-ready".asInstanceOf[`finishings-ready`]
  
  @js.native
  sealed trait `finishings-supported` extends StObject
  @scala.inline
  def `finishings-supported`: `finishings-supported` = "finishings-supported".asInstanceOf[`finishings-supported`]
  
  @js.native
  sealed trait `first-print-stream-page` extends JobSheets
  @scala.inline
  def `first-print-stream-page`: `first-print-stream-page` = "first-print-stream-page".asInstanceOf[`first-print-stream-page`]
  
  @js.native
  sealed trait `first-run-pen-experience` extends UriSchemes
  @scala.inline
  def `first-run-pen-experience`: `first-run-pen-experience` = "first-run-pen-experience".asInstanceOf[`first-run-pen-experience`]
  
  @js.native
  sealed trait fish extends UriSchemes
  @scala.inline
  def fish: fish = "fish".asInstanceOf[fish]
  
  @js.native
  sealed trait fit extends PrintScaling
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait flash extends IdentifyActions
  @scala.inline
  def flash: flash = "flash".asInstanceOf[flash]
  
  @js.native
  sealed trait flat extends BindingType
  @scala.inline
  def flat: flat = "flat".asInstanceOf[flat]
  
  @js.native
  sealed trait `flexo-base` extends MediaType
  @scala.inline
  def `flexo-base`: `flexo-base` = "flexo-base".asInstanceOf[`flexo-base`]
  
  @js.native
  sealed trait `flexo-photo-polymer` extends MediaType
  @scala.inline
  def `flexo-photo-polymer`: `flexo-photo-polymer` = "flexo-photo-polymer".asInstanceOf[`flexo-photo-polymer`]
  
  @js.native
  sealed trait flipped extends StObject
  @scala.inline
  def flipped: flipped = "flipped".asInstanceOf[flipped]
  
  @js.native
  sealed trait flute extends MediaType
  @scala.inline
  def flute: flute = "flute".asInstanceOf[flute]
  
  @js.native
  sealed trait fm extends UriSchemes
  @scala.inline
  def fm: fm = "fm".asInstanceOf[fm]
  
  @js.native
  sealed trait foil extends MediaType
  @scala.inline
  def foil: foil = "foil".asInstanceOf[foil]
  
  @js.native
  sealed trait fold extends Finishings
  @scala.inline
  def fold: fold = "fold".asInstanceOf[fold]
  
  @js.native
  sealed trait `fold-accordion` extends Finishings
  @scala.inline
  def `fold-accordion`: `fold-accordion` = "fold-accordion".asInstanceOf[`fold-accordion`]
  
  @js.native
  sealed trait `fold-double-gate` extends Finishings
  @scala.inline
  def `fold-double-gate`: `fold-double-gate` = "fold-double-gate".asInstanceOf[`fold-double-gate`]
  
  @js.native
  sealed trait `fold-engineering-z` extends Finishings
  @scala.inline
  def `fold-engineering-z`: `fold-engineering-z` = "fold-engineering-z".asInstanceOf[`fold-engineering-z`]
  
  @js.native
  sealed trait `fold-gate` extends Finishings
  @scala.inline
  def `fold-gate`: `fold-gate` = "fold-gate".asInstanceOf[`fold-gate`]
  
  @js.native
  sealed trait `fold-half` extends Finishings
  @scala.inline
  def `fold-half`: `fold-half` = "fold-half".asInstanceOf[`fold-half`]
  
  @js.native
  sealed trait `fold-half-z` extends Finishings
  @scala.inline
  def `fold-half-z`: `fold-half-z` = "fold-half-z".asInstanceOf[`fold-half-z`]
  
  @js.native
  sealed trait `fold-left-gate` extends Finishings
  @scala.inline
  def `fold-left-gate`: `fold-left-gate` = "fold-left-gate".asInstanceOf[`fold-left-gate`]
  
  @js.native
  sealed trait `fold-letter` extends Finishings
  @scala.inline
  def `fold-letter`: `fold-letter` = "fold-letter".asInstanceOf[`fold-letter`]
  
  @js.native
  sealed trait `fold-parallel` extends Finishings
  @scala.inline
  def `fold-parallel`: `fold-parallel` = "fold-parallel".asInstanceOf[`fold-parallel`]
  
  @js.native
  sealed trait `fold-poster` extends Finishings
  @scala.inline
  def `fold-poster`: `fold-poster` = "fold-poster".asInstanceOf[`fold-poster`]
  
  @js.native
  sealed trait `fold-right-gate` extends Finishings
  @scala.inline
  def `fold-right-gate`: `fold-right-gate` = "fold-right-gate".asInstanceOf[`fold-right-gate`]
  
  @js.native
  sealed trait `fold-z` extends Finishings
  @scala.inline
  def `fold-z`: `fold-z` = "fold-z".asInstanceOf[`fold-z`]
  
  @js.native
  sealed trait `folder-added` extends PrinterStateReasons
  @scala.inline
  def `folder-added`: `folder-added` = "folder-added".asInstanceOf[`folder-added`]
  
  @js.native
  sealed trait `folder-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `folder-almost-empty`: `folder-almost-empty` = "folder-almost-empty".asInstanceOf[`folder-almost-empty`]
  
  @js.native
  sealed trait `folder-almost-full` extends PrinterStateReasons
  @scala.inline
  def `folder-almost-full`: `folder-almost-full` = "folder-almost-full".asInstanceOf[`folder-almost-full`]
  
  @js.native
  sealed trait `folder-at-limit` extends PrinterStateReasons
  @scala.inline
  def `folder-at-limit`: `folder-at-limit` = "folder-at-limit".asInstanceOf[`folder-at-limit`]
  
  @js.native
  sealed trait `folder-closed` extends PrinterStateReasons
  @scala.inline
  def `folder-closed`: `folder-closed` = "folder-closed".asInstanceOf[`folder-closed`]
  
  @js.native
  sealed trait `folder-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `folder-configuration-change`: `folder-configuration-change` = "folder-configuration-change".asInstanceOf[`folder-configuration-change`]
  
  @js.native
  sealed trait `folder-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `folder-cover-closed`: `folder-cover-closed` = "folder-cover-closed".asInstanceOf[`folder-cover-closed`]
  
  @js.native
  sealed trait `folder-cover-open` extends PrinterStateReasons
  @scala.inline
  def `folder-cover-open`: `folder-cover-open` = "folder-cover-open".asInstanceOf[`folder-cover-open`]
  
  @js.native
  sealed trait `folder-empty` extends PrinterStateReasons
  @scala.inline
  def `folder-empty`: `folder-empty` = "folder-empty".asInstanceOf[`folder-empty`]
  
  @js.native
  sealed trait `folder-full` extends PrinterStateReasons
  @scala.inline
  def `folder-full`: `folder-full` = "folder-full".asInstanceOf[`folder-full`]
  
  @js.native
  sealed trait `folder-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `folder-interlock-closed`: `folder-interlock-closed` = "folder-interlock-closed".asInstanceOf[`folder-interlock-closed`]
  
  @js.native
  sealed trait `folder-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `folder-interlock-open`: `folder-interlock-open` = "folder-interlock-open".asInstanceOf[`folder-interlock-open`]
  
  @js.native
  sealed trait `folder-jam` extends PrinterStateReasons
  @scala.inline
  def `folder-jam`: `folder-jam` = "folder-jam".asInstanceOf[`folder-jam`]
  
  @js.native
  sealed trait `folder-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `folder-life-almost-over`: `folder-life-almost-over` = "folder-life-almost-over".asInstanceOf[`folder-life-almost-over`]
  
  @js.native
  sealed trait `folder-life-over` extends PrinterStateReasons
  @scala.inline
  def `folder-life-over`: `folder-life-over` = "folder-life-over".asInstanceOf[`folder-life-over`]
  
  @js.native
  sealed trait `folder-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `folder-memory-exhausted`: `folder-memory-exhausted` = "folder-memory-exhausted".asInstanceOf[`folder-memory-exhausted`]
  
  @js.native
  sealed trait `folder-missing` extends PrinterStateReasons
  @scala.inline
  def `folder-missing`: `folder-missing` = "folder-missing".asInstanceOf[`folder-missing`]
  
  @js.native
  sealed trait `folder-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `folder-motor-failure`: `folder-motor-failure` = "folder-motor-failure".asInstanceOf[`folder-motor-failure`]
  
  @js.native
  sealed trait `folder-near-limit` extends PrinterStateReasons
  @scala.inline
  def `folder-near-limit`: `folder-near-limit` = "folder-near-limit".asInstanceOf[`folder-near-limit`]
  
  @js.native
  sealed trait `folder-offline` extends PrinterStateReasons
  @scala.inline
  def `folder-offline`: `folder-offline` = "folder-offline".asInstanceOf[`folder-offline`]
  
  @js.native
  sealed trait `folder-opened` extends PrinterStateReasons
  @scala.inline
  def `folder-opened`: `folder-opened` = "folder-opened".asInstanceOf[`folder-opened`]
  
  @js.native
  sealed trait `folder-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `folder-over-temperature`: `folder-over-temperature` = "folder-over-temperature".asInstanceOf[`folder-over-temperature`]
  
  @js.native
  sealed trait `folder-power-saver` extends PrinterStateReasons
  @scala.inline
  def `folder-power-saver`: `folder-power-saver` = "folder-power-saver".asInstanceOf[`folder-power-saver`]
  
  @js.native
  sealed trait `folder-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `folder-recoverable-failure`: `folder-recoverable-failure` = "folder-recoverable-failure".asInstanceOf[`folder-recoverable-failure`]
  
  @js.native
  sealed trait `folder-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `folder-recoverable-storage-error`: `folder-recoverable-storage-error` = "folder-recoverable-storage-error".asInstanceOf[`folder-recoverable-storage-error`]
  
  @js.native
  sealed trait `folder-removed` extends PrinterStateReasons
  @scala.inline
  def `folder-removed`: `folder-removed` = "folder-removed".asInstanceOf[`folder-removed`]
  
  @js.native
  sealed trait `folder-resource-added` extends PrinterStateReasons
  @scala.inline
  def `folder-resource-added`: `folder-resource-added` = "folder-resource-added".asInstanceOf[`folder-resource-added`]
  
  @js.native
  sealed trait `folder-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `folder-resource-removed`: `folder-resource-removed` = "folder-resource-removed".asInstanceOf[`folder-resource-removed`]
  
  @js.native
  sealed trait `folder-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `folder-thermistor-failure`: `folder-thermistor-failure` = "folder-thermistor-failure".asInstanceOf[`folder-thermistor-failure`]
  
  @js.native
  sealed trait `folder-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `folder-timing-failure`: `folder-timing-failure` = "folder-timing-failure".asInstanceOf[`folder-timing-failure`]
  
  @js.native
  sealed trait `folder-turned-off` extends PrinterStateReasons
  @scala.inline
  def `folder-turned-off`: `folder-turned-off` = "folder-turned-off".asInstanceOf[`folder-turned-off`]
  
  @js.native
  sealed trait `folder-turned-on` extends PrinterStateReasons
  @scala.inline
  def `folder-turned-on`: `folder-turned-on` = "folder-turned-on".asInstanceOf[`folder-turned-on`]
  
  @js.native
  sealed trait `folder-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `folder-under-temperature`: `folder-under-temperature` = "folder-under-temperature".asInstanceOf[`folder-under-temperature`]
  
  @js.native
  sealed trait `folder-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `folder-unrecoverable-failure`: `folder-unrecoverable-failure` = "folder-unrecoverable-failure".asInstanceOf[`folder-unrecoverable-failure`]
  
  @js.native
  sealed trait `folder-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `folder-unrecoverable-storage-error`: `folder-unrecoverable-storage-error` = "folder-unrecoverable-storage-error".asInstanceOf[`folder-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `folder-warming-up` extends PrinterStateReasons
  @scala.inline
  def `folder-warming-up`: `folder-warming-up` = "folder-warming-up".asInstanceOf[`folder-warming-up`]
  
  @js.native
  sealed trait folding extends StObject
  @scala.inline
  def folding: folding = "folding".asInstanceOf[folding]
  
  @js.native
  sealed trait `folding-direction-supported` extends StObject
  @scala.inline
  def `folding-direction-supported`: `folding-direction-supported` = "folding-direction-supported".asInstanceOf[`folding-direction-supported`]
  
  @js.native
  sealed trait `folding-offset-supported` extends StObject
  @scala.inline
  def `folding-offset-supported`: `folding-offset-supported` = "folding-offset-supported".asInstanceOf[`folding-offset-supported`]
  
  @js.native
  sealed trait `folding-reference-edge-supported` extends StObject
  @scala.inline
  def `folding-reference-edge-supported`: `folding-reference-edge-supported` = "folding-reference-edge-supported".asInstanceOf[`folding-reference-edge-supported`]
  
  @js.native
  sealed trait folio
    extends Media
       with MediaSizeName
  @scala.inline
  def folio: folio = "folio".asInstanceOf[folio]
  
  @js.native
  sealed trait `folio-white`
    extends Media
       with MediaName
  @scala.inline
  def `folio-white`: `folio-white` = "folio-white".asInstanceOf[`folio-white`]
  
  @js.native
  sealed trait `font-name-requested` extends Overrides
  @scala.inline
  def `font-name-requested`: `font-name-requested` = "font-name-requested".asInstanceOf[`font-name-requested`]
  
  @js.native
  sealed trait `font-name-requested-default` extends StObject
  @scala.inline
  def `font-name-requested-default`: `font-name-requested-default` = "font-name-requested-default".asInstanceOf[`font-name-requested-default`]
  
  @js.native
  sealed trait `font-name-requested-supported` extends StObject
  @scala.inline
  def `font-name-requested-supported`: `font-name-requested-supported` = "font-name-requested-supported".asInstanceOf[`font-name-requested-supported`]
  
  @js.native
  sealed trait `font-size-requested` extends Overrides
  @scala.inline
  def `font-size-requested`: `font-size-requested` = "font-size-requested".asInstanceOf[`font-size-requested`]
  
  @js.native
  sealed trait `font-size-requested-default` extends StObject
  @scala.inline
  def `font-size-requested-default`: `font-size-requested-default` = "font-size-requested-default".asInstanceOf[`font-size-requested-default`]
  
  @js.native
  sealed trait `font-size-requested-supported` extends StObject
  @scala.inline
  def `font-size-requested-supported`: `font-size-requested-supported` = "font-size-requested-supported".asInstanceOf[`font-size-requested-supported`]
  
  @js.native
  sealed trait `force-front-side` extends Overrides
  @scala.inline
  def `force-front-side`: `force-front-side` = "force-front-side".asInstanceOf[`force-front-side`]
  
  @js.native
  sealed trait `force-front-side-actual` extends StObject
  @scala.inline
  def `force-front-side-actual`: `force-front-side-actual` = "force-front-side-actual".asInstanceOf[`force-front-side-actual`]
  
  @js.native
  sealed trait `from-name-supported` extends StObject
  @scala.inline
  def `from-name-supported`: `from-name-supported` = "from-name-supported".asInstanceOf[`from-name-supported`]
  
  @js.native
  sealed trait front extends FinishingSides
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  
  @js.native
  sealed trait ftp extends UriSchemes
  @scala.inline
  def ftp: ftp = "ftp".asInstanceOf[ftp]
  
  @js.native
  sealed trait `fuchsia-pkg` extends UriSchemes
  @scala.inline
  def `fuchsia-pkg`: `fuchsia-pkg` = "fuchsia-pkg".asInstanceOf[`fuchsia-pkg`]
  
  @js.native
  sealed trait full extends TrimmingType
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait `full-cut-tabs` extends MediaType
  @scala.inline
  def `full-cut-tabs`: `full-cut-tabs` = "full-cut-tabs".asInstanceOf[`full-cut-tabs`]
  
  @js.native
  sealed trait `fuser-over-temp` extends PrinterStateReasons
  @scala.inline
  def `fuser-over-temp`: `fuser-over-temp` = "fuser-over-temp".asInstanceOf[`fuser-over-temp`]
  
  @js.native
  sealed trait `fuser-under-temp` extends PrinterStateReasons
  @scala.inline
  def `fuser-under-temp`: `fuser-under-temp` = "fuser-under-temp".asInstanceOf[`fuser-under-temp`]
  
  @js.native
  sealed trait g extends MaterialAmountUnits
  @scala.inline
  def g: g = "g".asInstanceOf[g]
  
  @js.native
  sealed trait gb2312 extends CharacterSet
  @scala.inline
  def gb2312: gb2312 = "gb2312".asInstanceOf[gb2312]
  
  @js.native
  sealed trait general extends JobAccountType
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  
  @js.native
  sealed trait `generated-natural-language-supported` extends StObject
  @scala.inline
  def `generated-natural-language-supported`: `generated-natural-language-supported` = "generated-natural-language-supported".asInstanceOf[`generated-natural-language-supported`]
  
  @js.native
  sealed trait geo extends UriSchemes
  @scala.inline
  def geo: geo = "geo".asInstanceOf[geo]
  
  @js.native
  sealed trait gg extends UriSchemes
  @scala.inline
  def gg: gg = "gg".asInstanceOf[gg]
  
  @js.native
  sealed trait git extends UriSchemes
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  
  @js.native
  sealed trait gizmoproject extends UriSchemes
  @scala.inline
  def gizmoproject: gizmoproject = "gizmoproject".asInstanceOf[gizmoproject]
  
  @js.native
  sealed trait glass extends MediaType
  @scala.inline
  def glass: glass = "glass".asInstanceOf[glass]
  
  @js.native
  sealed trait `glass-colored` extends MediaType
  @scala.inline
  def `glass-colored`: `glass-colored` = "glass-colored".asInstanceOf[`glass-colored`]
  
  @js.native
  sealed trait `glass-opaque` extends MediaType
  @scala.inline
  def `glass-opaque`: `glass-opaque` = "glass-opaque".asInstanceOf[`glass-opaque`]
  
  @js.native
  sealed trait `glass-surfaced` extends MediaType
  @scala.inline
  def `glass-surfaced`: `glass-surfaced` = "glass-surfaced".asInstanceOf[`glass-surfaced`]
  
  @js.native
  sealed trait `glass-textured` extends MediaType
  @scala.inline
  def `glass-textured`: `glass-textured` = "glass-textured".asInstanceOf[`glass-textured`]
  
  @js.native
  sealed trait glossy
    extends CoatingType
       with LaminatingType
       with MediaCoating
  @scala.inline
  def glossy: glossy = "glossy".asInstanceOf[glossy]
  
  @js.native
  sealed trait go extends UriSchemes
  @scala.inline
  def go: go = "go".asInstanceOf[go]
  
  @js.native
  sealed trait gold
    extends MaterialType
       with MediaColor
  @scala.inline
  def gold: gold = "gold".asInstanceOf[gold]
  
  @js.native
  sealed trait goldenrod extends MediaColor
  @scala.inline
  def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  
  @js.native
  sealed trait gopher extends UriSchemes
  @scala.inline
  def gopher: gopher = "gopher".asInstanceOf[gopher]
  
  @js.native
  sealed trait graph extends UriSchemes
  @scala.inline
  def graph: graph = "graph".asInstanceOf[graph]
  
  @js.native
  sealed trait graphic extends PrintContentOptimize
  @scala.inline
  def graphic: graphic = "graphic".asInstanceOf[graphic]
  
  @js.native
  sealed trait `gravure-cylinder` extends MediaType
  @scala.inline
  def `gravure-cylinder`: `gravure-cylinder` = "gravure-cylinder".asInstanceOf[`gravure-cylinder`]
  
  @js.native
  sealed trait gray extends MediaColor
  @scala.inline
  def gray: gray = "gray".asInstanceOf[gray]
  
  @js.native
  sealed trait green extends MediaColor
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait group extends JobAccountType
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait gtalk extends UriSchemes
  @scala.inline
  def gtalk: gtalk = "gtalk".asInstanceOf[gtalk]
  
  @js.native
  sealed trait guaranteed extends StObject
  @scala.inline
  def guaranteed: guaranteed = "guaranteed".asInstanceOf[guaranteed]
  
  @js.native
  sealed trait gzip extends Compression
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @js.native
  sealed trait h323 extends UriSchemes
  @scala.inline
  def h323: h323 = "h323".asInstanceOf[h323]
  
  @js.native
  sealed trait hagaki extends MediaSource
  @scala.inline
  def hagaki: hagaki = "hagaki".asInstanceOf[hagaki]
  
  @js.native
  sealed trait halftone extends InputContentType
  @scala.inline
  def halftone: halftone = "halftone".asInstanceOf[halftone]
  
  @js.native
  sealed trait ham extends UriSchemes
  @scala.inline
  def ham: ham = "ham".asInstanceOf[ham]
  
  @js.native
  sealed trait hcap extends UriSchemes
  @scala.inline
  def hcap: hcap = "hcap".asInstanceOf[hcap]
  
  @js.native
  sealed trait hcp extends UriSchemes
  @scala.inline
  def hcp: hcp = "hcp".asInstanceOf[hcp]
  
  @js.native
  sealed trait hibernate extends PowerState
  @scala.inline
  def hibernate: hibernate = "hibernate".asInstanceOf[hibernate]
  
  @js.native
  sealed trait `hibernate-vendor1` extends PowerState
  @scala.inline
  def `hibernate-vendor1`: `hibernate-vendor1` = "hibernate-vendor1".asInstanceOf[`hibernate-vendor1`]
  
  @js.native
  sealed trait `hibernate-vendor2` extends PowerState
  @scala.inline
  def `hibernate-vendor2`: `hibernate-vendor2` = "hibernate-vendor2".asInstanceOf[`hibernate-vendor2`]
  
  @js.native
  sealed trait `hibernate-vendor3` extends PowerState
  @scala.inline
  def `hibernate-vendor3`: `hibernate-vendor3` = "hibernate-vendor3".asInstanceOf[`hibernate-vendor3`]
  
  @js.native
  sealed trait `hibernate-vendor4` extends PowerState
  @scala.inline
  def `hibernate-vendor4`: `hibernate-vendor4` = "hibernate-vendor4".asInstanceOf[`hibernate-vendor4`]
  
  @js.native
  sealed trait `hibernate-vendor5` extends PowerState
  @scala.inline
  def `hibernate-vendor5`: `hibernate-vendor5` = "hibernate-vendor5".asInstanceOf[`hibernate-vendor5`]
  
  @js.native
  sealed trait hierarchical extends StObject
  @scala.inline
  def hierarchical: hierarchical = "hierarchical".asInstanceOf[hierarchical]
  
  @js.native
  sealed trait high extends PrintQuality
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait `high-gloss`
    extends CoatingType
       with LaminatingType
       with MediaCoating
  @scala.inline
  def `high-gloss`: `high-gloss` = "high-gloss".asInstanceOf[`high-gloss`]
  
  @js.native
  sealed trait highlight extends PrintColorMode
  @scala.inline
  def highlight: highlight = "highlight".asInstanceOf[highlight]
  
  @js.native
  sealed trait `hold-job_` extends StObject
  @scala.inline
  def `hold-job_`: `hold-job_` = "hold-job".asInstanceOf[`hold-job_`]
  
  @js.native
  sealed trait http extends UriSchemes
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends UriSchemes
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait hxxp extends UriSchemes
  @scala.inline
  def hxxp: hxxp = "hxxp".asInstanceOf[hxxp]
  
  @js.native
  sealed trait hxxps extends UriSchemes
  @scala.inline
  def hxxps: hxxps = "hxxps".asInstanceOf[hxxps]
  
  @js.native
  sealed trait hydrazone extends UriSchemes
  @scala.inline
  def hydrazone: hydrazone = "hydrazone".asInstanceOf[hydrazone]
  
  @js.native
  sealed trait `hz-gb-2312` extends CharacterSet
  @scala.inline
  def `hz-gb-2312`: `hz-gb-2312` = "hz-gb-2312".asInstanceOf[`hz-gb-2312`]
  
  @js.native
  sealed trait `iana_us-ascii_any` extends JobPasswordRepertoire
  @scala.inline
  def `iana_us-ascii_any`: `iana_us-ascii_any` = "iana_us-ascii_any".asInstanceOf[`iana_us-ascii_any`]
  
  @js.native
  sealed trait `iana_us-ascii_complex` extends JobPasswordRepertoire
  @scala.inline
  def `iana_us-ascii_complex`: `iana_us-ascii_complex` = "iana_us-ascii_complex".asInstanceOf[`iana_us-ascii_complex`]
  
  @js.native
  sealed trait `iana_us-ascii_digits` extends JobPasswordRepertoire
  @scala.inline
  def `iana_us-ascii_digits`: `iana_us-ascii_digits` = "iana_us-ascii_digits".asInstanceOf[`iana_us-ascii_digits`]
  
  @js.native
  sealed trait `iana_us-ascii_letters` extends JobPasswordRepertoire
  @scala.inline
  def `iana_us-ascii_letters`: `iana_us-ascii_letters` = "iana_us-ascii_letters".asInstanceOf[`iana_us-ascii_letters`]
  
  @js.native
  sealed trait `iana_utf-8_any` extends JobPasswordRepertoire
  @scala.inline
  def `iana_utf-8_any`: `iana_utf-8_any` = "iana_utf-8_any".asInstanceOf[`iana_utf-8_any`]
  
  @js.native
  sealed trait `iana_utf-8_digits` extends JobPasswordRepertoire
  @scala.inline
  def `iana_utf-8_digits`: `iana_utf-8_digits` = "iana_utf-8_digits".asInstanceOf[`iana_utf-8_digits`]
  
  @js.native
  sealed trait `iana_utf-8_letters` extends JobPasswordRepertoire
  @scala.inline
  def `iana_utf-8_letters`: `iana_utf-8_letters` = "iana_utf-8_letters".asInstanceOf[`iana_utf-8_letters`]
  
  @js.native
  sealed trait iax extends UriSchemes
  @scala.inline
  def iax: iax = "iax".asInstanceOf[iax]
  
  @js.native
  sealed trait ibm737 extends CharacterSet
  @scala.inline
  def ibm737: ibm737 = "ibm737".asInstanceOf[ibm737]
  
  @js.native
  sealed trait ibm775 extends CharacterSet
  @scala.inline
  def ibm775: ibm775 = "ibm775".asInstanceOf[ibm775]
  
  @js.native
  sealed trait ibm850 extends CharacterSet
  @scala.inline
  def ibm850: ibm850 = "ibm850".asInstanceOf[ibm850]
  
  @js.native
  sealed trait ibm852 extends CharacterSet
  @scala.inline
  def ibm852: ibm852 = "ibm852".asInstanceOf[ibm852]
  
  @js.native
  sealed trait ibm857 extends CharacterSet
  @scala.inline
  def ibm857: ibm857 = "ibm857".asInstanceOf[ibm857]
  
  @js.native
  sealed trait ibm861 extends CharacterSet
  @scala.inline
  def ibm861: ibm861 = "ibm861".asInstanceOf[ibm861]
  
  @js.native
  sealed trait ibm869 extends CharacterSet
  @scala.inline
  def ibm869: ibm869 = "ibm869".asInstanceOf[ibm869]
  
  @js.native
  sealed trait icap extends UriSchemes
  @scala.inline
  def icap: icap = "icap".asInstanceOf[icap]
  
  @js.native
  sealed trait icc extends StObject
  @scala.inline
  def icc: icc = "icc".asInstanceOf[icc]
  
  @js.native
  sealed trait `icc-color-matching` extends StObject
  @scala.inline
  def `icc-color-matching`: `icc-color-matching` = "icc-color-matching".asInstanceOf[`icc-color-matching`]
  
  @js.native
  sealed trait icon extends UriSchemes
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait `identify-actions-default` extends StObject
  @scala.inline
  def `identify-actions-default`: `identify-actions-default` = "identify-actions-default".asInstanceOf[`identify-actions-default`]
  
  @js.native
  sealed trait `identify-actions-supported` extends StObject
  @scala.inline
  def `identify-actions-supported`: `identify-actions-supported` = "identify-actions-supported".asInstanceOf[`identify-actions-supported`]
  
  @js.native
  sealed trait idle
    extends PrinterState
       with SystemState
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait im extends UriSchemes
  @scala.inline
  def im: im = "im".asInstanceOf[im]
  
  @js.native
  sealed trait `image-setter-paper` extends MediaType
  @scala.inline
  def `image-setter-paper`: `image-setter-paper` = "image-setter-paper".asInstanceOf[`image-setter-paper`]
  
  @js.native
  sealed trait imageSlashgif extends MimeMediaType
  @scala.inline
  def imageSlashgif: imageSlashgif = "image/gif".asInstanceOf[imageSlashgif]
  
  @js.native
  sealed trait imageSlashief extends MimeMediaType
  @scala.inline
  def imageSlashief: imageSlashief = "image/ief".asInstanceOf[imageSlashief]
  
  @js.native
  sealed trait imageSlashjpeg extends MimeMediaType
  @scala.inline
  def imageSlashjpeg: imageSlashjpeg = "image/jpeg".asInstanceOf[imageSlashjpeg]
  
  @js.native
  sealed trait imageSlashpng extends MimeMediaType
  @scala.inline
  def imageSlashpng: imageSlashpng = "image/png".asInstanceOf[imageSlashpng]
  
  @js.native
  sealed trait imageSlashtiff extends MimeMediaType
  @scala.inline
  def imageSlashtiff: imageSlashtiff = "image/tiff".asInstanceOf[imageSlashtiff]
  
  @js.native
  sealed trait `imageSlashx-cmu-raster` extends MimeMediaType
  @scala.inline
  def `imageSlashx-cmu-raster`: `imageSlashx-cmu-raster` = "image/x-cmu-raster".asInstanceOf[`imageSlashx-cmu-raster`]
  
  @js.native
  sealed trait `imageSlashx-portable-anymap` extends MimeMediaType
  @scala.inline
  def `imageSlashx-portable-anymap`: `imageSlashx-portable-anymap` = "image/x-portable-anymap".asInstanceOf[`imageSlashx-portable-anymap`]
  
  @js.native
  sealed trait `imageSlashx-portable-bitmap` extends MimeMediaType
  @scala.inline
  def `imageSlashx-portable-bitmap`: `imageSlashx-portable-bitmap` = "image/x-portable-bitmap".asInstanceOf[`imageSlashx-portable-bitmap`]
  
  @js.native
  sealed trait `imageSlashx-portable-graymap` extends MimeMediaType
  @scala.inline
  def `imageSlashx-portable-graymap`: `imageSlashx-portable-graymap` = "image/x-portable-graymap".asInstanceOf[`imageSlashx-portable-graymap`]
  
  @js.native
  sealed trait `imageSlashx-portable-pixmap` extends MimeMediaType
  @scala.inline
  def `imageSlashx-portable-pixmap`: `imageSlashx-portable-pixmap` = "image/x-portable-pixmap".asInstanceOf[`imageSlashx-portable-pixmap`]
  
  @js.native
  sealed trait `imageSlashx-rgb` extends MimeMediaType
  @scala.inline
  def `imageSlashx-rgb`: `imageSlashx-rgb` = "image/x-rgb".asInstanceOf[`imageSlashx-rgb`]
  
  @js.native
  sealed trait `imageSlashx-xbitmap` extends MimeMediaType
  @scala.inline
  def `imageSlashx-xbitmap`: `imageSlashx-xbitmap` = "image/x-xbitmap".asInstanceOf[`imageSlashx-xbitmap`]
  
  @js.native
  sealed trait `imageSlashx-xpixmap` extends MimeMediaType
  @scala.inline
  def `imageSlashx-xpixmap`: `imageSlashx-xpixmap` = "image/x-xpixmap".asInstanceOf[`imageSlashx-xpixmap`]
  
  @js.native
  sealed trait `imageSlashx-xwindowdump` extends MimeMediaType
  @scala.inline
  def `imageSlashx-xwindowdump`: `imageSlashx-xwindowdump` = "image/x-xwindowdump".asInstanceOf[`imageSlashx-xwindowdump`]
  
  @js.native
  sealed trait `imaging-cylinder` extends MediaType
  @scala.inline
  def `imaging-cylinder`: `imaging-cylinder` = "imaging-cylinder".asInstanceOf[`imaging-cylinder`]
  
  @js.native
  sealed trait imap extends UriSchemes
  @scala.inline
  def imap: imap = "imap".asInstanceOf[imap]
  
  @js.native
  sealed trait `imposition-template` extends Overrides
  @scala.inline
  def `imposition-template`: `imposition-template` = "imposition-template".asInstanceOf[`imposition-template`]
  
  @js.native
  sealed trait `imposition-template-actual` extends StObject
  @scala.inline
  def `imposition-template-actual`: `imposition-template-actual` = "imposition-template-actual".asInstanceOf[`imposition-template-actual`]
  
  @js.native
  sealed trait `imposition-template-default` extends StObject
  @scala.inline
  def `imposition-template-default`: `imposition-template-default` = "imposition-template-default".asInstanceOf[`imposition-template-default`]
  
  @js.native
  sealed trait `imposition-template-supported` extends StObject
  @scala.inline
  def `imposition-template-supported`: `imposition-template-supported` = "imposition-template-supported".asInstanceOf[`imposition-template-supported`]
  
  @js.native
  sealed trait `imprinter-added` extends PrinterStateReasons
  @scala.inline
  def `imprinter-added`: `imprinter-added` = "imprinter-added".asInstanceOf[`imprinter-added`]
  
  @js.native
  sealed trait `imprinter-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `imprinter-almost-empty`: `imprinter-almost-empty` = "imprinter-almost-empty".asInstanceOf[`imprinter-almost-empty`]
  
  @js.native
  sealed trait `imprinter-almost-full` extends PrinterStateReasons
  @scala.inline
  def `imprinter-almost-full`: `imprinter-almost-full` = "imprinter-almost-full".asInstanceOf[`imprinter-almost-full`]
  
  @js.native
  sealed trait `imprinter-at-limit` extends PrinterStateReasons
  @scala.inline
  def `imprinter-at-limit`: `imprinter-at-limit` = "imprinter-at-limit".asInstanceOf[`imprinter-at-limit`]
  
  @js.native
  sealed trait `imprinter-closed` extends PrinterStateReasons
  @scala.inline
  def `imprinter-closed`: `imprinter-closed` = "imprinter-closed".asInstanceOf[`imprinter-closed`]
  
  @js.native
  sealed trait `imprinter-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `imprinter-configuration-change`: `imprinter-configuration-change` = "imprinter-configuration-change".asInstanceOf[`imprinter-configuration-change`]
  
  @js.native
  sealed trait `imprinter-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `imprinter-cover-closed`: `imprinter-cover-closed` = "imprinter-cover-closed".asInstanceOf[`imprinter-cover-closed`]
  
  @js.native
  sealed trait `imprinter-cover-open` extends PrinterStateReasons
  @scala.inline
  def `imprinter-cover-open`: `imprinter-cover-open` = "imprinter-cover-open".asInstanceOf[`imprinter-cover-open`]
  
  @js.native
  sealed trait `imprinter-empty` extends PrinterStateReasons
  @scala.inline
  def `imprinter-empty`: `imprinter-empty` = "imprinter-empty".asInstanceOf[`imprinter-empty`]
  
  @js.native
  sealed trait `imprinter-full` extends PrinterStateReasons
  @scala.inline
  def `imprinter-full`: `imprinter-full` = "imprinter-full".asInstanceOf[`imprinter-full`]
  
  @js.native
  sealed trait `imprinter-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `imprinter-interlock-closed`: `imprinter-interlock-closed` = "imprinter-interlock-closed".asInstanceOf[`imprinter-interlock-closed`]
  
  @js.native
  sealed trait `imprinter-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `imprinter-interlock-open`: `imprinter-interlock-open` = "imprinter-interlock-open".asInstanceOf[`imprinter-interlock-open`]
  
  @js.native
  sealed trait `imprinter-jam` extends PrinterStateReasons
  @scala.inline
  def `imprinter-jam`: `imprinter-jam` = "imprinter-jam".asInstanceOf[`imprinter-jam`]
  
  @js.native
  sealed trait `imprinter-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `imprinter-life-almost-over`: `imprinter-life-almost-over` = "imprinter-life-almost-over".asInstanceOf[`imprinter-life-almost-over`]
  
  @js.native
  sealed trait `imprinter-life-over` extends PrinterStateReasons
  @scala.inline
  def `imprinter-life-over`: `imprinter-life-over` = "imprinter-life-over".asInstanceOf[`imprinter-life-over`]
  
  @js.native
  sealed trait `imprinter-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `imprinter-memory-exhausted`: `imprinter-memory-exhausted` = "imprinter-memory-exhausted".asInstanceOf[`imprinter-memory-exhausted`]
  
  @js.native
  sealed trait `imprinter-missing` extends PrinterStateReasons
  @scala.inline
  def `imprinter-missing`: `imprinter-missing` = "imprinter-missing".asInstanceOf[`imprinter-missing`]
  
  @js.native
  sealed trait `imprinter-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `imprinter-motor-failure`: `imprinter-motor-failure` = "imprinter-motor-failure".asInstanceOf[`imprinter-motor-failure`]
  
  @js.native
  sealed trait `imprinter-near-limit` extends PrinterStateReasons
  @scala.inline
  def `imprinter-near-limit`: `imprinter-near-limit` = "imprinter-near-limit".asInstanceOf[`imprinter-near-limit`]
  
  @js.native
  sealed trait `imprinter-offline` extends PrinterStateReasons
  @scala.inline
  def `imprinter-offline`: `imprinter-offline` = "imprinter-offline".asInstanceOf[`imprinter-offline`]
  
  @js.native
  sealed trait `imprinter-opened` extends PrinterStateReasons
  @scala.inline
  def `imprinter-opened`: `imprinter-opened` = "imprinter-opened".asInstanceOf[`imprinter-opened`]
  
  @js.native
  sealed trait `imprinter-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `imprinter-over-temperature`: `imprinter-over-temperature` = "imprinter-over-temperature".asInstanceOf[`imprinter-over-temperature`]
  
  @js.native
  sealed trait `imprinter-power-saver` extends PrinterStateReasons
  @scala.inline
  def `imprinter-power-saver`: `imprinter-power-saver` = "imprinter-power-saver".asInstanceOf[`imprinter-power-saver`]
  
  @js.native
  sealed trait `imprinter-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `imprinter-recoverable-failure`: `imprinter-recoverable-failure` = "imprinter-recoverable-failure".asInstanceOf[`imprinter-recoverable-failure`]
  
  @js.native
  sealed trait `imprinter-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `imprinter-recoverable-storage-error`: `imprinter-recoverable-storage-error` = "imprinter-recoverable-storage-error".asInstanceOf[`imprinter-recoverable-storage-error`]
  
  @js.native
  sealed trait `imprinter-removed` extends PrinterStateReasons
  @scala.inline
  def `imprinter-removed`: `imprinter-removed` = "imprinter-removed".asInstanceOf[`imprinter-removed`]
  
  @js.native
  sealed trait `imprinter-resource-added` extends PrinterStateReasons
  @scala.inline
  def `imprinter-resource-added`: `imprinter-resource-added` = "imprinter-resource-added".asInstanceOf[`imprinter-resource-added`]
  
  @js.native
  sealed trait `imprinter-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `imprinter-resource-removed`: `imprinter-resource-removed` = "imprinter-resource-removed".asInstanceOf[`imprinter-resource-removed`]
  
  @js.native
  sealed trait `imprinter-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `imprinter-thermistor-failure`: `imprinter-thermistor-failure` = "imprinter-thermistor-failure".asInstanceOf[`imprinter-thermistor-failure`]
  
  @js.native
  sealed trait `imprinter-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `imprinter-timing-failure`: `imprinter-timing-failure` = "imprinter-timing-failure".asInstanceOf[`imprinter-timing-failure`]
  
  @js.native
  sealed trait `imprinter-turned-off` extends PrinterStateReasons
  @scala.inline
  def `imprinter-turned-off`: `imprinter-turned-off` = "imprinter-turned-off".asInstanceOf[`imprinter-turned-off`]
  
  @js.native
  sealed trait `imprinter-turned-on` extends PrinterStateReasons
  @scala.inline
  def `imprinter-turned-on`: `imprinter-turned-on` = "imprinter-turned-on".asInstanceOf[`imprinter-turned-on`]
  
  @js.native
  sealed trait `imprinter-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `imprinter-under-temperature`: `imprinter-under-temperature` = "imprinter-under-temperature".asInstanceOf[`imprinter-under-temperature`]
  
  @js.native
  sealed trait `imprinter-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `imprinter-unrecoverable-failure`: `imprinter-unrecoverable-failure` = "imprinter-unrecoverable-failure".asInstanceOf[`imprinter-unrecoverable-failure`]
  
  @js.native
  sealed trait `imprinter-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `imprinter-unrecoverable-storage-error`: `imprinter-unrecoverable-storage-error` = "imprinter-unrecoverable-storage-error".asInstanceOf[`imprinter-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `imprinter-warming-up` extends PrinterStateReasons
  @scala.inline
  def `imprinter-warming-up`: `imprinter-warming-up` = "imprinter-warming-up".asInstanceOf[`imprinter-warming-up`]
  
  @js.native
  sealed trait `in-fill` extends MaterialPurpose
  @scala.inline
  def `in-fill`: `in-fill` = "in-fill".asInstanceOf[`in-fill`]
  
  @js.native
  sealed trait inactivity extends TimeoutPredicate
  @scala.inline
  def inactivity: inactivity = "inactivity".asInstanceOf[inactivity]
  
  @js.native
  sealed trait incoming extends DocumentStateReasons
  @scala.inline
  def incoming: incoming = "incoming".asInstanceOf[incoming]
  
  @js.native
  sealed trait indefinite
    extends JobDelayOutputUntil
       with JobHoldUntil
       with JobRetainUntil
  @scala.inline
  def indefinite: indefinite = "indefinite".asInstanceOf[indefinite]
  
  @js.native
  sealed trait info extends UriSchemes
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `infrastructure-printer` extends StObject
  @scala.inline
  def `infrastructure-printer`: `infrastructure-printer` = "infrastructure-printer".asInstanceOf[`infrastructure-printer`]
  
  @js.native
  sealed trait `input-attributes-actual` extends StObject
  @scala.inline
  def `input-attributes-actual`: `input-attributes-actual` = "input-attributes-actual".asInstanceOf[`input-attributes-actual`]
  
  @js.native
  sealed trait `input-attributes-default` extends StObject
  @scala.inline
  def `input-attributes-default`: `input-attributes-default` = "input-attributes-default".asInstanceOf[`input-attributes-default`]
  
  @js.native
  sealed trait `input-attributes-supported` extends StObject
  @scala.inline
  def `input-attributes-supported`: `input-attributes-supported` = "input-attributes-supported".asInstanceOf[`input-attributes-supported`]
  
  @js.native
  sealed trait `input-cannot-feed-size-selected` extends PrinterStateReasons
  @scala.inline
  def `input-cannot-feed-size-selected`: `input-cannot-feed-size-selected` = "input-cannot-feed-size-selected".asInstanceOf[`input-cannot-feed-size-selected`]
  
  @js.native
  sealed trait `input-color-mode-supported` extends StObject
  @scala.inline
  def `input-color-mode-supported`: `input-color-mode-supported` = "input-color-mode-supported".asInstanceOf[`input-color-mode-supported`]
  
  @js.native
  sealed trait `input-content-type-supported` extends StObject
  @scala.inline
  def `input-content-type-supported`: `input-content-type-supported` = "input-content-type-supported".asInstanceOf[`input-content-type-supported`]
  
  @js.native
  sealed trait `input-film-scan-mode-supported` extends StObject
  @scala.inline
  def `input-film-scan-mode-supported`: `input-film-scan-mode-supported` = "input-film-scan-mode-supported".asInstanceOf[`input-film-scan-mode-supported`]
  
  @js.native
  sealed trait `input-manual-input-request` extends PrinterStateReasons
  @scala.inline
  def `input-manual-input-request`: `input-manual-input-request` = "input-manual-input-request".asInstanceOf[`input-manual-input-request`]
  
  @js.native
  sealed trait `input-media-color-change` extends PrinterStateReasons
  @scala.inline
  def `input-media-color-change`: `input-media-color-change` = "input-media-color-change".asInstanceOf[`input-media-color-change`]
  
  @js.native
  sealed trait `input-media-form-parts-change` extends PrinterStateReasons
  @scala.inline
  def `input-media-form-parts-change`: `input-media-form-parts-change` = "input-media-form-parts-change".asInstanceOf[`input-media-form-parts-change`]
  
  @js.native
  sealed trait `input-media-size-change` extends PrinterStateReasons
  @scala.inline
  def `input-media-size-change`: `input-media-size-change` = "input-media-size-change".asInstanceOf[`input-media-size-change`]
  
  @js.native
  sealed trait `input-media-supported` extends StObject
  @scala.inline
  def `input-media-supported`: `input-media-supported` = "input-media-supported".asInstanceOf[`input-media-supported`]
  
  @js.native
  sealed trait `input-media-type-change` extends PrinterStateReasons
  @scala.inline
  def `input-media-type-change`: `input-media-type-change` = "input-media-type-change".asInstanceOf[`input-media-type-change`]
  
  @js.native
  sealed trait `input-media-weight-change` extends PrinterStateReasons
  @scala.inline
  def `input-media-weight-change`: `input-media-weight-change` = "input-media-weight-change".asInstanceOf[`input-media-weight-change`]
  
  @js.native
  sealed trait `input-orientation-requested-supported` extends StObject
  @scala.inline
  def `input-orientation-requested-supported`: `input-orientation-requested-supported` = "input-orientation-requested-supported".asInstanceOf[`input-orientation-requested-supported`]
  
  @js.native
  sealed trait `input-quality-supported` extends StObject
  @scala.inline
  def `input-quality-supported`: `input-quality-supported` = "input-quality-supported".asInstanceOf[`input-quality-supported`]
  
  @js.native
  sealed trait `input-resolution-supported` extends StObject
  @scala.inline
  def `input-resolution-supported`: `input-resolution-supported` = "input-resolution-supported".asInstanceOf[`input-resolution-supported`]
  
  @js.native
  sealed trait `input-scan-regions-supported` extends StObject
  @scala.inline
  def `input-scan-regions-supported`: `input-scan-regions-supported` = "input-scan-regions-supported".asInstanceOf[`input-scan-regions-supported`]
  
  @js.native
  sealed trait `input-sides-supported` extends StObject
  @scala.inline
  def `input-sides-supported`: `input-sides-supported` = "input-sides-supported".asInstanceOf[`input-sides-supported`]
  
  @js.native
  sealed trait `input-source-supported` extends StObject
  @scala.inline
  def `input-source-supported`: `input-source-supported` = "input-source-supported".asInstanceOf[`input-source-supported`]
  
  @js.native
  sealed trait `input-tray-elevation-failure` extends PrinterStateReasons
  @scala.inline
  def `input-tray-elevation-failure`: `input-tray-elevation-failure` = "input-tray-elevation-failure".asInstanceOf[`input-tray-elevation-failure`]
  
  @js.native
  sealed trait `input-tray-missing` extends PrinterStateReasons
  @scala.inline
  def `input-tray-missing`: `input-tray-missing` = "input-tray-missing".asInstanceOf[`input-tray-missing`]
  
  @js.native
  sealed trait `input-tray-position-failure` extends PrinterStateReasons
  @scala.inline
  def `input-tray-position-failure`: `input-tray-position-failure` = "input-tray-position-failure".asInstanceOf[`input-tray-position-failure`]
  
  @js.native
  sealed trait `insert-after-page-number` extends StObject
  @scala.inline
  def `insert-after-page-number`: `insert-after-page-number` = "insert-after-page-number".asInstanceOf[`insert-after-page-number`]
  
  @js.native
  sealed trait `insert-after-page-number-supported` extends StObject
  @scala.inline
  def `insert-after-page-number-supported`: `insert-after-page-number-supported` = "insert-after-page-number-supported".asInstanceOf[`insert-after-page-number-supported`]
  
  @js.native
  sealed trait `insert-count` extends StObject
  @scala.inline
  def `insert-count`: `insert-count` = "insert-count".asInstanceOf[`insert-count`]
  
  @js.native
  sealed trait `insert-count-supported` extends StObject
  @scala.inline
  def `insert-count-supported`: `insert-count-supported` = "insert-count-supported".asInstanceOf[`insert-count-supported`]
  
  @js.native
  sealed trait `insert-sheet` extends Overrides
  @scala.inline
  def `insert-sheet`: `insert-sheet` = "insert-sheet".asInstanceOf[`insert-sheet`]
  
  @js.native
  sealed trait `insert-sheet-actual` extends StObject
  @scala.inline
  def `insert-sheet-actual`: `insert-sheet-actual` = "insert-sheet-actual".asInstanceOf[`insert-sheet-actual`]
  
  @js.native
  sealed trait `insert-sheet-default` extends StObject
  @scala.inline
  def `insert-sheet-default`: `insert-sheet-default` = "insert-sheet-default".asInstanceOf[`insert-sheet-default`]
  
  @js.native
  sealed trait `insert-sheet-supported` extends StObject
  @scala.inline
  def `insert-sheet-supported`: `insert-sheet-supported` = "insert-sheet-supported".asInstanceOf[`insert-sheet-supported`]
  
  @js.native
  sealed trait `inserter-added` extends PrinterStateReasons
  @scala.inline
  def `inserter-added`: `inserter-added` = "inserter-added".asInstanceOf[`inserter-added`]
  
  @js.native
  sealed trait `inserter-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `inserter-almost-empty`: `inserter-almost-empty` = "inserter-almost-empty".asInstanceOf[`inserter-almost-empty`]
  
  @js.native
  sealed trait `inserter-almost-full` extends PrinterStateReasons
  @scala.inline
  def `inserter-almost-full`: `inserter-almost-full` = "inserter-almost-full".asInstanceOf[`inserter-almost-full`]
  
  @js.native
  sealed trait `inserter-at-limit` extends PrinterStateReasons
  @scala.inline
  def `inserter-at-limit`: `inserter-at-limit` = "inserter-at-limit".asInstanceOf[`inserter-at-limit`]
  
  @js.native
  sealed trait `inserter-closed` extends PrinterStateReasons
  @scala.inline
  def `inserter-closed`: `inserter-closed` = "inserter-closed".asInstanceOf[`inserter-closed`]
  
  @js.native
  sealed trait `inserter-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `inserter-configuration-change`: `inserter-configuration-change` = "inserter-configuration-change".asInstanceOf[`inserter-configuration-change`]
  
  @js.native
  sealed trait `inserter-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `inserter-cover-closed`: `inserter-cover-closed` = "inserter-cover-closed".asInstanceOf[`inserter-cover-closed`]
  
  @js.native
  sealed trait `inserter-cover-open` extends PrinterStateReasons
  @scala.inline
  def `inserter-cover-open`: `inserter-cover-open` = "inserter-cover-open".asInstanceOf[`inserter-cover-open`]
  
  @js.native
  sealed trait `inserter-empty` extends PrinterStateReasons
  @scala.inline
  def `inserter-empty`: `inserter-empty` = "inserter-empty".asInstanceOf[`inserter-empty`]
  
  @js.native
  sealed trait `inserter-full` extends PrinterStateReasons
  @scala.inline
  def `inserter-full`: `inserter-full` = "inserter-full".asInstanceOf[`inserter-full`]
  
  @js.native
  sealed trait `inserter-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `inserter-interlock-closed`: `inserter-interlock-closed` = "inserter-interlock-closed".asInstanceOf[`inserter-interlock-closed`]
  
  @js.native
  sealed trait `inserter-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `inserter-interlock-open`: `inserter-interlock-open` = "inserter-interlock-open".asInstanceOf[`inserter-interlock-open`]
  
  @js.native
  sealed trait `inserter-jam` extends PrinterStateReasons
  @scala.inline
  def `inserter-jam`: `inserter-jam` = "inserter-jam".asInstanceOf[`inserter-jam`]
  
  @js.native
  sealed trait `inserter-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `inserter-life-almost-over`: `inserter-life-almost-over` = "inserter-life-almost-over".asInstanceOf[`inserter-life-almost-over`]
  
  @js.native
  sealed trait `inserter-life-over` extends PrinterStateReasons
  @scala.inline
  def `inserter-life-over`: `inserter-life-over` = "inserter-life-over".asInstanceOf[`inserter-life-over`]
  
  @js.native
  sealed trait `inserter-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `inserter-memory-exhausted`: `inserter-memory-exhausted` = "inserter-memory-exhausted".asInstanceOf[`inserter-memory-exhausted`]
  
  @js.native
  sealed trait `inserter-missing` extends PrinterStateReasons
  @scala.inline
  def `inserter-missing`: `inserter-missing` = "inserter-missing".asInstanceOf[`inserter-missing`]
  
  @js.native
  sealed trait `inserter-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `inserter-motor-failure`: `inserter-motor-failure` = "inserter-motor-failure".asInstanceOf[`inserter-motor-failure`]
  
  @js.native
  sealed trait `inserter-near-limit` extends PrinterStateReasons
  @scala.inline
  def `inserter-near-limit`: `inserter-near-limit` = "inserter-near-limit".asInstanceOf[`inserter-near-limit`]
  
  @js.native
  sealed trait `inserter-offline` extends PrinterStateReasons
  @scala.inline
  def `inserter-offline`: `inserter-offline` = "inserter-offline".asInstanceOf[`inserter-offline`]
  
  @js.native
  sealed trait `inserter-opened` extends PrinterStateReasons
  @scala.inline
  def `inserter-opened`: `inserter-opened` = "inserter-opened".asInstanceOf[`inserter-opened`]
  
  @js.native
  sealed trait `inserter-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `inserter-over-temperature`: `inserter-over-temperature` = "inserter-over-temperature".asInstanceOf[`inserter-over-temperature`]
  
  @js.native
  sealed trait `inserter-power-saver` extends PrinterStateReasons
  @scala.inline
  def `inserter-power-saver`: `inserter-power-saver` = "inserter-power-saver".asInstanceOf[`inserter-power-saver`]
  
  @js.native
  sealed trait `inserter-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `inserter-recoverable-failure`: `inserter-recoverable-failure` = "inserter-recoverable-failure".asInstanceOf[`inserter-recoverable-failure`]
  
  @js.native
  sealed trait `inserter-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `inserter-recoverable-storage-error`: `inserter-recoverable-storage-error` = "inserter-recoverable-storage-error".asInstanceOf[`inserter-recoverable-storage-error`]
  
  @js.native
  sealed trait `inserter-removed` extends PrinterStateReasons
  @scala.inline
  def `inserter-removed`: `inserter-removed` = "inserter-removed".asInstanceOf[`inserter-removed`]
  
  @js.native
  sealed trait `inserter-resource-added` extends PrinterStateReasons
  @scala.inline
  def `inserter-resource-added`: `inserter-resource-added` = "inserter-resource-added".asInstanceOf[`inserter-resource-added`]
  
  @js.native
  sealed trait `inserter-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `inserter-resource-removed`: `inserter-resource-removed` = "inserter-resource-removed".asInstanceOf[`inserter-resource-removed`]
  
  @js.native
  sealed trait `inserter-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `inserter-thermistor-failure`: `inserter-thermistor-failure` = "inserter-thermistor-failure".asInstanceOf[`inserter-thermistor-failure`]
  
  @js.native
  sealed trait `inserter-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `inserter-timing-failure`: `inserter-timing-failure` = "inserter-timing-failure".asInstanceOf[`inserter-timing-failure`]
  
  @js.native
  sealed trait `inserter-turned-off` extends PrinterStateReasons
  @scala.inline
  def `inserter-turned-off`: `inserter-turned-off` = "inserter-turned-off".asInstanceOf[`inserter-turned-off`]
  
  @js.native
  sealed trait `inserter-turned-on` extends PrinterStateReasons
  @scala.inline
  def `inserter-turned-on`: `inserter-turned-on` = "inserter-turned-on".asInstanceOf[`inserter-turned-on`]
  
  @js.native
  sealed trait `inserter-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `inserter-under-temperature`: `inserter-under-temperature` = "inserter-under-temperature".asInstanceOf[`inserter-under-temperature`]
  
  @js.native
  sealed trait `inserter-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `inserter-unrecoverable-failure`: `inserter-unrecoverable-failure` = "inserter-unrecoverable-failure".asInstanceOf[`inserter-unrecoverable-failure`]
  
  @js.native
  sealed trait `inserter-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `inserter-unrecoverable-storage-error`: `inserter-unrecoverable-storage-error` = "inserter-unrecoverable-storage-error".asInstanceOf[`inserter-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `inserter-warming-up` extends PrinterStateReasons
  @scala.inline
  def `inserter-warming-up`: `inserter-warming-up` = "inserter-warming-up".asInstanceOf[`inserter-warming-up`]
  
  @js.native
  sealed trait installed extends ResourceState
  @scala.inline
  def installed: installed = "installed".asInstanceOf[installed]
  
  @js.native
  sealed trait `interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `interlock-closed`: `interlock-closed` = "interlock-closed".asInstanceOf[`interlock-closed`]
  
  @js.native
  sealed trait `interlock-open` extends PrinterStateReasons
  @scala.inline
  def `interlock-open`: `interlock-open` = "interlock-open".asInstanceOf[`interlock-open`]
  
  @js.native
  sealed trait `interpreter-cartridge-added` extends PrinterStateReasons
  @scala.inline
  def `interpreter-cartridge-added`: `interpreter-cartridge-added` = "interpreter-cartridge-added".asInstanceOf[`interpreter-cartridge-added`]
  
  @js.native
  sealed trait `interpreter-cartridge-deleted` extends PrinterStateReasons
  @scala.inline
  def `interpreter-cartridge-deleted`: `interpreter-cartridge-deleted` = "interpreter-cartridge-deleted".asInstanceOf[`interpreter-cartridge-deleted`]
  
  @js.native
  sealed trait `interpreter-complex-page-encountered` extends PrinterStateReasons
  @scala.inline
  def `interpreter-complex-page-encountered`: `interpreter-complex-page-encountered` = "interpreter-complex-page-encountered".asInstanceOf[`interpreter-complex-page-encountered`]
  
  @js.native
  sealed trait `interpreter-memory-decrease` extends PrinterStateReasons
  @scala.inline
  def `interpreter-memory-decrease`: `interpreter-memory-decrease` = "interpreter-memory-decrease".asInstanceOf[`interpreter-memory-decrease`]
  
  @js.native
  sealed trait `interpreter-memory-increase` extends PrinterStateReasons
  @scala.inline
  def `interpreter-memory-increase`: `interpreter-memory-increase` = "interpreter-memory-increase".asInstanceOf[`interpreter-memory-increase`]
  
  @js.native
  sealed trait `interpreter-resource-added` extends PrinterStateReasons
  @scala.inline
  def `interpreter-resource-added`: `interpreter-resource-added` = "interpreter-resource-added".asInstanceOf[`interpreter-resource-added`]
  
  @js.native
  sealed trait `interpreter-resource-deleted` extends PrinterStateReasons
  @scala.inline
  def `interpreter-resource-deleted`: `interpreter-resource-deleted` = "interpreter-resource-deleted".asInstanceOf[`interpreter-resource-deleted`]
  
  @js.native
  sealed trait `interpreter-resource-unavailable` extends PrinterStateReasons
  @scala.inline
  def `interpreter-resource-unavailable`: `interpreter-resource-unavailable` = "interpreter-resource-unavailable".asInstanceOf[`interpreter-resource-unavailable`]
  
  @js.native
  sealed trait interpreting extends DocumentStateReasons
  @scala.inline
  def interpreting: interpreting = "interpreting".asInstanceOf[interpreting]
  
  @js.native
  sealed trait invoice
    extends Media
       with MediaSizeName
  @scala.inline
  def invoice: invoice = "invoice".asInstanceOf[invoice]
  
  @js.native
  sealed trait `invoice-white`
    extends Media
       with MediaName
  @scala.inline
  def `invoice-white`: `invoice-white` = "invoice-white".asInstanceOf[`invoice-white`]
  
  @js.native
  sealed trait inward extends FoldingDirection
  @scala.inline
  def inward: inward = "inward".asInstanceOf[inward]
  
  @js.native
  sealed trait iotdisco extends UriSchemes
  @scala.inline
  def iotdisco: iotdisco = "iotdisco".asInstanceOf[iotdisco]
  
  @js.native
  sealed trait ipn extends UriSchemes
  @scala.inline
  def ipn: ipn = "ipn".asInstanceOf[ipn]
  
  @js.native
  sealed trait ipp extends UriSchemes
  @scala.inline
  def ipp: ipp = "ipp".asInstanceOf[ipp]
  
  @js.native
  sealed trait `ipp-3d` extends StObject
  @scala.inline
  def `ipp-3d`: `ipp-3d` = "ipp-3d".asInstanceOf[`ipp-3d`]
  
  @js.native
  sealed trait `ipp-everywhere` extends StObject
  @scala.inline
  def `ipp-everywhere`: `ipp-everywhere` = "ipp-everywhere".asInstanceOf[`ipp-everywhere`]
  
  @js.native
  sealed trait `ipp-features-supported` extends StObject
  @scala.inline
  def `ipp-features-supported`: `ipp-features-supported` = "ipp-features-supported".asInstanceOf[`ipp-features-supported`]
  
  @js.native
  sealed trait `ipp-versions-supported` extends StObject
  @scala.inline
  def `ipp-versions-supported`: `ipp-versions-supported` = "ipp-versions-supported".asInstanceOf[`ipp-versions-supported`]
  
  @js.native
  sealed trait ippget extends StObject
  @scala.inline
  def ippget: ippget = "ippget".asInstanceOf[ippget]
  
  @js.native
  sealed trait `ippget-event-life` extends StObject
  @scala.inline
  def `ippget-event-life`: `ippget-event-life` = "ippget-event-life".asInstanceOf[`ippget-event-life`]
  
  @js.native
  sealed trait ipps extends UriSchemes
  @scala.inline
  def ipps: ipps = "ipps".asInstanceOf[ipps]
  
  @js.native
  sealed trait irc extends UriSchemes
  @scala.inline
  def irc: irc = "irc".asInstanceOf[irc]
  
  @js.native
  sealed trait irc6 extends UriSchemes
  @scala.inline
  def irc6: irc6 = "irc6".asInstanceOf[irc6]
  
  @js.native
  sealed trait ircs extends UriSchemes
  @scala.inline
  def ircs: ircs = "ircs".asInstanceOf[ircs]
  
  @js.native
  sealed trait iris extends UriSchemes
  @scala.inline
  def iris: iris = "iris".asInstanceOf[iris]
  
  @js.native
  sealed trait irisDotbeep extends UriSchemes
  @scala.inline
  def irisDotbeep: irisDotbeep = "iris.beep".asInstanceOf[irisDotbeep]
  
  @js.native
  sealed trait irisDotlwz extends UriSchemes
  @scala.inline
  def irisDotlwz: irisDotlwz = "iris.lwz".asInstanceOf[irisDotlwz]
  
  @js.native
  sealed trait irisDotxpc extends UriSchemes
  @scala.inline
  def irisDotxpc: irisDotxpc = "iris.xpc".asInstanceOf[irisDotxpc]
  
  @js.native
  sealed trait irisDotxpcs extends UriSchemes
  @scala.inline
  def irisDotxpcs: irisDotxpcs = "iris.xpcs".asInstanceOf[irisDotxpcs]
  
  @js.native
  sealed trait `iso-15930-1_2001` extends StObject
  @scala.inline
  def `iso-15930-1_2001`: `iso-15930-1_2001` = "iso-15930-1_2001".asInstanceOf[`iso-15930-1_2001`]
  
  @js.native
  sealed trait `iso-15930-3_2002` extends StObject
  @scala.inline
  def `iso-15930-3_2002`: `iso-15930-3_2002` = "iso-15930-3_2002".asInstanceOf[`iso-15930-3_2002`]
  
  @js.native
  sealed trait `iso-15930-4_2003` extends StObject
  @scala.inline
  def `iso-15930-4_2003`: `iso-15930-4_2003` = "iso-15930-4_2003".asInstanceOf[`iso-15930-4_2003`]
  
  @js.native
  sealed trait `iso-15930-6_2003` extends StObject
  @scala.inline
  def `iso-15930-6_2003`: `iso-15930-6_2003` = "iso-15930-6_2003".asInstanceOf[`iso-15930-6_2003`]
  
  @js.native
  sealed trait `iso-15930-7_2010` extends StObject
  @scala.inline
  def `iso-15930-7_2010`: `iso-15930-7_2010` = "iso-15930-7_2010".asInstanceOf[`iso-15930-7_2010`]
  
  @js.native
  sealed trait `iso-15930-8_2010` extends StObject
  @scala.inline
  def `iso-15930-8_2010`: `iso-15930-8_2010` = "iso-15930-8_2010".asInstanceOf[`iso-15930-8_2010`]
  
  @js.native
  sealed trait `iso-16612-2_2010` extends StObject
  @scala.inline
  def `iso-16612-2_2010`: `iso-16612-2_2010` = "iso-16612-2_2010".asInstanceOf[`iso-16612-2_2010`]
  
  @js.native
  sealed trait `iso-19005-1_2005` extends StObject
  @scala.inline
  def `iso-19005-1_2005`: `iso-19005-1_2005` = "iso-19005-1_2005".asInstanceOf[`iso-19005-1_2005`]
  
  @js.native
  sealed trait `iso-19005-2_2011` extends StObject
  @scala.inline
  def `iso-19005-2_2011`: `iso-19005-2_2011` = "iso-19005-2_2011".asInstanceOf[`iso-19005-2_2011`]
  
  @js.native
  sealed trait `iso-19005-3_2012` extends StObject
  @scala.inline
  def `iso-19005-3_2012`: `iso-19005-3_2012` = "iso-19005-3_2012".asInstanceOf[`iso-19005-3_2012`]
  
  @js.native
  sealed trait `iso-2022-jp` extends CharacterSet
  @scala.inline
  def `iso-2022-jp`: `iso-2022-jp` = "iso-2022-jp".asInstanceOf[`iso-2022-jp`]
  
  @js.native
  sealed trait `iso-2022-kr` extends CharacterSet
  @scala.inline
  def `iso-2022-kr`: `iso-2022-kr` = "iso-2022-kr".asInstanceOf[`iso-2022-kr`]
  
  @js.native
  sealed trait `iso-32000-1_2008` extends StObject
  @scala.inline
  def `iso-32000-1_2008`: `iso-32000-1_2008` = "iso-32000-1_2008".asInstanceOf[`iso-32000-1_2008`]
  
  @js.native
  sealed trait `iso-8859-1` extends CharacterSet
  @scala.inline
  def `iso-8859-1`: `iso-8859-1` = "iso-8859-1".asInstanceOf[`iso-8859-1`]
  
  @js.native
  sealed trait `iso-8859-15` extends CharacterSet
  @scala.inline
  def `iso-8859-15`: `iso-8859-15` = "iso-8859-15".asInstanceOf[`iso-8859-15`]
  
  @js.native
  sealed trait `iso-8859-2` extends CharacterSet
  @scala.inline
  def `iso-8859-2`: `iso-8859-2` = "iso-8859-2".asInstanceOf[`iso-8859-2`]
  
  @js.native
  sealed trait `iso-8859-3` extends CharacterSet
  @scala.inline
  def `iso-8859-3`: `iso-8859-3` = "iso-8859-3".asInstanceOf[`iso-8859-3`]
  
  @js.native
  sealed trait `iso-8859-4` extends CharacterSet
  @scala.inline
  def `iso-8859-4`: `iso-8859-4` = "iso-8859-4".asInstanceOf[`iso-8859-4`]
  
  @js.native
  sealed trait `iso-8859-5` extends CharacterSet
  @scala.inline
  def `iso-8859-5`: `iso-8859-5` = "iso-8859-5".asInstanceOf[`iso-8859-5`]
  
  @js.native
  sealed trait `iso-8859-6` extends CharacterSet
  @scala.inline
  def `iso-8859-6`: `iso-8859-6` = "iso-8859-6".asInstanceOf[`iso-8859-6`]
  
  @js.native
  sealed trait `iso-8859-7` extends CharacterSet
  @scala.inline
  def `iso-8859-7`: `iso-8859-7` = "iso-8859-7".asInstanceOf[`iso-8859-7`]
  
  @js.native
  sealed trait `iso-8859-8` extends CharacterSet
  @scala.inline
  def `iso-8859-8`: `iso-8859-8` = "iso-8859-8".asInstanceOf[`iso-8859-8`]
  
  @js.native
  sealed trait `iso-8859-8-i` extends CharacterSet
  @scala.inline
  def `iso-8859-8-i`: `iso-8859-8-i` = "iso-8859-8-i".asInstanceOf[`iso-8859-8-i`]
  
  @js.native
  sealed trait `iso-8859-9` extends CharacterSet
  @scala.inline
  def `iso-8859-9`: `iso-8859-9` = "iso-8859-9".asInstanceOf[`iso-8859-9`]
  
  @js.native
  sealed trait `iso-a0`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a0`: `iso-a0` = "iso-a0".asInstanceOf[`iso-a0`]
  
  @js.native
  sealed trait `iso-a0-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a0-translucent`: `iso-a0-translucent` = "iso-a0-translucent".asInstanceOf[`iso-a0-translucent`]
  
  @js.native
  sealed trait `iso-a0-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a0-transparent`: `iso-a0-transparent` = "iso-a0-transparent".asInstanceOf[`iso-a0-transparent`]
  
  @js.native
  sealed trait `iso-a0-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a0-white`: `iso-a0-white` = "iso-a0-white".asInstanceOf[`iso-a0-white`]
  
  @js.native
  sealed trait `iso-a0xsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a0xsynchro-translucent`: `iso-a0xsynchro-translucent` = "iso-a0xsynchro-translucent".asInstanceOf[`iso-a0xsynchro-translucent`]
  
  @js.native
  sealed trait `iso-a0xsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a0xsynchro-transparent`: `iso-a0xsynchro-transparent` = "iso-a0xsynchro-transparent".asInstanceOf[`iso-a0xsynchro-transparent`]
  
  @js.native
  sealed trait `iso-a0xsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a0xsynchro-white`: `iso-a0xsynchro-white` = "iso-a0xsynchro-white".asInstanceOf[`iso-a0xsynchro-white`]
  
  @js.native
  sealed trait `iso-a1`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a1`: `iso-a1` = "iso-a1".asInstanceOf[`iso-a1`]
  
  @js.native
  sealed trait `iso-a1-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1-translucent`: `iso-a1-translucent` = "iso-a1-translucent".asInstanceOf[`iso-a1-translucent`]
  
  @js.native
  sealed trait `iso-a1-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1-transparent`: `iso-a1-transparent` = "iso-a1-transparent".asInstanceOf[`iso-a1-transparent`]
  
  @js.native
  sealed trait `iso-a1-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1-white`: `iso-a1-white` = "iso-a1-white".asInstanceOf[`iso-a1-white`]
  
  @js.native
  sealed trait `iso-a10`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a10`: `iso-a10` = "iso-a10".asInstanceOf[`iso-a10`]
  
  @js.native
  sealed trait `iso-a10-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a10-white`: `iso-a10-white` = "iso-a10-white".asInstanceOf[`iso-a10-white`]
  
  @js.native
  sealed trait `iso-a1x3-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1x3-translucent`: `iso-a1x3-translucent` = "iso-a1x3-translucent".asInstanceOf[`iso-a1x3-translucent`]
  
  @js.native
  sealed trait `iso-a1x3-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1x3-transparent`: `iso-a1x3-transparent` = "iso-a1x3-transparent".asInstanceOf[`iso-a1x3-transparent`]
  
  @js.native
  sealed trait `iso-a1x3-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1x3-white`: `iso-a1x3-white` = "iso-a1x3-white".asInstanceOf[`iso-a1x3-white`]
  
  @js.native
  sealed trait `iso-a1x4-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1x4-translucent`: `iso-a1x4-translucent` = "iso-a1x4-translucent".asInstanceOf[`iso-a1x4-translucent`]
  
  @js.native
  sealed trait `iso-a1x4-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1x4-transparent`: `iso-a1x4-transparent` = "iso-a1x4-transparent".asInstanceOf[`iso-a1x4-transparent`]
  
  @js.native
  sealed trait `iso-a1x4-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1x4-white`: `iso-a1x4-white` = "iso-a1x4-white".asInstanceOf[`iso-a1x4-white`]
  
  @js.native
  sealed trait `iso-a1xsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1xsynchro-translucent`: `iso-a1xsynchro-translucent` = "iso-a1xsynchro-translucent".asInstanceOf[`iso-a1xsynchro-translucent`]
  
  @js.native
  sealed trait `iso-a1xsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1xsynchro-transparent`: `iso-a1xsynchro-transparent` = "iso-a1xsynchro-transparent".asInstanceOf[`iso-a1xsynchro-transparent`]
  
  @js.native
  sealed trait `iso-a1xsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a1xsynchro-white`: `iso-a1xsynchro-white` = "iso-a1xsynchro-white".asInstanceOf[`iso-a1xsynchro-white`]
  
  @js.native
  sealed trait `iso-a2`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a2`: `iso-a2` = "iso-a2".asInstanceOf[`iso-a2`]
  
  @js.native
  sealed trait `iso-a2-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2-translucent`: `iso-a2-translucent` = "iso-a2-translucent".asInstanceOf[`iso-a2-translucent`]
  
  @js.native
  sealed trait `iso-a2-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2-transparent`: `iso-a2-transparent` = "iso-a2-transparent".asInstanceOf[`iso-a2-transparent`]
  
  @js.native
  sealed trait `iso-a2-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2-white`: `iso-a2-white` = "iso-a2-white".asInstanceOf[`iso-a2-white`]
  
  @js.native
  sealed trait `iso-a2x3-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x3-translucent`: `iso-a2x3-translucent` = "iso-a2x3-translucent".asInstanceOf[`iso-a2x3-translucent`]
  
  @js.native
  sealed trait `iso-a2x3-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x3-transparent`: `iso-a2x3-transparent` = "iso-a2x3-transparent".asInstanceOf[`iso-a2x3-transparent`]
  
  @js.native
  sealed trait `iso-a2x3-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x3-white`: `iso-a2x3-white` = "iso-a2x3-white".asInstanceOf[`iso-a2x3-white`]
  
  @js.native
  sealed trait `iso-a2x4-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x4-translucent`: `iso-a2x4-translucent` = "iso-a2x4-translucent".asInstanceOf[`iso-a2x4-translucent`]
  
  @js.native
  sealed trait `iso-a2x4-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x4-transparent`: `iso-a2x4-transparent` = "iso-a2x4-transparent".asInstanceOf[`iso-a2x4-transparent`]
  
  @js.native
  sealed trait `iso-a2x4-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x4-white`: `iso-a2x4-white` = "iso-a2x4-white".asInstanceOf[`iso-a2x4-white`]
  
  @js.native
  sealed trait `iso-a2x5-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x5-translucent`: `iso-a2x5-translucent` = "iso-a2x5-translucent".asInstanceOf[`iso-a2x5-translucent`]
  
  @js.native
  sealed trait `iso-a2x5-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x5-transparent`: `iso-a2x5-transparent` = "iso-a2x5-transparent".asInstanceOf[`iso-a2x5-transparent`]
  
  @js.native
  sealed trait `iso-a2x5-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2x5-white`: `iso-a2x5-white` = "iso-a2x5-white".asInstanceOf[`iso-a2x5-white`]
  
  @js.native
  sealed trait `iso-a2xsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2xsynchro-translucent`: `iso-a2xsynchro-translucent` = "iso-a2xsynchro-translucent".asInstanceOf[`iso-a2xsynchro-translucent`]
  
  @js.native
  sealed trait `iso-a2xsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2xsynchro-transparent`: `iso-a2xsynchro-transparent` = "iso-a2xsynchro-transparent".asInstanceOf[`iso-a2xsynchro-transparent`]
  
  @js.native
  sealed trait `iso-a2xsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a2xsynchro-white`: `iso-a2xsynchro-white` = "iso-a2xsynchro-white".asInstanceOf[`iso-a2xsynchro-white`]
  
  @js.native
  sealed trait `iso-a3`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a3`: `iso-a3` = "iso-a3".asInstanceOf[`iso-a3`]
  
  @js.native
  sealed trait `iso-a3-colored`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3-colored`: `iso-a3-colored` = "iso-a3-colored".asInstanceOf[`iso-a3-colored`]
  
  @js.native
  sealed trait `iso-a3-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3-translucent`: `iso-a3-translucent` = "iso-a3-translucent".asInstanceOf[`iso-a3-translucent`]
  
  @js.native
  sealed trait `iso-a3-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3-transparent`: `iso-a3-transparent` = "iso-a3-transparent".asInstanceOf[`iso-a3-transparent`]
  
  @js.native
  sealed trait `iso-a3-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3-white`: `iso-a3-white` = "iso-a3-white".asInstanceOf[`iso-a3-white`]
  
  @js.native
  sealed trait `iso-a3x3-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x3-translucent`: `iso-a3x3-translucent` = "iso-a3x3-translucent".asInstanceOf[`iso-a3x3-translucent`]
  
  @js.native
  sealed trait `iso-a3x3-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x3-transparent`: `iso-a3x3-transparent` = "iso-a3x3-transparent".asInstanceOf[`iso-a3x3-transparent`]
  
  @js.native
  sealed trait `iso-a3x3-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x3-white`: `iso-a3x3-white` = "iso-a3x3-white".asInstanceOf[`iso-a3x3-white`]
  
  @js.native
  sealed trait `iso-a3x4-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x4-translucent`: `iso-a3x4-translucent` = "iso-a3x4-translucent".asInstanceOf[`iso-a3x4-translucent`]
  
  @js.native
  sealed trait `iso-a3x4-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x4-transparent`: `iso-a3x4-transparent` = "iso-a3x4-transparent".asInstanceOf[`iso-a3x4-transparent`]
  
  @js.native
  sealed trait `iso-a3x4-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x4-white`: `iso-a3x4-white` = "iso-a3x4-white".asInstanceOf[`iso-a3x4-white`]
  
  @js.native
  sealed trait `iso-a3x5-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x5-translucent`: `iso-a3x5-translucent` = "iso-a3x5-translucent".asInstanceOf[`iso-a3x5-translucent`]
  
  @js.native
  sealed trait `iso-a3x5-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x5-transparent`: `iso-a3x5-transparent` = "iso-a3x5-transparent".asInstanceOf[`iso-a3x5-transparent`]
  
  @js.native
  sealed trait `iso-a3x5-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x5-white`: `iso-a3x5-white` = "iso-a3x5-white".asInstanceOf[`iso-a3x5-white`]
  
  @js.native
  sealed trait `iso-a3x6-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x6-translucent`: `iso-a3x6-translucent` = "iso-a3x6-translucent".asInstanceOf[`iso-a3x6-translucent`]
  
  @js.native
  sealed trait `iso-a3x6-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x6-transparent`: `iso-a3x6-transparent` = "iso-a3x6-transparent".asInstanceOf[`iso-a3x6-transparent`]
  
  @js.native
  sealed trait `iso-a3x6-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x6-white`: `iso-a3x6-white` = "iso-a3x6-white".asInstanceOf[`iso-a3x6-white`]
  
  @js.native
  sealed trait `iso-a3x7-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x7-translucent`: `iso-a3x7-translucent` = "iso-a3x7-translucent".asInstanceOf[`iso-a3x7-translucent`]
  
  @js.native
  sealed trait `iso-a3x7-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x7-transparent`: `iso-a3x7-transparent` = "iso-a3x7-transparent".asInstanceOf[`iso-a3x7-transparent`]
  
  @js.native
  sealed trait `iso-a3x7-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3x7-white`: `iso-a3x7-white` = "iso-a3x7-white".asInstanceOf[`iso-a3x7-white`]
  
  @js.native
  sealed trait `iso-a3xsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3xsynchro-translucent`: `iso-a3xsynchro-translucent` = "iso-a3xsynchro-translucent".asInstanceOf[`iso-a3xsynchro-translucent`]
  
  @js.native
  sealed trait `iso-a3xsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3xsynchro-transparent`: `iso-a3xsynchro-transparent` = "iso-a3xsynchro-transparent".asInstanceOf[`iso-a3xsynchro-transparent`]
  
  @js.native
  sealed trait `iso-a3xsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a3xsynchro-white`: `iso-a3xsynchro-white` = "iso-a3xsynchro-white".asInstanceOf[`iso-a3xsynchro-white`]
  
  @js.native
  sealed trait `iso-a4`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a4`: `iso-a4` = "iso-a4".asInstanceOf[`iso-a4`]
  
  @js.native
  sealed trait `iso-a4-colored`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4-colored`: `iso-a4-colored` = "iso-a4-colored".asInstanceOf[`iso-a4-colored`]
  
  @js.native
  sealed trait `iso-a4-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4-translucent`: `iso-a4-translucent` = "iso-a4-translucent".asInstanceOf[`iso-a4-translucent`]
  
  @js.native
  sealed trait `iso-a4-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4-transparent`: `iso-a4-transparent` = "iso-a4-transparent".asInstanceOf[`iso-a4-transparent`]
  
  @js.native
  sealed trait `iso-a4-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4-white`: `iso-a4-white` = "iso-a4-white".asInstanceOf[`iso-a4-white`]
  
  @js.native
  sealed trait `iso-a4x3-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x3-translucent`: `iso-a4x3-translucent` = "iso-a4x3-translucent".asInstanceOf[`iso-a4x3-translucent`]
  
  @js.native
  sealed trait `iso-a4x3-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x3-transparent`: `iso-a4x3-transparent` = "iso-a4x3-transparent".asInstanceOf[`iso-a4x3-transparent`]
  
  @js.native
  sealed trait `iso-a4x3-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x3-white`: `iso-a4x3-white` = "iso-a4x3-white".asInstanceOf[`iso-a4x3-white`]
  
  @js.native
  sealed trait `iso-a4x4-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x4-translucent`: `iso-a4x4-translucent` = "iso-a4x4-translucent".asInstanceOf[`iso-a4x4-translucent`]
  
  @js.native
  sealed trait `iso-a4x4-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x4-transparent`: `iso-a4x4-transparent` = "iso-a4x4-transparent".asInstanceOf[`iso-a4x4-transparent`]
  
  @js.native
  sealed trait `iso-a4x4-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x4-white`: `iso-a4x4-white` = "iso-a4x4-white".asInstanceOf[`iso-a4x4-white`]
  
  @js.native
  sealed trait `iso-a4x5-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x5-translucent`: `iso-a4x5-translucent` = "iso-a4x5-translucent".asInstanceOf[`iso-a4x5-translucent`]
  
  @js.native
  sealed trait `iso-a4x5-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x5-transparent`: `iso-a4x5-transparent` = "iso-a4x5-transparent".asInstanceOf[`iso-a4x5-transparent`]
  
  @js.native
  sealed trait `iso-a4x5-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x5-white`: `iso-a4x5-white` = "iso-a4x5-white".asInstanceOf[`iso-a4x5-white`]
  
  @js.native
  sealed trait `iso-a4x6-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x6-translucent`: `iso-a4x6-translucent` = "iso-a4x6-translucent".asInstanceOf[`iso-a4x6-translucent`]
  
  @js.native
  sealed trait `iso-a4x6-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x6-transparent`: `iso-a4x6-transparent` = "iso-a4x6-transparent".asInstanceOf[`iso-a4x6-transparent`]
  
  @js.native
  sealed trait `iso-a4x6-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x6-white`: `iso-a4x6-white` = "iso-a4x6-white".asInstanceOf[`iso-a4x6-white`]
  
  @js.native
  sealed trait `iso-a4x7-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x7-translucent`: `iso-a4x7-translucent` = "iso-a4x7-translucent".asInstanceOf[`iso-a4x7-translucent`]
  
  @js.native
  sealed trait `iso-a4x7-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x7-transparent`: `iso-a4x7-transparent` = "iso-a4x7-transparent".asInstanceOf[`iso-a4x7-transparent`]
  
  @js.native
  sealed trait `iso-a4x7-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x7-white`: `iso-a4x7-white` = "iso-a4x7-white".asInstanceOf[`iso-a4x7-white`]
  
  @js.native
  sealed trait `iso-a4x8-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x8-translucent`: `iso-a4x8-translucent` = "iso-a4x8-translucent".asInstanceOf[`iso-a4x8-translucent`]
  
  @js.native
  sealed trait `iso-a4x8-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x8-transparent`: `iso-a4x8-transparent` = "iso-a4x8-transparent".asInstanceOf[`iso-a4x8-transparent`]
  
  @js.native
  sealed trait `iso-a4x8-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x8-white`: `iso-a4x8-white` = "iso-a4x8-white".asInstanceOf[`iso-a4x8-white`]
  
  @js.native
  sealed trait `iso-a4x9-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x9-translucent`: `iso-a4x9-translucent` = "iso-a4x9-translucent".asInstanceOf[`iso-a4x9-translucent`]
  
  @js.native
  sealed trait `iso-a4x9-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x9-transparent`: `iso-a4x9-transparent` = "iso-a4x9-transparent".asInstanceOf[`iso-a4x9-transparent`]
  
  @js.native
  sealed trait `iso-a4x9-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4x9-white`: `iso-a4x9-white` = "iso-a4x9-white".asInstanceOf[`iso-a4x9-white`]
  
  @js.native
  sealed trait `iso-a4xsynchro-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4xsynchro-translucent`: `iso-a4xsynchro-translucent` = "iso-a4xsynchro-translucent".asInstanceOf[`iso-a4xsynchro-translucent`]
  
  @js.native
  sealed trait `iso-a4xsynchro-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4xsynchro-transparent`: `iso-a4xsynchro-transparent` = "iso-a4xsynchro-transparent".asInstanceOf[`iso-a4xsynchro-transparent`]
  
  @js.native
  sealed trait `iso-a4xsynchro-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a4xsynchro-white`: `iso-a4xsynchro-white` = "iso-a4xsynchro-white".asInstanceOf[`iso-a4xsynchro-white`]
  
  @js.native
  sealed trait `iso-a5`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a5`: `iso-a5` = "iso-a5".asInstanceOf[`iso-a5`]
  
  @js.native
  sealed trait `iso-a5-colored`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a5-colored`: `iso-a5-colored` = "iso-a5-colored".asInstanceOf[`iso-a5-colored`]
  
  @js.native
  sealed trait `iso-a5-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a5-translucent`: `iso-a5-translucent` = "iso-a5-translucent".asInstanceOf[`iso-a5-translucent`]
  
  @js.native
  sealed trait `iso-a5-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a5-transparent`: `iso-a5-transparent` = "iso-a5-transparent".asInstanceOf[`iso-a5-transparent`]
  
  @js.native
  sealed trait `iso-a5-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a5-white`: `iso-a5-white` = "iso-a5-white".asInstanceOf[`iso-a5-white`]
  
  @js.native
  sealed trait `iso-a6`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a6`: `iso-a6` = "iso-a6".asInstanceOf[`iso-a6`]
  
  @js.native
  sealed trait `iso-a6-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a6-white`: `iso-a6-white` = "iso-a6-white".asInstanceOf[`iso-a6-white`]
  
  @js.native
  sealed trait `iso-a7`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a7`: `iso-a7` = "iso-a7".asInstanceOf[`iso-a7`]
  
  @js.native
  sealed trait `iso-a7-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a7-white`: `iso-a7-white` = "iso-a7-white".asInstanceOf[`iso-a7-white`]
  
  @js.native
  sealed trait `iso-a8`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a8`: `iso-a8` = "iso-a8".asInstanceOf[`iso-a8`]
  
  @js.native
  sealed trait `iso-a8-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a8-white`: `iso-a8-white` = "iso-a8-white".asInstanceOf[`iso-a8-white`]
  
  @js.native
  sealed trait `iso-a9`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-a9`: `iso-a9` = "iso-a9".asInstanceOf[`iso-a9`]
  
  @js.native
  sealed trait `iso-a9-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-a9-white`: `iso-a9-white` = "iso-a9-white".asInstanceOf[`iso-a9-white`]
  
  @js.native
  sealed trait `iso-b0`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b0`: `iso-b0` = "iso-b0".asInstanceOf[`iso-b0`]
  
  @js.native
  sealed trait `iso-b0-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b0-white`: `iso-b0-white` = "iso-b0-white".asInstanceOf[`iso-b0-white`]
  
  @js.native
  sealed trait `iso-b1`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b1`: `iso-b1` = "iso-b1".asInstanceOf[`iso-b1`]
  
  @js.native
  sealed trait `iso-b1-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b1-white`: `iso-b1-white` = "iso-b1-white".asInstanceOf[`iso-b1-white`]
  
  @js.native
  sealed trait `iso-b10`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b10`: `iso-b10` = "iso-b10".asInstanceOf[`iso-b10`]
  
  @js.native
  sealed trait `iso-b10-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b10-white`: `iso-b10-white` = "iso-b10-white".asInstanceOf[`iso-b10-white`]
  
  @js.native
  sealed trait `iso-b2`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b2`: `iso-b2` = "iso-b2".asInstanceOf[`iso-b2`]
  
  @js.native
  sealed trait `iso-b2-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b2-white`: `iso-b2-white` = "iso-b2-white".asInstanceOf[`iso-b2-white`]
  
  @js.native
  sealed trait `iso-b3`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b3`: `iso-b3` = "iso-b3".asInstanceOf[`iso-b3`]
  
  @js.native
  sealed trait `iso-b3-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b3-white`: `iso-b3-white` = "iso-b3-white".asInstanceOf[`iso-b3-white`]
  
  @js.native
  sealed trait `iso-b4`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b4`: `iso-b4` = "iso-b4".asInstanceOf[`iso-b4`]
  
  @js.native
  sealed trait `iso-b4-colored`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b4-colored`: `iso-b4-colored` = "iso-b4-colored".asInstanceOf[`iso-b4-colored`]
  
  @js.native
  sealed trait `iso-b4-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-b4-envelope`: `iso-b4-envelope` = "iso-b4-envelope".asInstanceOf[`iso-b4-envelope`]
  
  @js.native
  sealed trait `iso-b4-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b4-white`: `iso-b4-white` = "iso-b4-white".asInstanceOf[`iso-b4-white`]
  
  @js.native
  sealed trait `iso-b5`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b5`: `iso-b5` = "iso-b5".asInstanceOf[`iso-b5`]
  
  @js.native
  sealed trait `iso-b5-colored`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b5-colored`: `iso-b5-colored` = "iso-b5-colored".asInstanceOf[`iso-b5-colored`]
  
  @js.native
  sealed trait `iso-b5-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-b5-envelope`: `iso-b5-envelope` = "iso-b5-envelope".asInstanceOf[`iso-b5-envelope`]
  
  @js.native
  sealed trait `iso-b5-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b5-white`: `iso-b5-white` = "iso-b5-white".asInstanceOf[`iso-b5-white`]
  
  @js.native
  sealed trait `iso-b6`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b6`: `iso-b6` = "iso-b6".asInstanceOf[`iso-b6`]
  
  @js.native
  sealed trait `iso-b6-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b6-white`: `iso-b6-white` = "iso-b6-white".asInstanceOf[`iso-b6-white`]
  
  @js.native
  sealed trait `iso-b7`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b7`: `iso-b7` = "iso-b7".asInstanceOf[`iso-b7`]
  
  @js.native
  sealed trait `iso-b7-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b7-white`: `iso-b7-white` = "iso-b7-white".asInstanceOf[`iso-b7-white`]
  
  @js.native
  sealed trait `iso-b8`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b8`: `iso-b8` = "iso-b8".asInstanceOf[`iso-b8`]
  
  @js.native
  sealed trait `iso-b8-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b8-white`: `iso-b8-white` = "iso-b8-white".asInstanceOf[`iso-b8-white`]
  
  @js.native
  sealed trait `iso-b9`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-b9`: `iso-b9` = "iso-b9".asInstanceOf[`iso-b9`]
  
  @js.native
  sealed trait `iso-b9-white`
    extends Media
       with MediaName
  @scala.inline
  def `iso-b9-white`: `iso-b9-white` = "iso-b9-white".asInstanceOf[`iso-b9-white`]
  
  @js.native
  sealed trait `iso-c3`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-c3`: `iso-c3` = "iso-c3".asInstanceOf[`iso-c3`]
  
  @js.native
  sealed trait `iso-c3-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-c3-envelope`: `iso-c3-envelope` = "iso-c3-envelope".asInstanceOf[`iso-c3-envelope`]
  
  @js.native
  sealed trait `iso-c4`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-c4`: `iso-c4` = "iso-c4".asInstanceOf[`iso-c4`]
  
  @js.native
  sealed trait `iso-c4-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-c4-envelope`: `iso-c4-envelope` = "iso-c4-envelope".asInstanceOf[`iso-c4-envelope`]
  
  @js.native
  sealed trait `iso-c5`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-c5`: `iso-c5` = "iso-c5".asInstanceOf[`iso-c5`]
  
  @js.native
  sealed trait `iso-c5-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-c5-envelope`: `iso-c5-envelope` = "iso-c5-envelope".asInstanceOf[`iso-c5-envelope`]
  
  @js.native
  sealed trait `iso-c6`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-c6`: `iso-c6` = "iso-c6".asInstanceOf[`iso-c6`]
  
  @js.native
  sealed trait `iso-c6-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-c6-envelope`: `iso-c6-envelope` = "iso-c6-envelope".asInstanceOf[`iso-c6-envelope`]
  
  @js.native
  sealed trait `iso-designated-long`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso-designated-long`: `iso-designated-long` = "iso-designated-long".asInstanceOf[`iso-designated-long`]
  
  @js.native
  sealed trait `iso-designated-long-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `iso-designated-long-envelope`: `iso-designated-long-envelope` = "iso-designated-long-envelope".asInstanceOf[`iso-designated-long-envelope`]
  
  @js.native
  sealed trait iso_2a0_1189x1682mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_2a0_1189x1682mm: iso_2a0_1189x1682mm = "iso_2a0_1189x1682mm".asInstanceOf[iso_2a0_1189x1682mm]
  
  @js.native
  sealed trait iso_a0_841x1189mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a0_841x1189mm: iso_a0_841x1189mm = "iso_a0_841x1189mm".asInstanceOf[iso_a0_841x1189mm]
  
  @js.native
  sealed trait iso_a0x3_1189x2523mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a0x3_1189x2523mm: iso_a0x3_1189x2523mm = "iso_a0x3_1189x2523mm".asInstanceOf[iso_a0x3_1189x2523mm]
  
  @js.native
  sealed trait iso_a10_26x37mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a10_26x37mm: iso_a10_26x37mm = "iso_a10_26x37mm".asInstanceOf[iso_a10_26x37mm]
  
  @js.native
  sealed trait iso_a1_594x841mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a1_594x841mm: iso_a1_594x841mm = "iso_a1_594x841mm".asInstanceOf[iso_a1_594x841mm]
  
  @js.native
  sealed trait iso_a1x3_841x1783mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a1x3_841x1783mm: iso_a1x3_841x1783mm = "iso_a1x3_841x1783mm".asInstanceOf[iso_a1x3_841x1783mm]
  
  @js.native
  sealed trait iso_a1x4_841x2378mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a1x4_841x2378mm: iso_a1x4_841x2378mm = "iso_a1x4_841x2378mm".asInstanceOf[iso_a1x4_841x2378mm]
  
  @js.native
  sealed trait iso_a2_420x594mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a2_420x594mm: iso_a2_420x594mm = "iso_a2_420x594mm".asInstanceOf[iso_a2_420x594mm]
  
  @js.native
  sealed trait iso_a2x3_594x1261mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a2x3_594x1261mm: iso_a2x3_594x1261mm = "iso_a2x3_594x1261mm".asInstanceOf[iso_a2x3_594x1261mm]
  
  @js.native
  sealed trait iso_a2x4_594x1682mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a2x4_594x1682mm: iso_a2x4_594x1682mm = "iso_a2x4_594x1682mm".asInstanceOf[iso_a2x4_594x1682mm]
  
  @js.native
  sealed trait iso_a2x5_594x2102mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a2x5_594x2102mm: iso_a2x5_594x2102mm = "iso_a2x5_594x2102mm".asInstanceOf[iso_a2x5_594x2102mm]
  
  @js.native
  sealed trait `iso_a3-extra_322x445mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_a3-extra_322x445mm`: `iso_a3-extra_322x445mm` = "iso_a3-extra_322x445mm".asInstanceOf[`iso_a3-extra_322x445mm`]
  
  @js.native
  sealed trait iso_a3_297x420mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a3_297x420mm: iso_a3_297x420mm = "iso_a3_297x420mm".asInstanceOf[iso_a3_297x420mm]
  
  @js.native
  sealed trait iso_a3x3_420x891mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a3x3_420x891mm: iso_a3x3_420x891mm = "iso_a3x3_420x891mm".asInstanceOf[iso_a3x3_420x891mm]
  
  @js.native
  sealed trait iso_a3x4_420x1189mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a3x4_420x1189mm: iso_a3x4_420x1189mm = "iso_a3x4_420x1189mm".asInstanceOf[iso_a3x4_420x1189mm]
  
  @js.native
  sealed trait iso_a3x5_420x1486mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a3x5_420x1486mm: iso_a3x5_420x1486mm = "iso_a3x5_420x1486mm".asInstanceOf[iso_a3x5_420x1486mm]
  
  @js.native
  sealed trait iso_a3x6_420x1783mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a3x6_420x1783mm: iso_a3x6_420x1783mm = "iso_a3x6_420x1783mm".asInstanceOf[iso_a3x6_420x1783mm]
  
  @js.native
  sealed trait iso_a3x7_420x2080mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a3x7_420x2080mm: iso_a3x7_420x2080mm = "iso_a3x7_420x2080mm".asInstanceOf[iso_a3x7_420x2080mm]
  
  @js.native
  sealed trait `iso_a4-extra_235Dot5x322Dot3mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_a4-extra_235Dot5x322Dot3mm`: `iso_a4-extra_235Dot5x322Dot3mm` = "iso_a4-extra_235.5x322.3mm".asInstanceOf[`iso_a4-extra_235Dot5x322Dot3mm`]
  
  @js.native
  sealed trait `iso_a4-tab_225x297mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_a4-tab_225x297mm`: `iso_a4-tab_225x297mm` = "iso_a4-tab_225x297mm".asInstanceOf[`iso_a4-tab_225x297mm`]
  
  @js.native
  sealed trait iso_a4_210x297mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4_210x297mm: iso_a4_210x297mm = "iso_a4_210x297mm".asInstanceOf[iso_a4_210x297mm]
  
  @js.native
  sealed trait iso_a4x3_297x630mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x3_297x630mm: iso_a4x3_297x630mm = "iso_a4x3_297x630mm".asInstanceOf[iso_a4x3_297x630mm]
  
  @js.native
  sealed trait iso_a4x4_297x841mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x4_297x841mm: iso_a4x4_297x841mm = "iso_a4x4_297x841mm".asInstanceOf[iso_a4x4_297x841mm]
  
  @js.native
  sealed trait iso_a4x5_297x1051mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x5_297x1051mm: iso_a4x5_297x1051mm = "iso_a4x5_297x1051mm".asInstanceOf[iso_a4x5_297x1051mm]
  
  @js.native
  sealed trait iso_a4x6_297x1261mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x6_297x1261mm: iso_a4x6_297x1261mm = "iso_a4x6_297x1261mm".asInstanceOf[iso_a4x6_297x1261mm]
  
  @js.native
  sealed trait iso_a4x7_297x1471mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x7_297x1471mm: iso_a4x7_297x1471mm = "iso_a4x7_297x1471mm".asInstanceOf[iso_a4x7_297x1471mm]
  
  @js.native
  sealed trait iso_a4x8_297x1682mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x8_297x1682mm: iso_a4x8_297x1682mm = "iso_a4x8_297x1682mm".asInstanceOf[iso_a4x8_297x1682mm]
  
  @js.native
  sealed trait iso_a4x9_297x1892mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a4x9_297x1892mm: iso_a4x9_297x1892mm = "iso_a4x9_297x1892mm".asInstanceOf[iso_a4x9_297x1892mm]
  
  @js.native
  sealed trait `iso_a5-extra_174x235mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_a5-extra_174x235mm`: `iso_a5-extra_174x235mm` = "iso_a5-extra_174x235mm".asInstanceOf[`iso_a5-extra_174x235mm`]
  
  @js.native
  sealed trait iso_a5_148x210mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a5_148x210mm: iso_a5_148x210mm = "iso_a5_148x210mm".asInstanceOf[iso_a5_148x210mm]
  
  @js.native
  sealed trait iso_a6_105x148mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a6_105x148mm: iso_a6_105x148mm = "iso_a6_105x148mm".asInstanceOf[iso_a6_105x148mm]
  
  @js.native
  sealed trait iso_a7_74x105mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a7_74x105mm: iso_a7_74x105mm = "iso_a7_74x105mm".asInstanceOf[iso_a7_74x105mm]
  
  @js.native
  sealed trait iso_a8_52x74mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a8_52x74mm: iso_a8_52x74mm = "iso_a8_52x74mm".asInstanceOf[iso_a8_52x74mm]
  
  @js.native
  sealed trait iso_a9_37x52mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_a9_37x52mm: iso_a9_37x52mm = "iso_a9_37x52mm".asInstanceOf[iso_a9_37x52mm]
  
  @js.native
  sealed trait iso_b0_1000x1414mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b0_1000x1414mm: iso_b0_1000x1414mm = "iso_b0_1000x1414mm".asInstanceOf[iso_b0_1000x1414mm]
  
  @js.native
  sealed trait iso_b10_31x44mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b10_31x44mm: iso_b10_31x44mm = "iso_b10_31x44mm".asInstanceOf[iso_b10_31x44mm]
  
  @js.native
  sealed trait iso_b1_707x1000mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b1_707x1000mm: iso_b1_707x1000mm = "iso_b1_707x1000mm".asInstanceOf[iso_b1_707x1000mm]
  
  @js.native
  sealed trait iso_b2_500x707mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b2_500x707mm: iso_b2_500x707mm = "iso_b2_500x707mm".asInstanceOf[iso_b2_500x707mm]
  
  @js.native
  sealed trait iso_b3_353x500mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b3_353x500mm: iso_b3_353x500mm = "iso_b3_353x500mm".asInstanceOf[iso_b3_353x500mm]
  
  @js.native
  sealed trait iso_b4_250x353mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b4_250x353mm: iso_b4_250x353mm = "iso_b4_250x353mm".asInstanceOf[iso_b4_250x353mm]
  
  @js.native
  sealed trait `iso_b5-extra_201x276mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_b5-extra_201x276mm`: `iso_b5-extra_201x276mm` = "iso_b5-extra_201x276mm".asInstanceOf[`iso_b5-extra_201x276mm`]
  
  @js.native
  sealed trait iso_b5_176x250mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b5_176x250mm: iso_b5_176x250mm = "iso_b5_176x250mm".asInstanceOf[iso_b5_176x250mm]
  
  @js.native
  sealed trait iso_b6_125x176mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b6_125x176mm: iso_b6_125x176mm = "iso_b6_125x176mm".asInstanceOf[iso_b6_125x176mm]
  
  @js.native
  sealed trait iso_b6c4_125x324mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b6c4_125x324mm: iso_b6c4_125x324mm = "iso_b6c4_125x324mm".asInstanceOf[iso_b6c4_125x324mm]
  
  @js.native
  sealed trait iso_b7_88x125mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b7_88x125mm: iso_b7_88x125mm = "iso_b7_88x125mm".asInstanceOf[iso_b7_88x125mm]
  
  @js.native
  sealed trait iso_b8_62x88mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b8_62x88mm: iso_b8_62x88mm = "iso_b8_62x88mm".asInstanceOf[iso_b8_62x88mm]
  
  @js.native
  sealed trait iso_b9_44x62mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_b9_44x62mm: iso_b9_44x62mm = "iso_b9_44x62mm".asInstanceOf[iso_b9_44x62mm]
  
  @js.native
  sealed trait iso_c0_917x1297mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c0_917x1297mm: iso_c0_917x1297mm = "iso_c0_917x1297mm".asInstanceOf[iso_c0_917x1297mm]
  
  @js.native
  sealed trait iso_c10_28x40mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c10_28x40mm: iso_c10_28x40mm = "iso_c10_28x40mm".asInstanceOf[iso_c10_28x40mm]
  
  @js.native
  sealed trait iso_c1_648x917mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c1_648x917mm: iso_c1_648x917mm = "iso_c1_648x917mm".asInstanceOf[iso_c1_648x917mm]
  
  @js.native
  sealed trait iso_c2_458x648mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c2_458x648mm: iso_c2_458x648mm = "iso_c2_458x648mm".asInstanceOf[iso_c2_458x648mm]
  
  @js.native
  sealed trait iso_c3_324x458mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c3_324x458mm: iso_c3_324x458mm = "iso_c3_324x458mm".asInstanceOf[iso_c3_324x458mm]
  
  @js.native
  sealed trait iso_c4_229x324mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c4_229x324mm: iso_c4_229x324mm = "iso_c4_229x324mm".asInstanceOf[iso_c4_229x324mm]
  
  @js.native
  sealed trait iso_c5_162x229mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c5_162x229mm: iso_c5_162x229mm = "iso_c5_162x229mm".asInstanceOf[iso_c5_162x229mm]
  
  @js.native
  sealed trait iso_c6_114x162mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c6_114x162mm: iso_c6_114x162mm = "iso_c6_114x162mm".asInstanceOf[iso_c6_114x162mm]
  
  @js.native
  sealed trait iso_c6c5_114x229mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c6c5_114x229mm: iso_c6c5_114x229mm = "iso_c6c5_114x229mm".asInstanceOf[iso_c6c5_114x229mm]
  
  @js.native
  sealed trait iso_c7_81x114mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c7_81x114mm: iso_c7_81x114mm = "iso_c7_81x114mm".asInstanceOf[iso_c7_81x114mm]
  
  @js.native
  sealed trait iso_c7c6_81x162mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c7c6_81x162mm: iso_c7c6_81x162mm = "iso_c7c6_81x162mm".asInstanceOf[iso_c7c6_81x162mm]
  
  @js.native
  sealed trait iso_c8_57x81mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c8_57x81mm: iso_c8_57x81mm = "iso_c8_57x81mm".asInstanceOf[iso_c8_57x81mm]
  
  @js.native
  sealed trait iso_c9_40x57mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_c9_40x57mm: iso_c9_40x57mm = "iso_c9_40x57mm".asInstanceOf[iso_c9_40x57mm]
  
  @js.native
  sealed trait iso_dl_110x220mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_dl_110x220mm: iso_dl_110x220mm = "iso_dl_110x220mm".asInstanceOf[iso_dl_110x220mm]
  
  @js.native
  sealed trait `iso_id-1_53Dot98x85Dot6mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_id-1_53Dot98x85Dot6mm`: `iso_id-1_53Dot98x85Dot6mm` = "iso_id-1_53.98x85.6mm".asInstanceOf[`iso_id-1_53Dot98x85Dot6mm`]
  
  @js.native
  sealed trait `iso_id-3_88x125mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `iso_id-3_88x125mm`: `iso_id-3_88x125mm` = "iso_id-3_88x125mm".asInstanceOf[`iso_id-3_88x125mm`]
  
  @js.native
  sealed trait iso_ra0_860x1220mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_ra0_860x1220mm: iso_ra0_860x1220mm = "iso_ra0_860x1220mm".asInstanceOf[iso_ra0_860x1220mm]
  
  @js.native
  sealed trait iso_ra1_610x860mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_ra1_610x860mm: iso_ra1_610x860mm = "iso_ra1_610x860mm".asInstanceOf[iso_ra1_610x860mm]
  
  @js.native
  sealed trait iso_ra2_430x610mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_ra2_430x610mm: iso_ra2_430x610mm = "iso_ra2_430x610mm".asInstanceOf[iso_ra2_430x610mm]
  
  @js.native
  sealed trait iso_ra3_305x430mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_ra3_305x430mm: iso_ra3_305x430mm = "iso_ra3_305x430mm".asInstanceOf[iso_ra3_305x430mm]
  
  @js.native
  sealed trait iso_ra4_215x305mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_ra4_215x305mm: iso_ra4_215x305mm = "iso_ra4_215x305mm".asInstanceOf[iso_ra4_215x305mm]
  
  @js.native
  sealed trait iso_sra0_900x1280mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_sra0_900x1280mm: iso_sra0_900x1280mm = "iso_sra0_900x1280mm".asInstanceOf[iso_sra0_900x1280mm]
  
  @js.native
  sealed trait iso_sra1_640x900mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_sra1_640x900mm: iso_sra1_640x900mm = "iso_sra1_640x900mm".asInstanceOf[iso_sra1_640x900mm]
  
  @js.native
  sealed trait iso_sra2_450x640mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_sra2_450x640mm: iso_sra2_450x640mm = "iso_sra2_450x640mm".asInstanceOf[iso_sra2_450x640mm]
  
  @js.native
  sealed trait iso_sra3_320x450mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_sra3_320x450mm: iso_sra3_320x450mm = "iso_sra3_320x450mm".asInstanceOf[iso_sra3_320x450mm]
  
  @js.native
  sealed trait iso_sra4_225x320mm
    extends Media
       with MediaSizeName
  @scala.inline
  def iso_sra4_225x320mm: iso_sra4_225x320mm = "iso_sra4_225x320mm".asInstanceOf[iso_sra4_225x320mm]
  
  @js.native
  sealed trait isostore extends UriSchemes
  @scala.inline
  def isostore: isostore = "isostore".asInstanceOf[isostore]
  
  @js.native
  sealed trait itms extends UriSchemes
  @scala.inline
  def itms: itms = "itms".asInstanceOf[itms]
  
  @js.native
  sealed trait ivory extends MediaColor
  @scala.inline
  def ivory: ivory = "ivory".asInstanceOf[ivory]
  
  @js.native
  sealed trait jabber extends UriSchemes
  @scala.inline
  def jabber: jabber = "jabber".asInstanceOf[jabber]
  
  @js.native
  sealed trait jar extends UriSchemes
  @scala.inline
  def jar: jar = "jar".asInstanceOf[jar]
  
  @js.native
  sealed trait `jdf-f10-1` extends Finishings
  @scala.inline
  def `jdf-f10-1`: `jdf-f10-1` = "jdf-f10-1".asInstanceOf[`jdf-f10-1`]
  
  @js.native
  sealed trait `jdf-f10-2` extends Finishings
  @scala.inline
  def `jdf-f10-2`: `jdf-f10-2` = "jdf-f10-2".asInstanceOf[`jdf-f10-2`]
  
  @js.native
  sealed trait `jdf-f10-3` extends Finishings
  @scala.inline
  def `jdf-f10-3`: `jdf-f10-3` = "jdf-f10-3".asInstanceOf[`jdf-f10-3`]
  
  @js.native
  sealed trait `jdf-f12-1` extends Finishings
  @scala.inline
  def `jdf-f12-1`: `jdf-f12-1` = "jdf-f12-1".asInstanceOf[`jdf-f12-1`]
  
  @js.native
  sealed trait `jdf-f12-10` extends Finishings
  @scala.inline
  def `jdf-f12-10`: `jdf-f12-10` = "jdf-f12-10".asInstanceOf[`jdf-f12-10`]
  
  @js.native
  sealed trait `jdf-f12-11` extends Finishings
  @scala.inline
  def `jdf-f12-11`: `jdf-f12-11` = "jdf-f12-11".asInstanceOf[`jdf-f12-11`]
  
  @js.native
  sealed trait `jdf-f12-12` extends Finishings
  @scala.inline
  def `jdf-f12-12`: `jdf-f12-12` = "jdf-f12-12".asInstanceOf[`jdf-f12-12`]
  
  @js.native
  sealed trait `jdf-f12-13` extends Finishings
  @scala.inline
  def `jdf-f12-13`: `jdf-f12-13` = "jdf-f12-13".asInstanceOf[`jdf-f12-13`]
  
  @js.native
  sealed trait `jdf-f12-14` extends Finishings
  @scala.inline
  def `jdf-f12-14`: `jdf-f12-14` = "jdf-f12-14".asInstanceOf[`jdf-f12-14`]
  
  @js.native
  sealed trait `jdf-f12-2` extends Finishings
  @scala.inline
  def `jdf-f12-2`: `jdf-f12-2` = "jdf-f12-2".asInstanceOf[`jdf-f12-2`]
  
  @js.native
  sealed trait `jdf-f12-3` extends Finishings
  @scala.inline
  def `jdf-f12-3`: `jdf-f12-3` = "jdf-f12-3".asInstanceOf[`jdf-f12-3`]
  
  @js.native
  sealed trait `jdf-f12-4` extends Finishings
  @scala.inline
  def `jdf-f12-4`: `jdf-f12-4` = "jdf-f12-4".asInstanceOf[`jdf-f12-4`]
  
  @js.native
  sealed trait `jdf-f12-5` extends Finishings
  @scala.inline
  def `jdf-f12-5`: `jdf-f12-5` = "jdf-f12-5".asInstanceOf[`jdf-f12-5`]
  
  @js.native
  sealed trait `jdf-f12-6` extends Finishings
  @scala.inline
  def `jdf-f12-6`: `jdf-f12-6` = "jdf-f12-6".asInstanceOf[`jdf-f12-6`]
  
  @js.native
  sealed trait `jdf-f12-7` extends Finishings
  @scala.inline
  def `jdf-f12-7`: `jdf-f12-7` = "jdf-f12-7".asInstanceOf[`jdf-f12-7`]
  
  @js.native
  sealed trait `jdf-f12-8` extends Finishings
  @scala.inline
  def `jdf-f12-8`: `jdf-f12-8` = "jdf-f12-8".asInstanceOf[`jdf-f12-8`]
  
  @js.native
  sealed trait `jdf-f12-9` extends Finishings
  @scala.inline
  def `jdf-f12-9`: `jdf-f12-9` = "jdf-f12-9".asInstanceOf[`jdf-f12-9`]
  
  @js.native
  sealed trait `jdf-f14-1` extends Finishings
  @scala.inline
  def `jdf-f14-1`: `jdf-f14-1` = "jdf-f14-1".asInstanceOf[`jdf-f14-1`]
  
  @js.native
  sealed trait `jdf-f16-1` extends Finishings
  @scala.inline
  def `jdf-f16-1`: `jdf-f16-1` = "jdf-f16-1".asInstanceOf[`jdf-f16-1`]
  
  @js.native
  sealed trait `jdf-f16-10` extends Finishings
  @scala.inline
  def `jdf-f16-10`: `jdf-f16-10` = "jdf-f16-10".asInstanceOf[`jdf-f16-10`]
  
  @js.native
  sealed trait `jdf-f16-11` extends Finishings
  @scala.inline
  def `jdf-f16-11`: `jdf-f16-11` = "jdf-f16-11".asInstanceOf[`jdf-f16-11`]
  
  @js.native
  sealed trait `jdf-f16-12` extends Finishings
  @scala.inline
  def `jdf-f16-12`: `jdf-f16-12` = "jdf-f16-12".asInstanceOf[`jdf-f16-12`]
  
  @js.native
  sealed trait `jdf-f16-13` extends Finishings
  @scala.inline
  def `jdf-f16-13`: `jdf-f16-13` = "jdf-f16-13".asInstanceOf[`jdf-f16-13`]
  
  @js.native
  sealed trait `jdf-f16-14` extends Finishings
  @scala.inline
  def `jdf-f16-14`: `jdf-f16-14` = "jdf-f16-14".asInstanceOf[`jdf-f16-14`]
  
  @js.native
  sealed trait `jdf-f16-2` extends Finishings
  @scala.inline
  def `jdf-f16-2`: `jdf-f16-2` = "jdf-f16-2".asInstanceOf[`jdf-f16-2`]
  
  @js.native
  sealed trait `jdf-f16-3` extends Finishings
  @scala.inline
  def `jdf-f16-3`: `jdf-f16-3` = "jdf-f16-3".asInstanceOf[`jdf-f16-3`]
  
  @js.native
  sealed trait `jdf-f16-4` extends Finishings
  @scala.inline
  def `jdf-f16-4`: `jdf-f16-4` = "jdf-f16-4".asInstanceOf[`jdf-f16-4`]
  
  @js.native
  sealed trait `jdf-f16-5` extends Finishings
  @scala.inline
  def `jdf-f16-5`: `jdf-f16-5` = "jdf-f16-5".asInstanceOf[`jdf-f16-5`]
  
  @js.native
  sealed trait `jdf-f16-6` extends Finishings
  @scala.inline
  def `jdf-f16-6`: `jdf-f16-6` = "jdf-f16-6".asInstanceOf[`jdf-f16-6`]
  
  @js.native
  sealed trait `jdf-f16-7` extends Finishings
  @scala.inline
  def `jdf-f16-7`: `jdf-f16-7` = "jdf-f16-7".asInstanceOf[`jdf-f16-7`]
  
  @js.native
  sealed trait `jdf-f16-8` extends Finishings
  @scala.inline
  def `jdf-f16-8`: `jdf-f16-8` = "jdf-f16-8".asInstanceOf[`jdf-f16-8`]
  
  @js.native
  sealed trait `jdf-f16-9` extends Finishings
  @scala.inline
  def `jdf-f16-9`: `jdf-f16-9` = "jdf-f16-9".asInstanceOf[`jdf-f16-9`]
  
  @js.native
  sealed trait `jdf-f18-1` extends Finishings
  @scala.inline
  def `jdf-f18-1`: `jdf-f18-1` = "jdf-f18-1".asInstanceOf[`jdf-f18-1`]
  
  @js.native
  sealed trait `jdf-f18-2` extends Finishings
  @scala.inline
  def `jdf-f18-2`: `jdf-f18-2` = "jdf-f18-2".asInstanceOf[`jdf-f18-2`]
  
  @js.native
  sealed trait `jdf-f18-3` extends Finishings
  @scala.inline
  def `jdf-f18-3`: `jdf-f18-3` = "jdf-f18-3".asInstanceOf[`jdf-f18-3`]
  
  @js.native
  sealed trait `jdf-f18-4` extends Finishings
  @scala.inline
  def `jdf-f18-4`: `jdf-f18-4` = "jdf-f18-4".asInstanceOf[`jdf-f18-4`]
  
  @js.native
  sealed trait `jdf-f18-5` extends Finishings
  @scala.inline
  def `jdf-f18-5`: `jdf-f18-5` = "jdf-f18-5".asInstanceOf[`jdf-f18-5`]
  
  @js.native
  sealed trait `jdf-f18-6` extends Finishings
  @scala.inline
  def `jdf-f18-6`: `jdf-f18-6` = "jdf-f18-6".asInstanceOf[`jdf-f18-6`]
  
  @js.native
  sealed trait `jdf-f18-7` extends Finishings
  @scala.inline
  def `jdf-f18-7`: `jdf-f18-7` = "jdf-f18-7".asInstanceOf[`jdf-f18-7`]
  
  @js.native
  sealed trait `jdf-f18-8` extends Finishings
  @scala.inline
  def `jdf-f18-8`: `jdf-f18-8` = "jdf-f18-8".asInstanceOf[`jdf-f18-8`]
  
  @js.native
  sealed trait `jdf-f18-9` extends Finishings
  @scala.inline
  def `jdf-f18-9`: `jdf-f18-9` = "jdf-f18-9".asInstanceOf[`jdf-f18-9`]
  
  @js.native
  sealed trait `jdf-f2-1` extends Finishings
  @scala.inline
  def `jdf-f2-1`: `jdf-f2-1` = "jdf-f2-1".asInstanceOf[`jdf-f2-1`]
  
  @js.native
  sealed trait `jdf-f20-1` extends Finishings
  @scala.inline
  def `jdf-f20-1`: `jdf-f20-1` = "jdf-f20-1".asInstanceOf[`jdf-f20-1`]
  
  @js.native
  sealed trait `jdf-f20-2` extends Finishings
  @scala.inline
  def `jdf-f20-2`: `jdf-f20-2` = "jdf-f20-2".asInstanceOf[`jdf-f20-2`]
  
  @js.native
  sealed trait `jdf-f24-1` extends Finishings
  @scala.inline
  def `jdf-f24-1`: `jdf-f24-1` = "jdf-f24-1".asInstanceOf[`jdf-f24-1`]
  
  @js.native
  sealed trait `jdf-f24-10` extends Finishings
  @scala.inline
  def `jdf-f24-10`: `jdf-f24-10` = "jdf-f24-10".asInstanceOf[`jdf-f24-10`]
  
  @js.native
  sealed trait `jdf-f24-11` extends Finishings
  @scala.inline
  def `jdf-f24-11`: `jdf-f24-11` = "jdf-f24-11".asInstanceOf[`jdf-f24-11`]
  
  @js.native
  sealed trait `jdf-f24-2` extends Finishings
  @scala.inline
  def `jdf-f24-2`: `jdf-f24-2` = "jdf-f24-2".asInstanceOf[`jdf-f24-2`]
  
  @js.native
  sealed trait `jdf-f24-3` extends Finishings
  @scala.inline
  def `jdf-f24-3`: `jdf-f24-3` = "jdf-f24-3".asInstanceOf[`jdf-f24-3`]
  
  @js.native
  sealed trait `jdf-f24-4` extends Finishings
  @scala.inline
  def `jdf-f24-4`: `jdf-f24-4` = "jdf-f24-4".asInstanceOf[`jdf-f24-4`]
  
  @js.native
  sealed trait `jdf-f24-5` extends Finishings
  @scala.inline
  def `jdf-f24-5`: `jdf-f24-5` = "jdf-f24-5".asInstanceOf[`jdf-f24-5`]
  
  @js.native
  sealed trait `jdf-f24-6` extends Finishings
  @scala.inline
  def `jdf-f24-6`: `jdf-f24-6` = "jdf-f24-6".asInstanceOf[`jdf-f24-6`]
  
  @js.native
  sealed trait `jdf-f24-7` extends Finishings
  @scala.inline
  def `jdf-f24-7`: `jdf-f24-7` = "jdf-f24-7".asInstanceOf[`jdf-f24-7`]
  
  @js.native
  sealed trait `jdf-f24-8` extends Finishings
  @scala.inline
  def `jdf-f24-8`: `jdf-f24-8` = "jdf-f24-8".asInstanceOf[`jdf-f24-8`]
  
  @js.native
  sealed trait `jdf-f24-9` extends Finishings
  @scala.inline
  def `jdf-f24-9`: `jdf-f24-9` = "jdf-f24-9".asInstanceOf[`jdf-f24-9`]
  
  @js.native
  sealed trait `jdf-f28-1` extends Finishings
  @scala.inline
  def `jdf-f28-1`: `jdf-f28-1` = "jdf-f28-1".asInstanceOf[`jdf-f28-1`]
  
  @js.native
  sealed trait `jdf-f32-1` extends Finishings
  @scala.inline
  def `jdf-f32-1`: `jdf-f32-1` = "jdf-f32-1".asInstanceOf[`jdf-f32-1`]
  
  @js.native
  sealed trait `jdf-f32-2` extends Finishings
  @scala.inline
  def `jdf-f32-2`: `jdf-f32-2` = "jdf-f32-2".asInstanceOf[`jdf-f32-2`]
  
  @js.native
  sealed trait `jdf-f32-3` extends Finishings
  @scala.inline
  def `jdf-f32-3`: `jdf-f32-3` = "jdf-f32-3".asInstanceOf[`jdf-f32-3`]
  
  @js.native
  sealed trait `jdf-f32-4` extends Finishings
  @scala.inline
  def `jdf-f32-4`: `jdf-f32-4` = "jdf-f32-4".asInstanceOf[`jdf-f32-4`]
  
  @js.native
  sealed trait `jdf-f32-5` extends Finishings
  @scala.inline
  def `jdf-f32-5`: `jdf-f32-5` = "jdf-f32-5".asInstanceOf[`jdf-f32-5`]
  
  @js.native
  sealed trait `jdf-f32-6` extends Finishings
  @scala.inline
  def `jdf-f32-6`: `jdf-f32-6` = "jdf-f32-6".asInstanceOf[`jdf-f32-6`]
  
  @js.native
  sealed trait `jdf-f32-7` extends Finishings
  @scala.inline
  def `jdf-f32-7`: `jdf-f32-7` = "jdf-f32-7".asInstanceOf[`jdf-f32-7`]
  
  @js.native
  sealed trait `jdf-f32-8` extends Finishings
  @scala.inline
  def `jdf-f32-8`: `jdf-f32-8` = "jdf-f32-8".asInstanceOf[`jdf-f32-8`]
  
  @js.native
  sealed trait `jdf-f32-9` extends Finishings
  @scala.inline
  def `jdf-f32-9`: `jdf-f32-9` = "jdf-f32-9".asInstanceOf[`jdf-f32-9`]
  
  @js.native
  sealed trait `jdf-f36-1` extends Finishings
  @scala.inline
  def `jdf-f36-1`: `jdf-f36-1` = "jdf-f36-1".asInstanceOf[`jdf-f36-1`]
  
  @js.native
  sealed trait `jdf-f36-2` extends Finishings
  @scala.inline
  def `jdf-f36-2`: `jdf-f36-2` = "jdf-f36-2".asInstanceOf[`jdf-f36-2`]
  
  @js.native
  sealed trait `jdf-f4-1` extends Finishings
  @scala.inline
  def `jdf-f4-1`: `jdf-f4-1` = "jdf-f4-1".asInstanceOf[`jdf-f4-1`]
  
  @js.native
  sealed trait `jdf-f4-2` extends Finishings
  @scala.inline
  def `jdf-f4-2`: `jdf-f4-2` = "jdf-f4-2".asInstanceOf[`jdf-f4-2`]
  
  @js.native
  sealed trait `jdf-f40-1` extends Finishings
  @scala.inline
  def `jdf-f40-1`: `jdf-f40-1` = "jdf-f40-1".asInstanceOf[`jdf-f40-1`]
  
  @js.native
  sealed trait `jdf-f48-1` extends Finishings
  @scala.inline
  def `jdf-f48-1`: `jdf-f48-1` = "jdf-f48-1".asInstanceOf[`jdf-f48-1`]
  
  @js.native
  sealed trait `jdf-f48-2` extends Finishings
  @scala.inline
  def `jdf-f48-2`: `jdf-f48-2` = "jdf-f48-2".asInstanceOf[`jdf-f48-2`]
  
  @js.native
  sealed trait `jdf-f6-1` extends Finishings
  @scala.inline
  def `jdf-f6-1`: `jdf-f6-1` = "jdf-f6-1".asInstanceOf[`jdf-f6-1`]
  
  @js.native
  sealed trait `jdf-f6-2` extends Finishings
  @scala.inline
  def `jdf-f6-2`: `jdf-f6-2` = "jdf-f6-2".asInstanceOf[`jdf-f6-2`]
  
  @js.native
  sealed trait `jdf-f6-3` extends Finishings
  @scala.inline
  def `jdf-f6-3`: `jdf-f6-3` = "jdf-f6-3".asInstanceOf[`jdf-f6-3`]
  
  @js.native
  sealed trait `jdf-f6-4` extends Finishings
  @scala.inline
  def `jdf-f6-4`: `jdf-f6-4` = "jdf-f6-4".asInstanceOf[`jdf-f6-4`]
  
  @js.native
  sealed trait `jdf-f6-5` extends Finishings
  @scala.inline
  def `jdf-f6-5`: `jdf-f6-5` = "jdf-f6-5".asInstanceOf[`jdf-f6-5`]
  
  @js.native
  sealed trait `jdf-f6-6` extends Finishings
  @scala.inline
  def `jdf-f6-6`: `jdf-f6-6` = "jdf-f6-6".asInstanceOf[`jdf-f6-6`]
  
  @js.native
  sealed trait `jdf-f6-7` extends Finishings
  @scala.inline
  def `jdf-f6-7`: `jdf-f6-7` = "jdf-f6-7".asInstanceOf[`jdf-f6-7`]
  
  @js.native
  sealed trait `jdf-f6-8` extends Finishings
  @scala.inline
  def `jdf-f6-8`: `jdf-f6-8` = "jdf-f6-8".asInstanceOf[`jdf-f6-8`]
  
  @js.native
  sealed trait `jdf-f64-1` extends Finishings
  @scala.inline
  def `jdf-f64-1`: `jdf-f64-1` = "jdf-f64-1".asInstanceOf[`jdf-f64-1`]
  
  @js.native
  sealed trait `jdf-f64-2` extends Finishings
  @scala.inline
  def `jdf-f64-2`: `jdf-f64-2` = "jdf-f64-2".asInstanceOf[`jdf-f64-2`]
  
  @js.native
  sealed trait `jdf-f8-1` extends Finishings
  @scala.inline
  def `jdf-f8-1`: `jdf-f8-1` = "jdf-f8-1".asInstanceOf[`jdf-f8-1`]
  
  @js.native
  sealed trait `jdf-f8-2` extends Finishings
  @scala.inline
  def `jdf-f8-2`: `jdf-f8-2` = "jdf-f8-2".asInstanceOf[`jdf-f8-2`]
  
  @js.native
  sealed trait `jdf-f8-3` extends Finishings
  @scala.inline
  def `jdf-f8-3`: `jdf-f8-3` = "jdf-f8-3".asInstanceOf[`jdf-f8-3`]
  
  @js.native
  sealed trait `jdf-f8-4` extends Finishings
  @scala.inline
  def `jdf-f8-4`: `jdf-f8-4` = "jdf-f8-4".asInstanceOf[`jdf-f8-4`]
  
  @js.native
  sealed trait `jdf-f8-5` extends Finishings
  @scala.inline
  def `jdf-f8-5`: `jdf-f8-5` = "jdf-f8-5".asInstanceOf[`jdf-f8-5`]
  
  @js.native
  sealed trait `jdf-f8-6` extends Finishings
  @scala.inline
  def `jdf-f8-6`: `jdf-f8-6` = "jdf-f8-6".asInstanceOf[`jdf-f8-6`]
  
  @js.native
  sealed trait `jdf-f8-7` extends Finishings
  @scala.inline
  def `jdf-f8-7`: `jdf-f8-7` = "jdf-f8-7".asInstanceOf[`jdf-f8-7`]
  
  @js.native
  sealed trait `jis-b0`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b0`: `jis-b0` = "jis-b0".asInstanceOf[`jis-b0`]
  
  @js.native
  sealed trait `jis-b0-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b0-translucent`: `jis-b0-translucent` = "jis-b0-translucent".asInstanceOf[`jis-b0-translucent`]
  
  @js.native
  sealed trait `jis-b0-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b0-transparent`: `jis-b0-transparent` = "jis-b0-transparent".asInstanceOf[`jis-b0-transparent`]
  
  @js.native
  sealed trait `jis-b0-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b0-white`: `jis-b0-white` = "jis-b0-white".asInstanceOf[`jis-b0-white`]
  
  @js.native
  sealed trait `jis-b1`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b1`: `jis-b1` = "jis-b1".asInstanceOf[`jis-b1`]
  
  @js.native
  sealed trait `jis-b1-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b1-translucent`: `jis-b1-translucent` = "jis-b1-translucent".asInstanceOf[`jis-b1-translucent`]
  
  @js.native
  sealed trait `jis-b1-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b1-transparent`: `jis-b1-transparent` = "jis-b1-transparent".asInstanceOf[`jis-b1-transparent`]
  
  @js.native
  sealed trait `jis-b1-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b1-white`: `jis-b1-white` = "jis-b1-white".asInstanceOf[`jis-b1-white`]
  
  @js.native
  sealed trait `jis-b10`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b10`: `jis-b10` = "jis-b10".asInstanceOf[`jis-b10`]
  
  @js.native
  sealed trait `jis-b10-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b10-white`: `jis-b10-white` = "jis-b10-white".asInstanceOf[`jis-b10-white`]
  
  @js.native
  sealed trait `jis-b2`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b2`: `jis-b2` = "jis-b2".asInstanceOf[`jis-b2`]
  
  @js.native
  sealed trait `jis-b2-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b2-translucent`: `jis-b2-translucent` = "jis-b2-translucent".asInstanceOf[`jis-b2-translucent`]
  
  @js.native
  sealed trait `jis-b2-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b2-transparent`: `jis-b2-transparent` = "jis-b2-transparent".asInstanceOf[`jis-b2-transparent`]
  
  @js.native
  sealed trait `jis-b2-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b2-white`: `jis-b2-white` = "jis-b2-white".asInstanceOf[`jis-b2-white`]
  
  @js.native
  sealed trait `jis-b3`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b3`: `jis-b3` = "jis-b3".asInstanceOf[`jis-b3`]
  
  @js.native
  sealed trait `jis-b3-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b3-translucent`: `jis-b3-translucent` = "jis-b3-translucent".asInstanceOf[`jis-b3-translucent`]
  
  @js.native
  sealed trait `jis-b3-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b3-transparent`: `jis-b3-transparent` = "jis-b3-transparent".asInstanceOf[`jis-b3-transparent`]
  
  @js.native
  sealed trait `jis-b3-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b3-white`: `jis-b3-white` = "jis-b3-white".asInstanceOf[`jis-b3-white`]
  
  @js.native
  sealed trait `jis-b4`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b4`: `jis-b4` = "jis-b4".asInstanceOf[`jis-b4`]
  
  @js.native
  sealed trait `jis-b4-colored`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b4-colored`: `jis-b4-colored` = "jis-b4-colored".asInstanceOf[`jis-b4-colored`]
  
  @js.native
  sealed trait `jis-b4-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b4-translucent`: `jis-b4-translucent` = "jis-b4-translucent".asInstanceOf[`jis-b4-translucent`]
  
  @js.native
  sealed trait `jis-b4-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b4-transparent`: `jis-b4-transparent` = "jis-b4-transparent".asInstanceOf[`jis-b4-transparent`]
  
  @js.native
  sealed trait `jis-b4-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b4-white`: `jis-b4-white` = "jis-b4-white".asInstanceOf[`jis-b4-white`]
  
  @js.native
  sealed trait `jis-b5`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b5`: `jis-b5` = "jis-b5".asInstanceOf[`jis-b5`]
  
  @js.native
  sealed trait `jis-b5-colored`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b5-colored`: `jis-b5-colored` = "jis-b5-colored".asInstanceOf[`jis-b5-colored`]
  
  @js.native
  sealed trait `jis-b5-translucent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b5-translucent`: `jis-b5-translucent` = "jis-b5-translucent".asInstanceOf[`jis-b5-translucent`]
  
  @js.native
  sealed trait `jis-b5-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b5-transparent`: `jis-b5-transparent` = "jis-b5-transparent".asInstanceOf[`jis-b5-transparent`]
  
  @js.native
  sealed trait `jis-b5-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b5-white`: `jis-b5-white` = "jis-b5-white".asInstanceOf[`jis-b5-white`]
  
  @js.native
  sealed trait `jis-b6`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b6`: `jis-b6` = "jis-b6".asInstanceOf[`jis-b6`]
  
  @js.native
  sealed trait `jis-b6-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b6-white`: `jis-b6-white` = "jis-b6-white".asInstanceOf[`jis-b6-white`]
  
  @js.native
  sealed trait `jis-b7`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b7`: `jis-b7` = "jis-b7".asInstanceOf[`jis-b7`]
  
  @js.native
  sealed trait `jis-b7-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b7-white`: `jis-b7-white` = "jis-b7-white".asInstanceOf[`jis-b7-white`]
  
  @js.native
  sealed trait `jis-b8`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b8`: `jis-b8` = "jis-b8".asInstanceOf[`jis-b8`]
  
  @js.native
  sealed trait `jis-b8-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b8-white`: `jis-b8-white` = "jis-b8-white".asInstanceOf[`jis-b8-white`]
  
  @js.native
  sealed trait `jis-b9`
    extends Media
       with MediaSizeName
  @scala.inline
  def `jis-b9`: `jis-b9` = "jis-b9".asInstanceOf[`jis-b9`]
  
  @js.native
  sealed trait `jis-b9-white`
    extends Media
       with MediaName
  @scala.inline
  def `jis-b9-white`: `jis-b9-white` = "jis-b9-white".asInstanceOf[`jis-b9-white`]
  
  @js.native
  sealed trait jis_b0_1030x1456mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b0_1030x1456mm: jis_b0_1030x1456mm = "jis_b0_1030x1456mm".asInstanceOf[jis_b0_1030x1456mm]
  
  @js.native
  sealed trait jis_b10_32x45mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b10_32x45mm: jis_b10_32x45mm = "jis_b10_32x45mm".asInstanceOf[jis_b10_32x45mm]
  
  @js.native
  sealed trait jis_b1_728x1030mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b1_728x1030mm: jis_b1_728x1030mm = "jis_b1_728x1030mm".asInstanceOf[jis_b1_728x1030mm]
  
  @js.native
  sealed trait jis_b2_515x728mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b2_515x728mm: jis_b2_515x728mm = "jis_b2_515x728mm".asInstanceOf[jis_b2_515x728mm]
  
  @js.native
  sealed trait jis_b3_364x515mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b3_364x515mm: jis_b3_364x515mm = "jis_b3_364x515mm".asInstanceOf[jis_b3_364x515mm]
  
  @js.native
  sealed trait jis_b4_257x364mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b4_257x364mm: jis_b4_257x364mm = "jis_b4_257x364mm".asInstanceOf[jis_b4_257x364mm]
  
  @js.native
  sealed trait jis_b5_182x257mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b5_182x257mm: jis_b5_182x257mm = "jis_b5_182x257mm".asInstanceOf[jis_b5_182x257mm]
  
  @js.native
  sealed trait jis_b6_128x182mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b6_128x182mm: jis_b6_128x182mm = "jis_b6_128x182mm".asInstanceOf[jis_b6_128x182mm]
  
  @js.native
  sealed trait jis_b7_91x128mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b7_91x128mm: jis_b7_91x128mm = "jis_b7_91x128mm".asInstanceOf[jis_b7_91x128mm]
  
  @js.native
  sealed trait jis_b8_64x91mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b8_64x91mm: jis_b8_64x91mm = "jis_b8_64x91mm".asInstanceOf[jis_b8_64x91mm]
  
  @js.native
  sealed trait jis_b9_45x64mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_b9_45x64mm: jis_b9_45x64mm = "jis_b9_45x64mm".asInstanceOf[jis_b9_45x64mm]
  
  @js.native
  sealed trait jis_exec_216x330mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jis_exec_216x330mm: jis_exec_216x330mm = "jis_exec_216x330mm".asInstanceOf[jis_exec_216x330mm]
  
  @js.native
  sealed trait jms extends UriSchemes
  @scala.inline
  def jms: jms = "jms".asInstanceOf[jms]
  
  @js.native
  sealed trait `job-account-id` extends Overrides
  @scala.inline
  def `job-account-id`: `job-account-id` = "job-account-id".asInstanceOf[`job-account-id`]
  
  @js.native
  sealed trait `job-account-id-actual` extends StObject
  @scala.inline
  def `job-account-id-actual`: `job-account-id-actual` = "job-account-id-actual".asInstanceOf[`job-account-id-actual`]
  
  @js.native
  sealed trait `job-account-id-default` extends StObject
  @scala.inline
  def `job-account-id-default`: `job-account-id-default` = "job-account-id-default".asInstanceOf[`job-account-id-default`]
  
  @js.native
  sealed trait `job-account-id-supported` extends StObject
  @scala.inline
  def `job-account-id-supported`: `job-account-id-supported` = "job-account-id-supported".asInstanceOf[`job-account-id-supported`]
  
  @js.native
  sealed trait `job-account-type` extends Overrides
  @scala.inline
  def `job-account-type`: `job-account-type` = "job-account-type".asInstanceOf[`job-account-type`]
  
  @js.native
  sealed trait `job-account-type-actual` extends StObject
  @scala.inline
  def `job-account-type-actual`: `job-account-type-actual` = "job-account-type-actual".asInstanceOf[`job-account-type-actual`]
  
  @js.native
  sealed trait `job-account-type-default` extends StObject
  @scala.inline
  def `job-account-type-default`: `job-account-type-default` = "job-account-type-default".asInstanceOf[`job-account-type-default`]
  
  @js.native
  sealed trait `job-account-type-supported` extends StObject
  @scala.inline
  def `job-account-type-supported`: `job-account-type-supported` = "job-account-type-supported".asInstanceOf[`job-account-type-supported`]
  
  @js.native
  sealed trait `job-accounting-sheets` extends Overrides
  @scala.inline
  def `job-accounting-sheets`: `job-accounting-sheets` = "job-accounting-sheets".asInstanceOf[`job-accounting-sheets`]
  
  @js.native
  sealed trait `job-accounting-sheets-actual` extends StObject
  @scala.inline
  def `job-accounting-sheets-actual`: `job-accounting-sheets-actual` = "job-accounting-sheets-actual".asInstanceOf[`job-accounting-sheets-actual`]
  
  @js.native
  sealed trait `job-accounting-sheets-default` extends StObject
  @scala.inline
  def `job-accounting-sheets-default`: `job-accounting-sheets-default` = "job-accounting-sheets-default".asInstanceOf[`job-accounting-sheets-default`]
  
  @js.native
  sealed trait `job-accounting-sheets-supported` extends StObject
  @scala.inline
  def `job-accounting-sheets-supported`: `job-accounting-sheets-supported` = "job-accounting-sheets-supported".asInstanceOf[`job-accounting-sheets-supported`]
  
  @js.native
  sealed trait `job-accounting-user-id` extends Overrides
  @scala.inline
  def `job-accounting-user-id`: `job-accounting-user-id` = "job-accounting-user-id".asInstanceOf[`job-accounting-user-id`]
  
  @js.native
  sealed trait `job-accounting-user-id-actual` extends StObject
  @scala.inline
  def `job-accounting-user-id-actual`: `job-accounting-user-id-actual` = "job-accounting-user-id-actual".asInstanceOf[`job-accounting-user-id-actual`]
  
  @js.native
  sealed trait `job-accounting-user-id-default` extends StObject
  @scala.inline
  def `job-accounting-user-id-default`: `job-accounting-user-id-default` = "job-accounting-user-id-default".asInstanceOf[`job-accounting-user-id-default`]
  
  @js.native
  sealed trait `job-accounting-user-id-supported` extends StObject
  @scala.inline
  def `job-accounting-user-id-supported`: `job-accounting-user-id-supported` = "job-accounting-user-id-supported".asInstanceOf[`job-accounting-user-id-supported`]
  
  @js.native
  sealed trait `job-attribute-fidelity` extends StObject
  @scala.inline
  def `job-attribute-fidelity`: `job-attribute-fidelity` = "job-attribute-fidelity".asInstanceOf[`job-attribute-fidelity`]
  
  @js.native
  sealed trait `job-authorization-uri-supported` extends StObject
  @scala.inline
  def `job-authorization-uri-supported`: `job-authorization-uri-supported` = "job-authorization-uri-supported".asInstanceOf[`job-authorization-uri-supported`]
  
  @js.native
  sealed trait `job-both-sheet` extends JobSheets
  @scala.inline
  def `job-both-sheet`: `job-both-sheet` = "job-both-sheet".asInstanceOf[`job-both-sheet`]
  
  @js.native
  sealed trait `job-cancel-after` extends Overrides
  @scala.inline
  def `job-cancel-after`: `job-cancel-after` = "job-cancel-after".asInstanceOf[`job-cancel-after`]
  
  @js.native
  sealed trait `job-cancel-after-default` extends StObject
  @scala.inline
  def `job-cancel-after-default`: `job-cancel-after-default` = "job-cancel-after-default".asInstanceOf[`job-cancel-after-default`]
  
  @js.native
  sealed trait `job-cancel-after-supported` extends StObject
  @scala.inline
  def `job-cancel-after-supported`: `job-cancel-after-supported` = "job-cancel-after-supported".asInstanceOf[`job-cancel-after-supported`]
  
  @js.native
  sealed trait `job-canceled-at-device` extends JobStateReasons
  @scala.inline
  def `job-canceled-at-device`: `job-canceled-at-device` = "job-canceled-at-device".asInstanceOf[`job-canceled-at-device`]
  
  @js.native
  sealed trait `job-canceled-by-operator` extends JobStateReasons
  @scala.inline
  def `job-canceled-by-operator`: `job-canceled-by-operator` = "job-canceled-by-operator".asInstanceOf[`job-canceled-by-operator`]
  
  @js.native
  sealed trait `job-canceled-by-user` extends JobStateReasons
  @scala.inline
  def `job-canceled-by-user`: `job-canceled-by-user` = "job-canceled-by-user".asInstanceOf[`job-canceled-by-user`]
  
  @js.native
  sealed trait `job-completed` extends NotifyEvents
  @scala.inline
  def `job-completed`: `job-completed` = "job-completed".asInstanceOf[`job-completed`]
  
  @js.native
  sealed trait `job-completed-successfully` extends JobStateReasons
  @scala.inline
  def `job-completed-successfully`: `job-completed-successfully` = "job-completed-successfully".asInstanceOf[`job-completed-successfully`]
  
  @js.native
  sealed trait `job-completed-with-errors` extends JobStateReasons
  @scala.inline
  def `job-completed-with-errors`: `job-completed-with-errors` = "job-completed-with-errors".asInstanceOf[`job-completed-with-errors`]
  
  @js.native
  sealed trait `job-completed-with-warnings` extends JobStateReasons
  @scala.inline
  def `job-completed-with-warnings`: `job-completed-with-warnings` = "job-completed-with-warnings".asInstanceOf[`job-completed-with-warnings`]
  
  @js.native
  sealed trait `job-config-changed` extends NotifyEvents
  @scala.inline
  def `job-config-changed`: `job-config-changed` = "job-config-changed".asInstanceOf[`job-config-changed`]
  
  @js.native
  sealed trait `job-constraints-supported` extends StObject
  @scala.inline
  def `job-constraints-supported`: `job-constraints-supported` = "job-constraints-supported".asInstanceOf[`job-constraints-supported`]
  
  @js.native
  sealed trait `job-copies` extends Overrides
  @scala.inline
  def `job-copies`: `job-copies` = "job-copies".asInstanceOf[`job-copies`]
  
  @js.native
  sealed trait `job-cover-back` extends Overrides
  @scala.inline
  def `job-cover-back`: `job-cover-back` = "job-cover-back".asInstanceOf[`job-cover-back`]
  
  @js.native
  sealed trait `job-cover-front` extends Overrides
  @scala.inline
  def `job-cover-front`: `job-cover-front` = "job-cover-front".asInstanceOf[`job-cover-front`]
  
  @js.native
  sealed trait `job-created` extends NotifyEvents
  @scala.inline
  def `job-created`: `job-created` = "job-created".asInstanceOf[`job-created`]
  
  @js.native
  sealed trait `job-creation-attributes-supported` extends StObject
  @scala.inline
  def `job-creation-attributes-supported`: `job-creation-attributes-supported` = "job-creation-attributes-supported".asInstanceOf[`job-creation-attributes-supported`]
  
  @js.native
  sealed trait `job-data-insufficient` extends JobStateReasons
  @scala.inline
  def `job-data-insufficient`: `job-data-insufficient` = "job-data-insufficient".asInstanceOf[`job-data-insufficient`]
  
  @js.native
  sealed trait `job-delay-output-until` extends Overrides
  @scala.inline
  def `job-delay-output-until`: `job-delay-output-until` = "job-delay-output-until".asInstanceOf[`job-delay-output-until`]
  
  @js.native
  sealed trait `job-delay-output-until-default` extends StObject
  @scala.inline
  def `job-delay-output-until-default`: `job-delay-output-until-default` = "job-delay-output-until-default".asInstanceOf[`job-delay-output-until-default`]
  
  @js.native
  sealed trait `job-delay-output-until-interval-supported` extends StObject
  @scala.inline
  def `job-delay-output-until-interval-supported`: `job-delay-output-until-interval-supported` = "job-delay-output-until-interval-supported".asInstanceOf[`job-delay-output-until-interval-supported`]
  
  @js.native
  sealed trait `job-delay-output-until-specified` extends JobStateReasons
  @scala.inline
  def `job-delay-output-until-specified`: `job-delay-output-until-specified` = "job-delay-output-until-specified".asInstanceOf[`job-delay-output-until-specified`]
  
  @js.native
  sealed trait `job-delay-output-until-supported` extends StObject
  @scala.inline
  def `job-delay-output-until-supported`: `job-delay-output-until-supported` = "job-delay-output-until-supported".asInstanceOf[`job-delay-output-until-supported`]
  
  @js.native
  sealed trait `job-delay-output-until-time` extends Overrides
  @scala.inline
  def `job-delay-output-until-time`: `job-delay-output-until-time` = "job-delay-output-until-time".asInstanceOf[`job-delay-output-until-time`]
  
  @js.native
  sealed trait `job-delay-output-until-time-supported` extends StObject
  @scala.inline
  def `job-delay-output-until-time-supported`: `job-delay-output-until-time-supported` = "job-delay-output-until-time-supported".asInstanceOf[`job-delay-output-until-time-supported`]
  
  @js.native
  sealed trait `job-description` extends RequestedJobAttributeGroups
  @scala.inline
  def `job-description`: `job-description` = "job-description".asInstanceOf[`job-description`]
  
  @js.native
  sealed trait `job-destination-spooling-supported` extends StObject
  @scala.inline
  def `job-destination-spooling-supported`: `job-destination-spooling-supported` = "job-destination-spooling-supported".asInstanceOf[`job-destination-spooling-supported`]
  
  @js.native
  sealed trait `job-detailed-status-messages` extends StObject
  @scala.inline
  def `job-detailed-status-messages`: `job-detailed-status-messages` = "job-detailed-status-messages".asInstanceOf[`job-detailed-status-messages`]
  
  @js.native
  sealed trait `job-digital-signature-wait` extends JobStateReasons
  @scala.inline
  def `job-digital-signature-wait`: `job-digital-signature-wait` = "job-digital-signature-wait".asInstanceOf[`job-digital-signature-wait`]
  
  @js.native
  sealed trait `job-document-access-errors` extends StObject
  @scala.inline
  def `job-document-access-errors`: `job-document-access-errors` = "job-document-access-errors".asInstanceOf[`job-document-access-errors`]
  
  @js.native
  sealed trait `job-end-sheet` extends JobSheets
  @scala.inline
  def `job-end-sheet`: `job-end-sheet` = "job-end-sheet".asInstanceOf[`job-end-sheet`]
  
  @js.native
  sealed trait `job-error-action` extends Overrides
  @scala.inline
  def `job-error-action`: `job-error-action` = "job-error-action".asInstanceOf[`job-error-action`]
  
  @js.native
  sealed trait `job-error-action-default` extends StObject
  @scala.inline
  def `job-error-action-default`: `job-error-action-default` = "job-error-action-default".asInstanceOf[`job-error-action-default`]
  
  @js.native
  sealed trait `job-error-action-supported` extends StObject
  @scala.inline
  def `job-error-action-supported`: `job-error-action-supported` = "job-error-action-supported".asInstanceOf[`job-error-action-supported`]
  
  @js.native
  sealed trait `job-error-sheet` extends Overrides
  @scala.inline
  def `job-error-sheet`: `job-error-sheet` = "job-error-sheet".asInstanceOf[`job-error-sheet`]
  
  @js.native
  sealed trait `job-error-sheet-actual` extends StObject
  @scala.inline
  def `job-error-sheet-actual`: `job-error-sheet-actual` = "job-error-sheet-actual".asInstanceOf[`job-error-sheet-actual`]
  
  @js.native
  sealed trait `job-error-sheet-default` extends StObject
  @scala.inline
  def `job-error-sheet-default`: `job-error-sheet-default` = "job-error-sheet-default".asInstanceOf[`job-error-sheet-default`]
  
  @js.native
  sealed trait `job-error-sheet-supported` extends StObject
  @scala.inline
  def `job-error-sheet-supported`: `job-error-sheet-supported` = "job-error-sheet-supported".asInstanceOf[`job-error-sheet-supported`]
  
  @js.native
  sealed trait `job-finishings` extends Overrides
  @scala.inline
  def `job-finishings`: `job-finishings` = "job-finishings".asInstanceOf[`job-finishings`]
  
  @js.native
  sealed trait `job-finishings-col` extends Overrides
  @scala.inline
  def `job-finishings-col`: `job-finishings-col` = "job-finishings-col".asInstanceOf[`job-finishings-col`]
  
  @js.native
  sealed trait `job-history-attributes-configured` extends StObject
  @scala.inline
  def `job-history-attributes-configured`: `job-history-attributes-configured` = "job-history-attributes-configured".asInstanceOf[`job-history-attributes-configured`]
  
  @js.native
  sealed trait `job-history-attributes-supported` extends StObject
  @scala.inline
  def `job-history-attributes-supported`: `job-history-attributes-supported` = "job-history-attributes-supported".asInstanceOf[`job-history-attributes-supported`]
  
  @js.native
  sealed trait `job-history-interval-configured` extends StObject
  @scala.inline
  def `job-history-interval-configured`: `job-history-interval-configured` = "job-history-interval-configured".asInstanceOf[`job-history-interval-configured`]
  
  @js.native
  sealed trait `job-history-interval-supported` extends StObject
  @scala.inline
  def `job-history-interval-supported`: `job-history-interval-supported` = "job-history-interval-supported".asInstanceOf[`job-history-interval-supported`]
  
  @js.native
  sealed trait `job-hold-until` extends Overrides
  @scala.inline
  def `job-hold-until`: `job-hold-until` = "job-hold-until".asInstanceOf[`job-hold-until`]
  
  @js.native
  sealed trait `job-hold-until-actual` extends StObject
  @scala.inline
  def `job-hold-until-actual`: `job-hold-until-actual` = "job-hold-until-actual".asInstanceOf[`job-hold-until-actual`]
  
  @js.native
  sealed trait `job-hold-until-default` extends StObject
  @scala.inline
  def `job-hold-until-default`: `job-hold-until-default` = "job-hold-until-default".asInstanceOf[`job-hold-until-default`]
  
  @js.native
  sealed trait `job-hold-until-specified` extends JobStateReasons
  @scala.inline
  def `job-hold-until-specified`: `job-hold-until-specified` = "job-hold-until-specified".asInstanceOf[`job-hold-until-specified`]
  
  @js.native
  sealed trait `job-hold-until-supported` extends StObject
  @scala.inline
  def `job-hold-until-supported`: `job-hold-until-supported` = "job-hold-until-supported".asInstanceOf[`job-hold-until-supported`]
  
  @js.native
  sealed trait `job-hold-until-time` extends Overrides
  @scala.inline
  def `job-hold-until-time`: `job-hold-until-time` = "job-hold-until-time".asInstanceOf[`job-hold-until-time`]
  
  @js.native
  sealed trait `job-hold-until-time-supported` extends StObject
  @scala.inline
  def `job-hold-until-time-supported`: `job-hold-until-time-supported` = "job-hold-until-time-supported".asInstanceOf[`job-hold-until-time-supported`]
  
  @js.native
  sealed trait `job-id` extends StObject
  @scala.inline
  def `job-id`: `job-id` = "job-id".asInstanceOf[`job-id`]
  
  @js.native
  sealed trait `job-ids-supported` extends StObject
  @scala.inline
  def `job-ids-supported`: `job-ids-supported` = "job-ids-supported".asInstanceOf[`job-ids-supported`]
  
  @js.native
  sealed trait `job-impressions` extends StObject
  @scala.inline
  def `job-impressions`: `job-impressions` = "job-impressions".asInstanceOf[`job-impressions`]
  
  @js.native
  sealed trait `job-impressions-col` extends StObject
  @scala.inline
  def `job-impressions-col`: `job-impressions-col` = "job-impressions-col".asInstanceOf[`job-impressions-col`]
  
  @js.native
  sealed trait `job-impressions-completed` extends StObject
  @scala.inline
  def `job-impressions-completed`: `job-impressions-completed` = "job-impressions-completed".asInstanceOf[`job-impressions-completed`]
  
  @js.native
  sealed trait `job-impressions-completed-col` extends StObject
  @scala.inline
  def `job-impressions-completed-col`: `job-impressions-completed-col` = "job-impressions-completed-col".asInstanceOf[`job-impressions-completed-col`]
  
  @js.native
  sealed trait `job-impressions-supported` extends StObject
  @scala.inline
  def `job-impressions-supported`: `job-impressions-supported` = "job-impressions-supported".asInstanceOf[`job-impressions-supported`]
  
  @js.native
  sealed trait `job-incoming` extends JobStateReasons
  @scala.inline
  def `job-incoming`: `job-incoming` = "job-incoming".asInstanceOf[`job-incoming`]
  
  @js.native
  sealed trait `job-interpreting` extends JobStateReasons
  @scala.inline
  def `job-interpreting`: `job-interpreting` = "job-interpreting".asInstanceOf[`job-interpreting`]
  
  @js.native
  sealed trait `job-k-octets` extends StObject
  @scala.inline
  def `job-k-octets`: `job-k-octets` = "job-k-octets".asInstanceOf[`job-k-octets`]
  
  @js.native
  sealed trait `job-k-octets-processed` extends StObject
  @scala.inline
  def `job-k-octets-processed`: `job-k-octets-processed` = "job-k-octets-processed".asInstanceOf[`job-k-octets-processed`]
  
  @js.native
  sealed trait `job-k-octets-supported` extends StObject
  @scala.inline
  def `job-k-octets-supported`: `job-k-octets-supported` = "job-k-octets-supported".asInstanceOf[`job-k-octets-supported`]
  
  @js.native
  sealed trait `job-mandatory-attributes-supported` extends StObject
  @scala.inline
  def `job-mandatory-attributes-supported`: `job-mandatory-attributes-supported` = "job-mandatory-attributes-supported".asInstanceOf[`job-mandatory-attributes-supported`]
  
  @js.native
  sealed trait `job-media-sheets` extends StObject
  @scala.inline
  def `job-media-sheets`: `job-media-sheets` = "job-media-sheets".asInstanceOf[`job-media-sheets`]
  
  @js.native
  sealed trait `job-media-sheets-col` extends StObject
  @scala.inline
  def `job-media-sheets-col`: `job-media-sheets-col` = "job-media-sheets-col".asInstanceOf[`job-media-sheets-col`]
  
  @js.native
  sealed trait `job-media-sheets-completed` extends StObject
  @scala.inline
  def `job-media-sheets-completed`: `job-media-sheets-completed` = "job-media-sheets-completed".asInstanceOf[`job-media-sheets-completed`]
  
  @js.native
  sealed trait `job-media-sheets-completed-col` extends StObject
  @scala.inline
  def `job-media-sheets-completed-col`: `job-media-sheets-completed-col` = "job-media-sheets-completed-col".asInstanceOf[`job-media-sheets-completed-col`]
  
  @js.native
  sealed trait `job-media-sheets-supported` extends StObject
  @scala.inline
  def `job-media-sheets-supported`: `job-media-sheets-supported` = "job-media-sheets-supported".asInstanceOf[`job-media-sheets-supported`]
  
  @js.native
  sealed trait `job-message-to-operator` extends Overrides
  @scala.inline
  def `job-message-to-operator`: `job-message-to-operator` = "job-message-to-operator".asInstanceOf[`job-message-to-operator`]
  
  @js.native
  sealed trait `job-message-to-operator-default` extends StObject
  @scala.inline
  def `job-message-to-operator-default`: `job-message-to-operator-default` = "job-message-to-operator-default".asInstanceOf[`job-message-to-operator-default`]
  
  @js.native
  sealed trait `job-message-to-operator-supported` extends StObject
  @scala.inline
  def `job-message-to-operator-supported`: `job-message-to-operator-supported` = "job-message-to-operator-supported".asInstanceOf[`job-message-to-operator-supported`]
  
  @js.native
  sealed trait `job-more-info` extends StObject
  @scala.inline
  def `job-more-info`: `job-more-info` = "job-more-info".asInstanceOf[`job-more-info`]
  
  @js.native
  sealed trait `job-originating-user-name` extends StObject
  @scala.inline
  def `job-originating-user-name`: `job-originating-user-name` = "job-originating-user-name".asInstanceOf[`job-originating-user-name`]
  
  @js.native
  sealed trait `job-originating-user-uri` extends StObject
  @scala.inline
  def `job-originating-user-uri`: `job-originating-user-uri` = "job-originating-user-uri".asInstanceOf[`job-originating-user-uri`]
  
  @js.native
  sealed trait `job-outgoing` extends JobStateReasons
  @scala.inline
  def `job-outgoing`: `job-outgoing` = "job-outgoing".asInstanceOf[`job-outgoing`]
  
  @js.native
  sealed trait `job-pages` extends StObject
  @scala.inline
  def `job-pages`: `job-pages` = "job-pages".asInstanceOf[`job-pages`]
  
  @js.native
  sealed trait `job-pages-col` extends StObject
  @scala.inline
  def `job-pages-col`: `job-pages-col` = "job-pages-col".asInstanceOf[`job-pages-col`]
  
  @js.native
  sealed trait `job-pages-completed` extends StObject
  @scala.inline
  def `job-pages-completed`: `job-pages-completed` = "job-pages-completed".asInstanceOf[`job-pages-completed`]
  
  @js.native
  sealed trait `job-pages-completed-col` extends StObject
  @scala.inline
  def `job-pages-completed-col`: `job-pages-completed-col` = "job-pages-completed-col".asInstanceOf[`job-pages-completed-col`]
  
  @js.native
  sealed trait `job-pages-completed-current-copy` extends StObject
  @scala.inline
  def `job-pages-completed-current-copy`: `job-pages-completed-current-copy` = "job-pages-completed-current-copy".asInstanceOf[`job-pages-completed-current-copy`]
  
  @js.native
  sealed trait `job-pages-per-set` extends Overrides
  @scala.inline
  def `job-pages-per-set`: `job-pages-per-set` = "job-pages-per-set".asInstanceOf[`job-pages-per-set`]
  
  @js.native
  sealed trait `job-pages-per-set-supported` extends StObject
  @scala.inline
  def `job-pages-per-set-supported`: `job-pages-per-set-supported` = "job-pages-per-set-supported".asInstanceOf[`job-pages-per-set-supported`]
  
  @js.native
  sealed trait `job-password-encryption-supported` extends StObject
  @scala.inline
  def `job-password-encryption-supported`: `job-password-encryption-supported` = "job-password-encryption-supported".asInstanceOf[`job-password-encryption-supported`]
  
  @js.native
  sealed trait `job-password-length-supported` extends StObject
  @scala.inline
  def `job-password-length-supported`: `job-password-length-supported` = "job-password-length-supported".asInstanceOf[`job-password-length-supported`]
  
  @js.native
  sealed trait `job-password-repertoire-configured` extends StObject
  @scala.inline
  def `job-password-repertoire-configured`: `job-password-repertoire-configured` = "job-password-repertoire-configured".asInstanceOf[`job-password-repertoire-configured`]
  
  @js.native
  sealed trait `job-password-repertoire-supported` extends StObject
  @scala.inline
  def `job-password-repertoire-supported`: `job-password-repertoire-supported` = "job-password-repertoire-supported".asInstanceOf[`job-password-repertoire-supported`]
  
  @js.native
  sealed trait `job-password-supported` extends StObject
  @scala.inline
  def `job-password-supported`: `job-password-supported` = "job-password-supported".asInstanceOf[`job-password-supported`]
  
  @js.native
  sealed trait `job-password-wait` extends JobStateReasons
  @scala.inline
  def `job-password-wait`: `job-password-wait` = "job-password-wait".asInstanceOf[`job-password-wait`]
  
  @js.native
  sealed trait `job-phone-number` extends Overrides
  @scala.inline
  def `job-phone-number`: `job-phone-number` = "job-phone-number".asInstanceOf[`job-phone-number`]
  
  @js.native
  sealed trait `job-phone-number-default` extends StObject
  @scala.inline
  def `job-phone-number-default`: `job-phone-number-default` = "job-phone-number-default".asInstanceOf[`job-phone-number-default`]
  
  @js.native
  sealed trait `job-phone-number-supported` extends StObject
  @scala.inline
  def `job-phone-number-supported`: `job-phone-number-supported` = "job-phone-number-supported".asInstanceOf[`job-phone-number-supported`]
  
  @js.native
  sealed trait `job-presets-supported` extends StObject
  @scala.inline
  def `job-presets-supported`: `job-presets-supported` = "job-presets-supported".asInstanceOf[`job-presets-supported`]
  
  @js.native
  sealed trait `job-printed-successfully` extends JobStateReasons
  @scala.inline
  def `job-printed-successfully`: `job-printed-successfully` = "job-printed-successfully".asInstanceOf[`job-printed-successfully`]
  
  @js.native
  sealed trait `job-printed-with-errors` extends JobStateReasons
  @scala.inline
  def `job-printed-with-errors`: `job-printed-with-errors` = "job-printed-with-errors".asInstanceOf[`job-printed-with-errors`]
  
  @js.native
  sealed trait `job-printed-with-warnings` extends JobStateReasons
  @scala.inline
  def `job-printed-with-warnings`: `job-printed-with-warnings` = "job-printed-with-warnings".asInstanceOf[`job-printed-with-warnings`]
  
  @js.native
  sealed trait `job-printer-up-time` extends StObject
  @scala.inline
  def `job-printer-up-time`: `job-printer-up-time` = "job-printer-up-time".asInstanceOf[`job-printer-up-time`]
  
  @js.native
  sealed trait `job-printer-uri` extends StObject
  @scala.inline
  def `job-printer-uri`: `job-printer-uri` = "job-printer-uri".asInstanceOf[`job-printer-uri`]
  
  @js.native
  sealed trait `job-printing` extends JobStateReasons
  @scala.inline
  def `job-printing`: `job-printing` = "job-printing".asInstanceOf[`job-printing`]
  
  @js.native
  sealed trait `job-priority` extends Overrides
  @scala.inline
  def `job-priority`: `job-priority` = "job-priority".asInstanceOf[`job-priority`]
  
  @js.native
  sealed trait `job-priority-actual` extends StObject
  @scala.inline
  def `job-priority-actual`: `job-priority-actual` = "job-priority-actual".asInstanceOf[`job-priority-actual`]
  
  @js.native
  sealed trait `job-priority-default` extends StObject
  @scala.inline
  def `job-priority-default`: `job-priority-default` = "job-priority-default".asInstanceOf[`job-priority-default`]
  
  @js.native
  sealed trait `job-priority-supported` extends StObject
  @scala.inline
  def `job-priority-supported`: `job-priority-supported` = "job-priority-supported".asInstanceOf[`job-priority-supported`]
  
  @js.native
  sealed trait `job-privacy-attributes` extends StObject
  @scala.inline
  def `job-privacy-attributes`: `job-privacy-attributes` = "job-privacy-attributes".asInstanceOf[`job-privacy-attributes`]
  
  @js.native
  sealed trait `job-privacy-scope` extends StObject
  @scala.inline
  def `job-privacy-scope`: `job-privacy-scope` = "job-privacy-scope".asInstanceOf[`job-privacy-scope`]
  
  @js.native
  sealed trait `job-progress` extends NotifyEvents
  @scala.inline
  def `job-progress`: `job-progress` = "job-progress".asInstanceOf[`job-progress`]
  
  @js.native
  sealed trait `job-queued` extends JobStateReasons
  @scala.inline
  def `job-queued`: `job-queued` = "job-queued".asInstanceOf[`job-queued`]
  
  @js.native
  sealed trait `job-queued-for-marker` extends JobStateReasons
  @scala.inline
  def `job-queued-for-marker`: `job-queued-for-marker` = "job-queued-for-marker".asInstanceOf[`job-queued-for-marker`]
  
  @js.native
  sealed trait `job-recipient-name` extends Overrides
  @scala.inline
  def `job-recipient-name`: `job-recipient-name` = "job-recipient-name".asInstanceOf[`job-recipient-name`]
  
  @js.native
  sealed trait `job-recipient-name-default` extends StObject
  @scala.inline
  def `job-recipient-name-default`: `job-recipient-name-default` = "job-recipient-name-default".asInstanceOf[`job-recipient-name-default`]
  
  @js.native
  sealed trait `job-recipient-name-supported` extends StObject
  @scala.inline
  def `job-recipient-name-supported`: `job-recipient-name-supported` = "job-recipient-name-supported".asInstanceOf[`job-recipient-name-supported`]
  
  @js.native
  sealed trait `job-resolvers-supported` extends StObject
  @scala.inline
  def `job-resolvers-supported`: `job-resolvers-supported` = "job-resolvers-supported".asInstanceOf[`job-resolvers-supported`]
  
  @js.native
  sealed trait `job-resource-ids` extends StObject
  @scala.inline
  def `job-resource-ids`: `job-resource-ids` = "job-resource-ids".asInstanceOf[`job-resource-ids`]
  
  @js.native
  sealed trait `job-restartable` extends JobStateReasons
  @scala.inline
  def `job-restartable`: `job-restartable` = "job-restartable".asInstanceOf[`job-restartable`]
  
  @js.native
  sealed trait `job-resuming` extends JobStateReasons
  @scala.inline
  def `job-resuming`: `job-resuming` = "job-resuming".asInstanceOf[`job-resuming`]
  
  @js.native
  sealed trait `job-retain-until` extends Overrides
  @scala.inline
  def `job-retain-until`: `job-retain-until` = "job-retain-until".asInstanceOf[`job-retain-until`]
  
  @js.native
  sealed trait `job-retain-until-default` extends StObject
  @scala.inline
  def `job-retain-until-default`: `job-retain-until-default` = "job-retain-until-default".asInstanceOf[`job-retain-until-default`]
  
  @js.native
  sealed trait `job-retain-until-interval` extends Overrides
  @scala.inline
  def `job-retain-until-interval`: `job-retain-until-interval` = "job-retain-until-interval".asInstanceOf[`job-retain-until-interval`]
  
  @js.native
  sealed trait `job-retain-until-interval-supported` extends StObject
  @scala.inline
  def `job-retain-until-interval-supported`: `job-retain-until-interval-supported` = "job-retain-until-interval-supported".asInstanceOf[`job-retain-until-interval-supported`]
  
  @js.native
  sealed trait `job-retain-until-supported` extends StObject
  @scala.inline
  def `job-retain-until-supported`: `job-retain-until-supported` = "job-retain-until-supported".asInstanceOf[`job-retain-until-supported`]
  
  @js.native
  sealed trait `job-retain-until-time` extends Overrides
  @scala.inline
  def `job-retain-until-time`: `job-retain-until-time` = "job-retain-until-time".asInstanceOf[`job-retain-until-time`]
  
  @js.native
  sealed trait `job-retain-until-time-supported` extends StObject
  @scala.inline
  def `job-retain-until-time-supported`: `job-retain-until-time-supported` = "job-retain-until-time-supported".asInstanceOf[`job-retain-until-time-supported`]
  
  @js.native
  sealed trait `job-save` extends StObject
  @scala.inline
  def `job-save`: `job-save` = "job-save".asInstanceOf[`job-save`]
  
  @js.native
  sealed trait `job-save-disposition` extends Overrides
  @scala.inline
  def `job-save-disposition`: `job-save-disposition` = "job-save-disposition".asInstanceOf[`job-save-disposition`]
  
  @js.native
  sealed trait `job-saved-successfully` extends JobStateReasons
  @scala.inline
  def `job-saved-successfully`: `job-saved-successfully` = "job-saved-successfully".asInstanceOf[`job-saved-successfully`]
  
  @js.native
  sealed trait `job-saved-with-errors` extends JobStateReasons
  @scala.inline
  def `job-saved-with-errors`: `job-saved-with-errors` = "job-saved-with-errors".asInstanceOf[`job-saved-with-errors`]
  
  @js.native
  sealed trait `job-saved-with-warnings` extends JobStateReasons
  @scala.inline
  def `job-saved-with-warnings`: `job-saved-with-warnings` = "job-saved-with-warnings".asInstanceOf[`job-saved-with-warnings`]
  
  @js.native
  sealed trait `job-saving` extends JobStateReasons
  @scala.inline
  def `job-saving`: `job-saving` = "job-saving".asInstanceOf[`job-saving`]
  
  @js.native
  sealed trait `job-sheet-message` extends Overrides
  @scala.inline
  def `job-sheet-message`: `job-sheet-message` = "job-sheet-message".asInstanceOf[`job-sheet-message`]
  
  @js.native
  sealed trait `job-sheet-message-actual` extends StObject
  @scala.inline
  def `job-sheet-message-actual`: `job-sheet-message-actual` = "job-sheet-message-actual".asInstanceOf[`job-sheet-message-actual`]
  
  @js.native
  sealed trait `job-sheet-message-default` extends StObject
  @scala.inline
  def `job-sheet-message-default`: `job-sheet-message-default` = "job-sheet-message-default".asInstanceOf[`job-sheet-message-default`]
  
  @js.native
  sealed trait `job-sheet-message-supported` extends StObject
  @scala.inline
  def `job-sheet-message-supported`: `job-sheet-message-supported` = "job-sheet-message-supported".asInstanceOf[`job-sheet-message-supported`]
  
  @js.native
  sealed trait `job-sheets` extends Overrides
  @scala.inline
  def `job-sheets`: `job-sheets` = "job-sheets".asInstanceOf[`job-sheets`]
  
  @js.native
  sealed trait `job-sheets-actual` extends StObject
  @scala.inline
  def `job-sheets-actual`: `job-sheets-actual` = "job-sheets-actual".asInstanceOf[`job-sheets-actual`]
  
  @js.native
  sealed trait `job-sheets-col` extends Overrides
  @scala.inline
  def `job-sheets-col`: `job-sheets-col` = "job-sheets-col".asInstanceOf[`job-sheets-col`]
  
  @js.native
  sealed trait `job-sheets-col-actual` extends StObject
  @scala.inline
  def `job-sheets-col-actual`: `job-sheets-col-actual` = "job-sheets-col-actual".asInstanceOf[`job-sheets-col-actual`]
  
  @js.native
  sealed trait `job-sheets-col-default` extends StObject
  @scala.inline
  def `job-sheets-col-default`: `job-sheets-col-default` = "job-sheets-col-default".asInstanceOf[`job-sheets-col-default`]
  
  @js.native
  sealed trait `job-sheets-col-supported` extends StObject
  @scala.inline
  def `job-sheets-col-supported`: `job-sheets-col-supported` = "job-sheets-col-supported".asInstanceOf[`job-sheets-col-supported`]
  
  @js.native
  sealed trait `job-sheets-default` extends StObject
  @scala.inline
  def `job-sheets-default`: `job-sheets-default` = "job-sheets-default".asInstanceOf[`job-sheets-default`]
  
  @js.native
  sealed trait `job-sheets-supported` extends StObject
  @scala.inline
  def `job-sheets-supported`: `job-sheets-supported` = "job-sheets-supported".asInstanceOf[`job-sheets-supported`]
  
  @js.native
  sealed trait `job-spooling` extends JobStateReasons
  @scala.inline
  def `job-spooling`: `job-spooling` = "job-spooling".asInstanceOf[`job-spooling`]
  
  @js.native
  sealed trait `job-spooling-supported` extends StObject
  @scala.inline
  def `job-spooling-supported`: `job-spooling-supported` = "job-spooling-supported".asInstanceOf[`job-spooling-supported`]
  
  @js.native
  sealed trait `job-start-sheet` extends JobSheets
  @scala.inline
  def `job-start-sheet`: `job-start-sheet` = "job-start-sheet".asInstanceOf[`job-start-sheet`]
  
  @js.native
  sealed trait `job-state` extends StObject
  @scala.inline
  def `job-state`: `job-state` = "job-state".asInstanceOf[`job-state`]
  
  @js.native
  sealed trait `job-state-changed` extends NotifyEvents
  @scala.inline
  def `job-state-changed`: `job-state-changed` = "job-state-changed".asInstanceOf[`job-state-changed`]
  
  @js.native
  sealed trait `job-state-message` extends StObject
  @scala.inline
  def `job-state-message`: `job-state-message` = "job-state-message".asInstanceOf[`job-state-message`]
  
  @js.native
  sealed trait `job-state-reasons` extends StObject
  @scala.inline
  def `job-state-reasons`: `job-state-reasons` = "job-state-reasons".asInstanceOf[`job-state-reasons`]
  
  @js.native
  sealed trait `job-stopped` extends NotifyEvents
  @scala.inline
  def `job-stopped`: `job-stopped` = "job-stopped".asInstanceOf[`job-stopped`]
  
  @js.native
  sealed trait `job-streaming` extends JobStateReasons
  @scala.inline
  def `job-streaming`: `job-streaming` = "job-streaming".asInstanceOf[`job-streaming`]
  
  @js.native
  sealed trait `job-suspended` extends JobStateReasons
  @scala.inline
  def `job-suspended`: `job-suspended` = "job-suspended".asInstanceOf[`job-suspended`]
  
  @js.native
  sealed trait `job-suspended-by-operator` extends JobStateReasons
  @scala.inline
  def `job-suspended-by-operator`: `job-suspended-by-operator` = "job-suspended-by-operator".asInstanceOf[`job-suspended-by-operator`]
  
  @js.native
  sealed trait `job-suspended-by-system` extends JobStateReasons
  @scala.inline
  def `job-suspended-by-system`: `job-suspended-by-system` = "job-suspended-by-system".asInstanceOf[`job-suspended-by-system`]
  
  @js.native
  sealed trait `job-suspended-by-user` extends JobStateReasons
  @scala.inline
  def `job-suspended-by-user`: `job-suspended-by-user` = "job-suspended-by-user".asInstanceOf[`job-suspended-by-user`]
  
  @js.native
  sealed trait `job-suspending` extends JobStateReasons
  @scala.inline
  def `job-suspending`: `job-suspending` = "job-suspending".asInstanceOf[`job-suspending`]
  
  @js.native
  sealed trait `job-template`
    extends RequestedJobAttributeGroups
       with RequestedPrinterAttributeGroups
  @scala.inline
  def `job-template`: `job-template` = "job-template".asInstanceOf[`job-template`]
  
  @js.native
  sealed trait `job-transforming` extends JobStateReasons
  @scala.inline
  def `job-transforming`: `job-transforming` = "job-transforming".asInstanceOf[`job-transforming`]
  
  @js.native
  sealed trait `job-triggers-supported` extends StObject
  @scala.inline
  def `job-triggers-supported`: `job-triggers-supported` = "job-triggers-supported".asInstanceOf[`job-triggers-supported`]
  
  @js.native
  sealed trait `job-uri` extends StObject
  @scala.inline
  def `job-uri`: `job-uri` = "job-uri".asInstanceOf[`job-uri`]
  
  @js.native
  sealed trait `job-uuid` extends StObject
  @scala.inline
  def `job-uuid`: `job-uuid` = "job-uuid".asInstanceOf[`job-uuid`]
  
  @js.native
  sealed trait `jog-offset` extends Finishings
  @scala.inline
  def `jog-offset`: `jog-offset` = "jog-offset".asInstanceOf[`jog-offset`]
  
  @js.native
  sealed trait `jpeg-features-supported` extends StObject
  @scala.inline
  def `jpeg-features-supported`: `jpeg-features-supported` = "jpeg-features-supported".asInstanceOf[`jpeg-features-supported`]
  
  @js.native
  sealed trait `jpeg-k-octets-supported` extends StObject
  @scala.inline
  def `jpeg-k-octets-supported`: `jpeg-k-octets-supported` = "jpeg-k-octets-supported".asInstanceOf[`jpeg-k-octets-supported`]
  
  @js.native
  sealed trait `jpeg-x-dimension-supported` extends StObject
  @scala.inline
  def `jpeg-x-dimension-supported`: `jpeg-x-dimension-supported` = "jpeg-x-dimension-supported".asInstanceOf[`jpeg-x-dimension-supported`]
  
  @js.native
  sealed trait `jpeg-y-dimension-supported` extends StObject
  @scala.inline
  def `jpeg-y-dimension-supported`: `jpeg-y-dimension-supported` = "jpeg-y-dimension-supported".asInstanceOf[`jpeg-y-dimension-supported`]
  
  @js.native
  sealed trait jpn_chou2_111Dot1x146mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_chou2_111Dot1x146mm: jpn_chou2_111Dot1x146mm = "jpn_chou2_111.1x146mm".asInstanceOf[jpn_chou2_111Dot1x146mm]
  
  @js.native
  sealed trait jpn_chou3_120x235mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_chou3_120x235mm: jpn_chou3_120x235mm = "jpn_chou3_120x235mm".asInstanceOf[jpn_chou3_120x235mm]
  
  @js.native
  sealed trait jpn_chou40_90x225mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_chou40_90x225mm: jpn_chou40_90x225mm = "jpn_chou40_90x225mm".asInstanceOf[jpn_chou40_90x225mm]
  
  @js.native
  sealed trait jpn_chou4_90x205mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_chou4_90x205mm: jpn_chou4_90x205mm = "jpn_chou4_90x205mm".asInstanceOf[jpn_chou4_90x205mm]
  
  @js.native
  sealed trait jpn_hagaki_100x148mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_hagaki_100x148mm: jpn_hagaki_100x148mm = "jpn_hagaki_100x148mm".asInstanceOf[jpn_hagaki_100x148mm]
  
  @js.native
  sealed trait jpn_kahu_240x322Dot1mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kahu_240x322Dot1mm: jpn_kahu_240x322Dot1mm = "jpn_kahu_240x322.1mm".asInstanceOf[jpn_kahu_240x322Dot1mm]
  
  @js.native
  sealed trait jpn_kaku1_270x382mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku1_270x382mm: jpn_kaku1_270x382mm = "jpn_kaku1_270x382mm".asInstanceOf[jpn_kaku1_270x382mm]
  
  @js.native
  sealed trait jpn_kaku2_240x332mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku2_240x332mm: jpn_kaku2_240x332mm = "jpn_kaku2_240x332mm".asInstanceOf[jpn_kaku2_240x332mm]
  
  @js.native
  sealed trait jpn_kaku3_216x277mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku3_216x277mm: jpn_kaku3_216x277mm = "jpn_kaku3_216x277mm".asInstanceOf[jpn_kaku3_216x277mm]
  
  @js.native
  sealed trait jpn_kaku4_197x267mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku4_197x267mm: jpn_kaku4_197x267mm = "jpn_kaku4_197x267mm".asInstanceOf[jpn_kaku4_197x267mm]
  
  @js.native
  sealed trait jpn_kaku5_190x240mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku5_190x240mm: jpn_kaku5_190x240mm = "jpn_kaku5_190x240mm".asInstanceOf[jpn_kaku5_190x240mm]
  
  @js.native
  sealed trait jpn_kaku7_142x205mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku7_142x205mm: jpn_kaku7_142x205mm = "jpn_kaku7_142x205mm".asInstanceOf[jpn_kaku7_142x205mm]
  
  @js.native
  sealed trait jpn_kaku8_119x197mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_kaku8_119x197mm: jpn_kaku8_119x197mm = "jpn_kaku8_119x197mm".asInstanceOf[jpn_kaku8_119x197mm]
  
  @js.native
  sealed trait jpn_oufuku_148x200mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_oufuku_148x200mm: jpn_oufuku_148x200mm = "jpn_oufuku_148x200mm".asInstanceOf[jpn_oufuku_148x200mm]
  
  @js.native
  sealed trait jpn_you4_105x235mm
    extends Media
       with MediaSizeName
  @scala.inline
  def jpn_you4_105x235mm: jpn_you4_105x235mm = "jpn_you4_105x235mm".asInstanceOf[jpn_you4_105x235mm]
  
  @js.native
  sealed trait keyparc extends UriSchemes
  @scala.inline
  def keyparc: keyparc = "keyparc".asInstanceOf[keyparc]
  
  @js.native
  sealed trait kg extends MaterialAmountUnits
  @scala.inline
  def kg: kg = "kg".asInstanceOf[kg]
  
  @js.native
  sealed trait `koi8-r` extends CharacterSet
  @scala.inline
  def `koi8-r`: `koi8-r` = "koi8-r".asInstanceOf[`koi8-r`]
  
  @js.native
  sealed trait `koi8-u` extends CharacterSet
  @scala.inline
  def `koi8-u`: `koi8-u` = "koi8-u".asInstanceOf[`koi8-u`]
  
  @js.native
  sealed trait `ks_c_5601-1987` extends CharacterSet
  @scala.inline
  def `ks_c_5601-1987`: `ks_c_5601-1987` = "ks_c_5601-1987".asInstanceOf[`ks_c_5601-1987`]
  
  @js.native
  sealed trait l extends MaterialAmountUnits
  @scala.inline
  def l: l = "l".asInstanceOf[l]
  
  @js.native
  sealed trait label extends PrinterKind
  @scala.inline
  def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait labels extends MediaType
  @scala.inline
  def labels: labels = "labels".asInstanceOf[labels]
  
  @js.native
  sealed trait `labels-colored` extends MediaType
  @scala.inline
  def `labels-colored`: `labels-colored` = "labels-colored".asInstanceOf[`labels-colored`]
  
  @js.native
  sealed trait `labels-glossy` extends MediaType
  @scala.inline
  def `labels-glossy`: `labels-glossy` = "labels-glossy".asInstanceOf[`labels-glossy`]
  
  @js.native
  sealed trait `labels-high-gloss` extends MediaType
  @scala.inline
  def `labels-high-gloss`: `labels-high-gloss` = "labels-high-gloss".asInstanceOf[`labels-high-gloss`]
  
  @js.native
  sealed trait `labels-inkjet` extends MediaType
  @scala.inline
  def `labels-inkjet`: `labels-inkjet` = "labels-inkjet".asInstanceOf[`labels-inkjet`]
  
  @js.native
  sealed trait `labels-matte` extends MediaType
  @scala.inline
  def `labels-matte`: `labels-matte` = "labels-matte".asInstanceOf[`labels-matte`]
  
  @js.native
  sealed trait `labels-permanent` extends MediaType
  @scala.inline
  def `labels-permanent`: `labels-permanent` = "labels-permanent".asInstanceOf[`labels-permanent`]
  
  @js.native
  sealed trait `labels-satin` extends MediaType
  @scala.inline
  def `labels-satin`: `labels-satin` = "labels-satin".asInstanceOf[`labels-satin`]
  
  @js.native
  sealed trait `labels-security` extends MediaType
  @scala.inline
  def `labels-security`: `labels-security` = "labels-security".asInstanceOf[`labels-security`]
  
  @js.native
  sealed trait `labels-semi-gloss` extends MediaType
  @scala.inline
  def `labels-semi-gloss`: `labels-semi-gloss` = "labels-semi-gloss".asInstanceOf[`labels-semi-gloss`]
  
  @js.native
  sealed trait laminate extends Finishings
  @scala.inline
  def laminate: laminate = "laminate".asInstanceOf[laminate]
  
  @js.native
  sealed trait laminating extends StObject
  @scala.inline
  def laminating: laminating = "laminating".asInstanceOf[laminating]
  
  @js.native
  sealed trait `laminating-foil` extends MediaType
  @scala.inline
  def `laminating-foil`: `laminating-foil` = "laminating-foil".asInstanceOf[`laminating-foil`]
  
  @js.native
  sealed trait `laminating-sides-supported` extends StObject
  @scala.inline
  def `laminating-sides-supported`: `laminating-sides-supported` = "laminating-sides-supported".asInstanceOf[`laminating-sides-supported`]
  
  @js.native
  sealed trait `laminating-type-supported` extends StObject
  @scala.inline
  def `laminating-type-supported`: `laminating-type-supported` = "laminating-type-supported".asInstanceOf[`laminating-type-supported`]
  
  @js.native
  sealed trait landscape extends OrientationRequested
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait large extends PrinterKind
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait `large-capacity`
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
  @scala.inline
  def `large-capacity`: `large-capacity` = "large-capacity".asInstanceOf[`large-capacity`]
  
  @js.native
  sealed trait lastfm extends UriSchemes
  @scala.inline
  def lastfm: lastfm = "lastfm".asInstanceOf[lastfm]
  
  @js.native
  sealed trait ldap extends UriSchemes
  @scala.inline
  def ldap: ldap = "ldap".asInstanceOf[ldap]
  
  @js.native
  sealed trait ldaps extends UriSchemes
  @scala.inline
  def ldaps: ldaps = "ldaps".asInstanceOf[ldaps]
  
  @js.native
  sealed trait leaptofrogans extends UriSchemes
  @scala.inline
  def leaptofrogans: leaptofrogans = "leaptofrogans".asInstanceOf[leaptofrogans]
  
  @js.native
  sealed trait ledger
    extends Media
       with MediaSizeName
  @scala.inline
  def ledger: ledger = "ledger".asInstanceOf[ledger]
  
  @js.native
  sealed trait `ledger-white`
    extends Media
       with MediaName
  @scala.inline
  def `ledger-white`: `ledger-white` = "ledger-white".asInstanceOf[`ledger-white`]
  
  @js.native
  sealed trait left
    extends MediaSource
       with OutputBin
       with ReferenceEdge
       with XImagePosition
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `letter-head` extends MediaPrePrinted
  @scala.inline
  def `letter-head`: `letter-head` = "letter-head".asInstanceOf[`letter-head`]
  
  @js.native
  sealed trait letterhead extends MediaType
  @scala.inline
  def letterhead: letterhead = "letterhead".asInstanceOf[letterhead]
  
  @js.native
  sealed trait `light-black` extends MediaColor
  @scala.inline
  def `light-black`: `light-black` = "light-black".asInstanceOf[`light-black`]
  
  @js.native
  sealed trait `light-blue` extends MediaColor
  @scala.inline
  def `light-blue`: `light-blue` = "light-blue".asInstanceOf[`light-blue`]
  
  @js.native
  sealed trait `light-brown` extends MediaColor
  @scala.inline
  def `light-brown`: `light-brown` = "light-brown".asInstanceOf[`light-brown`]
  
  @js.native
  sealed trait `light-buff` extends MediaColor
  @scala.inline
  def `light-buff`: `light-buff` = "light-buff".asInstanceOf[`light-buff`]
  
  @js.native
  sealed trait `light-cyan` extends MediaColor
  @scala.inline
  def `light-cyan`: `light-cyan` = "light-cyan".asInstanceOf[`light-cyan`]
  
  @js.native
  sealed trait `light-gold` extends MediaColor
  @scala.inline
  def `light-gold`: `light-gold` = "light-gold".asInstanceOf[`light-gold`]
  
  @js.native
  sealed trait `light-goldenrod` extends MediaColor
  @scala.inline
  def `light-goldenrod`: `light-goldenrod` = "light-goldenrod".asInstanceOf[`light-goldenrod`]
  
  @js.native
  sealed trait `light-gray` extends MediaColor
  @scala.inline
  def `light-gray`: `light-gray` = "light-gray".asInstanceOf[`light-gray`]
  
  @js.native
  sealed trait `light-green` extends MediaColor
  @scala.inline
  def `light-green`: `light-green` = "light-green".asInstanceOf[`light-green`]
  
  @js.native
  sealed trait `light-ivory` extends MediaColor
  @scala.inline
  def `light-ivory`: `light-ivory` = "light-ivory".asInstanceOf[`light-ivory`]
  
  @js.native
  sealed trait `light-magenta` extends MediaColor
  @scala.inline
  def `light-magenta`: `light-magenta` = "light-magenta".asInstanceOf[`light-magenta`]
  
  @js.native
  sealed trait `light-mustard` extends MediaColor
  @scala.inline
  def `light-mustard`: `light-mustard` = "light-mustard".asInstanceOf[`light-mustard`]
  
  @js.native
  sealed trait `light-orange` extends MediaColor
  @scala.inline
  def `light-orange`: `light-orange` = "light-orange".asInstanceOf[`light-orange`]
  
  @js.native
  sealed trait `light-pink` extends MediaColor
  @scala.inline
  def `light-pink`: `light-pink` = "light-pink".asInstanceOf[`light-pink`]
  
  @js.native
  sealed trait `light-red` extends MediaColor
  @scala.inline
  def `light-red`: `light-red` = "light-red".asInstanceOf[`light-red`]
  
  @js.native
  sealed trait `light-silver` extends MediaColor
  @scala.inline
  def `light-silver`: `light-silver` = "light-silver".asInstanceOf[`light-silver`]
  
  @js.native
  sealed trait `light-turquoise` extends MediaColor
  @scala.inline
  def `light-turquoise`: `light-turquoise` = "light-turquoise".asInstanceOf[`light-turquoise`]
  
  @js.native
  sealed trait `light-violet` extends MediaColor
  @scala.inline
  def `light-violet`: `light-violet` = "light-violet".asInstanceOf[`light-violet`]
  
  @js.native
  sealed trait `light-yellow` extends MediaColor
  @scala.inline
  def `light-yellow`: `light-yellow` = "light-yellow".asInstanceOf[`light-yellow`]
  
  @js.native
  sealed trait `line-art` extends InputContentType
  @scala.inline
  def `line-art`: `line-art` = "line-art".asInstanceOf[`line-art`]
  
  @js.native
  sealed trait linen extends MediaTooth
  @scala.inline
  def linen: linen = "linen".asInstanceOf[linen]
  
  @js.native
  sealed trait `logo-uri-formats-supported` extends StObject
  @scala.inline
  def `logo-uri-formats-supported`: `logo-uri-formats-supported` = "logo-uri-formats-supported".asInstanceOf[`logo-uri-formats-supported`]
  
  @js.native
  sealed trait `logo-uri-schemes-supported` extends StObject
  @scala.inline
  def `logo-uri-schemes-supported`: `logo-uri-schemes-supported` = "logo-uri-schemes-supported".asInstanceOf[`logo-uri-schemes-supported`]
  
  @js.native
  sealed trait `long-edge-first` extends FeedOrientation
  @scala.inline
  def `long-edge-first`: `long-edge-first` = "long-edge-first".asInstanceOf[`long-edge-first`]
  
  @js.native
  sealed trait lorawan extends UriSchemes
  @scala.inline
  def lorawan: lorawan = "lorawan".asInstanceOf[lorawan]
  
  @js.native
  sealed trait lossless extends StObject
  @scala.inline
  def lossless: lossless = "lossless".asInstanceOf[lossless]
  
  @js.native
  sealed trait lvlt extends UriSchemes
  @scala.inline
  def lvlt: lvlt = "lvlt".asInstanceOf[lvlt]
  
  @js.native
  sealed trait m extends MaterialAmountUnits
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait macintosh extends CharacterSet
  @scala.inline
  def macintosh: macintosh = "macintosh".asInstanceOf[macintosh]
  
  @js.native
  sealed trait magazine extends InputContentType
  @scala.inline
  def magazine: magazine = "magazine".asInstanceOf[magazine]
  
  @js.native
  sealed trait magenta extends MediaColor
  @scala.inline
  def magenta: magenta = "magenta".asInstanceOf[magenta]
  
  @js.native
  sealed trait magnet extends UriSchemes
  @scala.inline
  def magnet: magnet = "magnet".asInstanceOf[magnet]
  
  @js.native
  sealed trait `mailbox-1` extends OutputBin
  @scala.inline
  def `mailbox-1`: `mailbox-1` = "mailbox-1".asInstanceOf[`mailbox-1`]
  
  @js.native
  sealed trait `mailbox-10` extends OutputBin
  @scala.inline
  def `mailbox-10`: `mailbox-10` = "mailbox-10".asInstanceOf[`mailbox-10`]
  
  @js.native
  sealed trait `mailbox-2` extends OutputBin
  @scala.inline
  def `mailbox-2`: `mailbox-2` = "mailbox-2".asInstanceOf[`mailbox-2`]
  
  @js.native
  sealed trait `mailbox-3` extends OutputBin
  @scala.inline
  def `mailbox-3`: `mailbox-3` = "mailbox-3".asInstanceOf[`mailbox-3`]
  
  @js.native
  sealed trait `mailbox-4` extends OutputBin
  @scala.inline
  def `mailbox-4`: `mailbox-4` = "mailbox-4".asInstanceOf[`mailbox-4`]
  
  @js.native
  sealed trait `mailbox-5` extends OutputBin
  @scala.inline
  def `mailbox-5`: `mailbox-5` = "mailbox-5".asInstanceOf[`mailbox-5`]
  
  @js.native
  sealed trait `mailbox-6` extends OutputBin
  @scala.inline
  def `mailbox-6`: `mailbox-6` = "mailbox-6".asInstanceOf[`mailbox-6`]
  
  @js.native
  sealed trait `mailbox-7` extends OutputBin
  @scala.inline
  def `mailbox-7`: `mailbox-7` = "mailbox-7".asInstanceOf[`mailbox-7`]
  
  @js.native
  sealed trait `mailbox-8` extends OutputBin
  @scala.inline
  def `mailbox-8`: `mailbox-8` = "mailbox-8".asInstanceOf[`mailbox-8`]
  
  @js.native
  sealed trait `mailbox-9` extends OutputBin
  @scala.inline
  def `mailbox-9`: `mailbox-9` = "mailbox-9".asInstanceOf[`mailbox-9`]
  
  @js.native
  sealed trait mailserver extends UriSchemes
  @scala.inline
  def mailserver: mailserver = "mailserver".asInstanceOf[mailserver]
  
  @js.native
  sealed trait mailto extends UriSchemes
  @scala.inline
  def mailto: mailto = "mailto".asInstanceOf[mailto]
  
  @js.native
  sealed trait main
    extends Media
       with MediaIntputTray
       with MediaSource
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait `main-roll` extends MediaSource
  @scala.inline
  def `main-roll`: `main-roll` = "main-roll".asInstanceOf[`main-roll`]
  
  @js.native
  sealed trait `make-envelope-added` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-added`: `make-envelope-added` = "make-envelope-added".asInstanceOf[`make-envelope-added`]
  
  @js.native
  sealed trait `make-envelope-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-almost-empty`: `make-envelope-almost-empty` = "make-envelope-almost-empty".asInstanceOf[`make-envelope-almost-empty`]
  
  @js.native
  sealed trait `make-envelope-almost-full` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-almost-full`: `make-envelope-almost-full` = "make-envelope-almost-full".asInstanceOf[`make-envelope-almost-full`]
  
  @js.native
  sealed trait `make-envelope-at-limit` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-at-limit`: `make-envelope-at-limit` = "make-envelope-at-limit".asInstanceOf[`make-envelope-at-limit`]
  
  @js.native
  sealed trait `make-envelope-closed` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-closed`: `make-envelope-closed` = "make-envelope-closed".asInstanceOf[`make-envelope-closed`]
  
  @js.native
  sealed trait `make-envelope-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-configuration-change`: `make-envelope-configuration-change` = "make-envelope-configuration-change".asInstanceOf[`make-envelope-configuration-change`]
  
  @js.native
  sealed trait `make-envelope-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-cover-closed`: `make-envelope-cover-closed` = "make-envelope-cover-closed".asInstanceOf[`make-envelope-cover-closed`]
  
  @js.native
  sealed trait `make-envelope-cover-open` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-cover-open`: `make-envelope-cover-open` = "make-envelope-cover-open".asInstanceOf[`make-envelope-cover-open`]
  
  @js.native
  sealed trait `make-envelope-empty` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-empty`: `make-envelope-empty` = "make-envelope-empty".asInstanceOf[`make-envelope-empty`]
  
  @js.native
  sealed trait `make-envelope-full` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-full`: `make-envelope-full` = "make-envelope-full".asInstanceOf[`make-envelope-full`]
  
  @js.native
  sealed trait `make-envelope-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-interlock-closed`: `make-envelope-interlock-closed` = "make-envelope-interlock-closed".asInstanceOf[`make-envelope-interlock-closed`]
  
  @js.native
  sealed trait `make-envelope-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-interlock-open`: `make-envelope-interlock-open` = "make-envelope-interlock-open".asInstanceOf[`make-envelope-interlock-open`]
  
  @js.native
  sealed trait `make-envelope-jam` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-jam`: `make-envelope-jam` = "make-envelope-jam".asInstanceOf[`make-envelope-jam`]
  
  @js.native
  sealed trait `make-envelope-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-life-almost-over`: `make-envelope-life-almost-over` = "make-envelope-life-almost-over".asInstanceOf[`make-envelope-life-almost-over`]
  
  @js.native
  sealed trait `make-envelope-life-over` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-life-over`: `make-envelope-life-over` = "make-envelope-life-over".asInstanceOf[`make-envelope-life-over`]
  
  @js.native
  sealed trait `make-envelope-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-memory-exhausted`: `make-envelope-memory-exhausted` = "make-envelope-memory-exhausted".asInstanceOf[`make-envelope-memory-exhausted`]
  
  @js.native
  sealed trait `make-envelope-missing` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-missing`: `make-envelope-missing` = "make-envelope-missing".asInstanceOf[`make-envelope-missing`]
  
  @js.native
  sealed trait `make-envelope-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-motor-failure`: `make-envelope-motor-failure` = "make-envelope-motor-failure".asInstanceOf[`make-envelope-motor-failure`]
  
  @js.native
  sealed trait `make-envelope-near-limit` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-near-limit`: `make-envelope-near-limit` = "make-envelope-near-limit".asInstanceOf[`make-envelope-near-limit`]
  
  @js.native
  sealed trait `make-envelope-offline` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-offline`: `make-envelope-offline` = "make-envelope-offline".asInstanceOf[`make-envelope-offline`]
  
  @js.native
  sealed trait `make-envelope-opened` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-opened`: `make-envelope-opened` = "make-envelope-opened".asInstanceOf[`make-envelope-opened`]
  
  @js.native
  sealed trait `make-envelope-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-over-temperature`: `make-envelope-over-temperature` = "make-envelope-over-temperature".asInstanceOf[`make-envelope-over-temperature`]
  
  @js.native
  sealed trait `make-envelope-power-saver` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-power-saver`: `make-envelope-power-saver` = "make-envelope-power-saver".asInstanceOf[`make-envelope-power-saver`]
  
  @js.native
  sealed trait `make-envelope-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-recoverable-failure`: `make-envelope-recoverable-failure` = "make-envelope-recoverable-failure".asInstanceOf[`make-envelope-recoverable-failure`]
  
  @js.native
  sealed trait `make-envelope-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-recoverable-storage-error`: `make-envelope-recoverable-storage-error` = "make-envelope-recoverable-storage-error".asInstanceOf[`make-envelope-recoverable-storage-error`]
  
  @js.native
  sealed trait `make-envelope-removed` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-removed`: `make-envelope-removed` = "make-envelope-removed".asInstanceOf[`make-envelope-removed`]
  
  @js.native
  sealed trait `make-envelope-resource-added` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-resource-added`: `make-envelope-resource-added` = "make-envelope-resource-added".asInstanceOf[`make-envelope-resource-added`]
  
  @js.native
  sealed trait `make-envelope-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-resource-removed`: `make-envelope-resource-removed` = "make-envelope-resource-removed".asInstanceOf[`make-envelope-resource-removed`]
  
  @js.native
  sealed trait `make-envelope-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-thermistor-failure`: `make-envelope-thermistor-failure` = "make-envelope-thermistor-failure".asInstanceOf[`make-envelope-thermistor-failure`]
  
  @js.native
  sealed trait `make-envelope-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-timing-failure`: `make-envelope-timing-failure` = "make-envelope-timing-failure".asInstanceOf[`make-envelope-timing-failure`]
  
  @js.native
  sealed trait `make-envelope-turned-off` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-turned-off`: `make-envelope-turned-off` = "make-envelope-turned-off".asInstanceOf[`make-envelope-turned-off`]
  
  @js.native
  sealed trait `make-envelope-turned-on` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-turned-on`: `make-envelope-turned-on` = "make-envelope-turned-on".asInstanceOf[`make-envelope-turned-on`]
  
  @js.native
  sealed trait `make-envelope-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-under-temperature`: `make-envelope-under-temperature` = "make-envelope-under-temperature".asInstanceOf[`make-envelope-under-temperature`]
  
  @js.native
  sealed trait `make-envelope-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-unrecoverable-failure`: `make-envelope-unrecoverable-failure` = "make-envelope-unrecoverable-failure".asInstanceOf[`make-envelope-unrecoverable-failure`]
  
  @js.native
  sealed trait `make-envelope-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-unrecoverable-storage-error`: `make-envelope-unrecoverable-storage-error` = "make-envelope-unrecoverable-storage-error".asInstanceOf[`make-envelope-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `make-envelope-warming-up` extends PrinterStateReasons
  @scala.inline
  def `make-envelope-warming-up`: `make-envelope-warming-up` = "make-envelope-warming-up".asInstanceOf[`make-envelope-warming-up`]
  
  @js.native
  sealed trait manual
    extends Media
       with MediaIntputTray
       with MediaSource
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait `manual-tumble` extends StObject
  @scala.inline
  def `manual-tumble`: `manual-tumble` = "manual-tumble".asInstanceOf[`manual-tumble`]
  
  @js.native
  sealed trait maps extends UriSchemes
  @scala.inline
  def maps: maps = "maps".asInstanceOf[maps]
  
  @js.native
  sealed trait `marker-adjusting-print-quality` extends PrinterStateReasons
  @scala.inline
  def `marker-adjusting-print-quality`: `marker-adjusting-print-quality` = "marker-adjusting-print-quality".asInstanceOf[`marker-adjusting-print-quality`]
  
  @js.native
  sealed trait `marker-developer-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-developer-almost-empty`: `marker-developer-almost-empty` = "marker-developer-almost-empty".asInstanceOf[`marker-developer-almost-empty`]
  
  @js.native
  sealed trait `marker-developer-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-developer-empty`: `marker-developer-empty` = "marker-developer-empty".asInstanceOf[`marker-developer-empty`]
  
  @js.native
  sealed trait `marker-fuser-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `marker-fuser-thermistor-failure`: `marker-fuser-thermistor-failure` = "marker-fuser-thermistor-failure".asInstanceOf[`marker-fuser-thermistor-failure`]
  
  @js.native
  sealed trait `marker-fuser-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `marker-fuser-timing-failure`: `marker-fuser-timing-failure` = "marker-fuser-timing-failure".asInstanceOf[`marker-fuser-timing-failure`]
  
  @js.native
  sealed trait `marker-ink-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-ink-almost-empty`: `marker-ink-almost-empty` = "marker-ink-almost-empty".asInstanceOf[`marker-ink-almost-empty`]
  
  @js.native
  sealed trait `marker-ink-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-ink-empty`: `marker-ink-empty` = "marker-ink-empty".asInstanceOf[`marker-ink-empty`]
  
  @js.native
  sealed trait `marker-print-ribbon-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-print-ribbon-almost-empty`: `marker-print-ribbon-almost-empty` = "marker-print-ribbon-almost-empty".asInstanceOf[`marker-print-ribbon-almost-empty`]
  
  @js.native
  sealed trait `marker-print-ribbon-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-print-ribbon-empty`: `marker-print-ribbon-empty` = "marker-print-ribbon-empty".asInstanceOf[`marker-print-ribbon-empty`]
  
  @js.native
  sealed trait `marker-supply-empty` extends PrinterStateReasons
  @scala.inline
  def `marker-supply-empty`: `marker-supply-empty` = "marker-supply-empty".asInstanceOf[`marker-supply-empty`]
  
  @js.native
  sealed trait `marker-supply-low` extends PrinterStateReasons
  @scala.inline
  def `marker-supply-low`: `marker-supply-low` = "marker-supply-low".asInstanceOf[`marker-supply-low`]
  
  @js.native
  sealed trait `marker-toner-cartridge-missing` extends PrinterStateReasons
  @scala.inline
  def `marker-toner-cartridge-missing`: `marker-toner-cartridge-missing` = "marker-toner-cartridge-missing".asInstanceOf[`marker-toner-cartridge-missing`]
  
  @js.native
  sealed trait `marker-waste-almost-full` extends PrinterStateReasons
  @scala.inline
  def `marker-waste-almost-full`: `marker-waste-almost-full` = "marker-waste-almost-full".asInstanceOf[`marker-waste-almost-full`]
  
  @js.native
  sealed trait `marker-waste-full` extends PrinterStateReasons
  @scala.inline
  def `marker-waste-full`: `marker-waste-full` = "marker-waste-full".asInstanceOf[`marker-waste-full`]
  
  @js.native
  sealed trait `marker-waste-ink-receptacle-almost-full` extends PrinterStateReasons
  @scala.inline
  def `marker-waste-ink-receptacle-almost-full`: `marker-waste-ink-receptacle-almost-full` = "marker-waste-ink-receptacle-almost-full".asInstanceOf[`marker-waste-ink-receptacle-almost-full`]
  
  @js.native
  sealed trait `marker-waste-ink-receptacle-full` extends PrinterStateReasons
  @scala.inline
  def `marker-waste-ink-receptacle-full`: `marker-waste-ink-receptacle-full` = "marker-waste-ink-receptacle-full".asInstanceOf[`marker-waste-ink-receptacle-full`]
  
  @js.native
  sealed trait `marker-waste-toner-receptacle-almost-full` extends PrinterStateReasons
  @scala.inline
  def `marker-waste-toner-receptacle-almost-full`: `marker-waste-toner-receptacle-almost-full` = "marker-waste-toner-receptacle-almost-full".asInstanceOf[`marker-waste-toner-receptacle-almost-full`]
  
  @js.native
  sealed trait `marker-waste-toner-receptacle-full` extends PrinterStateReasons
  @scala.inline
  def `marker-waste-toner-receptacle-full`: `marker-waste-toner-receptacle-full` = "marker-waste-toner-receptacle-full".asInstanceOf[`marker-waste-toner-receptacle-full`]
  
  @js.native
  sealed trait market extends UriSchemes
  @scala.inline
  def market: market = "market".asInstanceOf[market]
  
  @js.native
  sealed trait material extends PrintSupports
  @scala.inline
  def material: material = "material".asInstanceOf[material]
  
  @js.native
  sealed trait `material-amount` extends StObject
  @scala.inline
  def `material-amount`: `material-amount` = "material-amount".asInstanceOf[`material-amount`]
  
  @js.native
  sealed trait `material-amount-units` extends StObject
  @scala.inline
  def `material-amount-units`: `material-amount-units` = "material-amount-units".asInstanceOf[`material-amount-units`]
  
  @js.native
  sealed trait `material-amount-units-supported` extends StObject
  @scala.inline
  def `material-amount-units-supported`: `material-amount-units-supported` = "material-amount-units-supported".asInstanceOf[`material-amount-units-supported`]
  
  @js.native
  sealed trait `material-color` extends StObject
  @scala.inline
  def `material-color`: `material-color` = "material-color".asInstanceOf[`material-color`]
  
  @js.native
  sealed trait `material-diameter` extends StObject
  @scala.inline
  def `material-diameter`: `material-diameter` = "material-diameter".asInstanceOf[`material-diameter`]
  
  @js.native
  sealed trait `material-diameter-supported` extends StObject
  @scala.inline
  def `material-diameter-supported`: `material-diameter-supported` = "material-diameter-supported".asInstanceOf[`material-diameter-supported`]
  
  @js.native
  sealed trait `material-diameter-tolerance` extends StObject
  @scala.inline
  def `material-diameter-tolerance`: `material-diameter-tolerance` = "material-diameter-tolerance".asInstanceOf[`material-diameter-tolerance`]
  
  @js.native
  sealed trait `material-fill-density` extends StObject
  @scala.inline
  def `material-fill-density`: `material-fill-density` = "material-fill-density".asInstanceOf[`material-fill-density`]
  
  @js.native
  sealed trait `material-key` extends StObject
  @scala.inline
  def `material-key`: `material-key` = "material-key".asInstanceOf[`material-key`]
  
  @js.native
  sealed trait `material-name` extends StObject
  @scala.inline
  def `material-name`: `material-name` = "material-name".asInstanceOf[`material-name`]
  
  @js.native
  sealed trait `material-nozzle-diameter` extends StObject
  @scala.inline
  def `material-nozzle-diameter`: `material-nozzle-diameter` = "material-nozzle-diameter".asInstanceOf[`material-nozzle-diameter`]
  
  @js.native
  sealed trait `material-nozzle-diameter-supported` extends StObject
  @scala.inline
  def `material-nozzle-diameter-supported`: `material-nozzle-diameter-supported` = "material-nozzle-diameter-supported".asInstanceOf[`material-nozzle-diameter-supported`]
  
  @js.native
  sealed trait `material-purpose` extends StObject
  @scala.inline
  def `material-purpose`: `material-purpose` = "material-purpose".asInstanceOf[`material-purpose`]
  
  @js.native
  sealed trait `material-purpose-supported` extends StObject
  @scala.inline
  def `material-purpose-supported`: `material-purpose-supported` = "material-purpose-supported".asInstanceOf[`material-purpose-supported`]
  
  @js.native
  sealed trait `material-rate` extends StObject
  @scala.inline
  def `material-rate`: `material-rate` = "material-rate".asInstanceOf[`material-rate`]
  
  @js.native
  sealed trait `material-rate-supported` extends StObject
  @scala.inline
  def `material-rate-supported`: `material-rate-supported` = "material-rate-supported".asInstanceOf[`material-rate-supported`]
  
  @js.native
  sealed trait `material-rate-units` extends StObject
  @scala.inline
  def `material-rate-units`: `material-rate-units` = "material-rate-units".asInstanceOf[`material-rate-units`]
  
  @js.native
  sealed trait `material-rate-units-supported` extends StObject
  @scala.inline
  def `material-rate-units-supported`: `material-rate-units-supported` = "material-rate-units-supported".asInstanceOf[`material-rate-units-supported`]
  
  @js.native
  sealed trait `material-retraction` extends StObject
  @scala.inline
  def `material-retraction`: `material-retraction` = "material-retraction".asInstanceOf[`material-retraction`]
  
  @js.native
  sealed trait `material-shell-thickness` extends StObject
  @scala.inline
  def `material-shell-thickness`: `material-shell-thickness` = "material-shell-thickness".asInstanceOf[`material-shell-thickness`]
  
  @js.native
  sealed trait `material-shell-thickness-supported` extends StObject
  @scala.inline
  def `material-shell-thickness-supported`: `material-shell-thickness-supported` = "material-shell-thickness-supported".asInstanceOf[`material-shell-thickness-supported`]
  
  @js.native
  sealed trait `material-temperature` extends StObject
  @scala.inline
  def `material-temperature`: `material-temperature` = "material-temperature".asInstanceOf[`material-temperature`]
  
  @js.native
  sealed trait `material-temperature-supported` extends StObject
  @scala.inline
  def `material-temperature-supported`: `material-temperature-supported` = "material-temperature-supported".asInstanceOf[`material-temperature-supported`]
  
  @js.native
  sealed trait `material-type` extends StObject
  @scala.inline
  def `material-type`: `material-type` = "material-type".asInstanceOf[`material-type`]
  
  @js.native
  sealed trait `material-type-supported` extends StObject
  @scala.inline
  def `material-type-supported`: `material-type-supported` = "material-type-supported".asInstanceOf[`material-type-supported`]
  
  @js.native
  sealed trait `materials-col` extends Overrides
  @scala.inline
  def `materials-col`: `materials-col` = "materials-col".asInstanceOf[`materials-col`]
  
  @js.native
  sealed trait `materials-col-actual` extends StObject
  @scala.inline
  def `materials-col-actual`: `materials-col-actual` = "materials-col-actual".asInstanceOf[`materials-col-actual`]
  
  @js.native
  sealed trait `materials-col-database` extends StObject
  @scala.inline
  def `materials-col-database`: `materials-col-database` = "materials-col-database".asInstanceOf[`materials-col-database`]
  
  @js.native
  sealed trait `materials-col-default` extends StObject
  @scala.inline
  def `materials-col-default`: `materials-col-default` = "materials-col-default".asInstanceOf[`materials-col-default`]
  
  @js.native
  sealed trait `materials-col-ready` extends StObject
  @scala.inline
  def `materials-col-ready`: `materials-col-ready` = "materials-col-ready".asInstanceOf[`materials-col-ready`]
  
  @js.native
  sealed trait `materials-col-supported` extends StObject
  @scala.inline
  def `materials-col-supported`: `materials-col-supported` = "materials-col-supported".asInstanceOf[`materials-col-supported`]
  
  @js.native
  sealed trait matte
    extends CoatingType
       with LaminatingType
       with MediaCoating
  @scala.inline
  def matte: matte = "matte".asInstanceOf[matte]
  
  @js.native
  sealed trait `max-materials-col-supported` extends StObject
  @scala.inline
  def `max-materials-col-supported`: `max-materials-col-supported` = "max-materials-col-supported".asInstanceOf[`max-materials-col-supported`]
  
  @js.native
  sealed trait `max-page-ranges-supported` extends StObject
  @scala.inline
  def `max-page-ranges-supported`: `max-page-ranges-supported` = "max-page-ranges-supported".asInstanceOf[`max-page-ranges-supported`]
  
  @js.native
  sealed trait `max-save-info-supported` extends StObject
  @scala.inline
  def `max-save-info-supported`: `max-save-info-supported` = "max-save-info-supported".asInstanceOf[`max-save-info-supported`]
  
  @js.native
  sealed trait `max-stitching-locations-supported` extends StObject
  @scala.inline
  def `max-stitching-locations-supported`: `max-stitching-locations-supported` = "max-stitching-locations-supported".asInstanceOf[`max-stitching-locations-supported`]
  
  @js.native
  sealed trait md2 extends JobPasswordEncryption
  @scala.inline
  def md2: md2 = "md2".asInstanceOf[md2]
  
  @js.native
  sealed trait md4 extends JobPasswordEncryption
  @scala.inline
  def md4: md4 = "md4".asInstanceOf[md4]
  
  @js.native
  sealed trait md5 extends JobPasswordEncryption
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait media extends Overrides
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait `media-actual` extends StObject
  @scala.inline
  def `media-actual`: `media-actual` = "media-actual".asInstanceOf[`media-actual`]
  
  @js.native
  sealed trait `media-back-coating-supported` extends StObject
  @scala.inline
  def `media-back-coating-supported`: `media-back-coating-supported` = "media-back-coating-supported".asInstanceOf[`media-back-coating-supported`]
  
  @js.native
  sealed trait `media-bottom-margin` extends MediaColSupported
  @scala.inline
  def `media-bottom-margin`: `media-bottom-margin` = "media-bottom-margin".asInstanceOf[`media-bottom-margin`]
  
  @js.native
  sealed trait `media-bottom-margin-supported` extends StObject
  @scala.inline
  def `media-bottom-margin-supported`: `media-bottom-margin-supported` = "media-bottom-margin-supported".asInstanceOf[`media-bottom-margin-supported`]
  
  @js.native
  sealed trait `media-col` extends Overrides
  @scala.inline
  def `media-col`: `media-col` = "media-col".asInstanceOf[`media-col`]
  
  @js.native
  sealed trait `media-col-actual` extends StObject
  @scala.inline
  def `media-col-actual`: `media-col-actual` = "media-col-actual".asInstanceOf[`media-col-actual`]
  
  @js.native
  sealed trait `media-col-database` extends StObject
  @scala.inline
  def `media-col-database`: `media-col-database` = "media-col-database".asInstanceOf[`media-col-database`]
  
  @js.native
  sealed trait `media-col-default` extends StObject
  @scala.inline
  def `media-col-default`: `media-col-default` = "media-col-default".asInstanceOf[`media-col-default`]
  
  @js.native
  sealed trait `media-col-ready` extends StObject
  @scala.inline
  def `media-col-ready`: `media-col-ready` = "media-col-ready".asInstanceOf[`media-col-ready`]
  
  @js.native
  sealed trait `media-col-supported` extends StObject
  @scala.inline
  def `media-col-supported`: `media-col-supported` = "media-col-supported".asInstanceOf[`media-col-supported`]
  
  @js.native
  sealed trait `media-color-supported` extends StObject
  @scala.inline
  def `media-color-supported`: `media-color-supported` = "media-color-supported".asInstanceOf[`media-color-supported`]
  
  @js.native
  sealed trait `media-default` extends StObject
  @scala.inline
  def `media-default`: `media-default` = "media-default".asInstanceOf[`media-default`]
  
  @js.native
  sealed trait `media-empty` extends PrinterStateReasons
  @scala.inline
  def `media-empty`: `media-empty` = "media-empty".asInstanceOf[`media-empty`]
  
  @js.native
  sealed trait `media-front-coating-supported` extends StObject
  @scala.inline
  def `media-front-coating-supported`: `media-front-coating-supported` = "media-front-coating-supported".asInstanceOf[`media-front-coating-supported`]
  
  @js.native
  sealed trait `media-grain-supported` extends StObject
  @scala.inline
  def `media-grain-supported`: `media-grain-supported` = "media-grain-supported".asInstanceOf[`media-grain-supported`]
  
  @js.native
  sealed trait `media-hole-count-supported` extends StObject
  @scala.inline
  def `media-hole-count-supported`: `media-hole-count-supported` = "media-hole-count-supported".asInstanceOf[`media-hole-count-supported`]
  
  @js.native
  sealed trait `media-input-tray-check` extends Overrides
  @scala.inline
  def `media-input-tray-check`: `media-input-tray-check` = "media-input-tray-check".asInstanceOf[`media-input-tray-check`]
  
  @js.native
  sealed trait `media-input-tray-check-actual` extends StObject
  @scala.inline
  def `media-input-tray-check-actual`: `media-input-tray-check-actual` = "media-input-tray-check-actual".asInstanceOf[`media-input-tray-check-actual`]
  
  @js.native
  sealed trait `media-jam` extends PrinterStateReasons
  @scala.inline
  def `media-jam`: `media-jam` = "media-jam".asInstanceOf[`media-jam`]
  
  @js.native
  sealed trait `media-key-supported` extends StObject
  @scala.inline
  def `media-key-supported`: `media-key-supported` = "media-key-supported".asInstanceOf[`media-key-supported`]
  
  @js.native
  sealed trait `media-left-margin` extends MediaColSupported
  @scala.inline
  def `media-left-margin`: `media-left-margin` = "media-left-margin".asInstanceOf[`media-left-margin`]
  
  @js.native
  sealed trait `media-left-margin-supported` extends StObject
  @scala.inline
  def `media-left-margin-supported`: `media-left-margin-supported` = "media-left-margin-supported".asInstanceOf[`media-left-margin-supported`]
  
  @js.native
  sealed trait `media-low` extends PrinterStateReasons
  @scala.inline
  def `media-low`: `media-low` = "media-low".asInstanceOf[`media-low`]
  
  @js.native
  sealed trait `media-needed` extends PrinterStateReasons
  @scala.inline
  def `media-needed`: `media-needed` = "media-needed".asInstanceOf[`media-needed`]
  
  @js.native
  sealed trait `media-order-count-supported` extends StObject
  @scala.inline
  def `media-order-count-supported`: `media-order-count-supported` = "media-order-count-supported".asInstanceOf[`media-order-count-supported`]
  
  @js.native
  sealed trait `media-path-cannot-duplex-media-selected` extends PrinterStateReasons
  @scala.inline
  def `media-path-cannot-duplex-media-selected`: `media-path-cannot-duplex-media-selected` = "media-path-cannot-duplex-media-selected".asInstanceOf[`media-path-cannot-duplex-media-selected`]
  
  @js.native
  sealed trait `media-path-media-tray-almost-full` extends PrinterStateReasons
  @scala.inline
  def `media-path-media-tray-almost-full`: `media-path-media-tray-almost-full` = "media-path-media-tray-almost-full".asInstanceOf[`media-path-media-tray-almost-full`]
  
  @js.native
  sealed trait `media-path-media-tray-full` extends PrinterStateReasons
  @scala.inline
  def `media-path-media-tray-full`: `media-path-media-tray-full` = "media-path-media-tray-full".asInstanceOf[`media-path-media-tray-full`]
  
  @js.native
  sealed trait `media-path-media-tray-missing` extends PrinterStateReasons
  @scala.inline
  def `media-path-media-tray-missing`: `media-path-media-tray-missing` = "media-path-media-tray-missing".asInstanceOf[`media-path-media-tray-missing`]
  
  @js.native
  sealed trait `media-pre-printed-supported` extends StObject
  @scala.inline
  def `media-pre-printed-supported`: `media-pre-printed-supported` = "media-pre-printed-supported".asInstanceOf[`media-pre-printed-supported`]
  
  @js.native
  sealed trait `media-ready` extends StObject
  @scala.inline
  def `media-ready`: `media-ready` = "media-ready".asInstanceOf[`media-ready`]
  
  @js.native
  sealed trait `media-recycled-supported` extends StObject
  @scala.inline
  def `media-recycled-supported`: `media-recycled-supported` = "media-recycled-supported".asInstanceOf[`media-recycled-supported`]
  
  @js.native
  sealed trait `media-right-margin` extends MediaColSupported
  @scala.inline
  def `media-right-margin`: `media-right-margin` = "media-right-margin".asInstanceOf[`media-right-margin`]
  
  @js.native
  sealed trait `media-right-margin-supported` extends StObject
  @scala.inline
  def `media-right-margin-supported`: `media-right-margin-supported` = "media-right-margin-supported".asInstanceOf[`media-right-margin-supported`]
  
  @js.native
  sealed trait `media-sheets-supported` extends StObject
  @scala.inline
  def `media-sheets-supported`: `media-sheets-supported` = "media-sheets-supported".asInstanceOf[`media-sheets-supported`]
  
  @js.native
  sealed trait `media-size` extends StObject
  @scala.inline
  def `media-size`: `media-size` = "media-size".asInstanceOf[`media-size`]
  
  @js.native
  sealed trait `media-size-name` extends MediaColSupported
  @scala.inline
  def `media-size-name`: `media-size-name` = "media-size-name".asInstanceOf[`media-size-name`]
  
  @js.native
  sealed trait `media-size-supported` extends StObject
  @scala.inline
  def `media-size-supported`: `media-size-supported` = "media-size-supported".asInstanceOf[`media-size-supported`]
  
  @js.native
  sealed trait `media-source` extends MediaColSupported
  @scala.inline
  def `media-source`: `media-source` = "media-source".asInstanceOf[`media-source`]
  
  @js.native
  sealed trait `media-source-supported` extends StObject
  @scala.inline
  def `media-source-supported`: `media-source-supported` = "media-source-supported".asInstanceOf[`media-source-supported`]
  
  @js.native
  sealed trait `media-supported` extends StObject
  @scala.inline
  def `media-supported`: `media-supported` = "media-supported".asInstanceOf[`media-supported`]
  
  @js.native
  sealed trait `media-thickness-supported` extends StObject
  @scala.inline
  def `media-thickness-supported`: `media-thickness-supported` = "media-thickness-supported".asInstanceOf[`media-thickness-supported`]
  
  @js.native
  sealed trait `media-tooth-supported` extends StObject
  @scala.inline
  def `media-tooth-supported`: `media-tooth-supported` = "media-tooth-supported".asInstanceOf[`media-tooth-supported`]
  
  @js.native
  sealed trait `media-top-margin` extends MediaColSupported
  @scala.inline
  def `media-top-margin`: `media-top-margin` = "media-top-margin".asInstanceOf[`media-top-margin`]
  
  @js.native
  sealed trait `media-top-margin-supported` extends StObject
  @scala.inline
  def `media-top-margin-supported`: `media-top-margin-supported` = "media-top-margin-supported".asInstanceOf[`media-top-margin-supported`]
  
  @js.native
  sealed trait `media-type-supported` extends StObject
  @scala.inline
  def `media-type-supported`: `media-type-supported` = "media-type-supported".asInstanceOf[`media-type-supported`]
  
  @js.native
  sealed trait `media-weight-metric-supported` extends StObject
  @scala.inline
  def `media-weight-metric-supported`: `media-weight-metric-supported` = "media-weight-metric-supported".asInstanceOf[`media-weight-metric-supported`]
  
  @js.native
  sealed trait medium extends MediaTooth
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait message extends UriSchemes
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait `message-supported` extends StObject
  @scala.inline
  def `message-supported`: `message-supported` = "message-supported".asInstanceOf[`message-supported`]
  
  @js.native
  sealed trait `messageSlashexternal-body` extends MimeMediaType
  @scala.inline
  def `messageSlashexternal-body`: `messageSlashexternal-body` = "message/external-body".asInstanceOf[`messageSlashexternal-body`]
  
  @js.native
  sealed trait messageSlashnews extends MimeMediaType
  @scala.inline
  def messageSlashnews: messageSlashnews = "message/news".asInstanceOf[messageSlashnews]
  
  @js.native
  sealed trait messageSlashpartial extends MimeMediaType
  @scala.inline
  def messageSlashpartial: messageSlashpartial = "message/partial".asInstanceOf[messageSlashpartial]
  
  @js.native
  sealed trait messageSlashrfc822 extends MimeMediaType
  @scala.inline
  def messageSlashrfc822: messageSlashrfc822 = "message/rfc822".asInstanceOf[messageSlashrfc822]
  
  @js.native
  sealed trait metal extends MediaType
  @scala.inline
  def metal: metal = "metal".asInstanceOf[metal]
  
  @js.native
  sealed trait `metal-glossy` extends MediaType
  @scala.inline
  def `metal-glossy`: `metal-glossy` = "metal-glossy".asInstanceOf[`metal-glossy`]
  
  @js.native
  sealed trait `metal-high-gloss` extends MediaType
  @scala.inline
  def `metal-high-gloss`: `metal-high-gloss` = "metal-high-gloss".asInstanceOf[`metal-high-gloss`]
  
  @js.native
  sealed trait `metal-matte` extends MediaType
  @scala.inline
  def `metal-matte`: `metal-matte` = "metal-matte".asInstanceOf[`metal-matte`]
  
  @js.native
  sealed trait `metal-satin` extends MediaType
  @scala.inline
  def `metal-satin`: `metal-satin` = "metal-satin".asInstanceOf[`metal-satin`]
  
  @js.native
  sealed trait `metal-semi-gloss` extends MediaType
  @scala.inline
  def `metal-semi-gloss`: `metal-semi-gloss` = "metal-semi-gloss".asInstanceOf[`metal-semi-gloss`]
  
  @js.native
  sealed trait mg_second extends MaterialRateUnits
  @scala.inline
  def mg_second: mg_second = "mg_second".asInstanceOf[mg_second]
  
  @js.native
  sealed trait microsoftDotwindowsDotcamera extends UriSchemes
  @scala.inline
  def microsoftDotwindowsDotcamera: microsoftDotwindowsDotcamera = "microsoft.windows.camera".asInstanceOf[microsoftDotwindowsDotcamera]
  
  @js.native
  sealed trait microsoftDotwindowsDotcameraDotmultipicker extends UriSchemes
  @scala.inline
  def microsoftDotwindowsDotcameraDotmultipicker: microsoftDotwindowsDotcameraDotmultipicker = "microsoft.windows.camera.multipicker".asInstanceOf[microsoftDotwindowsDotcameraDotmultipicker]
  
  @js.native
  sealed trait microsoftDotwindowsDotcameraDotpicker extends UriSchemes
  @scala.inline
  def microsoftDotwindowsDotcameraDotpicker: microsoftDotwindowsDotcameraDotpicker = "microsoft.windows.camera.picker".asInstanceOf[microsoftDotwindowsDotcameraDotpicker]
  
  @js.native
  sealed trait mid extends UriSchemes
  @scala.inline
  def mid: mid = "mid".asInstanceOf[mid]
  
  @js.native
  sealed trait middle
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait ml extends MaterialAmountUnits
  @scala.inline
  def ml: ml = "ml".asInstanceOf[ml]
  
  @js.native
  sealed trait ml_second extends MaterialRateUnits
  @scala.inline
  def ml_second: ml_second = "ml_second".asInstanceOf[ml_second]
  
  @js.native
  sealed trait mm
    extends AccuracyUnits
       with MaterialAmountUnits
  @scala.inline
  def mm: mm = "mm".asInstanceOf[mm]
  
  @js.native
  sealed trait mm_second extends MaterialRateUnits
  @scala.inline
  def mm_second: mm_second = "mm_second".asInstanceOf[mm_second]
  
  @js.native
  sealed trait mms extends UriSchemes
  @scala.inline
  def mms: mms = "mms".asInstanceOf[mms]
  
  @js.native
  sealed trait modem extends UriSchemes
  @scala.inline
  def modem: modem = "modem".asInstanceOf[modem]
  
  @js.native
  sealed trait monarch
    extends Media
       with MediaSizeName
  @scala.inline
  def monarch: monarch = "monarch".asInstanceOf[monarch]
  
  @js.native
  sealed trait `monarch-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `monarch-envelope`: `monarch-envelope` = "monarch-envelope".asInstanceOf[`monarch-envelope`]
  
  @js.native
  sealed trait mongodb extends UriSchemes
  @scala.inline
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  
  @js.native
  sealed trait monochrome
    extends InputColorMode
       with PrintColorMode
  @scala.inline
  def monochrome: monochrome = "monochrome".asInstanceOf[monochrome]
  
  @js.native
  sealed trait monochrome_16 extends InputColorMode
  @scala.inline
  def monochrome_16: monochrome_16 = "monochrome_16".asInstanceOf[monochrome_16]
  
  @js.native
  sealed trait monochrome_4 extends InputColorMode
  @scala.inline
  def monochrome_4: monochrome_4 = "monochrome_4".asInstanceOf[monochrome_4]
  
  @js.native
  sealed trait monochrome_8 extends InputColorMode
  @scala.inline
  def monochrome_8: monochrome_8 = "monochrome_8".asInstanceOf[monochrome_8]
  
  @js.native
  sealed trait `mounting-tape` extends MediaType
  @scala.inline
  def `mounting-tape`: `mounting-tape` = "mounting-tape".asInstanceOf[`mounting-tape`]
  
  @js.native
  sealed trait `moving-to-paused` extends PrinterStateReasons
  @scala.inline
  def `moving-to-paused`: `moving-to-paused` = "moving-to-paused".asInstanceOf[`moving-to-paused`]
  
  @js.native
  sealed trait moz extends UriSchemes
  @scala.inline
  def moz: moz = "moz".asInstanceOf[moz]
  
  @js.native
  sealed trait `ms-access` extends UriSchemes
  @scala.inline
  def `ms-access`: `ms-access` = "ms-access".asInstanceOf[`ms-access`]
  
  @js.native
  sealed trait `ms-browser-extension` extends UriSchemes
  @scala.inline
  def `ms-browser-extension`: `ms-browser-extension` = "ms-browser-extension".asInstanceOf[`ms-browser-extension`]
  
  @js.native
  sealed trait `ms-calculator` extends UriSchemes
  @scala.inline
  def `ms-calculator`: `ms-calculator` = "ms-calculator".asInstanceOf[`ms-calculator`]
  
  @js.native
  sealed trait `ms-drive-to` extends UriSchemes
  @scala.inline
  def `ms-drive-to`: `ms-drive-to` = "ms-drive-to".asInstanceOf[`ms-drive-to`]
  
  @js.native
  sealed trait `ms-enrollment` extends UriSchemes
  @scala.inline
  def `ms-enrollment`: `ms-enrollment` = "ms-enrollment".asInstanceOf[`ms-enrollment`]
  
  @js.native
  sealed trait `ms-excel` extends UriSchemes
  @scala.inline
  def `ms-excel`: `ms-excel` = "ms-excel".asInstanceOf[`ms-excel`]
  
  @js.native
  sealed trait `ms-eyecontrolspeech` extends UriSchemes
  @scala.inline
  def `ms-eyecontrolspeech`: `ms-eyecontrolspeech` = "ms-eyecontrolspeech".asInstanceOf[`ms-eyecontrolspeech`]
  
  @js.native
  sealed trait `ms-gamebarservices` extends UriSchemes
  @scala.inline
  def `ms-gamebarservices`: `ms-gamebarservices` = "ms-gamebarservices".asInstanceOf[`ms-gamebarservices`]
  
  @js.native
  sealed trait `ms-gamingoverlay` extends UriSchemes
  @scala.inline
  def `ms-gamingoverlay`: `ms-gamingoverlay` = "ms-gamingoverlay".asInstanceOf[`ms-gamingoverlay`]
  
  @js.native
  sealed trait `ms-getoffice` extends UriSchemes
  @scala.inline
  def `ms-getoffice`: `ms-getoffice` = "ms-getoffice".asInstanceOf[`ms-getoffice`]
  
  @js.native
  sealed trait `ms-help` extends UriSchemes
  @scala.inline
  def `ms-help`: `ms-help` = "ms-help".asInstanceOf[`ms-help`]
  
  @js.native
  sealed trait `ms-infopath` extends UriSchemes
  @scala.inline
  def `ms-infopath`: `ms-infopath` = "ms-infopath".asInstanceOf[`ms-infopath`]
  
  @js.native
  sealed trait `ms-inputapp` extends UriSchemes
  @scala.inline
  def `ms-inputapp`: `ms-inputapp` = "ms-inputapp".asInstanceOf[`ms-inputapp`]
  
  @js.native
  sealed trait `ms-lockscreencomponent-config` extends UriSchemes
  @scala.inline
  def `ms-lockscreencomponent-config`: `ms-lockscreencomponent-config` = "ms-lockscreencomponent-config".asInstanceOf[`ms-lockscreencomponent-config`]
  
  @js.native
  sealed trait `ms-media-stream-id` extends UriSchemes
  @scala.inline
  def `ms-media-stream-id`: `ms-media-stream-id` = "ms-media-stream-id".asInstanceOf[`ms-media-stream-id`]
  
  @js.native
  sealed trait `ms-mixedrealitycapture` extends UriSchemes
  @scala.inline
  def `ms-mixedrealitycapture`: `ms-mixedrealitycapture` = "ms-mixedrealitycapture".asInstanceOf[`ms-mixedrealitycapture`]
  
  @js.native
  sealed trait `ms-mobileplans` extends UriSchemes
  @scala.inline
  def `ms-mobileplans`: `ms-mobileplans` = "ms-mobileplans".asInstanceOf[`ms-mobileplans`]
  
  @js.native
  sealed trait `ms-officeapp` extends UriSchemes
  @scala.inline
  def `ms-officeapp`: `ms-officeapp` = "ms-officeapp".asInstanceOf[`ms-officeapp`]
  
  @js.native
  sealed trait `ms-people` extends UriSchemes
  @scala.inline
  def `ms-people`: `ms-people` = "ms-people".asInstanceOf[`ms-people`]
  
  @js.native
  sealed trait `ms-powerpoint` extends UriSchemes
  @scala.inline
  def `ms-powerpoint`: `ms-powerpoint` = "ms-powerpoint".asInstanceOf[`ms-powerpoint`]
  
  @js.native
  sealed trait `ms-project` extends UriSchemes
  @scala.inline
  def `ms-project`: `ms-project` = "ms-project".asInstanceOf[`ms-project`]
  
  @js.native
  sealed trait `ms-publisher` extends UriSchemes
  @scala.inline
  def `ms-publisher`: `ms-publisher` = "ms-publisher".asInstanceOf[`ms-publisher`]
  
  @js.native
  sealed trait `ms-restoretabcompanion` extends UriSchemes
  @scala.inline
  def `ms-restoretabcompanion`: `ms-restoretabcompanion` = "ms-restoretabcompanion".asInstanceOf[`ms-restoretabcompanion`]
  
  @js.native
  sealed trait `ms-screenclip` extends UriSchemes
  @scala.inline
  def `ms-screenclip`: `ms-screenclip` = "ms-screenclip".asInstanceOf[`ms-screenclip`]
  
  @js.native
  sealed trait `ms-screensketch` extends UriSchemes
  @scala.inline
  def `ms-screensketch`: `ms-screensketch` = "ms-screensketch".asInstanceOf[`ms-screensketch`]
  
  @js.native
  sealed trait `ms-search` extends UriSchemes
  @scala.inline
  def `ms-search`: `ms-search` = "ms-search".asInstanceOf[`ms-search`]
  
  @js.native
  sealed trait `ms-search-repair` extends UriSchemes
  @scala.inline
  def `ms-search-repair`: `ms-search-repair` = "ms-search-repair".asInstanceOf[`ms-search-repair`]
  
  @js.native
  sealed trait `ms-secondary-screen-controller` extends UriSchemes
  @scala.inline
  def `ms-secondary-screen-controller`: `ms-secondary-screen-controller` = "ms-secondary-screen-controller".asInstanceOf[`ms-secondary-screen-controller`]
  
  @js.native
  sealed trait `ms-secondary-screen-setup` extends UriSchemes
  @scala.inline
  def `ms-secondary-screen-setup`: `ms-secondary-screen-setup` = "ms-secondary-screen-setup".asInstanceOf[`ms-secondary-screen-setup`]
  
  @js.native
  sealed trait `ms-settings` extends UriSchemes
  @scala.inline
  def `ms-settings`: `ms-settings` = "ms-settings".asInstanceOf[`ms-settings`]
  
  @js.native
  sealed trait `ms-settings-airplanemode` extends UriSchemes
  @scala.inline
  def `ms-settings-airplanemode`: `ms-settings-airplanemode` = "ms-settings-airplanemode".asInstanceOf[`ms-settings-airplanemode`]
  
  @js.native
  sealed trait `ms-settings-bluetooth` extends UriSchemes
  @scala.inline
  def `ms-settings-bluetooth`: `ms-settings-bluetooth` = "ms-settings-bluetooth".asInstanceOf[`ms-settings-bluetooth`]
  
  @js.native
  sealed trait `ms-settings-camera` extends UriSchemes
  @scala.inline
  def `ms-settings-camera`: `ms-settings-camera` = "ms-settings-camera".asInstanceOf[`ms-settings-camera`]
  
  @js.native
  sealed trait `ms-settings-cellular` extends UriSchemes
  @scala.inline
  def `ms-settings-cellular`: `ms-settings-cellular` = "ms-settings-cellular".asInstanceOf[`ms-settings-cellular`]
  
  @js.native
  sealed trait `ms-settings-cloudstorage` extends UriSchemes
  @scala.inline
  def `ms-settings-cloudstorage`: `ms-settings-cloudstorage` = "ms-settings-cloudstorage".asInstanceOf[`ms-settings-cloudstorage`]
  
  @js.native
  sealed trait `ms-settings-connectabledevices` extends UriSchemes
  @scala.inline
  def `ms-settings-connectabledevices`: `ms-settings-connectabledevices` = "ms-settings-connectabledevices".asInstanceOf[`ms-settings-connectabledevices`]
  
  @js.native
  sealed trait `ms-settings-displays-topology` extends UriSchemes
  @scala.inline
  def `ms-settings-displays-topology`: `ms-settings-displays-topology` = "ms-settings-displays-topology".asInstanceOf[`ms-settings-displays-topology`]
  
  @js.native
  sealed trait `ms-settings-emailandaccounts` extends UriSchemes
  @scala.inline
  def `ms-settings-emailandaccounts`: `ms-settings-emailandaccounts` = "ms-settings-emailandaccounts".asInstanceOf[`ms-settings-emailandaccounts`]
  
  @js.native
  sealed trait `ms-settings-language` extends UriSchemes
  @scala.inline
  def `ms-settings-language`: `ms-settings-language` = "ms-settings-language".asInstanceOf[`ms-settings-language`]
  
  @js.native
  sealed trait `ms-settings-location` extends UriSchemes
  @scala.inline
  def `ms-settings-location`: `ms-settings-location` = "ms-settings-location".asInstanceOf[`ms-settings-location`]
  
  @js.native
  sealed trait `ms-settings-lock` extends UriSchemes
  @scala.inline
  def `ms-settings-lock`: `ms-settings-lock` = "ms-settings-lock".asInstanceOf[`ms-settings-lock`]
  
  @js.native
  sealed trait `ms-settings-nfctransactions` extends UriSchemes
  @scala.inline
  def `ms-settings-nfctransactions`: `ms-settings-nfctransactions` = "ms-settings-nfctransactions".asInstanceOf[`ms-settings-nfctransactions`]
  
  @js.native
  sealed trait `ms-settings-notifications` extends UriSchemes
  @scala.inline
  def `ms-settings-notifications`: `ms-settings-notifications` = "ms-settings-notifications".asInstanceOf[`ms-settings-notifications`]
  
  @js.native
  sealed trait `ms-settings-power` extends UriSchemes
  @scala.inline
  def `ms-settings-power`: `ms-settings-power` = "ms-settings-power".asInstanceOf[`ms-settings-power`]
  
  @js.native
  sealed trait `ms-settings-privacy` extends UriSchemes
  @scala.inline
  def `ms-settings-privacy`: `ms-settings-privacy` = "ms-settings-privacy".asInstanceOf[`ms-settings-privacy`]
  
  @js.native
  sealed trait `ms-settings-proximity` extends UriSchemes
  @scala.inline
  def `ms-settings-proximity`: `ms-settings-proximity` = "ms-settings-proximity".asInstanceOf[`ms-settings-proximity`]
  
  @js.native
  sealed trait `ms-settings-screenrotation` extends UriSchemes
  @scala.inline
  def `ms-settings-screenrotation`: `ms-settings-screenrotation` = "ms-settings-screenrotation".asInstanceOf[`ms-settings-screenrotation`]
  
  @js.native
  sealed trait `ms-settings-wifi` extends UriSchemes
  @scala.inline
  def `ms-settings-wifi`: `ms-settings-wifi` = "ms-settings-wifi".asInstanceOf[`ms-settings-wifi`]
  
  @js.native
  sealed trait `ms-settings-workplace` extends UriSchemes
  @scala.inline
  def `ms-settings-workplace`: `ms-settings-workplace` = "ms-settings-workplace".asInstanceOf[`ms-settings-workplace`]
  
  @js.native
  sealed trait `ms-spd` extends UriSchemes
  @scala.inline
  def `ms-spd`: `ms-spd` = "ms-spd".asInstanceOf[`ms-spd`]
  
  @js.native
  sealed trait `ms-sttoverlay` extends UriSchemes
  @scala.inline
  def `ms-sttoverlay`: `ms-sttoverlay` = "ms-sttoverlay".asInstanceOf[`ms-sttoverlay`]
  
  @js.native
  sealed trait `ms-transit-to` extends UriSchemes
  @scala.inline
  def `ms-transit-to`: `ms-transit-to` = "ms-transit-to".asInstanceOf[`ms-transit-to`]
  
  @js.native
  sealed trait `ms-useractivityset` extends UriSchemes
  @scala.inline
  def `ms-useractivityset`: `ms-useractivityset` = "ms-useractivityset".asInstanceOf[`ms-useractivityset`]
  
  @js.native
  sealed trait `ms-virtualtouchpad` extends UriSchemes
  @scala.inline
  def `ms-virtualtouchpad`: `ms-virtualtouchpad` = "ms-virtualtouchpad".asInstanceOf[`ms-virtualtouchpad`]
  
  @js.native
  sealed trait `ms-visio` extends UriSchemes
  @scala.inline
  def `ms-visio`: `ms-visio` = "ms-visio".asInstanceOf[`ms-visio`]
  
  @js.native
  sealed trait `ms-walk-to` extends UriSchemes
  @scala.inline
  def `ms-walk-to`: `ms-walk-to` = "ms-walk-to".asInstanceOf[`ms-walk-to`]
  
  @js.native
  sealed trait `ms-whiteboard` extends UriSchemes
  @scala.inline
  def `ms-whiteboard`: `ms-whiteboard` = "ms-whiteboard".asInstanceOf[`ms-whiteboard`]
  
  @js.native
  sealed trait `ms-whiteboard-cmd` extends UriSchemes
  @scala.inline
  def `ms-whiteboard-cmd`: `ms-whiteboard-cmd` = "ms-whiteboard-cmd".asInstanceOf[`ms-whiteboard-cmd`]
  
  @js.native
  sealed trait `ms-word` extends UriSchemes
  @scala.inline
  def `ms-word`: `ms-word` = "ms-word".asInstanceOf[`ms-word`]
  
  @js.native
  sealed trait msnim extends UriSchemes
  @scala.inline
  def msnim: msnim = "msnim".asInstanceOf[msnim]
  
  @js.native
  sealed trait msrp extends UriSchemes
  @scala.inline
  def msrp: msrp = "msrp".asInstanceOf[msrp]
  
  @js.native
  sealed trait msrps extends UriSchemes
  @scala.inline
  def msrps: msrps = "msrps".asInstanceOf[msrps]
  
  @js.native
  sealed trait mss extends UriSchemes
  @scala.inline
  def mss: mss = "mss".asInstanceOf[mss]
  
  @js.native
  sealed trait mtqp extends UriSchemes
  @scala.inline
  def mtqp: mtqp = "mtqp".asInstanceOf[mtqp]
  
  @js.native
  sealed trait `multi-color` extends MediaColor
  @scala.inline
  def `multi-color`: `multi-color` = "multi-color".asInstanceOf[`multi-color`]
  
  @js.native
  sealed trait `multi-layer` extends MediaType
  @scala.inline
  def `multi-layer`: `multi-layer` = "multi-layer".asInstanceOf[`multi-layer`]
  
  @js.native
  sealed trait `multi-part-form` extends MediaType
  @scala.inline
  def `multi-part-form`: `multi-part-form` = "multi-part-form".asInstanceOf[`multi-part-form`]
  
  @js.native
  sealed trait `multiple-destination-uris-supported` extends StObject
  @scala.inline
  def `multiple-destination-uris-supported`: `multiple-destination-uris-supported` = "multiple-destination-uris-supported".asInstanceOf[`multiple-destination-uris-supported`]
  
  @js.native
  sealed trait `multiple-document-handling` extends Overrides
  @scala.inline
  def `multiple-document-handling`: `multiple-document-handling` = "multiple-document-handling".asInstanceOf[`multiple-document-handling`]
  
  @js.native
  sealed trait `multiple-document-handling-actual` extends StObject
  @scala.inline
  def `multiple-document-handling-actual`: `multiple-document-handling-actual` = "multiple-document-handling-actual".asInstanceOf[`multiple-document-handling-actual`]
  
  @js.native
  sealed trait `multiple-document-handling-default` extends StObject
  @scala.inline
  def `multiple-document-handling-default`: `multiple-document-handling-default` = "multiple-document-handling-default".asInstanceOf[`multiple-document-handling-default`]
  
  @js.native
  sealed trait `multiple-document-handling-supported` extends StObject
  @scala.inline
  def `multiple-document-handling-supported`: `multiple-document-handling-supported` = "multiple-document-handling-supported".asInstanceOf[`multiple-document-handling-supported`]
  
  @js.native
  sealed trait `multiple-document-jobs-supported` extends StObject
  @scala.inline
  def `multiple-document-jobs-supported`: `multiple-document-jobs-supported` = "multiple-document-jobs-supported".asInstanceOf[`multiple-document-jobs-supported`]
  
  @js.native
  sealed trait `multiple-object-handling` extends Overrides
  @scala.inline
  def `multiple-object-handling`: `multiple-object-handling` = "multiple-object-handling".asInstanceOf[`multiple-object-handling`]
  
  @js.native
  sealed trait `multiple-object-handling-actual` extends StObject
  @scala.inline
  def `multiple-object-handling-actual`: `multiple-object-handling-actual` = "multiple-object-handling-actual".asInstanceOf[`multiple-object-handling-actual`]
  
  @js.native
  sealed trait `multiple-object-handling-default` extends StObject
  @scala.inline
  def `multiple-object-handling-default`: `multiple-object-handling-default` = "multiple-object-handling-default".asInstanceOf[`multiple-object-handling-default`]
  
  @js.native
  sealed trait `multiple-object-handling-supported` extends StObject
  @scala.inline
  def `multiple-object-handling-supported`: `multiple-object-handling-supported` = "multiple-object-handling-supported".asInstanceOf[`multiple-object-handling-supported`]
  
  @js.native
  sealed trait `multiple-operation-time-out` extends StObject
  @scala.inline
  def `multiple-operation-time-out`: `multiple-operation-time-out` = "multiple-operation-time-out".asInstanceOf[`multiple-operation-time-out`]
  
  @js.native
  sealed trait `multiple-operation-time-out-action` extends StObject
  @scala.inline
  def `multiple-operation-time-out-action`: `multiple-operation-time-out-action` = "multiple-operation-time-out-action".asInstanceOf[`multiple-operation-time-out-action`]
  
  @js.native
  sealed trait mumble extends UriSchemes
  @scala.inline
  def mumble: mumble = "mumble".asInstanceOf[mumble]
  
  @js.native
  sealed trait mupdate extends UriSchemes
  @scala.inline
  def mupdate: mupdate = "mupdate".asInstanceOf[mupdate]
  
  @js.native
  sealed trait mustard extends MediaColor
  @scala.inline
  def mustard: mustard = "mustard".asInstanceOf[mustard]
  
  @js.native
  sealed trait mvn extends UriSchemes
  @scala.inline
  def mvn: mvn = "mvn".asInstanceOf[mvn]
  
  @js.native
  sealed trait `my-mailbox` extends OutputBin
  @scala.inline
  def `my-mailbox`: `my-mailbox` = "my-mailbox".asInstanceOf[`my-mailbox`]
  
  @js.native
  sealed trait `n-to-1-order` extends PageOrder
  @scala.inline
  def `n-to-1-order`: `n-to-1-order` = "n-to-1-order".asInstanceOf[`n-to-1-order`]
  
  @js.native
  sealed trait `na-10x13`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-10x13`: `na-10x13` = "na-10x13".asInstanceOf[`na-10x13`]
  
  @js.native
  sealed trait `na-10x13-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-10x13-envelope`: `na-10x13-envelope` = "na-10x13-envelope".asInstanceOf[`na-10x13-envelope`]
  
  @js.native
  sealed trait `na-10x14`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-10x14`: `na-10x14` = "na-10x14".asInstanceOf[`na-10x14`]
  
  @js.native
  sealed trait `na-10x14-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-10x14-envelope`: `na-10x14-envelope` = "na-10x14-envelope".asInstanceOf[`na-10x14-envelope`]
  
  @js.native
  sealed trait `na-10x15`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-10x15`: `na-10x15` = "na-10x15".asInstanceOf[`na-10x15`]
  
  @js.native
  sealed trait `na-10x15-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-10x15-envelope`: `na-10x15-envelope` = "na-10x15-envelope".asInstanceOf[`na-10x15-envelope`]
  
  @js.native
  sealed trait `na-5x7`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-5x7`: `na-5x7` = "na-5x7".asInstanceOf[`na-5x7`]
  
  @js.native
  sealed trait `na-6x9`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-6x9`: `na-6x9` = "na-6x9".asInstanceOf[`na-6x9`]
  
  @js.native
  sealed trait `na-6x9-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-6x9-envelope`: `na-6x9-envelope` = "na-6x9-envelope".asInstanceOf[`na-6x9-envelope`]
  
  @js.native
  sealed trait `na-7x9`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-7x9`: `na-7x9` = "na-7x9".asInstanceOf[`na-7x9`]
  
  @js.native
  sealed trait `na-7x9-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-7x9-envelope`: `na-7x9-envelope` = "na-7x9-envelope".asInstanceOf[`na-7x9-envelope`]
  
  @js.native
  sealed trait `na-8x10`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-8x10`: `na-8x10` = "na-8x10".asInstanceOf[`na-8x10`]
  
  @js.native
  sealed trait `na-9x11`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-9x11`: `na-9x11` = "na-9x11".asInstanceOf[`na-9x11`]
  
  @js.native
  sealed trait `na-9x11-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-9x11-envelope`: `na-9x11-envelope` = "na-9x11-envelope".asInstanceOf[`na-9x11-envelope`]
  
  @js.native
  sealed trait `na-9x12`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-9x12`: `na-9x12` = "na-9x12".asInstanceOf[`na-9x12`]
  
  @js.native
  sealed trait `na-9x12-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-9x12-envelope`: `na-9x12-envelope` = "na-9x12-envelope".asInstanceOf[`na-9x12-envelope`]
  
  @js.native
  sealed trait `na-legal`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-legal`: `na-legal` = "na-legal".asInstanceOf[`na-legal`]
  
  @js.native
  sealed trait `na-legal-colored`
    extends Media
       with MediaName
  @scala.inline
  def `na-legal-colored`: `na-legal-colored` = "na-legal-colored".asInstanceOf[`na-legal-colored`]
  
  @js.native
  sealed trait `na-legal-white`
    extends Media
       with MediaName
  @scala.inline
  def `na-legal-white`: `na-legal-white` = "na-legal-white".asInstanceOf[`na-legal-white`]
  
  @js.native
  sealed trait `na-letter`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-letter`: `na-letter` = "na-letter".asInstanceOf[`na-letter`]
  
  @js.native
  sealed trait `na-letter-colored`
    extends Media
       with MediaName
  @scala.inline
  def `na-letter-colored`: `na-letter-colored` = "na-letter-colored".asInstanceOf[`na-letter-colored`]
  
  @js.native
  sealed trait `na-letter-transparent`
    extends Media
       with MediaName
  @scala.inline
  def `na-letter-transparent`: `na-letter-transparent` = "na-letter-transparent".asInstanceOf[`na-letter-transparent`]
  
  @js.native
  sealed trait `na-letter-white`
    extends Media
       with MediaName
  @scala.inline
  def `na-letter-white`: `na-letter-white` = "na-letter-white".asInstanceOf[`na-letter-white`]
  
  @js.native
  sealed trait `na-number-10`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-number-10`: `na-number-10` = "na-number-10".asInstanceOf[`na-number-10`]
  
  @js.native
  sealed trait `na-number-10-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-number-10-envelope`: `na-number-10-envelope` = "na-number-10-envelope".asInstanceOf[`na-number-10-envelope`]
  
  @js.native
  sealed trait `na-number-9`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na-number-9`: `na-number-9` = "na-number-9".asInstanceOf[`na-number-9`]
  
  @js.native
  sealed trait `na-number-9-envelope`
    extends Media
       with MediaEnvelopeName
  @scala.inline
  def `na-number-9-envelope`: `na-number-9-envelope` = "na-number-9-envelope".asInstanceOf[`na-number-9-envelope`]
  
  @js.native
  sealed trait na_10x11_10x11in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_10x11_10x11in: na_10x11_10x11in = "na_10x11_10x11in".asInstanceOf[na_10x11_10x11in]
  
  @js.native
  sealed trait na_10x13_10x13in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_10x13_10x13in: na_10x13_10x13in = "na_10x13_10x13in".asInstanceOf[na_10x13_10x13in]
  
  @js.native
  sealed trait na_10x14_10x14in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_10x14_10x14in: na_10x14_10x14in = "na_10x14_10x14in".asInstanceOf[na_10x14_10x14in]
  
  @js.native
  sealed trait na_10x15_10x15in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_10x15_10x15in: na_10x15_10x15in = "na_10x15_10x15in".asInstanceOf[na_10x15_10x15in]
  
  @js.native
  sealed trait na_11x12_11x12in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_11x12_11x12in: na_11x12_11x12in = "na_11x12_11x12in".asInstanceOf[na_11x12_11x12in]
  
  @js.native
  sealed trait na_11x15_11x15in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_11x15_11x15in: na_11x15_11x15in = "na_11x15_11x15in".asInstanceOf[na_11x15_11x15in]
  
  @js.native
  sealed trait na_12x19_12x19in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_12x19_12x19in: na_12x19_12x19in = "na_12x19_12x19in".asInstanceOf[na_12x19_12x19in]
  
  @js.native
  sealed trait na_5x7_5x7in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_5x7_5x7in: na_5x7_5x7in = "na_5x7_5x7in".asInstanceOf[na_5x7_5x7in]
  
  @js.native
  sealed trait na_6x9_6x9in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_6x9_6x9in: na_6x9_6x9in = "na_6x9_6x9in".asInstanceOf[na_6x9_6x9in]
  
  @js.native
  sealed trait na_7x9_7x9in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_7x9_7x9in: na_7x9_7x9in = "na_7x9_7x9in".asInstanceOf[na_7x9_7x9in]
  
  @js.native
  sealed trait na_9x11_9x11in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_9x11_9x11in: na_9x11_9x11in = "na_9x11_9x11in".asInstanceOf[na_9x11_9x11in]
  
  @js.native
  sealed trait na_a2_4Dot375x5Dot75in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_a2_4Dot375x5Dot75in: na_a2_4Dot375x5Dot75in = "na_a2_4.375x5.75in".asInstanceOf[na_a2_4Dot375x5Dot75in]
  
  @js.native
  sealed trait `na_arch-a_9x12in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-a_9x12in`: `na_arch-a_9x12in` = "na_arch-a_9x12in".asInstanceOf[`na_arch-a_9x12in`]
  
  @js.native
  sealed trait `na_arch-b_12x18in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-b_12x18in`: `na_arch-b_12x18in` = "na_arch-b_12x18in".asInstanceOf[`na_arch-b_12x18in`]
  
  @js.native
  sealed trait `na_arch-c_18x24in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-c_18x24in`: `na_arch-c_18x24in` = "na_arch-c_18x24in".asInstanceOf[`na_arch-c_18x24in`]
  
  @js.native
  sealed trait `na_arch-d_24x36in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-d_24x36in`: `na_arch-d_24x36in` = "na_arch-d_24x36in".asInstanceOf[`na_arch-d_24x36in`]
  
  @js.native
  sealed trait `na_arch-e2_26x38in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-e2_26x38in`: `na_arch-e2_26x38in` = "na_arch-e2_26x38in".asInstanceOf[`na_arch-e2_26x38in`]
  
  @js.native
  sealed trait `na_arch-e3_27x39in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-e3_27x39in`: `na_arch-e3_27x39in` = "na_arch-e3_27x39in".asInstanceOf[`na_arch-e3_27x39in`]
  
  @js.native
  sealed trait `na_arch-e_36x48in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_arch-e_36x48in`: `na_arch-e_36x48in` = "na_arch-e_36x48in".asInstanceOf[`na_arch-e_36x48in`]
  
  @js.native
  sealed trait `na_b-plus_12x19Dot17in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_b-plus_12x19Dot17in`: `na_b-plus_12x19Dot17in` = "na_b-plus_12x19.17in".asInstanceOf[`na_b-plus_12x19Dot17in`]
  
  @js.native
  sealed trait na_c5_6Dot5x9Dot5in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_c5_6Dot5x9Dot5in: na_c5_6Dot5x9Dot5in = "na_c5_6.5x9.5in".asInstanceOf[na_c5_6Dot5x9Dot5in]
  
  @js.native
  sealed trait na_c_17x22in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_c_17x22in: na_c_17x22in = "na_c_17x22in".asInstanceOf[na_c_17x22in]
  
  @js.native
  sealed trait na_d_22x34in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_d_22x34in: na_d_22x34in = "na_d_22x34in".asInstanceOf[na_d_22x34in]
  
  @js.native
  sealed trait na_e_34x44in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_e_34x44in: na_e_34x44in = "na_e_34x44in".asInstanceOf[na_e_34x44in]
  
  @js.native
  sealed trait na_edp_11x14in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_edp_11x14in: na_edp_11x14in = "na_edp_11x14in".asInstanceOf[na_edp_11x14in]
  
  @js.native
  sealed trait `na_eur-edp_12x14in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_eur-edp_12x14in`: `na_eur-edp_12x14in` = "na_eur-edp_12x14in".asInstanceOf[`na_eur-edp_12x14in`]
  
  @js.native
  sealed trait na_executive_7Dot25x10Dot5in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_executive_7Dot25x10Dot5in: na_executive_7Dot25x10Dot5in = "na_executive_7.25x10.5in".asInstanceOf[na_executive_7Dot25x10Dot5in]
  
  @js.native
  sealed trait na_f_44x68in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_f_44x68in: na_f_44x68in = "na_f_44x68in".asInstanceOf[na_f_44x68in]
  
  @js.native
  sealed trait `na_fanfold-eur_8Dot5x12in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_fanfold-eur_8Dot5x12in`: `na_fanfold-eur_8Dot5x12in` = "na_fanfold-eur_8.5x12in".asInstanceOf[`na_fanfold-eur_8Dot5x12in`]
  
  @js.native
  sealed trait `na_fanfold-us_11x14Dot875in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_fanfold-us_11x14Dot875in`: `na_fanfold-us_11x14Dot875in` = "na_fanfold-us_11x14.875in".asInstanceOf[`na_fanfold-us_11x14Dot875in`]
  
  @js.native
  sealed trait na_foolscap_8Dot5x13in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_foolscap_8Dot5x13in: na_foolscap_8Dot5x13in = "na_foolscap_8.5x13in".asInstanceOf[na_foolscap_8Dot5x13in]
  
  @js.native
  sealed trait `na_govt-legal_8x13in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_govt-legal_8x13in`: `na_govt-legal_8x13in` = "na_govt-legal_8x13in".asInstanceOf[`na_govt-legal_8x13in`]
  
  @js.native
  sealed trait `na_govt-letter_8x10in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_govt-letter_8x10in`: `na_govt-letter_8x10in` = "na_govt-letter_8x10in".asInstanceOf[`na_govt-letter_8x10in`]
  
  @js.native
  sealed trait `na_index-3x5_3x5in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_index-3x5_3x5in`: `na_index-3x5_3x5in` = "na_index-3x5_3x5in".asInstanceOf[`na_index-3x5_3x5in`]
  
  @js.native
  sealed trait `na_index-4x6-ext_6x8in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_index-4x6-ext_6x8in`: `na_index-4x6-ext_6x8in` = "na_index-4x6-ext_6x8in".asInstanceOf[`na_index-4x6-ext_6x8in`]
  
  @js.native
  sealed trait `na_index-4x6_4x6in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_index-4x6_4x6in`: `na_index-4x6_4x6in` = "na_index-4x6_4x6in".asInstanceOf[`na_index-4x6_4x6in`]
  
  @js.native
  sealed trait `na_index-5x8_5x8in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_index-5x8_5x8in`: `na_index-5x8_5x8in` = "na_index-5x8_5x8in".asInstanceOf[`na_index-5x8_5x8in`]
  
  @js.native
  sealed trait na_invoice_5Dot5x8Dot5in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_invoice_5Dot5x8Dot5in: na_invoice_5Dot5x8Dot5in = "na_invoice_5.5x8.5in".asInstanceOf[na_invoice_5Dot5x8Dot5in]
  
  @js.native
  sealed trait na_ledger_11x17in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_ledger_11x17in: na_ledger_11x17in = "na_ledger_11x17in".asInstanceOf[na_ledger_11x17in]
  
  @js.native
  sealed trait `na_legal-extra_9Dot5x15in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_legal-extra_9Dot5x15in`: `na_legal-extra_9Dot5x15in` = "na_legal-extra_9.5x15in".asInstanceOf[`na_legal-extra_9Dot5x15in`]
  
  @js.native
  sealed trait na_legal_8Dot5x14in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_legal_8Dot5x14in: na_legal_8Dot5x14in = "na_legal_8.5x14in".asInstanceOf[na_legal_8Dot5x14in]
  
  @js.native
  sealed trait `na_letter-extra_9Dot5x12in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_letter-extra_9Dot5x12in`: `na_letter-extra_9Dot5x12in` = "na_letter-extra_9.5x12in".asInstanceOf[`na_letter-extra_9Dot5x12in`]
  
  @js.native
  sealed trait `na_letter-plus_8Dot5x12Dot69in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_letter-plus_8Dot5x12Dot69in`: `na_letter-plus_8Dot5x12Dot69in` = "na_letter-plus_8.5x12.69in".asInstanceOf[`na_letter-plus_8Dot5x12Dot69in`]
  
  @js.native
  sealed trait na_letter_8Dot5x11in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_letter_8Dot5x11in: na_letter_8Dot5x11in = "na_letter_8.5x11in".asInstanceOf[na_letter_8Dot5x11in]
  
  @js.native
  sealed trait na_monarch_3Dot875x7Dot5in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_monarch_3Dot875x7Dot5in: na_monarch_3Dot875x7Dot5in = "na_monarch_3.875x7.5in".asInstanceOf[na_monarch_3Dot875x7Dot5in]
  
  @js.native
  sealed trait `na_number-10_4Dot125x9Dot5in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_number-10_4Dot125x9Dot5in`: `na_number-10_4Dot125x9Dot5in` = "na_number-10_4.125x9.5in".asInstanceOf[`na_number-10_4Dot125x9Dot5in`]
  
  @js.native
  sealed trait `na_number-11_4Dot5x10Dot375in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_number-11_4Dot5x10Dot375in`: `na_number-11_4Dot5x10Dot375in` = "na_number-11_4.5x10.375in".asInstanceOf[`na_number-11_4Dot5x10Dot375in`]
  
  @js.native
  sealed trait `na_number-12_4Dot75x11in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_number-12_4Dot75x11in`: `na_number-12_4Dot75x11in` = "na_number-12_4.75x11in".asInstanceOf[`na_number-12_4Dot75x11in`]
  
  @js.native
  sealed trait `na_number-14_5x11Dot5in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_number-14_5x11Dot5in`: `na_number-14_5x11Dot5in` = "na_number-14_5x11.5in".asInstanceOf[`na_number-14_5x11Dot5in`]
  
  @js.native
  sealed trait `na_number-9_3Dot875x8Dot875in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_number-9_3Dot875x8Dot875in`: `na_number-9_3Dot875x8Dot875in` = "na_number-9_3.875x8.875in".asInstanceOf[`na_number-9_3Dot875x8Dot875in`]
  
  @js.native
  sealed trait na_oficio_8Dot5x13Dot4in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_oficio_8Dot5x13Dot4in: na_oficio_8Dot5x13Dot4in = "na_oficio_8.5x13.4in".asInstanceOf[na_oficio_8Dot5x13Dot4in]
  
  @js.native
  sealed trait na_personal_3Dot625x6Dot5in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_personal_3Dot625x6Dot5in: na_personal_3Dot625x6Dot5in = "na_personal_3.625x6.5in".asInstanceOf[na_personal_3Dot625x6Dot5in]
  
  @js.native
  sealed trait na_quarto_8Dot5x10Dot83in
    extends Media
       with MediaSizeName
  @scala.inline
  def na_quarto_8Dot5x10Dot83in: na_quarto_8Dot5x10Dot83in = "na_quarto_8.5x10.83in".asInstanceOf[na_quarto_8Dot5x10Dot83in]
  
  @js.native
  sealed trait `na_super-a_8Dot94x14in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_super-a_8Dot94x14in`: `na_super-a_8Dot94x14in` = "na_super-a_8.94x14in".asInstanceOf[`na_super-a_8Dot94x14in`]
  
  @js.native
  sealed trait `na_super-b_13x19in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_super-b_13x19in`: `na_super-b_13x19in` = "na_super-b_13x19in".asInstanceOf[`na_super-b_13x19in`]
  
  @js.native
  sealed trait `na_wide-format_30x42in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `na_wide-format_30x42in`: `na_wide-format_30x42in` = "na_wide-format_30x42in".asInstanceOf[`na_wide-format_30x42in`]
  
  @js.native
  sealed trait `natural-language-configured` extends StObject
  @scala.inline
  def `natural-language-configured`: `natural-language-configured` = "natural-language-configured".asInstanceOf[`natural-language-configured`]
  
  @js.native
  sealed trait negotiate extends StObject
  @scala.inline
  def negotiate: negotiate = "negotiate".asInstanceOf[negotiate]
  
  @js.native
  sealed trait news extends UriSchemes
  @scala.inline
  def news: news = "news".asInstanceOf[news]
  
  @js.native
  sealed trait nfs extends UriSchemes
  @scala.inline
  def nfs: nfs = "nfs".asInstanceOf[nfs]
  
  @js.native
  sealed trait ni extends UriSchemes
  @scala.inline
  def ni: ni = "ni".asInstanceOf[ni]
  
  @js.native
  sealed trait night
    extends JobDelayOutputUntil
       with JobHoldUntil
  @scala.inline
  def night: night = "night".asInstanceOf[night]
  
  @js.native
  sealed trait nih extends UriSchemes
  @scala.inline
  def nih: nih = "nih".asInstanceOf[nih]
  
  @js.native
  sealed trait nm extends AccuracyUnits
  @scala.inline
  def nm: nm = "nm".asInstanceOf[nm]
  
  @js.native
  sealed trait nntp extends UriSchemes
  @scala.inline
  def nntp: nntp = "nntp".asInstanceOf[nntp]
  
  @js.native
  sealed trait `no-change` extends PowerState
  @scala.inline
  def `no-change`: `no-change` = "no-change".asInstanceOf[`no-change`]
  
  @js.native
  sealed trait `no-color` extends MediaColor
  @scala.inline
  def `no-color`: `no-color` = "no-color".asInstanceOf[`no-color`]
  
  @js.native
  sealed trait `no-cover` extends CoverType
  @scala.inline
  def `no-cover`: `no-cover` = "no-cover".asInstanceOf[`no-cover`]
  
  @js.native
  sealed trait `no-delay-output` extends JobDelayOutputUntil
  @scala.inline
  def `no-delay-output`: `no-delay-output` = "no-delay-output".asInstanceOf[`no-delay-output`]
  
  @js.native
  sealed trait `no-hold` extends JobHoldUntil
  @scala.inline
  def `no-hold`: `no-hold` = "no-hold".asInstanceOf[`no-hold`]
  
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
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends PrintQuality
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-applicable`
    extends InputFilmScanMode
       with PowerState
  @scala.inline
  def `not-applicable`: `not-applicable` = "not-applicable".asInstanceOf[`not-applicable`]
  
  @js.native
  sealed trait `not-attempted` extends StObject
  @scala.inline
  def `not-attempted`: `not-attempted` = "not-attempted".asInstanceOf[`not-attempted`]
  
  @js.native
  sealed trait `not-completed` extends WhichJobs
  @scala.inline
  def `not-completed`: `not-completed` = "not-completed".asInstanceOf[`not-completed`]
  
  @js.native
  sealed trait notes extends UriSchemes
  @scala.inline
  def notes: notes = "notes".asInstanceOf[notes]
  
  @js.native
  sealed trait `notify-attributes-supported` extends StObject
  @scala.inline
  def `notify-attributes-supported`: `notify-attributes-supported` = "notify-attributes-supported".asInstanceOf[`notify-attributes-supported`]
  
  @js.native
  sealed trait `notify-events-default` extends StObject
  @scala.inline
  def `notify-events-default`: `notify-events-default` = "notify-events-default".asInstanceOf[`notify-events-default`]
  
  @js.native
  sealed trait `notify-events-supported` extends StObject
  @scala.inline
  def `notify-events-supported`: `notify-events-supported` = "notify-events-supported".asInstanceOf[`notify-events-supported`]
  
  @js.native
  sealed trait `notify-lease-duration-default` extends StObject
  @scala.inline
  def `notify-lease-duration-default`: `notify-lease-duration-default` = "notify-lease-duration-default".asInstanceOf[`notify-lease-duration-default`]
  
  @js.native
  sealed trait `notify-lease-duration-supported` extends StObject
  @scala.inline
  def `notify-lease-duration-supported`: `notify-lease-duration-supported` = "notify-lease-duration-supported".asInstanceOf[`notify-lease-duration-supported`]
  
  @js.native
  sealed trait `notify-pull-method-supported` extends StObject
  @scala.inline
  def `notify-pull-method-supported`: `notify-pull-method-supported` = "notify-pull-method-supported".asInstanceOf[`notify-pull-method-supported`]
  
  @js.native
  sealed trait `notify-schemes-supported` extends StObject
  @scala.inline
  def `notify-schemes-supported`: `notify-schemes-supported` = "notify-schemes-supported".asInstanceOf[`notify-schemes-supported`]
  
  @js.native
  sealed trait ntp extends SystemTimeoutSource
  @scala.inline
  def ntp: ntp = "ntp".asInstanceOf[ntp]
  
  @js.native
  sealed trait `number-of-documents` extends StObject
  @scala.inline
  def `number-of-documents`: `number-of-documents` = "number-of-documents".asInstanceOf[`number-of-documents`]
  
  @js.native
  sealed trait `number-of-intervening-jobs` extends StObject
  @scala.inline
  def `number-of-intervening-jobs`: `number-of-intervening-jobs` = "number-of-intervening-jobs".asInstanceOf[`number-of-intervening-jobs`]
  
  @js.native
  sealed trait `number-of-retries` extends Overrides
  @scala.inline
  def `number-of-retries`: `number-of-retries` = "number-of-retries".asInstanceOf[`number-of-retries`]
  
  @js.native
  sealed trait `number-of-retries-default` extends StObject
  @scala.inline
  def `number-of-retries-default`: `number-of-retries-default` = "number-of-retries-default".asInstanceOf[`number-of-retries-default`]
  
  @js.native
  sealed trait `number-of-retries-supported` extends StObject
  @scala.inline
  def `number-of-retries-supported`: `number-of-retries-supported` = "number-of-retries-supported".asInstanceOf[`number-of-retries-supported`]
  
  @js.native
  sealed trait `number-up` extends Overrides
  @scala.inline
  def `number-up`: `number-up` = "number-up".asInstanceOf[`number-up`]
  
  @js.native
  sealed trait `number-up-actual` extends StObject
  @scala.inline
  def `number-up-actual`: `number-up-actual` = "number-up-actual".asInstanceOf[`number-up-actual`]
  
  @js.native
  sealed trait `number-up-default` extends StObject
  @scala.inline
  def `number-up-default`: `number-up-default` = "number-up-default".asInstanceOf[`number-up-default`]
  
  @js.native
  sealed trait `number-up-supported` extends StObject
  @scala.inline
  def `number-up-supported`: `number-up-supported` = "number-up-supported".asInstanceOf[`number-up-supported`]
  
  @js.native
  sealed trait nylon extends MaterialType
  @scala.inline
  def nylon: nylon = "nylon".asInstanceOf[nylon]
  
  @js.native
  sealed trait `oauth-authorization-scope` extends StObject
  @scala.inline
  def `oauth-authorization-scope`: `oauth-authorization-scope` = "oauth-authorization-scope".asInstanceOf[`oauth-authorization-scope`]
  
  @js.native
  sealed trait `oauth-authorization-server-uri` extends StObject
  @scala.inline
  def `oauth-authorization-server-uri`: `oauth-authorization-server-uri` = "oauth-authorization-server-uri".asInstanceOf[`oauth-authorization-server-uri`]
  
  @js.native
  sealed trait `object-offset` extends StObject
  @scala.inline
  def `object-offset`: `object-offset` = "object-offset".asInstanceOf[`object-offset`]
  
  @js.native
  sealed trait `object-size` extends StObject
  @scala.inline
  def `object-size`: `object-size` = "object-size".asInstanceOf[`object-size`]
  
  @js.native
  sealed trait `object-uuid` extends StObject
  @scala.inline
  def `object-uuid`: `object-uuid` = "object-uuid".asInstanceOf[`object-uuid`]
  
  @js.native
  sealed trait ocf extends UriSchemes
  @scala.inline
  def ocf: ocf = "ocf".asInstanceOf[ocf]
  
  @js.native
  sealed trait oe_12x16_12x16in
    extends Media
       with MediaSizeName
  @scala.inline
  def oe_12x16_12x16in: oe_12x16_12x16in = "oe_12x16_12x16in".asInstanceOf[oe_12x16_12x16in]
  
  @js.native
  sealed trait oe_14x17_14x17in
    extends Media
       with MediaSizeName
  @scala.inline
  def oe_14x17_14x17in: oe_14x17_14x17in = "oe_14x17_14x17in".asInstanceOf[oe_14x17_14x17in]
  
  @js.native
  sealed trait oe_18x22_18x22in
    extends Media
       with MediaSizeName
  @scala.inline
  def oe_18x22_18x22in: oe_18x22_18x22in = "oe_18x22_18x22in".asInstanceOf[oe_18x22_18x22in]
  
  @js.native
  sealed trait oe_a2plus_17x24in
    extends Media
       with MediaSizeName
  @scala.inline
  def oe_a2plus_17x24in: oe_a2plus_17x24in = "oe_a2plus_17x24in".asInstanceOf[oe_a2plus_17x24in]
  
  @js.native
  sealed trait `oe_business-card_2x3Dot5in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_business-card_2x3Dot5in`: `oe_business-card_2x3Dot5in` = "oe_business-card_2x3.5in".asInstanceOf[`oe_business-card_2x3Dot5in`]
  
  @js.native
  sealed trait `oe_photo-10r_10x12in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_photo-10r_10x12in`: `oe_photo-10r_10x12in` = "oe_photo-10r_10x12in".asInstanceOf[`oe_photo-10r_10x12in`]
  
  @js.native
  sealed trait `oe_photo-20r_20x24in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_photo-20r_20x24in`: `oe_photo-20r_20x24in` = "oe_photo-20r_20x24in".asInstanceOf[`oe_photo-20r_20x24in`]
  
  @js.native
  sealed trait `oe_photo-l_3Dot5x5in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_photo-l_3Dot5x5in`: `oe_photo-l_3Dot5x5in` = "oe_photo-l_3.5x5in".asInstanceOf[`oe_photo-l_3Dot5x5in`]
  
  @js.native
  sealed trait `oe_photo-s10r_10x15in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_photo-s10r_10x15in`: `oe_photo-s10r_10x15in` = "oe_photo-s10r_10x15in".asInstanceOf[`oe_photo-s10r_10x15in`]
  
  @js.native
  sealed trait `oe_square-photo_4x4in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_square-photo_4x4in`: `oe_square-photo_4x4in` = "oe_square-photo_4x4in".asInstanceOf[`oe_square-photo_4x4in`]
  
  @js.native
  sealed trait `oe_square-photo_5x5in`
    extends Media
       with MediaSizeName
  @scala.inline
  def `oe_square-photo_5x5in`: `oe_square-photo_5x5in` = "oe_square-photo_5x5in".asInstanceOf[`oe_square-photo_5x5in`]
  
  @js.native
  sealed trait `off-hard` extends PowerState
  @scala.inline
  def `off-hard`: `off-hard` = "off-hard".asInstanceOf[`off-hard`]
  
  @js.native
  sealed trait `off-hard-graceful` extends PowerState
  @scala.inline
  def `off-hard-graceful`: `off-hard-graceful` = "off-hard-graceful".asInstanceOf[`off-hard-graceful`]
  
  @js.native
  sealed trait `off-soft` extends PowerState
  @scala.inline
  def `off-soft`: `off-soft` = "off-soft".asInstanceOf[`off-soft`]
  
  @js.native
  sealed trait `off-soft-graceful` extends PowerState
  @scala.inline
  def `off-soft-graceful`: `off-soft-graceful` = "off-soft-graceful".asInstanceOf[`off-soft-graceful`]
  
  @js.native
  sealed trait `off-soft-vendor1` extends PowerState
  @scala.inline
  def `off-soft-vendor1`: `off-soft-vendor1` = "off-soft-vendor1".asInstanceOf[`off-soft-vendor1`]
  
  @js.native
  sealed trait `off-soft-vendor2` extends PowerState
  @scala.inline
  def `off-soft-vendor2`: `off-soft-vendor2` = "off-soft-vendor2".asInstanceOf[`off-soft-vendor2`]
  
  @js.native
  sealed trait `off-soft-vendor3` extends PowerState
  @scala.inline
  def `off-soft-vendor3`: `off-soft-vendor3` = "off-soft-vendor3".asInstanceOf[`off-soft-vendor3`]
  
  @js.native
  sealed trait `off-soft-vendor4` extends PowerState
  @scala.inline
  def `off-soft-vendor4`: `off-soft-vendor4` = "off-soft-vendor4".asInstanceOf[`off-soft-vendor4`]
  
  @js.native
  sealed trait `off-soft-vendor5` extends PowerState
  @scala.inline
  def `off-soft-vendor5`: `off-soft-vendor5` = "off-soft-vendor5".asInstanceOf[`off-soft-vendor5`]
  
  @js.native
  sealed trait oid extends UriSchemes
  @scala.inline
  def oid: oid = "oid".asInstanceOf[oid]
  
  @js.native
  sealed trait om_16k_184x260mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_16k_184x260mm: om_16k_184x260mm = "om_16k_184x260mm".asInstanceOf[om_16k_184x260mm]
  
  @js.native
  sealed trait om_16k_195x270mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_16k_195x270mm: om_16k_195x270mm = "om_16k_195x270mm".asInstanceOf[om_16k_195x270mm]
  
  @js.native
  sealed trait `om_business-card_55x85mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_business-card_55x85mm`: `om_business-card_55x85mm` = "om_business-card_55x85mm".asInstanceOf[`om_business-card_55x85mm`]
  
  @js.native
  sealed trait `om_business-card_55x91mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_business-card_55x91mm`: `om_business-card_55x91mm` = "om_business-card_55x91mm".asInstanceOf[`om_business-card_55x91mm`]
  
  @js.native
  sealed trait om_card_54x86mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_card_54x86mm: om_card_54x86mm = "om_card_54x86mm".asInstanceOf[om_card_54x86mm]
  
  @js.native
  sealed trait `om_dai-pa-kai_275x395mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_dai-pa-kai_275x395mm`: `om_dai-pa-kai_275x395mm` = "om_dai-pa-kai_275x395mm".asInstanceOf[`om_dai-pa-kai_275x395mm`]
  
  @js.native
  sealed trait `om_dsc-photo_89x119mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_dsc-photo_89x119mm`: `om_dsc-photo_89x119mm` = "om_dsc-photo_89x119mm".asInstanceOf[`om_dsc-photo_89x119mm`]
  
  @js.native
  sealed trait `om_folio-sp_215x315mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_folio-sp_215x315mm`: `om_folio-sp_215x315mm` = "om_folio-sp_215x315mm".asInstanceOf[`om_folio-sp_215x315mm`]
  
  @js.native
  sealed trait om_folio_210x330mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_folio_210x330mm: om_folio_210x330mm = "om_folio_210x330mm".asInstanceOf[om_folio_210x330mm]
  
  @js.native
  sealed trait om_invite_220x220mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_invite_220x220mm: om_invite_220x220mm = "om_invite_220x220mm".asInstanceOf[om_invite_220x220mm]
  
  @js.native
  sealed trait om_italian_110x230mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_italian_110x230mm: om_italian_110x230mm = "om_italian_110x230mm".asInstanceOf[om_italian_110x230mm]
  
  @js.native
  sealed trait `om_juuro-ku-kai_198x275mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_juuro-ku-kai_198x275mm`: `om_juuro-ku-kai_198x275mm` = "om_juuro-ku-kai_198x275mm".asInstanceOf[`om_juuro-ku-kai_198x275mm`]
  
  @js.native
  sealed trait `om_large-photo_200x300`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_large-photo_200x300`: `om_large-photo_200x300` = "om_large-photo_200x300".asInstanceOf[`om_large-photo_200x300`]
  
  @js.native
  sealed trait `om_medium-photo_130x180mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_medium-photo_130x180mm`: `om_medium-photo_130x180mm` = "om_medium-photo_130x180mm".asInstanceOf[`om_medium-photo_130x180mm`]
  
  @js.native
  sealed trait `om_pa-kai_267x389mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_pa-kai_267x389mm`: `om_pa-kai_267x389mm` = "om_pa-kai_267x389mm".asInstanceOf[`om_pa-kai_267x389mm`]
  
  @js.native
  sealed trait om_postfix_114x229mm
    extends Media
       with MediaSizeName
  @scala.inline
  def om_postfix_114x229mm: om_postfix_114x229mm = "om_postfix_114x229mm".asInstanceOf[om_postfix_114x229mm]
  
  @js.native
  sealed trait `om_small-photo_100x150mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_small-photo_100x150mm`: `om_small-photo_100x150mm` = "om_small-photo_100x150mm".asInstanceOf[`om_small-photo_100x150mm`]
  
  @js.native
  sealed trait `om_square-photo_89x89mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_square-photo_89x89mm`: `om_square-photo_89x89mm` = "om_square-photo_89x89mm".asInstanceOf[`om_square-photo_89x89mm`]
  
  @js.native
  sealed trait `om_wide-photo_100x200mm`
    extends Media
       with MediaSizeName
  @scala.inline
  def `om_wide-photo_100x200mm`: `om_wide-photo_100x200mm` = "om_wide-photo_100x200mm".asInstanceOf[`om_wide-photo_100x200mm`]
  
  @js.native
  sealed trait on extends PowerState
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait `on-error` extends StObject
  @scala.inline
  def `on-error`: `on-error` = "on-error".asInstanceOf[`on-error`]
  
  @js.native
  sealed trait `on-vendor1` extends PowerState
  @scala.inline
  def `on-vendor1`: `on-vendor1` = "on-vendor1".asInstanceOf[`on-vendor1`]
  
  @js.native
  sealed trait `on-vendor2` extends PowerState
  @scala.inline
  def `on-vendor2`: `on-vendor2` = "on-vendor2".asInstanceOf[`on-vendor2`]
  
  @js.native
  sealed trait `on-vendor3` extends PowerState
  @scala.inline
  def `on-vendor3`: `on-vendor3` = "on-vendor3".asInstanceOf[`on-vendor3`]
  
  @js.native
  sealed trait `on-vendor4` extends PowerState
  @scala.inline
  def `on-vendor4`: `on-vendor4` = "on-vendor4".asInstanceOf[`on-vendor4`]
  
  @js.native
  sealed trait `on-vendor5` extends PowerState
  @scala.inline
  def `on-vendor5`: `on-vendor5` = "on-vendor5".asInstanceOf[`on-vendor5`]
  
  @js.native
  sealed trait onboard extends SystemTimeoutSource
  @scala.inline
  def onboard: onboard = "onboard".asInstanceOf[onboard]
  
  @js.native
  sealed trait `one-at-a-time` extends MultipleObjectHandling
  @scala.inline
  def `one-at-a-time`: `one-at-a-time` = "one-at-a-time".asInstanceOf[`one-at-a-time`]
  
  @js.native
  sealed trait `one-sided` extends Sides
  @scala.inline
  def `one-sided`: `one-sided` = "one-sided".asInstanceOf[`one-sided`]
  
  @js.native
  sealed trait onenote extends UriSchemes
  @scala.inline
  def onenote: onenote = "onenote".asInstanceOf[onenote]
  
  @js.native
  sealed trait `onenote-cmd` extends UriSchemes
  @scala.inline
  def `onenote-cmd`: `onenote-cmd` = "onenote-cmd".asInstanceOf[`onenote-cmd`]
  
  @js.native
  sealed trait opaquelocktoken extends UriSchemes
  @scala.inline
  def opaquelocktoken: opaquelocktoken = "opaquelocktoken".asInstanceOf[opaquelocktoken]
  
  @js.native
  sealed trait `opc-life-over` extends PrinterStateReasons
  @scala.inline
  def `opc-life-over`: `opc-life-over` = "opc-life-over".asInstanceOf[`opc-life-over`]
  
  @js.native
  sealed trait `opc-near-eol` extends PrinterStateReasons
  @scala.inline
  def `opc-near-eol`: `opc-near-eol` = "opc-near-eol".asInstanceOf[`opc-near-eol`]
  
  @js.native
  sealed trait openpgp4fpr extends UriSchemes
  @scala.inline
  def openpgp4fpr: openpgp4fpr = "openpgp4fpr".asInstanceOf[openpgp4fpr]
  
  @js.native
  sealed trait `operations-supported` extends StObject
  @scala.inline
  def `operations-supported`: `operations-supported` = "operations-supported".asInstanceOf[`operations-supported`]
  
  @js.native
  sealed trait orange extends MediaColor
  @scala.inline
  def orange: orange = "orange".asInstanceOf[orange]
  
  @js.native
  sealed trait `organization-name-supported` extends StObject
  @scala.inline
  def `organization-name-supported`: `organization-name-supported` = "organization-name-supported".asInstanceOf[`organization-name-supported`]
  
  @js.native
  sealed trait `orientation-requested` extends Overrides
  @scala.inline
  def `orientation-requested`: `orientation-requested` = "orientation-requested".asInstanceOf[`orientation-requested`]
  
  @js.native
  sealed trait `orientation-requested-actual` extends StObject
  @scala.inline
  def `orientation-requested-actual`: `orientation-requested-actual` = "orientation-requested-actual".asInstanceOf[`orientation-requested-actual`]
  
  @js.native
  sealed trait `orientation-requested-default` extends StObject
  @scala.inline
  def `orientation-requested-default`: `orientation-requested-default` = "orientation-requested-default".asInstanceOf[`orientation-requested-default`]
  
  @js.native
  sealed trait `orientation-requested-supported` extends StObject
  @scala.inline
  def `orientation-requested-supported`: `orientation-requested-supported` = "orientation-requested-supported".asInstanceOf[`orientation-requested-supported`]
  
  @js.native
  sealed trait `original-requesting-user-name` extends StObject
  @scala.inline
  def `original-requesting-user-name`: `original-requesting-user-name` = "original-requesting-user-name".asInstanceOf[`original-requesting-user-name`]
  
  @js.native
  sealed trait other
    extends MediaType
       with PrinterStateReasons
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait outgoing extends DocumentStateReasons
  @scala.inline
  def outgoing: outgoing = "outgoing".asInstanceOf[outgoing]
  
  @js.native
  sealed trait `output-area-almost-full` extends PrinterStateReasons
  @scala.inline
  def `output-area-almost-full`: `output-area-almost-full` = "output-area-almost-full".asInstanceOf[`output-area-almost-full`]
  
  @js.native
  sealed trait `output-area-full` extends PrinterStateReasons
  @scala.inline
  def `output-area-full`: `output-area-full` = "output-area-full".asInstanceOf[`output-area-full`]
  
  @js.native
  sealed trait `output-attributes-actual` extends StObject
  @scala.inline
  def `output-attributes-actual`: `output-attributes-actual` = "output-attributes-actual".asInstanceOf[`output-attributes-actual`]
  
  @js.native
  sealed trait `output-attributes-default` extends StObject
  @scala.inline
  def `output-attributes-default`: `output-attributes-default` = "output-attributes-default".asInstanceOf[`output-attributes-default`]
  
  @js.native
  sealed trait `output-attributes-supported` extends StObject
  @scala.inline
  def `output-attributes-supported`: `output-attributes-supported` = "output-attributes-supported".asInstanceOf[`output-attributes-supported`]
  
  @js.native
  sealed trait `output-bin` extends Overrides
  @scala.inline
  def `output-bin`: `output-bin` = "output-bin".asInstanceOf[`output-bin`]
  
  @js.native
  sealed trait `output-bin-actual` extends StObject
  @scala.inline
  def `output-bin-actual`: `output-bin-actual` = "output-bin-actual".asInstanceOf[`output-bin-actual`]
  
  @js.native
  sealed trait `output-bin-default` extends StObject
  @scala.inline
  def `output-bin-default`: `output-bin-default` = "output-bin-default".asInstanceOf[`output-bin-default`]
  
  @js.native
  sealed trait `output-bin-supported` extends StObject
  @scala.inline
  def `output-bin-supported`: `output-bin-supported` = "output-bin-supported".asInstanceOf[`output-bin-supported`]
  
  @js.native
  sealed trait `output-device` extends Overrides
  @scala.inline
  def `output-device`: `output-device` = "output-device".asInstanceOf[`output-device`]
  
  @js.native
  sealed trait `output-device-actual` extends StObject
  @scala.inline
  def `output-device-actual`: `output-device-actual` = "output-device-actual".asInstanceOf[`output-device-actual`]
  
  @js.native
  sealed trait `output-device-assigned` extends StObject
  @scala.inline
  def `output-device-assigned`: `output-device-assigned` = "output-device-assigned".asInstanceOf[`output-device-assigned`]
  
  @js.native
  sealed trait `output-device-job-state` extends StObject
  @scala.inline
  def `output-device-job-state`: `output-device-job-state` = "output-device-job-state".asInstanceOf[`output-device-job-state`]
  
  @js.native
  sealed trait `output-device-job-state-message` extends StObject
  @scala.inline
  def `output-device-job-state-message`: `output-device-job-state-message` = "output-device-job-state-message".asInstanceOf[`output-device-job-state-message`]
  
  @js.native
  sealed trait `output-device-job-state-reasons` extends StObject
  @scala.inline
  def `output-device-job-state-reasons`: `output-device-job-state-reasons` = "output-device-job-state-reasons".asInstanceOf[`output-device-job-state-reasons`]
  
  @js.native
  sealed trait `output-device-supported` extends StObject
  @scala.inline
  def `output-device-supported`: `output-device-supported` = "output-device-supported".asInstanceOf[`output-device-supported`]
  
  @js.native
  sealed trait `output-device-uuid-assigned` extends StObject
  @scala.inline
  def `output-device-uuid-assigned`: `output-device-uuid-assigned` = "output-device-uuid-assigned".asInstanceOf[`output-device-uuid-assigned`]
  
  @js.native
  sealed trait `output-device-uuid-supported` extends StObject
  @scala.inline
  def `output-device-uuid-supported`: `output-device-uuid-supported` = "output-device-uuid-supported".asInstanceOf[`output-device-uuid-supported`]
  
  @js.native
  sealed trait `output-mailbox-select-failure` extends PrinterStateReasons
  @scala.inline
  def `output-mailbox-select-failure`: `output-mailbox-select-failure` = "output-mailbox-select-failure".asInstanceOf[`output-mailbox-select-failure`]
  
  @js.native
  sealed trait `output-tray-missing` extends PrinterStateReasons
  @scala.inline
  def `output-tray-missing`: `output-tray-missing` = "output-tray-missing".asInstanceOf[`output-tray-missing`]
  
  @js.native
  sealed trait outward extends FoldingDirection
  @scala.inline
  def outward: outward = "outward".asInstanceOf[outward]
  
  @js.native
  sealed trait overrides extends Overrides
  @scala.inline
  def overrides: overrides = "overrides".asInstanceOf[overrides]
  
  @js.native
  sealed trait `overrides-actual` extends StObject
  @scala.inline
  def `overrides-actual`: `overrides-actual` = "overrides-actual".asInstanceOf[`overrides-actual`]
  
  @js.native
  sealed trait `overrides-supported` extends StObject
  @scala.inline
  def `overrides-supported`: `overrides-supported` = "overrides-supported".asInstanceOf[`overrides-supported`]
  
  @js.native
  sealed trait owner extends StObject
  @scala.inline
  def owner: owner = "owner".asInstanceOf[owner]
  
  @js.native
  sealed trait pack extends UriSchemes
  @scala.inline
  def pack: pack = "pack".asInstanceOf[pack]
  
  @js.native
  sealed trait padding extends BindingType
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait `page-delivery` extends Overrides
  @scala.inline
  def `page-delivery`: `page-delivery` = "page-delivery".asInstanceOf[`page-delivery`]
  
  @js.native
  sealed trait `page-delivery-actual` extends StObject
  @scala.inline
  def `page-delivery-actual`: `page-delivery-actual` = "page-delivery-actual".asInstanceOf[`page-delivery-actual`]
  
  @js.native
  sealed trait `page-delivery-default` extends StObject
  @scala.inline
  def `page-delivery-default`: `page-delivery-default` = "page-delivery-default".asInstanceOf[`page-delivery-default`]
  
  @js.native
  sealed trait `page-delivery-supported` extends StObject
  @scala.inline
  def `page-delivery-supported`: `page-delivery-supported` = "page-delivery-supported".asInstanceOf[`page-delivery-supported`]
  
  @js.native
  sealed trait `page-order-received` extends Overrides
  @scala.inline
  def `page-order-received`: `page-order-received` = "page-order-received".asInstanceOf[`page-order-received`]
  
  @js.native
  sealed trait `page-order-received-actual` extends StObject
  @scala.inline
  def `page-order-received-actual`: `page-order-received-actual` = "page-order-received-actual".asInstanceOf[`page-order-received-actual`]
  
  @js.native
  sealed trait `page-order-received-default` extends StObject
  @scala.inline
  def `page-order-received-default`: `page-order-received-default` = "page-order-received-default".asInstanceOf[`page-order-received-default`]
  
  @js.native
  sealed trait `page-order-received-supported` extends StObject
  @scala.inline
  def `page-order-received-supported`: `page-order-received-supported` = "page-order-received-supported".asInstanceOf[`page-order-received-supported`]
  
  @js.native
  sealed trait `page-overrides` extends StObject
  @scala.inline
  def `page-overrides`: `page-overrides` = "page-overrides".asInstanceOf[`page-overrides`]
  
  @js.native
  sealed trait `page-ranges` extends Overrides
  @scala.inline
  def `page-ranges`: `page-ranges` = "page-ranges".asInstanceOf[`page-ranges`]
  
  @js.native
  sealed trait `page-ranges-actual` extends StObject
  @scala.inline
  def `page-ranges-actual`: `page-ranges-actual` = "page-ranges-actual".asInstanceOf[`page-ranges-actual`]
  
  @js.native
  sealed trait `page-ranges-supported` extends StObject
  @scala.inline
  def `page-ranges-supported`: `page-ranges-supported` = "page-ranges-supported".asInstanceOf[`page-ranges-supported`]
  
  @js.native
  sealed trait pages extends Overrides
  @scala.inline
  def pages: pages = "pages".asInstanceOf[pages]
  
  @js.native
  sealed trait `pages-per-subset` extends Overrides
  @scala.inline
  def `pages-per-subset`: `pages-per-subset` = "pages-per-subset".asInstanceOf[`pages-per-subset`]
  
  @js.native
  sealed trait `pages-per-subset-supported` extends StObject
  @scala.inline
  def `pages-per-subset-supported`: `pages-per-subset-supported` = "pages-per-subset-supported".asInstanceOf[`pages-per-subset-supported`]
  
  @js.native
  sealed trait palm extends UriSchemes
  @scala.inline
  def palm: palm = "palm".asInstanceOf[palm]
  
  @js.native
  sealed trait paparazzi extends UriSchemes
  @scala.inline
  def paparazzi: paparazzi = "paparazzi".asInstanceOf[paparazzi]
  
  @js.native
  sealed trait paper extends MediaType
  @scala.inline
  def paper: paper = "paper".asInstanceOf[paper]
  
  @js.native
  sealed trait `parent-printers-supported` extends StObject
  @scala.inline
  def `parent-printers-supported`: `parent-printers-supported` = "parent-printers-supported".asInstanceOf[`parent-printers-supported`]
  
  @js.native
  sealed trait partial extends TrimmingType
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait paused extends PrinterStateReasons
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait payment extends UriSchemes
  @scala.inline
  def payment: payment = "payment".asInstanceOf[payment]
  
  @js.native
  sealed trait payto extends UriSchemes
  @scala.inline
  def payto: payto = "payto".asInstanceOf[payto]
  
  @js.native
  sealed trait `pclm-raster-back-side` extends StObject
  @scala.inline
  def `pclm-raster-back-side`: `pclm-raster-back-side` = "pclm-raster-back-side".asInstanceOf[`pclm-raster-back-side`]
  
  @js.native
  sealed trait `pclm-source-resolution` extends Overrides
  @scala.inline
  def `pclm-source-resolution`: `pclm-source-resolution` = "pclm-source-resolution".asInstanceOf[`pclm-source-resolution`]
  
  @js.native
  sealed trait `pclm-source-resolution-supported` extends StObject
  @scala.inline
  def `pclm-source-resolution-supported`: `pclm-source-resolution-supported` = "pclm-source-resolution-supported".asInstanceOf[`pclm-source-resolution-supported`]
  
  @js.native
  sealed trait `pclm-strip-height-preferred` extends StObject
  @scala.inline
  def `pclm-strip-height-preferred`: `pclm-strip-height-preferred` = "pclm-strip-height-preferred".asInstanceOf[`pclm-strip-height-preferred`]
  
  @js.native
  sealed trait `pclm-strip-height-supported` extends StObject
  @scala.inline
  def `pclm-strip-height-supported`: `pclm-strip-height-supported` = "pclm-strip-height-supported".asInstanceOf[`pclm-strip-height-supported`]
  
  @js.native
  sealed trait `pdf-features-supported` extends StObject
  @scala.inline
  def `pdf-features-supported`: `pdf-features-supported` = "pdf-features-supported".asInstanceOf[`pdf-features-supported`]
  
  @js.native
  sealed trait `pdf-k-octets-supported` extends StObject
  @scala.inline
  def `pdf-k-octets-supported`: `pdf-k-octets-supported` = "pdf-k-octets-supported".asInstanceOf[`pdf-k-octets-supported`]
  
  @js.native
  sealed trait `pdf-versions-supported` extends StObject
  @scala.inline
  def `pdf-versions-supported`: `pdf-versions-supported` = "pdf-versions-supported".asInstanceOf[`pdf-versions-supported`]
  
  @js.native
  sealed trait `pdl-init-file` extends Overrides
  @scala.inline
  def `pdl-init-file`: `pdl-init-file` = "pdl-init-file".asInstanceOf[`pdl-init-file`]
  
  @js.native
  sealed trait `pdl-init-file-default` extends StObject
  @scala.inline
  def `pdl-init-file-default`: `pdl-init-file-default` = "pdl-init-file-default".asInstanceOf[`pdl-init-file-default`]
  
  @js.native
  sealed trait `pdl-init-file-entry` extends StObject
  @scala.inline
  def `pdl-init-file-entry`: `pdl-init-file-entry` = "pdl-init-file-entry".asInstanceOf[`pdl-init-file-entry`]
  
  @js.native
  sealed trait `pdl-init-file-entry-supported` extends StObject
  @scala.inline
  def `pdl-init-file-entry-supported`: `pdl-init-file-entry-supported` = "pdl-init-file-entry-supported".asInstanceOf[`pdl-init-file-entry-supported`]
  
  @js.native
  sealed trait `pdl-init-file-location` extends StObject
  @scala.inline
  def `pdl-init-file-location`: `pdl-init-file-location` = "pdl-init-file-location".asInstanceOf[`pdl-init-file-location`]
  
  @js.native
  sealed trait `pdl-init-file-location-supported` extends StObject
  @scala.inline
  def `pdl-init-file-location-supported`: `pdl-init-file-location-supported` = "pdl-init-file-location-supported".asInstanceOf[`pdl-init-file-location-supported`]
  
  @js.native
  sealed trait `pdl-init-file-name` extends StObject
  @scala.inline
  def `pdl-init-file-name`: `pdl-init-file-name` = "pdl-init-file-name".asInstanceOf[`pdl-init-file-name`]
  
  @js.native
  sealed trait `pdl-init-file-name-subdirectory-supported` extends StObject
  @scala.inline
  def `pdl-init-file-name-subdirectory-supported`: `pdl-init-file-name-subdirectory-supported` = "pdl-init-file-name-subdirectory-supported".asInstanceOf[`pdl-init-file-name-subdirectory-supported`]
  
  @js.native
  sealed trait `pdl-init-file-name-supported` extends StObject
  @scala.inline
  def `pdl-init-file-name-supported`: `pdl-init-file-name-supported` = "pdl-init-file-name-supported".asInstanceOf[`pdl-init-file-name-supported`]
  
  @js.native
  sealed trait `pdl-init-file-supported` extends StObject
  @scala.inline
  def `pdl-init-file-supported`: `pdl-init-file-supported` = "pdl-init-file-supported".asInstanceOf[`pdl-init-file-supported`]
  
  @js.native
  sealed trait `pdl-override-guaranteed-supported` extends StObject
  @scala.inline
  def `pdl-override-guaranteed-supported`: `pdl-override-guaranteed-supported` = "pdl-override-guaranteed-supported".asInstanceOf[`pdl-override-guaranteed-supported`]
  
  @js.native
  sealed trait `pdl-override-supported` extends StObject
  @scala.inline
  def `pdl-override-supported`: `pdl-override-supported` = "pdl-override-supported".asInstanceOf[`pdl-override-supported`]
  
  @js.native
  sealed trait pending
    extends DocumentState
       with JobState
       with ResourceState
       with TransmissionStatus
       with WhichJobs
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait `pending-held`
    extends JobState
       with WhichJobs
  @scala.inline
  def `pending-held`: `pending-held` = "pending-held".asInstanceOf[`pending-held`]
  
  @js.native
  sealed trait `pending-retry` extends TransmissionStatus
  @scala.inline
  def `pending-retry`: `pending-retry` = "pending-retry".asInstanceOf[`pending-retry`]
  
  @js.native
  sealed trait perceptual extends PrintRenderingIntent
  @scala.inline
  def perceptual: perceptual = "perceptual".asInstanceOf[perceptual]
  
  @js.native
  sealed trait perfect extends BindingType
  @scala.inline
  def perfect: perfect = "perfect".asInstanceOf[perfect]
  
  @js.native
  sealed trait perforate extends TrimmingType
  @scala.inline
  def perforate: perforate = "perforate".asInstanceOf[perforate]
  
  @js.native
  sealed trait `perforater-added` extends PrinterStateReasons
  @scala.inline
  def `perforater-added`: `perforater-added` = "perforater-added".asInstanceOf[`perforater-added`]
  
  @js.native
  sealed trait `perforater-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `perforater-almost-empty`: `perforater-almost-empty` = "perforater-almost-empty".asInstanceOf[`perforater-almost-empty`]
  
  @js.native
  sealed trait `perforater-almost-full` extends PrinterStateReasons
  @scala.inline
  def `perforater-almost-full`: `perforater-almost-full` = "perforater-almost-full".asInstanceOf[`perforater-almost-full`]
  
  @js.native
  sealed trait `perforater-at-limit` extends PrinterStateReasons
  @scala.inline
  def `perforater-at-limit`: `perforater-at-limit` = "perforater-at-limit".asInstanceOf[`perforater-at-limit`]
  
  @js.native
  sealed trait `perforater-closed` extends PrinterStateReasons
  @scala.inline
  def `perforater-closed`: `perforater-closed` = "perforater-closed".asInstanceOf[`perforater-closed`]
  
  @js.native
  sealed trait `perforater-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `perforater-configuration-change`: `perforater-configuration-change` = "perforater-configuration-change".asInstanceOf[`perforater-configuration-change`]
  
  @js.native
  sealed trait `perforater-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `perforater-cover-closed`: `perforater-cover-closed` = "perforater-cover-closed".asInstanceOf[`perforater-cover-closed`]
  
  @js.native
  sealed trait `perforater-cover-open` extends PrinterStateReasons
  @scala.inline
  def `perforater-cover-open`: `perforater-cover-open` = "perforater-cover-open".asInstanceOf[`perforater-cover-open`]
  
  @js.native
  sealed trait `perforater-empty` extends PrinterStateReasons
  @scala.inline
  def `perforater-empty`: `perforater-empty` = "perforater-empty".asInstanceOf[`perforater-empty`]
  
  @js.native
  sealed trait `perforater-full` extends PrinterStateReasons
  @scala.inline
  def `perforater-full`: `perforater-full` = "perforater-full".asInstanceOf[`perforater-full`]
  
  @js.native
  sealed trait `perforater-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `perforater-interlock-closed`: `perforater-interlock-closed` = "perforater-interlock-closed".asInstanceOf[`perforater-interlock-closed`]
  
  @js.native
  sealed trait `perforater-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `perforater-interlock-open`: `perforater-interlock-open` = "perforater-interlock-open".asInstanceOf[`perforater-interlock-open`]
  
  @js.native
  sealed trait `perforater-jam` extends PrinterStateReasons
  @scala.inline
  def `perforater-jam`: `perforater-jam` = "perforater-jam".asInstanceOf[`perforater-jam`]
  
  @js.native
  sealed trait `perforater-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `perforater-life-almost-over`: `perforater-life-almost-over` = "perforater-life-almost-over".asInstanceOf[`perforater-life-almost-over`]
  
  @js.native
  sealed trait `perforater-life-over` extends PrinterStateReasons
  @scala.inline
  def `perforater-life-over`: `perforater-life-over` = "perforater-life-over".asInstanceOf[`perforater-life-over`]
  
  @js.native
  sealed trait `perforater-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `perforater-memory-exhausted`: `perforater-memory-exhausted` = "perforater-memory-exhausted".asInstanceOf[`perforater-memory-exhausted`]
  
  @js.native
  sealed trait `perforater-missing` extends PrinterStateReasons
  @scala.inline
  def `perforater-missing`: `perforater-missing` = "perforater-missing".asInstanceOf[`perforater-missing`]
  
  @js.native
  sealed trait `perforater-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `perforater-motor-failure`: `perforater-motor-failure` = "perforater-motor-failure".asInstanceOf[`perforater-motor-failure`]
  
  @js.native
  sealed trait `perforater-near-limit` extends PrinterStateReasons
  @scala.inline
  def `perforater-near-limit`: `perforater-near-limit` = "perforater-near-limit".asInstanceOf[`perforater-near-limit`]
  
  @js.native
  sealed trait `perforater-offline` extends PrinterStateReasons
  @scala.inline
  def `perforater-offline`: `perforater-offline` = "perforater-offline".asInstanceOf[`perforater-offline`]
  
  @js.native
  sealed trait `perforater-opened` extends PrinterStateReasons
  @scala.inline
  def `perforater-opened`: `perforater-opened` = "perforater-opened".asInstanceOf[`perforater-opened`]
  
  @js.native
  sealed trait `perforater-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `perforater-over-temperature`: `perforater-over-temperature` = "perforater-over-temperature".asInstanceOf[`perforater-over-temperature`]
  
  @js.native
  sealed trait `perforater-power-saver` extends PrinterStateReasons
  @scala.inline
  def `perforater-power-saver`: `perforater-power-saver` = "perforater-power-saver".asInstanceOf[`perforater-power-saver`]
  
  @js.native
  sealed trait `perforater-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `perforater-recoverable-failure`: `perforater-recoverable-failure` = "perforater-recoverable-failure".asInstanceOf[`perforater-recoverable-failure`]
  
  @js.native
  sealed trait `perforater-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `perforater-recoverable-storage-error`: `perforater-recoverable-storage-error` = "perforater-recoverable-storage-error".asInstanceOf[`perforater-recoverable-storage-error`]
  
  @js.native
  sealed trait `perforater-removed` extends PrinterStateReasons
  @scala.inline
  def `perforater-removed`: `perforater-removed` = "perforater-removed".asInstanceOf[`perforater-removed`]
  
  @js.native
  sealed trait `perforater-resource-added` extends PrinterStateReasons
  @scala.inline
  def `perforater-resource-added`: `perforater-resource-added` = "perforater-resource-added".asInstanceOf[`perforater-resource-added`]
  
  @js.native
  sealed trait `perforater-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `perforater-resource-removed`: `perforater-resource-removed` = "perforater-resource-removed".asInstanceOf[`perforater-resource-removed`]
  
  @js.native
  sealed trait `perforater-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `perforater-thermistor-failure`: `perforater-thermistor-failure` = "perforater-thermistor-failure".asInstanceOf[`perforater-thermistor-failure`]
  
  @js.native
  sealed trait `perforater-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `perforater-timing-failure`: `perforater-timing-failure` = "perforater-timing-failure".asInstanceOf[`perforater-timing-failure`]
  
  @js.native
  sealed trait `perforater-turned-off` extends PrinterStateReasons
  @scala.inline
  def `perforater-turned-off`: `perforater-turned-off` = "perforater-turned-off".asInstanceOf[`perforater-turned-off`]
  
  @js.native
  sealed trait `perforater-turned-on` extends PrinterStateReasons
  @scala.inline
  def `perforater-turned-on`: `perforater-turned-on` = "perforater-turned-on".asInstanceOf[`perforater-turned-on`]
  
  @js.native
  sealed trait `perforater-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `perforater-under-temperature`: `perforater-under-temperature` = "perforater-under-temperature".asInstanceOf[`perforater-under-temperature`]
  
  @js.native
  sealed trait `perforater-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `perforater-unrecoverable-failure`: `perforater-unrecoverable-failure` = "perforater-unrecoverable-failure".asInstanceOf[`perforater-unrecoverable-failure`]
  
  @js.native
  sealed trait `perforater-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `perforater-unrecoverable-storage-error`: `perforater-unrecoverable-storage-error` = "perforater-unrecoverable-storage-error".asInstanceOf[`perforater-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `perforater-warming-up` extends PrinterStateReasons
  @scala.inline
  def `perforater-warming-up`: `perforater-warming-up` = "perforater-warming-up".asInstanceOf[`perforater-warming-up`]
  
  @js.native
  sealed trait pet extends MaterialType
  @scala.inline
  def pet: pet = "pet".asInstanceOf[pet]
  
  @js.native
  sealed trait pgp extends DocumentDigitalSignature
  @scala.inline
  def pgp: pgp = "pgp".asInstanceOf[pgp]
  
  @js.native
  sealed trait photo
    extends InputContentType
       with MediaSource
       with PrintContentOptimize
       with PrinterKind
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  
  @js.native
  sealed trait photographic extends MediaType
  @scala.inline
  def photographic: photographic = "photographic".asInstanceOf[photographic]
  
  @js.native
  sealed trait `photographic-archival` extends MediaType
  @scala.inline
  def `photographic-archival`: `photographic-archival` = "photographic-archival".asInstanceOf[`photographic-archival`]
  
  @js.native
  sealed trait `photographic-film` extends MediaType
  @scala.inline
  def `photographic-film`: `photographic-film` = "photographic-film".asInstanceOf[`photographic-film`]
  
  @js.native
  sealed trait `photographic-glossy` extends MediaType
  @scala.inline
  def `photographic-glossy`: `photographic-glossy` = "photographic-glossy".asInstanceOf[`photographic-glossy`]
  
  @js.native
  sealed trait `photographic-high-gloss` extends MediaType
  @scala.inline
  def `photographic-high-gloss`: `photographic-high-gloss` = "photographic-high-gloss".asInstanceOf[`photographic-high-gloss`]
  
  @js.native
  sealed trait `photographic-matte` extends MediaType
  @scala.inline
  def `photographic-matte`: `photographic-matte` = "photographic-matte".asInstanceOf[`photographic-matte`]
  
  @js.native
  sealed trait `photographic-satin` extends MediaType
  @scala.inline
  def `photographic-satin`: `photographic-satin` = "photographic-satin".asInstanceOf[`photographic-satin`]
  
  @js.native
  sealed trait `photographic-semi-gloss` extends MediaType
  @scala.inline
  def `photographic-semi-gloss`: `photographic-semi-gloss` = "photographic-semi-gloss".asInstanceOf[`photographic-semi-gloss`]
  
  @js.native
  sealed trait photopolymer extends MaterialType
  @scala.inline
  def photopolymer: photopolymer = "photopolymer".asInstanceOf[photopolymer]
  
  @js.native
  sealed trait pink extends MediaColor
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  
  @js.native
  sealed trait pkcs11 extends UriSchemes
  @scala.inline
  def pkcs11: pkcs11 = "pkcs11".asInstanceOf[pkcs11]
  
  @js.native
  sealed trait pla extends MaterialType
  @scala.inline
  def pla: pla = "pla".asInstanceOf[pla]
  
  @js.native
  sealed trait `pla-conductive` extends MaterialType
  @scala.inline
  def `pla-conductive`: `pla-conductive` = "pla-conductive".asInstanceOf[`pla-conductive`]
  
  @js.native
  sealed trait `pla-dissolvable` extends MaterialType
  @scala.inline
  def `pla-dissolvable`: `pla-dissolvable` = "pla-dissolvable".asInstanceOf[`pla-dissolvable`]
  
  @js.native
  sealed trait `pla-flexible` extends MaterialType
  @scala.inline
  def `pla-flexible`: `pla-flexible` = "pla-flexible".asInstanceOf[`pla-flexible`]
  
  @js.native
  sealed trait `pla-magnetic` extends MaterialType
  @scala.inline
  def `pla-magnetic`: `pla-magnetic` = "pla-magnetic".asInstanceOf[`pla-magnetic`]
  
  @js.native
  sealed trait `pla-steel` extends MaterialType
  @scala.inline
  def `pla-steel`: `pla-steel` = "pla-steel".asInstanceOf[`pla-steel`]
  
  @js.native
  sealed trait `pla-stone` extends MaterialType
  @scala.inline
  def `pla-stone`: `pla-stone` = "pla-stone".asInstanceOf[`pla-stone`]
  
  @js.native
  sealed trait `pla-wood` extends MaterialType
  @scala.inline
  def `pla-wood`: `pla-wood` = "pla-wood".asInstanceOf[`pla-wood`]
  
  @js.native
  sealed trait plastic extends MediaType
  @scala.inline
  def plastic: plastic = "plastic".asInstanceOf[plastic]
  
  @js.native
  sealed trait `plastic-archival` extends MediaType
  @scala.inline
  def `plastic-archival`: `plastic-archival` = "plastic-archival".asInstanceOf[`plastic-archival`]
  
  @js.native
  sealed trait `plastic-colored` extends MediaType
  @scala.inline
  def `plastic-colored`: `plastic-colored` = "plastic-colored".asInstanceOf[`plastic-colored`]
  
  @js.native
  sealed trait `plastic-glossy` extends MediaType
  @scala.inline
  def `plastic-glossy`: `plastic-glossy` = "plastic-glossy".asInstanceOf[`plastic-glossy`]
  
  @js.native
  sealed trait `plastic-high-gloss` extends MediaType
  @scala.inline
  def `plastic-high-gloss`: `plastic-high-gloss` = "plastic-high-gloss".asInstanceOf[`plastic-high-gloss`]
  
  @js.native
  sealed trait `plastic-matte` extends MediaType
  @scala.inline
  def `plastic-matte`: `plastic-matte` = "plastic-matte".asInstanceOf[`plastic-matte`]
  
  @js.native
  sealed trait `plastic-satin` extends MediaType
  @scala.inline
  def `plastic-satin`: `plastic-satin` = "plastic-satin".asInstanceOf[`plastic-satin`]
  
  @js.native
  sealed trait `plastic-semi-gloss` extends MediaType
  @scala.inline
  def `plastic-semi-gloss`: `plastic-semi-gloss` = "plastic-semi-gloss".asInstanceOf[`plastic-semi-gloss`]
  
  @js.native
  sealed trait plate extends MediaType
  @scala.inline
  def plate: plate = "plate".asInstanceOf[plate]
  
  @js.native
  sealed trait platen extends InputSource
  @scala.inline
  def platen: platen = "platen".asInstanceOf[platen]
  
  @js.native
  sealed trait platform extends UriSchemes
  @scala.inline
  def platform: platform = "platform".asInstanceOf[platform]
  
  @js.native
  sealed trait `platform-shape` extends StObject
  @scala.inline
  def `platform-shape`: `platform-shape` = "platform-shape".asInstanceOf[`platform-shape`]
  
  @js.native
  sealed trait `platform-temperature` extends Overrides
  @scala.inline
  def `platform-temperature`: `platform-temperature` = "platform-temperature".asInstanceOf[`platform-temperature`]
  
  @js.native
  sealed trait `platform-temperature-actual` extends StObject
  @scala.inline
  def `platform-temperature-actual`: `platform-temperature-actual` = "platform-temperature-actual".asInstanceOf[`platform-temperature-actual`]
  
  @js.native
  sealed trait `platform-temperature-default` extends StObject
  @scala.inline
  def `platform-temperature-default`: `platform-temperature-default` = "platform-temperature-default".asInstanceOf[`platform-temperature-default`]
  
  @js.native
  sealed trait `platform-temperature-supported` extends StObject
  @scala.inline
  def `platform-temperature-supported`: `platform-temperature-supported` = "platform-temperature-supported".asInstanceOf[`platform-temperature-supported`]
  
  @js.native
  sealed trait polycarbonate extends MaterialType
  @scala.inline
  def polycarbonate: polycarbonate = "polycarbonate".asInstanceOf[polycarbonate]
  
  @js.native
  sealed trait polyester extends MediaType
  @scala.inline
  def polyester: polyester = "polyester".asInstanceOf[polyester]
  
  @js.native
  sealed trait pop extends UriSchemes
  @scala.inline
  def pop: pop = "pop".asInstanceOf[pop]
  
  @js.native
  sealed trait portrait extends OrientationRequested
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait postcard extends PrinterKind
  @scala.inline
  def postcard: postcard = "postcard".asInstanceOf[postcard]
  
  @js.native
  sealed trait `power-down` extends PrinterStateReasons
  @scala.inline
  def `power-down`: `power-down` = "power-down".asInstanceOf[`power-down`]
  
  @js.native
  sealed trait `power-up` extends PrinterStateReasons
  @scala.inline
  def `power-up`: `power-up` = "power-up".asInstanceOf[`power-up`]
  
  @js.native
  sealed trait prc extends StObject
  @scala.inline
  def prc: prc = "prc".asInstanceOf[prc]
  
  @js.native
  sealed trait prc_10_324x458mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_10_324x458mm: prc_10_324x458mm = "prc_10_324x458mm".asInstanceOf[prc_10_324x458mm]
  
  @js.native
  sealed trait prc_16k_146x215mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_16k_146x215mm: prc_16k_146x215mm = "prc_16k_146x215mm".asInstanceOf[prc_16k_146x215mm]
  
  @js.native
  sealed trait prc_1_102x165mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_1_102x165mm: prc_1_102x165mm = "prc_1_102x165mm".asInstanceOf[prc_1_102x165mm]
  
  @js.native
  sealed trait prc_2_102x176mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_2_102x176mm: prc_2_102x176mm = "prc_2_102x176mm".asInstanceOf[prc_2_102x176mm]
  
  @js.native
  sealed trait prc_32k_97x151mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_32k_97x151mm: prc_32k_97x151mm = "prc_32k_97x151mm".asInstanceOf[prc_32k_97x151mm]
  
  @js.native
  sealed trait prc_3_125x176mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_3_125x176mm: prc_3_125x176mm = "prc_3_125x176mm".asInstanceOf[prc_3_125x176mm]
  
  @js.native
  sealed trait prc_4_110x208mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_4_110x208mm: prc_4_110x208mm = "prc_4_110x208mm".asInstanceOf[prc_4_110x208mm]
  
  @js.native
  sealed trait prc_5_110x220mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_5_110x220mm: prc_5_110x220mm = "prc_5_110x220mm".asInstanceOf[prc_5_110x220mm]
  
  @js.native
  sealed trait prc_6_120x320mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_6_120x320mm: prc_6_120x320mm = "prc_6_120x320mm".asInstanceOf[prc_6_120x320mm]
  
  @js.native
  sealed trait prc_7_160x230mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_7_160x230mm: prc_7_160x230mm = "prc_7_160x230mm".asInstanceOf[prc_7_160x230mm]
  
  @js.native
  sealed trait prc_8_120x309mm
    extends Media
       with MediaSizeName
  @scala.inline
  def prc_8_120x309mm: prc_8_120x309mm = "prc_8_120x309mm".asInstanceOf[prc_8_120x309mm]
  
  @js.native
  sealed trait `pre-cut-tabs` extends MediaType
  @scala.inline
  def `pre-cut-tabs`: `pre-cut-tabs` = "pre-cut-tabs".asInstanceOf[`pre-cut-tabs`]
  
  @js.native
  sealed trait `pre-printed` extends MediaPrePrinted
  @scala.inline
  def `pre-printed`: `pre-printed` = "pre-printed".asInstanceOf[`pre-printed`]
  
  @js.native
  sealed trait `preferred-attributes-supported` extends StObject
  @scala.inline
  def `preferred-attributes-supported`: `preferred-attributes-supported` = "preferred-attributes-supported".asInstanceOf[`preferred-attributes-supported`]
  
  @js.native
  sealed trait pres extends UriSchemes
  @scala.inline
  def pres: pres = "pres".asInstanceOf[pres]
  
  @js.native
  sealed trait `presentation-direction-number-up` extends Overrides
  @scala.inline
  def `presentation-direction-number-up`: `presentation-direction-number-up` = "presentation-direction-number-up".asInstanceOf[`presentation-direction-number-up`]
  
  @js.native
  sealed trait `presentation-direction-number-up-actual` extends StObject
  @scala.inline
  def `presentation-direction-number-up-actual`: `presentation-direction-number-up-actual` = "presentation-direction-number-up-actual".asInstanceOf[`presentation-direction-number-up-actual`]
  
  @js.native
  sealed trait `presentation-direction-number-up-default` extends StObject
  @scala.inline
  def `presentation-direction-number-up-default`: `presentation-direction-number-up-default` = "presentation-direction-number-up-default".asInstanceOf[`presentation-direction-number-up-default`]
  
  @js.native
  sealed trait `presentation-direction-number-up-supported` extends StObject
  @scala.inline
  def `presentation-direction-number-up-supported`: `presentation-direction-number-up-supported` = "presentation-direction-number-up-supported".asInstanceOf[`presentation-direction-number-up-supported`]
  
  @js.native
  sealed trait print extends PrinterServiceType
  @scala.inline
  def print: print = "print".asInstanceOf[print]
  
  @js.native
  sealed trait `print-accuracy` extends Overrides
  @scala.inline
  def `print-accuracy`: `print-accuracy` = "print-accuracy".asInstanceOf[`print-accuracy`]
  
  @js.native
  sealed trait `print-accuracy-actual` extends StObject
  @scala.inline
  def `print-accuracy-actual`: `print-accuracy-actual` = "print-accuracy-actual".asInstanceOf[`print-accuracy-actual`]
  
  @js.native
  sealed trait `print-accuracy-supported` extends StObject
  @scala.inline
  def `print-accuracy-supported`: `print-accuracy-supported` = "print-accuracy-supported".asInstanceOf[`print-accuracy-supported`]
  
  @js.native
  sealed trait `print-back` extends CoverType
  @scala.inline
  def `print-back`: `print-back` = "print-back".asInstanceOf[`print-back`]
  
  @js.native
  sealed trait `print-base` extends Overrides
  @scala.inline
  def `print-base`: `print-base` = "print-base".asInstanceOf[`print-base`]
  
  @js.native
  sealed trait `print-base-actual` extends StObject
  @scala.inline
  def `print-base-actual`: `print-base-actual` = "print-base-actual".asInstanceOf[`print-base-actual`]
  
  @js.native
  sealed trait `print-base-default` extends StObject
  @scala.inline
  def `print-base-default`: `print-base-default` = "print-base-default".asInstanceOf[`print-base-default`]
  
  @js.native
  sealed trait `print-base-supported` extends StObject
  @scala.inline
  def `print-base-supported`: `print-base-supported` = "print-base-supported".asInstanceOf[`print-base-supported`]
  
  @js.native
  sealed trait `print-both` extends CoverType
  @scala.inline
  def `print-both`: `print-both` = "print-both".asInstanceOf[`print-both`]
  
  @js.native
  sealed trait `print-color-mode` extends Overrides
  @scala.inline
  def `print-color-mode`: `print-color-mode` = "print-color-mode".asInstanceOf[`print-color-mode`]
  
  @js.native
  sealed trait `print-color-mode-actual` extends StObject
  @scala.inline
  def `print-color-mode-actual`: `print-color-mode-actual` = "print-color-mode-actual".asInstanceOf[`print-color-mode-actual`]
  
  @js.native
  sealed trait `print-color-mode-default` extends StObject
  @scala.inline
  def `print-color-mode-default`: `print-color-mode-default` = "print-color-mode-default".asInstanceOf[`print-color-mode-default`]
  
  @js.native
  sealed trait `print-color-mode-supported` extends StObject
  @scala.inline
  def `print-color-mode-supported`: `print-color-mode-supported` = "print-color-mode-supported".asInstanceOf[`print-color-mode-supported`]
  
  @js.native
  sealed trait `print-content-optimize` extends Overrides
  @scala.inline
  def `print-content-optimize`: `print-content-optimize` = "print-content-optimize".asInstanceOf[`print-content-optimize`]
  
  @js.native
  sealed trait `print-content-optimize-actual` extends StObject
  @scala.inline
  def `print-content-optimize-actual`: `print-content-optimize-actual` = "print-content-optimize-actual".asInstanceOf[`print-content-optimize-actual`]
  
  @js.native
  sealed trait `print-content-optimize-default` extends StObject
  @scala.inline
  def `print-content-optimize-default`: `print-content-optimize-default` = "print-content-optimize-default".asInstanceOf[`print-content-optimize-default`]
  
  @js.native
  sealed trait `print-content-optimize-supported` extends StObject
  @scala.inline
  def `print-content-optimize-supported`: `print-content-optimize-supported` = "print-content-optimize-supported".asInstanceOf[`print-content-optimize-supported`]
  
  @js.native
  sealed trait `print-front` extends CoverType
  @scala.inline
  def `print-front`: `print-front` = "print-front".asInstanceOf[`print-front`]
  
  @js.native
  sealed trait `print-none` extends CoverType
  @scala.inline
  def `print-none`: `print-none` = "print-none".asInstanceOf[`print-none`]
  
  @js.native
  sealed trait `print-objects` extends Overrides
  @scala.inline
  def `print-objects`: `print-objects` = "print-objects".asInstanceOf[`print-objects`]
  
  @js.native
  sealed trait `print-objects-actual` extends StObject
  @scala.inline
  def `print-objects-actual`: `print-objects-actual` = "print-objects-actual".asInstanceOf[`print-objects-actual`]
  
  @js.native
  sealed trait `print-objects-supported` extends StObject
  @scala.inline
  def `print-objects-supported`: `print-objects-supported` = "print-objects-supported".asInstanceOf[`print-objects-supported`]
  
  @js.native
  sealed trait `print-quality` extends Overrides
  @scala.inline
  def `print-quality`: `print-quality` = "print-quality".asInstanceOf[`print-quality`]
  
  @js.native
  sealed trait `print-quality-actual` extends StObject
  @scala.inline
  def `print-quality-actual`: `print-quality-actual` = "print-quality-actual".asInstanceOf[`print-quality-actual`]
  
  @js.native
  sealed trait `print-quality-default` extends StObject
  @scala.inline
  def `print-quality-default`: `print-quality-default` = "print-quality-default".asInstanceOf[`print-quality-default`]
  
  @js.native
  sealed trait `print-quality-supported` extends StObject
  @scala.inline
  def `print-quality-supported`: `print-quality-supported` = "print-quality-supported".asInstanceOf[`print-quality-supported`]
  
  @js.native
  sealed trait `print-rendering-intent` extends Overrides
  @scala.inline
  def `print-rendering-intent`: `print-rendering-intent` = "print-rendering-intent".asInstanceOf[`print-rendering-intent`]
  
  @js.native
  sealed trait `print-rendering-intent-actual` extends StObject
  @scala.inline
  def `print-rendering-intent-actual`: `print-rendering-intent-actual` = "print-rendering-intent-actual".asInstanceOf[`print-rendering-intent-actual`]
  
  @js.native
  sealed trait `print-rendering-intent-default` extends StObject
  @scala.inline
  def `print-rendering-intent-default`: `print-rendering-intent-default` = "print-rendering-intent-default".asInstanceOf[`print-rendering-intent-default`]
  
  @js.native
  sealed trait `print-rendering-intent-supported` extends StObject
  @scala.inline
  def `print-rendering-intent-supported`: `print-rendering-intent-supported` = "print-rendering-intent-supported".asInstanceOf[`print-rendering-intent-supported`]
  
  @js.native
  sealed trait `print-save` extends SaveDisposition
  @scala.inline
  def `print-save`: `print-save` = "print-save".asInstanceOf[`print-save`]
  
  @js.native
  sealed trait `print-scaling` extends Overrides
  @scala.inline
  def `print-scaling`: `print-scaling` = "print-scaling".asInstanceOf[`print-scaling`]
  
  @js.native
  sealed trait `print-scaling-default` extends StObject
  @scala.inline
  def `print-scaling-default`: `print-scaling-default` = "print-scaling-default".asInstanceOf[`print-scaling-default`]
  
  @js.native
  sealed trait `print-scaling-supported` extends StObject
  @scala.inline
  def `print-scaling-supported`: `print-scaling-supported` = "print-scaling-supported".asInstanceOf[`print-scaling-supported`]
  
  @js.native
  sealed trait `print-supports` extends Overrides
  @scala.inline
  def `print-supports`: `print-supports` = "print-supports".asInstanceOf[`print-supports`]
  
  @js.native
  sealed trait `print-supports-actual` extends StObject
  @scala.inline
  def `print-supports-actual`: `print-supports-actual` = "print-supports-actual".asInstanceOf[`print-supports-actual`]
  
  @js.native
  sealed trait `print-supports-default` extends StObject
  @scala.inline
  def `print-supports-default`: `print-supports-default` = "print-supports-default".asInstanceOf[`print-supports-default`]
  
  @js.native
  sealed trait `print-supports-supported` extends StObject
  @scala.inline
  def `print-supports-supported`: `print-supports-supported` = "print-supports-supported".asInstanceOf[`print-supports-supported`]
  
  @js.native
  sealed trait print3d extends PrinterServiceType
  @scala.inline
  def print3d: print3d = "print3d".asInstanceOf[print3d]
  
  @js.native
  sealed trait `printer-camera-image-uri` extends StObject
  @scala.inline
  def `printer-camera-image-uri`: `printer-camera-image-uri` = "printer-camera-image-uri".asInstanceOf[`printer-camera-image-uri`]
  
  @js.native
  sealed trait `printer-charge-info` extends StObject
  @scala.inline
  def `printer-charge-info`: `printer-charge-info` = "printer-charge-info".asInstanceOf[`printer-charge-info`]
  
  @js.native
  sealed trait `printer-charge-info-uri` extends StObject
  @scala.inline
  def `printer-charge-info-uri`: `printer-charge-info-uri` = "printer-charge-info-uri".asInstanceOf[`printer-charge-info-uri`]
  
  @js.native
  sealed trait `printer-config-changed` extends NotifyEvents
  @scala.inline
  def `printer-config-changed`: `printer-config-changed` = "printer-config-changed".asInstanceOf[`printer-config-changed`]
  
  @js.native
  sealed trait `printer-contact-col` extends StObject
  @scala.inline
  def `printer-contact-col`: `printer-contact-col` = "printer-contact-col".asInstanceOf[`printer-contact-col`]
  
  @js.native
  sealed trait `printer-current-time` extends StObject
  @scala.inline
  def `printer-current-time`: `printer-current-time` = "printer-current-time".asInstanceOf[`printer-current-time`]
  
  @js.native
  sealed trait `printer-description` extends RequestedPrinterAttributeGroups
  @scala.inline
  def `printer-description`: `printer-description` = "printer-description".asInstanceOf[`printer-description`]
  
  @js.native
  sealed trait `printer-device-id` extends StObject
  @scala.inline
  def `printer-device-id`: `printer-device-id` = "printer-device-id".asInstanceOf[`printer-device-id`]
  
  @js.native
  sealed trait `printer-dns-sd-name` extends StObject
  @scala.inline
  def `printer-dns-sd-name`: `printer-dns-sd-name` = "printer-dns-sd-name".asInstanceOf[`printer-dns-sd-name`]
  
  @js.native
  sealed trait `printer-driver-installer` extends StObject
  @scala.inline
  def `printer-driver-installer`: `printer-driver-installer` = "printer-driver-installer".asInstanceOf[`printer-driver-installer`]
  
  @js.native
  sealed trait `printer-fax-log-uri` extends StObject
  @scala.inline
  def `printer-fax-log-uri`: `printer-fax-log-uri` = "printer-fax-log-uri".asInstanceOf[`printer-fax-log-uri`]
  
  @js.native
  sealed trait `printer-fax-modem-info` extends StObject
  @scala.inline
  def `printer-fax-modem-info`: `printer-fax-modem-info` = "printer-fax-modem-info".asInstanceOf[`printer-fax-modem-info`]
  
  @js.native
  sealed trait `printer-fax-modem-name` extends StObject
  @scala.inline
  def `printer-fax-modem-name`: `printer-fax-modem-name` = "printer-fax-modem-name".asInstanceOf[`printer-fax-modem-name`]
  
  @js.native
  sealed trait `printer-fax-modem-number` extends StObject
  @scala.inline
  def `printer-fax-modem-number`: `printer-fax-modem-number` = "printer-fax-modem-number".asInstanceOf[`printer-fax-modem-number`]
  
  @js.native
  sealed trait `printer-finishings-changed` extends NotifyEvents
  @scala.inline
  def `printer-finishings-changed`: `printer-finishings-changed` = "printer-finishings-changed".asInstanceOf[`printer-finishings-changed`]
  
  @js.native
  sealed trait `printer-geo-location` extends StObject
  @scala.inline
  def `printer-geo-location`: `printer-geo-location` = "printer-geo-location".asInstanceOf[`printer-geo-location`]
  
  @js.native
  sealed trait `printer-get-attributes-supported` extends StObject
  @scala.inline
  def `printer-get-attributes-supported`: `printer-get-attributes-supported` = "printer-get-attributes-supported".asInstanceOf[`printer-get-attributes-supported`]
  
  @js.native
  sealed trait `printer-icc-profiles` extends StObject
  @scala.inline
  def `printer-icc-profiles`: `printer-icc-profiles` = "printer-icc-profiles".asInstanceOf[`printer-icc-profiles`]
  
  @js.native
  sealed trait `printer-icons` extends StObject
  @scala.inline
  def `printer-icons`: `printer-icons` = "printer-icons".asInstanceOf[`printer-icons`]
  
  @js.native
  sealed trait `printer-info` extends StObject
  @scala.inline
  def `printer-info`: `printer-info` = "printer-info".asInstanceOf[`printer-info`]
  
  @js.native
  sealed trait `printer-kind` extends StObject
  @scala.inline
  def `printer-kind`: `printer-kind` = "printer-kind".asInstanceOf[`printer-kind`]
  
  @js.native
  sealed trait `printer-location` extends StObject
  @scala.inline
  def `printer-location`: `printer-location` = "printer-location".asInstanceOf[`printer-location`]
  
  @js.native
  sealed trait `printer-make-and-model` extends StObject
  @scala.inline
  def `printer-make-and-model`: `printer-make-and-model` = "printer-make-and-model".asInstanceOf[`printer-make-and-model`]
  
  @js.native
  sealed trait `printer-mandatory-job-attributes` extends StObject
  @scala.inline
  def `printer-mandatory-job-attributes`: `printer-mandatory-job-attributes` = "printer-mandatory-job-attributes".asInstanceOf[`printer-mandatory-job-attributes`]
  
  @js.native
  sealed trait `printer-manual-reset` extends PrinterStateReasons
  @scala.inline
  def `printer-manual-reset`: `printer-manual-reset` = "printer-manual-reset".asInstanceOf[`printer-manual-reset`]
  
  @js.native
  sealed trait `printer-media-changed` extends NotifyEvents
  @scala.inline
  def `printer-media-changed`: `printer-media-changed` = "printer-media-changed".asInstanceOf[`printer-media-changed`]
  
  @js.native
  sealed trait `printer-more-info-manufacturer` extends StObject
  @scala.inline
  def `printer-more-info-manufacturer`: `printer-more-info-manufacturer` = "printer-more-info-manufacturer".asInstanceOf[`printer-more-info-manufacturer`]
  
  @js.native
  sealed trait `printer-name` extends StObject
  @scala.inline
  def `printer-name`: `printer-name` = "printer-name".asInstanceOf[`printer-name`]
  
  @js.native
  sealed trait `printer-nms-reset` extends PrinterStateReasons
  @scala.inline
  def `printer-nms-reset`: `printer-nms-reset` = "printer-nms-reset".asInstanceOf[`printer-nms-reset`]
  
  @js.native
  sealed trait `printer-organization` extends StObject
  @scala.inline
  def `printer-organization`: `printer-organization` = "printer-organization".asInstanceOf[`printer-organization`]
  
  @js.native
  sealed trait `printer-organizational-unit` extends StObject
  @scala.inline
  def `printer-organizational-unit`: `printer-organizational-unit` = "printer-organizational-unit".asInstanceOf[`printer-organizational-unit`]
  
  @js.native
  sealed trait `printer-privacy-policy-uri` extends StObject
  @scala.inline
  def `printer-privacy-policy-uri`: `printer-privacy-policy-uri` = "printer-privacy-policy-uri".asInstanceOf[`printer-privacy-policy-uri`]
  
  @js.native
  sealed trait `printer-queue-order-changed` extends NotifyEvents
  @scala.inline
  def `printer-queue-order-changed`: `printer-queue-order-changed` = "printer-queue-order-changed".asInstanceOf[`printer-queue-order-changed`]
  
  @js.native
  sealed trait `printer-ready-to-print` extends PrinterStateReasons
  @scala.inline
  def `printer-ready-to-print`: `printer-ready-to-print` = "printer-ready-to-print".asInstanceOf[`printer-ready-to-print`]
  
  @js.native
  sealed trait `printer-resolution` extends Overrides
  @scala.inline
  def `printer-resolution`: `printer-resolution` = "printer-resolution".asInstanceOf[`printer-resolution`]
  
  @js.native
  sealed trait `printer-resolution-actual` extends StObject
  @scala.inline
  def `printer-resolution-actual`: `printer-resolution-actual` = "printer-resolution-actual".asInstanceOf[`printer-resolution-actual`]
  
  @js.native
  sealed trait `printer-resolution-default` extends StObject
  @scala.inline
  def `printer-resolution-default`: `printer-resolution-default` = "printer-resolution-default".asInstanceOf[`printer-resolution-default`]
  
  @js.native
  sealed trait `printer-resolution-supported` extends StObject
  @scala.inline
  def `printer-resolution-supported`: `printer-resolution-supported` = "printer-resolution-supported".asInstanceOf[`printer-resolution-supported`]
  
  @js.native
  sealed trait `printer-restarted` extends NotifyEvents
  @scala.inline
  def `printer-restarted`: `printer-restarted` = "printer-restarted".asInstanceOf[`printer-restarted`]
  
  @js.native
  sealed trait `printer-shutdown` extends NotifyEvents
  @scala.inline
  def `printer-shutdown`: `printer-shutdown` = "printer-shutdown".asInstanceOf[`printer-shutdown`]
  
  @js.native
  sealed trait `printer-state-changed` extends NotifyEvents
  @scala.inline
  def `printer-state-changed`: `printer-state-changed` = "printer-state-changed".asInstanceOf[`printer-state-changed`]
  
  @js.native
  sealed trait `printer-static-resource-directory-uri` extends StObject
  @scala.inline
  def `printer-static-resource-directory-uri`: `printer-static-resource-directory-uri` = "printer-static-resource-directory-uri".asInstanceOf[`printer-static-resource-directory-uri`]
  
  @js.native
  sealed trait `printer-static-resource-k-octets-supported` extends StObject
  @scala.inline
  def `printer-static-resource-k-octets-supported`: `printer-static-resource-k-octets-supported` = "printer-static-resource-k-octets-supported".asInstanceOf[`printer-static-resource-k-octets-supported`]
  
  @js.native
  sealed trait `printer-stopped`
    extends JobStateReasons
       with NotifyEvents
  @scala.inline
  def `printer-stopped`: `printer-stopped` = "printer-stopped".asInstanceOf[`printer-stopped`]
  
  @js.native
  sealed trait `printer-stopped-partly` extends JobStateReasons
  @scala.inline
  def `printer-stopped-partly`: `printer-stopped-partly` = "printer-stopped-partly".asInstanceOf[`printer-stopped-partly`]
  
  @js.native
  sealed trait `printer-strings-languages-supported` extends StObject
  @scala.inline
  def `printer-strings-languages-supported`: `printer-strings-languages-supported` = "printer-strings-languages-supported".asInstanceOf[`printer-strings-languages-supported`]
  
  @js.native
  sealed trait `printer-strings-uri` extends StObject
  @scala.inline
  def `printer-strings-uri`: `printer-strings-uri` = "printer-strings-uri".asInstanceOf[`printer-strings-uri`]
  
  @js.native
  sealed trait `printer-volume-supported` extends StObject
  @scala.inline
  def `printer-volume-supported`: `printer-volume-supported` = "printer-volume-supported".asInstanceOf[`printer-volume-supported`]
  
  @js.native
  sealed trait `printer-xri-supported` extends StObject
  @scala.inline
  def `printer-xri-supported`: `printer-xri-supported` = "printer-xri-supported".asInstanceOf[`printer-xri-supported`]
  
  @js.native
  sealed trait printing extends DocumentStateReasons
  @scala.inline
  def printing: printing = "printing".asInstanceOf[printing]
  
  @js.native
  sealed trait `process-bi-level` extends PrintColorMode
  @scala.inline
  def `process-bi-level`: `process-bi-level` = "process-bi-level".asInstanceOf[`process-bi-level`]
  
  @js.native
  sealed trait `process-job` extends StObject
  @scala.inline
  def `process-job`: `process-job` = "process-job".asInstanceOf[`process-job`]
  
  @js.native
  sealed trait `process-monochrome` extends PrintColorMode
  @scala.inline
  def `process-monochrome`: `process-monochrome` = "process-monochrome".asInstanceOf[`process-monochrome`]
  
  @js.native
  sealed trait processing
    extends DocumentState
       with JobState
       with PrinterState
       with SystemState
       with TransmissionStatus
       with WhichJobs
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait `processing-stopped`
    extends DocumentState
       with JobState
       with WhichJobs
  @scala.inline
  def `processing-stopped`: `processing-stopped` = "processing-stopped".asInstanceOf[`processing-stopped`]
  
  @js.native
  sealed trait `processing-to-stop-point`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `processing-to-stop-point`: `processing-to-stop-point` = "processing-to-stop-point".asInstanceOf[`processing-to-stop-point`]
  
  @js.native
  sealed trait progressive extends StObject
  @scala.inline
  def progressive: progressive = "progressive".asInstanceOf[progressive]
  
  @js.native
  sealed trait `proof-print`
    extends Overrides
       with WhichJobs
  @scala.inline
  def `proof-print`: `proof-print` = "proof-print".asInstanceOf[`proof-print`]
  
  @js.native
  sealed trait `proof-print-copies` extends StObject
  @scala.inline
  def `proof-print-copies`: `proof-print-copies` = "proof-print-copies".asInstanceOf[`proof-print-copies`]
  
  @js.native
  sealed trait `proof-print-default` extends StObject
  @scala.inline
  def `proof-print-default`: `proof-print-default` = "proof-print-default".asInstanceOf[`proof-print-default`]
  
  @js.native
  sealed trait `proof-print-supported` extends StObject
  @scala.inline
  def `proof-print-supported`: `proof-print-supported` = "proof-print-supported".asInstanceOf[`proof-print-supported`]
  
  @js.native
  sealed trait prospero extends UriSchemes
  @scala.inline
  def prospero: prospero = "prospero".asInstanceOf[prospero]
  
  @js.native
  sealed trait proxy extends UriSchemes
  @scala.inline
  def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait psyc extends UriSchemes
  @scala.inline
  def psyc: psyc = "psyc".asInstanceOf[psyc]
  
  @js.native
  sealed trait pttp extends UriSchemes
  @scala.inline
  def pttp: pttp = "pttp".asInstanceOf[pttp]
  
  @js.native
  sealed trait punch extends Finishings
  @scala.inline
  def punch: punch = "punch".asInstanceOf[punch]
  
  @js.native
  sealed trait `punch-bottom-left` extends Finishings
  @scala.inline
  def `punch-bottom-left`: `punch-bottom-left` = "punch-bottom-left".asInstanceOf[`punch-bottom-left`]
  
  @js.native
  sealed trait `punch-bottom-right` extends Finishings
  @scala.inline
  def `punch-bottom-right`: `punch-bottom-right` = "punch-bottom-right".asInstanceOf[`punch-bottom-right`]
  
  @js.native
  sealed trait `punch-dual-bottom` extends Finishings
  @scala.inline
  def `punch-dual-bottom`: `punch-dual-bottom` = "punch-dual-bottom".asInstanceOf[`punch-dual-bottom`]
  
  @js.native
  sealed trait `punch-dual-left` extends Finishings
  @scala.inline
  def `punch-dual-left`: `punch-dual-left` = "punch-dual-left".asInstanceOf[`punch-dual-left`]
  
  @js.native
  sealed trait `punch-dual-right` extends Finishings
  @scala.inline
  def `punch-dual-right`: `punch-dual-right` = "punch-dual-right".asInstanceOf[`punch-dual-right`]
  
  @js.native
  sealed trait `punch-dual-top` extends Finishings
  @scala.inline
  def `punch-dual-top`: `punch-dual-top` = "punch-dual-top".asInstanceOf[`punch-dual-top`]
  
  @js.native
  sealed trait `punch-multiple-bottom` extends Finishings
  @scala.inline
  def `punch-multiple-bottom`: `punch-multiple-bottom` = "punch-multiple-bottom".asInstanceOf[`punch-multiple-bottom`]
  
  @js.native
  sealed trait `punch-multiple-left` extends Finishings
  @scala.inline
  def `punch-multiple-left`: `punch-multiple-left` = "punch-multiple-left".asInstanceOf[`punch-multiple-left`]
  
  @js.native
  sealed trait `punch-multiple-right` extends Finishings
  @scala.inline
  def `punch-multiple-right`: `punch-multiple-right` = "punch-multiple-right".asInstanceOf[`punch-multiple-right`]
  
  @js.native
  sealed trait `punch-multiple-top` extends Finishings
  @scala.inline
  def `punch-multiple-top`: `punch-multiple-top` = "punch-multiple-top".asInstanceOf[`punch-multiple-top`]
  
  @js.native
  sealed trait `punch-quad-bottom` extends Finishings
  @scala.inline
  def `punch-quad-bottom`: `punch-quad-bottom` = "punch-quad-bottom".asInstanceOf[`punch-quad-bottom`]
  
  @js.native
  sealed trait `punch-quad-left` extends Finishings
  @scala.inline
  def `punch-quad-left`: `punch-quad-left` = "punch-quad-left".asInstanceOf[`punch-quad-left`]
  
  @js.native
  sealed trait `punch-quad-right` extends Finishings
  @scala.inline
  def `punch-quad-right`: `punch-quad-right` = "punch-quad-right".asInstanceOf[`punch-quad-right`]
  
  @js.native
  sealed trait `punch-quad-top` extends Finishings
  @scala.inline
  def `punch-quad-top`: `punch-quad-top` = "punch-quad-top".asInstanceOf[`punch-quad-top`]
  
  @js.native
  sealed trait `punch-top-left` extends Finishings
  @scala.inline
  def `punch-top-left`: `punch-top-left` = "punch-top-left".asInstanceOf[`punch-top-left`]
  
  @js.native
  sealed trait `punch-top-right` extends Finishings
  @scala.inline
  def `punch-top-right`: `punch-top-right` = "punch-top-right".asInstanceOf[`punch-top-right`]
  
  @js.native
  sealed trait `punch-triple-bottom` extends Finishings
  @scala.inline
  def `punch-triple-bottom`: `punch-triple-bottom` = "punch-triple-bottom".asInstanceOf[`punch-triple-bottom`]
  
  @js.native
  sealed trait `punch-triple-left` extends Finishings
  @scala.inline
  def `punch-triple-left`: `punch-triple-left` = "punch-triple-left".asInstanceOf[`punch-triple-left`]
  
  @js.native
  sealed trait `punch-triple-right` extends Finishings
  @scala.inline
  def `punch-triple-right`: `punch-triple-right` = "punch-triple-right".asInstanceOf[`punch-triple-right`]
  
  @js.native
  sealed trait `punch-triple-top` extends Finishings
  @scala.inline
  def `punch-triple-top`: `punch-triple-top` = "punch-triple-top".asInstanceOf[`punch-triple-top`]
  
  @js.native
  sealed trait `puncher-added` extends PrinterStateReasons
  @scala.inline
  def `puncher-added`: `puncher-added` = "puncher-added".asInstanceOf[`puncher-added`]
  
  @js.native
  sealed trait `puncher-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `puncher-almost-empty`: `puncher-almost-empty` = "puncher-almost-empty".asInstanceOf[`puncher-almost-empty`]
  
  @js.native
  sealed trait `puncher-almost-full` extends PrinterStateReasons
  @scala.inline
  def `puncher-almost-full`: `puncher-almost-full` = "puncher-almost-full".asInstanceOf[`puncher-almost-full`]
  
  @js.native
  sealed trait `puncher-at-limit` extends PrinterStateReasons
  @scala.inline
  def `puncher-at-limit`: `puncher-at-limit` = "puncher-at-limit".asInstanceOf[`puncher-at-limit`]
  
  @js.native
  sealed trait `puncher-closed` extends PrinterStateReasons
  @scala.inline
  def `puncher-closed`: `puncher-closed` = "puncher-closed".asInstanceOf[`puncher-closed`]
  
  @js.native
  sealed trait `puncher-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `puncher-configuration-change`: `puncher-configuration-change` = "puncher-configuration-change".asInstanceOf[`puncher-configuration-change`]
  
  @js.native
  sealed trait `puncher-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `puncher-cover-closed`: `puncher-cover-closed` = "puncher-cover-closed".asInstanceOf[`puncher-cover-closed`]
  
  @js.native
  sealed trait `puncher-cover-open` extends PrinterStateReasons
  @scala.inline
  def `puncher-cover-open`: `puncher-cover-open` = "puncher-cover-open".asInstanceOf[`puncher-cover-open`]
  
  @js.native
  sealed trait `puncher-empty` extends PrinterStateReasons
  @scala.inline
  def `puncher-empty`: `puncher-empty` = "puncher-empty".asInstanceOf[`puncher-empty`]
  
  @js.native
  sealed trait `puncher-full` extends PrinterStateReasons
  @scala.inline
  def `puncher-full`: `puncher-full` = "puncher-full".asInstanceOf[`puncher-full`]
  
  @js.native
  sealed trait `puncher-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `puncher-interlock-closed`: `puncher-interlock-closed` = "puncher-interlock-closed".asInstanceOf[`puncher-interlock-closed`]
  
  @js.native
  sealed trait `puncher-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `puncher-interlock-open`: `puncher-interlock-open` = "puncher-interlock-open".asInstanceOf[`puncher-interlock-open`]
  
  @js.native
  sealed trait `puncher-jam` extends PrinterStateReasons
  @scala.inline
  def `puncher-jam`: `puncher-jam` = "puncher-jam".asInstanceOf[`puncher-jam`]
  
  @js.native
  sealed trait `puncher-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `puncher-life-almost-over`: `puncher-life-almost-over` = "puncher-life-almost-over".asInstanceOf[`puncher-life-almost-over`]
  
  @js.native
  sealed trait `puncher-life-over` extends PrinterStateReasons
  @scala.inline
  def `puncher-life-over`: `puncher-life-over` = "puncher-life-over".asInstanceOf[`puncher-life-over`]
  
  @js.native
  sealed trait `puncher-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `puncher-memory-exhausted`: `puncher-memory-exhausted` = "puncher-memory-exhausted".asInstanceOf[`puncher-memory-exhausted`]
  
  @js.native
  sealed trait `puncher-missing` extends PrinterStateReasons
  @scala.inline
  def `puncher-missing`: `puncher-missing` = "puncher-missing".asInstanceOf[`puncher-missing`]
  
  @js.native
  sealed trait `puncher-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `puncher-motor-failure`: `puncher-motor-failure` = "puncher-motor-failure".asInstanceOf[`puncher-motor-failure`]
  
  @js.native
  sealed trait `puncher-near-limit` extends PrinterStateReasons
  @scala.inline
  def `puncher-near-limit`: `puncher-near-limit` = "puncher-near-limit".asInstanceOf[`puncher-near-limit`]
  
  @js.native
  sealed trait `puncher-offline` extends PrinterStateReasons
  @scala.inline
  def `puncher-offline`: `puncher-offline` = "puncher-offline".asInstanceOf[`puncher-offline`]
  
  @js.native
  sealed trait `puncher-opened` extends PrinterStateReasons
  @scala.inline
  def `puncher-opened`: `puncher-opened` = "puncher-opened".asInstanceOf[`puncher-opened`]
  
  @js.native
  sealed trait `puncher-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `puncher-over-temperature`: `puncher-over-temperature` = "puncher-over-temperature".asInstanceOf[`puncher-over-temperature`]
  
  @js.native
  sealed trait `puncher-power-saver` extends PrinterStateReasons
  @scala.inline
  def `puncher-power-saver`: `puncher-power-saver` = "puncher-power-saver".asInstanceOf[`puncher-power-saver`]
  
  @js.native
  sealed trait `puncher-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `puncher-recoverable-failure`: `puncher-recoverable-failure` = "puncher-recoverable-failure".asInstanceOf[`puncher-recoverable-failure`]
  
  @js.native
  sealed trait `puncher-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `puncher-recoverable-storage-error`: `puncher-recoverable-storage-error` = "puncher-recoverable-storage-error".asInstanceOf[`puncher-recoverable-storage-error`]
  
  @js.native
  sealed trait `puncher-removed` extends PrinterStateReasons
  @scala.inline
  def `puncher-removed`: `puncher-removed` = "puncher-removed".asInstanceOf[`puncher-removed`]
  
  @js.native
  sealed trait `puncher-resource-added` extends PrinterStateReasons
  @scala.inline
  def `puncher-resource-added`: `puncher-resource-added` = "puncher-resource-added".asInstanceOf[`puncher-resource-added`]
  
  @js.native
  sealed trait `puncher-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `puncher-resource-removed`: `puncher-resource-removed` = "puncher-resource-removed".asInstanceOf[`puncher-resource-removed`]
  
  @js.native
  sealed trait `puncher-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `puncher-thermistor-failure`: `puncher-thermistor-failure` = "puncher-thermistor-failure".asInstanceOf[`puncher-thermistor-failure`]
  
  @js.native
  sealed trait `puncher-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `puncher-timing-failure`: `puncher-timing-failure` = "puncher-timing-failure".asInstanceOf[`puncher-timing-failure`]
  
  @js.native
  sealed trait `puncher-turned-off` extends PrinterStateReasons
  @scala.inline
  def `puncher-turned-off`: `puncher-turned-off` = "puncher-turned-off".asInstanceOf[`puncher-turned-off`]
  
  @js.native
  sealed trait `puncher-turned-on` extends PrinterStateReasons
  @scala.inline
  def `puncher-turned-on`: `puncher-turned-on` = "puncher-turned-on".asInstanceOf[`puncher-turned-on`]
  
  @js.native
  sealed trait `puncher-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `puncher-under-temperature`: `puncher-under-temperature` = "puncher-under-temperature".asInstanceOf[`puncher-under-temperature`]
  
  @js.native
  sealed trait `puncher-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `puncher-unrecoverable-failure`: `puncher-unrecoverable-failure` = "puncher-unrecoverable-failure".asInstanceOf[`puncher-unrecoverable-failure`]
  
  @js.native
  sealed trait `puncher-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `puncher-unrecoverable-storage-error`: `puncher-unrecoverable-storage-error` = "puncher-unrecoverable-storage-error".asInstanceOf[`puncher-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `puncher-warming-up` extends PrinterStateReasons
  @scala.inline
  def `puncher-warming-up`: `puncher-warming-up` = "puncher-warming-up".asInstanceOf[`puncher-warming-up`]
  
  @js.native
  sealed trait punching extends StObject
  @scala.inline
  def punching: punching = "punching".asInstanceOf[punching]
  
  @js.native
  sealed trait `punching-hole-diameter-configured` extends StObject
  @scala.inline
  def `punching-hole-diameter-configured`: `punching-hole-diameter-configured` = "punching-hole-diameter-configured".asInstanceOf[`punching-hole-diameter-configured`]
  
  @js.native
  sealed trait `punching-locations-supported` extends StObject
  @scala.inline
  def `punching-locations-supported`: `punching-locations-supported` = "punching-locations-supported".asInstanceOf[`punching-locations-supported`]
  
  @js.native
  sealed trait `punching-offset-supported` extends StObject
  @scala.inline
  def `punching-offset-supported`: `punching-offset-supported` = "punching-offset-supported".asInstanceOf[`punching-offset-supported`]
  
  @js.native
  sealed trait `punching-reference-edge-supported` extends StObject
  @scala.inline
  def `punching-reference-edge-supported`: `punching-reference-edge-supported` = "punching-reference-edge-supported".asInstanceOf[`punching-reference-edge-supported`]
  
  @js.native
  sealed trait `pva-dissolvable` extends MaterialType
  @scala.inline
  def `pva-dissolvable`: `pva-dissolvable` = "pva-dissolvable".asInstanceOf[`pva-dissolvable`]
  
  @js.native
  sealed trait `pwg-5102Dot3` extends StObject
  @scala.inline
  def `pwg-5102Dot3`: `pwg-5102Dot3` = "pwg-5102.3".asInstanceOf[`pwg-5102Dot3`]
  
  @js.native
  sealed trait `pwg-raster-document-resolution-supported` extends StObject
  @scala.inline
  def `pwg-raster-document-resolution-supported`: `pwg-raster-document-resolution-supported` = "pwg-raster-document-resolution-supported".asInstanceOf[`pwg-raster-document-resolution-supported`]
  
  @js.native
  sealed trait `pwg-raster-document-sheet-back` extends StObject
  @scala.inline
  def `pwg-raster-document-sheet-back`: `pwg-raster-document-sheet-back` = "pwg-raster-document-sheet-back".asInstanceOf[`pwg-raster-document-sheet-back`]
  
  @js.native
  sealed trait `pwg-raster-document-type-supported` extends StObject
  @scala.inline
  def `pwg-raster-document-type-supported`: `pwg-raster-document-type-supported` = "pwg-raster-document-type-supported".asInstanceOf[`pwg-raster-document-type-supported`]
  
  @js.native
  sealed trait `pwg-safe-gcode-supported` extends StObject
  @scala.inline
  def `pwg-safe-gcode-supported`: `pwg-safe-gcode-supported` = "pwg-safe-gcode-supported".asInstanceOf[`pwg-safe-gcode-supported`]
  
  @js.native
  sealed trait pwid extends UriSchemes
  @scala.inline
  def pwid: pwid = "pwid".asInstanceOf[pwid]
  
  @js.native
  sealed trait qb extends UriSchemes
  @scala.inline
  def qb: qb = "qb".asInstanceOf[qb]
  
  @js.native
  sealed trait quarto
    extends Media
       with MediaSizeName
  @scala.inline
  def quarto: quarto = "quarto".asInstanceOf[quarto]
  
  @js.native
  sealed trait `quarto-white`
    extends Media
       with MediaName
  @scala.inline
  def `quarto-white`: `quarto-white` = "quarto-white".asInstanceOf[`quarto-white`]
  
  @js.native
  sealed trait query extends UriSchemes
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait queued extends DocumentStateReasons
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait `queued-for-marker` extends DocumentStateReasons
  @scala.inline
  def `queued-for-marker`: `queued-for-marker` = "queued-for-marker".asInstanceOf[`queued-for-marker`]
  
  @js.native
  sealed trait `queued-in-device`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `queued-in-device`: `queued-in-device` = "queued-in-device".asInstanceOf[`queued-in-device`]
  
  @js.native
  sealed trait `quic-transport` extends UriSchemes
  @scala.inline
  def `quic-transport`: `quic-transport` = "quic-transport".asInstanceOf[`quic-transport`]
  
  @js.native
  sealed trait raft extends PrintBase
  @scala.inline
  def raft: raft = "raft".asInstanceOf[raft]
  
  @js.native
  sealed trait rear
    extends MediaSource
       with OutputBin
  @scala.inline
  def rear: rear = "rear".asInstanceOf[rear]
  
  @js.native
  sealed trait receipt extends PrinterKind
  @scala.inline
  def receipt: receipt = "receipt".asInstanceOf[receipt]
  
  @js.native
  sealed trait red extends MediaColor
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait redis extends UriSchemes
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
  
  @js.native
  sealed trait rediss extends UriSchemes
  @scala.inline
  def rediss: rediss = "rediss".asInstanceOf[rediss]
  
  @js.native
  sealed trait `reference-uri-schemes-supported` extends StObject
  @scala.inline
  def `reference-uri-schemes-supported`: `reference-uri-schemes-supported` = "reference-uri-schemes-supported".asInstanceOf[`reference-uri-schemes-supported`]
  
  @js.native
  sealed trait relative extends PrintRenderingIntent
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait `relative-bpc` extends PrintRenderingIntent
  @scala.inline
  def `relative-bpc`: `relative-bpc` = "relative-bpc".asInstanceOf[`relative-bpc`]
  
  @js.native
  sealed trait reload extends UriSchemes
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait `repertoire-supported` extends StObject
  @scala.inline
  def `repertoire-supported`: `repertoire-supported` = "repertoire-supported".asInstanceOf[`repertoire-supported`]
  
  @js.native
  sealed trait `requesting-user-name` extends XriAuthentication
  @scala.inline
  def `requesting-user-name`: `requesting-user-name` = "requesting-user-name".asInstanceOf[`requesting-user-name`]
  
  @js.native
  sealed trait `requesting-user-uri-supported` extends StObject
  @scala.inline
  def `requesting-user-uri-supported`: `requesting-user-uri-supported` = "requesting-user-uri-supported".asInstanceOf[`requesting-user-uri-supported`]
  
  @js.native
  sealed trait res extends UriSchemes
  @scala.inline
  def res: res = "res".asInstanceOf[res]
  
  @js.native
  sealed trait `reset-hard` extends PowerState
  @scala.inline
  def `reset-hard`: `reset-hard` = "reset-hard".asInstanceOf[`reset-hard`]
  
  @js.native
  sealed trait `reset-hard-graceful` extends PowerState
  @scala.inline
  def `reset-hard-graceful`: `reset-hard-graceful` = "reset-hard-graceful".asInstanceOf[`reset-hard-graceful`]
  
  @js.native
  sealed trait `reset-init` extends PowerState
  @scala.inline
  def `reset-init`: `reset-init` = "reset-init".asInstanceOf[`reset-init`]
  
  @js.native
  sealed trait `reset-mbr` extends PowerState
  @scala.inline
  def `reset-mbr`: `reset-mbr` = "reset-mbr".asInstanceOf[`reset-mbr`]
  
  @js.native
  sealed trait `reset-mbr-graceful` extends PowerState
  @scala.inline
  def `reset-mbr-graceful`: `reset-mbr-graceful` = "reset-mbr-graceful".asInstanceOf[`reset-mbr-graceful`]
  
  @js.native
  sealed trait `reset-nmi` extends PowerState
  @scala.inline
  def `reset-nmi`: `reset-nmi` = "reset-nmi".asInstanceOf[`reset-nmi`]
  
  @js.native
  sealed trait `reset-soft` extends PowerState
  @scala.inline
  def `reset-soft`: `reset-soft` = "reset-soft".asInstanceOf[`reset-soft`]
  
  @js.native
  sealed trait `reset-soft-graceful` extends PowerState
  @scala.inline
  def `reset-soft-graceful`: `reset-soft-graceful` = "reset-soft-graceful".asInstanceOf[`reset-soft-graceful`]
  
  @js.native
  sealed trait resource extends UriSchemes
  @scala.inline
  def resource: resource = "resource".asInstanceOf[resource]
  
  @js.native
  sealed trait `resource-object` extends StObject
  @scala.inline
  def `resource-object`: `resource-object` = "resource-object".asInstanceOf[`resource-object`]
  
  @js.native
  sealed trait `resources-are-not-ready`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `resources-are-not-ready`: `resources-are-not-ready` = "resources-are-not-ready".asInstanceOf[`resources-are-not-ready`]
  
  @js.native
  sealed trait `resources-are-not-supported`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `resources-are-not-supported`: `resources-are-not-supported` = "resources-are-not-supported".asInstanceOf[`resources-are-not-supported`]
  
  @js.native
  sealed trait `retry-interval` extends Overrides
  @scala.inline
  def `retry-interval`: `retry-interval` = "retry-interval".asInstanceOf[`retry-interval`]
  
  @js.native
  sealed trait `retry-interval-default` extends StObject
  @scala.inline
  def `retry-interval-default`: `retry-interval-default` = "retry-interval-default".asInstanceOf[`retry-interval-default`]
  
  @js.native
  sealed trait `retry-interval-supported` extends StObject
  @scala.inline
  def `retry-interval-supported`: `retry-interval-supported` = "retry-interval-supported".asInstanceOf[`retry-interval-supported`]
  
  @js.native
  sealed trait `retry-time-out` extends Overrides
  @scala.inline
  def `retry-time-out`: `retry-time-out` = "retry-time-out".asInstanceOf[`retry-time-out`]
  
  @js.native
  sealed trait `retry-time-out-default` extends StObject
  @scala.inline
  def `retry-time-out-default`: `retry-time-out-default` = "retry-time-out-default".asInstanceOf[`retry-time-out-default`]
  
  @js.native
  sealed trait `retry-time-out-supported` extends StObject
  @scala.inline
  def `retry-time-out-supported`: `retry-time-out-supported` = "retry-time-out-supported".asInstanceOf[`retry-time-out-supported`]
  
  @js.native
  sealed trait `reverse-landscape` extends OrientationRequested
  @scala.inline
  def `reverse-landscape`: `reverse-landscape` = "reverse-landscape".asInstanceOf[`reverse-landscape`]
  
  @js.native
  sealed trait `reverse-order-face-down` extends PageDelivery
  @scala.inline
  def `reverse-order-face-down`: `reverse-order-face-down` = "reverse-order-face-down".asInstanceOf[`reverse-order-face-down`]
  
  @js.native
  sealed trait `reverse-order-face-up` extends PageDelivery
  @scala.inline
  def `reverse-order-face-up`: `reverse-order-face-up` = "reverse-order-face-up".asInstanceOf[`reverse-order-face-up`]
  
  @js.native
  sealed trait `reverse-portrait` extends OrientationRequested
  @scala.inline
  def `reverse-portrait`: `reverse-portrait` = "reverse-portrait".asInstanceOf[`reverse-portrait`]
  
  @js.native
  sealed trait rgb_16
    extends InputColorMode
       with PwgRasterDocumentTypeSupported
  @scala.inline
  def rgb_16: rgb_16 = "rgb_16".asInstanceOf[rgb_16]
  
  @js.native
  sealed trait rgb_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def rgb_8: rgb_8 = "rgb_8".asInstanceOf[rgb_8]
  
  @js.native
  sealed trait rgba_16 extends InputColorMode
  @scala.inline
  def rgba_16: rgba_16 = "rgba_16".asInstanceOf[rgba_16]
  
  @js.native
  sealed trait rgba_8 extends InputColorMode
  @scala.inline
  def rgba_8: rgba_8 = "rgba_8".asInstanceOf[rgba_8]
  
  @js.native
  sealed trait right
    extends MediaSource
       with OutputBin
       with ReferenceEdge
       with XImagePosition
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rmi extends UriSchemes
  @scala.inline
  def rmi: rmi = "rmi".asInstanceOf[rmi]
  
  @js.native
  sealed trait roc_16k_7Dot75x10Dot75in
    extends Media
       with MediaSizeName
  @scala.inline
  def roc_16k_7Dot75x10Dot75in: roc_16k_7Dot75x10Dot75in = "roc_16k_7.75x10.75in".asInstanceOf[roc_16k_7Dot75x10Dot75in]
  
  @js.native
  sealed trait roc_8k_10Dot75x15Dot5in
    extends Media
       with MediaSizeName
  @scala.inline
  def roc_8k_10Dot75x15Dot5in: roc_8k_10Dot75x15Dot5in = "roc_8k_10.75x15.5in".asInstanceOf[roc_8k_10Dot75x15Dot5in]
  
  @js.native
  sealed trait roll
    extends MediaType
       with PrinterKind
  @scala.inline
  def roll: roll = "roll".asInstanceOf[roll]
  
  @js.native
  sealed trait `roll-1` extends MediaSource
  @scala.inline
  def `roll-1`: `roll-1` = "roll-1".asInstanceOf[`roll-1`]
  
  @js.native
  sealed trait `roll-10` extends MediaSource
  @scala.inline
  def `roll-10`: `roll-10` = "roll-10".asInstanceOf[`roll-10`]
  
  @js.native
  sealed trait `roll-2` extends MediaSource
  @scala.inline
  def `roll-2`: `roll-2` = "roll-2".asInstanceOf[`roll-2`]
  
  @js.native
  sealed trait `roll-3` extends MediaSource
  @scala.inline
  def `roll-3`: `roll-3` = "roll-3".asInstanceOf[`roll-3`]
  
  @js.native
  sealed trait `roll-4` extends MediaSource
  @scala.inline
  def `roll-4`: `roll-4` = "roll-4".asInstanceOf[`roll-4`]
  
  @js.native
  sealed trait `roll-5` extends MediaSource
  @scala.inline
  def `roll-5`: `roll-5` = "roll-5".asInstanceOf[`roll-5`]
  
  @js.native
  sealed trait `roll-6` extends MediaSource
  @scala.inline
  def `roll-6`: `roll-6` = "roll-6".asInstanceOf[`roll-6`]
  
  @js.native
  sealed trait `roll-7` extends MediaSource
  @scala.inline
  def `roll-7`: `roll-7` = "roll-7".asInstanceOf[`roll-7`]
  
  @js.native
  sealed trait `roll-8` extends MediaSource
  @scala.inline
  def `roll-8`: `roll-8` = "roll-8".asInstanceOf[`roll-8`]
  
  @js.native
  sealed trait `roll-9` extends MediaSource
  @scala.inline
  def `roll-9`: `roll-9` = "roll-9".asInstanceOf[`roll-9`]
  
  @js.native
  sealed trait rotated extends StObject
  @scala.inline
  def rotated: rotated = "rotated".asInstanceOf[rotated]
  
  @js.native
  sealed trait rsync extends UriSchemes
  @scala.inline
  def rsync: rsync = "rsync".asInstanceOf[rsync]
  
  @js.native
  sealed trait rtmfp extends UriSchemes
  @scala.inline
  def rtmfp: rtmfp = "rtmfp".asInstanceOf[rtmfp]
  
  @js.native
  sealed trait rtmp extends UriSchemes
  @scala.inline
  def rtmp: rtmp = "rtmp".asInstanceOf[rtmp]
  
  @js.native
  sealed trait rtsp extends UriSchemes
  @scala.inline
  def rtsp: rtsp = "rtsp".asInstanceOf[rtsp]
  
  @js.native
  sealed trait rtsps extends UriSchemes
  @scala.inline
  def rtsps: rtsps = "rtsps".asInstanceOf[rtsps]
  
  @js.native
  sealed trait rtspu extends UriSchemes
  @scala.inline
  def rtspu: rtspu = "rtspu".asInstanceOf[rtspu]
  
  @js.native
  sealed trait `saddle-stitch` extends Finishings
  @scala.inline
  def `saddle-stitch`: `saddle-stitch` = "saddle-stitch".asInstanceOf[`saddle-stitch`]
  
  @js.native
  sealed trait `same-order-face-down` extends PageDelivery
  @scala.inline
  def `same-order-face-down`: `same-order-face-down` = "same-order-face-down".asInstanceOf[`same-order-face-down`]
  
  @js.native
  sealed trait `same-order-face-up` extends PageDelivery
  @scala.inline
  def `same-order-face-up`: `same-order-face-up` = "same-order-face-up".asInstanceOf[`same-order-face-up`]
  
  @js.native
  sealed trait satin extends MediaCoating
  @scala.inline
  def satin: satin = "satin".asInstanceOf[satin]
  
  @js.native
  sealed trait saturation extends PrintRenderingIntent
  @scala.inline
  def saturation: saturation = "saturation".asInstanceOf[saturation]
  
  @js.native
  sealed trait `save-disposition-supported` extends StObject
  @scala.inline
  def `save-disposition-supported`: `save-disposition-supported` = "save-disposition-supported".asInstanceOf[`save-disposition-supported`]
  
  @js.native
  sealed trait `save-document-format-default` extends StObject
  @scala.inline
  def `save-document-format-default`: `save-document-format-default` = "save-document-format-default".asInstanceOf[`save-document-format-default`]
  
  @js.native
  sealed trait `save-document-format-supported` extends StObject
  @scala.inline
  def `save-document-format-supported`: `save-document-format-supported` = "save-document-format-supported".asInstanceOf[`save-document-format-supported`]
  
  @js.native
  sealed trait `save-location-default` extends StObject
  @scala.inline
  def `save-location-default`: `save-location-default` = "save-location-default".asInstanceOf[`save-location-default`]
  
  @js.native
  sealed trait `save-location-supported` extends StObject
  @scala.inline
  def `save-location-supported`: `save-location-supported` = "save-location-supported".asInstanceOf[`save-location-supported`]
  
  @js.native
  sealed trait `save-name-subdirectory-supported` extends StObject
  @scala.inline
  def `save-name-subdirectory-supported`: `save-name-subdirectory-supported` = "save-name-subdirectory-supported".asInstanceOf[`save-name-subdirectory-supported`]
  
  @js.native
  sealed trait `save-name-supported` extends StObject
  @scala.inline
  def `save-name-supported`: `save-name-supported` = "save-name-supported".asInstanceOf[`save-name-supported`]
  
  @js.native
  sealed trait `save-only` extends SaveDisposition
  @scala.inline
  def `save-only`: `save-only` = "save-only".asInstanceOf[`save-only`]
  
  @js.native
  sealed trait saved extends WhichJobs
  @scala.inline
  def saved: saved = "saved".asInstanceOf[saved]
  
  @js.native
  sealed trait scan extends PrinterServiceType
  @scala.inline
  def scan: scan = "scan".asInstanceOf[scan]
  
  @js.native
  sealed trait score extends TrimmingType
  @scala.inline
  def score: score = "score".asInstanceOf[score]
  
  @js.native
  sealed trait screen extends MediaType
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait `screen-paged` extends MediaType
  @scala.inline
  def `screen-paged`: `screen-paged` = "screen-paged".asInstanceOf[`screen-paged`]
  
  @js.native
  sealed trait `second-shift`
    extends JobDelayOutputUntil
       with JobHoldUntil
  @scala.inline
  def `second-shift`: `second-shift` = "second-shift".asInstanceOf[`second-shift`]
  
  @js.native
  sealed trait secondlife extends UriSchemes
  @scala.inline
  def secondlife: secondlife = "secondlife".asInstanceOf[secondlife]
  
  @js.native
  sealed trait `self-adhesive` extends MediaType
  @scala.inline
  def `self-adhesive`: `self-adhesive` = "self-adhesive".asInstanceOf[`self-adhesive`]
  
  @js.native
  sealed trait `self-adhesive-film` extends MediaType
  @scala.inline
  def `self-adhesive-film`: `self-adhesive-film` = "self-adhesive-film".asInstanceOf[`self-adhesive-film`]
  
  @js.native
  sealed trait `semi-gloss`
    extends CoatingType
       with LaminatingType
       with MediaCoating
  @scala.inline
  def `semi-gloss`: `semi-gloss` = "semi-gloss".asInstanceOf[`semi-gloss`]
  
  @js.native
  sealed trait `separate-documents-collated-copies` extends MultipleDocumentHandling
  @scala.inline
  def `separate-documents-collated-copies`: `separate-documents-collated-copies` = "separate-documents-collated-copies".asInstanceOf[`separate-documents-collated-copies`]
  
  @js.native
  sealed trait `separate-documents-uncollated-copies` extends MultipleDocumentHandling
  @scala.inline
  def `separate-documents-uncollated-copies`: `separate-documents-uncollated-copies` = "separate-documents-uncollated-copies".asInstanceOf[`separate-documents-uncollated-copies`]
  
  @js.native
  sealed trait `separation-cutter-added` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-added`: `separation-cutter-added` = "separation-cutter-added".asInstanceOf[`separation-cutter-added`]
  
  @js.native
  sealed trait `separation-cutter-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-almost-empty`: `separation-cutter-almost-empty` = "separation-cutter-almost-empty".asInstanceOf[`separation-cutter-almost-empty`]
  
  @js.native
  sealed trait `separation-cutter-almost-full` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-almost-full`: `separation-cutter-almost-full` = "separation-cutter-almost-full".asInstanceOf[`separation-cutter-almost-full`]
  
  @js.native
  sealed trait `separation-cutter-at-limit` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-at-limit`: `separation-cutter-at-limit` = "separation-cutter-at-limit".asInstanceOf[`separation-cutter-at-limit`]
  
  @js.native
  sealed trait `separation-cutter-closed` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-closed`: `separation-cutter-closed` = "separation-cutter-closed".asInstanceOf[`separation-cutter-closed`]
  
  @js.native
  sealed trait `separation-cutter-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-configuration-change`: `separation-cutter-configuration-change` = "separation-cutter-configuration-change".asInstanceOf[`separation-cutter-configuration-change`]
  
  @js.native
  sealed trait `separation-cutter-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-cover-closed`: `separation-cutter-cover-closed` = "separation-cutter-cover-closed".asInstanceOf[`separation-cutter-cover-closed`]
  
  @js.native
  sealed trait `separation-cutter-cover-open` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-cover-open`: `separation-cutter-cover-open` = "separation-cutter-cover-open".asInstanceOf[`separation-cutter-cover-open`]
  
  @js.native
  sealed trait `separation-cutter-empty` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-empty`: `separation-cutter-empty` = "separation-cutter-empty".asInstanceOf[`separation-cutter-empty`]
  
  @js.native
  sealed trait `separation-cutter-full` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-full`: `separation-cutter-full` = "separation-cutter-full".asInstanceOf[`separation-cutter-full`]
  
  @js.native
  sealed trait `separation-cutter-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-interlock-closed`: `separation-cutter-interlock-closed` = "separation-cutter-interlock-closed".asInstanceOf[`separation-cutter-interlock-closed`]
  
  @js.native
  sealed trait `separation-cutter-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-interlock-open`: `separation-cutter-interlock-open` = "separation-cutter-interlock-open".asInstanceOf[`separation-cutter-interlock-open`]
  
  @js.native
  sealed trait `separation-cutter-jam` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-jam`: `separation-cutter-jam` = "separation-cutter-jam".asInstanceOf[`separation-cutter-jam`]
  
  @js.native
  sealed trait `separation-cutter-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-life-almost-over`: `separation-cutter-life-almost-over` = "separation-cutter-life-almost-over".asInstanceOf[`separation-cutter-life-almost-over`]
  
  @js.native
  sealed trait `separation-cutter-life-over` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-life-over`: `separation-cutter-life-over` = "separation-cutter-life-over".asInstanceOf[`separation-cutter-life-over`]
  
  @js.native
  sealed trait `separation-cutter-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-memory-exhausted`: `separation-cutter-memory-exhausted` = "separation-cutter-memory-exhausted".asInstanceOf[`separation-cutter-memory-exhausted`]
  
  @js.native
  sealed trait `separation-cutter-missing` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-missing`: `separation-cutter-missing` = "separation-cutter-missing".asInstanceOf[`separation-cutter-missing`]
  
  @js.native
  sealed trait `separation-cutter-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-motor-failure`: `separation-cutter-motor-failure` = "separation-cutter-motor-failure".asInstanceOf[`separation-cutter-motor-failure`]
  
  @js.native
  sealed trait `separation-cutter-near-limit` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-near-limit`: `separation-cutter-near-limit` = "separation-cutter-near-limit".asInstanceOf[`separation-cutter-near-limit`]
  
  @js.native
  sealed trait `separation-cutter-offline` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-offline`: `separation-cutter-offline` = "separation-cutter-offline".asInstanceOf[`separation-cutter-offline`]
  
  @js.native
  sealed trait `separation-cutter-opened` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-opened`: `separation-cutter-opened` = "separation-cutter-opened".asInstanceOf[`separation-cutter-opened`]
  
  @js.native
  sealed trait `separation-cutter-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-over-temperature`: `separation-cutter-over-temperature` = "separation-cutter-over-temperature".asInstanceOf[`separation-cutter-over-temperature`]
  
  @js.native
  sealed trait `separation-cutter-power-saver` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-power-saver`: `separation-cutter-power-saver` = "separation-cutter-power-saver".asInstanceOf[`separation-cutter-power-saver`]
  
  @js.native
  sealed trait `separation-cutter-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-recoverable-failure`: `separation-cutter-recoverable-failure` = "separation-cutter-recoverable-failure".asInstanceOf[`separation-cutter-recoverable-failure`]
  
  @js.native
  sealed trait `separation-cutter-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-recoverable-storage-error`: `separation-cutter-recoverable-storage-error` = "separation-cutter-recoverable-storage-error".asInstanceOf[`separation-cutter-recoverable-storage-error`]
  
  @js.native
  sealed trait `separation-cutter-removed` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-removed`: `separation-cutter-removed` = "separation-cutter-removed".asInstanceOf[`separation-cutter-removed`]
  
  @js.native
  sealed trait `separation-cutter-resource-added` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-resource-added`: `separation-cutter-resource-added` = "separation-cutter-resource-added".asInstanceOf[`separation-cutter-resource-added`]
  
  @js.native
  sealed trait `separation-cutter-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-resource-removed`: `separation-cutter-resource-removed` = "separation-cutter-resource-removed".asInstanceOf[`separation-cutter-resource-removed`]
  
  @js.native
  sealed trait `separation-cutter-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-thermistor-failure`: `separation-cutter-thermistor-failure` = "separation-cutter-thermistor-failure".asInstanceOf[`separation-cutter-thermistor-failure`]
  
  @js.native
  sealed trait `separation-cutter-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-timing-failure`: `separation-cutter-timing-failure` = "separation-cutter-timing-failure".asInstanceOf[`separation-cutter-timing-failure`]
  
  @js.native
  sealed trait `separation-cutter-turned-off` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-turned-off`: `separation-cutter-turned-off` = "separation-cutter-turned-off".asInstanceOf[`separation-cutter-turned-off`]
  
  @js.native
  sealed trait `separation-cutter-turned-on` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-turned-on`: `separation-cutter-turned-on` = "separation-cutter-turned-on".asInstanceOf[`separation-cutter-turned-on`]
  
  @js.native
  sealed trait `separation-cutter-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-under-temperature`: `separation-cutter-under-temperature` = "separation-cutter-under-temperature".asInstanceOf[`separation-cutter-under-temperature`]
  
  @js.native
  sealed trait `separation-cutter-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-unrecoverable-failure`: `separation-cutter-unrecoverable-failure` = "separation-cutter-unrecoverable-failure".asInstanceOf[`separation-cutter-unrecoverable-failure`]
  
  @js.native
  sealed trait `separation-cutter-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-unrecoverable-storage-error`: `separation-cutter-unrecoverable-storage-error` = "separation-cutter-unrecoverable-storage-error".asInstanceOf[`separation-cutter-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `separation-cutter-warming-up` extends PrinterStateReasons
  @scala.inline
  def `separation-cutter-warming-up`: `separation-cutter-warming-up` = "separation-cutter-warming-up".asInstanceOf[`separation-cutter-warming-up`]
  
  @js.native
  sealed trait `separator-sheets` extends Overrides
  @scala.inline
  def `separator-sheets`: `separator-sheets` = "separator-sheets".asInstanceOf[`separator-sheets`]
  
  @js.native
  sealed trait `separator-sheets-actual` extends StObject
  @scala.inline
  def `separator-sheets-actual`: `separator-sheets-actual` = "separator-sheets-actual".asInstanceOf[`separator-sheets-actual`]
  
  @js.native
  sealed trait `separator-sheets-default` extends StObject
  @scala.inline
  def `separator-sheets-default`: `separator-sheets-default` = "separator-sheets-default".asInstanceOf[`separator-sheets-default`]
  
  @js.native
  sealed trait `separator-sheets-supported` extends StObject
  @scala.inline
  def `separator-sheets-supported`: `separator-sheets-supported` = "separator-sheets-supported".asInstanceOf[`separator-sheets-supported`]
  
  @js.native
  sealed trait `server-error-busy` extends StatusCode
  @scala.inline
  def `server-error-busy`: `server-error-busy` = "server-error-busy".asInstanceOf[`server-error-busy`]
  
  @js.native
  sealed trait `server-error-device-error` extends StatusCode
  @scala.inline
  def `server-error-device-error`: `server-error-device-error` = "server-error-device-error".asInstanceOf[`server-error-device-error`]
  
  @js.native
  sealed trait `server-error-internal-error` extends StatusCode
  @scala.inline
  def `server-error-internal-error`: `server-error-internal-error` = "server-error-internal-error".asInstanceOf[`server-error-internal-error`]
  
  @js.native
  sealed trait `server-error-job-canceled` extends StatusCode
  @scala.inline
  def `server-error-job-canceled`: `server-error-job-canceled` = "server-error-job-canceled".asInstanceOf[`server-error-job-canceled`]
  
  @js.native
  sealed trait `server-error-multiple-document-jobs-not-supported` extends StatusCode
  @scala.inline
  def `server-error-multiple-document-jobs-not-supported`: `server-error-multiple-document-jobs-not-supported` = "server-error-multiple-document-jobs-not-supported".asInstanceOf[`server-error-multiple-document-jobs-not-supported`]
  
  @js.native
  sealed trait `server-error-not-accepting-jobs` extends StatusCode
  @scala.inline
  def `server-error-not-accepting-jobs`: `server-error-not-accepting-jobs` = "server-error-not-accepting-jobs".asInstanceOf[`server-error-not-accepting-jobs`]
  
  @js.native
  sealed trait `server-error-operation-not-supported` extends StatusCode
  @scala.inline
  def `server-error-operation-not-supported`: `server-error-operation-not-supported` = "server-error-operation-not-supported".asInstanceOf[`server-error-operation-not-supported`]
  
  @js.native
  sealed trait `server-error-printer-is-deactivated` extends StatusCode
  @scala.inline
  def `server-error-printer-is-deactivated`: `server-error-printer-is-deactivated` = "server-error-printer-is-deactivated".asInstanceOf[`server-error-printer-is-deactivated`]
  
  @js.native
  sealed trait `server-error-service-unavailable` extends StatusCode
  @scala.inline
  def `server-error-service-unavailable`: `server-error-service-unavailable` = "server-error-service-unavailable".asInstanceOf[`server-error-service-unavailable`]
  
  @js.native
  sealed trait `server-error-temporary-error` extends StatusCode
  @scala.inline
  def `server-error-temporary-error`: `server-error-temporary-error` = "server-error-temporary-error".asInstanceOf[`server-error-temporary-error`]
  
  @js.native
  sealed trait `server-error-too-many-documents` extends StatusCode
  @scala.inline
  def `server-error-too-many-documents`: `server-error-too-many-documents` = "server-error-too-many-documents".asInstanceOf[`server-error-too-many-documents`]
  
  @js.native
  sealed trait `server-error-too-many-jobs` extends StatusCode
  @scala.inline
  def `server-error-too-many-jobs`: `server-error-too-many-jobs` = "server-error-too-many-jobs".asInstanceOf[`server-error-too-many-jobs`]
  
  @js.native
  sealed trait `server-error-version-not-supported` extends StatusCode
  @scala.inline
  def `server-error-version-not-supported`: `server-error-version-not-supported` = "server-error-version-not-supported".asInstanceOf[`server-error-version-not-supported`]
  
  @js.native
  sealed trait service extends UriSchemes
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait `service-off-line` extends JobStateReasons
  @scala.inline
  def `service-off-line`: `service-off-line` = "service-off-line".asInstanceOf[`service-off-line`]
  
  @js.native
  sealed trait session extends UriSchemes
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait sftp extends UriSchemes
  @scala.inline
  def sftp: sftp = "sftp".asInstanceOf[sftp]
  
  @js.native
  sealed trait sgn extends UriSchemes
  @scala.inline
  def sgn: sgn = "sgn".asInstanceOf[sgn]
  
  @js.native
  sealed trait sgray_1 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def sgray_1: sgray_1 = "sgray_1".asInstanceOf[sgray_1]
  
  @js.native
  sealed trait sgray_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def sgray_16: sgray_16 = "sgray_16".asInstanceOf[sgray_16]
  
  @js.native
  sealed trait sgray_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def sgray_8: sgray_8 = "sgray_8".asInstanceOf[sgray_8]
  
  @js.native
  sealed trait sha extends JobPasswordEncryption
  @scala.inline
  def sha: sha = "sha".asInstanceOf[sha]
  
  @js.native
  sealed trait `sha2-224` extends JobPasswordEncryption
  @scala.inline
  def `sha2-224`: `sha2-224` = "sha2-224".asInstanceOf[`sha2-224`]
  
  @js.native
  sealed trait `sha2-256` extends JobPasswordEncryption
  @scala.inline
  def `sha2-256`: `sha2-256` = "sha2-256".asInstanceOf[`sha2-256`]
  
  @js.native
  sealed trait `sha2-384` extends JobPasswordEncryption
  @scala.inline
  def `sha2-384`: `sha2-384` = "sha2-384".asInstanceOf[`sha2-384`]
  
  @js.native
  sealed trait `sha2-512` extends JobPasswordEncryption
  @scala.inline
  def `sha2-512`: `sha2-512` = "sha2-512".asInstanceOf[`sha2-512`]
  
  @js.native
  sealed trait `sha2-512_224` extends JobPasswordEncryption
  @scala.inline
  def `sha2-512_224`: `sha2-512_224` = "sha2-512_224".asInstanceOf[`sha2-512_224`]
  
  @js.native
  sealed trait `sha2-512_256` extends JobPasswordEncryption
  @scala.inline
  def `sha2-512_256`: `sha2-512_256` = "sha2-512_256".asInstanceOf[`sha2-512_256`]
  
  @js.native
  sealed trait `sha3-224` extends JobPasswordEncryption
  @scala.inline
  def `sha3-224`: `sha3-224` = "sha3-224".asInstanceOf[`sha3-224`]
  
  @js.native
  sealed trait `sha3-256` extends JobPasswordEncryption
  @scala.inline
  def `sha3-256`: `sha3-256` = "sha3-256".asInstanceOf[`sha3-256`]
  
  @js.native
  sealed trait `sha3-384` extends JobPasswordEncryption
  @scala.inline
  def `sha3-384`: `sha3-384` = "sha3-384".asInstanceOf[`sha3-384`]
  
  @js.native
  sealed trait `sha3-512` extends JobPasswordEncryption
  @scala.inline
  def `sha3-512`: `sha3-512` = "sha3-512".asInstanceOf[`sha3-512`]
  
  @js.native
  sealed trait `sha3-512_224` extends JobPasswordEncryption
  @scala.inline
  def `sha3-512_224`: `sha3-512_224` = "sha3-512_224".asInstanceOf[`sha3-512_224`]
  
  @js.native
  sealed trait `sha3-512_256` extends JobPasswordEncryption
  @scala.inline
  def `sha3-512_256`: `sha3-512_256` = "sha3-512_256".asInstanceOf[`sha3-512_256`]
  
  @js.native
  sealed trait `shake-128` extends JobPasswordEncryption
  @scala.inline
  def `shake-128`: `shake-128` = "shake-128".asInstanceOf[`shake-128`]
  
  @js.native
  sealed trait `shake-256` extends JobPasswordEncryption
  @scala.inline
  def `shake-256`: `shake-256` = "shake-256".asInstanceOf[`shake-256`]
  
  @js.native
  sealed trait `sheet-collate-actual` extends StObject
  @scala.inline
  def `sheet-collate-actual`: `sheet-collate-actual` = "sheet-collate-actual".asInstanceOf[`sheet-collate-actual`]
  
  @js.native
  sealed trait `sheet-rotator-added` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-added`: `sheet-rotator-added` = "sheet-rotator-added".asInstanceOf[`sheet-rotator-added`]
  
  @js.native
  sealed trait `sheet-rotator-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-almost-empty`: `sheet-rotator-almost-empty` = "sheet-rotator-almost-empty".asInstanceOf[`sheet-rotator-almost-empty`]
  
  @js.native
  sealed trait `sheet-rotator-almost-full` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-almost-full`: `sheet-rotator-almost-full` = "sheet-rotator-almost-full".asInstanceOf[`sheet-rotator-almost-full`]
  
  @js.native
  sealed trait `sheet-rotator-at-limit` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-at-limit`: `sheet-rotator-at-limit` = "sheet-rotator-at-limit".asInstanceOf[`sheet-rotator-at-limit`]
  
  @js.native
  sealed trait `sheet-rotator-closed` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-closed`: `sheet-rotator-closed` = "sheet-rotator-closed".asInstanceOf[`sheet-rotator-closed`]
  
  @js.native
  sealed trait `sheet-rotator-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-configuration-change`: `sheet-rotator-configuration-change` = "sheet-rotator-configuration-change".asInstanceOf[`sheet-rotator-configuration-change`]
  
  @js.native
  sealed trait `sheet-rotator-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-cover-closed`: `sheet-rotator-cover-closed` = "sheet-rotator-cover-closed".asInstanceOf[`sheet-rotator-cover-closed`]
  
  @js.native
  sealed trait `sheet-rotator-cover-open` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-cover-open`: `sheet-rotator-cover-open` = "sheet-rotator-cover-open".asInstanceOf[`sheet-rotator-cover-open`]
  
  @js.native
  sealed trait `sheet-rotator-empty` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-empty`: `sheet-rotator-empty` = "sheet-rotator-empty".asInstanceOf[`sheet-rotator-empty`]
  
  @js.native
  sealed trait `sheet-rotator-full` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-full`: `sheet-rotator-full` = "sheet-rotator-full".asInstanceOf[`sheet-rotator-full`]
  
  @js.native
  sealed trait `sheet-rotator-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-interlock-closed`: `sheet-rotator-interlock-closed` = "sheet-rotator-interlock-closed".asInstanceOf[`sheet-rotator-interlock-closed`]
  
  @js.native
  sealed trait `sheet-rotator-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-interlock-open`: `sheet-rotator-interlock-open` = "sheet-rotator-interlock-open".asInstanceOf[`sheet-rotator-interlock-open`]
  
  @js.native
  sealed trait `sheet-rotator-jam` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-jam`: `sheet-rotator-jam` = "sheet-rotator-jam".asInstanceOf[`sheet-rotator-jam`]
  
  @js.native
  sealed trait `sheet-rotator-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-life-almost-over`: `sheet-rotator-life-almost-over` = "sheet-rotator-life-almost-over".asInstanceOf[`sheet-rotator-life-almost-over`]
  
  @js.native
  sealed trait `sheet-rotator-life-over` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-life-over`: `sheet-rotator-life-over` = "sheet-rotator-life-over".asInstanceOf[`sheet-rotator-life-over`]
  
  @js.native
  sealed trait `sheet-rotator-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-memory-exhausted`: `sheet-rotator-memory-exhausted` = "sheet-rotator-memory-exhausted".asInstanceOf[`sheet-rotator-memory-exhausted`]
  
  @js.native
  sealed trait `sheet-rotator-missing` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-missing`: `sheet-rotator-missing` = "sheet-rotator-missing".asInstanceOf[`sheet-rotator-missing`]
  
  @js.native
  sealed trait `sheet-rotator-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-motor-failure`: `sheet-rotator-motor-failure` = "sheet-rotator-motor-failure".asInstanceOf[`sheet-rotator-motor-failure`]
  
  @js.native
  sealed trait `sheet-rotator-near-limit` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-near-limit`: `sheet-rotator-near-limit` = "sheet-rotator-near-limit".asInstanceOf[`sheet-rotator-near-limit`]
  
  @js.native
  sealed trait `sheet-rotator-offline` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-offline`: `sheet-rotator-offline` = "sheet-rotator-offline".asInstanceOf[`sheet-rotator-offline`]
  
  @js.native
  sealed trait `sheet-rotator-opened` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-opened`: `sheet-rotator-opened` = "sheet-rotator-opened".asInstanceOf[`sheet-rotator-opened`]
  
  @js.native
  sealed trait `sheet-rotator-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-over-temperature`: `sheet-rotator-over-temperature` = "sheet-rotator-over-temperature".asInstanceOf[`sheet-rotator-over-temperature`]
  
  @js.native
  sealed trait `sheet-rotator-power-saver` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-power-saver`: `sheet-rotator-power-saver` = "sheet-rotator-power-saver".asInstanceOf[`sheet-rotator-power-saver`]
  
  @js.native
  sealed trait `sheet-rotator-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-recoverable-failure`: `sheet-rotator-recoverable-failure` = "sheet-rotator-recoverable-failure".asInstanceOf[`sheet-rotator-recoverable-failure`]
  
  @js.native
  sealed trait `sheet-rotator-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-recoverable-storage-error`: `sheet-rotator-recoverable-storage-error` = "sheet-rotator-recoverable-storage-error".asInstanceOf[`sheet-rotator-recoverable-storage-error`]
  
  @js.native
  sealed trait `sheet-rotator-removed` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-removed`: `sheet-rotator-removed` = "sheet-rotator-removed".asInstanceOf[`sheet-rotator-removed`]
  
  @js.native
  sealed trait `sheet-rotator-resource-added` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-resource-added`: `sheet-rotator-resource-added` = "sheet-rotator-resource-added".asInstanceOf[`sheet-rotator-resource-added`]
  
  @js.native
  sealed trait `sheet-rotator-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-resource-removed`: `sheet-rotator-resource-removed` = "sheet-rotator-resource-removed".asInstanceOf[`sheet-rotator-resource-removed`]
  
  @js.native
  sealed trait `sheet-rotator-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-thermistor-failure`: `sheet-rotator-thermistor-failure` = "sheet-rotator-thermistor-failure".asInstanceOf[`sheet-rotator-thermistor-failure`]
  
  @js.native
  sealed trait `sheet-rotator-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-timing-failure`: `sheet-rotator-timing-failure` = "sheet-rotator-timing-failure".asInstanceOf[`sheet-rotator-timing-failure`]
  
  @js.native
  sealed trait `sheet-rotator-turned-off` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-turned-off`: `sheet-rotator-turned-off` = "sheet-rotator-turned-off".asInstanceOf[`sheet-rotator-turned-off`]
  
  @js.native
  sealed trait `sheet-rotator-turned-on` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-turned-on`: `sheet-rotator-turned-on` = "sheet-rotator-turned-on".asInstanceOf[`sheet-rotator-turned-on`]
  
  @js.native
  sealed trait `sheet-rotator-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-under-temperature`: `sheet-rotator-under-temperature` = "sheet-rotator-under-temperature".asInstanceOf[`sheet-rotator-under-temperature`]
  
  @js.native
  sealed trait `sheet-rotator-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-unrecoverable-failure`: `sheet-rotator-unrecoverable-failure` = "sheet-rotator-unrecoverable-failure".asInstanceOf[`sheet-rotator-unrecoverable-failure`]
  
  @js.native
  sealed trait `sheet-rotator-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-unrecoverable-storage-error`: `sheet-rotator-unrecoverable-storage-error` = "sheet-rotator-unrecoverable-storage-error".asInstanceOf[`sheet-rotator-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `sheet-rotator-warming-up` extends PrinterStateReasons
  @scala.inline
  def `sheet-rotator-warming-up`: `sheet-rotator-warming-up` = "sheet-rotator-warming-up".asInstanceOf[`sheet-rotator-warming-up`]
  
  @js.native
  sealed trait shell extends MaterialPurpose
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  
  @js.native
  sealed trait shift_jis extends CharacterSet
  @scala.inline
  def shift_jis: shift_jis = "shift_jis".asInstanceOf[shift_jis]
  
  @js.native
  sealed trait `short-edge-first` extends FeedOrientation
  @scala.inline
  def `short-edge-first`: `short-edge-first` = "short-edge-first".asInstanceOf[`short-edge-first`]
  
  @js.native
  sealed trait `shrink-foil` extends MediaType
  @scala.inline
  def `shrink-foil`: `shrink-foil` = "shrink-foil".asInstanceOf[`shrink-foil`]
  
  @js.native
  sealed trait `shrink-wrap` extends BalingType
  @scala.inline
  def `shrink-wrap`: `shrink-wrap` = "shrink-wrap".asInstanceOf[`shrink-wrap`]
  
  @js.native
  sealed trait shttp extends UriSchemes
  @scala.inline
  def shttp: shttp = "shttp".asInstanceOf[shttp]
  
  @js.native
  sealed trait shutdown extends PrinterStateReasons
  @scala.inline
  def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  
  @js.native
  sealed trait side
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
  @scala.inline
  def side: side = "side".asInstanceOf[side]
  
  @js.native
  sealed trait sides extends Overrides
  @scala.inline
  def sides: sides = "sides".asInstanceOf[sides]
  
  @js.native
  sealed trait `sides-actual` extends StObject
  @scala.inline
  def `sides-actual`: `sides-actual` = "sides-actual".asInstanceOf[`sides-actual`]
  
  @js.native
  sealed trait `sides-default` extends StObject
  @scala.inline
  def `sides-default`: `sides-default` = "sides-default".asInstanceOf[`sides-default`]
  
  @js.native
  sealed trait `sides-supported` extends StObject
  @scala.inline
  def `sides-supported`: `sides-supported` = "sides-supported".asInstanceOf[`sides-supported`]
  
  @js.native
  sealed trait sieve extends UriSchemes
  @scala.inline
  def sieve: sieve = "sieve".asInstanceOf[sieve]
  
  @js.native
  sealed trait signature extends ImpositionTemplate
  @scala.inline
  def signature: signature = "signature".asInstanceOf[signature]
  
  @js.native
  sealed trait silicone extends CoatingType
  @scala.inline
  def silicone: silicone = "silicone".asInstanceOf[silicone]
  
  @js.native
  sealed trait silver
    extends MaterialType
       with MediaColor
  @scala.inline
  def silver: silver = "silver".asInstanceOf[silver]
  
  @js.native
  sealed trait simpleledger extends UriSchemes
  @scala.inline
  def simpleledger: simpleledger = "simpleledger".asInstanceOf[simpleledger]
  
  @js.native
  sealed trait `single-document` extends MultipleDocumentHandling
  @scala.inline
  def `single-document`: `single-document` = "single-document".asInstanceOf[`single-document`]
  
  @js.native
  sealed trait `single-document-new-sheet` extends MultipleDocumentHandling
  @scala.inline
  def `single-document-new-sheet`: `single-document-new-sheet` = "single-document-new-sheet".asInstanceOf[`single-document-new-sheet`]
  
  @js.native
  sealed trait `single-face` extends MediaType
  @scala.inline
  def `single-face`: `single-face` = "single-face".asInstanceOf[`single-face`]
  
  @js.native
  sealed trait `single-wall` extends MediaType
  @scala.inline
  def `single-wall`: `single-wall` = "single-wall".asInstanceOf[`single-wall`]
  
  @js.native
  sealed trait sip extends UriSchemes
  @scala.inline
  def sip: sip = "sip".asInstanceOf[sip]
  
  @js.native
  sealed trait sips extends UriSchemes
  @scala.inline
  def sips: sips = "sips".asInstanceOf[sips]
  
  @js.native
  sealed trait skirt extends PrintBase
  @scala.inline
  def skirt: skirt = "skirt".asInstanceOf[skirt]
  
  @js.native
  sealed trait skype extends UriSchemes
  @scala.inline
  def skype: skype = "skype".asInstanceOf[skype]
  
  @js.native
  sealed trait sleeve extends MediaType
  @scala.inline
  def sleeve: sleeve = "sleeve".asInstanceOf[sleeve]
  
  @js.native
  sealed trait `slip-sheets` extends SeparatorSheetsType
  @scala.inline
  def `slip-sheets`: `slip-sheets` = "slip-sheets".asInstanceOf[`slip-sheets`]
  
  @js.native
  sealed trait `slitter-added` extends PrinterStateReasons
  @scala.inline
  def `slitter-added`: `slitter-added` = "slitter-added".asInstanceOf[`slitter-added`]
  
  @js.native
  sealed trait `slitter-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `slitter-almost-empty`: `slitter-almost-empty` = "slitter-almost-empty".asInstanceOf[`slitter-almost-empty`]
  
  @js.native
  sealed trait `slitter-almost-full` extends PrinterStateReasons
  @scala.inline
  def `slitter-almost-full`: `slitter-almost-full` = "slitter-almost-full".asInstanceOf[`slitter-almost-full`]
  
  @js.native
  sealed trait `slitter-at-limit` extends PrinterStateReasons
  @scala.inline
  def `slitter-at-limit`: `slitter-at-limit` = "slitter-at-limit".asInstanceOf[`slitter-at-limit`]
  
  @js.native
  sealed trait `slitter-closed` extends PrinterStateReasons
  @scala.inline
  def `slitter-closed`: `slitter-closed` = "slitter-closed".asInstanceOf[`slitter-closed`]
  
  @js.native
  sealed trait `slitter-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `slitter-configuration-change`: `slitter-configuration-change` = "slitter-configuration-change".asInstanceOf[`slitter-configuration-change`]
  
  @js.native
  sealed trait `slitter-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `slitter-cover-closed`: `slitter-cover-closed` = "slitter-cover-closed".asInstanceOf[`slitter-cover-closed`]
  
  @js.native
  sealed trait `slitter-cover-open` extends PrinterStateReasons
  @scala.inline
  def `slitter-cover-open`: `slitter-cover-open` = "slitter-cover-open".asInstanceOf[`slitter-cover-open`]
  
  @js.native
  sealed trait `slitter-empty` extends PrinterStateReasons
  @scala.inline
  def `slitter-empty`: `slitter-empty` = "slitter-empty".asInstanceOf[`slitter-empty`]
  
  @js.native
  sealed trait `slitter-full` extends PrinterStateReasons
  @scala.inline
  def `slitter-full`: `slitter-full` = "slitter-full".asInstanceOf[`slitter-full`]
  
  @js.native
  sealed trait `slitter-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `slitter-interlock-closed`: `slitter-interlock-closed` = "slitter-interlock-closed".asInstanceOf[`slitter-interlock-closed`]
  
  @js.native
  sealed trait `slitter-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `slitter-interlock-open`: `slitter-interlock-open` = "slitter-interlock-open".asInstanceOf[`slitter-interlock-open`]
  
  @js.native
  sealed trait `slitter-jam` extends PrinterStateReasons
  @scala.inline
  def `slitter-jam`: `slitter-jam` = "slitter-jam".asInstanceOf[`slitter-jam`]
  
  @js.native
  sealed trait `slitter-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `slitter-life-almost-over`: `slitter-life-almost-over` = "slitter-life-almost-over".asInstanceOf[`slitter-life-almost-over`]
  
  @js.native
  sealed trait `slitter-life-over` extends PrinterStateReasons
  @scala.inline
  def `slitter-life-over`: `slitter-life-over` = "slitter-life-over".asInstanceOf[`slitter-life-over`]
  
  @js.native
  sealed trait `slitter-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `slitter-memory-exhausted`: `slitter-memory-exhausted` = "slitter-memory-exhausted".asInstanceOf[`slitter-memory-exhausted`]
  
  @js.native
  sealed trait `slitter-missing` extends PrinterStateReasons
  @scala.inline
  def `slitter-missing`: `slitter-missing` = "slitter-missing".asInstanceOf[`slitter-missing`]
  
  @js.native
  sealed trait `slitter-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `slitter-motor-failure`: `slitter-motor-failure` = "slitter-motor-failure".asInstanceOf[`slitter-motor-failure`]
  
  @js.native
  sealed trait `slitter-near-limit` extends PrinterStateReasons
  @scala.inline
  def `slitter-near-limit`: `slitter-near-limit` = "slitter-near-limit".asInstanceOf[`slitter-near-limit`]
  
  @js.native
  sealed trait `slitter-offline` extends PrinterStateReasons
  @scala.inline
  def `slitter-offline`: `slitter-offline` = "slitter-offline".asInstanceOf[`slitter-offline`]
  
  @js.native
  sealed trait `slitter-opened` extends PrinterStateReasons
  @scala.inline
  def `slitter-opened`: `slitter-opened` = "slitter-opened".asInstanceOf[`slitter-opened`]
  
  @js.native
  sealed trait `slitter-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `slitter-over-temperature`: `slitter-over-temperature` = "slitter-over-temperature".asInstanceOf[`slitter-over-temperature`]
  
  @js.native
  sealed trait `slitter-power-saver` extends PrinterStateReasons
  @scala.inline
  def `slitter-power-saver`: `slitter-power-saver` = "slitter-power-saver".asInstanceOf[`slitter-power-saver`]
  
  @js.native
  sealed trait `slitter-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `slitter-recoverable-failure`: `slitter-recoverable-failure` = "slitter-recoverable-failure".asInstanceOf[`slitter-recoverable-failure`]
  
  @js.native
  sealed trait `slitter-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `slitter-recoverable-storage-error`: `slitter-recoverable-storage-error` = "slitter-recoverable-storage-error".asInstanceOf[`slitter-recoverable-storage-error`]
  
  @js.native
  sealed trait `slitter-removed` extends PrinterStateReasons
  @scala.inline
  def `slitter-removed`: `slitter-removed` = "slitter-removed".asInstanceOf[`slitter-removed`]
  
  @js.native
  sealed trait `slitter-resource-added` extends PrinterStateReasons
  @scala.inline
  def `slitter-resource-added`: `slitter-resource-added` = "slitter-resource-added".asInstanceOf[`slitter-resource-added`]
  
  @js.native
  sealed trait `slitter-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `slitter-resource-removed`: `slitter-resource-removed` = "slitter-resource-removed".asInstanceOf[`slitter-resource-removed`]
  
  @js.native
  sealed trait `slitter-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `slitter-thermistor-failure`: `slitter-thermistor-failure` = "slitter-thermistor-failure".asInstanceOf[`slitter-thermistor-failure`]
  
  @js.native
  sealed trait `slitter-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `slitter-timing-failure`: `slitter-timing-failure` = "slitter-timing-failure".asInstanceOf[`slitter-timing-failure`]
  
  @js.native
  sealed trait `slitter-turned-off` extends PrinterStateReasons
  @scala.inline
  def `slitter-turned-off`: `slitter-turned-off` = "slitter-turned-off".asInstanceOf[`slitter-turned-off`]
  
  @js.native
  sealed trait `slitter-turned-on` extends PrinterStateReasons
  @scala.inline
  def `slitter-turned-on`: `slitter-turned-on` = "slitter-turned-on".asInstanceOf[`slitter-turned-on`]
  
  @js.native
  sealed trait `slitter-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `slitter-under-temperature`: `slitter-under-temperature` = "slitter-under-temperature".asInstanceOf[`slitter-under-temperature`]
  
  @js.native
  sealed trait `slitter-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `slitter-unrecoverable-failure`: `slitter-unrecoverable-failure` = "slitter-unrecoverable-failure".asInstanceOf[`slitter-unrecoverable-failure`]
  
  @js.native
  sealed trait `slitter-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `slitter-unrecoverable-storage-error`: `slitter-unrecoverable-storage-error` = "slitter-unrecoverable-storage-error".asInstanceOf[`slitter-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `slitter-warming-up` extends PrinterStateReasons
  @scala.inline
  def `slitter-warming-up`: `slitter-warming-up` = "slitter-warming-up".asInstanceOf[`slitter-warming-up`]
  
  @js.native
  sealed trait smb extends UriSchemes
  @scala.inline
  def smb: smb = "smb".asInstanceOf[smb]
  
  @js.native
  sealed trait `smi2699-auth-print-group` extends StObject
  @scala.inline
  def `smi2699-auth-print-group`: `smi2699-auth-print-group` = "smi2699-auth-print-group".asInstanceOf[`smi2699-auth-print-group`]
  
  @js.native
  sealed trait `smi2699-auth-proxy-group` extends StObject
  @scala.inline
  def `smi2699-auth-proxy-group`: `smi2699-auth-proxy-group` = "smi2699-auth-proxy-group".asInstanceOf[`smi2699-auth-proxy-group`]
  
  @js.native
  sealed trait `smi2699-device-command` extends StObject
  @scala.inline
  def `smi2699-device-command`: `smi2699-device-command` = "smi2699-device-command".asInstanceOf[`smi2699-device-command`]
  
  @js.native
  sealed trait `smi2699-device-format` extends StObject
  @scala.inline
  def `smi2699-device-format`: `smi2699-device-format` = "smi2699-device-format".asInstanceOf[`smi2699-device-format`]
  
  @js.native
  sealed trait `smi2699-device-name` extends StObject
  @scala.inline
  def `smi2699-device-name`: `smi2699-device-name` = "smi2699-device-name".asInstanceOf[`smi2699-device-name`]
  
  @js.native
  sealed trait `smi2699-device-uri` extends StObject
  @scala.inline
  def `smi2699-device-uri`: `smi2699-device-uri` = "smi2699-device-uri".asInstanceOf[`smi2699-device-uri`]
  
  @js.native
  sealed trait smime extends DocumentDigitalSignature
  @scala.inline
  def smime: smime = "smime".asInstanceOf[smime]
  
  @js.native
  sealed trait smooth extends MediaTooth
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait sms extends UriSchemes
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait smtp extends UriSchemes
  @scala.inline
  def smtp: smtp = "smtp".asInstanceOf[smtp]
  
  @js.native
  sealed trait snews extends UriSchemes
  @scala.inline
  def snews: snews = "snews".asInstanceOf[snews]
  
  @js.native
  sealed trait snmp extends UriSchemes
  @scala.inline
  def snmp: snmp = "snmp".asInstanceOf[snmp]
  
  @js.native
  sealed trait sntp extends SystemTimeoutSource
  @scala.inline
  def sntp: sntp = "sntp".asInstanceOf[sntp]
  
  @js.native
  sealed trait soapDotbeep extends UriSchemes
  @scala.inline
  def soapDotbeep: soapDotbeep = "soap.beep".asInstanceOf[soapDotbeep]
  
  @js.native
  sealed trait soapDotbeeps extends UriSchemes
  @scala.inline
  def soapDotbeeps: soapDotbeeps = "soap.beeps".asInstanceOf[soapDotbeeps]
  
  @js.native
  sealed trait soldat extends UriSchemes
  @scala.inline
  def soldat: soldat = "soldat".asInstanceOf[soldat]
  
  @js.native
  sealed trait sound extends IdentifyActions
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
  
  @js.native
  sealed trait speak extends IdentifyActions
  @scala.inline
  def speak: speak = "speak".asInstanceOf[speak]
  
  @js.native
  sealed trait spiffe extends UriSchemes
  @scala.inline
  def spiffe: spiffe = "spiffe".asInstanceOf[spiffe]
  
  @js.native
  sealed trait spiral extends BindingType
  @scala.inline
  def spiral: spiral = "spiral".asInstanceOf[spiral]
  
  @js.native
  sealed trait spool extends StObject
  @scala.inline
  def spool: spool = "spool".asInstanceOf[spool]
  
  @js.native
  sealed trait `spool-area-full` extends PrinterStateReasons
  @scala.inline
  def `spool-area-full`: `spool-area-full` = "spool-area-full".asInstanceOf[`spool-area-full`]
  
  @js.native
  sealed trait spotify extends UriSchemes
  @scala.inline
  def spotify: spotify = "spotify".asInstanceOf[spotify]
  
  @js.native
  sealed trait srgb_16 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def srgb_16: srgb_16 = "srgb_16".asInstanceOf[srgb_16]
  
  @js.native
  sealed trait srgb_8 extends PwgRasterDocumentTypeSupported
  @scala.inline
  def srgb_8: srgb_8 = "srgb_8".asInstanceOf[srgb_8]
  
  @js.native
  sealed trait ssh extends UriSchemes
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
  
  @js.native
  sealed trait ssl3 extends XriSecurity
  @scala.inline
  def ssl3: ssl3 = "ssl3".asInstanceOf[ssl3]
  
  @js.native
  sealed trait `stacker-1` extends OutputBin
  @scala.inline
  def `stacker-1`: `stacker-1` = "stacker-1".asInstanceOf[`stacker-1`]
  
  @js.native
  sealed trait `stacker-10` extends OutputBin
  @scala.inline
  def `stacker-10`: `stacker-10` = "stacker-10".asInstanceOf[`stacker-10`]
  
  @js.native
  sealed trait `stacker-2` extends OutputBin
  @scala.inline
  def `stacker-2`: `stacker-2` = "stacker-2".asInstanceOf[`stacker-2`]
  
  @js.native
  sealed trait `stacker-3` extends OutputBin
  @scala.inline
  def `stacker-3`: `stacker-3` = "stacker-3".asInstanceOf[`stacker-3`]
  
  @js.native
  sealed trait `stacker-4` extends OutputBin
  @scala.inline
  def `stacker-4`: `stacker-4` = "stacker-4".asInstanceOf[`stacker-4`]
  
  @js.native
  sealed trait `stacker-5` extends OutputBin
  @scala.inline
  def `stacker-5`: `stacker-5` = "stacker-5".asInstanceOf[`stacker-5`]
  
  @js.native
  sealed trait `stacker-6` extends OutputBin
  @scala.inline
  def `stacker-6`: `stacker-6` = "stacker-6".asInstanceOf[`stacker-6`]
  
  @js.native
  sealed trait `stacker-7` extends OutputBin
  @scala.inline
  def `stacker-7`: `stacker-7` = "stacker-7".asInstanceOf[`stacker-7`]
  
  @js.native
  sealed trait `stacker-8` extends OutputBin
  @scala.inline
  def `stacker-8`: `stacker-8` = "stacker-8".asInstanceOf[`stacker-8`]
  
  @js.native
  sealed trait `stacker-9` extends OutputBin
  @scala.inline
  def `stacker-9`: `stacker-9` = "stacker-9".asInstanceOf[`stacker-9`]
  
  @js.native
  sealed trait `stacker-added` extends PrinterStateReasons
  @scala.inline
  def `stacker-added`: `stacker-added` = "stacker-added".asInstanceOf[`stacker-added`]
  
  @js.native
  sealed trait `stacker-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `stacker-almost-empty`: `stacker-almost-empty` = "stacker-almost-empty".asInstanceOf[`stacker-almost-empty`]
  
  @js.native
  sealed trait `stacker-almost-full` extends PrinterStateReasons
  @scala.inline
  def `stacker-almost-full`: `stacker-almost-full` = "stacker-almost-full".asInstanceOf[`stacker-almost-full`]
  
  @js.native
  sealed trait `stacker-at-limit` extends PrinterStateReasons
  @scala.inline
  def `stacker-at-limit`: `stacker-at-limit` = "stacker-at-limit".asInstanceOf[`stacker-at-limit`]
  
  @js.native
  sealed trait `stacker-closed` extends PrinterStateReasons
  @scala.inline
  def `stacker-closed`: `stacker-closed` = "stacker-closed".asInstanceOf[`stacker-closed`]
  
  @js.native
  sealed trait `stacker-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `stacker-configuration-change`: `stacker-configuration-change` = "stacker-configuration-change".asInstanceOf[`stacker-configuration-change`]
  
  @js.native
  sealed trait `stacker-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `stacker-cover-closed`: `stacker-cover-closed` = "stacker-cover-closed".asInstanceOf[`stacker-cover-closed`]
  
  @js.native
  sealed trait `stacker-cover-open` extends PrinterStateReasons
  @scala.inline
  def `stacker-cover-open`: `stacker-cover-open` = "stacker-cover-open".asInstanceOf[`stacker-cover-open`]
  
  @js.native
  sealed trait `stacker-empty` extends PrinterStateReasons
  @scala.inline
  def `stacker-empty`: `stacker-empty` = "stacker-empty".asInstanceOf[`stacker-empty`]
  
  @js.native
  sealed trait `stacker-full` extends PrinterStateReasons
  @scala.inline
  def `stacker-full`: `stacker-full` = "stacker-full".asInstanceOf[`stacker-full`]
  
  @js.native
  sealed trait `stacker-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `stacker-interlock-closed`: `stacker-interlock-closed` = "stacker-interlock-closed".asInstanceOf[`stacker-interlock-closed`]
  
  @js.native
  sealed trait `stacker-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `stacker-interlock-open`: `stacker-interlock-open` = "stacker-interlock-open".asInstanceOf[`stacker-interlock-open`]
  
  @js.native
  sealed trait `stacker-jam` extends PrinterStateReasons
  @scala.inline
  def `stacker-jam`: `stacker-jam` = "stacker-jam".asInstanceOf[`stacker-jam`]
  
  @js.native
  sealed trait `stacker-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `stacker-life-almost-over`: `stacker-life-almost-over` = "stacker-life-almost-over".asInstanceOf[`stacker-life-almost-over`]
  
  @js.native
  sealed trait `stacker-life-over` extends PrinterStateReasons
  @scala.inline
  def `stacker-life-over`: `stacker-life-over` = "stacker-life-over".asInstanceOf[`stacker-life-over`]
  
  @js.native
  sealed trait `stacker-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `stacker-memory-exhausted`: `stacker-memory-exhausted` = "stacker-memory-exhausted".asInstanceOf[`stacker-memory-exhausted`]
  
  @js.native
  sealed trait `stacker-missing` extends PrinterStateReasons
  @scala.inline
  def `stacker-missing`: `stacker-missing` = "stacker-missing".asInstanceOf[`stacker-missing`]
  
  @js.native
  sealed trait `stacker-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `stacker-motor-failure`: `stacker-motor-failure` = "stacker-motor-failure".asInstanceOf[`stacker-motor-failure`]
  
  @js.native
  sealed trait `stacker-near-limit` extends PrinterStateReasons
  @scala.inline
  def `stacker-near-limit`: `stacker-near-limit` = "stacker-near-limit".asInstanceOf[`stacker-near-limit`]
  
  @js.native
  sealed trait `stacker-offline` extends PrinterStateReasons
  @scala.inline
  def `stacker-offline`: `stacker-offline` = "stacker-offline".asInstanceOf[`stacker-offline`]
  
  @js.native
  sealed trait `stacker-opened` extends PrinterStateReasons
  @scala.inline
  def `stacker-opened`: `stacker-opened` = "stacker-opened".asInstanceOf[`stacker-opened`]
  
  @js.native
  sealed trait `stacker-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `stacker-over-temperature`: `stacker-over-temperature` = "stacker-over-temperature".asInstanceOf[`stacker-over-temperature`]
  
  @js.native
  sealed trait `stacker-power-saver` extends PrinterStateReasons
  @scala.inline
  def `stacker-power-saver`: `stacker-power-saver` = "stacker-power-saver".asInstanceOf[`stacker-power-saver`]
  
  @js.native
  sealed trait `stacker-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `stacker-recoverable-failure`: `stacker-recoverable-failure` = "stacker-recoverable-failure".asInstanceOf[`stacker-recoverable-failure`]
  
  @js.native
  sealed trait `stacker-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `stacker-recoverable-storage-error`: `stacker-recoverable-storage-error` = "stacker-recoverable-storage-error".asInstanceOf[`stacker-recoverable-storage-error`]
  
  @js.native
  sealed trait `stacker-removed` extends PrinterStateReasons
  @scala.inline
  def `stacker-removed`: `stacker-removed` = "stacker-removed".asInstanceOf[`stacker-removed`]
  
  @js.native
  sealed trait `stacker-resource-added` extends PrinterStateReasons
  @scala.inline
  def `stacker-resource-added`: `stacker-resource-added` = "stacker-resource-added".asInstanceOf[`stacker-resource-added`]
  
  @js.native
  sealed trait `stacker-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `stacker-resource-removed`: `stacker-resource-removed` = "stacker-resource-removed".asInstanceOf[`stacker-resource-removed`]
  
  @js.native
  sealed trait `stacker-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `stacker-thermistor-failure`: `stacker-thermistor-failure` = "stacker-thermistor-failure".asInstanceOf[`stacker-thermistor-failure`]
  
  @js.native
  sealed trait `stacker-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `stacker-timing-failure`: `stacker-timing-failure` = "stacker-timing-failure".asInstanceOf[`stacker-timing-failure`]
  
  @js.native
  sealed trait `stacker-turned-off` extends PrinterStateReasons
  @scala.inline
  def `stacker-turned-off`: `stacker-turned-off` = "stacker-turned-off".asInstanceOf[`stacker-turned-off`]
  
  @js.native
  sealed trait `stacker-turned-on` extends PrinterStateReasons
  @scala.inline
  def `stacker-turned-on`: `stacker-turned-on` = "stacker-turned-on".asInstanceOf[`stacker-turned-on`]
  
  @js.native
  sealed trait `stacker-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `stacker-under-temperature`: `stacker-under-temperature` = "stacker-under-temperature".asInstanceOf[`stacker-under-temperature`]
  
  @js.native
  sealed trait `stacker-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `stacker-unrecoverable-failure`: `stacker-unrecoverable-failure` = "stacker-unrecoverable-failure".asInstanceOf[`stacker-unrecoverable-failure`]
  
  @js.native
  sealed trait `stacker-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `stacker-unrecoverable-storage-error`: `stacker-unrecoverable-storage-error` = "stacker-unrecoverable-storage-error".asInstanceOf[`stacker-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `stacker-warming-up` extends PrinterStateReasons
  @scala.inline
  def `stacker-warming-up`: `stacker-warming-up` = "stacker-warming-up".asInstanceOf[`stacker-warming-up`]
  
  @js.native
  sealed trait standard
    extends JobSheets
       with MediaRecycled
       with PrintBase
       with PrintSupports
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait standby extends PowerState
  @scala.inline
  def standby: standby = "standby".asInstanceOf[standby]
  
  @js.native
  sealed trait `standby-vendor1` extends PowerState
  @scala.inline
  def `standby-vendor1`: `standby-vendor1` = "standby-vendor1".asInstanceOf[`standby-vendor1`]
  
  @js.native
  sealed trait `standby-vendor2` extends PowerState
  @scala.inline
  def `standby-vendor2`: `standby-vendor2` = "standby-vendor2".asInstanceOf[`standby-vendor2`]
  
  @js.native
  sealed trait `standby-vendor3` extends PowerState
  @scala.inline
  def `standby-vendor3`: `standby-vendor3` = "standby-vendor3".asInstanceOf[`standby-vendor3`]
  
  @js.native
  sealed trait `standby-vendor4` extends PowerState
  @scala.inline
  def `standby-vendor4`: `standby-vendor4` = "standby-vendor4".asInstanceOf[`standby-vendor4`]
  
  @js.native
  sealed trait `standby-vendor5` extends PowerState
  @scala.inline
  def `standby-vendor5`: `standby-vendor5` = "standby-vendor5".asInstanceOf[`standby-vendor5`]
  
  @js.native
  sealed trait staple extends Finishings
  @scala.inline
  def staple: staple = "staple".asInstanceOf[staple]
  
  @js.native
  sealed trait `staple-bottom-left` extends Finishings
  @scala.inline
  def `staple-bottom-left`: `staple-bottom-left` = "staple-bottom-left".asInstanceOf[`staple-bottom-left`]
  
  @js.native
  sealed trait `staple-bottom-right` extends Finishings
  @scala.inline
  def `staple-bottom-right`: `staple-bottom-right` = "staple-bottom-right".asInstanceOf[`staple-bottom-right`]
  
  @js.native
  sealed trait `staple-dual-bottom` extends Finishings
  @scala.inline
  def `staple-dual-bottom`: `staple-dual-bottom` = "staple-dual-bottom".asInstanceOf[`staple-dual-bottom`]
  
  @js.native
  sealed trait `staple-dual-left` extends Finishings
  @scala.inline
  def `staple-dual-left`: `staple-dual-left` = "staple-dual-left".asInstanceOf[`staple-dual-left`]
  
  @js.native
  sealed trait `staple-dual-right` extends Finishings
  @scala.inline
  def `staple-dual-right`: `staple-dual-right` = "staple-dual-right".asInstanceOf[`staple-dual-right`]
  
  @js.native
  sealed trait `staple-dual-top` extends Finishings
  @scala.inline
  def `staple-dual-top`: `staple-dual-top` = "staple-dual-top".asInstanceOf[`staple-dual-top`]
  
  @js.native
  sealed trait `staple-top-left` extends Finishings
  @scala.inline
  def `staple-top-left`: `staple-top-left` = "staple-top-left".asInstanceOf[`staple-top-left`]
  
  @js.native
  sealed trait `staple-top-right` extends Finishings
  @scala.inline
  def `staple-top-right`: `staple-top-right` = "staple-top-right".asInstanceOf[`staple-top-right`]
  
  @js.native
  sealed trait `staple-triple-bottom` extends Finishings
  @scala.inline
  def `staple-triple-bottom`: `staple-triple-bottom` = "staple-triple-bottom".asInstanceOf[`staple-triple-bottom`]
  
  @js.native
  sealed trait `staple-triple-left` extends Finishings
  @scala.inline
  def `staple-triple-left`: `staple-triple-left` = "staple-triple-left".asInstanceOf[`staple-triple-left`]
  
  @js.native
  sealed trait `staple-triple-right` extends Finishings
  @scala.inline
  def `staple-triple-right`: `staple-triple-right` = "staple-triple-right".asInstanceOf[`staple-triple-right`]
  
  @js.native
  sealed trait `staple-triple-top` extends Finishings
  @scala.inline
  def `staple-triple-top`: `staple-triple-top` = "staple-triple-top".asInstanceOf[`staple-triple-top`]
  
  @js.native
  sealed trait `stapler-added` extends PrinterStateReasons
  @scala.inline
  def `stapler-added`: `stapler-added` = "stapler-added".asInstanceOf[`stapler-added`]
  
  @js.native
  sealed trait `stapler-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `stapler-almost-empty`: `stapler-almost-empty` = "stapler-almost-empty".asInstanceOf[`stapler-almost-empty`]
  
  @js.native
  sealed trait `stapler-almost-full` extends PrinterStateReasons
  @scala.inline
  def `stapler-almost-full`: `stapler-almost-full` = "stapler-almost-full".asInstanceOf[`stapler-almost-full`]
  
  @js.native
  sealed trait `stapler-at-limit` extends PrinterStateReasons
  @scala.inline
  def `stapler-at-limit`: `stapler-at-limit` = "stapler-at-limit".asInstanceOf[`stapler-at-limit`]
  
  @js.native
  sealed trait `stapler-closed` extends PrinterStateReasons
  @scala.inline
  def `stapler-closed`: `stapler-closed` = "stapler-closed".asInstanceOf[`stapler-closed`]
  
  @js.native
  sealed trait `stapler-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `stapler-configuration-change`: `stapler-configuration-change` = "stapler-configuration-change".asInstanceOf[`stapler-configuration-change`]
  
  @js.native
  sealed trait `stapler-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `stapler-cover-closed`: `stapler-cover-closed` = "stapler-cover-closed".asInstanceOf[`stapler-cover-closed`]
  
  @js.native
  sealed trait `stapler-cover-open` extends PrinterStateReasons
  @scala.inline
  def `stapler-cover-open`: `stapler-cover-open` = "stapler-cover-open".asInstanceOf[`stapler-cover-open`]
  
  @js.native
  sealed trait `stapler-empty` extends PrinterStateReasons
  @scala.inline
  def `stapler-empty`: `stapler-empty` = "stapler-empty".asInstanceOf[`stapler-empty`]
  
  @js.native
  sealed trait `stapler-full` extends PrinterStateReasons
  @scala.inline
  def `stapler-full`: `stapler-full` = "stapler-full".asInstanceOf[`stapler-full`]
  
  @js.native
  sealed trait `stapler-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `stapler-interlock-closed`: `stapler-interlock-closed` = "stapler-interlock-closed".asInstanceOf[`stapler-interlock-closed`]
  
  @js.native
  sealed trait `stapler-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `stapler-interlock-open`: `stapler-interlock-open` = "stapler-interlock-open".asInstanceOf[`stapler-interlock-open`]
  
  @js.native
  sealed trait `stapler-jam` extends PrinterStateReasons
  @scala.inline
  def `stapler-jam`: `stapler-jam` = "stapler-jam".asInstanceOf[`stapler-jam`]
  
  @js.native
  sealed trait `stapler-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `stapler-life-almost-over`: `stapler-life-almost-over` = "stapler-life-almost-over".asInstanceOf[`stapler-life-almost-over`]
  
  @js.native
  sealed trait `stapler-life-over` extends PrinterStateReasons
  @scala.inline
  def `stapler-life-over`: `stapler-life-over` = "stapler-life-over".asInstanceOf[`stapler-life-over`]
  
  @js.native
  sealed trait `stapler-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `stapler-memory-exhausted`: `stapler-memory-exhausted` = "stapler-memory-exhausted".asInstanceOf[`stapler-memory-exhausted`]
  
  @js.native
  sealed trait `stapler-missing` extends PrinterStateReasons
  @scala.inline
  def `stapler-missing`: `stapler-missing` = "stapler-missing".asInstanceOf[`stapler-missing`]
  
  @js.native
  sealed trait `stapler-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `stapler-motor-failure`: `stapler-motor-failure` = "stapler-motor-failure".asInstanceOf[`stapler-motor-failure`]
  
  @js.native
  sealed trait `stapler-near-limit` extends PrinterStateReasons
  @scala.inline
  def `stapler-near-limit`: `stapler-near-limit` = "stapler-near-limit".asInstanceOf[`stapler-near-limit`]
  
  @js.native
  sealed trait `stapler-offline` extends PrinterStateReasons
  @scala.inline
  def `stapler-offline`: `stapler-offline` = "stapler-offline".asInstanceOf[`stapler-offline`]
  
  @js.native
  sealed trait `stapler-opened` extends PrinterStateReasons
  @scala.inline
  def `stapler-opened`: `stapler-opened` = "stapler-opened".asInstanceOf[`stapler-opened`]
  
  @js.native
  sealed trait `stapler-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `stapler-over-temperature`: `stapler-over-temperature` = "stapler-over-temperature".asInstanceOf[`stapler-over-temperature`]
  
  @js.native
  sealed trait `stapler-power-saver` extends PrinterStateReasons
  @scala.inline
  def `stapler-power-saver`: `stapler-power-saver` = "stapler-power-saver".asInstanceOf[`stapler-power-saver`]
  
  @js.native
  sealed trait `stapler-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `stapler-recoverable-failure`: `stapler-recoverable-failure` = "stapler-recoverable-failure".asInstanceOf[`stapler-recoverable-failure`]
  
  @js.native
  sealed trait `stapler-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `stapler-recoverable-storage-error`: `stapler-recoverable-storage-error` = "stapler-recoverable-storage-error".asInstanceOf[`stapler-recoverable-storage-error`]
  
  @js.native
  sealed trait `stapler-removed` extends PrinterStateReasons
  @scala.inline
  def `stapler-removed`: `stapler-removed` = "stapler-removed".asInstanceOf[`stapler-removed`]
  
  @js.native
  sealed trait `stapler-resource-added` extends PrinterStateReasons
  @scala.inline
  def `stapler-resource-added`: `stapler-resource-added` = "stapler-resource-added".asInstanceOf[`stapler-resource-added`]
  
  @js.native
  sealed trait `stapler-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `stapler-resource-removed`: `stapler-resource-removed` = "stapler-resource-removed".asInstanceOf[`stapler-resource-removed`]
  
  @js.native
  sealed trait `stapler-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `stapler-thermistor-failure`: `stapler-thermistor-failure` = "stapler-thermistor-failure".asInstanceOf[`stapler-thermistor-failure`]
  
  @js.native
  sealed trait `stapler-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `stapler-timing-failure`: `stapler-timing-failure` = "stapler-timing-failure".asInstanceOf[`stapler-timing-failure`]
  
  @js.native
  sealed trait `stapler-turned-off` extends PrinterStateReasons
  @scala.inline
  def `stapler-turned-off`: `stapler-turned-off` = "stapler-turned-off".asInstanceOf[`stapler-turned-off`]
  
  @js.native
  sealed trait `stapler-turned-on` extends PrinterStateReasons
  @scala.inline
  def `stapler-turned-on`: `stapler-turned-on` = "stapler-turned-on".asInstanceOf[`stapler-turned-on`]
  
  @js.native
  sealed trait `stapler-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `stapler-under-temperature`: `stapler-under-temperature` = "stapler-under-temperature".asInstanceOf[`stapler-under-temperature`]
  
  @js.native
  sealed trait `stapler-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `stapler-unrecoverable-failure`: `stapler-unrecoverable-failure` = "stapler-unrecoverable-failure".asInstanceOf[`stapler-unrecoverable-failure`]
  
  @js.native
  sealed trait `stapler-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `stapler-unrecoverable-storage-error`: `stapler-unrecoverable-storage-error` = "stapler-unrecoverable-storage-error".asInstanceOf[`stapler-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `stapler-warming-up` extends PrinterStateReasons
  @scala.inline
  def `stapler-warming-up`: `stapler-warming-up` = "stapler-warming-up".asInstanceOf[`stapler-warming-up`]
  
  @js.native
  sealed trait `start-sheet` extends SeparatorSheetsType
  @scala.inline
  def `start-sheet`: `start-sheet` = "start-sheet".asInstanceOf[`start-sheet`]
  
  @js.native
  sealed trait `static-font` extends ResourceType
  @scala.inline
  def `static-font`: `static-font` = "static-font".asInstanceOf[`static-font`]
  
  @js.native
  sealed trait `static-form` extends ResourceType
  @scala.inline
  def `static-form`: `static-form` = "static-form".asInstanceOf[`static-form`]
  
  @js.native
  sealed trait `static-icc-profile` extends ResourceType
  @scala.inline
  def `static-icc-profile`: `static-icc-profile` = "static-icc-profile".asInstanceOf[`static-icc-profile`]
  
  @js.native
  sealed trait `static-image` extends ResourceType
  @scala.inline
  def `static-image`: `static-image` = "static-image".asInstanceOf[`static-image`]
  
  @js.native
  sealed trait `static-logo` extends ResourceType
  @scala.inline
  def `static-logo`: `static-logo` = "static-logo".asInstanceOf[`static-logo`]
  
  @js.native
  sealed trait `static-other` extends ResourceType
  @scala.inline
  def `static-other`: `static-other` = "static-other".asInstanceOf[`static-other`]
  
  @js.native
  sealed trait `static-strings` extends ResourceType
  @scala.inline
  def `static-strings`: `static-strings` = "static-strings".asInstanceOf[`static-strings`]
  
  @js.native
  sealed trait stationery extends MediaType
  @scala.inline
  def stationery: stationery = "stationery".asInstanceOf[stationery]
  
  @js.native
  sealed trait `stationery-archival` extends MediaType
  @scala.inline
  def `stationery-archival`: `stationery-archival` = "stationery-archival".asInstanceOf[`stationery-archival`]
  
  @js.native
  sealed trait `stationery-coated` extends MediaType
  @scala.inline
  def `stationery-coated`: `stationery-coated` = "stationery-coated".asInstanceOf[`stationery-coated`]
  
  @js.native
  sealed trait `stationery-cotton` extends MediaType
  @scala.inline
  def `stationery-cotton`: `stationery-cotton` = "stationery-cotton".asInstanceOf[`stationery-cotton`]
  
  @js.native
  sealed trait `stationery-fine` extends MediaType
  @scala.inline
  def `stationery-fine`: `stationery-fine` = "stationery-fine".asInstanceOf[`stationery-fine`]
  
  @js.native
  sealed trait `stationery-heavyweight` extends MediaType
  @scala.inline
  def `stationery-heavyweight`: `stationery-heavyweight` = "stationery-heavyweight".asInstanceOf[`stationery-heavyweight`]
  
  @js.native
  sealed trait `stationery-heavyweight-coated` extends MediaType
  @scala.inline
  def `stationery-heavyweight-coated`: `stationery-heavyweight-coated` = "stationery-heavyweight-coated".asInstanceOf[`stationery-heavyweight-coated`]
  
  @js.native
  sealed trait `stationery-inkjet` extends MediaType
  @scala.inline
  def `stationery-inkjet`: `stationery-inkjet` = "stationery-inkjet".asInstanceOf[`stationery-inkjet`]
  
  @js.native
  sealed trait `stationery-letterhead` extends MediaType
  @scala.inline
  def `stationery-letterhead`: `stationery-letterhead` = "stationery-letterhead".asInstanceOf[`stationery-letterhead`]
  
  @js.native
  sealed trait `stationery-lightweight` extends MediaType
  @scala.inline
  def `stationery-lightweight`: `stationery-lightweight` = "stationery-lightweight".asInstanceOf[`stationery-lightweight`]
  
  @js.native
  sealed trait `stationery-preprinted` extends MediaType
  @scala.inline
  def `stationery-preprinted`: `stationery-preprinted` = "stationery-preprinted".asInstanceOf[`stationery-preprinted`]
  
  @js.native
  sealed trait `stationery-prepunched` extends MediaType
  @scala.inline
  def `stationery-prepunched`: `stationery-prepunched` = "stationery-prepunched".asInstanceOf[`stationery-prepunched`]
  
  @js.native
  sealed trait steam extends UriSchemes
  @scala.inline
  def steam: steam = "steam".asInstanceOf[steam]
  
  @js.native
  sealed trait stipple extends MediaTooth
  @scala.inline
  def stipple: stipple = "stipple".asInstanceOf[stipple]
  
  @js.native
  sealed trait `stitcher-added` extends PrinterStateReasons
  @scala.inline
  def `stitcher-added`: `stitcher-added` = "stitcher-added".asInstanceOf[`stitcher-added`]
  
  @js.native
  sealed trait `stitcher-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `stitcher-almost-empty`: `stitcher-almost-empty` = "stitcher-almost-empty".asInstanceOf[`stitcher-almost-empty`]
  
  @js.native
  sealed trait `stitcher-almost-full` extends PrinterStateReasons
  @scala.inline
  def `stitcher-almost-full`: `stitcher-almost-full` = "stitcher-almost-full".asInstanceOf[`stitcher-almost-full`]
  
  @js.native
  sealed trait `stitcher-at-limit` extends PrinterStateReasons
  @scala.inline
  def `stitcher-at-limit`: `stitcher-at-limit` = "stitcher-at-limit".asInstanceOf[`stitcher-at-limit`]
  
  @js.native
  sealed trait `stitcher-closed` extends PrinterStateReasons
  @scala.inline
  def `stitcher-closed`: `stitcher-closed` = "stitcher-closed".asInstanceOf[`stitcher-closed`]
  
  @js.native
  sealed trait `stitcher-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `stitcher-configuration-change`: `stitcher-configuration-change` = "stitcher-configuration-change".asInstanceOf[`stitcher-configuration-change`]
  
  @js.native
  sealed trait `stitcher-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `stitcher-cover-closed`: `stitcher-cover-closed` = "stitcher-cover-closed".asInstanceOf[`stitcher-cover-closed`]
  
  @js.native
  sealed trait `stitcher-cover-open` extends PrinterStateReasons
  @scala.inline
  def `stitcher-cover-open`: `stitcher-cover-open` = "stitcher-cover-open".asInstanceOf[`stitcher-cover-open`]
  
  @js.native
  sealed trait `stitcher-empty` extends PrinterStateReasons
  @scala.inline
  def `stitcher-empty`: `stitcher-empty` = "stitcher-empty".asInstanceOf[`stitcher-empty`]
  
  @js.native
  sealed trait `stitcher-full` extends PrinterStateReasons
  @scala.inline
  def `stitcher-full`: `stitcher-full` = "stitcher-full".asInstanceOf[`stitcher-full`]
  
  @js.native
  sealed trait `stitcher-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `stitcher-interlock-closed`: `stitcher-interlock-closed` = "stitcher-interlock-closed".asInstanceOf[`stitcher-interlock-closed`]
  
  @js.native
  sealed trait `stitcher-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `stitcher-interlock-open`: `stitcher-interlock-open` = "stitcher-interlock-open".asInstanceOf[`stitcher-interlock-open`]
  
  @js.native
  sealed trait `stitcher-jam` extends PrinterStateReasons
  @scala.inline
  def `stitcher-jam`: `stitcher-jam` = "stitcher-jam".asInstanceOf[`stitcher-jam`]
  
  @js.native
  sealed trait `stitcher-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `stitcher-life-almost-over`: `stitcher-life-almost-over` = "stitcher-life-almost-over".asInstanceOf[`stitcher-life-almost-over`]
  
  @js.native
  sealed trait `stitcher-life-over` extends PrinterStateReasons
  @scala.inline
  def `stitcher-life-over`: `stitcher-life-over` = "stitcher-life-over".asInstanceOf[`stitcher-life-over`]
  
  @js.native
  sealed trait `stitcher-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `stitcher-memory-exhausted`: `stitcher-memory-exhausted` = "stitcher-memory-exhausted".asInstanceOf[`stitcher-memory-exhausted`]
  
  @js.native
  sealed trait `stitcher-missing` extends PrinterStateReasons
  @scala.inline
  def `stitcher-missing`: `stitcher-missing` = "stitcher-missing".asInstanceOf[`stitcher-missing`]
  
  @js.native
  sealed trait `stitcher-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `stitcher-motor-failure`: `stitcher-motor-failure` = "stitcher-motor-failure".asInstanceOf[`stitcher-motor-failure`]
  
  @js.native
  sealed trait `stitcher-near-limit` extends PrinterStateReasons
  @scala.inline
  def `stitcher-near-limit`: `stitcher-near-limit` = "stitcher-near-limit".asInstanceOf[`stitcher-near-limit`]
  
  @js.native
  sealed trait `stitcher-offline` extends PrinterStateReasons
  @scala.inline
  def `stitcher-offline`: `stitcher-offline` = "stitcher-offline".asInstanceOf[`stitcher-offline`]
  
  @js.native
  sealed trait `stitcher-opened` extends PrinterStateReasons
  @scala.inline
  def `stitcher-opened`: `stitcher-opened` = "stitcher-opened".asInstanceOf[`stitcher-opened`]
  
  @js.native
  sealed trait `stitcher-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `stitcher-over-temperature`: `stitcher-over-temperature` = "stitcher-over-temperature".asInstanceOf[`stitcher-over-temperature`]
  
  @js.native
  sealed trait `stitcher-power-saver` extends PrinterStateReasons
  @scala.inline
  def `stitcher-power-saver`: `stitcher-power-saver` = "stitcher-power-saver".asInstanceOf[`stitcher-power-saver`]
  
  @js.native
  sealed trait `stitcher-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `stitcher-recoverable-failure`: `stitcher-recoverable-failure` = "stitcher-recoverable-failure".asInstanceOf[`stitcher-recoverable-failure`]
  
  @js.native
  sealed trait `stitcher-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `stitcher-recoverable-storage-error`: `stitcher-recoverable-storage-error` = "stitcher-recoverable-storage-error".asInstanceOf[`stitcher-recoverable-storage-error`]
  
  @js.native
  sealed trait `stitcher-removed` extends PrinterStateReasons
  @scala.inline
  def `stitcher-removed`: `stitcher-removed` = "stitcher-removed".asInstanceOf[`stitcher-removed`]
  
  @js.native
  sealed trait `stitcher-resource-added` extends PrinterStateReasons
  @scala.inline
  def `stitcher-resource-added`: `stitcher-resource-added` = "stitcher-resource-added".asInstanceOf[`stitcher-resource-added`]
  
  @js.native
  sealed trait `stitcher-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `stitcher-resource-removed`: `stitcher-resource-removed` = "stitcher-resource-removed".asInstanceOf[`stitcher-resource-removed`]
  
  @js.native
  sealed trait `stitcher-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `stitcher-thermistor-failure`: `stitcher-thermistor-failure` = "stitcher-thermistor-failure".asInstanceOf[`stitcher-thermistor-failure`]
  
  @js.native
  sealed trait `stitcher-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `stitcher-timing-failure`: `stitcher-timing-failure` = "stitcher-timing-failure".asInstanceOf[`stitcher-timing-failure`]
  
  @js.native
  sealed trait `stitcher-turned-off` extends PrinterStateReasons
  @scala.inline
  def `stitcher-turned-off`: `stitcher-turned-off` = "stitcher-turned-off".asInstanceOf[`stitcher-turned-off`]
  
  @js.native
  sealed trait `stitcher-turned-on` extends PrinterStateReasons
  @scala.inline
  def `stitcher-turned-on`: `stitcher-turned-on` = "stitcher-turned-on".asInstanceOf[`stitcher-turned-on`]
  
  @js.native
  sealed trait `stitcher-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `stitcher-under-temperature`: `stitcher-under-temperature` = "stitcher-under-temperature".asInstanceOf[`stitcher-under-temperature`]
  
  @js.native
  sealed trait `stitcher-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `stitcher-unrecoverable-failure`: `stitcher-unrecoverable-failure` = "stitcher-unrecoverable-failure".asInstanceOf[`stitcher-unrecoverable-failure`]
  
  @js.native
  sealed trait `stitcher-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `stitcher-unrecoverable-storage-error`: `stitcher-unrecoverable-storage-error` = "stitcher-unrecoverable-storage-error".asInstanceOf[`stitcher-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `stitcher-warming-up` extends PrinterStateReasons
  @scala.inline
  def `stitcher-warming-up`: `stitcher-warming-up` = "stitcher-warming-up".asInstanceOf[`stitcher-warming-up`]
  
  @js.native
  sealed trait stitching extends StObject
  @scala.inline
  def stitching: stitching = "stitching".asInstanceOf[stitching]
  
  @js.native
  sealed trait `stitching-angle-supported` extends StObject
  @scala.inline
  def `stitching-angle-supported`: `stitching-angle-supported` = "stitching-angle-supported".asInstanceOf[`stitching-angle-supported`]
  
  @js.native
  sealed trait `stitching-locations-supported` extends StObject
  @scala.inline
  def `stitching-locations-supported`: `stitching-locations-supported` = "stitching-locations-supported".asInstanceOf[`stitching-locations-supported`]
  
  @js.native
  sealed trait `stitching-method-supported` extends StObject
  @scala.inline
  def `stitching-method-supported`: `stitching-method-supported` = "stitching-method-supported".asInstanceOf[`stitching-method-supported`]
  
  @js.native
  sealed trait `stitching-offset-supported` extends StObject
  @scala.inline
  def `stitching-offset-supported`: `stitching-offset-supported` = "stitching-offset-supported".asInstanceOf[`stitching-offset-supported`]
  
  @js.native
  sealed trait `stitching-reference-edge-supported` extends StObject
  @scala.inline
  def `stitching-reference-edge-supported`: `stitching-reference-edge-supported` = "stitching-reference-edge-supported".asInstanceOf[`stitching-reference-edge-supported`]
  
  @js.native
  sealed trait stopped
    extends PrinterState
       with SystemState
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait `stopped-partly` extends PrinterStateReasons
  @scala.inline
  def `stopped-partly`: `stopped-partly` = "stopped-partly".asInstanceOf[`stopped-partly`]
  
  @js.native
  sealed trait stopping extends PrinterStateReasons
  @scala.inline
  def stopping: stopping = "stopping".asInstanceOf[stopping]
  
  @js.native
  sealed trait stream extends StObject
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait stun extends UriSchemes
  @scala.inline
  def stun: stun = "stun".asInstanceOf[stun]
  
  @js.native
  sealed trait stuns extends UriSchemes
  @scala.inline
  def stuns: stuns = "stuns".asInstanceOf[stuns]
  
  @js.native
  sealed trait `subject-supported` extends StObject
  @scala.inline
  def `subject-supported`: `subject-supported` = "subject-supported".asInstanceOf[`subject-supported`]
  
  @js.native
  sealed trait `submission-interrupted`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `submission-interrupted`: `submission-interrupted` = "submission-interrupted".asInstanceOf[`submission-interrupted`]
  
  @js.native
  sealed trait submit extends UriSchemes
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait `subordinate-printers-supported` extends StObject
  @scala.inline
  def `subordinate-printers-supported`: `subordinate-printers-supported` = "subordinate-printers-supported".asInstanceOf[`subordinate-printers-supported`]
  
  @js.native
  sealed trait `subscription-object` extends StObject
  @scala.inline
  def `subscription-object`: `subscription-object` = "subscription-object".asInstanceOf[`subscription-object`]
  
  @js.native
  sealed trait `subscription-privacy-attributes` extends StObject
  @scala.inline
  def `subscription-privacy-attributes`: `subscription-privacy-attributes` = "subscription-privacy-attributes".asInstanceOf[`subscription-privacy-attributes`]
  
  @js.native
  sealed trait `subscription-privacy-scope` extends StObject
  @scala.inline
  def `subscription-privacy-scope`: `subscription-privacy-scope` = "subscription-privacy-scope".asInstanceOf[`subscription-privacy-scope`]
  
  @js.native
  sealed trait `subunit-added` extends PrinterStateReasons
  @scala.inline
  def `subunit-added`: `subunit-added` = "subunit-added".asInstanceOf[`subunit-added`]
  
  @js.native
  sealed trait `subunit-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `subunit-almost-empty`: `subunit-almost-empty` = "subunit-almost-empty".asInstanceOf[`subunit-almost-empty`]
  
  @js.native
  sealed trait `subunit-almost-full` extends PrinterStateReasons
  @scala.inline
  def `subunit-almost-full`: `subunit-almost-full` = "subunit-almost-full".asInstanceOf[`subunit-almost-full`]
  
  @js.native
  sealed trait `subunit-at-limit` extends PrinterStateReasons
  @scala.inline
  def `subunit-at-limit`: `subunit-at-limit` = "subunit-at-limit".asInstanceOf[`subunit-at-limit`]
  
  @js.native
  sealed trait `subunit-closed` extends PrinterStateReasons
  @scala.inline
  def `subunit-closed`: `subunit-closed` = "subunit-closed".asInstanceOf[`subunit-closed`]
  
  @js.native
  sealed trait `subunit-empty` extends PrinterStateReasons
  @scala.inline
  def `subunit-empty`: `subunit-empty` = "subunit-empty".asInstanceOf[`subunit-empty`]
  
  @js.native
  sealed trait `subunit-full` extends PrinterStateReasons
  @scala.inline
  def `subunit-full`: `subunit-full` = "subunit-full".asInstanceOf[`subunit-full`]
  
  @js.native
  sealed trait `subunit-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `subunit-life-almost-over`: `subunit-life-almost-over` = "subunit-life-almost-over".asInstanceOf[`subunit-life-almost-over`]
  
  @js.native
  sealed trait `subunit-life-over` extends PrinterStateReasons
  @scala.inline
  def `subunit-life-over`: `subunit-life-over` = "subunit-life-over".asInstanceOf[`subunit-life-over`]
  
  @js.native
  sealed trait `subunit-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `subunit-memory-exhausted`: `subunit-memory-exhausted` = "subunit-memory-exhausted".asInstanceOf[`subunit-memory-exhausted`]
  
  @js.native
  sealed trait `subunit-missing` extends PrinterStateReasons
  @scala.inline
  def `subunit-missing`: `subunit-missing` = "subunit-missing".asInstanceOf[`subunit-missing`]
  
  @js.native
  sealed trait `subunit-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `subunit-motor-failure`: `subunit-motor-failure` = "subunit-motor-failure".asInstanceOf[`subunit-motor-failure`]
  
  @js.native
  sealed trait `subunit-near-limit` extends PrinterStateReasons
  @scala.inline
  def `subunit-near-limit`: `subunit-near-limit` = "subunit-near-limit".asInstanceOf[`subunit-near-limit`]
  
  @js.native
  sealed trait `subunit-offline` extends PrinterStateReasons
  @scala.inline
  def `subunit-offline`: `subunit-offline` = "subunit-offline".asInstanceOf[`subunit-offline`]
  
  @js.native
  sealed trait `subunit-opened` extends PrinterStateReasons
  @scala.inline
  def `subunit-opened`: `subunit-opened` = "subunit-opened".asInstanceOf[`subunit-opened`]
  
  @js.native
  sealed trait `subunit-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `subunit-over-temperature`: `subunit-over-temperature` = "subunit-over-temperature".asInstanceOf[`subunit-over-temperature`]
  
  @js.native
  sealed trait `subunit-power-saver` extends PrinterStateReasons
  @scala.inline
  def `subunit-power-saver`: `subunit-power-saver` = "subunit-power-saver".asInstanceOf[`subunit-power-saver`]
  
  @js.native
  sealed trait `subunit-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `subunit-recoverable-failure`: `subunit-recoverable-failure` = "subunit-recoverable-failure".asInstanceOf[`subunit-recoverable-failure`]
  
  @js.native
  sealed trait `subunit-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `subunit-recoverable-storage-error`: `subunit-recoverable-storage-error` = "subunit-recoverable-storage-error".asInstanceOf[`subunit-recoverable-storage-error`]
  
  @js.native
  sealed trait `subunit-removed` extends PrinterStateReasons
  @scala.inline
  def `subunit-removed`: `subunit-removed` = "subunit-removed".asInstanceOf[`subunit-removed`]
  
  @js.native
  sealed trait `subunit-resource-added` extends PrinterStateReasons
  @scala.inline
  def `subunit-resource-added`: `subunit-resource-added` = "subunit-resource-added".asInstanceOf[`subunit-resource-added`]
  
  @js.native
  sealed trait `subunit-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `subunit-resource-removed`: `subunit-resource-removed` = "subunit-resource-removed".asInstanceOf[`subunit-resource-removed`]
  
  @js.native
  sealed trait `subunit-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `subunit-thermistor-failure`: `subunit-thermistor-failure` = "subunit-thermistor-failure".asInstanceOf[`subunit-thermistor-failure`]
  
  @js.native
  sealed trait `subunit-timing-Failure` extends PrinterStateReasons
  @scala.inline
  def `subunit-timing-Failure`: `subunit-timing-Failure` = "subunit-timing-Failure".asInstanceOf[`subunit-timing-Failure`]
  
  @js.native
  sealed trait `subunit-turned-off` extends PrinterStateReasons
  @scala.inline
  def `subunit-turned-off`: `subunit-turned-off` = "subunit-turned-off".asInstanceOf[`subunit-turned-off`]
  
  @js.native
  sealed trait `subunit-turned-on` extends PrinterStateReasons
  @scala.inline
  def `subunit-turned-on`: `subunit-turned-on` = "subunit-turned-on".asInstanceOf[`subunit-turned-on`]
  
  @js.native
  sealed trait `subunit-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `subunit-under-temperature`: `subunit-under-temperature` = "subunit-under-temperature".asInstanceOf[`subunit-under-temperature`]
  
  @js.native
  sealed trait `subunit-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `subunit-unrecoverable-failure`: `subunit-unrecoverable-failure` = "subunit-unrecoverable-failure".asInstanceOf[`subunit-unrecoverable-failure`]
  
  @js.native
  sealed trait `subunit-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `subunit-unrecoverable-storage-error`: `subunit-unrecoverable-storage-error` = "subunit-unrecoverable-storage-error".asInstanceOf[`subunit-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `subunit-warming-up` extends PrinterStateReasons
  @scala.inline
  def `subunit-warming-up`: `subunit-warming-up` = "subunit-warming-up".asInstanceOf[`subunit-warming-up`]
  
  @js.native
  sealed trait `successful-ok` extends StatusCode
  @scala.inline
  def `successful-ok`: `successful-ok` = "successful-ok".asInstanceOf[`successful-ok`]
  
  @js.native
  sealed trait `successful-ok-conflicting-attributes` extends StatusCode
  @scala.inline
  def `successful-ok-conflicting-attributes`: `successful-ok-conflicting-attributes` = "successful-ok-conflicting-attributes".asInstanceOf[`successful-ok-conflicting-attributes`]
  
  @js.native
  sealed trait `successful-ok-events-complete` extends StatusCode
  @scala.inline
  def `successful-ok-events-complete`: `successful-ok-events-complete` = "successful-ok-events-complete".asInstanceOf[`successful-ok-events-complete`]
  
  @js.native
  sealed trait `successful-ok-ignored-or-substituted-attributes` extends StatusCode
  @scala.inline
  def `successful-ok-ignored-or-substituted-attributes`: `successful-ok-ignored-or-substituted-attributes` = "successful-ok-ignored-or-substituted-attributes".asInstanceOf[`successful-ok-ignored-or-substituted-attributes`]
  
  @js.native
  sealed trait `successful-ok-ignored-subscriptions` extends StatusCode
  @scala.inline
  def `successful-ok-ignored-subscriptions`: `successful-ok-ignored-subscriptions` = "successful-ok-ignored-subscriptions".asInstanceOf[`successful-ok-ignored-subscriptions`]
  
  @js.native
  sealed trait `successful-ok-too-many-events` extends StatusCode
  @scala.inline
  def `successful-ok-too-many-events`: `successful-ok-too-many-events` = "successful-ok-too-many-events".asInstanceOf[`successful-ok-too-many-events`]
  
  @js.native
  sealed trait `super-b`
    extends Media
       with MediaSizeName
  @scala.inline
  def `super-b`: `super-b` = "super-b".asInstanceOf[`super-b`]
  
  @js.native
  sealed trait support extends MaterialPurpose
  @scala.inline
  def support: support = "support".asInstanceOf[support]
  
  @js.native
  sealed trait suspend extends PowerState
  @scala.inline
  def suspend: suspend = "suspend".asInstanceOf[suspend]
  
  @js.native
  sealed trait `suspend-job` extends JobErrorAction
  @scala.inline
  def `suspend-job`: `suspend-job` = "suspend-job".asInstanceOf[`suspend-job`]
  
  @js.native
  sealed trait `suspend-vendor1` extends PowerState
  @scala.inline
  def `suspend-vendor1`: `suspend-vendor1` = "suspend-vendor1".asInstanceOf[`suspend-vendor1`]
  
  @js.native
  sealed trait `suspend-vendor2` extends PowerState
  @scala.inline
  def `suspend-vendor2`: `suspend-vendor2` = "suspend-vendor2".asInstanceOf[`suspend-vendor2`]
  
  @js.native
  sealed trait `suspend-vendor3` extends PowerState
  @scala.inline
  def `suspend-vendor3`: `suspend-vendor3` = "suspend-vendor3".asInstanceOf[`suspend-vendor3`]
  
  @js.native
  sealed trait `suspend-vendor4` extends PowerState
  @scala.inline
  def `suspend-vendor4`: `suspend-vendor4` = "suspend-vendor4".asInstanceOf[`suspend-vendor4`]
  
  @js.native
  sealed trait `suspend-vendor5` extends PowerState
  @scala.inline
  def `suspend-vendor5`: `suspend-vendor5` = "suspend-vendor5".asInstanceOf[`suspend-vendor5`]
  
  @js.native
  sealed trait svn extends UriSchemes
  @scala.inline
  def svn: svn = "svn".asInstanceOf[svn]
  
  @js.native
  sealed trait `system-object` extends StObject
  @scala.inline
  def `system-object`: `system-object` = "system-object".asInstanceOf[`system-object`]
  
  @js.native
  sealed trait `system-specified` extends PageDelivery
  @scala.inline
  def `system-specified`: `system-specified` = "system-specified".asInstanceOf[`system-specified`]
  
  @js.native
  sealed trait tab extends TrimmingType
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait `tab-stock` extends MediaType
  @scala.inline
  def `tab-stock`: `tab-stock` = "tab-stock".asInstanceOf[`tab-stock`]
  
  @js.native
  sealed trait tabloid
    extends Media
       with MediaSizeName
  @scala.inline
  def tabloid: tabloid = "tabloid".asInstanceOf[tabloid]
  
  @js.native
  sealed trait tag extends UriSchemes
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
  
  @js.native
  sealed trait tape extends BindingType
  @scala.inline
  def tape: tape = "tape".asInstanceOf[tape]
  
  @js.native
  sealed trait teamspeak extends UriSchemes
  @scala.inline
  def teamspeak: teamspeak = "teamspeak".asInstanceOf[teamspeak]
  
  @js.native
  sealed trait tel extends UriSchemes
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait teliaeid extends UriSchemes
  @scala.inline
  def teliaeid: teliaeid = "teliaeid".asInstanceOf[teliaeid]
  
  @js.native
  sealed trait telnet extends UriSchemes
  @scala.inline
  def telnet: telnet = "telnet".asInstanceOf[telnet]
  
  @js.native
  sealed trait `template-document` extends ResourceType
  @scala.inline
  def `template-document`: `template-document` = "template-document".asInstanceOf[`template-document`]
  
  @js.native
  sealed trait `template-job` extends ResourceType
  @scala.inline
  def `template-job`: `template-job` = "template-job".asInstanceOf[`template-job`]
  
  @js.native
  sealed trait `template-printer` extends ResourceType
  @scala.inline
  def `template-printer`: `template-printer` = "template-printer".asInstanceOf[`template-printer`]
  
  @js.native
  sealed trait text
    extends InputContentType
       with PrintContentOptimize
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `text-and-graphic` extends PrintContentOptimize
  @scala.inline
  def `text-and-graphic`: `text-and-graphic` = "text-and-graphic".asInstanceOf[`text-and-graphic`]
  
  @js.native
  sealed trait `text-and-photo` extends InputContentType
  @scala.inline
  def `text-and-photo`: `text-and-photo` = "text-and-photo".asInstanceOf[`text-and-photo`]
  
  @js.native
  sealed trait textSlashhtml extends MimeMediaType
  @scala.inline
  def textSlashhtml: textSlashhtml = "text/html".asInstanceOf[textSlashhtml]
  
  @js.native
  sealed trait textSlashplain extends MimeMediaType
  @scala.inline
  def textSlashplain: textSlashplain = "text/plain".asInstanceOf[textSlashplain]
  
  @js.native
  sealed trait textSlashrichtext extends MimeMediaType
  @scala.inline
  def textSlashrichtext: textSlashrichtext = "text/richtext".asInstanceOf[textSlashrichtext]
  
  @js.native
  sealed trait `textSlashtab-separated-values` extends MimeMediaType
  @scala.inline
  def `textSlashtab-separated-values`: `textSlashtab-separated-values` = "text/tab-separated-values".asInstanceOf[`textSlashtab-separated-values`]
  
  @js.native
  sealed trait `textSlashx-setext` extends MimeMediaType
  @scala.inline
  def `textSlashx-setext`: `textSlashx-setext` = "text/x-setext".asInstanceOf[`textSlashx-setext`]
  
  @js.native
  sealed trait `textSlashx-sgml` extends MimeMediaType
  @scala.inline
  def `textSlashx-sgml`: `textSlashx-sgml` = "text/x-sgml".asInstanceOf[`textSlashx-sgml`]
  
  @js.native
  sealed trait tftp extends UriSchemes
  @scala.inline
  def tftp: tftp = "tftp".asInstanceOf[tftp]
  
  @js.native
  sealed trait things extends UriSchemes
  @scala.inline
  def things: things = "things".asInstanceOf[things]
  
  @js.native
  sealed trait `third-shift`
    extends JobDelayOutputUntil
       with JobHoldUntil
  @scala.inline
  def `third-shift`: `third-shift` = "third-shift".asInstanceOf[`third-shift`]
  
  @js.native
  sealed trait thismessage extends UriSchemes
  @scala.inline
  def thismessage: thismessage = "thismessage".asInstanceOf[thismessage]
  
  @js.native
  sealed trait `time-at-completed` extends StObject
  @scala.inline
  def `time-at-completed`: `time-at-completed` = "time-at-completed".asInstanceOf[`time-at-completed`]
  
  @js.native
  sealed trait `time-at-creation` extends StObject
  @scala.inline
  def `time-at-creation`: `time-at-creation` = "time-at-creation".asInstanceOf[`time-at-creation`]
  
  @js.native
  sealed trait `time-at-processing` extends StObject
  @scala.inline
  def `time-at-processing`: `time-at-processing` = "time-at-processing".asInstanceOf[`time-at-processing`]
  
  @js.native
  sealed trait `timed-out` extends PrinterStateReasons
  @scala.inline
  def `timed-out`: `timed-out` = "timed-out".asInstanceOf[`timed-out`]
  
  @js.native
  sealed trait tip extends UriSchemes
  @scala.inline
  def tip: tip = "tip".asInstanceOf[tip]
  
  @js.native
  sealed trait titanium extends MaterialType
  @scala.inline
  def titanium: titanium = "titanium".asInstanceOf[titanium]
  
  @js.native
  sealed trait tls extends XriSecurity
  @scala.inline
  def tls: tls = "tls".asInstanceOf[tls]
  
  @js.native
  sealed trait tn3270 extends UriSchemes
  @scala.inline
  def tn3270: tn3270 = "tn3270".asInstanceOf[tn3270]
  
  @js.native
  sealed trait `to-name-supported` extends StObject
  @scala.inline
  def `to-name-supported`: `to-name-supported` = "to-name-supported".asInstanceOf[`to-name-supported`]
  
  @js.native
  sealed trait `tobottom-toleft` extends PresentationDirectionNumberUp
  @scala.inline
  def `tobottom-toleft`: `tobottom-toleft` = "tobottom-toleft".asInstanceOf[`tobottom-toleft`]
  
  @js.native
  sealed trait `tobottom-toright` extends PresentationDirectionNumberUp
  @scala.inline
  def `tobottom-toright`: `tobottom-toright` = "tobottom-toright".asInstanceOf[`tobottom-toright`]
  
  @js.native
  sealed trait `toleft-tobottom` extends PresentationDirectionNumberUp
  @scala.inline
  def `toleft-tobottom`: `toleft-tobottom` = "toleft-tobottom".asInstanceOf[`toleft-tobottom`]
  
  @js.native
  sealed trait `toleft-totop` extends PresentationDirectionNumberUp
  @scala.inline
  def `toleft-totop`: `toleft-totop` = "toleft-totop".asInstanceOf[`toleft-totop`]
  
  @js.native
  sealed trait `toner-empty` extends PrinterStateReasons
  @scala.inline
  def `toner-empty`: `toner-empty` = "toner-empty".asInstanceOf[`toner-empty`]
  
  @js.native
  sealed trait `toner-low` extends PrinterStateReasons
  @scala.inline
  def `toner-low`: `toner-low` = "toner-low".asInstanceOf[`toner-low`]
  
  @js.native
  sealed trait tool extends UriSchemes
  @scala.inline
  def tool: tool = "tool".asInstanceOf[tool]
  
  @js.native
  sealed trait top
    extends Media
       with MediaIntputTray
       with MediaSource
       with OutputBin
       with ReferenceEdge
       with YImagePosition
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `toright-tobottom` extends PresentationDirectionNumberUp
  @scala.inline
  def `toright-tobottom`: `toright-tobottom` = "toright-tobottom".asInstanceOf[`toright-tobottom`]
  
  @js.native
  sealed trait `toright-totop` extends PresentationDirectionNumberUp
  @scala.inline
  def `toright-totop`: `toright-totop` = "toright-totop".asInstanceOf[`toright-totop`]
  
  @js.native
  sealed trait `totop-toleft` extends PresentationDirectionNumberUp
  @scala.inline
  def `totop-toleft`: `totop-toleft` = "totop-toleft".asInstanceOf[`totop-toleft`]
  
  @js.native
  sealed trait `totop-toright` extends PresentationDirectionNumberUp
  @scala.inline
  def `totop-toright`: `totop-toright` = "totop-toright".asInstanceOf[`totop-toright`]
  
  @js.native
  sealed trait tractor extends MediaType
  @scala.inline
  def tractor: tractor = "tractor".asInstanceOf[tractor]
  
  @js.native
  sealed trait transfer extends MediaType
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  
  @js.native
  sealed trait transform extends PrinterServiceType
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait transforming extends DocumentStateReasons
  @scala.inline
  def transforming: transforming = "transforming".asInstanceOf[transforming]
  
  @js.native
  sealed trait translucent
    extends CoatingType
       with LaminatingType
  @scala.inline
  def translucent: translucent = "translucent".asInstanceOf[translucent]
  
  @js.native
  sealed trait transparency extends MediaType
  @scala.inline
  def transparency: transparency = "transparency".asInstanceOf[transparency]
  
  @js.native
  sealed trait `tray-1`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-1`: `tray-1` = "tray-1".asInstanceOf[`tray-1`]
  
  @js.native
  sealed trait `tray-10`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-10`: `tray-10` = "tray-10".asInstanceOf[`tray-10`]
  
  @js.native
  sealed trait `tray-11` extends MediaSource
  @scala.inline
  def `tray-11`: `tray-11` = "tray-11".asInstanceOf[`tray-11`]
  
  @js.native
  sealed trait `tray-12` extends MediaSource
  @scala.inline
  def `tray-12`: `tray-12` = "tray-12".asInstanceOf[`tray-12`]
  
  @js.native
  sealed trait `tray-13` extends MediaSource
  @scala.inline
  def `tray-13`: `tray-13` = "tray-13".asInstanceOf[`tray-13`]
  
  @js.native
  sealed trait `tray-14` extends MediaSource
  @scala.inline
  def `tray-14`: `tray-14` = "tray-14".asInstanceOf[`tray-14`]
  
  @js.native
  sealed trait `tray-15` extends MediaSource
  @scala.inline
  def `tray-15`: `tray-15` = "tray-15".asInstanceOf[`tray-15`]
  
  @js.native
  sealed trait `tray-16` extends MediaSource
  @scala.inline
  def `tray-16`: `tray-16` = "tray-16".asInstanceOf[`tray-16`]
  
  @js.native
  sealed trait `tray-17` extends MediaSource
  @scala.inline
  def `tray-17`: `tray-17` = "tray-17".asInstanceOf[`tray-17`]
  
  @js.native
  sealed trait `tray-18` extends MediaSource
  @scala.inline
  def `tray-18`: `tray-18` = "tray-18".asInstanceOf[`tray-18`]
  
  @js.native
  sealed trait `tray-19` extends MediaSource
  @scala.inline
  def `tray-19`: `tray-19` = "tray-19".asInstanceOf[`tray-19`]
  
  @js.native
  sealed trait `tray-2`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-2`: `tray-2` = "tray-2".asInstanceOf[`tray-2`]
  
  @js.native
  sealed trait `tray-20` extends MediaSource
  @scala.inline
  def `tray-20`: `tray-20` = "tray-20".asInstanceOf[`tray-20`]
  
  @js.native
  sealed trait `tray-3`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-3`: `tray-3` = "tray-3".asInstanceOf[`tray-3`]
  
  @js.native
  sealed trait `tray-4`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-4`: `tray-4` = "tray-4".asInstanceOf[`tray-4`]
  
  @js.native
  sealed trait `tray-5`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-5`: `tray-5` = "tray-5".asInstanceOf[`tray-5`]
  
  @js.native
  sealed trait `tray-6`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-6`: `tray-6` = "tray-6".asInstanceOf[`tray-6`]
  
  @js.native
  sealed trait `tray-7`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-7`: `tray-7` = "tray-7".asInstanceOf[`tray-7`]
  
  @js.native
  sealed trait `tray-8`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-8`: `tray-8` = "tray-8".asInstanceOf[`tray-8`]
  
  @js.native
  sealed trait `tray-9`
    extends MediaSource
       with OutputBin
  @scala.inline
  def `tray-9`: `tray-9` = "tray-9".asInstanceOf[`tray-9`]
  
  @js.native
  sealed trait trim extends Finishings
  @scala.inline
  def trim: trim = "trim".asInstanceOf[trim]
  
  @js.native
  sealed trait `trim-after-copies` extends Finishings
  @scala.inline
  def `trim-after-copies`: `trim-after-copies` = "trim-after-copies".asInstanceOf[`trim-after-copies`]
  
  @js.native
  sealed trait `trim-after-documents` extends Finishings
  @scala.inline
  def `trim-after-documents`: `trim-after-documents` = "trim-after-documents".asInstanceOf[`trim-after-documents`]
  
  @js.native
  sealed trait `trim-after-job` extends Finishings
  @scala.inline
  def `trim-after-job`: `trim-after-job` = "trim-after-job".asInstanceOf[`trim-after-job`]
  
  @js.native
  sealed trait `trim-after-pages` extends Finishings
  @scala.inline
  def `trim-after-pages`: `trim-after-pages` = "trim-after-pages".asInstanceOf[`trim-after-pages`]
  
  @js.native
  sealed trait `trimmer-added` extends PrinterStateReasons
  @scala.inline
  def `trimmer-added`: `trimmer-added` = "trimmer-added".asInstanceOf[`trimmer-added`]
  
  @js.native
  sealed trait `trimmer-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `trimmer-almost-empty`: `trimmer-almost-empty` = "trimmer-almost-empty".asInstanceOf[`trimmer-almost-empty`]
  
  @js.native
  sealed trait `trimmer-almost-full` extends PrinterStateReasons
  @scala.inline
  def `trimmer-almost-full`: `trimmer-almost-full` = "trimmer-almost-full".asInstanceOf[`trimmer-almost-full`]
  
  @js.native
  sealed trait `trimmer-at-limit` extends PrinterStateReasons
  @scala.inline
  def `trimmer-at-limit`: `trimmer-at-limit` = "trimmer-at-limit".asInstanceOf[`trimmer-at-limit`]
  
  @js.native
  sealed trait `trimmer-closed` extends PrinterStateReasons
  @scala.inline
  def `trimmer-closed`: `trimmer-closed` = "trimmer-closed".asInstanceOf[`trimmer-closed`]
  
  @js.native
  sealed trait `trimmer-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `trimmer-configuration-change`: `trimmer-configuration-change` = "trimmer-configuration-change".asInstanceOf[`trimmer-configuration-change`]
  
  @js.native
  sealed trait `trimmer-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `trimmer-cover-closed`: `trimmer-cover-closed` = "trimmer-cover-closed".asInstanceOf[`trimmer-cover-closed`]
  
  @js.native
  sealed trait `trimmer-cover-open` extends PrinterStateReasons
  @scala.inline
  def `trimmer-cover-open`: `trimmer-cover-open` = "trimmer-cover-open".asInstanceOf[`trimmer-cover-open`]
  
  @js.native
  sealed trait `trimmer-empty` extends PrinterStateReasons
  @scala.inline
  def `trimmer-empty`: `trimmer-empty` = "trimmer-empty".asInstanceOf[`trimmer-empty`]
  
  @js.native
  sealed trait `trimmer-full` extends PrinterStateReasons
  @scala.inline
  def `trimmer-full`: `trimmer-full` = "trimmer-full".asInstanceOf[`trimmer-full`]
  
  @js.native
  sealed trait `trimmer-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `trimmer-interlock-closed`: `trimmer-interlock-closed` = "trimmer-interlock-closed".asInstanceOf[`trimmer-interlock-closed`]
  
  @js.native
  sealed trait `trimmer-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `trimmer-interlock-open`: `trimmer-interlock-open` = "trimmer-interlock-open".asInstanceOf[`trimmer-interlock-open`]
  
  @js.native
  sealed trait `trimmer-jam` extends PrinterStateReasons
  @scala.inline
  def `trimmer-jam`: `trimmer-jam` = "trimmer-jam".asInstanceOf[`trimmer-jam`]
  
  @js.native
  sealed trait `trimmer-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `trimmer-life-almost-over`: `trimmer-life-almost-over` = "trimmer-life-almost-over".asInstanceOf[`trimmer-life-almost-over`]
  
  @js.native
  sealed trait `trimmer-life-over` extends PrinterStateReasons
  @scala.inline
  def `trimmer-life-over`: `trimmer-life-over` = "trimmer-life-over".asInstanceOf[`trimmer-life-over`]
  
  @js.native
  sealed trait `trimmer-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `trimmer-memory-exhausted`: `trimmer-memory-exhausted` = "trimmer-memory-exhausted".asInstanceOf[`trimmer-memory-exhausted`]
  
  @js.native
  sealed trait `trimmer-missing` extends PrinterStateReasons
  @scala.inline
  def `trimmer-missing`: `trimmer-missing` = "trimmer-missing".asInstanceOf[`trimmer-missing`]
  
  @js.native
  sealed trait `trimmer-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `trimmer-motor-failure`: `trimmer-motor-failure` = "trimmer-motor-failure".asInstanceOf[`trimmer-motor-failure`]
  
  @js.native
  sealed trait `trimmer-near-limit` extends PrinterStateReasons
  @scala.inline
  def `trimmer-near-limit`: `trimmer-near-limit` = "trimmer-near-limit".asInstanceOf[`trimmer-near-limit`]
  
  @js.native
  sealed trait `trimmer-offline` extends PrinterStateReasons
  @scala.inline
  def `trimmer-offline`: `trimmer-offline` = "trimmer-offline".asInstanceOf[`trimmer-offline`]
  
  @js.native
  sealed trait `trimmer-opened` extends PrinterStateReasons
  @scala.inline
  def `trimmer-opened`: `trimmer-opened` = "trimmer-opened".asInstanceOf[`trimmer-opened`]
  
  @js.native
  sealed trait `trimmer-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `trimmer-over-temperature`: `trimmer-over-temperature` = "trimmer-over-temperature".asInstanceOf[`trimmer-over-temperature`]
  
  @js.native
  sealed trait `trimmer-power-saver` extends PrinterStateReasons
  @scala.inline
  def `trimmer-power-saver`: `trimmer-power-saver` = "trimmer-power-saver".asInstanceOf[`trimmer-power-saver`]
  
  @js.native
  sealed trait `trimmer-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `trimmer-recoverable-failure`: `trimmer-recoverable-failure` = "trimmer-recoverable-failure".asInstanceOf[`trimmer-recoverable-failure`]
  
  @js.native
  sealed trait `trimmer-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `trimmer-recoverable-storage-error`: `trimmer-recoverable-storage-error` = "trimmer-recoverable-storage-error".asInstanceOf[`trimmer-recoverable-storage-error`]
  
  @js.native
  sealed trait `trimmer-removed` extends PrinterStateReasons
  @scala.inline
  def `trimmer-removed`: `trimmer-removed` = "trimmer-removed".asInstanceOf[`trimmer-removed`]
  
  @js.native
  sealed trait `trimmer-resource-added` extends PrinterStateReasons
  @scala.inline
  def `trimmer-resource-added`: `trimmer-resource-added` = "trimmer-resource-added".asInstanceOf[`trimmer-resource-added`]
  
  @js.native
  sealed trait `trimmer-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `trimmer-resource-removed`: `trimmer-resource-removed` = "trimmer-resource-removed".asInstanceOf[`trimmer-resource-removed`]
  
  @js.native
  sealed trait `trimmer-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `trimmer-thermistor-failure`: `trimmer-thermistor-failure` = "trimmer-thermistor-failure".asInstanceOf[`trimmer-thermistor-failure`]
  
  @js.native
  sealed trait `trimmer-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `trimmer-timing-failure`: `trimmer-timing-failure` = "trimmer-timing-failure".asInstanceOf[`trimmer-timing-failure`]
  
  @js.native
  sealed trait `trimmer-turned-off` extends PrinterStateReasons
  @scala.inline
  def `trimmer-turned-off`: `trimmer-turned-off` = "trimmer-turned-off".asInstanceOf[`trimmer-turned-off`]
  
  @js.native
  sealed trait `trimmer-turned-on` extends PrinterStateReasons
  @scala.inline
  def `trimmer-turned-on`: `trimmer-turned-on` = "trimmer-turned-on".asInstanceOf[`trimmer-turned-on`]
  
  @js.native
  sealed trait `trimmer-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `trimmer-under-temperature`: `trimmer-under-temperature` = "trimmer-under-temperature".asInstanceOf[`trimmer-under-temperature`]
  
  @js.native
  sealed trait `trimmer-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `trimmer-unrecoverable-failure`: `trimmer-unrecoverable-failure` = "trimmer-unrecoverable-failure".asInstanceOf[`trimmer-unrecoverable-failure`]
  
  @js.native
  sealed trait `trimmer-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `trimmer-unrecoverable-storage-error`: `trimmer-unrecoverable-storage-error` = "trimmer-unrecoverable-storage-error".asInstanceOf[`trimmer-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `trimmer-warming-up` extends PrinterStateReasons
  @scala.inline
  def `trimmer-warming-up`: `trimmer-warming-up` = "trimmer-warming-up".asInstanceOf[`trimmer-warming-up`]
  
  @js.native
  sealed trait trimming extends StObject
  @scala.inline
  def trimming: trimming = "trimming".asInstanceOf[trimming]
  
  @js.native
  sealed trait `trimming-offset-supported` extends StObject
  @scala.inline
  def `trimming-offset-supported`: `trimming-offset-supported` = "trimming-offset-supported".asInstanceOf[`trimming-offset-supported`]
  
  @js.native
  sealed trait `trimming-reference-edge-supported` extends StObject
  @scala.inline
  def `trimming-reference-edge-supported`: `trimming-reference-edge-supported` = "trimming-reference-edge-supported".asInstanceOf[`trimming-reference-edge-supported`]
  
  @js.native
  sealed trait `trimming-type-supported` extends StObject
  @scala.inline
  def `trimming-type-supported`: `trimming-type-supported` = "trimming-type-supported".asInstanceOf[`trimming-type-supported`]
  
  @js.native
  sealed trait `trimming-when-supported` extends StObject
  @scala.inline
  def `trimming-when-supported`: `trimming-when-supported` = "trimming-when-supported".asInstanceOf[`trimming-when-supported`]
  
  @js.native
  sealed trait `triple-wall` extends MediaType
  @scala.inline
  def `triple-wall`: `triple-wall` = "triple-wall".asInstanceOf[`triple-wall`]
  
  @js.native
  sealed trait turn extends UriSchemes
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  
  @js.native
  sealed trait turns extends UriSchemes
  @scala.inline
  def turns: turns = "turns".asInstanceOf[turns]
  
  @js.native
  sealed trait turquoise extends MediaColor
  @scala.inline
  def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  
  @js.native
  sealed trait tv extends UriSchemes
  @scala.inline
  def tv: tv = "tv".asInstanceOf[tv]
  
  @js.native
  sealed trait `two-sided-long-edge` extends Sides
  @scala.inline
  def `two-sided-long-edge`: `two-sided-long-edge` = "two-sided-long-edge".asInstanceOf[`two-sided-long-edge`]
  
  @js.native
  sealed trait `two-sided-short-edge` extends Sides
  @scala.inline
  def `two-sided-short-edge`: `two-sided-short-edge` = "two-sided-short-edge".asInstanceOf[`two-sided-short-edge`]
  
  @js.native
  sealed trait u3d extends StObject
  @scala.inline
  def u3d: u3d = "u3d".asInstanceOf[u3d]
  
  @js.native
  sealed trait udp extends UriSchemes
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @js.native
  sealed trait um extends AccuracyUnits
  @scala.inline
  def um: um = "um".asInstanceOf[um]
  
  @js.native
  sealed trait uncalendared extends MediaTooth
  @scala.inline
  def uncalendared: uncalendared = "uncalendared".asInstanceOf[uncalendared]
  
  @js.native
  sealed trait uncollated extends StObject
  @scala.inline
  def uncollated: uncollated = "uncollated".asInstanceOf[uncollated]
  
  @js.native
  sealed trait unicode extends CharacterSet
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
  
  @js.native
  sealed trait unicodeFFFE extends CharacterSet
  @scala.inline
  def unicodeFFFE: unicodeFFFE = "unicodeFFFE".asInstanceOf[unicodeFFFE]
  
  @js.native
  sealed trait unknown extends PrinterStateReasons
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unreal extends UriSchemes
  @scala.inline
  def unreal: unreal = "unreal".asInstanceOf[unreal]
  
  @js.native
  sealed trait `unsupported-compression`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `unsupported-compression`: `unsupported-compression` = "unsupported-compression".asInstanceOf[`unsupported-compression`]
  
  @js.native
  sealed trait `unsupported-document-format`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `unsupported-document-format`: `unsupported-document-format` = "unsupported-document-format".asInstanceOf[`unsupported-document-format`]
  
  @js.native
  sealed trait `uri-authentication-supported` extends StObject
  @scala.inline
  def `uri-authentication-supported`: `uri-authentication-supported` = "uri-authentication-supported".asInstanceOf[`uri-authentication-supported`]
  
  @js.native
  sealed trait `uri-security-supported` extends StObject
  @scala.inline
  def `uri-security-supported`: `uri-security-supported` = "uri-security-supported".asInstanceOf[`uri-security-supported`]
  
  @js.native
  sealed trait urn extends UriSchemes
  @scala.inline
  def urn: urn = "urn".asInstanceOf[urn]
  
  @js.native
  sealed trait `us-ascii` extends CharacterSet
  @scala.inline
  def `us-ascii`: `us-ascii` = "us-ascii".asInstanceOf[`us-ascii`]
  
  @js.native
  sealed trait `user-defined-values-supported` extends StObject
  @scala.inline
  def `user-defined-values-supported`: `user-defined-values-supported` = "user-defined-values-supported".asInstanceOf[`user-defined-values-supported`]
  
  @js.native
  sealed trait ut2004 extends UriSchemes
  @scala.inline
  def ut2004: ut2004 = "ut2004".asInstanceOf[ut2004]
  
  @js.native
  sealed trait `utf-7` extends CharacterSet
  @scala.inline
  def `utf-7`: `utf-7` = "utf-7".asInstanceOf[`utf-7`]
  
  @js.native
  sealed trait `utf-8` extends CharacterSet
  @scala.inline
  def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  
  @js.native
  sealed trait `v-event` extends UriSchemes
  @scala.inline
  def `v-event`: `v-event` = "v-event".asInstanceOf[`v-event`]
  
  @js.native
  sealed trait vellum extends MediaTooth
  @scala.inline
  def vellum: vellum = "vellum".asInstanceOf[vellum]
  
  @js.native
  sealed trait velo extends BindingType
  @scala.inline
  def velo: velo = "velo".asInstanceOf[velo]
  
  @js.native
  sealed trait vemmi extends UriSchemes
  @scala.inline
  def vemmi: vemmi = "vemmi".asInstanceOf[vemmi]
  
  @js.native
  sealed trait ventrilo extends UriSchemes
  @scala.inline
  def ventrilo: ventrilo = "ventrilo".asInstanceOf[ventrilo]
  
  @js.native
  sealed trait videotex extends UriSchemes
  @scala.inline
  def videotex: videotex = "videotex".asInstanceOf[videotex]
  
  @js.native
  sealed trait `view-source` extends UriSchemes
  @scala.inline
  def `view-source`: `view-source` = "view-source".asInstanceOf[`view-source`]
  
  @js.native
  sealed trait violet extends MediaColor
  @scala.inline
  def violet: violet = "violet".asInstanceOf[violet]
  
  @js.native
  sealed trait vnc extends UriSchemes
  @scala.inline
  def vnc: vnc = "vnc".asInstanceOf[vnc]
  
  @js.native
  sealed trait wais extends UriSchemes
  @scala.inline
  def wais: wais = "wais".asInstanceOf[wais]
  
  @js.native
  sealed trait `warnings-count` extends StObject
  @scala.inline
  def `warnings-count`: `warnings-count` = "warnings-count".asInstanceOf[`warnings-count`]
  
  @js.native
  sealed trait `warnings-detected`
    extends DocumentStateReasons
       with JobStateReasons
  @scala.inline
  def `warnings-detected`: `warnings-detected` = "warnings-detected".asInstanceOf[`warnings-detected`]
  
  @js.native
  sealed trait wax extends MaterialType
  @scala.inline
  def wax: wax = "wax".asInstanceOf[wax]
  
  @js.native
  sealed trait webcal extends UriSchemes
  @scala.inline
  def webcal: webcal = "webcal".asInstanceOf[webcal]
  
  @js.native
  sealed trait weekend
    extends JobDelayOutputUntil
       with JobHoldUntil
  @scala.inline
  def weekend: weekend = "weekend".asInstanceOf[weekend]
  
  @js.native
  sealed trait `wet-film` extends MediaType
  @scala.inline
  def `wet-film`: `wet-film` = "wet-film".asInstanceOf[`wet-film`]
  
  @js.native
  sealed trait `which-jobs-supported` extends StObject
  @scala.inline
  def `which-jobs-supported`: `which-jobs-supported` = "which-jobs-supported".asInstanceOf[`which-jobs-supported`]
  
  @js.native
  sealed trait white extends MediaColor
  @scala.inline
  def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait `windows-1250` extends CharacterSet
  @scala.inline
  def `windows-1250`: `windows-1250` = "windows-1250".asInstanceOf[`windows-1250`]
  
  @js.native
  sealed trait `windows-1251` extends CharacterSet
  @scala.inline
  def `windows-1251`: `windows-1251` = "windows-1251".asInstanceOf[`windows-1251`]
  
  @js.native
  sealed trait `windows-1254` extends CharacterSet
  @scala.inline
  def `windows-1254`: `windows-1254` = "windows-1254".asInstanceOf[`windows-1254`]
  
  @js.native
  sealed trait `windows-1255` extends CharacterSet
  @scala.inline
  def `windows-1255`: `windows-1255` = "windows-1255".asInstanceOf[`windows-1255`]
  
  @js.native
  sealed trait `windows-1256` extends CharacterSet
  @scala.inline
  def `windows-1256`: `windows-1256` = "windows-1256".asInstanceOf[`windows-1256`]
  
  @js.native
  sealed trait `windows-1257` extends CharacterSet
  @scala.inline
  def `windows-1257`: `windows-1257` = "windows-1257".asInstanceOf[`windows-1257`]
  
  @js.native
  sealed trait `windows-1258` extends CharacterSet
  @scala.inline
  def `windows-1258`: `windows-1258` = "windows-1258".asInstanceOf[`windows-1258`]
  
  @js.native
  sealed trait `windows-874` extends CharacterSet
  @scala.inline
  def `windows-874`: `windows-874` = "windows-874".asInstanceOf[`windows-874`]
  
  @js.native
  sealed trait wire extends StitchingMethod
  @scala.inline
  def wire: wire = "wire".asInstanceOf[wire]
  
  @js.native
  sealed trait wpid extends UriSchemes
  @scala.inline
  def wpid: wpid = "wpid".asInstanceOf[wpid]
  
  @js.native
  sealed trait wrap extends BalingType
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
  
  @js.native
  sealed trait `wrapper-added` extends PrinterStateReasons
  @scala.inline
  def `wrapper-added`: `wrapper-added` = "wrapper-added".asInstanceOf[`wrapper-added`]
  
  @js.native
  sealed trait `wrapper-almost-empty` extends PrinterStateReasons
  @scala.inline
  def `wrapper-almost-empty`: `wrapper-almost-empty` = "wrapper-almost-empty".asInstanceOf[`wrapper-almost-empty`]
  
  @js.native
  sealed trait `wrapper-almost-full` extends PrinterStateReasons
  @scala.inline
  def `wrapper-almost-full`: `wrapper-almost-full` = "wrapper-almost-full".asInstanceOf[`wrapper-almost-full`]
  
  @js.native
  sealed trait `wrapper-at-limit` extends PrinterStateReasons
  @scala.inline
  def `wrapper-at-limit`: `wrapper-at-limit` = "wrapper-at-limit".asInstanceOf[`wrapper-at-limit`]
  
  @js.native
  sealed trait `wrapper-closed` extends PrinterStateReasons
  @scala.inline
  def `wrapper-closed`: `wrapper-closed` = "wrapper-closed".asInstanceOf[`wrapper-closed`]
  
  @js.native
  sealed trait `wrapper-configuration-change` extends PrinterStateReasons
  @scala.inline
  def `wrapper-configuration-change`: `wrapper-configuration-change` = "wrapper-configuration-change".asInstanceOf[`wrapper-configuration-change`]
  
  @js.native
  sealed trait `wrapper-cover-closed` extends PrinterStateReasons
  @scala.inline
  def `wrapper-cover-closed`: `wrapper-cover-closed` = "wrapper-cover-closed".asInstanceOf[`wrapper-cover-closed`]
  
  @js.native
  sealed trait `wrapper-cover-open` extends PrinterStateReasons
  @scala.inline
  def `wrapper-cover-open`: `wrapper-cover-open` = "wrapper-cover-open".asInstanceOf[`wrapper-cover-open`]
  
  @js.native
  sealed trait `wrapper-empty` extends PrinterStateReasons
  @scala.inline
  def `wrapper-empty`: `wrapper-empty` = "wrapper-empty".asInstanceOf[`wrapper-empty`]
  
  @js.native
  sealed trait `wrapper-full` extends PrinterStateReasons
  @scala.inline
  def `wrapper-full`: `wrapper-full` = "wrapper-full".asInstanceOf[`wrapper-full`]
  
  @js.native
  sealed trait `wrapper-interlock-closed` extends PrinterStateReasons
  @scala.inline
  def `wrapper-interlock-closed`: `wrapper-interlock-closed` = "wrapper-interlock-closed".asInstanceOf[`wrapper-interlock-closed`]
  
  @js.native
  sealed trait `wrapper-interlock-open` extends PrinterStateReasons
  @scala.inline
  def `wrapper-interlock-open`: `wrapper-interlock-open` = "wrapper-interlock-open".asInstanceOf[`wrapper-interlock-open`]
  
  @js.native
  sealed trait `wrapper-jam` extends PrinterStateReasons
  @scala.inline
  def `wrapper-jam`: `wrapper-jam` = "wrapper-jam".asInstanceOf[`wrapper-jam`]
  
  @js.native
  sealed trait `wrapper-life-almost-over` extends PrinterStateReasons
  @scala.inline
  def `wrapper-life-almost-over`: `wrapper-life-almost-over` = "wrapper-life-almost-over".asInstanceOf[`wrapper-life-almost-over`]
  
  @js.native
  sealed trait `wrapper-life-over` extends PrinterStateReasons
  @scala.inline
  def `wrapper-life-over`: `wrapper-life-over` = "wrapper-life-over".asInstanceOf[`wrapper-life-over`]
  
  @js.native
  sealed trait `wrapper-memory-exhausted` extends PrinterStateReasons
  @scala.inline
  def `wrapper-memory-exhausted`: `wrapper-memory-exhausted` = "wrapper-memory-exhausted".asInstanceOf[`wrapper-memory-exhausted`]
  
  @js.native
  sealed trait `wrapper-missing` extends PrinterStateReasons
  @scala.inline
  def `wrapper-missing`: `wrapper-missing` = "wrapper-missing".asInstanceOf[`wrapper-missing`]
  
  @js.native
  sealed trait `wrapper-motor-failure` extends PrinterStateReasons
  @scala.inline
  def `wrapper-motor-failure`: `wrapper-motor-failure` = "wrapper-motor-failure".asInstanceOf[`wrapper-motor-failure`]
  
  @js.native
  sealed trait `wrapper-near-limit` extends PrinterStateReasons
  @scala.inline
  def `wrapper-near-limit`: `wrapper-near-limit` = "wrapper-near-limit".asInstanceOf[`wrapper-near-limit`]
  
  @js.native
  sealed trait `wrapper-offline` extends PrinterStateReasons
  @scala.inline
  def `wrapper-offline`: `wrapper-offline` = "wrapper-offline".asInstanceOf[`wrapper-offline`]
  
  @js.native
  sealed trait `wrapper-opened` extends PrinterStateReasons
  @scala.inline
  def `wrapper-opened`: `wrapper-opened` = "wrapper-opened".asInstanceOf[`wrapper-opened`]
  
  @js.native
  sealed trait `wrapper-over-temperature` extends PrinterStateReasons
  @scala.inline
  def `wrapper-over-temperature`: `wrapper-over-temperature` = "wrapper-over-temperature".asInstanceOf[`wrapper-over-temperature`]
  
  @js.native
  sealed trait `wrapper-power-saver` extends PrinterStateReasons
  @scala.inline
  def `wrapper-power-saver`: `wrapper-power-saver` = "wrapper-power-saver".asInstanceOf[`wrapper-power-saver`]
  
  @js.native
  sealed trait `wrapper-recoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `wrapper-recoverable-failure`: `wrapper-recoverable-failure` = "wrapper-recoverable-failure".asInstanceOf[`wrapper-recoverable-failure`]
  
  @js.native
  sealed trait `wrapper-recoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `wrapper-recoverable-storage-error`: `wrapper-recoverable-storage-error` = "wrapper-recoverable-storage-error".asInstanceOf[`wrapper-recoverable-storage-error`]
  
  @js.native
  sealed trait `wrapper-removed` extends PrinterStateReasons
  @scala.inline
  def `wrapper-removed`: `wrapper-removed` = "wrapper-removed".asInstanceOf[`wrapper-removed`]
  
  @js.native
  sealed trait `wrapper-resource-added` extends PrinterStateReasons
  @scala.inline
  def `wrapper-resource-added`: `wrapper-resource-added` = "wrapper-resource-added".asInstanceOf[`wrapper-resource-added`]
  
  @js.native
  sealed trait `wrapper-resource-removed` extends PrinterStateReasons
  @scala.inline
  def `wrapper-resource-removed`: `wrapper-resource-removed` = "wrapper-resource-removed".asInstanceOf[`wrapper-resource-removed`]
  
  @js.native
  sealed trait `wrapper-thermistor-failure` extends PrinterStateReasons
  @scala.inline
  def `wrapper-thermistor-failure`: `wrapper-thermistor-failure` = "wrapper-thermistor-failure".asInstanceOf[`wrapper-thermistor-failure`]
  
  @js.native
  sealed trait `wrapper-timing-failure` extends PrinterStateReasons
  @scala.inline
  def `wrapper-timing-failure`: `wrapper-timing-failure` = "wrapper-timing-failure".asInstanceOf[`wrapper-timing-failure`]
  
  @js.native
  sealed trait `wrapper-turned-off` extends PrinterStateReasons
  @scala.inline
  def `wrapper-turned-off`: `wrapper-turned-off` = "wrapper-turned-off".asInstanceOf[`wrapper-turned-off`]
  
  @js.native
  sealed trait `wrapper-turned-on` extends PrinterStateReasons
  @scala.inline
  def `wrapper-turned-on`: `wrapper-turned-on` = "wrapper-turned-on".asInstanceOf[`wrapper-turned-on`]
  
  @js.native
  sealed trait `wrapper-under-temperature` extends PrinterStateReasons
  @scala.inline
  def `wrapper-under-temperature`: `wrapper-under-temperature` = "wrapper-under-temperature".asInstanceOf[`wrapper-under-temperature`]
  
  @js.native
  sealed trait `wrapper-unrecoverable-failure` extends PrinterStateReasons
  @scala.inline
  def `wrapper-unrecoverable-failure`: `wrapper-unrecoverable-failure` = "wrapper-unrecoverable-failure".asInstanceOf[`wrapper-unrecoverable-failure`]
  
  @js.native
  sealed trait `wrapper-unrecoverable-storage-error` extends PrinterStateReasons
  @scala.inline
  def `wrapper-unrecoverable-storage-error`: `wrapper-unrecoverable-storage-error` = "wrapper-unrecoverable-storage-error".asInstanceOf[`wrapper-unrecoverable-storage-error`]
  
  @js.native
  sealed trait `wrapper-warming-up` extends PrinterStateReasons
  @scala.inline
  def `wrapper-warming-up`: `wrapper-warming-up` = "wrapper-warming-up".asInstanceOf[`wrapper-warming-up`]
  
  @js.native
  sealed trait ws extends UriSchemes
  @scala.inline
  def ws: ws = "ws".asInstanceOf[ws]
  
  @js.native
  sealed trait wss extends UriSchemes
  @scala.inline
  def wss: wss = "wss".asInstanceOf[wss]
  
  @js.native
  sealed trait wtai extends UriSchemes
  @scala.inline
  def wtai: wtai = "wtai".asInstanceOf[wtai]
  
  @js.native
  sealed trait wyciwyg extends UriSchemes
  @scala.inline
  def wyciwyg: wyciwyg = "wyciwyg".asInstanceOf[wyciwyg]
  
  @js.native
  sealed trait `x-Chinese-CNS` extends CharacterSet
  @scala.inline
  def `x-Chinese-CNS`: `x-Chinese-CNS` = "x-Chinese-CNS".asInstanceOf[`x-Chinese-CNS`]
  
  @js.native
  sealed trait `x-Chinese-Eten` extends CharacterSet
  @scala.inline
  def `x-Chinese-Eten`: `x-Chinese-Eten` = "x-Chinese-Eten".asInstanceOf[`x-Chinese-Eten`]
  
  @js.native
  sealed trait `x-EBCDIC-Arabic` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Arabic`: `x-EBCDIC-Arabic` = "x-EBCDIC-Arabic".asInstanceOf[`x-EBCDIC-Arabic`]
  
  @js.native
  sealed trait `x-EBCDIC-CyrillicRussian` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-CyrillicRussian`: `x-EBCDIC-CyrillicRussian` = "x-EBCDIC-CyrillicRussian".asInstanceOf[`x-EBCDIC-CyrillicRussian`]
  
  @js.native
  sealed trait `x-EBCDIC-CyrillicSerbianBulgarian` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-CyrillicSerbianBulgarian`: `x-EBCDIC-CyrillicSerbianBulgarian` = "x-EBCDIC-CyrillicSerbianBulgarian".asInstanceOf[`x-EBCDIC-CyrillicSerbianBulgarian`]
  
  @js.native
  sealed trait `x-EBCDIC-DenmarkNorway` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-DenmarkNorway`: `x-EBCDIC-DenmarkNorway` = "x-EBCDIC-DenmarkNorway".asInstanceOf[`x-EBCDIC-DenmarkNorway`]
  
  @js.native
  sealed trait `x-EBCDIC-FinlandSweden` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-FinlandSweden`: `x-EBCDIC-FinlandSweden` = "x-EBCDIC-FinlandSweden".asInstanceOf[`x-EBCDIC-FinlandSweden`]
  
  @js.native
  sealed trait `x-EBCDIC-Germany` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Germany`: `x-EBCDIC-Germany` = "x-EBCDIC-Germany".asInstanceOf[`x-EBCDIC-Germany`]
  
  @js.native
  sealed trait `x-EBCDIC-Greek` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Greek`: `x-EBCDIC-Greek` = "x-EBCDIC-Greek".asInstanceOf[`x-EBCDIC-Greek`]
  
  @js.native
  sealed trait `x-EBCDIC-GreekModern` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-GreekModern`: `x-EBCDIC-GreekModern` = "x-EBCDIC-GreekModern".asInstanceOf[`x-EBCDIC-GreekModern`]
  
  @js.native
  sealed trait `x-EBCDIC-Hebrew` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Hebrew`: `x-EBCDIC-Hebrew` = "x-EBCDIC-Hebrew".asInstanceOf[`x-EBCDIC-Hebrew`]
  
  @js.native
  sealed trait `x-EBCDIC-Icelandic` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Icelandic`: `x-EBCDIC-Icelandic` = "x-EBCDIC-Icelandic".asInstanceOf[`x-EBCDIC-Icelandic`]
  
  @js.native
  sealed trait `x-EBCDIC-Italy` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Italy`: `x-EBCDIC-Italy` = "x-EBCDIC-Italy".asInstanceOf[`x-EBCDIC-Italy`]
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseAndJapaneseLatin` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-JapaneseAndJapaneseLatin`: `x-EBCDIC-JapaneseAndJapaneseLatin` = "x-EBCDIC-JapaneseAndJapaneseLatin".asInstanceOf[`x-EBCDIC-JapaneseAndJapaneseLatin`]
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseAndKana` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-JapaneseAndKana`: `x-EBCDIC-JapaneseAndKana` = "x-EBCDIC-JapaneseAndKana".asInstanceOf[`x-EBCDIC-JapaneseAndKana`]
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseAndUSCanada` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-JapaneseAndUSCanada`: `x-EBCDIC-JapaneseAndUSCanada` = "x-EBCDIC-JapaneseAndUSCanada".asInstanceOf[`x-EBCDIC-JapaneseAndUSCanada`]
  
  @js.native
  sealed trait `x-EBCDIC-JapaneseKatakana` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-JapaneseKatakana`: `x-EBCDIC-JapaneseKatakana` = "x-EBCDIC-JapaneseKatakana".asInstanceOf[`x-EBCDIC-JapaneseKatakana`]
  
  @js.native
  sealed trait `x-EBCDIC-KoreanAndKoreanExtended` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-KoreanAndKoreanExtended`: `x-EBCDIC-KoreanAndKoreanExtended` = "x-EBCDIC-KoreanAndKoreanExtended".asInstanceOf[`x-EBCDIC-KoreanAndKoreanExtended`]
  
  @js.native
  sealed trait `x-EBCDIC-KoreanExtended` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-KoreanExtended`: `x-EBCDIC-KoreanExtended` = "x-EBCDIC-KoreanExtended".asInstanceOf[`x-EBCDIC-KoreanExtended`]
  
  @js.native
  sealed trait `x-EBCDIC-SimplifiedChinese` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-SimplifiedChinese`: `x-EBCDIC-SimplifiedChinese` = "x-EBCDIC-SimplifiedChinese".asInstanceOf[`x-EBCDIC-SimplifiedChinese`]
  
  @js.native
  sealed trait `x-EBCDIC-Thai` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Thai`: `x-EBCDIC-Thai` = "x-EBCDIC-Thai".asInstanceOf[`x-EBCDIC-Thai`]
  
  @js.native
  sealed trait `x-EBCDIC-TraditionalChinese` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-TraditionalChinese`: `x-EBCDIC-TraditionalChinese` = "x-EBCDIC-TraditionalChinese".asInstanceOf[`x-EBCDIC-TraditionalChinese`]
  
  @js.native
  sealed trait `x-EBCDIC-Turkish` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-Turkish`: `x-EBCDIC-Turkish` = "x-EBCDIC-Turkish".asInstanceOf[`x-EBCDIC-Turkish`]
  
  @js.native
  sealed trait `x-EBCDIC-UK` extends CharacterSet
  @scala.inline
  def `x-EBCDIC-UK`: `x-EBCDIC-UK` = "x-EBCDIC-UK".asInstanceOf[`x-EBCDIC-UK`]
  
  @js.native
  sealed trait `x-Europa` extends CharacterSet
  @scala.inline
  def `x-Europa`: `x-Europa` = "x-Europa".asInstanceOf[`x-Europa`]
  
  @js.native
  sealed trait `x-IA5` extends CharacterSet
  @scala.inline
  def `x-IA5`: `x-IA5` = "x-IA5".asInstanceOf[`x-IA5`]
  
  @js.native
  sealed trait `x-IA5-German` extends CharacterSet
  @scala.inline
  def `x-IA5-German`: `x-IA5-German` = "x-IA5-German".asInstanceOf[`x-IA5-German`]
  
  @js.native
  sealed trait `x-IA5-Norwegian` extends CharacterSet
  @scala.inline
  def `x-IA5-Norwegian`: `x-IA5-Norwegian` = "x-IA5-Norwegian".asInstanceOf[`x-IA5-Norwegian`]
  
  @js.native
  sealed trait `x-IA5-Swedish` extends CharacterSet
  @scala.inline
  def `x-IA5-Swedish`: `x-IA5-Swedish` = "x-IA5-Swedish".asInstanceOf[`x-IA5-Swedish`]
  
  @js.native
  sealed trait `x-direction` extends MediaGrain
  @scala.inline
  def `x-direction`: `x-direction` = "x-direction".asInstanceOf[`x-direction`]
  
  @js.native
  sealed trait `x-ebcdic-cp-us-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-cp-us-euro`: `x-ebcdic-cp-us-euro` = "x-ebcdic-cp-us-euro".asInstanceOf[`x-ebcdic-cp-us-euro`]
  
  @js.native
  sealed trait `x-ebcdic-denmarknorway-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-denmarknorway-euro`: `x-ebcdic-denmarknorway-euro` = "x-ebcdic-denmarknorway-euro".asInstanceOf[`x-ebcdic-denmarknorway-euro`]
  
  @js.native
  sealed trait `x-ebcdic-finlandsweden-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-finlandsweden-euro`: `x-ebcdic-finlandsweden-euro` = "x-ebcdic-finlandsweden-euro".asInstanceOf[`x-ebcdic-finlandsweden-euro`]
  
  @js.native
  sealed trait `x-ebcdic-france-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-france-euro`: `x-ebcdic-france-euro` = "x-ebcdic-france-euro".asInstanceOf[`x-ebcdic-france-euro`]
  
  @js.native
  sealed trait `x-ebcdic-germany-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-germany-euro`: `x-ebcdic-germany-euro` = "x-ebcdic-germany-euro".asInstanceOf[`x-ebcdic-germany-euro`]
  
  @js.native
  sealed trait `x-ebcdic-icelandic-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-icelandic-euro`: `x-ebcdic-icelandic-euro` = "x-ebcdic-icelandic-euro".asInstanceOf[`x-ebcdic-icelandic-euro`]
  
  @js.native
  sealed trait `x-ebcdic-international-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-international-euro`: `x-ebcdic-international-euro` = "x-ebcdic-international-euro".asInstanceOf[`x-ebcdic-international-euro`]
  
  @js.native
  sealed trait `x-ebcdic-italy-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-italy-euro`: `x-ebcdic-italy-euro` = "x-ebcdic-italy-euro".asInstanceOf[`x-ebcdic-italy-euro`]
  
  @js.native
  sealed trait `x-ebcdic-spain-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-spain-euro`: `x-ebcdic-spain-euro` = "x-ebcdic-spain-euro".asInstanceOf[`x-ebcdic-spain-euro`]
  
  @js.native
  sealed trait `x-ebcdic-uk-euro` extends CharacterSet
  @scala.inline
  def `x-ebcdic-uk-euro`: `x-ebcdic-uk-euro` = "x-ebcdic-uk-euro".asInstanceOf[`x-ebcdic-uk-euro`]
  
  @js.native
  sealed trait `x-euc-jp` extends CharacterSet
  @scala.inline
  def `x-euc-jp`: `x-euc-jp` = "x-euc-jp".asInstanceOf[`x-euc-jp`]
  
  @js.native
  sealed trait `x-image-position` extends Overrides
  @scala.inline
  def `x-image-position`: `x-image-position` = "x-image-position".asInstanceOf[`x-image-position`]
  
  @js.native
  sealed trait `x-image-position-actual` extends StObject
  @scala.inline
  def `x-image-position-actual`: `x-image-position-actual` = "x-image-position-actual".asInstanceOf[`x-image-position-actual`]
  
  @js.native
  sealed trait `x-image-position-default` extends StObject
  @scala.inline
  def `x-image-position-default`: `x-image-position-default` = "x-image-position-default".asInstanceOf[`x-image-position-default`]
  
  @js.native
  sealed trait `x-image-position-supported` extends StObject
  @scala.inline
  def `x-image-position-supported`: `x-image-position-supported` = "x-image-position-supported".asInstanceOf[`x-image-position-supported`]
  
  @js.native
  sealed trait `x-image-shift` extends Overrides
  @scala.inline
  def `x-image-shift`: `x-image-shift` = "x-image-shift".asInstanceOf[`x-image-shift`]
  
  @js.native
  sealed trait `x-image-shift-actual` extends StObject
  @scala.inline
  def `x-image-shift-actual`: `x-image-shift-actual` = "x-image-shift-actual".asInstanceOf[`x-image-shift-actual`]
  
  @js.native
  sealed trait `x-image-shift-default` extends StObject
  @scala.inline
  def `x-image-shift-default`: `x-image-shift-default` = "x-image-shift-default".asInstanceOf[`x-image-shift-default`]
  
  @js.native
  sealed trait `x-image-shift-supported` extends StObject
  @scala.inline
  def `x-image-shift-supported`: `x-image-shift-supported` = "x-image-shift-supported".asInstanceOf[`x-image-shift-supported`]
  
  @js.native
  sealed trait `x-iscii-as` extends CharacterSet
  @scala.inline
  def `x-iscii-as`: `x-iscii-as` = "x-iscii-as".asInstanceOf[`x-iscii-as`]
  
  @js.native
  sealed trait `x-iscii-be` extends CharacterSet
  @scala.inline
  def `x-iscii-be`: `x-iscii-be` = "x-iscii-be".asInstanceOf[`x-iscii-be`]
  
  @js.native
  sealed trait `x-iscii-de` extends CharacterSet
  @scala.inline
  def `x-iscii-de`: `x-iscii-de` = "x-iscii-de".asInstanceOf[`x-iscii-de`]
  
  @js.native
  sealed trait `x-iscii-gu` extends CharacterSet
  @scala.inline
  def `x-iscii-gu`: `x-iscii-gu` = "x-iscii-gu".asInstanceOf[`x-iscii-gu`]
  
  @js.native
  sealed trait `x-iscii-ka` extends CharacterSet
  @scala.inline
  def `x-iscii-ka`: `x-iscii-ka` = "x-iscii-ka".asInstanceOf[`x-iscii-ka`]
  
  @js.native
  sealed trait `x-iscii-ma` extends CharacterSet
  @scala.inline
  def `x-iscii-ma`: `x-iscii-ma` = "x-iscii-ma".asInstanceOf[`x-iscii-ma`]
  
  @js.native
  sealed trait `x-iscii-or` extends CharacterSet
  @scala.inline
  def `x-iscii-or`: `x-iscii-or` = "x-iscii-or".asInstanceOf[`x-iscii-or`]
  
  @js.native
  sealed trait `x-iscii-pa` extends CharacterSet
  @scala.inline
  def `x-iscii-pa`: `x-iscii-pa` = "x-iscii-pa".asInstanceOf[`x-iscii-pa`]
  
  @js.native
  sealed trait `x-iscii-ta` extends CharacterSet
  @scala.inline
  def `x-iscii-ta`: `x-iscii-ta` = "x-iscii-ta".asInstanceOf[`x-iscii-ta`]
  
  @js.native
  sealed trait `x-iscii-te` extends CharacterSet
  @scala.inline
  def `x-iscii-te`: `x-iscii-te` = "x-iscii-te".asInstanceOf[`x-iscii-te`]
  
  @js.native
  sealed trait `x-mac-arabic` extends CharacterSet
  @scala.inline
  def `x-mac-arabic`: `x-mac-arabic` = "x-mac-arabic".asInstanceOf[`x-mac-arabic`]
  
  @js.native
  sealed trait `x-mac-ce` extends CharacterSet
  @scala.inline
  def `x-mac-ce`: `x-mac-ce` = "x-mac-ce".asInstanceOf[`x-mac-ce`]
  
  @js.native
  sealed trait `x-mac-chinesesimp` extends CharacterSet
  @scala.inline
  def `x-mac-chinesesimp`: `x-mac-chinesesimp` = "x-mac-chinesesimp".asInstanceOf[`x-mac-chinesesimp`]
  
  @js.native
  sealed trait `x-mac-cyrillic` extends CharacterSet
  @scala.inline
  def `x-mac-cyrillic`: `x-mac-cyrillic` = "x-mac-cyrillic".asInstanceOf[`x-mac-cyrillic`]
  
  @js.native
  sealed trait `x-mac-greek` extends CharacterSet
  @scala.inline
  def `x-mac-greek`: `x-mac-greek` = "x-mac-greek".asInstanceOf[`x-mac-greek`]
  
  @js.native
  sealed trait `x-mac-hebrew` extends CharacterSet
  @scala.inline
  def `x-mac-hebrew`: `x-mac-hebrew` = "x-mac-hebrew".asInstanceOf[`x-mac-hebrew`]
  
  @js.native
  sealed trait `x-mac-icelandic` extends CharacterSet
  @scala.inline
  def `x-mac-icelandic`: `x-mac-icelandic` = "x-mac-icelandic".asInstanceOf[`x-mac-icelandic`]
  
  @js.native
  sealed trait `x-mac-japanese` extends CharacterSet
  @scala.inline
  def `x-mac-japanese`: `x-mac-japanese` = "x-mac-japanese".asInstanceOf[`x-mac-japanese`]
  
  @js.native
  sealed trait `x-mac-korean` extends CharacterSet
  @scala.inline
  def `x-mac-korean`: `x-mac-korean` = "x-mac-korean".asInstanceOf[`x-mac-korean`]
  
  @js.native
  sealed trait `x-mac-turkish` extends CharacterSet
  @scala.inline
  def `x-mac-turkish`: `x-mac-turkish` = "x-mac-turkish".asInstanceOf[`x-mac-turkish`]
  
  @js.native
  sealed trait `x-side1-image-shift` extends Overrides
  @scala.inline
  def `x-side1-image-shift`: `x-side1-image-shift` = "x-side1-image-shift".asInstanceOf[`x-side1-image-shift`]
  
  @js.native
  sealed trait `x-side1-image-shift-actual` extends StObject
  @scala.inline
  def `x-side1-image-shift-actual`: `x-side1-image-shift-actual` = "x-side1-image-shift-actual".asInstanceOf[`x-side1-image-shift-actual`]
  
  @js.native
  sealed trait `x-side1-image-shift-default` extends StObject
  @scala.inline
  def `x-side1-image-shift-default`: `x-side1-image-shift-default` = "x-side1-image-shift-default".asInstanceOf[`x-side1-image-shift-default`]
  
  @js.native
  sealed trait `x-side1-image-shift-supported` extends StObject
  @scala.inline
  def `x-side1-image-shift-supported`: `x-side1-image-shift-supported` = "x-side1-image-shift-supported".asInstanceOf[`x-side1-image-shift-supported`]
  
  @js.native
  sealed trait `x-side2-image-shift` extends Overrides
  @scala.inline
  def `x-side2-image-shift`: `x-side2-image-shift` = "x-side2-image-shift".asInstanceOf[`x-side2-image-shift`]
  
  @js.native
  sealed trait `x-side2-image-shift-actual` extends StObject
  @scala.inline
  def `x-side2-image-shift-actual`: `x-side2-image-shift-actual` = "x-side2-image-shift-actual".asInstanceOf[`x-side2-image-shift-actual`]
  
  @js.native
  sealed trait `x-side2-image-shift-default` extends StObject
  @scala.inline
  def `x-side2-image-shift-default`: `x-side2-image-shift-default` = "x-side2-image-shift-default".asInstanceOf[`x-side2-image-shift-default`]
  
  @js.native
  sealed trait `x-side2-image-shift-supported` extends StObject
  @scala.inline
  def `x-side2-image-shift-supported`: `x-side2-image-shift-supported` = "x-side2-image-shift-supported".asInstanceOf[`x-side2-image-shift-supported`]
  
  @js.native
  sealed trait xcon extends UriSchemes
  @scala.inline
  def xcon: xcon = "xcon".asInstanceOf[xcon]
  
  @js.native
  sealed trait `xcon-userid` extends UriSchemes
  @scala.inline
  def `xcon-userid`: `xcon-userid` = "xcon-userid".asInstanceOf[`xcon-userid`]
  
  @js.native
  sealed trait xfire extends UriSchemes
  @scala.inline
  def xfire: xfire = "xfire".asInstanceOf[xfire]
  
  @js.native
  sealed trait xmldsig extends DocumentDigitalSignature
  @scala.inline
  def xmldsig: xmldsig = "xmldsig".asInstanceOf[xmldsig]
  
  @js.native
  sealed trait xmlrpcDotbeep extends UriSchemes
  @scala.inline
  def xmlrpcDotbeep: xmlrpcDotbeep = "xmlrpc.beep".asInstanceOf[xmlrpcDotbeep]
  
  @js.native
  sealed trait xmlrpcDotbeeps extends UriSchemes
  @scala.inline
  def xmlrpcDotbeeps: xmlrpcDotbeeps = "xmlrpc.beeps".asInstanceOf[xmlrpcDotbeeps]
  
  @js.native
  sealed trait xmpp extends UriSchemes
  @scala.inline
  def xmpp: xmpp = "xmpp".asInstanceOf[xmpp]
  
  @js.native
  sealed trait xri extends UriSchemes
  @scala.inline
  def xri: xri = "xri".asInstanceOf[xri]
  
  @js.native
  sealed trait `y-direction` extends MediaGrain
  @scala.inline
  def `y-direction`: `y-direction` = "y-direction".asInstanceOf[`y-direction`]
  
  @js.native
  sealed trait `y-image-position` extends Overrides
  @scala.inline
  def `y-image-position`: `y-image-position` = "y-image-position".asInstanceOf[`y-image-position`]
  
  @js.native
  sealed trait `y-image-position-actual` extends StObject
  @scala.inline
  def `y-image-position-actual`: `y-image-position-actual` = "y-image-position-actual".asInstanceOf[`y-image-position-actual`]
  
  @js.native
  sealed trait `y-image-position-default` extends StObject
  @scala.inline
  def `y-image-position-default`: `y-image-position-default` = "y-image-position-default".asInstanceOf[`y-image-position-default`]
  
  @js.native
  sealed trait `y-image-position-supported` extends StObject
  @scala.inline
  def `y-image-position-supported`: `y-image-position-supported` = "y-image-position-supported".asInstanceOf[`y-image-position-supported`]
  
  @js.native
  sealed trait `y-image-shift` extends Overrides
  @scala.inline
  def `y-image-shift`: `y-image-shift` = "y-image-shift".asInstanceOf[`y-image-shift`]
  
  @js.native
  sealed trait `y-image-shift-actual` extends StObject
  @scala.inline
  def `y-image-shift-actual`: `y-image-shift-actual` = "y-image-shift-actual".asInstanceOf[`y-image-shift-actual`]
  
  @js.native
  sealed trait `y-image-shift-default` extends StObject
  @scala.inline
  def `y-image-shift-default`: `y-image-shift-default` = "y-image-shift-default".asInstanceOf[`y-image-shift-default`]
  
  @js.native
  sealed trait `y-image-shift-supported` extends StObject
  @scala.inline
  def `y-image-shift-supported`: `y-image-shift-supported` = "y-image-shift-supported".asInstanceOf[`y-image-shift-supported`]
  
  @js.native
  sealed trait `y-side1-image-shift` extends Overrides
  @scala.inline
  def `y-side1-image-shift`: `y-side1-image-shift` = "y-side1-image-shift".asInstanceOf[`y-side1-image-shift`]
  
  @js.native
  sealed trait `y-side1-image-shift-actual` extends StObject
  @scala.inline
  def `y-side1-image-shift-actual`: `y-side1-image-shift-actual` = "y-side1-image-shift-actual".asInstanceOf[`y-side1-image-shift-actual`]
  
  @js.native
  sealed trait `y-side1-image-shift-default` extends StObject
  @scala.inline
  def `y-side1-image-shift-default`: `y-side1-image-shift-default` = "y-side1-image-shift-default".asInstanceOf[`y-side1-image-shift-default`]
  
  @js.native
  sealed trait `y-side1-image-shift-supported` extends StObject
  @scala.inline
  def `y-side1-image-shift-supported`: `y-side1-image-shift-supported` = "y-side1-image-shift-supported".asInstanceOf[`y-side1-image-shift-supported`]
  
  @js.native
  sealed trait `y-side2-image-shift` extends Overrides
  @scala.inline
  def `y-side2-image-shift`: `y-side2-image-shift` = "y-side2-image-shift".asInstanceOf[`y-side2-image-shift`]
  
  @js.native
  sealed trait `y-side2-image-shift-actual` extends StObject
  @scala.inline
  def `y-side2-image-shift-actual`: `y-side2-image-shift-actual` = "y-side2-image-shift-actual".asInstanceOf[`y-side2-image-shift-actual`]
  
  @js.native
  sealed trait `y-side2-image-shift-default` extends StObject
  @scala.inline
  def `y-side2-image-shift-default`: `y-side2-image-shift-default` = "y-side2-image-shift-default".asInstanceOf[`y-side2-image-shift-default`]
  
  @js.native
  sealed trait `y-side2-image-shift-supported` extends StObject
  @scala.inline
  def `y-side2-image-shift-supported`: `y-side2-image-shift-supported` = "y-side2-image-shift-supported".asInstanceOf[`y-side2-image-shift-supported`]
  
  @js.native
  sealed trait yellow extends MediaColor
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait ymsgr extends UriSchemes
  @scala.inline
  def ymsgr: ymsgr = "ymsgr".asInstanceOf[ymsgr]
  
  @js.native
  sealed trait z39Dot50 extends UriSchemes
  @scala.inline
  def z39Dot50: z39Dot50 = "z39.50".asInstanceOf[z39Dot50]
  
  @js.native
  sealed trait z39Dot50r extends UriSchemes
  @scala.inline
  def z39Dot50r: z39Dot50r = "z39.50r".asInstanceOf[z39Dot50r]
  
  @js.native
  sealed trait z39Dot50s extends UriSchemes
  @scala.inline
  def z39Dot50s: z39Dot50s = "z39.50s".asInstanceOf[z39Dot50s]
}
