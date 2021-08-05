package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiOptions extends StObject {
  
  var pipeline: Boolean
}
object MultiOptions {
  
  inline def apply(pipeline: Boolean): MultiOptions = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiOptions]
  }
  
  extension [Self <: MultiOptions](x: Self) {
    
    inline def setPipeline(value: Boolean): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
