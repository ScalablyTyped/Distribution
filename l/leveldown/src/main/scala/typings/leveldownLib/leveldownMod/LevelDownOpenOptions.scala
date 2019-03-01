package typings
package leveldownLib.leveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownOpenOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOpenOptions {
  var blockRestartInterval: js.UndefOr[scala.Double] = js.undefined
  var blockSize: js.UndefOr[scala.Double] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var compression: js.UndefOr[scala.Boolean] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var maxOpenFiles: js.UndefOr[scala.Double] = js.undefined
  var writeBufferSize: js.UndefOr[scala.Double] = js.undefined
}

object LevelDownOpenOptions {
  @scala.inline
  def apply(
    blockRestartInterval: scala.Int | scala.Double = null,
    blockSize: scala.Int | scala.Double = null,
    cacheSize: scala.Int | scala.Double = null,
    compression: js.UndefOr[scala.Boolean] = js.undefined,
    createIfMissing: js.UndefOr[scala.Boolean] = js.undefined,
    errorIfExists: js.UndefOr[scala.Boolean] = js.undefined,
    maxFileSize: scala.Int | scala.Double = null,
    maxOpenFiles: scala.Int | scala.Double = null,
    writeBufferSize: scala.Int | scala.Double = null
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

