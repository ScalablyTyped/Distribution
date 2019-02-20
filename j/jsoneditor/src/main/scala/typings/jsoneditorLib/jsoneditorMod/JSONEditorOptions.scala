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

