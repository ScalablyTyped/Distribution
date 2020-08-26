package typings.mangopay2NodejsSdk.mod.uboDeclaration

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUboDeclaration extends js.Object {
  /**
    * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
    */
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.native
  var Id: String = js.native
  var Status: js.UndefOr[VALIDATION_ASKED] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object UpdateUboDeclaration {
  @scala.inline
  def apply(Id: String): UpdateUboDeclaration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUboDeclaration]
  }
  @scala.inline
  implicit class UpdateUboDeclarationOps[Self <: UpdateUboDeclaration] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclaredUBOsVarargs(value: String*): Self = this.set("DeclaredUBOs", js.Array(value :_*))
    @scala.inline
    def setDeclaredUBOs(value: js.Array[String]): Self = this.set("DeclaredUBOs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaredUBOs: Self = this.set("DeclaredUBOs", js.undefined)
    @scala.inline
    def setStatus(value: VALIDATION_ASKED): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

