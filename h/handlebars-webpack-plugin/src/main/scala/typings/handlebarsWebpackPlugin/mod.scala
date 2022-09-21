package typings.handlebarsWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.RuntimeOptions
import typings.handlebarsWebpackPlugin.anon.ProjectHelpers
import typings.htmlWebpackPlugin.mod.Options
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("handlebars-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HandlebarsWebpackPlugin {
    def this(options: PluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait HandlebarsWebpackPlugin
    extends StObject
       with WebpackPluginInstance
  object HandlebarsWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): HandlebarsWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[HandlebarsWebpackPlugin]
    }
  }
  
  /**
    * Type for the object partials that the plugin creates in other to process all partials
    */
  type PartialsMap = StringDictionary[String]
  
  /**
    * Handlebars Webpack Plugin Options
    */
  trait PluginOptions extends StObject {
    
    /**
      * You can also add a [path] variable, which will emit the files with their
      * relative path, like output:
      * path.join(process.cwd(), "build", [path], "[name].html
      *
      * data passed to main hbs template: `main-template(data)`
      */
    var data: js.UndefOr[js.Object | String] = js.undefined
    
    /**
      * Path to hbs entry file(s).
      * Also supports nested directories if write
      * path.join(process.cwd(), "app", "src", "**", "*.hbs"),
      */
    var entry: js.UndefOr[String] = js.undefined
    
    /**
      * Modify the hbs partial-id created for a loaded partial
      */
    var getPartialId: js.UndefOr[js.Function1[/* filePath */ String, js.UndefOr[String]]] = js.undefined
    
    /**
      * Modify the default output path of each entry-template
      */
    var getTargetFilepath: js.UndefOr[
        js.Function3[
          /* filepath */ String, 
          /* outputTemplate */ String, 
          /* rootFolder */ String, 
          js.UndefOr[String]
        ]
      ] = js.undefined
    
    /**
      * Register custom helpers. May be either a function or a glob-pattern
      */
    var helpers: js.UndefOr[HelperDeclareSpec | ProjectHelpers] = js.undefined
    
    /**
      * HtmlWebpackPlugin additional configurations
      */
    var htmlWebpackPlugin: js.UndefOr[Options | typings.htmlWebpackPlugin.mod.^] = js.undefined
    
    /**
      * onBeforeAddPartials hook, runs before the partials addition to the .html files
      */
    var onBeforeAddPartials: js.UndefOr[
        js.Function2[/* Handlebars */ RuntimeOptions, /* partialsMap */ PartialsMap, Any]
      ] = js.undefined
    
    /**
      * onBeforeCompile hook, runs before the plugin compilation
      */
    var onBeforeCompile: js.UndefOr[js.Function2[/* Handlebars */ RuntimeOptions, /* templateContent */ String, Any]] = js.undefined
    
    /**
      * onBeforeRender hook, runs before rendering of the templates
      */
    var onBeforeRender: js.UndefOr[
        js.Function3[/* Handlebars */ RuntimeOptions, /* data */ js.Object, /* filename */ String, Any]
      ] = js.undefined
    
    /**
      * onBeforeSave hook, runs before saving
      */
    var onBeforeSave: js.UndefOr[
        js.Function3[/* Handlebars */ RuntimeOptions, /* resultHtml */ String, /* filename */ String, Any]
      ] = js.undefined
    
    /**
      * onBeforeSetup hook, runs before setup of the plugin
      */
    var onBeforeSetup: js.UndefOr[js.Function1[/* Handlebars */ RuntimeOptions, Any]] = js.undefined
    
    /**
      * onDone, runs before the final stages of the plugin
      */
    var onDone: js.UndefOr[js.Function2[/* Handlebars */ RuntimeOptions, /* filename */ String, Any]] = js.undefined
    
    /**
      * Output path and filename(s).
      * This should lie within the webpacks output-folder
      * if omitted, the input filepath stripped of its extension will be used
      */
    var output: js.UndefOr[String] = js.undefined
    
    /**
      * globbed path to partials, where folder/filename is unique
      */
    var partials: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setData(value: js.Object | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setGetPartialId(value: /* filePath */ String => js.UndefOr[String]): Self = StObject.set(x, "getPartialId", js.Any.fromFunction1(value))
      
      inline def setGetPartialIdUndefined: Self = StObject.set(x, "getPartialId", js.undefined)
      
      inline def setGetTargetFilepath(
        value: (/* filepath */ String, /* outputTemplate */ String, /* rootFolder */ String) => js.UndefOr[String]
      ): Self = StObject.set(x, "getTargetFilepath", js.Any.fromFunction3(value))
      
      inline def setGetTargetFilepathUndefined: Self = StObject.set(x, "getTargetFilepath", js.undefined)
      
      inline def setHelpers(value: HelperDeclareSpec | ProjectHelpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      inline def setHtmlWebpackPlugin(value: Options | typings.htmlWebpackPlugin.mod.^): Self = StObject.set(x, "htmlWebpackPlugin", value.asInstanceOf[js.Any])
      
      inline def setHtmlWebpackPluginUndefined: Self = StObject.set(x, "htmlWebpackPlugin", js.undefined)
      
      inline def setOnBeforeAddPartials(value: (/* Handlebars */ RuntimeOptions, /* partialsMap */ PartialsMap) => Any): Self = StObject.set(x, "onBeforeAddPartials", js.Any.fromFunction2(value))
      
      inline def setOnBeforeAddPartialsUndefined: Self = StObject.set(x, "onBeforeAddPartials", js.undefined)
      
      inline def setOnBeforeCompile(value: (/* Handlebars */ RuntimeOptions, /* templateContent */ String) => Any): Self = StObject.set(x, "onBeforeCompile", js.Any.fromFunction2(value))
      
      inline def setOnBeforeCompileUndefined: Self = StObject.set(x, "onBeforeCompile", js.undefined)
      
      inline def setOnBeforeRender(value: (/* Handlebars */ RuntimeOptions, /* data */ js.Object, /* filename */ String) => Any): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction3(value))
      
      inline def setOnBeforeRenderUndefined: Self = StObject.set(x, "onBeforeRender", js.undefined)
      
      inline def setOnBeforeSave(value: (/* Handlebars */ RuntimeOptions, /* resultHtml */ String, /* filename */ String) => Any): Self = StObject.set(x, "onBeforeSave", js.Any.fromFunction3(value))
      
      inline def setOnBeforeSaveUndefined: Self = StObject.set(x, "onBeforeSave", js.undefined)
      
      inline def setOnBeforeSetup(value: /* Handlebars */ RuntimeOptions => Any): Self = StObject.set(x, "onBeforeSetup", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSetupUndefined: Self = StObject.set(x, "onBeforeSetup", js.undefined)
      
      inline def setOnDone(value: (/* Handlebars */ RuntimeOptions, /* filename */ String) => Any): Self = StObject.set(x, "onDone", js.Any.fromFunction2(value))
      
      inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPartials(value: js.Array[String]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
      
      inline def setPartialsVarargs(value: String*): Self = StObject.set(x, "partials", js.Array(value*))
    }
  }
}
