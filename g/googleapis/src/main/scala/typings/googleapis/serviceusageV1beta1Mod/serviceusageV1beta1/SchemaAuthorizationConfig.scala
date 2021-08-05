package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of authorization.  This section determines the authorization
  * provider, if unspecified, then no authorization check will be done.
  * Example:      experimental:       authorization:         provider:
  * firebaserules.googleapis.com
  */
trait SchemaAuthorizationConfig extends StObject {
  
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.undefined
}
object SchemaAuthorizationConfig {
  
  inline def apply(): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
  
  extension [Self <: SchemaAuthorizationConfig](x: Self) {
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
