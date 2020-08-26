package typings.graphql.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var key: String | Double = js.native
  var prev: js.UndefOr[Path] = js.native
  var typename: js.UndefOr[String] = js.native
}

object Path {
  @scala.inline
  def apply(key: String | Double): Path = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
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
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: Path): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setTypename(value: String): Self = this.set("typename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypename: Self = this.set("typename", js.undefined)
  }
  
}

