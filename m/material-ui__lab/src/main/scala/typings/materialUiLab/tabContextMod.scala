package typings.materialUiLab

import typings.materialUiLab.tabContextTabContextMod.TabContextProps
import typings.materialUiLab.tabContextTabContextMod.TabContextValue
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/lab/TabContext", JSImport.Namespace)
@js.native
object tabContextMod extends js.Object {
  
  def default(props: TabContextProps): Element = js.native
  
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  
  def useTabContext(): TabContextValue | Null = js.native
}
