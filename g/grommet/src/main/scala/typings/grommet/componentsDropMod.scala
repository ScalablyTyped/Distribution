package typings.grommet

import typings.grommet.anon.Bottom
import typings.grommet.anon.Horizontal
import typings.grommet.grommetStrings.align
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.visible
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod.KeyboardType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.RoundType
import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.std.HTMLDocument
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDropMod {
  
  @JSImport("grommet/components/Drop", "Drop")
  @js.native
  val Drop: FC[DropExtendedProps] = js.native
  
  trait DropExtendedProps
    extends StObject
       with DropProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object DropExtendedProps {
    
    inline def apply(): DropExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropExtendedProps]
    }
  }
  
  trait DropProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var align: js.UndefOr[Bottom] = js.undefined
    
    var background: js.UndefOr[BackgroundType] = js.undefined
    
    var elevation: js.UndefOr[ElevationType] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onClickOutside: js.UndefOr[MouseEventHandler[HTMLDocument]] = js.undefined
    
    var onEsc: js.UndefOr[KeyboardType] = js.undefined
    
    var overflow: js.UndefOr[auto | hidden | scroll | visible | Horizontal | String] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var restrictFocus: js.UndefOr[Boolean] = js.undefined
    
    var round: js.UndefOr[RoundType] = js.undefined
    
    var stretch: js.UndefOr[Boolean | align] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
    
    var trapFocus: js.UndefOr[Boolean] = js.undefined
  }
  object DropProps {
    
    inline def apply(): DropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropProps]
    }
    
    extension [Self <: DropProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlign(value: Bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClickOutside(value: MouseEvent[HTMLDocument, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      inline def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRestrictFocus(value: Boolean): Self = StObject.set(x, "restrictFocus", value.asInstanceOf[js.Any])
      
      inline def setRestrictFocusUndefined: Self = StObject.set(x, "restrictFocus", js.undefined)
      
      inline def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setStretch(value: Boolean | align): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
  
  type DropType = DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  
  type divProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
