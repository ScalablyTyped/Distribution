package typings.materialUiLab

import typings.materialUiLab.tabContextTabContextMod.TabContextProps
import typings.materialUiLab.tabContextTabContextMod.TabContextValue
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContextMod {
  
  @JSImport("@material-ui/lab/TabContext", JSImport.Default)
  @js.native
  def default(props: TabContextProps): Element = js.native
  
  @JSImport("@material-ui/lab/TabContext", "getPanelId")
  @js.native
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab/TabContext", "getTabId")
  @js.native
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab/TabContext", "useTabContext")
  @js.native
  def useTabContext(): TabContextValue | Null = js.native
}
