package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a tenancy unit.
  */
@js.native
trait SchemaTenancyUnit extends js.Object {
  /**
    * @OutputOnly Cloud resource name of the consumer of this service. For
    * example &#39;projects/123456&#39;.
    */
  var consumer: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The time this tenancy unit was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Globally unique identifier of this tenancy unit
    * &quot;services/{service}/{collection id}/{resource
    * id}/tenancyUnits/{unit}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Google Cloud API name of the managed service owning this
    * tenancy unit. For example
    * &#39;serviceconsumermanagement.googleapis.com&#39;.
    */
  var service: js.UndefOr[String] = js.native
  /**
    * Resources constituting the tenancy unit. There can be at most 512 tenant
    * resources in a tenancy unit.
    */
  var tenantResources: js.UndefOr[js.Array[SchemaTenantResource]] = js.native
}

object SchemaTenancyUnit {
  @scala.inline
  def apply(
    consumer: String = null,
    createTime: String = null,
    name: String = null,
    service: String = null,
    tenantResources: js.Array[SchemaTenantResource] = null
  ): SchemaTenancyUnit = {
    val __obj = js.Dynamic.literal()
    if (consumer != null) __obj.updateDynamic("consumer")(consumer.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (tenantResources != null) __obj.updateDynamic("tenantResources")(tenantResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTenancyUnit]
  }
}

