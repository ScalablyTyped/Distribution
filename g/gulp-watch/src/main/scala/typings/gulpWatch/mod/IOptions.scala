package typings.gulpWatch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.anon.IsDirectory
import typings.glob.globBooleans.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.globStream.mod.UniqueByFunctionPredicate
import typings.globStream.mod.UniqueByStringPredicate
import typings.std.Date
import typings.vinylFs.mod.SrcOptions
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
    dirMode: js.UndefOr[Double] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[String] = null,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignore: String | js.Array[String] = null,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    mark: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
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
    readDelay: js.UndefOr[Double] = js.undefined,
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
    statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    stripBOM: js.UndefOr[Boolean] = js.undefined,
    symlinks: StringDictionary[js.UndefOr[Boolean]] = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniqueBy: UniqueByStringPredicate | UniqueByFunctionPredicate = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.get.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(cwdbase)) __obj.updateDynamic("cwdbase")(cwdbase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dirMode)) __obj.updateDynamic("dirMode")(dirMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough.get.asInstanceOf[js.Any])
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readDelay)) __obj.updateDynamic("readDelay")(readDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath.get.asInstanceOf[js.Any])
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeBOM)) __obj.updateDynamic("removeBOM")(removeBOM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveSymlinks)) __obj.updateDynamic("resolveSymlinks")(resolveSymlinks.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat.get.asInstanceOf[js.Any])
    if (statCache != null) __obj.updateDynamic("statCache")(statCache.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripBOM)) __obj.updateDynamic("stripBOM")(stripBOM.get.asInstanceOf[js.Any])
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    if (uniqueBy != null) __obj.updateDynamic("uniqueBy")(uniqueBy.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

