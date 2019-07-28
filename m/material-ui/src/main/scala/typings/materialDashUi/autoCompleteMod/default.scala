package typings.materialDashUi.autoCompleteMod

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/AutoComplete", JSImport.Default)
@js.native
class default () extends AutoComplete

/* static members */
@JSImport("material-ui/AutoComplete", JSImport.Default)
@js.native
object default extends js.Object {
  var Divider: typings.materialDashUi.underscoreUnderscoreMaterialUINs.Divider = js.native
  var Item: MenuItem = js.native
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
  def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
  def defaultFilter(searchText: String, key: String): Boolean = js.native
  def fuzzyFilter(searchText: String, key: String): Boolean = js.native
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
  def noFilter(): Boolean = js.native
}

