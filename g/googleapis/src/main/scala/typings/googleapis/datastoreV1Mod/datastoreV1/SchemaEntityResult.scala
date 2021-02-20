package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of fetching an entity from Datastore.
  */
@js.native
trait SchemaEntityResult extends StObject {
  
  /**
    * A cursor that points to the position after the result entity. Set only
    * when the `EntityResult` is part of a `QueryResultBatch` message.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The resulting entity.
    */
  var entity: js.UndefOr[SchemaEntity] = js.native
  
  /**
    * The version of the entity, a strictly positive number that monotonically
    * increases with changes to the entity.  This field is set for `FULL`
    * entity results.  For missing entities in `LookupResponse`, this is the
    * version of the snapshot that was used to look up the entity, and it is
    * always set except for eventually consistent reads.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaEntityResult {
  
  @scala.inline
  def apply(): SchemaEntityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityResult]
  }
  
  @scala.inline
  implicit class SchemaEntityResultMutableBuilder[Self <: SchemaEntityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setEntity(value: SchemaEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
