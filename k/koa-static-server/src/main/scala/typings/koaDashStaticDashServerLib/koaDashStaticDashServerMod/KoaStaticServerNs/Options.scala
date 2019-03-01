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

object Options {
  @scala.inline
  def apply(
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    maxage: scala.Int | scala.Double = null,
    notFoundFile: java.lang.String = null,
    rootDir: java.lang.String = null,
    rootPath: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (notFoundFile != null) __obj.updateDynamic("notFoundFile")(notFoundFile)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath)
    __obj.asInstanceOf[Options]
  }
}

