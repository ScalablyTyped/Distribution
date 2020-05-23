package typings.materialUiCore.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ClassName {
  @scala.inline
  def apply(className: String = null, style: CSSProperties = null): ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

