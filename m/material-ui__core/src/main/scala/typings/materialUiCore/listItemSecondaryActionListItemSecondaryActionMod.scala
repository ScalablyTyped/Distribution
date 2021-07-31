package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.PartialClassNameMapListItRoot
import typings.materialUiCore.materialUiCoreStrings.root
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSecondaryActionListItemSecondaryActionMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItemSecondaryAction/ListItemSecondaryAction", JSImport.Default)
  @js.native
  val default: ComponentType[ListItemSecondaryActionProps] = js.native
  
  type ListItemSecondaryActionClassKey = root
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemSecondaryAction/ListItemSecondaryAction.ListItemSecondaryActionClassKey, never> */
  trait ListItemSecondaryActionProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[PartialClassNameMapListItRoot] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ListItemSecondaryActionProps {
    
    @scala.inline
    def apply(): ListItemSecondaryActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemSecondaryActionProps]
    }
    
    @scala.inline
    implicit class ListItemSecondaryActionPropsMutableBuilder[Self <: ListItemSecondaryActionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapListItRoot): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
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
    }
  }
  
  type _To = ComponentType[ListItemSecondaryActionProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemSecondaryActionListItemSecondaryActionMod.foo` */
  override def _to: ComponentType[ListItemSecondaryActionProps] = default
}
