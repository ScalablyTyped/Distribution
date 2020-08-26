package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional information about the check operation.
  */
@js.native
trait SchemaCheckInfo extends js.Object {
  /**
    * Consumer info of this check.
    */
  var consumerInfo: js.UndefOr[SchemaConsumerInfo] = js.native
  /**
    * A list of fields and label keys that are ignored by the server. The
    * client doesn&#39;t need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCheckInfo {
  @scala.inline
  def apply(): SchemaCheckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInfo]
  }
  @scala.inline
  implicit class SchemaCheckInfoOps[Self <: SchemaCheckInfo] (val x: Self) extends AnyVal {
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
    def setConsumerInfo(value: SchemaConsumerInfo): Self = this.set("consumerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerInfo: Self = this.set("consumerInfo", js.undefined)
    @scala.inline
    def setUnusedArgumentsVarargs(value: String*): Self = this.set("unusedArguments", js.Array(value :_*))
    @scala.inline
    def setUnusedArguments(value: js.Array[String]): Self = this.set("unusedArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedArguments: Self = this.set("unusedArguments", js.undefined)
  }
  
}

