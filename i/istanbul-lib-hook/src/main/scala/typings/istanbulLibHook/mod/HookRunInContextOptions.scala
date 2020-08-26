package typings.istanbulLibHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookRunInContextOptions extends Options {
  var coverageVariable: String = js.native
}

object HookRunInContextOptions {
  @scala.inline
  def apply(coverageVariable: String, verbose: Boolean): HookRunInContextOptions = {
    val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookRunInContextOptions]
  }
  @scala.inline
  implicit class HookRunInContextOptionsOps[Self <: HookRunInContextOptions] (val x: Self) extends AnyVal {
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
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
  }
  
}

