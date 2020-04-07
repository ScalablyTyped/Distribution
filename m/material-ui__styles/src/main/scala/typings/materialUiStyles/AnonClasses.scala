package typings.materialUiStyles

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClasses[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var classes: ClassNameMap[ClassKeyOfStyles[StylesType]]
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
}

object AnonClasses {
  @scala.inline
  def apply[StylesType /* <: ClassKeyInferable[_, _] */](classes: ClassNameMap[ClassKeyOfStyles[StylesType]], innerRef: Ref[_] = null): AnonClasses[StylesType] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses[StylesType]]
  }
}

