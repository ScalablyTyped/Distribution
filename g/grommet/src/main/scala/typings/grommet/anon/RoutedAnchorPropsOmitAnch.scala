package typings.grommet.anon

import typings.grommet.grommetStrings.bold
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.normal
import typings.grommet.grommetStrings.push
import typings.grommet.grommetStrings.replace
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PolymorphicType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined grommet.grommet/components/RoutedAnchor.RoutedAnchorProps & grommet.grommet/utils.Omit<grommet.grommet/components/Anchor.AnchorProps, 'href'> */
trait RoutedAnchorPropsOmitAnch extends StObject {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  
  var as: js.UndefOr[PolymorphicType] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var gap: js.UndefOr[GapType] = js.undefined
  
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  
  var icon: js.UndefOr[Element] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var method: js.UndefOr[push | replace] = js.undefined
  
  var path: String
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  
  var weight: js.UndefOr[normal | bold | String | Double] = js.undefined
}
object RoutedAnchorPropsOmitAnch {
  
  inline def apply(path: String): RoutedAnchorPropsOmitAnch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedAnchorPropsOmitAnch]
  }
  
  extension [Self <: RoutedAnchorPropsOmitAnch](x: Self) {
    
    inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
    
    inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
    
    inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setSize(value: xsmall | small | medium | large | xlarge | xxlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setWeight(value: normal | bold | String | Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
