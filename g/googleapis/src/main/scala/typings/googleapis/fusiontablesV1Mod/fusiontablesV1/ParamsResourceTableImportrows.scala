package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTableImportrows extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The delimiter used to separate cell values. This can only consist of a
    * single character. Default is ','.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * The encoding of the content. Default is UTF-8. Use 'auto-detect' if you
    * are unsure of the encoding.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * The index of the last line from which to start importing, exclusive.
    * Thus, the number of imported lines is endLine - startLine. If this
    * parameter is not provided, the file will be imported until the last line
    * of the file. If endLine is negative, then the imported content will
    * exclude the last endLine lines. That is, if endline is negative, no line
    * will be imported whose index is greater than N + endLine where N is the
    * number of lines in the file, and the number of imported lines will be N +
    * endLine - startLine.
    */
  var endLine: js.UndefOr[Double] = js.native
  /**
    * Whether the CSV must have the same number of values for each row. If
    * false, rows with fewer values will be padded with empty values. Default
    * is true.
    */
  var isStrict: js.UndefOr[Boolean] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  /**
    * The index of the first line from which to start importing, inclusive.
    * Default is 0.
    */
  var startLine: js.UndefOr[Double] = js.native
  /**
    * The table into which new rows are being imported.
    */
  var tableId: js.UndefOr[String] = js.native
}

object ParamsResourceTableImportrows {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    delimiter: String = null,
    encoding: String = null,
    endLine: js.UndefOr[Double] = js.undefined,
    fields: String = null,
    isStrict: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    media: Body = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startLine: js.UndefOr[Double] = js.undefined,
    tableId: String = null,
    userIp: String = null
  ): ParamsResourceTableImportrows = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(isStrict)) __obj.updateDynamic("isStrict")(isStrict.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(startLine)) __obj.updateDynamic("startLine")(startLine.get.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceTableImportrows]
  }
}

