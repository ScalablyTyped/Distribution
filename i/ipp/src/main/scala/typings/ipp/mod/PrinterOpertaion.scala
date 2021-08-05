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
  
  inline def `Acknowledge-Document`: typings.ipp.ippStrings.`Acknowledge-Document` = "Acknowledge-Document".asInstanceOf[typings.ipp.ippStrings.`Acknowledge-Document`]
  
  inline def `Acknowledge-Identify-Printer`: typings.ipp.ippStrings.`Acknowledge-Identify-Printer` = "Acknowledge-Identify-Printer".asInstanceOf[typings.ipp.ippStrings.`Acknowledge-Identify-Printer`]
  
  inline def `Acknowledge-Job`: typings.ipp.ippStrings.`Acknowledge-Job` = "Acknowledge-Job".asInstanceOf[typings.ipp.ippStrings.`Acknowledge-Job`]
  
  inline def `Activate-Printer`: typings.ipp.ippStrings.`Activate-Printer` = "Activate-Printer".asInstanceOf[typings.ipp.ippStrings.`Activate-Printer`]
  
  inline def `Add-Document-Images`: typings.ipp.ippStrings.`Add-Document-Images` = "Add-Document-Images".asInstanceOf[typings.ipp.ippStrings.`Add-Document-Images`]
  
  inline def `Allocate-Printer-Resources`: typings.ipp.ippStrings.`Allocate-Printer-Resources` = "Allocate-Printer-Resources".asInstanceOf[typings.ipp.ippStrings.`Allocate-Printer-Resources`]
  
  inline def `Cancel-Current-Job`: typings.ipp.ippStrings.`Cancel-Current-Job` = "Cancel-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Cancel-Current-Job`]
  
  inline def `Cancel-Document`: typings.ipp.ippStrings.`Cancel-Document` = "Cancel-Document".asInstanceOf[typings.ipp.ippStrings.`Cancel-Document`]
  
  inline def `Cancel-Job`: typings.ipp.ippStrings.`Cancel-Job` = "Cancel-Job".asInstanceOf[typings.ipp.ippStrings.`Cancel-Job`]
  
  inline def `Cancel-Jobs`: typings.ipp.ippStrings.`Cancel-Jobs` = "Cancel-Jobs".asInstanceOf[typings.ipp.ippStrings.`Cancel-Jobs`]
  
  inline def `Cancel-My-Jobs`: typings.ipp.ippStrings.`Cancel-My-Jobs` = "Cancel-My-Jobs".asInstanceOf[typings.ipp.ippStrings.`Cancel-My-Jobs`]
  
  inline def `Cancel-Resource`: typings.ipp.ippStrings.`Cancel-Resource` = "Cancel-Resource".asInstanceOf[typings.ipp.ippStrings.`Cancel-Resource`]
  
  inline def `Cancel-Subscription`: typings.ipp.ippStrings.`Cancel-Subscription` = "Cancel-Subscription".asInstanceOf[typings.ipp.ippStrings.`Cancel-Subscription`]
  
  inline def `Close-Job`: typings.ipp.ippStrings.`Close-Job` = "Close-Job".asInstanceOf[typings.ipp.ippStrings.`Close-Job`]
  
  inline def `Create-Job`: typings.ipp.ippStrings.`Create-Job` = "Create-Job".asInstanceOf[typings.ipp.ippStrings.`Create-Job`]
  
  inline def `Create-Job-Subscriptions`: typings.ipp.ippStrings.`Create-Job-Subscriptions` = "Create-Job-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-Job-Subscriptions`]
  
  inline def `Create-Printer`: typings.ipp.ippStrings.`Create-Printer` = "Create-Printer".asInstanceOf[typings.ipp.ippStrings.`Create-Printer`]
  
  inline def `Create-Printer-Subscriptions`: typings.ipp.ippStrings.`Create-Printer-Subscriptions` = "Create-Printer-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-Printer-Subscriptions`]
  
  inline def `Create-Resource`: typings.ipp.ippStrings.`Create-Resource` = "Create-Resource".asInstanceOf[typings.ipp.ippStrings.`Create-Resource`]
  
  inline def `Create-Resource-Subscriptions`: typings.ipp.ippStrings.`Create-Resource-Subscriptions` = "Create-Resource-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-Resource-Subscriptions`]
  
  inline def `Create-System-Subscriptions`: typings.ipp.ippStrings.`Create-System-Subscriptions` = "Create-System-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Create-System-Subscriptions`]
  
  inline def `Deactivate-Printer`: typings.ipp.ippStrings.`Deactivate-Printer` = "Deactivate-Printer".asInstanceOf[typings.ipp.ippStrings.`Deactivate-Printer`]
  
  inline def `Deallocate-Printer-Resources`: typings.ipp.ippStrings.`Deallocate-Printer-Resources` = "Deallocate-Printer-Resources".asInstanceOf[typings.ipp.ippStrings.`Deallocate-Printer-Resources`]
  
  inline def `Delete-Document`: typings.ipp.ippStrings.`Delete-Document` = "Delete-Document".asInstanceOf[typings.ipp.ippStrings.`Delete-Document`]
  
  inline def `Delete-Printer`: typings.ipp.ippStrings.`Delete-Printer` = "Delete-Printer".asInstanceOf[typings.ipp.ippStrings.`Delete-Printer`]
  
  inline def `Deregister-Output-Device`: typings.ipp.ippStrings.`Deregister-Output-Device` = "Deregister-Output-Device".asInstanceOf[typings.ipp.ippStrings.`Deregister-Output-Device`]
  
  inline def `Disable-All-Printers`: typings.ipp.ippStrings.`Disable-All-Printers` = "Disable-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Disable-All-Printers`]
  
  inline def `Disable-Printer`: typings.ipp.ippStrings.`Disable-Printer` = "Disable-Printer".asInstanceOf[typings.ipp.ippStrings.`Disable-Printer`]
  
  inline def `Enable-All-Printers`: typings.ipp.ippStrings.`Enable-All-Printers` = "Enable-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Enable-All-Printers`]
  
  inline def `Enable-Printer`: typings.ipp.ippStrings.`Enable-Printer` = "Enable-Printer".asInstanceOf[typings.ipp.ippStrings.`Enable-Printer`]
  
  inline def `Fetch-Document`: typings.ipp.ippStrings.`Fetch-Document` = "Fetch-Document".asInstanceOf[typings.ipp.ippStrings.`Fetch-Document`]
  
  inline def `Fetch-Job`: typings.ipp.ippStrings.`Fetch-Job` = "Fetch-Job".asInstanceOf[typings.ipp.ippStrings.`Fetch-Job`]
  
  inline def `Get-Document-Attributes`: typings.ipp.ippStrings.`Get-Document-Attributes` = "Get-Document-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Document-Attributes`]
  
  inline def `Get-Documents`: typings.ipp.ippStrings.`Get-Documents` = "Get-Documents".asInstanceOf[typings.ipp.ippStrings.`Get-Documents`]
  
  inline def `Get-Job-Attributes`: typings.ipp.ippStrings.`Get-Job-Attributes` = "Get-Job-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Job-Attributes`]
  
  inline def `Get-Jobs`: typings.ipp.ippStrings.`Get-Jobs` = "Get-Jobs".asInstanceOf[typings.ipp.ippStrings.`Get-Jobs`]
  
  inline def `Get-Next-Document-Data`: typings.ipp.ippStrings.`Get-Next-Document-Data` = "Get-Next-Document-Data".asInstanceOf[typings.ipp.ippStrings.`Get-Next-Document-Data`]
  
  inline def `Get-Notifications`: typings.ipp.ippStrings.`Get-Notifications` = "Get-Notifications".asInstanceOf[typings.ipp.ippStrings.`Get-Notifications`]
  
  inline def `Get-Output-Device-Attributes`: typings.ipp.ippStrings.`Get-Output-Device-Attributes` = "Get-Output-Device-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Output-Device-Attributes`]
  
  inline def `Get-Printer-Attributes`: typings.ipp.ippStrings.`Get-Printer-Attributes` = "Get-Printer-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Printer-Attributes`]
  
  inline def `Get-Printer-Resources`: typings.ipp.ippStrings.`Get-Printer-Resources` = "Get-Printer-Resources".asInstanceOf[typings.ipp.ippStrings.`Get-Printer-Resources`]
  
  inline def `Get-Printer-Supported-Values`: typings.ipp.ippStrings.`Get-Printer-Supported-Values` = "Get-Printer-Supported-Values".asInstanceOf[typings.ipp.ippStrings.`Get-Printer-Supported-Values`]
  
  inline def `Get-Printers`: typings.ipp.ippStrings.`Get-Printers` = "Get-Printers".asInstanceOf[typings.ipp.ippStrings.`Get-Printers`]
  
  inline def `Get-Resource-Attributes`: typings.ipp.ippStrings.`Get-Resource-Attributes` = "Get-Resource-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Resource-Attributes`]
  
  inline def `Get-Resources`: typings.ipp.ippStrings.`Get-Resources` = "Get-Resources".asInstanceOf[typings.ipp.ippStrings.`Get-Resources`]
  
  inline def `Get-Subscription-Attributes`: typings.ipp.ippStrings.`Get-Subscription-Attributes` = "Get-Subscription-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-Subscription-Attributes`]
  
  inline def `Get-Subscriptions`: typings.ipp.ippStrings.`Get-Subscriptions` = "Get-Subscriptions".asInstanceOf[typings.ipp.ippStrings.`Get-Subscriptions`]
  
  inline def `Get-System-Attributes`: typings.ipp.ippStrings.`Get-System-Attributes` = "Get-System-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-System-Attributes`]
  
  inline def `Get-System-Supported-Values`: typings.ipp.ippStrings.`Get-System-Supported-Values` = "Get-System-Supported-Values".asInstanceOf[typings.ipp.ippStrings.`Get-System-Supported-Values`]
  
  inline def `Get-User-Printer-Attributes`: typings.ipp.ippStrings.`Get-User-Printer-Attributes` = "Get-User-Printer-Attributes".asInstanceOf[typings.ipp.ippStrings.`Get-User-Printer-Attributes`]
  
  inline def `Hold-Job`: typings.ipp.ippStrings.`Hold-Job` = "Hold-Job".asInstanceOf[typings.ipp.ippStrings.`Hold-Job`]
  
  inline def `Hold-New-Jobs`: typings.ipp.ippStrings.`Hold-New-Jobs` = "Hold-New-Jobs".asInstanceOf[typings.ipp.ippStrings.`Hold-New-Jobs`]
  
  inline def `Identify-Printer`: typings.ipp.ippStrings.`Identify-Printer` = "Identify-Printer".asInstanceOf[typings.ipp.ippStrings.`Identify-Printer`]
  
  inline def `Install-Resource`: typings.ipp.ippStrings.`Install-Resource` = "Install-Resource".asInstanceOf[typings.ipp.ippStrings.`Install-Resource`]
  
  inline def `Pause-All-Printers`: typings.ipp.ippStrings.`Pause-All-Printers` = "Pause-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Pause-All-Printers`]
  
  inline def `Pause-All-Printers-After-Current-Job`: typings.ipp.ippStrings.`Pause-All-Printers-After-Current-Job` = "Pause-All-Printers-After-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Pause-All-Printers-After-Current-Job`]
  
  inline def `Pause-Printer`: typings.ipp.ippStrings.`Pause-Printer` = "Pause-Printer".asInstanceOf[typings.ipp.ippStrings.`Pause-Printer`]
  
  inline def `Pause-Printer-After-Current-Job`: typings.ipp.ippStrings.`Pause-Printer-After-Current-Job` = "Pause-Printer-After-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Pause-Printer-After-Current-Job`]
  
  inline def `Print-Job`: typings.ipp.ippStrings.`Print-Job` = "Print-Job".asInstanceOf[typings.ipp.ippStrings.`Print-Job`]
  
  inline def `Print-URI`: typings.ipp.ippStrings.`Print-URI` = "Print-URI".asInstanceOf[typings.ipp.ippStrings.`Print-URI`]
  
  inline def `Promote-Job`: typings.ipp.ippStrings.`Promote-Job` = "Promote-Job".asInstanceOf[typings.ipp.ippStrings.`Promote-Job`]
  
  inline def `Purge-Jobs`: typings.ipp.ippStrings.`Purge-Jobs` = "Purge-Jobs".asInstanceOf[typings.ipp.ippStrings.`Purge-Jobs`]
  
  inline def `Register-Output-Device`: typings.ipp.ippStrings.`Register-Output-Device` = "Register-Output-Device".asInstanceOf[typings.ipp.ippStrings.`Register-Output-Device`]
  
  inline def `Release-Held-New-Jobs`: typings.ipp.ippStrings.`Release-Held-New-Jobs` = "Release-Held-New-Jobs".asInstanceOf[typings.ipp.ippStrings.`Release-Held-New-Jobs`]
  
  inline def `Release-Job`: typings.ipp.ippStrings.`Release-Job` = "Release-Job".asInstanceOf[typings.ipp.ippStrings.`Release-Job`]
  
  inline def `Renew-Subscription`: typings.ipp.ippStrings.`Renew-Subscription` = "Renew-Subscription".asInstanceOf[typings.ipp.ippStrings.`Renew-Subscription`]
  
  inline def `Reprocess-Job`: typings.ipp.ippStrings.`Reprocess-Job` = "Reprocess-Job".asInstanceOf[typings.ipp.ippStrings.`Reprocess-Job`]
  
  inline def `Restart-Job`: typings.ipp.ippStrings.`Restart-Job` = "Restart-Job".asInstanceOf[typings.ipp.ippStrings.`Restart-Job`]
  
  inline def `Restart-One-Printer`: typings.ipp.ippStrings.`Restart-One-Printer` = "Restart-One-Printer".asInstanceOf[typings.ipp.ippStrings.`Restart-One-Printer`]
  
  inline def `Restart-Printer`: typings.ipp.ippStrings.`Restart-Printer` = "Restart-Printer".asInstanceOf[typings.ipp.ippStrings.`Restart-Printer`]
  
  inline def `Restart-System`: typings.ipp.ippStrings.`Restart-System` = "Restart-System".asInstanceOf[typings.ipp.ippStrings.`Restart-System`]
  
  inline def `Resubmit-Job`: typings.ipp.ippStrings.`Resubmit-Job` = "Resubmit-Job".asInstanceOf[typings.ipp.ippStrings.`Resubmit-Job`]
  
  inline def `Resume-All-Printers`: typings.ipp.ippStrings.`Resume-All-Printers` = "Resume-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Resume-All-Printers`]
  
  inline def `Resume-Job`: typings.ipp.ippStrings.`Resume-Job` = "Resume-Job".asInstanceOf[typings.ipp.ippStrings.`Resume-Job`]
  
  inline def `Resume-Printer`: typings.ipp.ippStrings.`Resume-Printer` = "Resume-Printer".asInstanceOf[typings.ipp.ippStrings.`Resume-Printer`]
  
  inline def `Schedule-Job-After`: typings.ipp.ippStrings.`Schedule-Job-After` = "Schedule-Job-After".asInstanceOf[typings.ipp.ippStrings.`Schedule-Job-After`]
  
  inline def `Send-Document`: typings.ipp.ippStrings.`Send-Document` = "Send-Document".asInstanceOf[typings.ipp.ippStrings.`Send-Document`]
  
  inline def `Send-Resource-Data`: typings.ipp.ippStrings.`Send-Resource-Data` = "Send-Resource-Data".asInstanceOf[typings.ipp.ippStrings.`Send-Resource-Data`]
  
  inline def `Send-URI`: typings.ipp.ippStrings.`Send-URI` = "Send-URI".asInstanceOf[typings.ipp.ippStrings.`Send-URI`]
  
  inline def `Set-Document-Attributes`: typings.ipp.ippStrings.`Set-Document-Attributes` = "Set-Document-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Document-Attributes`]
  
  inline def `Set-Job-Attributes`: typings.ipp.ippStrings.`Set-Job-Attributes` = "Set-Job-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Job-Attributes`]
  
  inline def `Set-Printer-Attributes`: typings.ipp.ippStrings.`Set-Printer-Attributes` = "Set-Printer-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Printer-Attributes`]
  
  inline def `Set-Resource-Attributes`: typings.ipp.ippStrings.`Set-Resource-Attributes` = "Set-Resource-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-Resource-Attributes`]
  
  inline def `Set-System-Attributes`: typings.ipp.ippStrings.`Set-System-Attributes` = "Set-System-Attributes".asInstanceOf[typings.ipp.ippStrings.`Set-System-Attributes`]
  
  inline def `Shutdown-All-Printers`: typings.ipp.ippStrings.`Shutdown-All-Printers` = "Shutdown-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Shutdown-All-Printers`]
  
  inline def `Shutdown-One-Printer`: typings.ipp.ippStrings.`Shutdown-One-Printer` = "Shutdown-One-Printer".asInstanceOf[typings.ipp.ippStrings.`Shutdown-One-Printer`]
  
  inline def `Shutdown-Printer`: typings.ipp.ippStrings.`Shutdown-Printer` = "Shutdown-Printer".asInstanceOf[typings.ipp.ippStrings.`Shutdown-Printer`]
  
  inline def `Startup-All-Printers`: typings.ipp.ippStrings.`Startup-All-Printers` = "Startup-All-Printers".asInstanceOf[typings.ipp.ippStrings.`Startup-All-Printers`]
  
  inline def `Startup-One-Printer`: typings.ipp.ippStrings.`Startup-One-Printer` = "Startup-One-Printer".asInstanceOf[typings.ipp.ippStrings.`Startup-One-Printer`]
  
  inline def `Startup-Printer`: typings.ipp.ippStrings.`Startup-Printer` = "Startup-Printer".asInstanceOf[typings.ipp.ippStrings.`Startup-Printer`]
  
  inline def `Suspend-Current-Job`: typings.ipp.ippStrings.`Suspend-Current-Job` = "Suspend-Current-Job".asInstanceOf[typings.ipp.ippStrings.`Suspend-Current-Job`]
  
  inline def `Update-Active-Jobs`: typings.ipp.ippStrings.`Update-Active-Jobs` = "Update-Active-Jobs".asInstanceOf[typings.ipp.ippStrings.`Update-Active-Jobs`]
  
  inline def `Update-Document-Status`: typings.ipp.ippStrings.`Update-Document-Status` = "Update-Document-Status".asInstanceOf[typings.ipp.ippStrings.`Update-Document-Status`]
  
  inline def `Update-Job-Status`: typings.ipp.ippStrings.`Update-Job-Status` = "Update-Job-Status".asInstanceOf[typings.ipp.ippStrings.`Update-Job-Status`]
  
  inline def `Update-Output-Device-Attributes`: typings.ipp.ippStrings.`Update-Output-Device-Attributes` = "Update-Output-Device-Attributes".asInstanceOf[typings.ipp.ippStrings.`Update-Output-Device-Attributes`]
  
  inline def `Validate-Document`: typings.ipp.ippStrings.`Validate-Document` = "Validate-Document".asInstanceOf[typings.ipp.ippStrings.`Validate-Document`]
  
  inline def `Validate-Job`: typings.ipp.ippStrings.`Validate-Job` = "Validate-Job".asInstanceOf[typings.ipp.ippStrings.`Validate-Job`]
  
  inline def Value: typings.ipp.ippStrings.Value = "Value".asInstanceOf[typings.ipp.ippStrings.Value]
}
