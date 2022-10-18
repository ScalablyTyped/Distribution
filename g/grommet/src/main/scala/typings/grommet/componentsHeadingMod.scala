package typings.grommet

import typings.grommet.grommetStrings.`1`
import typings.grommet.grommetStrings.`2`
import typings.grommet.grommetStrings.`3`
import typings.grommet.grommetStrings.`4`
import typings.grommet.grommetStrings.`5`
import typings.grommet.grommetStrings.`6`
import typings.grommet.grommetStrings.`break-word`
import typings.grommet.grommetStrings.anywhere
import typings.grommet.grommetStrings.bold
import typings.grommet.grommetStrings.bolder
import typings.grommet.grommetStrings.color
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.lighter
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.normal
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PolymorphicType
import typings.grommet.utilsMod.TextAlignType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHeadingMod {
  
  @JSImport("grommet/components/Heading", "Heading")
  @js.native
  val Heading: FC[HeadingExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped grommet.grommet/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> */ trait HeadingExtendedProps
    extends StObject
       with HeadingProps
  object HeadingExtendedProps {
    
    inline def apply(): HeadingExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingExtendedProps]
    }
  }
  
  trait HeadingProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var as: js.UndefOr[PolymorphicType] = js.undefined
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var level: js.UndefOr[
        `1` | `2` | `3` | `4` | `5` | `6` | typings.grommet.grommetInts.`1` | typings.grommet.grommetInts.`2` | typings.grommet.grommetInts.`3` | typings.grommet.grommetInts.`4` | typings.grommet.grommetInts.`5` | typings.grommet.grommetInts.`6`
      ] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var overflowWrap: js.UndefOr[normal | `break-word` | anywhere | String] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var textAlign: js.UndefOr[TextAlignType] = js.undefined
    
    var truncate: js.UndefOr[Boolean] = js.undefined
    
    var weight: js.UndefOr[normal | bold | lighter | bolder | Double | String] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setLevel(
        value: `1` | `2` | `3` | `4` | `5` | `6` | typings.grommet.grommetInts.`1` | typings.grommet.grommetInts.`2` | typings.grommet.grommetInts.`3` | typings.grommet.grommetInts.`4` | typings.grommet.grommetInts.`5` | typings.grommet.grommetInts.`6`
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOverflowWrap(value: normal | `break-word` | anywhere | String): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
      
      inline def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setWeight(value: normal | bold | lighter | bolder | Double | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type hProps = Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color]
}
