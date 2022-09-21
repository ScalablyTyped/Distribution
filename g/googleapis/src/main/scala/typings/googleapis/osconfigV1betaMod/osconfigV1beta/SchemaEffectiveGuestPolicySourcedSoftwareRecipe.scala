package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEffectiveGuestPolicySourcedSoftwareRecipe extends StObject {
  
  /**
    * A software recipe to configure on the VM instance.
    */
  var softwareRecipe: js.UndefOr[SchemaSoftwareRecipe] = js.undefined
  
  /**
    * Name of the guest policy providing this config.
    */
  var source: js.UndefOr[String | Null] = js.undefined
}
object SchemaEffectiveGuestPolicySourcedSoftwareRecipe {
  
  inline def apply(): SchemaEffectiveGuestPolicySourcedSoftwareRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEffectiveGuestPolicySourcedSoftwareRecipe]
  }
  
  extension [Self <: SchemaEffectiveGuestPolicySourcedSoftwareRecipe](x: Self) {
    
    inline def setSoftwareRecipe(value: SchemaSoftwareRecipe): Self = StObject.set(x, "softwareRecipe", value.asInstanceOf[js.Any])
    
    inline def setSoftwareRecipeUndefined: Self = StObject.set(x, "softwareRecipe", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
