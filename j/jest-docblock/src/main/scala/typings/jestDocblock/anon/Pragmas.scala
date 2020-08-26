package typings.jestDocblock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pragmas extends js.Object {
  var comments: js.UndefOr[String] = js.native
  var pragmas: js.UndefOr[typings.jestDocblock.mod.Pragmas] = js.native
}

object Pragmas {
  @scala.inline
  def apply(): Pragmas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pragmas]
  }
  @scala.inline
  implicit class PragmasOps[Self <: Pragmas] (val x: Self) extends AnyVal {
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
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setPragmas(value: typings.jestDocblock.mod.Pragmas): Self = this.set("pragmas", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePragmas: Self = this.set("pragmas", js.undefined)
  }
  
}

