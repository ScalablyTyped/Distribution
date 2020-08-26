package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for Binary Authorization.
  */
@js.native
trait SchemaBinaryAuthorization extends js.Object {
  /**
    * Enable Binary Authorization for this cluster. If enabled, all container
    * images will be validated by Google Binauthz.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaBinaryAuthorization {
  @scala.inline
  def apply(): SchemaBinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryAuthorization]
  }
  @scala.inline
  implicit class SchemaBinaryAuthorizationOps[Self <: SchemaBinaryAuthorization] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

