package typings.markdownToJsx

import typings.markdownToJsx.anon.Dictkey
import typings.react.mod.Attributes
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-to-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("markdown-to-jsx", JSImport.Default)
  @js.native
  class default ()
    extends Component[MarkdownProps, js.Object, js.Any]
  
  @scala.inline
  def compiler(markdown: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("compiler")(markdown.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def compiler(markdown: String, options: MarkdownOptions): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("compiler")(markdown.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type ComponentOverride[P, S] = String | (ComponentClass[P, S]) | SFC[P] | (typings.markdownToJsx.anon.Component[P, S])
  
  type Markdown = Component[MarkdownProps, js.Object, js.Any]
  
  trait MarkdownOptions extends StObject {
    
    /** Custom React.createElement behavior. */
    var createElement: js.UndefOr[
        js.Function3[
          /* type */ SFC[js.Object] | (ComponentClass[js.Object, ComponentState]) | String, 
          /* props */ js.UndefOr[(Attributes & js.Object) | Null], 
          /* repeated */ ReactNode, 
          ReactElement
        ]
      ] = js.undefined
    
    /** By default, raw HTML is parsed to JSX. This behavior can be disabled with this option. */
    var disableParsingRawHTML: js.UndefOr[Boolean] = js.undefined
    
    /** Force all input strings to use block layout. */
    var forceBlock: js.UndefOr[Boolean] = js.undefined
    
    /** Force all input strings to use inline layout. */
    var forceInline: js.UndefOr[Boolean] = js.undefined
    
    /** Override named html codes that should be converted to unicode characters. */
    var namedCodesToUnicode: js.UndefOr[Record[String, String]] = js.undefined
    
    /** Override representation of any HTML tag or custom component. */
    var overrides: js.UndefOr[Dictkey] = js.undefined
    
    /** Custom function to generate an HTML id from headings. */
    var slugify: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  }
  object MarkdownOptions {
    
    @scala.inline
    def apply(): MarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownOptions]
    }
    
    @scala.inline
    implicit class MarkdownOptionsMutableBuilder[Self <: MarkdownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateElement(
        value: (/* type */ SFC[js.Object] | (ComponentClass[js.Object, ComponentState]) | String, /* props */ js.UndefOr[(Attributes & js.Object) | Null], /* repeated */ ReactNode) => ReactElement
      ): Self = StObject.set(x, "createElement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateElementUndefined: Self = StObject.set(x, "createElement", js.undefined)
      
      @scala.inline
      def setDisableParsingRawHTML(value: Boolean): Self = StObject.set(x, "disableParsingRawHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableParsingRawHTMLUndefined: Self = StObject.set(x, "disableParsingRawHTML", js.undefined)
      
      @scala.inline
      def setForceBlock(value: Boolean): Self = StObject.set(x, "forceBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceBlockUndefined: Self = StObject.set(x, "forceBlock", js.undefined)
      
      @scala.inline
      def setForceInline(value: Boolean): Self = StObject.set(x, "forceInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceInlineUndefined: Self = StObject.set(x, "forceInline", js.undefined)
      
      @scala.inline
      def setNamedCodesToUnicode(value: Record[String, String]): Self = StObject.set(x, "namedCodesToUnicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedCodesToUnicodeUndefined: Self = StObject.set(x, "namedCodesToUnicode", js.undefined)
      
      @scala.inline
      def setOverrides(value: Dictkey): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSlugify(value: /* text */ String => String): Self = StObject.set(x, "slugify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlugifyUndefined: Self = StObject.set(x, "slugify", js.undefined)
    }
  }
  
  trait MarkdownProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    @JSName("children")
    var children_MarkdownProps: String
    
    var options: js.UndefOr[MarkdownOptions] = js.undefined
  }
  object MarkdownProps {
    
    @scala.inline
    def apply(children: String): MarkdownProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownProps]
    }
    
    @scala.inline
    implicit class MarkdownPropsMutableBuilder[Self <: MarkdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: MarkdownOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
