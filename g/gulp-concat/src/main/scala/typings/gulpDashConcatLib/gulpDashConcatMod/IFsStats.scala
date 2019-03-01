package typings
package gulpDashConcatLib.gulpDashConcatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFsStats extends js.Object {
  var atime: js.UndefOr[stdLib.Date] = js.undefined
  var blksize: js.UndefOr[scala.Double] = js.undefined
  var blocks: js.UndefOr[scala.Double] = js.undefined
  var ctime: js.UndefOr[stdLib.Date] = js.undefined
  var dev: js.UndefOr[scala.Double] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var ino: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var mtime: js.UndefOr[stdLib.Date] = js.undefined
  var nlink: js.UndefOr[scala.Double] = js.undefined
  var rdev: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object IFsStats {
  @scala.inline
  def apply(
    atime: stdLib.Date = null,
    blksize: scala.Int | scala.Double = null,
    blocks: scala.Int | scala.Double = null,
    ctime: stdLib.Date = null,
    dev: scala.Int | scala.Double = null,
    gid: scala.Int | scala.Double = null,
    ino: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    mtime: stdLib.Date = null,
    nlink: scala.Int | scala.Double = null,
    rdev: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): IFsStats = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime)
    if (blksize != null) __obj.updateDynamic("blksize")(blksize.asInstanceOf[js.Any])
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime)
    if (dev != null) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (ino != null) __obj.updateDynamic("ino")(ino.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    if (nlink != null) __obj.updateDynamic("nlink")(nlink.asInstanceOf[js.Any])
    if (rdev != null) __obj.updateDynamic("rdev")(rdev.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFsStats]
  }
}

