package typings.kss

import typings.kss.kssBooleans.`false`
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[KssStyleguide] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[KssStyleguide]]
  @scala.inline
  def apply(options: KssOptions): js.Promise[KssStyleguide] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KssStyleguide]]
  
  @JSImport("kss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kss", "KssModifier")
  @js.native
  class KssModifier () extends StObject {
    def this(data: js.Any) = this()
    
    def className(): String = js.native
    def className(className: String): KssModifier = js.native
    
    def description(): String = js.native
    def description(description: String): KssModifier = js.native
    
    def markup(): String = js.native
    def markup(markup: String): KssModifier = js.native
    
    def name(): String = js.native
    def name(name: String): KssModifier = js.native
    
    def section(): KssSection = js.native
    def section(section: KssSection): KssModifier = js.native
    
    def toJSON(): js.Any = js.native
  }
  
  @JSImport("kss", "KssParameter")
  @js.native
  class KssParameter () extends StObject {
    def this(data: js.Any) = this()
    
    def defaultValue(): String = js.native
    
    def description(): String = js.native
    def description(description: String): KssParameter = js.native
    
    def name(): String = js.native
    def name(name: String): KssParameter = js.native
    
    def section(): KssSection = js.native
    def section(section: KssSection): KssParameter = js.native
    
    def toJSON(): js.Any = js.native
  }
  
  @JSImport("kss", "KssSection")
  @js.native
  class KssSection () extends StObject {
    def this(data: js.Any) = this()
    
    def custom(name: String): js.Any = js.native
    def custom(name: String, value: js.Any): KssSection = js.native
    
    def customPropertyNames(): js.Array[String] = js.native
    
    def deprecated(): Boolean = js.native
    def deprecated(deprecated: Boolean): KssSection = js.native
    
    def depth(): Double = js.native
    def depth(depth: Double): KssSection = js.native
    
    def description(): String = js.native
    def description(description: String): KssSection = js.native
    
    def experimental(): Boolean = js.native
    def experimental(experimental: Boolean): KssSection = js.native
    
    def header(): String = js.native
    def header(header: String): KssSection = js.native
    
    def markup(): `false` | String = js.native
    def markup(markup: String): KssSection = js.native
    
    def modifiers(): js.Array[KssModifier] = js.native
    def modifiers(modifiers: js.Array[KssModifier]): KssSection = js.native
    def modifiers(modifiers: KssModifier): KssSection = js.native
    def modifiers(query: String): `false` | KssModifier = js.native
    def modifiers(query: Double): `false` | KssModifier = js.native
    
    def parameters(): js.Array[KssParameter] = js.native
    def parameters(parameters: js.Array[KssParameter]): KssSection = js.native
    def parameters(parameters: KssParameter): KssSection = js.native
    def parameters(query: String): `false` | KssParameter = js.native
    def parameters(query: Double): `false` | KssParameter = js.native
    
    def reference(): String = js.native
    def reference(reference: String): KssSection = js.native
    
    def referenceNumber(): String = js.native
    def referenceNumber(referenceNumber: String): KssSection = js.native
    
    def referenceURI(): String = js.native
    def referenceURI(referenceURI: String): KssSection = js.native
    
    def source(): Source = js.native
    def source(source: Source): KssSection = js.native
    
    def sourceFileName(): String = js.native
    
    def sourceLine(): String = js.native
    
    def styleGuide(): KssStyleguide = js.native
    def styleGuide(styleguide: KssStyleguide): KssSection = js.native
    
    def toJSON(): js.Any = js.native
    
    def weight(): Double = js.native
    def weight(weight: Double): KssSection = js.native
  }
  
  @JSImport("kss", "KssStyleguide")
  @js.native
  class KssStyleguide () extends StObject {
    def this(data: js.Any) = this()
    
    def autoInit(autoInit: Boolean): KssStyleguide = js.native
    
    def customPropertyNames(): js.Array[String] = js.native
    def customPropertyNames(names: String): KssStyleguide = js.native
    def customPropertyNames(names: js.Array[String]): KssStyleguide = js.native
    
    def hasNumericReferences(): Boolean = js.native
    
    def init(): KssStyleguide = js.native
    
    def referenceDelimiter(): String = js.native
    
    def sections(): js.Array[KssSection] = js.native
    def sections(query: String): `false` | KssSection | js.Array[KssSection] = js.native
    def sections(query: RegExp): `false` | KssSection | js.Array[KssSection] = js.native
    def sections(sections: js.Array[KssSection]): KssStyleguide = js.native
    def sections(sections: KssSection): KssStyleguide = js.native
    
    def toJSON(): js.Any = js.native
  }
  
  /** Parse a string of documented CSS, or an array of file anys with their content. */
  @scala.inline
  def parse(input: String, options: Options): KssStyleguide = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KssStyleguide]
  @scala.inline
  def parse(input: js.Array[File], options: Options): KssStyleguide = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KssStyleguide]
  
  /** Traverse a directory, parse its contents, and create a `KssStyleGuide`. */
  @scala.inline
  def traverse(directory: String, options: Options): js.Promise[KssStyleguide] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KssStyleguide]]
  @scala.inline
  def traverse(directory: js.Array[String], options: Options): js.Promise[KssStyleguide] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KssStyleguide]]
  
  type CallbackFn = js.Function2[/* error */ Error | Null, /* styleguide */ KssStyleguide, Unit]
  
  trait File extends StObject {
    
    /** bath to source directory */
    var base: String
    
    /** file contents */
    var contents: String
    
    /** full path to file */
    var path: String
  }
  object File {
    
    @scala.inline
    def apply(base: String, contents: String, path: String): File = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait KssOptions
    extends StObject
       with Options {
    
    var builder: js.UndefOr[js.Any] = js.undefined
    
    @JSName("clone")
    var clone_FKssOptions: js.UndefOr[Boolean] = js.undefined
    
    var custom: js.UndefOr[js.Any] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var logErrorFunction: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.undefined
    
    var source: js.Array[String]
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object KssOptions {
    
    @scala.inline
    def apply(source: js.Array[String]): KssOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[KssOptions]
    }
    
    @scala.inline
    implicit class KssOptionsMutableBuilder[Self <: KssOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuilder(value: js.Any): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setLogErrorFunction(value: /* repeated */ String => Unit): Self = StObject.set(x, "logErrorFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogErrorFunctionUndefined: Self = StObject.set(x, "logErrorFunction", js.undefined)
      
      @scala.inline
      def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * kss-node makes the header available separately from the description. To make kss-node
      * behave like the Ruby KSS, disable this option and the title will remain a part of the
      * description. Enabled by default.
      * @default true.
      */
    var header: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to automatically format Markdown using [marked](https://github.com/chjj/marked).
      * Enabled by default.
      * @default true
      */
    var markdown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use a regex or string (e.g. `*.less|*.css`) to only parse files matching this value.
      * @default *.css|*.less|*.sass|*.scss|*.styl|*.stylus
      */
    var mask: js.UndefOr[String | RegExp] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setMarkdown(value: Boolean): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
      
      @scala.inline
      def setMask(value: String | RegExp): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  trait Source extends StObject {
    
    /** The name of the file. */
    var filename: String
    
    /** The line number where the KSS comment is found. */
    var line: Double
    
    /** The full path of the file. */
    var path: String
  }
  object Source {
    
    @scala.inline
    def apply(filename: String, line: Double, path: String): Source = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
