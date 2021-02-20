package typings.kikBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KikMessage extends StObject {
  
  var big: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var noForward: js.UndefOr[Boolean] = js.native
  
  var pic: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var title: String = js.native
}
object KikMessage {
  
  @scala.inline
  def apply(text: String, title: String): KikMessage = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikMessage]
  }
  
  @scala.inline
  implicit class KikMessageMutableBuilder[Self <: KikMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBig(value: Boolean): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setNoForward(value: Boolean): Self = StObject.set(x, "noForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoForwardUndefined: Self = StObject.set(x, "noForward", js.undefined)
    
    @scala.inline
    def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicUndefined: Self = StObject.set(x, "pic", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
