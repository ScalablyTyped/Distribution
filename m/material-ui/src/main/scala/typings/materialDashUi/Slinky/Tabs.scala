package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.materialDashUi.tabsMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TabsNs.TabsProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tabsMod.default].asInstanceOf[String | js.Object]
  def apply(
    contentContainerClassName: String = null,
    contentContainerStyle: CSSProperties = null,
    initialSelectedIndex: Int | Double = null,
    inkBarStyle: CSSProperties = null,
    onChange: (/* value */ js.Any, /* e */ FormEvent[js.Object], /* tab */ typings.materialDashUi.underscoreUnderscoreMaterialUINs.TabsNs.Tab) => Unit = null,
    tabItemContainerStyle: CSSProperties = null,
    tabTemplate: ReactComponentClass[_] = null,
    tabTemplateStyle: CSSProperties = null,
    value: js.Any = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (contentContainerClassName != null) __obj.updateDynamic("contentContainerClassName")(contentContainerClassName)
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle)
    if (initialSelectedIndex != null) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.asInstanceOf[js.Any])
    if (inkBarStyle != null) __obj.updateDynamic("inkBarStyle")(inkBarStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (tabItemContainerStyle != null) __obj.updateDynamic("tabItemContainerStyle")(tabItemContainerStyle)
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate)
    if (tabTemplateStyle != null) __obj.updateDynamic("tabTemplateStyle")(tabTemplateStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsProps
}

