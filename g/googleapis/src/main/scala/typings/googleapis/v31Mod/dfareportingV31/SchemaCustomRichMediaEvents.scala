package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Custom Rich Media Events group.
  */
@js.native
trait SchemaCustomRichMediaEvents extends StObject {
  
  /**
    * List of custom rich media event IDs. Dimension values must be all of type
    * dfa:richMediaEventTypeIdAndName.
    */
  var filteredEventIds: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  /**
    * The kind of resource this is, in this case
    * dfareporting#customRichMediaEvents.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCustomRichMediaEvents {
  
  @scala.inline
  def apply(): SchemaCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomRichMediaEvents]
  }
  
  @scala.inline
  implicit class SchemaCustomRichMediaEventsMutableBuilder[Self <: SchemaCustomRichMediaEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilteredEventIds(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "filteredEventIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredEventIdsUndefined: Self = StObject.set(x, "filteredEventIds", js.undefined)
    
    @scala.inline
    def setFilteredEventIdsVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "filteredEventIds", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
