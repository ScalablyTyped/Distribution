package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are valid for compact-format
  */
trait IExpandedFilesConfig extends IFilesConfig {
  /**
    * Replace any existing extension with this value in generated {@link IExpandedFilesConfig.dest} paths.
    */
  var ext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Remove all path parts from generated {@link IExpandedFilesConfig.dest} paths.
    */
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This function is called for each matched src file, (after extension renaming and flattening).
    * The {@link IExpandedFilesConfig.dest} and matched {@link IExpandedFilesConfig.src} path are passed in,
    * and this function must return a new dest value.
    * If the same dest is returned more than once, each src which used it will be added to an array of sources for it.
    */
  var rename: js.UndefOr[js.Function] = js.undefined
}

object IExpandedFilesConfig {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dest: java.lang.String = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    ext: java.lang.String = null,
    filter: js.Any = null,
    flatten: js.UndefOr[scala.Boolean] = js.undefined,
    flipNegate: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nocomment: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined,
    rename: js.Function = null,
    src: js.Array[java.lang.String] = null
  ): IExpandedFilesConfig = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (rename != null) __obj.updateDynamic("rename")(rename)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[IExpandedFilesConfig]
  }
}

