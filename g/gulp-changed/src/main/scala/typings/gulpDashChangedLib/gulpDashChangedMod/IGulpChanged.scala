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
  /**
    * @param stream Should be used to queue sourceFile if it passes some comparison
    * @param callback Should be called when done
    * @param sourceFile File to operate on
    * @param destPath Destination for sourceFile as an absolute path
    */
  def compareLastModifiedTime(
    stream: nodeLib.streamMod.Transform,
    callback: js.Function,
    sourceFile: vinylLib.vinylMod.File,
    destPath: java.lang.String
  ): scala.Unit = js.native
  /**
    * @param stream Should be used to queue sourceFile if it passes some comparison
    * @param callback Should be called when done
    * @param sourceFile File to operate on
    * @param destPath Destination for sourceFile as an absolute path
    */
  def compareSha1Digest(
    stream: nodeLib.streamMod.Transform,
    callback: js.Function,
    sourceFile: vinylLib.vinylMod.File,
    destPath: java.lang.String
  ): scala.Unit = js.native
}

