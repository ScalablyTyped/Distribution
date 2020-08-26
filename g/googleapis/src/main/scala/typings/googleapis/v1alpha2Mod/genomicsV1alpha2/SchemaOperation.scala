package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a long-running operation that is the result of a
  * network API call.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress. If
    * `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * The error result of the operation in case of failure or cancellation.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * An OperationMetadata or Metadata object. This will always be returned
    * with the Operation.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The server-assigned name, which is only unique within the same service
    * that originally returns it. For example&amp;#58;
    * `operations/CJHU7Oi_ChDrveSpBRjfuL-qzoWAgEw`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An Empty object.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  @scala.inline
  implicit class SchemaOperationOps[Self <: SchemaOperation] (val x: Self) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResponse(value: StringDictionary[js.Any]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

