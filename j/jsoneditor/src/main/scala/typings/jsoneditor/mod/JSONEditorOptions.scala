package typings.jsoneditor.mod

import typings.ace.AceAjax.Ace
import typings.ajv.mod.Ajv
import typings.jsoneditor.anon.PartialRecordTranslationK
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorOptions extends StObject {
  
  /**
    * Provide a custom version of the Ace editor and use this instead of the version that comes embedded with JSONEditor. Only applicable when mode is `code`.
    *
    * Note that when using the minimalist version of JSONEditor (which has Ace excluded), JSONEditor will try to load the Ace plugins `ace/mode/json` and `ace/ext/searchbox`.
    * These plugins must be loaded beforehand or be available in the folder of the Ace editor.
    */
  var ace: js.UndefOr[Ace] = js.undefined
  
  /**
    * Provide a custom instance of [ajv](https://github.com/epoberezkin/ajv), the library used for JSON schema validation.
    * @example { ajv: Ajv({ allErrors: true, verbose: true }) }
    */
  var ajv: js.UndefOr[Ajv] = js.undefined
  
  /**
    * When enabled and schema is configured, the editor will suggest text completions based on the schema properties, examples and enums.
    * - Limitation: the completions will be presented only for a valid json.
    * - Only applicable when mode is `code`.
    * @default false
    */
  var allowSchemaSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Providing this will enable this feature in your editor in `tree` mode.
    */
  var autocomplete: js.UndefOr[AutoCompleteOptions] = js.undefined
  
  /**
    * When true, values containing a color name or color code will have a color picker rendered on their left side.
    * @default true
    */
  var colorPicker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Create a query string based on query options filled in the Transform Wizard in the Transform modal. Normally used in combination with `executeQuery`.
    * The input for the function are the entered query options and the current JSON, and the output must be a string containing the query.
    * This query will be executed using `executeQuery`. Note that there is a special case '@' for filter.field and sort.field.
    * It means that the field itself is selected, for example when having an array containing numbers.
    */
  var createQuery: js.UndefOr[js.Function2[/* json */ Any, /* queryOptions */ QueryOptions, String]] = js.undefined
  
  /**
    * Enable sorting of arrays and object properties. Only applicable for mode `tree`.
    * @default true
    */
  var enableSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable filtering, sorting, and transforming JSON using a {@link https://jmespath.org/|JMESPath} query. Only applicable for mode `tree`.
    * @default true
    */
  var enableTransform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, unicode characters are escaped and displayed as their hexadecimal code (like \\u260E) instead of of the character itself (like ☎).
    * @default false
    */
  var escapeUnicode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replace the build-in query language used in the Transform modal with a custom language. Normally used in combination with `createQuery`.
    * The input for the function is the current JSON and a query string, and output must be the transformed JSON.
    */
  var executeQuery: js.UndefOr[js.Function2[/* json */ Any, /* query */ String, Any]] = js.undefined
  
  /**
    * Enables history, adds a button Undo and Redo to the menu of the JSONEditor. Only applicable when mode is `tree`, `form`, or `preview`.
    * @default true
    */
  var history: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of indentation spaces. Only applicable when mode is `code`, `text`, or `preview`.
    * @default 2
    */
  var indentation: js.UndefOr[Double] = js.undefined
  
  /**
    * The default language comes from the browser navigator, but you can force a specific language. So use here string as 'en' or 'pt-BR'.
    * Built-in languages: 'en', 'pt-BR', 'zh-CN', 'tr', 'ja', 'fr-FR'. Other translations can be specified via the option `languages`.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * You can override existing translations or provide a new translation for a specific language. To do it provide an object at languages with language and the keys/values to be inserted.
    * All available fields for translation can be found in the source file `src/js/i18n.js`.
    * @example { 'pt-BR': { 'auto': 'Automático testing' }, 'en': { 'auto': 'Auto testing' } }
    */
  var languages: js.UndefOr[Record[String, PartialRecordTranslationK]] = js.undefined
  
  /**
    * If false, nodes can be dragged from any parent node to any other parent node. If true, nodes can only be dragged inside the same parent node, which effectively only allows reordering of nodes.
    * By default, limitDragging is true when no JSON schema is defined, and false otherwise.
    */
  var limitDragging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds main menu bar. Contains format, sort, transform, search etc. functionality. Applicable in all modes.
    * @default true
    */
  var mainMenuBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of children allowed for a given node before the 'show more/show all' message appears (in `tree`, `view`, or `form` modes).
    * @default 100
    */
  var maxVisibleChilds: js.UndefOr[Double] = js.undefined
  
  /**
    * The container element where modals (like for sorting and filtering) are attached:
    * an overlay will be created on top of this container, and the modal will be created in the center of this container.
    */
  var modalAnchor: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * Set the editor mode. Available values: `tree`, `view`, `form`, `code`, `text`, `preview`.
    * In `view` mode, the data and datastructure is readonly. In `form` mode, only the value can be changed, the data structure is readonly.
    * Mode `code` requires the Ace editor to be loaded on the page. Mode `text` shows the data as plain text.
    * The `preview` mode can handle large JSON documents up to 500 MiB. It shows a preview of the data, and allows to transform, sort, filter, format, or compact the data.
    * @default 'tree'
    */
  var mode: js.UndefOr[JSONEditorMode] = js.undefined
  
  /**
    * Create a box in the editor menu where the user can switch between the specified modes.
    * @see mode for configuration
    */
  var modes: js.UndefOr[js.Array[JSONEditorMode]] = js.undefined
  
  /**
    * Initial field name for the root node. Can also be set using `setName(name)`. Only applicable when mode is `tree`, `view`, or `form`.
    * @default undefined
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Adds navigation bar to the menu. The navigation bar visualizes the current position on the tree structure as well as allows breadcrumbs navigation.
    * Only applicable when mode is `tree`, `form` or `view`.
    * @default true
    */
  var navigationBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback method, triggered when the editor goes out of focus
    */
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, js.UndefOr[Unit]]] = js.undefined
  
  /**
    * Set a callback function triggered when the contents of the JSONEditor change.
    * This callback does not pass the changed contents, use `get()` or `getText()` for that.
    * Note that `get()` can throw an exception in mode `text`, `code`, or `preview`, when the editor contains invalid JSON.
    * Will only be triggered on changes made by the user, not in case of programmatic changes via the functions `set`, `setText`, `update`, or `updateText`.
    * See also callback functions `onChangeJSON(json)` and `onChangeText(jsonString)`.
    */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Set a callback function triggered when the contents of the JSONEditor change.
    * Passes the changed JSON document. Only applicable when option mode is `tree`, `form`, or `view`.
    * The callback will only be triggered on changes made by the user, not in case of programmatic changes via the functions `set`, `setText`, `update`, or `updateText`.
    * @see onChangeText for more details
    */
  var onChangeJSON: js.UndefOr[js.Function1[/* json */ Any, Unit]] = js.undefined
  
  /**
    * Set a callback function triggered when the contents of the JSONEditor change.
    * Passes the changed JSON document as a string.
    * The callback will only be triggered on changes made by the user, not in case of programmatic changes via the functions `set`, `setText`, `update`, or `updateText`.
    * @see onChangeJSON for more details
    */
  var onChangeText: js.UndefOr[js.Function1[/* jsonString */ String, Unit]] = js.undefined
  
  /**
    * Set a callback function to add custom CSS classes to the rendered nodes.
    * Only applicable when option mode is `tree`, `form`, or `view`.
    * The function must either return a string containing CSS class names, or return undefined in order to do nothing for a specific node.
    * In order to update css classes when they depend on external state, you can call `editor.refresh()`.
    */
  var onClassName: js.UndefOr[js.Function1[/* classNameParams */ OnClassNameParams, js.UndefOr[String]]] = js.undefined
  
  /**
    * Callback function triggered when the user clicks a color. Can be used to implement a custom color picker.
    * @param parent An HTML element where the color picker can be attached. JSONEditor comes with a built-in color picker,
    * powered by {@link https://github.com/Sphinxxxx/vanilla-picker|vanilla-picker}.
    * @param color The current color.
    * @param onChange A callback which has to be invoked with the new color selected in the color picker.
    */
  var onColorPicker: js.UndefOr[
    js.Function3[
      /* parent */ HTMLElement, 
      /* color */ String, 
      /* onChange */ js.Function1[/* color */ Color, Unit], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Set a callback function to customize the context menu in tree mode. Each time the user clicks on the context menu button, an array of menu items is created.
    * If this callback is configured, the array with menu items is passed to this function. The menu items can be customized in this function in any aspect of these menu items,
    * including deleting them and/or adding new items. The function should return the final array of menu items to be displayed to the user.
    * Each menu item is represented by an object, which may also contain a submenu array of items.
    */
  var onCreateMenu: js.UndefOr[
    js.Function2[/* menuItems */ js.Array[MenuItem], /* node */ MenuItemNode, js.Array[MenuItem]]
  ] = js.undefined
  
  /**
    * Set a callback function to determine whether individual nodes are editable or readonly.
    * Only applicable when option mode is `tree`, `text`, or `code`.
    * In case of mode `tree`, the callback is invoked as `editable(node)`, where the first parameter is a `Node`.
    * The function must either return a boolean value to set both the nodes field and value editable or readonly,
    * or return `{ field: boolean; value: boolean }` to set the readonly attribute for field and value individually.
    * In modes `text` and `code`, the callback is invoked as `editable(node)` where node is an empty object (no field, value, or path).
    * In that case the function can return false to make the text or code editor completely readonly.
    */
  var onEditable: js.UndefOr[js.Function1[/* node */ EditableNode | js.Object, Boolean | FieldEditable]] = js.undefined
  
  /**
    * Set a callback function triggered when an error occurs.
    * Invoked with the error as first argument. The callback is only invoked
    * for errors triggered by a users action, like switching from `code` mode to `tree` mode
    * or clicking the Format button whilst the editor doesn't contain valid JSON.
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  
  /**
    * Set a callback function that will be triggered when an event will occur in a JSON field or value.
    * Only applicable when mode is `form`, `tree` or `view`.
    * @param node the Node where event has been triggered
    * @param event the event fired
    */
  var onEvent: js.UndefOr[js.Function2[/* node */ EditableNode, /* event */ Event, Unit]] = js.undefined
  
  /**
    * Set a callback function to be invoked when a node is expanded/collapsed (not programtically via APIs).
    * Only applicable when option mode is `tree`, `form`, or `view`.
    */
  var onExpand: js.UndefOr[js.Function1[/* expandParams */ ExpandOptions, js.UndefOr[Unit]]] = js.undefined
  
  /**
    * Callback method, triggered when the editor comes into focus
    */
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, js.UndefOr[Unit]]] = js.undefined
  
  /**
    * Set a callback function triggered right after the mode is changed by the user.
    * Only applicable when the mode can be changed by the user (i.e. when option modes is set).
    */
  var onModeChange: js.UndefOr[js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, Unit]] = js.undefined
  
  /**
    * Customize the name of object and array nodes. By default the names are brackets with the number of children inside, like {5} and [32].
    * The number inside can be customized. using onNodeName. The onNodeName function should return a string containing the name for the node.
    * If nothing is returned, the size (number of children) will be displayed.
    */
  var onNodeName: js.UndefOr[js.Function1[/* nodeName */ OnNodeNameParams, js.UndefOr[String]]] = js.undefined
  
  /**
    * Set a callback function triggered when Nodes are selected in the JSONEditor.
    * Only applicable when mode is `tree`.
    * @param start
    * @param end
    */
  var onSelectionChange: js.UndefOr[js.Function2[/* start */ SerializableNode, /* end */ SerializableNode, Unit]] = js.undefined
  
  /**
    * Set a callback function triggered when a text is selected in the JSONEditor.
    * Only applicable when mode is `code` or `text`.
    * @param start Selection start position
    * @param end Selected end position
    * @param text selected text
    */
  var onTextSelectionChange: js.UndefOr[
    js.Function3[/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String, Unit]
  ] = js.undefined
  
  /**
    * Set a callback function for custom validation. Available in all modes.
    * On a change of the JSON, the callback function is invoked with the changed data.
    * The function should return an array with errors or null if there are no errors.
    * The function can also return a Promise resolving with the errors retrieved via an asynchronous validation (like sending a request to a server for validation).
    * @see schema for JSON schema validation.
    */
  var onValidate: js.UndefOr[
    js.Function1[/* json */ Any, js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]]
  ] = js.undefined
  
  /**
    * Set a callback function for validation and parse errors. Available in all modes.
    * On validation of the json, if errors of any kind were found this callback is invoked with the errors data.
    * On change, the callback will be invoked only if errors were changed.
    * @param errors validation errors
    */
  var onValidationError: js.UndefOr[js.Function1[/* errors */ js.Array[SchemaValidationError | ParseError], Unit]] = js.undefined
  
  /**
    * The container element where popups (for example drop down menus, for JSON Schema error tooltips, and color pickers) will be absolutely positioned.
    * By default, this is the root `div` element of the editor itself. When the JSONEditor is inside a `div` element which hides overflowing contents (CSS overflow: auto or overflow: hidden),
    * tooltips will be visible only partly.
    * In this case, a popupAnchor outside of the element without hidden overflow will allow the tooltips to be visible when overflowing the `div` element of the JSONEditor.
    */
  var popupAnchor: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * A text description displayed on top of the Transform modal. Can be used to explain a custom query language implemented via `createQuery` and `executeQuery`.
    * The text can contain HTML code like a link to a web page.
    */
  var queryDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Validate the JSON object against a JSON schema. A JSON schema describes the structure that a JSON object must have, like required properties or the type that a value must have.
    * @see onValidate for custom validation.
    * @see http://json-schema.org/
    */
  var schema: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Schemas that are referenced using the `$ref` property from the JSON schema that are set in the schema option, the object structure in the form of `{ reference_key: schemaObject }`.
    */
  var schemaRefs: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Enables a search box in the upper right corner of the JSONEditor. Only applicable when mode is `tree`, `view`, or `form`.
    * @default true
    */
  var search: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, object keys in `tree`, `view` or `form` mode will be listed alphabetically instead by their insertion order.
    * Sorting is performed using a natural sort algorithm, which makes it easier to see objects that have string numbers as keys.
    * @default false
    */
  var sortObjectKeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds status bar to the bottom of the editor. The status bar shows the cursor position and a count of the selected characters.
    * Only applicable when mode is `code`, `text`, or `preview`.
    * @default true
    */
  var statusBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of templates that will appear in the context menu, Each template is a json object precreated that can be added as a object value to any node in your document.
    */
  var templates: js.UndefOr[js.Array[Template]] = js.undefined
  
  /**
    * Set the Ace editor theme. Please note that only the default theme is included with JSONEditor, so if you specify another one you need to make sure it is loaded.
    * @default 'ace/theme/jsoneditor'
    */
  var theme: js.UndefOr[String] = js.undefined
  
  /**
    * Customizing the way formating the timestamp. Called when a value is timestamp after timestampTag. If it returns null, the timestamp would be formatted with default setting.
    * Only applicable for modes `tree`, `form`, and `view`.
    * @default value => new Date(value).toISOString()
    */
  var timestampFormat: js.UndefOr[js.Function1[/* node */ TimestampNode, String | Null]] = js.undefined
  
  /**
    * By default (true), a tag with the date/time of a timestamp is displayed right from values containing a timestamp.
    * By default, a value is considered a timestamp when it is an integer number with a value larger than Jan 1th 2000, 946684800000.
    * When timestampTag a is a function, a timestamp tag will be displayed when this function returns true, and no timestamp is displayed when the function returns false.
    * When the function returns a non-boolean value like null or undefined, JSONEditor will fallback on the built-in rules to determine whether or not to show a timestamp.
    * Whether a value is a timestamp can be determined implicitly based on the value, or explicitly based on field or path.
    * You can for example test whether a field name contains a string like: 'date' or 'time'.
    * Only applicable for modes `tree`, `form`, and `view`.
    * @default true
    * @example ({ field, value, path }) => field === 'dateCreated'
    */
  var timestampTag: js.UndefOr[Boolean | (js.Function1[/* node */ TimestampNode, Boolean])] = js.undefined
}
object JSONEditorOptions {
  
