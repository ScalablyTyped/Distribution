package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTag extends StObject {
  
  var message: js.typedarray.Uint8Array
  
  var tag: Double
}
object MessageTag {
  
  inline def apply(message: js.typedarray.Uint8Array, tag: Double): MessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  
  extension [Self <: MessageTag](x: Self) {
    
    inline def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
