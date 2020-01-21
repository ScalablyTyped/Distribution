package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ServicePerimeter` describes a set of GCP resources which can freely import
  * and export data amongst themselves, but not export outside of the
  * `ServicePerimeter`. If a request with a source within this
  * `ServicePerimeter` has a target outside of the `ServicePerimeter`, the
  * request will be blocked. Otherwise the request is allowed. There are two
  * types of Service Perimeter - Regular and Bridge. Regular Service Perimeters
  * cannot overlap, a single GCP project can only belong to a single regular
  * Service Perimeter. Service Perimeter Bridges can contain only GCP projects
  * as members, a single GCP project may belong to multiple Service Perimeter
  * Bridges.
  */
@js.native
trait SchemaServicePerimeter extends js.Object {
  /**
    * Output only. Time the `ServicePerimeter` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Description of the `ServicePerimeter` and its use. Does not affect
    * behavior.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the ServicePerimeter.  The `short_name`
    * component must begin with a letter and only include alphanumeric and
    * &#39;_&#39;. Format:
    * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Perimeter type indicator. A single project is allowed to be a member of
    * single regular perimeter, but multiple service perimeter bridges. A
    * project cannot be a included in a perimeter bridge without being included
    * in regular perimeter. For perimeter bridges, restricted/unrestricted
    * service lists as well as access lists must be empty.
    */
  var perimeterType: js.UndefOr[String] = js.native
  /**
    * Current ServicePerimeter configuration. Specifies sets of resources,
    * restricted/unrestricted services and access levels that determine
    * perimeter content and boundaries.
    */
  var status: js.UndefOr[SchemaServicePerimeterConfig] = js.native
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. Time the `ServicePerimeter` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaServicePerimeter {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    name: String = null,
    perimeterType: String = null,
    status: SchemaServicePerimeterConfig = null,
    title: String = null,
    updateTime: String = null
  ): SchemaServicePerimeter = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (perimeterType != null) __obj.updateDynamic("perimeterType")(perimeterType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServicePerimeter]
  }
}

