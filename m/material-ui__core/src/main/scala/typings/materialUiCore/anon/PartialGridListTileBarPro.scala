package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.bottom
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarProps> */
trait PartialGridListTileBarPro extends StObject {
  
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
object PartialGridListTileBarPro {
  
  @scala.inline
  def apply(): PartialGridListTileBarPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGridListTileBarPro]
  }
  
  @scala.inline
  implicit class PartialGridListTileBarProMutableBuilder[Self <: PartialGridListTileBarPro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionIcon(value: ReactNode): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
    
    @scala.inline
    def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapGridLiActionIcon): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
