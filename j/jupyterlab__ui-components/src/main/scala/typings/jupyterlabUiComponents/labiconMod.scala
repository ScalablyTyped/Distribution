package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.anon.IIconPartialIRenderer
import typings.jupyterlabUiComponents.anon.IOptionsloadingbooleanund
import typings.jupyterlabUiComponents.anon.Icon
import typings.jupyterlabUiComponents.anon.PartialIRenderer
import typings.jupyterlabUiComponents.anon.PartialIResolverPropsIPro
import typings.jupyterlabUiComponents.anon.PartialIResolverPropsIRea
import typings.jupyterlabUiComponents.anon.Title
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.div
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.span
import typings.jupyterlabUiComponents.labiconMod.LabIcon.ILabIcon
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IProps
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IReact
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IReactProps
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IRendererOptions
import typings.luminoSignaling.mod.Signal
import typings.luminoVirtualdom.anon.Attrs
import typings.luminoVirtualdom.mod.ElementAttrs
import typings.luminoVirtualdom.mod.VirtualElement.IRenderer
import typings.luminoVirtualdom.mod.VirtualNode
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labiconMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "LabIcon")
  @js.native
  open class LabIcon protected ()
    extends StObject
       with ILabIcon {
    /** *********
      * members *
      ***********/
    def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingbooleanund) = this()
    
    /* protected */ var _className: String = js.native
    
    /* protected */ def _initReact(displayName: String): ForwardRefExoticComponent[IReactProps] = js.native
    
    /* protected */ def _initRender(hasRenderUnrender: PartialIRenderer): Unit = js.native
    
    /* protected */ def _initSvg(): HTMLElement | Null = js.native
    /* protected */ def _initSvg(hasTitleUuid: Title): HTMLElement | Null = js.native
    
    /* protected */ var _loading: Boolean = js.native
    
    /* protected */ var _props: IProps = js.native
    
    /**
      * Cache for svg parsing intermediates
      *   - undefined: the cache has not yet been populated
      *   - null: a valid, but empty, value
      */
    /* protected */ var _svgElement: js.UndefOr[HTMLElement | Null] = js.native
    
    /* protected */ var _svgInnerHTML: js.UndefOr[String | Null] = js.native
    
    /* protected */ var _svgReactAttrs: js.UndefOr[Any | Null] = js.native
    
    /* protected */ var _svgReplaced: Signal[this.type, Unit] = js.native
    
    /* protected */ var _svgstr: String = js.native
    
    /* protected */ var _uuid: String = js.native
    
    /**
      * Get a view of this icon that is bound to the specified icon/style props
      *
      * @param optional icon/style props (same as args for .element
      * and .react methods). These will be bound to the resulting view
      *
      * @returns a view of this LabIcon instance
      */
    def bindprops(): Any = js.native
    def bindprops(props: IProps): Any = js.native
    
    /**
      * Create an icon as a DOM element
      *
      * @param className - a string that will be used as the class
      * of the container element. Overrides any existing class
      *
      * @param container - a preexisting DOM element that
      * will be used as the container for the svg element
      *
      * @param label - text that will be displayed adjacent
      * to the icon
      *
      * @param title - a tooltip for the icon
      *
      * @param tag - if container is not explicitly
      * provided, this tag will be used when creating the container
      *
      * @param stylesheet - optional string naming a builtin icon
      * stylesheet, for example 'menuItem' or `statusBar`. Can also be an
      * object defining a custom icon stylesheet, or a list of builtin
      * stylesheet names and/or custom stylesheet objects. If array,
      * the given stylesheets will be merged.
      *
      *   See @jupyterlab/ui-components/src/style/icon.ts for details
      *
      * @param elementPosition - optional position for the inner svg element
      *
      * @param elementSize - optional size for the inner svg element.
      * Set to 'normal' to get a standard 16px x 16px icon
      *
      * @param ...elementCSS - all additional args are treated as
      * overrides for the CSS props applied to the inner svg element
      *
      * @returns A DOM element that contains an (inline) svg element
      * that displays an icon
      */
    def element(): HTMLElement = js.native
    def element(props: IProps): HTMLElement = js.native
    
    /**
      * The name of the icon. By convention, the icon name will be namespaced
      * as so:
      *
      *     "pkg-name:icon-name"
      */
    /* CompleteClass */
    override val name: String = js.native
    
    /**
      * A React component that will create the icon.
      *
      * @param className - a string that will be used as the class
      * of the container element. Overrides any existing class
      *
      * @param container - a preexisting DOM element that
      * will be used as the container for the svg element
      *
      * @param label - text that will be displayed adjacent
      * to the icon
      *
      * @param title - a tooltip for the icon
      *
      * @param tag - if container is not explicitly
      * provided, this tag will be used when creating the container
      *
      * @param stylesheet - optional string naming a builtin icon
      * stylesheet, for example 'menuItem' or `statusBar`. Can also be an
      * object defining a custom icon stylesheet, or a list of builtin
      * stylesheet names and/or custom stylesheet objects. If array,
      * the given stylesheets will be merged.
      *
      *   See @jupyterlab/ui-components/src/style/icon.ts for details
      *
      * @param elementPosition - optional position for the inner svg element
      *
      * @param elementSize - optional size for the inner svg element.
      * Set to 'normal' to get a standard 16px x 16px icon
      *
      * @param ...elementCSS - all additional args are treated as
      * overrides for the CSS props applied to the inner svg element
      *
      * @param ref - forwarded to the ref prop of the icon's svg element
      */
    val react: IReact = js.native
    
    def render(container: HTMLElement, options: IRendererOptions): Unit = js.native
    
    /* protected */ def svgElement: HTMLElement | Null = js.native
    
    /* protected */ def svgInnerHTML: String | Null = js.native
    
    /* protected */ def svgReactAttrs: Any | Null = js.native
    
    /**
      * A string containing the raw contents of an svg file.
      */
    /* CompleteClass */
    var svgstr: String = js.native
    @JSName("svgstr")
    def svgstr_MLabIcon: String = js.native
    
    @JSName("unrender")
    var unrender_LabIcon: js.UndefOr[
        js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[IRendererOptions], Unit]
      ] = js.native
  }
  /* static members */
  object LabIcon {
    
    @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "LabIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "LabIcon._debug")
    @js.native
    def _debug: Any = js.native
    inline def _debug_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debug")(x.asInstanceOf[js.Any])
    
    @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "LabIcon._instances")
    @js.native
    def _instances: Any = js.native
    inline def _instances_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instances")(x.asInstanceOf[js.Any])
    
    /** *********
      * statics *
      ***********/
    /**
      * Remove any rendered icon from the element that contains it
      *
      * @param container - a DOM node into which an icon was
      * previously rendered
      *
      * @returns the cleaned container
      */
    inline def remove(container: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(container.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into an
      * actual LabIcon.
      *
      * @param icon - either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields.
      *
      * @returns a LabIcon instance
      */
    inline def resolve(hasIcon: Icon): LabIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hasIcon.asInstanceOf[js.Any]).asInstanceOf[LabIcon]
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into a DOM element.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, this function will return
      * an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the element method
      * of the resolved icon on render
      *
      * @returns a DOM node with the resolved icon rendered into it
      */
    inline def resolveElement(hasIconIconClassFallbackProps: PartialIResolverPropsIPro): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveElement")(hasIconIconClassFallbackProps.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into a React component.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, the returned component
      * will simply render an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the React component
      * of the resolved icon on render
      *
      * @returns a React component that will render the resolved icon
      */
    inline def resolveReact(hasIconIconClassFallbackProps: PartialIResolverPropsIRea): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveReact")(hasIconIconClassFallbackProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Resolve a {name, svgstr} pair into an actual svg node.
      */
    inline def resolveSvg(hasNameSvgstr: IIcon): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSvg")(hasNameSvgstr.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    /**
      * Toggle icon debug from off-to-on, or vice-versa.
      *
      * @param debug - optional boolean to force debug on or off
      */
    inline def toggleDebug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDebug")().asInstanceOf[Unit]
    inline def toggleDebug(debug: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDebug")(debug.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** ***********
      * interfaces *
      *************/
    /**
      * The simplest possible interface for defining a generic icon.
      */
    trait IIcon extends StObject {
      
      /**
        * The name of the icon. By convention, the icon name will be namespaced
        * as so:
        *
        *     "pkg-name:icon-name"
        */
      val name: String
      
      /**
        * A string containing the raw contents of an svg file.
        */
      var svgstr: String
    }
    object IIcon {
      
      inline def apply(name: String, svgstr: String): IIcon = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
        __obj.asInstanceOf[IIcon]
      }
      
      extension [Self <: IIcon](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSvgstr(value: String): Self = StObject.set(x, "svgstr", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The ILabIcon interface. Outside of this interface the actual
      * implementation of LabIcon may vary
      */
    @js.native
    trait ILabIcon
      extends StObject
         with IIcon
         with IRenderer
    
    /**
      * A type that maybe can be resolved to a LabIcon instance.
      */
    type IMaybeResolvable = js.UndefOr[IResolvable | IRenderer]
    
    /**
      * Interface defining the parameters to be passed to the LabIcon
      * constructor
      */
    /* Inlined parent @jupyterlab/ui-components.@jupyterlab/ui-components/lib/icon/labicon.LabIcon.IIcon */
    /* Inlined parent std.Partial<@lumino/virtualdom.@lumino/virtualdom.VirtualElement.IRenderer> */
    trait IOptions extends StObject {
      
      /**
        * The name of the icon. By convention, the icon name will be namespaced
        * as so:
        *
        *     "pkg-name:icon-name"
        */
      val name: String
      
      var render: js.UndefOr[js.Function1[/* host */ HTMLElement, Unit]] = js.undefined
      
      /**
        * A string containing the raw contents of an svg file.
        */
      var svgstr: String
      
      var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[Attrs], Unit]] = js.undefined
    }
    object IOptions {
      
      inline def apply(name: String, svgstr: String): IOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRender(value: /* host */ HTMLElement => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
        
        inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        inline def setSvgstr(value: String): Self = StObject.set(x, "svgstr", value.asInstanceOf[js.Any])
        
        inline def setUnrender(value: (/* host */ HTMLElement, /* options */ js.UndefOr[Attrs]) => Unit): Self = StObject.set(x, "unrender", js.Any.fromFunction2(value))
        
        inline def setUnrenderUndefined: Self = StObject.set(x, "unrender", js.undefined)
      }
    }
    
    /**
      * The input props for creating a new LabIcon
      */
    trait IProps
      extends StObject
         with typings.jupyterlabUiComponents.styleIconMod.LabIconStyle.IProps {
      
      /**
        * Extra classNames. Used in addition to the typestyle className to
        * set the className of the icon's outermost container node
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * The icon's outermost node, which acts as a container for the actual
        * svg node. If container is not supplied, it will be created
        */
      var container: js.UndefOr[HTMLElement] = js.undefined
      
      /**
        * Optional text label that will be added as a sibling to the icon's
        * svg node
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * HTML element tag used to create the icon's outermost container node,
        * if no container is passed in
        */
      var tag: js.UndefOr[div | span] = js.undefined
      
      /**
        * Optional title that will be set on the icon's outermost container node
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object IProps {
      
      inline def apply(): IProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setTag(value: div | span): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /**
      * The complete type of the React component stored in the .react
      * field of a LabIcon.
      */
    type IReact = ForwardRefExoticComponent[IReactProps]
    
    /**
      * The properties that can be passed into the React component stored in
      * the .react field of a LabIcon.
      */
    trait IReactProps
      extends StObject
         with IProps
         with RefAttributes[SVGElement]
    object IReactProps {
      
      inline def apply(): IReactProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IReactProps]
      }
    }
    
    /**
      * The type of the svg node ref that can be passed into icon React components
      */
    type IReactRef = RefObject[SVGElement]
    
    trait IRendererOptions extends StObject {
      
      var attrs: js.UndefOr[ElementAttrs] = js.undefined
      
      var children: js.UndefOr[js.Array[VirtualNode]] = js.undefined
      
      var props: js.UndefOr[IProps] = js.undefined
    }
    object IRendererOptions {
      
      inline def apply(): IRendererOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRendererOptions]
      }
      
      extension [Self <: IRendererOptions](x: Self) {
        
        inline def setAttrs(value: ElementAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
        
        inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
        
        inline def setChildren(value: js.Array[VirtualNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: VirtualNode*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setProps(value: IProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
        
        inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      }
    }
    
    /** ******
      * types *
      *********/
    /**
      * A type that can be resolved to a LabIcon instance.
      */
    type IResolvable = String | IIconPartialIRenderer
    
    trait IResolverProps extends StObject {
      
      var fallback: js.UndefOr[LabIcon] = js.undefined
      
      var icon: js.UndefOr[IMaybeResolvable] = js.undefined
      
      var iconClass: js.UndefOr[String] = js.undefined
    }
    object IResolverProps {
      
      inline def apply(): IResolverProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IResolverProps]
      }
      
      extension [Self <: IResolverProps](x: Self) {
        
        inline def setFallback(value: LabIcon): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
        
        inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
        
        inline def setIcon(value: IMaybeResolvable): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "badIcon")
  @js.native
  val badIcon: LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "blankIcon")
  @js.native
  val blankIcon: LabIcon = js.native
}
