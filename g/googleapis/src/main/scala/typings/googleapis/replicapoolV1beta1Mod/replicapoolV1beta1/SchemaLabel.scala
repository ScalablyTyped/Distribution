package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A label to apply to this replica pool.
  */
@js.native
trait SchemaLabel extends js.Object {
  /**
    * The key for this label.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of this label.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaLabel {
  @scala.inline
  def apply(): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabel]
  }
  @scala.inline
  implicit class SchemaLabelOps[Self <: SchemaLabel] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

