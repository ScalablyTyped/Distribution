package typings.kapPlugin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.electronStore.mod.^
import typings.jsonSchema.mod.JSONSchema7
import typings.jsonSchema.mod.JSONSchema7Definition
import typings.jsonSchema.mod.JSONSchema7Type
import typings.jsonSchema.mod.JSONSchema7TypeName
import typings.jsonSchema.mod.JSONSchema7Version
import typings.kapPlugin.anon.FileType
import typings.kapPlugin.anon.Typeofgot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Pick<json-schema.json-schema.JSONSchema7, std.Exclude<keyof json-schema.json-schema.JSONSchema7, 'required' | 'default'>> & {  required :boolean | undefined,   default :TValue | undefined} */
  trait ConfigSchema[TValue] extends StObject {
    
    var default: js.UndefOr[TValue] = js.undefined
    
    @JSName("$comment")
    var $comment: js.UndefOr[String] = js.undefined
    
    @JSName("$id")
    var $id: js.UndefOr[String] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[JSONSchema7Version] = js.undefined
    
    var additionalItems: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var additionalProperties: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var allOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
    
    var anyOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
    
    var const: js.UndefOr[JSONSchema7Type] = js.undefined
    
    var contains: js.UndefOr[JSONSchema7] = js.undefined
    
    var contentEncoding: js.UndefOr[String] = js.undefined
    
    var contentMediaType: js.UndefOr[String] = js.undefined
    
    var definitions: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[JSONSchema7Definition | js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var `else`: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[JSONSchema7Type]] = js.undefined
    
    var examples: js.UndefOr[JSONSchema7Type] = js.undefined
    
    var exclusiveMaximum: js.UndefOr[Double] = js.undefined
    
    var exclusiveMinimum: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var `if`: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var items: js.UndefOr[JSONSchema7Definition | js.Array[JSONSchema7Definition]] = js.undefined
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxProperties: js.UndefOr[Double] = js.undefined
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var minItems: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var minProperties: js.UndefOr[Double] = js.undefined
    
    var minimum: js.UndefOr[Double] = js.undefined
    
    var multipleOf: js.UndefOr[Double] = js.undefined
    
    var not: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var oneOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var patternProperties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
    
    var propertyNames: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `then`: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[JSONSchema7TypeName | js.Array[JSONSchema7TypeName]] = js.undefined
    
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
    
    var writeOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigSchema {
    
    @scala.inline
    def apply[TValue](): ConfigSchema[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigSchema[TValue]]
    }
    
    @scala.inline
    implicit class ConfigSchemaMutableBuilder[Self <: ConfigSchema[?], TValue] (val x: Self & ConfigSchema[TValue]) extends AnyVal {
      
      @scala.inline
      def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      @scala.inline
      def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def set$schema(value: JSONSchema7Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalItems(value: JSONSchema7Definition): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: JSONSchema7Definition): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setConst(value: JSONSchema7Type): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstNull: Self = StObject.set(x, "const", null)
      
      @scala.inline
      def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      @scala.inline
      def setContains(value: JSONSchema7): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentMediaType(value: String): Self = StObject.set(x, "contentMediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMediaTypeUndefined: Self = StObject.set(x, "contentMediaType", js.undefined)
      
      @scala.inline
      def setDefault(value: TValue): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[JSONSchema7Definition | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setElse(value: JSONSchema7Definition): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[JSONSchema7Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: JSONSchema7Type*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExamples(value: JSONSchema7Type): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesNull: Self = StObject.set(x, "examples", null)
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      @scala.inline
      def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIf(value: JSONSchema7Definition): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      @scala.inline
      def setItems(value: JSONSchema7Definition | js.Array[JSONSchema7Definition]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      @scala.inline
      def setNot(value: JSONSchema7Definition): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOneOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      @scala.inline
      def setOneOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternProperties(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertyNames(value: JSONSchema7Definition): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setThen(value: JSONSchema7Definition): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: JSONSchema7TypeName | js.Array[JSONSchema7TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: JSONSchema7TypeName*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
      
      @scala.inline
      def setWriteOnly(value: Boolean): Self = StObject.set(x, "writeOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteOnlyUndefined: Self = StObject.set(x, "writeOnly", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kapPlugin.kapPluginStrings.gif
    - typings.kapPlugin.kapPluginStrings.mp4
    - typings.kapPlugin.kapPluginStrings.webm
    - typings.kapPlugin.kapPluginStrings.apng
  */
  trait Format extends StObject
  object Format {
    
    @scala.inline
    def apng: typings.kapPlugin.kapPluginStrings.apng = "apng".asInstanceOf[typings.kapPlugin.kapPluginStrings.apng]
    
    @scala.inline
    def gif: typings.kapPlugin.kapPluginStrings.gif = "gif".asInstanceOf[typings.kapPlugin.kapPluginStrings.gif]
    
    @scala.inline
    def mp4: typings.kapPlugin.kapPluginStrings.mp4 = "mp4".asInstanceOf[typings.kapPlugin.kapPluginStrings.mp4]
    
    @scala.inline
    def webm: typings.kapPlugin.kapPluginStrings.webm = "webm".asInstanceOf[typings.kapPlugin.kapPluginStrings.webm]
  }
  
  @js.native
  trait KapContext[T] extends StObject {
    
    /**
      * Indicate that the plugin operation canceled for some reason. This closes
      * the Kap export window. If the cancelation was not the result of a user
      * gesture, use .notify() to inform the user why it was canceled.
      */
    def cancel(): Unit = js.native
    
    /**
      * Get and set config for you plugin. It’s an instance of electron-store.
      */
    var config: ^[T] = js.native
    
    /**
      * Copy text to the clipboard. If you for example copy a link to the
      * uploaded recording to the clipboard, don’t
      * forget to `.notify()` the user about it.
      */
    def copyToClipboard(text: String): Unit = js.native
    
    /**
      * Default file name for the recording. For example: `Kapture 2017-05-30 at 1.03.49.gif`.
      */
    var defaultFileName: String = js.native
    
    /**
      * Convert the screen recording to the user chosen format and return a
      * Promise for the file path. If you want to overwrite the format that the
      * user selected, you can pass a fileType option. This can be useful if
      * you, for example, need to handle the GIF conversion yourself.
      */
    def filePath(): js.Promise[String] = js.native
    def filePath(options: FileType): js.Promise[String] = js.native
    
    /**
      * The file format the user chose in the editor window
      */
    var format: Format = js.native
    
    /**
      * Show a notification. Optionally pass in a function that is called with
      * the event when the notification is clicked.
      */
    def notify(text: String): Unit = js.native
    def notify(text: String, action: js.Function0[Unit]): Unit = js.native
    
    /**
      * Open the plugin config file in the user’s editor.
      */
    def openConfigFile(): Unit = js.native
    
    /**
      * Prettified version of .format for use in notifications.
      * For example: GIF, MP4, WebM, APNG.
      */
    var prettyFormat: String = js.native
    
    /**
      * Do a network request, like uploading. It’s a wrapper around `got`.
      */
    var request: Typeofgot = js.native
    
    /**
      * Update progress information in the Kap export window. Use this whenever
      * you have long-running jobs, like uploading. The percentage should
      * be a number between 0 and 1.
      */
    def setProgress(text: String, percentage: Double): Unit = js.native
    
    /**
      * Returns a Promise that resolves when a deep link for this plugin is
      * opened. The link should be in the format `kap://plugins/{pluginName}/{rest}`,
      * where pluginName is the npm package name and rest is the string the
      * Promise will resolve with. This is useful for [OAuth flows](https://github.com/wulkano/kap/blob/master/docs/plugins.md#oauth).
      */
    def waitForDeepLink(): js.Promise[String] = js.native
  }
  
  trait KapShareService[T] extends StObject {
    
    /**
      * The function that is run when the user clicks the menu item.
      */
    def action(context: KapContext[T]): js.Promise[Unit]
    
    /**
      * Definition of the config the plugins needs. A JSON schema, with the
      * ability to mark properties as `required` individually.
      */
    var config: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? kap-plugin.kap-plugin.ConfigSchema<T[K]>}
      */ typings.kapPlugin.kapPluginStrings.KapShareService & TopLevel[T]
    
    /**
      * A description displayed at the top of the configuration window. You can
      * use this to explain the config options or link to API docs. Any links in
      * this description will be parsed into clickable links automatically.
      */
    var configDescription: String
    
    /**
      * The file formats you support.
      */
    var formats: js.Array[Format]
    
    /**
      * The title used in the export menu. For example: "Share to GIPHY". The
      * text should be in title case, for example, "Save to Disk",
      * not "Save to disk".
      */
    var title: String
  }
  object KapShareService {
    
    @scala.inline
    def apply[T](
      action: KapContext[T] => js.Promise[Unit],
      config: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? kap-plugin.kap-plugin.ConfigSchema<T[K]>}
      */ typings.kapPlugin.kapPluginStrings.KapShareService & TopLevel[T],
      configDescription: String,
      formats: js.Array[Format],
      title: String
    ): KapShareService[T] = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), config = config.asInstanceOf[js.Any], configDescription = configDescription.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[KapShareService[T]]
    }
    
    @scala.inline
    implicit class KapShareServiceMutableBuilder[Self <: KapShareService[?], T] (val x: Self & KapShareService[T]) extends AnyVal {
      
      @scala.inline
      def setAction(value: KapContext[T] => js.Promise[Unit]): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfig(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof T ]:? kap-plugin.kap-plugin.ConfigSchema<T[K]>}
        */ typings.kapPlugin.kapPluginStrings.KapShareService & TopLevel[T]
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigDescription(value: String): Self = StObject.set(x, "configDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormats(value: js.Array[Format]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsVarargs(value: Format*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
