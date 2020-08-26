package typings.googleapis.cloudshellV1Mod.cloudshellV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message included in the metadata field of operations returned from
  * StartEnvironment.
  */
@js.native
trait SchemaStartEnvironmentMetadata extends js.Object {
  /**
    * Current state of the environment being started.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaStartEnvironmentMetadata {
  @scala.inline
  def apply(): SchemaStartEnvironmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentMetadata]
  }
  @scala.inline
  implicit class SchemaStartEnvironmentMetadataOps[Self <: SchemaStartEnvironmentMetadata] (val x: Self) extends AnyVal {
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

