package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.center
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.left
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.right
import typings.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps
  extends NestedCSSProperties
     with ISheetOptions {
  /**
    * @deprecated use elementPosition instead
    */
  var justify: js.UndefOr[center | right | left] = js.undefined
  /**
    * @depreacted use stylesheet instead
    */
  var kind: js.UndefOr[IBuiltin] = js.undefined
  /**
    * Specify the icon styling. Can be either a string naming one of
    * the builtin icon stylesheets, a LabIconStyle.ISheet object, or an
    * array containing any mixture of the two. If an array is provided,
    * the actual style will be determined by merging the stylesheets in
    * the array, giving precedence to the rightmost values.
    */
  var stylesheet: js.UndefOr[ISheetResolvable | js.Array[ISheetResolvable]] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    ISheetOptions: ISheetOptions = null,
    NestedCSSProperties: NestedCSSProperties = null,
    justify: center | right | left = null,
    kind: IBuiltin = null,
    stylesheet: ISheetResolvable | js.Array[ISheetResolvable] = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (ISheetOptions != null) js.Dynamic.global.Object.assign(__obj, ISheetOptions)
    if (NestedCSSProperties != null) js.Dynamic.global.Object.assign(__obj, NestedCSSProperties)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

