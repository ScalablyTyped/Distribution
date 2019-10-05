package typings.jsoneditor.jsoneditorMod

import org.scalablytyped.runtime.StringDictionary
import typings.ace.AceAjax.Ace
import typings.ajv.ajvMod.Ajv
import typings.jsoneditor.Anon_Field
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions extends js.Object {
  var ace: js.UndefOr[Ace] = js.undefined
  var ajv: js.UndefOr[Ajv] = js.undefined
  var autocomplete: js.UndefOr[AutoCompleteOptions] = js.undefined
  /**
    * @default true
    */
  var colorPicker: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var enableSort: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var enableTransform: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var escapeUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var history: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 2
    */
  var indentation: js.UndefOr[Double] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var languages: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.undefined
  /**
    * @default true
    */
  var mainMenuBar: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 100
    */
  var maxVisibleChilds: js.UndefOr[Double] = js.undefined
  var modalAnchor: js.UndefOr[HTMLElement] = js.undefined
  /**
    * @default 'tree'
    */
  var mode: js.UndefOr[JSONEditorMode] = js.undefined
  var modes: js.UndefOr[js.Array[JSONEditorMode]] = js.undefined
  /**
    * @default undefined
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var navigationBar: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChangeJSON: js.UndefOr[js.Function1[/* json */ js.Any, Unit]] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* jsonString */ String, Unit]] = js.undefined
  var onColorPicker: js.UndefOr[
    js.Function3[
      /* parent */ HTMLElement, 
      /* color */ String, 
      /* onChange */ js.Function1[/* color */ Color, Unit], 
      Unit
    ]
  ] = js.undefined
  var onEditable: js.UndefOr[js.Function1[/* node */ Node, Boolean | Anon_Field]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onEvent: js.UndefOr[js.Function2[/* node */ Node, /* event */ String, Unit]] = js.undefined
  var onModeChange: js.UndefOr[js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, Unit]] = js.undefined
  var onNodeName: js.UndefOr[js.Function1[/* nodeName */ NodeName, js.UndefOr[String]]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function2[/* start */ SerializableNode, /* end */ SerializableNode, Unit]] = js.undefined
  var onTextSelectionChange: js.UndefOr[
    js.Function3[/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String, Unit]
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
  var search: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var sortObjectKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var statusBar: js.UndefOr[Boolean] = js.undefined
  var templates: js.UndefOr[js.Array[Template]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var timestampTag: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply(
    ace: Ace = null,
    ajv: Ajv = null,
    autocomplete: AutoCompleteOptions = null,
    colorPicker: js.UndefOr[Boolean] = js.undefined,
    enableSort: js.UndefOr[Boolean] = js.undefined,
    enableTransform: js.UndefOr[Boolean] = js.undefined,
    escapeUnicode: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    indentation: Int | Double = null,
    language: String = null,
    languages: StringDictionary[StringDictionary[String]] = null,
    mainMenuBar: js.UndefOr[Boolean] = js.undefined,
    maxVisibleChilds: Int | Double = null,
    modalAnchor: HTMLElement = null,
    mode: JSONEditorMode = null,
    modes: js.Array[JSONEditorMode] = null,
    name: String = null,
    navigationBar: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    onChangeJSON: /* json */ js.Any => Unit = null,
    onChangeText: /* jsonString */ String => Unit = null,
    onColorPicker: (/* parent */ HTMLElement, /* color */ String, /* onChange */ js.Function1[/* color */ Color, Unit]) => Unit = null,
    onEditable: /* node */ Node => Boolean | Anon_Field = null,
    onError: /* error */ Error => Unit = null,
    onEvent: (/* node */ Node, /* event */ String) => Unit = null,
    onModeChange: (/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode) => Unit = null,
    onNodeName: /* nodeName */ NodeName => js.UndefOr[String] = null,
    onSelectionChange: (/* start */ SerializableNode, /* end */ SerializableNode) => Unit = null,
    onTextSelectionChange: (/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String) => Unit = null,
    onValidate: /* json */ js.Any => js.Array[ValidationError] | js.Promise[js.Array[ValidationError]] = null,
    schema: js.Object = null,
    schemaRefs: js.Object = null,
    search: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: js.UndefOr[Boolean] = js.undefined,
    statusBar: js.UndefOr[Boolean] = js.undefined,
    templates: js.Array[Template] = null,
    theme: String = null,
    timestampTag: js.UndefOr[Boolean] = js.undefined
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
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (onChangeJSON != null) __obj.updateDynamic("onChangeJSON")(js.Any.fromFunction1(onChangeJSON))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onColorPicker != null) __obj.updateDynamic("onColorPicker")(js.Any.fromFunction3(onColorPicker))
    if (onEditable != null) __obj.updateDynamic("onEditable")(js.Any.fromFunction1(onEditable))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2(onEvent))
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(js.Any.fromFunction2(onModeChange))
    if (onNodeName != null) __obj.updateDynamic("onNodeName")(js.Any.fromFunction1(onNodeName))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2(onSelectionChange))
    if (onTextSelectionChange != null) __obj.updateDynamic("onTextSelectionChange")(js.Any.fromFunction3(onTextSelectionChange))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction1(onValidate))
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

