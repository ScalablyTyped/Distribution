package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.ProjectIntegration>> */
@js.native
trait PartialReadonlyProjectInt extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialReadonlyProjectInt {
  @scala.inline
  def apply(): PartialReadonlyProjectInt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyProjectInt]
  }
  @scala.inline
  implicit class PartialReadonlyProjectIntOps[Self <: PartialReadonlyProjectInt] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

