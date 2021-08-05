package typings.googleapis.storageV1Mod.storageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBucketsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Apply a predefined set of access controls to this bucket.
    */
  var predefinedAcl: js.UndefOr[String] = js.undefined
  
  /**
    * Apply a predefined set of default object access controls to this bucket.
    */
  var predefinedDefaultObjectAcl: js.UndefOr[String] = js.undefined
  
  /**
    * A valid API project identifier.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Set of properties to return. Defaults to noAcl, unless the bucket
    * resource specifies acl or defaultObjectAcl properties, when it defaults
    * to full.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBucket] = js.undefined
  
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceBucketsInsert {
  
  inline def apply(): ParamsResourceBucketsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBucketsInsert]
  }
  
  extension [Self <: ParamsResourceBucketsInsert](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPredefinedAcl(value: String): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    inline def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    inline def setPredefinedDefaultObjectAcl(value: String): Self = StObject.set(x, "predefinedDefaultObjectAcl", value.asInstanceOf[js.Any])
    
    inline def setPredefinedDefaultObjectAclUndefined: Self = StObject.set(x, "predefinedDefaultObjectAcl", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRequestBody(value: SchemaBucket): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
