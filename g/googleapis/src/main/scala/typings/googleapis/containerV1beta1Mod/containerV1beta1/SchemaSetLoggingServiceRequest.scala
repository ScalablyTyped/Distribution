package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetLoggingServiceRequest sets the logging service of a cluster.
  */
@js.native
trait SchemaSetLoggingServiceRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The logging service the cluster should use to write metrics. Currently
    * available options:  * &quot;logging.googleapis.com&quot; - the Google
    * Cloud Logging service * &quot;none&quot; - no metrics will be exported
    * from the cluster
    */
  var loggingService: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster) of the cluster to set logging.
    * Specified in the format &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaSetLoggingServiceRequest {
  @scala.inline
  def apply(
    clusterId: String = null,
    loggingService: String = null,
    name: String = null,
    projectId: String = null,
    zone: String = null
  ): SchemaSetLoggingServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (loggingService != null) __obj.updateDynamic("loggingService")(loggingService.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetLoggingServiceRequest]
  }
}

