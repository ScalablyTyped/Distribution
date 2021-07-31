package typings.materialUiLab

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContextTabContextMod {
  
  @JSImport("@material-ui/lab/TabContext/TabContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TabContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getPanelId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPanelId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTabId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def useTabContext(): TabContextValue | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabContext")().asInstanceOf[TabContextValue | Null]
  
  trait TabContextProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The value of the currently selected `Tab`.
      */
    var value: String
  }
  object TabContextProps {
    
    @scala.inline
    def apply(value: String): TabContextProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContextProps]
    }
    
    @scala.inline
    implicit class TabContextPropsMutableBuilder[Self <: TabContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabContextValue extends StObject {
    
    var idPrefix: String
    
    var value: String
  }
  object TabContextValue {
    
    @scala.inline
    def apply(idPrefix: String, value: String): TabContextValue = {
      val __obj = js.Dynamic.literal(idPrefix = idPrefix.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContextValue]
    }
    
    @scala.inline
    implicit class TabContextValueMutableBuilder[Self <: TabContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
