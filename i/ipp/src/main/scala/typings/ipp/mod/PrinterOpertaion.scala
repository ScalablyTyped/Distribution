package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ipp.ippStrings.`Acknowledge-Document`
  - typings.ipp.ippStrings.`Acknowledge-Identify-Printer`
  - typings.ipp.ippStrings.`Acknowledge-Job`
  - typings.ipp.ippStrings.`Activate-Printer`
  - typings.ipp.ippStrings.`Add-Document-Images`
  - typings.ipp.ippStrings.`Allocate-Printer-Resources`
  - typings.ipp.ippStrings.`Cancel-Current-Job`
  - typings.ipp.ippStrings.`Cancel-Document`
  - typings.ipp.ippStrings.`Cancel-Job`
  - typings.ipp.ippStrings.`Cancel-Jobs`
  - typings.ipp.ippStrings.`Cancel-My-Jobs`
  - typings.ipp.ippStrings.`Cancel-Resource`
  - typings.ipp.ippStrings.`Cancel-Subscription`
  - typings.ipp.ippStrings.`Close-Job`
  - typings.ipp.ippStrings.`Create-Job`
  - typings.ipp.ippStrings.`Create-Job-Subscriptions`
  - typings.ipp.ippStrings.`Create-Printer`
  - typings.ipp.ippStrings.`Create-Printer-Subscriptions`
  - typings.ipp.ippStrings.`Create-Resource`
  - typings.ipp.ippStrings.`Create-Resource-Subscriptions`
  - typings.ipp.ippStrings.`Create-System-Subscriptions`
  - typings.ipp.ippStrings.`Deactivate-Printer`
  - typings.ipp.ippStrings.`Deallocate-Printer-Resources`
  - typings.ipp.ippStrings.`Delete-Document`
  - typings.ipp.ippStrings.`Delete-Printer`
  - typings.ipp.ippStrings.`Deregister-Output-Device`
  - typings.ipp.ippStrings.`Disable-All-Printers`
  - typings.ipp.ippStrings.`Disable-Printer`
  - typings.ipp.ippStrings.`Enable-All-Printers`
  - typings.ipp.ippStrings.`Enable-Printer`
  - typings.ipp.ippStrings.`Fetch-Document`
  - typings.ipp.ippStrings.`Fetch-Job`
  - typings.ipp.ippStrings.`Get-Document-Attributes`
  - typings.ipp.ippStrings.`Get-Documents`
  - typings.ipp.ippStrings.`Get-Job-Attributes`
  - typings.ipp.ippStrings.`Get-Jobs`
  - typings.ipp.ippStrings.`Get-Next-Document-Data`
  - typings.ipp.ippStrings.`Get-Notifications`
  - typings.ipp.ippStrings.`Get-Output-Device-Attributes`
  - typings.ipp.ippStrings.`Get-Printer-Attributes`
  - typings.ipp.ippStrings.`Get-Printer-Resources`
  - typings.ipp.ippStrings.`Get-Printer-Supported-Values`
  - typings.ipp.ippStrings.`Get-Printers`
  - typings.ipp.ippStrings.`Get-Resource-Attributes`
  - typings.ipp.ippStrings.`Get-Resources`
  - typings.ipp.ippStrings.`Get-Subscription-Attributes`
  - typings.ipp.ippStrings.`Get-Subscriptions`
  - typings.ipp.ippStrings.`Get-System-Attributes`
  - typings.ipp.ippStrings.`Get-System-Supported-Values`
  - typings.ipp.ippStrings.`Get-User-Printer-Attributes`
  - typings.ipp.ippStrings.`Hold-Job`
  - typings.ipp.ippStrings.`Hold-New-Jobs`
  - typings.ipp.ippStrings.`Identify-Printer`
  - typings.ipp.ippStrings.`Install-Resource`
  - typings.ipp.ippStrings.`Pause-All-Printers`
  - typings.ipp.ippStrings.`Pause-All-Printers-After-Current-Job`
  - typings.ipp.ippStrings.`Pause-Printer`
  - typings.ipp.ippStrings.`Pause-Printer-After-Current-Job`
  - typings.ipp.ippStrings.`Print-Job`
  - typings.ipp.ippStrings.`Print-URI`
  - typings.ipp.ippStrings.`Promote-Job`
  - typings.ipp.ippStrings.`Purge-Jobs`
  - typings.ipp.ippStrings.`Register-Output-Device`
  - typings.ipp.ippStrings.`Release-Held-New-Jobs`
  - typings.ipp.ippStrings.`Release-Job`
  - typings.ipp.ippStrings.`Renew-Subscription`
  - typings.ipp.ippStrings.`Reprocess-Job`
  - typings.ipp.ippStrings.`Restart-Job`
  - typings.ipp.ippStrings.`Restart-One-Printer`
  - typings.ipp.ippStrings.`Restart-Printer`
  - typings.ipp.ippStrings.`Restart-System`
  - typings.ipp.ippStrings.`Resubmit-Job`
  - typings.ipp.ippStrings.`Resume-All-Printers`
  - typings.ipp.ippStrings.`Resume-Job`
  - typings.ipp.ippStrings.`Resume-Printer`
  - typings.ipp.ippStrings.`Schedule-Job-After`
  - typings.ipp.ippStrings.`Send-Document`
  - typings.ipp.ippStrings.`Send-Resource-Data`
  - typings.ipp.ippStrings.`Send-URI`
  - typings.ipp.ippStrings.`Set-Document-Attributes`
  - typings.ipp.ippStrings.`Set-Job-Attributes`
  - typings.ipp.ippStrings.`Set-Printer-Attributes`
  - typings.ipp.ippStrings.`Set-Resource-Attributes`
  - typings.ipp.ippStrings.`Set-System-Attributes`
  - typings.ipp.ippStrings.`Shutdown-All-Printers`
  - typings.ipp.ippStrings.`Shutdown-One-Printer`
  - typings.ipp.ippStrings.`Shutdown-Printer`
  - typings.ipp.ippStrings.`Startup-All-Printers`
  - typings.ipp.ippStrings.`Startup-One-Printer`
  - typings.ipp.ippStrings.`Startup-Printer`
  - typings.ipp.ippStrings.`Suspend-Current-Job`
  - typings.ipp.ippStrings.`Update-Active-Jobs`
  - typings.ipp.ippStrings.`Update-Document-Status`
  - typings.ipp.ippStrings.`Update-Job-Status`
  - typings.ipp.ippStrings.`Update-Output-Device-Attributes`
  - typings.ipp.ippStrings.`Validate-Document`
  - typings.ipp.ippStrings.`Validate-Job`
  - typings.ipp.ippStrings.Value
