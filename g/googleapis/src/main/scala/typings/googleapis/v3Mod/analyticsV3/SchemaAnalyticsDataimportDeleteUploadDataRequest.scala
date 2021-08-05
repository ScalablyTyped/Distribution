package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request template for the delete upload data request.
  */
trait SchemaAnalyticsDataimportDeleteUploadDataRequest extends StObject {
  
  /**
    * A list of upload UIDs.
    */
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAnalyticsDataimportDeleteUploadDataRequest {
  
  inline def apply(): SchemaAnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsDataimportDeleteUploadDataRequest]
  }
  
  extension [Self <: SchemaAnalyticsDataimportDeleteUploadDataRequest](x: Self) {
    
    inline def setCustomDataImportUids(value: js.Array[String]): Self = StObject.set(x, "customDataImportUids", value.asInstanceOf[js.Any])
    
    inline def setCustomDataImportUidsUndefined: Self = StObject.set(x, "customDataImportUids", js.undefined)
    
    inline def setCustomDataImportUidsVarargs(value: String*): Self = StObject.set(x, "customDataImportUids", js.Array(value :_*))
  }
}
