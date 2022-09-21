package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpload extends StObject {
  
  /**
    * Account Id to which this upload belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom data source Id to which this data import belongs.
    */
  var customDataSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data import errors collection.
    */
  var errors: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique ID for this upload.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Analytics upload.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time this file is uploaded.
    */
  var uploadTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpload {
  
  inline def apply(): SchemaUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpload]
  }
  
  extension [Self <: SchemaUpload](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setCustomDataSourceIdNull: Self = StObject.set(x, "customDataSourceId", null)
    
    inline def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUploadTime(value: String): Self = StObject.set(x, "uploadTime", value.asInstanceOf[js.Any])
    
    inline def setUploadTimeNull: Self = StObject.set(x, "uploadTime", null)
    
    inline def setUploadTimeUndefined: Self = StObject.set(x, "uploadTime", js.undefined)
  }
}
