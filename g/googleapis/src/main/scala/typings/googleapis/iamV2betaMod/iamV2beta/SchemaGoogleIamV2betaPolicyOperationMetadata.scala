package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV2betaPolicyOperationMetadata extends StObject {
  
  /**
    * Timestamp when the `google.longrunning.Operation` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIamV2betaPolicyOperationMetadata {
  
  inline def apply(): SchemaGoogleIamV2betaPolicyOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV2betaPolicyOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleIamV2betaPolicyOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
