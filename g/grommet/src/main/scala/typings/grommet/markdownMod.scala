package typings.grommet

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Markdown", "Markdown")
  @js.native
  class Markdown protected ()
    extends Component[
          MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Markdown", "Markdown")
  @js.native
  val Markdown: ComponentClass[
    MarkdownProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  trait MarkdownProps extends StObject {
    
    var components: js.UndefOr[js.Object] = js.undefined
  }
  object MarkdownProps {
    
    @scala.inline
    def apply(): MarkdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownProps]
    }
    
    @scala.inline
    implicit class MarkdownPropsMutableBuilder[Self <: MarkdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Object): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
}
