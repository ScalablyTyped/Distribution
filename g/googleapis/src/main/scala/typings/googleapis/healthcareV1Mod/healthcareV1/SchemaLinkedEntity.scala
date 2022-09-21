package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedEntity extends StObject {
  
  /**
    * entity_id is a concept unique identifier. These are prefixed by a string that identifies the entity coding system, followed by the unique identifier within that system. For example, "UMLS/C0000970". This also supports ad hoc entities, which are formed by normalizing entity mention content.
    */
  var entityId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLinkedEntity {
  
  inline def apply(): SchemaLinkedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedEntity]
  }
  
  extension [Self <: SchemaLinkedEntity](x: Self) {
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
  }
}
