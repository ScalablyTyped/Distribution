package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the list of matters.
  */
@js.native
trait SchemaListMattersResponse extends js.Object {
  /**
    * List of matters.
    */
  var matters: js.UndefOr[js.Array[SchemaMatter]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListMattersResponse {
  @scala.inline
  def apply(): SchemaListMattersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMattersResponse]
  }
  @scala.inline
  implicit class SchemaListMattersResponseOps[Self <: SchemaListMattersResponse] (val x: Self) extends AnyVal {
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
    def setMattersVarargs(value: SchemaMatter*): Self = this.set("matters", js.Array(value :_*))
    @scala.inline
    def setMatters(value: js.Array[SchemaMatter]): Self = this.set("matters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatters: Self = this.set("matters", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