*/
trait PrinterOpertaion extends StObject
object PrinterOpertaion {
  
  @scala.inline
  def `Acknowledge-Document`: typings.ipp.ippStrings.`Acknowledge-Document` = "Acknowledge-Document".asInstanceOf[typings.ipp.ippStrings.`Acknowledge-Document`]
  
  @scala.inline
  def `Acknowledge-Identify-Printer`: typings.ipp.ippStrings.`Acknowledge-Identify-Printer` = "Acknowledge-Identify-Printer".asInstanceOf[typings.ipp.ippStrings.`Acknowledge-Identify-Printer`]
  
  @scala.inline
  def `Acknowledge-Job`: typings.ipp.ippStrings.`Acknowledge-Job` = "Acknowledge-Job".asInstanceOf[typings.ipp.ippStrings.`Acknowledge-Job`]
  
  @scala.inline
  def `Activate-Printer`: typings.ipp.ippStrings.`Activate-Printer` = "Activate-Printer".asInstanceOf[typings.ipp.ippStrings.`Activate-Printer`]
  
  @scala.inline
  def `Add-Document-Images`: typings.ipp.ippStrings.`Add-Document-Images` = "Add-Document-Images".asInstanceOf[typings.ipp.ippStrings.`Add-Document-Images`]
  
