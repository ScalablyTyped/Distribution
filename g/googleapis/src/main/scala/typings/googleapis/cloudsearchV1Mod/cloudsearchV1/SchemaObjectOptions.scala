package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for an object.
  */
@js.native
trait SchemaObjectOptions extends js.Object {
  /**
    * Options that determine how the object is displayed in the Cloud Search
    * results page.
    */
  var displayOptions: js.UndefOr[SchemaObjectDisplayOptions] = js.native
  /**
    * The freshness options for an object.
    */
  var freshnessOptions: js.UndefOr[SchemaFreshnessOptions] = js.native
}

object SchemaObjectOptions {
  @scala.inline
  def apply(): SchemaObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectOptions]
  }
  @scala.inline
  implicit class SchemaObjectOptionsOps[Self <: SchemaObjectOptions] (val x: Self) extends AnyVal {
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
    def setDisplayOptions(value: SchemaObjectDisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    @scala.inline
    def setFreshnessOptions(value: SchemaFreshnessOptions): Self = this.set("freshnessOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreshnessOptions: Self = this.set("freshnessOptions", js.undefined)
  }
  
}

