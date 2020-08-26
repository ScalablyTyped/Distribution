package typings.materialUiLab.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: String = js.native
  var endAdornment: ReactNode = js.native
  var ref: Ref[_] = js.native
  var startAdornment: ReactNode = js.native
}

object ClassName {
  @scala.inline
  def apply(className: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndAdornment(value: ReactNode): Self = this.set("endAdornment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAdornment: Self = this.set("endAdornment", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setStartAdornment(value: ReactNode): Self = this.set("startAdornment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAdornment: Self = this.set("startAdornment", js.undefined)
  }
  
}

