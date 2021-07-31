package typings.materialUiLab

import typings.materialUiCore.anon.ClassName
import typings.materialUiCore.withStylesMod.StyledComponentProps
import typings.materialUiLab.anon.PartialFabProps
import typings.materialUiLab.materialUiLabStrings.down
import typings.materialUiLab.materialUiLabStrings.left
import typings.materialUiLab.materialUiLabStrings.right
import typings.materialUiLab.materialUiLabStrings.up
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialSpeedDialMod {
  
  @JSImport("@material-ui/lab/SpeedDial/SpeedDial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: SpeedDialProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.toggle
    - typings.materialUiLab.materialUiLabStrings.blur
    - typings.materialUiLab.materialUiLabStrings.mouseLeave
    - typings.materialUiLab.materialUiLabStrings.escapeKeyDown
  */
  trait CloseReason extends StObject
  object CloseReason {
    
    @scala.inline
    def blur: typings.materialUiLab.materialUiLabStrings.blur = "blur".asInstanceOf[typings.materialUiLab.materialUiLabStrings.blur]
    
    @scala.inline
    def escapeKeyDown: typings.materialUiLab.materialUiLabStrings.escapeKeyDown = "escapeKeyDown".asInstanceOf[typings.materialUiLab.materialUiLabStrings.escapeKeyDown]
    
    @scala.inline
    def mouseLeave: typings.materialUiLab.materialUiLabStrings.mouseLeave = "mouseLeave".asInstanceOf[typings.materialUiLab.materialUiLabStrings.mouseLeave]
    
    @scala.inline
    def toggle: typings.materialUiLab.materialUiLabStrings.toggle = "toggle".asInstanceOf[typings.materialUiLab.materialUiLabStrings.toggle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.toggle
    - typings.materialUiLab.materialUiLabStrings.focus
    - typings.materialUiLab.materialUiLabStrings.mouseEnter
  */
  trait OpenReason extends StObject
  object OpenReason {
    
    @scala.inline
    def focus: typings.materialUiLab.materialUiLabStrings.focus = "focus".asInstanceOf[typings.materialUiLab.materialUiLabStrings.focus]
    
    @scala.inline
    def mouseEnter: typings.materialUiLab.materialUiLabStrings.mouseEnter = "mouseEnter".asInstanceOf[typings.materialUiLab.materialUiLabStrings.mouseEnter]
    
    @scala.inline
    def toggle: typings.materialUiLab.materialUiLabStrings.toggle = "toggle".asInstanceOf[typings.materialUiLab.materialUiLabStrings.toggle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.fab
    - typings.materialUiLab.materialUiLabStrings.directionUp
    - typings.materialUiLab.materialUiLabStrings.directionDown
    - typings.materialUiLab.materialUiLabStrings.directionLeft
    - typings.materialUiLab.materialUiLabStrings.directionRight
    - typings.materialUiLab.materialUiLabStrings.actions
    - typings.materialUiLab.materialUiLabStrings.actionsClosed
  */
  trait SpeedDialClassKey extends StObject
  object SpeedDialClassKey {
    
    @scala.inline
    def actions: typings.materialUiLab.materialUiLabStrings.actions = "actions".asInstanceOf[typings.materialUiLab.materialUiLabStrings.actions]
    
    @scala.inline
    def actionsClosed: typings.materialUiLab.materialUiLabStrings.actionsClosed = "actionsClosed".asInstanceOf[typings.materialUiLab.materialUiLabStrings.actionsClosed]
    
    @scala.inline
    def directionDown: typings.materialUiLab.materialUiLabStrings.directionDown = "directionDown".asInstanceOf[typings.materialUiLab.materialUiLabStrings.directionDown]
    
    @scala.inline
    def directionLeft: typings.materialUiLab.materialUiLabStrings.directionLeft = "directionLeft".asInstanceOf[typings.materialUiLab.materialUiLabStrings.directionLeft]
    
    @scala.inline
    def directionRight: typings.materialUiLab.materialUiLabStrings.directionRight = "directionRight".asInstanceOf[typings.materialUiLab.materialUiLabStrings.directionRight]
    
    @scala.inline
    def directionUp: typings.materialUiLab.materialUiLabStrings.directionUp = "directionUp".asInstanceOf[typings.materialUiLab.materialUiLabStrings.directionUp]
    
    @scala.inline
    def fab: typings.materialUiLab.materialUiLabStrings.fab = "fab".asInstanceOf[typings.materialUiLab.materialUiLabStrings.fab]
    
    @scala.inline
    def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | 'children'>> : never */ trait SpeedDialProps
    extends StObject
       with StyledComponentProps[SpeedDialClassKey]
       with ClassName {
    
    /**
      * Props applied to the [`Fab`](/api/fab/) element.
      */
    var FabProps: js.UndefOr[PartialFabProps] = js.undefined
    
    /**
      * The component used for the transition.
      * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
      */
    var TransitionComponent: js.UndefOr[
        ComponentType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
        ]
      ] = js.undefined
    
    /**
      * Props applied to the [`Transition`](http://reactcommunity.org/react-transition-group/transition#Transition-props) element.
      */
    var TransitionProps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
      ] = js.undefined
    
    /**
      * The aria-label of the button element.
      * Also used to provide the `id` for the `SpeedDial` element and its children.
      */
    var ariaLabel: String
    
    /**
      * SpeedDialActions to display when the SpeedDial is `open`.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The direction the actions open relative to the floating action button.
      */
    var direction: js.UndefOr[up | down | left | right] = js.undefined
    
    /**
      * If `true`, the SpeedDial will be hidden.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
      * provides a default Icon with animation.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Callback fired when the component requests to be closed.
      *
      * @param {object} event The event source of the callback.
      * @param {string} reason Can be: `"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
      */
    var onClose: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[js.Object, Event], /* reason */ CloseReason, Unit]
      ] = js.undefined
    
    /**
      * Callback fired when the component requests to be open.
      *
      * @param {object} event The event source of the callback.
      * @param {string} reason Can be: `"toggle"`, `"focus"`, `"mouseEnter"`.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[js.Object, Event], /* reason */ OpenReason, Unit]
      ] = js.undefined
    
    /**
      * If `true`, the SpeedDial is open.
      */
    var open: Boolean
    
    /**
      * The icon to display in the SpeedDial Fab when the SpeedDial is open.
      */
    var openIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The duration for the transition, in milliseconds.
      * You may specify a single timeout for all transitions, or individually with an object.
      */
    var transitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
      ] = js.undefined
  }
  object SpeedDialProps {
    
    @scala.inline
    def apply(ariaLabel: String, open: Boolean): SpeedDialProps = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpeedDialProps]
    }
    
    @scala.inline
    implicit class SpeedDialPropsMutableBuilder[Self <: SpeedDialProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: up | down | left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFabProps(value: PartialFabProps): Self = StObject.set(x, "FabProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFabPropsUndefined: Self = StObject.set(x, "FabProps", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* event */ SyntheticEvent[js.Object, Event], /* reason */ CloseReason) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* event */ SyntheticEvent[js.Object, Event], /* reason */ OpenReason) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIcon(value: ReactNode): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIconUndefined: Self = StObject.set(x, "openIcon", js.undefined)
      
      @scala.inline
      def setTransitionComponent(
        value: ComponentType[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
            ]
      ): Self = StObject.set(x, "TransitionComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentUndefined: Self = StObject.set(x, "TransitionComponent", js.undefined)
      
      @scala.inline
      def setTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
      ): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
      ): Self = StObject.set(x, "TransitionProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionPropsUndefined: Self = StObject.set(x, "TransitionProps", js.undefined)
    }
  }
}