  inline def apply(): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setAce(value: Ace): Self = StObject.set(x, "ace", value.asInstanceOf[js.Any])
    
    inline def setAceUndefined: Self = StObject.set(x, "ace", js.undefined)
    
    inline def setAjv(value: Ajv): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
    
    inline def setAjvUndefined: Self = StObject.set(x, "ajv", js.undefined)
    
    inline def setAllowSchemaSuggestions(value: Boolean): Self = StObject.set(x, "allowSchemaSuggestions", value.asInstanceOf[js.Any])
    
    inline def setAllowSchemaSuggestionsUndefined: Self = StObject.set(x, "allowSchemaSuggestions", js.undefined)
    
    inline def setAutocomplete(value: AutoCompleteOptions): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setColorPicker(value: Boolean): Self = StObject.set(x, "colorPicker", value.asInstanceOf[js.Any])
    
    inline def setColorPickerUndefined: Self = StObject.set(x, "colorPicker", js.undefined)
    
    inline def setCreateQuery(value: (/* json */ Any, /* queryOptions */ QueryOptions) => String): Self = StObject.set(x, "createQuery", js.Any.fromFunction2(value))
    
    inline def setCreateQueryUndefined: Self = StObject.set(x, "createQuery", js.undefined)
    
    inline def setEnableSort(value: Boolean): Self = StObject.set(x, "enableSort", value.asInstanceOf[js.Any])
    
