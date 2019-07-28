package typings.leveldown.leveldownMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownOpenOptions extends AbstractOpenOptions {
  var blockRestartInterval: js.UndefOr[Double] = js.undefined
  var blockSize: js.UndefOr[Double] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var compression: js.UndefOr[Boolean] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var maxOpenFiles: js.UndefOr[Double] = js.undefined
  var writeBufferSize: js.UndefOr[Double] = js.undefined
}

object LevelDownOpenOptions {
  @scala.inline
  def apply(
    blockRestartInterval: Int | Double = null,
    blockSize: Int | Double = null,
    cacheSize: Int | Double = null,
    compression: js.UndefOr[Boolean] = js.undefined,
    createIfMissing: js.UndefOr[Boolean] = js.undefined,
    errorIfExists: js.UndefOr[Boolean] = js.undefined,
    maxFileSize: Int | Double = null,
    maxOpenFiles: Int | Double = null,
    writeBufferSize: Int | Double = null
  ): LevelDownOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (blockRestartInterval != null) __obj.updateDynamic("blockRestartInterval")(blockRestartInterval.asInstanceOf[js.Any])
    if (blockSize != null) __obj.updateDynamic("blockSize")(blockSize.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(createIfMissing)) __obj.updateDynamic("createIfMissing")(createIfMissing)
    if (!js.isUndefined(errorIfExists)) __obj.updateDynamic("errorIfExists")(errorIfExists)
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxOpenFiles != null) __obj.updateDynamic("maxOpenFiles")(maxOpenFiles.asInstanceOf[js.Any])
    if (writeBufferSize != null) __obj.updateDynamic("writeBufferSize")(writeBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownOpenOptions]
  }
}

