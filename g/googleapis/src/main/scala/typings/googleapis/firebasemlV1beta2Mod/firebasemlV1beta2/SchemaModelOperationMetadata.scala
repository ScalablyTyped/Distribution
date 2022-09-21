package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModelOperationMetadata extends StObject {
  
  var basicOperationStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the model we are creating/updating The name must have the form `projects/{project_id\}/models/{model_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaModelOperationMetadata {
  
  inline def apply(): SchemaModelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModelOperationMetadata]
  }
  
  extension [Self <: SchemaModelOperationMetadata](x: Self) {
    
    inline def setBasicOperationStatus(value: String): Self = StObject.set(x, "basicOperationStatus", value.asInstanceOf[js.Any])
    
    inline def setBasicOperationStatusNull: Self = StObject.set(x, "basicOperationStatus", null)
    
    inline def setBasicOperationStatusUndefined: Self = StObject.set(x, "basicOperationStatus", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
