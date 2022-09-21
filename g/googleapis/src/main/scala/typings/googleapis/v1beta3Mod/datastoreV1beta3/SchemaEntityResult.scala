package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntityResult extends StObject {
  
  /**
    * A cursor that points to the position after the result entity. Set only when the `EntityResult` is part of a `QueryResultBatch` message.
    */
  var cursor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resulting entity.
    */
  var entity: js.UndefOr[SchemaEntity] = js.undefined
  
  /**
    * The time at which the entity was last changed. This field is set for `FULL` entity results. If this entity is missing, this field will not be set.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the entity, a strictly positive number that monotonically increases with changes to the entity. This field is set for `FULL` entity results. For missing entities in `LookupResponse`, this is the version of the snapshot that was used to look up the entity, and it is always set except for eventually consistent reads.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntityResult {
  
  inline def apply(): SchemaEntityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityResult]
  }
  
  extension [Self <: SchemaEntityResult](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorNull: Self = StObject.set(x, "cursor", null)
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setEntity(value: SchemaEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
