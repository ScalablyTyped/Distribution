package typings
package lessDashMiddlewareLib

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
  var cacheFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Show more verbose logging?
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Destination directory to output the compiled .css files.
    */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Always re-compile less files on each request.
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only recompile once after each server restart.
    * Useful for reducing disk i/o on production.
    */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Common root of the source and destination.
    * It is prepended to both the source and destination before being used.
    */
  var pathRoot: js.UndefOr[java.lang.String] = js.undefined
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
    js.Function4[
      /* pathname */ java.lang.String, 
      /* css */ java.lang.String, 
      /* req */ expressLib.expressMod.eNs.Request, 
      /* next */ js.Function, 
      scala.Unit
    ]
  ] = js.undefined
}

