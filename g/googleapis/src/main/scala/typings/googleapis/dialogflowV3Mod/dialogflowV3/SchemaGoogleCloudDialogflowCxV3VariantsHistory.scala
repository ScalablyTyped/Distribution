package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3VariantsHistory extends StObject {
  
  /**
    * Update time of the variants.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The flow versions as the variants.
    */
  var versionVariants: js.UndefOr[SchemaGoogleCloudDialogflowCxV3VersionVariants] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3VariantsHistory {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3VariantsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3VariantsHistory]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3VariantsHistory](x: Self) {
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionVariants(value: SchemaGoogleCloudDialogflowCxV3VersionVariants): Self = StObject.set(x, "versionVariants", value.asInstanceOf[js.Any])
    
    inline def setVersionVariantsUndefined: Self = StObject.set(x, "versionVariants", js.undefined)
  }
}
