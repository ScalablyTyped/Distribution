package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementErrorResource extends StObject {
  
  /**
    * Group/version/kind of the resource that is causing an error
    */
  var resourceGvk: js.UndefOr[SchemaConfigManagementGroupVersionKind] = js.undefined
  
  /**
    * Metadata name of the resource that is causing an error
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Namespace of the resource that is causing an error
    */
  var resourceNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path in the git repo of the erroneous config
    */
  var sourcePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementErrorResource {
  
  inline def apply(): SchemaConfigManagementErrorResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementErrorResource]
  }
  
  extension [Self <: SchemaConfigManagementErrorResource](x: Self) {
    
    inline def setResourceGvk(value: SchemaConfigManagementGroupVersionKind): Self = StObject.set(x, "resourceGvk", value.asInstanceOf[js.Any])
    
    inline def setResourceGvkUndefined: Self = StObject.set(x, "resourceGvk", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceNamespace(value: String): Self = StObject.set(x, "resourceNamespace", value.asInstanceOf[js.Any])
    
    inline def setResourceNamespaceNull: Self = StObject.set(x, "resourceNamespace", null)
    
    inline def setResourceNamespaceUndefined: Self = StObject.set(x, "resourceNamespace", js.undefined)
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathNull: Self = StObject.set(x, "sourcePath", null)
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
  }
}
