package typings.materialUiLab

import typings.materialUiLab.tabContextTabContextMod.TabContextProps
import typings.materialUiLab.tabContextTabContextMod.TabContextValue
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContextMod {
  
  @JSImport("@material-ui/lab/TabContext", JSImport.Namespace)
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
}
