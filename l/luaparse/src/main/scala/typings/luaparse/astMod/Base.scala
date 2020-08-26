package typings.luaparse.astMod

import typings.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base[TType /* <: String */] extends js.Object {
  var loc: js.UndefOr[End] = js.native
  var `type`: TType = js.native
}

object Base {
  @scala.inline
  def apply[/* <: java.lang.String */ TType](`type`: TType): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[TType]]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base[_], /* <: java.lang.String */ TType] (val x: Self with Base[TType]) extends AnyVal {
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
    def setType(value: TType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: End): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

