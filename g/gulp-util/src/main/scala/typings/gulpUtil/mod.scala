package typings.gulpUtil

import org.scalablytyped.runtime.Shortcut
import typings.gulpUtil.anon.File
import typings.gulpUtil.anon.Typeof
import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.std.Date
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
    class ^ protected ()
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
    class Class protected ()
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
  class PluginError ()
    extends StObject
       with Error {
    def this(options: PluginErrorOptions) = this()
    def this(pluginName: String) = this()
    def this(pluginName: String, message: String) = this()
    def this(pluginName: String, message: Error) = this()
    def this(pluginName: String, options: PluginErrorOptions) = this()
    def this(pluginName: String, message: String, options: PluginErrorOptions) = this()
    def this(pluginName: String, message: Error, options: PluginErrorOptions) = this()
    
    var error: js.UndefOr[Error] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
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
  
  @scala.inline
  def beep(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beep")().asInstanceOf[Unit]
  
  @scala.inline
  def buffer(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")().asInstanceOf[ReadWriteStream]
  @scala.inline
  def buffer(cb: js.Function2[/* err */ Error, /* data */ js.Array[js.Any], Unit]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(cb.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-util", "colors")
  @js.native
  val colors: Typeof = js.native
  
  @scala.inline
  def combine(streams: ReadWriteStream*): js.Function0[ReadWriteStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Function0[ReadWriteStream]]
  @scala.inline
  def combine(streams: js.Array[ReadWriteStream]): js.Function0[ReadWriteStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Function0[ReadWriteStream]]
  
  object date {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(now: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: String, mask: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: String, mask: String, convertLocalTimeToUTC: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: String, mask: Unit, convertLocalTimeToUTC: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Unit, mask: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Unit, mask: String, convertLocalTimeToUTC: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Unit, mask: Unit, convertLocalTimeToUTC: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Date): js.Any = ^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Date, mask: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Date, mask: String, convertLocalTimeToUTC: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(now: Date, mask: Unit, convertLocalTimeToUTC: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(now.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], convertLocalTimeToUTC.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("gulp-util", "date")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gulp-util", "date.masks")
    @js.native
    def masks: js.Any = js.native
    @scala.inline
    def masks_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masks")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gulp-util", "env")
  @js.native
  val env: js.Any = js.native
  
  @scala.inline
  def isBuffer(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNull(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isStream(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("gulp-util", "linefeed")
  @js.native
  val linefeed: String = js.native
  
  @scala.inline
  def log(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def log(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def noop(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Transform]
  @scala.inline
  def noop(opts: Unit, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(opts: Unit, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(opts: Unit, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(opts: DuplexOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def noop(opts: DuplexOptions, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(opts: DuplexOptions, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def noop(transform: TransformFunction): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def noop(transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @scala.inline
  def replaceExtension(npath: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceExtension")(npath.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def template(tmpl: String): js.Function1[/* opt */ File, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* opt */ File, String]]
  @scala.inline
  def template(tmpl: String, opt: File): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(tmpl.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PluginErrorOptions extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * Can be a string or an existing error.
      */
    var message: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): PluginErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginErrorOptions]
    }
    
    @scala.inline
    implicit class PluginErrorOptionsMutableBuilder[Self <: PluginErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      @scala.inline
      def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
