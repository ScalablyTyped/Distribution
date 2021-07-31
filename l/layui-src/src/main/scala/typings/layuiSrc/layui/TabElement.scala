package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabElement extends StObject {
  
  var bodyElem: String
  
  var headerElem: String
}
object TabElement {
  
  @scala.inline
  def apply(bodyElem: String, headerElem: String): TabElement = {
    val __obj = js.Dynamic.literal(bodyElem = bodyElem.asInstanceOf[js.Any], headerElem = headerElem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabElement]
  }
  
  @scala.inline
  implicit class TabElementMutableBuilder[Self <: TabElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyElem(value: String): Self = StObject.set(x, "bodyElem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderElem(value: String): Self = StObject.set(x, "headerElem", value.asInstanceOf[js.Any])
  }
}
