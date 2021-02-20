package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the status of upload.
  */
@js.native
trait SchemaUploadStatus extends StObject {
  
  /**
    * Reasons why upload can&#39;t be completed.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Per-row upload status.
    */
  var rowStatus: js.UndefOr[js.Array[SchemaRowStatus]] = js.native
}
object SchemaUploadStatus {
  
  @scala.inline
  def apply(): SchemaUploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadStatus]
  }
  
  @scala.inline
  implicit class SchemaUploadStatusMutableBuilder[Self <: SchemaUploadStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setRowStatus(value: js.Array[SchemaRowStatus]): Self = StObject.set(x, "rowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStatusUndefined: Self = StObject.set(x, "rowStatus", js.undefined)
    
    @scala.inline
    def setRowStatusVarargs(value: SchemaRowStatus*): Self = StObject.set(x, "rowStatus", js.Array(value :_*))
  }
}
