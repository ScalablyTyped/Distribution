package typings.maximMazurokGapiClientAccessapproval

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAccessapproval.anon.Accesstoken
import typings.maximMazurokGapiClientAccessapproval.anon.Alt
import typings.maximMazurokGapiClientAccessapproval.anon.Callback
import typings.maximMazurokGapiClientAccessapproval.anon.Fields
import typings.maximMazurokGapiClientAccessapproval.anon.Key
import typings.maximMazurokGapiClientAccessapproval.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object accessapproval {
      
      trait AccessApprovalSettings extends StObject {
        
        /**
          * Output only. This field is read only (not settable via UpdateAccessAccessApprovalSettings method). If the field is true, that indicates that at least one service is enrolled for
          * Access Approval in one or more ancestors of the Project or Folder (this field will always be unset for the organization since organizations do not have ancestors).
          */
        var enrolledAncestor: js.UndefOr[Boolean] = js.undefined
        
        /**
          * A list of Google Cloud Services for which the given resource has Access Approval enrolled. Access requests for the resource given by name against any of these services contained
          * here will be required to have explicit approval. If name refers to an organization, enrollment can be done for individual services. If name refers to a folder or project, enrollment
          * can only be done on an all or nothing basis. If a cloud_product is repeated in this list, the first entry will be honored and all following entries will be discarded. A maximum of
          * 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
          */
        var enrolledServices: js.UndefOr[js.Array[EnrolledService]] = js.undefined
        
        /**
          * The resource name of the settings. Format is one of: * "projects/{project}/accessApprovalSettings" * "folders/{folder}/accessApprovalSettings" *
          * "organizations/{organization}/accessApprovalSettings"
          */
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * A list of email addresses to which notifications relating to approval requests should be sent. Notifications relating to a resource will be sent to all emails in the settings of
          * ancestor resources of that resource. A maximum of 50 email addresses are allowed.
          */
        var notificationEmails: js.UndefOr[js.Array[String]] = js.undefined
      }
      object AccessApprovalSettings {
        
        inline def apply(): AccessApprovalSettings = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AccessApprovalSettings]
        }
        
        extension [Self <: AccessApprovalSettings](x: Self) {
          
          inline def setEnrolledAncestor(value: Boolean): Self = StObject.set(x, "enrolledAncestor", value.asInstanceOf[js.Any])
          
          inline def setEnrolledAncestorUndefined: Self = StObject.set(x, "enrolledAncestor", js.undefined)
          
          inline def setEnrolledServices(value: js.Array[EnrolledService]): Self = StObject.set(x, "enrolledServices", value.asInstanceOf[js.Any])
          
          inline def setEnrolledServicesUndefined: Self = StObject.set(x, "enrolledServices", js.undefined)
          
          inline def setEnrolledServicesVarargs(value: EnrolledService*): Self = StObject.set(x, "enrolledServices", js.Array(value :_*))
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "notificationEmails", value.asInstanceOf[js.Any])
          
          inline def setNotificationEmailsUndefined: Self = StObject.set(x, "notificationEmails", js.undefined)
          
          inline def setNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "notificationEmails", js.Array(value :_*))
        }
      }
      
      trait AccessLocations extends StObject {
        
        /**
          * The "home office" location of the principal. A two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some limited situations Google systems
          * may refer refer to a region code instead of a country code. Possible Region Codes: * ASI: Asia * EUR: Europe * OCE: Oceania * AFR: Africa * NAM: North America * SAM: South America *
          * ANT: Antarctica * ANY: Any location
          */
        var principalOfficeCountry: js.UndefOr[String] = js.undefined
        
        /**
          * Physical location of the principal at the time of the access. A two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some limited situations
          * Google systems may refer refer to a region code instead of a country code. Possible Region Codes: * ASI: Asia * EUR: Europe * OCE: Oceania * AFR: Africa * NAM: North America * SAM:
          * South America * ANT: Antarctica * ANY: Any location
          */
        var principalPhysicalLocationCountry: js.UndefOr[String] = js.undefined
      }
      object AccessLocations {
        
        inline def apply(): AccessLocations = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AccessLocations]
        }
        
        extension [Self <: AccessLocations](x: Self) {
          
          inline def setPrincipalOfficeCountry(value: String): Self = StObject.set(x, "principalOfficeCountry", value.asInstanceOf[js.Any])
          
          inline def setPrincipalOfficeCountryUndefined: Self = StObject.set(x, "principalOfficeCountry", js.undefined)
          
          inline def setPrincipalPhysicalLocationCountry(value: String): Self = StObject.set(x, "principalPhysicalLocationCountry", value.asInstanceOf[js.Any])
          
          inline def setPrincipalPhysicalLocationCountryUndefined: Self = StObject.set(x, "principalPhysicalLocationCountry", js.undefined)
        }
      }
      
      trait AccessReason extends StObject {
        
        /** More detail about certain reason types. See comments for each type above. */
        var detail: js.UndefOr[String] = js.undefined
        
        /** Type of access justification. */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object AccessReason {
        
        inline def apply(): AccessReason = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AccessReason]
        }
        
        extension [Self <: AccessReason](x: Self) {
          
          inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
          
          inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      trait ApprovalRequest extends StObject {
        
        /** Access was approved. */
        var approve: js.UndefOr[ApproveDecision] = js.undefined
        
        /** The request was dismissed. */
        var dismiss: js.UndefOr[DismissDecision] = js.undefined
        
        /** The resource name of the request. Format is "{projects|folders|organizations}/{id}/approvalRequests/{approval_request}". */
        var name: js.UndefOr[String] = js.undefined
        
        /** The time at which approval was requested. */
        var requestTime: js.UndefOr[String] = js.undefined
        
        /** The requested expiration for the approval. If the request is approved, access will be granted from the time of approval until the expiration time. */
        var requestedExpiration: js.UndefOr[String] = js.undefined
        
        /** The locations for which approval is being requested. */
        var requestedLocations: js.UndefOr[AccessLocations] = js.undefined
        
        /** The justification for which approval is being requested. */
        var requestedReason: js.UndefOr[AccessReason] = js.undefined
        
        /**
          * The resource for which approval is being requested. The format of the resource name is defined at https://cloud.google.com/apis/design/resource_names. The resource name here may
          * either be a "full" resource name (e.g. "//library.googleapis.com/shelves/shelf1/books/book2") or a "relative" resource name (e.g. "shelves/shelf1/books/book2") as described in the
          * resource name specification.
          */
        var requestedResourceName: js.UndefOr[String] = js.undefined
        
        /** Properties related to the resource represented by requested_resource_name. */
        var requestedResourceProperties: js.UndefOr[ResourceProperties] = js.undefined
      }
      object ApprovalRequest {
        
        inline def apply(): ApprovalRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ApprovalRequest]
        }
        
        extension [Self <: ApprovalRequest](x: Self) {
          
          inline def setApprove(value: ApproveDecision): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
          
          inline def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
          
          inline def setDismiss(value: DismissDecision): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
          
          inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
          
          inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
          
          inline def setRequestedExpiration(value: String): Self = StObject.set(x, "requestedExpiration", value.asInstanceOf[js.Any])
          
          inline def setRequestedExpirationUndefined: Self = StObject.set(x, "requestedExpiration", js.undefined)
          
          inline def setRequestedLocations(value: AccessLocations): Self = StObject.set(x, "requestedLocations", value.asInstanceOf[js.Any])
          
          inline def setRequestedLocationsUndefined: Self = StObject.set(x, "requestedLocations", js.undefined)
          
          inline def setRequestedReason(value: AccessReason): Self = StObject.set(x, "requestedReason", value.asInstanceOf[js.Any])
          
          inline def setRequestedReasonUndefined: Self = StObject.set(x, "requestedReason", js.undefined)
          
          inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
          
          inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
          
          inline def setRequestedResourceProperties(value: ResourceProperties): Self = StObject.set(x, "requestedResourceProperties", value.asInstanceOf[js.Any])
          
          inline def setRequestedResourcePropertiesUndefined: Self = StObject.set(x, "requestedResourceProperties", js.undefined)
        }
      }
      
      @js.native
      trait ApprovalRequestsResource extends StObject {
        
        /**
          * Approves a request and returns the updated ApprovalRequest. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a
          * pending state.
          */
        def approve(request: Accesstoken): Request[ApprovalRequest] = js.native
        def approve(request: Alt, body: ApproveApprovalRequestMessage): Request[ApprovalRequest] = js.native
        
        def dismiss(request: Alt, body: DismissApprovalRequestMessage): Request[ApprovalRequest] = js.native
        /**
          * Dismisses a request. Returns the updated ApprovalRequest. NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect
          * to ignoring the request altogether. Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
          */
        def dismiss(request: Callback): Request[ApprovalRequest] = js.native
        
        /** Gets an approval request. Returns NOT_FOUND if the request does not exist. */
        def get(): Request[ApprovalRequest] = js.native
        def get(request: Alt): Request[ApprovalRequest] = js.native
        
        /**
          * Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse
          * chronological.
          */
        def list(): Request[ListApprovalRequestsResponse] = js.native
        def list(request: Fields): Request[ListApprovalRequestsResponse] = js.native
      }
      
      trait ApproveApprovalRequestMessage extends StObject {
        
        /** The expiration time of this approval. */
        var expireTime: js.UndefOr[String] = js.undefined
      }
      object ApproveApprovalRequestMessage {
        
        inline def apply(): ApproveApprovalRequestMessage = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ApproveApprovalRequestMessage]
        }
        
        extension [Self <: ApproveApprovalRequestMessage](x: Self) {
          
          inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
          
          inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
        }
      }
      
      trait ApproveDecision extends StObject {
        
        /** The time at which approval was granted. */
        var approveTime: js.UndefOr[String] = js.undefined
        
        /** The time at which the approval expires. */
        var expireTime: js.UndefOr[String] = js.undefined
      }
      object ApproveDecision {
        
        inline def apply(): ApproveDecision = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ApproveDecision]
        }
        
        extension [Self <: ApproveDecision](x: Self) {
          
          inline def setApproveTime(value: String): Self = StObject.set(x, "approveTime", value.asInstanceOf[js.Any])
          
          inline def setApproveTimeUndefined: Self = StObject.set(x, "approveTime", js.undefined)
          
          inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
          
          inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait DismissApprovalRequestMessage extends StObject
      
      trait DismissDecision extends StObject {
        
        /** The time at which the approval request was dismissed. */
        var dismissTime: js.UndefOr[String] = js.undefined
        
        /**
          * This field will be true if the ApprovalRequest was implcitly dismissed due to inaction by the access approval approvers (the request is not acted on by the approvers before the
          * exiration time).
          */
        var `implicit`: js.UndefOr[Boolean] = js.undefined
      }
      object DismissDecision {
        
        inline def apply(): DismissDecision = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DismissDecision]
        }
        
        extension [Self <: DismissDecision](x: Self) {
          
          inline def setDismissTime(value: String): Self = StObject.set(x, "dismissTime", value.asInstanceOf[js.Any])
          
          inline def setDismissTimeUndefined: Self = StObject.set(x, "dismissTime", js.undefined)
          
          inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
          
          inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait EnrolledService extends StObject {
        
        /**
          * The product for which Access Approval will be enrolled. Allowed values are listed below (case-sensitive): * all * App Engine * BigQuery * Cloud Bigtable * Cloud Key Management
          * Service * Compute Engine * Cloud Dataflow * Cloud Identity and Access Management * Cloud Pub/Sub * Cloud Storage * Persistent Disk Note: These values are supported as input for
          * legacy purposes, but will not be returned from the API. * all * appengine.googleapis.com * bigquery.googleapis.com * bigtable.googleapis.com * cloudkms.googleapis.com *
          * compute.googleapis.com * dataflow.googleapis.com * iam.googleapis.com * pubsub.googleapis.com * storage.googleapis.com Calls to UpdateAccessApprovalSettings using 'all' or any of
          * the XXX.googleapis.com will be translated to the associated product name ('all', 'App Engine', etc.). Note: 'all' will enroll the resource in all products supported at both 'GA' and
          * 'Preview' levels. More information about levels of support is available at https://cloud.google.com/access-approval/docs/supported-services
          */
        var cloudProduct: js.UndefOr[String] = js.undefined
        
        /** The enrollment level of the service. */
        var enrollmentLevel: js.UndefOr[String] = js.undefined
      }
      object EnrolledService {
        
        inline def apply(): EnrolledService = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[EnrolledService]
        }
        
        extension [Self <: EnrolledService](x: Self) {
          
          inline def setCloudProduct(value: String): Self = StObject.set(x, "cloudProduct", value.asInstanceOf[js.Any])
          
          inline def setCloudProductUndefined: Self = StObject.set(x, "cloudProduct", js.undefined)
          
          inline def setEnrollmentLevel(value: String): Self = StObject.set(x, "enrollmentLevel", value.asInstanceOf[js.Any])
          
          inline def setEnrollmentLevelUndefined: Self = StObject.set(x, "enrollmentLevel", js.undefined)
        }
      }
      
      @js.native
      trait FoldersResource extends StObject {
        
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
        
        /** Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask. */
        def updateAccessApprovalSettings(request: Key): Request[AccessApprovalSettings] = js.native
        def updateAccessApprovalSettings(request: Name, body: AccessApprovalSettings): Request[AccessApprovalSettings] = js.native
      }
      
      trait ListApprovalRequestsResponse extends StObject {
        
        /** Approval request details. */
        var approvalRequests: js.UndefOr[js.Array[ApprovalRequest]] = js.undefined
        
        /** Token to retrieve the next page of results, or empty if there are no more. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object ListApprovalRequestsResponse {
        
        inline def apply(): ListApprovalRequestsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListApprovalRequestsResponse]
        }
        
        extension [Self <: ListApprovalRequestsResponse](x: Self) {
          
          inline def setApprovalRequests(value: js.Array[ApprovalRequest]): Self = StObject.set(x, "approvalRequests", value.asInstanceOf[js.Any])
          
          inline def setApprovalRequestsUndefined: Self = StObject.set(x, "approvalRequests", js.undefined)
          
          inline def setApprovalRequestsVarargs(value: ApprovalRequest*): Self = StObject.set(x, "approvalRequests", js.Array(value :_*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
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
        
        /** Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask. */
        def updateAccessApprovalSettings(request: Key): Request[AccessApprovalSettings] = js.native
        def updateAccessApprovalSettings(request: Name, body: AccessApprovalSettings): Request[AccessApprovalSettings] = js.native
      }
      
      @js.native
      trait ProjectsResource extends StObject {
        
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
        
        /** Updates the settings associated with a project, folder, or organization. Settings to update are determined by the value of field_mask. */
        def updateAccessApprovalSettings(request: Key): Request[AccessApprovalSettings] = js.native
        def updateAccessApprovalSettings(request: Name, body: AccessApprovalSettings): Request[AccessApprovalSettings] = js.native
      }
      
      trait ResourceProperties extends StObject {
        
        /** Whether an approval will exclude the descendants of the resource being requested. */
        var excludesDescendants: js.UndefOr[Boolean] = js.undefined
      }
      object ResourceProperties {
        
        inline def apply(): ResourceProperties = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ResourceProperties]
        }
        
        extension [Self <: ResourceProperties](x: Self) {
          
          inline def setExcludesDescendants(value: Boolean): Self = StObject.set(x, "excludesDescendants", value.asInstanceOf[js.Any])
          
          inline def setExcludesDescendantsUndefined: Self = StObject.set(x, "excludesDescendants", js.undefined)
        }
      }
    }
  }
}
