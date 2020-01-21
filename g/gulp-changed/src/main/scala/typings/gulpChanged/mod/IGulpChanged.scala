package typings.gulpChanged.mod

import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Transform
import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpChanged extends js.Object {
  @JSName("compareLastModifiedTime")
  var compareLastModifiedTime_Original: IComparator = js.native
  @JSName("compareSha1Digest")
  var compareSha1Digest_Original: IComparator = js.native
  def apply(destination: String): ReadWriteStream = js.native
  def apply(destination: String, options: IOptions): ReadWriteStream = js.native
  def apply(destination: IDestination): ReadWriteStream = js.native
  def apply(destination: IDestination, options: IOptions): ReadWriteStream = js.native
  def compareLastModifiedTime(stream: Transform, callback: js.Function, sourceFile: File, destPath: String): Unit = js.native
  def compareSha1Digest(stream: Transform, callback: js.Function, sourceFile: File, destPath: String): Unit = js.native
}

