package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.PartialClassNameMapListItIcon
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemAvatarListItemAvatarMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItemAvatar/ListItemAvatar", JSImport.Default)
  @js.native
  val default: ComponentType[ListItemAvatarProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.icon
  */
  trait ListItemAvatarClassKey extends StObject
  object ListItemAvatarClassKey {
    
    inline def icon: typings.materialUiCore.materialUiCoreStrings.icon = "icon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.icon]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemAvatar/ListItemAvatar.ListItemAvatarClassKey, never> */
  trait ListItemAvatarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[PartialClassNameMapListItIcon] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ListItemAvatarProps {
    
    inline def apply(): ListItemAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemAvatarProps]
    }
    
    extension [Self <: ListItemAvatarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapListItIcon): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ComponentType[ListItemAvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemAvatarListItemAvatarMod.foo` */
  override def _to: ComponentType[ListItemAvatarProps] = default
}
