package typings.lessMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheFile extends js.Object {
  /**
    * Path to a JSON file that will be used to cache less data across server restarts.
    * This can greatly speed up initial load time after a server restart - if the less
    * files haven't changed and the css files still exist, specifying this option will
    * mean that the less files don't need to be recompiled after a server restart.
    */
  var cacheFile: js.UndefOr[String] = js.undefined
  /**
    * Show more verbose logging?
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Destination directory to output the compiled .css files.
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * Always re-compile less files on each request.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * Only recompile once after each server restart.
    * Useful for reducing disk i/o on production.
    */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * Common root of the source and destination.
    * It is prepended to both the source and destination before being used.
    */
  var pathRoot: js.UndefOr[String] = js.undefined
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var postprocess: js.UndefOr[AnonCss] = js.undefined
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var preprocess: js.UndefOr[AnonCssImportPaths] = js.undefined
  /**
    * Options for the less render.
    */
  var render: js.UndefOr[AnonCompress] = js.undefined
  /**
    * Function that is in charge of storing the css in the filesystem.
    */
  var storeCss: js.UndefOr[
    js.Function4[
      /* pathname */ String, 
      /* css */ String, 
      /* req */ Request_[ParamsDictionary], 
      /* next */ js.Function, 
      Unit
    ]
  ] = js.undefined
}

object AnonCacheFile {
  @scala.inline
  def apply(
    cacheFile: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    pathRoot: String = null,
    postprocess: AnonCss = null,
    preprocess: AnonCssImportPaths = null,
    render: AnonCompress = null,
    storeCss: (/* pathname */ String, /* css */ String, /* req */ Request_[ParamsDictionary], /* next */ js.Function) => Unit = null
  ): AnonCacheFile = {
    val __obj = js.Dynamic.literal()
    if (cacheFile != null) __obj.updateDynamic("cacheFile")(cacheFile.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (pathRoot != null) __obj.updateDynamic("pathRoot")(pathRoot.asInstanceOf[js.Any])
    if (postprocess != null) __obj.updateDynamic("postprocess")(postprocess.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (storeCss != null) __obj.updateDynamic("storeCss")(js.Any.fromFunction4(storeCss))
    __obj.asInstanceOf[AnonCacheFile]
  }
}

