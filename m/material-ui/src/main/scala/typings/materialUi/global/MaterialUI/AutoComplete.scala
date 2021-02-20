package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.AutoCompleteProps
import typings.materialUi.MaterialUI.Menus.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__MaterialUI.AutoComplete")
@js.native
class AutoComplete ()
  extends Component[AutoCompleteProps[js.Any], js.Object, js.Any]
/* static members */
object AutoComplete {
  
  @JSGlobal("__MaterialUI.AutoComplete")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.Divider")
  @js.native
  def Divider: typings.materialUi.MaterialUI.Divider = js.native
  @scala.inline
  def Divider_=(x: typings.materialUi.MaterialUI.Divider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.AutoComplete.Item")
  @js.native
  def Item: MenuItem = js.native
  @scala.inline
  def Item_=(x: MenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.AutoComplete.caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.caseSensitiveFilter")
  @js.native
  def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.defaultFilter")
  @js.native
  def defaultFilter(searchText: String, key: String): Boolean = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.fuzzyFilter")
  @js.native
  def fuzzyFilter(searchText: String, key: String): Boolean = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.levenshteinDistanceFilter")
  @js.native
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
  
  @JSGlobal("__MaterialUI.AutoComplete.noFilter")
  @js.native
  def noFilter(): Boolean = js.native
}
