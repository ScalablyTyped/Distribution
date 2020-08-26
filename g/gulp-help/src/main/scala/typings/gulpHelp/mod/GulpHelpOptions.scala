package typings.gulpHelp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHelpOptions extends js.Object {
  /**
    * A function to run after the default help task runs
    */
  var afterPrintCallback: js.UndefOr[js.Function] = js.native
  /**
    * Adds aliases to the default help task
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * Modifies the default help message
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Hide all task dependencies
    */
  var hideDepsMessage: js.UndefOr[Boolean] = js.native
  /**
    * Hide all tasks with no help message defined. Useful when including 3rd party tasks
    */
  var hideEmpty: js.UndefOr[Boolean] = js.native
}

object GulpHelpOptions {
  @scala.inline
  def apply(): GulpHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpHelpOptions]
  }
  @scala.inline
  implicit class GulpHelpOptionsOps[Self <: GulpHelpOptions] (val x: Self) extends AnyVal {
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
    def setAfterPrintCallback(value: js.Function): Self = this.set("afterPrintCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterPrintCallback: Self = this.set("afterPrintCallback", js.undefined)
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHideDepsMessage(value: Boolean): Self = this.set("hideDepsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDepsMessage: Self = this.set("hideDepsMessage", js.undefined)
    @scala.inline
    def setHideEmpty(value: Boolean): Self = this.set("hideEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEmpty: Self = this.set("hideEmpty", js.undefined)
  }
  
}

