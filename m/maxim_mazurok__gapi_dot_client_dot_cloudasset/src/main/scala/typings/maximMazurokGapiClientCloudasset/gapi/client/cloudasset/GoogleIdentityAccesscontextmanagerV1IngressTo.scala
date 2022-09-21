package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1IngressTo extends StObject {
  
  /** A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter. */
  var operations: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1ApiOperation]] = js.undefined
  
  /**
    * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding
    * IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
    */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1IngressTo {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1IngressTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1IngressTo]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1IngressTo](x: Self) {
    
    inline def setOperations(value: js.Array[GoogleIdentityAccesscontextmanagerV1ApiOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: GoogleIdentityAccesscontextmanagerV1ApiOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
