package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestPolicy extends StObject {
  
  /**
    * Required. Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
    */
  var assignment: js.UndefOr[SchemaAssignment] = js.undefined
  
  /**
    * Output only. Time this guest policy was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the guest policy. Length of the description is limited to 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The etag for this guest policy. If this is provided on update, it must match the server's etag.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Unique name of the resource in this project using one of the following forms: `projects/{project_number\}/guestPolicies/{guest_policy_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
    */
  var packageRepositories: js.UndefOr[js.Array[SchemaPackageRepository]] = js.undefined
  
  /**
    * The software packages to be managed by this policy.
    */
  var packages: js.UndefOr[js.Array[SchemaPackage]] = js.undefined
  
  /**
    * A list of Recipes to install on the VM instance.
    */
  var recipes: js.UndefOr[js.Array[SchemaSoftwareRecipe]] = js.undefined
  
  /**
    * Output only. Last time this guest policy was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuestPolicy {
  
  inline def apply(): SchemaGuestPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestPolicy]
  }
  
  extension [Self <: SchemaGuestPolicy](x: Self) {
    
    inline def setAssignment(value: SchemaAssignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageRepositories(value: js.Array[SchemaPackageRepository]): Self = StObject.set(x, "packageRepositories", value.asInstanceOf[js.Any])
    
    inline def setPackageRepositoriesUndefined: Self = StObject.set(x, "packageRepositories", js.undefined)
    
    inline def setPackageRepositoriesVarargs(value: SchemaPackageRepository*): Self = StObject.set(x, "packageRepositories", js.Array(value*))
    
    inline def setPackages(value: js.Array[SchemaPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: SchemaPackage*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setRecipes(value: js.Array[SchemaSoftwareRecipe]): Self = StObject.set(x, "recipes", value.asInstanceOf[js.Any])
    
    inline def setRecipesUndefined: Self = StObject.set(x, "recipes", js.undefined)
    
    inline def setRecipesVarargs(value: SchemaSoftwareRecipe*): Self = StObject.set(x, "recipes", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
