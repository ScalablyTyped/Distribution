package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.distTypesComponentsContentContentDashInterfaceMod.ScrollBaseDetail
import typings.atIonicCore.distTypesComponentsContentContentDashInterfaceMod.ScrollDetail
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonContent extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Emitted while scrolling. This event is disabled by default. Look at the property: `scrollEvents`
    */
  var onIonScroll: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollDetail], Unit]] = js.undefined
  /**
    * Emitted when the scroll has ended.
    */
  var onIonScrollEnd: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollBaseDetail], Unit]] = js.undefined
  /**
    * Emitted when the scroll has started.
    */
  var onIonScrollStart: js.UndefOr[js.Function1[/* event */ CustomEvent[ScrollBaseDetail], Unit]] = js.undefined
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: js.UndefOr[Boolean] = js.undefined
}

object IonContent {
  @scala.inline
  def apply(
    color: Color = null,
    forceOverscroll: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    onIonScroll: /* event */ CustomEvent[ScrollDetail] => Unit = null,
    onIonScrollEnd: /* event */ CustomEvent[ScrollBaseDetail] => Unit = null,
    onIonScrollStart: /* event */ CustomEvent[ScrollBaseDetail] => Unit = null,
    scrollEvents: js.UndefOr[Boolean] = js.undefined,
    scrollX: js.UndefOr[Boolean] = js.undefined,
    scrollY: js.UndefOr[Boolean] = js.undefined
  ): IonContent = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(forceOverscroll)) __obj.updateDynamic("forceOverscroll")(forceOverscroll)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (onIonScroll != null) __obj.updateDynamic("onIonScroll")(js.Any.fromFunction1(onIonScroll))
    if (onIonScrollEnd != null) __obj.updateDynamic("onIonScrollEnd")(js.Any.fromFunction1(onIonScrollEnd))
    if (onIonScrollStart != null) __obj.updateDynamic("onIonScrollStart")(js.Any.fromFunction1(onIonScrollStart))
    if (!js.isUndefined(scrollEvents)) __obj.updateDynamic("scrollEvents")(scrollEvents)
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX)
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY)
    __obj.asInstanceOf[IonContent]
  }
}

