package typings.materialUiCore

import typings.materialUiCore.anon.PartialClassNameMapCollap
import typings.materialUiCore.materialUiCoreStrings.auto
import typings.materialUiCore.transitionMod.TransitionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseCollapseMod {
  
  @JSImport("@material-ui/core/Collapse/Collapse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CollapseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.entered
    - typings.materialUiCore.materialUiCoreStrings.hidden
    - typings.materialUiCore.materialUiCoreStrings.wrapper
    - typings.materialUiCore.materialUiCoreStrings.wrapperInner
  */
  trait CollapseClassKey extends StObject
  object CollapseClassKey {
    
    inline def entered: typings.materialUiCore.materialUiCoreStrings.entered = "entered".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.entered]
    
    inline def hidden: typings.materialUiCore.materialUiCoreStrings.hidden = "hidden".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.hidden]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def wrapper: typings.materialUiCore.materialUiCoreStrings.wrapper = "wrapper".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.wrapper]
    
    inline def wrapperInner: typings.materialUiCore.materialUiCoreStrings.wrapperInner = "wrapperInner".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.wrapperInner]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, @material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey, 'timeout'> */
  trait CollapseProps extends StObject {
    
    var addEndListener: js.UndefOr[Any] = js.undefined
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The content node to be collapsed.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapCollap] = js.undefined
    
    /**
      * The height of the container when collapsed.
      * @deprecated The prop was renamed to support the addition of horizontal orientation, use `collapsedSize` instead.
      */
    var collapsedHeight: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The height of the container when collapsed.
      */
    var collapsedSize: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The component used for the root node.
      * Either a string to use a HTML element or a component.
      */
    var component: js.UndefOr[ElementType[TransitionProps]] = js.undefined
    
    /**
      * Enable this prop if you encounter 'Function components cannot be given refs',
      * use `unstable_createStrictModeTheme`,
      * and can't forward the ref in the passed `Component`.
      */
    var disableStrictModeCompat: js.UndefOr[Boolean] = js.undefined
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component will transition in.
      */
    var in: js.UndefOr[Boolean] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var mountOnEnter: js.UndefOr[Any] = js.undefined
    
    var onEnter: js.UndefOr[Any] = js.undefined
    
    var onEntered: js.UndefOr[Any] = js.undefined
    
    var onEntering: js.UndefOr[Any] = js.undefined
    
    var onExit: js.UndefOr[Any] = js.undefined
    
    var onExited: js.UndefOr[Any] = js.undefined
    
    var onExiting: js.UndefOr[Any] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The duration for the transition, in milliseconds.
      * You may specify a single timeout for all transitions, or individually with an object.
      *
      * Set to 'auto' to automatically calculate transition time based on height.
      */
    var timeout: js.UndefOr[Any | auto] = js.undefined
    
    var unmountOnExit: js.UndefOr[Any] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setAddEndListener(value: Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      inline def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapCollap): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setCollapsedHeight(value: String | Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      inline def setCollapsedSize(value: String | Double): Self = StObject.set(x, "collapsedSize", value.asInstanceOf[js.Any])
      
      inline def setCollapsedSizeUndefined: Self = StObject.set(x, "collapsedSize", js.undefined)
      
      inline def setComponent(value: ElementType[TransitionProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDisableStrictModeCompat(value: Boolean): Self = StObject.set(x, "disableStrictModeCompat", value.asInstanceOf[js.Any])
      
      inline def setDisableStrictModeCompatUndefined: Self = StObject.set(x, "disableStrictModeCompat", js.undefined)
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setMountOnEnter(value: Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setOnEnter(value: Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimeout(value: Any | auto): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUnmountOnExit(value: Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
