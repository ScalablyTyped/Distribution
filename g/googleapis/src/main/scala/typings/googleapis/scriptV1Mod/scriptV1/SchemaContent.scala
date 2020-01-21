package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Content resource.
  */
@js.native
trait SchemaContent extends js.Object {
  /**
    * The list of script project files. One of the files is a script manifest;
    * it must be named &quot;appsscript&quot;, must have type of JSON, and
    * include the manifest configurations for the project.
    */
  var files: js.UndefOr[js.Array[SchemaFile]] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
}

object SchemaContent {
  @scala.inline
  def apply(files: js.Array[SchemaFile] = null, scriptId: String = null): SchemaContent = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContent]
  }
}

