package typings.logform

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logform", "Colorizer")
  @js.native
  class Colorizer () extends Format_ {
    def this(opts: js.Object) = this()
    
    def addColors(colors: Colors): Colors = js.native
    
    def colorize(level: String, message: String): String = js.native
    
    def createColorize(): Colorizer = js.native
    def createColorize(opts: js.Object): Colorizer = js.native
  }
  
  @JSImport("logform", "Format")
  @js.native
  class Format_ () extends StObject {
    def this(opts: js.Object) = this()
    
    var options: js.UndefOr[js.Object] = js.native
    
    def transform(info: TransformableInfo): TransformableInfo | Boolean = js.native
    def transform(info: TransformableInfo, opts: js.Any): TransformableInfo | Boolean = js.native
    @JSName("transform")
    var transform_Original: TransformFunction = js.native
  }
  
  object format {
    
    @JSImport("logform", "format")
    @js.native
    def apply(transform: TransformFunction): FormatWrap = js.native
    
    @JSImport("logform", "format.align")
    @js.native
    def align(): Format_ = js.native
    
    @JSImport("logform", "format.cli")
    @js.native
    def cli(): Format_ = js.native
    @JSImport("logform", "format.cli")
    @js.native
    def cli(opts: CliOptions): Format_ = js.native
    
    @JSImport("logform", "format.colorize")
    @js.native
    def colorize(): Colorizer = js.native
    @JSImport("logform", "format.colorize")
    @js.native
    def colorize(opts: ColorizeOptions): Colorizer = js.native
    
    @JSImport("logform", "format.combine")
    @js.native
    def combine(formats: Format_ *): Format_ = js.native
    
    @JSImport("logform", "format.errors")
    @js.native
    def errors(): Format_ = js.native
    @JSImport("logform", "format.errors")
    @js.native
    def errors(opts: js.Object): Format_ = js.native
    
    @JSImport("logform", "format.json")
    @js.native
    def json(): Format_ = js.native
    @JSImport("logform", "format.json")
    @js.native
    def json(opts: JsonOptions): Format_ = js.native
    
    @JSImport("logform", "format.label")
    @js.native
    def label(): Format_ = js.native
    @JSImport("logform", "format.label")
    @js.native
    def label(opts: LabelOptions): Format_ = js.native
    
    @JSImport("logform", "format.logstash")
    @js.native
    def logstash(): Format_ = js.native
    
    @JSImport("logform", "format.metadata")
    @js.native
    def metadata(): Format_ = js.native
    @JSImport("logform", "format.metadata")
    @js.native
    def metadata(opts: MetadataOptions): Format_ = js.native
    
    @JSImport("logform", "format.ms")
    @js.native
    def ms(): Format_ = js.native
    
    @JSImport("logform", "format.padLevels")
    @js.native
    def padLevels(): Format_ = js.native
    @JSImport("logform", "format.padLevels")
    @js.native
    def padLevels(opts: PadLevelsOptions): Format_ = js.native
    
    @JSImport("logform", "format.prettyPrint")
    @js.native
    def prettyPrint(): Format_ = js.native
    @JSImport("logform", "format.prettyPrint")
    @js.native
    def prettyPrint(opts: PrettyPrintOptions): Format_ = js.native
    
    @JSImport("logform", "format.printf")
    @js.native
    def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format_ = js.native
    
    @JSImport("logform", "format.simple")
    @js.native
    def simple(): Format_ = js.native
    
    @JSImport("logform", "format.splat")
    @js.native
    def splat(): Format_ = js.native
    
    @JSImport("logform", "format.timestamp")
    @js.native
    def timestamp(): Format_ = js.native
    @JSImport("logform", "format.timestamp")
    @js.native
    def timestamp(opts: TimestampOptions): Format_ = js.native
    
    @JSImport("logform", "format.uncolorize")
    @js.native
    def uncolorize(): Format_ = js.native
    @JSImport("logform", "format.uncolorize")
    @js.native
    def uncolorize(opts: UncolorizeOptions): Format_ = js.native
  }
  
  @JSImport("logform", "levels")
  @js.native
  def levels(config: js.Object): js.Object = js.native
  
  @js.native
  trait CliOptions
    extends ColorizeOptions
       with PadLevelsOptions
  object CliOptions {
    
    @scala.inline
    def apply(): CliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliOptions]
    }
  }
  
  @js.native
  trait ColorizeOptions extends StObject {
    
    /**
      * If set to `true` the color will be applied to the `message` and `level`.
      */
    var all: js.UndefOr[Boolean] = js.native
    
    /**
      * An object containing the colors for the log levels. For example: `{ info: 'blue', error: 'red' }`.
      */
    var colors: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * If set to `true` the color will be applied to the `level`.
      */
    var level: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `true` the color will be applied to the `message`.
      */
    var message: js.UndefOr[Boolean] = js.native
  }
  object ColorizeOptions {
    
    @scala.inline
    def apply(): ColorizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorizeOptions]
    }
    
    @scala.inline
    implicit class ColorizeOptionsMutableBuilder[Self <: ColorizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setColors(value: Record[String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type Colors = StringDictionary[String | js.Array[String]]
  
  type FormatWrap = js.Function1[/* opts */ js.UndefOr[js.Any], Format_]
  
  @js.native
  trait JsonOptions extends StObject {
    
    /**
      * A function that influences how the `info` is stringified.
      */
    var replacer: js.UndefOr[js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]] = js.native
    
    /**
      * The number of white space used to format the json.
      */
    var space: js.UndefOr[Double] = js.native
  }
  object JsonOptions {
    
    @scala.inline
    def apply(): JsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonOptions]
    }
    
    @scala.inline
    implicit class JsonOptionsMutableBuilder[Self <: JsonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplacer(value: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  @js.native
  trait LabelOptions extends StObject {
    
    /**
      * A label to be added before the message.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * If set to `true` the `label` will be added to `info.message`. If set to `false` the `label`
      * will be added as `info.label`.
      */
    var message: js.UndefOr[Boolean] = js.native
  }
  object LabelOptions {
    
    @scala.inline
    def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    @scala.inline
    implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait MetadataOptions extends StObject {
    
    /**
      * An array of keys that should not be added to the metadata object.
      */
    var fillExcept: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An array of keys that will be added to the metadata object.
      */
    var fillWith: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The name of the key used for the metadata object. Defaults to `metadata`.
      */
    var key: js.UndefOr[String] = js.native
  }
  object MetadataOptions {
    
    @scala.inline
    def apply(): MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOptions]
    }
    
    @scala.inline
    implicit class MetadataOptionsMutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillExcept(value: js.Array[String]): Self = StObject.set(x, "fillExcept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillExceptUndefined: Self = StObject.set(x, "fillExcept", js.undefined)
      
      @scala.inline
      def setFillExceptVarargs(value: String*): Self = StObject.set(x, "fillExcept", js.Array(value :_*))
      
      @scala.inline
      def setFillWith(value: js.Array[String]): Self = StObject.set(x, "fillWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillWithUndefined: Self = StObject.set(x, "fillWith", js.undefined)
      
      @scala.inline
      def setFillWithVarargs(value: String*): Self = StObject.set(x, "fillWith", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait PadLevelsOptions extends StObject {
    
    /**
      * Log levels. Defaults to `configs.npm.levels` from [triple-beam](https://github.com/winstonjs/triple-beam)
      * module.
      */
    var levels: js.UndefOr[Record[String, Double]] = js.native
  }
  object PadLevelsOptions {
    
    @scala.inline
    def apply(): PadLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PadLevelsOptions]
    }
    
    @scala.inline
    implicit class PadLevelsOptionsMutableBuilder[Self <: PadLevelsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevels(value: Record[String, Double]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    }
  }
  
  @js.native
  trait PrettyPrintOptions extends StObject {
    
    /**
      * Colorizes the message if set to `true`. Defaults to `false`.
      */
    var colorize: js.UndefOr[Boolean] = js.native
    
    /**
      * A `number` that specifies the maximum depth of the `info` object being stringified by
      * `util.inspect`. Defaults to `2`.
      */
    var depth: js.UndefOr[Double] = js.native
  }
  object PrettyPrintOptions {
    
    @scala.inline
    def apply(): PrettyPrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyPrintOptions]
    }
    
    @scala.inline
    implicit class PrettyPrintOptionsMutableBuilder[Self <: PrettyPrintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    }
  }
  
  @js.native
  trait TimestampOptions extends StObject {
    
    /**
      * The name of an alias for the timestamp property, that will be added to the `info` object.
      */
    var alias: js.UndefOr[String] = js.native
    
    /**
      * Either the format as a string accepted by the [fecha](https://github.com/taylorhakes/fecha)
      * module or a function that returns a formatted date. If no format is provided `new
      * Date().toISOString()` will be used.
      */
    var format: js.UndefOr[String | js.Function0[String]] = js.native
  }
  object TimestampOptions {
    
    @scala.inline
    def apply(): TimestampOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimestampOptions]
    }
    
    @scala.inline
    implicit class TimestampOptionsMutableBuilder[Self <: TimestampOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setFormat(value: String | js.Function0[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction0(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  type TransformFunction = js.Function2[
    /* info */ TransformableInfo, 
    /* opts */ js.UndefOr[js.Any], 
    TransformableInfo | Boolean
  ]
  
  @js.native
  trait TransformableInfo
    extends /* key */ StringDictionary[js.Any] {
    
    var level: String = js.native
    
    var message: String = js.native
  }
  object TransformableInfo {
    
    @scala.inline
    def apply(level: String, message: String): TransformableInfo = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformableInfo]
    }
    
    @scala.inline
    implicit class TransformableInfoMutableBuilder[Self <: TransformableInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UncolorizeOptions extends StObject {
    
    /**
      * Disables the uncolorize format for `info.level` if set to `false`.
      */
    var level: js.UndefOr[Boolean] = js.native
    
    /**
      * Disables the uncolorize format for `info.message` if set to `false`.
      */
    var message: js.UndefOr[Boolean] = js.native
    
    /**
      * Disables the uncolorize format for `info[MESSAGE]` if set to `false`.
      */
    var raw: js.UndefOr[Boolean] = js.native
  }
  object UncolorizeOptions {
    
    @scala.inline
    def apply(): UncolorizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncolorizeOptions]
    }
    
    @scala.inline
    implicit class UncolorizeOptionsMutableBuilder[Self <: UncolorizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
}
