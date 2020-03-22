package typings.materialUiStyles.withStylesWithStylesMod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined IncludeTheme extends true ? {  theme  :@material-ui/styles.@material-ui/styles/withStyles/withStyles.ThemeOfStyles<StylesType>} : {} & {  classes  :@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassKeyOfStyles<StylesType>>,   innerRef ? :react.react.Ref<any>} & @material-ui/styles.@material-ui/styles/withStyles/withStyles.PropsOfStyles<StylesType> */
trait WithStyles[StylesType /* <: ClassKeyInferable[_, _] */, IncludeTheme /* <: js.UndefOr[Boolean] */] extends js.Object {
  var classes: ClassNameMap[ClassKeyOfStyles[StylesType]]
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
}

object WithStyles {
  @scala.inline
  def apply[StylesType /* <: ClassKeyInferable[_, _] */, IncludeTheme /* <: js.UndefOr[Boolean] */](classes: ClassNameMap[ClassKeyOfStyles[StylesType]], innerRef: Ref[_] = null): WithStyles[StylesType, IncludeTheme] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStyles[StylesType, IncludeTheme]]
  }
}

