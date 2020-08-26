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
  def apply(): SchemaListMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMeta]
  }
  @scala.inline
  implicit class SchemaListMetaOps[Self <: SchemaListMeta] (val x: Self) extends AnyVal {
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
    def setContinue(value: String): Self = this.set("continue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinue: Self = this.set("continue", js.undefined)
    @scala.inline
    def setResourceVersion(value: String): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceVersion: Self = this.set("resourceVersion", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

