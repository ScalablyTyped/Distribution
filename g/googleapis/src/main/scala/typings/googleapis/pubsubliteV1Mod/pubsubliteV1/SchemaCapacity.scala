package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCapacity extends StObject {
  
  /**
    * Publish throughput capacity per partition in MiB/s. Must be \>= 4 and <= 16.
    */
  var publishMibPerSec: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Subscribe throughput capacity per partition in MiB/s. Must be \>= 4 and <= 32.
    */
  var subscribeMibPerSec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCapacity {
  
  inline def apply(): SchemaCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapacity]
  }
  
  extension [Self <: SchemaCapacity](x: Self) {
    
    inline def setPublishMibPerSec(value: Double): Self = StObject.set(x, "publishMibPerSec", value.asInstanceOf[js.Any])
    
    inline def setPublishMibPerSecNull: Self = StObject.set(x, "publishMibPerSec", null)
    
    inline def setPublishMibPerSecUndefined: Self = StObject.set(x, "publishMibPerSec", js.undefined)
    
    inline def setSubscribeMibPerSec(value: Double): Self = StObject.set(x, "subscribeMibPerSec", value.asInstanceOf[js.Any])
    
    inline def setSubscribeMibPerSecNull: Self = StObject.set(x, "subscribeMibPerSec", null)
    
    inline def setSubscribeMibPerSecUndefined: Self = StObject.set(x, "subscribeMibPerSec", js.undefined)
  }
}
