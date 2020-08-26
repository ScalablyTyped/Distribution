package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties needed for quota operations.
  */
@js.native
trait SchemaQuotaProperties extends js.Object {
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String] = js.native
}

object SchemaQuotaProperties {
  @scala.inline
  def apply(): SchemaQuotaProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaProperties]
  }
  @scala.inline
  implicit class SchemaQuotaPropertiesOps[Self <: SchemaQuotaProperties] (val x: Self) extends AnyVal {
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
    def setQuotaMode(value: String): Self = this.set("quotaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaMode: Self = this.set("quotaMode", js.undefined)
  }
  
}

