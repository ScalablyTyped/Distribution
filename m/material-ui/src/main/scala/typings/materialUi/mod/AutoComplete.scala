package typings.materialUi.mod

import typings.materialUi.MaterialUI.AutoCompleteProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui", "AutoComplete")
@js.native
class AutoComplete ()
  extends Component[AutoCompleteProps[js.Any], js.Object, js.Any]
/* static members */
object AutoComplete {
  
  @JSImport("material-ui", "AutoComplete")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-ui", "AutoComplete.Divider")
  @js.native
  def Divider: typings.materialUi.MaterialUI.Divider = js.native
  @scala.inline
  def Divider_=(x: typings.materialUi.MaterialUI.Divider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui", "AutoComplete.Item")
  @js.native
  def Item: typings.materialUi.MaterialUI.Menus.MenuItem = js.native
  @scala.inline
  def Item_=(x: typings.materialUi.MaterialUI.Menus.MenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui", "AutoComplete.caseInsensitiveFilter")
  @js.native
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
  
  @JSImport("material-ui", "AutoComplete.caseSensitiveFilter")
  @js.native
  def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
  
  @JSImport("material-ui", "AutoComplete.defaultFilter")
  @js.native
  def defaultFilter(searchText: String, key: String): Boolean = js.native
  
  @JSImport("material-ui", "AutoComplete.fuzzyFilter")
  @js.native
  def fuzzyFilter(searchText: String, key: String): Boolean = js.native
  
  @JSImport("material-ui", "AutoComplete.levenshteinDistanceFilter")
  @js.native
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
  
  @JSImport("material-ui", "AutoComplete.noFilter")
  @js.native
  def noFilter(): Boolean = js.native
}
