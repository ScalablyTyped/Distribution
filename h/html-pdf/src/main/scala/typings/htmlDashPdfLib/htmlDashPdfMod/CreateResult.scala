package typings
package htmlDashPdfLib.htmlDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResult extends js.Object {
  def toBuffer(callback: js.Function2[/* err */ nodeLib.Error, /* buffer */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  def toFile(): scala.Unit = js.native
  def toFile(callback: js.Function2[/* err */ nodeLib.Error, /* res */ FileInfo, scala.Unit]): scala.Unit = js.native
  def toFile(filename: java.lang.String): scala.Unit = js.native
  def toFile(
    filename: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ FileInfo, scala.Unit]
  ): scala.Unit = js.native
  def toStream(callback: js.Function2[/* err */ nodeLib.Error, /* stream */ nodeLib.fsMod.ReadStream, scala.Unit]): scala.Unit = js.native
}

