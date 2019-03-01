package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions extends js.Object {
  var ace: js.UndefOr[aceLib.AceAjaxNs.Ace] = js.undefined
  var ajv: js.UndefOr[ajvLib.ajvMod.ajvNs.Ajv] = js.undefined
  var autocomplete: js.UndefOr[AutoCompleteOptions] = js.undefined
  /**
    * @default true
    */
  var colorPicker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    */
  var enableSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    */
  var enableTransform: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    */
  var escapeUnicode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default 2
    */
  var indentation: js.UndefOr[scala.Double] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var languages: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ] = js.undefined
  /**
    * @default true
    */
  var mainMenuBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default 100
    */
  var maxVisibleChilds: js.UndefOr[scala.Double] = js.undefined
  var modalAnchor: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * @default 'tree'
    */
  var mode: js.UndefOr[JSONEditorMode] = js.undefined
  var modes: js.UndefOr[js.Array[JSONEditorMode]] = js.undefined
  /**
    * @default undefined
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default true
    */
  var navigationBar: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChangeJSON: js.UndefOr[js.Function1[/* json */ js.Any, scala.Unit]] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* jsonString */ java.lang.String, scala.Unit]] = js.undefined
  var onColorPicker: js.UndefOr[
    js.Function3[
      /* parent */ stdLib.HTMLElement, 
      /* color */ java.lang.String, 
      /* onChange */ js.Function1[/* color */ Color, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var onEditable: js.UndefOr[js.Function1[/* node */ Node, scala.Boolean | jsoneditorLib.Anon_Field]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onEvent: js.UndefOr[js.Function2[/* node */ Node, /* event */ java.lang.String, scala.Unit]] = js.undefined
  var onModeChange: js.UndefOr[
    js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, scala.Unit]
  ] = js.undefined
  var onNodeName: js.UndefOr[js.Function1[/* nodeName */ NodeName, js.UndefOr[java.lang.String]]] = js.undefined
  var onSelectionChange: js.UndefOr[
    js.Function2[/* start */ SerializableNode, /* end */ SerializableNode, scala.Unit]
  ] = js.undefined
  var onTextSelectionChange: js.UndefOr[
    js.Function3[
      /* start */ SelectionPosition, 
      /* end */ SelectionPosition, 
      /* text */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onValidate: js.UndefOr[
    js.Function1[
      /* json */ js.Any, 
      js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]
    ]
  ] = js.undefined
  var schema: js.UndefOr[js.Object] = js.undefined
  var schemaRefs: js.UndefOr[js.Object] = js.undefined
  /**
    * @default true
    */
  var search: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    */
  var sortObjectKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    */
  var statusBar: js.UndefOr[scala.Boolean] = js.undefined
  var templates: js.UndefOr[js.Array[Template]] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default true
    */
  var timestampTag: js.UndefOr[scala.Boolean] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply(
    ace: aceLib.AceAjaxNs.Ace = null,
    ajv: ajvLib.ajvMod.ajvNs.Ajv = null,
    autocomplete: AutoCompleteOptions = null,
    colorPicker: js.UndefOr[scala.Boolean] = js.undefined,
    enableSort: js.UndefOr[scala.Boolean] = js.undefined,
    enableTransform: js.UndefOr[scala.Boolean] = js.undefined,
    escapeUnicode: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    indentation: scala.Int | scala.Double = null,
    language: java.lang.String = null,
    languages: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = null,
    mainMenuBar: js.UndefOr[scala.Boolean] = js.undefined,
    maxVisibleChilds: scala.Int | scala.Double = null,
    modalAnchor: stdLib.HTMLElement = null,
    mode: JSONEditorMode = null,
    modes: js.Array[JSONEditorMode] = null,
    name: java.lang.String = null,
    navigationBar: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function0[scala.Unit] = null,
    onChangeJSON: js.Function1[/* json */ js.Any, scala.Unit] = null,
    onChangeText: js.Function1[/* jsonString */ java.lang.String, scala.Unit] = null,
    onColorPicker: js.Function3[
      /* parent */ stdLib.HTMLElement, 
      /* color */ java.lang.String, 
      /* onChange */ js.Function1[/* color */ Color, scala.Unit], 
      scala.Unit
    ] = null,
    onEditable: js.Function1[/* node */ Node, scala.Boolean | jsoneditorLib.Anon_Field] = null,
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    onEvent: js.Function2[/* node */ Node, /* event */ java.lang.String, scala.Unit] = null,
    onModeChange: js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, scala.Unit] = null,
    onNodeName: js.Function1[/* nodeName */ NodeName, js.UndefOr[java.lang.String]] = null,
    onSelectionChange: js.Function2[/* start */ SerializableNode, /* end */ SerializableNode, scala.Unit] = null,
    onTextSelectionChange: js.Function3[
      /* start */ SelectionPosition, 
      /* end */ SelectionPosition, 
      /* text */ java.lang.String, 
      scala.Unit
    ] = null,
    onValidate: js.Function1[
      /* json */ js.Any, 
      js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]
    ] = null,
    schema: js.Object = null,
    schemaRefs: js.Object = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    sortObjectKeys: js.UndefOr[scala.Boolean] = js.undefined,
    statusBar: js.UndefOr[scala.Boolean] = js.undefined,
    templates: js.Array[Template] = null,
    theme: java.lang.String = null,
    timestampTag: js.UndefOr[scala.Boolean] = js.undefined
  ): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (ace != null) __obj.updateDynamic("ace")(ace)
    if (ajv != null) __obj.updateDynamic("ajv")(ajv)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (!js.isUndefined(colorPicker)) __obj.updateDynamic("colorPicker")(colorPicker)
    if (!js.isUndefined(enableSort)) __obj.updateDynamic("enableSort")(enableSort)
    if (!js.isUndefined(enableTransform)) __obj.updateDynamic("enableTransform")(enableTransform)
    if (!js.isUndefined(escapeUnicode)) __obj.updateDynamic("escapeUnicode")(escapeUnicode)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (!js.isUndefined(mainMenuBar)) __obj.updateDynamic("mainMenuBar")(mainMenuBar)
    if (maxVisibleChilds != null) __obj.updateDynamic("maxVisibleChilds")(maxVisibleChilds.asInstanceOf[js.Any])
    if (modalAnchor != null) __obj.updateDynamic("modalAnchor")(modalAnchor)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (modes != null) __obj.updateDynamic("modes")(modes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigationBar)) __obj.updateDynamic("navigationBar")(navigationBar)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeJSON != null) __obj.updateDynamic("onChangeJSON")(onChangeJSON)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText)
    if (onColorPicker != null) __obj.updateDynamic("onColorPicker")(onColorPicker)
    if (onEditable != null) __obj.updateDynamic("onEditable")(onEditable)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onEvent != null) __obj.updateDynamic("onEvent")(onEvent)
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(onModeChange)
    if (onNodeName != null) __obj.updateDynamic("onNodeName")(onNodeName)
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(onSelectionChange)
    if (onTextSelectionChange != null) __obj.updateDynamic("onTextSelectionChange")(onTextSelectionChange)
    if (onValidate != null) __obj.updateDynamic("onValidate")(onValidate)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaRefs != null) __obj.updateDynamic("schemaRefs")(schemaRefs)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(sortObjectKeys)) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys)
    if (!js.isUndefined(statusBar)) __obj.updateDynamic("statusBar")(statusBar)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(timestampTag)) __obj.updateDynamic("timestampTag")(timestampTag)
    __obj.asInstanceOf[JSONEditorOptions]
  }
}

