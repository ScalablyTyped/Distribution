package typings.koaEjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.ejs.anon.Optionsasyncfalse
import typings.ejs.anon.Optionsasyncfalseundefine
import typings.ejs.anon.OptionsasyncfalseundefineAsync
import typings.ejs.anon.Optionsasyncneverundefine
import typings.ejs.anon.Optionsasynctrue
import typings.ejs.anon.Optionsasynctrueclientfal
import typings.ejs.anon.Optionsasynctrueclienttru
import typings.ejs.anon.ToString
import typings.ejs.mod.AsyncClientFunction
import typings.ejs.mod.AsyncTemplateFunction
import typings.ejs.mod.Cache_
import typings.ejs.mod.ClientFunction
import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.ejs.mod.RenderFileCallback
import typings.ejs.mod.TemplateFunction
import typings.ejs.mod.fileLoader
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koaEjs.koaEjsBooleans.`false`
import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *  Adds render method to the app context.
    */
  inline def apply(app: typings.koa.mod.^[DefaultState, DefaultContext], settings: Settings): Unit = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("koa-ejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The ejs API.
    */
  /**
    * The ejs API.
    */
  object ejs {
    
    @JSImport("koa-ejs", "ejs")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("koa-ejs", "ejs.Template")
    @js.native
    open class Template protected ()
      extends typings.ejs.mod.Template {
      def this(text: String) = this()
    }
    @JSImport("koa-ejs", "ejs.Template")
    @js.native
    def Template: Any | (Instantiable1[/* text */ String, typings.ejs.mod.Template]) = js.native
    inline def Template_=(x: Any | (Instantiable1[/* text */ String, typings.ejs.mod.Template])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
    
    @JSImport("koa-ejs", "ejs.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSImport("koa-ejs", "ejs.cache")
    @js.native
    def cache: Cache_ = js.native
    inline def cache_=(x: Cache_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    @JSImport("koa-ejs", "ejs.closeDelimiter")
    @js.native
    def closeDelimiter: String = js.native
    inline def closeDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeDelimiter")(x.asInstanceOf[js.Any])
    
    inline def compile(template: String): TemplateFunction | AsyncTemplateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFunction | AsyncTemplateFunction]
    inline def compile(template: String, opts: Optionsasyncfalseundefine): TemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TemplateFunction]
    inline def compile(template: String, opts: OptionsasyncfalseundefineAsync): ClientFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClientFunction]
    inline def compile(template: String, opts: Optionsasynctrueclientfal): AsyncTemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncTemplateFunction]
    inline def compile(template: String, opts: Optionsasynctrueclienttru): AsyncClientFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncClientFunction]
    inline def compile(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TemplateFunction | AsyncTemplateFunction]
    
    inline def compile_ClientFunction(template: String): ClientFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[ClientFunction]
    
    inline def compile_TemplateFunction(template: String): TemplateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFunction]
    
    @JSImport("koa-ejs", "ejs.delimiter")
    @js.native
    def delimiter: js.UndefOr[String] = js.native
    inline def delimiter_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    inline def escapeXML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")().asInstanceOf[String]
    inline def escapeXML(markup: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(markup.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("koa-ejs", "ejs.fileLoader")
    @js.native
    def fileLoader: typings.ejs.mod.fileLoader = js.native
    inline def fileLoader(path: String): String | ToString = ^.asInstanceOf[js.Dynamic].applyDynamic("fileLoader")(path.asInstanceOf[js.Any]).asInstanceOf[String | ToString]
    inline def fileLoader_=(x: fileLoader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileLoader")(x.asInstanceOf[js.Any])
    
    @JSImport("koa-ejs", "ejs.localsName")
    @js.native
    def localsName: String = js.native
    inline def localsName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localsName")(x.asInstanceOf[js.Any])
    
    @JSImport("koa-ejs", "ejs.name")
    @js.native
    val name: typings.koaEjs.koaEjsStrings.ejs = js.native
    
    @JSImport("koa-ejs", "ejs.openDelimiter")
    @js.native
    def openDelimiter: String = js.native
    inline def openDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openDelimiter")(x.asInstanceOf[js.Any])
    
    @JSImport("koa-ejs", "ejs.promiseImpl")
    @js.native
    def promiseImpl: js.UndefOr[PromiseConstructorLike] = js.native
    inline def promiseImpl_=(x: js.UndefOr[PromiseConstructorLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promiseImpl")(x.asInstanceOf[js.Any])
    
    inline def render(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def render(template: String, data: Unit, opts: Optionsasyncfalse): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Unit, opts: Optionsasyncneverundefine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Unit, opts: Optionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def render(template: String, data: Unit, opts: Options): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    inline def render(template: String, data: Data): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Data, opts: Optionsasyncfalse): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Data, opts: Optionsasyncneverundefine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Data, opts: Optionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def render(template: String, data: Data, opts: Options): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    
    inline def renderFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def renderFile(path: String, data: Unit, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def renderFile(path: String, data: Data): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def renderFile(path: String, data: Data, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def renderFile[T](path: String, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def renderFile[T](path: String, data: Data, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def renderFile[T](path: String, data: Data, opts: Options, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def render_Union(template: String): String | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String | js.Promise[String]]
    inline def render_Union(template: String, data: Data): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    
    inline def resolveInclude(name: String, filename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInclude")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def resolveInclude(name: String, filename: String, isDir: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInclude")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], isDir.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait Settings extends StObject {
    
    /** When true, EJS will use an async function for rendering. Depends on async/await support in the JS runtime */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** Cache compiled templates */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** Log debug messages. */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** Character to use with angle brackets for open / close (default %). */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /** Global layout file, default is layout, set false to disable layout. */
    var layout: js.UndefOr[String | `false`] = js.undefined
    
    /** View root directory */
    var root: String
    
    /** Filename extension for the views. Defaults to html. */
    var viewExt: js.UndefOr[String] = js.undefined
    
    /** When false, EJS  will only return the HTML, not write to the resposne. Defaults to true */
    var writeResp: js.UndefOr[Boolean] = js.undefined
  }
  object Settings {
    
    inline def apply(root: String): Settings = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setLayout(value: String | `false`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setViewExt(value: String): Self = StObject.set(x, "viewExt", value.asInstanceOf[js.Any])
      
      inline def setViewExtUndefined: Self = StObject.set(x, "viewExt", js.undefined)
      
      inline def setWriteResp(value: Boolean): Self = StObject.set(x, "writeResp", value.asInstanceOf[js.Any])
      
      inline def setWriteRespUndefined: Self = StObject.set(x, "writeResp", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait ExtendableContext extends StObject {
      
      /** Properties values can be of any format; e.g. string, number, boolean, or even nested objects of these types */
      def render(template: String): js.Promise[String] = js.native
      def render(template: String, properties: StringDictionary[Any]): js.Promise[String] = js.native
    }
  }
}