  @scala.inline
  def `Allocate-Printer-Resources`: typings.ipp.ippStrings.`Allocate-Printer-Resources` = "Allocate-Printer-Resources".asInstanceOf[typings.ipp.ippStrings.`Allocate-Printer-Resources`]
  
  @scala.inline
  def `Cancel-Current-Job`: typings.ipp.ippStrings.`Cancel-Current-Job` = "Cancel-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Cancel-Current-Job`]
  
  @scala.inline
  def `Cancel-Document`: typings.ipp.ippStrings.`Cancel-Document` = "Cancel-Document".asInstanceOf[typings.ipp.ippStrings.`Cancel-Document`]
  
  @scala.inline
  def `Cancel-Job`: typings.ipp.ippStrings.`Cancel-Job` = "Cancel-Job".asInstanceOf[typings.ipp.ippStrings.`Cancel-Job`]
  
  @scala.inline
  def `Cancel-Jobs`: typings.ipp.ippStrings.`Cancel-Jobs` = "Cancel-Jobs".asInstanceOf[typings.ipp.ippStrings.`Cancel-Jobs`]
  
  @scala.inline
  def `Cancel-My-Jobs`: typings.ipp.ippStrings.`Cancel-My-Jobs` = "Cancel-My-Jobs".asInstanceOf[typings.ipp.ippStrings.`Cancel-My-Jobs`]
  
  @scala.inline
  def `Cancel-Resource`: typings.ipp.ippStrings.`Cancel-Resource` = "Cancel-Resource".asInstanceOf[typings.ipp.ippStrings.`Cancel-Resource`]
  
  @scala.inline
  def `Cancel-Subscription`: typings.ipp.ippStrings.`Cancel-Subscription` = "Cancel-Subscription".asInstanceOf[typings.ipp.ippStrings.`Cancel-Subscription`]
  
  @scala.inline
  def `Close-Job`: typings.ipp.ippStrings.`Close-Job` = "Close-Job".asInstanceOf[typings.ipp.ippStrings.`Close-Job`]
  
  @scala.inline
  def `Create-Job`: typings.ipp.ippStrings.`Create-Job` = "Create-Job".asInstanceOf[typings.ipp.ippStrings.`Create-Job`]
  
  @scala.inline
  def `Create-Job-Subscriptions`: typings.ipp.ippStrings.`Create-Job-Subscriptions` = "Create-Job-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-Job-Subscriptions`]
  
  @scala.inline
  def `Create-Printer`: typings.ipp.ippStrings.`Create-Printer` = "Create-Printer".asInstanceOf[typings.ipp.ippStrings.`Create-Printer`]
  
  @scala.inline
  def `Create-Printer-Subscriptions`: typings.ipp.ippStrings.`Create-Printer-Subscriptions` = "Create-Printer-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-Printer-Subscriptions`]
  
  @scala.inline
  def `Create-Resource`: typings.ipp.ippStrings.`Create-Resource` = "Create-Resource".asInstanceOf[typings.ipp.ippStrings.`Create-Resource`]
  
  @scala.inline
  def `Create-Resource-Subscriptions`: typings.ipp.ippStrings.`Create-Resource-Subscriptions` = "Create-Resource-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-Resource-Subscriptions`]
  
  @scala.inline
  def `Create-System-Subscriptions`: typings.ipp.ippStrings.`Create-System-Subscriptions` = "Create-System-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-System-Subscriptions`]
  
  @scala.inline
  def `Deactivate-Printer`: typings.ipp.ippStrings.`Deactivate-Printer` = "Deactivate-Printer".asInstanceOf[typings.ipp.ippStrings.`Deactivate-Printer`]
  
  @scala.inline
  def `Deallocate-Printer-Resources`: typings.ipp.ippStrings.`Deallocate-Printer-Resources` = "Deallocate-Printer-Resources".asInstanceOf[typings.ipp.ippStrings.`Deallocate-Printer-Resources`]
  
