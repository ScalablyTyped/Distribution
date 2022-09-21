package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRule extends StObject {
  
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in this creative. This is a required field.
    */
  var assetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A user-friendly name for this rule. This is a required field.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A targeting template ID. The targeting from the targeting template will be used to determine whether this asset should be served. This is a required field.
    */
  var targetingTemplateId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRule {
  
  inline def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  extension [Self <: SchemaRule](x: Self) {
    
    inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdNull: Self = StObject.set(x, "assetId", null)
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetingTemplateId(value: String): Self = StObject.set(x, "targetingTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTargetingTemplateIdNull: Self = StObject.set(x, "targetingTemplateId", null)
    
    inline def setTargetingTemplateIdUndefined: Self = StObject.set(x, "targetingTemplateId", js.undefined)
  }
}
