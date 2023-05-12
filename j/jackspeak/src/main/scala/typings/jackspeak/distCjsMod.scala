package typings.jackspeak

import org.scalablytyped.runtime.StringDictionary
import typings.jackspeak.anon.Default
import typings.jackspeak.anon.Delim
import typings.jackspeak.anon.Pre
import typings.jackspeak.jackspeakBooleans.`false`
import typings.jackspeak.jackspeakBooleans.`true`
import typings.jackspeak.jackspeakInts.`1`
import typings.jackspeak.jackspeakInts.`2`
import typings.jackspeak.jackspeakInts.`3`
import typings.jackspeak.jackspeakInts.`4`
import typings.jackspeak.jackspeakInts.`5`
import typings.jackspeak.jackspeakInts.`6`
import typings.jackspeak.jackspeakStrings._empty
import typings.jackspeak.jackspeakStrings.boolean
import typings.jackspeak.jackspeakStrings.description
import typings.jackspeak.jackspeakStrings.heading
import typings.jackspeak.jackspeakStrings.number
import typings.jackspeak.jackspeakStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  @JSImport("jackspeak/dist/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jackspeak/dist/cjs", "Jack")
  @js.native
  open class Jack_[C /* <: ConfigSet */] () extends StObject {
    def this(options: JackOptions) = this()
    
    /**
      * Generic field definition method. Similar to flag/flagList/number/etc,
      * but you must specify the `type` (and optionally `multiple` and `delim`)
      * fields on each one, or Jack won't know how to define them.
      */
    def addFields[F /* <: ConfigSet */](fields: F): Jack_[C & F] = js.native
    
    /**
      * Add a long-form description to the usage output at this position.
      */
    def description(text: String): Jack_[C] = js.native
    def description(text: String, param1: Pre): Jack_[C] = js.native
    
    /**
      * Add one or more flag fields.
      */
    def flag[F /* <: ConfigMetaSet[boolean, `false`] */](fields: F): Jack_[C & (ConfigSetFromMetaSet[boolean, `false`, F])] = js.native
    
    /**
      * Add one or more multiple flag fields.
      */
    def flagList[F /* <: ConfigMetaSet[boolean, `true`] */](fields: F): Jack_[C & (ConfigSetFromMetaSet[boolean, `true`, F])] = js.native
    
    /**
      * Add a heading to the usage output banner
      */
    def heading(text: String): Jack_[C] = js.native
    def heading(text: String, level: `1` | `2` | `3` | `4` | `5` | `6`): Jack_[C] = js.native
    
    /**
      * Add one or more number fields.
      */
    def num[F /* <: ConfigMetaSet[number, `false`] */](fields: F): Jack_[C & (ConfigSetFromMetaSet[number, `false`, F])] = js.native
    
    /**
      * Add one or more multiple number fields.
      */
    def numList[F /* <: ConfigMetaSet[number, `true`] */](fields: F): Jack_[C & (ConfigSetFromMetaSet[number, `true`, F])] = js.native
    
    /**
      * Add one or more string option fields.
      */
    def opt[F /* <: ConfigMetaSet[string, `false`] */](fields: F): Jack_[C & (ConfigSetFromMetaSet[string, `false`, F])] = js.native
    
    /**
      * Add one or more multiple string option fields.
      */
    def optList[F /* <: ConfigMetaSet[string, `true`] */](fields: F): Jack_[C & (ConfigSetFromMetaSet[string, `true`, F])] = js.native
    
    /**
      * Parse a string of arguments, and return the resulting
      * `{ values, positionals }` object.
      *
      * If an {@link JackOptions#envPrefix} is set, then it will read default
      * values from the environment, and write the resulting values back
      * to the environment as well.
      *
      * Environment values always take precedence over any other value, except
      * an explicit CLI setting.
      */
    def parse(): Parsed[C] = js.native
    def parse(args: js.Array[String]): Parsed[C] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Set the default value (which will still be overridden by env or cli)
      * as if from a parsed config file. The optional `source` param, if
      * provided, will be included in error messages if a value is invalid or
      * unknown.
      */
    def setConfigValues(values: OptionsResults[C]): this.type = js.native
    def setConfigValues(values: OptionsResults[C], source: String): this.type = js.native
    
    /**
      * Return the configuration options as a plain object
      */
    def toJSON(): StringDictionary[Delim] = js.native
    
    /**
      * Return the usage banner for the given configuration
      */
    def usage(): String = js.native
    
    /**
      * Validate that any arbitrary object is a valid configuration `values`
      * object.  Useful when loading config files or other sources.
      */
    def validate(o: Any): /* asserts o is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(jackspeak), TsIdentModule(None,List(jackspeak, dist, cjs)), TsIdentSimple(OptionsResults))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(C))),IArray())))*/ Boolean = js.native
  }
  
  inline def isConfigOption[T /* <: ConfigType */, M /* <: Boolean */](o: Any, `type`: T, multi: M): /* is jackspeak.jackspeak/dist/cjs.ConfigOptionBase<T, M> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConfigOption")(o.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[/* is jackspeak.jackspeak/dist/cjs.ConfigOptionBase<T, M> */ Boolean]
  
  inline def isConfigType(t: String): /* is jackspeak.jackspeak/dist/cjs.ConfigType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigType")(t.asInstanceOf[js.Any]).asInstanceOf[/* is jackspeak.jackspeak/dist/cjs.ConfigType */ Boolean]
  
  inline def jack(): Jack_[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("jack")().asInstanceOf[Jack_[js.Object]]
  inline def jack(options: JackOptions): Jack_[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("jack")(options.asInstanceOf[js.Any]).asInstanceOf[Jack_[js.Object]]
  
  type ConfigMetaSet[T /* <: ConfigType */, M /* <: Boolean */] = StringDictionary[ConfigOptionMeta[T, M]]
  
  type ConfigOptionBase[T /* <: ConfigType */, M /* <: Boolean */] = (typings.jackspeak.anon.Description[T, M]) & MultiType[M]
  
  type ConfigOptionMeta[T /* <: ConfigType */, M /* <: Boolean */] = (Default[T, M]) & (/* import warning: importer.ImportType#apply Failed type conversion: T extends 'boolean' ? {} : {  hint :string | undefined} */ js.Any)
  
  type ConfigSet = StringDictionary[ConfigOptionBase[ConfigType, Boolean]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ longOption in keyof S ]: jackspeak.jackspeak/dist/cjs.ConfigOptionBase<T, M>}
    }}}
    */
  @js.native
  trait ConfigSetFromMetaSet[T /* <: ConfigType */, M /* <: Boolean */, S /* <: ConfigMetaSet[T, M] */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.jackspeak.jackspeakStrings.number
    - typings.jackspeak.jackspeakStrings.string
    - typings.jackspeak.jackspeakStrings.boolean
  */
  trait ConfigType extends StObject
  object ConfigType {
    
    inline def boolean: typings.jackspeak.jackspeakStrings.boolean = "boolean".asInstanceOf[typings.jackspeak.jackspeakStrings.boolean]
    
    inline def number: typings.jackspeak.jackspeakStrings.number = "number".asInstanceOf[typings.jackspeak.jackspeakStrings.number]
    
    inline def string: typings.jackspeak.jackspeakStrings.string = "string".asInstanceOf[typings.jackspeak.jackspeakStrings.string]
  }
  
  trait Description
    extends StObject
       with Row
       with TextRow {
    
    @JSName("left")
    var left_Description: js.UndefOr[_empty] = js.undefined
    
    var pre: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_Description: description
  }
  object Description {
    
    inline def apply(text: String): Description = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("description")
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: _empty): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setType(value: description): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Heading
    extends StObject
       with Row
       with TextRow {
    
    @JSName("left")
    var left_Heading: js.UndefOr[_empty] = js.undefined
    
    var level: Double
    
    var pre: js.UndefOr[`false`] = js.undefined
    
    @JSName("type")
    var type_Heading: heading
  }
  object Heading {
    
    inline def apply(level: Double, text: String): Heading = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("heading")
      __obj.asInstanceOf[Heading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Heading] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: _empty): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setPre(value: `false`): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setType(value: heading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JackOptions extends StObject {
    
    /**
      * Whether to allow positional arguments
      *
      * @default true
      */
    var allowPositionals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Environment object to read/write. Defaults `process.env`.
      * No effect if `envPrefix` is not set.
      */
    var env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    /**
      * Prefix to use when reading/writing the environment variables
      *
      * If not specified, environment behavior will not be available.
      */
    var envPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Stop parsing flags and opts at the first positional argument.
      * This is to support cases like `cmd [flags] <subcmd> [options]`, where
      * each subcommand may have different options.  This effectively treats
      * any positional as a `--` argument.  Only relevant if `allowPositionals`
      * is true.
      *
      * To do subcommands, set this option, look at the first positional, and
      * parse the remaining positionals as appropriate.
      *
      * @default false
      */
    var stopAtPositional: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A short usage string. If not provided, will be generated from the
      * options provided, but that can of course be rather verbose if
      * there are a lot of options.
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object JackOptions {
    
    inline def apply(): JackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JackOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowPositionals(value: Boolean): Self = StObject.set(x, "allowPositionals", value.asInstanceOf[js.Any])
      
      inline def setAllowPositionalsUndefined: Self = StObject.set(x, "allowPositionals", js.undefined)
      
      inline def setEnv(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvPrefix(value: String): Self = StObject.set(x, "envPrefix", value.asInstanceOf[js.Any])
      
      inline def setEnvPrefixUndefined: Self = StObject.set(x, "envPrefix", js.undefined)
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setStopAtPositional(value: Boolean): Self = StObject.set(x, "stopAtPositional", value.asInstanceOf[js.Any])
      
      inline def setStopAtPositionalUndefined: Self = StObject.set(x, "stopAtPositional", js.undefined)
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    M extends true ? {  multiple :true,   delim :string | undefined} : M extends false ? {  multiple :false | undefined,   delim :undefined} : {  multiple :boolean | undefined,   delim :string | undefined}
    }}}
    */
  @js.native
  trait MultiType[M /* <: Boolean */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ k in keyof T ]:? T[k] extends jackspeak.jackspeak/dist/cjs.ConfigOptionBase<'string', false>? string : T[k] extends jackspeak.jackspeak/dist/cjs.ConfigOptionBase<'string', true>? std.Array<string> : T[k] extends jackspeak.jackspeak/dist/cjs.ConfigOptionBase<'number', false>? number : T[k] extends jackspeak.jackspeak/dist/cjs.ConfigOptionBase<'number', true>? std.Array<number> : T[k] extends jackspeak.jackspeak/dist/cjs.ConfigOptionBase<'boolean', false>? boolean : T[k] extends jackspeak.jackspeak/dist/cjs.ConfigOptionBase<'boolean', true>? std.Array<boolean> : never}
    }}}
    */
  @js.native
  trait OptionsResults[T /* <: ConfigSet */] extends StObject
  
  trait Parsed[T /* <: ConfigSet */] extends StObject {
    
    var positionals: js.Array[String]
    
    var values: OptionsResults[T]
  }
  object Parsed {
    
    inline def apply[T /* <: ConfigSet */](positionals: js.Array[String], values: OptionsResults[T]): Parsed[T] = {
      val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parsed[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parsed[?], T /* <: ConfigSet */] (val x: Self & Parsed[T]) extends AnyVal {
      
      inline def setPositionals(value: js.Array[String]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
      
      inline def setPositionalsVarargs(value: String*): Self = StObject.set(x, "positionals", js.Array(value*))
      
      inline def setValues(value: OptionsResults[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait Row extends StObject {
    
    var left: js.UndefOr[String] = js.undefined
    
    var skipLine: js.UndefOr[Boolean] = js.undefined
    
    var text: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Row {
    
    inline def apply(text: String): Row = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setSkipLine(value: Boolean): Self = StObject.set(x, "skipLine", value.asInstanceOf[js.Any])
      
      inline def setSkipLineUndefined: Self = StObject.set(x, "skipLine", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jackspeak.distCjsMod.Heading
    - typings.jackspeak.distCjsMod.Description
  */
  trait TextRow
    extends StObject
       with UsageField
  object TextRow {
    
    inline def Description(text: String): typings.jackspeak.distCjsMod.Description = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("description")
      __obj.asInstanceOf[typings.jackspeak.distCjsMod.Description]
    }
    
    inline def Heading(level: Double, text: String): typings.jackspeak.distCjsMod.Heading = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("heading")
      __obj.asInstanceOf[typings.jackspeak.distCjsMod.Heading]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jackspeak.distCjsMod.TextRow
    - typings.jackspeak.anon.Name
  */
  trait UsageField extends StObject
  object UsageField {
    
    inline def Description(text: String): typings.jackspeak.distCjsMod.Description = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("description")
      __obj.asInstanceOf[typings.jackspeak.distCjsMod.Description]
    }
    
    inline def Heading(level: Double, text: String): typings.jackspeak.distCjsMod.Heading = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("heading")
      __obj.asInstanceOf[typings.jackspeak.distCjsMod.Heading]
    }
    
    inline def Name(name: String, value: ConfigOptionBase[ConfigType, Boolean]): typings.jackspeak.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("config")
      __obj.asInstanceOf[typings.jackspeak.anon.Name]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, M] extends ['number', true] ? std.Array<number> : [T, M] extends ['string', true] ? std.Array<string> : [T, M] extends ['boolean', true] ? std.Array<boolean> : [T, M] extends ['number', false] ? number : [T, M] extends ['string', false] ? string : [T, M] extends ['boolean', false] ? boolean : [T, M] extends ['string', boolean] ? string | std.Array<string> : [T, M] extends ['boolean', boolean] ? boolean | std.Array<boolean> : [T, M] extends ['number', boolean] ? number | std.Array<number> : [T, M] extends [jackspeak.jackspeak/dist/cjs.ConfigType, false] ? string | number | boolean : [T, M] extends [jackspeak.jackspeak/dist/cjs.ConfigType, true] ? std.Array<string> | std.Array<number> | std.Array<boolean> : string | number | boolean | std.Array<string> | std.Array<number> | std.Array<boolean>
    }}}
    */
  type ValidValue[T /* <: ConfigType */, M /* <: Boolean */] = js.Array[Double]
}
