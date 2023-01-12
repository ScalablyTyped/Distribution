package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingMessageDescriptorHtml
  extends StObject
     with SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  
  var html: String
}
object SavingMessageDescriptorHtml {
  
  inline def apply(html: String): SavingMessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorHtml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingMessageDescriptorHtml] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
