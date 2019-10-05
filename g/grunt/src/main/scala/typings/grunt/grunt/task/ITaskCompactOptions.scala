package typings.grunt.grunt.task

import typings.grunt.grunt.file.IFilesConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see ITaskOptions
  */
trait ITaskCompactOptions
  extends IFilesConfig
     with ITaskOptions

object ITaskCompactOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dest: java.lang.String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined,
    files: js.Any = null,
    filter: js.Any = null,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nocomment: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nonegate: js.UndefOr[Boolean] = js.undefined,
    nonull: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    src: js.Array[java.lang.String] = null
  ): ITaskCompactOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (files != null) __obj.updateDynamic("files")(files)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (options != null) __obj.updateDynamic("options")(options)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[ITaskCompactOptions]
  }
}

