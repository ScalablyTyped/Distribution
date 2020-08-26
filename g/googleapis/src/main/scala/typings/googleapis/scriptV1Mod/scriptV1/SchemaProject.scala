package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The script project resource.
  */
@js.native
trait SchemaProject extends js.Object {
  /**
    * When the script was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * User who originally created the script.
    */
  var creator: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  /**
    * User who last modified the script.
    */
  var lastModifyUser: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  /**
    * The parent&#39;s Drive ID that the script will be attached to. This is
    * usually the ID of a Google Document or Google Sheet. This filed is
    * optional, and if not set, a stand-alone script will be created.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * When the script was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  @scala.inline
  implicit class SchemaProjectOps[Self <: SchemaProject] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCreator(value: SchemaGoogleAppsScriptTypeUser): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setLastModifyUser(value: SchemaGoogleAppsScriptTypeUser): Self = this.set("lastModifyUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifyUser: Self = this.set("lastModifyUser", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
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

