package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceLocateOptions extends js.Object {
  var useAliases: js.UndefOr[Boolean] = js.native
}

object NamespaceLocateOptions {
  @scala.inline
  def apply(): NamespaceLocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceLocateOptions]
  }
  @scala.inline
  implicit class NamespaceLocateOptionsOps[Self <: NamespaceLocateOptions] (val x: Self) extends AnyVal {
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
    def setUseAliases(value: Boolean): Self = this.set("useAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAliases: Self = this.set("useAliases", js.undefined)
  }
  
}

