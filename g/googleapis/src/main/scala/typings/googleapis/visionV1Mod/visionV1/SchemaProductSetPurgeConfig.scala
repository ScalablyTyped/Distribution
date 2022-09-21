package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductSetPurgeConfig extends StObject {
  
  /**
    * The ProductSet that contains the Products to delete. If a Product is a member of product_set_id in addition to other ProductSets, the Product will still be deleted.
    */
  var productSetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductSetPurgeConfig {
  
  inline def apply(): SchemaProductSetPurgeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSetPurgeConfig]
  }
  
  extension [Self <: SchemaProductSetPurgeConfig](x: Self) {
    
    inline def setProductSetId(value: String): Self = StObject.set(x, "productSetId", value.asInstanceOf[js.Any])
    
    inline def setProductSetIdNull: Self = StObject.set(x, "productSetId", null)
    
    inline def setProductSetIdUndefined: Self = StObject.set(x, "productSetId", js.undefined)
  }
}
