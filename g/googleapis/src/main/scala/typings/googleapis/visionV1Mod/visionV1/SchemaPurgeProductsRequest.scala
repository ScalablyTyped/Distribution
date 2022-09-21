package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPurgeProductsRequest extends StObject {
  
  /**
    * If delete_orphan_products is true, all Products that are not in any ProductSet will be deleted.
    */
  var deleteOrphanProducts: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The default value is false. Override this value to true to actually perform the purge.
    */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specify which ProductSet contains the Products to be deleted.
    */
  var productSetPurgeConfig: js.UndefOr[SchemaProductSetPurgeConfig] = js.undefined
}
object SchemaPurgeProductsRequest {
  
  inline def apply(): SchemaPurgeProductsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPurgeProductsRequest]
  }
  
  extension [Self <: SchemaPurgeProductsRequest](x: Self) {
    
    inline def setDeleteOrphanProducts(value: Boolean): Self = StObject.set(x, "deleteOrphanProducts", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrphanProductsNull: Self = StObject.set(x, "deleteOrphanProducts", null)
    
    inline def setDeleteOrphanProductsUndefined: Self = StObject.set(x, "deleteOrphanProducts", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setProductSetPurgeConfig(value: SchemaProductSetPurgeConfig): Self = StObject.set(x, "productSetPurgeConfig", value.asInstanceOf[js.Any])
    
    inline def setProductSetPurgeConfigUndefined: Self = StObject.set(x, "productSetPurgeConfig", js.undefined)
  }
}
