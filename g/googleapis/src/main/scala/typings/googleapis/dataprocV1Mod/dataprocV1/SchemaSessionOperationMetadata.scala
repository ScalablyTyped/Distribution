package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSessionOperationMetadata extends StObject {
  
  /**
    * The time when the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short description of the operation.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the operation was finished.
    */
  var doneTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels associated with the operation.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the session for the operation.
    */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Session UUID for the operation.
    */
  var sessionUuid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Warnings encountered during operation execution.
    */
  var warnings: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSessionOperationMetadata {
  
  inline def apply(): SchemaSessionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSessionOperationMetadata]
  }
  
  extension [Self <: SchemaSessionOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoneTime(value: String): Self = StObject.set(x, "doneTime", value.asInstanceOf[js.Any])
    
    inline def setDoneTimeNull: Self = StObject.set(x, "doneTime", null)
    
    inline def setDoneTimeUndefined: Self = StObject.set(x, "doneTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionUuid(value: String): Self = StObject.set(x, "sessionUuid", value.asInstanceOf[js.Any])
    
    inline def setSessionUuidNull: Self = StObject.set(x, "sessionUuid", null)
    
    inline def setSessionUuidUndefined: Self = StObject.set(x, "sessionUuid", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
