package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDescriptorHtml
  extends StObject
     with LabelDescriptorBase
     with LabelDescriptor {
  
  var iconHtml: String
}
object LabelDescriptorHtml {
  
  inline def apply(iconHtml: String, title: String): LabelDescriptorHtml = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorHtml]
  }
  
  extension [Self <: LabelDescriptorHtml](x: Self) {
    
    inline def setIconHtml(value: String): Self = StObject.set(x, "iconHtml", value.asInstanceOf[js.Any])
  }
}
