package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleSortKey extends StObject {
  
  var id: String = js.native
  
  var sortAscending: Boolean = js.native
}
object GriddleSortKey {
  
  @scala.inline
  def apply(id: String, sortAscending: Boolean): GriddleSortKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sortAscending = sortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleSortKey]
  }
  
  @scala.inline
  implicit class GriddleSortKeyMutableBuilder[Self <: GriddleSortKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
  }
}
