package typings.materialUiLab

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContextTabContextMod {
  
  @JSImport("@material-ui/lab/TabContext/TabContext", JSImport.Default)
  @js.native
  def default(props: TabContextProps): Element = js.native
  
  @JSImport("@material-ui/lab/TabContext/TabContext", "getPanelId")
  @js.native
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab/TabContext/TabContext", "getTabId")
  @js.native
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab/TabContext/TabContext", "useTabContext")
  @js.native
  def useTabContext(): TabContextValue | Null = js.native
  
  @js.native
  trait TabContextProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * The value of the currently selected `Tab`.
      */
    var value: String = js.native
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
  
  @js.native
  trait TabContextValue extends StObject {
    
    var idPrefix: String = js.native
    
    var value: String = js.native
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
