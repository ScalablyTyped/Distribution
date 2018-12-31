package typings
package koaDashSendLib.koaDashSendMod.sendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  /** Try to serve the brotli version of a file automatically when brotli is supported by a client and if the requested file with .br extension exists. (defaults to true). */
  var brotli: js.UndefOr[scala.Boolean] = js.undefined
  /** Try to match extensions from passed array to search for file when no extension is sufficed in URL. First found is served. (defaults to false) */
  var extensions: js.UndefOr[js.Array[java.lang.String] | koaDashSendLib.koaDashSendLibNumbers.`false`] = js.undefined
  /** If not false (defaults to true), format the path to serve static file servers and not require a trailing slash for directories, so that you can do both /directory and /directory/. */
  var format: js.UndefOr[scala.Boolean] = js.undefined
  /** Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested file with .gz extension exists. (defaults to true). */
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow transfer of hidden files. (defaults to false) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Tell the browser the resource is immutable and can be cached indefinitely. (defaults to false) */
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the index file to serve automatically when visiting the root location. (defaults to none) */
  var index: js.UndefOr[java.lang.String | koaDashSendLib.koaDashSendLibNumbers.`false`] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /** Browser cache max-age in milliseconds. (defaults to 0) */
  var maxage: js.UndefOr[scala.Double] = js.undefined
  /** Root directory to restrict file access. (defaults to '') */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** Function to set custom headers on response. */
  var setHeaders: js.UndefOr[SetHeaders] = js.undefined
}

