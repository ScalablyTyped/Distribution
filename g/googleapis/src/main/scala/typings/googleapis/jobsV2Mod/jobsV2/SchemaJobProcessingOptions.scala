package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Options for job processing.
  */
@js.native
trait SchemaJobProcessingOptions extends js.Object {
  /**
    * Optional.  If set to `true`, the service does not attempt to resolve a
    * more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Option for job HTML content sanitization. Applied fields are:
    * * description * applicationInstruction * incentives * qualifications *
    * responsibilities  HTML tags in these fields may be stripped if
    * sanitiazation is not disabled.  Defaults to
    * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.native
}

object SchemaJobProcessingOptions {
  @scala.inline
  def apply(
    disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined,
    htmlSanitization: String = null
  ): SchemaJobProcessingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStreetAddressResolution)) __obj.updateDynamic("disableStreetAddressResolution")(disableStreetAddressResolution.get.asInstanceOf[js.Any])
    if (htmlSanitization != null) __obj.updateDynamic("htmlSanitization")(htmlSanitization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobProcessingOptions]
  }
}

