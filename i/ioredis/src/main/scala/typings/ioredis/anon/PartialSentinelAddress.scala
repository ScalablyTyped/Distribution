package typings.ioredis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ioredis.ioredis/built/connectors/SentinelConnector/types.SentinelAddress> */
trait PartialSentinelAddress extends StObject {
  
  var family: js.UndefOr[Double] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object PartialSentinelAddress {
  
  inline def apply(): PartialSentinelAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSentinelAddress]
  }
  
  extension [Self <: PartialSentinelAddress](x: Self) {
    
    inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