  @scala.inline
  def `Delete-Document`: typings.ipp.ippStrings.`Delete-Document` = "Delete-Document".asInstanceOf[typings.ipp.ippStrings.`Delete-Document`]
  
  @scala.inline
  def `Delete-Printer`: typings.ipp.ippStrings.`Delete-Printer` = "Delete-Printer".asInstanceOf[typings.ipp.ippStrings.`Delete-Printer`]
  
  @scala.inline
  def `Deregister-Output-Device`: typings.ipp.ippStrings.`Deregister-Output-Device` = "Deregister-Output-Device".asInstanceOf[typings.ipp.ippStrings.`Deregister-Output-Device`]
  
  @scala.inline
  def `Disable-All-Printers`: typings.ipp.ippStrings.`Disable-All-Printers` = "Disable-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Disable-All-Printers`]
  
  @scala.inline
  def `Disable-Printer`: typings.ipp.ippStrings.`Disable-Printer` = "Disable-Printer".asInstanceOf[typings.ipp.ippStrings.`Disable-Printer`]
  
  @scala.inline
  def `Enable-All-Printers`: typings.ipp.ippStrings.`Enable-All-Printers` = "Enable-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Enable-All-Printers`]
  
  @scala.inline
  def `Enable-Printer`: typings.ipp.ippStrings.`Enable-Printer` = "Enable-Printer".asInstanceOf[typings.ipp.ippStrings.`Enable-Printer`]
  
  @scala.inline
  def `Fetch-Document`: typings.ipp.ippStrings.`Fetch-Document` = "Fetch-Document".asInstanceOf[typings.ipp.ippStrings.`Fetch-Document`]
  
  @scala.inline
  def `Fetch-Job`: typings.ipp.ippStrings.`Fetch-Job` = "Fetch-Job".asInstanceOf[typings.ipp.ippStrings.`Fetch-Job`]
  
  @scala.inline
  def `Get-Document-Attributes`: typings.ipp.ippStrings.`Get-Document-Attributes` = "Get-Document-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Document-Attributes`]
  
  @scala.inline
  def `Get-Documents`: typings.ipp.ippStrings.`Get-Documents` = "Get-Documents".asInstanceOf[typings.ipp.ippStrings.`Get-Documents`]
  
  @scala.inline
  def `Get-Job-Attributes`: typings.ipp.ippStrings.`Get-Job-Attributes` = "Get-Job-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Job-Attributes`]
  
  @scala.inline
  def `Get-Jobs`: typings.ipp.ippStrings.`Get-Jobs` = "Get-Jobs".asInstanceOf[typings.ipp.ippStrings.`Get-Jobs`]
  
  @scala.inline
  def `Get-Next-Document-Data`: typings.ipp.ippStrings.`Get-Next-Document-Data` = "Get-Next-Document-Data".asInstanceOf[typings.ipp.ippStrings.`Get-Next-Document-Data`]
  
  @scala.inline
  def `Get-Notifications`: typings.ipp.ippStrings.`Get-Notifications` = "Get-Notifications".asInstanceOf[typings.ipp.ippStrings.`Get-Notifications`]
  
  @scala.inline
  def `Get-Output-Device-Attributes`: typings.ipp.ippStrings.`Get-Output-Device-Attributes` = "Get-Output-Device-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Output-Device-Attributes`]
  
  @scala.inline
  def `Get-Printer-Attributes`: typings.ipp.ippStrings.`Get-Printer-Attributes` = "Get-Printer-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Printer-Attributes`]
  
  @scala.inline
  def `Get-Printer-Resources`: typings.ipp.ippStrings.`Get-Printer-Resources` = "Get-Printer-Resources".asInstanceOf[typings.ipp.ippStrings.`Get-Printer-Resources`]
  
  @scala.inline
  def `Get-Printer-Supported-Values`: typings.ipp.ippStrings.`Get-Printer-Supported-Values` = "Get-Printer-Supported-Values".asInstanceOf[typings.ipp.ippStrings.`Get-Printer-Supported-Values`]
  
