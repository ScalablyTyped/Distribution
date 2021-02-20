package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request template for the delete upload data request.
  */
@js.native
trait SchemaAnalyticsDataimportDeleteUploadDataRequest extends StObject {
  
  /**
    * A list of upload UIDs.
    */
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAnalyticsDataimportDeleteUploadDataRequest {
  
  @scala.inline
  def apply(): SchemaAnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsDataimportDeleteUploadDataRequest]
  }
  
  @scala.inline
  implicit class SchemaAnalyticsDataimportDeleteUploadDataRequestMutableBuilder[Self <: SchemaAnalyticsDataimportDeleteUploadDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDataImportUids(value: js.Array[String]): Self = StObject.set(x, "customDataImportUids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataImportUidsUndefined: Self = StObject.set(x, "customDataImportUids", js.undefined)
    
    @scala.inline
    def setCustomDataImportUidsVarargs(value: String*): Self = StObject.set(x, "customDataImportUids", js.Array(value :_*))
  }
}
