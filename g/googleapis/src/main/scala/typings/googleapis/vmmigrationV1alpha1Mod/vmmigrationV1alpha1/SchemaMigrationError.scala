package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMigrationError extends StObject {
  
  /**
    * Output only. Suggested action for solving the error.
    */
  var actionItem: js.UndefOr[SchemaLocalizedMessage] = js.undefined
  
  /**
    * Output only. The error code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The localized error message.
    */
  var errorMessage: js.UndefOr[SchemaLocalizedMessage] = js.undefined
  
  /**
    * Output only. The time the error occurred.
    */
  var errorTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URL(s) pointing to additional information on handling the current error.
    */
  var helpLinks: js.UndefOr[js.Array[SchemaLink]] = js.undefined
}
object SchemaMigrationError {
  
  inline def apply(): SchemaMigrationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMigrationError]
  }
  
  extension [Self <: SchemaMigrationError](x: Self) {
    
    inline def setActionItem(value: SchemaLocalizedMessage): Self = StObject.set(x, "actionItem", value.asInstanceOf[js.Any])
    
    inline def setActionItemUndefined: Self = StObject.set(x, "actionItem", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrorMessage(value: SchemaLocalizedMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorTime(value: String): Self = StObject.set(x, "errorTime", value.asInstanceOf[js.Any])
    
    inline def setErrorTimeNull: Self = StObject.set(x, "errorTime", null)
    
    inline def setErrorTimeUndefined: Self = StObject.set(x, "errorTime", js.undefined)
    
    inline def setHelpLinks(value: js.Array[SchemaLink]): Self = StObject.set(x, "helpLinks", value.asInstanceOf[js.Any])
    
    inline def setHelpLinksUndefined: Self = StObject.set(x, "helpLinks", js.undefined)
    
    inline def setHelpLinksVarargs(value: SchemaLink*): Self = StObject.set(x, "helpLinks", js.Array(value*))
  }
}
