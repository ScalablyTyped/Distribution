package typings.knockoutPreRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var anonymousTemplate: AnonInstantiableKnockoutTemplateAnonymous
  var domElement: AnonInstantiable
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(anonymousTemplate: AnonInstantiableKnockoutTemplateAnonymous, domElement: AnonInstantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

