package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartEnvironmentResponse extends StObject {
  
  /**
    * Environment that was started.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.undefined
}
object SchemaStartEnvironmentResponse {
  
  inline def apply(): SchemaStartEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentResponse]
  }
  
  extension [Self <: SchemaStartEnvironmentResponse](x: Self) {
    
    inline def setEnvironment(value: SchemaEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
