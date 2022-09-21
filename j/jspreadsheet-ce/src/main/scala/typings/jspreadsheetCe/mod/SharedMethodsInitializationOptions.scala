package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Main options
// ----------------------------------------------------------------------
trait SharedMethodsInitializationOptions extends StObject {
  
  /**
    * Toggle table fullscreen mode or set fullscreen mode in initialization
    * @param boolean fullscreen - define fullscreen status as true or false
    * myTable.fullscreen([bool]);
    */
  // tslint:disable-next-line ban-types
  var fullscreen: js.UndefOr[js.Function | Boolean] = js.undefined
  
  /**
    * Search in the table, only if directive is enabled during inialization - sets search in initialization.
    * @param string - Search for word
    * myTable.search([string]);
    */
  // tslint:disable-next-line ban-types
  var search: js.UndefOr[js.Function | Boolean] = js.undefined
}
object SharedMethodsInitializationOptions {
  
  inline def apply(): SharedMethodsInitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedMethodsInitializationOptions]
  }
  
  extension [Self <: SharedMethodsInitializationOptions](x: Self) {
    
    inline def setFullscreen(value: js.Function | Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setSearch(value: js.Function | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
