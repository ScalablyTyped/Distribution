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

