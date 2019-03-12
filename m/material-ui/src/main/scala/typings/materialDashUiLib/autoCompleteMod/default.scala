package typings
package materialDashUiLib.autoCompleteMod

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
  var Divider: materialDashUiLib.underscoreUnderscoreMaterialUINs.Divider = js.native
  var Item: materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs.MenuItem = js.native
  def caseInsensitiveFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def caseSensitiveFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def defaultFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def fuzzyFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def levenshteinDistanceFilter(distanceLessThan: scala.Double): js.Function2[/* searchText */ java.lang.String, /* key */ java.lang.String, scala.Boolean] = js.native
  def noFilter(): scala.Boolean = js.native
}

