package typings.atIonicUtilsDashStream.atIonicUtilsDashStreamMod

import typings.node.Error
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBufferOptions extends ReadableOptions {
  var allocSize: js.UndefOr[Double] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var growSize: js.UndefOr[Double] = js.undefined
}

object ReadableStreamBufferOptions {
  @scala.inline
  def apply(
    allocSize: Int | Double = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    chunkSize: Int | Double = null,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    encoding: String = null,
    growSize: Int | Double = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null
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

