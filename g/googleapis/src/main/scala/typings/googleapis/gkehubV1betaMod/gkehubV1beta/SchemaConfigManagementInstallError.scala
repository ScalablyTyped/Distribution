package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementInstallError extends StObject {
  
  /**
    * A string representing the user facing error message
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementInstallError {
  
  inline def apply(): SchemaConfigManagementInstallError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementInstallError]
  }
  
  extension [Self <: SchemaConfigManagementInstallError](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
