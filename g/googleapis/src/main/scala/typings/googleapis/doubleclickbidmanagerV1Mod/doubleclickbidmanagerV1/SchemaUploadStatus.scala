package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the status of upload.
  */
trait SchemaUploadStatus extends StObject {
  
  /**
    * Reasons why upload can&#39;t be completed.
    */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Per-row upload status.
    */
  var rowStatus: js.UndefOr[js.Array[SchemaRowStatus]] = js.undefined
}
object SchemaUploadStatus {
  
  inline def apply(): SchemaUploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadStatus]
  }
  
  extension [Self <: SchemaUploadStatus](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setRowStatus(value: js.Array[SchemaRowStatus]): Self = StObject.set(x, "rowStatus", value.asInstanceOf[js.Any])
    
    inline def setRowStatusUndefined: Self = StObject.set(x, "rowStatus", js.undefined)
    
    inline def setRowStatusVarargs(value: SchemaRowStatus*): Self = StObject.set(x, "rowStatus", js.Array(value :_*))
  }
}
