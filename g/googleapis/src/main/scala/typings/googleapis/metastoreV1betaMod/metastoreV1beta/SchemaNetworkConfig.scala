package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfig extends StObject {
  
  /**
    * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
    */
  var consumers: js.UndefOr[js.Array[SchemaConsumer]] = js.undefined
}
object SchemaNetworkConfig {
  
  inline def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  extension [Self <: SchemaNetworkConfig](x: Self) {
    
    inline def setConsumers(value: js.Array[SchemaConsumer]): Self = StObject.set(x, "consumers", value.asInstanceOf[js.Any])
    
    inline def setConsumersUndefined: Self = StObject.set(x, "consumers", js.undefined)
    
    inline def setConsumersVarargs(value: SchemaConsumer*): Self = StObject.set(x, "consumers", js.Array(value*))
  }
}
