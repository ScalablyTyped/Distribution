package typings.materialUi.mod

import typings.materialUi.MaterialUI.AutoCompleteProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui", "AutoComplete")
@js.native
class AutoComplete ()
  extends Component[AutoCompleteProps[js.Any], js.Object, js.Any]
/* static members */
@JSImport("material-ui", "AutoComplete")
@js.native
object AutoComplete extends js.Object {
  
  var Divider: typings.materialUi.MaterialUI.Divider = js.native
  
  var Item: typings.materialUi.MaterialUI.Menus.MenuItem = js.native
  
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
  
  def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
  
  def defaultFilter(searchText: String, key: String): Boolean = js.native
  
  def fuzzyFilter(searchText: String, key: String): Boolean = js.native
  
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
  
  def noFilter(): Boolean = js.native
}
