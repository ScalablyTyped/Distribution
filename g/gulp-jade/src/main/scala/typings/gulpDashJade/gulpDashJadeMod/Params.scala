package typings.gulpDashJade.gulpDashJadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /**
    * If set to true, compiled functions are cached. filename
    * must be set as the cache key.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * Compile to JS instead of HTML.
    */
  var client: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the function source will be included in the
    * compiled template for better error messages (sometimes useful
    * in development). It is enabled by default unless used with
    * express in production mode.
    */
  var compileDebug: js.UndefOr[Boolean] = js.undefined
  /**
    * Data to be used while parsing jade files. Has lower
    * precedence than locals.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * If set to true, the tokens and function body is logged
    * to stdout
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /*******
    * JADE API OPTIONS
    *******/
  /**
    * If the doctype is not specified as part of the
    * template, you can specify it here. It is sometimes
    * useful to get self-closing tags and remove mirroring
    * of boolean attributes.
    */
  var doctype: js.UndefOr[String] = js.undefined
  /*******
    * GULP-JADE OPTIONS
    *******/
  /**
    * Used to set a version of jade other than this library's
    * dependency, or to customise filters.
    */
  var jade: js.UndefOr[js.Any] = js.undefined
  /**
    * Locals to be used while parsing jade files. Takes
    * precedence over data.
    */
  var locals: js.UndefOr[js.Any] = js.undefined
  /**
    * Adds whitespace to the resulting html to make it
    * easier for a human to read using '  ' as indentation.
    * If a string is specified, that will be used as
    * indentation instead (e.g. '\t').
    */
  var pretty: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Use a self namespace to hold the locals (false by default)
    */
  var self: js.UndefOr[Boolean] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    client: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    jade: js.Any = null,
    locals: js.Any = null,
    pretty: Boolean | String = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (jade != null) __obj.updateDynamic("jade")(jade)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[Params]
  }
}

