package typings.ipfsHttpServer.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: Buffer
}
object Value {
  
  inline def apply(value: Buffer): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
