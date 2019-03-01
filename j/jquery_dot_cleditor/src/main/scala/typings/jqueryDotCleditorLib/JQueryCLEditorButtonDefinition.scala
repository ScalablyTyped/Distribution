package typings
package jqueryDotCleditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorButtonDefinition extends js.Object {
  var buttonClick: js.UndefOr[
    js.Function2[
      /* event */ stdLib.Event, 
      /* data */ JQueryCLEditorButtonDefinitionEventData, 
      scala.Boolean
    ]
  ] = js.undefined
  var command: js.UndefOr[java.lang.String] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, scala.Boolean]] = js.undefined
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, scala.Boolean]] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var popupClick: js.UndefOr[
    js.Function2[
      /* event */ stdLib.Event, 
      /* data */ JQueryCLEditorButtonDefinitionEventData, 
      scala.Boolean
    ]
  ] = js.undefined
  var popupContent: js.UndefOr[java.lang.String] = js.undefined
  var popupName: js.UndefOr[java.lang.String] = js.undefined
  var stripIndex: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
}

object JQueryCLEditorButtonDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    title: java.lang.String,
    buttonClick: js.Function2[
      /* event */ stdLib.Event, 
      /* data */ JQueryCLEditorButtonDefinitionEventData, 
      scala.Boolean
    ] = null,
    command: java.lang.String = null,
    css: js.Any = null,
    getEnabled: js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, scala.Boolean] = null,
    getPressed: js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, scala.Boolean] = null,
    image: java.lang.String = null,
    popupClick: js.Function2[
      /* event */ stdLib.Event, 
      /* data */ JQueryCLEditorButtonDefinitionEventData, 
      scala.Boolean
    ] = null,
    popupContent: java.lang.String = null,
    popupName: java.lang.String = null,
    stripIndex: scala.Int | scala.Double = null
  ): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("title")(title)
    if (buttonClick != null) __obj.updateDynamic("buttonClick")(buttonClick)
    if (command != null) __obj.updateDynamic("command")(command)
    if (css != null) __obj.updateDynamic("css")(css)
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(getEnabled)
    if (getPressed != null) __obj.updateDynamic("getPressed")(getPressed)
    if (image != null) __obj.updateDynamic("image")(image)
    if (popupClick != null) __obj.updateDynamic("popupClick")(popupClick)
    if (popupContent != null) __obj.updateDynamic("popupContent")(popupContent)
    if (popupName != null) __obj.updateDynamic("popupName")(popupName)
    if (stripIndex != null) __obj.updateDynamic("stripIndex")(stripIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
}

