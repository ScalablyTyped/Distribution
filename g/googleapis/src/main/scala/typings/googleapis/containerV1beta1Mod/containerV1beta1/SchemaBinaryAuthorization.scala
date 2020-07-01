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
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaBinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBinaryAuthorization]
  }
}

