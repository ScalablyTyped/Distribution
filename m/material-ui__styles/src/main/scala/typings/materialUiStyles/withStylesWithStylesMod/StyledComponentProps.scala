package typings.materialUiStyles.withStylesWithStylesMod

import typings.react.mod.Ref
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledComponentProps[ClassKey /* <: String */] extends js.Object {
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.undefined
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
}

object StyledComponentProps {
  @scala.inline
  def apply[ClassKey /* <: String */](classes: Partial[ClassNameMap[ClassKey]] = null, innerRef: Ref[_] = null): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
}

