package typings.knockoutPreRendered

import typings.knockoutPreRendered.anon.Instantiable
import typings.knockoutPreRendered.anon.InstantiableKnockoutTemplateAnonymous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutTemplateSources extends js.Object {
  
  var anonymousTemplate: InstantiableKnockoutTemplateAnonymous = js.native
  
  var domElement: Instantiable = js.native
}
object KnockoutTemplateSources {
  
  @scala.inline
  def apply(anonymousTemplate: InstantiableKnockoutTemplateAnonymous, domElement: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
  
  @scala.inline
  implicit class KnockoutTemplateSourcesOps[Self <: KnockoutTemplateSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnonymousTemplate(value: InstantiableKnockoutTemplateAnonymous): Self = this.set("anonymousTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomElement(value: Instantiable): Self = this.set("domElement", value.asInstanceOf[js.Any])
  }
}
