package typings.grunt.gruntNs.fileNs

import typings.grunt.minimatchNs.IMinimatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/configuring-tasks#files}
  */
trait IFilesConfig extends IMinimatchOptions {
  /**
    * Patterns will be matched relative to this path, and all returned filepaths will
    * also be relative to this path.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Destination path prefix.
    */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Process a dynamic src-dest file mapping,
    * @see {@link http://gruntjs.com/configuring-tasks#building-the-files-object-dynamically for more information.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
   // = false
  /**
    * Either a valid fs.Stats method name:
    * - isFile
    * - isDirectory
    * - isBlockDevice
    * - isCharacterDevice
    * - isSymbolicLink
    * - isFIFO
    * - isSocket
    *
    * or a function that is passed the matched src filepath and returns true or false.
    *
    * string
    * (src: string) => boolean
    */
  // filter?: string
  // filter?: (src: string) => boolean
  var filter: js.UndefOr[js.Any] = js.undefined
  /**
    * Pattern(s) to match, relative to the {@link IExpandedFilesConfig.cwd}.
    */
  var src: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IFilesConfig {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dest: java.lang.String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined,
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
    src: js.Array[java.lang.String] = null
  ): IFilesConfig = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
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
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[IFilesConfig]
  }
}

