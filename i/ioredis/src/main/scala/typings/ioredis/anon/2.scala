package typings.ioredis.anon

import typings.ioredis.ioredisBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var pipeline: `true`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(pipeline = true)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setPipeline(value: `true`): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
