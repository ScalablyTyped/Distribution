package typings.ipfsCoreTypes.distSrcRootMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardingOptions extends StObject {
  
  var sharding: js.UndefOr[Boolean] = js.undefined
}
object ShardingOptions {
  
  inline def apply(): ShardingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardingOptions]
  }
  
  extension [Self <: ShardingOptions](x: Self) {
    
    inline def setSharding(value: Boolean): Self = StObject.set(x, "sharding", value.asInstanceOf[js.Any])
    
    inline def setShardingUndefined: Self = StObject.set(x, "sharding", js.undefined)
  }
}
