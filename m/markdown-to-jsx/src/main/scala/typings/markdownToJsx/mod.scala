package typings.markdownToJsx

import org.scalablytyped.runtime.StringDictionary
import typings.markdownToJsx.anon.Component
import typings.markdownToJsx.anon.Dictkey
import typings.markdownToJsx.markdownToJsxStrings.component
import typings.markdownToJsx.markdownToJsxStrings.input
import typings.markdownToJsx.markdownToJsxStrings.props
import typings.markdownToJsx.mod.MarkdownToJSX.Options
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Key
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Pick
import typings.std.RegExpMatchArray
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-to-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A simple HOC for easy React use. Feed the markdown content as a direct child
    * and the rest is taken care of automatically.
    */
  @JSImport("markdown-to-jsx", JSImport.Default)
  @js.native
  val default: FC[Dictkey] = js.native
  
  @js.native
  sealed trait Priority extends StObject
  @JSImport("markdown-to-jsx", "Priority")
  @js.native
  object Priority extends StObject {
    
    /**
      * scans for block-level constructs
      */
    @js.native
    sealed trait HIGH
      extends StObject
         with Priority
    
    /**
      * inline elements
      */
    @js.native
    sealed trait LOW
      extends StObject
         with Priority
    
    /**
      * anything that must scan the tree before everything else
      */
    @js.native
    sealed trait MAX
      extends StObject
         with Priority
    
    /**
      * inline w/ more priority than other inline
      */
    @js.native
    sealed trait MED
      extends StObject
         with Priority
    
    /**
      * bare text and stuff that is considered leftovers
      */
    @js.native
    sealed trait MIN
      extends StObject
         with Priority
  }
  
  inline def compiler(markdown: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("compiler")(markdown.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def compiler(markdown: String, options: Options): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("compiler")(markdown.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  object MarkdownToJSX {
    
    @js.native
    trait CreateElement extends StObject {
      
      def apply(
        `type`: input,
        props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
        children: ReactNode*
      ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
      def apply(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
      def apply(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
      def apply[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = js.native
      def apply[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
      def apply[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = js.native
      def apply[P /* <: js.Object */](
        `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
        props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
        children: ReactNode*
      ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
      def apply[P /* <: js.Object */](
        `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
        props: Null,
        children: ReactNode*
      ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
      def apply[P /* <: js.Object */](
        `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
        props: Unit,
        children: ReactNode*
      ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
      def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = js.native
      def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
      def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = js.native
      def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = js.native
      def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
      def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = js.native
      def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
        props: ClassAttributes[T] & P,
        children: ReactNode*
      ): ReactSVGElement = js.native
      def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
        props: Null,
        children: ReactNode*
      ): ReactSVGElement = js.native
      def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
        `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ Any,
        props: Unit,
        children: ReactNode*
      ): ReactSVGElement = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.markdownToJsx.markdownToJsxStrings.a
      - typings.markdownToJsx.markdownToJsxStrings.abbr
      - typings.markdownToJsx.markdownToJsxStrings.address
      - typings.markdownToJsx.markdownToJsxStrings.area
      - typings.markdownToJsx.markdownToJsxStrings.article
      - typings.markdownToJsx.markdownToJsxStrings.aside
      - typings.markdownToJsx.markdownToJsxStrings.audio
      - typings.markdownToJsx.markdownToJsxStrings.b
      - typings.markdownToJsx.markdownToJsxStrings.base
      - typings.markdownToJsx.markdownToJsxStrings.bdi
      - typings.markdownToJsx.markdownToJsxStrings.bdo
      - typings.markdownToJsx.markdownToJsxStrings.big
      - typings.markdownToJsx.markdownToJsxStrings.blockquote
      - typings.markdownToJsx.markdownToJsxStrings.body
      - typings.markdownToJsx.markdownToJsxStrings.br
      - typings.markdownToJsx.markdownToJsxStrings.button
      - typings.markdownToJsx.markdownToJsxStrings.canvas
      - typings.markdownToJsx.markdownToJsxStrings.caption
      - typings.markdownToJsx.markdownToJsxStrings.cite
      - typings.markdownToJsx.markdownToJsxStrings.code
      - typings.markdownToJsx.markdownToJsxStrings.col
      - typings.markdownToJsx.markdownToJsxStrings.colgroup
      - typings.markdownToJsx.markdownToJsxStrings.data
      - typings.markdownToJsx.markdownToJsxStrings.datalist
      - typings.markdownToJsx.markdownToJsxStrings.dd
      - typings.markdownToJsx.markdownToJsxStrings.del
      - typings.markdownToJsx.markdownToJsxStrings.details
      - typings.markdownToJsx.markdownToJsxStrings.dfn
      - typings.markdownToJsx.markdownToJsxStrings.dialog
      - typings.markdownToJsx.markdownToJsxStrings.div
      - typings.markdownToJsx.markdownToJsxStrings.dl
      - typings.markdownToJsx.markdownToJsxStrings.dt
      - typings.markdownToJsx.markdownToJsxStrings.em
      - typings.markdownToJsx.markdownToJsxStrings.embed
      - typings.markdownToJsx.markdownToJsxStrings.fieldset
      - typings.markdownToJsx.markdownToJsxStrings.figcaption
      - typings.markdownToJsx.markdownToJsxStrings.figure
      - typings.markdownToJsx.markdownToJsxStrings.footer
      - typings.markdownToJsx.markdownToJsxStrings.form
      - typings.markdownToJsx.markdownToJsxStrings.h1
      - typings.markdownToJsx.markdownToJsxStrings.h2
      - typings.markdownToJsx.markdownToJsxStrings.h3
      - typings.markdownToJsx.markdownToJsxStrings.h4
      - typings.markdownToJsx.markdownToJsxStrings.h5
      - typings.markdownToJsx.markdownToJsxStrings.h6
      - typings.markdownToJsx.markdownToJsxStrings.head
      - typings.markdownToJsx.markdownToJsxStrings.header
      - typings.markdownToJsx.markdownToJsxStrings.hgroup
      - typings.markdownToJsx.markdownToJsxStrings.hr
      - typings.markdownToJsx.markdownToJsxStrings.html
      - typings.markdownToJsx.markdownToJsxStrings.i
      - typings.markdownToJsx.markdownToJsxStrings.iframe
      - typings.markdownToJsx.markdownToJsxStrings.img
      - typings.markdownToJsx.markdownToJsxStrings.input
      - typings.markdownToJsx.markdownToJsxStrings.ins
      - typings.markdownToJsx.markdownToJsxStrings.kbd
      - typings.markdownToJsx.markdownToJsxStrings.keygen
      - typings.markdownToJsx.markdownToJsxStrings.label
      - typings.markdownToJsx.markdownToJsxStrings.legend
      - typings.markdownToJsx.markdownToJsxStrings.li
      - typings.markdownToJsx.markdownToJsxStrings.link
      - typings.markdownToJsx.markdownToJsxStrings.main
      - typings.markdownToJsx.markdownToJsxStrings.map
      - typings.markdownToJsx.markdownToJsxStrings.mark
      - typings.markdownToJsx.markdownToJsxStrings.menu
      - typings.markdownToJsx.markdownToJsxStrings.menuitem
      - typings.markdownToJsx.markdownToJsxStrings.meta
      - typings.markdownToJsx.markdownToJsxStrings.meter
      - typings.markdownToJsx.markdownToJsxStrings.nav
      - typings.markdownToJsx.markdownToJsxStrings.noindex
      - typings.markdownToJsx.markdownToJsxStrings.noscript
      - typings.markdownToJsx.markdownToJsxStrings.`object`
      - typings.markdownToJsx.markdownToJsxStrings.ol
      - typings.markdownToJsx.markdownToJsxStrings.optgroup
      - typings.markdownToJsx.markdownToJsxStrings.option
      - typings.markdownToJsx.markdownToJsxStrings.output
      - typings.markdownToJsx.markdownToJsxStrings.p
      - typings.markdownToJsx.markdownToJsxStrings.param
      - typings.markdownToJsx.markdownToJsxStrings.picture
      - typings.markdownToJsx.markdownToJsxStrings.pre
      - typings.markdownToJsx.markdownToJsxStrings.progress
      - typings.markdownToJsx.markdownToJsxStrings.q
      - typings.markdownToJsx.markdownToJsxStrings.rp
      - typings.markdownToJsx.markdownToJsxStrings.rt
      - typings.markdownToJsx.markdownToJsxStrings.ruby
      - typings.markdownToJsx.markdownToJsxStrings.s
      - typings.markdownToJsx.markdownToJsxStrings.samp
      - typings.markdownToJsx.markdownToJsxStrings.slot
      - typings.markdownToJsx.markdownToJsxStrings.script
      - typings.markdownToJsx.markdownToJsxStrings.section
      - typings.markdownToJsx.markdownToJsxStrings.select
      - typings.markdownToJsx.markdownToJsxStrings.small
      - typings.markdownToJsx.markdownToJsxStrings.source
      - typings.markdownToJsx.markdownToJsxStrings.span
      - typings.markdownToJsx.markdownToJsxStrings.strong
      - typings.markdownToJsx.markdownToJsxStrings.style
      - typings.markdownToJsx.markdownToJsxStrings.sub
      - typings.markdownToJsx.markdownToJsxStrings.summary
      - typings.markdownToJsx.markdownToJsxStrings.sup
      - typings.markdownToJsx.markdownToJsxStrings.table
      - typings.markdownToJsx.markdownToJsxStrings.template
      - typings.markdownToJsx.markdownToJsxStrings.tbody
      - typings.markdownToJsx.markdownToJsxStrings.td
      - typings.markdownToJsx.markdownToJsxStrings.textarea
      - typings.markdownToJsx.markdownToJsxStrings.tfoot
      - typings.markdownToJsx.markdownToJsxStrings.th
      - typings.markdownToJsx.markdownToJsxStrings.thead
      - typings.markdownToJsx.markdownToJsxStrings.time
      - typings.markdownToJsx.markdownToJsxStrings.title
      - typings.markdownToJsx.markdownToJsxStrings.tr
      - typings.markdownToJsx.markdownToJsxStrings.track
      - typings.markdownToJsx.markdownToJsxStrings.u
      - typings.markdownToJsx.markdownToJsxStrings.ul
      - typings.markdownToJsx.markdownToJsxStrings.`var`
      - typings.markdownToJsx.markdownToJsxStrings.video
      - typings.markdownToJsx.markdownToJsxStrings.wbr
      - typings.markdownToJsx.markdownToJsxStrings.webview
      - typings.markdownToJsx.markdownToJsxStrings.svg
      - typings.markdownToJsx.markdownToJsxStrings.animate
      - typings.markdownToJsx.markdownToJsxStrings.animateMotion
      - typings.markdownToJsx.markdownToJsxStrings.animateTransform
      - typings.markdownToJsx.markdownToJsxStrings.circle
      - typings.markdownToJsx.markdownToJsxStrings.clipPath
      - typings.markdownToJsx.markdownToJsxStrings.defs
      - typings.markdownToJsx.markdownToJsxStrings.desc
      - typings.markdownToJsx.markdownToJsxStrings.ellipse
      - typings.markdownToJsx.markdownToJsxStrings.feBlend
      - typings.markdownToJsx.markdownToJsxStrings.feColorMatrix
      - typings.markdownToJsx.markdownToJsxStrings.feComponentTransfer
      - typings.markdownToJsx.markdownToJsxStrings.feComposite
      - typings.markdownToJsx.markdownToJsxStrings.feConvolveMatrix
      - typings.markdownToJsx.markdownToJsxStrings.feDiffuseLighting
      - typings.markdownToJsx.markdownToJsxStrings.feDisplacementMap
      - typings.markdownToJsx.markdownToJsxStrings.feDistantLight
      - typings.markdownToJsx.markdownToJsxStrings.feDropShadow
      - typings.markdownToJsx.markdownToJsxStrings.feFlood
      - typings.markdownToJsx.markdownToJsxStrings.feFuncA
      - typings.markdownToJsx.markdownToJsxStrings.feFuncB
      - typings.markdownToJsx.markdownToJsxStrings.feFuncG
      - typings.markdownToJsx.markdownToJsxStrings.feFuncR
      - typings.markdownToJsx.markdownToJsxStrings.feGaussianBlur
      - typings.markdownToJsx.markdownToJsxStrings.feImage
      - typings.markdownToJsx.markdownToJsxStrings.feMerge
      - typings.markdownToJsx.markdownToJsxStrings.feMergeNode
      - typings.markdownToJsx.markdownToJsxStrings.feMorphology
      - typings.markdownToJsx.markdownToJsxStrings.feOffset
      - typings.markdownToJsx.markdownToJsxStrings.fePointLight
      - typings.markdownToJsx.markdownToJsxStrings.feSpecularLighting
      - typings.markdownToJsx.markdownToJsxStrings.feSpotLight
      - typings.markdownToJsx.markdownToJsxStrings.feTile
      - typings.markdownToJsx.markdownToJsxStrings.feTurbulence
      - typings.markdownToJsx.markdownToJsxStrings.filter
      - typings.markdownToJsx.markdownToJsxStrings.foreignObject
      - typings.markdownToJsx.markdownToJsxStrings.g
      - typings.markdownToJsx.markdownToJsxStrings.image
      - typings.markdownToJsx.markdownToJsxStrings.line
      - typings.markdownToJsx.markdownToJsxStrings.linearGradient
      - typings.markdownToJsx.markdownToJsxStrings.marker
      - typings.markdownToJsx.markdownToJsxStrings.mask
      - typings.markdownToJsx.markdownToJsxStrings.metadata
      - typings.markdownToJsx.markdownToJsxStrings.mpath
      - typings.markdownToJsx.markdownToJsxStrings.path
      - typings.markdownToJsx.markdownToJsxStrings.pattern
      - typings.markdownToJsx.markdownToJsxStrings.polygon
      - typings.markdownToJsx.markdownToJsxStrings.polyline
      - typings.markdownToJsx.markdownToJsxStrings.radialGradient
      - typings.markdownToJsx.markdownToJsxStrings.rect
      - typings.markdownToJsx.markdownToJsxStrings.stop
      - typings.markdownToJsx.markdownToJsxStrings.switch
      - typings.markdownToJsx.markdownToJsxStrings.symbol
      - typings.markdownToJsx.markdownToJsxStrings.text
      - typings.markdownToJsx.markdownToJsxStrings.textPath
      - typings.markdownToJsx.markdownToJsxStrings.tspan
      - typings.markdownToJsx.markdownToJsxStrings.use
      - typings.markdownToJsx.markdownToJsxStrings.view
    */
    trait HTMLTags extends StObject
    
    type NestedParser = js.Function2[/* input */ String, /* state */ js.UndefOr[State], ParserResult]
    
    /* Inlined std.Partial<{createElement (tag : std.Parameters<markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.CreateElement>[0], props : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<any> * / any, children : ...react.react.ReactChild): react.react.<global>.JSX.Element,   disableParsingRawHTML :boolean,   forceBlock :boolean,   forceInline :boolean,   namedCodesToUnicode :{[key: string] : string},   overrides :markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.Overrides,   wrapper :react.react.ElementType<any> | null,   forceWrapper :boolean, slugify (source : string): string}> */
    trait Options extends StObject {
      
      var createElement: js.UndefOr[
            js.Function3[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.CreateElement>[0] */ /* tag */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<any> */ /* props */ Any, 
              /* repeated */ ReactChild, 
              Element
            ]
          ] = js.undefined
      
      var disableParsingRawHTML: js.UndefOr[Boolean] = js.undefined
      
      var forceBlock: js.UndefOr[Boolean] = js.undefined
      
      var forceInline: js.UndefOr[Boolean] = js.undefined
      
      var forceWrapper: js.UndefOr[Boolean] = js.undefined
      
      var namedCodesToUnicode: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var overrides: js.UndefOr[Overrides] = js.undefined
      
      var slugify: js.UndefOr[js.Function1[/* source */ String, String]] = js.undefined
      
      var wrapper: js.UndefOr[ElementType[Any] | Null] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCreateElement(
          value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.CreateElement>[0] */ /* tag */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<any> */ /* props */ Any, /* repeated */ ReactChild) => Element
        ): Self = StObject.set(x, "createElement", js.Any.fromFunction3(value))
        
        inline def setCreateElementUndefined: Self = StObject.set(x, "createElement", js.undefined)
        
        inline def setDisableParsingRawHTML(value: Boolean): Self = StObject.set(x, "disableParsingRawHTML", value.asInstanceOf[js.Any])
        
        inline def setDisableParsingRawHTMLUndefined: Self = StObject.set(x, "disableParsingRawHTML", js.undefined)
        
        inline def setForceBlock(value: Boolean): Self = StObject.set(x, "forceBlock", value.asInstanceOf[js.Any])
        
        inline def setForceBlockUndefined: Self = StObject.set(x, "forceBlock", js.undefined)
        
        inline def setForceInline(value: Boolean): Self = StObject.set(x, "forceInline", value.asInstanceOf[js.Any])
        
        inline def setForceInlineUndefined: Self = StObject.set(x, "forceInline", js.undefined)
        
        inline def setForceWrapper(value: Boolean): Self = StObject.set(x, "forceWrapper", value.asInstanceOf[js.Any])
        
        inline def setForceWrapperUndefined: Self = StObject.set(x, "forceWrapper", js.undefined)
        
        inline def setNamedCodesToUnicode(value: StringDictionary[String]): Self = StObject.set(x, "namedCodesToUnicode", value.asInstanceOf[js.Any])
        
        inline def setNamedCodesToUnicodeUndefined: Self = StObject.set(x, "namedCodesToUnicode", js.undefined)
        
        inline def setOverrides(value: Overrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
        
        inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
        
        inline def setSlugify(value: /* source */ String => String): Self = StObject.set(x, "slugify", js.Any.fromFunction1(value))
        
        inline def setSlugifyUndefined: Self = StObject.set(x, "slugify", js.undefined)
        
        inline def setWrapper(value: ElementType[Any]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
        
        inline def setWrapperNull: Self = StObject.set(x, "wrapper", null)
        
        inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
      }
    }
    
    type Override = (RequireAtLeastOne[Component, /* keyof markdown-to-jsx.anon.Component */ component | props]) | ElementType[Any]
    
    /* Inlined {[ tag in markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.HTMLTags ]:? markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.Override} & {[customComponent: string] : markdown-to-jsx.markdown-to-jsx.MarkdownToJSX.Override} */
    trait Overrides
      extends StObject
         with /* customComponent */ StringDictionary[Override] {
      
      var a: js.UndefOr[Override] = js.undefined
      
      var abbr: js.UndefOr[Override] = js.undefined
      
      var address: js.UndefOr[Override] = js.undefined
      
      var animate: js.UndefOr[Override] = js.undefined
      
      var animateMotion: js.UndefOr[Override] = js.undefined
      
      var animateTransform: js.UndefOr[Override] = js.undefined
      
      var area: js.UndefOr[Override] = js.undefined
      
      var article: js.UndefOr[Override] = js.undefined
      
      var aside: js.UndefOr[Override] = js.undefined
      
      var audio: js.UndefOr[Override] = js.undefined
      
      var b: js.UndefOr[Override] = js.undefined
      
      var base: js.UndefOr[Override] = js.undefined
      
      var bdi: js.UndefOr[Override] = js.undefined
      
      var bdo: js.UndefOr[Override] = js.undefined
      
      var big: js.UndefOr[Override] = js.undefined
      
      var blockquote: js.UndefOr[Override] = js.undefined
      
      var body: js.UndefOr[Override] = js.undefined
      
      var br: js.UndefOr[Override] = js.undefined
      
      var button: js.UndefOr[Override] = js.undefined
      
      var canvas: js.UndefOr[Override] = js.undefined
      
      var caption: js.UndefOr[Override] = js.undefined
      
      var circle: js.UndefOr[Override] = js.undefined
      
      var cite: js.UndefOr[Override] = js.undefined
      
      var clipPath: js.UndefOr[Override] = js.undefined
      
      var code: js.UndefOr[Override] = js.undefined
      
      var col: js.UndefOr[Override] = js.undefined
      
      var colgroup: js.UndefOr[Override] = js.undefined
      
      var data: js.UndefOr[Override] = js.undefined
      
      var datalist: js.UndefOr[Override] = js.undefined
      
      var dd: js.UndefOr[Override] = js.undefined
      
      var defs: js.UndefOr[Override] = js.undefined
      
      var del: js.UndefOr[Override] = js.undefined
      
      var desc: js.UndefOr[Override] = js.undefined
      
      var details: js.UndefOr[Override] = js.undefined
      
      var dfn: js.UndefOr[Override] = js.undefined
      
      var dialog: js.UndefOr[Override] = js.undefined
      
      var div: js.UndefOr[Override] = js.undefined
      
      var dl: js.UndefOr[Override] = js.undefined
      
      var dt: js.UndefOr[Override] = js.undefined
      
      var ellipse: js.UndefOr[Override] = js.undefined
      
      var em: js.UndefOr[Override] = js.undefined
      
      var embed: js.UndefOr[Override] = js.undefined
      
      var feBlend: js.UndefOr[Override] = js.undefined
      
      var feColorMatrix: js.UndefOr[Override] = js.undefined
      
      var feComponentTransfer: js.UndefOr[Override] = js.undefined
      
      var feComposite: js.UndefOr[Override] = js.undefined
      
      var feConvolveMatrix: js.UndefOr[Override] = js.undefined
      
      var feDiffuseLighting: js.UndefOr[Override] = js.undefined
      
      var feDisplacementMap: js.UndefOr[Override] = js.undefined
      
      var feDistantLight: js.UndefOr[Override] = js.undefined
      
      var feDropShadow: js.UndefOr[Override] = js.undefined
      
      var feFlood: js.UndefOr[Override] = js.undefined
      
      var feFuncA: js.UndefOr[Override] = js.undefined
      
      var feFuncB: js.UndefOr[Override] = js.undefined
      
      var feFuncG: js.UndefOr[Override] = js.undefined
      
      var feFuncR: js.UndefOr[Override] = js.undefined
      
      var feGaussianBlur: js.UndefOr[Override] = js.undefined
      
      var feImage: js.UndefOr[Override] = js.undefined
      
      var feMerge: js.UndefOr[Override] = js.undefined
      
      var feMergeNode: js.UndefOr[Override] = js.undefined
      
      var feMorphology: js.UndefOr[Override] = js.undefined
      
      var feOffset: js.UndefOr[Override] = js.undefined
      
      var fePointLight: js.UndefOr[Override] = js.undefined
      
      var feSpecularLighting: js.UndefOr[Override] = js.undefined
      
      var feSpotLight: js.UndefOr[Override] = js.undefined
      
      var feTile: js.UndefOr[Override] = js.undefined
      
      var feTurbulence: js.UndefOr[Override] = js.undefined
      
      var fieldset: js.UndefOr[Override] = js.undefined
      
      var figcaption: js.UndefOr[Override] = js.undefined
      
      var figure: js.UndefOr[Override] = js.undefined
      
      var filter: js.UndefOr[Override] = js.undefined
      
      var footer: js.UndefOr[Override] = js.undefined
      
      var foreignObject: js.UndefOr[Override] = js.undefined
      
      var form: js.UndefOr[Override] = js.undefined
      
      var g: js.UndefOr[Override] = js.undefined
      
      var h1: js.UndefOr[Override] = js.undefined
      
      var h2: js.UndefOr[Override] = js.undefined
      
      var h3: js.UndefOr[Override] = js.undefined
      
      var h4: js.UndefOr[Override] = js.undefined
      
      var h5: js.UndefOr[Override] = js.undefined
      
      var h6: js.UndefOr[Override] = js.undefined
      
      var head: js.UndefOr[Override] = js.undefined
      
      var header: js.UndefOr[Override] = js.undefined
      
      var hgroup: js.UndefOr[Override] = js.undefined
      
      var hr: js.UndefOr[Override] = js.undefined
      
      var html: js.UndefOr[Override] = js.undefined
      
      var i: js.UndefOr[Override] = js.undefined
      
      var iframe: js.UndefOr[Override] = js.undefined
      
      var image: js.UndefOr[Override] = js.undefined
      
      var img: js.UndefOr[Override] = js.undefined
      
      var input: js.UndefOr[Override] = js.undefined
      
      var ins: js.UndefOr[Override] = js.undefined
      
      var kbd: js.UndefOr[Override] = js.undefined
      
      var keygen: js.UndefOr[Override] = js.undefined
      
      var label: js.UndefOr[Override] = js.undefined
      
      var legend: js.UndefOr[Override] = js.undefined
      
      var li: js.UndefOr[Override] = js.undefined
      
      var line: js.UndefOr[Override] = js.undefined
      
      var linearGradient: js.UndefOr[Override] = js.undefined
      
      var link: js.UndefOr[Override] = js.undefined
      
      var main: js.UndefOr[Override] = js.undefined
      
      var map: js.UndefOr[Override] = js.undefined
      
      var mark: js.UndefOr[Override] = js.undefined
      
      var marker: js.UndefOr[Override] = js.undefined
      
      var mask: js.UndefOr[Override] = js.undefined
      
      var menu: js.UndefOr[Override] = js.undefined
      
      var menuitem: js.UndefOr[Override] = js.undefined
      
      var meta: js.UndefOr[Override] = js.undefined
      
      var metadata: js.UndefOr[Override] = js.undefined
      
      var meter: js.UndefOr[Override] = js.undefined
      
      var mpath: js.UndefOr[Override] = js.undefined
      
      var nav: js.UndefOr[Override] = js.undefined
      
      var noindex: js.UndefOr[Override] = js.undefined
      
      var noscript: js.UndefOr[Override] = js.undefined
      
      var `object`: js.UndefOr[Override] = js.undefined
      
      var ol: js.UndefOr[Override] = js.undefined
      
      var optgroup: js.UndefOr[Override] = js.undefined
      
      var option: js.UndefOr[Override] = js.undefined
      
      var output: js.UndefOr[Override] = js.undefined
      
      var p: js.UndefOr[Override] = js.undefined
      
      var param: js.UndefOr[Override] = js.undefined
      
      var path: js.UndefOr[Override] = js.undefined
      
      var pattern: js.UndefOr[Override] = js.undefined
      
      var picture: js.UndefOr[Override] = js.undefined
      
      var polygon: js.UndefOr[Override] = js.undefined
      
      var polyline: js.UndefOr[Override] = js.undefined
      
      var pre: js.UndefOr[Override] = js.undefined
      
      var progress: js.UndefOr[Override] = js.undefined
      
      var q: js.UndefOr[Override] = js.undefined
      
      var radialGradient: js.UndefOr[Override] = js.undefined
      
      var rect: js.UndefOr[Override] = js.undefined
      
      var rp: js.UndefOr[Override] = js.undefined
      
      var rt: js.UndefOr[Override] = js.undefined
      
      var ruby: js.UndefOr[Override] = js.undefined
      
      var s: js.UndefOr[Override] = js.undefined
      
      var samp: js.UndefOr[Override] = js.undefined
      
      var script: js.UndefOr[Override] = js.undefined
      
      var section: js.UndefOr[Override] = js.undefined
      
      var select: js.UndefOr[Override] = js.undefined
      
      var slot: js.UndefOr[Override] = js.undefined
      
      var small: js.UndefOr[Override] = js.undefined
      
      var source: js.UndefOr[Override] = js.undefined
      
      var span: js.UndefOr[Override] = js.undefined
      
      var stop: js.UndefOr[Override] = js.undefined
      
      var strong: js.UndefOr[Override] = js.undefined
      
      var style: js.UndefOr[Override] = js.undefined
      
      var sub: js.UndefOr[Override] = js.undefined
      
      var summary: js.UndefOr[Override] = js.undefined
      
      var sup: js.UndefOr[Override] = js.undefined
      
      var svg: js.UndefOr[Override] = js.undefined
      
      var switch: js.UndefOr[Override] = js.undefined
      
      var symbol: js.UndefOr[Override] = js.undefined
      
      var table: js.UndefOr[Override] = js.undefined
      
      var tbody: js.UndefOr[Override] = js.undefined
      
      var td: js.UndefOr[Override] = js.undefined
      
      var template: js.UndefOr[Override] = js.undefined
      
      var text: js.UndefOr[Override] = js.undefined
      
      var textPath: js.UndefOr[Override] = js.undefined
      
      var textarea: js.UndefOr[Override] = js.undefined
      
      var tfoot: js.UndefOr[Override] = js.undefined
      
      var th: js.UndefOr[Override] = js.undefined
      
      var thead: js.UndefOr[Override] = js.undefined
      
      var time: js.UndefOr[Override] = js.undefined
      
      var title: js.UndefOr[Override] = js.undefined
      
      var tr: js.UndefOr[Override] = js.undefined
      
      var track: js.UndefOr[Override] = js.undefined
      
      var tspan: js.UndefOr[Override] = js.undefined
      
      var u: js.UndefOr[Override] = js.undefined
      
      var ul: js.UndefOr[Override] = js.undefined
      
      var use: js.UndefOr[Override] = js.undefined
      
      var `var`: js.UndefOr[Override] = js.undefined
      
      var video: js.UndefOr[Override] = js.undefined
      
      var view: js.UndefOr[Override] = js.undefined
      
      var wbr: js.UndefOr[Override] = js.undefined
      
      var webview: js.UndefOr[Override] = js.undefined
    }
    object Overrides {
      
      inline def apply(): Overrides = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Overrides]
      }
      
      extension [Self <: Overrides](x: Self) {
        
        inline def setA(value: Override): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
        
        inline def setAbbr(value: Override): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
        
        inline def setAddress(value: Override): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setAnimate(value: Override): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        inline def setAnimateMotion(value: Override): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        inline def setAnimateMotionUndefined: Self = StObject.set(x, "animateMotion", js.undefined)
        
        inline def setAnimateTransform(value: Override): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        inline def setAnimateTransformUndefined: Self = StObject.set(x, "animateTransform", js.undefined)
        
        inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
        
        inline def setArea(value: Override): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
        
        inline def setArticle(value: Override): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        inline def setArticleUndefined: Self = StObject.set(x, "article", js.undefined)
        
        inline def setAside(value: Override): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        inline def setAsideUndefined: Self = StObject.set(x, "aside", js.undefined)
        
        inline def setAudio(value: Override): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
        
        inline def setB(value: Override): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
        
        inline def setBase(value: Override): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        inline def setBdi(value: Override): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        inline def setBdiUndefined: Self = StObject.set(x, "bdi", js.undefined)
        
        inline def setBdo(value: Override): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        inline def setBdoUndefined: Self = StObject.set(x, "bdo", js.undefined)
        
        inline def setBig(value: Override): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        inline def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
        
        inline def setBlockquote(value: Override): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
        
        inline def setBody(value: Override): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setBr(value: Override): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
        
        inline def setButton(value: Override): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        inline def setCanvas(value: Override): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
        
        inline def setCaption(value: Override): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
        
        inline def setCircle(value: Override): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
        
        inline def setCite(value: Override): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
        
        inline def setClipPath(value: Override): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
        
        inline def setCode(value: Override): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setCol(value: Override): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
        
        inline def setColgroup(value: Override): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        inline def setColgroupUndefined: Self = StObject.set(x, "colgroup", js.undefined)
        
        inline def setData(value: Override): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDatalist(value: Override): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        inline def setDatalistUndefined: Self = StObject.set(x, "datalist", js.undefined)
        
        inline def setDd(value: Override): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
        
        inline def setDefs(value: Override): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
        
        inline def setDel(value: Override): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
        
        inline def setDesc(value: Override): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        inline def setDetails(value: Override): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        inline def setDfn(value: Override): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        inline def setDfnUndefined: Self = StObject.set(x, "dfn", js.undefined)
        
        inline def setDialog(value: Override): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
        
        inline def setDiv(value: Override): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
        
        inline def setDl(value: Override): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        inline def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
        
        inline def setDt(value: Override): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        inline def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
        
        inline def setEllipse(value: Override): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
        
        inline def setEm(value: Override): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
        
        inline def setEmbed(value: Override): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
        
        inline def setFeBlend(value: Override): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        inline def setFeBlendUndefined: Self = StObject.set(x, "feBlend", js.undefined)
        
        inline def setFeColorMatrix(value: Override): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeColorMatrixUndefined: Self = StObject.set(x, "feColorMatrix", js.undefined)
        
        inline def setFeComponentTransfer(value: Override): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        inline def setFeComponentTransferUndefined: Self = StObject.set(x, "feComponentTransfer", js.undefined)
        
        inline def setFeComposite(value: Override): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        inline def setFeCompositeUndefined: Self = StObject.set(x, "feComposite", js.undefined)
        
        inline def setFeConvolveMatrix(value: Override): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeConvolveMatrixUndefined: Self = StObject.set(x, "feConvolveMatrix", js.undefined)
        
        inline def setFeDiffuseLighting(value: Override): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        inline def setFeDiffuseLightingUndefined: Self = StObject.set(x, "feDiffuseLighting", js.undefined)
        
        inline def setFeDisplacementMap(value: Override): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        inline def setFeDisplacementMapUndefined: Self = StObject.set(x, "feDisplacementMap", js.undefined)
        
        inline def setFeDistantLight(value: Override): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        inline def setFeDistantLightUndefined: Self = StObject.set(x, "feDistantLight", js.undefined)
        
        inline def setFeDropShadow(value: Override): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        inline def setFeDropShadowUndefined: Self = StObject.set(x, "feDropShadow", js.undefined)
        
        inline def setFeFlood(value: Override): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        inline def setFeFloodUndefined: Self = StObject.set(x, "feFlood", js.undefined)
        
        inline def setFeFuncA(value: Override): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        inline def setFeFuncAUndefined: Self = StObject.set(x, "feFuncA", js.undefined)
        
        inline def setFeFuncB(value: Override): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        inline def setFeFuncBUndefined: Self = StObject.set(x, "feFuncB", js.undefined)
        
        inline def setFeFuncG(value: Override): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        inline def setFeFuncGUndefined: Self = StObject.set(x, "feFuncG", js.undefined)
        
        inline def setFeFuncR(value: Override): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        inline def setFeFuncRUndefined: Self = StObject.set(x, "feFuncR", js.undefined)
        
        inline def setFeGaussianBlur(value: Override): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        inline def setFeGaussianBlurUndefined: Self = StObject.set(x, "feGaussianBlur", js.undefined)
        
        inline def setFeImage(value: Override): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        inline def setFeImageUndefined: Self = StObject.set(x, "feImage", js.undefined)
        
        inline def setFeMerge(value: Override): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        inline def setFeMergeNode(value: Override): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        inline def setFeMergeNodeUndefined: Self = StObject.set(x, "feMergeNode", js.undefined)
        
        inline def setFeMergeUndefined: Self = StObject.set(x, "feMerge", js.undefined)
        
        inline def setFeMorphology(value: Override): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        inline def setFeMorphologyUndefined: Self = StObject.set(x, "feMorphology", js.undefined)
        
        inline def setFeOffset(value: Override): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        inline def setFeOffsetUndefined: Self = StObject.set(x, "feOffset", js.undefined)
        
        inline def setFePointLight(value: Override): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        inline def setFePointLightUndefined: Self = StObject.set(x, "fePointLight", js.undefined)
        
        inline def setFeSpecularLighting(value: Override): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        inline def setFeSpecularLightingUndefined: Self = StObject.set(x, "feSpecularLighting", js.undefined)
        
        inline def setFeSpotLight(value: Override): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        inline def setFeSpotLightUndefined: Self = StObject.set(x, "feSpotLight", js.undefined)
        
        inline def setFeTile(value: Override): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        inline def setFeTileUndefined: Self = StObject.set(x, "feTile", js.undefined)
        
        inline def setFeTurbulence(value: Override): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        inline def setFeTurbulenceUndefined: Self = StObject.set(x, "feTurbulence", js.undefined)
        
        inline def setFieldset(value: Override): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        inline def setFieldsetUndefined: Self = StObject.set(x, "fieldset", js.undefined)
        
        inline def setFigcaption(value: Override): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        inline def setFigcaptionUndefined: Self = StObject.set(x, "figcaption", js.undefined)
        
        inline def setFigure(value: Override): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        inline def setFigureUndefined: Self = StObject.set(x, "figure", js.undefined)
        
        inline def setFilter(value: Override): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setFooter(value: Override): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
        
        inline def setForeignObject(value: Override): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        inline def setForeignObjectUndefined: Self = StObject.set(x, "foreignObject", js.undefined)
        
        inline def setForm(value: Override): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setG(value: Override): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
        
        inline def setH1(value: Override): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
        
        inline def setH2(value: Override): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
        
        inline def setH3(value: Override): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
        
        inline def setH4(value: Override): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
        
        inline def setH5(value: Override): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
        
        inline def setH6(value: Override): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
        
        inline def setHead(value: Override): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
        
        inline def setHeader(value: Override): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
        
        inline def setHgroup(value: Override): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        inline def setHgroupUndefined: Self = StObject.set(x, "hgroup", js.undefined)
        
        inline def setHr(value: Override): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
        
        inline def setHtml(value: Override): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        inline def setI(value: Override): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
        
        inline def setIframe(value: Override): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
        
        inline def setImage(value: Override): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setImg(value: Override): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
        
        inline def setInput(value: Override): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
        
        inline def setIns(value: Override): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        inline def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
        
        inline def setKbd(value: Override): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        inline def setKbdUndefined: Self = StObject.set(x, "kbd", js.undefined)
        
        inline def setKeygen(value: Override): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        inline def setKeygenUndefined: Self = StObject.set(x, "keygen", js.undefined)
        
        inline def setLabel(value: Override): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setLegend(value: Override): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
        
        inline def setLi(value: Override): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
        
        inline def setLine(value: Override): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
        
        inline def setLinearGradient(value: Override): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        inline def setLinearGradientUndefined: Self = StObject.set(x, "linearGradient", js.undefined)
        
        inline def setLink(value: Override): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setMain(value: Override): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
        
        inline def setMap(value: Override): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
        
        inline def setMark(value: Override): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
        
        inline def setMarker(value: Override): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
        
        inline def setMask(value: Override): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
        
        inline def setMenu(value: Override): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
        
        inline def setMenuitem(value: Override): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        inline def setMenuitemUndefined: Self = StObject.set(x, "menuitem", js.undefined)
        
        inline def setMeta(value: Override): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
        
        inline def setMetadata(value: Override): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setMeter(value: Override): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        inline def setMeterUndefined: Self = StObject.set(x, "meter", js.undefined)
        
        inline def setMpath(value: Override): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        inline def setMpathUndefined: Self = StObject.set(x, "mpath", js.undefined)
        
        inline def setNav(value: Override): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
        
        inline def setNoindex(value: Override): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
        
        inline def setNoindexUndefined: Self = StObject.set(x, "noindex", js.undefined)
        
        inline def setNoscript(value: Override): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        inline def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
        
        inline def setObject(value: Override): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
        
        inline def setOl(value: Override): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
        
        inline def setOptgroup(value: Override): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        inline def setOptgroupUndefined: Self = StObject.set(x, "optgroup", js.undefined)
        
        inline def setOption(value: Override): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
        
        inline def setOutput(value: Override): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        inline def setP(value: Override): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
        
        inline def setParam(value: Override): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
        
        inline def setPath(value: Override): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setPattern(value: Override): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setPicture(value: Override): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
        
        inline def setPolygon(value: Override): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
        
        inline def setPolyline(value: Override): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
        
        inline def setPre(value: Override): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
        
        inline def setProgress(value: Override): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
        
        inline def setQ(value: Override): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
        
        inline def setRadialGradient(value: Override): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        inline def setRadialGradientUndefined: Self = StObject.set(x, "radialGradient", js.undefined)
        
        inline def setRect(value: Override): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
        
        inline def setRp(value: Override): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        inline def setRpUndefined: Self = StObject.set(x, "rp", js.undefined)
        
        inline def setRt(value: Override): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        inline def setRtUndefined: Self = StObject.set(x, "rt", js.undefined)
        
        inline def setRuby(value: Override): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        inline def setRubyUndefined: Self = StObject.set(x, "ruby", js.undefined)
        
        inline def setS(value: Override): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
        
        inline def setSamp(value: Override): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        inline def setSampUndefined: Self = StObject.set(x, "samp", js.undefined)
        
        inline def setScript(value: Override): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        inline def setSection(value: Override): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
        
        inline def setSelect(value: Override): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
        
        inline def setSlot(value: Override): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        inline def setSmall(value: Override): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
        
        inline def setSource(value: Override): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setSpan(value: Override): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
        
        inline def setStop(value: Override): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
        
        inline def setStrong(value: Override): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
        
        inline def setStyle(value: Override): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setSub(value: Override): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
        
        inline def setSummary(value: Override): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setSup(value: Override): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        inline def setSupUndefined: Self = StObject.set(x, "sup", js.undefined)
        
        inline def setSvg(value: Override): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
        
        inline def setSwitch(value: Override): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        inline def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
        
        inline def setSymbol(value: Override): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
        
        inline def setTable(value: Override): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
        
        inline def setTbody(value: Override): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        inline def setTbodyUndefined: Self = StObject.set(x, "tbody", js.undefined)
        
        inline def setTd(value: Override): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        inline def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
        
        inline def setTemplate(value: Override): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        inline def setText(value: Override): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextPath(value: Override): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        inline def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTextarea(value: Override): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
        
        inline def setTfoot(value: Override): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        inline def setTfootUndefined: Self = StObject.set(x, "tfoot", js.undefined)
        
        inline def setTh(value: Override): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
        
        inline def setThead(value: Override): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        inline def setTheadUndefined: Self = StObject.set(x, "thead", js.undefined)
        
        inline def setTime(value: Override): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
        
        inline def setTitle(value: Override): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTr(value: Override): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
        
        inline def setTrack(value: Override): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
        
        inline def setTspan(value: Override): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        inline def setTspanUndefined: Self = StObject.set(x, "tspan", js.undefined)
        
        inline def setU(value: Override): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
        
        inline def setUl(value: Override): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
        
        inline def setUse(value: Override): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
        
        inline def setVar(value: Override): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        inline def setVarUndefined: Self = StObject.set(x, "var", js.undefined)
        
        inline def setVideo(value: Override): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
        
        inline def setView(value: Override): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
        
        inline def setWbr(value: Override): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
        
        inline def setWbrUndefined: Self = StObject.set(x, "wbr", js.undefined)
        
        inline def setWebview(value: Override): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
        
        inline def setWebviewUndefined: Self = StObject.set(x, "webview", js.undefined)
      }
    }
    
    type Parser[ParserOutput] = js.Function3[
        /* capture */ RegExpMatchArray, 
        /* nestedParse */ NestedParser, 
        /* state */ js.UndefOr[State], 
        ParserOutput
      ]
    
    trait ParserResult
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ParserResult {
      
      inline def apply(): ParserResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParserResult]
      }
      
      extension [Self <: ParserResult](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * RequireAtLeastOne<{ ... }> <- only requires at least one key
      */
    type RequireAtLeastOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
    
    @js.native
    trait Rule[ParserOutput] extends StObject {
      
      def _match(source: String, state: State): RegExpMatchArray = js.native
      def _match(source: String, state: State, prevCapturedString: String): RegExpMatchArray = js.native
      
      var _order: Priority = js.native
      
      var _parse: Parser[ParserOutput] = js.native
      
      var _react: js.UndefOr[
            js.Function3[
              /* node */ ParserOutput, 
              /* output */ RuleOutput, 
              /* state */ js.UndefOr[State], 
              ReactChild
            ]
          ] = js.native
    }
    
    type RuleOutput = js.Function2[/* ast */ ParserResult, /* state */ State, Element]
    
    type Rules = StringDictionary[Rule[ParserResult]]
    
    trait State extends StObject {
      
      var _inAnchor: js.UndefOr[Boolean] = js.undefined
      
      var _inTable: js.UndefOr[Boolean] = js.undefined
      
      var _inline: js.UndefOr[Boolean] = js.undefined
      
      var _key: js.UndefOr[Key] = js.undefined
      
      var _list: js.UndefOr[Boolean] = js.undefined
      
      var _simple: js.UndefOr[Boolean] = js.undefined
    }
    object State {
      
      inline def apply(): State = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[State]
      }
      
      extension [Self <: State](x: Self) {
        
        inline def set_inAnchor(value: Boolean): Self = StObject.set(x, "_inAnchor", value.asInstanceOf[js.Any])
        
        inline def set_inAnchorUndefined: Self = StObject.set(x, "_inAnchor", js.undefined)
        
        inline def set_inTable(value: Boolean): Self = StObject.set(x, "_inTable", value.asInstanceOf[js.Any])
        
        inline def set_inTableUndefined: Self = StObject.set(x, "_inTable", js.undefined)
        
        inline def set_inline(value: Boolean): Self = StObject.set(x, "_inline", value.asInstanceOf[js.Any])
        
        inline def set_inlineUndefined: Self = StObject.set(x, "_inline", js.undefined)
        
        inline def set_key(value: Key): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
        
        inline def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
        
        inline def set_list(value: Boolean): Self = StObject.set(x, "_list", value.asInstanceOf[js.Any])
        
        inline def set_listUndefined: Self = StObject.set(x, "_list", js.undefined)
        
        inline def set_simple(value: Boolean): Self = StObject.set(x, "_simple", value.asInstanceOf[js.Any])
        
        inline def set_simpleUndefined: Self = StObject.set(x, "_simple", js.undefined)
      }
    }
  }
}
