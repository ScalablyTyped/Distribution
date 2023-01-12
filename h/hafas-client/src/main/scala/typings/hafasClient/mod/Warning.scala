package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.status
import typings.hafasClient.hafasClientStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  var affectedLines: js.UndefOr[js.Array[Line]] = js.undefined
  
  var categories: js.UndefOr[js.Array[Double]] = js.undefined
  
  var category: js.UndefOr[String | Double] = js.undefined
  
  var company: js.UndefOr[String] = js.undefined
  
  var edges: js.UndefOr[js.Array[Edge]] = js.undefined
  
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  
  var fromStops: js.UndefOr[js.Array[Station | Stop | Location]] = js.undefined
  
  var icon: js.UndefOr[js.Object] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var modified: js.UndefOr[String | Double] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var toStops: js.UndefOr[js.Array[Station | Stop | Location]] = js.undefined
  
  var `type`: status | warning
  
  var validFrom: js.UndefOr[String | Double] = js.undefined
  
  var validUntil: js.UndefOr[String | Double] = js.undefined
}
object Warning {
  
  inline def apply(`type`: status | warning): Warning = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    inline def setAffectedLines(value: js.Array[Line]): Self = StObject.set(x, "affectedLines", value.asInstanceOf[js.Any])
    
    inline def setAffectedLinesUndefined: Self = StObject.set(x, "affectedLines", js.undefined)
    
    inline def setAffectedLinesVarargs(value: Line*): Self = StObject.set(x, "affectedLines", js.Array(value*))
    
    inline def setCategories(value: js.Array[Double]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: Double*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCategory(value: String | Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setEdges(value: js.Array[Edge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFromStops(value: js.Array[Station | Stop | Location]): Self = StObject.set(x, "fromStops", value.asInstanceOf[js.Any])
    
    inline def setFromStopsUndefined: Self = StObject.set(x, "fromStops", js.undefined)
    
    inline def setFromStopsVarargs(value: (Station | Stop | Location)*): Self = StObject.set(x, "fromStops", js.Array(value*))
    
    inline def setIcon(value: js.Object): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setModified(value: String | Double): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setToStops(value: js.Array[Station | Stop | Location]): Self = StObject.set(x, "toStops", value.asInstanceOf[js.Any])
    
    inline def setToStopsUndefined: Self = StObject.set(x, "toStops", js.undefined)
    
    inline def setToStopsVarargs(value: (Station | Stop | Location)*): Self = StObject.set(x, "toStops", js.Array(value*))
    
    inline def setType(value: status | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidFrom(value: String | Double): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
    
    inline def setValidUntil(value: String | Double): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
  }
}
