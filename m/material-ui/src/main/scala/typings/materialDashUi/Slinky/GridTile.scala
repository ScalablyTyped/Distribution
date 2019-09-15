package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.materialDashUi.gridListGridTileMod.default
import typings.materialDashUi.materialDashUiStrings.bottom
import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.materialDashUi.materialDashUiStrings.top
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.GridListNs.GridTileProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, style, rows, cols */
object GridTile
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.gridListGridTileMod.default].asInstanceOf[String | js.Object]
  def apply(
    actionIcon: ReactElement = null,
    actionPosition: left | right = null,
    containerElement: String | ReactElement | ReactComponentClass[_] = null,
    subtitle: TagMod[Any] = null,
    subtitleStyle: CSSProperties = null,
    title: TagMod[Any] = null,
    titleBackground: String = null,
    titlePosition: top | bottom = null,
    titleStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon)
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleBackground != null) __obj.updateDynamic("titleBackground")(titleBackground)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridTileProps
}

