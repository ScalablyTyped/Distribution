package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCancelTestOrderByCustomerRequest extends js.Object {
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaOrdersCancelTestOrderByCustomerRequest {
  @scala.inline
  def apply(): SchemaOrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCancelTestOrderByCustomerRequest]
  }
  @scala.inline
  implicit class SchemaOrdersCancelTestOrderByCustomerRequestOps[Self <: SchemaOrdersCancelTestOrderByCustomerRequest] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

