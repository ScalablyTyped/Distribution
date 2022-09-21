package typings.gulpUtil

import org.scalablytyped.runtime.Shortcut
import typings.chalk.mod.ChalkInstance
import typings.gulpUtil.anon.File
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.std.Error
import typings.through2.mod.FlushCallback
import typings.through2.mod.TransformFunction
import typings.vinyl.anon.ConstructorOptionscontent
import typings.vinyl.mod.FileConstructor
import typings.vinyl.mod.NullFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object File extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("gulp-util", "File")
    @js.native
    open class ^ protected ()
      extends StObject
         with NullFile {
      def this(options: ConstructorOptionscontent) = this()
    }
    
    @JSImport("gulp-util", "File")
    @js.native
    val ^ : js.Object & FileConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("gulp-util", "File.Class")
    @js.native
    open class Class protected ()
      extends typings.vinyl.mod.Class {
      def this(options: ConstructorOptionscontent) = this()
    }
    
    type _To = js.Object & FileConstructor
    
    /* This means you don't have to write `^`, but can instead just say `File.foo` */
    override def _to: js.Object & FileConstructor = ^
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.gulpUtil.mod.PluginErrorOptions because var conflicts: message, name, stack. Inlined fileName, lineNumber, showStack, showProperties, plugin, error */ @JSImport("gulp-util", "PluginError")
  @js.native
  open class PluginError ()
    extends StObject
       with Error {
    def this(options: PluginErrorOptions) = this()
    def this(pluginName: String) = this()
    def this(pluginName: String, message: String) = this()
    def this(pluginName: String, message: js.Error) = this()
    def this(pluginName: String, options: PluginErrorOptions) = this()
    def this(pluginName: String, message: String, options: PluginErrorOptions) = this()
    def this(pluginName: String, message: js.Error, options: PluginErrorOptions) = this()
    
    var error: js.UndefOr[js.Error] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var plugin: js.UndefOr[String] = js.native
    
    /**
      * Error properties will be included in err.toString(). Can be omitted by
      * setting this to false.
      */
    var showProperties: js.UndefOr[Boolean] = js.native
    
    /**
      * By default the stack will not be shown. Set this to true if you think the
      * stack is important for your error.
      */
    var showStack: js.UndefOr[Boolean] = js.native
    
    /**
      * You need to include the message along with this stack. If you pass an
      * error in as the message the stack will be pulled from that, otherwise one
      * will be created.
      */
    @JSName("stack")
    var stack_PluginError: String = js.native
  }
  
  inline def beep(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beep")().asInstanceOf[Unit]
  
  inline def buffer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")().asInstanceOf[Any]
  inline def buffer(cb: js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(cb.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-util", "colors")
  @js.native
  val colors: ChalkInstance = js.native
  
  inline def combine(
    streams: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any)*
  ): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]]
  inline def combine(
    streams: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
    ]
  ): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]]
  
  object date {
    
    inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
    inline def apply(now: String): Any = ^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def apply(now: String, mask: String): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: String, mask: String, convertLocalTimeToUTC: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: String, mask: Unit, convertLocalTimeToUTC: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: js.Date): Any = ^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def apply(now: js.Date, mask: String): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: js.Date, mask: String, convertLocalTimeToUTC: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: js.Date, mask: Unit, convertLocalTimeToUTC: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: Unit, mask: String): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: Unit, mask: String, convertLocalTimeToUTC: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(now: Unit, mask: Unit, convertLocalTimeToUTC: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("gulp-util", "date")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gulp-util", "date.masks")
    @js.native
    def masks: Any = js.native
    inline def masks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masks")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gulp-util", "env")
  @js.native
  val env: Any = js.native
  
  inline def isBuffer(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStream(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("gulp-util", "linefeed")
  @js.native
  val linefeed: String = js.native
  
  inline def log(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def log(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def noop(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Transform]
  inline def noop(opts: Unit, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(opts: Unit, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(opts: Unit, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(opts: DuplexOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def noop(opts: DuplexOptions, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(opts: DuplexOptions, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def noop(transform: TransformFunction): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def noop(transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  inline def replaceExtension(npath: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceExtension")(npath.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def template(tmpl: String): js.Function1[/* opt */ File, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* opt */ File, String]]
  inline def template(tmpl: String, opt: File): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PluginErrorOptions extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * Can be a string or an existing error.
      */
    var message: js.UndefOr[Any] = js.undefined
    
    /**
      * The module name of your plugin.
      */
    var name: js.UndefOr[String] = js.undefined
    
    var plugin: js.UndefOr[String] = js.undefined
    
    /**
      * Error properties will be included in err.toString(). Can be omitted by
      * setting this to false.
      */
    var showProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default the stack will not be shown. Set this to true if you think the
      * stack is important for your error.
      */
    var showStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You need to include the message along with this stack. If you pass an
      * error in as the message the stack will be pulled from that, otherwise one
      * will be created.
      */
    var stack: js.UndefOr[String] = js.undefined
  }
  object PluginErrorOptions {
    
    inline def apply(): PluginErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginErrorOptions]
    }
    
    extension [Self <: PluginErrorOptions](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      inline def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      inline def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      inline def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
