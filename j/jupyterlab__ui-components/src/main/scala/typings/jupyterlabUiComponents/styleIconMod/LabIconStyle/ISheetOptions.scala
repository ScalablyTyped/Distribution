package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that function as a shorthand for compound CSS properties,
  * such as the set of props required to center an svg inside
  * of a parent node
  */
trait ISheetOptions extends js.Object {
  /**
    * How to position the inner svg element,
    * relative to the outer container
    */
  var elementPosition: js.UndefOr[IPosition] = js.undefined
  /**
    * the size of the inner svg element. Can be any of:
    *   - 'small': 14px x 14px
    *   - 'normal': 16px x 16px
    *   - 'large': 20px x 20px
    *   - 'xlarge': 24px x 24px
    */
  var elementSize: js.UndefOr[ISize] = js.undefined
}

object ISheetOptions {
  @scala.inline
  def apply(elementPosition: IPosition = null, elementSize: ISize = null): ISheetOptions = {
    val __obj = js.Dynamic.literal()
    if (elementPosition != null) __obj.updateDynamic("elementPosition")(elementPosition.asInstanceOf[js.Any])
    if (elementSize != null) __obj.updateDynamic("elementSize")(elementSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISheetOptions]
  }
}

