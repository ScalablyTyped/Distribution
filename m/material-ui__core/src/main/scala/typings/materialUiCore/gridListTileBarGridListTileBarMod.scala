package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.PartialClassNameMapGridLiActionIcon
import typings.materialUiCore.materialUiCoreStrings.bottom
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListTileBarGridListTileBarMod extends Shortcut {
  
  @JSImport("@material-ui/core/GridListTileBar/GridListTileBar", JSImport.Default)
  @js.native
  val default: ComponentType[GridListTileBarProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.titlePositionBottom
    - typings.materialUiCore.materialUiCoreStrings.titlePositionTop
    - typings.materialUiCore.materialUiCoreStrings.rootSubtitle
    - typings.materialUiCore.materialUiCoreStrings.titleWrap
    - typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft
    - typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight
    - typings.materialUiCore.materialUiCoreStrings.title
    - typings.materialUiCore.materialUiCoreStrings.subtitle
    - typings.materialUiCore.materialUiCoreStrings.actionIcon
    - typings.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft
  */
  trait GridListTileBarClassKey extends StObject
  object GridListTileBarClassKey {
    
    inline def actionIcon: typings.materialUiCore.materialUiCoreStrings.actionIcon = "actionIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.actionIcon]
    
    inline def actionIconActionPosLeft: typings.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft = "actionIconActionPosLeft".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def rootSubtitle: typings.materialUiCore.materialUiCoreStrings.rootSubtitle = "rootSubtitle".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rootSubtitle]
    
    inline def subtitle: typings.materialUiCore.materialUiCoreStrings.subtitle = "subtitle".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subtitle]
    
    inline def title: typings.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.title]
    
    inline def titlePositionBottom: typings.materialUiCore.materialUiCoreStrings.titlePositionBottom = "titlePositionBottom".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titlePositionBottom]
    
    inline def titlePositionTop: typings.materialUiCore.materialUiCoreStrings.titlePositionTop = "titlePositionTop".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titlePositionTop]
    
    inline def titleWrap: typings.materialUiCore.materialUiCoreStrings.titleWrap = "titleWrap".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titleWrap]
    
    inline def titleWrapActionPosLeft: typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft = "titleWrapActionPosLeft".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft]
    
    inline def titleWrapActionPosRight: typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight = "titleWrapActionPosRight".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey, never> */
  trait GridListTileBarProps extends StObject {
    
    var actionIcon: js.UndefOr[ReactNode] = js.undefined
    
    var actionPosition: js.UndefOr[left | right] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[PartialClassNameMapGridLiActionIcon] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var titlePosition: js.UndefOr[top | bottom] = js.undefined
  }
  object GridListTileBarProps {
    
    inline def apply(): GridListTileBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListTileBarProps]
    }
    
    extension [Self <: GridListTileBarProps](x: Self) {
      
      inline def setActionIcon(value: ReactNode): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      inline def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      inline def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      inline def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapGridLiActionIcon): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ComponentType[GridListTileBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridListTileBarGridListTileBarMod.foo` */
  override def _to: ComponentType[GridListTileBarProps] = default
}
