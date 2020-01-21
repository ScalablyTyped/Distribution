package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var anonymousTemplate: AnonElementKnockoutTemplateAnonymous
  var domElement: AnonElement
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(anonymousTemplate: AnonElementKnockoutTemplateAnonymous, domElement: AnonElement): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(anonymousTemplate = anonymousTemplate.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

