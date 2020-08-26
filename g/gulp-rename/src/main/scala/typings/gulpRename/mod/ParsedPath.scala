package typings.gulpRename.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedPath extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var dirname: js.UndefOr[String] = js.native
  var extname: js.UndefOr[String] = js.native
}

object ParsedPath {
  @scala.inline
  def apply(): ParsedPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedPath]
  }
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtname: Self = this.set("extname", js.undefined)
  }
  
}

