package typings.grommet

import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.first
import typings.grommet.grommetStrings.last
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("grommet/components/Stack", "Stack")
  @js.native
  val Stack: FC[StackExtendedProps] = js.native
  
  trait StackExtendedProps
    extends StObject
       with StackProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object StackExtendedProps {
    
    inline def apply(): StackExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackExtendedProps]
    }
  }
  
  trait StackProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var anchor: js.UndefOr[
        center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
      ] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var guidingChild: js.UndefOr[Double | first | last] = js.undefined
    
    var interactiveChild: js.UndefOr[Double | first | last] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
  }
  object StackProps {
    
    inline def apply(): StackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackProps]
    }
    
    extension [Self <: StackProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAnchor(
        value: center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGuidingChild(value: Double | first | last): Self = StObject.set(x, "guidingChild", value.asInstanceOf[js.Any])
      
      inline def setGuidingChildUndefined: Self = StObject.set(x, "guidingChild", js.undefined)
      
      inline def setInteractiveChild(value: Double | first | last): Self = StObject.set(x, "interactiveChild", value.asInstanceOf[js.Any])
      
      inline def setInteractiveChildUndefined: Self = StObject.set(x, "interactiveChild", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
  
  type divProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
