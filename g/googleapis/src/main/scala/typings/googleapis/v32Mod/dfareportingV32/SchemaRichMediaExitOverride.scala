package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rich Media Exit Override.
  */
@js.native
trait SchemaRichMediaExitOverride extends js.Object {
  /**
    * Click-through URL of this rich media exit override. Applicable if the
    * enabled field is set to true.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * Whether to use the clickThroughUrl. If false, the creative-level exit
    * will be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID for the override to refer to a specific exit in the creative.
    */
  var exitId: js.UndefOr[String] = js.native
}

object SchemaRichMediaExitOverride {
  @scala.inline
  def apply(): SchemaRichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichMediaExitOverride]
  }
  @scala.inline
  implicit class SchemaRichMediaExitOverrideOps[Self <: SchemaRichMediaExitOverride] (val x: Self) extends AnyVal {
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
    def setClickThroughUrl(value: SchemaClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExitId(value: String): Self = this.set("exitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitId: Self = this.set("exitId", js.undefined)
  }
  
}

