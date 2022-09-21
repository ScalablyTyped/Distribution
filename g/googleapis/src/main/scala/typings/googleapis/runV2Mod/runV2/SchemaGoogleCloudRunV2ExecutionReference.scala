package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ExecutionReference extends StObject {
  
  /**
    * Creation timestamp of the execution.
    */
  var completionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creation timestamp of the execution.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the execution.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2ExecutionReference {
  
  inline def apply(): SchemaGoogleCloudRunV2ExecutionReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ExecutionReference]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ExecutionReference](x: Self) {
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeNull: Self = StObject.set(x, "completionTime", null)
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
