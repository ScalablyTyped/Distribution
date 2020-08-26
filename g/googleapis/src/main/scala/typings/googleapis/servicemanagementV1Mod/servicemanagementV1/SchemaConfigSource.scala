package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a source file which is used to generate the service
  * configuration defined by `google.api.Service`.
  */
@js.native
trait SchemaConfigSource extends js.Object {
  /**
    * Set of source configuration files that are used to generate a service
    * configuration (`google.api.Service`).
    */
  var files: js.UndefOr[js.Array[SchemaConfigFile]] = js.native
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaConfigSource {
  @scala.inline
  def apply(): SchemaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigSource]
  }
  @scala.inline
  implicit class SchemaConfigSourceOps[Self <: SchemaConfigSource] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: SchemaConfigFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[SchemaConfigFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

