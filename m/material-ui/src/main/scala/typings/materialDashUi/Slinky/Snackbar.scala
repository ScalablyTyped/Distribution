package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.snackbarMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.SnackbarProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, open, className */
object Snackbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.snackbarMod.default].asInstanceOf[String | js.Object]
  def apply(
    message: TagMod[Any],
    action: TagMod[Any] = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    contentStyle: CSSProperties = null,
    onActionClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onRequestClose: /* reason */ String => Unit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(message = message)
    if (action != null) __obj.updateDynamic("action")(action)
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SnackbarProps
}

