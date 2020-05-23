package typings.materialUiStyles.anon

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var classes: ClassNameMap[ClassKeyOfStyles[StylesType]]
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
}

object Classes {
  @scala.inline
  def apply[StylesType](
    classes: ClassNameMap[ClassKeyOfStyles[StylesType]],
    innerRef: js.UndefOr[Null | Ref[_]] = js.undefined
  ): Classes[StylesType] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[StylesType]]
  }
}

