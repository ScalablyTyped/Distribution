package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing an Operation
  */
@js.native
trait SchemaOperationMetadataV1Beta2 extends StObject {
  
  /**
    * The original request that started the operation.
    */
  var request: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Target of the operation - for example
    * projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Type of operation.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The last update timestamp of the operation.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Version id of the function created or updated by an API call. This field
    * is only populated for Create and Update operations.
    */
  var versionId: js.UndefOr[String] = js.native
}
object SchemaOperationMetadataV1Beta2 {
  
  @scala.inline
  def apply(): SchemaOperationMetadataV1Beta2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1Beta2]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataV1Beta2MutableBuilder[Self <: SchemaOperationMetadataV1Beta2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: StringDictionary[js.Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
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
