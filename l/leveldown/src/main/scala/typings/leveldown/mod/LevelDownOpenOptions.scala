package typings.leveldown.mod

import typings.abstractLeveldown.mod.AbstractOpenOptions
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
    blockRestartInterval: js.UndefOr[Double] = js.undefined,
    blockSize: js.UndefOr[Double] = js.undefined,
    cacheSize: js.UndefOr[Double] = js.undefined,
    compression: js.UndefOr[Boolean] = js.undefined,
    createIfMissing: js.UndefOr[Boolean] = js.undefined,
    errorIfExists: js.UndefOr[Boolean] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    maxOpenFiles: js.UndefOr[Double] = js.undefined,
    writeBufferSize: js.UndefOr[Double] = js.undefined
  ): LevelDownOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockRestartInterval)) __obj.updateDynamic("blockRestartInterval")(blockRestartInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockSize)) __obj.updateDynamic("blockSize")(blockSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createIfMissing)) __obj.updateDynamic("createIfMissing")(createIfMissing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorIfExists)) __obj.updateDynamic("errorIfExists")(errorIfExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOpenFiles)) __obj.updateDynamic("maxOpenFiles")(maxOpenFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writeBufferSize)) __obj.updateDynamic("writeBufferSize")(writeBufferSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownOpenOptions]
  }
}

