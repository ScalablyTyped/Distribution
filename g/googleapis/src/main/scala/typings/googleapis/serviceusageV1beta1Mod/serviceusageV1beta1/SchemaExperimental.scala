package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Experimental service configuration. These configuration options can only be
  * used by whitelisted users.
  */
trait SchemaExperimental extends StObject {
  
  /**
    * Authorization configuration.
    */
  var authorization: js.UndefOr[SchemaAuthorizationConfig] = js.undefined
}
object SchemaExperimental {
  
  inline def apply(): SchemaExperimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperimental]
  }
  
  extension [Self <: SchemaExperimental](x: Self) {
    
    inline def setAuthorization(value: SchemaAuthorizationConfig): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
  }
}
