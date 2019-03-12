package typings
package gulpDashChangedLib.gulpDashChangedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpChanged extends js.Object {
  @JSName("compareLastModifiedTime")
  var compareLastModifiedTime_Original: IComparator = js.native
  @JSName("compareSha1Digest")
  var compareSha1Digest_Original: IComparator = js.native
  def apply(destination: IDestination): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(destination: IDestination, options: IOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(destination: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(destination: java.lang.String, options: IOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def compareLastModifiedTime(
    stream: nodeLib.streamMod.Transform,
    callback: js.Function,
    sourceFile: vinylLib.vinylMod.File,
    destPath: java.lang.String
  ): scala.Unit = js.native
  def compareSha1Digest(
    stream: nodeLib.streamMod.Transform,
    callback: js.Function,
    sourceFile: vinylLib.vinylMod.File,
    destPath: java.lang.String
  ): scala.Unit = js.native
}

