package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.Lookup.
  */
@js.native
trait SchemaLookupRequest extends js.Object {
  /**
    * Keys of entities to look up.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
  /**
    * The options for this lookup request.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.native
}

object SchemaLookupRequest {
  @scala.inline
  def apply(): SchemaLookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupRequest]
  }
  @scala.inline
  implicit class SchemaLookupRequestOps[Self <: SchemaLookupRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setReadOptions(value: SchemaReadOptions): Self = this.set("readOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOptions: Self = this.set("readOptions", js.undefined)
  }
  
}

