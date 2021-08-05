package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing an Operation
  */
trait SchemaOperationMetadataV1 extends StObject {
  
  /**
    * The original request that started the operation.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * Type of operation.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The last update timestamp of the operation.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Version id of the function created or updated by an API call. This field
    * is only populated for Create and Update operations.
    */
  var versionId: js.UndefOr[String] = js.undefined
}
object SchemaOperationMetadataV1 {
  
  inline def apply(): SchemaOperationMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1]
  }
  
  extension [Self <: SchemaOperationMetadataV1](x: Self) {
    
    inline def setRequest(value: StringDictionary[js.Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
