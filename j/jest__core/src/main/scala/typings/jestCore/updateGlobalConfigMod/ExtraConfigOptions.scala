package typings.jestCore.updateGlobalConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'noSCM' | 'passWithNoTests'>> */
@js.native
trait ExtraConfigOptions extends js.Object {
  var noSCM: js.UndefOr[Boolean | Null] = js.native
  var passWithNoTests: js.UndefOr[Boolean] = js.native
}

object ExtraConfigOptions {
  @scala.inline
  def apply(): ExtraConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraConfigOptions]
  }
  @scala.inline
  implicit class ExtraConfigOptionsOps[Self <: ExtraConfigOptions] (val x: Self) extends AnyVal {
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
    def setNoSCM(value: Boolean): Self = this.set("noSCM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSCM: Self = this.set("noSCM", js.undefined)
    @scala.inline
    def setNoSCMNull: Self = this.set("noSCM", null)
    @scala.inline
    def setPassWithNoTests(value: Boolean): Self = this.set("passWithNoTests", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassWithNoTests: Self = this.set("passWithNoTests", js.undefined)
  }
  
}

