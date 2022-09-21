package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1OperationMetadata extends StObject {
  
  /**
    * The time the operation was submitted.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time operation processing completed.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether a request to cancel this operation has been made.
    */
  var isCancellationRequested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The user labels, inherited from the model or the model version being operated on.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Contains the name of the model associated with the operation.
    */
  var modelName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains the project number associated with the operation.
    */
  var projectNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time operation processing started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains the version associated with the operation.
    */
  var version: js.UndefOr[SchemaGoogleCloudMlV1Version] = js.undefined
}
object SchemaGoogleCloudMlV1OperationMetadata {
  
  inline def apply(): SchemaGoogleCloudMlV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1OperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1OperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
    
    inline def setIsCancellationRequestedNull: Self = StObject.set(x, "isCancellationRequested", null)
    
    inline def setIsCancellationRequestedUndefined: Self = StObject.set(x, "isCancellationRequested", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameNull: Self = StObject.set(x, "modelName", null)
    
    inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberNull: Self = StObject.set(x, "projectNumber", null)
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setVersion(value: SchemaGoogleCloudMlV1Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
