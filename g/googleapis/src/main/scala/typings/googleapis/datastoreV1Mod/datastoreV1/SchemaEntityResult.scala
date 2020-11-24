package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of fetching an entity from Datastore.
  */
@js.native
trait SchemaEntityResult extends js.Object {
  
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
  implicit class SchemaEntityResultOps[Self <: SchemaEntityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setEntity(value: SchemaEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
