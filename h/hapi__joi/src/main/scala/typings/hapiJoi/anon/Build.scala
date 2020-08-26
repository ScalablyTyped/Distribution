package typings.hapiJoi.anon

import typings.hapiJoi.mod.ExtensionBoundSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  var build: js.UndefOr[js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _], _]] = js.native
}

object Build {
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
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
    def setBuild(value: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _]) => _): Self = this.set("build", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
  }
  
}

