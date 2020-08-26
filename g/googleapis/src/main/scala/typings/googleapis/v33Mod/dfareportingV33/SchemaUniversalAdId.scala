package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following
  * creative types: INSTREAM_AUDIO, INSTREAM_VIDEO and VPAID.
  */
@js.native
trait SchemaUniversalAdId extends js.Object {
  /**
    * Registry used for the Ad ID value.
    */
  var registry: js.UndefOr[String] = js.native
  /**
    * ID value for this creative. Only alphanumeric characters and the
    * following symbols are valid: &quot;_/\-&quot;. Maximum length is 64
    * characters. Read only when registry is DCM.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUniversalAdId {
  @scala.inline
  def apply(): SchemaUniversalAdId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUniversalAdId]
  }
  @scala.inline
  implicit class SchemaUniversalAdIdOps[Self <: SchemaUniversalAdId] (val x: Self) extends AnyVal {
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
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

