package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the status of the Deidentify operation.
  */
@js.native
trait SchemaDeidentifyErrorDetails extends js.Object {
  /**
    * Number of resources failed to process.
    */
  var failureResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores failed to process.
    */
  var failureStoreCount: js.UndefOr[String] = js.native
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}

object SchemaDeidentifyErrorDetails {
  @scala.inline
  def apply(): SchemaDeidentifyErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyErrorDetails]
  }
  @scala.inline
  implicit class SchemaDeidentifyErrorDetailsOps[Self <: SchemaDeidentifyErrorDetails] (val x: Self) extends AnyVal {
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
    def setFailureResourceCount(value: String): Self = this.set("failureResourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureResourceCount: Self = this.set("failureResourceCount", js.undefined)
    @scala.inline
    def setFailureStoreCount(value: String): Self = this.set("failureStoreCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureStoreCount: Self = this.set("failureStoreCount", js.undefined)
    @scala.inline
    def setSuccessResourceCount(value: String): Self = this.set("successResourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessResourceCount: Self = this.set("successResourceCount", js.undefined)
    @scala.inline
    def setSuccessStoreCount(value: String): Self = this.set("successStoreCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessStoreCount: Self = this.set("successStoreCount", js.undefined)
  }
  
}

