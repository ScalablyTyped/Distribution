package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.tableTableFooterMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object TableFooter
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableTableFooterMod.default].asInstanceOf[String | js.Object]
  def apply(adjustForCheckbox: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableFooterProps
}

