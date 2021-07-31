package typings.grommet

import typings.grommet.anon.Bottom
import typings.grommet.anon.Horizontal
import typings.grommet.grommetStrings.align
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.visible
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod.KeyboardType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Drop", "Drop")
  @js.native
  class Drop protected ()
    extends Component[
          DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Drop", "Drop")
  @js.native
  val Drop: ComponentClass[
    DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  trait DropProps extends StObject {
    
    var align: js.UndefOr[Bottom] = js.undefined
    
    var elevation: js.UndefOr[ElevationType] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onEsc: js.UndefOr[KeyboardType] = js.undefined
    
    var overflow: js.UndefOr[auto | hidden | scroll | visible | Horizontal | String] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var restrictFocus: js.UndefOr[Boolean] = js.undefined
    
    var stretch: js.UndefOr[Boolean | align] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
    
    var trapFocus: js.UndefOr[Boolean] = js.undefined
  }
  object DropProps {
    
    @scala.inline
    def apply(): DropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropProps]
    }
    
    @scala.inline
    implicit class DropPropsMutableBuilder[Self <: DropProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setOnClickOutside(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      @scala.inline
      def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRestrictFocus(value: Boolean): Self = StObject.set(x, "restrictFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictFocusUndefined: Self = StObject.set(x, "restrictFocus", js.undefined)
      
      @scala.inline
      def setStretch(value: Boolean | align): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
  
  type DropType = DropProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
}
