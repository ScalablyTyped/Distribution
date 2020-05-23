package typings.knockstrap

import typings.knockstrap.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutTemplateSources extends js.Object {
  var stringTemplate: Instantiable
}

object KnockoutTemplateSources {
  @scala.inline
  def apply(stringTemplate: Instantiable): KnockoutTemplateSources = {
    val __obj = js.Dynamic.literal(stringTemplate = stringTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutTemplateSources]
  }
}

