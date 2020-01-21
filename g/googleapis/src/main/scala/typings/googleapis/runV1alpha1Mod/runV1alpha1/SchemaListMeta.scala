package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListMeta describes metadata that synthetic resources must have, including
  * lists and various status objects. A resource may have only one of
  * {ObjectMeta, ListMeta}.
  */
@js.native
trait SchemaListMeta extends js.Object {
  /**
    * continue may be set if the user set a limit on the number of items
    * returned, and indicates that the server has more data available. The
    * value is opaque and may be used to issue another request to the endpoint
    * that served this list to retrieve the next set of available objects.
    * Continuing a list may not be possible if the server configuration has
    * changed or more than a few minutes have passed. The resourceVersion field
    * returned when using this continue value will be identical to the value in
    * the first response.
    */
  var continue: js.UndefOr[String] = js.native
  /**
    * String that identifies the server&#39;s internal version of this object
    * that can be used by clients to determine when objects have changed. Value
    * must be treated as opaque by clients and passed unmodified back to the
    * server. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
    * +optional
    */
  var resourceVersion: js.UndefOr[String] = js.native
  /**
    * SelfLink is a URL representing this object. Populated by the system.
    * Read-only. +optional
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaListMeta {
  @scala.inline
  def apply(continue: String = null, resourceVersion: String = null, selfLink: String = null): SchemaListMeta = {
    val __obj = js.Dynamic.literal()
    if (continue != null) __obj.updateDynamic("continue")(continue.asInstanceOf[js.Any])
    if (resourceVersion != null) __obj.updateDynamic("resourceVersion")(resourceVersion.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListMeta]
  }
}

