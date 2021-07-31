package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSinksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The resource in which to create the sink:
    * "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" Examples:
    * "projects/my-logging-project", "organizations/123456789".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogSink] = js.undefined
  
  /**
    * Optional. Determines the kind of IAM identity returned as writer_identity
    * in the new sink. If this value is omitted or set to false, and if the
    * sink's parent is a project, then the value returned as writer_identity is
    * the same group or service account used by Logging before the addition of
    * writer identities to this API. The sink's destination must be in the same
    * project as the sink itself.If this field is set to true, or if the sink
    * is owned by a non-project resource such as an organization, then the
    * value of writer_identity will be a unique service account used only for
    * exports from the new sink. For more information, see writer_identity in
    * LogSink.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsSinksCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsSinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSinksCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsSinksCreateMutableBuilder[Self <: ParamsResourceProjectsSinksCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaLogSink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUniqueWriterIdentity(value: Boolean): Self = StObject.set(x, "uniqueWriterIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueWriterIdentityUndefined: Self = StObject.set(x, "uniqueWriterIdentity", js.undefined)
  }
}
