package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.fadeFadeMod.FadeProps
import typings.atMaterialDashUiCore.fadeMod.default
import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style */
object Fade
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.fadeMod.default].asInstanceOf[String | js.Object]
  def apply(
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null,
    theme: Theme = null,
    timeout: Double | Anon_Appear = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2(addEndListener))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FadeProps
}

