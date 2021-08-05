package typings.jsYaml

import org.scalablytyped.runtime.StringDictionary
import typings.jsYaml.jsYamlStrings.mapping
import typings.jsYaml.jsYamlStrings.scalar
import typings.jsYaml.jsYamlStrings.sequence
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-yaml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-yaml", "CORE_SCHEMA")
  @js.native
  def CORE_SCHEMA: Schema = js.native
  inline def CORE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "DEFAULT_FULL_SCHEMA")
  @js.native
  def DEFAULT_FULL_SCHEMA: Schema = js.native
  inline def DEFAULT_FULL_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FULL_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "DEFAULT_SAFE_SCHEMA")
  @js.native
  def DEFAULT_SAFE_SCHEMA: Schema = js.native
  inline def DEFAULT_SAFE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SAFE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "FAILSAFE_SCHEMA")
  @js.native
  def FAILSAFE_SCHEMA: Schema = js.native
  inline def FAILSAFE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILSAFE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "JSON_SCHEMA")
  @js.native
  def JSON_SCHEMA: Schema = js.native
  inline def JSON_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "MINIMAL_SCHEMA")
  @js.native
  def MINIMAL_SCHEMA: Schema = js.native
  inline def MINIMAL_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINIMAL_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "SAFE_SCHEMA")
  @js.native
  def SAFE_SCHEMA: Schema = js.native
  inline def SAFE_SCHEMA_=(x: Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAFE_SCHEMA")(x.asInstanceOf[js.Any])
  
  @JSImport("js-yaml", "Schema")
  @js.native
  class Schema protected ()
    extends StObject
       with SchemaDefinition {
    def this(definition: SchemaDefinition) = this()
  }
  /* static members */
  object Schema {
    
    @JSImport("js-yaml", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(schemas: js.Array[Schema], types: js.Array[Type]): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Schema]
    inline def create(schemas: js.Array[Schema], types: Type): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Schema]
    inline def create(schemas: Schema, types: js.Array[Type]): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Schema]
    inline def create(schemas: Schema, types: Type): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Schema]
    inline def create(types: js.Array[Type]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(types.asInstanceOf[js.Any]).asInstanceOf[Schema]
    inline def create(types: Type): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(types.asInstanceOf[js.Any]).asInstanceOf[Schema]
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
    
    var represent: (js.Function1[/* data */ js.Object, js.Any]) | (StringDictionary[js.Function1[/* data */ js.Object, js.Any]]) | Null = js.native
    
    def resolve(data: js.Any): Boolean = js.native
    
    var styleAliases: StringDictionary[js.Any] = js.native
  }
  
  @JSImport("js-yaml", "YAMLException")
  @js.native
  class YAMLException ()
    extends StObject
       with Error {
    def this(reason: js.Any) = this()
    def this(reason: js.Any, mark: js.Any) = this()
    def this(reason: Unit, mark: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    def toString(compact: Boolean): String = js.native
  }
  
  inline def dump(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dump(obj: js.Any, opts: DumpOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def load(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def load(str: String, opts: LoadOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def loadAll(str: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def loadAll(str: String, iterator: Unit, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def safeDump(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDump")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeDump(obj: js.Any, opts: DumpOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeDump")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def safeLoad(str: String): js.UndefOr[String | js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | js.Object]]
  inline def safeLoad(str: String, opts: LoadOptions): js.UndefOr[String | js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Object]]
  
  inline def safeLoadAll(str: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def safeLoadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def safeLoadAll(str: String, iterator: Unit, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  trait DumpOptions extends StObject {
    
    /**
      * if true flow sequences will be condensed, omitting the space between `key: value` or `a, b`. Eg. `'[a,b]'` or `{a:{b:c}}`.
      * Can be useful when using yaml for pretty URL query params as spaces are %-encoded. (default: false).
      */
    var condenseFlow: js.UndefOr[Boolean] = js.undefined
    
    /** specifies level of nesting, when to switch from block to flow style for collections. -1 means block style everwhere */
    var flowLevel: js.UndefOr[Double] = js.undefined
    
    /** indentation width to use (in spaces). */
    var indent: js.UndefOr[Double] = js.undefined
    
    /** set max line width. (default: 80) */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /** when true, will not add an indentation level to array elements */
    var noArrayIndent: js.UndefOr[Boolean] = js.undefined
    
    /** if true don't try to be compatible with older yaml versions. Currently: don't quote "yes", "no" and so on, as required for YAML 1.1 (default: false) */
    var noCompatMode: js.UndefOr[Boolean] = js.undefined
    
    /** if true, don't convert duplicate objects into references (default: false) */
    var noRefs: js.UndefOr[Boolean] = js.undefined
    
    /** specifies a schema to use. */
    var schema: js.UndefOr[SchemaDefinition] = js.undefined
    
    /** do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types. */
    var skipInvalid: js.UndefOr[Boolean] = js.undefined
    
    /** if true, sort keys when dumping YAML. If a function, use the function to sort the keys. (default: false) */
    var sortKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.undefined
    
    /** Each tag may have own set of styles.    - "tag" => "style" map. */
    var styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object DumpOptions {
    
    inline def apply(): DumpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DumpOptions]
    }
    
    extension [Self <: DumpOptions](x: Self) {
      
      inline def setCondenseFlow(value: Boolean): Self = StObject.set(x, "condenseFlow", value.asInstanceOf[js.Any])
      
      inline def setCondenseFlowUndefined: Self = StObject.set(x, "condenseFlow", js.undefined)
      
      inline def setFlowLevel(value: Double): Self = StObject.set(x, "flowLevel", value.asInstanceOf[js.Any])
      
      inline def setFlowLevelUndefined: Self = StObject.set(x, "flowLevel", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setNoArrayIndent(value: Boolean): Self = StObject.set(x, "noArrayIndent", value.asInstanceOf[js.Any])
      
      inline def setNoArrayIndentUndefined: Self = StObject.set(x, "noArrayIndent", js.undefined)
      
      inline def setNoCompatMode(value: Boolean): Self = StObject.set(x, "noCompatMode", value.asInstanceOf[js.Any])
      
      inline def setNoCompatModeUndefined: Self = StObject.set(x, "noCompatMode", js.undefined)
      
      inline def setNoRefs(value: Boolean): Self = StObject.set(x, "noRefs", value.asInstanceOf[js.Any])
      
      inline def setNoRefsUndefined: Self = StObject.set(x, "noRefs", js.undefined)
      
      inline def setSchema(value: SchemaDefinition): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSkipInvalid(value: Boolean): Self = StObject.set(x, "skipInvalid", value.asInstanceOf[js.Any])
      
      inline def setSkipInvalidUndefined: Self = StObject.set(x, "skipInvalid", js.undefined)
      
      inline def setSortKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = StObject.set(x, "sortKeys", value.asInstanceOf[js.Any])
      
      inline def setSortKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sortKeys", js.Any.fromFunction2(value))
      
      inline def setSortKeysUndefined: Self = StObject.set(x, "sortKeys", js.undefined)
      
      inline def setStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsYaml.jsYamlStrings.open
    - typings.jsYaml.jsYamlStrings.close
  */
  trait EventType extends StObject
  object EventType {
    
    inline def close: typings.jsYaml.jsYamlStrings.close = "close".asInstanceOf[typings.jsYaml.jsYamlStrings.close]
    
    inline def open: typings.jsYaml.jsYamlStrings.open = "open".asInstanceOf[typings.jsYaml.jsYamlStrings.open]
  }
  
  trait LoadOptions extends StObject {
    
    /** string to be used as a file path in error/warning messages. */
    var filename: js.UndefOr[String] = js.undefined
    
    /** compatibility with JSON.parse behaviour. */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /** listener for parse events */
    var listener: js.UndefOr[
        js.ThisFunction2[/* this */ State, /* eventType */ EventType, /* state */ State, Unit]
      ] = js.undefined
    
    /** function to call on warning messages. */
    var onWarning: js.UndefOr[js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]] = js.undefined
    
    /** specifies a schema to use. */
    var schema: js.UndefOr[SchemaDefinition] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setListener(value: js.ThisFunction2[/* this */ State, /* eventType */ EventType, /* state */ State, Unit]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setOnWarning(value: js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
      
      inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
      
      inline def setSchema(value: SchemaDefinition): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  trait SchemaDefinition extends StObject {
    
    var explicit: js.UndefOr[js.Array[Type]] = js.undefined
    
    var `implicit`: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var include: js.UndefOr[js.Array[Schema]] = js.undefined
  }
  object SchemaDefinition {
    
    inline def apply(): SchemaDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaDefinition]
    }
    
    extension [Self <: SchemaDefinition](x: Self) {
      
      inline def setExplicit(value: js.Array[Type]): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      inline def setExplicitVarargs(value: Type*): Self = StObject.set(x, "explicit", js.Array(value :_*))
      
      inline def setImplicit(value: js.Array[js.Any]): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setImplicitVarargs(value: js.Any*): Self = StObject.set(x, "implicit", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[Schema]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Schema*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  trait State extends StObject {
    
    var checkLineBreaks: Boolean
    
    var filename: String | Null
    
    var implicitTypes: js.Array[Type]
    
    var input: String
    
    var json: Boolean
    
    var kind: String
    
    var length: Double
    
    var line: Double
    
    var lineIndent: Double
    
    var lineStart: Double
    
    def onWarning(e: YAMLException): Unit
    
    var position: Double
    
    var result: js.Any
    
    var schema: SchemaDefinition
    
    var version: Null | Double
  }
  object State {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(checkLineBreaks = checkLineBreaks.asInstanceOf[js.Any], implicitTypes = implicitTypes.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineIndent = lineIndent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], onWarning = js.Any.fromFunction1(onWarning), position = position.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], filename = null, version = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCheckLineBreaks(value: Boolean): Self = StObject.set(x, "checkLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setImplicitTypes(value: js.Array[Type]): Self = StObject.set(x, "implicitTypes", value.asInstanceOf[js.Any])
      
      inline def setImplicitTypesVarargs(value: Type*): Self = StObject.set(x, "implicitTypes", js.Array(value :_*))
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineIndent(value: Double): Self = StObject.set(x, "lineIndent", value.asInstanceOf[js.Any])
      
      inline def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      inline def setOnWarning(value: YAMLException => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction1(value))
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: SchemaDefinition): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
  
  trait TypeConstructorOptions extends StObject {
    
    var construct: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    var defaultStyle: js.UndefOr[String] = js.undefined
    
    var instanceOf: js.UndefOr[js.Object] = js.undefined
    
    var kind: js.UndefOr[sequence | scalar | mapping] = js.undefined
    
    var predicate: js.UndefOr[js.Function1[/* data */ js.Object, Boolean]] = js.undefined
    
    var represent: js.UndefOr[
        (js.Function1[/* data */ js.Object, js.Any]) | (StringDictionary[js.Function1[/* data */ js.Object, js.Any]])
      ] = js.undefined
    
    var resolve: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.undefined
    
    var styleAliases: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object TypeConstructorOptions {
    
    inline def apply(): TypeConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeConstructorOptions]
    }
    
    extension [Self <: TypeConstructorOptions](x: Self) {
      
      inline def setConstruct(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "construct", js.Any.fromFunction1(value))
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setDefaultStyle(value: String): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setInstanceOf(value: js.Object): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
      
      inline def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
      
      inline def setKind(value: sequence | scalar | mapping): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setPredicate(value: /* data */ js.Object => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setRepresent(
        value: (js.Function1[/* data */ js.Object, js.Any]) | (StringDictionary[js.Function1[/* data */ js.Object, js.Any]])
      ): Self = StObject.set(x, "represent", value.asInstanceOf[js.Any])
      
      inline def setRepresentFunction1(value: /* data */ js.Object => js.Any): Self = StObject.set(x, "represent", js.Any.fromFunction1(value))
      
      inline def setRepresentUndefined: Self = StObject.set(x, "represent", js.undefined)
      
      inline def setResolve(value: /* data */ js.Any => Boolean): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setStyleAliases(value: StringDictionary[js.Any]): Self = StObject.set(x, "styleAliases", value.asInstanceOf[js.Any])
      
      inline def setStyleAliasesUndefined: Self = StObject.set(x, "styleAliases", js.undefined)
    }
  }
}
