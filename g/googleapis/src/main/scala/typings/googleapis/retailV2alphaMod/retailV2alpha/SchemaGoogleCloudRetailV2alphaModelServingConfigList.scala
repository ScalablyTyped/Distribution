package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaModelServingConfigList extends StObject {
  
  /**
    * Optional. A set of valid serving configs that may be used for `PAGE_OPTIMIZATION`.
    */
  var servingConfigIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaModelServingConfigList {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaModelServingConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaModelServingConfigList]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaModelServingConfigList](x: Self) {
    
    inline def setServingConfigIds(value: js.Array[String]): Self = StObject.set(x, "servingConfigIds", value.asInstanceOf[js.Any])
    
    inline def setServingConfigIdsNull: Self = StObject.set(x, "servingConfigIds", null)
    
    inline def setServingConfigIdsUndefined: Self = StObject.set(x, "servingConfigIds", js.undefined)
    
    inline def setServingConfigIdsVarargs(value: String*): Self = StObject.set(x, "servingConfigIds", js.Array(value*))
  }
}
