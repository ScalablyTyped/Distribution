package typings.knockoutPreRendered

import typings.knockoutPreRendered.anon.Instantiable
import typings.knockoutPreRendered.anon.InstantiableKnockoutTemplateAnonymous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var anonymousTemplate: InstantiableKnockoutTemplateAnonymous
  var domElement: Instantiable
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(anonymousTemplate: InstantiableKnockoutTemplateAnonymous, domElement: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

