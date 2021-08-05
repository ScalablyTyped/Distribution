package typings.grommet

import typings.grommet.grommetStrings.fadeIn
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.slide
import typings.grommet.grommetStrings.vertical
import typings.grommet.utilsMod.AnimateType
import typings.grommet.utilsMod.KeyboardType
import typings.grommet.utilsMod.MarginType
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

object layerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Layer", "Layer")
  @js.native
  class Layer protected ()
    extends Component[
          LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Layer", "Layer")
  @js.native
  val Layer: ComponentClass[
    LayerProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.bottom
    - typings.grommet.grommetStrings.`bottom-left`
    - typings.grommet.grommetStrings.`bottom-right`
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.hidden
    - typings.grommet.grommetStrings.left
    - typings.grommet.grommetStrings.right
    - typings.grommet.grommetStrings.top
    - typings.grommet.grommetStrings.`top-left`
    - typings.grommet.grommetStrings.`top-right`
  */
  trait LayerPositionType extends StObject
  object LayerPositionType {
    
    inline def bottom: typings.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typings.grommet.grommetStrings.bottom]
    
    inline def `bottom-left`: typings.grommet.grommetStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.grommet.grommetStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.grommet.grommetStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.grommet.grommetStrings.`bottom-right`]
    
    inline def center: typings.grommet.grommetStrings.center = "center".asInstanceOf[typings.grommet.grommetStrings.center]
    
    inline def hidden: typings.grommet.grommetStrings.hidden = "hidden".asInstanceOf[typings.grommet.grommetStrings.hidden]
    
    inline def left: typings.grommet.grommetStrings.left = "left".asInstanceOf[typings.grommet.grommetStrings.left]
    
    inline def right: typings.grommet.grommetStrings.right = "right".asInstanceOf[typings.grommet.grommetStrings.right]
    
    inline def top: typings.grommet.grommetStrings.top = "top".asInstanceOf[typings.grommet.grommetStrings.top]
    
    inline def `top-left`: typings.grommet.grommetStrings.`top-left` = "top-left".asInstanceOf[typings.grommet.grommetStrings.`top-left`]
    
    inline def `top-right`: typings.grommet.grommetStrings.`top-right` = "top-right".asInstanceOf[typings.grommet.grommetStrings.`top-right`]
  }
  
  trait LayerProps extends StObject {
    
    var animate: js.UndefOr[AnimateType] = js.undefined
    
    var animation: js.UndefOr[none | slide | fadeIn | Boolean] = js.undefined
    
    var full: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onEsc: js.UndefOr[KeyboardType] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[LayerPositionType] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
  }
  object LayerProps {
    
    inline def apply(): LayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerProps]
    }
    
    extension [Self <: LayerProps](x: Self) {
      
      inline def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimation(value: none | slide | fadeIn | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setFull(value: Boolean | vertical | horizontal): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnClickOutside(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setPosition(value: LayerPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
