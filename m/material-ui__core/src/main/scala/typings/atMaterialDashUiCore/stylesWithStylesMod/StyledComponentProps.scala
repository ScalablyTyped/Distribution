package typings.atMaterialDashUiCore.stylesWithStylesMod

import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledComponentProps[ClassKey /* <: String */] extends js.Object {
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
}

object StyledComponentProps {
  @scala.inline
  def apply[ClassKey /* <: String */](classes: Partial[ClassNameMap[ClassKey]] = null, innerRef: Ref[_] | RefObject[_] = null): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
}

