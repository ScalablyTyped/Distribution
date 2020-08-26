package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `AccessLevel` is a label that can be applied to requests to GCP
  * services, along with a list of requirements necessary for the label to be
  * applied.
  */
@js.native
trait SchemaAccessLevel extends js.Object {
  /**
    * A `BasicLevel` composed of `Conditions`.
    */
  var basic: js.UndefOr[SchemaBasicLevel] = js.native
  /**
    * Output only. Time the `AccessLevel` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Description of the `AccessLevel` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the Access Level. The `short_name` component
    * must begin with a letter and only include alphanumeric and &#39;_&#39;.
    * Format: `accessPolicies/{policy_id}/accessLevels/{short_name}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. Time the `AccessLevel` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAccessLevel {
  @scala.inline
  def apply(): SchemaAccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessLevel]
  }
  @scala.inline
  implicit class SchemaAccessLevelOps[Self <: SchemaAccessLevel] (val x: Self) extends AnyVal {
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
    def setBasic(value: SchemaBasicLevel): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

