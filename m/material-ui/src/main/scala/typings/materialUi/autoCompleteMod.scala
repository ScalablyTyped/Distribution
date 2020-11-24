package typings.materialUi

import typings.materialUi.MaterialUI.AutoCompleteProps
import typings.materialUi.MaterialUI.Menus.MenuItem
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui/AutoComplete", JSImport.Namespace)
@js.native
object autoCompleteMod extends js.Object {
  
  @js.native
  class AutoComplete ()
    extends Component[AutoCompleteProps[js.Any], js.Object, js.Any]
  /* static members */
  @js.native
  object AutoComplete extends js.Object {
    
    var Divider: typings.materialUi.MaterialUI.Divider = js.native
    
    var Item: MenuItem = js.native
    
    def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    def defaultFilter(searchText: String, key: String): Boolean = js.native
    
    def fuzzyFilter(searchText: String, key: String): Boolean = js.native
    
    def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
    
    def noFilter(): Boolean = js.native
  }
  
  @js.native
  class default () extends AutoComplete
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Divider: typings.materialUi.MaterialUI.Divider = js.native
    
    var Item: MenuItem = js.native
    
    def caseInsensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    def caseSensitiveFilter(searchText: String, key: String): Boolean = js.native
    
    def defaultFilter(searchText: String, key: String): Boolean = js.native
    
    def fuzzyFilter(searchText: String, key: String): Boolean = js.native
    
    def levenshteinDistanceFilter(distanceLessThan: Double): js.Function2[/* searchText */ String, /* key */ String, Boolean] = js.native
    
    def noFilter(): Boolean = js.native
  }
}