    inline def setEnableSortUndefined: Self = StObject.set(x, "enableSort", js.undefined)
    
    inline def setEnableTransform(value: Boolean): Self = StObject.set(x, "enableTransform", value.asInstanceOf[js.Any])
    
    inline def setEnableTransformUndefined: Self = StObject.set(x, "enableTransform", js.undefined)
    
    inline def setEscapeUnicode(value: Boolean): Self = StObject.set(x, "escapeUnicode", value.asInstanceOf[js.Any])
    
    inline def setEscapeUnicodeUndefined: Self = StObject.set(x, "escapeUnicode", js.undefined)
    
    inline def setExecuteQuery(value: (/* json */ Any, /* query */ String) => Any): Self = StObject.set(x, "executeQuery", js.Any.fromFunction2(value))
    
    inline def setExecuteQueryUndefined: Self = StObject.set(x, "executeQuery", js.undefined)
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguages(value: Record[String, PartialRecordTranslationK]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLimitDragging(value: Boolean): Self = StObject.set(x, "limitDragging", value.asInstanceOf[js.Any])
    
    inline def setLimitDraggingUndefined: Self = StObject.set(x, "limitDragging", js.undefined)
    
    inline def setMainMenuBar(value: Boolean): Self = StObject.set(x, "mainMenuBar", value.asInstanceOf[js.Any])
    
    inline def setMainMenuBarUndefined: Self = StObject.set(x, "mainMenuBar", js.undefined)
    
    inline def setMaxVisibleChilds(value: Double): Self = StObject.set(x, "maxVisibleChilds", value.asInstanceOf[js.Any])
    
    inline def setMaxVisibleChildsUndefined: Self = StObject.set(x, "maxVisibleChilds", js.undefined)
    
    inline def setModalAnchor(value: HTMLElement): Self = StObject.set(x, "modalAnchor", value.asInstanceOf[js.Any])
    
    inline def setModalAnchorUndefined: Self = StObject.set(x, "modalAnchor", js.undefined)
    
    inline def setMode(value: JSONEditorMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModes(value: js.Array[JSONEditorMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: JSONEditorMode*): Self = StObject.set(x, "modes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigationBar(value: Boolean): Self = StObject.set(x, "navigationBar", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarUndefined: Self = StObject.set(x, "navigationBar", js.undefined)
    
    inline def setOnBlur(value: /* event */ Event => js.UndefOr[Unit]): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnChangeJSON(value: /* json */ Any => Unit): Self = StObject.set(x, "onChangeJSON", js.Any.fromFunction1(value))
    
    inline def setOnChangeJSONUndefined: Self = StObject.set(x, "onChangeJSON", js.undefined)
    
    inline def setOnChangeText(value: /* jsonString */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClassName(value: /* classNameParams */ OnClassNameParams => js.UndefOr[String]): Self = StObject.set(x, "onClassName", js.Any.fromFunction1(value))
    
    inline def setOnClassNameUndefined: Self = StObject.set(x, "onClassName", js.undefined)
    
    inline def setOnColorPicker(
      value: (/* parent */ HTMLElement, /* color */ String, /* onChange */ js.Function1[/* color */ Color, Unit]) => Unit
    ): Self = StObject.set(x, "onColorPicker", js.Any.fromFunction3(value))
    
    inline def setOnColorPickerUndefined: Self = StObject.set(x, "onColorPicker", js.undefined)
    
    inline def setOnCreateMenu(value: (/* menuItems */ js.Array[MenuItem], /* node */ MenuItemNode) => js.Array[MenuItem]): Self = StObject.set(x, "onCreateMenu", js.Any.fromFunction2(value))
    
    inline def setOnCreateMenuUndefined: Self = StObject.set(x, "onCreateMenu", js.undefined)
    
    inline def setOnEditable(value: /* node */ EditableNode | js.Object => Boolean | FieldEditable): Self = StObject.set(x, "onEditable", js.Any.fromFunction1(value))
    
    inline def setOnEditableUndefined: Self = StObject.set(x, "onEditable", js.undefined)
    
    inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnEvent(value: (/* node */ EditableNode, /* event */ Event) => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExpand(value: /* expandParams */ ExpandOptions => js.UndefOr[Unit]): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnFocus(value: /* event */ Event => js.UndefOr[Unit]): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnModeChange(value: (/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode) => Unit): Self = StObject.set(x, "onModeChange", js.Any.fromFunction2(value))
    
    inline def setOnModeChangeUndefined: Self = StObject.set(x, "onModeChange", js.undefined)
    
    inline def setOnNodeName(value: /* nodeName */ OnNodeNameParams => js.UndefOr[String]): Self = StObject.set(x, "onNodeName", js.Any.fromFunction1(value))
    
    inline def setOnNodeNameUndefined: Self = StObject.set(x, "onNodeName", js.undefined)
    
    inline def setOnSelectionChange(value: (/* start */ SerializableNode, /* end */ SerializableNode) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
    
    inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    inline def setOnTextSelectionChange(value: (/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String) => Unit): Self = StObject.set(x, "onTextSelectionChange", js.Any.fromFunction3(value))
    
    inline def setOnTextSelectionChangeUndefined: Self = StObject.set(x, "onTextSelectionChange", js.undefined)
    
    inline def setOnValidate(value: /* json */ Any => js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]): Self = StObject.set(x, "onValidate", js.Any.fromFunction1(value))
    
    inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
    
    inline def setOnValidationError(value: /* errors */ js.Array[SchemaValidationError | ParseError] => Unit): Self = StObject.set(x, "onValidationError", js.Any.fromFunction1(value))
    
    inline def setOnValidationErrorUndefined: Self = StObject.set(x, "onValidationError", js.undefined)
    
    inline def setPopupAnchor(value: HTMLElement): Self = StObject.set(x, "popupAnchor", value.asInstanceOf[js.Any])
    
    inline def setPopupAnchorUndefined: Self = StObject.set(x, "popupAnchor", js.undefined)
    
    inline def setQueryDescription(value: String): Self = StObject.set(x, "queryDescription", value.asInstanceOf[js.Any])
    
    inline def setQueryDescriptionUndefined: Self = StObject.set(x, "queryDescription", js.undefined)
    
    inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaRefs(value: js.Object): Self = StObject.set(x, "schemaRefs", value.asInstanceOf[js.Any])
    
    inline def setSchemaRefsUndefined: Self = StObject.set(x, "schemaRefs", js.undefined)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSortObjectKeys(value: Boolean): Self = StObject.set(x, "sortObjectKeys", value.asInstanceOf[js.Any])
    
    inline def setSortObjectKeysUndefined: Self = StObject.set(x, "sortObjectKeys", js.undefined)
    
    inline def setStatusBar(value: Boolean): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    
    inline def setTemplates(value: js.Array[Template]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: Template*): Self = StObject.set(x, "templates", js.Array(value*))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTimestampFormat(value: /* node */ TimestampNode => String | Null): Self = StObject.set(x, "timestampFormat", js.Any.fromFunction1(value))
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    
    inline def setTimestampTag(value: Boolean | (js.Function1[/* node */ TimestampNode, Boolean])): Self = StObject.set(x, "timestampTag", value.asInstanceOf[js.Any])
    
    inline def setTimestampTagFunction1(value: /* node */ TimestampNode => Boolean): Self = StObject.set(x, "timestampTag", js.Any.fromFunction1(value))
    
    inline def setTimestampTagUndefined: Self = StObject.set(x, "timestampTag", js.undefined)
  }
}
