package typings.materialUiCore.withStylesMod

import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledComponentProps[ClassKey /* <: String */] extends js.Object {
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.native
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
}

object StyledComponentProps {
  @scala.inline
  def apply[/* <: java.lang.String */ ClassKey](
    classes: Partial[ClassNameMap[ClassKey]] = null,
    innerRef: js.UndefOr[Null | Ref[_] | RefObject[_]] = js.undefined
  ): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
}

