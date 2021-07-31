package typings.markdownPdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): OptionsBuilder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[OptionsBuilder]
  @scala.inline
  def apply(options: Options): OptionsBuilder = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[OptionsBuilder]
  
  @JSImport("markdown-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConcatFromOptionsBuilder extends StObject {
    
    /** Create and concatenate readable streams from paths and pipe to markdown-pdf. */
    def paths(paths: js.Array[String], opts: js.Any): ToOptionsBuilder
    
    /** Create and concatenate readable streams from strings and pipe to markdown-pdf. */
    def strings(markdownTexts: js.Array[String], opts: js.Any): ToOptionsBuilder
  }
  object ConcatFromOptionsBuilder {
    
    @scala.inline
    def apply(
      paths: (js.Array[String], js.Any) => ToOptionsBuilder,
      strings: (js.Array[String], js.Any) => ToOptionsBuilder
    ): ConcatFromOptionsBuilder = {
      val __obj = js.Dynamic.literal(paths = js.Any.fromFunction2(paths), strings = js.Any.fromFunction2(strings))
      __obj.asInstanceOf[ConcatFromOptionsBuilder]
    }
    
    @scala.inline
    implicit class ConcatFromOptionsBuilderMutableBuilder[Self <: ConcatFromOptionsBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: (js.Array[String], js.Any) => ToOptionsBuilder): Self = StObject.set(x, "paths", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStrings(value: (js.Array[String], js.Any) => ToOptionsBuilder): Self = StObject.set(x, "strings", js.Any.fromFunction2(value))
    }
  }
  
  trait ConcatOptionsBuilder extends StObject {
    
    var from: ConcatFromOptionsBuilder
  }
  object ConcatOptionsBuilder {
    
    @scala.inline
    def apply(from: ConcatFromOptionsBuilder): ConcatOptionsBuilder = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcatOptionsBuilder]
    }
    
    @scala.inline
    implicit class ConcatOptionsBuilderMutableBuilder[Self <: ConcatOptionsBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: ConcatFromOptionsBuilder): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  type FromFunction = /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
  js.Function1[/* path */ String | js.Array[String], ToOptionsBuilder]
  
  @js.native
  trait FromOptionsBuilder extends StObject {
    
    /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
    def path(path: String, opts: js.Any): ToOptionsBuilder = js.native
    def path(path: js.Array[String], opts: js.Any): ToOptionsBuilder = js.native
    
    /** Create a readable stream from string and pipe to markdown-pdf. string can be a single string or array of strings. */
    def string(markdown: String): ToOptionsBuilder = js.native
    def string(markdown: js.Array[String]): ToOptionsBuilder = js.native
  }
  
  /** Configuration options */
  trait Options extends StObject {
    
    /** Path to custom CSS file, relative to current directory. */
    var cssPath: js.UndefOr[String] = js.undefined
    
    /** Current working directory. */
    var cwd: js.UndefOr[String] = js.undefined
    
    /** Path to custorm highlight CSS file (for code highlighting with highlight.js), relative to the current directory. */
    var highlightCssPath: js.UndefOr[String] = js.undefined
    
    /** If renderDelay option isn't set, this is the timeout (in ms) before the page is rendered in case the page.onLoadFinished event doesn't fire. */
    var loadTimeout: js.UndefOr[Double] = js.undefined
    
    /** Supported dimension units are: 'mm', 'cm', 'in', 'px' */
    var paperBorder: js.UndefOr[String] = js.undefined
    
    var paperFormat: js.UndefOr[PaperFormat] = js.undefined
    
    var paperOrientation: js.UndefOr[PaperOrientation] = js.undefined
    
    /** Path to the phantomjs library. */
    var phantomPath: js.UndefOr[String] = js.undefined
    
    /** A function that returns a through2 stream that transforms the HTML before it is converted to PDF. */
    var preProcessHtml: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** A function that returns a through2 stream that transforms the markdown before it is converted to HTML. */
    var preProcessMd: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** A config object that is passed to remarkable, the underlying markdown parser */
    var remarkable: js.UndefOr[js.Any] = js.undefined
    
    /** Delay (in ms) before the PDF is rendered. */
    var renderDelay: js.UndefOr[Double] = js.undefined
    
    /** Path to CommonJS module which sets the page header and footer (see runnings.js). */
    var runningsPath: js.UndefOr[String] = js.undefined
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
      def setCssPath(value: String): Self = StObject.set(x, "cssPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssPathUndefined: Self = StObject.set(x, "cssPath", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setHighlightCssPath(value: String): Self = StObject.set(x, "highlightCssPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCssPathUndefined: Self = StObject.set(x, "highlightCssPath", js.undefined)
      
      @scala.inline
      def setLoadTimeout(value: Double): Self = StObject.set(x, "loadTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadTimeoutUndefined: Self = StObject.set(x, "loadTimeout", js.undefined)
      
      @scala.inline
      def setPaperBorder(value: String): Self = StObject.set(x, "paperBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaperBorderUndefined: Self = StObject.set(x, "paperBorder", js.undefined)
      
      @scala.inline
      def setPaperFormat(value: PaperFormat): Self = StObject.set(x, "paperFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaperFormatUndefined: Self = StObject.set(x, "paperFormat", js.undefined)
      
      @scala.inline
      def setPaperOrientation(value: PaperOrientation): Self = StObject.set(x, "paperOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaperOrientationUndefined: Self = StObject.set(x, "paperOrientation", js.undefined)
      
      @scala.inline
      def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
      
      @scala.inline
      def setPreProcessHtml(value: () => js.Any): Self = StObject.set(x, "preProcessHtml", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreProcessHtmlUndefined: Self = StObject.set(x, "preProcessHtml", js.undefined)
      
      @scala.inline
      def setPreProcessMd(value: () => js.Any): Self = StObject.set(x, "preProcessMd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreProcessMdUndefined: Self = StObject.set(x, "preProcessMd", js.undefined)
      
      @scala.inline
      def setRemarkable(value: js.Any): Self = StObject.set(x, "remarkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemarkableUndefined: Self = StObject.set(x, "remarkable", js.undefined)
      
      @scala.inline
      def setRenderDelay(value: Double): Self = StObject.set(x, "renderDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDelayUndefined: Self = StObject.set(x, "renderDelay", js.undefined)
      
      @scala.inline
      def setRunningsPath(value: String): Self = StObject.set(x, "runningsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningsPathUndefined: Self = StObject.set(x, "runningsPath", js.undefined)
    }
  }
  
  trait OptionsBuilder extends StObject {
    
    /** Concatenates stream and pipe them to markdown pdf. */
    var concat: ConcatOptionsBuilder
    
    /** Create a readable stream and pipe it to markdown pdf. */
    /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
    def from(path: String): ToOptionsBuilder
    /** Create a readable stream from path and pipe to markdown-pdf. path can be a single path or array of paths. */
    def from(path: js.Array[String]): ToOptionsBuilder
    /** Create a readable stream and pipe it to markdown pdf. */
    @JSName("from")
    var from_Original: FromOptionsBuilder & FromFunction
  }
  object OptionsBuilder {
    
    @scala.inline
    def apply(concat: ConcatOptionsBuilder, from: FromOptionsBuilder & FromFunction): OptionsBuilder = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsBuilder]
    }
    
    @scala.inline
    implicit class OptionsBuilderMutableBuilder[Self <: OptionsBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcat(value: ConcatOptionsBuilder): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: FromOptionsBuilder & FromFunction): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.markdownPdf.markdownPdfStrings.A3
    - typings.markdownPdf.markdownPdfStrings.A4
    - typings.markdownPdf.markdownPdfStrings.A5
    - typings.markdownPdf.markdownPdfStrings.Legal
    - typings.markdownPdf.markdownPdfStrings.Letter
    - typings.markdownPdf.markdownPdfStrings.Tabloid
  */
  trait PaperFormat extends StObject
  object PaperFormat {
    
    @scala.inline
    def A3: typings.markdownPdf.markdownPdfStrings.A3 = "A3".asInstanceOf[typings.markdownPdf.markdownPdfStrings.A3]
    
    @scala.inline
    def A4: typings.markdownPdf.markdownPdfStrings.A4 = "A4".asInstanceOf[typings.markdownPdf.markdownPdfStrings.A4]
    
    @scala.inline
    def A5: typings.markdownPdf.markdownPdfStrings.A5 = "A5".asInstanceOf[typings.markdownPdf.markdownPdfStrings.A5]
    
    @scala.inline
    def Legal: typings.markdownPdf.markdownPdfStrings.Legal = "Legal".asInstanceOf[typings.markdownPdf.markdownPdfStrings.Legal]
    
    @scala.inline
    def Letter: typings.markdownPdf.markdownPdfStrings.Letter = "Letter".asInstanceOf[typings.markdownPdf.markdownPdfStrings.Letter]
    
    @scala.inline
    def Tabloid: typings.markdownPdf.markdownPdfStrings.Tabloid = "Tabloid".asInstanceOf[typings.markdownPdf.markdownPdfStrings.Tabloid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.markdownPdf.markdownPdfStrings.portait
    - typings.markdownPdf.markdownPdfStrings.landscape
  */
  trait PaperOrientation extends StObject
  object PaperOrientation {
    
    @scala.inline
    def landscape: typings.markdownPdf.markdownPdfStrings.landscape = "landscape".asInstanceOf[typings.markdownPdf.markdownPdfStrings.landscape]
    
    @scala.inline
    def portait: typings.markdownPdf.markdownPdfStrings.portait = "portait".asInstanceOf[typings.markdownPdf.markdownPdfStrings.portait]
  }
  
  @js.native
  trait ToBuilder extends StObject {
    
    /** Create a concat-stream and pipe output from markdown-pdf to it. The callback function cb will be invoked when the buffer has been created. */
    def buffer(opts: js.Any): Unit = js.native
    def buffer(opts: js.Any, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Create a writeable stream to path and pipe output from markdown-pdf to it.
      * path can be a single path, or array of output paths if you specified an array of inputs.
      * The callback function cb will be invoked when data has finished being written.
      */
    def path(path: String): Unit = js.native
    def path(path: String, callback: js.Function0[Unit]): Unit = js.native
    
    /** Create a concat-stream and pipe output from markdown-pdf to it. The callback function cb will be invoked when the string has been created. */
    def string(opts: js.Any): Unit = js.native
    def string(opts: js.Any, callback: js.Function0[Unit]): Unit = js.native
  }
  
  type ToFunction = /**
    * Create a writeable stream to path and pipe output from markdown-pdf to it.
    * path can be a single path, or array of output paths if you specified an array of inputs.
    * The callback function cb will be invoked when data has finished being written.
    */
  js.Function2[/* path */ String, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  
  trait ToOptionsBuilder extends StObject {
    
    /**
      * Create a writeable stream to path and pipe output from markdown-pdf to it.
      * path can be a single path, or array of output paths if you specified an array of inputs.
      * The callback function cb will be invoked when data has finished being written.
      */
    def to(path: String): Unit
    /**
      * Create a writeable stream to path and pipe output from markdown-pdf to it.
      * path can be a single path, or array of output paths if you specified an array of inputs.
      * The callback function cb will be invoked when data has finished being written.
      */
    def to(path: String, callback: js.Function0[Unit]): Unit
    @JSName("to")
    var to_Original: ToBuilder & ToFunction
  }
  object ToOptionsBuilder {
    
    @scala.inline
    def apply(to: ToBuilder & ToFunction): ToOptionsBuilder = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToOptionsBuilder]
    }
    
    @scala.inline
    implicit class ToOptionsBuilderMutableBuilder[Self <: ToOptionsBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTo(value: ToBuilder & ToFunction): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
