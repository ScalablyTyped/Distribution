package typings.javascriptObfuscator.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVerbatimProperty extends js.Object {
  var content: js.UndefOr[String] = js.native
  var precedence: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Precedence */ js.Any = js.native
}

object XVerbatimProperty {
  @scala.inline
  def apply(
    precedence: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Precedence */ js.Any
  ): XVerbatimProperty = {
    val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
    __obj.asInstanceOf[XVerbatimProperty]
  }
  @scala.inline
  implicit class XVerbatimPropertyOps[Self <: XVerbatimProperty] (val x: Self) extends AnyVal {
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
    def setPrecedence(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Precedence */ js.Any
    ): Self = this.set("precedence", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

