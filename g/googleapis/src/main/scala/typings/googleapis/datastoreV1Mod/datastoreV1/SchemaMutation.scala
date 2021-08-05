package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mutation to apply to an entity.
  */
trait SchemaMutation extends StObject {
  
  /**
    * The version of the entity that this mutation is being applied to. If this
    * does not match the current version on the server, the mutation conflicts.
    */
  var baseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the entity to delete. The entity may or may not already exist.
    * Must have a complete key path and must not be reserved/read-only.
    */
  var delete: js.UndefOr[SchemaKey] = js.undefined
  
  /**
    * The entity to insert. The entity must not already exist. The entity
    * key&#39;s final path element may be incomplete.
    */
  var insert: js.UndefOr[SchemaEntity] = js.undefined
  
  /**
    * The entity to update. The entity must already exist. Must have a complete
    * key path.
    */
  var update: js.UndefOr[SchemaEntity] = js.undefined
  
  /**
    * The entity to upsert. The entity may or may not already exist. The entity
    * key&#39;s final path element may be incomplete.
    */
  var upsert: js.UndefOr[SchemaEntity] = js.undefined
}
object SchemaMutation {
  
  inline def apply(): SchemaMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutation]
  }
  
  extension [Self <: SchemaMutation](x: Self) {
    
    inline def setBaseVersion(value: String): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionUndefined: Self = StObject.set(x, "baseVersion", js.undefined)
    
    inline def setDelete(value: SchemaKey): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: SchemaEntity): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setUpdate(value: SchemaEntity): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUpsert(value: SchemaEntity): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
