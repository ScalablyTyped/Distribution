package typings.hapiInert.mod

import typings.hapiHapi.mod.Request
import typings.hapiInert.hapiInertBooleans.`false`
import typings.hapiInert.hapiInertStrings.hash
import typings.hapiInert.hapiInertStrings.simple
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryHandlerRouteObject extends js.Object {
  /**
    * defaultExtension - optional string, appended to file requests if the requested file is not found. Defaults to no extension.
    */
  var defaultExtension: js.UndefOr[String] = js.native
  /**
    * etagMethod - specifies the method used to calculate the ETag header response. Available values:
    *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
    *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
    *  * false - Disable ETag computation.
    */
  var etagMethod: js.UndefOr[hash | simple | `false`] = js.native
  /**
    * index - optional boolean|string|string[], determines if an index file will be served if found in the folder when requesting a directory.
    * The given string or strings specify the name(s) of the index file to look for. If true, looks for 'index.html'.
    * Any falsy value disables index file lookup. Defaults to true.
    */
  var index: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  /**
    * listing - optional boolean, determines if directory listing is generated when a directory is requested without an index document. Defaults to false.
    */
  var listing: js.UndefOr[Boolean] = js.native
  /**
    * lookupCompressed - optional boolean, instructs the file processor to look for the same filename with the '.gz' suffix for a pre-compressed
    * version of the file to serve if the request supports content encoding. Defaults to false.
    */
  var lookupCompressed: js.UndefOr[Boolean] = js.native
  /**
    * path - (required) the directory root path (relative paths are resolved based on the route files configuration). Value can be:
    * * a single path string used as the prefix for any resources requested by appending the request path parameter to the provided string.
    * * an array of path strings. Each path will be attempted in order until a match is found (by following the same process as the single path string).
    * * a function with the signature function(request) which returns the path string or an array of path strings.
    *   If the function returns an error, the error is passed back to the client in the response.
    */
  var path: String | js.Array[String] | (RequestHandler[String | js.Array[String] | Error]) = js.native
  /**
    * redirectToSlash - optional boolean, determines if requests for a directory without a trailing slash are redirected to the same path with the missing slash.
    * Useful for ensuring relative links inside the response are resolved correctly.
    * Disabled when the server config router.stripTrailingSlash is true.Defaults to false.
    */
  var redirectToSlash: js.UndefOr[Boolean] = js.native
  /**
    * showHidden - optional boolean, determines if hidden files will be shown and served. Defaults to false.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
}

object DirectoryHandlerRouteObject {
  @scala.inline
  def apply(path: String | js.Array[String] | (RequestHandler[String | js.Array[String] | Error])): DirectoryHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryHandlerRouteObject]
  }
  @scala.inline
  implicit class DirectoryHandlerRouteObjectOps[Self <: DirectoryHandlerRouteObject] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPathFunction1(value: /* request */ Request => String | js.Array[String] | Error): Self = this.set("path", js.Any.fromFunction1(value))
    @scala.inline
    def setPath(value: String | js.Array[String] | (RequestHandler[String | js.Array[String] | Error])): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultExtension(value: String): Self = this.set("defaultExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExtension: Self = this.set("defaultExtension", js.undefined)
    @scala.inline
    def setEtagMethod(value: hash | simple | `false`): Self = this.set("etagMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtagMethod: Self = this.set("etagMethod", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: Boolean | String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setListing(value: Boolean): Self = this.set("listing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListing: Self = this.set("listing", js.undefined)
    @scala.inline
    def setLookupCompressed(value: Boolean): Self = this.set("lookupCompressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupCompressed: Self = this.set("lookupCompressed", js.undefined)
    @scala.inline
    def setRedirectToSlash(value: Boolean): Self = this.set("redirectToSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectToSlash: Self = this.set("redirectToSlash", js.undefined)
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
  }
  
}

