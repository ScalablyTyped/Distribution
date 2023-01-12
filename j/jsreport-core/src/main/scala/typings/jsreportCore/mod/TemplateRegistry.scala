package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateRegistry extends StObject {
  
  var Template: typings.jsreportCore.mod.Template
}
object TemplateRegistry {
  
  inline def apply(Template: Template): TemplateRegistry = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateRegistry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateRegistry] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
