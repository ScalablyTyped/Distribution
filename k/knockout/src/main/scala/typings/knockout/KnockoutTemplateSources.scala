package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var anonymousTemplate: Anon_ElementKnockoutTemplateAnonymous
  var domElement: Anon_Element
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(anonymousTemplate: Anon_ElementKnockoutTemplateAnonymous, domElement: Anon_Element): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