  @scala.inline
  def `Get-Printers`: typings.ipp.ippStrings.`Get-Printers` = "Get-Printers".asInstanceOf[typings.ipp.ippStrings.`Get-Printers`]
  
  @scala.inline
  def `Get-Resource-Attributes`: typings.ipp.ippStrings.`Get-Resource-Attributes` = "Get-Resource-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Resource-Attributes`]
  
  @scala.inline
  def `Get-Resources`: typings.ipp.ippStrings.`Get-Resources` = "Get-Resources".asInstanceOf[typings.ipp.ippStrings.`Get-Resources`]
  
  @scala.inline
  def `Get-Subscription-Attributes`: typings.ipp.ippStrings.`Get-Subscription-Attributes` = "Get-Subscription-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Subscription-Attributes`]
  
  @scala.inline
  def `Get-Subscriptions`: typings.ipp.ippStrings.`Get-Subscriptions` = "Get-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Get-Subscriptions`]
  
  @scala.inline
  def `Get-System-Attributes`: typings.ipp.ippStrings.`Get-System-Attributes` = "Get-System-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-System-Attributes`]
  
  @scala.inline
  def `Get-System-Supported-Values`: typings.ipp.ippStrings.`Get-System-Supported-Values` = "Get-System-Supported-Values".asInstanceOf[typings.ipp.ippStrings.`Get-System-Supported-Values`]
  
  @scala.inline
  def `Get-User-Printer-Attributes`: typings.ipp.ippStrings.`Get-User-Printer-Attributes` = "Get-User-Printer-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-User-Printer-Attributes`]
  
  @scala.inline
  def `Hold-Job`: typings.ipp.ippStrings.`Hold-Job` = "Hold-Job".asInstanceOf[typings.ipp.ippStrings.`Hold-Job`]
  
  @scala.inline
  def `Hold-New-Jobs`: typings.ipp.ippStrings.`Hold-New-Jobs` = "Hold-New-Jobs".asInstanceOf[typings.ipp.ippStrings.`Hold-New-Jobs`]
  
  @scala.inline
  def `Identify-Printer`: typings.ipp.ippStrings.`Identify-Printer` = "Identify-Printer".asInstanceOf[typings.ipp.ippStrings.`Identify-Printer`]
  
  @scala.inline
  def `Install-Resource`: typings.ipp.ippStrings.`Install-Resource` = "Install-Resource".asInstanceOf[typings.ipp.ippStrings.`Install-Resource`]
  
  @scala.inline
  def `Pause-All-Printers`: typings.ipp.ippStrings.`Pause-All-Printers` = "Pause-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Pause-All-Printers`]
  
  @scala.inline
  def `Pause-All-Printers-After-Current-Job`: typings.ipp.ippStrings.`Pause-All-Printers-After-Current-Job` = "Pause-All-Printers-After-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Pause-All-Printers-After-Current-Job`]
  
  @scala.inline
  def `Pause-Printer`: typings.ipp.ippStrings.`Pause-Printer` = "Pause-Printer".asInstanceOf[typings.ipp.ippStrings.`Pause-Printer`]
  
  @scala.inline
  def `Pause-Printer-After-Current-Job`: typings.ipp.ippStrings.`Pause-Printer-After-Current-Job` = "Pause-Printer-After-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Pause-Printer-After-Current-Job`]
  
  @scala.inline
  def `Print-Job`: typings.ipp.ippStrings.`Print-Job` = "Print-Job".asInstanceOf[typings.ipp.ippStrings.`Print-Job`]
  
  @scala.inline
  def `Print-URI`: typings.ipp.ippStrings.`Print-URI` = "Print-URI".asInstanceOf[typings.ipp.ippStrings.`Print-URI`]
  
  @scala.inline
  def `Promote-Job`: typings.ipp.ippStrings.`Promote-Job` = "Promote-Job".asInstanceOf[typings.ipp.ippStrings.`Promote-Job`]
  
