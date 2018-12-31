package typings
package koaDashStaticDashServerLib.koaDashStaticDashServerMod.KoaStaticServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested
    */
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow transfer of hidden files. defaults to false
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
    * don't execute any downstream middleware. defaults to true
    */
  var last: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * request access log to console
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Browser cache max-age in milliseconds. defaults to 0
    */
  var maxage: js.UndefOr[scala.Double] = js.undefined
  /**
    * optional default file to serve if requested static is missing
    */
  var notFoundFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * directory that is to be served
    */
  var rootDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional rewrite path
    */
  var rootPath: js.UndefOr[java.lang.String] = js.undefined
}

