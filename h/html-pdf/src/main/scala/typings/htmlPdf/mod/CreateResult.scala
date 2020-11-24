package typings.htmlPdf.mod

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResult extends js.Object {
  
  def toBuffer(callback: js.Function2[/* err */ Error, /* buffer */ Buffer, Unit]): Unit = js.native
  
  def toFile(): Unit = js.native
  def toFile(callback: js.Function2[/* err */ Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toFile(
    filename: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* res */ FileInfo, Unit]
  ): Unit = js.native
  def toFile(filename: String): Unit = js.native
  def toFile(filename: String, callback: js.Function2[/* err */ Error, /* res */ FileInfo, Unit]): Unit = js.native
  
  def toStream(callback: js.Function2[/* err */ Error, /* stream */ ReadStream, Unit]): Unit = js.native
}