  @scala.inline
  def `Purge-Jobs`: typings.ipp.ippStrings.`Purge-Jobs` = "Purge-Jobs".asInstanceOf[typings.ipp.ippStrings.`Purge-Jobs`]
  
  @scala.inline
  def `Register-Output-Device`: typings.ipp.ippStrings.`Register-Output-Device` = "Register-Output-Device".asInstanceOf[typings.ipp.ippStrings.`Register-Output-Device`]
  
  @scala.inline
  def `Release-Held-New-Jobs`: typings.ipp.ippStrings.`Release-Held-New-Jobs` = "Release-Held-New-Jobs".asInstanceOf[typings.ipp.ippStrings.`Release-Held-New-Jobs`]
  
  @scala.inline
  def `Release-Job`: typings.ipp.ippStrings.`Release-Job` = "Release-Job".asInstanceOf[typings.ipp.ippStrings.`Release-Job`]
  
  @scala.inline
  def `Renew-Subscription`: typings.ipp.ippStrings.`Renew-Subscription` = "Renew-Subscription".asInstanceOf[typings.ipp.ippStrings.`Renew-Subscription`]
  
  @scala.inline
  def `Reprocess-Job`: typings.ipp.ippStrings.`Reprocess-Job` = "Reprocess-Job".asInstanceOf[typings.ipp.ippStrings.`Reprocess-Job`]
  
  @scala.inline
  def `Restart-Job`: typings.ipp.ippStrings.`Restart-Job` = "Restart-Job".asInstanceOf[typings.ipp.ippStrings.`Restart-Job`]
  
  @scala.inline
  def `Restart-One-Printer`: typings.ipp.ippStrings.`Restart-One-Printer` = "Restart-One-Printer".asInstanceOf[typings.ipp.ippStrings.`Restart-One-Printer`]
  
  @scala.inline
  def `Restart-Printer`: typings.ipp.ippStrings.`Restart-Printer` = "Restart-Printer".asInstanceOf[typings.ipp.ippStrings.`Restart-Printer`]
  
  @scala.inline
  def `Restart-System`: typings.ipp.ippStrings.`Restart-System` = "Restart-System".asInstanceOf[typings.ipp.ippStrings.`Restart-System`]
  
  @scala.inline
  def `Resubmit-Job`: typings.ipp.ippStrings.`Resubmit-Job` = "Resubmit-Job".asInstanceOf[typings.ipp.ippStrings.`Resubmit-Job`]
  
  @scala.inline
  def `Resume-All-Printers`: typings.ipp.ippStrings.`Resume-All-Printers` = "Resume-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Resume-All-Printers`]
  
  @scala.inline
  def `Resume-Job`: typings.ipp.ippStrings.`Resume-Job` = "Resume-Job".asInstanceOf[typings.ipp.ippStrings.`Resume-Job`]
  
  @scala.inline
  def `Resume-Printer`: typings.ipp.ippStrings.`Resume-Printer` = "Resume-Printer".asInstanceOf[typings.ipp.ippStrings.`Resume-Printer`]
  
  @scala.inline
  def `Schedule-Job-After`: typings.ipp.ippStrings.`Schedule-Job-After` = "Schedule-Job-After".asInstanceOf[typings.ipp.ippStrings.`Schedule-Job-After`]
  
  @scala.inline
  def `Send-Document`: typings.ipp.ippStrings.`Send-Document` = "Send-Document".asInstanceOf[typings.ipp.ippStrings.`Send-Document`]
  
  @scala.inline
  def `Send-Resource-Data`: typings.ipp.ippStrings.`Send-Resource-Data` = "Send-Resource-Data".asInstanceOf[typings.ipp.ippStrings.`Send-Resource-Data`]
  
  @scala.inline
  def `Send-URI`: typings.ipp.ippStrings.`Send-URI` = "Send-URI".asInstanceOf[typings.ipp.ippStrings.`Send-URI`]
  
