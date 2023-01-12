package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1EgressTo extends StObject {
  
  /**
    * A list of external resources that are allowed to be accessed. Only AWS and Azure resources are supported. For Amazon S3, the supported format is s3://BUCKET_NAME. For Azure Storage,
    * the supported format is azure://myaccount.blob.core.windows.net/CONTAINER_NAME. A request matches if it contains an external resource in this list (Example: s3://bucket/path).
    * Currently '*' is not allowed.
    */
  var externalResources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of ApiOperations allowed to be performed by the sources specified in the corresponding EgressFrom. A request matches if it uses an operation/service in this list. */
  var operations: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1ApiOperation]] = js.undefined
  
  /**
    * A list of resources, currently only projects in the form `projects/`, that are allowed to be accessed by sources defined in the corresponding EgressFrom. A request matches if it
    * contains a resource in this list. If `*` is specified for `resources`, then this EgressTo rule will authorize access to all resources outside the perimeter.
    */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1EgressTo {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1EgressTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1EgressTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleIdentityAccesscontextmanagerV1EgressTo] (val x: Self) extends AnyVal {
    
    inline def setExternalResources(value: js.Array[String]): Self = StObject.set(x, "externalResources", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesUndefined: Self = StObject.set(x, "externalResources", js.undefined)
    
    inline def setExternalResourcesVarargs(value: String*): Self = StObject.set(x, "externalResources", js.Array(value*))
    
    inline def setOperations(value: js.Array[GoogleIdentityAccesscontextmanagerV1ApiOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: GoogleIdentityAccesscontextmanagerV1ApiOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
