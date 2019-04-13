package typings
package klawLib.klawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends nodeLib.streamMod.ReadableOptions {
  var depthLimit: js.UndefOr[scala.Double] = js.undefined
  // fs or mock-fs
  var filter: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.undefined
  var fs: js.UndefOr[js.Any] = js.undefined
  var pathSorter: js.UndefOr[
    js.Function2[/* pathA */ java.lang.String, /* pathB */ java.lang.String, scala.Double]
  ] = js.undefined
  var preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  var queueMethod: js.UndefOr[QueueMethod] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    depthLimit: scala.Int | scala.Double = null,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    encoding: java.lang.String = null,
    filter: /* path */ java.lang.String => scala.Boolean = null,
    fs: js.Any = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    pathSorter: (/* pathA */ java.lang.String, /* pathB */ java.lang.String) => scala.Double = null,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    queueMethod: QueueMethod = null,
    read: js.ThisFunction1[/* this */ nodeLib.streamMod.Readable, /* size */ scala.Double, scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (depthLimit != null) __obj.updateDynamic("depthLimit")(depthLimit.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (pathSorter != null) __obj.updateDynamic("pathSorter")(js.Any.fromFunction2(pathSorter))
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (queueMethod != null) __obj.updateDynamic("queueMethod")(queueMethod)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Options]
  }
}

