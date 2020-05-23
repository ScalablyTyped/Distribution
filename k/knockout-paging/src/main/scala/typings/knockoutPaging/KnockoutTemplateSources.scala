package typings.knockoutPaging

import typings.knockoutPaging.anon.InstantiableKnockoutTemplateAnonymous
import typings.knockoutPaging.anon.InstantiableKnockoutTemplateSourcesDomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var anonymousTemplate: InstantiableKnockoutTemplateAnonymous
  var domElement: InstantiableKnockoutTemplateSourcesDomElement
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(
    anonymousTemplate: InstantiableKnockoutTemplateAnonymous,
    domElement: InstantiableKnockoutTemplateSourcesDomElement
  ): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

