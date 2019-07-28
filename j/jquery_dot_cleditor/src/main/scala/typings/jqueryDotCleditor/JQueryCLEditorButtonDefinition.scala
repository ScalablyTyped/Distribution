package typings.jqueryDotCleditor

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorButtonDefinition extends js.Object {
  var buttonClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.undefined
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var name: String
  var popupClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.undefined
  var popupContent: js.UndefOr[String] = js.undefined
  var popupName: js.UndefOr[String] = js.undefined
  var stripIndex: js.UndefOr[Double] = js.undefined
  var title: String
}

object JQueryCLEditorButtonDefinition {
  @scala.inline
  def apply(
    name: String,
    title: String,
    buttonClick: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean = null,
    command: String = null,
    css: js.Any = null,
    getEnabled: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean = null,
    getPressed: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean = null,
    image: String = null,
    popupClick: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean = null,
    popupContent: String = null,
    popupName: String = null,
    stripIndex: Int | Double = null
  ): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal(name = name, title = title)
    if (buttonClick != null) __obj.updateDynamic("buttonClick")(js.Any.fromFunction2(buttonClick))
    if (command != null) __obj.updateDynamic("command")(command)
    if (css != null) __obj.updateDynamic("css")(css)
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(js.Any.fromFunction1(getEnabled))
    if (getPressed != null) __obj.updateDynamic("getPressed")(js.Any.fromFunction1(getPressed))
    if (image != null) __obj.updateDynamic("image")(image)
    if (popupClick != null) __obj.updateDynamic("popupClick")(js.Any.fromFunction2(popupClick))
    if (popupContent != null) __obj.updateDynamic("popupContent")(popupContent)
    if (popupName != null) __obj.updateDynamic("popupName")(popupName)
    if (stripIndex != null) __obj.updateDynamic("stripIndex")(stripIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
}

