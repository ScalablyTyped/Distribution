package typings.grommet

import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMarkdownMod {
  
  @JSImport("grommet/components/Markdown", "Markdown")
  @js.native
  val Markdown: FC[MarkdownExtendedProps] = js.native
  
  trait MarkdownExtendedProps
    extends StObject
       with MarkdownProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object MarkdownExtendedProps {
    
    inline def apply(): MarkdownExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownExtendedProps]
    }
  }
  
  trait MarkdownProps extends StObject {
    
    var components: js.UndefOr[js.Object] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object MarkdownProps {
    
    inline def apply(): MarkdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownProps]
    }
    
    extension [Self <: MarkdownProps](x: Self) {
      
      inline def setComponents(value: js.Object): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type divProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
