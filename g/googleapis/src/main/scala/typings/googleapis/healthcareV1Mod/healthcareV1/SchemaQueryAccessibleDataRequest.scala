package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryAccessibleDataRequest extends StObject {
  
  /**
    * The Cloud Storage destination. The Cloud Healthcare API service account must have the `roles/storage.objectAdmin` Cloud IAM role for this Cloud Storage location.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1ConsentGcsDestination] = js.undefined
  
  /**
    * The values of request attributes associated with this access request.
    */
  var requestAttributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The values of resource attributes associated with the type of resources being requested. If no values are specified, then all resource types are included in the output.
    */
  var resourceAttributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaQueryAccessibleDataRequest {
  
  inline def apply(): SchemaQueryAccessibleDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAccessibleDataRequest]
  }
  
  extension [Self <: SchemaQueryAccessibleDataRequest](x: Self) {
    
    inline def setGcsDestination(value: SchemaGoogleCloudHealthcareV1ConsentGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setRequestAttributes(value: StringDictionary[String]): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesNull: Self = StObject.set(x, "requestAttributes", null)
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResourceAttributes(value: StringDictionary[String]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributesNull: Self = StObject.set(x, "resourceAttributes", null)
    
    inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
  }
}