  @scala.inline
  def `Set-Document-Attributes`: typings.ipp.ippStrings.`Set-Document-Attributes` = "Set-Document-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Document-Attributes`]
  
  @scala.inline
  def `Set-Job-Attributes`: typings.ipp.ippStrings.`Set-Job-Attributes` = "Set-Job-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Job-Attributes`]
  
  @scala.inline
  def `Set-Printer-Attributes`: typings.ipp.ippStrings.`Set-Printer-Attributes` = "Set-Printer-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Printer-Attributes`]
  
  @scala.inline
  def `Set-Resource-Attributes`: typings.ipp.ippStrings.`Set-Resource-Attributes` = "Set-Resource-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Resource-Attributes`]
  
  @scala.inline
  def `Set-System-Attributes`: typings.ipp.ippStrings.`Set-System-Attributes` = "Set-System-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-System-Attributes`]
  
  @scala.inline
  def `Shutdown-All-Printers`: typings.ipp.ippStrings.`Shutdown-All-Printers` = "Shutdown-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Shutdown-All-Printers`]
  
  @scala.inline
  def `Shutdown-One-Printer`: typings.ipp.ippStrings.`Shutdown-One-Printer` = "Shutdown-One-Printer".asInstanceOf[typings.ipp.ippStrings.`Shutdown-One-Printer`]
  
  @scala.inline
  def `Shutdown-Printer`: typings.ipp.ippStrings.`Shutdown-Printer` = "Shutdown-Printer".asInstanceOf[typings.ipp.ippStrings.`Shutdown-Printer`]
  
  @scala.inline
  def `Startup-All-Printers`: typings.ipp.ippStrings.`Startup-All-Printers` = "Startup-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Startup-All-Printers`]
  
  @scala.inline
  def `Startup-One-Printer`: typings.ipp.ippStrings.`Startup-One-Printer` = "Startup-One-Printer".asInstanceOf[typings.ipp.ippStrings.`Startup-One-Printer`]
  
  @scala.inline
  def `Startup-Printer`: typings.ipp.ippStrings.`Startup-Printer` = "Startup-Printer".asInstanceOf[typings.ipp.ippStrings.`Startup-Printer`]
  
  @scala.inline
  def `Suspend-Current-Job`: typings.ipp.ippStrings.`Suspend-Current-Job` = "Suspend-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Suspend-Current-Job`]
  
  @scala.inline
  def `Update-Active-Jobs`: typings.ipp.ippStrings.`Update-Active-Jobs` = "Update-Active-Jobs".asInstanceOf[typings.ipp.ippStrings.`Update-Active-Jobs`]
  
  @scala.inline
  def `Update-Document-Status`: typings.ipp.ippStrings.`Update-Document-Status` = "Update-Document-Status".asInstanceOf[typings.ipp.ippStrings.`Update-Document-Status`]
  
  @scala.inline
  def `Update-Job-Status`: typings.ipp.ippStrings.`Update-Job-Status` = "Update-Job-Status".asInstanceOf[typings.ipp.ippStrings.`Update-Job-Status`]
  
  @scala.inline
  def `Update-Output-Device-Attributes`: typings.ipp.ippStrings.`Update-Output-Device-Attributes` = "Update-Output-Device-Attributes".asInstanceOf[typings.ipp.ippStrings.`Update-Output-Device-Attributes`]
  
  @scala.inline
  def `Validate-Document`: typings.ipp.ippStrings.`Validate-Document` = "Validate-Document".asInstanceOf[typings.ipp.ippStrings.`Validate-Document`]
  
  @scala.inline
  def `Validate-Job`: typings.ipp.ippStrings.`Validate-Job` = "Validate-Job".asInstanceOf[typings.ipp.ippStrings.`Validate-Job`]
  
  @scala.inline
  def Value: typings.ipp.ippStrings.Value = "Value".asInstanceOf[typings.ipp.ippStrings.Value]
}
