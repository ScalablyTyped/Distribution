package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAccessapproval.anon.Alt
import typings.maximMazurokGapiClientAccessapproval.anon.Key
import typings.maximMazurokGapiClientAccessapproval.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends StObject {
  
  var approvalRequests: ApprovalRequestsResource = js.native
  
  /**
    * Deletes the settings associated with a project, folder, or organization. This will have the effect of disabling Access Approval for the project, folder, or organization, but only if
    * all ancestors also have Access Approval disabled. If Access Approval is enabled at a higher level of the hierarchy, then Access Approval will still be enabled at this level as the
    * settings are inherited.
    */
  def deleteAccessApprovalSettings(): Request[js.Object] = js.native
  def deleteAccessApprovalSettings(request: Alt): Request[js.Object] = js.native
  
  /** Gets the settings associated with a project, folder, or organization. */
  def getAccessApprovalSettings(): Request[AccessApprovalSettings] = js.native
  def getAccessApprovalSettings(request: Alt): Request[AccessApprovalSettings] = js.native
  
  /** Retrieves the service account that is used by Access Approval to access KMS keys for signing approved approval requests. */
  def getServiceAccount(): Request[AccessApprovalServiceAccount] = js.native
  def getServiceAccount(request: Alt): Request[AccessApprovalServiceAccount] = js.native
  
  /** Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask. */
  def updateAccessApprovalSettings(request: Key): Request[AccessApprovalSettings] = js.native
  def updateAccessApprovalSettings(request: Name, body: AccessApprovalSettings): Request[AccessApprovalSettings] = js.native
}
