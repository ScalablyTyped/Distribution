package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.Lookup.
  */
@js.native
trait SchemaLookupResponse extends js.Object {
  /**
    * A list of keys that were not looked up due to resource constraints. The
    * order of results in this field is undefined and has no relation to the
    * order of the keys in the input.
    */
  var deferred: js.UndefOr[js.Array[SchemaKey]] = js.native
  /**
    * Entities found as `ResultType.FULL` entities. The order of results in
    * this field is undefined and has no relation to the order of the keys in
    * the input.
    */
  var found: js.UndefOr[js.Array[SchemaEntityResult]] = js.native
  /**
    * Entities not found as `ResultType.KEY_ONLY` entities. The order of
    * results in this field is undefined and has no relation to the order of
    * the keys in the input.
    */
  var missing: js.UndefOr[js.Array[SchemaEntityResult]] = js.native
}

object SchemaLookupResponse {
  @scala.inline
  def apply(): SchemaLookupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupResponse]
  }
  @scala.inline
  implicit class SchemaLookupResponseOps[Self <: SchemaLookupResponse] (val x: Self) extends AnyVal {
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
    def setDeferredVarargs(value: SchemaKey*): Self = this.set("deferred", js.Array(value :_*))
    @scala.inline
    def setDeferred(value: js.Array[SchemaKey]): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    @scala.inline
    def setFoundVarargs(value: SchemaEntityResult*): Self = this.set("found", js.Array(value :_*))
    @scala.inline
    def setFound(value: js.Array[SchemaEntityResult]): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFound: Self = this.set("found", js.undefined)
    @scala.inline
    def setMissingVarargs(value: SchemaEntityResult*): Self = this.set("missing", js.Array(value :_*))
    @scala.inline
    def setMissing(value: js.Array[SchemaEntityResult]): Self = this.set("missing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
  }
  
}

