package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandMetadataInput extends js.Object {
  var name: String = js.native
  var `private`: js.UndefOr[Boolean] = js.native
  var summary: String = js.native
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}

object CommandMetadataInput {
  @scala.inline
  def apply(name: String, summary: String): CommandMetadataInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataInput]
  }
  @scala.inline
  implicit class CommandMetadataInputOps[Self <: CommandMetadataInput] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
  
}

