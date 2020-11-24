package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessApprovalSettings extends js.Object {
  
  /**
    * Output only. This field is read only (not settable via UpdateAccessAccessApprovalSettings method). If the field is true, that indicates that at least one service is enrolled for
    * Access Approval in one or more ancestors of the Project or Folder (this field will always be unset for the organization since organizations do not have ancestors).
    */
  var enrolledAncestor: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of Google Cloud Services for which the given resource has Access Approval enrolled. Access requests for the resource given by name against any of these services contained
    * here will be required to have explicit approval. If name refers to an organization, enrollment can be done for individual services. If name refers to a folder or project, enrollment
    * can only be done on an all or nothing basis. If a cloud_product is repeated in this list, the first entry will be honored and all following entries will be discarded. A maximum of
    * 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
    */
  var enrolledServices: js.UndefOr[js.Array[EnrolledService]] = js.native
  
  /**
    * The resource name of the settings. Format is one of: * "projects/{project}/accessApprovalSettings" * "folders/{folder}/accessApprovalSettings" *
    * "organizations/{organization}/accessApprovalSettings"
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of email addresses to which notifications relating to approval requests should be sent. Notifications relating to a resource will be sent to all emails in the settings of
    * ancestor resources of that resource. A maximum of 50 email addresses are allowed.
    */
  var notificationEmails: js.UndefOr[js.Array[String]] = js.native
}
object AccessApprovalSettings {
  
  @scala.inline
  def apply(): AccessApprovalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessApprovalSettings]
  }
  
  @scala.inline
  implicit class AccessApprovalSettingsOps[Self <: AccessApprovalSettings] (val x: Self) extends AnyVal {
    
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
    def setEnrolledAncestor(value: Boolean): Self = this.set("enrolledAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrolledAncestor: Self = this.set("enrolledAncestor", js.undefined)
    
    @scala.inline
    def setEnrolledServicesVarargs(value: EnrolledService*): Self = this.set("enrolledServices", js.Array(value :_*))
    
    @scala.inline
    def setEnrolledServices(value: js.Array[EnrolledService]): Self = this.set("enrolledServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrolledServices: Self = this.set("enrolledServices", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationEmailsVarargs(value: String*): Self = this.set("notificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setNotificationEmails(value: js.Array[String]): Self = this.set("notificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEmails: Self = this.set("notificationEmails", js.undefined)
  }
}
