package typings.html5ToPdf

import typings.html5ToPdf.html5ToPdfStrings.A3
import typings.html5ToPdf.html5ToPdfStrings.A4
import typings.html5ToPdf.html5ToPdfStrings.Legal
import typings.html5ToPdf.html5ToPdfStrings.Tabloid
import typings.html5ToPdf.html5ToPdfStrings.css
import typings.html5ToPdf.html5ToPdfStrings.js_
import typings.node.bufferMod.global.Buffer
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteer.mod.PDFOptions
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html5-to-pdf", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HTML5ToPDF {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def build(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def includeAssets(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def parseOptions(options: Options): ParsedOptions = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[Page] = js.native
  }
  
  trait FileDef extends StObject {
    
    /**
      * File path
      */
    var filePath: String
    
    /**
      * File type
      */
    var `type`: css | js_
  }
  object FileDef {
    
    inline def apply(filePath: String, `type`: css | js_): FileDef = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDef]
    }
    
    extension [Self <: FileDef](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setType(value: css | js_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTML5ToPDF extends StObject {
    
    def build(): js.Promise[Buffer]
    
    def close(): js.Promise[Unit]
    
    def includeAssets(): js.Promise[Unit]
    
    def parseOptions(options: Options): ParsedOptions
    
    def start(): js.Promise[Page]
  }
  object HTML5ToPDF {
    
    inline def apply(
      build: () => js.Promise[Buffer],
      close: () => js.Promise[Unit],
      includeAssets: () => js.Promise[Unit],
      parseOptions: Options => ParsedOptions,
      start: () => js.Promise[Page]
    ): HTML5ToPDF = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), close = js.Any.fromFunction0(close), includeAssets = js.Any.fromFunction0(includeAssets), parseOptions = js.Any.fromFunction1(parseOptions), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[HTML5ToPDF]
    }
    
    extension [Self <: HTML5ToPDF](x: Self) {
      
      inline def setBuild(value: () => js.Promise[Buffer]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setIncludeAssets(value: () => js.Promise[Unit]): Self = StObject.set(x, "includeAssets", js.Any.fromFunction0(value))
      
      inline def setParseOptions(value: Options => ParsedOptions): Self = StObject.set(x, "parseOptions", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => js.Promise[Page]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  trait LegacyOptions extends StObject {
    
    /**
      * [COMPATIBLE]\
      * True for landscape, false for portrait.
      */
    var landscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [NOT COMPATIBLE]\
      * 0 - default\
      * 1 - none\
      * 2 - minimum
      */
    var marginsType: js.UndefOr[Double] = js.undefined
    
    /**
      * [COMPATIBLE]\
      * Page size
      */
    var pageSize: js.UndefOr[A3 | A4 | Legal | Tabloid] = js.undefined
    
    /**
      * [COMPATIBLE]\
      * Whether to print CSS backgrounds.
      */
    var printBackground: js.UndefOr[Boolean] = js.undefined
  }
  object LegacyOptions {
    
    inline def apply(): LegacyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyOptions]
    }
    
    extension [Self <: LegacyOptions](x: Self) {
      
      inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      inline def setMarginsType(value: Double): Self = StObject.set(x, "marginsType", value.asInstanceOf[js.Any])
      
      inline def setMarginsTypeUndefined: Self = StObject.set(x, "marginsType", js.undefined)
      
      inline def setPageSize(value: A3 | A4 | Legal | Tabloid): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      inline def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A list of CSS or JS assets to include.
      */
    var include: js.UndefOr[js.Array[String | FileDef]] = js.undefined
    
    /**
      * Path to the input html as a String, or Buffer. If specified this will override inputPath.
      */
    var inputBody: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Path to the input HTML.
      */
    var inputPath: js.UndefOr[String] = js.undefined
    
    /**
      * This object will be passed directly to `puppeteer`.
      */
    var launchOptions: js.UndefOr[LaunchOptions] = js.undefined
    
    /**
      * @deprecated Legacy Options.
      * See `options.pdf` for pdf options. Since some of these options are converted over to work with `puppeteer`,
      * this is automatically done if `options.pdf` is left empty.
      */
    var options: js.UndefOr[LegacyOptions] = js.undefined
    
    /**
      * Path to the output pdf file.
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * This object will be passed directly to `puppeteer`.
      */
    var pdf: js.UndefOr[PDFOptions] = js.undefined
    
    /**
      * Delay in milliseconds before rendering the PDF (give HTML and CSS a chance to load).
      */
    var rendererDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The template to use when rendering the html.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * The template to use for rendering the html. If this is set, it will use this instead of the template path.
      */
    var templateUrl: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInclude(value: js.Array[String | FileDef]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | FileDef)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setInputBody(value: String | Buffer): Self = StObject.set(x, "inputBody", value.asInstanceOf[js.Any])
      
      inline def setInputBodyUndefined: Self = StObject.set(x, "inputBody", js.undefined)
      
      inline def setInputPath(value: String): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
      
      inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
      
      inline def setLaunchOptions(value: LaunchOptions): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
      
      inline def setLaunchOptionsUndefined: Self = StObject.set(x, "launchOptions", js.undefined)
      
      inline def setOptions(value: LegacyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPdf(value: PDFOptions): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
      
      inline def setRendererDelay(value: Double): Self = StObject.set(x, "rendererDelay", value.asInstanceOf[js.Any])
      
      inline def setRendererDelayUndefined: Self = StObject.set(x, "rendererDelay", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    }
  }
  
  trait ParsedOptions extends StObject {
    
    var body: String | Buffer
    
    var include: js.Array[FileDef]
    
    var launchOptions: LaunchOptions
    
    var pdf: PDFOptions
    
    var renderDelay: Double
    
    var templatePath: String
    
    var templateUrl: String
  }
  object ParsedOptions {
    
    inline def apply(
      body: String | Buffer,
      include: js.Array[FileDef],
      launchOptions: LaunchOptions,
      pdf: PDFOptions,
      renderDelay: Double,
      templatePath: String,
      templateUrl: String
    ): ParsedOptions = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], renderDelay = renderDelay.asInstanceOf[js.Any], templatePath = templatePath.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    extension [Self <: ParsedOptions](x: Self) {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setInclude(value: js.Array[FileDef]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: FileDef*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLaunchOptions(value: LaunchOptions): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
      
      inline def setPdf(value: PDFOptions): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      inline def setRenderDelay(value: Double): Self = StObject.set(x, "renderDelay", value.asInstanceOf[js.Any])
      
      inline def setTemplatePath(value: String): Self = StObject.set(x, "templatePath", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
}
