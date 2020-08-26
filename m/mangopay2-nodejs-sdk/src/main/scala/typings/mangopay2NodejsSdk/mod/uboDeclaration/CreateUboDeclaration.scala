package typings.mangopay2NodejsSdk.mod.uboDeclaration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUboDeclaration extends js.Object {
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.native
}

object CreateUboDeclaration {
  @scala.inline
  def apply(): CreateUboDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUboDeclaration]
  }
  @scala.inline
  implicit class CreateUboDeclarationOps[Self <: CreateUboDeclaration] (val x: Self) extends AnyVal {
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
    def setDeclaredUBOsVarargs(value: String*): Self = this.set("DeclaredUBOs", js.Array(value :_*))
    @scala.inline
    def setDeclaredUBOs(value: js.Array[String]): Self = this.set("DeclaredUBOs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaredUBOs: Self = this.set("DeclaredUBOs", js.undefined)
  }
  
}

