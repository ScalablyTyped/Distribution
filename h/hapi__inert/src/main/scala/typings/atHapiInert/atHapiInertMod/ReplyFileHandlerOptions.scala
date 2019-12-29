package typings.atHapiInert.atHapiInertMod

import org.scalablytyped.runtime.StringDictionary
import typings.atHapiInert.atHapiInertBooleans.`false`
import typings.atHapiInert.atHapiInertStrings.`inline`
import typings.atHapiInert.atHapiInertStrings.attachment
import typings.atHapiInert.atHapiInertStrings.hash
import typings.atHapiInert.atHapiInertStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyFileHandlerOptions extends js.Object {
  /**
    * confine - serve file relative to this directory and returns 403 Forbidden if the path resolves outside the confine directory.
    * Defaults to true which uses the relativeTo route option as the confine. Set to false to disable this security feature.
    */
  var confine: js.UndefOr[Boolean] = js.undefined
  /**
    * end - offset in file to stop reading from. If not set, will read to end of file.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * etagMethod - specifies the method used to calculate the ETag header response. Available values:
    *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
    *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
    *  * false - Disable ETag computation.
    */
  var etagMethod: js.UndefOr[hash | simple | `false`] = js.undefined
  /**
    * filename - an optional filename to specify if sending a 'Content-Disposition' header, defaults to the basename of path
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * lookupCompressed - if true, looks for for a pre-compressed version of the file with the same filename with an extension, depending on the accepted encoding. Defaults to false.
    */
  var lookupCompressed: js.UndefOr[Boolean] = js.undefined
  /**
    * lookupMap - an object which maps content encoding to expected file name extension. Defaults to `{ gzip: '.gz' }.
    */
  var lookupMap: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * mode - specifies whether to include the 'Content-Disposition' header with the response. Available values:
    *  * false - header is not included. This is the default value.
    *  * 'attachment'
    *  *'inline'
    */
  var mode: js.UndefOr[`false` | attachment | `inline`] = js.undefined
  /**
    * start - offset in file to reading from, defaults to 0.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object ReplyFileHandlerOptions {
  @scala.inline
  def apply(
    confine: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    etagMethod: hash | simple | `false` = null,
    filename: String = null,
    lookupCompressed: js.UndefOr[Boolean] = js.undefined,
    lookupMap: StringDictionary[String] = null,
    mode: `false` | attachment | `inline` = null,
    start: Int | Double = null
  ): ReplyFileHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confine)) __obj.updateDynamic("confine")(confine.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (etagMethod != null) __obj.updateDynamic("etagMethod")(etagMethod.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupCompressed)) __obj.updateDynamic("lookupCompressed")(lookupCompressed.asInstanceOf[js.Any])
    if (lookupMap != null) __obj.updateDynamic("lookupMap")(lookupMap.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyFileHandlerOptions]
  }
}

