package typings.ioredis.anon

import typings.ioredis.ioredisBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  var pipeline: `false`
}
object Pipeline {
  
  inline def apply(): Pipeline = {
    val __obj = js.Dynamic.literal(pipeline = false)
    __obj.asInstanceOf[Pipeline]
  }
  
  extension [Self <: Pipeline](x: Self) {
    
    inline def setPipeline(value: `false`): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
