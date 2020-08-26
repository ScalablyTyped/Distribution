package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ConsumerInfo` provides information about the consumer.
  */
@js.native
trait SchemaConsumerInfo extends js.Object {
  /**
    * The consumer identity number, can be Google cloud project number, folder
    * number or organization number e.g. 1234567890. A value of 0 indicates no
    * consumer number is found.
    */
  var consumerNumber: js.UndefOr[String] = js.native
  /**
    * The Google cloud project number, e.g. 1234567890. A value of 0 indicates
    * no project number is found.  NOTE: This field is deprecated after Chemist
    * support flexible consumer id. New code should not depend on this field
    * anymore.
    */
  var projectNumber: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaConsumerInfo {
  @scala.inline
  def apply(): SchemaConsumerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumerInfo]
  }
  @scala.inline
  implicit class SchemaConsumerInfoOps[Self <: SchemaConsumerInfo] (val x: Self) extends AnyVal {
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
    def setConsumerNumber(value: String): Self = this.set("consumerNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerNumber: Self = this.set("consumerNumber", js.undefined)
    @scala.inline
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

