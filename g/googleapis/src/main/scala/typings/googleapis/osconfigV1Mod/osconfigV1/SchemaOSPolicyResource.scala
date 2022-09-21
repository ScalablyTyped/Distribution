package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResource extends StObject {
  
  /**
    * Exec resource
    */
  var exec: js.UndefOr[SchemaOSPolicyResourceExecResource] = js.undefined
  
  /**
    * File resource
    */
  var file: js.UndefOr[SchemaOSPolicyResourceFileResource] = js.undefined
  
  /**
    * Required. The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the OS policy.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Package resource
    */
  var pkg: js.UndefOr[SchemaOSPolicyResourcePackageResource] = js.undefined
  
  /**
    * Package repository resource
    */
  var repository: js.UndefOr[SchemaOSPolicyResourceRepositoryResource] = js.undefined
}
object SchemaOSPolicyResource {
  
  inline def apply(): SchemaOSPolicyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResource]
  }
  
  extension [Self <: SchemaOSPolicyResource](x: Self) {
    
    inline def setExec(value: SchemaOSPolicyResourceExecResource): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setFile(value: SchemaOSPolicyResourceFileResource): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPkg(value: SchemaOSPolicyResourcePackageResource): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    
    inline def setRepository(value: SchemaOSPolicyResourceRepositoryResource): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
