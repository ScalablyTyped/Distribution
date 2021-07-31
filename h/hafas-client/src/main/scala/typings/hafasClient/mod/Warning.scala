package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.status
import typings.hafasClient.hafasClientStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var edges: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var events: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var modified: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var `type`: status | warning
  
  var validFrom: js.UndefOr[String] = js.undefined
  
  var validUntil: js.UndefOr[String] = js.undefined
}
object Warning {
  
  @scala.inline
  def apply(text: String, `type`: status | warning): Warning = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setEdges(value: js.Array[js.Any]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: js.Any*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: status | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFrom(value: String): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
    
    @scala.inline
    def setValidUntil(value: String): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
  }
}
