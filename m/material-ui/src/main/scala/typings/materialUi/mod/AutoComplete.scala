package typings.materialUi.mod

import typings.materialUi.MaterialUI.AutoCompleteProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def caseInsensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def caseSensitiveFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("caseSensitiveFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def defaultFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def fuzzyFilter(searchText: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(searchText.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("levenshteinDistanceFilter")(distanceLessThan.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* searchText */ String, /* key */ String, Boolean]]
  
  @scala.inline
  def noFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noFilter")().asInstanceOf[Boolean]
}
