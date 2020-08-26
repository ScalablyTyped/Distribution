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
  def apply(): SchemaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContent]
  }
  @scala.inline
  implicit class SchemaContentOps[Self <: SchemaContent] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: SchemaFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[SchemaFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
  }
  
}

