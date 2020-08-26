package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a detailed summary of the Deidentify operation.
  */
@js.native
trait SchemaDeidentifySummary extends js.Object {
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}

object SchemaDeidentifySummary {
  @scala.inline
  def apply(): SchemaDeidentifySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifySummary]
  }
  @scala.inline
  implicit class SchemaDeidentifySummaryOps[Self <: SchemaDeidentifySummary] (val x: Self) extends AnyVal {
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
    def setSuccessResourceCount(value: String): Self = this.set("successResourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessResourceCount: Self = this.set("successResourceCount", js.undefined)
    @scala.inline
    def setSuccessStoreCount(value: String): Self = this.set("successStoreCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessStoreCount: Self = this.set("successStoreCount", js.undefined)
  }
  
}

