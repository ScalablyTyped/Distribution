package typings.koaDashStaticDashServer.koaDashStaticDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested
    */
  var gzip: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow transfer of hidden files. defaults to false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  /**
    * don't execute any downstream middleware. defaults to true
    */
  var last: js.UndefOr[Boolean] = js.undefined
  /**
    * request access log to console
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * Browser cache max-age in milliseconds. defaults to 0
    */
  var maxage: js.UndefOr[Double] = js.undefined
  /**
    * optional default file to serve if requested static is missing
    */
  var notFoundFile: js.UndefOr[String] = js.undefined
  /**
    * directory that is to be served
    */
  var rootDir: js.UndefOr[String] = js.undefined
  /**
    * optional rewrite path
    */
  var rootPath: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    gzip: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    last: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    maxage: Int | Double = null,
    notFoundFile: String = null,
    rootDir: String = null,
    rootPath: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (notFoundFile != null) __obj.updateDynamic("notFoundFile")(notFoundFile.asInstanceOf[js.Any])
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir.asInstanceOf[js.Any])
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

