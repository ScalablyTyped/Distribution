package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the CheckAssetLinks call.
  */
@js.native
trait SchemaCheckResponse extends js.Object {
  /**
    * Human-readable message containing information intended to help end users
    * understand, reproduce and debug the result.   The message will be in
    * English and we are currently not planning to offer any translations.
    * Please note that no guarantees are made about the contents or format of
    * this string.  Any aspect of it may be subject to change without notice.
    * You should not attempt to programmatically parse this data.  For
    * programmatic access, use the error_code field below.
    */
  var debugString: js.UndefOr[String] = js.native
  /**
    * Error codes that describe the result of the Check operation.
    */
  var errorCode: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set to true if the assets specified in the request are linked by the
    * relation specified in the request.
    */
  var linked: js.UndefOr[Boolean] = js.native
  /**
    * From serving time, how much longer the response should be considered
    * valid barring further updates. REQUIRED
    */
  var maxAge: js.UndefOr[String] = js.native
}

object SchemaCheckResponse {
  @scala.inline
  def apply(
    debugString: String = null,
    errorCode: js.Array[String] = null,
    linked: js.UndefOr[Boolean] = js.undefined,
    maxAge: String = null
  ): SchemaCheckResponse = {
    val __obj = js.Dynamic.literal()
    if (debugString != null) __obj.updateDynamic("debugString")(debugString.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (!js.isUndefined(linked)) __obj.updateDynamic("linked")(linked.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckResponse]
  }
}

