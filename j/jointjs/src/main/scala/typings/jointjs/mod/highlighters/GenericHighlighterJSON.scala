package typings.jointjs.mod.highlighters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericHighlighterJSON[K /* <: HighlighterType */] extends js.Object {
  var name: K = js.native
  var options: js.UndefOr[GenericHighlighterArguments[K]] = js.native
}

object GenericHighlighterJSON {
  @scala.inline
  def apply[/* <: typings.jointjs.mod.highlighters.HighlighterType */ K](name: K): GenericHighlighterJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericHighlighterJSON[K]]
  }
  @scala.inline
  implicit class GenericHighlighterJSONOps[Self <: GenericHighlighterJSON[_], /* <: typings.jointjs.mod.highlighters.HighlighterType */ K] (val x: Self with GenericHighlighterJSON[K]) extends AnyVal {
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
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: GenericHighlighterArguments[K]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

