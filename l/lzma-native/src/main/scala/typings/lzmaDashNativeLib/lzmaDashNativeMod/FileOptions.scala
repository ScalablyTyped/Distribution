package typings
package lzmaDashNativeLib.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var fileSize: scala.Double
  var memlimit: js.UndefOr[scala.Double] = js.undefined
  def read(
    count: scala.Double,
    offset: scala.Double,
    cb: js.Function2[/* err */ js.Any, /* buffer */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit
}

object FileOptions {
  @scala.inline
  def apply(
    fileSize: scala.Double,
    read: js.Function3[
      scala.Double, 
      scala.Double, 
      js.Function2[/* err */ js.Any, /* buffer */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ],
    memlimit: scala.Int | scala.Double = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("read")(read)
    if (memlimit != null) __obj.updateDynamic("memlimit")(memlimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

