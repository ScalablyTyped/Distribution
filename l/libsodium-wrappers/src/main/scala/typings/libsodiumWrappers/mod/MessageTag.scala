package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTag extends StObject {
  
  var message: Uint8Array
  
  var tag: Double
}
object MessageTag {
  
  @scala.inline
  def apply(message: Uint8Array, tag: Double): MessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  
  @scala.inline
  implicit class MessageTagMutableBuilder[Self <: MessageTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Uint8Array): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
