package typings
package atHapiInertLib.atHapiInertMod.inertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryHandlerRouteObject extends js.Object {
  /**
    * defaultExtension - optional string, appended to file requests if the requested file is not found. Defaults to no extension.
    */
  var defaultExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * etagMethod - specifies the method used to calculate the ETag header response. Available values:
    *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
    *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
    *  * false - Disable ETag computation.
    */
  var etagMethod: js.UndefOr[
    atHapiInertLib.atHapiInertLibStrings.hash | atHapiInertLib.atHapiInertLibStrings.simple | atHapiInertLib.atHapiInertLibNumbers.`false`
  ] = js.undefined
  /**
    * index - optional boolean|string|string[], determines if an index file will be served if found in the folder when requesting a directory.
    * The given string or strings specify the name(s) of the index file to look for. If true, looks for 'index.html'.
    * Any falsy value disables index file lookup. Defaults to true.
    */
  var index: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * listing - optional boolean, determines if directory listing is generated when a directory is requested without an index document. Defaults to false.
    */
  var listing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * lookupCompressed - optional boolean, instructs the file processor to look for the same filename with the '.gz' suffix for a pre-compressed
    * version of the file to serve if the request supports content encoding. Defaults to false.
    */
  var lookupCompressed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * path - (required) the directory root path (relative paths are resolved based on the route files configuration). Value can be:
    * * a single path string used as the prefix for any resources requested by appending the request path parameter to the provided string.
    * * an array of path strings. Each path will be attempted in order until a match is found (by following the same process as the single path string).
    * * a function with the signature function(request) which returns the path string or an array of path strings.
    *   If the function returns an error, the error is passed back to the client in the response.
    */
  var path: java.lang.String | js.Array[java.lang.String] | (RequestHandler[java.lang.String | js.Array[java.lang.String] | stdLib.Error])
  /**
    * redirectToSlash - optional boolean, determines if requests for a directory without a trailing slash are redirected to the same path with the missing slash.
    * Useful for ensuring relative links inside the response are resolved correctly.
    * Disabled when the server config router.stripTrailingSlash is true.Defaults to false.
    */
  var redirectToSlash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * showHidden - optional boolean, determines if hidden files will be shown and served. Defaults to false.
    */
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object DirectoryHandlerRouteObject {
  @scala.inline
  def apply(
    path: java.lang.String | js.Array[java.lang.String] | (RequestHandler[java.lang.String | js.Array[java.lang.String] | stdLib.Error]),
    defaultExtension: java.lang.String = null,
    etagMethod: atHapiInertLib.atHapiInertLibStrings.hash | atHapiInertLib.atHapiInertLibStrings.simple | atHapiInertLib.atHapiInertLibNumbers.`false` = null,
    index: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    listing: js.UndefOr[scala.Boolean] = js.undefined,
    lookupCompressed: js.UndefOr[scala.Boolean] = js.undefined,
    redirectToSlash: js.UndefOr[scala.Boolean] = js.undefined,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined
  ): DirectoryHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension)
    if (etagMethod != null) __obj.updateDynamic("etagMethod")(etagMethod.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(listing)) __obj.updateDynamic("listing")(listing)
    if (!js.isUndefined(lookupCompressed)) __obj.updateDynamic("lookupCompressed")(lookupCompressed)
    if (!js.isUndefined(redirectToSlash)) __obj.updateDynamic("redirectToSlash")(redirectToSlash)
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    __obj.asInstanceOf[DirectoryHandlerRouteObject]
  }
}

