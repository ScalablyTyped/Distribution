package typings.gulpConcat.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFsStats extends js.Object {
  var atime: js.UndefOr[Date] = js.undefined
  var blksize: js.UndefOr[Double] = js.undefined
  var blocks: js.UndefOr[Double] = js.undefined
  var ctime: js.UndefOr[Date] = js.undefined
  var dev: js.UndefOr[Double] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var ino: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Date] = js.undefined
  var nlink: js.UndefOr[Double] = js.undefined
  var rdev: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object IFsStats {
  @scala.inline
  def apply(
    atime: Date = null,
    blksize: js.UndefOr[Double] = js.undefined,
    blocks: js.UndefOr[Double] = js.undefined,
    ctime: Date = null,
    dev: js.UndefOr[Double] = js.undefined,
    gid: js.UndefOr[Double] = js.undefined,
    ino: js.UndefOr[Double] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: Date = null,
    nlink: js.UndefOr[Double] = js.undefined,
    rdev: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined
  ): IFsStats = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (!js.isUndefined(blksize)) __obj.updateDynamic("blksize")(blksize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blocks)) __obj.updateDynamic("blocks")(blocks.get.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ino)) __obj.updateDynamic("ino")(ino.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(nlink)) __obj.updateDynamic("nlink")(nlink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rdev)) __obj.updateDynamic("rdev")(rdev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFsStats]
  }
}

