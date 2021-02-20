package typings.jsforce.metadataMod

import typings.jsforce.jsforceStrings.Restricted
import typings.jsforce.jsforceStrings.Unrestricted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package extends StObject {
  
  var apiAccessLevel: js.UndefOr[Unrestricted | Restricted] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var fullName: js.UndefOr[String] = js.native
  
  var namespacePrefix: js.UndefOr[String] = js.native
  
  var objectPermissions: js.UndefOr[js.Array[ProfileObjectPermissions]] = js.native
  
  var postInstallClass: js.UndefOr[String] = js.native
  
  var setupWeblink: js.UndefOr[String] = js.native
  
  var types: js.Array[PackageTypeMembers] = js.native
  
  var uninstallClass: js.UndefOr[String] = js.native
  
  var version: String = js.native
}
object Package {
  
  @scala.inline
  def apply(types: js.Array[PackageTypeMembers], version: String): Package = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiAccessLevel(value: Unrestricted | Restricted): Self = StObject.set(x, "apiAccessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiAccessLevelUndefined: Self = StObject.set(x, "apiAccessLevel", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacePrefixUndefined: Self = StObject.set(x, "namespacePrefix", js.undefined)
    
    @scala.inline
    def setObjectPermissions(value: js.Array[ProfileObjectPermissions]): Self = StObject.set(x, "objectPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPermissionsUndefined: Self = StObject.set(x, "objectPermissions", js.undefined)
    
    @scala.inline
    def setObjectPermissionsVarargs(value: ProfileObjectPermissions*): Self = StObject.set(x, "objectPermissions", js.Array(value :_*))
    
    @scala.inline
    def setPostInstallClass(value: String): Self = StObject.set(x, "postInstallClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostInstallClassUndefined: Self = StObject.set(x, "postInstallClass", js.undefined)
    
    @scala.inline
    def setSetupWeblink(value: String): Self = StObject.set(x, "setupWeblink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupWeblinkUndefined: Self = StObject.set(x, "setupWeblink", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[PackageTypeMembers]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: PackageTypeMembers*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUninstallClass(value: String): Self = StObject.set(x, "uninstallClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstallClassUndefined: Self = StObject.set(x, "uninstallClass", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
