package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A RuntimeConfig resource is the primary resource in the Cloud RuntimeConfig
  * service. A RuntimeConfig resource consists of metadata and a hierarchy of
  * variables.
  */
@js.native
trait SchemaRuntimeConfig extends js.Object {
  /**
    * An optional description of the RuntimeConfig object.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The resource name of a runtime config. The name must have the format:
    * projects/[PROJECT_ID]/configs/[CONFIG_NAME]  The `[PROJECT_ID]` must be a
    * valid project ID, and `[CONFIG_NAME]` is an arbitrary name that matches
    * the `[0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])?` regular
    * expression. The length of `[CONFIG_NAME]` must be less than 64
    * characters.  You pick the RuntimeConfig resource name, but the server
    * will validate that the name adheres to this format. After you create the
    * resource, you cannot change the resource&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaRuntimeConfig {
  @scala.inline
  def apply(): SchemaRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeConfig]
  }
  @scala.inline
  implicit class SchemaRuntimeConfigOps[Self <: SchemaRuntimeConfig] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

