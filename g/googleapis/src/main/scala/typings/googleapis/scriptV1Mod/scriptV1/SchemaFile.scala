package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual file within a script project. A file is a third-party source
  * code created by one or more developers. It can be a server-side JS code,
  * HTML, or a configuration file. Each script project can contain multiple
  * files.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * Creation date timestamp. This read-only field is only visible to users
    * who have WRITER permission for the script project.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The defined set of functions in the script file, if any.
    */
  var functionSet: js.UndefOr[SchemaGoogleAppsScriptTypeFunctionSet] = js.native
  /**
    * The user who modified the file most recently. This read-only field is
    * only visible to users who have WRITER permission for the script project.
    */
  var lastModifyUser: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  /**
    * The name of the file. The file extension is not part of the file name,
    * which can be identified from the type field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The file content.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The type of the file.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Last modified date timestamp. This read-only field is only visible to
    * users who have WRITER permission for the script project.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaFile {
  @scala.inline
  def apply(
    createTime: String = null,
    functionSet: SchemaGoogleAppsScriptTypeFunctionSet = null,
    lastModifyUser: SchemaGoogleAppsScriptTypeUser = null,
    name: String = null,
    source: String = null,
    `type`: String = null,
    updateTime: String = null
  ): SchemaFile = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (functionSet != null) __obj.updateDynamic("functionSet")(functionSet.asInstanceOf[js.Any])
    if (lastModifyUser != null) __obj.updateDynamic("lastModifyUser")(lastModifyUser.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFile]
  }
}

