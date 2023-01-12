package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.anon.Instantiable
import typings.jqueryAjaxfile.anon.InstantiableKnockoutTemplateAnonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutTemplateSources extends StObject {
  
  var anonymousTemplate: InstantiableKnockoutTemplateAnonymous
  
  var domElement: Instantiable
}
object KnockoutTemplateSources {
  
  inline def apply(anonymousTemplate: InstantiableKnockoutTemplateAnonymous, domElement: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutTemplateSources] (val x: Self) extends AnyVal {
    
    inline def setAnonymousTemplate(value: InstantiableKnockoutTemplateAnonymous): Self = StObject.set(x, "anonymousTemplate", value.asInstanceOf[js.Any])
    
    inline def setDomElement(value: Instantiable): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
  }
}
