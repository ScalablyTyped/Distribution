package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var stringTemplate: AnonTemplate
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(stringTemplate: AnonTemplate): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(stringTemplate = stringTemplate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

