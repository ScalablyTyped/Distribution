package typings.higButton

import typings.higButton.higButtonStrings._blank
import typings.higButton.higButtonStrings._parent
import typings.higButton.higButtonStrings._self
import typings.higButton.higButtonStrings._top
import typings.higButton.higButtonStrings.flat
import typings.higButton.higButtonStrings.grow
import typings.higButton.higButtonStrings.outline
import typings.higButton.higButtonStrings.primary
import typings.higButton.higButtonStrings.secondary
import typings.higButton.higButtonStrings.shrink
import typings.higButton.higButtonStrings.solid
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hig/button", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  @JSImport("@hig/button", "availableTargets")
  @js.native
  val availableTargets: AvailableTargets_ = js.native
  
  @JSImport("@hig/button", "availableTypes")
  @js.native
  val availableTypes: AvailableTypes_ = js.native
  
  @JSImport("@hig/button", "availableWidths")
  @js.native
  val availableWidths: AvailableWidths_ = js.native
  
  @JSImport("@hig/button", "targets")
  @js.native
  val targets: Targets_ = js.native
  
  @JSImport("@hig/button", "types")
  @js.native
  val types: Types_ = js.native
  
  @JSImport("@hig/button", "widths")
  @js.native
  val widths: Widths_ = js.native
  
  /* Inlined @hig/button.@hig/button.Targets[keyof @hig/button.@hig/button.Targets] */
  /* Rewritten from type alias, can be one of: 
    - typings.higButton.higButtonStrings._self
    - typings.higButton.higButtonStrings._blank
    - typings.higButton.higButtonStrings._parent
    - typings.higButton.higButtonStrings._top
  */
  trait AvailableTargets_ extends StObject
  object AvailableTargets_ {
    
    inline def _blank: typings.higButton.higButtonStrings._blank = "_blank".asInstanceOf[typings.higButton.higButtonStrings._blank]
    
    inline def _parent: typings.higButton.higButtonStrings._parent = "_parent".asInstanceOf[typings.higButton.higButtonStrings._parent]
    
    inline def _self: typings.higButton.higButtonStrings._self = "_self".asInstanceOf[typings.higButton.higButtonStrings._self]
    
    inline def _top: typings.higButton.higButtonStrings._top = "_top".asInstanceOf[typings.higButton.higButtonStrings._top]
  }
  
  /* Inlined @hig/button.@hig/button.Types[keyof @hig/button.@hig/button.Types] */
  /* Rewritten from type alias, can be one of: 
    - typings.higButton.higButtonStrings.primary
    - typings.higButton.higButtonStrings.solid
    - typings.higButton.higButtonStrings.flat
    - typings.higButton.higButtonStrings.secondary
    - typings.higButton.higButtonStrings.outline
  */
  trait AvailableTypes_ extends StObject
  object AvailableTypes_ {
    
    inline def flat: typings.higButton.higButtonStrings.flat = "flat".asInstanceOf[typings.higButton.higButtonStrings.flat]
    
    inline def outline: typings.higButton.higButtonStrings.outline = "outline".asInstanceOf[typings.higButton.higButtonStrings.outline]
    
    inline def primary: typings.higButton.higButtonStrings.primary = "primary".asInstanceOf[typings.higButton.higButtonStrings.primary]
    
    inline def secondary: typings.higButton.higButtonStrings.secondary = "secondary".asInstanceOf[typings.higButton.higButtonStrings.secondary]
    
    inline def solid: typings.higButton.higButtonStrings.solid = "solid".asInstanceOf[typings.higButton.higButtonStrings.solid]
  }
  
  /* Inlined @hig/button.@hig/button.Widths[keyof @hig/button.@hig/button.Widths] */
  /* Rewritten from type alias, can be one of: 
    - typings.higButton.higButtonStrings.shrink
    - typings.higButton.higButtonStrings.grow
  */
  trait AvailableWidths_ extends StObject
  object AvailableWidths_ {
    
    inline def grow: typings.higButton.higButtonStrings.grow = "grow".asInstanceOf[typings.higButton.higButtonStrings.grow]
    
    inline def shrink: typings.higButton.higButtonStrings.shrink = "shrink".asInstanceOf[typings.higButton.higButtonStrings.shrink]
  }
  
  type Button = Component[Props, js.Object, Any]
  
  type Callback = js.Function0[Unit]
  
  trait Props extends StObject {
    
    /** Prevents user interaction with the button */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A @hig/icon element */
    var icon: js.UndefOr[Element] = js.undefined
    
    /** Sets the link of a button */
    var link: js.UndefOr[String] = js.undefined
    
    /** Triggers blur when focus is moved away from icon */
    var onBlur: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when you click the button */
    var onClick: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when focus is moved to button */
    var onFocus: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when you hover over the button */
    var onHover: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when the user's mouse is pressed over the button */
    var onMouseDown: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when the user's mouse is over the button */
    var onMouseEnter: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when the user's mouse is no longer over the button */
    var onMouseLeave: js.UndefOr[Callback] = js.undefined
    
    /** Triggers when the user's mouse is no longer pressed over the button */
    var onMouseUp: js.UndefOr[Callback] = js.undefined
    
    /** Adds custom/overriding styles */
    var stylesheet: js.UndefOr[Any] = js.undefined
    
    /** Specifies where to display the linked URL */
    var target: js.UndefOr[AvailableTargets_] = js.undefined
    
    /** Sets the title of a button */
    var title: String
    
    /** Specifies type of button */
    var `type`: js.UndefOr[AvailableTypes_] = js.undefined
    
    /** Specifies width of button */
    var width: js.UndefOr[AvailableWidths_] = js.undefined
  }
  object Props {
    
    inline def apply(title: String): Props = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHover(value: () => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction0(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: () => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction0(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setStylesheet(value: Any): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      inline def setTarget(value: AvailableTargets_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: AvailableTypes_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: AvailableWidths_): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Targets_ extends StObject {
    
    var BLANK: _blank
    
    var PARENT: _parent
    
    var SELF: _self
    
    var TOP: _top
  }
  object Targets_ {
    
    inline def apply(): Targets_ = {
      val __obj = js.Dynamic.literal(BLANK = "_blank", PARENT = "_parent", SELF = "_self", TOP = "_top")
      __obj.asInstanceOf[Targets_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Targets_] (val x: Self) extends AnyVal {
      
      inline def setBLANK(value: _blank): Self = StObject.set(x, "BLANK", value.asInstanceOf[js.Any])
      
      inline def setPARENT(value: _parent): Self = StObject.set(x, "PARENT", value.asInstanceOf[js.Any])
      
      inline def setSELF(value: _self): Self = StObject.set(x, "SELF", value.asInstanceOf[js.Any])
      
      inline def setTOP(value: _top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types_ extends StObject {
    
    var FLAT: flat
    
    var OUTLINE: outline
    
    /** @deprecated */
    var PRIMARY: primary
    
    /** @deprecated */
    var SECONDARY: secondary
    
    var SOLID: solid
  }
  object Types_ {
    
    inline def apply(): Types_ = {
      val __obj = js.Dynamic.literal(FLAT = "flat", OUTLINE = "outline", PRIMARY = "primary", SECONDARY = "secondary", SOLID = "solid")
      __obj.asInstanceOf[Types_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Types_] (val x: Self) extends AnyVal {
      
      inline def setFLAT(value: flat): Self = StObject.set(x, "FLAT", value.asInstanceOf[js.Any])
      
      inline def setOUTLINE(value: outline): Self = StObject.set(x, "OUTLINE", value.asInstanceOf[js.Any])
      
      inline def setPRIMARY(value: primary): Self = StObject.set(x, "PRIMARY", value.asInstanceOf[js.Any])
      
      inline def setSECONDARY(value: secondary): Self = StObject.set(x, "SECONDARY", value.asInstanceOf[js.Any])
      
      inline def setSOLID(value: solid): Self = StObject.set(x, "SOLID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Widths_ extends StObject {
    
    var GROW: grow
    
    var SHRINK: shrink
  }
  object Widths_ {
    
    inline def apply(): Widths_ = {
      val __obj = js.Dynamic.literal(GROW = "grow", SHRINK = "shrink")
      __obj.asInstanceOf[Widths_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Widths_] (val x: Self) extends AnyVal {
      
      inline def setGROW(value: grow): Self = StObject.set(x, "GROW", value.asInstanceOf[js.Any])
      
      inline def setSHRINK(value: shrink): Self = StObject.set(x, "SHRINK", value.asInstanceOf[js.Any])
    }
  }
}
