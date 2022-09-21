package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIpMapping extends StObject {
  
  /**
    * The IP address assigned.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
    */
  var timeToRetire: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaIpMapping {
  
  inline def apply(): SchemaIpMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpMapping]
  }
  
  extension [Self <: SchemaIpMapping](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setTimeToRetire(value: String): Self = StObject.set(x, "timeToRetire", value.asInstanceOf[js.Any])
    
    inline def setTimeToRetireNull: Self = StObject.set(x, "timeToRetire", null)
    
    inline def setTimeToRetireUndefined: Self = StObject.set(x, "timeToRetire", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
