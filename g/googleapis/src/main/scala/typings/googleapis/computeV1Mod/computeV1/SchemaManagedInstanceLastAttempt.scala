package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedInstanceLastAttempt extends StObject {
  
  /**
    * [Output Only] Encountered errors during the last attempt to create or delete the instance.
    */
  var errors: js.UndefOr[`5` | Null] = js.undefined
}
object SchemaManagedInstanceLastAttempt {
  
  inline def apply(): SchemaManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceLastAttempt]
  }
  
  extension [Self <: SchemaManagedInstanceLastAttempt](x: Self) {
    
    inline def setErrors(value: `5`): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
