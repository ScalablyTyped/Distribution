package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDescriptorHtml
  extends StObject
     with MessageDescriptorBase
     with MessageDescriptor {
  
  var html: String
}
object MessageDescriptorHtml {
  
  inline def apply(html: String): MessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorHtml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageDescriptorHtml] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
