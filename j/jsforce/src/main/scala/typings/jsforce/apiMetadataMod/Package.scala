package typings.jsforce.apiMetadataMod

import typings.jsforce.jsforceStrings.Restricted
import typings.jsforce.jsforceStrings.Unrestricted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  var apiAccessLevel: js.UndefOr[Unrestricted | Restricted] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var fullName: js.UndefOr[String] = js.undefined
  
  var namespacePrefix: js.UndefOr[String] = js.undefined
  
  var objectPermissions: js.UndefOr[js.Array[ProfileObjectPermissions]] = js.undefined
  
  var postInstallClass: js.UndefOr[String] = js.undefined
  
  var setupWeblink: js.UndefOr[String] = js.undefined
  
  var types: js.Array[PackageTypeMembers]
  
  var uninstallClass: js.UndefOr[String] = js.undefined
  
  var version: String
}
object Package {
  
  inline def apply(types: js.Array[PackageTypeMembers], version: String): Package = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    inline def setApiAccessLevel(value: Unrestricted | Restricted): Self = StObject.set(x, "apiAccessLevel", value.asInstanceOf[js.Any])
    
    inline def setApiAccessLevelUndefined: Self = StObject.set(x, "apiAccessLevel", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamespacePrefixUndefined: Self = StObject.set(x, "namespacePrefix", js.undefined)
    
    inline def setObjectPermissions(value: js.Array[ProfileObjectPermissions]): Self = StObject.set(x, "objectPermissions", value.asInstanceOf[js.Any])
    
    inline def setObjectPermissionsUndefined: Self = StObject.set(x, "objectPermissions", js.undefined)
    
    inline def setObjectPermissionsVarargs(value: ProfileObjectPermissions*): Self = StObject.set(x, "objectPermissions", js.Array(value*))
    
    inline def setPostInstallClass(value: String): Self = StObject.set(x, "postInstallClass", value.asInstanceOf[js.Any])
    
    inline def setPostInstallClassUndefined: Self = StObject.set(x, "postInstallClass", js.undefined)
    
    inline def setSetupWeblink(value: String): Self = StObject.set(x, "setupWeblink", value.asInstanceOf[js.Any])
    
    inline def setSetupWeblinkUndefined: Self = StObject.set(x, "setupWeblink", js.undefined)
    
    inline def setTypes(value: js.Array[PackageTypeMembers]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: PackageTypeMembers*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUninstallClass(value: String): Self = StObject.set(x, "uninstallClass", value.asInstanceOf[js.Any])
    
    inline def setUninstallClassUndefined: Self = StObject.set(x, "uninstallClass", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
