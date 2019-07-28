package typings.gulpDashWatch.gulpDashWatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.Anon_IsDirectory
import typings.glob.globNumbers.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.globDashStream.globDashStreamMod.UniqueByFunctionPredicate
import typings.globDashStream.globDashStreamMod.UniqueByStringPredicate
import typings.std.Date
import typings.vinylDashFs.vinylDashFsMod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends SrcOptions {
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreInitial: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var readDelay: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = null,
    cwd: String = null,
    cwdbase: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    dirMode: Int | Double = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[String] = null,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignore: String | js.Array[String] = null,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    mark: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    matchBase_IOptions: js.Any = null,
    name: String = null,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nocomment: js.UndefOr[Boolean] = js.undefined,
    nodir: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nomount: js.UndefOr[Boolean] = js.undefined,
    nonegate: js.UndefOr[Boolean] = js.undefined,
    nonull: js.UndefOr[Boolean] = js.undefined,
    nosort: js.UndefOr[Boolean] = js.undefined,
    nounique: js.UndefOr[Boolean] = js.undefined,
    passthrough: js.UndefOr[Boolean] = js.undefined,
    read: js.UndefOr[Boolean] = js.undefined,
    readDelay: Int | Double = null,
    realpath: js.UndefOr[Boolean] = js.undefined,
    realpathCache: StringDictionary[String] = null,
    relative: js.UndefOr[Boolean] = js.undefined,
    removeBOM: js.UndefOr[Boolean] = js.undefined,
    resolveSymlinks: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    since: Date | Double = null,
    sourcemaps: js.UndefOr[Boolean] = js.undefined,
    stat: js.UndefOr[Boolean] = js.undefined,
    statCache: StringDictionary[js.UndefOr[`false` | Anon_IsDirectory]] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    stripBOM: js.UndefOr[Boolean] = js.undefined,
    symlinks: StringDictionary[js.UndefOr[Boolean]] = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniqueBy: UniqueByStringPredicate | UniqueByFunctionPredicate = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(cwdbase)) __obj.updateDynamic("cwdbase")(cwdbase)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dirMode != null) __obj.updateDynamic("dirMode")(dirMode.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial)
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (matchBase_IOptions != null) __obj.updateDynamic("matchBase")(matchBase_IOptions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique)
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (readDelay != null) __obj.updateDynamic("readDelay")(readDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    if (!js.isUndefined(removeBOM)) __obj.updateDynamic("removeBOM")(removeBOM)
    if (!js.isUndefined(resolveSymlinks)) __obj.updateDynamic("resolveSymlinks")(resolveSymlinks)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(stripBOM)) __obj.updateDynamic("stripBOM")(stripBOM)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (uniqueBy != null) __obj.updateDynamic("uniqueBy")(uniqueBy.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[IOptions]
  }
}

