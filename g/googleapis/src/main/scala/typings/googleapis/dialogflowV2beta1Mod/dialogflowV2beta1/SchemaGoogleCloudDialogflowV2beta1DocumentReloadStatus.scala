package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus extends StObject {
  
  /**
    * Output only. The status of a reload attempt or the initial load.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Output only. The time of a reload attempt. This reload may have been triggered automatically or manually and may not have succeeded.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1DocumentReloadStatus](x: Self) {
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
