package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingMessageDescriptorText
  extends SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  
  var text: String = js.native
}
object SavingMessageDescriptorText {
  
  @scala.inline
  def apply(text: String): SavingMessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorText]
  }
  
  @scala.inline
  implicit class SavingMessageDescriptorTextMutableBuilder[Self <: SavingMessageDescriptorText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
