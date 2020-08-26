package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic specification of a source configuration file
  */
@js.native
trait SchemaConfigFile extends js.Object {
  /**
    * The bytes that constitute the file.
    */
  var fileContents: js.UndefOr[String] = js.native
  /**
    * The file name of the configuration file (full or relative path).
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * The type of configuration file this represents.
    */
  var fileType: js.UndefOr[String] = js.native
}

object SchemaConfigFile {
  @scala.inline
  def apply(): SchemaConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigFile]
  }
  @scala.inline
  implicit class SchemaConfigFileOps[Self <: SchemaConfigFile] (val x: Self) extends AnyVal {
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
    def setFileContents(value: String): Self = this.set("fileContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileContents: Self = this.set("fileContents", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
  }
  
}

