package typings.hedron

import org.scalablytyped.runtime.StringDictionary
import typings.hedron.hedronStrings.`inline-block`
import typings.hedron.hedronStrings.`inline-flex`
import typings.hedron.hedronStrings.`inline-grid`
import typings.hedron.hedronStrings.`inline-table`
import typings.hedron.hedronStrings.`inline`
import typings.hedron.hedronStrings.`list-item`
import typings.hedron.hedronStrings.`run-in`
import typings.hedron.hedronStrings.`table-caption`
import typings.hedron.hedronStrings.`table-cell`
import typings.hedron.hedronStrings.`table-column-group`
import typings.hedron.hedronStrings.`table-column`
import typings.hedron.hedronStrings.`table-footer-group`
import typings.hedron.hedronStrings.`table-header-group`
import typings.hedron.hedronStrings.`table-row-group`
import typings.hedron.hedronStrings.`table-row`
import typings.hedron.hedronStrings.block
import typings.hedron.hedronStrings.bottom
import typings.hedron.hedronStrings.center
import typings.hedron.hedronStrings.collapse
import typings.hedron.hedronStrings.contents
import typings.hedron.hedronStrings.flex
import typings.hedron.hedronStrings.grid
import typings.hedron.hedronStrings.hidden
import typings.hedron.hedronStrings.horizontal
import typings.hedron.hedronStrings.inherit
import typings.hedron.hedronStrings.initial
import typings.hedron.hedronStrings.left
import typings.hedron.hedronStrings.none
import typings.hedron.hedronStrings.right
import typings.hedron.hedronStrings.table
import typings.hedron.hedronStrings.top
import typings.hedron.hedronStrings.vertical
import typings.hedron.hedronStrings.visible
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hedron", "Bounds")
  @js.native
  class Bounds protected ()
    extends Component[BoundsProps with HTMLProps[HTMLElement], js.Object, js.Any] {
    def this(props: BoundsProps with HTMLProps[HTMLElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BoundsProps with HTMLProps[HTMLElement], context: js.Any) = this()
  }
  
  @JSImport("hedron", "Box")
  @js.native
  class Box protected ()
    extends Component[BoxProps with HTMLProps[HTMLElement], js.Object, js.Any] {
    def this(props: BoxProps with HTMLProps[HTMLElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BoxProps with HTMLProps[HTMLElement], context: js.Any) = this()
  }
  
  @JSImport("hedron", "Provider")
  @js.native
  class Provider protected ()
    extends Component[ProviderProps with HTMLProps[HTMLElement], js.Object, js.Any] {
    def this(props: ProviderProps with HTMLProps[HTMLElement]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps with HTMLProps[HTMLElement], context: js.Any) = this()
  }
  
  @js.native
  trait BoundsProps
    extends Styleable
       with /**
    *  Allow for customer props due to ability to add
    * custom breakpoints
    */
  /* x */ StringDictionary[js.Any] {
    
    /**
      * Draws all child columns with 'bounding boxes' for easy
      * visualization of the grid. This enables debug mode for all the
      * children of this component
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Direction of content
      */
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Controls the CSS flex property
      */
    var flex: js.UndefOr[String] = js.native
    
    /**
      * Alignment of children along the horizontal axis
      */
    var halign: js.UndefOr[left | center | right] = js.native
    
    /**
      * Alignment of children along the vertical axis
      */
    var valign: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * Sets whether the children should wrap when there's no more room on the primary axis
      */
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object BoundsProps {
    
    @scala.inline
    def apply(): BoundsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoundsProps]
    }
    
    @scala.inline
    implicit class BoundsPropsMutableBuilder[Self <: BoundsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setHalign(value: left | center | right): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalignUndefined: Self = StObject.set(x, "halign", js.undefined)
      
      @scala.inline
      def setValign(value: top | center | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait BoxProps
    extends Styleable
       with /**
    *  Allow for customer props due to ability to add
    * custom breakpoints
    */
  /* x */ StringDictionary[js.Any] {
    
    /**
      * Draws all child columns with 'bounding boxes' for easy
      * visualization of the grid. This enables debug mode for all the
      * children of this component
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets whether the Box should fill up all available space
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls the CSS flex property
      */
    var flex: js.UndefOr[String] = js.native
    
    /**
      * Convenience property for disabling padding
      */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /**
      * Shifts the box to the bottom of the parent Bounds
      */
    var shiftDown: js.UndefOr[Boolean] = js.native
    
    /**
      * Shifts the box to the left of the parent Bounds
      */
    var shiftLeft: js.UndefOr[Boolean] = js.native
    
    /**
      * Shifts the box to the right of the parent Bounds
      */
    var shiftRight: js.UndefOr[Boolean] = js.native
    
    /**
      * Shifts the box to the top of the parent Bounds
      */
    var shiftUp: js.UndefOr[Boolean] = js.native
  }
  object BoxProps {
    
    @scala.inline
    def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setShiftDown(value: Boolean): Self = StObject.set(x, "shiftDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftDownUndefined: Self = StObject.set(x, "shiftDown", js.undefined)
      
      @scala.inline
      def setShiftLeft(value: Boolean): Self = StObject.set(x, "shiftLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftLeftUndefined: Self = StObject.set(x, "shiftLeft", js.undefined)
      
      @scala.inline
      def setShiftRight(value: Boolean): Self = StObject.set(x, "shiftRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftRightUndefined: Self = StObject.set(x, "shiftRight", js.undefined)
      
      @scala.inline
      def setShiftUp(value: Boolean): Self = StObject.set(x, "shiftUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftUpUndefined: Self = StObject.set(x, "shiftUp", js.undefined)
    }
  }
  
  @js.native
  trait ProviderProps extends StObject {
    
    /**
      * Object specifying the breakpoints
      */
    var breakpoints: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Draws all child columns with 'bounding boxes' for easy
      * visualization of the grid. This enables debug mode for all the
      * children of this component
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * The amount of padding added
      */
    var padding: js.UndefOr[String] = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: StringDictionary[String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  @js.native
  trait Styleable extends StObject {
    
    /**
      * Background Property
      */
    var background: js.UndefOr[String] = js.native
    
    /**
      * Border property
      */
    var border: js.UndefOr[String] = js.native
    
    /**
      * Display Property
      */
    var display: js.UndefOr[
        `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
      ] = js.native
    
    /**
      * Height Property
      */
    var height: js.UndefOr[String] = js.native
    
    /**
      * Controls hidden
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * The amount of padding added
      */
    var margin: js.UndefOr[String] = js.native
    
    /**
      * Opacity Property
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * The amount of padding added
      */
    var padding: js.UndefOr[String] = js.native
    
    /**
      * Visibilty Property
      */
    var visibility: js.UndefOr[visible | hidden | collapse | initial | inherit] = js.native
    
    /**
      * Width Property
      */
    var width: js.UndefOr[String] = js.native
  }
  object Styleable {
    
    @scala.inline
    def apply(): Styleable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styleable]
    }
    
    @scala.inline
    implicit class StyleableMutableBuilder[Self <: Styleable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDisplay(
        value: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setVisibility(value: visible | hidden | collapse | initial | inherit): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
