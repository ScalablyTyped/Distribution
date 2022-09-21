package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExpirationPolicy extends StObject {
  
  /**
    * Specifies the "time-to-live" duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of "activity" depends on the type of the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never expires.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaExpirationPolicy {
  
  inline def apply(): SchemaExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpirationPolicy]
  }
  
  extension [Self <: SchemaExpirationPolicy](x: Self) {
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
