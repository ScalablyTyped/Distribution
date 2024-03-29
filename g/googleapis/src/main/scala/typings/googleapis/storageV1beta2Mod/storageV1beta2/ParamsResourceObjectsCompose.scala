package typings.googleapis.storageV1beta2Mod.storageV1beta2

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
    * Name of the new object.
    */
  var destinationObject: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current generation matches the given value.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaComposeRequest] = js.undefined
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
    
    inline def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    inline def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    inline def setRequestBody(value: SchemaComposeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
