package typings.graphqlToolsUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameTypesOptions extends js.Object {
  var renameBuiltins: Boolean = js.native
  var renameScalars: Boolean = js.native
}

object RenameTypesOptions {
  @scala.inline
  def apply(renameBuiltins: Boolean, renameScalars: Boolean): RenameTypesOptions = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameTypesOptions]
  }
  @scala.inline
  implicit class RenameTypesOptionsOps[Self <: RenameTypesOptions] (val x: Self) extends AnyVal {
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
    def setRenameBuiltins(value: Boolean): Self = this.set("renameBuiltins", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenameScalars(value: Boolean): Self = this.set("renameScalars", value.asInstanceOf[js.Any])
  }
  
}

