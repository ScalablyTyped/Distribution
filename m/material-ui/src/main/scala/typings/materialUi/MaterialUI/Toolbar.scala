package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  type Toolbar = Component[ToolbarProps, js.Object, Any]
  
  type ToolbarGroup = Component[ToolbarGroupProps, js.Object, Any]
  
  trait ToolbarGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var firstChild: js.UndefOr[Boolean] = js.undefined
    
    var float: js.UndefOr[left | right] = js.undefined
    
    var lastChild: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToolbarGroupProps {
    
    inline def apply(): ToolbarGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarGroupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFirstChild(value: Boolean): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
      
      inline def setFloat(value: left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setLastChild(value: Boolean): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ToolbarProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var noGutter: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToolbarProps {
    
    inline def apply(): ToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNoGutter(value: Boolean): Self = StObject.set(x, "noGutter", value.asInstanceOf[js.Any])
      
      inline def setNoGutterUndefined: Self = StObject.set(x, "noGutter", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type ToolbarSeparator = Component[ToolbarSeparatorProps, js.Object, Any]
  
  trait ToolbarSeparatorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToolbarSeparatorProps {
    
    inline def apply(): ToolbarSeparatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSeparatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarSeparatorProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type ToolbarTitle = Component[ToolbarTitleProps, js.Object, Any]
  
  trait ToolbarTitleProps
    extends StObject
       with HTMLAttributes[js.Object] {
    
    var ref: js.UndefOr[LegacyRef[ToolbarTitle]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ToolbarTitleProps {
    
    inline def apply(): ToolbarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarTitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarTitleProps] (val x: Self) extends AnyVal {
      
      inline def setRef(value: LegacyRef[ToolbarTitle]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ToolbarTitle | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
