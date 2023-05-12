package typings.heremaps.anon

import typings.heremaps.H.service.RoutingService.RoutingServiceSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var sections: js.Array[RoutingServiceSection]
}
object Id {
  
  inline def apply(id: String, sections: js.Array[RoutingServiceSection]): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[RoutingServiceSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: RoutingServiceSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
