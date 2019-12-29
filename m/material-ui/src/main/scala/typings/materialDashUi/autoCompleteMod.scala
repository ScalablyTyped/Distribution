package typings.materialDashUi

import typings.materialDashUi.__MaterialUI.Menus.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/AutoComplete", JSImport.Namespace)
@js.native
object autoCompleteMod extends js.Object {
  @js.native
  class AutoComplete ()
    extends typings.materialDashUi.__MaterialUI.AutoComplete
  
  @js.native
  class default () extends AutoComplete
  
  /* static members */
  @js.native
  object AutoComplete extends js.Object {
    var Divider: typings.materialDashUi.__MaterialUI.Divider = js.native
    var Item: MenuItem = js.native
    def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
    def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
    def defaultFilter(searchText: String, key: String): Boolean = js.native
    def fuzzyFilter(searchText: String, key: String): Boolean = js.native
    def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
    def noFilter(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Divider: typings.materialDashUi.__MaterialUI.Divider = js.native
    var Item: MenuItem = js.native
    def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
    def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
    def defaultFilter(searchText: String, key: String): Boolean = js.native
    def fuzzyFilter(searchText: String, key: String): Boolean = js.native
    def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
    def noFilter(): Boolean = js.native
  }
  
}

