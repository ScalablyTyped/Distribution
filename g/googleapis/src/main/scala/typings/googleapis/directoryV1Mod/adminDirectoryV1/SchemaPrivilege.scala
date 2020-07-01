package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for privilege resource in Directory API.
  */
@js.native
trait SchemaPrivilege extends js.Object {
  /**
    * A list of child privileges. Privileges for a service form a tree. Each
    * privilege can have a list of child privileges; this list is empty for a
    * leaf privilege.
    */
  var childPrivileges: js.UndefOr[js.Array[SchemaPrivilege]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * If the privilege can be restricted to an organization unit.
    */
  var isOuScopable: js.UndefOr[Boolean] = js.native
  /**
    * The type of the API resource. This is always admin#directory#privilege.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the privilege.
    */
  var privilegeName: js.UndefOr[String] = js.native
  /**
    * The obfuscated ID of the service this privilege is for.
    */
  var serviceId: js.UndefOr[String] = js.native
  /**
    * The name of the service this privilege is for.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object SchemaPrivilege {
  @scala.inline
  def apply(
    childPrivileges: js.Array[SchemaPrivilege] = null,
    etag: String = null,
    isOuScopable: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    privilegeName: String = null,
    serviceId: String = null,
    serviceName: String = null
  ): SchemaPrivilege = {
    val __obj = js.Dynamic.literal()
    if (childPrivileges != null) __obj.updateDynamic("childPrivileges")(childPrivileges.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isOuScopable)) __obj.updateDynamic("isOuScopable")(isOuScopable.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrivilege]
  }
}

