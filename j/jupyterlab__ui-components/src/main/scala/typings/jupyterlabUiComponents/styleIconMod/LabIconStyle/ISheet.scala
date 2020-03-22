package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import typings.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stylesheet with a collection of CSS props for each node
  * in an icon, plus some custom options
  */
trait ISheet extends ISheetResolvable {
  /**
    * CSS properties that will be applied to the outer container
    * element via a typestyle class
    */
  var container: js.UndefOr[NestedCSSProperties] = js.undefined
  /**
    * CSS properties that will be applied to the inner svg
    * element via a typestyle class
    */
  var element: js.UndefOr[NestedCSSProperties] = js.undefined
  /**
    * Options that function as modifiers for this style's
    * CSS properties
    */
  var options: js.UndefOr[ISheetOptions] = js.undefined
}

object ISheet {
  @scala.inline
  def apply(
    container: NestedCSSProperties = null,
    element: NestedCSSProperties = null,
    options: ISheetOptions = null
  ): ISheet = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISheet]
  }
}

