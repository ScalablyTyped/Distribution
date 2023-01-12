package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardConfig extends StObject {
  
  var shardCount: Double
  
  var shardIndex: Double
}
object ShardConfig {
  
  inline def apply(shardCount: Double, shardIndex: Double): ShardConfig = {
    val __obj = js.Dynamic.literal(shardCount = shardCount.asInstanceOf[js.Any], shardIndex = shardIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShardConfig] (val x: Self) extends AnyVal {
    
    inline def setShardCount(value: Double): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
    
    inline def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
  }
}
