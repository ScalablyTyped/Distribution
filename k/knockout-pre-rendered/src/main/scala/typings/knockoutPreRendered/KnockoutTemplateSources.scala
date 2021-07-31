package typings.knockoutPreRendered

import typings.knockoutPreRendered.anon.Instantiable
import typings.knockoutPreRendered.anon.InstantiableKnockoutTemplateAnonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutTemplateSources extends StObject {
  
  var anonymousTemplate: InstantiableKnockoutTemplateAnonymous
  
  var domElement: Instantiable
}
object KnockoutTemplateSources {
  
  @scala.inline
  def apply(anonymousTemplate: InstantiableKnockoutTemplateAnonymous, domElement: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  
  @scala.inline
  implicit class KnockoutTemplateSourcesMutableBuilder[Self <: KnockoutTemplateSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymousTemplate(value: InstantiableKnockoutTemplateAnonymous): Self = StObject.set(x, "anonymousTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomElement(value: Instantiable): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
  }
}
