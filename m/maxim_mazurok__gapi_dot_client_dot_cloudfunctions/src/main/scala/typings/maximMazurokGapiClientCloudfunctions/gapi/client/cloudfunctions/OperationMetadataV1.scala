package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadataV1 extends StObject {
  
  /** The Cloud Build ID of the function created or updated by an API call. This field is only populated for Create and Update operations. */
  var buildId: js.UndefOr[String] = js.undefined
  
  /** The original request that started the operation. */
  var request: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.OperationMetadataV1 & TopLevel[js.Any]
  ] = js.undefined
  
  /** Target of the operation - for example projects/project-1/locations/region-1/functions/function-1 */
  var target: js.UndefOr[String] = js.undefined
  
  /** Type of operation. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The last update timestamp of the operation. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Version id of the function created or updated by an API call. This field is only populated for Create and Update operations. */
  var versionId: js.UndefOr[String] = js.undefined
}
object OperationMetadataV1 {
  
  inline def apply(): OperationMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadataV1]
  }
  
  extension [Self <: OperationMetadataV1](x: Self) {
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setRequest(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.OperationMetadataV1 & TopLevel[js.Any]
    ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
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
