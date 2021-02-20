package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.PartialClassNameMapListItIcon
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def icon: typings.materialUiCore.materialUiCoreStrings.icon = "icon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.icon]
    
    @scala.inline
    def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemAvatar/ListItemAvatar.ListItemAvatarClassKey, never> */
  @js.native
  trait ListItemAvatarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapListItIcon] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListItemAvatarProps {
    
    @scala.inline
    def apply(): ListItemAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemAvatarProps]
    }
    
    @scala.inline
    implicit class ListItemAvatarPropsMutableBuilder[Self <: ListItemAvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapListItIcon): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | RefObject[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ComponentType[ListItemAvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemAvatarListItemAvatarMod.foo` */
  override def _to: ComponentType[ListItemAvatarProps] = default
}
