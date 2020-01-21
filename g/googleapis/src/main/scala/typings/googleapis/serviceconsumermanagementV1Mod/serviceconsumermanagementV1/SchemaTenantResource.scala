package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource constituting the TenancyUnit.
  */
@js.native
trait SchemaTenantResource extends js.Object {
  /**
    * @OutputOnly Identifier of the tenant resource. For cloud projects, it is
    * in the form &#39;projects/{number}&#39;. For example
    * &#39;projects/123456&#39;.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Status of tenant resource.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Unique per single tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaTenantResource {
  @scala.inline
  def apply(resource: String = null, status: String = null, tag: String = null): SchemaTenantResource = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTenantResource]
  }
}

