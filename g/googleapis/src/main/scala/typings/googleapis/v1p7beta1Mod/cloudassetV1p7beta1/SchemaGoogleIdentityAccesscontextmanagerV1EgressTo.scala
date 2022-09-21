package typings.googleapis.v1p7beta1Mod.cloudassetV1p7beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1EgressTo extends StObject {
  
  /**
    * A list of external resources that are allowed to be accessed. Only AWS and Azure resources are supported. For Amazon S3, the supported format is s3://BUCKET_NAME. For Azure Storage, the supported format is azure://myaccount.blob.core.windows.net/CONTAINER_NAME. A request matches if it contains an external resource in this list (Example: s3://bucket/path). Currently '*' is not allowed.
    */
  var externalResources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of ApiOperations allowed to be performed by the sources specified in the corresponding EgressFrom. A request matches if it uses an operation/service in this list.
    */
  var operations: js.UndefOr[js.Array[SchemaGoogleIdentityAccesscontextmanagerV1ApiOperation]] = js.undefined
  
  /**
    * A list of resources, currently only projects in the form `projects/`, that are allowed to be accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a resource in this list. If `*` is specified for `resources`, then this EgressTo rule will authorize access to all resources outside the perimeter.
    */
  var resources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1EgressTo {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1EgressTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1EgressTo]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1EgressTo](x: Self) {
    
    inline def setExternalResources(value: js.Array[String]): Self = StObject.set(x, "externalResources", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesNull: Self = StObject.set(x, "externalResources", null)
    
    inline def setExternalResourcesUndefined: Self = StObject.set(x, "externalResources", js.undefined)
    
    inline def setExternalResourcesVarargs(value: String*): Self = StObject.set(x, "externalResources", js.Array(value*))
    
    inline def setOperations(value: js.Array[SchemaGoogleIdentityAccesscontextmanagerV1ApiOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaGoogleIdentityAccesscontextmanagerV1ApiOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
