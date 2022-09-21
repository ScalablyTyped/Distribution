package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1Version extends StObject {
  
  /**
    * Output only. The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The developer-provided description of this version.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The status of this version. This field is read-only and cannot be set by create and update methods.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
    */
  var versionNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1Version {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Version]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1Version](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
