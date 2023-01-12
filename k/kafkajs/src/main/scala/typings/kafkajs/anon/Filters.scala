package typings.kafkajs.anon

import typings.kafkajs.mod.AclFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: js.Array[AclFilter]
}
object Filters {
  
  inline def apply(filters: js.Array[AclFilter]): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[AclFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: AclFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
