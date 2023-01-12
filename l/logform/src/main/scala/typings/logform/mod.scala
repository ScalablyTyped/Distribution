package typings.logform

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorConstructor
import typings.std.Record
import typings.std.TypeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("logform", "Colorizer")
  @js.native
  open class Colorizer () extends Format_ {
    def this(opts: js.Object) = this()
    
    def addColors(colors: Colors): Colors = js.native
    
    def colorize(level: String, message: String): String = js.native
    
    def createColorize(): Colorizer = js.native
    def createColorize(opts: js.Object): Colorizer = js.native
  }
  
  @JSImport("logform", "Format")
  @js.native
  open class Format_ () extends StObject {
    def this(opts: js.Object) = this()
    
    var options: js.UndefOr[js.Object] = js.native
    
    def transform(info: TransformableInfo): TransformableInfo | Boolean = js.native
    def transform(info: TransformableInfo, opts: Any): TransformableInfo | Boolean = js.native
    @JSName("transform")
    var transform_Original: TransformFunction = js.native
  }
  
  object format {
    
    inline def apply(transform: TransformFunction): FormatWrap = ^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any]).asInstanceOf[FormatWrap]
    
    @JSImport("logform", "format")
    @js.native
    val ^ : js.Any = js.native
    
    inline def align(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("align")().asInstanceOf[Format_]
    
    inline def cli(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")().asInstanceOf[Format_]
    inline def cli(opts: CliOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def colorize(): Colorizer = ^.asInstanceOf[js.Dynamic].applyDynamic("colorize")().asInstanceOf[Colorizer]
    inline def colorize(opts: ColorizeOptions): Colorizer = ^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(opts.asInstanceOf[js.Any]).asInstanceOf[Colorizer]
    
    inline def combine(formats: Format_ *): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(formats.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Format_]
    
    inline def errors(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")().asInstanceOf[Format_]
    inline def errors(opts: js.Object): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def json(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[Format_]
    inline def json(opts: JsonOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def label(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("label")().asInstanceOf[Format_]
    inline def label(opts: LabelOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def logstash(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("logstash")().asInstanceOf[Format_]
    
    inline def metadata(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")().asInstanceOf[Format_]
    inline def metadata(opts: MetadataOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def ms(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ms")().asInstanceOf[Format_]
    
    inline def padLevels(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("padLevels")().asInstanceOf[Format_]
    inline def padLevels(opts: PadLevelsOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("padLevels")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def prettyPrint(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")().asInstanceOf[Format_]
    inline def prettyPrint(opts: PrettyPrintOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("printf")(templateFunction.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def simple(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")().asInstanceOf[Format_]
    
    inline def splat(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("splat")().asInstanceOf[Format_]
    
    inline def timestamp(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[Format_]
    inline def timestamp(opts: TimestampOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
    
    inline def uncolorize(): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("uncolorize")().asInstanceOf[Format_]
    inline def uncolorize(opts: UncolorizeOptions): Format_ = ^.asInstanceOf[js.Dynamic].applyDynamic("uncolorize")(opts.asInstanceOf[js.Any]).asInstanceOf[Format_]
  }
  
  inline def levels(config: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("levels")(config.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  trait CliOptions
    extends StObject
       with ColorizeOptions
       with PadLevelsOptions
  object CliOptions {
    
    inline def apply(): CliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliOptions]
    }
  }
  
  trait ColorizeOptions extends StObject {
    
    /**
      * If set to `true` the color will be applied to the `message` and `level`.
      */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object containing the colors for the log levels. For example: `{ info: 'blue', error: 'red' }`.
      */
    var colors: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * If set to `true` the color will be applied to the `level`.
      */
    var level: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true` the color will be applied to the `message`.
      */
    var message: js.UndefOr[Boolean] = js.undefined
  }
  object ColorizeOptions {
    
    inline def apply(): ColorizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorizeOptions] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setColors(value: Record[String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type Colors = StringDictionary[String | js.Array[String]]
  
  type FormatWrap = js.Function1[/* opts */ js.UndefOr[Any], Format_]
  
  trait JsonOptions extends StObject {
    
    // The following options come from safe-stable-stringify
    // https://github.com/BridgeAR/safe-stable-stringify/blob/main/index.d.ts
    /**
      * If `true`, bigint values are converted to a number. Otherwise, they are ignored.
      * This option is ignored by default as Logform stringifies BigInt in the default replacer.
      * @default true
      */
    var bigint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the value for circular references.
      * Set to `undefined`, circular properties are not serialized (array entries are replaced with null).
      * Set to `Error`, to throw on circular references.
      * @default "[Circular]"
      */
    var circularValue: js.UndefOr[String | Null | TypeErrorConstructor | ErrorConstructor] = js.undefined
    
    /**
      * If `true`, guarantee a deterministic key order instead of relying on the insertion order.
      * @default true
      */
    var deterministic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of entries to serialize per object (at least one).
      * The serialized output contains information about how many entries have not been serialized.
      * Ignored properties are counted as well (e.g., properties with symbol values).
      * Using the array replacer overrules this option.
      * @default Infinity
      */
    var maximumBreadth: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of object nesting levels (at least 1) that will be serialized.
      * Objects at the maximum level are serialized as `"[Object]"` and arrays as `"[Array]"`.
      * @default Infinity
      */
    var maximumDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * A function that influences how the `info` is stringified.
      */
    var replacer: js.UndefOr[js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]] = js.undefined
    
    /**
      * The number of white space used to format the json.
      */
    var space: js.UndefOr[Double] = js.undefined
  }
  object JsonOptions {
    
    inline def apply(): JsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonOptions] (val x: Self) extends AnyVal {
      
      inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
      
      inline def setCircularValue(value: String | TypeErrorConstructor | ErrorConstructor): Self = StObject.set(x, "circularValue", value.asInstanceOf[js.Any])
      
      inline def setCircularValueNull: Self = StObject.set(x, "circularValue", null)
      
      inline def setCircularValueUndefined: Self = StObject.set(x, "circularValue", js.undefined)
      
      inline def setDeterministic(value: Boolean): Self = StObject.set(x, "deterministic", value.asInstanceOf[js.Any])
      
      inline def setDeterministicUndefined: Self = StObject.set(x, "deterministic", js.undefined)
      
      inline def setMaximumBreadth(value: Double): Self = StObject.set(x, "maximumBreadth", value.asInstanceOf[js.Any])
      
      inline def setMaximumBreadthUndefined: Self = StObject.set(x, "maximumBreadth", js.undefined)
      
      inline def setMaximumDepth(value: Double): Self = StObject.set(x, "maximumDepth", value.asInstanceOf[js.Any])
      
      inline def setMaximumDepthUndefined: Self = StObject.set(x, "maximumDepth", js.undefined)
      
      inline def setReplacer(value: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  trait LabelOptions extends StObject {
    
    /**
      * A label to be added before the message.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * If set to `true` the `label` will be added to `info.message`. If set to `false` the `label`
      * will be added as `info.label`.
      */
    var message: js.UndefOr[Boolean] = js.undefined
  }
  object LabelOptions {
    
    inline def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait MetadataOptions extends StObject {
    
    /**
      * An array of keys that should not be added to the metadata object.
      */
    var fillExcept: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array of keys that will be added to the metadata object.
      */
    var fillWith: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the key used for the metadata object. Defaults to `metadata`.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object MetadataOptions {
    
    inline def apply(): MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
      
      inline def setFillExcept(value: js.Array[String]): Self = StObject.set(x, "fillExcept", value.asInstanceOf[js.Any])
      
      inline def setFillExceptUndefined: Self = StObject.set(x, "fillExcept", js.undefined)
      
      inline def setFillExceptVarargs(value: String*): Self = StObject.set(x, "fillExcept", js.Array(value*))
      
      inline def setFillWith(value: js.Array[String]): Self = StObject.set(x, "fillWith", value.asInstanceOf[js.Any])
      
      inline def setFillWithUndefined: Self = StObject.set(x, "fillWith", js.undefined)
      
      inline def setFillWithVarargs(value: String*): Self = StObject.set(x, "fillWith", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait PadLevelsOptions extends StObject {
    
    /**
      * Log levels. Defaults to `configs.npm.levels` from [triple-beam](https://github.com/winstonjs/triple-beam)
      * module.
      */
    var levels: js.UndefOr[Record[String, Double]] = js.undefined
  }
  object PadLevelsOptions {
    
    inline def apply(): PadLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PadLevelsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PadLevelsOptions] (val x: Self) extends AnyVal {
      
      inline def setLevels(value: Record[String, Double]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    }
  }
  
  trait PrettyPrintOptions extends StObject {
    
    /**
      * Colorizes the message if set to `true`. Defaults to `false`.
      */
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A `number` that specifies the maximum depth of the `info` object being stringified by
      * `util.inspect`. Defaults to `2`.
      */
    var depth: js.UndefOr[Double] = js.undefined
  }
  object PrettyPrintOptions {
    
    inline def apply(): PrettyPrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyPrintOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrettyPrintOptions] (val x: Self) extends AnyVal {
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    }
  }
  
  trait TimestampOptions extends StObject {
    
    /**
      * The name of an alias for the timestamp property, that will be added to the `info` object.
      */
    var alias: js.UndefOr[String] = js.undefined
    
    /**
      * Either the format as a string accepted by the [fecha](https://github.com/taylorhakes/fecha)
      * module or a function that returns a formatted date. If no format is provided `new
      * Date().toISOString()` will be used.
      */
    var format: js.UndefOr[String | js.Function0[String]] = js.undefined
  }
  object TimestampOptions {
    
    inline def apply(): TimestampOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimestampOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimestampOptions] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setFormat(value: String | js.Function0[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction0(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  type TransformFunction = js.Function2[
    /* info */ TransformableInfo, 
    /* opts */ js.UndefOr[Any], 
    TransformableInfo | Boolean
  ]
  
  trait TransformableInfo
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var level: String
    
    var message: Any
  }
  object TransformableInfo {
    
    inline def apply(level: String, message: Any): TransformableInfo = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformableInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformableInfo] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait UncolorizeOptions extends StObject {
    
    /**
      * Disables the uncolorize format for `info.level` if set to `false`.
      */
    var level: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables the uncolorize format for `info.message` if set to `false`.
      */
    var message: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables the uncolorize format for `info[MESSAGE]` if set to `false`.
      */
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object UncolorizeOptions {
    
    inline def apply(): UncolorizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncolorizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UncolorizeOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
}
