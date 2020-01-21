package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service that is available for use by the consumer.
  */
@js.native
trait SchemaGoogleApiServiceusageV1Service extends js.Object {
  /**
    * The service configuration of the available service. Some fields may be
    * filtered out of the configuration in responses to the `ListServices`
    * method. These fields are present only in responses to the `GetService`
    * method.
    */
  var config: js.UndefOr[SchemaGoogleApiServiceusageV1ServiceConfig] = js.native
  /**
    * The resource name of the consumer and service.  A valid name would be: -
    * projects/123/services/serviceusage.googleapis.com
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The resource name of the consumer.  A valid name would be: - projects/123
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Whether or not the service has been enabled for use by the consumer.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleApiServiceusageV1Service {
  @scala.inline
  def apply(
    config: SchemaGoogleApiServiceusageV1ServiceConfig = null,
    name: String = null,
    parent: String = null,
    state: String = null
  ): SchemaGoogleApiServiceusageV1Service = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1Service]
  }
}

