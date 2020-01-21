package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Settings
  */
@js.native
trait SchemaCreativeSettings extends js.Object {
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameFooter: js.UndefOr[String] = js.native
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameHeader: js.UndefOr[String] = js.native
}

object SchemaCreativeSettings {
  @scala.inline
  def apply(iFrameFooter: String = null, iFrameHeader: String = null): SchemaCreativeSettings = {
    val __obj = js.Dynamic.literal()
    if (iFrameFooter != null) __obj.updateDynamic("iFrameFooter")(iFrameFooter.asInstanceOf[js.Any])
    if (iFrameHeader != null) __obj.updateDynamic("iFrameHeader")(iFrameHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeSettings]
  }
}

