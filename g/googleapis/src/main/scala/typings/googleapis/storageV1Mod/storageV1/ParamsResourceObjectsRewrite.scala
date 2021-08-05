package typings.googleapis.storageV1Mod.storageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceObjectsRewrite
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's bucket value, if any.
    */
  var destinationBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the Cloud KMS key, of the form
    * projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key,
    * that will be used to encrypt the object. Overrides the object metadata's
    * kms_key_name value, if any.
    */
  var destinationKmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the new object. Required when the object metadata is not
    * otherwise provided. Overrides the object metadata's name value, if any.
    * For information about how to URL encode object names to be path safe, see
    * Encoding URI Path Parts.
    */
  var destinationObject: js.UndefOr[String] = js.undefined
  
  /**
    * Apply a predefined set of access controls to the destination object.
    */
  var destinationPredefinedAcl: js.UndefOr[String] = js.undefined
  
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
    * Makes the operation conditional on whether the destination object's
    * current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the source object's current
    * generation matches the given value.
    */
  var ifSourceGenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the source object's current
    * generation does not match the given value.
    */
  var ifSourceGenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration matches the given value.
    */
  var ifSourceMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration does not match the given value.
    */
  var ifSourceMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of bytes that will be rewritten per rewrite request.
    * Most callers shouldn't need to specify this parameter - it is primarily
    * in place to support testing. If specified the value must be an integral
    * multiple of 1 MiB (1048576). Also, this only applies to requests where
    * the source and destination span locations and/or storage classes.
    * Finally, this value must not change across rewrite calls else you'll get
    * an error that the rewriteToken is invalid.
    */
  var maxBytesRewrittenPerCall: js.UndefOr[String] = js.undefined
  
  /**
    * Set of properties to return. Defaults to noAcl, unless the object
    * resource specifies the acl property, when it defaults to full.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObject] = js.undefined
  
  /**
    * Include this field (from the previous rewrite response) on each rewrite
    * request after the first one, until the rewrite response 'done' flag is
    * true. Calls that provide a rewriteToken can omit all other request
    * fields, but if included those fields must match the values provided in
    * the first rewrite request.
    */
  var rewriteToken: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the bucket in which to find the source object.
    */
  var sourceBucket: js.UndefOr[String] = js.undefined
  
  /**
    * If present, selects a specific revision of the source object (as opposed
    * to the latest version, the default).
    */
  var sourceGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the source object. For information about how to URL encode object
    * names to be path safe, see Encoding URI Path Parts.
    */
  var sourceObject: js.UndefOr[String] = js.undefined
  
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceObjectsRewrite {
  
  inline def apply(): ParamsResourceObjectsRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsRewrite]
  }
  
  extension [Self <: ParamsResourceObjectsRewrite](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDestinationBucket(value: String): Self = StObject.set(x, "destinationBucket", value.asInstanceOf[js.Any])
    
    inline def setDestinationBucketUndefined: Self = StObject.set(x, "destinationBucket", js.undefined)
    
    inline def setDestinationKmsKeyName(value: String): Self = StObject.set(x, "destinationKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setDestinationKmsKeyNameUndefined: Self = StObject.set(x, "destinationKmsKeyName", js.undefined)
    
    inline def setDestinationObject(value: String): Self = StObject.set(x, "destinationObject", value.asInstanceOf[js.Any])
    
    inline def setDestinationObjectUndefined: Self = StObject.set(x, "destinationObject", js.undefined)
    
    inline def setDestinationPredefinedAcl(value: String): Self = StObject.set(x, "destinationPredefinedAcl", value.asInstanceOf[js.Any])
    
    inline def setDestinationPredefinedAclUndefined: Self = StObject.set(x, "destinationPredefinedAcl", js.undefined)
    
    inline def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    inline def setIfGenerationNotMatch(value: String): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
    
    inline def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    inline def setIfMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
    
    inline def setIfSourceGenerationMatch(value: String): Self = StObject.set(x, "ifSourceGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfSourceGenerationMatchUndefined: Self = StObject.set(x, "ifSourceGenerationMatch", js.undefined)
    
    inline def setIfSourceGenerationNotMatch(value: String): Self = StObject.set(x, "ifSourceGenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfSourceGenerationNotMatchUndefined: Self = StObject.set(x, "ifSourceGenerationNotMatch", js.undefined)
    
    inline def setIfSourceMetagenerationMatch(value: String): Self = StObject.set(x, "ifSourceMetagenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfSourceMetagenerationMatchUndefined: Self = StObject.set(x, "ifSourceMetagenerationMatch", js.undefined)
    
    inline def setIfSourceMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifSourceMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfSourceMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifSourceMetagenerationNotMatch", js.undefined)
    
    inline def setMaxBytesRewrittenPerCall(value: String): Self = StObject.set(x, "maxBytesRewrittenPerCall", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesRewrittenPerCallUndefined: Self = StObject.set(x, "maxBytesRewrittenPerCall", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRequestBody(value: SchemaObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRewriteToken(value: String): Self = StObject.set(x, "rewriteToken", value.asInstanceOf[js.Any])
    
    inline def setRewriteTokenUndefined: Self = StObject.set(x, "rewriteToken", js.undefined)
    
    inline def setSourceBucket(value: String): Self = StObject.set(x, "sourceBucket", value.asInstanceOf[js.Any])
    
    inline def setSourceBucketUndefined: Self = StObject.set(x, "sourceBucket", js.undefined)
    
    inline def setSourceGeneration(value: String): Self = StObject.set(x, "sourceGeneration", value.asInstanceOf[js.Any])
    
    inline def setSourceGenerationUndefined: Self = StObject.set(x, "sourceGeneration", js.undefined)
    
    inline def setSourceObject(value: String): Self = StObject.set(x, "sourceObject", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectUndefined: Self = StObject.set(x, "sourceObject", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
