package typings.hapiVision

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiVision.anon.Context
import typings.hapiVision.hapiVisionStrings.async
import typings.hapiVision.hapiVisionStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/vision", JSImport.Namespace)
  @js.native
  val ^ : Plugin[ServerViewsConfiguration] = js.native
  
  /**
    * Options passed to module when compiling template.
    * Cast your options to this interface or extend it with:
    *      declare module '@hapi/hapi' {
    *          interface CompileOptions {
    *              noEscape: boolean;
    *          }
    *      }
    */
  type CompileOptions = js.Object
  
  type EngineConfigurationObject = js.Object
  
  trait EnginesConfiguration extends StObject {
    
    /** defines the default filename extension to append to template names when multiple engines are configured and no explicit extension is provided for a given template. No default value. */
    var defaultExtension: js.UndefOr[String] = js.undefined
    
    /**
      * Required object where each key is a file extension (e.g. 'html', 'hbr'), mapped to the npm module used for rendering the templates.
      * Alternatively, the extension can be mapped to an object
      */
    var engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions
  }
  object EnginesConfiguration {
    
    inline def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions): EnginesConfiguration = {
      val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnginesConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnginesConfiguration] (val x: Self) extends AnyVal {
      
      inline def setDefaultExtension(value: String): Self = StObject.set(x, "defaultExtension", value.asInstanceOf[js.Any])
      
      inline def setDefaultExtensionUndefined: Self = StObject.set(x, "defaultExtension", js.undefined)
      
      inline def setEngines(value: StringDictionary[NpmModule] | ServerViewsEnginesOptions): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The npm module used for rendering the templates. The module object must contain the compile() function
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
    */
  trait NpmModule extends StObject {
    
    /**
      * The rendering function. The required function signature depends on the compileMode settings
      */
    var compile: ServerViewCompile
    
    /**
      * Initializes additional engine state.The config object is the engine configuration object allowing updates to be made.
      * This is useful for engines like Nunjucks that rely on additional state for rendering. next has the signature function(err).
      */
    var prepare: js.UndefOr[
        js.Function2[
          /* config */ EngineConfigurationObject, 
          /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Registers a helper for use during template rendering.
      * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
      */
    var registerHelper: js.UndefOr[
        js.Function2[/* name */ String, /* helper */ js.Function1[/* repeated */ Any, Any], Unit]
      ] = js.undefined
    
    /**
      * Registers a partial for use during template rendering.
      * The name is the partial path that templates should use to reference the partial and src is the uncompiled template string for the partial.
      */
    var registerPartial: js.UndefOr[js.Function2[/* name */ String, /* src */ String, Unit]] = js.undefined
  }
  object NpmModule {
    
    inline def apply(compile: ServerViewCompile): NpmModule = {
      val __obj = js.Dynamic.literal(compile = compile.asInstanceOf[js.Any])
      __obj.asInstanceOf[NpmModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NpmModule] (val x: Self) extends AnyVal {
      
      inline def setCompile(value: ServerViewCompile): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
      
      inline def setCompileFunction2(
        value: (/* template */ String, /* options */ Any) => js.Function2[/* context */ Any, /* options */ Any, Unit]
      ): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
      
      inline def setCompileFunction3(value: (/* template */ String, /* options */ Any, /* next */ ServerViewCompileNext) => Unit): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
      
      inline def setPrepare(
        value: (/* config */ EngineConfigurationObject, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
      
      inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
      
      inline def setRegisterHelper(value: (/* name */ String, /* helper */ js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "registerHelper", js.Any.fromFunction2(value))
      
      inline def setRegisterHelperUndefined: Self = StObject.set(x, "registerHelper", js.undefined)
      
      inline def setRegisterPartial(value: (/* name */ String, /* src */ String) => Unit): Self = StObject.set(x, "registerPartial", js.Any.fromFunction2(value))
      
      inline def setRegisterPartialUndefined: Self = StObject.set(x, "registerPartial", js.undefined)
    }
  }
  
  /**
    * Renders a template
    * @param template - the template filename and path, relative to the views manager templates path (path or relativeTo).
    * @param context - optional object used by the template to render context-specific result. Defaults to no context ({}).
    * @param options - optional object used to override the views manager configuration.
    */
  type RenderMethod = js.Function3[
    /* template */ String, 
    /* context */ js.UndefOr[Any], 
    /* options */ js.UndefOr[ServerViewsConfiguration], 
    js.Promise[String]
  ]
  
  type RuntimeOptions = js.Object
  
  type ServerViewCompile = ServerViewCompileSync | ServerViewCompileAsync
  
  type ServerViewCompileAsync = js.Function3[/* template */ String, /* options */ Any, /* next */ ServerViewCompileNext, Unit]
  
  type ServerViewCompileNext = js.Function2[
    /* err */ js.Error | Null, 
    /* compiled */ js.Function3[
      /* context */ Any, 
      /* options */ Any, 
      /* callback */ js.Function2[/* err */ Null | js.Error, /* rendered */ String | Null, Unit], 
      Unit
    ], 
    Unit
  ]
  
  /**
    * The rendering function. The required function signature depends on the compileMode settings (see below).
    *
    * If compileMode is 'sync', the signature is compile(template, options),
    * the return value is a function with signature function(context, options) (the compiled sync template),
    * and the method is allowed to throw errors.
    *
    * If compileMode is 'async',
    * the signature is compile(template, options, next) where next has the signature function(err, compiled),
    * compiled is a function with signature function(context, options, callback) (the compiled async template)
    * and callback has the signature function(err, rendered).
    */
  type ServerViewCompileSync = js.Function2[
    /* template */ String, 
    /* options */ Any, 
    js.Function2[/* context */ Any, /* options */ Any, Unit]
  ]
  
  trait ServerViewsConfiguration
    extends StObject
       with ViewHandlerOrReplyOptions
       with EnginesConfiguration {
    
    /**
      * The directory path, or array of directory paths, where helpers are located.
      * Helpers are functions used within templates to perform transformations and other data manipulations using the template context or other inputs.
      * Each '.js' file in the helpers directory is loaded and the file name is used as the helper name.
      * The files must export a single method with the signature function(context) and return a string.
      * Sub-folders are not supported and are ignored. Defaults to no helpers support (empty path).
      * Note that jade does not support loading helpers this way.
      */
    var helpersPath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** if set to false, templates will not be cached (thus will be read from file on every use). Defaults to true. */
    var isCached: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The root file path, or array of file paths, where partials are located.
      * Partials are small segments of template code that can be nested and reused throughout other templates.
      * Defaults to no partials support (empty path).
      */
    var partialsPath: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ServerViewsConfiguration {
    
    inline def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions): ServerViewsConfiguration = {
      val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerViewsConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerViewsConfiguration] (val x: Self) extends AnyVal {
      
      inline def setHelpersPath(value: String | js.Array[String]): Self = StObject.set(x, "helpersPath", value.asInstanceOf[js.Any])
      
      inline def setHelpersPathUndefined: Self = StObject.set(x, "helpersPath", js.undefined)
      
      inline def setHelpersPathVarargs(value: String*): Self = StObject.set(x, "helpersPath", js.Array(value*))
      
      inline def setIsCached(value: Boolean): Self = StObject.set(x, "isCached", value.asInstanceOf[js.Any])
      
      inline def setIsCachedUndefined: Self = StObject.set(x, "isCached", js.undefined)
      
      inline def setPartialsPath(value: String | js.Array[String]): Self = StObject.set(x, "partialsPath", value.asInstanceOf[js.Any])
      
      inline def setPartialsPathUndefined: Self = StObject.set(x, "partialsPath", js.undefined)
      
      inline def setPartialsPathVarargs(value: String*): Self = StObject.set(x, "partialsPath", js.Array(value*))
    }
  }
  
  /**
    * Includes `module` and any of the views options listed below (@see ServerViewsAdditionalOptions) (except defaultExtension) to override the defaults for a specific engine.
    */
  trait ServerViewsEnginesOptions
    extends StObject
       with ServerViewsConfiguration {
    
    /**
      * The npm module used for rendering the templates. The module object must contain the compile() function
      * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
      */
    var module: NpmModule
  }
  object ServerViewsEnginesOptions {
    
    inline def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions, module: NpmModule): ServerViewsEnginesOptions = {
      val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerViewsEnginesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerViewsEnginesOptions] (val x: Self) extends AnyVal {
      
      inline def setModule(value: NpmModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler} > options for the list of attributes it can not have (isCached, partialsPath, helpersPath)
    */
  trait ViewHandlerOrReplyOptions extends StObject {
    
    /** if set to true, allows absolute template paths passed to reply.view(). Defaults to false. */
    var allowAbsolutePaths: js.UndefOr[Boolean] = js.undefined
    
    /** if set to true, allows template paths passed to reply.view() to contain '../'. Defaults to false. */
    var allowInsecureAccess: js.UndefOr[Boolean] = js.undefined
    
    /** specify whether the engine compile() method is 'sync' or 'async'. Defaults to 'sync'. */
    var compileMode: js.UndefOr[sync | async] = js.undefined
    
    /** options object passed to the engine's compile function. Defaults to empty options {}. */
    var compileOptions: js.UndefOr[CompileOptions] = js.undefined
    
    /** the content type of the engine results. Defaults to 'text/html'. */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * A global context used with all templates.
      * The global context option can be either an object or a function that takes the request as its only argument and returns a context object.
      * The request object is only provided when using the view handler or reply.view().
      * When using server.render() or request.render(), the request argument will be null.
      * When rendering views, the global context will be merged with any context object specified on the handler or using reply.view().
      * When multiple context objects are used, values from the global context always have lowest precedence.
      */
    var context: js.UndefOr[js.Object | (js.Function1[/* request */ Request[ReqRefDefaults], js.Object])] = js.undefined
    
    /** the text encoding used by the templates when reading the files and outputting the result. Defaults to 'utf8'. */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true or a layout filename, layout support is enabled.
      * A layout is a single template file used as the parent template for other view templates in the same engine.
      * If true, the layout template name must be 'layout.ext' where 'ext' is the engine's extension.
      * Otherwise, the provided filename is suffixed with the engine's extension and loaded.
      * Disable layout when using Jade as it will handle including any layout files independently.
      * Defaults to false.
      */
    var layout: js.UndefOr[Boolean | String] = js.undefined
    
    /** the key used by the template engine to denote where primary template content should go. Defaults to 'content'. */
    var layoutKeyword: js.UndefOr[String] = js.undefined
    
    /** the root file path, or array of file paths, where layout templates are located (using the relativeTo prefix if present). Defaults to path. */
    var layoutPath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** the root file path, or array of file paths, used to resolve and load the templates identified when calling reply.view(). Defaults to current working directory. */
    var path: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * a base path used as prefix for path and partialsPath. No default.
      */
    var relativeTo: js.UndefOr[String] = js.undefined
    
    /** options object passed to the returned function from the compile operation. Defaults to empty options {}. */
    var runtimeOptions: js.UndefOr[RuntimeOptions] = js.undefined
  }
  object ViewHandlerOrReplyOptions {
    
    inline def apply(): ViewHandlerOrReplyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewHandlerOrReplyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewHandlerOrReplyOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowAbsolutePaths(value: Boolean): Self = StObject.set(x, "allowAbsolutePaths", value.asInstanceOf[js.Any])
      
      inline def setAllowAbsolutePathsUndefined: Self = StObject.set(x, "allowAbsolutePaths", js.undefined)
      
      inline def setAllowInsecureAccess(value: Boolean): Self = StObject.set(x, "allowInsecureAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowInsecureAccessUndefined: Self = StObject.set(x, "allowInsecureAccess", js.undefined)
      
      inline def setCompileMode(value: sync | async): Self = StObject.set(x, "compileMode", value.asInstanceOf[js.Any])
      
      inline def setCompileModeUndefined: Self = StObject.set(x, "compileMode", js.undefined)
      
      inline def setCompileOptions(value: CompileOptions): Self = StObject.set(x, "compileOptions", value.asInstanceOf[js.Any])
      
      inline def setCompileOptionsUndefined: Self = StObject.set(x, "compileOptions", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setContext(value: js.Object | (js.Function1[/* request */ Request[ReqRefDefaults], js.Object])): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextFunction1(value: /* request */ Request[ReqRefDefaults] => js.Object): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLayout(value: Boolean | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutKeyword(value: String): Self = StObject.set(x, "layoutKeyword", value.asInstanceOf[js.Any])
      
      inline def setLayoutKeywordUndefined: Self = StObject.set(x, "layoutKeyword", js.undefined)
      
      inline def setLayoutPath(value: String | js.Array[String]): Self = StObject.set(x, "layoutPath", value.asInstanceOf[js.Any])
      
      inline def setLayoutPathUndefined: Self = StObject.set(x, "layoutPath", js.undefined)
      
      inline def setLayoutPathVarargs(value: String*): Self = StObject.set(x, "layoutPath", js.Array(value*))
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRelativeTo(value: String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
      
      inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
      
      inline def setRuntimeOptions(value: RuntimeOptions): Self = StObject.set(x, "runtimeOptions", value.asInstanceOf[js.Any])
      
      inline def setRuntimeOptionsUndefined: Self = StObject.set(x, "runtimeOptions", js.undefined)
    }
  }
  
  /**
    * View Manager
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#view-manager}
    */
  trait ViewManager extends StObject {
    
    /**
      * Registers a helper, on all configured engines that have a registerHelper() method, for use during template rendering.
      * Engines without a registerHelper() method will be skipped.
      * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
      * @param name
      * @param helper
      * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerregisterhelpername-helper}
      */
    def registerHelper(name: String, helper: js.Function1[/* repeated */ Any, Any]): Unit
    
    /**
      * Renders a template. This is typically not needed and it is usually more convenient to use server.render().
      * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerrendertemplate-context-options-callback}
      */
    def render(template: String): js.Promise[String]
    def render(template: String, context: Any): js.Promise[String]
    def render(template: String, context: Any, options: ServerViewsConfiguration): js.Promise[String]
    def render(template: String, context: Unit, options: ServerViewsConfiguration): js.Promise[String]
    /**
      * Renders a template. This is typically not needed and it is usually more convenient to use server.render().
      * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerrendertemplate-context-options-callback}
      */
    @JSName("render")
    var render_Original: RenderMethod
  }
  object ViewManager {
    
    inline def apply(
      registerHelper: (String, js.Function1[/* repeated */ Any, Any]) => Unit,
      render: (/* template */ String, /* context */ js.UndefOr[Any], /* options */ js.UndefOr[ServerViewsConfiguration]) => js.Promise[String]
    ): ViewManager = {
      val __obj = js.Dynamic.literal(registerHelper = js.Any.fromFunction2(registerHelper), render = js.Any.fromFunction3(render))
      __obj.asInstanceOf[ViewManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewManager] (val x: Self) extends AnyVal {
      
      inline def setRegisterHelper(value: (String, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "registerHelper", js.Any.fromFunction2(value))
      
      inline def setRender(
        value: (/* template */ String, /* context */ js.UndefOr[Any], /* options */ js.UndefOr[ServerViewsConfiguration]) => js.Promise[String]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    }
  }
  
  type _To = Plugin[ServerViewsConfiguration]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[ServerViewsConfiguration] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait HandlerDecorations extends StObject {
      
      /**
        * The view handler can be used with routes registered in the same realm as the view manager.
        * The handler takes an options parameter that can be either a string or an object.
        * When the options parameter is a string, it should be the filename and path of the template relative
        * to the templates path configured via the views manager. When the options parameter is an object, it may have the following keys:
        * The rendering context contains the `params`, `payload`, `query`, and `pre` values from the request by default
        * (these can be overriden by values explicitly set via the options).
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler}
        */
      var view: js.UndefOr[String | Context] = js.undefined
    }
    object HandlerDecorations {
      
      inline def apply(): HandlerDecorations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HandlerDecorations]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
        
        inline def setView(value: String | Context): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      }
    }
    
    trait Request extends StObject {
      
      /**
        * Returns the closest views manager to your realm (either on your realm or inherited from an ancestor realm)
        *
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#requestgetviewsmanager}
        */
      def getViewsManager(): ViewManager
      
      /**
        * request.render() works the same way as server.render() but is for use inside of request handlers.
        * server.render() does not work inside request handlers when called via request.server.render() if the view manager was created by a plugin.
        * This is because the request.server object does not have access to the plugin realm where the view manager was configured.
        * request.render() gets its realm from the route that the request was bound to.
        * Note that this will not work in onRequest extensions added by the plugin because the route isn't yet set at this point in the request
        * lifecycle and the request.render() method will produce the same limited results server.render() can.
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#requestrendertemplate-context-options-callback}
        */
      def render(template: String): js.Promise[String]
      def render(template: String, context: Any): js.Promise[String]
      def render(template: String, context: Any, options: ServerViewsConfiguration): js.Promise[String]
      def render(template: String, context: Unit, options: ServerViewsConfiguration): js.Promise[String]
      /**
        * request.render() works the same way as server.render() but is for use inside of request handlers.
        * server.render() does not work inside request handlers when called via request.server.render() if the view manager was created by a plugin.
        * This is because the request.server object does not have access to the plugin realm where the view manager was configured.
        * request.render() gets its realm from the route that the request was bound to.
        * Note that this will not work in onRequest extensions added by the plugin because the route isn't yet set at this point in the request
        * lifecycle and the request.render() method will produce the same limited results server.render() can.
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#requestrendertemplate-context-options-callback}
        */
      @JSName("render")
      var render_Original: RenderMethod
    }
    object Request {
      
      inline def apply(
        getViewsManager: () => ViewManager,
        render: (/* template */ String, /* context */ js.UndefOr[Any], /* options */ js.UndefOr[ServerViewsConfiguration]) => js.Promise[String]
      ): typings.hapiVision.mod.hapiHapiAugmentingMod.Request = {
        val __obj = js.Dynamic.literal(getViewsManager = js.Any.fromFunction0(getViewsManager), render = js.Any.fromFunction3(render))
        __obj.asInstanceOf[typings.hapiVision.mod.hapiHapiAugmentingMod.Request]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.hapiVision.mod.hapiHapiAugmentingMod.Request] (val x: Self) extends AnyVal {
        
        inline def setGetViewsManager(value: () => ViewManager): Self = StObject.set(x, "getViewsManager", js.Any.fromFunction0(value))
        
        inline def setRender(
          value: (/* template */ String, /* context */ js.UndefOr[Any], /* options */ js.UndefOr[ServerViewsConfiguration]) => js.Promise[String]
        ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      }
    }
    
    @js.native
    trait ResponseToolkit extends StObject {
      
      /**
        * Returns the closest views manager to your realm (either on your realm or inherited from an ancestor realm)
        *
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#hgetviewsmanager}
        */
      def getViewsManager(): ViewManager = js.native
      
      /**
        * Concludes the handler activity by returning control over to the router with a templatized view response
        * Returns a response object. The generated response will have the variety property set to view.
        * The response flow control rules apply.
        * @param template  the template filename and path, relative to the templates path configured via the server views manager.
        * @param context  optional object used by the template to render context-specific result. Defaults to no context {}.
        * @param options  optional object used to override the server's views manager configuration for this response.
        *                 Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#replyviewtemplate-context-options}
        */
      def view(templatePath: String): ResponseObject = js.native
      def view(templatePath: String, context: Any): ResponseObject = js.native
      def view(templatePath: String, context: Any, options: ViewHandlerOrReplyOptions): ResponseObject = js.native
      def view(templatePath: String, context: Unit, options: ViewHandlerOrReplyOptions): ResponseObject = js.native
    }
    
    trait Server extends StObject {
      
      /**
        * Returns the closest views manager to your realm (either on your realm or inherited from an ancestor realm)
        *
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#servergetviewsmanager}
        */
      def getViewsManager(): ViewManager
      
      /**
        * Utilizes the server views manager to render a template
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
        */
      def render(template: String): js.Promise[String]
      def render(template: String, context: Any): js.Promise[String]
      def render(template: String, context: Any, options: ServerViewsConfiguration): js.Promise[String]
      def render(template: String, context: Unit, options: ServerViewsConfiguration): js.Promise[String]
      /**
        * Utilizes the server views manager to render a template
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
        */
      @JSName("render")
      var render_Original: RenderMethod
      
      /**
        * Initializes the server views manager
        * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions}
        */
      def views(options: ServerViewsConfiguration): ViewManager
    }
    object Server {
      
      inline def apply(
        getViewsManager: () => ViewManager,
        render: (/* template */ String, /* context */ js.UndefOr[Any], /* options */ js.UndefOr[ServerViewsConfiguration]) => js.Promise[String],
        views: ServerViewsConfiguration => ViewManager
      ): Server = {
        val __obj = js.Dynamic.literal(getViewsManager = js.Any.fromFunction0(getViewsManager), render = js.Any.fromFunction3(render), views = js.Any.fromFunction1(views))
        __obj.asInstanceOf[Server]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
        
        inline def setGetViewsManager(value: () => ViewManager): Self = StObject.set(x, "getViewsManager", js.Any.fromFunction0(value))
        
        inline def setRender(
          value: (/* template */ String, /* context */ js.UndefOr[Any], /* options */ js.UndefOr[ServerViewsConfiguration]) => js.Promise[String]
        ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
        
        inline def setViews(value: ServerViewsConfiguration => ViewManager): Self = StObject.set(x, "views", js.Any.fromFunction1(value))
      }
    }
  }
}
