package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingMessageDescriptorText
  extends StObject
     with LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  
  var text: String
}
object LoadingMessageDescriptorText {
  
  inline def apply(text: String): LoadingMessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorText]
  }
  
  extension [Self <: LoadingMessageDescriptorText](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
