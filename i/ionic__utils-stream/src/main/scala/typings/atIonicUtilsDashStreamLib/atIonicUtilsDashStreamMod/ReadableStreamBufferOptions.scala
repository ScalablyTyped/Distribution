package typings
package atIonicUtilsDashStreamLib.atIonicUtilsDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBufferOptions
  extends nodeLib.streamMod.ReadableOptions {
  var allocSize: js.UndefOr[scala.Double] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var growSize: js.UndefOr[scala.Double] = js.undefined
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(
    allocSize: scala.Int | scala.Double = null,
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    chunkSize: scala.Int | scala.Double = null,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    encoding: java.lang.String = null,
    growSize: scala.Int | scala.Double = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ nodeLib.streamMod.Readable, /* size */ scala.Double, scala.Unit] = null
  ): ReadableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (allocSize != null) __obj.updateDynamic("allocSize")(allocSize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (growSize != null) __obj.updateDynamic("growSize")(growSize.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[ReadableStreamBufferOptions]
  }
}

