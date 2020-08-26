package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializers tracks the progress of initialization.
  */
@js.native
trait SchemaInitializers extends js.Object {
  /**
    * Pending is a list of initializers that must execute in order before this
    * object is visible. When the last pending initializer is removed, and no
    * failing result is set, the initializers struct will be set to nil and the
    * object is considered as initialized and visible to all clients.
    * +patchMergeKey=name +patchStrategy=merge
    */
  var pending: js.UndefOr[js.Array[SchemaInitializer]] = js.native
}

object SchemaInitializers {
  @scala.inline
  def apply(): SchemaInitializers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializers]
  }
  @scala.inline
  implicit class SchemaInitializersOps[Self <: SchemaInitializers] (val x: Self) extends AnyVal {
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
    def setPendingVarargs(value: SchemaInitializer*): Self = this.set("pending", js.Array(value :_*))
    @scala.inline
    def setPending(value: js.Array[SchemaInitializer]): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
  
}

