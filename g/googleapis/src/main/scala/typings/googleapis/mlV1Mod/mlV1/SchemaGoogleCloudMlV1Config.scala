package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudMlV1Config extends js.Object {
  /**
    * The service account Cloud ML uses to run on TPU node.
    */
  var tpuServiceAccount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1Config {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Config]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ConfigOps[Self <: SchemaGoogleCloudMlV1Config] (val x: Self) extends AnyVal {
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
    def setTpuServiceAccount(value: String): Self = this.set("tpuServiceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpuServiceAccount: Self = this.set("tpuServiceAccount", js.undefined)
  }
  
}

