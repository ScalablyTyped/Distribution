package typings.grommet

import typings.grommet.anon.Disabled
import typings.grommet.anon.Max
import typings.grommet.componentsTipMod.TipProps
import typings.grommet.grommetStrings._blank
import typings.grommet.grommetStrings._parent
import typings.grommet.grommetStrings._self
import typings.grommet.grommetStrings._top
import typings.grommet.grommetStrings.around
import typings.grommet.grommetStrings.between
import typings.grommet.grommetStrings.button
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.color
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.evenly
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.reset
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.submit
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.HoverIndicatorType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PolymorphicType
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonMod {
  
  @JSImport("grommet/components/Button", "Button")
  @js.native
  val Button: FC[ButtonExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof grommet.grommet/components/Button.extendType, 'target' | 'children'> ]: grommet.grommet/components/Button.extendType[P]} */ trait ButtonExtendedProps
    extends StObject
       with ButtonProps
  object ButtonExtendedProps {
    
    inline def apply(): ButtonExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonExtendedProps]
    }
  }
  
  trait ButtonProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var as: js.UndefOr[PolymorphicType] = js.undefined
    
    var badge: js.UndefOr[Boolean | Double | Max | Element] = js.undefined
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* hasDisabledHoverFocus */ Disabled, ReactNode])] = js.undefined
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var focusIndicator: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[GapType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var hoverIndicator: js.UndefOr[HoverIndicatorType] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var justify: js.UndefOr[around | between | center | end | evenly | start | stretch] = js.undefined
    
    var kind: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var primary: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | String] = js.undefined
    
    var target: js.UndefOr[_self | _blank | _parent | _top | String] = js.undefined
    
    var tip: js.UndefOr[TipProps | String] = js.undefined
    
    var `type`: js.UndefOr[button | reset | submit] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBadge(value: Boolean | Double | Max | Element): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setChildren(value: ReactNode | (js.Function1[/* hasDisabledHoverFocus */ Disabled, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* hasDisabledHoverFocus */ Disabled => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      inline def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHoverIndicator(value: HoverIndicatorType): Self = StObject.set(x, "hoverIndicator", value.asInstanceOf[js.Any])
      
      inline def setHoverIndicatorUndefined: Self = StObject.set(x, "hoverIndicator", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setJustify(value: around | between | center | end | evenly | start | stretch): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setSize(value: small | medium | large | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTarget(value: _self | _blank | _parent | _top | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTip(value: TipProps | String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setType(value: button | reset | submit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ButtonType_ = ButtonProps & extendType
  
  type anchorType = Omit[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    color
  ]
  
  type buttonType = Omit[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    color
  ]
  
  type extendType = anchorType & buttonType
}
