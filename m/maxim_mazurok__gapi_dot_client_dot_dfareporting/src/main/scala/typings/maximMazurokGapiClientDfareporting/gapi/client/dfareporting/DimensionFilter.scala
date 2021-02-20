package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionFilter extends StObject {
  
  /** The name of the dimension to filter. */
  var dimensionName: js.UndefOr[String] = js.native
  
  /** The kind of resource this is, in this case dfareporting#dimensionFilter. */
  var kind: js.UndefOr[String] = js.native
  
  /** The value of the dimension to filter. */
  var value: js.UndefOr[String] = js.native
}
object DimensionFilter {
  
  @scala.inline
  def apply(): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionFilter]
  }
  
  @scala.inline
  implicit class DimensionFilterMutableBuilder[Self <: DimensionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
