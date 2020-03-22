package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.center
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.left
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.right
import typings.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProps
  extends NestedCSSProperties
     with ISheetOptions {
  /**
    * @deprecated use elementPosition instead
    */
  var justify: js.UndefOr[center | right | left] = js.native
  /**
    * @depreacted use stylesheet instead
    */
  var kind: js.UndefOr[IBuiltin] = js.native
  /**
    * Specify the icon styling. Can be either a string naming one of
    * the builtin icon stylesheets, a LabIconStyle.ISheet object, or an
    * array containing any mixture of the two. If an array is provided,
    * the actual style will be determined by merging the stylesheets in
    * the array, giving precedence to the rightmost values.
    */
  var stylesheet: js.UndefOr[ISheetResolvable | js.Array[ISheetResolvable]] = js.native
}

