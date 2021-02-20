package typings.jsYaml

import org.scalablytyped.runtime.StringDictionary
import typings.jsYaml.jsYamlStrings.mapping
import typings.jsYaml.jsYamlStrings.scalar
import typings.jsYaml.jsYamlStrings.sequence
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-yaml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-yaml", "CORE_SCHEMA")
  @js.native
  def CORE_SCHEMA: Schema = js.native
  @scala.inline
  def CORE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "DEFAULT_FULL_SCHEMA")
  @js.native
  def DEFAULT_FULL_SCHEMA: Schema = js.native
  @scala.inline
  def DEFAULT_FULL_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FULL_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "DEFAULT_SAFE_SCHEMA")
  @js.native
  def DEFAULT_SAFE_SCHEMA: Schema = js.native
  @scala.inline
  def DEFAULT_SAFE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SAFE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "FAILSAFE_SCHEMA")
  @js.native
  def FAILSAFE_SCHEMA: Schema = js.native
  @scala.inline
  def FAILSAFE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILSAFE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "JSON_SCHEMA")
  @js.native
  def JSON_SCHEMA: Schema = js.native
  @scala.inline
  def JSON_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "MINIMAL_SCHEMA")
  @js.native
  def MINIMAL_SCHEMA: Schema = js.native
  @scala.inline
  def MINIMAL_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINIMAL_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "SAFE_SCHEMA")
  @js.native
  def SAFE_SCHEMA: Schema = js.native
  @scala.inline
  def SAFE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAFE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "Schema")
  @js.native
  class Schema protected () extends SchemaDefinition {
    def this(definition: SchemaDefinition) = this()
  }
  /* static members */
  object Schema {
    
    @JSImport("js-yaml", "Schema.create")
    @js.native
    def create(schemas: js.Array[Schema], types: js.Array[Type]): Schema = js.native
    @JSImport("js-yaml", "Schema.create")
    @js.native
    def create(schemas: js.Array[Schema], types: Type): Schema = js.native
    @JSImport("js-yaml", "Schema.create")
    @js.native
    def create(schemas: Schema, types: js.Array[Type]): Schema = js.native
    @JSImport("js-yaml", "Schema.create")
    @js.native
    def create(schemas: Schema, types: Type): Schema = js.native
    @JSImport("js-yaml", "Schema.create")
    @js.native
    def create(types: js.Array[Type]): Schema = js.native
    @JSImport("js-yaml", "Schema.create")
    @js.native
    def create(types: Type): Schema = js.native
  }
  
  @JSImport("js-yaml", "Type")
  @js.native
  class Type protected () extends StObject {
    def this(tag: String) = this()
    def this(tag: String, opts: TypeConstructorOptions) = this()
    
    def construct(data: js.Any): js.Any = js.native
    
    var defaultStyle: String | Null = js.native
    
    var instanceOf: js.Object | Null = js.native
    
    var kind: sequence | scalar | mapping | Null = js.native
    
    var predicate: (js.Function1[/* data */ js.Object, Boolean]) | Null = js.native
    
    var represent: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]]) | Null = js.native
    
    def resolve(data: js.Any): Boolean = js.native
    
    var styleAliases: StringDictionary[js.Any] = js.native
  }
  
  @JSImport("js-yaml", "YAMLException")
  @js.native
  class YAMLException () extends Error {
    def this(reason: js.Any) = this()
    def this(reason: js.UndefOr[scala.Nothing], mark: js.Any) = this()
    def this(reason: js.Any, mark: js.Any) = this()
    
    def toString(compact: Boolean): String = js.native
  }
  
  @JSImport("js-yaml", "dump")
  @js.native
  def dump(obj: js.Any): String = js.native
  @JSImport("js-yaml", "dump")
  @js.native
  def dump(obj: js.Any, opts: DumpOptions): String = js.native
  
  @JSImport("js-yaml", "load")
  @js.native
  def load(str: String): js.Any = js.native
  @JSImport("js-yaml", "load")
  @js.native
  def load(str: String, opts: LoadOptions): js.Any = js.native
  
  @JSImport("js-yaml", "loadAll")
  @js.native
  def loadAll(str: String): js.Array[_] = js.native
  @JSImport("js-yaml", "loadAll")
  @js.native
  def loadAll(str: String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  @JSImport("js-yaml", "loadAll")
  @js.native
  def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  @JSImport("js-yaml", "loadAll")
  @js.native
  def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = js.native
  @JSImport("js-yaml", "loadAll")
  @js.native
  def loadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[_] = js.native
  
  @JSImport("js-yaml", "safeDump")
  @js.native
  def safeDump(obj: js.Any): String = js.native
  @JSImport("js-yaml", "safeDump")
  @js.native
  def safeDump(obj: js.Any, opts: DumpOptions): String = js.native
  
  @JSImport("js-yaml", "safeLoad")
  @js.native
  def safeLoad(str: String): js.UndefOr[String | js.Object] = js.native
  @JSImport("js-yaml", "safeLoad")
  @js.native
  def safeLoad(str: String, opts: LoadOptions): js.UndefOr[String | js.Object] = js.native
  
  @JSImport("js-yaml", "safeLoadAll")
  @js.native
  def safeLoadAll(str: String): js.Array[_] = js.native
  @JSImport("js-yaml", "safeLoadAll")
  @js.native
  def safeLoadAll(str: String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  @JSImport("js-yaml", "safeLoadAll")
  @js.native
  def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  @JSImport("js-yaml", "safeLoadAll")
  @js.native
  def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = js.native
  @JSImport("js-yaml", "safeLoadAll")
  @js.native
  def safeLoadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[_] = js.native
  
  @js.native
  trait DumpOptions extends StObject {
    
    /**
      * if true flow sequences will be condensed, omitting the space between `key: value` or `a, b`. Eg. `'[a,b]'` or `{a:{b:c}}`.
      * Can be useful when using yaml for pretty URL query params as spaces are %-encoded. (default: false).
      */
    var condenseFlow: js.UndefOr[Boolean] = js.native
    
    /** specifies level of nesting, when to switch from block to flow style for collections. -1 means block style everwhere */
    var flowLevel: js.UndefOr[Double] = js.native
    
    /** indentation width to use (in spaces). */
    var indent: js.UndefOr[Double] = js.native
    
    /** set max line width. (default: 80) */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /** when true, will not add an indentation level to array elements */
    var noArrayIndent: js.UndefOr[Boolean] = js.native
    
    /** if true don't try to be compatible with older yaml versions. Currently: don't quote "yes", "no" and so on, as required for YAML 1.1 (default: false) */
    var noCompatMode: js.UndefOr[Boolean] = js.native
    
    /** if true, don't convert duplicate objects into references (default: false) */
    var noRefs: js.UndefOr[Boolean] = js.native
    
    /** specifies a schema to use. */
    var schema: js.UndefOr[SchemaDefinition] = js.native
    
    /** do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types. */
    var skipInvalid: js.UndefOr[Boolean] = js.native
    
    /** if true, sort keys when dumping YAML. If a function, use the function to sort the keys. (default: false) */
    var sortKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
    
    /** Each tag may have own set of styles.    - "tag" => "style" map. */
    var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object DumpOptions {
    
    @scala.inline
    def apply(): DumpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DumpOptions]
    }
    
    @scala.inline
    implicit class DumpOptionsMutableBuilder[Self <: DumpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondenseFlow(value: Boolean): Self = StObject.set(x, "condenseFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCondenseFlowUndefined: Self = StObject.set(x, "condenseFlow", js.undefined)
      
      @scala.inline
      def setFlowLevel(value: Double): Self = StObject.set(x, "flowLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLevelUndefined: Self = StObject.set(x, "flowLevel", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setNoArrayIndent(value: Boolean): Self = StObject.set(x, "noArrayIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoArrayIndentUndefined: Self = StObject.set(x, "noArrayIndent", js.undefined)
      
      @scala.inline
      def setNoCompatMode(value: Boolean): Self = StObject.set(x, "noCompatMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCompatModeUndefined: Self = StObject.set(x, "noCompatMode", js.undefined)
      
      @scala.inline
      def setNoRefs(value: Boolean): Self = StObject.set(x, "noRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRefsUndefined: Self = StObject.set(x, "noRefs", js.undefined)
      
      @scala.inline
      def setSchema(value: SchemaDefinition): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSkipInvalid(value: Boolean): Self = StObject.set(x, "skipInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipInvalidUndefined: Self = StObject.set(x, "skipInvalid", js.undefined)
      
      @scala.inline
      def setSortKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = StObject.set(x, "sortKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sortKeys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortKeysUndefined: Self = StObject.set(x, "sortKeys", js.undefined)
      
      @scala.inline
      def setStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsYaml.jsYamlStrings.open
    - typings.jsYaml.jsYamlStrings.close
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def close: typings.jsYaml.jsYamlStrings.close = "close".asInstanceOf[typings.jsYaml.jsYamlStrings.close]
    
    @scala.inline
    def open: typings.jsYaml.jsYamlStrings.open = "open".asInstanceOf[typings.jsYaml.jsYamlStrings.open]
  }
  
  @js.native
  trait LoadOptions extends StObject {
    
    /** string to be used as a file path in error/warning messages. */
    var filename: js.UndefOr[String] = js.native
    
    /** compatibility with JSON.parse behaviour. */
    var json: js.UndefOr[Boolean] = js.native
    
    /** listener for parse events */
    var listener: js.UndefOr[
        js.ThisFunction2[/* this */ State, /* eventType */ EventType, /* state */ State, Unit]
      ] = js.native
    
    /** function to call on warning messages. */
    var onWarning: js.UndefOr[js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]] = js.native
    
    /** specifies a schema to use. */
    var schema: js.UndefOr[SchemaDefinition] = js.native
  }
  object LoadOptions {
    
    @scala.inline
    def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit class LoadOptionsMutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setListener(value: js.ThisFunction2[/* this */ State, /* eventType */ EventType, /* state */ State, Unit]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      @scala.inline
      def setOnWarning(value: js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
      
      @scala.inline
      def setSchema(value: SchemaDefinition): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  @js.native
  trait SchemaDefinition extends StObject {
    
    var explicit: js.UndefOr[js.Array[Type]] = js.native
    
    var `implicit`: js.UndefOr[js.Array[_]] = js.native
    
    var include: js.UndefOr[js.Array[Schema]] = js.native
  }
  object SchemaDefinition {
    
    @scala.inline
    def apply(): SchemaDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaDefinition]
    }
    
    @scala.inline
    implicit class SchemaDefinitionMutableBuilder[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplicit(value: js.Array[Type]): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      @scala.inline
      def setExplicitVarargs(value: Type*): Self = StObject.set(x, "explicit", js.Array(value :_*))
      
      @scala.inline
      def setImplicit(value: js.Array[_]): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      @scala.inline
      def setImplicitVarargs(value: js.Any*): Self = StObject.set(x, "implicit", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[Schema]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: Schema*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var checkLineBreaks: Boolean = js.native
    
    var filename: String | Null = js.native
    
    var implicitTypes: js.Array[Type] = js.native
    
    var input: String = js.native
    
    var json: Boolean = js.native
    
    var kind: String = js.native
    
    var length: Double = js.native
    
    var line: Double = js.native
    
    var lineIndent: Double = js.native
    
    var lineStart: Double = js.native
    
    def onWarning(e: YAMLException): Unit = js.native
    
    var position: Double = js.native
    
    var result: js.Any = js.native
    
    var schema: SchemaDefinition = js.native
    
    var version: Null | Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      checkLineBreaks: Boolean,
      implicitTypes: js.Array[Type],
      input: String,
      json: Boolean,
      kind: String,
      length: Double,
      line: Double,
      lineIndent: Double,
      lineStart: Double,
      onWarning: YAMLException => Unit,
      position: Double,
      result: js.Any,
      schema: SchemaDefinition
    ): State = {
      val __obj = js.Dynamic.literal(checkLineBreaks = checkLineBreaks.asInstanceOf[js.Any], implicitTypes = implicitTypes.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineIndent = lineIndent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], onWarning = js.Any.fromFunction1(onWarning), position = position.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckLineBreaks(value: Boolean): Self = StObject.set(x, "checkLineBreaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setImplicitTypes(value: js.Array[Type]): Self = StObject.set(x, "implicitTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitTypesVarargs(value: Type*): Self = StObject.set(x, "implicitTypes", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineIndent(value: Double): Self = StObject.set(x, "lineIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWarning(value: YAMLException => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: SchemaDefinition): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
  
  @js.native
  trait TypeConstructorOptions extends StObject {
    
    var construct: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
    
    var defaultStyle: js.UndefOr[String] = js.native
    
    var instanceOf: js.UndefOr[js.Object] = js.native
    
    var kind: js.UndefOr[sequence | scalar | mapping] = js.native
    
    var predicate: js.UndefOr[js.Function1[/* data */ js.Object, Boolean]] = js.native
    
    var represent: js.UndefOr[
        (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
      ] = js.native
    
    var resolve: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.native
    
    var styleAliases: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object TypeConstructorOptions {
    
    @scala.inline
    def apply(): TypeConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeConstructorOptions]
    }
    
    @scala.inline
    implicit class TypeConstructorOptionsMutableBuilder[Self <: TypeConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstruct(value: /* data */ js.Any => _): Self = StObject.set(x, "construct", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: String): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setInstanceOf(value: js.Object): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
      
      @scala.inline
      def setKind(value: sequence | scalar | mapping): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setPredicate(value: /* data */ js.Object => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setRepresent(
        value: (js.Function1[/* data */ js.Object, _]) | (StringDictionary[js.Function1[/* data */ js.Object, _]])
      ): Self = StObject.set(x, "represent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepresentFunction1(value: /* data */ js.Object => _): Self = StObject.set(x, "represent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRepresentUndefined: Self = StObject.set(x, "represent", js.undefined)
      
      @scala.inline
      def setResolve(value: /* data */ js.Any => Boolean): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setStyleAliases(value: StringDictionary[js.Any]): Self = StObject.set(x, "styleAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleAliasesUndefined: Self = StObject.set(x, "styleAliases", js.undefined)
    }
  }
}
