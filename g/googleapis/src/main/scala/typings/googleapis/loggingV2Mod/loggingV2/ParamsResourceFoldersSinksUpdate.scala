package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersSinksUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogSink] = js.undefined
  
  /**
    * Required. The full resource name of the sink to update, including the
    * parent resource and the sink identifier:
    * "projects/[PROJECT_ID]/sinks/[SINK_ID]"
    * "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
    * "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example:
    * "projects/my-project-id/sinks/my-sink-id".
    */
  var sinkName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. See sinks.create for a description of this field. When updating
    * a sink, the effect of this field on the value of writer_identity in the
    * updated sink depends on both the old and new values of this field: If the
    * old and new values of this field are both false or both true, then there
    * is no change to the sink's writer_identity. If the old value is false and
    * the new value is true, then writer_identity is changed to a unique
    * service account. It is an error if the old value is true and the new
    * value is set to false or defaulted to false.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Field mask that specifies the fields in sink that need an
    * update. A sink field will be overwritten if, and only if, it is in the
    * update mask. name and output only fields cannot be updated.An empty
    * updateMask is temporarily treated as using the following mask for
    * backwards compatibility purposes:  destination,filter,includeChildren At
    * some point in the future, behavior will be removed and specifying an
    * empty updateMask will be an error.For a detailed FieldMask definition,
    * see
    * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskExample:
    * updateMask=filter.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersSinksUpdate {
  
  inline def apply(): ParamsResourceFoldersSinksUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersSinksUpdate]
  }
  
  extension [Self <: ParamsResourceFoldersSinksUpdate](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setRequestBody(value: SchemaLogSink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSinkName(value: String): Self = StObject.set(x, "sinkName", value.asInstanceOf[js.Any])
    
    inline def setSinkNameUndefined: Self = StObject.set(x, "sinkName", js.undefined)
    
    inline def setUniqueWriterIdentity(value: Boolean): Self = StObject.set(x, "uniqueWriterIdentity", value.asInstanceOf[js.Any])
    
    inline def setUniqueWriterIdentityUndefined: Self = StObject.set(x, "uniqueWriterIdentity", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
