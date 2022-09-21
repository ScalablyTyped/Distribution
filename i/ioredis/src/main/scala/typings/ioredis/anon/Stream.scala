package typings.ioredis.anon

import typings.ioredis.builtTypesMod.NetStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var stream: NetStream
}
object Stream {
  
  inline def apply(stream: NetStream): Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setStream(value: NetStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
