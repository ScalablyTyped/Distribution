package typings.javascriptDashObfuscator.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVerbatimProperty extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var precedence: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Precedence */ js.Any
}

object XVerbatimProperty {
  @scala.inline
  def apply(
    precedence: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Precedence */ js.Any,
    content: String = null
  ): XVerbatimProperty = {
    val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[XVerbatimProperty]
  }
}

