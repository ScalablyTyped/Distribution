package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListInstanceConfigs.
  */
@js.native
trait SchemaListInstanceConfigsResponse extends js.Object {
  /**
    * The list of requested instance configurations.
    */
  var instanceConfigs: js.UndefOr[js.Array[SchemaInstanceConfig]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to
    * fetch more of the matching instance configurations.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInstanceConfigsResponse {
  @scala.inline
  def apply(): SchemaListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstanceConfigsResponse]
  }
  @scala.inline
  implicit class SchemaListInstanceConfigsResponseOps[Self <: SchemaListInstanceConfigsResponse] (val x: Self) extends AnyVal {
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
    def setInstanceConfigsVarargs(value: SchemaInstanceConfig*): Self = this.set("instanceConfigs", js.Array(value :_*))
    @scala.inline
    def setInstanceConfigs(value: js.Array[SchemaInstanceConfig]): Self = this.set("instanceConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceConfigs: Self = this.set("instanceConfigs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

