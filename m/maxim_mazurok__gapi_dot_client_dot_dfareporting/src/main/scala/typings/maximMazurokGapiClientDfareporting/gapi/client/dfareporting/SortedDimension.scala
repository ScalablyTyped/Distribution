package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedDimension extends StObject {
  
  /** The kind of resource this is, in this case dfareporting#sortedDimension. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of the dimension. */
  var name: js.UndefOr[String] = js.undefined
  
  /** An optional sort order for the dimension column. */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SortedDimension {
  
  inline def apply(): SortedDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortedDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortedDimension] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
