package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service account in the Identity and Access Management API.  To create a
  * service account, specify the `project_id` and the `account_id` for the
  * account.  The `account_id` is unique within the project, and is used to
  * generate the service account email address and a stable `unique_id`.  If
  * the account already exists, the account&#39;s resource name is returned in
  * the format of projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}. The caller
  * can use the name in other methods to access the account.  All other methods
  * can identify the service account using the format
  * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard
  * for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT`
  * value can be the `email` address or the `unique_id` of the service account.
  */
trait SchemaServiceAccount extends StObject {
  
  /**
    * Optional. A user-specified opaque description of the service account.
    * Must be less than or equal to 256 UTF-8 bytes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @OutputOnly A bool indicate if the service account is disabled. The field
    * is currently in alpha phase.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. A user-specified name for the service account. Must be less
    * than or equal to 100 UTF-8 bytes.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * @OutputOnly The email address of the service account.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Note: `etag` is an inoperable legacy field that is only
    * returned for backwards compatibility.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the service account in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as
    * a wildcard for the `PROJECT_ID` will infer the project from the `account`
    * and the `ACCOUNT` value can be the `email` address or the `unique_id` of
    * the service account.  In responses the resource name will always be in
    * the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @OutputOnly The OAuth2 client id for the service account. This is used in
    * conjunction with the OAuth2 clientconfig API to make three legged OAuth2
    * (3LO) flows to access the data of Google users.
    */
  var oauth2ClientId: js.UndefOr[String] = js.undefined
  
  /**
    * @OutputOnly The id of the project that owns the service account.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * @OutputOnly The unique and stable id of the service account.
    */
  var uniqueId: js.UndefOr[String] = js.undefined
}
object SchemaServiceAccount {
  
  @scala.inline
  def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountMutableBuilder[Self <: SchemaServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOauth2ClientId(value: String): Self = StObject.set(x, "oauth2ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2ClientIdUndefined: Self = StObject.set(x, "oauth2ClientId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
