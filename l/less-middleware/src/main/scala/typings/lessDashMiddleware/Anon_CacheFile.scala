package typings.lessDashMiddleware

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheFile extends js.Object {
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
  var postprocess: js.UndefOr[Anon_Css] = js.undefined
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var preprocess: js.UndefOr[Anon_CssImportPaths] = js.undefined
  /**
    * Options for the less render.
    */
  var render: js.UndefOr[Anon_Compress] = js.undefined
  /**
    * Function that is in charge of storing the css in the filesystem.
    */
  var storeCss: js.UndefOr[
    js.Function4[/* pathname */ String, /* css */ String, /* req */ Request, /* next */ js.Function, Unit]
  ] = js.undefined
}

object Anon_CacheFile {
  @scala.inline
  def apply(
    cacheFile: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    pathRoot: String = null,
    postprocess: Anon_Css = null,
    preprocess: Anon_CssImportPaths = null,
    render: Anon_Compress = null,
    storeCss: (/* pathname */ String, /* css */ String, /* req */ Request, /* next */ js.Function) => Unit = null
  ): Anon_CacheFile = {
    val __obj = js.Dynamic.literal()
    if (cacheFile != null) __obj.updateDynamic("cacheFile")(cacheFile)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (pathRoot != null) __obj.updateDynamic("pathRoot")(pathRoot)
    if (postprocess != null) __obj.updateDynamic("postprocess")(postprocess)
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    if (render != null) __obj.updateDynamic("render")(render)
    if (storeCss != null) __obj.updateDynamic("storeCss")(js.Any.fromFunction4(storeCss))
    __obj.asInstanceOf[Anon_CacheFile]
  }
}

