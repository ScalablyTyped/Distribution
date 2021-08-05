package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptionsCompression extends StObject {
  
  var minBytes: Double
}
object ServerOptionsCompression {
  
  inline def apply(minBytes: Double): ServerOptionsCompression = {
    val __obj = js.Dynamic.literal(minBytes = minBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptionsCompression]
  }
  
  extension [Self <: ServerOptionsCompression](x: Self) {
    
    inline def setMinBytes(value: Double): Self = StObject.set(x, "minBytes", value.asInstanceOf[js.Any])
  }
}
