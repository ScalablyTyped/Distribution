package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Main options
// ----------------------------------------------------------------------
@js.native
trait SharedMethodsInitializationOptions extends js.Object {
  
  /**
    * Toggle table fullscreen mode or set fullscreen mode in initialization
    * @param boolean fullscreen - define fullscreen status as true or false
    * myTable.fullscreen([bool]);
    */
  // tslint:disable-next-line ban-types
  var fullscreen: js.UndefOr[js.Function | Boolean] = js.native
  
  /**
    * Search in the table, only if directive is enabled during inialization - sets search in initialization.
    * @param string - Search for word
    * myTable.search([string]);
    */
  // tslint:disable-next-line ban-types
  var search: js.UndefOr[js.Function | Boolean] = js.native
}
object SharedMethodsInitializationOptions {
  
  @scala.inline
  def apply(): SharedMethodsInitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedMethodsInitializationOptions]
  }
  
  @scala.inline
  implicit class SharedMethodsInitializationOptionsOps[Self <: SharedMethodsInitializationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFullscreen(value: js.Function | Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setSearch(value: js.Function | Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
