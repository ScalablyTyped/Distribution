package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Options for job processing.
  */
@js.native
trait SchemaProcessingOptions extends js.Object {
  /**
    * Optional.  If set to `true`, the service does not attempt to resolve a
    * more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Option for job HTML content sanitization. Applied fields are:
    * * description * applicationInfo.instruction * incentives * qualifications
    * * responsibilities  HTML tags in these fields may be stripped if
    * sanitiazation is not disabled.  Defaults to
    * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.native
}

object SchemaProcessingOptions {
  @scala.inline
  def apply(
    disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined,
    htmlSanitization: String = null
  ): SchemaProcessingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStreetAddressResolution)) __obj.updateDynamic("disableStreetAddressResolution")(disableStreetAddressResolution.asInstanceOf[js.Any])
    if (htmlSanitization != null) __obj.updateDynamic("htmlSanitization")(htmlSanitization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProcessingOptions]
  }
}

