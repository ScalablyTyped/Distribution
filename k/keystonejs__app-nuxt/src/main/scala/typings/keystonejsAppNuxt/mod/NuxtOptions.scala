package typings.keystonejsAppNuxt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NuxtOptions extends js.Object {
  var buildDir: js.UndefOr[String] = js.native
  var srcDir: js.UndefOr[String] = js.native
}

object NuxtOptions {
  @scala.inline
  def apply(): NuxtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NuxtOptions]
  }
  @scala.inline
  implicit class NuxtOptionsOps[Self <: NuxtOptions] (val x: Self) extends AnyVal {
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
    def setBuildDir(value: String): Self = this.set("buildDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildDir: Self = this.set("buildDir", js.undefined)
    @scala.inline
    def setSrcDir(value: String): Self = this.set("srcDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDir: Self = this.set("srcDir", js.undefined)
  }
  
}

