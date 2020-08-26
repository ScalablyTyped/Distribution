package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publish container version response.
  */
@js.native
trait SchemaPublishContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.native
}

object SchemaPublishContainerVersionResponse {
  @scala.inline
  def apply(): SchemaPublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishContainerVersionResponse]
  }
  @scala.inline
  implicit class SchemaPublishContainerVersionResponseOps[Self <: SchemaPublishContainerVersionResponse] (val x: Self) extends AnyVal {
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
    def setCompilerError(value: Boolean): Self = this.set("compilerError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerError: Self = this.set("compilerError", js.undefined)
    @scala.inline
    def setContainerVersion(value: SchemaContainerVersion): Self = this.set("containerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerVersion: Self = this.set("containerVersion", js.undefined)
  }
  
}

