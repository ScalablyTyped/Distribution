package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellOutputOptions extends IShellSpawnOptions {
  var fatalOnError: js.UndefOr[Boolean] = js.native
  var fatalOnNotFound: js.UndefOr[Boolean] = js.native
  var showError: js.UndefOr[Boolean] = js.native
}

object IShellOutputOptions {
  @scala.inline
  def apply(): IShellOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellOutputOptions]
  }
  @scala.inline
  implicit class IShellOutputOptionsOps[Self <: IShellOutputOptions] (val x: Self) extends AnyVal {
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
    def setFatalOnError(value: Boolean): Self = this.set("fatalOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatalOnError: Self = this.set("fatalOnError", js.undefined)
    @scala.inline
    def setFatalOnNotFound(value: Boolean): Self = this.set("fatalOnNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatalOnNotFound: Self = this.set("fatalOnNotFound", js.undefined)
    @scala.inline
    def setShowError(value: Boolean): Self = this.set("showError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowError: Self = this.set("showError", js.undefined)
  }
  
}

