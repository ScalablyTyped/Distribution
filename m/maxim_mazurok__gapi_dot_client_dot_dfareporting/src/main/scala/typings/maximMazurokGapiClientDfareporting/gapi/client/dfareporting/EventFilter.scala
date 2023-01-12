package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /** The dimension filter contained within this EventFilter. */
  var dimensionFilter: js.UndefOr[PathReportDimensionValue] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#eventFilter. */
  var kind: js.UndefOr[String] = js.undefined
}
object EventFilter {
  
  inline def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
    
    inline def setDimensionFilter(value: PathReportDimensionValue): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
