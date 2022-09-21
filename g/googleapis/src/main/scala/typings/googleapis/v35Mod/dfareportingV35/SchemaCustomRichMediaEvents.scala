package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomRichMediaEvents extends StObject {
  
  /**
    * List of custom rich media event IDs. Dimension values must be all of type dfa:richMediaEventTypeIdAndName.
    */
  var filteredEventIds: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#customRichMediaEvents.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomRichMediaEvents {
  
  inline def apply(): SchemaCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomRichMediaEvents]
  }
  
  extension [Self <: SchemaCustomRichMediaEvents](x: Self) {
    
    inline def setFilteredEventIds(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "filteredEventIds", value.asInstanceOf[js.Any])
    
    inline def setFilteredEventIdsUndefined: Self = StObject.set(x, "filteredEventIds", js.undefined)
    
    inline def setFilteredEventIdsVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "filteredEventIds", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
