package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceObjectsCompose
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the bucket containing the source objects. The destination object is stored in this bucket.
    */
  var destinationBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the new object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    */
  var destinationObject: js.UndefOr[String] = js.undefined
  
  /**
    * Apply a predefined set of access controls to the destination object.
    */
  var destinationPredefinedAcl: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaComposeRequest] = js.undefined
  
  /**
    * The project to be billed for this request. Required for Requester Pays buckets.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceObjectsCompose {
  
  inline def apply(): ParamsResourceObjectsCompose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsCompose]
  }
  
  extension [Self <: ParamsResourceObjectsCompose](x: Self) {
    
    inline def setDestinationBucket(value: String): Self = StObject.set(x, "destinationBucket", value.asInstanceOf[js.Any])
    
    inline def setDestinationBucketUndefined: Self = StObject.set(x, "destinationBucket", js.undefined)
    
    inline def setDestinationObject(value: String): Self = StObject.set(x, "destinationObject", value.asInstanceOf[js.Any])
    
    inline def setDestinationObjectUndefined: Self = StObject.set(x, "destinationObject", js.undefined)
    
    inline def setDestinationPredefinedAcl(value: String): Self = StObject.set(x, "destinationPredefinedAcl", value.asInstanceOf[js.Any])
    
    inline def setDestinationPredefinedAclUndefined: Self = StObject.set(x, "destinationPredefinedAcl", js.undefined)
    
    inline def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    inline def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setRequestBody(value: SchemaComposeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
