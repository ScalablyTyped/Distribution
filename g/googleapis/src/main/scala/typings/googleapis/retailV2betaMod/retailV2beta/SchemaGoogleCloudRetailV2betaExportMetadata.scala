package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaExportMetadata extends StObject {
  
  /**
    * Operation create time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Operation last update time. If the operation is done, this is also the finish time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaExportMetadata {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaExportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaExportMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaExportMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
