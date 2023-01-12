package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedView extends StObject {
  
  /** Internal id associated with the saved view. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Display name of the saved view. */
  var name: js.UndefOr[String] = js.undefined
}
object SavedView {
  
  inline def apply(): SavedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedView] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
