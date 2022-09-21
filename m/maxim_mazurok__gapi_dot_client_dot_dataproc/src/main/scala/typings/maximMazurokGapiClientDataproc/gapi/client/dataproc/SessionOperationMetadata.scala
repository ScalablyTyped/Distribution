package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOperationMetadata extends StObject {
  
  /** The time when the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Short description of the operation. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The time when the operation was finished. */
  var doneTime: js.UndefOr[String] = js.undefined
  
  /** Labels associated with the operation. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SessionOperationMetadata & TopLevel[Any]
  ] = js.undefined
  
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** Name of the session for the operation. */
  var session: js.UndefOr[String] = js.undefined
  
  /** Session UUID for the operation. */
  var sessionUuid: js.UndefOr[String] = js.undefined
  
  /** Warnings encountered during operation execution. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object SessionOperationMetadata {
  
  inline def apply(): SessionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOperationMetadata]
  }
  
  extension [Self <: SessionOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoneTime(value: String): Self = StObject.set(x, "doneTime", value.asInstanceOf[js.Any])
    
    inline def setDoneTimeUndefined: Self = StObject.set(x, "doneTime", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SessionOperationMetadata & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionUuid(value: String): Self = StObject.set(x, "sessionUuid", value.asInstanceOf[js.Any])
    
    inline def setSessionUuidUndefined: Self = StObject.set(x, "sessionUuid", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
