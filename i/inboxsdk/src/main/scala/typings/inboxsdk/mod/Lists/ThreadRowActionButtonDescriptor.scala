package typings.inboxsdk.mod.Lists

import typings.inboxsdk.inboxsdkStrings.LINK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowActionButtonDescriptor extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var title: String = js.native
  
  var `type`: LINK = js.native
  
  var url: String = js.native
}
object ThreadRowActionButtonDescriptor {
  
  @scala.inline
  def apply(title: String, `type`: LINK, url: String): ThreadRowActionButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowActionButtonDescriptor]
  }
  
  @scala.inline
  implicit class ThreadRowActionButtonDescriptorMutableBuilder[Self <: ThreadRowActionButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LINK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
