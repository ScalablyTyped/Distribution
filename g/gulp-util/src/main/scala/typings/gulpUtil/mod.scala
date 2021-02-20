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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object File extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("gulp-util", "File")
    @js.native
    class ^ protected () extends NullFile {
      def this(options: ConstructorOptionscontent) = this()
    }
    
    @JSImport("gulp-util", "File")
    @js.native
    val ^ : FileConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("gulp-util", "File.Class")
    @js.native
    class Class protected ()
      extends typings.vinyl.mod.Class {
      def this(options: ConstructorOptionscontent) = this()
    }
    
    type _To = FileConstructor
    
    /* This means you don't have to write `^`, but can instead just say `File.foo` */
    override def _to: FileConstructor = ^
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.gulpUtil.mod.PluginErrorOptions because var conflicts: message, name, stack. Inlined fileName, lineNumber, showStack, showProperties, plugin, error */ @JSImport("gulp-util", "PluginError")
  @js.native
  class PluginError () extends Error {
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
  
  @JSImport("gulp-util", "beep")
  @js.native
  def beep(): Unit = js.native
  
  @JSImport("gulp-util", "buffer")
  @js.native
  def buffer(): ReadWriteStream = js.native
  @JSImport("gulp-util", "buffer")
  @js.native
  def buffer(cb: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ReadWriteStream = js.native
  
  @JSImport("gulp-util", "colors")
  @js.native
  val colors: Typeof = js.native
  
  @JSImport("gulp-util", "combine")
  @js.native
  def combine(streams: ReadWriteStream*): js.Function0[ReadWriteStream] = js.native
  @JSImport("gulp-util", "combine")
  @js.native
  def combine(streams: js.Array[ReadWriteStream]): js.Function0[ReadWriteStream] = js.native
  
  object date {
    
    @JSImport("gulp-util", "date")
    @js.native
    def apply(): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: js.UndefOr[scala.Nothing], mask: js.UndefOr[scala.Nothing], convertLocalTimeToUTC: Boolean): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: js.UndefOr[scala.Nothing], mask: String): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: js.UndefOr[scala.Nothing], mask: String, convertLocalTimeToUTC: Boolean): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: String): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: String, mask: js.UndefOr[scala.Nothing], convertLocalTimeToUTC: Boolean): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: String, mask: String): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: String, mask: String, convertLocalTimeToUTC: Boolean): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: Date): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: Date, mask: js.UndefOr[scala.Nothing], convertLocalTimeToUTC: Boolean): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: Date, mask: String): js.Any = js.native
    @JSImport("gulp-util", "date")
    @js.native
    def apply(now: Date, mask: String, convertLocalTimeToUTC: Boolean): js.Any = js.native
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
  
  @JSImport("gulp-util", "isBuffer")
  @js.native
  def isBuffer(obj: js.Any): Boolean = js.native
  
  @JSImport("gulp-util", "isNull")
  @js.native
  def isNull(obj: js.Any): Boolean = js.native
  
  @JSImport("gulp-util", "isStream")
  @js.native
  def isStream(obj: js.Any): Boolean = js.native
  
  @JSImport("gulp-util", "linefeed")
  @js.native
  val linefeed: String = js.native
  
  @JSImport("gulp-util", "log")
  @js.native
  def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  @JSImport("gulp-util", "log")
  @js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: js.UndefOr[scala.Nothing], transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: js.UndefOr[scala.Nothing], transform: TransformFunction): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: js.UndefOr[scala.Nothing], transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: DuplexOptions): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: DuplexOptions, transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: DuplexOptions, transform: TransformFunction): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(transform: TransformFunction): Transform = js.native
  @JSImport("gulp-util", "noop")
  @js.native
  def noop(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  
  @JSImport("gulp-util", "replaceExtension")
  @js.native
  def replaceExtension(npath: String, ext: String): String = js.native
  
  @JSImport("gulp-util", "template")
  @js.native
  def template(tmpl: String): js.Function1[/* opt */ File, String] = js.native
  @JSImport("gulp-util", "template")
  @js.native
  def template(tmpl: String, opt: File): String = js.native
  
  @js.native
  trait PluginErrorOptions extends StObject {
    
    var error: js.UndefOr[Error] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
    
    /**
      * Can be a string or an existing error.
      */
    var message: js.UndefOr[js.Any] = js.native
    
    /**
      * The module name of your plugin.
      */
    var name: js.UndefOr[String] = js.native
    
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
    var stack: js.UndefOr[String] = js.native
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
