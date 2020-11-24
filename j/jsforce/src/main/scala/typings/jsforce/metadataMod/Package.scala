package typings.jsforce.metadataMod

import typings.jsforce.jsforceStrings.Restricted
import typings.jsforce.jsforceStrings.Unrestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package extends js.Object {
  
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
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTypesVarargs(value: PackageTypeMembers*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[PackageTypeMembers]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiAccessLevel(value: Unrestricted | Restricted): Self = this.set("apiAccessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiAccessLevel: Self = this.set("apiAccessLevel", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    
    @scala.inline
    def setNamespacePrefix(value: String): Self = this.set("namespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespacePrefix: Self = this.set("namespacePrefix", js.undefined)
    
    @scala.inline
    def setObjectPermissionsVarargs(value: ProfileObjectPermissions*): Self = this.set("objectPermissions", js.Array(value :_*))
    
    @scala.inline
    def setObjectPermissions(value: js.Array[ProfileObjectPermissions]): Self = this.set("objectPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectPermissions: Self = this.set("objectPermissions", js.undefined)
    
    @scala.inline
    def setPostInstallClass(value: String): Self = this.set("postInstallClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostInstallClass: Self = this.set("postInstallClass", js.undefined)
    
    @scala.inline
    def setSetupWeblink(value: String): Self = this.set("setupWeblink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupWeblink: Self = this.set("setupWeblink", js.undefined)
    
    @scala.inline
    def setUninstallClass(value: String): Self = this.set("uninstallClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstallClass: Self = this.set("uninstallClass", js.undefined)
  }
}
