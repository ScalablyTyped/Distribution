package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMetadataV1 extends StObject {
  
  /** The Cloud Build ID of the function created or updated by an API call. This field is only populated for Create and Update operations. */
  var buildId: js.UndefOr[String] = js.native
  
  /** The original request that started the operation. */
  var request: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.OperationMetadataV1 with TopLevel[js.Any]
  ] = js.native
  
  /** Target of the operation - for example projects/project-1/locations/region-1/functions/function-1 */
  var target: js.UndefOr[String] = js.native
  
  /** Type of operation. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The last update timestamp of the operation. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** Version id of the function created or updated by an API call. This field is only populated for Create and Update operations. */
  var versionId: js.UndefOr[String] = js.native
}
object OperationMetadataV1 {
  
  @scala.inline
  def apply(): OperationMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadataV1]
  }
  
  @scala.inline
  implicit class OperationMetadataV1MutableBuilder[Self <: OperationMetadataV1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    @scala.inline
    def setRequest(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.OperationMetadataV1 with TopLevel[js.Any]
    ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
