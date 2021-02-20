package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDescriptorText
  extends MessageDescriptorBase
     with MessageDescriptor {
  
  var text: String = js.native
}
object MessageDescriptorText {
  
  @scala.inline
  def apply(text: String): MessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorText]
  }
  
  @scala.inline
  implicit class MessageDescriptorTextMutableBuilder[Self <: MessageDescriptorText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
