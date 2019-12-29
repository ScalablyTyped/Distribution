package typings.atMaterialDashUiStyles

import typings.atMaterialDashUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.Styles
import typings.react.reactMod.Ref
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @material-ui/styles.@material-ui/styles/withStyles/withStyles.StyledComponentProps<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassKeyOfStyles<StylesType>> & @material-ui/styles.@material-ui/styles/withStyles/withStyles.PropsOfStyles<StylesType> */
trait StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType /* <: Styles[_, _, String] */] extends js.Object {
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKeyOfStyles[StylesType]]]] = js.undefined
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
}

object StyledComponentPropsClassKeyOfStylesStylesTypeProp {
  @scala.inline
  def apply[StylesType /* <: Styles[_, _, String] */](classes: Partial[ClassNameMap[ClassKeyOfStyles[StylesType]]] = null, innerRef: Ref[_] = null): StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]]
  }
}

