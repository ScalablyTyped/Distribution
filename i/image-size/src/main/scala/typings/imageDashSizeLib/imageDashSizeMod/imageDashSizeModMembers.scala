package typings
package imageDashSizeLib.imageDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-size", JSImport.Namespace)
@js.native
object imageDashSizeModMembers extends js.Object {
  def apply(buffer: nodeLib.Buffer): ImageInfo = js.native
  def apply(path: java.lang.String): ImageInfo = js.native
  def apply(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* dimensions */ ImageInfo, scala.Unit]
  ): scala.Unit = js.native
}

