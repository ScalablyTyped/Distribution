package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDescriptorText
  extends StObject
     with MessageDescriptorBase
     with MessageDescriptor {
  
  var text: String
}
object MessageDescriptorText {
  
  inline def apply(text: String): MessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageDescriptorText] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
