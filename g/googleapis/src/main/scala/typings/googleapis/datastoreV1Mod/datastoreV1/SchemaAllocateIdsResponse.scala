package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.AllocateIds.
  */
@js.native
trait SchemaAllocateIdsResponse extends js.Object {
  /**
    * The keys specified in the request (in the same order), each with its key
    * path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}

object SchemaAllocateIdsResponse {
  @scala.inline
  def apply(): SchemaAllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateIdsResponse]
  }
  @scala.inline
  implicit class SchemaAllocateIdsResponseOps[Self <: SchemaAllocateIdsResponse] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: SchemaKey*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[SchemaKey]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
  
}

