package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lifecycle describes actions that the management system should take in
  * response to container lifecycle events. For the PostStart and PreStop
  * lifecycle handlers, management of the container blocks until the action is
  * complete, unless the container process fails, in which case the handler is
  * aborted.
  */
@js.native
trait SchemaLifecycle extends js.Object {
  /**
    * PostStart is called immediately after a container is created. If the
    * handler fails, the container is terminated and restarted according to its
    * restart policy. Other management of the container blocks until the hook
    * completes. More info:
    * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    * +optional
    */
  var postStart: js.UndefOr[SchemaHandler] = js.native
  /**
    * PreStop is called immediately before a container is terminated. The
    * container is terminated after the handler completes. The reason for
    * termination is passed to the handler. Regardless of the outcome of the
    * handler, the container is eventually terminated. Other management of the
    * container blocks until the hook completes. More info:
    * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    * +optional
    */
  var preStop: js.UndefOr[SchemaHandler] = js.native
}

object SchemaLifecycle {
  @scala.inline
  def apply(): SchemaLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLifecycle]
  }
  @scala.inline
  implicit class SchemaLifecycleOps[Self <: SchemaLifecycle] (val x: Self) extends AnyVal {
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
    def setPostStart(value: SchemaHandler): Self = this.set("postStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostStart: Self = this.set("postStart", js.undefined)
    @scala.inline
    def setPreStop(value: SchemaHandler): Self = this.set("preStop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreStop: Self = this.set("preStop", js.undefined)
  }
  
}

