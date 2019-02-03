package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI.AutoComplete")
@js.native
class AutoComplete ()
  extends reactLib.reactMod.Component[AutoCompleteProps[js.Any], js.Object, js.Any]

/* static members */
@JSGlobal("__MaterialUI.AutoComplete")
@js.native
object AutoComplete extends js.Object {
  var Divider: materialDashUiLib.underscoreUnderscoreMaterialUINs.Divider = js.native
  var Item: materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs.MenuItem = js.native
  def caseInsensitiveFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def caseSensitiveFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def defaultFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def fuzzyFilter(searchText: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def levenshteinDistanceFilter(distanceLessThan: scala.Double): js.Function2[/* searchText */ java.lang.String, /* key */ java.lang.String, scala.Boolean] = js.native
  def noFilter(): scala.Boolean = js.native
}

