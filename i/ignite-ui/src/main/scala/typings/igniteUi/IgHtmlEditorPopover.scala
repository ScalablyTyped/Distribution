package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHtmlEditorPopover
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  @JSName("apply")
  var apply: js.UndefOr[ApplyEvent] = js.undefined
  var cancel: js.UndefOr[CancelEvent] = js.undefined
  var hide: js.UndefOr[HideEvent] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var item: js.UndefOr[js.Any] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  var show: js.UndefOr[ShowEvent] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object IgHtmlEditorPopover {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    apply: (/* event */ Event, /* ui */ ApplyEventUIParam) => Unit = null,
    cancel: (/* event */ Event, /* ui */ CancelEventUIParam) => Unit = null,
    hide: (/* event */ Event, /* ui */ HideEventUIParam) => Unit = null,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    item: js.Any = null,
    language: String = null,
    locale: js.Any = null,
    regional: String | js.Object = null,
    show: (/* event */ Event, /* ui */ ShowEventUIParam) => Unit = null,
    target: js.Any = null
  ): IgHtmlEditorPopover = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction2(apply))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction2(cancel))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction2(hide))
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.get.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction2(show))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHtmlEditorPopover]
  }
}

