package typings.materialUiCore.anon

import typings.materialUiCore.collapseCollapseMod.CollapseProps
import typings.materialUiCore.materialUiCoreStrings.auto
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/Collapse.CollapseProps> */
trait PartialCollapseProps extends StObject {
  
  var addEndListener: js.UndefOr[js.Any] = js.undefined
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[PartialClassNameMapCollap] = js.undefined
  
  var collapsedHeight: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ReactType[CollapseProps]] = js.undefined
  
  var enter: js.UndefOr[Boolean] = js.undefined
  
  var exit: js.UndefOr[Boolean] = js.undefined
  
  var in: js.UndefOr[js.Any] = js.undefined
  
  var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
  
  var mountOnEnter: js.UndefOr[js.Any] = js.undefined
  
  var onEnter: js.UndefOr[js.Any] = js.undefined
  
  var onEntered: js.UndefOr[js.Any] = js.undefined
  
  var onEntering: js.UndefOr[js.Any] = js.undefined
  
  var onExit: js.UndefOr[js.Any] = js.undefined
  
  var onExited: js.UndefOr[js.Any] = js.undefined
  
  var onExiting: js.UndefOr[js.Any] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var theme: js.UndefOr[typings.materialUiCore.createMuiThemeMod.Theme] = js.undefined
  
  var timeout: js.UndefOr[js.Any | auto] = js.undefined
  
  var unmountOnExit: js.UndefOr[js.Any] = js.undefined
}
object PartialCollapseProps {
  
  inline def apply(): PartialCollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapseProps]
  }
  
  extension [Self <: PartialCollapseProps](x: Self) {
    
    inline def setAddEndListener(value: js.Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
    
    inline def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: PartialClassNameMapCollap): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCollapsedHeight(value: String): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
    
    inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
    
    inline def setComponent(value: ReactType[CollapseProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setIn(value: js.Any): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setMountOnEnter(value: js.Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
    
    inline def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: js.Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: js.Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.materialUiCore.createMuiThemeMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTimeout(value: js.Any | auto): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUnmountOnExit(value: js.Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
  }
}
