package typings.ionicUtilsStream.mod

import typings.node.BufferEncoding
import typings.node.anon.Chunk
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStreamBufferOptions extends WritableOptions {
  var allocSize: js.UndefOr[Double] = js.undefined
  var growSize: js.UndefOr[Double] = js.undefined
}

object WritableStreamBufferOptions {
  @scala.inline
  def apply(
    allocSize: js.UndefOr[Double] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultencoding: BufferEncoding = null,
    destroy: js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    `final`: js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    growSize: js.UndefOr[Double] = js.undefined,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Writable, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): WritableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allocSize)) __obj.updateDynamic("allocSize")(allocSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.get.asInstanceOf[js.Any])
    if (defaultencoding != null) __obj.updateDynamic("defaultencoding")(defaultencoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.get.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (!js.isUndefined(growSize)) __obj.updateDynamic("growSize")(growSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritableStreamBufferOptions]
  }
}

