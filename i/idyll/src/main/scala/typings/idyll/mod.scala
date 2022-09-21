package typings.idyll

import typings.idyll.anon.Compiler
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): IdyllInstance = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IdyllInstance]
  inline def apply(options: Options, callback: js.Function0[Unit]): IdyllInstance = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IdyllInstance]
  
  @JSImport("idyll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.idyll.idyllStrings.COMPONENT_DIRS
    - typings.idyll.idyllStrings.DEFAULT_COMPONENT_DIRS
  */
  trait ComponentFiles extends StObject
  object ComponentFiles {
    
    inline def COMPONENT_DIRS: typings.idyll.idyllStrings.COMPONENT_DIRS = "COMPONENT_DIRS".asInstanceOf[typings.idyll.idyllStrings.COMPONENT_DIRS]
    
    inline def DEFAULT_COMPONENT_DIRS: typings.idyll.idyllStrings.DEFAULT_COMPONENT_DIRS = "DEFAULT_COMPONENT_DIRS".asInstanceOf[typings.idyll.idyllStrings.DEFAULT_COMPONENT_DIRS]
  }
  
  @js.native
  trait IdyllInstance extends EventEmitter {
    
    /**
      *
      * if indexIdyllMarkup is provided, compiles it
      *
      * Otherwise, compiles and optionally watches
      * the idyll file at IOptions.inputFile
      *
      */
    def build(): this.type = js.native
    def build(indexIdyllMarkup: String): this.type = js.native
    
    /**
      * Returns idyll compiling's options
      */
    def getOptions(): Options = js.native
    
    /**
      * Returns internal paths used by idyll-cli
      */
    def getPaths(): Paths = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Compiler options
      */
    var compiler: js.UndefOr[typings.idyllCompiler.mod.Options] = js.undefined
    
    /**
      * The components directory
      */
    var components: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom CSS file to include in output
      */
    var css: js.UndefOr[String] = js.undefined
    
    /**
      * The datasets directory
      */
    var datasets: js.UndefOr[String] = js.undefined
    
    /**
      * The default component directory
      * This corresponds to where the idyll-components package stays
      */
    var defaultComponents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * used internally by IdyllInstance
      */
    var inputConfig: js.UndefOr[Compiler] = js.undefined
    
    /**
      * the idyll file to be compiled into
      */
    var inputFile: js.UndefOr[String] = js.undefined
    
    /**
      * The layout defined in idyll-layouts package
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to minify output build
      */
    var minify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The output directory for compiled documents
      */
    var output: js.UndefOr[String] = js.undefined
    
    /**
      * Custom port to bind the local server to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Pre-render HTML as part of the build
      */
    var ssr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Temporary directory used by idyll
      */
    var temp: js.UndefOr[String] = js.undefined
    
    /**
      * path to HTML template
      *
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * The theme defined in idyll-theme package
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * Custom browserify transforms to apply.
      */
    var transform: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Monitor input files and rebuild on changes
      */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompiler(value: typings.idyllCompiler.mod.Options): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setComponents(value: Boolean): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDatasets(value: String): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      inline def setDefaultComponents(value: Boolean): Self = StObject.set(x, "defaultComponents", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponentsUndefined: Self = StObject.set(x, "defaultComponents", js.undefined)
      
      inline def setInputConfig(value: Compiler): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
      
      inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
      
      inline def setInputFile(value: String): Self = StObject.set(x, "inputFile", value.asInstanceOf[js.Any])
      
      inline def setInputFileUndefined: Self = StObject.set(x, "inputFile", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      inline def setTemp(value: String): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
      
      inline def setTempUndefined: Self = StObject.set(x, "temp", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTransform(value: js.Array[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: String*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  /* Inlined std.Record<idyll.idyll.PredefinedFile, string> & std.Record<idyll.idyll.ComponentFiles, std.Array<string>> */
  trait Paths extends StObject {
    
    var APP_PATH: String
    
    var COMPONENT_DIRS: js.Array[String]
    
    var CSS_INPUT_FILE: String
    
    var CSS_OUTPUT_FILE: String
    
    var DATA_DIR: String
    
    var DEFAULT_COMPONENT_DIRS: js.Array[String]
    
    var HTML_OUTPUT_FILE: String
    
    var HTML_TEMPLATE_FILE: String
    
    var IDYLL_INPUT_FILE: String
    
    var INPUT_DIR: String
    
    var JS_OUTPUT_FILE: String
    
    var OUTPUT_DIR: String
    
    var PACKAGE_FILE: String
    
    var TMP_DIR: String
  }
  object Paths {
    
    inline def apply(
      APP_PATH: String,
      COMPONENT_DIRS: js.Array[String],
      CSS_INPUT_FILE: String,
      CSS_OUTPUT_FILE: String,
      DATA_DIR: String,
      DEFAULT_COMPONENT_DIRS: js.Array[String],
      HTML_OUTPUT_FILE: String,
      HTML_TEMPLATE_FILE: String,
      IDYLL_INPUT_FILE: String,
      INPUT_DIR: String,
      JS_OUTPUT_FILE: String,
      OUTPUT_DIR: String,
      PACKAGE_FILE: String,
      TMP_DIR: String
    ): Paths = {
      val __obj = js.Dynamic.literal(APP_PATH = APP_PATH.asInstanceOf[js.Any], COMPONENT_DIRS = COMPONENT_DIRS.asInstanceOf[js.Any], CSS_INPUT_FILE = CSS_INPUT_FILE.asInstanceOf[js.Any], CSS_OUTPUT_FILE = CSS_OUTPUT_FILE.asInstanceOf[js.Any], DATA_DIR = DATA_DIR.asInstanceOf[js.Any], DEFAULT_COMPONENT_DIRS = DEFAULT_COMPONENT_DIRS.asInstanceOf[js.Any], HTML_OUTPUT_FILE = HTML_OUTPUT_FILE.asInstanceOf[js.Any], HTML_TEMPLATE_FILE = HTML_TEMPLATE_FILE.asInstanceOf[js.Any], IDYLL_INPUT_FILE = IDYLL_INPUT_FILE.asInstanceOf[js.Any], INPUT_DIR = INPUT_DIR.asInstanceOf[js.Any], JS_OUTPUT_FILE = JS_OUTPUT_FILE.asInstanceOf[js.Any], OUTPUT_DIR = OUTPUT_DIR.asInstanceOf[js.Any], PACKAGE_FILE = PACKAGE_FILE.asInstanceOf[js.Any], TMP_DIR = TMP_DIR.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    extension [Self <: Paths](x: Self) {
      
      inline def setAPP_PATH(value: String): Self = StObject.set(x, "APP_PATH", value.asInstanceOf[js.Any])
      
      inline def setCOMPONENT_DIRS(value: js.Array[String]): Self = StObject.set(x, "COMPONENT_DIRS", value.asInstanceOf[js.Any])
      
      inline def setCOMPONENT_DIRSVarargs(value: String*): Self = StObject.set(x, "COMPONENT_DIRS", js.Array(value*))
      
      inline def setCSS_INPUT_FILE(value: String): Self = StObject.set(x, "CSS_INPUT_FILE", value.asInstanceOf[js.Any])
      
      inline def setCSS_OUTPUT_FILE(value: String): Self = StObject.set(x, "CSS_OUTPUT_FILE", value.asInstanceOf[js.Any])
      
      inline def setDATA_DIR(value: String): Self = StObject.set(x, "DATA_DIR", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT_COMPONENT_DIRS(value: js.Array[String]): Self = StObject.set(x, "DEFAULT_COMPONENT_DIRS", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT_COMPONENT_DIRSVarargs(value: String*): Self = StObject.set(x, "DEFAULT_COMPONENT_DIRS", js.Array(value*))
      
      inline def setHTML_OUTPUT_FILE(value: String): Self = StObject.set(x, "HTML_OUTPUT_FILE", value.asInstanceOf[js.Any])
      
      inline def setHTML_TEMPLATE_FILE(value: String): Self = StObject.set(x, "HTML_TEMPLATE_FILE", value.asInstanceOf[js.Any])
      
      inline def setIDYLL_INPUT_FILE(value: String): Self = StObject.set(x, "IDYLL_INPUT_FILE", value.asInstanceOf[js.Any])
      
      inline def setINPUT_DIR(value: String): Self = StObject.set(x, "INPUT_DIR", value.asInstanceOf[js.Any])
      
      inline def setJS_OUTPUT_FILE(value: String): Self = StObject.set(x, "JS_OUTPUT_FILE", value.asInstanceOf[js.Any])
      
      inline def setOUTPUT_DIR(value: String): Self = StObject.set(x, "OUTPUT_DIR", value.asInstanceOf[js.Any])
      
      inline def setPACKAGE_FILE(value: String): Self = StObject.set(x, "PACKAGE_FILE", value.asInstanceOf[js.Any])
      
      inline def setTMP_DIR(value: String): Self = StObject.set(x, "TMP_DIR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.idyll.idyllStrings.APP_PATH
    - typings.idyll.idyllStrings.CSS_INPUT_FILE
    - typings.idyll.idyllStrings.DATA_DIR
    - typings.idyll.idyllStrings.HTML_TEMPLATE_FILE
    - typings.idyll.idyllStrings.IDYLL_INPUT_FILE
    - typings.idyll.idyllStrings.INPUT_DIR
    - typings.idyll.idyllStrings.PACKAGE_FILE
    - typings.idyll.idyllStrings.OUTPUT_DIR
    - typings.idyll.idyllStrings.TMP_DIR
    - typings.idyll.idyllStrings.CSS_OUTPUT_FILE
    - typings.idyll.idyllStrings.HTML_OUTPUT_FILE
    - typings.idyll.idyllStrings.JS_OUTPUT_FILE
  */
  trait PredefinedFile extends StObject
  object PredefinedFile {
    
    inline def APP_PATH: typings.idyll.idyllStrings.APP_PATH = "APP_PATH".asInstanceOf[typings.idyll.idyllStrings.APP_PATH]
    
    inline def CSS_INPUT_FILE: typings.idyll.idyllStrings.CSS_INPUT_FILE = "CSS_INPUT_FILE".asInstanceOf[typings.idyll.idyllStrings.CSS_INPUT_FILE]
    
    inline def CSS_OUTPUT_FILE: typings.idyll.idyllStrings.CSS_OUTPUT_FILE = "CSS_OUTPUT_FILE".asInstanceOf[typings.idyll.idyllStrings.CSS_OUTPUT_FILE]
    
    inline def DATA_DIR: typings.idyll.idyllStrings.DATA_DIR = "DATA_DIR".asInstanceOf[typings.idyll.idyllStrings.DATA_DIR]
    
    inline def HTML_OUTPUT_FILE: typings.idyll.idyllStrings.HTML_OUTPUT_FILE = "HTML_OUTPUT_FILE".asInstanceOf[typings.idyll.idyllStrings.HTML_OUTPUT_FILE]
    
    inline def HTML_TEMPLATE_FILE: typings.idyll.idyllStrings.HTML_TEMPLATE_FILE = "HTML_TEMPLATE_FILE".asInstanceOf[typings.idyll.idyllStrings.HTML_TEMPLATE_FILE]
    
    inline def IDYLL_INPUT_FILE: typings.idyll.idyllStrings.IDYLL_INPUT_FILE = "IDYLL_INPUT_FILE".asInstanceOf[typings.idyll.idyllStrings.IDYLL_INPUT_FILE]
    
    inline def INPUT_DIR: typings.idyll.idyllStrings.INPUT_DIR = "INPUT_DIR".asInstanceOf[typings.idyll.idyllStrings.INPUT_DIR]
    
    inline def JS_OUTPUT_FILE: typings.idyll.idyllStrings.JS_OUTPUT_FILE = "JS_OUTPUT_FILE".asInstanceOf[typings.idyll.idyllStrings.JS_OUTPUT_FILE]
    
    inline def OUTPUT_DIR: typings.idyll.idyllStrings.OUTPUT_DIR = "OUTPUT_DIR".asInstanceOf[typings.idyll.idyllStrings.OUTPUT_DIR]
    
    inline def PACKAGE_FILE: typings.idyll.idyllStrings.PACKAGE_FILE = "PACKAGE_FILE".asInstanceOf[typings.idyll.idyllStrings.PACKAGE_FILE]
    
    inline def TMP_DIR: typings.idyll.idyllStrings.TMP_DIR = "TMP_DIR".asInstanceOf[typings.idyll.idyllStrings.TMP_DIR]
  }
}
