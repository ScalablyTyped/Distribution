package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecPinnedType Pins this service to a specific revision name. The
  * revision must be owned by the configuration provided.  Deprecated and not
  * supported by Cloud Run.
  */
@js.native
trait SchemaServiceSpecPinnedType extends js.Object {
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.native
  /**
    * The revision name to pin this service to until changed to a different
    * service type.
    */
  var revisionName: js.UndefOr[String] = js.native
}

object SchemaServiceSpecPinnedType {
  @scala.inline
  def apply(configuration: SchemaConfigurationSpec = null, revisionName: String = null): SchemaServiceSpecPinnedType = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (revisionName != null) __obj.updateDynamic("revisionName")(revisionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceSpecPinnedType]
  }
}

