package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEffectiveGuestPolicy extends StObject {
  
  /**
    * List of package repository configurations assigned to the VM instance.
    */
  var packageRepositories: js.UndefOr[js.Array[SchemaEffectiveGuestPolicySourcedPackageRepository]] = js.undefined
  
  /**
    * List of package configurations assigned to the VM instance.
    */
  var packages: js.UndefOr[js.Array[SchemaEffectiveGuestPolicySourcedPackage]] = js.undefined
  
  /**
    * List of recipes assigned to the VM instance.
    */
  var softwareRecipes: js.UndefOr[js.Array[SchemaEffectiveGuestPolicySourcedSoftwareRecipe]] = js.undefined
}
object SchemaEffectiveGuestPolicy {
  
  inline def apply(): SchemaEffectiveGuestPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEffectiveGuestPolicy]
  }
  
  extension [Self <: SchemaEffectiveGuestPolicy](x: Self) {
    
    inline def setPackageRepositories(value: js.Array[SchemaEffectiveGuestPolicySourcedPackageRepository]): Self = StObject.set(x, "packageRepositories", value.asInstanceOf[js.Any])
    
    inline def setPackageRepositoriesUndefined: Self = StObject.set(x, "packageRepositories", js.undefined)
    
    inline def setPackageRepositoriesVarargs(value: SchemaEffectiveGuestPolicySourcedPackageRepository*): Self = StObject.set(x, "packageRepositories", js.Array(value*))
    
    inline def setPackages(value: js.Array[SchemaEffectiveGuestPolicySourcedPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: SchemaEffectiveGuestPolicySourcedPackage*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setSoftwareRecipes(value: js.Array[SchemaEffectiveGuestPolicySourcedSoftwareRecipe]): Self = StObject.set(x, "softwareRecipes", value.asInstanceOf[js.Any])
    
    inline def setSoftwareRecipesUndefined: Self = StObject.set(x, "softwareRecipes", js.undefined)
    
    inline def setSoftwareRecipesVarargs(value: SchemaEffectiveGuestPolicySourcedSoftwareRecipe*): Self = StObject.set(x, "softwareRecipes", js.Array(value*))
  }
}
