package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessApprovalSettings extends StObject {
  
  /**
    * Output only. This field is read only (not settable via UpdateAccessAccessApprovalSettings method). If the field is true, that indicates that at least one service is enrolled for Access Approval in one or more ancestors of the Project or Folder (this field will always be unset for the organization since organizations do not have ancestors).
    */
  var enrolledAncestor: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of Google Cloud Services for which the given resource has Access Approval enrolled. Access requests for the resource given by name against any of these services contained here will be required to have explicit approval. If name refers to an organization, enrollment can be done for individual services. If name refers to a folder or project, enrollment can only be done on an all or nothing basis.  If a cloud_product is repeated in this list, the first entry will be honored and all following entries will be discarded. A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
    */
  var enrolledServices: js.UndefOr[js.Array[SchemaEnrolledService]] = js.undefined
  
  /**
    * The resource name of the settings. Format is one of: &lt;ol&gt;   &lt;li&gt;&quot;projects/{project_id}/accessApprovalSettings&quot;&lt;/li&gt;   &lt;li&gt;&quot;folders/{folder_id}/accessApprovalSettings&quot;&lt;/li&gt;   &lt;li&gt;&quot;organizations/{organization_id}/accessApprovalSettings&quot;&lt;/li&gt; &lt;ol&gt;
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of email addresses to which notifications relating to approval requests should be sent. Notifications relating to a resource will be sent to all emails in the settings of ancestor resources of that resource. A maximum of 50 email addresses are allowed.
    */
  var notificationEmails: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAccessApprovalSettings {
  
  inline def apply(): SchemaAccessApprovalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessApprovalSettings]
  }
  
  extension [Self <: SchemaAccessApprovalSettings](x: Self) {
    
    inline def setEnrolledAncestor(value: Boolean): Self = StObject.set(x, "enrolledAncestor", value.asInstanceOf[js.Any])
    
    inline def setEnrolledAncestorNull: Self = StObject.set(x, "enrolledAncestor", null)
    
    inline def setEnrolledAncestorUndefined: Self = StObject.set(x, "enrolledAncestor", js.undefined)
    
    inline def setEnrolledServices(value: js.Array[SchemaEnrolledService]): Self = StObject.set(x, "enrolledServices", value.asInstanceOf[js.Any])
    
    inline def setEnrolledServicesUndefined: Self = StObject.set(x, "enrolledServices", js.undefined)
    
    inline def setEnrolledServicesVarargs(value: SchemaEnrolledService*): Self = StObject.set(x, "enrolledServices", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "notificationEmails", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailsNull: Self = StObject.set(x, "notificationEmails", null)
    
    inline def setNotificationEmailsUndefined: Self = StObject.set(x, "notificationEmails", js.undefined)
    
    inline def setNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "notificationEmails", js.Array(value*))
  }
}
