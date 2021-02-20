package typings.jsrender

import org.scalablytyped.runtime.StringDictionary
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsViews {
  
  @js.native
  trait Context
    extends /* prop */ StringDictionary[js.Any] {
    
    /* Ancestor tags */
    var parentTags: js.UndefOr[Hash[Tag]] = js.native
    
    /* ctx object */
    /* Root data object or array */
    var root: js.Any = js.native
    
    /* This tag */
    var tag: js.UndefOr[Tag] = js.native
    
    /* tagCtx object */
    var tagCtx: js.UndefOr[js.Any] = js.native
  }
  object Context {
    
    @scala.inline
    def apply(root: js.Any): Context = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParentTags(value: Hash[Tag]): Self = StObject.set(x, "parentTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTagsUndefined: Self = StObject.set(x, "parentTags", js.undefined)
      
      @scala.inline
      def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagCtx(value: js.Any): Self = StObject.set(x, "tagCtx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagCtxUndefined: Self = StObject.set(x, "tagCtx", js.undefined)
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  // Converters
  type Converter = js.Function2[/* value */ js.Any, /* repeated */ js.Any, js.Any]
  
  /* Generic hash of objects of type T */
  type Hash[T] = StringDictionary[T]
  
  @js.native
  trait LinkCtx extends StObject
  
  /* $.views.settings*/
  @js.native
  trait Settings extends StObject {
    
    /**
      * Get advanced settings
      * advancedSettings = $.views.settings.advanced()
      *
      * @returns {object}
      */
    def advanced(): Hash[_] = js.native
    /**
      * Set advanced settings (useViews, _jsv ...)
      * $.views.settings.advanced({useViews: true})
      *
      * @param {object}  settings
      * @returns {Settings}
      */
    def advanced(settings: Hash[_]): Settings = js.native
    
    /**
      * Get allowCode mode setting
      * allowCode = $.views.settings.allowCode()
      *
      * @returns {boolean}
      */
    def allowCode(): Boolean = js.native
    /**
      * Set allowCode mode
      * $.views.settings.allowCode(true)
      *
      * @param {boolean}  allowCode
      * @returns {Settings}
      */
    def allowCode(allowCode: Boolean): Settings = js.native
    
    /**
      * Get debug mode setting
      * debugMode = $.views.settings.debugMode()
      *
      * @returns {boolean}
      */
    def debugMode(): Boolean = js.native
    def debugMode(
      debugMode: js.Function3[
          /* e */ js.UndefOr[js.Any], 
          /* fallback */ js.UndefOr[String], 
          /* view */ js.UndefOr[View], 
          _
        ]
    ): Settings = js.native
    /**
    	 * Set debug mode
    	 * $.views.settings.debugMode(true)
    	 *
    	 * @param {boolean}  debugMode
    	 * @returns {Settings}
    	 */
    def debugMode(debugMode: Boolean): Settings = js.native
    
    /**
    	 * Get delimiters
    	 * delimsArray = $.views.settings.delimiters()
    	 *
    	 * @returns {string[]}
    	 */
    def delimiters(): js.Array[String] = js.native
    def delimiters(chars: js.Array[String]): Settings = js.native
    /**
    	 * Set delimiters
    	 * $.views.settings.delimiters(...)
    	 *
    	 * @param {string}   openChars
    	 * @param {string}   [closeChars]
    	 * @param {string}   [link]
    	 * @returns {Settings}
    	 */
    def delimiters(openChars: String): Settings = js.native
    def delimiters(openChars: String, closeChars: js.UndefOr[scala.Nothing], link: String): Settings = js.native
    def delimiters(openChars: String, closeChars: String): Settings = js.native
    def delimiters(openChars: String, closeChars: String, link: String): Settings = js.native
  }
  
  @js.native
  trait Store[T, TO]
    extends // Multiple named items
  /**
  	 * var template = $.templates.templateName; // Get compiled named template - or similar for named tags, converters, helpers, viewModels
  	 */
  /* itemName */ StringDictionary[T] {
    
    // named item
    def apply(namedItems: Hash[TO]): Views = js.native
    def apply(namedItems: Hash[TO], parentTmpl: Template): Views = js.native
    /**
    	 * Generic store() function to register item, named item, or hash of items
    	 * Also used as hash to store the registered items
    	 * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    	 *
    	 * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    	 * @param {any}           [item]       (e.g. markup for named template)
    	 * @param {Template}      [parentTmpl] For item being registered as private resource of template
    	 * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    	 */
    def apply(name: String): T = js.native
    def apply(name: String, item: TO): T = js.native
    def apply(name: String, item: TO, parentTmpl: Template): T = js.native
    def apply(name: String, item: js.UndefOr[scala.Nothing], parentTmpl: Template): T = js.native
  }
  
  @js.native
  trait Tag extends TagOptionProps {
    
    var base: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var baseApply: js.UndefOr[js.Function1[/* args */ js.Array[_] | IArguments, _]] = js.native
    
    def bndArgs(): js.Array[_] | Unit = js.native
    def bndArgs(elseBlock: Double): js.Array[_] | Unit = js.native
    
    def ctxPrm(name: String): js.Any = js.native
    def ctxPrm(name: String, value: js.Any): js.Any = js.native
    
    // get/set in JsViews but get only in JsRender
    def cvtArgs(): js.Array[_] | Unit = js.native
    def cvtArgs(elseBlock: Double): js.Array[_] | Unit = js.native
    
    var parent: js.UndefOr[Tag] = js.native
    
    var parents: js.UndefOr[Hash[Tag]] = js.native
    
    var rendering: js.UndefOr[Hash[_]] = js.native
    
    /* Tag object */
    var tagCtx: TagCtx = js.native
    
    var tagCtxs: js.Array[TagCtx] = js.native
    
    var tagName: String = js.native
  }
  
  @js.native
  trait TagCtx extends StObject {
    
    /* tagCtx object */
    /* Arguments passed declaratively */
    var args: js.Array[_] = js.native
    
    /* tagCtx.bndArgs() method */
    def bndArgs(): js.Array[_] | Unit = js.native
    
    /**
    	 * Template render method: render the template as a string, using the specified data and helpers/context
    	 * var htmlString = template(data, myHelpersObject);
    	 * var htmlString = template.render(data, myHelpersObject);
    	 *
    	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
    	 *
    	 * @param {any}        data
    	 * @param {hash}       [helpersOrContext]
    	 * @param {boolean}    [noIteration]
    	 * @returns {string}   rendered template
    	 */
    /* Template for wrapped content, or else external template. Otherwise, false */
    def content(): String = js.native
    def content(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def content(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
    def content(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def content(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def content(data: js.Any): String = js.native
    def content(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def content(data: js.Any, helpersOrContext: Hash[_]): String = js.native
    def content(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def content(data: js.Any, noIteration: Boolean): String = js.native
    /* Template for wrapped content, or else external template. Otherwise, false */
    @JSName("content")
    var content_Original: Template = js.native
    
    /* View context for tag */
    var ctx: Context = js.native
    
    /* tagCtx.ctxPrm() method */
    def ctxPrm(name: String): js.Any = js.native
    def ctxPrm(name: String, value: js.Any): js.Any = js.native
    
    // get/set in JsViews but get only in JsRender
    /* tagCtx.cvtArgs() method */
    def cvtArgs(): js.Array[_] | Unit = js.native
    
    /* Tag instance index (if siblings rendered against array data) */
    var index: Double = js.native
    
    /* Declarative tag params object */
    var params: TagCtxParams = js.native
    
    /* Properties passed declaratively */
    var props: Hash[_] = js.native
    
    /* Tag render method */
    def render(arguments: js.Any*): String = js.native
    /* Tag render method */
    @JSName("render")
    var render_Original: TagRenderMethod = js.native
    
    /* This tag instance */
    var tag: Tag = js.native
    
    /**
    	 * Template render method: render the template as a string, using the specified data and helpers/context
    	 * var htmlString = template(data, myHelpersObject);
    	 * var htmlString = template.render(data, myHelpersObject);
    	 *
    	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
    	 *
    	 * @param {any}        data
    	 * @param {hash}       [helpersOrContext]
    	 * @param {boolean}    [noIteration]
    	 * @returns {string}   rendered template
    	 */
    /* External tmpl, or else template for wrapped content. Otherwise, false */
    def tmpl(): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def tmpl(data: js.Any): String = js.native
    def tmpl(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def tmpl(data: js.Any, helpersOrContext: Hash[_]): String = js.native
    def tmpl(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def tmpl(data: js.Any, noIteration: Boolean): String = js.native
    /* External tmpl, or else template for wrapped content. Otherwise, false */
    @JSName("tmpl")
    var tmpl_Original: Template = js.native
    
    /* JsViews view containing this tag instance */
    var view: View = js.native
  }
  
  @js.native
  trait TagCtxParams extends StObject {
    
    /* tagCtx.params object */
    var args: js.Array[String] = js.native
    
    var ctx: Hash[String] = js.native
    
    var props: Hash[String] = js.native
  }
  object TagCtxParams {
    
    @scala.inline
    def apply(args: js.Array[String], ctx: Hash[String], props: Hash[String]): TagCtxParams = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCtxParams]
    }
    
    @scala.inline
    implicit class TagCtxParamsMutableBuilder[Self <: TagCtxParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCtx(value: Hash[String]): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Hash[String]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagInst extends Tag {
    
    var template: js.UndefOr[TemplateSetter] = js.native
  }
  
  // Tags
  @js.native
  trait TagOptionProps
    extends /* prop */ StringDictionary[js.Any] {
    
    var argDefault: js.UndefOr[Boolean] = js.native
    
    var baseTag: js.UndefOr[String | Tag] = js.native
    
    var bindFrom: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
    
    var bindTo: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
    
    var contentCtx: js.UndefOr[Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])] = js.native
    
    var convert: js.UndefOr[String | Converter] = js.native
    
    var ctx: js.UndefOr[Hash[_]] = js.native
    
    var flow: js.UndefOr[Boolean] = js.native
    
    /* Properties that can be set as tag options, and retrieved as Tag properties */
    var init: js.UndefOr[
        js.ThisFunction3[
          /* this */ TagInst, 
          /* tagCtx */ js.UndefOr[TagCtx], 
          /* linkCtx */ js.UndefOr[LinkCtx], 
          /* ctx */ js.UndefOr[Context], 
          Unit
        ]
      ] = js.native
    
    var render: js.UndefOr[js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]] = js.native
  }
  object TagOptionProps {
    
    @scala.inline
    def apply(): TagOptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagOptionProps]
    }
    
    @scala.inline
    implicit class TagOptionPropsMutableBuilder[Self <: TagOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgDefault(value: Boolean): Self = StObject.set(x, "argDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgDefaultUndefined: Self = StObject.set(x, "argDefault", js.undefined)
      
      @scala.inline
      def setBaseTag(value: String | Tag): Self = StObject.set(x, "baseTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseTagUndefined: Self = StObject.set(x, "baseTag", js.undefined)
      
      @scala.inline
      def setBindFrom(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "bindFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindFromUndefined: Self = StObject.set(x, "bindFrom", js.undefined)
      
      @scala.inline
      def setBindFromVarargs(value: (Double | String)*): Self = StObject.set(x, "bindFrom", js.Array(value :_*))
      
      @scala.inline
      def setBindTo(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "bindTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindToUndefined: Self = StObject.set(x, "bindTo", js.undefined)
      
      @scala.inline
      def setBindToVarargs(value: (Double | String)*): Self = StObject.set(x, "bindTo", js.Array(value :_*))
      
      @scala.inline
      def setContentCtx(value: Boolean | (js.ThisFunction1[/* this */ TagInst, /* arg0 */ js.Any, _])): Self = StObject.set(x, "contentCtx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentCtxUndefined: Self = StObject.set(x, "contentCtx", js.undefined)
      
      @scala.inline
      def setConvert(value: String | Converter): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertFunction2(value: (/* value */ js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
      
      @scala.inline
      def setCtx(value: Hash[_]): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      @scala.inline
      def setFlow(value: Boolean): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      @scala.inline
      def setInit(
        value: js.ThisFunction3[
              /* this */ TagInst, 
              /* tagCtx */ js.UndefOr[TagCtx], 
              /* linkCtx */ js.UndefOr[LinkCtx], 
              /* ctx */ js.UndefOr[Context], 
              Unit
            ]
      ): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setRender(value: js.ThisFunction1[/* this */ TagInst, /* repeated */ js.Any, String | Unit]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait TagOptions extends TagOptionProps {
    
    /* Tag options hash */
    var template: js.UndefOr[TemplateSetter] = js.native
  }
  object TagOptions {
    
    @scala.inline
    def apply(): TagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagOptions]
    }
    
    @scala.inline
    implicit class TagOptionsMutableBuilder[Self <: TagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: TemplateSetter): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  type TagRenderMethod = js.Function1[/* repeated */ js.Any, String]
  
  type TagSetter = TagOptions | String | (js.Function1[/* repeated */ js.Any, js.Any])
  
  @js.native
  trait Template extends TemplateRender {
    
    var _is: String = js.native
    
    var converters: js.UndefOr[Hash[Converter]] = js.native
    
    var fn: js.UndefOr[js.Function1[/* repeated */ js.Any, String]] = js.native
    
    var helpers: js.UndefOr[Hash[_]] = js.native
    
    var markup: String = js.native
    
    /**
    	 * Template render method: render the template as a string, using the specified data and helpers/context
    	 * var htmlString = template(data, myHelpersObject);
    	 * var htmlString = template.render(data, myHelpersObject);
    	 *
    	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
    	 *
    	 * @param {any}        data
    	 * @param {hash}       [helpersOrContext]
    	 * @param {boolean}    [noIteration]
    	 * @returns {string}   rendered template
    	 */
    def render(): String = js.native
    def render(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def render(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
    def render(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def render(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def render(data: js.Any): String = js.native
    def render(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def render(data: js.Any, helpersOrContext: Hash[_]): String = js.native
    def render(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def render(data: js.Any, noIteration: Boolean): String = js.native
    @JSName("render")
    var render_Original: TemplateRender = js.native
    
    var tags: js.UndefOr[Hash[Tag]] = js.native
    
    var templates: js.UndefOr[Hash[Template]] = js.native
    
    /* Compiled template object */
    var tmplName: String = js.native
    
    var useViews: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait TemplateOptions extends StObject {
    
    var converters: js.UndefOr[Hash[Converter]] = js.native
    
    var helpers: js.UndefOr[Hash[_]] = js.native
    
    var markup: js.Any = js.native
    
    /* Template options hash */
    var tags: js.UndefOr[Hash[TagSetter]] = js.native
    
    var templates: js.UndefOr[Hash[TemplateSetter]] = js.native
    
    var useViews: js.UndefOr[Boolean] = js.native
  }
  object TemplateOptions {
    
    @scala.inline
    def apply(markup: js.Any): TemplateOptions = {
      val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateOptions]
    }
    
    @scala.inline
    implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverters(value: Hash[Converter]): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertersUndefined: Self = StObject.set(x, "converters", js.undefined)
      
      @scala.inline
      def setHelpers(value: Hash[_]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      @scala.inline
      def setMarkup(value: js.Any): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Hash[TagSetter]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTemplates(value: Hash[TemplateSetter]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
      
      @scala.inline
      def setUseViews(value: Boolean): Self = StObject.set(x, "useViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseViewsUndefined: Self = StObject.set(x, "useViews", js.undefined)
    }
  }
  
  @js.native
  trait TemplateRender extends StObject {
    
    /**
    	 * Template render method: render the template as a string, using the specified data and helpers/context
    	 * var htmlString = template(data, myHelpersObject);
    	 * var htmlString = template.render(data, myHelpersObject);
    	 *
    	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
    	 *
    	 * @param {any}        data
    	 * @param {hash}       [helpersOrContext]
    	 * @param {boolean}    [noIteration]
    	 * @returns {string}   rendered template
    	 */
    def apply(): String = js.native
    def apply(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def apply(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
    def apply(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def apply(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def apply(data: js.Any): String = js.native
    def apply(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def apply(data: js.Any, helpersOrContext: Hash[_]): String = js.native
    def apply(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def apply(data: js.Any, noIteration: Boolean): String = js.native
  }
  
  type TemplateSetter = TemplateOptions | String
  
  // Templates
  @js.native
  trait Templates extends Store[Template, TemplateSetter] {
    
    def apply(markupOrSelectorOrOptions: String, parentTmpl: Template): Template = js.native
    def apply(markupOrSelectorOrOptions: TemplateOptions): Template = js.native
    def apply(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template = js.native
  }
  
  @js.native
  trait View extends StObject {
    
    /* Block content template (for block tags) */
    var content: js.UndefOr[Template] = js.native
    
    /* View context (helpers and parameters from parent views) */
    var ctx: Context = js.native
    
    /* view.ctxPrm() method: get/set contextual parameter or helper */
    def ctxPrm(name: String): js.Any = js.native
    def ctxPrm(name: String, value: js.Any): js.Any = js.native
    
    /* contextual data */
    var data: js.Any = js.native
    
    /* view.get() method: find parent or child views */
    def get(): View = js.native
    def get(inner: Boolean): View = js.native
    def get(inner: Boolean, `type`: String): View = js.native
    def get(`type`: String): View = js.native
    
    /* view.getIndex() method: get index of parent "item" view */
    def getIndex(): Double = js.native
    
    // get/set in JsViews but get only in JsRender
    /* Find contextual template resource */
    def getRsc(namedCollection: String, itemName: String): js.Any = js.native
    
    /* Index of this view in parent views collection */
    var index: Double = js.native
    
    /* Parent view */
    var parent: View = js.native
    
    /* root View (top-level) */
    var root: View = js.native
    
    var scope: View = js.native
    
    /* tag (for tag views) */
    var tag: Tag = js.native
    
    /**
    	 * Template render method: render the template as a string, using the specified data and helpers/context
    	 * var htmlString = template(data, myHelpersObject);
    	 * var htmlString = template.render(data, myHelpersObject);
    	 *
    	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
    	 *
    	 * @param {any}        data
    	 * @param {hash}       [helpersOrContext]
    	 * @param {boolean}    [noIteration]
    	 * @returns {string}   rendered template
    	 */
    /* Template rendered by view */
    def tmpl(): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def tmpl(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def tmpl(data: js.Any): String = js.native
    def tmpl(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
    def tmpl(data: js.Any, helpersOrContext: Hash[_]): String = js.native
    def tmpl(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
    def tmpl(data: js.Any, noIteration: Boolean): String = js.native
    /* Template rendered by view */
    @JSName("tmpl")
    var tmpl_Original: Template = js.native
    
    /* View type */
    var `type`: String = js.native
    
    /* Child views */
    var views: js.Array[View] with Hash[View] = js.native
  }
  
  @js.native
  trait ViewModel
    extends /* prop */ StringDictionary[js.Any] {
    
    def apply(args: js.Any*): js.Any = js.native
    
    var extend: Hash[_] = js.native
    
    /* ViewModel options hash */
    var getters: js.Array[String] = js.native
    
    def map(data: js.Any): js.Any = js.native
  }
  
  // ViewModels
  @js.native
  trait ViewModelOptions extends StObject {
    
    var extend: js.UndefOr[Hash[_]] = js.native
    
    /* ViewModel options hash */
    // getters?: string[] | ;
    var getters: js.UndefOr[js.Array[_]] = js.native
    
    var id: js.UndefOr[String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])] = js.native
  }
  object ViewModelOptions {
    
    @scala.inline
    def apply(): ViewModelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewModelOptions]
    }
    
    @scala.inline
    implicit class ViewModelOptionsMutableBuilder[Self <: ViewModelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: Hash[_]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      @scala.inline
      def setGetters(value: js.Array[_]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      @scala.inline
      def setGettersVarargs(value: js.Any*): Self = StObject.set(x, "getters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "id", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait ViewModels extends Hash[ViewModel] {
    
    def apply(namedItems: Hash[ViewModelOptions]): Hash[ViewModel] = js.native
    def apply(namedItems: Hash[ViewModelOptions], viewModels: Hash[ViewModel]): Hash[ViewModel] = js.native
    def apply(name: String, viewModel: ViewModelOptions): ViewModel = js.native
    def apply(name: String, viewModel: ViewModelOptions, viewModels: Hash[ViewModel]): ViewModel = js.native
    /* $.views.viewModels() */
    def apply(viewModel: ViewModelOptions): ViewModel = js.native
  }
  
  /* $.views*/
  @js.native
  trait Views extends StObject {
    
    // named item
    /* $.views.converters() */
    def converters(namedItems: Hash[Converter]): Views = js.native
    def converters(namedItems: Hash[Converter], parentTmpl: Template): Views = js.native
    /**
    	 * Generic store() function to register item, named item, or hash of items
    	 * Also used as hash to store the registered items
    	 * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    	 *
    	 * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    	 * @param {any}           [item]       (e.g. markup for named template)
    	 * @param {Template}      [parentTmpl] For item being registered as private resource of template
    	 * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    	 */
    /* $.views.converters() */
    def converters(name: String): Converter = js.native
    def converters(name: String, item: js.UndefOr[scala.Nothing], parentTmpl: Template): Converter = js.native
    def converters(name: String, item: Converter): Converter = js.native
    def converters(name: String, item: Converter, parentTmpl: Template): Converter = js.native
    /* $.views.converters() */
    @JSName("converters")
    var converters_Original: Store[Converter, Converter] = js.native
    
    // named item
    /* $.views.helpers() */
    def helpers(namedItems: Hash[_]): Views = js.native
    def helpers(namedItems: Hash[_], parentTmpl: Template): Views = js.native
    /**
    	 * Generic store() function to register item, named item, or hash of items
    	 * Also used as hash to store the registered items
    	 * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    	 *
    	 * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    	 * @param {any}           [item]       (e.g. markup for named template)
    	 * @param {Template}      [parentTmpl] For item being registered as private resource of template
    	 * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    	 */
    /* $.views.helpers() */
    def helpers(name: String): js.Any = js.native
    def helpers(name: String, item: js.UndefOr[scala.Nothing], parentTmpl: Template): js.Any = js.native
    def helpers(name: String, item: js.Any): js.Any = js.native
    def helpers(name: String, item: js.Any, parentTmpl: Template): js.Any = js.native
    /* $.views.helpers() */
    @JSName("helpers")
    var helpers_Original: Store[_, _] = js.native
    
    /* $.views.map() */
    def map(any: js.Any): js.Any = js.native
    
    /* $.views.settings */
    var settings: Settings = js.native
    
    /* $.views.sub.xxx */
    var sub: Hash[_] = js.native
    
    // named item
    /* $.views.tags() */
    def tags(namedItems: Hash[TagSetter]): Views = js.native
    def tags(namedItems: Hash[TagSetter], parentTmpl: Template): Views = js.native
    /**
    	 * Generic store() function to register item, named item, or hash of items
    	 * Also used as hash to store the registered items
    	 * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    	 *
    	 * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    	 * @param {any}           [item]       (e.g. markup for named template)
    	 * @param {Template}      [parentTmpl] For item being registered as private resource of template
    	 * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    	 */
    /* $.views.tags() */
    def tags(name: String): Tag = js.native
    def tags(name: String, item: js.UndefOr[TagSetter], parentTmpl: Template): Tag = js.native
    def tags(name: String, item: TagSetter): Tag = js.native
    /* $.views.tags() */
    @JSName("tags")
    var tags_Original: Store[Tag, TagSetter] = js.native
    
    /**
    	 * Additional $.templates() signature for compiling unnamed template
    	 *
    	 * @param {string|TemplateOptions}   markup or selector
    	 * @param {Template}                 [parentTmpl] For compling template as private resource of parent template
    	 * @returns {Template}               compiled template
    	 */
    /* $.views.templates() */
    /**
    	 * Generic store() function to register item, named item, or hash of items
    	 * Also used as hash to store the registered items
    	 * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    	 *
    	 * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    	 * @param {any}           [item]       (e.g. markup for named template)
    	 * @param {Template}      [parentTmpl] For item being registered as private resource of template
    	 * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    	 */
    def templates(markupOrSelectorOrOptions: String): Template = js.native
    def templates(markupOrSelectorOrOptions: String, parentTmpl: Template): Template = js.native
    def templates(markupOrSelectorOrOptions: TemplateOptions): Template = js.native
    def templates(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template = js.native
    // named item
    /* $.views.templates() */
    def templates(namedItems: Hash[TemplateSetter]): Views = js.native
    def templates(namedItems: Hash[TemplateSetter], parentTmpl: Template): Views = js.native
    def templates(name: String, item: js.UndefOr[TemplateSetter], parentTmpl: Template): Template = js.native
    def templates(name: String, item: TemplateSetter): Template = js.native
    /* $.views.templates() */
    @JSName("templates")
    var templates_Original: Templates = js.native
    
    /* $.views.viewModels() */
    def viewModels(namedItems: Hash[ViewModelOptions]): Hash[ViewModel] = js.native
    def viewModels(namedItems: Hash[ViewModelOptions], viewModels: Hash[ViewModel]): Hash[ViewModel] = js.native
    /* $.views.viewModels() */
    def viewModels(name: String, viewModel: ViewModelOptions): ViewModel = js.native
    def viewModels(name: String, viewModel: ViewModelOptions, viewModels: Hash[ViewModel]): ViewModel = js.native
    /* $.views.viewModels() */
    /* $.views.viewModels() */
    def viewModels(viewModel: ViewModelOptions): ViewModel = js.native
    /* $.views.viewModels() */
    @JSName("viewModels")
    var viewModels_Original: ViewModels = js.native
  }
}
