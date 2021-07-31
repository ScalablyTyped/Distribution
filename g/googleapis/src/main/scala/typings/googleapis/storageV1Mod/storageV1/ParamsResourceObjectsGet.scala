package typings.googleapis.storageV1Mod.storageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceObjectsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the bucket in which the object resides.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * If present, selects a specific revision of this object (as opposed to the
    * latest version, the default).
    */
  var generation: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current
    * generation matches the given value. Setting to 0 makes the operation
    * succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current
    * generation does not match the given value. If no live object exists, the
    * precondition fails. Setting to 0 makes the operation succeed only if
    * there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current
    * metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current
    * metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the object. For information about how to URL encode object names
    * to be path safe, see Encoding URI Path Parts.
    */
  var `object`: js.UndefOr[String] = js.undefined
  
  /**
    * Set of properties to return. Defaults to noAcl.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceObjectsGet {
  
  @scala.inline
  def apply(): ParamsResourceObjectsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceObjectsGetMutableBuilder[Self <: ParamsResourceObjectsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    @scala.inline
    def setIfGenerationNotMatch(value: String): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
