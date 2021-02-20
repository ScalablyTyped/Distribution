package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortedDimension extends StObject {
  
  /** The kind of resource this is, in this case dfareporting#sortedDimension. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the dimension. */
  var name: js.UndefOr[String] = js.native
  
  /** An optional sort order for the dimension column. */
  var sortOrder: js.UndefOr[String] = js.native
}
object SortedDimension {
  
  @scala.inline
  def apply(): SortedDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortedDimension]
  }
  
  @scala.inline
  implicit class SortedDimensionMutableBuilder[Self <: SortedDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
