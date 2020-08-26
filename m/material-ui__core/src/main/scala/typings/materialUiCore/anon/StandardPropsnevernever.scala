package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
@js.native
trait StandardPropsnevernever extends js.Object {
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.native
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object StandardPropsnevernever {
  @scala.inline
  def apply(): StandardPropsnevernever = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropsnevernever]
  }
  @scala.inline
  implicit class StandardPropsneverneverOps[Self <: StandardPropsnevernever] (val x: Self) extends AnyVal {
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
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClasses(value: Partial[ClassNameMap[scala.Nothing]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[_] | RefObject[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

